package gsperrorhandling

class HomeController {
    static allowedMethods = [postMethod: 'POST']

    def index() {
        return [:]
    }

    //The taglib that gspError.gsp will render will cause an exception at render time.
    //When Error controller tries to get request.exception.cause, another exception will be thrown and Tomcat error page is displayed.
    // ERROR Dispatcher type.
    def gspError() {
        return [:]
    }

    // method to throw 500 from Controller layer.
    // Produces GrailsWrappedRuntimeException which has request.exception available in ErrorController.
    // FORWARD Dispatcher type
    def throwInternalError(){
        throw new Exception("blah")
    }


}
