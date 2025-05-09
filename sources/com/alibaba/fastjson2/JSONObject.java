package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.b2d;
import tb.ggk;
import tb.iik;
import tb.jdk;
import tb.jik;
import tb.k2a;
import tb.kek;
import tb.ls9;
import tb.nk4;
import tb.qij;
import tb.vcf;
import tb.vu3;
import tb.wqf;
import tb.wqx;
import tb.y1w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class JSONObject extends LinkedHashMap<String, Object> implements InvocationHandler {
    static jdk<JSONArray> arrayReader = null;
    private static final long serialVersionUID = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements nk4<Method> {

        /* renamed from: a  reason: collision with root package name */
        public final Annotation f2452a;
        public String b;

        public a(Annotation annotation) {
            this.f2452a = annotation;
        }

        /* renamed from: a */
        public void accept(Method method) {
            if ("name".equals(method.getName())) {
                try {
                    String str = (String) method.invoke(this.f2452a, new Object[0]);
                    if (!str.isEmpty()) {
                        this.b = str;
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
    }

    public JSONObject() {
    }

    public static JSONObject from(Object obj) {
        return (JSONObject) wqf.o(obj);
    }

    private String getJSONFieldName(Method method) {
        Annotation[] annotations;
        String str = null;
        for (Annotation annotation : method.getAnnotations()) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            JSONField jSONField = (JSONField) BeanUtils.t(annotation, JSONField.class);
            if (jSONField != null) {
                str = jSONField.name();
                if (str.isEmpty()) {
                    str = null;
                }
            } else if ("com.alibaba.fastjson.annotation.JSONField".equals(annotationType.getName())) {
                a aVar = new a(annotation);
                BeanUtils.e(annotationType, aVar);
                String str2 = aVar.b;
                if (str2 != null) {
                    str = str2;
                }
            }
        }
        return str;
    }

    public static void nameFilter(Iterable<?> iterable, qij qijVar) {
        for (Object obj : iterable) {
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).nameFilter(qijVar);
            } else if (obj instanceof Iterable) {
                nameFilter((Iterable) obj, qijVar);
            }
        }
    }

    public static JSONObject of() {
        return new JSONObject();
    }

    public static JSONObject parse(String str, JSONReader.Feature... featureArr) {
        return wqf.g(str, featureArr);
    }

    public static <T> T parseObject(String str, Class<T> cls) {
        return (T) wqf.j(str, cls);
    }

    public static void valueFilter(Iterable<?> iterable, y1w y1wVar) {
        for (Object obj : iterable) {
            if (obj instanceof Map) {
                valueFilter((Map) obj, y1wVar);
            } else if (obj instanceof Iterable) {
                valueFilter((Iterable) obj, y1wVar);
            }
        }
    }

    public boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public Object eval(c cVar) {
        return cVar.a(this);
    }

    public JSONObject fluentPut(String str, Object obj) {
        put(str, obj);
        return this;
    }

    public Object get(String str) {
        return super.get((Object) str);
    }

    public BigDecimal getBigDecimal(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if (obj instanceof BigDecimal) {
                return (BigDecimal) obj;
            }
            if (obj instanceof BigInteger) {
                return new BigDecimal((BigInteger) obj);
            }
            if (obj instanceof Float) {
                return TypeUtils.C(((Float) obj).floatValue());
            }
            if (obj instanceof Double) {
                return TypeUtils.B(((Double) obj).doubleValue());
            }
            return BigDecimal.valueOf(((Number) obj).longValue());
        } else if (obj instanceof String) {
            return TypeUtils.E((String) obj);
        } else {
            if (!(obj instanceof Boolean)) {
                throw new JSONException("Can not cast '" + obj.getClass() + "' to BigDecimal");
            } else if (((Boolean) obj).booleanValue()) {
                return BigDecimal.ONE;
            } else {
                return BigDecimal.ZERO;
            }
        }
    }

    public BigInteger getBigInteger(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if (obj instanceof Number) {
            if (obj instanceof BigDecimal) {
                return ((BigDecimal) obj).toBigInteger();
            }
            return BigInteger.valueOf(((Number) obj).longValue());
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            return new BigInteger(str2);
        } else {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to BigInteger");
        }
    }

    public Boolean getBoolean(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        boolean z = false;
        if (obj instanceof Number) {
            if (((Number) obj).intValue() == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            if ("true".equalsIgnoreCase(str2) || "1".equals(str2)) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to Boolean");
        }
    }

    public boolean getBooleanValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue() == 1;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            return "true".equalsIgnoreCase(str2) || "1".equals(str2);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to boolean value");
    }

    public Object getByPath(String str) {
        return c.b(str).a(this);
    }

    public Byte getByte(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            return Byte.valueOf(Byte.parseByte(str2));
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to Byte");
    }

    public byte getByteValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return (byte) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).byteValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return (byte) 0;
            }
            return Byte.parseByte(str2);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to byte value");
    }

    public byte[] getBytes(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return b2d.c((String) obj);
        }
        throw new JSONException("can not cast to byte[], value : " + obj);
    }

    public Date getDate(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof String) {
            long f0 = DateUtils.f0((String) obj, wqx.d);
            if (f0 == 0) {
                return null;
            }
            return new Date(f0);
        } else if (obj instanceof Number) {
            return new Date(((Number) obj).longValue());
        } else {
            return TypeUtils.K(obj);
        }
    }

    public Double getDouble(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str2));
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to Double");
    }

    public double getDoubleValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            return (str2.isEmpty() || "null".equalsIgnoreCase(str2)) ? vu3.b.GEO_NOT_SUPPORT : Double.parseDouble(str2);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to double value");
    }

    public Float getFloat(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            return Float.valueOf(Float.parseFloat(str2));
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to Float");
    }

    public float getFloatValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return 0.0f;
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return 0.0f;
            }
            return Float.parseFloat(str2);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to float value");
    }

    public vcf getInstant(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof vcf) {
            return (vcf) obj;
        }
        if (!(obj instanceof Number)) {
            return TypeUtils.P(obj);
        }
        long longValue = ((Number) obj).longValue();
        if (longValue == 0) {
            return null;
        }
        return vcf.d(longValue);
    }

    public int getIntValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return 0;
            }
            if (str2.indexOf(46) != -1) {
                return (int) Double.parseDouble(str2);
            }
            return Integer.parseInt(str2);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to int value");
    }

    public Integer getInteger(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            if (str2.indexOf(46) != -1) {
                return Integer.valueOf((int) Double.parseDouble(str2));
            }
            return Integer.valueOf(Integer.parseInt(str2));
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to Integer");
    }

    public JSONArray getJSONArray(String str) {
        Object obj = super.get((Object) str);
        JSONArray jSONArray = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        if (obj instanceof JSONObject) {
            return JSONArray.of(obj);
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            JSONReader K1 = JSONReader.K1(str2);
            if (arrayReader == null) {
                arrayReader = K1.R0(JSONArray.class);
            }
            return arrayReader.o(K1, null, null, 0L);
        } else if (obj instanceof Collection) {
            JSONArray jSONArray2 = new JSONArray((Collection) obj);
            put(str, jSONArray2);
            return jSONArray2;
        } else if (obj instanceof Object[]) {
            return JSONArray.of((Object[]) obj);
        } else {
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                jSONArray = new JSONArray(length);
                for (int i = 0; i < length; i++) {
                    jSONArray.add(Array.get(obj, i));
                }
            }
            return jSONArray;
        }
    }

    public JSONObject getJSONObject(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            return (JSONObject) ((ggk) JSONFactory.u).o(JSONReader.K1(str2), null, null, 0L);
        } else if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            put(str, jSONObject);
            return jSONObject;
        } else {
            iik j = JSONFactory.defaultObjectWriterProvider.j(obj.getClass());
            if (j instanceof jik) {
                return ((jik) j).j(obj);
            }
            return null;
        }
    }

    public <T> List<T> getList(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        JSONArray jSONArray = getJSONArray(str);
        if (jSONArray == null) {
            return null;
        }
        return jSONArray.toList(cls, featureArr);
    }

    public Long getLong(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            if (str2.indexOf(46) != -1) {
                return Long.valueOf((long) Double.parseDouble(str2));
            }
            return Long.valueOf(Long.parseLong(str2));
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to Long");
    }

    public long getLongValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return 0L;
            }
            if (str2.indexOf(46) != -1) {
                return (long) Double.parseDouble(str2);
            }
            return Long.parseLong(str2);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to long value");
    }

    public <T> T getObject(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        T t = (T) super.get((Object) str);
        jdk jdkVar = null;
        if (t == null) {
            return null;
        }
        if (cls == Object.class && featureArr.length == 0) {
            return t;
        }
        int length = featureArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (featureArr[i] == JSONReader.Feature.FieldBased) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        Class<?> cls2 = t.getClass();
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        k2a M = objectReaderProvider.M(cls2, cls);
        if (M != null) {
            return (T) M.apply(t);
        }
        if (t instanceof Map) {
            return (T) objectReaderProvider.J(cls, z).t((Map) t, featureArr);
        }
        if (t instanceof Collection) {
            return (T) objectReaderProvider.J(cls, z).i((Collection) t);
        }
        Class<?> m = TypeUtils.m(cls);
        if (m.isInstance(t)) {
            return t;
        }
        if (t instanceof String) {
            String str2 = (String) t;
            if (str2.isEmpty() || "null".equals(str2)) {
                return null;
            }
            if (m.isEnum()) {
                jdkVar = objectReaderProvider.J(m, z);
                if (jdkVar instanceof kek) {
                    return (T) ((kek) jdkVar).e(ls9.a(str2));
                }
            }
        }
        String q = wqf.q(t);
        JSONReader K1 = JSONReader.K1(q);
        K1.f2453a.b(featureArr);
        if (jdkVar == null) {
            jdkVar = objectReaderProvider.J(m, z);
        }
        T t2 = (T) jdkVar.o(K1, null, null, 0L);
        if (K1.e1()) {
            return t2;
        }
        throw new JSONException("not support input ".concat(q));
    }

    public Object getOrDefault(String str, Object obj) {
        Object obj2 = super.get((Object) str);
        return obj2 == null ? obj : obj2;
    }

    public Short getShort(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Short) {
            return (Short) obj;
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            return Short.valueOf(Short.parseShort(str2));
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to Short");
    }

    public short getShortValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return (short) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).shortValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return (short) 0;
            }
            return Short.parseShort(str2);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to short value");
    }

    public int getSize(String str) {
        Object obj = get(str);
        if (obj instanceof Map) {
            return ((Map) obj).size();
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).size();
        }
        return 0;
    }

    public String getString(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Date) {
            return DateUtils.v0(((Date) obj).getTime(), false, wqx.d);
        }
        if ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof UUID) || (obj instanceof Enum)) {
            return obj.toString();
        }
        return wqf.q(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
        if (r11 != false) goto L_0x00e2;
     */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(java.lang.Object r11, java.lang.reflect.Method r12, java.lang.Object[] r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONObject.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    public JSONArray putArray(String str) {
        JSONArray jSONArray = new JSONArray();
        put(str, jSONArray);
        return jSONArray;
    }

    public JSONObject putObject(String str) {
        JSONObject jSONObject = new JSONObject();
        put(str, jSONObject);
        return jSONObject;
    }

    public <T> T to(k2a<JSONObject, T> k2aVar) {
        return k2aVar.apply(this);
    }

    public byte[] toJSONBBytes(JSONWriter.Feature... featureArr) {
        JSONWriter W0 = JSONWriter.W0(featureArr);
        try {
            W0.b1(this);
            W0.f1(this);
            byte[] w = W0.w();
            ((k) W0).close();
            return w;
        } catch (Throwable th) {
            try {
                ((k) W0).close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public String toJSONString(JSONWriter.Feature... featureArr) {
        return toString(featureArr);
    }

    public <T> T toJavaObject(Class<T> cls, JSONReader.Feature... featureArr) {
        long j = 0;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
            j |= feature.mask;
        }
        if (cls == String.class) {
            return (T) toString();
        }
        return (T) JSONFactory.defaultObjectReaderProvider.J(cls, z).x(this, j);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        JSONWriter T0 = JSONWriter.T0();
        try {
            T0.b1(this);
            T0.f1(this);
            String obj = T0.toString();
            T0.close();
            return obj;
        } catch (Throwable th) {
            try {
                T0.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public JSONObject(int i) {
        super(i);
    }

    public static JSONObject from(Object obj, JSONWriter.Feature... featureArr) {
        return (JSONObject) wqf.p(obj, featureArr);
    }

    public static JSONObject of(String str, Object obj) {
        JSONObject jSONObject = new JSONObject(1);
        jSONObject.put(str, obj);
        return jSONObject;
    }

    public static <T> T parseObject(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        return (T) wqf.k(str, cls, featureArr);
    }

    public static String toJSONString(Object obj, JSONWriter.Feature... featureArr) {
        return wqf.r(obj, featureArr);
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public JSONObject clone() {
        return new JSONObject(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if ((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) {
            return super.containsKey(obj) || super.containsKey((Object) obj.toString());
        }
        return super.containsKey(obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Object obj2;
        return (((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) && (obj2 = super.get((Object) obj.toString())) != null) ? obj2 : super.get(obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public Object getOrDefault(Object obj, Object obj2) {
        if ((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) {
            return getOrDefault(obj.toString(), obj2);
        }
        Object obj3 = super.get(obj);
        return obj3 == null ? obj2 : obj3;
    }

    public <T> T to(Type type, JSONReader.Feature... featureArr) {
        long j = 0;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
            j |= feature.mask;
        }
        if (type == String.class) {
            return (T) toString();
        }
        return (T) JSONFactory.defaultObjectReaderProvider.J(type, z).x(this, j);
    }

    public JSONObject(int i, float f) {
        super(i, f);
    }

    public static <T> T parseObject(String str, Type type, JSONReader.Feature... featureArr) {
        return (T) wqf.m(str, type, featureArr);
    }

    public JSONObject(int i, float f, boolean z) {
        super(i, f, z);
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2) {
        JSONObject jSONObject = new JSONObject(2);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        return jSONObject;
    }

    public static <T> T parseObject(String str, n<T> nVar, JSONReader.Feature... featureArr) {
        return (T) wqf.i(str, nVar, featureArr);
    }

    public JSONObject(Map map) {
        super(map);
    }

    public static JSONObject parseObject(String str) {
        return wqf.f(str);
    }

    public static void nameFilter(Map map, qij qijVar) {
        String str;
        String process;
        Iterator it = map.entrySet().iterator();
        JSONObject jSONObject = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                ((JSONObject) value).nameFilter(qijVar);
            } else if (value instanceof Iterable) {
                nameFilter((Iterable) value, qijVar);
            }
            if ((key instanceof String) && (process = qijVar.process(map, (str = (String) key), value)) != null && !process.equals(str)) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put(process, value);
                it.remove();
            }
        }
        if (jSONObject != null) {
            map.putAll(jSONObject);
        }
    }

    public static void valueFilter(Map map, y1w y1wVar) {
        Object apply;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                valueFilter((Map) value, y1wVar);
            } else if (value instanceof Iterable) {
                valueFilter((Iterable) value, y1wVar);
            }
            if ((key instanceof String) && (apply = y1wVar.apply(map, (String) key, value)) != value) {
                entry.setValue(apply);
            }
        }
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2, String str3, Object obj3) {
        JSONObject jSONObject = new JSONObject(3);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        return jSONObject;
    }

    public String toString(JSONWriter.Feature... featureArr) {
        JSONWriter V0 = JSONWriter.V0(featureArr);
        try {
            V0.b1(this);
            V0.f1(this);
            String obj = V0.toString();
            V0.close();
            return obj;
        } catch (Throwable th) {
            try {
                V0.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public <T> T toJavaObject(Type type, JSONReader.Feature... featureArr) {
        return (T) to(type, featureArr);
    }

    public <T> T to(n<T> nVar, JSONReader.Feature... featureArr) {
        return (T) to(nVar.c(), featureArr);
    }

    public <T> T toJavaObject(n<T> nVar, JSONReader.Feature... featureArr) {
        return (T) to(nVar, featureArr);
    }

    public boolean getBooleanValue(String str, boolean z) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return z;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue() == 1;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            return "true".equalsIgnoreCase(str2) || "1".equals(str2);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to boolean value");
    }

    public <T> T to(Class<T> cls, JSONReader.Feature... featureArr) {
        long j = 0;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
            j |= feature.mask;
        }
        if (cls == String.class) {
            return (T) toString();
        }
        return (T) JSONFactory.defaultObjectReaderProvider.J(cls, z).x(this, j);
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4) {
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        return jSONObject;
    }

    public Date getDate(String str, Date date) {
        Date date2 = getDate(str);
        return date2 == null ? date : date2;
    }

    public int getIntValue(String str, int i) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return i;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return i;
            }
            if (str2.indexOf(46) != -1) {
                return (int) Double.parseDouble(str2);
            }
            return Integer.parseInt(str2);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to int value");
    }

    public long getLongValue(String str, long j) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return j;
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return j;
            }
            if (str2.indexOf(46) != -1) {
                return (long) Double.parseDouble(str2);
            }
            return Long.parseLong(str2);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to long value");
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4, String str5, Object obj5) {
        JSONObject jSONObject = new JSONObject(5);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        jSONObject.put(str5, obj5);
        return jSONObject;
    }

    public void valueFilter(y1w y1wVar) {
        valueFilter(this, y1wVar);
    }

    public void nameFilter(qij qijVar) {
        nameFilter(this, qijVar);
    }

    public <T> T getObject(String str, Type type, JSONReader.Feature... featureArr) {
        T t = (T) super.get((Object) str);
        if (t == null) {
            return null;
        }
        if (type == Object.class && featureArr.length == 0) {
            return t;
        }
        int length = featureArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (featureArr[i] == JSONReader.Feature.FieldBased) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        Class<?> cls = t.getClass();
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        k2a M = objectReaderProvider.M(cls, type);
        if (M != null) {
            return (T) M.apply(t);
        }
        if (t instanceof Map) {
            return (T) objectReaderProvider.J(type, z).t((Map) t, featureArr);
        }
        if (t instanceof Collection) {
            return (T) objectReaderProvider.J(type, z).i((Collection) t);
        }
        if ((type instanceof Class) && ((Class) type).isInstance(t)) {
            return t;
        }
        if (t instanceof String) {
            String str2 = (String) t;
            if (str2.isEmpty() || "null".equals(str2)) {
                return null;
            }
        }
        JSONReader K1 = JSONReader.K1(wqf.q(t));
        K1.f2453a.b(featureArr);
        return (T) objectReaderProvider.J(type, z).o(K1, null, null, 0L);
    }

    public <T> T getObject(String str, n<T> nVar, JSONReader.Feature... featureArr) {
        return (T) getObject(str, nVar.f2467a, featureArr);
    }

    public <T> T getObject(String str, k2a<JSONObject, T> k2aVar) {
        JSONObject jSONObject = getJSONObject(str);
        if (jSONObject == null) {
            return null;
        }
        return k2aVar.apply(jSONObject);
    }
}
