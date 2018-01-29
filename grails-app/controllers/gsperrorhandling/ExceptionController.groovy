package gsperrorhandling

class ExceptionController {

    //500
    def handleInternalError(){
        def anyException
        //In Grails Doc, this is suggested way to grab exception:
        //http://docs.grails.org/latest/guide/theWebLayer.html#mappingToResponseCodes
        //anyException = request.exception
        if(request.exception && Throwable.isInstance(request.exception)){
            anyException =  request.exception
        }else if (request.getAttribute('javax.servlet.error.exception')){
            anyException = request.getAttribute('javax.servlet.error.exception')
        }else{
            anyException = "An exception has occured."
        }
        return [anyException:anyException]
    }
}
