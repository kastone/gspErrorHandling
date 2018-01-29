package gsperrorhandling

class ExceptionController {

    //500
    def handleInternalError(){
        def anyException
        //In Grails Doc, this is suggested way to grab exception:
        //http://docs.grails.org/latest/guide/theWebLayer.html#mappingToResponseCodes
        anyException = request.exception
        if(request.exception.cause)
        {
            //it will blow up there ^ and a Tomcat error page is rendered
        }
        return [anyException:anyException]
    }
}
