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

package org2.apache.taglibs.standard.lang.jstl.parser;

public interface ELParserConstants {

  int EOF = 0;
  int NON_EXPRESSION_TEXT = 1;
  int START_EXPRESSION = 2;
  int INTEGER_LITERAL = 7;
  int FLOATING_POINT_LITERAL = 8;
  int EXPONENT = 9;
  int STRING_LITERAL = 10;
  int BADLY_ESCAPED_STRING_LITERAL = 11;
  int TRUE = 12;
  int FALSE = 13;
  int NULL = 14;
  int END_EXPRESSION = 15;
  int DOT = 16;
  int GT1 = 17;
  int GT2 = 18;
  int LT1 = 19;
  int LT2 = 20;
  int EQ1 = 21;
  int EQ2 = 22;
  int LE1 = 23;
  int LE2 = 24;
  int GE1 = 25;
  int GE2 = 26;
  int NE1 = 27;
  int NE2 = 28;
  int LPAREN = 29;
  int RPAREN = 30;
  int COMMA = 31;
  int COLON = 32;
  int LBRACKET = 33;
  int RBRACKET = 34;
  int PLUS = 35;
  int MINUS = 36;
  int MULTIPLY = 37;
  int DIVIDE1 = 38;
  int DIVIDE2 = 39;
  int MODULUS1 = 40;
  int MODULUS2 = 41;
  int NOT1 = 42;
  int NOT2 = 43;
  int AND1 = 44;
  int AND2 = 45;
  int OR1 = 46;
  int OR2 = 47;
  int EMPTY = 48;
  int IDENTIFIER = 49;
  int IMPL_OBJ_START = 50;
  int LETTER = 51;
  int DIGIT = 52;
  int ILLEGAL_CHARACTER = 53;

  int DEFAULT = 0;
  int IN_EXPRESSION = 1;

  String[] tokenImage = {
    "<EOF>",
    "<NON_EXPRESSION_TEXT>",
    "\"${\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<INTEGER_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<EXPONENT>",
    "<STRING_LITERAL>",
    "<BADLY_ESCAPED_STRING_LITERAL>",
    "\"true\"",
    "\"false\"",
    "\"null\"",
    "\"}\"",
    "\".\"",
    "\">\"",
    "\"gt\"",
    "\"<\"",
    "\"lt\"",
    "\"==\"",
    "\"eq\"",
    "\"<=\"",
    "\"le\"",
    "\">=\"",
    "\"ge\"",
    "\"!=\"",
    "\"ne\"",
    "\"(\"",
    "\")\"",
    "\",\"",
    "\":\"",
    "\"[\"",
    "\"]\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"div\"",
    "\"%\"",
    "\"mod\"",
    "\"not\"",
    "\"!\"",
    "\"and\"",
    "\"&&\"",
    "\"or\"",
    "\"||\"",
    "\"empty\"",
    "<IDENTIFIER>",
    "\"#\"",
    "<LETTER>",
    "<DIGIT>",
    "<ILLEGAL_CHARACTER>",
  };

}
