package com.taobao.industry.tbiunicontainer.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"com/taobao/industry/tbiunicontainer/core/BizRouterMap$BIZ_ROUTER_MAP$1", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "tbi_uniContainer_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class BizRouterMap$BIZ_ROUTER_MAP$1 extends HashMap<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BizRouterMap$BIZ_ROUTER_MAP$1() {
        put("delivery", "com.taobao.android.detail.industry.hourlydelivery.DeliverContext");
    }

    public static /* synthetic */ Object ipc$super(BizRouterMap$BIZ_ROUTER_MAP$1 bizRouterMap$BIZ_ROUTER_MAP$1, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2084926247:
                return super.get(objArr[0]);
            case -1959305173:
                return super.getOrDefault(objArr[0], objArr[1]);
            case -1952759047:
                return super.keySet();
            case -1515997081:
                return new Boolean(super.containsKey(objArr[0]));
            case -1306308025:
                return new Boolean(super.remove(objArr[0], objArr[1]));
            case -1280511290:
                return super.entrySet();
            case -453046855:
                return new Boolean(super.containsValue(objArr[0]));
            case 648458174:
                return super.values();
            case 845773819:
                return new Integer(super.size());
            case 1518226411:
                return super.remove(objArr[0]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/industry/tbiunicontainer/core/BizRouterMap$BIZ_ROUTER_MAP$1");
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof String) {
            return containsValue((String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, String>> entrySet() {
        return getEntries();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
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

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return obj instanceof String ? getOrDefault((String) obj, (String) obj2) : obj2;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<String> values() {
        return getValues();
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(String str) {
        return super.containsValue((Object) str);
    }

    public /* bridge */ String get(String str) {
        return (String) super.get((Object) str);
    }

    public /* bridge */ String getOrDefault(String str, String str2) {
        return (String) super.getOrDefault((Object) str, str2);
    }

    public /* bridge */ String remove(String str) {
        return (String) super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return false;
        }
        return remove((String) obj, (String) obj2);
    }

    public /* bridge */ boolean remove(String str, String str2) {
        return super.remove((Object) str, (Object) str2);
    }
}
