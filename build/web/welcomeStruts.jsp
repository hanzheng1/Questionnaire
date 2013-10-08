<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
        
        
        <meta charset="utf-8" />
        <title>jQuery UI Accordion - Default functionality</title>
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css" />
        <script>
        $(function() {
        $( "#accordion" ).accordion();
        });
        </script>
        
    </head>
    
    
    
    <body style="background-color: white">
        
        <logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
            <div  style="color: red">
                ERROR:  Application resources not loaded -- check servlet container
                logs for error messages.
            </div>
        </logic:notPresent>
        
        
        
        
        
        <div id="accordion">
            <h3>Question 1</h3>
            
            <div>
                <p>
                    <span>How big is your data set? </span>
                </p>
                
                <input type="text" name="dataSetSize">
                
            </div>
            
            <h3>Question 2</h3>
            
            <div>
                <p>
                    <span>What is your data type? </span>
                </p>
                
                
                <input type="text" name="dataType">
                
            </div>
        
            
            
            
            
            <h3>Question 3</h3>
            
            <div>
                <p>
                    <span>How sensitive is your data set? </span>
                </p>
                
                <select id="sensitivity">
                                    <option value="Confidential">Confidential</option>
                                    <option value="Secret">Secret</option>
                                    <option value="TopSecret">Top Secret</option>
                                </select> 
                
            </div>
            
            
            
            
            
            <h3>Question 4</h3>
       
            <div>
                <p>
                    <span>What tools and technologies to use? (Check all that apply) </span>
                </p>
        
                <input type="checkbox" name="techologies" value="Hadoop">Hadoop<br>
                                <input type="checkbox" name="techologies" value="Hive">Hive<br>
                                <input type="checkbox" name="techologies" value="HDFS">HDFS<br>
                                <input type="checkbox" name="techologies" value="Accumulo">Accumulo<br>
                                <input type="checkbox" name="techologies" value="Java">Java<br>
                
            </div>
            
        </div>
        
        
        
        <!--
        <div id="accordion">
            <form action="demo_form.asp">
                <table>
                    <tbody>
                        <tr>
                            <td>
                                <span>How big is your data set? </span>
                            </td>

                            <td>
                                <input type="text" name="dataSetSize">
                            </td>

                        </tr>

                        <tr>
                            <td>
                                <span>What is your data type? </span>
                            </td>

                            <td>
                                <input type="text" name="dataType">
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <span>How sensitive is your data set? </span>
                            </td>

                            <td>
                                <select id="sensitivity">
                                    <option value="Confidential">Confidential</option>
                                    <option value="Secret">Secret</option>
                                    <option value="TopSecret">Top Secret</option>
                                </select> 

                            </td>
                        </tr>

                        <tr>
                            <td>
                                <span>What tools and technologies to use? (Check all that apply) </span>
                            </td>

                            <td>
                                <input type="checkbox" name="techologies" value="Hadoop">Hadoop<br>
                                <input type="checkbox" name="techologies" value="Hive">Hive<br>
                                <input type="checkbox" name="techologies" value="HDFS">HDFS<br>
                                <input type="checkbox" name="techologies" value="Accumulo">Accumulo<br>
                                <input type="checkbox" name="techologies" value="Java">Java<br>

                            </td>

                        </tr>



                    </tbody>
                </table>

            </form> 
            
        </div>
           -->
        
        
        
        
    </body>
</html:html>
