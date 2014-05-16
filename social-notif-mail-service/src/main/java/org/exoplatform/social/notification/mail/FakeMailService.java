/*
 * Copyright (C) 2003-2014 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.exoplatform.social.notification.mail;

import java.util.concurrent.Future;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;

import org.exoplatform.container.component.BaseComponentPlugin;
import org.exoplatform.services.mail.MailService;
import org.exoplatform.services.mail.Message;
import org.apache.commons.mail.*;

/**
 * Created by The eXo Platform SAS
 * Author : eXoPlatform
 *          exo@exoplatform.com
 * May 16, 2014  
 */
public class FakeMailService extends BaseComponentPlugin implements MailService {

  @Override
  public Session getMailSession() {
    return null;
  }

  @Override
  public String getOutgoingMailServer() {
    return null;
  }

  @Override
  public void sendMessage(String from, String to, String subject, String body) throws Exception {
    
  }

  @Override
  public void sendMessage(Message message) throws Exception {
    SimpleEmail email = new SimpleEmail();
    email.setHostName("localhost");
    email.setSmtpPort(2525);
    email.setStartTLSEnabled(true);
    email.setFrom(message.getFrom());
    email.setSubject(message.getSubject());
    email.setContent(message.getBody(), EmailConstants.TEXT_HTML);
    email.addTo(message.getTo());
    email.send();
  }

  @Override
  public void sendMessage(MimeMessage message) throws Exception {
    
  }

  @Override
  public Future<Boolean> sendMessageInFuture(String from, String to, String subject, String body) {
    return null;
  }

  @Override
  public Future<Boolean> sendMessageInFuture(Message message) {
    return null;
  }

  @Override
  public Future<Boolean> sendMessageInFuture(MimeMessage message) {
    return null;
  }

}
