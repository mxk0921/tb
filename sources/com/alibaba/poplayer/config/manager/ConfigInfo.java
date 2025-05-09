package com.alibaba.poplayer.config.manager;

import android.text.TextUtils;
import com.alibaba.poplayer.config.model.trigger.TriggerModel;
import com.alibaba.poplayer.config.model.trigger.UriModel;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.utils.Monitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.rjl;
import tb.t2o;

/* compiled from: Taobao */
@Monitor.TargetClass
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ConfigInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Monitor.TargetField(name = rjl.MONITOR_PAGE_ORANGE_VERSION)
    private volatile String mCurConfigVersion;
    private final ConcurrentMap<String, List<BaseConfigItem>> mAllCurConfigMap = new ConcurrentHashMap();
    private final ConcurrentMap<String, BaseConfigItem> mAllCurConfigMapByIndexId = new ConcurrentHashMap();
    @Monitor.TargetField(name = rjl.MONITOR_CONFIG_SET)
    private List<String> mCurrentConfigSet = new CopyOnWriteArrayList();
    @Monitor.TargetField(name = rjl.MONITOR_CONFIG_ITEMS)
    private List<BaseConfigItem> mCurrentConfigItems = new CopyOnWriteArrayList();
    private List<String> mDirectlyBlackList = new CopyOnWriteArrayList();
    private boolean mIsDirty = false;

    static {
        t2o.a(625999891);
    }

    private void putConfigsInfoMap(List<BaseConfigItem> list) {
        TriggerModel triggerModel;
        List<UriModel> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b96184", new Object[]{this, list});
            return;
        }
        ConcurrentMap<String, List<BaseConfigItem>> concurrentMap = this.mAllCurConfigMap;
        concurrentMap.clear();
        for (BaseConfigItem baseConfigItem : list) {
            if (!(baseConfigItem == null || (triggerModel = baseConfigItem.triggerConfigs) == null || (list2 = triggerModel.pages) == null || list2.size() <= 0)) {
                for (UriModel uriModel : triggerModel.pages) {
                    for (String str : uriModel.uris) {
                        if (!TextUtils.isEmpty(str)) {
                            List<BaseConfigItem> list3 = concurrentMap.get(str);
                            if (list3 == null) {
                                list3 = new ArrayList<>();
                            }
                            list3.add(baseConfigItem);
                            concurrentMap.put(str, list3);
                        }
                    }
                }
            }
        }
    }

    private void putConfigsInfoMapWithIndexId(List<BaseConfigItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f51c633", new Object[]{this, list});
            return;
        }
        ConcurrentMap<String, BaseConfigItem> concurrentMap = this.mAllCurConfigMapByIndexId;
        concurrentMap.clear();
        for (BaseConfigItem baseConfigItem : list) {
            if (baseConfigItem != null && !TextUtils.isEmpty(baseConfigItem.indexID)) {
                concurrentMap.put(baseConfigItem.indexID, baseConfigItem);
            }
        }
    }

    private synchronized void syncConfigs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad2b7dd", new Object[]{this});
            return;
        }
        if (this.mIsDirty) {
            putConfigsInfoMap(this.mCurrentConfigItems);
            putConfigsInfoMapWithIndexId(this.mCurrentConfigItems);
            this.mIsDirty = false;
        }
    }

    public Map<String, List<BaseConfigItem>> getAllCurrentConfigMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("472cc148", new Object[]{this});
        }
        syncConfigs();
        return this.mAllCurConfigMap;
    }

    public Map<String, BaseConfigItem> getAllCurrentConfigMapByIndexId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cfe4b8c6", new Object[]{this});
        }
        syncConfigs();
        return this.mAllCurConfigMapByIndexId;
    }

    public List<String> getCurrentConfigSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("19637003", new Object[]{this});
        }
        return this.mCurrentConfigSet;
    }

    public List<String> getDirectlyBlackList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e940514f", new Object[]{this});
        }
        return this.mDirectlyBlackList;
    }

    public void setCurConfigVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4bcdde9", new Object[]{this, str});
        } else {
            this.mCurConfigVersion = str;
        }
    }

    public void setCurrentConfigItems(List<BaseConfigItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b25f05f", new Object[]{this, list});
        } else {
            this.mCurrentConfigItems = list;
        }
    }

    public void setCurrentConfigSet(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d03dc1", new Object[]{this, list});
        } else {
            this.mCurrentConfigSet = list;
        }
    }

    public void setDirectlyBlackList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eeb395d", new Object[]{this, list});
        } else {
            this.mDirectlyBlackList = list;
        }
    }

    public void setIsDirty(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611738e7", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsDirty = z;
        }
    }
}
