!inicializa.

+request(RequestedBy, ResponseId, IntentName, Params, Contexts)
	: user(ResponseId) //se for meu usuário trato a requisição
<-
	.print("Request received ",IntentName," of Rasa");
	!responder(RequestedBy, ResponseId, IntentName, Params, Contexts);
	.

+!responder(RequestedBy, ResponseId, IntentName, Params, Contexts)
	: (IntentName == "inform_stress_other") & .my_name(Name)
<-
	.nth(1,Params,param("name",X));
	.concat("Você informou que a ",X," está estressada.",B);
	.lower_case(X,A);
	.send(A,tell,believe(Name,stressed(A)));
	reply(B);
	.

+believe(Name,stressed(A))
	:  .count(believe(_,~stressed(A)),N1) & .count(believe(_,stressed(A)),N2) & N2 > N1
<-	
	.print(A);
	.print(N1);
	.print(N2);
//	.count(believe(_,~stressed(A)),N1)
//	.count(believe(_,stressed(A)),N2)
//	.concat(Name," informou que ",A,"está estressado",C)
//	reply("Pode ser que você esteja estressado(a)");
	.

+!responder(RequestedBy, ResponseId, IntentName, Params, Contexts)
	: (IntentName == "inform_self_stress") & .my_name(A)
<-
	+believe(A,stressed(A));
	.print("Informou self stress!");
	reply("Você informou que está estressada.");
	.

+!responder(RequestedBy, ResponseId, IntentName, Params, Contexts)
	: true
<-
	reply("Sorry, I do not recognize this intention");
	.

+!inicializa 
	<- 	joinWorkspace("wp",WP1); //se junta ao workspace do artefato do Rasa4Jaca
		lookupArtifact("dial4JaCa",DJ); // descobre o ID do artefato chamado de dial4JaCa 
		focus(DJ);  // dá foco nele
		.print("==>> Assitente Iniciado").

{ include("$jacamoJar/templates/common-cartago.asl") }
{ include("$jacamoJar/templates/common-moise.asl") }
