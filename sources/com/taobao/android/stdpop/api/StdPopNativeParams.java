package com.taobao.android.stdpop.api;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import tb.ckf;
import tb.h9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class StdPopNativeParams extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(786432028);
    }

    public StdPopNativeParams(JSONObject jSONObject) {
        ckf.g(jSONObject, h9.KEY_POP_CONFIG);
        put((StdPopNativeParams) h9.KEY_POP_CONFIG, (String) jSONObject);
    }

    public static /* synthetic */ Object ipc$super(StdPopNativeParams stdPopNativeParams, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2084926247:
                return super.get(objArr[0]);
            case -1952759047:
                return super.keySet();
            case -1515997081:
                return new Boolean(super.containsKey(objArr[0]));
            case -1280511290:
                return super.entrySet();
            case 648458174:
                return super.values();
            case 845773819:
                return new Integer(super.size());
            case 1518226411:
                return super.remove(objArr[0]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/stdpop/api/StdPopNativeParams");
        }
    }

    public final StdPopNativeParams bizId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StdPopNativeParams) ipChange.ipc$dispatch("7142a218", new Object[]{this, str});
        }
        if (str != null) {
            put((StdPopNativeParams) "bizId", str);
        }
        return this;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj != null ? obj instanceof String : true) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
        return getEntries();
    }

    public final StdPopNativeParams extConfig(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StdPopNativeParams) ipChange.ipc$dispatch("5bc0ba31", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            put((StdPopNativeParams) h9.KEY_EXT_CONFIG, (String) jSONObject);
        }
        return this;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj != null ? obj instanceof String : true) {
            return get((String) obj);
        }
        return null;
    }

    public /* bridge */ Set getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set getKeys() {
        return super.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return obj != null ? obj instanceof String : true ? getOrDefault((String) obj, obj2) : obj2;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection getValues() {
        return super.values();
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    public final StdPopNativeParams namespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StdPopNativeParams) ipChange.ipc$dispatch("6f22d1ab", new Object[]{this, str});
        }
        if (str != null) {
            put((StdPopNativeParams) "namespace", str);
        }
        return this;
    }

    public final StdPopNativeParams popId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StdPopNativeParams) ipChange.ipc$dispatch("3c32629a", new Object[]{this, str});
        }
        if (str != null) {
            put((StdPopNativeParams) "popId", str);
        }
        return this;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj != null ? obj instanceof String : true) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public final StdPopNativeParams url(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StdPopNativeParams) ipChange.ipc$dispatch("60fc8317", new Object[]{this, str});
        }
        put((StdPopNativeParams) "url", str);
        return this;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ Object get(String str) {
        return super.get((Object) str);
    }

    public /* bridge */ Object getOrDefault(String str, Object obj) {
        return super.getOrDefault((Object) str, (String) obj);
    }

    public /* bridge */ Object remove(String str) {
        return super.remove((Object) str);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj != null ? obj instanceof String : true) {
            return remove((String) obj, obj2);
        }
        return false;
    }

    public /* bridge */ boolean remove(String str, Object obj) {
        return super.remove((Object) str, obj);
    }
}
