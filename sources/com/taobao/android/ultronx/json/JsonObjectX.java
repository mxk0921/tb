package com.taobao.android.ultronx.json;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultronx.base.CPointer;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class JsonObjectX extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject mCache;
    public CPointer mPointer;
    public boolean mbCacheDirty = true;

    static {
        t2o.a(939524107);
    }

    public JsonObjectX(CPointer cPointer) {
        this.mPointer = cPointer;
    }

    public static /* synthetic */ Object ipc$super(JsonObjectX jsonObjectX, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultronx/json/JsonObjectX");
    }

    public native void _clean(long j);

    public native long _getArray(long j, String str);

    public native boolean _getBool(long j, String str);

    public native double _getDouble(long j, String str);

    public native String[] _getKeys(long j);

    public native long _getObject(long j, String str);

    public native int _getSize(long j);

    public native String _getString(long j, String str);

    public native int _getType(long j, String str);

    public native boolean _hasKey(long j, String str);

    public native void _putArray(long j, String str, long j2);

    public native void _putArrayV2(long j, String str, String str2);

    public native void _putBool(long j, String str, boolean z);

    public native void _putDouble(long j, String str, double d);

    public native void _putObject(long j, String str, long j2);

    public native void _putObjectV2(long j, String str, String str2);

    public native void _putString(long j, String str, String str2);

    public native void _remove(long j, String str);

    public native String _stringify(long j);

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            _clean(this.mPointer.f9875a);
        }
    }

    @Override // com.alibaba.fastjson.JSONObject
    public Object clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public boolean containsKey(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            return _hasKey(this.mPointer.f9875a, (String) obj);
        }
        String obj2 = obj.toString();
        if (obj2 == null) {
            return false;
        }
        return _hasKey(this.mPointer.f9875a, obj2);
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public boolean containsValue(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4ff0db9", new Object[]{this, obj})).booleanValue();
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.containsValue(obj);
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("b3acf2c6", new Object[]{this});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.getInnerMap().entrySet();
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public Object get(Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = obj.toString();
        }
        int _getType = _getType(this.mPointer.f9875a, str);
        if (_getType == JsonType.INVALID.val) {
            return null;
        }
        if (_getType == JsonType.BOOL.val) {
            return Boolean.valueOf(getBooleanValue(str));
        }
        if (_getType == JsonType.NUMBER.val) {
            return Double.valueOf(getDoubleValue(str));
        }
        if (_getType == JsonType.STRING.val) {
            return getString(str);
        }
        if (_getType == JsonType.ARRAY.val) {
            return getJSONArray(str);
        }
        if (_getType == JsonType.OBJECT.val) {
            return getJSONObject(str);
        }
        return null;
    }

    @Override // com.alibaba.fastjson.JSONObject
    public BigDecimal getBigDecimal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigDecimal) ipChange.ipc$dispatch("5923cf22", new Object[]{this, str});
        }
        return BigDecimal.valueOf(getDoubleValue(str));
    }

    @Override // com.alibaba.fastjson.JSONObject
    public BigInteger getBigInteger(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigInteger) ipChange.ipc$dispatch("b15c1ec8", new Object[]{this, str});
        }
        return BigInteger.valueOf(getLongValue(str));
    }

    @Override // com.alibaba.fastjson.JSONObject
    public Boolean getBoolean(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("dd7977c0", new Object[]{this, str});
        }
        return Boolean.valueOf(getBooleanValue(str));
    }

    @Override // com.alibaba.fastjson.JSONObject
    public boolean getBooleanValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8d789f4", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return _getBool(this.mPointer.f9875a, str);
    }

    @Override // com.alibaba.fastjson.JSONObject
    public Byte getByte(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Byte) ipChange.ipc$dispatch("d12ace9a", new Object[]{this, str});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.getByte(str);
    }

    @Override // com.alibaba.fastjson.JSONObject
    public byte getByteValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6625d0d0", new Object[]{this, str})).byteValue();
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.getByteValue(str);
    }

    @Override // com.alibaba.fastjson.JSONObject
    public byte[] getBytes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c9f7f617", new Object[]{this, str});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.getBytes(str);
    }

    @Override // com.alibaba.fastjson.JSONObject
    public Date getDate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Date) ipChange.ipc$dispatch("587054e2", new Object[]{this, str});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.getDate(str);
    }

    @Override // com.alibaba.fastjson.JSONObject
    public Double getDouble(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("6ede49c8", new Object[]{this, str});
        }
        return Double.valueOf(getDoubleValue(str));
    }

    @Override // com.alibaba.fastjson.JSONObject
    public double getDoubleValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c852f5e9", new Object[]{this, str})).doubleValue();
        }
        if (TextUtils.isEmpty(str)) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        return _getDouble(this.mPointer.f9875a, str);
    }

    @Override // com.alibaba.fastjson.JSONObject
    public Float getFloat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("6684900", new Object[]{this, str});
        }
        return Float.valueOf(getFloatValue(str));
    }

    @Override // com.alibaba.fastjson.JSONObject
    public float getFloatValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6d798ac", new Object[]{this, str})).floatValue();
        }
        return (float) getDoubleValue(str);
    }

    @Override // com.alibaba.fastjson.JSONObject
    public Map<String, Object> getInnerMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9f40a418", new Object[]{this});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.getInnerMap();
    }

    @Override // com.alibaba.fastjson.JSONObject
    public int getIntValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8b0a4bc", new Object[]{this, str})).intValue();
        }
        return (int) getDoubleValue(str);
    }

    @Override // com.alibaba.fastjson.JSONObject
    public Integer getInteger(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("d006cc80", new Object[]{this, str});
        }
        return Integer.valueOf(getIntValue(str));
    }

    @Override // com.alibaba.fastjson.JSONObject
    public JSONArray getJSONArray(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d06aecb2", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long _getArray = _getArray(this.mPointer.f9875a, str);
        if (_getArray == 0) {
            return null;
        }
        return new JsonArrayX(new CPointer(_getArray));
    }

    @Override // com.alibaba.fastjson.JSONObject
    public JSONObject getJSONObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("47d8c0e", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long _getObject = _getObject(this.mPointer.f9875a, str);
        if (_getObject == 0) {
            return null;
        }
        return new JsonObjectX(new CPointer(_getObject));
    }

    @Override // com.alibaba.fastjson.JSONObject
    public Long getLong(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("f568cab2", new Object[]{this, str});
        }
        return Long.valueOf(getLongValue(str));
    }

    @Override // com.alibaba.fastjson.JSONObject
    public long getLongValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a41a2e4", new Object[]{this, str})).longValue();
        }
        return (long) getDoubleValue(str);
    }

    @Override // com.alibaba.fastjson.JSONObject
    public <T> T getObject(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("227a7b1b", new Object[]{this, str, cls});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return (T) this.mCache.getObject(str, cls);
    }

    @Override // com.alibaba.fastjson.JSONObject
    public Short getShort(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Short) ipChange.ipc$dispatch("6c19f500", new Object[]{this, str});
        }
        return Short.valueOf(getShortValue(str));
    }

    @Override // com.alibaba.fastjson.JSONObject
    public short getShortValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbf5e299", new Object[]{this, str})).shortValue();
        }
        return (short) getDoubleValue(str);
    }

    @Override // com.alibaba.fastjson.JSONObject
    public String getString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return _getString(this.mPointer.f9875a, str);
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
        }
        return null;
    }

    public boolean isCacheUsable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b03f701b", new Object[]{this})).booleanValue();
        }
        if (this.mCache == null || this.mbCacheDirty) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        if (size() <= 0) {
            return true;
        }
        return false;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public Set<String> keySet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this});
        }
        String[] _getKeys = _getKeys(this.mPointer.f9875a);
        if (_getKeys == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (String str : _getKeys) {
            hashSet.add(str);
        }
        return hashSet;
    }

    public void markCacheIsDirty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c8d55a", new Object[]{this});
        } else {
            this.mbCacheDirty = true;
        }
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public void putAll(Map<? extends String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6703aacc", new Object[]{this, map});
        } else if (map != null) {
            markCacheIsDirty();
            for (Object obj : map.keySet()) {
                if (obj instanceof String) {
                    put((String) obj, map.get(obj));
                }
            }
        }
    }

    public void refreshCache() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b46366e", new Object[]{this});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(toJSONString());
            this.mCache = parseObject;
            if (parseObject == null) {
                z = true;
            }
            this.mbCacheDirty = z;
        } catch (Exception unused) {
            this.mCache = null;
            this.mbCacheDirty = true;
        }
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public Object remove(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, obj});
        }
        if (!(obj instanceof String)) {
            return null;
        }
        markCacheIsDirty();
        _remove(this.mPointer.f9875a, (String) obj);
        return null;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return _getSize(this.mPointer.f9875a);
    }

    @Override // com.alibaba.fastjson.JSON, com.alibaba.fastjson.JSONAware
    public String toJSONString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
        }
        return toString();
    }

    @Override // com.alibaba.fastjson.JSON
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return _stringify(this.mPointer.f9875a);
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public Collection<Object> values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("26a6afbe", new Object[]{this});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.values();
    }

    @Override // com.alibaba.fastjson.JSONObject
    public Object put(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fd14d676", new Object[]{this, str, obj});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        markCacheIsDirty();
        if (obj == null) {
            _remove(this.mPointer.f9875a, str);
            return null;
        }
        if (obj instanceof Boolean) {
            _putBool(this.mPointer.f9875a, str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Number) {
            _putDouble(this.mPointer.f9875a, str, ((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            _putString(this.mPointer.f9875a, str, (String) obj);
        } else if (obj instanceof JsonArrayX) {
            _putArray(this.mPointer.f9875a, str, ((JsonArrayX) obj).mPointer.f9875a);
        } else if (obj instanceof JsonObjectX) {
            _putObject(this.mPointer.f9875a, str, ((JsonObjectX) obj).mPointer.f9875a);
        } else if (obj instanceof JSONArray) {
            _putArrayV2(this.mPointer.f9875a, str, ((JSONArray) obj).toJSONString());
        } else if (obj instanceof JSONObject) {
            _putObjectV2(this.mPointer.f9875a, str, ((JSONObject) obj).toJSONString());
        }
        return null;
    }

    @Override // com.alibaba.fastjson.JSONObject
    public <T> T getObject(String str, Class<T> cls, Feature... featureArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1d7cfcdf", new Object[]{this, str, cls, featureArr});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return (T) this.mCache.getObject(str, cls, featureArr);
    }
}
