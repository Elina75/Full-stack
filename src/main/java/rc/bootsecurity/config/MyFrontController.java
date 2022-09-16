package rc.bootsecurity.config;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyFrontController extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {WebConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        // Dispatcher servlet
//        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(WebConfig.class));
//        dispatcher.setLoadOnStartup(1);
//        dispatcher.setAsyncSupported(true);
//// add this
//        dispatcher.addMapping("/"); // or whatever you want/need
//    }
}
