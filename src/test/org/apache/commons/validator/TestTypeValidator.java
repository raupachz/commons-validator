/*
 * $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//validator/src/test/org/apache/commons/validator/TestTypeValidator.java,v 1.1 2002/03/30 04:21:03 dwinterfeldt Exp $
 * $Revision: 1.1 $
 * $Date: 2002/03/30 04:21:03 $
 *
 * ====================================================================
 *
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 1999-2002 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The names "The Jakarta Project", "Commons", and "Apache Software
 *    Foundation" must not be used to endorse or promote products derived
 *    from this software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache"
 *    nor may "Apache" appear in their names without prior written
 *    permission of the Apache Group.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */


package org.apache.commons.validator;
                                                          
/**                                                       
 * <p>Contains validation methods for different 
 * unit tests.</p> 
 *
 * @author David Winterfeldt
 * @version $Revision: 1.1 $ $Date: 2002/03/30 04:21:03 $
*/                                                       
public class TestTypeValidator {

   /**
    * Checks if the field can be successfully converted to a <code>byte</code>.
    *
    * @param 	value 		The value validation is being performed on.
    * @return	boolean		If the field can be successfully converted 
    *                           to a <code>byte</code> <code>true</code> is returned.  
    *                           Otherwise <code>false</code>.
   */
   public static Byte validateByte(Object bean, Field field) {
      String value = ValidatorUtil.getValueAsString(bean, field.getProperty());

      return GenericTypeValidator.formatByte(value);
   }

   /**
    * Checks if the field can be successfully converted to a <code>short</code>.
    *
    * @param 	value 		The value validation is being performed on.
    * @return	boolean		If the field can be successfully converted 
    *                           to a <code>short</code> <code>true</code> is returned.  
    *                           Otherwise <code>false</code>.
   */
   public static Short validateShort(Object bean, Field field) {
      String value = ValidatorUtil.getValueAsString(bean, field.getProperty());

      return GenericTypeValidator.formatShort(value);
   }

   /**
    * Checks if the field can be successfully converted to a <code>int</code>.
    *
    * @param 	value 		The value validation is being performed on.
    * @return	boolean		If the field can be successfully converted 
    *                           to a <code>int</code> <code>true</code> is returned.  
    *                           Otherwise <code>false</code>.
   */
   public static Integer validateInt(Object bean, Field field) {
      String value = ValidatorUtil.getValueAsString(bean, field.getProperty());

      return GenericTypeValidator.formatInt(value);
   }

   /**
    * Checks if the field can be successfully converted to a <code>long</code>.
    *
    * @param 	value 		The value validation is being performed on.
    * @return	boolean		If the field can be successfully converted 
    *                           to a <code>long</code> <code>true</code> is returned.  
    *                           Otherwise <code>false</code>.
   */
   public static Long validateLong(Object bean, Field field) {
      String value = ValidatorUtil.getValueAsString(bean, field.getProperty());

      return GenericTypeValidator.formatLong(value);
   }

   /**
    * Checks if the field can be successfully converted to a <code>float</code>.
    *
    * @param 	value 		The value validation is being performed on.
    * @return	boolean		If the field can be successfully converted 
    *                           to a <code>float</code> <code>true</code> is returned.  
    *                           Otherwise <code>false</code>.
   */
   public static Float validateFloat(Object bean, Field field) {
      String value = ValidatorUtil.getValueAsString(bean, field.getProperty());

      return GenericTypeValidator.formatFloat(value);
   }
   
   /**
    * Checks if the field can be successfully converted to a <code>double</code>.
    *
    * @param 	value 		The value validation is being performed on.
    * @return	boolean		If the field can be successfully converted 
    *                           to a <code>double</code> <code>true</code> is returned.  
    *                           Otherwise <code>false</code>.
   */
   public static Double validateDouble(Object bean, Field field) {
      String value = ValidatorUtil.getValueAsString(bean, field.getProperty());

      return GenericTypeValidator.formatDouble(value);
   }
      
}                                                         