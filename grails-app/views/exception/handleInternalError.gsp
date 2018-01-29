<!doctype html>
<html>
    <head>
        <title><g:if env="development">Any Exception!</g:if><g:else>Error</g:else></title>
        <meta name="layout" content="main">
        <g:if env="development"><asset:stylesheet src="errors.css"/></g:if>
    </head>
    <body>
        /exception/handleInternalError.gsp We now expect this to render
        Any Exception is : ${anyException}
    </body>
</html>
