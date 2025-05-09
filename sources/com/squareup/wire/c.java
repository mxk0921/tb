package com.squareup.wire;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.eg8;
import tb.iix;
import tb.ipm;
import tb.k1n;
import tb.rs8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<? extends Message>, MessageAdapter<? extends Message>> f5995a;
    public final Map<Class<? extends k1n>, eg8<? extends k1n>> b;
    public final Map<Class<? extends Message>, a<? extends Message>> c;
    public final rs8 d;

    public c(Class<?>... clsArr) {
        this(Arrays.asList(clsArr));
    }

    public synchronized <T extends Message> a<T> a(Class<T> cls) {
        a<T> aVar;
        aVar = (a) ((LinkedHashMap) this.c).get(cls);
        if (aVar == null) {
            aVar = new a<>(cls);
            this.c.put(cls, aVar);
        }
        return aVar;
    }

    public synchronized <E extends k1n> eg8<E> b(Class<E> cls) {
        eg8<E> eg8Var;
        eg8Var = (eg8) ((LinkedHashMap) this.b).get(cls);
        if (eg8Var == null) {
            eg8Var = new eg8<>(cls);
            this.b.put(cls, eg8Var);
        }
        return eg8Var;
    }

    public synchronized <M extends Message> MessageAdapter<M> c(Class<M> cls) {
        MessageAdapter<M> messageAdapter;
        messageAdapter = (MessageAdapter) ((LinkedHashMap) this.f5995a).get(cls);
        if (messageAdapter == null) {
            messageAdapter = new MessageAdapter<>(this, cls);
            this.f5995a.put(cls, messageAdapter);
        }
        return messageAdapter;
    }

    public final <M extends Message> M d(iix iixVar, Class<M> cls) throws IOException {
        return c(cls).s(iixVar);
    }

    public <M extends Message> M e(byte[] bArr, Class<M> cls) throws IOException {
        ipm.a(bArr, "bytes");
        ipm.a(cls, "messageClass");
        M m = (M) d(iix.f(bArr), cls);
        m.checkAvailability();
        return m;
    }

    public c(List<Class<?>> list) {
        Field[] declaredFields;
        this.f5995a = new LinkedHashMap();
        new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new rs8();
        for (Class<?> cls : list) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType().equals(b.class)) {
                    try {
                        this.d.a((b) field.get(null));
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    }
                }
            }
        }
    }
}
