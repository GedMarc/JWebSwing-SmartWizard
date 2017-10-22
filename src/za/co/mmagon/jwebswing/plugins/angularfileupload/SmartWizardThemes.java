package za.co.mmagon.jwebswing.plugins.angularfileupload;

import za.co.mmagon.jwebswing.base.references.CSSReference;

public enum SmartWizardThemes implements ISmartWizardTheme
{
	Arrows(new CSSReference("SmartWizardArrowsThemeArrows", 1.0, "bower_components/angularfileupload/dist/css/smart_wizard_theme_arrows.css")),
	Circles(new CSSReference("SmartWizardArrowsThemeCircles", 1.0, "bower_components/angularfileupload/dist/css/smart_wizard_theme_circles.css")),
	Dots(new CSSReference("SmartWizardArrowsThemeDots", 1.0, "bower_components/angularfileupload/dist/css/smart_wizard_theme_dots.css")),;
	
	private CSSReference themeReference;
	
	SmartWizardThemes(CSSReference themeReference)
	{
		this.themeReference = themeReference;
	}
	
	public CSSReference getThemeReference()
	{
		return themeReference;
	}
	
	public void setThemeReference(CSSReference themeReference)
	{
		this.themeReference = themeReference;
	}
	
	@Override
	public String toString()
	{
		return super.toString().toLowerCase();
	}
}