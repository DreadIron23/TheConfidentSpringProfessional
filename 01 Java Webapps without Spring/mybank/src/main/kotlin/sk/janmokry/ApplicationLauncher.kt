package sk.janmokry

import org.apache.catalina.LifecycleException
import org.apache.catalina.startup.Tomcat
import sk.janmokry.web.MyBankServlet

object ApplicationLauncher {
    @Throws(LifecycleException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val tomcat = Tomcat()
        val port: Int =
            args.firstOrNull { it.startsWith(SERVER_PORT_COMMAND_LINE_ARG) }
                ?.replace(SERVER_PORT_COMMAND_LINE_ARG, "")
                ?.toIntOrNull()
                ?: 8080
        tomcat.setPort(port)
        tomcat.connector

        val ctx = tomcat.addContext("", null)
        val servlet = Tomcat.addServlet(ctx, "myBankServlet", MyBankServlet())
        servlet.loadOnStartup = 1
        servlet.addMapping("/*")

        tomcat.start()
    }
}

private const val SERVER_PORT_COMMAND_LINE_ARG = "-Dserver.port="
