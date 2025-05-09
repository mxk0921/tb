package com.squareup.wire;

import com.squareup.wire.ExtendableMessage;
import com.squareup.wire.Message;
import okio.ByteString;
import tb.k1n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class b<T extends ExtendableMessage<?>, E> implements Comparable<b<?, ?>> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f5994a;
    private final Class<? extends Message> b;
    private final Class<? extends k1n> c;
    private final String d;
    private final int e;
    private final Message.Datatype f;
    private final Message.Label g;

    public static <T extends ExtendableMessage<?>> C0307b<T, Boolean> a(Class<T> cls) {
        return new C0307b<>(cls, Message.Datatype.BOOL);
    }

    public static <T extends ExtendableMessage<?>> C0307b<T, ByteString> b(Class<T> cls) {
        return new C0307b<>(cls, Message.Datatype.BYTES);
    }

    public static <T extends ExtendableMessage<?>> C0307b<T, Double> e(Class<T> cls) {
        return new C0307b<>(cls, Message.Datatype.DOUBLE);
    }

    public static <T extends ExtendableMessage<?>, E extends Enum & k1n> C0307b<T, E> f(Class<E> cls, Class<T> cls2) {
        return new C0307b<>(cls2, null, cls, Message.Datatype.ENUM);
    }

    public static <T extends ExtendableMessage<?>> C0307b<T, Integer> g(Class<T> cls) {
        return new C0307b<>(cls, Message.Datatype.FIXED32);
    }

    public static <T extends ExtendableMessage<?>> C0307b<T, Long> h(Class<T> cls) {
        return new C0307b<>(cls, Message.Datatype.FIXED64);
    }

    public static <T extends ExtendableMessage<?>> C0307b<T, Float> i(Class<T> cls) {
        return new C0307b<>(cls, Message.Datatype.FLOAT);
    }

    public static <T extends ExtendableMessage<?>> C0307b<T, Integer> q(Class<T> cls) {
        return new C0307b<>(cls, Message.Datatype.INT32);
    }

    public static <T extends ExtendableMessage<?>> C0307b<T, Long> r(Class<T> cls) {
        return new C0307b<>(cls, Message.Datatype.INT64);
    }

    public static <T extends ExtendableMessage<?>, M extends Message> C0307b<T, M> s(Class<M> cls, Class<T> cls2) {
        return new C0307b<>(cls2, cls, null, Message.Datatype.MESSAGE);
    }

    public static <T extends ExtendableMessage<?>> C0307b<T, Integer> t(Class<T> cls) {
        return new C0307b<>(cls, Message.Datatype.SFIXED32);
    }

    public static <T extends ExtendableMessage<?>> C0307b<T, Long> u(Class<T> cls) {
        return new C0307b<>(cls, Message.Datatype.SFIXED64);
    }

    public static <T extends ExtendableMessage<?>> C0307b<T, Integer> v(Class<T> cls) {
        return new C0307b<>(cls, Message.Datatype.SINT32);
    }

    public static <T extends ExtendableMessage<?>> C0307b<T, Long> w(Class<T> cls) {
        return new C0307b<>(cls, Message.Datatype.SINT64);
    }

    public static <T extends ExtendableMessage<?>> C0307b<T, String> x(Class<T> cls) {
        return new C0307b<>(cls, Message.Datatype.STRING);
    }

    public static <T extends ExtendableMessage<?>> C0307b<T, Integer> y(Class<T> cls) {
        return new C0307b<>(cls, Message.Datatype.UINT32);
    }

    public static <T extends ExtendableMessage<?>> C0307b<T, Long> z(Class<T> cls) {
        return new C0307b<>(cls, Message.Datatype.UINT64);
    }

    /* renamed from: d */
    public int compareTo(b<?, ?> bVar) {
        int value;
        int value2;
        if (bVar == this) {
            return 0;
        }
        int i = this.e;
        int i2 = bVar.e;
        if (i != i2) {
            return i - i2;
        }
        Message.Datatype datatype = this.f;
        if (datatype != bVar.f) {
            value = datatype.value();
            value2 = bVar.f.value();
        } else {
            Message.Label label = this.g;
            if (label != bVar.g) {
                value = label.value();
                value2 = bVar.g.value();
            } else {
                Class<T> cls = this.f5994a;
                if (cls != null && !cls.equals(bVar.f5994a)) {
                    return this.f5994a.getName().compareTo(bVar.f5994a.getName());
                }
                Class<? extends Message> cls2 = this.b;
                if (cls2 != null && !cls2.equals(bVar.b)) {
                    return this.b.getName().compareTo(bVar.b.getName());
                }
                Class<? extends k1n> cls3 = this.c;
                if (cls3 == null || cls3.equals(bVar.c)) {
                    return 0;
                }
                return this.c.getName().compareTo(bVar.c.getName());
            }
        }
        return value - value2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b) || compareTo((b) obj) != 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int value = ((((((this.e * 37) + this.f.value()) * 37) + this.g.value()) * 37) + this.f5994a.hashCode()) * 37;
        Class<? extends Message> cls = this.b;
        int i2 = 0;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        int i3 = (value + i) * 37;
        Class<? extends k1n> cls2 = this.c;
        if (cls2 != null) {
            i2 = cls2.hashCode();
        }
        return i3 + i2;
    }

    public Message.Datatype j() {
        return this.f;
    }

    public Class<? extends k1n> k() {
        return this.c;
    }

    public Class<T> l() {
        return this.f5994a;
    }

    public Message.Label m() {
        return this.g;
    }

    public Class<? extends Message> n() {
        return this.b;
    }

    public String o() {
        return this.d;
    }

    public int p() {
        return this.e;
    }

    public String toString() {
        return String.format("[%s %s %s = %d]", this.g, this.f, this.d, Integer.valueOf(this.e));
    }

    /* compiled from: Taobao */
    /* renamed from: com.squareup.wire.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class C0307b<T extends ExtendableMessage<?>, E> {
        public C0307b(Class<T> cls, Message.Datatype datatype) {
        }

        public C0307b(Class<T> cls, Class<? extends Message> cls2, Class<? extends k1n> cls3, Message.Datatype datatype) {
        }
    }

    private b(Class<T> cls, Class<? extends Message> cls2, Class<? extends k1n> cls3, String str, int i, Message.Label label, Message.Datatype datatype) {
        this.f5994a = cls;
        this.d = str;
        this.e = i;
        this.f = datatype;
        this.g = label;
        this.b = cls2;
        this.c = cls3;
    }
}
