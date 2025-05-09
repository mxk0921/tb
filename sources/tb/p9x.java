package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p9x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Object d;

    /* renamed from: a  reason: collision with root package name */
    public ByteArrayOutputStream f25969a = new ByteArrayOutputStream(128);
    public iq2 b = new iq2(this.f25969a);
    public final LinkedHashMap<Object, Integer> c = new LinkedHashMap<>();
    public boolean e = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$weex$WeexValue$Type;

        static {
            int[] iArr = new int[WeexValue.Type.values().length];
            $SwitchMap$com$taobao$android$weex$WeexValue$Type = iArr;
            try {
                iArr[WeexValue.Type.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.BOOL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.OBJECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.ARRAY_BUFFER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.FUNCTION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        t2o.a(982515971);
    }

    public p9x(Object obj) {
        this.d = obj;
    }

    public static double j(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("547a70d", new Object[]{bArr, new Integer(i)})).doubleValue();
        }
        return Double.longBitsToDouble(o(bArr, i));
    }

    public static float m(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("845e9a1a", new Object[]{bArr, new Integer(i)})).floatValue();
        }
        return Float.intBitsToFloat(n(bArr, i));
    }

    public static int n(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0188830", new Object[]{bArr, new Integer(i)})).intValue();
        }
        int i2 = (bArr[2 + i] & 255) << 16;
        return (bArr[i] & 255) | ((bArr[1 + i] & 255) << 8) | i2 | (bArr[i + 3] << 24);
    }

    public static long o(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a25ee3e", new Object[]{bArr, new Integer(i)})).longValue();
        }
        return (bArr[i] & 255) | (bArr[i + 7] << 56) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 3] & 255) << 24) | ((bArr[2 + i] & 255) << 16) | ((bArr[1 + i] & 255) << 8);
    }

    public static void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    public static WeexValueImpl r(byte[] bArr, String[] strArr, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("ff15042e", new Object[]{bArr, strArr, objArr});
        }
        try {
            switch (bArr[0]) {
                case 0:
                    return WeexValueImpl.ofUndefined();
                case 1:
                    return WeexValueImpl.ofNull();
                case 2:
                    return WeexValueImpl.ofInt(n(bArr, 1));
                case 3:
                    return WeexValueImpl.ofLong(o(bArr, 1));
                case 4:
                    return WeexValueImpl.ofDouble(m(bArr, 1));
                case 5:
                    return WeexValueImpl.ofDouble(j(bArr, 1));
                case 6:
                    return WeexValueImpl.ofBool(true);
                case 7:
                    return WeexValueImpl.ofBool(false);
                case 8:
                    int n = n(bArr, 1);
                    if ((Integer.MIN_VALUE & n) != 0) {
                        return WeexValueImpl.ofString(pg1.a(n & Integer.MAX_VALUE));
                    }
                    if (strArr == null) {
                        return WeexValueImpl.ofUndefined();
                    }
                    return WeexValueImpl.ofString(strArr[n]);
                case 9:
                    b bVar = new b(null);
                    bVar.f25970a = bArr;
                    return WeexValueImpl.ofJSONArray((JSONArray) s(bVar, strArr, objArr));
                case 10:
                    b bVar2 = new b(null);
                    bVar2.f25970a = bArr;
                    return WeexValueImpl.ofJSONObject((JSONObject) s(bVar2, strArr, objArr));
                case 11:
                    int n2 = n(bArr, 1);
                    if (objArr != null) {
                        Object obj = objArr[n2];
                        if (obj instanceof byte[]) {
                            return WeexValueImpl.ofArrayBuffer((byte[]) obj);
                        }
                    }
                    return WeexValueImpl.ofUndefined();
                default:
                    return WeexValueImpl.ofUndefined();
            }
        } catch (Throwable th) {
            dwh.g("WeexValuePack", "CppToJavaConvertError", th);
            return WeexValueImpl.ofUndefined();
        }
    }

    public static Object s(b bVar, String[] strArr, Object[] objArr) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9eccff58", new Object[]{bVar, strArr, objArr});
        }
        byte[] bArr = bVar.f25970a;
        int i2 = bVar.b;
        int i3 = i2 + 1;
        bVar.b = i3;
        switch (bArr[i2]) {
            case 2:
                int n = n(bArr, i3);
                bVar.b += 4;
                return Integer.valueOf(n);
            case 3:
                long o = o(bArr, i3);
                bVar.b += 8;
                return Long.valueOf(o);
            case 4:
                float m = m(bArr, i3);
                bVar.b += 4;
                return Float.valueOf(m);
            case 5:
                double j = j(bArr, i3);
                bVar.b += 8;
                return Double.valueOf(j);
            case 6:
                return Boolean.TRUE;
            case 7:
                return Boolean.FALSE;
            case 8:
                int n2 = n(bArr, i3);
                bVar.b += 4;
                if ((n2 & Integer.MIN_VALUE) != 0) {
                    return pg1.a(n2 & Integer.MAX_VALUE);
                }
                if (strArr == null) {
                    return null;
                }
                return strArr[n2];
            case 9:
                int n3 = n(bArr, i3);
                bVar.b += 4;
                JSONArray jSONArray = new JSONArray(n3);
                while (i < n3) {
                    jSONArray.add(s(bVar, strArr, objArr));
                    i++;
                }
                return jSONArray;
            case 10:
                int n4 = n(bArr, i3);
                bVar.b += 4;
                JSONObject jSONObject = new JSONObject(n4);
                while (i < n4) {
                    int n5 = n(bVar.f25970a, bVar.b);
                    bVar.b += 4;
                    if ((n5 & Integer.MIN_VALUE) != 0) {
                        str = pg1.a(n5 & Integer.MAX_VALUE);
                    } else if (strArr == null) {
                        str = "";
                    } else {
                        str = strArr[n5];
                    }
                    jSONObject.put(str, s(bVar, strArr, objArr));
                    i++;
                }
                return jSONObject;
            case 11:
                int n6 = n(bArr, i3);
                bVar.b += 4;
                if (objArr != null) {
                    Object obj = objArr[n6];
                    if (obj instanceof byte[]) {
                        return obj;
                    }
                }
                return null;
            default:
                return null;
        }
    }

    public void a(boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5792e2", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.b.write(6);
        } else {
            this.b.write(7);
        }
    }

    public void b(double d) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c3dc05", new Object[]{this, new Double(d)});
            return;
        }
        this.b.write(5);
        this.b.writeDouble(d);
    }

    public void c(float f) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c02abe", new Object[]{this, new Float(f)});
            return;
        }
        this.b.write(4);
        this.b.writeFloat(f);
    }

    public void d(int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c4308e", new Object[]{this, new Integer(i)});
            return;
        }
        this.b.write(2);
        this.b.writeInt(i);
    }

    public void e(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc953680", new Object[]{this, new Long(j)});
            return;
        }
        this.b.write(3);
        this.b.writeLong(j);
    }

    public final int f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8eae91ed", new Object[]{this, obj})).intValue();
        }
        Integer num = this.c.get(obj);
        if (num == null) {
            int size = this.c.size();
            this.c.put(obj, Integer.valueOf(size));
            num = Integer.valueOf(size);
        }
        return num.intValue();
    }

    public void g(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636f0923", new Object[]{this, str});
            return;
        }
        this.b.write(8);
        this.b.writeInt(f(str));
    }

    public final void h(Object obj) throws Exception {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2adf89f3", new Object[]{this, obj});
            return;
        }
        iq2 iq2Var = this.b;
        LinkedHashMap<Object, Integer> linkedHashMap = this.c;
        if (obj == null) {
            iq2Var.writeByte(1);
        } else if (obj instanceof WeexValue) {
            WeexValue weexValue = (WeexValue) obj;
            switch (a.$SwitchMap$com$taobao$android$weex$WeexValue$Type[weexValue.getType().ordinal()]) {
                case 1:
                    iq2Var.writeByte(0);
                    return;
                case 2:
                    iq2Var.writeByte(1);
                    return;
                case 3:
                    e(weexValue.getLong());
                    return;
                case 4:
                    b(weexValue.getDouble());
                    return;
                case 5:
                    a(weexValue.getBool());
                    return;
                case 6:
                    g(weexValue.getString());
                    return;
                case 7:
                    JSONArray<Object> array = weexValue.getArray();
                    iq2Var.writeByte(9);
                    int size = array.size();
                    iq2Var.writeInt(size);
                    for (Object obj2 : array) {
                        i++;
                        h(obj2);
                    }
                    if (i != size) {
                        throw new IllegalStateException("ConcurrentModified WeexValue" + obj);
                    }
                    return;
                case 8:
                    JSONObject object = weexValue.getObject();
                    iq2Var.writeByte(10);
                    int size2 = object.size();
                    iq2Var.writeInt(size2);
                    for (Map.Entry<String, Object> entry : object.entrySet()) {
                        i++;
                        iq2Var.writeInt(f(entry.getKey()));
                        h(entry.getValue());
                    }
                    if (i != size2) {
                        throw new ConcurrentModificationException("ConcurrentModified WeexValue" + obj);
                    }
                    return;
                case 9:
                    iq2Var.write(11);
                    iq2Var.writeInt(f(weexValue.getArrayBuffer()));
                    return;
                case 10:
                    iq2Var.writeByte(0);
                    return;
                default:
                    iq2Var.writeByte(0);
                    return;
            }
        } else {
            Class<?> cls = obj.getClass();
            if (String.class == cls) {
                iq2Var.writeByte(8);
                String str2 = (String) obj;
                Integer num = linkedHashMap.get(str2);
                if (num == null) {
                    int size3 = linkedHashMap.size();
                    linkedHashMap.put(str2, Integer.valueOf(size3));
                    num = Integer.valueOf(size3);
                }
                iq2Var.writeInt(num.intValue());
            } else if (Integer.class == cls) {
                d(((Integer) obj).intValue());
            } else if (Boolean.class == cls) {
                a(((Boolean) obj).booleanValue());
            } else if (Map.class.isAssignableFrom(cls)) {
                Map map = (Map) obj;
                iq2Var.writeByte(10);
                int size4 = map.size();
                iq2Var.writeInt(size4);
                for (Map.Entry entry2 : map.entrySet()) {
                    i++;
                    Object key = entry2.getKey();
                    if (key instanceof String) {
                        str = (String) key;
                    } else {
                        str = String.valueOf(key);
                    }
                    iq2Var.writeInt(f(str));
                    h(entry2.getValue());
                }
                if (i != size4) {
                    throw new ConcurrentModificationException("ConcurrentModified WeexValue: " + obj);
                }
            } else if (List.class.isAssignableFrom(cls)) {
                List<Object> list = (List) obj;
                iq2Var.writeByte(9);
                int size5 = list.size();
                iq2Var.writeInt(size5);
                for (Object obj3 : list) {
                    i++;
                    h(obj3);
                }
                if (i != size5) {
                    throw new ConcurrentModificationException("ConcurrentModified WeexValue" + obj);
                }
            } else if (Float.class == cls) {
                c(((Float) obj).floatValue());
            } else if (Double.class == cls) {
                b(((Double) obj).doubleValue());
            } else if (BigInteger.class == cls) {
                e(((BigInteger) obj).longValue());
            } else if (Long.class == cls) {
                e(((Long) obj).longValue());
            } else if (BigDecimal.class == cls) {
                b(((BigDecimal) obj).doubleValue());
            } else if (byte[].class == cls) {
                iq2Var.write(11);
                iq2Var.writeInt(f(obj));
            } else {
                try {
                    Object json = JSON.toJSON(obj);
                    if ((json instanceof JSONObject) || (json instanceof JSONArray)) {
                        h(json);
                    } else {
                        iq2Var.writeByte(0);
                    }
                } catch (Exception unused) {
                    iq2Var.writeByte(0);
                }
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        try {
            this.b.close();
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public byte[] k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d6a0d5ad", new Object[]{this});
        }
        if (this.e) {
            return null;
        }
        return this.f25969a.toByteArray();
    }

    public Object[] l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("154d53eb", new Object[]{this});
        }
        if (this.e) {
            return null;
        }
        return this.c.keySet().toArray();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
        r7.e = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean p() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "WeexValue"
            com.android.alibaba.ip.runtime.IpChange r3 = tb.p9x.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r2 = "2ca93224"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.Object r0 = r3.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x001b:
            r3 = 0
        L_0x001c:
            r4 = 3
            if (r3 >= r4) goto L_0x007d
            java.lang.Object r4 = r7.d     // Catch: all -> 0x0027, ConcurrentModificationException -> 0x0029
            r7.h(r4)     // Catch: all -> 0x0027, ConcurrentModificationException -> 0x0029
            r7.e = r0     // Catch: all -> 0x0027
            goto L_0x007d
        L_0x0027:
            r0 = move-exception
            goto L_0x005b
        L_0x0029:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x0027
            r5.<init>()     // Catch: all -> 0x0027
            java.lang.String r6 = "Value concurrent modified, retry:"
            r5.append(r6)     // Catch: all -> 0x0027
            java.lang.String r4 = tb.dwh.m(r4)     // Catch: all -> 0x0027
            r5.append(r4)     // Catch: all -> 0x0027
            java.lang.String r4 = r5.toString()     // Catch: all -> 0x0027
            tb.dwh.e(r4)     // Catch: all -> 0x0027
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0027
            r5 = 128(0x80, float:1.794E-43)
            r4.<init>(r5)     // Catch: all -> 0x0027
            r7.f25969a = r4     // Catch: all -> 0x0027
            tb.iq2 r4 = new tb.iq2     // Catch: all -> 0x0027
            java.io.ByteArrayOutputStream r5 = r7.f25969a     // Catch: all -> 0x0027
            r4.<init>(r5)     // Catch: all -> 0x0027
            r7.b = r4     // Catch: all -> 0x0027
            java.util.LinkedHashMap<java.lang.Object, java.lang.Integer> r4 = r7.c     // Catch: all -> 0x0027
            r4.clear()     // Catch: all -> 0x0027
            int r3 = r3 + r1
            goto L_0x001c
        L_0x005b:
            r7.e = r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x0078
            r3.<init>()     // Catch: all -> 0x0078
            java.lang.String r4 = "Error when convert WeexValue to Cpp, value lost: "
            r3.append(r4)     // Catch: all -> 0x0078
            java.lang.Object r4 = r7.d     // Catch: all -> 0x0078
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r4)     // Catch: all -> 0x0078
            r3.append(r4)     // Catch: all -> 0x0078
            java.lang.String r3 = r3.toString()     // Catch: all -> 0x0078
            tb.dwh.g(r2, r3, r0)     // Catch: all -> 0x0078
            goto L_0x007d
        L_0x0078:
            java.lang.String r3 = "Error when convert WeexValue to Cpp, value lost"
            tb.dwh.g(r2, r3, r0)
        L_0x007d:
            boolean r0 = r7.e
            r0 = r0 ^ r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.p9x.p():boolean");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f25970a;
        public int b;

        static {
            t2o.a(982515973);
        }

        public b() {
            this.b = 0;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }
}
