/* ============================================================================
 * [ Development Templates based on Spring Boot ]
 * ----------------------------------------------------------------------------
 * Copyright 2023 Kyungseo Park <Kyungseo.Park@gmail.com>
 *
 * Original Code: https://github.com/Baeldung/spring-security-registration
 * @author Baeldung, modified by Kyungseo Park
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============================================================================
 * Author     Date            Description
 * --------   ----------      -------------------------------------------------
 * Kyungseo   2023-03-02      initial version
 * ========================================================================= */

package kyungseo.poc.simple.web.security.captcha;

import kyungseo.poc.simple.web.security.web.error.ReCaptchaInvalidException;

/**
 * @author 박경서 (Kyungseo.Park@gmail.com)
 * @version 1.0
 */
public interface ICaptchaService {

    default void processResponse(final String response) throws ReCaptchaInvalidException {}

    default void processResponse(final String response, String action) throws ReCaptchaInvalidException {}

    String getReCaptchaSite();

    String getReCaptchaSecret();

}
