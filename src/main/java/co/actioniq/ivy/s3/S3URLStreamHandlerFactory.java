/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package co.actioniq.ivy.s3;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

class S3URLStreamHandlerFactory implements URLStreamHandlerFactory {
  @Override
  public URLStreamHandler createURLStreamHandler(String protocol) {
    if ("s3".equals(protocol)) {
      return new URLStreamHandler() {
        @Override
        protected URLConnection openConnection(URL u) throws IOException {
          throw new NotImplementedException();
        }
      };
    }
    return null;
  }
}
