----------- Controller Advice ----------------
Two Cases
 1- Exception Handler Annotation Scenario
 2- Controller Advice & Response Body
 3- RestController Advice
 
 ---------------------
 {
 "id":"1234",
 "firstName":"Ali",
 "lastName":"Khan",
 "age":"12"
 }
 --------
 1- Exception Handler 
 active only inside controller in which method is annotated u can annotate multiple
 method with in same controller
 this is drawback just we can use with in same controller.
 -------------
  2- Controller Advice 
  @ControllerAdvice with @ResponseBody
  
  -------------
  3- RestControllerAdvice 
  No need to annotate method explicitly with @ResponseBody
  ----------
 What is the use of @RestController in spring boot?
Spring 4.0 introduced the @RestController annotation in 
order to simplify the creation of RESTful web services. 
It's a convenient annotation that combines @Controller and @ResponseBody, 
which eliminates the need to annotate every request handling method
 of the controller class with the @ResponseBody annotation.
  
  
  
  
 
