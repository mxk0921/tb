package com.taobao.uniinfra_kmp.common_utils.serialization;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.i04;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\t\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001'B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00002\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "Lcom/alibaba/fastjson/JSONObject;", "", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObjectNativePayload;", "payload", "<init>", "(Ljava/lang/Object;)V", "", "toJsonString", "()Ljava/lang/String;", "key", "value", "Ltb/xhv;", "put", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "remove", "(Ljava/lang/String;)Ljava/lang/Boolean;", "", "getInt", "(Ljava/lang/String;)Ljava/lang/Integer;", "getJsonObject", "(Ljava/lang/String;)Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonArray;", "getJsonArray", "(Ljava/lang/String;)Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonArray;", "nativePayload", "()Ljava/lang/Object;", "", "toMap", "()Ljava/util/Map;", "", "getKeys", "()Ljava/util/Set;", "keys", "getSize", "()I", "size", "Companion", "a", "common_utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class KMPJsonObject extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(1029701706);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1029701705);
        t2o.a(1029701711);
    }

    public KMPJsonObject() {
        this(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(KMPJsonObject kMPJsonObject, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2084926247:
                return super.get(objArr[0]);
            case -1952759047:
                return super.keySet();
            case -1515997081:
                return new Boolean(super.containsKey(objArr[0]));
            case -1280511290:
                return super.entrySet();
            case -804860800:
                return super.getInteger((String) objArr[0]);
            case -798298958:
                return super.getJSONArray((String) objArr[0]);
            case -744798299:
                return super.toJSONString();
            case -48966026:
                return super.put((String) objArr[0], objArr[1]);
            case 75336718:
                return super.getJSONObject((String) objArr[0]);
            case 648458174:
                return super.values();
            case 845773819:
                return new Integer(super.size());
            case 1518226411:
                return super.remove(objArr[0]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject");
        }
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj == null ? true : obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
        return getEntries();
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj == null ? true : obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    public /* bridge */ Set<Map.Entry<String, Object>> getEntries() {
        return super.entrySet();
    }

    public final Integer getInt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("dc231331", new Object[]{this, str});
        }
        ckf.g(str, "key");
        return super.getInteger(str);
    }

    public final KMPJsonArray getJsonArray(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KMPJsonArray) ipChange.ipc$dispatch("dd040c76", new Object[]{this, str});
        }
        ckf.g(str, "key");
        return new KMPJsonArray(super.getJSONArray(str));
    }

    public final KMPJsonObject getJsonObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KMPJsonObject) ipChange.ipc$dispatch("dd1cab06", new Object[]{this, str});
        }
        ckf.g(str, "key");
        return new KMPJsonObject(super.getJSONObject(str));
    }

    public Set<String> getKeys() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2d9cf820", new Object[]{this});
        }
        Set<String> keySet = super.keySet();
        ckf.f(keySet, "<get-keys>(...)");
        return keySet;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj == null ? true : obj instanceof String) ? obj2 : getOrDefault((String) obj, obj2);
    }

    public int getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    public Object nativePayload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("27378074", new Object[]{this});
        }
        return this;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public /* bridge */ /* synthetic */ Object put(String str, Object obj) {
        put(str, obj);
        return xhv.INSTANCE;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public final String toJsonString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this});
        }
        return super.toJSONString();
    }

    public final Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        return this;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    public KMPJsonObject(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Set keySet = map.keySet();
            int size = keySet.size();
            for (int i = 0; i < size; i++) {
                Object U = i04.U(keySet, i);
                put((KMPJsonObject) String.valueOf(U), (String) map.get(U));
            }
        }
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

    @Override // com.alibaba.fastjson.JSONObject
    public void put(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97b403c", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "key");
        super.put(str, obj);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj == null ? true : obj instanceof String)) {
            return false;
        }
        return remove((String) obj, obj2);
    }

    public /* bridge */ boolean remove(String str, Object obj) {
        return super.remove((Object) str, obj);
    }

    public Boolean remove(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("dae44e52", new Object[]{this, str});
        }
        ckf.g(str, "key");
        if (super.remove((Object) str) == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ KMPJsonObject(Object obj, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : obj);
    }
}
