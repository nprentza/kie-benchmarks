/*
 * Copyright 2023 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.benchmarks.reliability.proto.complex;

import org.drools.reliability.infinispan.proto.ProtoStreamStoredObject;
import org.infinispan.protostream.GeneratedSchema;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;
import org.infinispan.protostream.types.protobuf.AnySchema;

@AutoProtoSchemaBuilder(includeClasses = {ProtoStreamStoredObject.class, ComplexAAdaptor.class, ComplexBAdaptor.class, ComplexCAdaptor.class, ComplexDAdaptor.class},
        dependsOn = AnySchema.class,
        schemaPackageName = "org.drools.benchmarks.reliability.proto.complex",
        schemaFileName = "complex-abcd.proto", schemaFilePath = "proto")
public interface ComplexABCDProtoStreamSchema extends GeneratedSchema {
}
