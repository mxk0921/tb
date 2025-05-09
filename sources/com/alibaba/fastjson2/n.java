package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.BeanUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class n<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Type f2467a;
    public final Class<? super T> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends n<Object> {
        public a(Type type, boolean z) {
            super(type, z, null);
        }
    }

    public /* synthetic */ n(Type type, boolean z, a aVar) {
        this(type, z);
    }

    public static n<?> a(Type type) {
        return new a(type, true);
    }

    public final Class<? super T> b() {
        return this.b;
    }

    public final Type c() {
        return this.f2467a;
    }

    public n() {
        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.f2467a = type;
        this.b = (Class<? super T>) BeanUtils.J(type);
    }

    public n(Type type, boolean z) {
        type.getClass();
        this.f2467a = BeanUtils.h(type);
        this.b = (Class<? super T>) BeanUtils.J(type);
    }
}
