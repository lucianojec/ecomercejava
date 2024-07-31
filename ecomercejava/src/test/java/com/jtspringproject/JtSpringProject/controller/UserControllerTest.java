/**
 * 
 */
package com.jtspringproject.JtSpringProject.controller;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.mockito.Mockito.mock;

import com.jtspringproject.JtSpringProject.models.User;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

/**
 * Parasoft Jtest UTA: Test class for UserController
 *
 * @see com.jtspringproject.JtSpringProject.controller.UserController
 * @author Luciano
 */
public class UserControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for Test(Model)
	 *
	 * @see com.jtspringproject.JtSpringProject.controller.UserController#Test(Model)
	 * @author Luciano
	 */
	@Test
	public void testTest() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			UserController underTest = new UserController();

			// When
			Model model = mock(Model.class);
			String result = underTest.Test(model);

			// Then - assertions for result of method Test(Model)
			assertEquals("test", result);

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for Test2()
	 *
	 * @see com.jtspringproject.JtSpringProject.controller.UserController#Test2()
	 * @author Luciano
	 */
	@Test
	public void testTest2() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			UserController underTest = new UserController();

			// When
			ModelAndView result = underTest.Test2();

			// Then - assertions for result of method Test2()
			assertNotNull(result);

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for buy()
	 *
	 * @see com.jtspringproject.JtSpringProject.controller.UserController#buy()
	 * @author Luciano
	 */
	@Test
	public void testBuy() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			UserController underTest = new UserController();

			// When
			String result = underTest.buy();

			// Then - assertions for result of method buy()
			assertEquals("buy", result);

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getproduct()
	 *
	 * @see com.jtspringproject.JtSpringProject.controller.UserController#getproduct()
	 * @author Luciano
	 */
	@Test
	public void testGetproduct() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			UserController underTest = new UserController();

			// When
			ModelAndView result = underTest.getproduct();

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for registerUser()
	 *
	 * @see com.jtspringproject.JtSpringProject.controller.UserController#registerUser()
	 * @author Luciano
	 */
	@Test
	public void testRegisterUser() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			UserController underTest = new UserController();

			// When
			String result = underTest.registerUser();

			// Then - assertions for result of method registerUser()
			assertEquals("register", result);

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for userlogin(Model)
	 *
	 * @see com.jtspringproject.JtSpringProject.controller.UserController#userlogin(Model)
	 * @author Luciano
	 */
	@Test
	public void testUserlogin() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			UserController underTest = new UserController();

			// When
			Model model = mock(Model.class);
			String result = underTest.userlogin(model);

			// Then - assertions for result of method userlogin(Model)
			assertEquals("userLogin", result);

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for userlogin(String, String, Model, HttpServletResponse)
	 *
	 * @see com.jtspringproject.JtSpringProject.controller.UserController#userlogin(String, String, Model, HttpServletResponse)
	 * @author Luciano
	 */
	@Test
	public void testUserlogin2() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			UserController underTest = new UserController();

			// When
			String username = "username"; // UTA: default value
			String pass = "pass"; // UTA: default value
			Model model = mock(Model.class);
			HttpServletResponse res = mock(HttpServletResponse.class);
			ModelAndView result = underTest.userlogin(username, pass, model, res);

		});
	}
}
