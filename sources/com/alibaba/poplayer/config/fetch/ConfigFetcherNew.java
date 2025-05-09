package com.alibaba.poplayer.config.fetch;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.config.fetch.ConfigFetcherNew;
import com.alibaba.poplayer.norm.INewConfigAdapter;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;
import tb.eg4;
import tb.hst;
import tb.jd0;
import tb.opb;
import tb.qg4;
import tb.t2o;
import tb.t4f;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ConfigFetcherNew implements IConfigFetcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final INewConfigAdapter mConfigAdapter;
    private final d mConfigFetchListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends TypeReference<Map<String, Set<String>>> {
        public a(ConfigFetcherNew configFetcherNew) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends TypeReference<Map<String, Set<String>>> {
        public b(ConfigFetcherNew configFetcherNew) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f2519a;
        public final String b;
        public final Map<String, Set<String>> c;
        public final Set<String> d;

        static {
            t2o.a(625999885);
        }

        public c(boolean z, String str, Map<String, Set<String>> map, Set<String> set) {
            this.f2519a = z;
            this.b = str;
            this.c = map;
            this.d = set;
        }

        public boolean a() {
            Map<String, Set<String>> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
            }
            if (TextUtils.isEmpty(this.b) || (map = this.c) == null || map.isEmpty()) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface d {
    }

    static {
        t2o.a(625999882);
        t2o.a(625999888);
    }

    public ConfigFetcherNew(INewConfigAdapter iNewConfigAdapter, d dVar) {
        this.mConfigAdapter = iNewConfigAdapter;
        iNewConfigAdapter.init();
        this.mConfigFetchListener = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$null$45(boolean z, String str, String str2, Set set) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae247ebf", new Object[]{this, new Boolean(z), str, str2, set});
            return;
        }
        wdm.g(wdm.CATEGORY_CONFIG_UPDATE, "", "ConfigFetcherNew.startFetch.doLazyFetch.fetchDone.updated=" + z + ".configVersion=" + str);
        try {
            map = (Map) JSON.parseObject(str2, new a(this), new Feature[0]);
        } catch (Throwable th) {
            wdm.h("ConfigFetcherNew.parseUriMap.error", th);
            map = null;
        }
        ((eg4) this.mConfigFetchListener).a(new c(z, str, map, set));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$null$46(t4f t4fVar, boolean z, String str, String str2, Set set) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0189901", new Object[]{this, t4fVar, new Boolean(z), str, str2, set});
            return;
        }
        wdm.g(wdm.CATEGORY_CONFIG_UPDATE, "", "ConfigFetcherNew.startFetch.doFetch.fetchDone.updated=" + z + ".configVersion=" + str);
        t4fVar.g(2);
        t4fVar.h(3);
        t4fVar.g(3);
        try {
            map = (Map) JSON.parseObject(str2, new b(this), new Feature[0]);
        } catch (Throwable th) {
            wdm.h("ConfigFetcherNew.parseUriMap.error", th);
            map = null;
        }
        ((eg4) this.mConfigFetchListener).a(new c(z, str, map, set));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startFetch$47(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ed995b", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            wdm.g(wdm.CATEGORY_CONFIG_UPDATE, "", "ConfigFetcherNew.startFetch.enter.forceFetch=" + z);
            final t4f a2 = t4f.a();
            a2.h(2);
            c cVar = new c(true, this.mConfigAdapter.getCurConfigVersion(), this.mConfigAdapter.getUriConfigsMap(), this.mConfigAdapter.getConfigsIdSet());
            if (z || !jd0.c().a().isConfigFetchLocalEnable() || !cVar.a()) {
                wdm.g(wdm.CATEGORY_CONFIG_UPDATE, "", "ConfigFetcherNew.startFetch.doFetch");
                this.mConfigAdapter.startFetchConfig(new opb() { // from class: tb.wf4
                    @Override // tb.opb
                    public final void a(boolean z2, String str, String str2, Set set) {
                        ConfigFetcherNew.this.lambda$null$46(a2, z2, str, str2, set);
                    }
                });
            } else {
                a2.g(2);
                a2.h(3);
                a2.g(3);
                wdm.g(wdm.CATEGORY_CONFIG_UPDATE, "", "ConfigFetcherNew.startFetch.doLazyFetch");
                ((eg4) this.mConfigFetchListener).a(cVar);
                this.mConfigAdapter.startFetchConfig(new opb() { // from class: tb.vf4
                    @Override // tb.opb
                    public final void a(boolean z2, String str, String str2, Set set) {
                        ConfigFetcherNew.this.lambda$null$45(z2, str, str2, set);
                    }
                });
            }
        } catch (Throwable th) {
            wdm.h("ConfigFetcherNew.startFetch.error", th);
            ((eg4) this.mConfigFetchListener).a(null);
        }
    }

    @Override // com.alibaba.poplayer.config.fetch.IConfigFetcher
    public BaseConfigItem getConfigItemById(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConfigItem) ipChange.ipc$dispatch("97376cfe", new Object[]{this, str, str2});
        }
        try {
            String configItemById = this.mConfigAdapter.getConfigItemById(str);
            if (TextUtils.isEmpty(configItemById)) {
                return null;
            }
            return qg4.b(configItemById, str, str2);
        } catch (Throwable th) {
            wdm.h("ConfigFetcherNew.getConfigItemById.error", th);
            return null;
        }
    }

    @Override // com.alibaba.poplayer.config.fetch.IConfigFetcher
    public boolean isUpdatingConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27af6d7d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.poplayer.config.fetch.IConfigFetcher
    public void startFetch(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80abeab5", new Object[]{this, new Boolean(z)});
        } else {
            hst.b(new Runnable() { // from class: tb.xf4
                @Override // java.lang.Runnable
                public final void run() {
                    ConfigFetcherNew.this.lambda$startFetch$47(z);
                }
            });
        }
    }

    @Override // com.alibaba.poplayer.config.fetch.IConfigFetcher
    public void startLoadConfigs(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8bcc5ae", new Object[]{this, new Boolean(z), str});
        }
    }
}
