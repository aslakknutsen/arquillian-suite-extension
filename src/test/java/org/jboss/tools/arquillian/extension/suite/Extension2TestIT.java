package org.jboss.tools.arquillian.extension.suite;

import javax.enterprise.inject.spi.BeanManager;


import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class Extension2TestIT {

    @Test
    public void shouldInject(BeanManager bm) {
        System.out.println("IT Test2");
        Assert.assertNotNull(bm);
    }
}
