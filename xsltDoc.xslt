<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="text"/>
	
	<xsl:template match="/">
	{
		"titles":
			{
				<xsl:for-each select="catalog/cd">
					<xsl:text>&#09;</xsl:text>
					<xsl:value-of select="title"/>
					<xsl:text>;&#10;</xsl:text>
				</xsl:for-each>
			}
		
	}
	
	</xsl:template>
	
</xsl:stylesheet>