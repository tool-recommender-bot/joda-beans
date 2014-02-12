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

import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock tuple, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public final class TupleSub<X extends Number, Y extends Number, Z> extends TupleNonFinal<X, Y, Z> {

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code TupleSub}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("rawtypes")
    public static TupleSub.Meta meta() {
        return TupleSub.Meta.INSTANCE;
    }

    /**
     * The meta-bean for {@code TupleSub}.
     * @param <R>  the first generic type
     * @param <S>  the second generic type
     * @param <T>  the second generic type
     * @param cls1  the first generic type
     * @param cls2  the second generic type
     * @param cls3  the third generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R extends Number, S extends Number, T> TupleSub.Meta<R, S, T> metaTupleSub(Class<R> cls1, Class<S> cls2, Class<T> cls3) {
        return TupleSub.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(TupleSub.Meta.INSTANCE);
    }

    @SuppressWarnings("unchecked")
    @Override
    public TupleSub.Meta<X, Y, Z> metaBean() {
        return TupleSub.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    @Override
    public TupleSub<X, Y, Z> clone() {
        return (TupleSub<X, Y, Z>) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            return super.equals(obj);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash ^ super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(32);
        buf.append("TupleSub{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    @Override
    protected void toString(StringBuilder buf) {
        super.toString(buf);
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code TupleSub}.
     */
    public static final class Meta<X extends Number, Y extends Number, Z> extends TupleNonFinal.Meta<X, Y, Z> {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, (DirectMetaPropertyMap) super.metaPropertyMap());

        /**
         * Restricted constructor.
         */
        private Meta() {
        }

        @Override
        public BeanBuilder<? extends TupleSub<X, Y, Z>> builder() {
            return new DirectBeanBuilder<TupleSub<X, Y, Z>>(new TupleSub<X, Y, Z>());
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends TupleSub<X, Y, Z>> beanType() {
            return (Class) TupleSub.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
