/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.xla;

import org.tensorflow.ConcreteFunction;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.family.TNumber;
import org.tensorflow.types.family.TType;

/**
 * Wraps the XLA Scatter operator documented at
 * https://www.tensorflow.org/xla/operation_semantics#scatter.
 *
 * @param <T> data type for {@code output} output
 */
@Operator(
    group = "xla"
)
public final class Scatter<T extends TType> extends RawOp implements Operand<T> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "XlaScatter";

  private Output<T> output;

  private Scatter(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new XlaScatter operation.
   *
   * @param scope current scope
   * @param operand Array to be scattered into.
   * @param scatterIndices Array containing the starting indices of the slices that must
   * be scattered to.
   * @param updates Array containing the values that must be used for scattering.
   * @param updateComputation Computation to be used for combining the existing values in
   * the input array and the updates during scatter.
   * @param dimensionNumbers A serialized xla::ScatterDimensionNumbers proto.
   * @param indicesAreSorted Boolean indicating if the indices are sorted.
   * @param <T> data type for {@code XlaScatter} output and operands
   * @return a new instance of Scatter
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TType> Scatter<T> create(Scope scope, Operand<T> operand,
      Operand<? extends TNumber> scatterIndices, Operand<T> updates,
      ConcreteFunction updateComputation, String dimensionNumbers, Boolean indicesAreSorted) {
    OperationBuilder opBuilder = scope.env().opBuilder(OP_NAME, scope.makeOpName("Scatter"));
    opBuilder.addInput(operand.asOutput());
    opBuilder.addInput(scatterIndices.asOutput());
    opBuilder.addInput(updates.asOutput());
    opBuilder = scope.apply(opBuilder);
    opBuilder.setAttr("update_computation", updateComputation);
    opBuilder.setAttr("dimension_numbers", dimensionNumbers);
    opBuilder.setAttr("indices_are_sorted", indicesAreSorted);
    return new Scatter<>(opBuilder.build());
  }

  /**
   * Gets output.
   *
   * @return output.
   */
  public Output<T> output() {
    return output;
  }

  @Override
  public Output<T> asOutput() {
    return output;
  }
}
