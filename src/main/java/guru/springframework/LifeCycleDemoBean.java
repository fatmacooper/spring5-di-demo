package guru.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean(){
        System.out.println("1 ## I'm in the LifeCycleBean Constructor.");
    }

    @Override
        public void setBeanName(String s) {
        System.out.println("2 ## I am in the setBeanName function of BeanNameAware interface.");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("3 ## I am in the setBeanFactory function of BeanFactoryAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("4 ## I am in the setApplicationContext function of ApplicationContextAware interface.");
    }

    public void beforeInit(){
        System.out.println("5 ## I am in the beforeInit function.");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("6 ## I am in the postConstruct function.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("7 ## I am in the afterPropertiesSet function of InitializingBean interface.");
    }

    public void afterInit(){
        System.out.println("8 ## I am in the afterInit function.");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("9 ## I am in the preDestroy function.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("10 ## I am in the destroy function of DisposableBean interface.");
    }
}
