/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 *
 *
 * This file incorporates work covered by the following copyright and
 * permission notice:
 *
 * Copyright 2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org2.apache.taglibs.standard.lang.jstl;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

/**
 *
 * <p>The implementation of the empty operator
 * 
 * @author Nathan Abramson - Art Technology Group
 * @version $Change: 181177 $$DateTime: 2001/06/26 08:45:09 $$Author: kchung $
 **/

public class EmptyOperator
  extends UnaryOperator
{
  //-------------------------------------
  // Singleton
  //-------------------------------------

  public static final EmptyOperator SINGLETON =
    new EmptyOperator ();

  //-------------------------------------
  /**
   *
   * Constructor
   **/
  public EmptyOperator ()
  {
  }

  //-------------------------------------
  // Expression methods
  //-------------------------------------
  /**
   *
   * Returns the symbol representing the operator
   **/
  public String getOperatorSymbol ()
  {
    return "empty";
  }

  //-------------------------------------
  /**
   *
   * Applies the operator to the given value
   **/
  public Object apply (Object pValue,
		       Object pContext,
		       Logger pLogger)
    throws ELException
  {
    // See if the value is null
    if (pValue == null) {
      return PrimitiveObjects.getBoolean (true);
    }

    // See if the value is a zero-length String
    else if ("".equals (pValue)) {
      return PrimitiveObjects.getBoolean (true);
    }

    // See if the value is a zero-length array
    else if (pValue.getClass ().isArray () &&
	     Array.getLength (pValue) == 0) {
      return PrimitiveObjects.getBoolean (true);
    }

    // See if the value is an empty List
    else if (pValue instanceof List &&
	     ((List) pValue).isEmpty ()) {
      return PrimitiveObjects.getBoolean (true);
    }

    // See if the value is an empty Map
    else if (pValue instanceof Map &&
	     ((Map) pValue).isEmpty ()) {
      return PrimitiveObjects.getBoolean (true);
    }

    // Otherwise, not empty
    else {
      return PrimitiveObjects.getBoolean (false);
    }
  }

  //-------------------------------------
}
