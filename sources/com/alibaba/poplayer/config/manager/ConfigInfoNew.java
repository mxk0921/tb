package com.alibaba.poplayer.config.manager;

import android.text.TextUtils;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.utils.Monitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import tb.rjl;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
@Monitor.TargetClass
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ConfigInfoNew {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Monitor.TargetField(name = rjl.MONITOR_PAGE_ORANGE_VERSION_NEW)
    private String mCurConfigVersion;
    @Monitor.TargetField(name = rjl.MONITOR_CONFIG_SET_NEW)
    private Set<String> mAllConfigsIdSet = new HashSet();
    private Map<String, Set<String>> mUriConfigIdMap = new ConcurrentHashMap();
    @Monitor.TargetField(name = rjl.MONITOR_CONFIG_URI_ITEM_LOADED)
    private final ConcurrentMap<String, List<BaseConfigItem>> mCacheUriConfigMap = new ConcurrentHashMap();
    @Monitor.TargetField(name = rjl.MONITOR_CONFIG_ITEM_LOADED)
    private final ConcurrentMap<String, BaseConfigItem> mCacheIdConfigMap = new ConcurrentHashMap();

    static {
        t2o.a(625999892);
    }

    public Set<String> getConfigIdsByUri(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d11daa55", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mUriConfigIdMap.get(str);
    }

    public BaseConfigItem getConfigItemById(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConfigItem) ipChange.ipc$dispatch("2f19b4", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mCacheIdConfigMap.get(str);
    }

    public List<BaseConfigItem> getConfigItemsByUri(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5eeacda9", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !this.mCacheUriConfigMap.containsKey(str)) {
            wdm.d("ConfigInfoNew.getConfigItemsByUri.NO URI.mCacheUriConfigMap=%s.uri=%s", this.mCacheUriConfigMap, str);
            return null;
        }
        List<BaseConfigItem> list = this.mCacheUriConfigMap.get(str);
        if (list != null) {
            return list;
        }
        return new ArrayList();
    }

    public String getCurConfigVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a14762d", new Object[]{this});
        }
        return this.mCurConfigVersion;
    }

    public void putConfigById(String str, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a368962", new Object[]{this, str, baseConfigItem});
        } else if (!TextUtils.isEmpty(str) && baseConfigItem != null) {
            this.mCacheIdConfigMap.put(str, baseConfigItem);
        }
    }

    public void putConfigsByUri(String str, List<BaseConfigItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1578e95", new Object[]{this, str, list});
        } else if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            this.mCacheUriConfigMap.put(str, list);
        }
    }

    public boolean resetConfigs(boolean z, String str, Map<String, Set<String>> map, Set<String> set) {
        ConcurrentHashMap concurrentHashMap;
        HashSet hashSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3943e33", new Object[]{this, new Boolean(z), str, map, set})).booleanValue();
        }
        if (!needUpdateConfigs(z, str)) {
            wdm.d("ConfigInfoNew.resetConfigs.notNeedUpdateConfigs.newConfigVersion=%s.curConfigVersion=%s", str, this.mCurConfigVersion);
            return false;
        }
        this.mCacheUriConfigMap.clear();
        this.mCacheIdConfigMap.clear();
        this.mCurConfigVersion = str;
        if (map != null) {
            concurrentHashMap = new ConcurrentHashMap(map);
        } else {
            concurrentHashMap = new ConcurrentHashMap();
        }
        this.mUriConfigIdMap = concurrentHashMap;
        if (set != null) {
            hashSet = new HashSet(set);
        } else {
            hashSet = new HashSet();
        }
        this.mAllConfigsIdSet = hashSet;
        return true;
    }

    private boolean needUpdateConfigs(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3cc4c09", new Object[]{this, new Boolean(z), str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!TextUtils.isEmpty(this.mCurConfigVersion) && !"mock".equals(str) && !"mock".equals(this.mCurConfigVersion)) {
            return z;
        }
        return true;
    }
}
