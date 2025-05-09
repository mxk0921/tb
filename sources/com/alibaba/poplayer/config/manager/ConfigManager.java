package com.alibaba.poplayer.config.manager;

import android.text.TextUtils;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.fetch.ConfigFetcher;
import com.alibaba.poplayer.config.fetch.ConfigFetcherNew;
import com.alibaba.poplayer.config.fetch.IConfigFetcher;
import com.alibaba.poplayer.config.manager.ConfigFilterRule;
import com.alibaba.poplayer.config.model.predeal.PreDealIndexContent;
import com.alibaba.poplayer.config.model.trigger.TriggerModel;
import com.alibaba.poplayer.config.model.trigger.UriModel;
import com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper;
import com.alibaba.poplayer.norm.IConfigAdapter;
import com.alibaba.poplayer.norm.INewConfigAdapter;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.a;
import com.alibaba.poplayer.trigger.b;
import com.alibaba.poplayer.trigger.page.PageTriggerService;
import com.alibaba.poplayer.utils.Monitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.eg4;
import tb.fg4;
import tb.jd0;
import tb.lto;
import tb.pf4;
import tb.qg4;
import tb.t2o;
import tb.t4f;
import tb.wdm;

/* compiled from: Taobao */
@Monitor.TargetClass
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ConfigManager implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Monitor.TargetField
    private IConfigFetcher mConfigFetcher;
    @Monitor.TargetField
    private final ConfigInfo mConfigInfo = new ConfigInfo();
    @Monitor.TargetField
    private final ConfigInfoNew mConfigInfoNew = new ConfigInfoNew();

    static {
        t2o.a(625999893);
    }

    public ConfigManager(IConfigAdapter iConfigAdapter, INewConfigAdapter iNewConfigAdapter) {
        wdm.a("ConfigManager.use.BaseConfigItem");
        createConfigFetcher(iConfigAdapter, iNewConfigAdapter);
    }

    private boolean checkTriggerFilter(Event event, BaseConfigItem baseConfigItem) {
        UriModel uriModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32bfe4d1", new Object[]{this, event, baseConfigItem})).booleanValue();
        }
        if (event.source == 4) {
            return lto.a(event.curPageUrl, baseConfigItem.paramContains);
        }
        TriggerModel triggerModel = baseConfigItem.triggerConfigs;
        if (triggerModel == null || !triggerModel.isValid()) {
            return false;
        }
        Iterator<UriModel> it = triggerModel.pages.iterator();
        while (true) {
            if (!it.hasNext()) {
                uriModel = null;
                break;
            }
            uriModel = it.next();
            if (uriModel != null && uriModel.isValid() && uriModel.uris.contains(event.uri) && lto.a(event.param, uriModel.filter)) {
                break;
            }
        }
        if (uriModel != null) {
            return true;
        }
        return false;
    }

    private void createConfigFetcher(IConfigAdapter iConfigAdapter, INewConfigAdapter iNewConfigAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b440d1da", new Object[]{this, iConfigAdapter, iNewConfigAdapter});
        } else if (useNewConfigFetcher()) {
            this.mConfigFetcher = new ConfigFetcherNew(iNewConfigAdapter, new eg4(this));
        } else {
            this.mConfigFetcher = new ConfigFetcher(iConfigAdapter, new fg4(this));
        }
    }

    private List<BaseConfigItem> filterExclusiveConfigs(List<BaseConfigItem> list, List<BaseConfigItem> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("af921453", new Object[]{this, list, list2});
        }
        if (list == null || list2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list);
        for (BaseConfigItem baseConfigItem : list) {
            Iterator<BaseConfigItem> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    BaseConfigItem next = it.next();
                    if (!TextUtils.isEmpty(next.indexID)) {
                        if (next.indexID.equals(baseConfigItem.indexID)) {
                            arrayList.remove(baseConfigItem);
                            break;
                        }
                    } else if (next.uuid.equals(baseConfigItem.uuid)) {
                        arrayList.remove(baseConfigItem);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private pf4 filterValidConfigsFromArray(Event event, ArrayList<BaseConfigItem> arrayList, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pf4) ipChange.ipc$dispatch("36fe97fa", new Object[]{this, event, arrayList, new Boolean(z)});
        }
        pf4 pf4Var = new pf4();
        wdm.d("ConfigManager.blackList check.", new Object[0]);
        Iterator<BaseConfigItem> it = arrayList.iterator();
        while (it.hasNext()) {
            BaseConfigItem next = it.next();
            a aVar = new a(event, next, PopLayer.getReference().internalGetCurrentActivity(), PageTriggerService.instance());
            ConfigFilterRule.ConfigStatus f = ConfigFilterRule.f(aVar, z);
            if (ConfigFilterRule.ConfigStatus.VALIED == f) {
                if (next.isKeepLive()) {
                    pf4Var.b.add(aVar);
                } else if (next.isPageLive()) {
                    pf4Var.c.add(aVar);
                } else {
                    pf4Var.f26058a.add(aVar);
                }
            } else if (ConfigFilterRule.ConfigStatus.VALIED_BUT_UNSTARTED == f) {
                pf4Var.e.add(next);
            } else if (!(ConfigFilterRule.ConfigStatus.INVALIED != f || aVar.k() == null || aVar.k().c0 == null)) {
                pf4Var.d.add(aVar);
            }
        }
        return pf4Var;
    }

    private pf4 findValidConfigsFromPreDeal(Event event, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pf4) ipChange.ipc$dispatch("2fa011eb", new Object[]{this, event, new Boolean(z)});
        }
        try {
            ArrayList<BaseConfigItem> arrayList = new ArrayList<>();
            Map<String, PreDealIndexContent> indexMap = event.getPreDealCustomEventParams().getIndexMap();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (indexMap != null) {
                for (String str : indexMap.keySet()) {
                    if (TextUtils.isEmpty(str)) {
                        wdm.g(wdm.CATEGORY_CONFIG_CHECK, "", "findValidConfigsFromPreDeal.noIndexId.");
                    } else {
                        BaseConfigItem syncAndGetConfigById = syncAndGetConfigById(str);
                        if (syncAndGetConfigById != null) {
                            arrayList3.add(str);
                            if (checkTriggerFilter(event, syncAndGetConfigById)) {
                                arrayList.add(syncAndGetConfigById);
                            }
                        } else {
                            arrayList2.add(str);
                        }
                    }
                }
            }
            pf4 filterValidConfigsFromArray = filterValidConfigsFromArray(event, arrayList, z);
            ((ArrayList) filterValidConfigsFromArray.f).addAll(arrayList2);
            ((ArrayList) filterValidConfigsFromArray.g).addAll(arrayList3);
            return filterValidConfigsFromArray;
        } catch (Throwable th) {
            wdm.h("PageConfigMgr.findValidConfigsFromPreDeal.error.", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createConfigFetcher$48(ConfigFetcherNew.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("630e9a10", new Object[]{this, cVar});
        } else if (cVar != null) {
            try {
                wdm.d("ConfigFetcherNew.onFetchFinish", new Object[0]);
                t4f.a().e();
                boolean resetConfigs = this.mConfigInfoNew.resetConfigs(cVar.f2519a, cVar.b, cVar.c, cVar.d);
                wdm.g(wdm.CATEGORY_CONFIG_UPDATE, "", "ConfigManager.ConfigFetcherNew.onFetchFinish.configVersion=" + cVar.b + ".updated=" + resetConfigs + ".configIds=" + cVar.d);
                if (resetConfigs) {
                    PopMiscInfoFileHelper.g().b(cVar.d);
                    com.alibaba.poplayer.info.frequency.a.t().v(cVar.d, false);
                }
                t4f.a().j();
                if (resetConfigs && !jd0.c().a().removeConfigUpdateNotify()) {
                    b.f(cVar.b, new ArrayList(cVar.d));
                }
            } catch (Throwable th) {
                wdm.h("ConfigManager.ConfigFetcherNew.startFetch.error", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createConfigFetcher$49(ConfigFetcher.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c944d9", new Object[]{this, aVar});
            return;
        }
        try {
            this.mConfigInfo.setIsDirty(true);
            this.mConfigInfo.setCurConfigVersion(aVar.c);
            this.mConfigInfo.setCurrentConfigSet(aVar.b);
            this.mConfigInfo.setCurrentConfigItems(aVar.f2518a);
            wdm.g(wdm.CATEGORY_CONFIG_UPDATE, "", "BaseConfigManager.ConfigFetcher.onCachedConfigChanged.configVersion=" + aVar.c + ".configIndexIds=" + aVar.b);
            PageTriggerService.instance().updateWhenConfigChanged();
            t4f.a().j();
            if (!jd0.c().a().removeConfigUpdateNotify()) {
                b.f(aVar.c, aVar.b);
            }
        } catch (Throwable th) {
            wdm.h("ConfigManager.ConfigFetcher.startFetch.error", th);
        }
    }

    private boolean onInterceptEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7169c3c", new Object[]{this, event})).booleanValue();
        }
        int i = event.source;
        if (i == 3 || i == 5) {
            return true;
        }
        return false;
    }

    private List<BaseConfigItem> syncAndGetConfigsByUri(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a201ae18", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!jd0.c().a().isConfigFetchOptEnable()) {
            return this.mConfigInfo.getAllCurrentConfigMap().get(str);
        }
        String curConfigVersion = this.mConfigInfoNew.getCurConfigVersion();
        List<BaseConfigItem> configItemsByUri = this.mConfigInfoNew.getConfigItemsByUri(str);
        ArrayList arrayList = configItemsByUri;
        if (configItemsByUri == null) {
            ArrayList arrayList2 = new ArrayList();
            Set<String> configIdsByUri = this.mConfigInfoNew.getConfigIdsByUri(str);
            if (configIdsByUri != null) {
                wdm.g(wdm.CATEGORY_CONFIG_CHECK, "", "syncAndGetConfigsByUri.newConfig.uri=" + str + ".configs=" + configIdsByUri);
                for (String str2 : configIdsByUri) {
                    BaseConfigItem configItemById = this.mConfigFetcher.getConfigItemById(str2, curConfigVersion);
                    if (configItemById == null) {
                        wdm.g(wdm.CATEGORY_CONFIG_CHECK, str2, "syncAndGetConfigsByUri.newConfig.getConfigItemById=null");
                    } else {
                        this.mConfigInfoNew.putConfigById(str2, configItemById);
                        arrayList2.add(configItemById);
                    }
                }
            }
            this.mConfigInfoNew.putConfigsByUri(str, arrayList2);
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public Map<String, String> filterFatigue(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b910101c", new Object[]{this, list});
        }
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty() && jd0.c().a() != null && jd0.c().a().isFatigueFilterEnable()) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    BaseConfigItem syncAndGetConfigById = syncAndGetConfigById(str);
                    if (syncAndGetConfigById == null) {
                        hashMap.put(str, "");
                    } else {
                        hashMap.put(str, ConfigFilterRule.d(syncAndGetConfigById));
                    }
                }
            }
        }
        return hashMap;
    }

    public pf4 findConfigs(Event event, List<BaseConfigItem> list, boolean z) {
        BaseConfigItem baseConfigItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pf4) ipChange.ipc$dispatch("bcdd91bd", new Object[]{this, event, list, new Boolean(z)});
        }
        pf4 pf4Var = new pf4();
        if (onInterceptEvent(event)) {
            int i = event.source;
            if (i == 3) {
                baseConfigItem = qg4.c(event, this.mConfigInfo.getDirectlyBlackList());
            } else if (i == 5) {
                baseConfigItem = qg4.a(event.originConfigItem);
            } else {
                baseConfigItem = null;
            }
            if (baseConfigItem == null) {
                return pf4Var;
            }
            a aVar = new a(event, baseConfigItem, PopLayer.getReference().internalGetCurrentActivity(), PageTriggerService.instance());
            ConfigFilterRule.ConfigStatus f = ConfigFilterRule.f(aVar, z);
            if (ConfigFilterRule.ConfigStatus.VALIED == f) {
                if (baseConfigItem.isKeepLive()) {
                    pf4Var.b.add(aVar);
                    return pf4Var;
                } else if (baseConfigItem.isPageLive()) {
                    pf4Var.c.add(aVar);
                    return pf4Var;
                } else {
                    pf4Var.f26058a.add(aVar);
                    return pf4Var;
                }
            } else if (ConfigFilterRule.ConfigStatus.INVALIED != f || aVar.k() == null || aVar.k().c0 == null) {
                return pf4Var;
            } else {
                pf4Var.d.add(aVar);
                return pf4Var;
            }
        } else if (event.source == 4) {
            return findValidConfigsFromPreDeal(event, z);
        } else {
            return findValidConfigs(event, list, z);
        }
    }

    public pf4 findValidConfigs(Event event, List<BaseConfigItem> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pf4) ipChange.ipc$dispatch("30bfd473", new Object[]{this, event, list, new Boolean(z)});
        }
        try {
            ArrayList<BaseConfigItem> arrayList = new ArrayList<>();
            List<BaseConfigItem> syncAndGetConfigsByUri = syncAndGetConfigsByUri(event.uri);
            if (syncAndGetConfigsByUri != null) {
                for (BaseConfigItem baseConfigItem : filterExclusiveConfigs(syncAndGetConfigsByUri, list)) {
                    if (baseConfigItem != null && checkTriggerFilter(event, baseConfigItem)) {
                        arrayList.add(baseConfigItem);
                    }
                }
            }
            return filterValidConfigsFromArray(event, arrayList, z);
        } catch (Throwable th) {
            wdm.h("PageConfigMgr.findValidConfigs.error.", th);
            return null;
        }
    }

    public List<String> getObserverCurrentConfigSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("79839b4d", new Object[]{this});
        }
        return this.mConfigInfo.getCurrentConfigSet();
    }

    public boolean isUpdatingConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27af6d7d", new Object[]{this})).booleanValue();
        }
        return this.mConfigFetcher.isUpdatingConfig();
    }

    public void setDirectlyBlackList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eeb395d", new Object[]{this, list});
        } else {
            this.mConfigInfo.setDirectlyBlackList(list);
        }
    }

    public void startFetchConfig(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f30293", new Object[]{this, new Boolean(z)});
        } else {
            this.mConfigFetcher.startFetch(z);
        }
    }

    public void startLoadConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("232fb1ba", new Object[]{this, str});
        } else {
            this.mConfigFetcher.startLoadConfigs(true, str);
        }
    }

    public boolean useNewConfigFetcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ad6e7b7", new Object[]{this})).booleanValue();
        }
        return jd0.c().a().isConfigFetchOptEnable();
    }

    private BaseConfigItem syncAndGetConfigById(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConfigItem) ipChange.ipc$dispatch("d06e6be5", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!jd0.c().a().isConfigFetchOptEnable()) {
            return this.mConfigInfo.getAllCurrentConfigMapByIndexId().get(str);
        }
        BaseConfigItem configItemById = this.mConfigInfoNew.getConfigItemById(str);
        if (configItemById != null) {
            return configItemById;
        }
        BaseConfigItem configItemById2 = this.mConfigFetcher.getConfigItemById(str, this.mConfigInfoNew.getCurConfigVersion());
        StringBuilder sb = new StringBuilder("syncAndGetConfigById.newConfig.configFind=");
        if (configItemById2 == null) {
            z = false;
        }
        sb.append(z);
        wdm.g(wdm.CATEGORY_CONFIG_CHECK, str, sb.toString());
        if (configItemById2 == null) {
            return null;
        }
        this.mConfigInfoNew.putConfigById(str, configItemById2);
        return configItemById2;
    }
}
