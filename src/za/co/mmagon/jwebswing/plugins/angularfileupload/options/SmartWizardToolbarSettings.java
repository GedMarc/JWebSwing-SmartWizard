package za.co.mmagon.jwebswing.plugins.angularfileupload.options;

import za.co.mmagon.jwebswing.generics.LeftOrRight;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavascriptFunction;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class SmartWizardToolbarSettings extends JavaScriptPart
{
	/**
	 * Position of the toolbar (none, top, bottom, both)
	 */
	private SmartWizardToolbarPosition toolbarPosition;
	/**
	 * Left or Right
	 */
	private LeftOrRight toolbarButtonPosition;
	/**
	 * To show the next button or not
	 */
	private Boolean showNextButton;
	/**
	 * To show the previous button or not
	 */
	private Boolean showPreviousButton;
	
	/**
	 * The extra toolbar buttons
	 */
	private List<JavascriptFunction> toolbarExtraButtons;
	
	/**
	 * Position of the toolbar (none, top, bottom, both)
	 *
	 * @return
	 */
	public SmartWizardToolbarPosition getToolbarPosition()
	{
		return toolbarPosition;
	}
	
	/**
	 * Position of the toolbar (none, top, bottom, both)
	 *
	 * @param toolbarPosition
	 *
	 * @return
	 */
	public SmartWizardToolbarSettings setToolbarPosition(SmartWizardToolbarPosition toolbarPosition)
	{
		this.toolbarPosition = toolbarPosition;
		return this;
	}
	
	/**
	 * Position of the toolbar buttons (left, right)
	 *
	 * @return
	 */
	public LeftOrRight getToolbarButtonPosition()
	{
		return toolbarButtonPosition;
	}
	
	/**
	 * Position of the toolbar buttons (left, right)
	 *
	 * @param toolbarButtonPosition
	 *
	 * @return
	 */
	public SmartWizardToolbarSettings setToolbarButtonPosition(LeftOrRight toolbarButtonPosition)
	{
		this.toolbarButtonPosition = toolbarButtonPosition;
		return this;
	}
	
	/**
	 * show/hide a Next button
	 *
	 * @return
	 */
	public Boolean getShowNextButton()
	{
		return showNextButton;
	}
	
	/**
	 * show/hide a Previous button
	 *
	 * @param showNextButton
	 *
	 * @return
	 */
	public SmartWizardToolbarSettings setShowNextButton(Boolean showNextButton)
	{
		this.showNextButton = showNextButton;
		return this;
	}
	
	/**
	 * show/hide a Previous button
	 *
	 * @return
	 */
	public Boolean getShowPreviousButton()
	{
		return showPreviousButton;
	}
	
	/**
	 * show/hide a Previous button
	 *
	 * @param showPreviousButton
	 *
	 * @return
	 */
	public SmartWizardToolbarSettings setShowPreviousButton(Boolean showPreviousButton)
	{
		this.showPreviousButton = showPreviousButton;
		return this;
	}
	
	/**
	 * The extra toolbar buttons
	 *
	 * @return
	 */
	@NotNull
	public List<JavascriptFunction> getToolbarExtraButtons()
	{
		if (toolbarExtraButtons == null)
		{
			toolbarExtraButtons = new ArrayList<>();
		}
		return toolbarExtraButtons;
	}
	
	/**
	 * The extra toolbar buttons
	 *
	 * @param toolbarExtraButtons
	 *
	 * @return
	 */
	public SmartWizardToolbarSettings setToolbarExtraButtons(@NotNull List<JavascriptFunction> toolbarExtraButtons)
	{
		this.toolbarExtraButtons = toolbarExtraButtons;
		return this;
	}
}