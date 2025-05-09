package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.ggk;
import tb.iik;
import tb.jdk;
import tb.jik;
import tb.k2a;
import tb.kek;
import tb.ls9;
import tb.vu3;
import tb.wqf;
import tb.wqx;
import tb.xfk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class JSONArray extends ArrayList<Object> {
    static iik<JSONArray> arrayWriter = null;
    private static final long serialVersionUID = 1;

    public JSONArray() {
    }

    public static JSONArray copyOf(Collection collection) {
        return new JSONArray(collection);
    }

    public static JSONArray from(Object obj) {
        return (JSONArray) wqf.o(obj);
    }

    public static JSONArray of(Object... objArr) {
        return new JSONArray(objArr);
    }

    public static JSONArray parse(String str, JSONReader.Feature... featureArr) {
        return wqf.c(str, featureArr);
    }

    public static JSONArray parseArray(String str, JSONReader.Feature... featureArr) {
        return wqf.c(str, featureArr);
    }

    public JSONArray addArray() {
        JSONArray jSONArray = new JSONArray();
        add(jSONArray);
        return jSONArray;
    }

    public JSONObject addObject() {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject);
        return jSONObject;
    }

    @Override // java.util.ArrayList
    public Object clone() {
        return new JSONArray(this);
    }

    public JSONArray fluentAdd(Object obj) {
        add(obj);
        return this;
    }

    public JSONArray fluentAddAll(Collection<?> collection) {
        addAll(collection);
        return this;
    }

    public JSONArray fluentClear() {
        clear();
        return this;
    }

    public JSONArray fluentRemove(int i) {
        remove(i);
        return this;
    }

    public JSONArray fluentRemoveAll(Collection<?> collection) {
        removeAll(collection);
        return this;
    }

    public JSONArray fluentSet(int i, Object obj) {
        set(i, obj);
        return this;
    }

    public BigDecimal getBigDecimal(int i) {
        Object obj = get(i);
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

    public BigInteger getBigInteger(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if (obj instanceof BigInteger) {
                return (BigInteger) obj;
            }
            if (obj instanceof BigDecimal) {
                return ((BigDecimal) obj).toBigInteger();
            }
            return BigInteger.valueOf(((Number) obj).longValue());
        } else if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            return new BigInteger(str);
        } else {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to BigInteger");
        }
    }

    public Boolean getBoolean(int i) {
        Object obj = get(i);
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
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            if ("true".equalsIgnoreCase(str) || "1".equals(str)) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to Boolean");
        }
    }

    public boolean getBooleanValue(int i) {
        Object obj = get(i);
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
            String str = (String) obj;
            return "true".equalsIgnoreCase(str) || "1".equals(str);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to boolean value");
    }

    public Byte getByte(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            return Byte.valueOf(Byte.parseByte(str));
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to Byte");
    }

    public byte getByteValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return (byte) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).byteValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return (byte) 0;
            }
            return Byte.parseByte(str);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to byte value");
    }

    public Date getDate(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (!(obj instanceof Number)) {
            return TypeUtils.K(obj);
        }
        long longValue = ((Number) obj).longValue();
        if (longValue == 0) {
            return null;
        }
        return new Date(longValue);
    }

    public Double getDouble(int i) {
        Object obj = get(i);
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
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str));
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to Double");
    }

    public double getDoubleValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            return (str.isEmpty() || "null".equalsIgnoreCase(str)) ? vu3.b.GEO_NOT_SUPPORT : Double.parseDouble(str);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to double value");
    }

    public Float getFloat(int i) {
        Object obj = get(i);
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
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            return Float.valueOf(Float.parseFloat(str));
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to Float");
    }

    public float getFloatValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0.0f;
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return 0.0f;
            }
            return Float.parseFloat(str);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to float value");
    }

    public int getIntValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return 0;
            }
            return Integer.parseInt(str);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to int value");
    }

    public Integer getInteger(int i) {
        Object obj = get(i);
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
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(str));
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to Integer");
    }

    public JSONArray getJSONArray(int i) {
        Object obj = get(i);
        JSONArray jSONArray = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            return (JSONArray) ((xfk) JSONFactory.t).o(JSONReader.K1(str), null, null, 0L);
        } else if (obj instanceof Collection) {
            JSONArray jSONArray2 = new JSONArray((Collection) obj);
            set(i, jSONArray2);
            return jSONArray2;
        } else if (obj instanceof Object[]) {
            return of((Object[]) obj);
        } else {
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                jSONArray = new JSONArray(length);
                for (int i2 = 0; i2 < length; i2++) {
                    jSONArray.add(Array.get(obj, i2));
                }
            }
            return jSONArray;
        }
    }

    public JSONObject getJSONObject(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            return (JSONObject) ((ggk) JSONFactory.u).o(JSONReader.K1(str), null, null, 0L);
        } else if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            set(i, jSONObject);
            return jSONObject;
        } else {
            iik j = JSONFactory.defaultObjectWriterProvider.j(obj.getClass());
            if (j instanceof jik) {
                return ((jik) j).j(obj);
            }
            return null;
        }
    }

    public Long getLong(int i) {
        Object obj = get(i);
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
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            return Long.valueOf(Long.parseLong(str));
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to Long");
    }

    public long getLongValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return 0L;
            }
            return Long.parseLong(str);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to long value");
    }

    public <T> T getObject(int i, Type type, JSONReader.Feature... featureArr) {
        T t = (T) get(i);
        if (t == null) {
            return null;
        }
        Class<?> cls = t.getClass();
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        k2a M = objectReaderProvider.M(cls, type);
        if (M != null) {
            return (T) M.apply(t);
        }
        long j = 0;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
        }
        if (t instanceof Map) {
            return (T) objectReaderProvider.J(type, z).x((Map) t, j);
        }
        if (t instanceof Collection) {
            return (T) objectReaderProvider.J(type, z).i((Collection) t);
        }
        Class<?> m = TypeUtils.m(type);
        if (m.isInstance(t)) {
            return t;
        }
        JSONReader K1 = JSONReader.K1(wqf.q(t));
        K1.f2453a.b(featureArr);
        return (T) objectReaderProvider.J(m, z).o(K1, null, null, 0L);
    }

    public Short getShort(int i) {
        Object obj = get(i);
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
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            return Short.valueOf(Short.parseShort(str));
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to Short");
    }

    public short getShortValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return (short) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).shortValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return (short) 0;
            }
            return Short.parseShort(str);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to short value");
    }

    public String getString(int i) {
        Object obj = get(i);
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

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        int size = super.size();
        if (i < 0) {
            int i2 = i + size;
            if (i2 >= 0) {
                return super.set(i2, obj);
            }
            super.add(0, obj);
            return null;
        } else if (i < size) {
            return super.set(i, obj);
        } else {
            if (i < size + 4096) {
                while (true) {
                    int i3 = i - 1;
                    if (i == size) {
                        break;
                    }
                    super.add(null);
                    i = i3;
                }
                super.add(obj);
            }
            return null;
        }
    }

    public <T> T to(Type type) {
        if (type == String.class) {
            return (T) toString();
        }
        return (T) JSONFactory.defaultObjectReaderProvider.I(type).i(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] toArray(Class<T> cls, JSONReader.Feature... featureArr) {
        long j = 0;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        jdk J = objectReaderProvider.J(cls, z);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, size()));
        for (int i = 0; i < size(); i++) {
            Object obj = get(i);
            if (obj instanceof JSONObject) {
                obj = J.x((Map) obj, j);
            } else if (obj instanceof Map) {
                obj = J.x((Map) obj, j);
            } else if (obj != null && !cls.isInstance(obj)) {
                Class<?> cls2 = obj.getClass();
                k2a M = objectReaderProvider.M(cls2, cls);
                if (M != null) {
                    tArr[i] = M.apply(obj);
                } else {
                    throw new JSONException(cls2 + " cannot be converted to " + cls);
                }
            }
            tArr[i] = obj;
        }
        return tArr;
    }

    public byte[] toJSONBBytes(JSONWriter.Feature... featureArr) {
        JSONWriter W0 = JSONWriter.W0(featureArr);
        try {
            W0.b1(this);
            W0.g1(this);
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

    public <T> List<T> toJavaList(Class<T> cls, JSONReader.Feature... featureArr) {
        return toList(cls, featureArr);
    }

    @Deprecated
    public <T> T toJavaObject(Type type) {
        return (T) to(type);
    }

    public <T> List<T> toList(Class<T> cls, JSONReader.Feature... featureArr) {
        long j = 0;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        jdk J = objectReaderProvider.J(cls, z);
        ArrayList arrayList = new ArrayList(size());
        for (int i = 0; i < size(); i++) {
            Object obj = get(i);
            if (obj instanceof JSONObject) {
                obj = J.x((Map) obj, j);
            } else if (obj instanceof Map) {
                obj = J.x((Map) obj, j);
            } else if (obj != null && !cls.isInstance(obj)) {
                Class<?> cls2 = obj.getClass();
                k2a M = objectReaderProvider.M(cls2, cls);
                if (M != null) {
                    arrayList.add(M.apply(obj));
                } else {
                    throw new JSONException(cls2 + " cannot be converted to " + cls);
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        JSONWriter T0 = JSONWriter.T0();
        try {
            T0.b1(this);
            T0.g1(this);
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

    public JSONArray(int i) {
        super(i);
    }

    public static JSONArray from(Object obj, JSONWriter.Feature... featureArr) {
        return (JSONArray) wqf.p(obj, featureArr);
    }

    public static JSONArray of(Object obj) {
        JSONArray jSONArray = new JSONArray(1);
        jSONArray.add(obj);
        return jSONArray;
    }

    public static <T> List<T> parseArray(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        return wqf.e(str, cls, featureArr);
    }

    public static String toJSONString(Object obj, JSONWriter.Feature... featureArr) {
        return wqf.r(obj, featureArr);
    }

    public JSONArray fluentRemove(Object obj) {
        remove(obj);
        return this;
    }

    public JSONArray(Collection<?> collection) {
        super(collection);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls) {
        return wqf.d(str, cls);
    }

    public JSONArray(Object... objArr) {
        super(objArr.length);
        for (Object obj : objArr) {
            super.add(obj);
        }
    }

    public static JSONArray of(Object obj, Object obj2) {
        JSONArray jSONArray = new JSONArray(2);
        jSONArray.add(obj);
        jSONArray.add(obj2);
        return jSONArray;
    }

    public <T> T to(Class<T> cls) {
        if (cls == String.class) {
            return (T) toString();
        }
        return (T) JSONFactory.defaultObjectReaderProvider.I(cls).i(this);
    }

    public static JSONArray of(Object obj, Object obj2, Object obj3) {
        JSONArray jSONArray = new JSONArray(3);
        jSONArray.add(obj);
        jSONArray.add(obj2);
        jSONArray.add(obj3);
        return jSONArray;
    }

    public String toString(JSONWriter.Feature... featureArr) {
        JSONWriter V0 = JSONWriter.V0(featureArr);
        try {
            if (((JSONWriter.Feature.ReferenceDetection.mask | JSONWriter.Feature.PrettyFormat.mask | JSONWriter.Feature.NotWriteEmptyArray.mask | JSONWriter.Feature.NotWriteDefaultValue.mask) & V0.f2458a.c) == 0) {
                V0.g1(this);
            } else {
                V0.b1(this);
                if (arrayWriter == null) {
                    arrayWriter = V0.L(JSONArray.class, JSONArray.class);
                }
                arrayWriter.y(V0, this, null, null, 0L);
            }
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

    public Date getDate(int i, Date date) {
        Date date2 = getDate(i);
        return date2 == null ? date : date2;
    }

    public <T> T getObject(int i, Class<T> cls, JSONReader.Feature... featureArr) {
        T t = (T) get(i);
        jdk jdkVar = null;
        if (t == null) {
            return null;
        }
        Class<?> cls2 = t.getClass();
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        k2a M = objectReaderProvider.M(cls2, cls);
        if (M != null) {
            return (T) M.apply(t);
        }
        long j = 0;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
        }
        if (t instanceof Map) {
            return (T) objectReaderProvider.J(cls, z).x((Map) t, j);
        }
        if (t instanceof Collection) {
            return (T) objectReaderProvider.J(cls, z).i((Collection) t);
        }
        Class<?> m = TypeUtils.m(cls);
        if (m.isInstance(t)) {
            return t;
        }
        if (t instanceof String) {
            String str = (String) t;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            if (m.isEnum()) {
                jdkVar = objectReaderProvider.J(m, z);
                if (jdkVar instanceof kek) {
                    return (T) ((kek) jdkVar).e(ls9.a(str));
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

    public <T> T getObject(int i, k2a<JSONObject, T> k2aVar) {
        JSONObject jSONObject = getJSONObject(i);
        if (jSONObject == null) {
            return null;
        }
        return k2aVar.apply(jSONObject);
    }
}
