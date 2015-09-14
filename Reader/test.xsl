<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"  xml:space="model" xmlns:my="model" >
   <xsl:template match="/">
  <html>
  <body>

         <xsl:for-each  select="my:EmployeeList/my:Employee">
                                 
                      <h3><xsl:value-of select="my:employeeInfo/my:name"/></h3>
                      <h3><xsl:value-of select="my:employeeInfo/my:id"/></h3>
			<table border="1">
			<tr>
					  <th>Enter Time List</th>
					  <th>Exit Time List</th>
		    </tr>
			  <td>
							<table border="1">
                  <xsl:for-each select="my:enterDateList/my:enter">

								<tr bgcolor="#9acd32">
                                 <td><xsl:value-of select="my:enterDate"/></td>
								</tr>
				  </xsl:for-each>
				  </table>
				  </td>
				  <td>
                  
				   <table border="1">
				   <xsl:for-each select="my:exitDateList/my:exit">
				    <tr bgcolor="#9acd10">
					<td><xsl:value-of select="my:exitDate"/></td>
					</tr>
					</xsl:for-each>
					
					</table>
					</td>
			</table>
			
          </xsl:for-each>


  </body>
  </html>
</xsl:template>


</xsl:stylesheet>



