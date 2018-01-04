package br.com.spring.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.SynthesizingMethodParameter;

import br.com.spring.beans.BeanPessoa;

public class UsaPessoaSpring {

	public static void main(String[] args) {
		ApplicationContext apContext = new ClassPathXmlApplicationContext(
				"/br/com/spring/config/ApplicationContext.xml");

		BeanPessoa beanPessoa = (BeanPessoa) apContext.getBean("pessoa");
		System.out.println(beanPessoa); //pegou toString
	}

}
