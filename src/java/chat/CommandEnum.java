/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import chat.ActionComand;
import chat.MessageProcessing;
public enum CommandEnum {

    login {
                {
                    this.command = new ClassCheck();
                }
            },
    message {
                {
                    this.command = new MessageProcessing();
                }
            };

    ActionComand command;

    public ActionComand getCurrentComand() {
        return command;
    }
}
