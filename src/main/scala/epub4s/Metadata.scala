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
package epub4s

import epub4s.metadata._

case class Metadata(
  title: Title,
  language: Language,
  identifier: Identifier,
  creator: Option[Creator] = None,
  contributor: Option[Contributor] = None,
  publisher: Option[Publisher] = None,
  subject: Option[Subject] = None,
  description: Option[Description] = None,
  date: Option[Date] = None,
  tpe: Option[Type] = None,
  format: Option[Format] = None,
  source: Option[Source] = None,
  relation: Option[Relation] = None,
  coverage: Option[Coverage] = None,
  Rights: Option[Rights] = None,
  manifest: Manifest,
  spine: Spine,
  guide: Guide)

