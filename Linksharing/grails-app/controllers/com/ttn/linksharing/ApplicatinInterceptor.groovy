package com.ttn.linksharing

//Add Application Interceptor with logging params for all controller and actions
class ApplicatinInterceptor {

    ApplicatinInterceptor(){
            matchAll()
    }

    boolean before() {

        log.info("ACTION AND CONTROLLER LOG: ${params.toString()}")
        true
    }

    boolean after() {
        if (!session.user) {
            flash.error= "NO ACTIVE SESSION"
            return false
        }
        return true
    }

    void afterView() {
        // no-op
    }
}
