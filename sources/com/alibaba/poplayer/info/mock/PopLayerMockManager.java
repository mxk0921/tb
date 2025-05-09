package com.alibaba.poplayer.info.mock;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.fetch.ConfigFetcher;
import com.alibaba.poplayer.config.fetch.ConfigFetcherNew;
import com.alibaba.poplayer.config.fetch.IConfigFetcher;
import com.alibaba.poplayer.config.manager.ConfigManager;
import com.alibaba.poplayer.info.mock.PopLayerMockManager;
import com.alibaba.poplayer.norm.IConfigAdapter;
import com.alibaba.poplayer.norm.INewConfigAdapter;
import com.alibaba.poplayer.trigger.page.PageTriggerService;
import com.alibaba.poplayer.utils.Monitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.hst;
import tb.ly8;
import tb.my8;
import tb.nim;
import tb.rjl;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
@Monitor.TargetClass
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PopLayerMockManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile String mMockConfig;
    private volatile boolean mIsMocking = false;
    @Monitor.TargetField(name = rjl.MONITOR_TIME_TRAVEL_SEC)
    private volatile long mTimeTravelSec = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final PopLayerMockManager f2526a = new PopLayerMockManager();

        static {
            t2o.a(625999941);
        }

        public static /* synthetic */ PopLayerMockManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PopLayerMockManager) ipChange.ipc$dispatch("32eb325d", new Object[0]);
            }
            return f2526a;
        }
    }

    static {
        t2o.a(625999940);
    }

    private void doMock(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("194d1186", new Object[]{this, str});
            return;
        }
        try {
            PageTriggerService.instance().clear();
            ConfigManager configMgr = PopLayer.getReference().getConfigMgr();
            if (configMgr.useNewConfigFetcher()) {
                configMgr.startFetchConfig(true);
            } else {
                configMgr.startLoadConfigs("");
            }
            this.mMockConfig = str;
            this.mIsMocking = true;
            wdm.d("PopLayerMockManager.startMock.success", new Object[0]);
        } catch (Throwable th) {
            wdm.h("PopLayerMockManager.doMock.error", th);
        }
    }

    private void hookConfigAdapter(ConfigFetcher configFetcher, IConfigAdapter iConfigAdapter) throws IllegalAccessException {
        Field field;
        Field[] declaredFields = ConfigFetcher.class.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            field.setAccessible(true);
            if (field.get(configFetcher) instanceof IConfigAdapter) {
                break;
            }
            i++;
        }
        if (field != null) {
            field.set(configFetcher, iConfigAdapter);
        }
    }

    private void hookConfigAdapterNew(ConfigFetcherNew configFetcherNew, INewConfigAdapter iNewConfigAdapter) throws IllegalAccessException {
        Field field;
        Field[] declaredFields = ConfigFetcherNew.class.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            field.setAccessible(true);
            if (field.get(configFetcherNew) instanceof INewConfigAdapter) {
                break;
            }
            i++;
        }
        if (field != null) {
            field.set(configFetcherNew, iNewConfigAdapter);
        }
    }

    private IConfigAdapter hookGetConfigAdapter(ConfigFetcher configFetcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConfigAdapter) ipChange.ipc$dispatch("a8e13f8d", new Object[]{this, configFetcher});
        }
        return (IConfigAdapter) hookGetField(configFetcher, "mConfigAdapter");
    }

    private IConfigFetcher hookGetConfigFetcher(ConfigManager configManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConfigFetcher) ipChange.ipc$dispatch("6d4e3b37", new Object[]{this, configManager});
        }
        return (IConfigFetcher) hookGetField(configManager, "mConfigFetcher");
    }

    private Object hookGetField(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    private INewConfigAdapter hookGetNewConfigAdapter(ConfigFetcherNew configFetcherNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INewConfigAdapter) ipChange.ipc$dispatch("6b822e87", new Object[]{this, configFetcherNew});
        }
        return (INewConfigAdapter) hookGetField(configFetcherNew, "mConfigAdapter");
    }

    public static PopLayerMockManager instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerMockManager) ipChange.ipc$dispatch("a8e76318", new Object[0]);
        }
        return a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMock$51(boolean z, String str, boolean z2, boolean z3, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33f3d14", new Object[]{this, new Boolean(z), str, new Boolean(z2), new Boolean(z3), str2, new Long(j)});
            return;
        }
        try {
            if (z) {
                startMock(str, z2, z3, str2);
                startMockTimeTravelSec(j, z2);
            } else {
                stopMock();
                stopMockTimeTravelSec();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerMockManager.setMock.error", th);
        }
    }

    private void singleStartMock(String str) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d960535", new Object[]{this, str});
            return;
        }
        try {
            IConfigFetcher hookGetConfigFetcher = hookGetConfigFetcher(PopLayer.getReference().getConfigMgr());
            StringBuilder sb = new StringBuilder("PopLayerMockManager.singleStartMock.iConfigFetcher=");
            if (hookGetConfigFetcher != null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            wdm.a(sb.toString());
            if (hookGetConfigFetcher instanceof ConfigFetcher) {
                IConfigAdapter hookGetConfigAdapter = hookGetConfigAdapter((ConfigFetcher) hookGetConfigFetcher);
                StringBuilder sb2 = new StringBuilder("PopLayerMockManager.singleStartMock.iConfigAdapter=");
                if (hookGetConfigAdapter == null) {
                    z2 = false;
                }
                sb2.append(z2);
                wdm.a(sb2.toString());
                if (hookGetConfigAdapter instanceof ly8) {
                    ((ly8) hookGetConfigAdapter).b = JSON.parseObject(str);
                } else {
                    hookConfigAdapter((ConfigFetcher) hookGetConfigFetcher, new ly8(hookGetConfigAdapter, JSON.parseObject(str)));
                }
            } else if (hookGetConfigFetcher instanceof ConfigFetcherNew) {
                INewConfigAdapter hookGetNewConfigAdapter = hookGetNewConfigAdapter((ConfigFetcherNew) hookGetConfigFetcher);
                StringBuilder sb3 = new StringBuilder("PopLayerMockManager.singleStartMock.iNewConfigAdapter=");
                if (hookGetNewConfigAdapter == null) {
                    z2 = false;
                }
                sb3.append(z2);
                wdm.a(sb3.toString());
                if (hookGetNewConfigAdapter instanceof my8) {
                    ((my8) hookGetNewConfigAdapter).c(JSON.parseObject(str));
                } else {
                    hookConfigAdapterNew((ConfigFetcherNew) hookGetConfigFetcher, new my8(hookGetNewConfigAdapter, JSON.parseObject(str)));
                }
            }
        } catch (Throwable th) {
            wdm.h("PopLayerMockManager.singleStartMock.error", th);
        }
    }

    private boolean singleStopMock() throws IllegalAccessException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77e5df9f", new Object[]{this})).booleanValue();
        }
        IConfigFetcher hookGetConfigFetcher = hookGetConfigFetcher(PopLayer.getReference().getConfigMgr());
        if (hookGetConfigFetcher instanceof ConfigFetcher) {
            ConfigFetcher configFetcher = (ConfigFetcher) hookGetConfigFetcher;
            IConfigAdapter hookGetConfigAdapter = hookGetConfigAdapter(configFetcher);
            if (hookGetConfigAdapter instanceof ly8) {
                hookConfigAdapter(configFetcher, ((ly8) hookGetConfigAdapter).f23639a);
                return true;
            }
        } else if (hookGetConfigFetcher instanceof ConfigFetcherNew) {
            ConfigFetcherNew configFetcherNew = (ConfigFetcherNew) hookGetConfigFetcher;
            INewConfigAdapter hookGetNewConfigAdapter = hookGetNewConfigAdapter(configFetcherNew);
            if (hookGetNewConfigAdapter instanceof my8) {
                hookConfigAdapterNew(configFetcherNew, ((my8) hookGetNewConfigAdapter).f24387a);
                return true;
            }
        }
        return false;
    }

    private synchronized void startMock(String str, boolean z, boolean z2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60d8e67", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2});
            return;
        }
        if (z) {
            setPersistentMockData(str);
        } else {
            setPersistentMockData("");
        }
        clearMockCheckInfo();
        if (z2) {
            setMockParamData(str2);
        }
        singleStartMock(str);
        doMock(str);
    }

    private synchronized void startMockTimeTravelSec(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce7a1b5", new Object[]{this, new Long(j), new Boolean(z)});
            return;
        }
        setTimeTravelSec(j, z);
        wdm.d("PopLayerMockManager.startMockTimeTravelSec.success", new Object[0]);
    }

    private synchronized void stopMock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ae3333", new Object[]{this});
            return;
        }
        setPersistentMockData("");
        setMockParamData("");
        if (singleStopMock()) {
            ConfigManager configMgr = PopLayer.getReference().getConfigMgr();
            if (configMgr.useNewConfigFetcher()) {
                configMgr.startFetchConfig(true);
            } else {
                configMgr.startLoadConfigs("");
            }
            wdm.d("PopLayerMockManager.stopMock.success Page.", new Object[0]);
        }
        this.mMockConfig = null;
        this.mIsMocking = false;
        wdm.d("PopLayerMockManager.stopMock.success", new Object[0]);
    }

    private synchronized void stopMockTimeTravelSec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be14d2c5", new Object[]{this});
        } else {
            setTimeTravelSec(0L, true);
        }
    }

    public void addMockCheckedIndexID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("108d0e42", new Object[]{this, str});
        } else {
            nim.a(str);
        }
    }

    public void clearMockCheckIndexIDs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d819e9e", new Object[]{this});
        } else {
            nim.b();
        }
    }

    public void clearMockCheckInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32973726", new Object[]{this});
            return;
        }
        nim.b();
        nim.p("");
    }

    public Map<String, ?> getAllData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9c4c1bf1", new Object[]{this});
        }
        return nim.c();
    }

    public Set<String> getMockCheckedIndexIDs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d451ea43", new Object[]{this});
        }
        return nim.i();
    }

    public String getMockConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("722baed7", new Object[]{this});
        }
        return this.mMockConfig;
    }

    public String getMockParamData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e274ba2", new Object[]{this});
        }
        return nim.j();
    }

    public String getPersistentMockData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c711398", new Object[]{this});
        }
        return nim.f();
    }

    public long getPersistentTimeTravelSec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7814ef8", new Object[]{this})).longValue();
        }
        return nim.k();
    }

    public long getTimeTravelSec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a30f914f", new Object[]{this})).longValue();
        }
        return this.mTimeTravelSec;
    }

    public boolean isConstraintMockingDone() {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f667f9e", new Object[]{this})).booleanValue();
        }
        if (!isConstraintMocking()) {
            return true;
        }
        Set<String> mockCheckedIndexIDs = getMockCheckedIndexIDs();
        if (mockCheckedIndexIDs != null) {
            arrayList = new ArrayList(mockCheckedIndexIDs);
        } else {
            arrayList = new ArrayList();
        }
        List<String> observerCurrentConfigSet = PopLayer.getReference().getConfigMgr().getObserverCurrentConfigSet();
        if (observerCurrentConfigSet == null || observerCurrentConfigSet.isEmpty() || (!arrayList.isEmpty() && arrayList.equals(observerCurrentConfigSet))) {
            return true;
        }
        return false;
    }

    public boolean isMocking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32a5cf19", new Object[]{this})).booleanValue();
        }
        return this.mIsMocking;
    }

    public boolean isPersistentMocking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("337f1882", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(getPersistentMockData());
    }

    public void putConfigMockData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f07c4776", new Object[]{this, str});
        } else {
            nim.o(str);
        }
    }

    public void putMockParamData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e76caf", new Object[]{this, str});
        } else {
            nim.p(str);
        }
    }

    public void putPersistentTimeTravelSec(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa2cc79", new Object[]{this, new Long(j)});
        } else {
            nim.q(j);
        }
    }

    public void setMock(final boolean z, final String str, final boolean z2, final boolean z3, final long j, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19904c3", new Object[]{this, new Boolean(z), str, new Boolean(z2), new Boolean(z3), new Long(j), str2});
        } else {
            hst.b(new Runnable() { // from class: tb.xdm
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerMockManager.this.lambda$setMock$51(z, str, z2, z3, str2, j);
                }
            });
        }
    }

    public void setMockParamData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb620a7c", new Object[]{this, str});
        } else {
            nim.p(str);
        }
    }

    public void setMockTimeTravelSec(boolean z, boolean z2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92fd7bbf", new Object[]{this, new Boolean(z), new Boolean(z2), new Long(j)});
            return;
        }
        try {
            if (z) {
                startMockTimeTravelSec(j, z2);
            } else {
                stopMockTimeTravelSec();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerMockManager.setMockTimeTravelSec.error", th);
        }
    }

    public void setPersistentMockData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75831ade", new Object[]{this, str});
        } else {
            nim.o(str);
        }
    }

    public void setTimeTravelSec(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc47a9f", new Object[]{this, new Long(j), new Boolean(z)});
            return;
        }
        this.mTimeTravelSec = j;
        if (z) {
            nim.q(j);
        } else {
            nim.q(0L);
        }
    }

    public void syncTimeTravelSec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27458b6", new Object[]{this});
        } else {
            this.mTimeTravelSec = getPersistentTimeTravelSec();
        }
    }

    public boolean isConstraintMocking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d74c697c", new Object[]{this})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(nim.j());
            if (parseObject != null && parseObject.containsKey("isConstraintMock")) {
                return parseObject.getBoolean("isConstraintMock").booleanValue();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerMockManager.isConstraintMocking.error.", th);
        }
        return false;
    }

    public boolean isConstraintMockingForceCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5534ab9", new Object[]{this})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(getMockParamData());
            if (parseObject != null && parseObject.containsKey("isForceCheck")) {
                return parseObject.getBoolean("isForceCheck").booleanValue();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerMockManager.isConstraintMockingForceCheck.error.", th);
        }
        return false;
    }
}
