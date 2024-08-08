//user("Maria").
!start.

/* 
 * 
 * Plans to communicate with Dialogflow
 * 
 */
+request(RequestedBy, ResponseId, IntentName, Params, Contexts)
	: user(ResponseId) //se for meu usuário trato a requisição
<-
	.print("Request received ",IntentName," of Rasa");
	!responder(RequestedBy, ResponseId, IntentName, Params, Contexts);
	.

	
//+!responder(RequestedBy, ResponseId, IntentName, Params, Contexts)
//	: (IntentName == "Call Jason Agent")
//<-
//	reply("Hello, I am your Jason agent, how can I help you?");
//	.
	
//+!responder(RequestedBy, ResponseId, IntentName, Params, Contexts)
//	: (IntentName == "Call With Contexts and Parameters")
//<-
//	.print("The contexts and parameters will be listed below.");
//	!printContexts(Contexts);
//	!printParameters(Params);
//	reply("Hello, I'm your Jason agent, I received your contexts and parameters");
//	.

+!responder(RequestedBy, ResponseId, IntentName, Params, Contexts)
	: (IntentName == "inform_stress_other") & user(Name)
<-
	.nth(1,Params,param("name",X));
	.concat("Você informou que a ",X," está estressada.",B);
	+informou_stress(Name,X);
	.findall(N,informou_stress(_,N),L);
	.print("Lista que a ", Name ," informou ", L);
	reply(B);
	.

+!responder(RequestedBy, ResponseId, IntentName, Params, Contexts)
	: (IntentName == "inform_self_stress") & user(Name)
<-
	+stressed(Name);
	.print("Informou self stress!")
	reply("Você informou que está estressada.");
	.

+!responder(RequestedBy, ResponseId, IntentName, Params, Contexts)
	: true
<-
	reply("Sorry, I do not recognize this intention");
	.

//+!printContexts([]).
//+!printContexts([Context|List])
//<-
//	.print(Context);
//	!printContexts(List);
//	.

//+!printParameters([]).
//+!printParameters([Param|List])
//<-
//	.print(Param)
//	!printParameters(List);
//	.
	

+!start 
	: true 
<- 
	.print("Sample agent enabled.")
	.


{ include("$jacamoJar/templates/common-cartago.asl") }
{ include("$jacamoJar/templates/common-moise.asl") }

// uncomment the include below to have an agent compliant with its organisation
//{ include("$moiseJar/asl/org-obedient.asl") }