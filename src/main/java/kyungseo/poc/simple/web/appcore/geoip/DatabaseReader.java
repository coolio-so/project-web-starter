/* ============================================================================
 * [ Development Templates based on Spring Boot ]
 * ----------------------------------------------------------------------------
 * Copyright 2023 Kyungseo Park <Kyungseo.Park@gmail.com>
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

package kyungseo.poc.simple.web.appcore.geoip;

import java.net.InetAddress;

/**
 * 임시 - 구현 예정
 *
 * @author 박경서 (Kyungseo.Park@gmail.com)
 * @version 1.0
 */
public class DatabaseReader {

    public CountryResponse country(InetAddress ipAddress) {
        return new CountryResponse(ipAddress);
    }

    public CityResponse city(InetAddress ipAddress) {
        return new CityResponse(ipAddress);
    }

}
