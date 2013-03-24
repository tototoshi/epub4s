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
package epub4s.toc

import epub4s.UID
import epub4s.FileId

case class Head(
  uid: UID,
  depth: Int = 1,
  totalPageCount: Int = 0,
  maxPageNumber: Int = 0)

case class Title(value: String)

case class NavMap(navPoints: List[NavPoint])

case class NavPoint(
  id: FileId,
  playOrder: Int,
  navLabel: NavLabel,
  content: Content,
  navPoints: List[NavPoint] = Nil)

case class NavLabel(text: String)

case class Content(src: String)
