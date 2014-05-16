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

import org.exoplatform.services.mail.MailService;
import org.exoplatform.services.mail.Message;
/**
 * Created by The eXo Platform SAS
 * Author : eXoPlatform
 *          exo@exoplatform.com
 * May 16, 2014  
 */
public class FakeMailTest {
  
  public static void main(String[] args) throws Exception {
    MailService server = new FakeMailService();
    Message message = new Message();
    message.setFrom("no-reply@exoplatform.com");
    message.setSubject("eXo Social Notification mail");
    message.setBody("You have got new request connection.");
    message.setTo("demo@exoplatform.com");
    server.sendMessage(message);
  }
}
