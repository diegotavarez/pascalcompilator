/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.mydsl.ui.internal.PascalActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PascalExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return PascalActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return PascalActivator.getInstance().getInjector(PascalActivator.ORG_XTEXT_EXAMPLE_MYDSL_PASCAL);
	}
	
}
