/*
 *  Copyright 2001-2014 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.gen;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock tuple, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public final class TupleImmutable<X, Y, Z extends Address> implements ImmutableBean {

    /**
     * The first value.
     */
    @PropertyDefinition
    private final X first;
    /**
     * The second value.
     */
    @PropertyDefinition
    private final Y second;
    /**
     * The third value.
     */
    @PropertyDefinition
    private final Z third;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code TupleImmutable}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("rawtypes")
    public static TupleImmutable.Meta meta() {
        return TupleImmutable.Meta.INSTANCE;
    }

    /**
     * The meta-bean for {@code TupleImmutable}.
     * @param <R>  the first generic type
     * @param <S>  the second generic type
     * @param <T>  the second generic type
     * @param cls1  the first generic type
     * @param cls2  the second generic type
     * @param cls3  the third generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R, S, T extends Address> TupleImmutable.Meta<R, S, T> metaTupleImmutable(Class<R> cls1, Class<S> cls2, Class<T> cls3) {
        return TupleImmutable.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(TupleImmutable.Meta.INSTANCE);
    }

    /**
     * Returns a builder used to create an instance of the bean.
     * @param <X, Y, Z>  the type
     * @return the builder, not null
     */
    public static <X, Y, Z extends Address> TupleImmutable.Builder<X, Y, Z> builder() {
        return new TupleImmutable.Builder<X, Y, Z>();
    }

    private TupleImmutable(
            X first,
            Y second,
            Z third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @SuppressWarnings("unchecked")
    @Override
    public TupleImmutable.Meta<X, Y, Z> metaBean() {
        return TupleImmutable.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the first value.
     * @return the value of the property
     */
    public X getFirst() {
        return first;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the second value.
     * @return the value of the property
     */
    public Y getSecond() {
        return second;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the third value.
     * @return the value of the property
     */
    public Z getThird() {
        return third;
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder<X, Y, Z> toBuilder() {
        return new Builder<X, Y, Z>(this);
    }

    @Override
    public TupleImmutable<X, Y, Z> clone() {
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            TupleImmutable<?, ?, ?> other = (TupleImmutable<?, ?, ?>) obj;
            return JodaBeanUtils.equal(getFirst(), other.getFirst()) &&
                    JodaBeanUtils.equal(getSecond(), other.getSecond()) &&
                    JodaBeanUtils.equal(getThird(), other.getThird());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash += hash * 31 + JodaBeanUtils.hashCode(getFirst());
        hash += hash * 31 + JodaBeanUtils.hashCode(getSecond());
        hash += hash * 31 + JodaBeanUtils.hashCode(getThird());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(128);
        buf.append("TupleImmutable{");
        buf.append("first").append('=').append(getFirst()).append(',').append(' ');
        buf.append("second").append('=').append(getSecond()).append(',').append(' ');
        buf.append("third").append('=').append(JodaBeanUtils.toString(getThird()));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code TupleImmutable}.
     */
    public static final class Meta<X, Y, Z extends Address> extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code first} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<X> first = (DirectMetaProperty) DirectMetaProperty.ofImmutable(
                this, "first", TupleImmutable.class, Object.class);
        /**
         * The meta-property for the {@code second} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Y> second = (DirectMetaProperty) DirectMetaProperty.ofImmutable(
                this, "second", TupleImmutable.class, Object.class);
        /**
         * The meta-property for the {@code third} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Z> third = (DirectMetaProperty) DirectMetaProperty.ofImmutable(
                this, "third", TupleImmutable.class, Object.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "first",
                "second",
                "third");

        /**
         * Restricted constructor.
         */
        private Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 97440432:  // first
                    return first;
                case -906279820:  // second
                    return second;
                case 110331239:  // third
                    return third;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public TupleImmutable.Builder<X, Y, Z> builder() {
            return new TupleImmutable.Builder<X, Y, Z>();
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends TupleImmutable<X, Y, Z>> beanType() {
            return (Class) TupleImmutable.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code first} property.
         * @return the meta-property, not null
         */
        public MetaProperty<X> first() {
            return first;
        }

        /**
         * The meta-property for the {@code second} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Y> second() {
            return second;
        }

        /**
         * The meta-property for the {@code third} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Z> third() {
            return third;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 97440432:  // first
                    return ((TupleImmutable<?, ?, ?>) bean).getFirst();
                case -906279820:  // second
                    return ((TupleImmutable<?, ?, ?>) bean).getSecond();
                case 110331239:  // third
                    return ((TupleImmutable<?, ?, ?>) bean).getThird();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            metaProperty(propertyName);
            if (quiet) {
                return;
            }
            throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code TupleImmutable}.
     */
    public static final class Builder<X, Y, Z extends Address> extends DirectFieldsBeanBuilder<TupleImmutable<X, Y, Z>> {

        private X first;
        private Y second;
        private Z third;

        /**
         * Restricted constructor.
         */
        private Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        private Builder(TupleImmutable<X, Y, Z> beanToCopy) {
            this.first = beanToCopy.getFirst();
            this.second = beanToCopy.getSecond();
            this.third = beanToCopy.getThird();
        }

        //-----------------------------------------------------------------------
        @SuppressWarnings("unchecked")
        @Override
        public Builder<X, Y, Z> set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case 97440432:  // first
                    this.first = (X) newValue;
                    break;
                case -906279820:  // second
                    this.second = (Y) newValue;
                    break;
                case 110331239:  // third
                    this.third = (Z) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder<X, Y, Z> set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        @Override
        public Builder<X, Y, Z> setString(String propertyName, String value) {
            setString(meta().metaProperty(propertyName), value);
            return this;
        }

        @Override
        public Builder<X, Y, Z> setString(MetaProperty<?> property, String value) {
            super.set(property, value);
            return this;
        }

        @Override
        public Builder<X, Y, Z> setAll(Map<String, ? extends Object> propertyValueMap) {
            super.setAll(propertyValueMap);
            return this;
        }

        @Override
        public TupleImmutable<X, Y, Z> build() {
            return new TupleImmutable<X, Y, Z>(
                    first,
                    second,
                    third);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the {@code first} property in the builder.
         * @param first  the new value
         * @return this, for chaining, not null
         */
        public Builder<X, Y, Z> first(X first) {
            this.first = first;
            return this;
        }

        /**
         * Sets the {@code second} property in the builder.
         * @param second  the new value
         * @return this, for chaining, not null
         */
        public Builder<X, Y, Z> second(Y second) {
            this.second = second;
            return this;
        }

        /**
         * Sets the {@code third} property in the builder.
         * @param third  the new value
         * @return this, for chaining, not null
         */
        public Builder<X, Y, Z> third(Z third) {
            this.third = third;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(128);
            buf.append("TupleImmutable.Builder{");
            buf.append("first").append('=').append(JodaBeanUtils.toString(first)).append(',').append(' ');
            buf.append("second").append('=').append(JodaBeanUtils.toString(second)).append(',').append(' ');
            buf.append("third").append('=').append(JodaBeanUtils.toString(third));
            buf.append('}');
            return buf.toString();
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
