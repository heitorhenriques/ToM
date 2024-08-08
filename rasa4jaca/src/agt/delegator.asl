

+request(RequestedBy, ResponseId, IntentName, Params, Contexts)
	: not(alocated_assistant(_,ResponseId)) & users(L) & .nth(0,L,User)
<-
	.delete(User,L,NewL);
	+alocated_assistant(User,ResponseId);
	-+users(NewL)[source(_)];
	.print(" == >> Criar assistente para [", ResponseId, "] nomeado ", User);
	.create_agent(User,"assistant.asl"); // criação
	.send(User,tell,user(ResponseId)); //delegação do usuário
	.concat("Criando um assistente para voce ", User, Msg);
	.print(NewL);
	reply(Msg).

//+request(RequestedBy, ResponseId, IntentName, Params, Contexts): alocated_assistant(User,ResponseId) 
//<-
//	.print(" == >> Já deveria existir um assistente para ", ResponseId, "nomeado ", User);
//	.concat("Seu assistente quem vai te responder ", User, "!", Msg);
//	reply(Msg).

+!hello <- .print("Delegator ONLINE!").

{ include("$jacamoJar/templates/common-cartago.asl") }
{ include("$jacamoJar/templates/common-moise.asl") }

// uncomment the include below to have an agent compliant with its organisation
//{ include("$moiseJar/asl/org-obedient.asl") }