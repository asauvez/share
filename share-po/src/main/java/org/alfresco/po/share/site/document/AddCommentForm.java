/*
 * #%L
 * share-po
 * %%
 * Copyright (C) 2005 - 2016 Alfresco Software Limited
 * %%
 * This file is part of the Alfresco software. 
 * If the software was purchased under a paid Alfresco license, the terms of 
 * the paid license agreement will prevail.  Otherwise, the software is 
 * provided under the following open source license terms:
 * 
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */
package org.alfresco.po.share.site.document;

import org.alfresco.po.HtmlPage;
import org.openqa.selenium.By;

/**
 * @author Aliaksei Boole
 */
public class AddCommentForm extends AbstractCommentForm
{
    private final static String FORM_DIV_CSS = "div[id$='default-add-actual-form-container']";
    private final static By FORM_DIV = By.cssSelector(FORM_DIV_CSS);
    private final static By AVATAR = By.cssSelector(FORM_DIV_CSS + ">img");
    private final static By CANCEL_BUTTON = By.cssSelector(FORM_DIV_CSS + " span[class~='yui-reset-button']>span>button");
    private final static By SUBMIT_BUTTON = By.cssSelector(FORM_DIV_CSS + " span[class~='yui-submit-button']>span>button");


    public HtmlPage clickAddCommentButton()
    {
        click(SUBMIT_BUTTON);
        return getCurrentPage();
    }

    public HtmlPage clickCancelButton()
    {
        click(CANCEL_BUTTON);
        return getCurrentPage();
    }

    public boolean isDisplay()
    {
        return isElementDisplayed(FORM_DIV);
    }

    public boolean isAvatarDisplay()
    {
        return isElementDisplayed(AVATAR);
    }

    public boolean isButtonsEnable()
    {
        return super.isButtonsEnable(SUBMIT_BUTTON, CANCEL_BUTTON);
    }

    public HtmlPage selectAddCommentButton()
    {
        click(SUBMIT_BUTTON);
        return getCurrentPage();
    }
}
