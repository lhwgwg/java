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

package org.tensorflow.op.math;

import java.util.Arrays;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.proto.framework.DataType;
import org.tensorflow.types.family.TType;

/**
 * Returns an element-wise indication of the sign of a number.
 * {@code y = sign(x) = -1} if {@code x < 0}; 0 if {@code x == 0}; 1 if {@code x > 0}.
 * <p>For complex numbers, {@code y = sign(x) = x / |x|} if {@code x != 0}, otherwise {@code y = 0}.
 * <p>Example usage:
 * <blockquote>
 * <blockquote>
 * <blockquote>
 * <p>tf.math.sign([0., 2., -3.])
 * &lt;tf.Tensor: shape=(3,), dtype=float32, numpy=array([ 0.,  1., -1.], dtype=float32)&gt;
 * </blockquote>
 * </blockquote>
 * </blockquote>
 *
 * @param <T> data type for {@code y} output
 */
@Operator(
    group = "math"
)
public final class Sign<T extends TType> extends RawOp implements Operand<T> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "Sign";

  private Output<T> y;

  private Sign(Operation operation) {
    super(operation);
    int outputIdx = 0;
    y = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new Sign operation.
   *
   * @param scope current scope
   * @param x The x value
   * @param <T> data type for {@code Sign} output and operands
   * @return a new instance of Sign
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TType> Sign<T> create(Scope scope, Operand<T> x) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "Sign");
    opBuilder.addInput(x.asOutput());
    return new Sign<>(opBuilder.build());
  }

  /**
   * Gets y.
   *
   * @return y.
   */
  public Output<T> y() {
    return y;
  }

  @Override
  public Output<T> asOutput() {
    return y;
  }

  public static class Inputs<T extends TType> extends RawOpInputs<Sign<T>> {
    /**
     * The x input
     */
    public final Operand<T> x;

    /**
     * The T attribute
     */
    public final DataType T;

    public Inputs(GraphOperation op) {
      super(new Sign<>(op), op, Arrays.asList("T"));
      int inputIndex = 0;
      x = (Operand<T>) op.input(inputIndex++);
      T = op.attributes().getAttrType("T");
    }
  }
}
