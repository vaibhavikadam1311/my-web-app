package com.example;

import com.example.controller.UserController;
import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.*;

public class UserControllerTest {

    @Test
    public void testDoPost() throws Exception {
        UserController userController = new UserController();
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        RequestDispatcher requestDispatcher = Mockito.mock(RequestDispatcher.class);

        // Mocking the behavior of the request
        when(request.getParameter("name")).thenReturn("John Doe");
        when(request.getParameter("profession")).thenReturn("Software Engineer");
        when(request.getParameter("email")).thenReturn("john.doe@example.com");
        when(request.getRequestDispatcher("/result.jsp")).thenReturn(requestDispatcher);

        // Call the doPost method
        userController.doPost(request, response);

        // Verify that the request attributes are set correctly
        verify(request).setAttribute("name", "John Doe");
        verify(request).setAttribute("profession", "Software Engineer");
        verify(request).setAttribute("email", "john.doe@example.com");

        // Verify that the forward method was called
        verify(requestDispatcher).forward(request, response);
    }
}

