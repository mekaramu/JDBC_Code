/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guess
 */
import java.sql.*;
public class AccessDemo
{
    public static void main(String args[])
    {
        Connection con;
        try
        {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Connected.....");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Unable to load driver");
        }
    String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+"d:\rcrdb.mdb";
    try
    {
    con = DriverManager.getConnection(url,"","");
    }
    catch(SQLException e)
    {
        System.out.println("SQLERROR");
    }
    }}