package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jik<T> implements iik<T> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22013a;
    public h1n b;
    public e1n c;
    public qij d;
    public y1w e;
    public final Class f;
    public final List<FieldWriter> g;
    public final FieldWriter[] h;
    public final String i;
    public byte[] j;
    public String k;
    public long l;
    public byte[] m;
    public byte[] n;
    public char[] o;
    public final long p;
    public final long[] q;
    public final short[] r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;

    public jik(Class<T> cls, String str, String str2, long j, List<FieldWriter> list) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f = cls;
        this.k = str2;
        this.i = (str == null || str.isEmpty()) ? JSON.DEFAULT_TYPE_KEY : str;
        this.p = j;
        this.g = list;
        if (cls == null || Serializable.class.isAssignableFrom(cls)) {
            z = true;
        } else {
            z = false;
        }
        this.t = z;
        if ("com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList".equals(str2) || "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet".equals(str2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.v = z2;
        FieldWriter[] fieldWriterArr = new FieldWriter[list.size()];
        this.h = fieldWriterArr;
        list.toArray(fieldWriterArr);
        if (fieldWriterArr.length != 1 || (fieldWriterArr[0].d & f79.VALUE_MASK) == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.s = z3;
        int length = fieldWriterArr.length;
        long[] jArr = new long[length];
        int i = 0;
        boolean z4 = false;
        while (true) {
            FieldWriter[] fieldWriterArr2 = this.h;
            if (i >= fieldWriterArr2.length) {
                break;
            }
            FieldWriter fieldWriter = fieldWriterArr2[i];
            jArr[i] = ls9.a(fieldWriter.f2478a);
            if (fieldWriter.j != null && (fieldWriter.d & f79.FIELD_MASK) == 0) {
                z4 = true;
            }
            i++;
        }
        this.u = z4;
        long[] copyOf = Arrays.copyOf(jArr, length);
        this.q = copyOf;
        Arrays.sort(copyOf);
        this.r = new short[copyOf.length];
        for (int i2 = 0; i2 < length; i2++) {
            this.r[Arrays.binarySearch(this.q, jArr[i2])] = (short) i2;
        }
    }

    @Override // tb.iik
    public void A(e1n e1nVar) {
        this.c = e1nVar;
        if (e1nVar != null) {
            this.f22013a = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
        if ((r0.d & tb.f79.FIELD_MASK) == 0) goto L_0x006e;
     */
    @Override // tb.iik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void B(com.alibaba.fastjson2.JSONWriter r28, java.lang.Object r29, java.lang.Object r30, java.lang.reflect.Type r31, long r32) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jik.B(com.alibaba.fastjson2.JSONWriter, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }

    @Override // tb.iik
    public /* synthetic */ void C(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        hik.e(this, jSONWriter, obj, obj2, type, j);
    }

    @Override // tb.iik
    public FieldWriter E(long j) {
        int binarySearch = Arrays.binarySearch(this.q, j);
        if (binarySearch < 0) {
            return null;
        }
        return this.h[this.r[binarySearch]];
    }

    public void a() {
        throw new JSONException("not support none serializable class ".concat(this.f.getName()));
    }

    public String b() {
        Class cls;
        if (this.k == null && (cls = this.f) != null) {
            if (!Enum.class.isAssignableFrom(cls) || cls.isEnum()) {
                this.k = TypeUtils.n(cls);
            } else {
                this.k = cls.getSuperclass().getName();
            }
        }
        return this.k;
    }

    @Override // tb.iik
    public void c(h1n h1nVar) {
        this.b = h1nVar;
        if (h1nVar != null) {
            this.f22013a = true;
        }
    }

    public long d() {
        String b;
        if (this.l == 0 && (b = b()) != null) {
            this.l = ls9.a(b);
        }
        return this.l;
    }

    @Override // tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        long A = this.p | j | jSONWriter.A();
        if (!this.t) {
            if ((JSONWriter.Feature.ErrorOnNoneSerializable.mask & A) != 0) {
                a();
                throw null;
            } else if ((JSONWriter.Feature.IgnoreNoneSerializable.mask & A) != 0) {
                jSONWriter.b2();
                return;
            }
        }
        if ((A & JSONWriter.Feature.IgnoreNoneSerializable.mask) != 0) {
            B(jSONWriter, obj, obj2, type, j);
            return;
        }
        int length = this.h.length;
        if (jSONWriter.R0(obj, type, j)) {
            o(jSONWriter);
        }
        jSONWriter.e1();
        for (int i = 0; i < length; i++) {
            this.g.get(i).o(jSONWriter, obj);
        }
        jSONWriter.g();
    }

    @Override // tb.iik
    public void f(qij qijVar) {
        this.d = qijVar;
        if (qijVar != null) {
            this.f22013a = true;
        }
    }

    @Override // tb.iik
    public void g(y1w y1wVar) {
        this.e = y1wVar;
        if (y1wVar != null) {
            this.f22013a = true;
        }
    }

    public byte[] h() {
        String b;
        if (this.m == null && (b = b()) != null) {
            this.m = yqf.a(b);
        }
        return this.m;
    }

    public /* synthetic */ void i(uh9 uh9Var) {
        hik.c(this, uh9Var);
    }

    public JSONObject j(T t) {
        return m(t, 0L);
    }

    @Override // tb.iik
    public /* synthetic */ void k(JSONWriter jSONWriter, Object obj) {
        hik.d(this, jSONWriter, obj);
    }

    @Override // tb.iik
    public void l(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.R0(obj, type, j)) {
            o(jSONWriter);
        }
        List<FieldWriter> list = this.g;
        int size = list.size();
        jSONWriter.d1(size);
        for (int i = 0; i < size; i++) {
            list.get(i).R(jSONWriter, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.alibaba.fastjson2.writer.FieldWriter] */
    public JSONObject m(T t, long j) {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        for (FieldWriter fieldWriter : this.g) {
            Object a2 = fieldWriter.a(t);
            Class cls = fieldWriter.c;
            if ((fieldWriter.d & f79.UNWRAPPED_MASK) == 0) {
                if (a2 != null) {
                    String name = a2.getClass().getName();
                    if (Collection.class.isAssignableFrom(cls) && a2.getClass() != JSONObject.class && !name.equals("com.alibaba.fastjson.JSONObject")) {
                        Collection collection = (Collection) a2;
                        JSONArray jSONArray = new JSONArray(collection.size());
                        for (Object obj2 : collection) {
                            if (obj2 == t) {
                                obj = jSONObject;
                            } else {
                                obj = wqf.o(obj2);
                            }
                            jSONArray.add(obj);
                        }
                        a2 = jSONArray;
                    }
                }
                if (a2 != null || ((this.p | j) & JSONWriter.Feature.WriteNulls.mask) != 0) {
                    if (a2 == t) {
                        a2 = jSONObject;
                    }
                    jSONObject.put(fieldWriter.f2478a, a2);
                }
            } else if (a2 instanceof Map) {
                jSONObject.putAll((Map) a2);
            } else {
                iik b = fieldWriter.b();
                if (b == null) {
                    b = JSONFactory.defaultObjectWriterProvider.j(fieldWriter.c);
                }
                for (FieldWriter fieldWriter2 : b.p()) {
                    jSONObject.put(fieldWriter2.f2478a, fieldWriter2.a(a2));
                }
            }
        }
        return jSONObject;
    }

    @Override // tb.iik
    public final boolean n(JSONWriter jSONWriter) {
        if (this.f22013a || jSONWriter.c0(this.u)) {
            return true;
        }
        return false;
    }

    public final void o(JSONWriter jSONWriter) {
        jSONWriter.getClass();
        jSONWriter.t2(h(), d());
    }

    @Override // tb.iik
    public List<FieldWriter> p() {
        return this.g;
    }

    public boolean q(JSONWriter jSONWriter) {
        String b = b();
        boolean z = jSONWriter.b;
        String str = this.i;
        if (z) {
            if (this.n == null) {
                int length = str.length();
                int length2 = b.length();
                int i = length + length2;
                byte[] bArr = new byte[i + 5];
                bArr[0] = 34;
                str.getBytes(0, length, bArr, 1);
                bArr[length + 1] = 34;
                bArr[length + 2] = 58;
                bArr[length + 3] = 34;
                b.getBytes(0, length2, bArr, length + 4);
                bArr[i + 4] = 34;
                this.n = bArr;
            }
            jSONWriter.Y1(this.n);
            return true;
        } else if (jSONWriter.c) {
            if (this.o == null) {
                int length3 = str.length();
                int length4 = b.length();
                int i2 = length3 + length4;
                char[] cArr = new char[i2 + 5];
                cArr[0] = '\"';
                str.getChars(0, length3, cArr, 1);
                cArr[length3 + 1] = '\"';
                cArr[length3 + 2] = f7l.CONDITION_IF_MIDDLE;
                cArr[length3 + 3] = '\"';
                b.getChars(0, length4, cArr, length3 + 4);
                cArr[i2 + 4] = '\"';
                this.o = cArr;
            }
            jSONWriter.a2(this.o);
            return true;
        } else if (jSONWriter.d) {
            if (this.j == null) {
                this.j = yqf.a(str);
            }
            jSONWriter.g2(this.j);
            jSONWriter.g2(this.m);
            return true;
        } else {
            jSONWriter.k2(str);
            jSONWriter.s1();
            jSONWriter.k2(b);
            return true;
        }
    }

    public /* synthetic */ void r(JSONWriter jSONWriter, Object obj) {
        hik.h(this, jSONWriter, obj);
    }

    public String toString() {
        return this.f.getName();
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        boolean z;
        if (this.s) {
            this.h[0].R(jSONWriter, obj);
            return;
        }
        long j2 = this.p | j;
        long A = jSONWriter.A() | j2;
        if ((JSONWriter.Feature.BeanToArray.mask & A) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (jSONWriter.d) {
            if (z) {
                l(jSONWriter, obj, obj2, type, j);
            } else {
                e(jSONWriter, obj, obj2, type, j);
            }
        } else if (this.v) {
            fjk.f19342a.y(jSONWriter, (Collection) obj, obj2, type, j);
        } else if (z) {
            C(jSONWriter, obj, obj2, type, j);
        } else {
            if (!this.t) {
                if ((JSONWriter.Feature.ErrorOnNoneSerializable.mask & A) != 0) {
                    a();
                    throw null;
                } else if ((A & JSONWriter.Feature.IgnoreNoneSerializable.mask) != 0) {
                    jSONWriter.b2();
                    return;
                }
            }
            if (n(jSONWriter)) {
                B(jSONWriter, obj, obj2, type, j);
                return;
            }
            jSONWriter.e1();
            if ((j2 & JSONWriter.Feature.WriteClassName.mask) != 0 || jSONWriter.N0(obj, j)) {
                q(jSONWriter);
            }
            List<FieldWriter> list = this.g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).o(jSONWriter, obj);
            }
            jSONWriter.g();
        }
    }
}
