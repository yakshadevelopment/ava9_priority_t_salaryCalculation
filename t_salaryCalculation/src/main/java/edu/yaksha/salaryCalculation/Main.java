package edu.yaksha.salaryCalculation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


/**
 * Hello world!
 *
 */
public class Main 
{
	private static List<Employee> readEmployeesFromFile() throws Exception
	{
	List<Employee> employeeList=new ArrayList<Employee>();
	FileReader fileReader=new FileReader("Employee.txt");
	BufferedReader bufferedReader=new BufferedReader(fileReader);
	/* 
	 * Your Code
	 * 
	 */
	return employeeList;
	}
	private static void  writePaymentsToFile(List<Payment> paymentList) throws Exception
	{
		FileWriter fileWriter=new FileWriter("Payment.txt");
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		/*
		 * Your Code
		 */
		
	}

    public static void main( String[] args ) throws Exception
    {
       List<Employee> employeeList=readEmployeesFromFile();
       List<Payment>  paymentList=new ArrayList<Payment>();
       /*
        * Your Code
      */
       writePaymentsToFile(paymentList);
       
    }
}
