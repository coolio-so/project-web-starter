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

package kyungseo.poc.simple.web.security.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;

/**
 * @author 박경서 (Kyungseo.Park@gmail.com)
 * @version 1.0
 */
@Getter
public class DeviceInfo {

    @NotBlank(message = "Device id 항목은 필수 값입니다.")
    private String deviceId;

    @NotNull(message = "Device id 항목은 필수 값입니다.")
    private String deviceType;

}
