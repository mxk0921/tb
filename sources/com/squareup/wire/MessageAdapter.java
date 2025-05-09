package com.squareup.wire;

import com.squareup.wire.Message;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import okio.ByteString;
import tb.eg8;
import tb.iix;
import tb.jix;
import tb.k1n;
import tb.kss;
import tb.qs8;
import tb.rs8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class MessageAdapter<M extends Message> {

    /* renamed from: a  reason: collision with root package name */
    public final com.squareup.wire.c f5986a;
    public final Class<M> b;
    public final Map<String, Integer> c = new LinkedHashMap();
    public final kss<b> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5987a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WireType.values().length];
            b = iArr;
            try {
                iArr[WireType.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[WireType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[WireType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[WireType.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[WireType.START_GROUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[WireType.END_GROUP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[Message.Datatype.values().length];
            f5987a = iArr2;
            try {
                iArr2[Message.Datatype.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5987a[Message.Datatype.INT64.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5987a[Message.Datatype.UINT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5987a[Message.Datatype.UINT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5987a[Message.Datatype.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5987a[Message.Datatype.SINT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5987a[Message.Datatype.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5987a[Message.Datatype.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5987a[Message.Datatype.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f5987a[Message.Datatype.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f5987a[Message.Datatype.MESSAGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f5987a[Message.Datatype.FIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f5987a[Message.Datatype.SFIXED32.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f5987a[Message.Datatype.FLOAT.ordinal()] = 14;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f5987a[Message.Datatype.FIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f5987a[Message.Datatype.SFIXED64.ordinal()] = 16;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f5987a[Message.Datatype.DOUBLE.ordinal()] = 17;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5988a;
        public final String b;
        public final Message.Datatype c;
        public final Message.Label d;
        public final Class<? extends k1n> e;
        public final Class<? extends Message> f;
        public final boolean g;
        public MessageAdapter<? extends Message> h;
        public eg8<? extends k1n> i;
        public final Field j;
        public final Field k;

        public /* synthetic */ b(int i, String str, Message.Datatype datatype, Message.Label label, boolean z, Class cls, Field field, Field field2, a aVar) {
            this(i, str, datatype, label, z, cls, field, field2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i, String str, Message.Datatype datatype, Message.Label label, boolean z, Class<?> cls, Field field, Field field2) {
            this.f5988a = i;
            this.b = str;
            this.c = datatype;
            this.d = label;
            this.g = z;
            if (datatype == Message.Datatype.ENUM) {
                this.e = cls;
                this.f = null;
            } else if (datatype == Message.Datatype.MESSAGE) {
                this.f = cls;
                this.e = null;
            } else {
                this.e = null;
                this.f = null;
            }
            this.j = field;
            this.k = field2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Map<Integer, ImmutableList<Object>> f5989a;

        public c() {
        }

        public void a(int i, Object obj) {
            ImmutableList<Object> immutableList;
            Map<Integer, ImmutableList<Object>> map = this.f5989a;
            if (map == null) {
                immutableList = null;
            } else {
                immutableList = map.get(Integer.valueOf(i));
            }
            if (immutableList == null) {
                immutableList = new ImmutableList<>();
                if (this.f5989a == null) {
                    this.f5989a = new LinkedHashMap();
                }
                this.f5989a.put(Integer.valueOf(i), immutableList);
            }
            ((ImmutableList) immutableList).list.add(obj);
        }

        public List<Object> b(int i) {
            Map<Integer, ImmutableList<Object>> map = this.f5989a;
            if (map == null) {
                return null;
            }
            return (ImmutableList) ((LinkedHashMap) map).get(Integer.valueOf(i));
        }

        public Set<Integer> c() {
            Map<Integer, ImmutableList<Object>> map = this.f5989a;
            if (map == null) {
                return Collections.emptySet();
            }
            return ((LinkedHashMap) map).keySet();
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public MessageAdapter(com.squareup.wire.c cVar, Class<M> cls) {
        Field[] fieldArr;
        Class cls2;
        this.f5986a = cVar;
        this.b = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            Field field = declaredFields[i];
            ProtoField protoField = (ProtoField) field.getAnnotation(ProtoField.class);
            if (protoField != null) {
                int tag = protoField.tag();
                String name = field.getName();
                this.c.put(name, Integer.valueOf(tag));
                Message.Datatype type = protoField.type();
                if (type == Message.Datatype.ENUM) {
                    cls2 = e(field);
                } else if (type == Message.Datatype.MESSAGE) {
                    cls2 = m(field);
                } else {
                    cls2 = null;
                }
                fieldArr = declaredFields;
                linkedHashMap.put(Integer.valueOf(tag), new b(tag, name, type, protoField.label(), protoField.redacted(), cls2, field, a(name), null));
            } else {
                fieldArr = declaredFields;
            }
            i++;
            declaredFields = fieldArr;
        }
        this.d = kss.e(linkedHashMap);
    }

    public final int A(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                i2++;
            } else if (charAt <= 2047) {
                i2 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        return i2;
    }

    public void B(M m, jix jixVar) throws IOException {
        qs8<T> qs8Var;
        Iterator it = ((ArrayList) i()).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            Object h = h(m, bVar);
            if (h != null) {
                Message.Label label = bVar.d;
                boolean isRepeated = label.isRepeated();
                int i = bVar.f5988a;
                Message.Datatype datatype = bVar.c;
                if (!isRepeated) {
                    H(jixVar, i, h, datatype);
                } else if (label.isPacked()) {
                    F(jixVar, (List) h, i, datatype);
                } else {
                    G(jixVar, (List) h, i, datatype);
                }
            }
        }
        if ((m instanceof ExtendableMessage) && (qs8Var = ((ExtendableMessage) m).extensionMap) != 0) {
            D(jixVar, qs8Var);
        }
        m.writeUnknownFieldMap(jixVar);
    }

    public final <E extends k1n> void C(E e, jix jixVar) throws IOException {
        jixVar.p(this.f5986a.b(e.getClass()).b(e));
    }

    public final <T extends ExtendableMessage<?>> void D(jix jixVar, qs8<T> qs8Var) throws IOException {
        for (int i = 0; i < qs8Var.g(); i++) {
            com.squareup.wire.b<T, ?> b2 = qs8Var.b(i);
            Object c2 = qs8Var.c(i);
            int p = b2.p();
            Message.Datatype j = b2.j();
            Message.Label m = b2.m();
            if (!m.isRepeated()) {
                H(jixVar, p, c2, j);
            } else if (m.isPacked()) {
                F(jixVar, (List) c2, p, j);
            } else {
                G(jixVar, (List) c2, p, j);
            }
        }
    }

    public final <M extends Message> void E(M m, jix jixVar) throws IOException {
        jixVar.p(m.getSerializedSize());
        this.f5986a.c(m.getClass()).B(m, jixVar);
    }

    public final void F(jix jixVar, List<?> list, int i, Message.Datatype datatype) throws IOException {
        Iterator<?> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += r(it.next(), datatype);
        }
        jixVar.o(i, WireType.LENGTH_DELIMITED);
        jixVar.p(i2);
        Iterator<?> it2 = list.iterator();
        while (it2.hasNext()) {
            I(jixVar, it2.next(), datatype);
        }
    }

    public final void G(jix jixVar, List<?> list, int i, Message.Datatype datatype) throws IOException {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            H(jixVar, i, it.next(), datatype);
        }
    }

    public final void H(jix jixVar, int i, Object obj, Message.Datatype datatype) throws IOException {
        jixVar.o(i, datatype.wireType());
        I(jixVar, obj, datatype);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(jix jixVar, Object obj, Message.Datatype datatype) throws IOException {
        switch (a.f5987a[datatype.ordinal()]) {
            case 1:
                jixVar.n(((Integer) obj).intValue());
                return;
            case 2:
            case 3:
                jixVar.q(((Long) obj).longValue());
                return;
            case 4:
                jixVar.p(((Integer) obj).intValue());
                return;
            case 5:
                jixVar.p(jix.r(((Integer) obj).intValue()));
                return;
            case 6:
                jixVar.q(jix.s(((Long) obj).longValue()));
                return;
            case 7:
                jixVar.k(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 8:
                C((k1n) obj, jixVar);
                return;
            case 9:
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                jixVar.p(bytes.length);
                jixVar.l(bytes);
                return;
            case 10:
                ByteString byteString = (ByteString) obj;
                jixVar.p(byteString.size());
                jixVar.l(byteString.toByteArray());
                return;
            case 11:
                E((Message) obj, jixVar);
                return;
            case 12:
            case 13:
                jixVar.h(((Integer) obj).intValue());
                return;
            case 14:
                jixVar.h(Float.floatToIntBits(((Float) obj).floatValue()));
                return;
            case 15:
            case 16:
                jixVar.i(((Long) obj).longValue());
                return;
            case 17:
                jixVar.i(Double.doubleToLongBits(((Double) obj).doubleValue()));
                return;
            default:
                throw new RuntimeException();
        }
    }

    public final Field a(String str) {
        Class<M> cls = this.b;
        try {
            return cls.getField(str);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + cls.getName() + "." + str);
        }
    }

    public final eg8<? extends k1n> b(int i) {
        eg8<? extends k1n> eg8Var;
        b b2 = this.d.b(i);
        if (b2 != null && (eg8Var = b2.i) != null) {
            return eg8Var;
        }
        eg8<? extends k1n> b3 = this.f5986a.b(c(i));
        if (b2 != null) {
            b2.i = b3;
        }
        return b3;
    }

    public final Class<? extends k1n> c(int i) {
        Class<? extends k1n> cls;
        com.squareup.wire.b<ExtendableMessage<?>, ?> f;
        b b2 = this.d.b(i);
        if (b2 == null) {
            cls = null;
        } else {
            cls = b2.e;
        }
        if (cls != null || (f = f(i)) == null) {
            return cls;
        }
        return f.k();
    }

    public final <E extends k1n> int d(E e) {
        return jix.e(this.f5986a.b(e.getClass()).b(e));
    }

    public final Class<Enum> e(Field field) {
        Class type = field.getType();
        if (Enum.class.isAssignableFrom(type)) {
            return type;
        }
        if (!List.class.isAssignableFrom(type)) {
            return null;
        }
        Type type2 = ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
        if (!(type2 instanceof Class)) {
            return null;
        }
        Class<Enum> cls = (Class) type2;
        if (Enum.class.isAssignableFrom(cls)) {
            return cls;
        }
        return null;
    }

    public final com.squareup.wire.b<ExtendableMessage<?>, ?> f(int i) {
        rs8 rs8Var = this.f5986a.d;
        if (rs8Var == null) {
            return null;
        }
        return rs8Var.b(this.b, i);
    }

    public final <T extends ExtendableMessage<?>> int g(qs8<T> qs8Var) {
        int p;
        int i = 0;
        for (int i2 = 0; i2 < qs8Var.g(); i2++) {
            com.squareup.wire.b<T, ?> b2 = qs8Var.b(i2);
            Object c2 = qs8Var.c(i2);
            int p2 = b2.p();
            Message.Datatype j = b2.j();
            Message.Label m = b2.m();
            if (!m.isRepeated()) {
                p = p(p2, c2, j);
            } else if (m.isPacked()) {
                p = n((List) c2, p2, j);
            } else {
                p = o((List) c2, p2, j);
            }
            i += p;
        }
        return i;
    }

    public Object h(M m, b bVar) {
        if (bVar.j != null) {
            try {
                return bVar.j.get(m);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        } else {
            throw new AssertionError("Field is not of type \"Message\"");
        }
    }

    public Collection<b> i() {
        return this.d.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MessageAdapter<? extends Message> j(int i) {
        MessageAdapter<? extends Message> messageAdapter;
        b b2 = this.d.b(i);
        if (b2 != null && (messageAdapter = b2.h) != null) {
            return messageAdapter;
        }
        MessageAdapter<? extends Message> c2 = this.f5986a.c(k(i));
        if (b2 != null) {
            b2.h = c2;
        }
        return c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Class<Message> k(int i) {
        Class cls;
        com.squareup.wire.b<ExtendableMessage<?>, ?> f;
        b b2 = this.d.b(i);
        if (b2 == null) {
            cls = null;
        } else {
            cls = b2.f;
        }
        if (cls != null || (f = f(i)) == null) {
            return cls;
        }
        return f.n();
    }

    public final <M extends Message> int l(M m) {
        int serializedSize = m.getSerializedSize();
        return jix.e(serializedSize) + serializedSize;
    }

    public final Class<Message> m(Field field) {
        Class type = field.getType();
        if (Message.class.isAssignableFrom(type)) {
            return type;
        }
        if (!List.class.isAssignableFrom(type)) {
            return null;
        }
        Type type2 = ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
        if (!(type2 instanceof Class)) {
            return null;
        }
        Class<Message> cls = (Class) type2;
        if (Message.class.isAssignableFrom(cls)) {
            return cls;
        }
        return null;
    }

    public final int n(List<?> list, int i, Message.Datatype datatype) {
        Iterator<?> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += r(it.next(), datatype);
        }
        return jix.e(jix.b(i, WireType.LENGTH_DELIMITED)) + jix.e(i2) + i2;
    }

    public final int o(List<?> list, int i, Message.Datatype datatype) {
        Iterator<?> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += p(i, it.next(), datatype);
        }
        return i2;
    }

    public final int p(int i, Object obj, Message.Datatype datatype) {
        return jix.g(i) + r(obj, datatype);
    }

    public int q(M m) {
        qs8<T> qs8Var;
        int p;
        Iterator it = ((ArrayList) i()).iterator();
        int i = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            Object h = h(m, bVar);
            if (h != null) {
                Message.Label label = bVar.d;
                boolean isRepeated = label.isRepeated();
                int i2 = bVar.f5988a;
                Message.Datatype datatype = bVar.c;
                if (!isRepeated) {
                    p = p(i2, h, datatype);
                } else if (label.isPacked()) {
                    p = n((List) h, i2, datatype);
                } else {
                    p = o((List) h, i2, datatype);
                }
                i += p;
            }
        }
        if ((m instanceof ExtendableMessage) && (qs8Var = ((ExtendableMessage) m).extensionMap) != 0) {
            i += g(qs8Var);
        }
        return i + m.getUnknownFieldsSerializedSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int r(Object obj, Message.Datatype datatype) {
        int A;
        int e;
        switch (a.f5987a[datatype.ordinal()]) {
            case 1:
                return jix.a(((Integer) obj).intValue());
            case 2:
            case 3:
                return jix.f(((Long) obj).longValue());
            case 4:
                return jix.e(((Integer) obj).intValue());
            case 5:
                return jix.e(jix.r(((Integer) obj).intValue()));
            case 6:
                return jix.f(jix.s(((Long) obj).longValue()));
            case 7:
                return 1;
            case 8:
                return d((k1n) obj);
            case 9:
                A = A((String) obj);
                e = jix.e(A);
                break;
            case 10:
                A = ((ByteString) obj).size();
                e = jix.e(A);
                break;
            case 11:
                return l((Message) obj);
            case 12:
            case 13:
            case 14:
                return 4;
            case 15:
            case 16:
            case 17:
                return 8;
            default:
                throw new RuntimeException();
        }
        return e + A;
    }

    public M s(iix iixVar) throws IOException {
        Message.Label label;
        Message.Datatype datatype;
        com.squareup.wire.b<?, ?> bVar;
        long j;
        try {
            M newInstance = this.b.newInstance();
            c cVar = new c(null);
            while (true) {
                int n = iixVar.n();
                int i = n >> 3;
                WireType valueOf = WireType.valueOf(n);
                kss<b> kssVar = this.d;
                if (i == 0) {
                    for (Integer num : cVar.c()) {
                        int intValue = num.intValue();
                        if (kssVar.a(intValue)) {
                            w(newInstance, intValue, cVar.b(intValue));
                        } else {
                            x((ExtendableMessage) newInstance, f(intValue), cVar.b(intValue));
                        }
                    }
                    return newInstance;
                }
                b b2 = kssVar.b(i);
                if (b2 != null) {
                    Message.Datatype datatype2 = b2.c;
                    label = b2.d;
                    datatype = datatype2;
                    bVar = null;
                } else {
                    com.squareup.wire.b<?, ?> f = f(i);
                    if (f == null) {
                        u(newInstance, iixVar, i, valueOf);
                    } else {
                        Message.Datatype j2 = f.j();
                        bVar = f;
                        label = f.m();
                        datatype = j2;
                    }
                }
                if (!label.isPacked() || valueOf != WireType.LENGTH_DELIMITED) {
                    Object v = v(iixVar, i, datatype);
                    if (datatype == Message.Datatype.ENUM && (v instanceof Integer)) {
                        newInstance.addVarint(i, ((Integer) v).intValue());
                    } else if (label.isRepeated()) {
                        cVar.a(i, v);
                    } else if (bVar != null) {
                        x((ExtendableMessage) newInstance, bVar, v);
                    } else {
                        w(newInstance, i, v);
                    }
                } else {
                    int o = iixVar.o();
                    long d = iixVar.d();
                    int h = iixVar.h(o);
                    while (true) {
                        j = o + d;
                        if (iixVar.d() >= j) {
                            break;
                        }
                        Object v2 = v(iixVar, i, datatype);
                        if (datatype != Message.Datatype.ENUM || !(v2 instanceof Integer)) {
                            cVar.a(i, v2);
                        } else {
                            newInstance.addVarint(i, ((Integer) v2).intValue());
                        }
                    }
                    iixVar.g(h);
                    if (iixVar.d() != j) {
                        throw new IOException("Packed data had wrong length!");
                    }
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final Message t(iix iixVar, int i) throws IOException {
        int o = iixVar.o();
        if (iixVar.d < 64) {
            int h = iixVar.h(o);
            iixVar.d++;
            Message s = j(i).s(iixVar);
            iixVar.a(0);
            iixVar.d--;
            iixVar.g(h);
            return s;
        }
        throw new IOException("Wire recursion limit exceeded");
    }

    public final void u(Message message, iix iixVar, int i, WireType wireType) throws IOException {
        switch (a.b[wireType.ordinal()]) {
            case 1:
                message.ensureUnknownFieldMap().e(i, Long.valueOf(iixVar.p()));
                return;
            case 2:
                message.ensureUnknownFieldMap().b(i, Integer.valueOf(iixVar.k()));
                return;
            case 3:
                message.ensureUnknownFieldMap().c(i, Long.valueOf(iixVar.l()));
                return;
            case 4:
                message.ensureUnknownFieldMap().d(i, iixVar.j(iixVar.o()));
                return;
            case 5:
                iixVar.s();
                return;
            case 6:
                return;
            default:
                throw new RuntimeException("Unsupported wire type: " + wireType);
        }
    }

    public final Object v(iix iixVar, int i, Message.Datatype datatype) throws IOException {
        boolean z;
        switch (a.f5987a[datatype.ordinal()]) {
            case 1:
            case 4:
                return Integer.valueOf(iixVar.o());
            case 2:
            case 3:
                return Long.valueOf(iixVar.p());
            case 5:
                return Integer.valueOf(iix.b(iixVar.o()));
            case 6:
                return Long.valueOf(iix.c(iixVar.p()));
            case 7:
                if (iixVar.o() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                eg8<? extends k1n> b2 = b(i);
                int o = iixVar.o();
                try {
                    return b2.a(o);
                } catch (IllegalArgumentException unused) {
                    return Integer.valueOf(o);
                }
            case 9:
                return iixVar.m();
            case 10:
                return iixVar.i();
            case 11:
                return t(iixVar, i);
            case 12:
            case 13:
                return Integer.valueOf(iixVar.k());
            case 14:
                return Float.valueOf(Float.intBitsToFloat(iixVar.k()));
            case 15:
            case 16:
                return Long.valueOf(iixVar.l());
            case 17:
                return Double.valueOf(Double.longBitsToDouble(iixVar.l()));
            default:
                throw new RuntimeException();
        }
    }

    public void w(M m, int i, Object obj) {
        try {
            this.d.b(i).k.set(m, obj);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    public final void x(ExtendableMessage extendableMessage, com.squareup.wire.b<?, ?> bVar, Object obj) {
        extendableMessage.setExtension(bVar, obj);
    }

    public byte[] y(M m) {
        byte[] bArr = new byte[q(m)];
        try {
            B(m, jix.c(bArr));
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String z(M m) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.getSimpleName());
        sb.append("{");
        Iterator it = ((ArrayList) i()).iterator();
        String str = "";
        while (it.hasNext()) {
            b bVar = (b) it.next();
            Object h = h(m, bVar);
            if (h != null) {
                sb.append(str);
                sb.append(bVar.b);
                sb.append("=");
                if (bVar.g) {
                    h = "██";
                }
                sb.append(h);
                str = ", ";
            }
        }
        if (m instanceof ExtendableMessage) {
            sb.append(str);
            sb.append("{extensions=");
            sb.append(((ExtendableMessage) m).extensionsToString());
            sb.append("}");
        }
        sb.append("}");
        return sb.toString();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ImmutableList<T> extends AbstractList<T> implements Cloneable, RandomAccess, Serializable {
        private final List<T> list = new ArrayList();

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.list.get(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        public Object clone() {
            return this;
        }
    }
}
