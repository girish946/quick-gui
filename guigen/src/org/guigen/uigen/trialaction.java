/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guigen.uigen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "org.guigen.uigen.trialaction"
)
@ActionRegistration(
        iconBase = "org/guigen/uigen/not.gif",
        displayName = "#CTL_trialaction"
)
@ActionReference(path = "Menu/File", position = 0)
@Messages("CTL_trialaction=trial")
public final class trialaction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
           new org.guigen.uigen.Uigen();
    }
}
