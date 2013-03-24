/*
 * Copyright 2013 Toshiyuki Takahashi
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
package epub4s.guide

sealed abstract class DocumentType

case object cover extends DocumentType
case object titlePage extends DocumentType
case object tableOfContents extends DocumentType
case object index extends DocumentType
case object glossary extends DocumentType
case object acknowledgements extends DocumentType
case object bibliography extends DocumentType
case object colophon extends DocumentType
case object copyrightPage extends DocumentType
case object dedication extends DocumentType
case object epigraph extends DocumentType
case object foreword extends DocumentType
case object listOfIllustrations extends DocumentType
case object listOfTables extends DocumentType
case object notes extends DocumentType
case object preface extends DocumentType
case object text extends DocumentType

