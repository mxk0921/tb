package com.taobao.android.ultronx.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultronx.base.CPointer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class JsonArrayX extends JSONArray {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONArray mCache;
    public CPointer mPointer;
    public boolean mbCacheDirty = true;

    static {
        t2o.a(939524106);
    }

    public JsonArrayX(CPointer cPointer) {
        this.mPointer = cPointer;
    }

    public static /* synthetic */ Object ipc$super(JsonArrayX jsonArrayX, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultronx/json/JsonArrayX");
    }

    public native void _addArray(long j, long j2);

    public native void _addArrayV2(long j, String str);

    public native void _addBool(long j, boolean z);

    public native void _addDouble(long j, double d);

    public native void _addObject(long j, long j2);

    public native void _addObjectV2(long j, String str);

    public native void _addString(long j, String str);

    public native void _clean(long j);

    public native long _getArray(long j, int i);

    public native boolean _getBool(long j, int i);

    public native double _getDouble(long j, int i);

    public native long _getObject(long j, int i);

    public native int _getSize(long j);

    public native String _getString(long j, int i);

    public native int _getType(long j, int i);

    public native void _remove(long j, int i);

    public native String _stringify(long j);

    @Override // com.alibaba.fastjson.JSONArray, java.util.List
    public void add(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dab3277", new Object[]{this, new Integer(i), obj});
        }
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Object> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6721cc3c", new Object[]{this, collection})).booleanValue();
        }
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        markCacheIsDirty();
        for (Object obj : collection) {
            add(obj);
        }
        return true;
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        markCacheIsDirty();
        _clean(this.mPointer.f9875a);
    }

    @Override // com.alibaba.fastjson.JSONArray
    public Object clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, obj})).booleanValue();
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.contains(obj);
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176f677e", new Object[]{this, collection})).booleanValue();
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.containsAll(collection);
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List
    public Object get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)});
        }
        int _getType = _getType(this.mPointer.f9875a, i);
        if (_getType == JsonType.INVALID.val) {
            return null;
        }
        if (_getType == JsonType.BOOL.val) {
            return Boolean.valueOf(getBooleanValue(i));
        }
        if (_getType == JsonType.NUMBER.val) {
            return Double.valueOf(getDoubleValue(i));
        }
        if (_getType == JsonType.STRING.val) {
            return getString(i);
        }
        if (_getType == JsonType.ARRAY.val) {
            return getJSONArray(i);
        }
        if (_getType == JsonType.OBJECT.val) {
            return getJSONObject(i);
        }
        return null;
    }

    @Override // com.alibaba.fastjson.JSONArray
    public BigDecimal getBigDecimal(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigDecimal) ipChange.ipc$dispatch("53b75325", new Object[]{this, new Integer(i)});
        }
        return BigDecimal.valueOf(getDoubleValue(i));
    }

    @Override // com.alibaba.fastjson.JSONArray
    public BigInteger getBigInteger(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigInteger) ipChange.ipc$dispatch("16f35285", new Object[]{this, new Integer(i)});
        }
        return BigInteger.valueOf(getLongValue(i));
    }

    @Override // com.alibaba.fastjson.JSONArray
    public Boolean getBoolean(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ab3279a7", new Object[]{this, new Integer(i)});
        }
        return Boolean.valueOf(getBooleanValue(i));
    }

    @Override // com.alibaba.fastjson.JSONArray
    public boolean getBooleanValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e3bea21", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return _getBool(this.mPointer.f9875a, i);
    }

    @Override // com.alibaba.fastjson.JSONArray
    public Byte getByte(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Byte) ipChange.ipc$dispatch("cfc82bab", new Object[]{this, new Integer(i)});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.getByte(i);
    }

    @Override // com.alibaba.fastjson.JSONArray
    public byte getByteValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49ed8c95", new Object[]{this, new Integer(i)})).byteValue();
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.getByteValue(i);
    }

    @Override // com.alibaba.fastjson.JSONArray
    public Type getComponentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type) ipChange.ipc$dispatch("dd5a3d1d", new Object[]{this});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.getComponentType();
    }

    @Override // com.alibaba.fastjson.JSONArray
    public Date getDate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Date) ipChange.ipc$dispatch("6bf8b07f", new Object[]{this, new Integer(i)});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.getDate(i);
    }

    @Override // com.alibaba.fastjson.JSONArray
    public Double getDouble(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("926d348b", new Object[]{this, new Integer(i)});
        }
        return Double.valueOf(getDoubleValue(i));
    }

    @Override // com.alibaba.fastjson.JSONArray
    public double getDoubleValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e6f1aa0", new Object[]{this, new Integer(i)})).doubleValue();
        }
        return _getDouble(this.mPointer.f9875a, i);
    }

    @Override // com.alibaba.fastjson.JSONArray
    public Float getFloat(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("2b91b6bf", new Object[]{this, new Integer(i)});
        }
        return Float.valueOf(getFloatValue(i));
    }

    @Override // com.alibaba.fastjson.JSONArray
    public float getFloatValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5e6b9c1", new Object[]{this, new Integer(i)})).floatValue();
        }
        return (float) _getDouble(this.mPointer.f9875a, i);
    }

    @Override // com.alibaba.fastjson.JSONArray
    public int getIntValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44da7e17", new Object[]{this, new Integer(i)})).intValue();
        }
        return (int) _getDouble(this.mPointer.f9875a, i);
    }

    @Override // com.alibaba.fastjson.JSONArray
    public Integer getInteger(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("585b997b", new Object[]{this, new Integer(i)});
        }
        return Integer.valueOf(getIntValue(i));
    }

    @Override // com.alibaba.fastjson.JSONArray
    public JSONArray getJSONArray(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e1a36d9d", new Object[]{this, new Integer(i)});
        }
        long _getArray = _getArray(this.mPointer.f9875a, i);
        if (_getArray == 0) {
            return null;
        }
        return new JsonArrayX(new CPointer(_getArray));
    }

    @Override // com.alibaba.fastjson.JSONArray
    public JSONObject getJSONObject(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7f98b67f", new Object[]{this, new Integer(i)});
        }
        long _getObject = _getObject(this.mPointer.f9875a, i);
        if (_getObject == 0) {
            return null;
        }
        return new JsonObjectX(new CPointer(_getObject));
    }

    @Override // com.alibaba.fastjson.JSONArray
    public Long getLong(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("b47f982b", new Object[]{this, new Integer(i)});
        }
        return Long.valueOf(getLongValue(i));
    }

    @Override // com.alibaba.fastjson.JSONArray
    public long getLongValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c718b111", new Object[]{this, new Integer(i)})).longValue();
        }
        return (long) _getDouble(this.mPointer.f9875a, i);
    }

    @Override // com.alibaba.fastjson.JSONArray
    public <T> T getObject(int i, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("eede821c", new Object[]{this, new Integer(i), cls});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return (T) this.mCache.getObject(i, cls);
    }

    @Override // com.alibaba.fastjson.JSONArray
    public Object getRelatedArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4c5dbca7", new Object[]{this});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.getRelatedArray();
    }

    @Override // com.alibaba.fastjson.JSONArray
    public Short getShort(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Short) ipChange.ipc$dispatch("361bca7f", new Object[]{this, new Integer(i)});
        }
        return Short.valueOf(getShortValue(i));
    }

    @Override // com.alibaba.fastjson.JSONArray
    public short getShortValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("415ff3ee", new Object[]{this, new Integer(i)})).shortValue();
        }
        return (short) _getDouble(this.mPointer.f9875a, i);
    }

    @Override // com.alibaba.fastjson.JSONArray
    public String getString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)});
        }
        return _getString(this.mPointer.f9875a, i);
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List
    public int indexOf(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e3a7a1f", new Object[]{this, obj})).intValue();
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.indexOf(obj);
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

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
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

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.iterator();
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List
    public int lastIndexOf(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98592729", new Object[]{this, obj})).intValue();
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.lastIndexOf(obj);
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List
    public ListIterator<Object> listIterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListIterator) ipChange.ipc$dispatch("5854c466", new Object[]{this});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.listIterator();
    }

    public void markCacheIsDirty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c8d55a", new Object[]{this});
        } else {
            this.mbCacheDirty = true;
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
            JSONArray parseArray = JSON.parseArray(toJSONString());
            this.mCache = parseArray;
            if (parseArray == null) {
                z = true;
            }
            this.mbCacheDirty = z;
        } catch (Exception unused) {
            this.mCache = null;
            this.mbCacheDirty = true;
        }
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1b8db39", new Object[]{this, collection})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c63b5e58", new Object[]{this, collection})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List
    public Object set(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b227f05c", new Object[]{this, new Integer(i), obj});
        }
        return null;
    }

    @Override // com.alibaba.fastjson.JSONArray
    public void setComponentType(Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f682d0b", new Object[]{this, type});
            return;
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        this.mCache.setComponentType(type);
    }

    @Override // com.alibaba.fastjson.JSONArray
    public void setRelatedArray(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e80fe313", new Object[]{this, obj});
            return;
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        this.mCache.setRelatedArray(obj);
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return _getSize(this.mPointer.f9875a);
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List
    public List<Object> subList(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("13af8802", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.subList(i, i2);
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public Object[] toArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("a69fe546", new Object[]{this});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.toArray();
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

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public boolean add(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        markCacheIsDirty();
        if (obj instanceof Boolean) {
            _addBool(this.mPointer.f9875a, ((Boolean) obj).booleanValue());
            return true;
        } else if (obj instanceof Number) {
            _addDouble(this.mPointer.f9875a, ((Double) obj).doubleValue());
            return true;
        } else if (obj instanceof String) {
            _addString(this.mPointer.f9875a, (String) obj);
            return true;
        } else if (obj instanceof JsonArrayX) {
            _addArray(this.mPointer.f9875a, ((JsonArrayX) obj).mPointer.f9875a);
            return true;
        } else if (obj instanceof JsonObjectX) {
            _addObject(this.mPointer.f9875a, ((JsonObjectX) obj).mPointer.f9875a);
            return true;
        } else {
            if (obj instanceof JSONArray) {
                _addArrayV2(this.mPointer.f9875a, ((JSONArray) obj).toJSONString());
            } else if (obj instanceof JSONObject) {
                _addObjectV2(this.mPointer.f9875a, ((JSONObject) obj).toJSONString());
            }
            return false;
        }
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List
    public Object remove(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e3aab8da", new Object[]{this, new Integer(i)});
        }
        markCacheIsDirty();
        _remove(this.mPointer.f9875a, i);
        return 0;
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List
    public ListIterator<Object> listIterator(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListIterator) ipChange.ipc$dispatch("15f189c9", new Object[]{this, new Integer(i)});
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return this.mCache.listIterator(i);
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("800a0c4d", new Object[]{this, tArr}));
        }
        if (!isCacheUsable()) {
            refreshCache();
        }
        return (T[]) this.mCache.toArray(tArr);
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List
    public boolean addAll(int i, Collection<? extends Object> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4c09ed1", new Object[]{this, new Integer(i), collection})).booleanValue();
        }
        markCacheIsDirty();
        return addAll(collection);
    }
}
