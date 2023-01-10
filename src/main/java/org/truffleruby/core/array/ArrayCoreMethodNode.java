/*
 * Copyright (c) 2013, 2023 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 2.0, or
 * GNU General Public License version 2, or
 * GNU Lesser General Public License version 2.1.
 */
package org.truffleruby.core.array;

import org.truffleruby.builtins.CoreMethodArrayArgumentsNode;

import com.oracle.truffle.api.dsl.ImportStatic;

@ImportStatic(ArrayGuards.class)
public abstract class ArrayCoreMethodNode extends CoreMethodArrayArgumentsNode {

}
