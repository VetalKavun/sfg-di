package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleBeanDemo implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleBeanDemo() {
        System.out.println("## Life Cycle Demo constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory is set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## Bean Name is set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## Destroy method is called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## All properties are set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context is set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## PostConstruct method called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## PreDestroy method called");
    }
}
