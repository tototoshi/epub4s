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
package epub4s.metadata

import epub4s.UID
import com.github.nscala_time.time.Imports._
import epub4s.metadata.attribute.{ Type => AType, _ }

sealed abstract class Term

case class Title(value: String, lang: Option[Lang] = None) extends Term

case class Language(value: String, tpe: Option[AType] = None) extends Term

case class Identifier(
  value: UID,
  scheme: Option[Scheme] = None,
  tpe: Option[AType] = None) extends Term

case class Creator(
  name: String,
  role: Option[Role] = None,
  lang: Option[Lang] = None) extends Term

case class Contributor(
  name: String,
  role: Option[Role] = None,
  lang: Option[Lang] = None) extends Term

case class Publisher(name: String, lang: Option[Lang] = None) extends Term

case class Subject(value: String, lang: Option[Lang] = None) extends Term

case class Description(value: String, lang: Option[Lang] = None) extends Term

case class Date(
  value: LocalDate,
  event: Option[Event] = None,
  tpe: Option[AType] = None) extends Term

case class Type(value: String, tpe: Option[AType] = None) extends Term

case class Format(value: String, tpe: Option[AType] = None) extends Term

case class Source(value: String, lang: Option[Lang] = None) extends Term

case class Relation(value: String, lang: Option[Lang] = None) extends Term

case class Coverage(value: String, lang: Option[Lang] = None) extends Term

case class Rights(value: String, lang: Option[Lang] = None) extends Term

