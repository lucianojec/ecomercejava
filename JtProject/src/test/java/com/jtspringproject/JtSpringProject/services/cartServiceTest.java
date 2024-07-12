/**
 * 
 */
package com.jtspringproject.JtSpringProject.services;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.mockito.Mockito.mock;

import com.jtspringproject.JtSpringProject.models.Cart;
import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for cartService
 *
 * @see com.jtspringproject.JtSpringProject.services.cartService
 * @author Luciano
 */
public class cartServiceTest {

	/**
	 * Parasoft Jtest UTA: Test for addCart(Cart)
	 *
	 * @see com.jtspringproject.JtSpringProject.services.cartService#addCart(Cart)
	 * @author Luciano
	 */
	@Test
	public void testAddCart() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			cartService underTest = new cartService();

			// When
			Cart cart = mock(Cart.class);
			Cart result = underTest.addCart(cart);

		});
	}
}