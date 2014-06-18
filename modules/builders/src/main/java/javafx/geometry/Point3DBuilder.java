/* 
 * Copyright (c) 2011, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javafx.geometry;

/**
Builder class for javafx.geometry.Point3D
@see javafx.geometry.Point3D
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class Point3DBuilder<B extends javafx.geometry.Point3DBuilder<B>> implements javafx.util.Builder<javafx.geometry.Point3D> {
    protected Point3DBuilder() {
    }
    
    /** Creates a new instance of Point3DBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.geometry.Point3DBuilder<?> create() {
        return new javafx.geometry.Point3DBuilder();
    }
    
    private double x;
    /**
    Set the value of the {@link javafx.geometry.Point3D#getX() x} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B x(double x) {
        this.x = x;
        return (B) this;
    }
    
    private double y;
    /**
    Set the value of the {@link javafx.geometry.Point3D#getY() y} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B y(double x) {
        this.y = x;
        return (B) this;
    }
    
    private double z;
    /**
    Set the value of the {@link javafx.geometry.Point3D#getZ() z} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B z(double x) {
        this.z = x;
        return (B) this;
    }
    
    /**
    Make an instance of {@link javafx.geometry.Point3D} based on the properties set on this builder.
    */
    public javafx.geometry.Point3D build() {
        javafx.geometry.Point3D x = new javafx.geometry.Point3D(this.x, this.y, this.z);
        return x;
    }
}
