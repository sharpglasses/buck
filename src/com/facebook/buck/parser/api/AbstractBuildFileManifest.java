/*
 * Copyright 2018-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.parser.api;

import com.facebook.buck.core.util.immutables.BuckStyleImmutable;
import com.facebook.buck.skylark.io.GlobSpecWithResult;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import org.immutables.value.Value;

/** Describes the content of a build file, which includes defined targets and their metadata. */
@BuckStyleImmutable
@Value.Immutable(builder = false)
abstract class AbstractBuildFileManifest {
  /** @return a list of targets defined in the build file. */
  @Value.Parameter
  public abstract ImmutableMap<String, Map<String, Object>> getTargets();

  /** @return a set of extension files read during parsing. */
  @Value.Parameter
  public abstract ImmutableList<String> getIncludes();

  /**
   * @return a map from configuration section to configuration key to the value returned during
   *     parsing.
   */
  @Value.Parameter
  public abstract ImmutableMap<String, Object> getConfigs();

  /** @return an optional map from environment variable to a value read during parsing (if any). */
  @Value.Parameter
  public abstract Optional<ImmutableMap<String, Optional<String>>> getEnv();

  /** @return A list of the glob operations performed with their results. */
  @Value.Parameter
  public abstract ImmutableList<GlobSpecWithResult> getGlobManifest();
}
