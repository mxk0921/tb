package com.alibaba.poplayer.config.fetch;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.poplayer.config.fetch.ConfigFetcher;
import com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper;
import com.alibaba.poplayer.norm.IConfigAdapter;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.utils.Monitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.d0j;
import tb.fg4;
import tb.hst;
import tb.opb;
import tb.qg4;
import tb.t2o;
import tb.t4f;
import tb.wdm;

/* compiled from: Taobao */
@Monitor.TargetClass
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ConfigFetcher implements IConfigFetcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final IConfigAdapter mConfigAdapter;
    private final b mConfigManagerAdapter;
    private long mParseStartTime;
    private boolean isInitialized = false;
    private volatile boolean mIsUpdating = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
    }

    static {
        t2o.a(625999879);
        t2o.a(625999888);
    }

    public ConfigFetcher(IConfigAdapter iConfigAdapter, b bVar) {
        this.mConfigAdapter = iConfigAdapter;
        iConfigAdapter.init(new opb() { // from class: tb.uf4
            @Override // tb.opb
            public final void a(boolean z, String str, String str2, Set set) {
                ConfigFetcher.this.lambda$new$43(z, str, str2, set);
            }
        });
        this.mConfigManagerAdapter = bVar;
    }

    private static boolean isConfigStringEmpty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1070f9a5", new Object[]{str})).booleanValue();
        }
        if (str == null || "".equals(str) || "\"\"".equals(str)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$43(boolean z, String str, String str2, Set set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bba65e", new Object[]{this, new Boolean(z), str, str2, set});
        } else {
            startLoadConfigs(z, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startLoadConfigs$44(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f724cf", new Object[]{this, str});
            return;
        }
        try {
            wdm.d("ConfigFetcher.startLoadConfigs.configVersion=%s", str);
            t4f a2 = t4f.a();
            a2.g(2);
            a2.h(3);
            this.mParseStartTime = SystemClock.elapsedRealtime();
            this.mIsUpdating = true;
            onReadyToUpdateConfig(updateCacheConfig(str));
        } catch (Throwable th) {
            wdm.h("ConfigFetcher.updateCacheConfigAsync.runInGlobalThread.error", th);
        }
    }

    private void onReadyToUpdateConfig(a aVar) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a8301ac", new Object[]{this, aVar});
            return;
        }
        try {
            if (aVar == null) {
                this.mIsUpdating = false;
                return;
            }
            if (this.mParseStartTime > 0) {
                j = SystemClock.elapsedRealtime() - this.mParseStartTime;
            } else {
                j = 0;
            }
            if (j > 0) {
                d0j.g(j);
            }
            b bVar = this.mConfigManagerAdapter;
            if (bVar != null) {
                ((fg4) bVar).a(aVar);
            }
            this.mIsUpdating = false;
        } catch (Throwable th) {
            wdm.h("ConfigFetcher.onReadyToUpdateConfig.error", th);
            this.mIsUpdating = false;
        }
    }

    private a updateCacheConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("94d07059", new Object[]{this, str});
        }
        wdm.g(wdm.CATEGORY_CONFIG_UPDATE, "", "ConfigFetcher.updateCacheConfig.run.start.configVersion=" + str);
        ArrayList arrayList = new ArrayList();
        String configsIdSetString = this.mConfigAdapter.getConfigsIdSetString();
        if (isConfigStringEmpty(configsIdSetString)) {
            wdm.g(wdm.CATEGORY_CONFIG_UPDATE, "", "ConfigFetcher.configSet.empty.return.");
            return new a();
        }
        wdm.g(wdm.CATEGORY_CONFIG_UPDATE, "", "ConfigFetcher.run.configSet=" + configsIdSetString + ".configVersion=" + str);
        String[] split = configsIdSetString.split(",");
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : split) {
            String trim = str2.trim();
            try {
                BaseConfigItem b2 = qg4.b(this.mConfigAdapter.getConfigItemById(trim), trim, str);
                if (b2 != null) {
                    arrayList.add(b2);
                    arrayList2.add(trim);
                }
            } catch (Throwable th) {
                wdm.h("ConfigFetcher.parse.error", th);
            }
        }
        t4f.a().e();
        PopMiscInfoFileHelper.g().h(arrayList);
        com.alibaba.poplayer.info.frequency.a.t().u(arrayList, true);
        return new a(arrayList, arrayList2, str);
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
            wdm.h("ConfigFetcher.getConfigItemById.error", th);
            return null;
        }
    }

    @Override // com.alibaba.poplayer.config.fetch.IConfigFetcher
    public boolean isUpdatingConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27af6d7d", new Object[]{this})).booleanValue();
        }
        return this.mIsUpdating;
    }

    @Override // com.alibaba.poplayer.config.fetch.IConfigFetcher
    public void startFetch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80abeab5", new Object[]{this, new Boolean(z)});
        } else if (!this.isInitialized) {
            this.isInitialized = true;
            t4f.a().h(2);
            this.mConfigAdapter.startFetchConfig();
        }
    }

    @Override // com.alibaba.poplayer.config.fetch.IConfigFetcher
    public void startLoadConfigs(boolean z, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8bcc5ae", new Object[]{this, new Boolean(z), str});
        } else {
            hst.b(new Runnable() { // from class: tb.tf4
                @Override // java.lang.Runnable
                public final void run() {
                    ConfigFetcher.this.lambda$startLoadConfigs$44(str);
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<BaseConfigItem> f2518a;
        public final List<String> b;
        public final String c;

        static {
            t2o.a(625999880);
        }

        public a(List<BaseConfigItem> list, List<String> list2, String str) {
            this.f2518a = list;
            this.b = list2;
            this.c = str;
        }

        public a() {
            this.f2518a = new CopyOnWriteArrayList();
            this.b = new CopyOnWriteArrayList();
            this.c = "";
        }
    }
}
