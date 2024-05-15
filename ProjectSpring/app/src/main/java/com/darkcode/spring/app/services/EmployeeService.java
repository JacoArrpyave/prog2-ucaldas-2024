package com.darkcode.spring.app.services;

import java.util.List;

import com.darkcode.spring.app.domain.Employee;

public interface EmployeeService {
    public List<Employee> listaEmpleados();
    public void guardarEmpleado (Employee employee);
    public void eliminarEmpleado (Employee employee);
    public Employee mostrarEmpleado (Employee employee);
    
} 
