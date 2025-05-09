package com.taobao.orange;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import anetwork.channel.interceptor.InterceptorManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.orange.OConstant;
import com.taobao.orange.accssupport.OrangeAccsService;
import com.taobao.orange.aidl.OrangeConfigListenerStub;
import com.taobao.orange.aidl.ParcelableConfigListener;
import com.taobao.orange.candidate.MultiAnalyze;
import com.taobao.orange.model.CandidateDO;
import com.taobao.orange.model.ConfigDO;
import com.taobao.orange.model.CustomConfigDO;
import com.taobao.orange.model.IndexDO;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.orange.receiver.OrangeReceiver;
import com.taobao.orange.sync.IndexUpdateHandler;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.StringUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import tb.c21;
import tb.cte;
import tb.ds1;
import tb.dy4;
import tb.eal;
import tb.fal;
import tb.fck;
import tb.gr1;
import tb.hf4;
import tb.i8l;
import tb.ibl;
import tb.jno;
import tb.obk;
import tb.qbk;
import tb.r9b;
import tb.t2o;
import tb.u11;
import tb.zs1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConfigCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_BIND_TIMEOUT = 3;
    public static final String TAG = "ConfigCenter";
    public static volatile long g = 0;
    public static ConfigCenter mInstance = new ConfigCenter();
    public volatile qbk mInitListener;
    public AtomicBoolean mIsOrangeInit = new AtomicBoolean(false);
    public final Map<String, Long> mLoadingConfigMap = new ConcurrentHashMap();
    public final Set<String> mFailRequestsSet = new HashSet();
    public final Map<String, Set<ParcelableConfigListener>> mListeners = new HashMap();
    public final Set<ParcelableConfigListener> mGlobalListeners = Collections.synchronizedSet(new HashSet());
    public final ConcurrentLinkedQueue<NameSpaceDO> mConfigWaitingNetworkQueue = new ConcurrentLinkedQueue<>();
    public AtomicBoolean isAfterIdle = new AtomicBoolean(false);
    public AtomicBoolean isAfterForeground = new AtomicBoolean(false);
    public volatile boolean mIsFirstInstall = false;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f11363a = new AtomicInteger(0);
    public final Map<String, Long> b = new ConcurrentHashMap();
    public boolean c = false;
    public volatile long d = 0;
    public volatile long e = 0;
    public String f = null;
    public AtomicBoolean isWaitingIdle = new AtomicBoolean(false);
    public final Set<String> mMonitoredNsSet = new HashSet();
    public Set<String> failCandidateSet = new HashSet();
    public cte mIndexCache = new cte();
    public hf4 mConfigCache = new hf4();
    public dy4 mCriticalConfigCache = new dy4();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends ds1<IndexDO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ConfigCenter configCenter, String str, String str2) {
            super(str, str2);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/ConfigCenter$10");
        }

        /* renamed from: h */
        public IndexDO f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IndexDO) ipChange.ipc$dispatch("7bac1545", new Object[]{this, str});
            }
            return (IndexDO) JSON.parseObject(str, IndexDO.class);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends gr1<IndexDO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ IndexUpdateHandler.IndexUpdateInfo l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ConfigCenter configCenter, String str, boolean z, String str2, IndexUpdateHandler.IndexUpdateInfo indexUpdateInfo) {
            super(str, z, str2);
            this.l = indexUpdateInfo;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/ConfigCenter$11");
        }

        @Override // tb.gr1
        public Map<String, String> i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("617e580a", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put(IndexUpdateHandler.IndexUpdateInfo.SYNC_KEY_RESOURCEID, this.l.resourceId);
            return hashMap;
        }

        @Override // tb.gr1
        public String j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3a80c94f", new Object[]{this});
            }
            return null;
        }

        /* renamed from: o */
        public IndexDO l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IndexDO) ipChange.ipc$dispatch("7bac1545", new Object[]{this, str});
            }
            return (IndexDO) JSON.parseObject(str, IndexDO.class);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zs1 f11371a;

        public h(zs1 zs1Var) {
            this.f11371a = zs1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ConfigCenter.this.syncCriticalRequest(this.f11371a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class i implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 2) {
                OLog.e(ConfigCenter.TAG, "BACKGROUND_2_FOREGROUND fetch critical start", new Object[0]);
                ConfigCenter.this.fetchCriticalConfigs(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class j implements Comparator<NameSpaceDO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j(ConfigCenter configCenter) {
        }

        /* renamed from: a */
        public int compare(NameSpaceDO nameSpaceDO, NameSpaceDO nameSpaceDO2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2743393f", new Object[]{this, nameSpaceDO, nameSpaceDO2})).intValue();
            }
            return nameSpaceDO.name.compareTo(nameSpaceDO2.name);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11374a;

        public l(String str) {
            this.f11374a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ConfigCenter.this.mIndexCache.t();
            NameSpaceDO m = ConfigCenter.this.mIndexCache.m(this.f11374a);
            if (m != null && ConfigCenter.this.mIsOrangeInit.get()) {
                ConfigCenter.this.loadConfig(m);
            }
            ConfigCenter.this.mIndexCache.d();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class m extends ds1<ConfigDO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Class f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ConfigCenter configCenter, String str, String str2, Class cls) {
            super(str, str2);
            this.f = cls;
        }

        public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/ConfigCenter$4");
        }

        /* renamed from: h */
        public ConfigDO f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConfigDO) ipChange.ipc$dispatch("fa0cb127", new Object[]{this, str});
            }
            return (ConfigDO) JSON.parseObject(str, this.f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class n extends gr1<ConfigDO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NameSpaceDO l;
        public final /* synthetic */ Class m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ConfigCenter configCenter, String str, boolean z, String str2, NameSpaceDO nameSpaceDO, Class cls) {
            super(str, z, str2);
            this.l = nameSpaceDO;
            this.m = cls;
        }

        public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/ConfigCenter$5");
        }

        @Override // tb.gr1
        public Map<String, String> i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("617e580a", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put(IndexUpdateHandler.IndexUpdateInfo.SYNC_KEY_RESOURCEID, this.l.resourceId);
            return hashMap;
        }

        @Override // tb.gr1
        public String j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3a80c94f", new Object[]{this});
            }
            return null;
        }

        /* renamed from: o */
        public ConfigDO l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConfigDO) ipChange.ipc$dispatch("fa0cb127", new Object[]{this, str});
            }
            return (ConfigDO) JSON.parseObject(str, this.m);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class o implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ParcelableConfigListener f11375a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;

        public o(ParcelableConfigListener parcelableConfigListener, String str, Map map) {
            this.f11375a = parcelableConfigListener;
            this.b = str;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f11375a.onConfigUpdate(this.b, this.c);
            } catch (Throwable th) {
                OLog.e(ConfigCenter.TAG, "executeListener", th, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NameSpaceDO f11376a;

        public p(NameSpaceDO nameSpaceDO) {
            this.f11376a = nameSpaceDO;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ConfigCenter.this.loadConfigLazy(this.f11376a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class q implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11377a;

        public q(String str) {
            this.f11377a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ConfigCenter.this.mIndexCache.t();
            NameSpaceDO m = ConfigCenter.this.mIndexCache.m(this.f11377a);
            if (m != null && ConfigCenter.this.mIsOrangeInit.get()) {
                ConfigCenter.this.loadConfig(m);
            }
            ConfigCenter.this.mIndexCache.d();
        }
    }

    static {
        t2o.a(613416964);
    }

    public ConfigCenter() {
        new AtomicBoolean(false);
    }

    public static /* synthetic */ boolean access$002(ConfigCenter configCenter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4616afb5", new Object[]{configCenter, new Boolean(z)})).booleanValue();
        }
        configCenter.c = z;
        return z;
    }

    public static /* synthetic */ void access$100(ConfigCenter configCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9c3c2", new Object[]{configCenter});
        } else {
            configCenter.h();
        }
    }

    public static /* synthetic */ void access$200(ConfigCenter configCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aabb03", new Object[]{configCenter});
        } else {
            configCenter.g();
        }
    }

    public static /* synthetic */ AtomicInteger access$300(ConfigCenter configCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("23eea02e", new Object[]{configCenter});
        }
        return configCenter.f11363a;
    }

    public static /* synthetic */ void access$400(ConfigCenter configCenter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe939ef", new Object[]{configCenter, new Boolean(z)});
        } else {
            configCenter.k(z);
        }
    }

    public static /* synthetic */ void access$500(ConfigCenter configCenter, Set set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f91939", new Object[]{configCenter, set});
        } else {
            configCenter.j(set);
        }
    }

    public static /* synthetic */ String access$602(ConfigCenter configCenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6c2b46d", new Object[]{configCenter, str});
        }
        configCenter.f = str;
        return str;
    }

    public static ConfigCenter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigCenter) ipChange.ipc$dispatch("a93d374e", new Object[0]);
        }
        return mInstance;
    }

    public boolean addGlobalListener(obk obkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fc3986f", new Object[]{this, obkVar})).booleanValue();
        }
        if (obkVar != null) {
            return this.mGlobalListeners.add(new OrangeConfigListenerStub(obkVar));
        }
        return false;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86e589a4", new Object[]{this})).booleanValue();
        }
        if ((com.taobao.orange.a.M & 2) == 0) {
            return true;
        }
        return false;
    }

    public boolean cacheCriticalConfig(ConfigDO configDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c683c7c", new Object[]{this, configDO})).booleanValue();
        }
        return this.mCriticalConfigCache.a(configDO);
    }

    public boolean checkConfigExpiredInCriticalCache(ConfigDO configDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("122013bc", new Object[]{this, configDO})).booleanValue();
        }
        return this.mCriticalConfigCache.b(configDO);
    }

    public void delayLoadConfigForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171dd6d5", new Object[]{this});
        } else if (com.taobao.orange.a.A) {
            fck.c(new d());
        }
    }

    public String getConfig(String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        Map<String, String> configs = getConfigs(str);
        if (configs == null || (str4 = configs.get(str2)) == null) {
            return str3;
        }
        return str4;
    }

    public hf4 getConfigCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hf4) ipChange.ipc$dispatch("c258f33d", new Object[]{this});
        }
        return this.mConfigCache;
    }

    public ConcurrentLinkedQueue<NameSpaceDO> getConfigWaitingNetworkQueue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentLinkedQueue) ipChange.ipc$dispatch("442ef49d", new Object[]{this});
        }
        return this.mConfigWaitingNetworkQueue;
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3813ca9", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.mLoadingConfigMap.remove(str);
        }
    }

    public void loadConfig(NameSpaceDO nameSpaceDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb27e80", new Object[]{this, nameSpaceDO});
        } else {
            loadConfig(nameSpaceDO, false);
        }
    }

    public void notifyListeners(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912cc3e3", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            notifyListeners(str, str2, z, false);
        }
    }

    public void rematchNamespace(Set<String> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407e2605", new Object[]{this, set, new Boolean(z)});
        } else {
            fck.c(new c(set, z));
        }
    }

    public boolean removeGlobalListener(obk obkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d4cc06c", new Object[]{this, obkVar})).booleanValue();
        }
        if (obkVar != null) {
            return this.mGlobalListeners.remove(new OrangeConfigListenerStub(obkVar));
        }
        return false;
    }

    @Deprecated
    public void setGlobalListener(obk obkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50a1ab4a", new Object[]{this, obkVar});
        } else {
            this.mGlobalListeners.add(new OrangeConfigListenerStub(obkVar));
        }
    }

    public void setInitListener(qbk qbkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4837d508", new Object[]{this, qbkVar});
        }
    }

    public void unregisterListeners(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b11fb4", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            synchronized (this.mListeners) {
                this.mListeners.remove(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (ConfigCenter.this) {
                try {
                    if (!ConfigCenter.this.mIsOrangeInit.get()) {
                        ConfigCenter.this.isAfterForeground.compareAndSet(false, true);
                        OLog.w(ConfigCenter.TAG, "delayLoadConfigForeground skip as not finish orange init", new Object[0]);
                        return;
                    }
                    if (ConfigCenter.this.isAfterForeground.compareAndSet(false, true)) {
                        Set<NameSpaceDO> n = ConfigCenter.this.mIndexCache.n();
                        long currentTimeMillis = System.currentTimeMillis();
                        ConfigCenter.access$500(ConfigCenter.this, n);
                        OLog.e(ConfigCenter.TAG, "delayLoadConfigForeground", "size", Integer.valueOf(n.size()), "time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        MultiAnalyze.initBuildInCandidates();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashSet hashSet = new HashSet();
            while (!ConfigCenter.this.getConfigWaitingNetworkQueue().isEmpty()) {
                NameSpaceDO poll = ConfigCenter.this.getConfigWaitingNetworkQueue().poll();
                if (poll != null) {
                    hashSet.add(poll);
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                NameSpaceDO nameSpaceDO = (NameSpaceDO) it.next();
                if (nameSpaceDO != null) {
                    if (OLog.isPrintLog(0)) {
                        OLog.d(ConfigCenter.TAG, "idle load config", "namespace", nameSpaceDO.name);
                    }
                    ConfigCenter.this.loadConfig(nameSpaceDO);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ConfigDO f11370a;

        public f(ConfigDO configDO) {
            this.f11370a = configDO;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (OLog.isPrintLog(0)) {
                OLog.d(ConfigCenter.TAG, "idle persist config", "namespace", this.f11370a.name);
            }
            ConfigDO configDO = this.f11370a;
            configDO.persisted = true;
            com.taobao.orange.util.a.f(configDO, configDO.name);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NameSpaceDO f11373a;

        public k(NameSpaceDO nameSpaceDO) {
            this.f11373a = nameSpaceDO;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (OLog.isPrintLog(0)) {
                OLog.d(ConfigCenter.TAG, "getConfigObj force to load", "namespace", this.f11373a.name);
            }
            ConfigCenter.this.loadConfigLazy(this.f11373a);
        }
    }

    public final void d(String str, ParcelableConfigListener parcelableConfigListener, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd0f348", new Object[]{this, str, parcelableConfigListener, map});
        } else if (!TextUtils.isEmpty(str) && parcelableConfigListener != null) {
            if (ibl.b()) {
                fck.i(new o(parcelableConfigListener, str, map));
                return;
            }
            try {
                parcelableConfigListener.onConfigUpdate(str, map);
            } catch (Throwable th) {
                OLog.e(TAG, "notifyListeners", th, new Object[0]);
            }
        }
    }

    public void forceCheckUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2de18d", new Object[]{this});
        } else if (!this.mIsOrangeInit.get()) {
            OLog.w(TAG, "forceCheckUpdate fail as not finish orange init", new Object[0]);
        } else if (com.taobao.orange.a.s != OConstant.UPDMODE.O_XMD) {
            OLog.i(TAG, "forceCheckUpdate start", new Object[0]);
            IndexUpdateHandler.a(this.mIndexCache.h(), this.mIndexCache.q());
        } else {
            OLog.w(TAG, "forceCheckUpdate fail as not allow in O_XMD mode", new Object[0]);
        }
    }

    public JSONObject getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2e9a711", new Object[]{this});
        }
        try {
            IndexDO indexDO = new IndexDO(this.mIndexCache.l());
            Collections.sort(indexDO.mergedNamespaces, new j(this));
            return new JSONObject(JSON.toJSONString(indexDO));
        } catch (Exception e2) {
            OLog.e(TAG, "getIndex", e2, new Object[0]);
            return null;
        }
    }

    public JSONObject getIndexAndConfigs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("886d5cb", new Object[]{this});
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("index", getIndex());
            hashMap.put("config", getAllConfigs());
            return new JSONObject(hashMap);
        } catch (Exception e2) {
            OLog.e(TAG, "getIndexAndConfigs", e2, new Object[0]);
            return null;
        }
    }

    public final void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7156d3c", new Object[]{this, new Boolean(z)});
        } else if (!this.isAfterIdle.get() && !this.isWaitingIdle.get()) {
            this.isWaitingIdle.set(true);
        } else if (z || this.isWaitingIdle.get()) {
            if (TextUtils.isEmpty(com.taobao.orange.a.K)) {
                com.taobao.orange.a.K = (String) jno.b(com.taobao.orange.a.g, "appVersion", "");
            }
            if (TextUtils.isEmpty(com.taobao.orange.a.L)) {
                com.taobao.orange.a.L = (String) jno.b(com.taobao.orange.a.g, "osVersion", "");
            }
            if (!TextUtils.equals(com.taobao.orange.a.K, com.taobao.orange.a.j)) {
                com.taobao.orange.a.K = com.taobao.orange.a.j;
                jno.f(com.taobao.orange.a.g, "appVersion", com.taobao.orange.a.K);
            }
            String str = com.taobao.orange.a.L;
            int i2 = Build.VERSION.SDK_INT;
            if (!TextUtils.equals(str, String.valueOf(i2))) {
                com.taobao.orange.a.L = String.valueOf(i2);
                jno.f(com.taobao.orange.a.g, "osVersion", com.taobao.orange.a.L);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:37:0x00d7
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public void loadConfig(com.taobao.orange.model.NameSpaceDO r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.ConfigCenter.loadConfig(com.taobao.orange.model.NameSpaceDO, boolean):void");
    }

    public void notifyListeners(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946c6b51", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2)});
        } else if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("fromCache", String.valueOf(z));
            hashMap.put("isCritical", String.valueOf(z2));
            hashMap.put("configVersion", str2);
            if ((!z || z2) && !this.mGlobalListeners.isEmpty()) {
                for (ParcelableConfigListener parcelableConfigListener : this.mGlobalListeners) {
                    try {
                        parcelableConfigListener.onConfigUpdate(str, hashMap);
                    } catch (Throwable th) {
                        OLog.w(TAG, "notifyGlobalListeners", th, new Object[0]);
                    }
                }
            }
            HashSet hashSet = new HashSet();
            synchronized (this.mListeners) {
                try {
                    Set<ParcelableConfigListener> set = this.mListeners.get(str);
                    if (set != null && set.size() > 0) {
                        hashSet.addAll(set);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (hashSet.size() > 0) {
                if (OLog.isPrintLog(1)) {
                    OLog.d(TAG, "notifyListeners ", "namespace", str, "args", hashMap, "listenerSet.size", Integer.valueOf(hashSet.size()));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    d(str, (ParcelableConfigListener) it.next(), hashMap);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Set f11367a;
        public final /* synthetic */ boolean b;

        public c(Set set, boolean z) {
            this.f11367a = set;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (ConfigCenter.this) {
                try {
                    Set set = this.f11367a;
                    if (set != null && !set.isEmpty()) {
                        this.f11367a.addAll(ConfigCenter.this.failCandidateSet);
                        ConfigCenter.this.failCandidateSet.clear();
                        if (OLog.isPrintLog(1)) {
                            OLog.d(ConfigCenter.TAG, "rematchNamespace", "<<<<<<<<<<<<<< START >>>>>>>>>>>>>>");
                        }
                        if (OLog.isPrintLog(1)) {
                            OLog.d(ConfigCenter.TAG, "rematchNamespace", "candidateKeys", this.f11367a);
                        }
                        if (ibl.b()) {
                            for (NameSpaceDO nameSpaceDO : ConfigCenter.this.mIndexCache.l().mergedNamespaces) {
                                List<CandidateDO> list = nameSpaceDO.candidates;
                                if (list != null && !list.isEmpty()) {
                                    if (!ConfigCenter.this.mConfigCache.g().containsKey(nameSpaceDO.name)) {
                                        OLog.w(ConfigCenter.TAG, "rematchNamespace continue as not used DEFAULT", "namespace", nameSpaceDO.name);
                                    } else {
                                        ConfigCenter.this.loadConfig(nameSpaceDO, this.b);
                                    }
                                }
                            }
                        } else {
                            HashSet hashSet = new HashSet();
                            for (String str : this.f11367a) {
                                Set<String> set2 = ConfigCenter.this.mIndexCache.b.get(str);
                                if (set2 != null) {
                                    hashSet.addAll(set2);
                                }
                            }
                            if (OLog.isPrintLog(1)) {
                                OLog.d(ConfigCenter.TAG, "rematchNamespace", "specialNamespaces", hashSet);
                            }
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                String str2 = (String) it.next();
                                if (!ConfigCenter.this.mConfigCache.g().containsKey(str2)) {
                                    OLog.w(ConfigCenter.TAG, "rematchNamespace break as not used DEFAULT", "namespace", str2);
                                } else {
                                    ConfigCenter configCenter = ConfigCenter.this;
                                    configCenter.loadConfig(configCenter.mIndexCache.m(str2), this.b);
                                }
                            }
                        }
                        ConfigCenter.access$400(ConfigCenter.this, true);
                        if (OLog.isPrintLog(1)) {
                            OLog.d(ConfigCenter.TAG, "rematchNamespace", "<<<<<<<<<<<<<< END >>>>>>>>>>>>>>");
                        }
                        return;
                    }
                    if (OLog.isPrintLog(3)) {
                        OLog.w(ConfigCenter.TAG, "rematchNamespace fail", new Object[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g extends zs1<List<ConfigDO>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/ConfigCenter$16");
        }

        /* renamed from: l */
        public List<ConfigDO> j(String str) {
            Object obj;
            Object obj2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("8f70804a", new Object[]{this, str});
            }
            if (TextUtils.isEmpty(str)) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            try {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
                ConfigCenter.access$602(ConfigCenter.this, parseObject.getString("v"));
                JSONArray jSONArray = parseObject.getJSONArray("configs");
                for (int i = 0; i < jSONArray.size(); i++) {
                    String string = jSONArray.getJSONObject(i).getString("type");
                    if (NameSpaceDO.TYPE_STANDARD.equals(string)) {
                        obj2 = ConfigDO.class;
                    } else if ("CUSTOM".equals(string)) {
                        obj2 = CustomConfigDO.class;
                    } else {
                        OLog.e(ConfigCenter.TAG, "parse config fail not support type", "type", string);
                        return null;
                    }
                    ConfigDO configDO = (ConfigDO) jSONArray.getObject(i, obj2);
                    if (configDO != null) {
                        OLog.e(ConfigCenter.TAG, "configDO: " + configDO, new Object[0]);
                        configDO.isCritical = true;
                        arrayList.add(configDO);
                    }
                }
            } catch (Throwable th) {
                OLog.e(ConfigCenter.TAG, "fetchCriticalConfigs parseResContent", th, new Object[0]);
                arrayList = null;
            }
            if (arrayList == null) {
                obj = "0";
            } else {
                obj = Integer.valueOf(arrayList.size());
            }
            OLog.e(ConfigCenter.TAG, "fetchCriticalConfigs configsSize", obj);
            return arrayList;
        }
    }

    public boolean checkCriticalConfigValid(ConfigDO configDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ceae72c", new Object[]{this, configDO})).booleanValue();
        }
        ConfigDO configDO2 = this.mCriticalConfigCache.c().get(configDO.name);
        long k2 = ibl.k(configDO.getChangeVersion());
        if (configDO2 == null || ibl.k(configDO2.getChangeVersion()) < k2) {
            ConfigDO configDO3 = this.mConfigCache.g().get(configDO.name);
            if (configDO3 == null || ibl.k(configDO3.getChangeVersion()) < k2) {
                return true;
            }
            OLog.i(TAG, "changeVersion older than local config cache, no need update " + configDO.name, new Object[0]);
            return false;
        }
        OLog.i(TAG, "changeVersion older than local critical config cache, no need update " + configDO.name, new Object[0]);
        return false;
    }

    public void delayLoadConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("115cf4b2", new Object[]{this});
            return;
        }
        OLog.d(TAG, "delayLoadConfig", new Object[0]);
        if (!this.mIsOrangeInit.get()) {
            this.isAfterIdle.compareAndSet(false, true);
            OLog.w(TAG, "delayLoadConfig fail as not finish orange init", new Object[0]);
        } else if (this.isAfterIdle.compareAndSet(false, true)) {
            fal falVar = new fal();
            falVar.f19142a.f19143a = this.mIsFirstInstall;
            falVar.f19142a.b = com.taobao.orange.a.t;
            fal.a aVar = falVar.f19142a;
            aVar.c = 0;
            aVar.d = this.f11363a.get();
            falVar.f19142a.e = com.taobao.orange.util.a.b.get();
            falVar.f19142a.f = com.taobao.orange.util.a.c.get();
            falVar.f19142a.g = com.taobao.orange.util.a.d.get();
            falVar.f19142a.h = com.taobao.orange.util.a.e.get();
            falVar.f19142a.i = com.taobao.orange.util.a.f.get();
            if (getConfigWaitingNetworkQueue() != null) {
                fck.c(new e());
            }
            if (ibl.b()) {
                this.mConfigCache.c("orange");
                for (NameSpaceDO nameSpaceDO : this.mIndexCache.k()) {
                    this.mConfigCache.c(nameSpaceDO.name);
                }
                this.mConfigCache.f();
            }
            for (String str : getConfigCache().g().keySet()) {
                ConfigDO configDO = getConfigCache().g().get(str);
                if (configDO != null && !configDO.persisted) {
                    fck.g(new f(configDO));
                }
            }
            if (!com.taobao.orange.a.A) {
                k(false);
            }
            eal.a(falVar);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1565f8da", new Object[]{this});
        } else if (com.taobao.orange.a.f11393a && c()) {
            try {
                c21.c(new i());
            } catch (Throwable th) {
                OLog.w(TAG, "init", th, "addApmEventListener fail");
            }
        }
    }

    public JSONObject getAllConfigs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dcad8e7b", new Object[]{this});
        }
        try {
            Map m2 = ibl.m(this.mConfigCache.g(), true);
            Map<String, ConfigDO> c2 = this.mCriticalConfigCache.c();
            for (String str : c2.keySet()) {
                ConfigDO configDO = c2.get(str);
                if (configDO != null && !configDO.isExpired.get()) {
                    m2.put(str, configDO);
                }
            }
            return new JSONObject(JSON.toJSONString(m2));
        } catch (Exception e2) {
            OLog.e(TAG, "getAllConfigs", e2, new Object[0]);
            return null;
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288fff09", new Object[]{this});
            return;
        }
        try {
            IpChange ipChange2 = InterceptorManager.$ipChange;
            InterceptorManager.addInterceptor(new com.taobao.orange.sync.a());
            OLog.i(TAG, "init", "add orange interceptor success to networksdk");
        } catch (ClassNotFoundException e2) {
            OLog.w(TAG, "init", e2, "add orange interceptor fail as not found networksdk");
        }
    }

    public void init(Context context, OConfig oConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7508d46d", new Object[]{this, context, oConfig});
        } else if (context == null || TextUtils.isEmpty(oConfig.appKey) || TextUtils.isEmpty(oConfig.appVersion)) {
            OLog.e(TAG, "init start", "input param error");
        } else {
            fck.c(new AnonymousClass1(context, oConfig));
        }
    }

    public void loadCaches() {
        Set<NameSpaceDO> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418cfebe", new Object[]{this});
            return;
        }
        try {
            OLog.i(TAG, "loadCaches", "start index");
            this.mIndexCache.r();
            if (!com.taobao.orange.a.A || this.isAfterForeground.get()) {
                set = this.mIndexCache.g();
                OLog.e(TAG, "loadCaches, getAllNameSpaces", new Object[0]);
            } else {
                set = this.mIndexCache.k();
                OLog.e(TAG, "loadCaches, getHighInitNameSpaces", new Object[0]);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (ibl.b()) {
                this.mConfigCache.n();
            }
            j(set);
            String str = com.taobao.orange.a.TAG;
            OLog.e(TAG, "loadCaches", "size", Integer.valueOf(set.size()), "time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            com.taobao.orange.a.g.registerReceiver(new OrangeReceiver(), intentFilter);
        } catch (Throwable th) {
            OLog.e(TAG, "loadCaches", th, new Object[0]);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th.printStackTrace(new PrintStream(byteArrayOutputStream));
            eal.l(OConstant.MONITOR_MODULE, OConstant.POINT_EXCEPTION, "0", "102", byteArrayOutputStream.toString());
        }
    }

    public void updateSystemConfig(Map map) {
        int i2;
        String str;
        List parseArray;
        List parseArray2;
        JSONArray parseArray3;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c31024", new Object[]{this, map});
            return;
        }
        try {
            Map map2 = (Map) this.mConfigCache.h("orange");
            if (OLog.isPrintLog(2)) {
                i2 = 3;
                OLog.i(TAG, "updateSystemConfig", "args", map, "orangeConfigs", map2);
            } else {
                i2 = 3;
            }
            if (!(map2 == null || map2.isEmpty())) {
                String str2 = (String) map2.get(OConstant.SYSKEY_FALLBACK_AVOID);
                if (!TextUtils.isEmpty(str2)) {
                    com.taobao.orange.a.u = Boolean.parseBoolean(str2);
                    Boolean valueOf = Boolean.valueOf(com.taobao.orange.a.u);
                    str = OConstant.SYSKEY_ENABLE_FETCH_CRITICAL_CONFIGS;
                    OLog.i(TAG, "updateSystemConfig", OConstant.SYSKEY_FALLBACK_AVOID, valueOf);
                } else {
                    str = OConstant.SYSKEY_ENABLE_FETCH_CRITICAL_CONFIGS;
                }
                String str3 = (String) map2.get(OConstant.SYSKEY_INDEX_ENV_CHECK);
                if (!TextUtils.isEmpty(str3)) {
                    com.taobao.orange.a.y = Boolean.parseBoolean(str3);
                    OLog.i(TAG, "updateSystemConfig", OConstant.SYSKEY_INDEX_ENV_CHECK, Boolean.valueOf(com.taobao.orange.a.y));
                }
                String str4 = (String) map2.get(OConstant.SYSKEY_REQ_RETRY_NUM);
                if (!TextUtils.isEmpty(str4)) {
                    int parseInt = Integer.parseInt(str4);
                    if (parseInt > 5) {
                        parseInt = 5;
                    }
                    com.taobao.orange.a.q = parseInt;
                    OLog.i(TAG, "updateSystemConfig", OConstant.SYSKEY_REQ_RETRY_NUM, Integer.valueOf(com.taobao.orange.a.q));
                }
                String str5 = (String) map2.get(OConstant.SYSKEY_INDEXUPD_MODE);
                if (!TextUtils.isEmpty(str5)) {
                    com.taobao.orange.a.s = OConstant.UPDMODE.valueOf(Integer.parseInt(str5));
                    OLog.i(TAG, "updateSystemConfig", "indexUpdMode", com.taobao.orange.a.s);
                }
                String str6 = (String) map2.get("downgrade");
                if (!TextUtils.isEmpty(str6)) {
                    if (Boolean.valueOf(str6).booleanValue()) {
                        i3 = 2;
                        com.taobao.orange.a.t = 2;
                    } else {
                        i3 = 2;
                    }
                    Integer valueOf2 = Integer.valueOf(com.taobao.orange.a.t);
                    Object[] objArr = new Object[i3];
                    objArr[0] = "downgrade";
                    objArr[1] = valueOf2;
                    OLog.i(TAG, "updateSystemConfig", objArr);
                }
                String str7 = (String) map2.get("hosts");
                if (!TextUtils.isEmpty(str7) && (parseArray3 = JSON.parseArray(str7)) != null && parseArray3.size() >= 0) {
                    ArrayList arrayList = new ArrayList(parseArray3.size());
                    for (int i4 = 0; i4 < parseArray3.size(); i4++) {
                        String string = parseArray3.getJSONObject(i4).getString("host");
                        if (!TextUtils.isEmpty(string)) {
                            arrayList.add(string);
                        }
                    }
                    if (arrayList.size() > 0) {
                        com.taobao.orange.a.r.clear();
                        com.taobao.orange.a.r.addAll(arrayList);
                        OLog.i(TAG, "updateSystemConfig", "probeHosts", com.taobao.orange.a.r);
                    }
                }
                String str8 = (String) map2.get(OConstant.SYSKEY_DCVIPS);
                if (!TextUtils.isEmpty(str8) && (parseArray2 = JSON.parseArray(str8, String.class)) != null && parseArray2.size() > 0) {
                    Set<String> set = com.taobao.orange.a.E;
                    set.clear();
                    set.addAll(parseArray2);
                    OLog.i(TAG, "updateSystemConfig", OConstant.SYSKEY_DCVIPS, set);
                }
                String str9 = (String) map2.get(OConstant.SYSKEY_ACKVIPS);
                if (!TextUtils.isEmpty(str9) && (parseArray = JSON.parseArray(str9, String.class)) != null && parseArray.size() > 0) {
                    Set<String> set2 = com.taobao.orange.a.G;
                    set2.clear();
                    set2.addAll(parseArray);
                    OLog.i(TAG, "updateSystemConfig", OConstant.SYSKEY_ACKVIPS, set2);
                }
                String str10 = (String) map2.get(OConstant.SYSKEY_BIND_TIMEOUT);
                if (!TextUtils.isEmpty(str10)) {
                    int parseInt2 = StringUtil.parseInt(str10);
                    Context context = com.taobao.orange.a.g;
                    if (parseInt2 != 0) {
                        i2 = parseInt2;
                    }
                    jno.f(context, OConstant.SYSKEY_BIND_TIMEOUT, Integer.valueOf(i2));
                }
                String str11 = (String) map2.get(OConstant.SYSKEY_RECOVERY_SERVICE_STATE);
                if (!TextUtils.isEmpty(str11)) {
                    jno.f(com.taobao.orange.a.g, OConstant.SYSKEY_RECOVERY_SERVICE_STATE, Integer.valueOf(StringUtil.parseInt(str11)));
                }
                String str12 = (String) map2.get(OConstant.SYSKEY_CHANNEL_CONFIGS);
                if (!TextUtils.isEmpty(str12)) {
                    jno.f(com.taobao.orange.a.g, OConstant.SYSKEY_CHANNEL_CONFIGS, new HashSet(JSON.parseArray(str12, String.class)));
                }
                String str13 = (String) map2.get(OConstant.SYSKEY_INDEX_CHECK_ENABLE);
                if (!TextUtils.isEmpty(str13)) {
                    jno.f(com.taobao.orange.a.g, OConstant.SYSKEY_INDEX_CHECK_ENABLE, Boolean.valueOf(Boolean.parseBoolean(str13)));
                }
                String str14 = (String) map2.get(str);
                if (!TextUtils.isEmpty(str14)) {
                    int parseInt3 = Integer.parseInt(str14);
                    jno.f(com.taobao.orange.a.g, str, Integer.valueOf(parseInt3));
                    OLog.i(TAG, "updateSystemConfig", str, Integer.valueOf(parseInt3));
                }
                String str15 = (String) map2.get(OConstant.SYSKEY_ENABLE_I18n);
                if (!TextUtils.isEmpty(str15)) {
                    int parseInt4 = Integer.parseInt(str15);
                    jno.e(com.taobao.orange.a.g, OConstant.SYSKEY_ENABLE_I18n, Integer.valueOf(parseInt4));
                    OLog.i(TAG, "updateSystemConfig", OConstant.SYSKEY_ENABLE_I18n, Integer.valueOf(parseInt4));
                }
                String str16 = (String) map2.get(OConstant.SYSKEY_ENABLE_LAUNCH_OPTIMIZE);
                if (!TextUtils.isEmpty(str16)) {
                    boolean parseBoolean = Boolean.parseBoolean(str16);
                    jno.e(com.taobao.orange.a.g, OConstant.SYSKEY_ENABLE_LAUNCH_OPTIMIZE, Boolean.valueOf(parseBoolean));
                    OLog.i(TAG, "updateSystemConfig", OConstant.SYSKEY_ENABLE_LAUNCH_OPTIMIZE, Boolean.valueOf(parseBoolean));
                }
            }
        } catch (Throwable th) {
            OLog.e(TAG, "updateSystemConfig", th, new Object[0]);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.orange.ConfigCenter$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11364a;
        public final /* synthetic */ OConfig b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.orange.ConfigCenter$1$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ConfigCenter.this.delayLoadConfigForeground();
                ConfigCenter.this.delayLoadConfig();
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.orange.ConfigCenter$1$b */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f11366a;

            public b(long j) {
                this.f11366a = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                fal falVar = new fal();
                falVar.f19142a.f19143a = ConfigCenter.this.mIsFirstInstall;
                falVar.f19142a.b = com.taobao.orange.a.t;
                fal.a aVar = falVar.f19142a;
                aVar.c = 2;
                aVar.d = ConfigCenter.access$300(ConfigCenter.this).get();
                falVar.f19142a.e = com.taobao.orange.util.a.b.get();
                falVar.f19142a.f = com.taobao.orange.util.a.c.get();
                falVar.f19142a.g = com.taobao.orange.util.a.d.get();
                falVar.f19142a.h = com.taobao.orange.util.a.e.get();
                falVar.f19142a.i = com.taobao.orange.util.a.f.get();
                falVar.f19142a.j = this.f11366a;
                eal.a(falVar);
                eal.c = true;
            }
        }

        public AnonymousClass1(Context context, OConfig oConfig) {
            this.f11364a = context;
            this.b = oConfig;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (ConfigCenter.this) {
                try {
                    if (!ConfigCenter.this.mIsOrangeInit.get()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        com.taobao.orange.a.k = UTDevice.getUtdid(this.f11364a);
                        if (OLog.isPrintLog(2)) {
                            SimplePropertyPreFilter simplePropertyPreFilter = new SimplePropertyPreFilter(OConfig.class, new String[0]);
                            simplePropertyPreFilter.getExcludes().add("appSecret");
                            OLog.i(ConfigCenter.TAG, "init start", "sdkVersion", OConstant.SDK_VERSION, "utdid", com.taobao.orange.a.k, "config", JSON.toJSONString(this.b, simplePropertyPreFilter, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue, SerializerFeature.SortField));
                        }
                        com.taobao.orange.a.g = this.f11364a.getApplicationContext();
                        OConfig oConfig = this.b;
                        com.taobao.orange.a.h = oConfig.appKey;
                        com.taobao.orange.a.j = oConfig.appVersion;
                        com.taobao.orange.a.l = oConfig.userId;
                        com.taobao.orange.a.i = oConfig.appSecret;
                        com.taobao.orange.a.m = oConfig.authCode;
                        com.taobao.orange.a.s = OConstant.UPDMODE.valueOf(oConfig.indexUpdateMode);
                        com.taobao.orange.a.C = OConstant.ENV.valueOf(this.b.env);
                        com.taobao.orange.a.r.addAll(Arrays.asList(this.b.probeHosts));
                        OConfig oConfig2 = this.b;
                        com.taobao.orange.a.D = oConfig2.dcHost;
                        String[] strArr = oConfig2.dcVips;
                        if (strArr != null) {
                            com.taobao.orange.a.E.addAll(Arrays.asList(strArr));
                        }
                        OConfig oConfig3 = this.b;
                        com.taobao.orange.a.F = oConfig3.ackHost;
                        String[] strArr2 = oConfig3.ackVips;
                        if (strArr2 != null) {
                            com.taobao.orange.a.G.addAll(Arrays.asList(strArr2));
                        }
                        if (this.b.enableDiffIndex) {
                            com.taobao.orange.a.v = 2;
                        }
                        ConfigCenter.access$002(ConfigCenter.this, this.b.channelIndexUpdate);
                        ConfigCenter.this.mListeners.put("orange", new HashSet<ParcelableConfigListener>() { // from class: com.taobao.orange.ConfigCenter.1.1
                            {
                                add(new ParcelableConfigListener.Stub() { // from class: com.taobao.orange.ConfigCenter.1.1.1
                                    @Override // com.taobao.orange.aidl.ParcelableConfigListener
                                    public void onConfigUpdate(String str, Map map) throws RemoteException {
                                        ConfigCenter.this.updateSystemConfig(map);
                                    }
                                });
                            }
                        });
                        MultiAnalyze.initBuildInCandidates();
                        ConfigCenter.this.loadCaches();
                        ConfigCenter.this.mIsFirstInstall = !new File(com.taobao.orange.util.a.d(), cte.INDEX_STORE_NAME).exists();
                        eal.t();
                        ConfigCenter.access$100(ConfigCenter.this);
                        ConfigCenter.this.mIsOrangeInit.set(true);
                        ConfigCenter.this.forceCheckUpdate();
                        OrangeAccsService.b();
                        i8l.g();
                        ConfigCenter.access$200(ConfigCenter.this);
                        ConfigCenter.this.getClass();
                        long j = this.b.time;
                        if (j >= 0) {
                            fck.d(new a(), j);
                        }
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        fck.d(new b(currentTimeMillis2), 90000L);
                        OLog.i(ConfigCenter.TAG, "init completed, cost(ms):", Long.valueOf(currentTimeMillis2));
                    } else {
                        OLog.w(ConfigCenter.TAG, "already init", new Object[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34bc64b0", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            synchronized (this.mFailRequestsSet) {
                try {
                    if (this.mFailRequestsSet.add(str) && OLog.isPrintLog(2)) {
                        OLog.i(TAG, "addFail", "namespace", str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void addFails(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260d99c4", new Object[]{this, strArr});
            return;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            synchronized (this.mFailRequestsSet) {
                try {
                    if (this.mFailRequestsSet.addAll(arrayList) && OLog.isPrintLog(2)) {
                        OLog.i(TAG, "addFails", "namespaces", arrayList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60a238d3", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (this.mLoadingConfigMap.get(str) != null) {
            OLog.d(TAG, "config", str, "is loading");
            return true;
        }
        if (z) {
            this.mLoadingConfigMap.put(str, Long.valueOf(System.currentTimeMillis()));
        }
        return false;
    }

    public final <T> T e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21c12842", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            OLog.e(TAG, "getConfigObj error, namespace is empty", new Object[0]);
            return null;
        } else if ("orange".equals(str) || cte.INDEX_STORE_NAME.equals(str)) {
            OLog.e(TAG, "getConfigObj error, namespace is occupied by sdk", new Object[0]);
            return null;
        } else {
            if (ibl.b() && !this.isAfterIdle.get()) {
                this.mConfigCache.c(str);
            }
            T t = (T) this.mCriticalConfigCache.d(str);
            if (t != null) {
                OLog.i(TAG, "getConfigObj hit critical cache", "namespace", str);
                return t;
            }
            T t2 = (T) this.mConfigCache.h(str);
            if (t2 == null) {
                if (OLog.isPrintLog(0)) {
                    OLog.v(TAG, "getConfigObj", "namespace", str, "...null");
                }
                NameSpaceDO m2 = this.mIndexCache.m(str);
                if (m2 == null || !this.mIsOrangeInit.get()) {
                    String str2 = com.taobao.orange.a.TAG;
                    a(str);
                } else if (!b(str, false)) {
                    fck.c(new k(m2));
                }
            }
            return t2;
        }
    }

    public void fetchCriticalConfigs(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd888775", new Object[]{this, new Boolean(z)});
            return;
        }
        OLog.i(TAG, "fetchCriticalConfigs start", OConstant.DIMEN_IS_COLD_STARTUP, Boolean.valueOf(z));
        g gVar = new g();
        gVar.i().f32983a = System.currentTimeMillis();
        this.d = gVar.i().f32983a;
        if (z) {
            gVar.i = true;
            fck.e(new h(gVar));
        } else if (this.e <= 0 || this.d - this.e >= 10000) {
            this.e = this.d;
            gVar.i = false;
            syncCriticalRequest(gVar);
        } else {
            OLog.e(TAG, "fetchCriticalConfigs too fast", new Object[0]);
        }
    }

    public Map<String, String> getConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6165ac1", new Object[]{this, str});
        }
        try {
            Map<String, String> f2 = r9b.f((Map) e(str), str, this.mCriticalConfigCache, this.mConfigCache);
            if (f2 != null) {
                return f2;
            }
        } catch (Throwable th) {
            OLog.w(TAG, "getConfigs error", th, "namespace", str);
        }
        synchronized (this.mMonitoredNsSet) {
            try {
                if (this.mMonitoredNsSet.add(str)) {
                    eal.c(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }

    public String getCustomConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a44377c", new Object[]{this, str, str2});
        }
        try {
            String g2 = r9b.g((String) e(str), str, this.mCriticalConfigCache, this.mConfigCache);
            if (g2 != null) {
                return g2;
            }
        } catch (Throwable th) {
            OLog.w(TAG, "getCustomConfig error", th, "namespace", str);
        }
        synchronized (this.mMonitoredNsSet) {
            try {
                if (this.mMonitoredNsSet.add(str)) {
                    eal.c(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    public void removeFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf6fed3", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            synchronized (this.mFailRequestsSet) {
                try {
                    if (this.mFailRequestsSet.remove(str) && OLog.isPrintLog(2)) {
                        OLog.i(TAG, "removeFail", "namespace", str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public synchronized void retryFailRequests() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f22e751", new Object[]{this});
            return;
        }
        HashSet hashSet = new HashSet();
        synchronized (this.mFailRequestsSet) {
            for (String str : this.mFailRequestsSet) {
                NameSpaceDO m2 = this.mIndexCache.m(str);
                if (m2 != null) {
                    hashSet.add(m2);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            OLog.i(TAG, "retryFailRequests", "start load retryNamespaces", Integer.valueOf(hashSet.size()));
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                loadConfig((NameSpaceDO) it.next());
            }
            OLog.i(TAG, "retryFailRequests", "finish load retryNamespaces", Integer.valueOf(hashSet.size()), "cost(ms)", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } else if (OLog.isPrintLog(1)) {
            OLog.d(TAG, "retryFailRequests no any", new Object[0]);
        }
    }

    public synchronized void updateIndex(IndexUpdateHandler.IndexUpdateInfo indexUpdateInfo) {
        Set<NameSpaceDO> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a662f737", new Object[]{this, indexUpdateInfo});
        } else if (f(indexUpdateInfo)) {
            long currentTimeMillis = System.currentTimeMillis();
            HashSet hashSet = new HashSet((int) ((this.mConfigCache.g().size() + this.mFailRequestsSet.size()) * 1.4d));
            hashSet.addAll(this.mConfigCache.g().keySet());
            synchronized (this.mFailRequestsSet) {
                hashSet.addAll(this.mFailRequestsSet);
            }
            if (this.c) {
                set = this.mIndexCache.p(hashSet);
            } else {
                set = this.mIndexCache.o(hashSet);
            }
            OLog.i(TAG, "updateIndex", "start load updateNameSpaces", Integer.valueOf(set.size()));
            for (NameSpaceDO nameSpaceDO : set) {
                loadConfigLazy(nameSpaceDO);
            }
            OLog.i(TAG, "updateIndex", "finish load updateNameSpaces", Integer.valueOf(set.size()), "cost(ms)", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } else if (OLog.isPrintLog(0)) {
            OLog.v(TAG, "updateIndex", "no need update or update fail index file");
        }
    }

    public void loadConfigLazy(NameSpaceDO nameSpaceDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d439b16c", new Object[]{this, nameSpaceDO});
        } else if (nameSpaceDO == null) {
            OLog.e(TAG, "loadConfigLazy fail", "nameSpaceDO is null");
        } else if ("orange".equals(nameSpaceDO.name)) {
            loadConfig(nameSpaceDO);
        } else if (com.taobao.orange.a.t > 0) {
            OLog.w(TAG, "loadConfigLazy downgrade, back to old strategy", nameSpaceDO.name, nameSpaceDO.loadLevel, Integer.valueOf(com.taobao.orange.a.t));
            loadConfig(nameSpaceDO);
            if (eal.f18412a && ((ConcurrentHashMap) this.b).get(nameSpaceDO.name) == null) {
                ((ConcurrentHashMap) this.b).put(nameSpaceDO.name, Long.valueOf(System.currentTimeMillis()));
                eal.j(OConstant.MONITOR_MODULE, OConstant.POINT_DOWNGRADE, nameSpaceDO.name, 1.0d);
            }
        } else {
            OLog.d(TAG, "loadConfigLazy", nameSpaceDO.name, nameSpaceDO.loadLevel, nameSpaceDO.highLazy);
            if (nameSpaceDO.highLazy.intValue() == 0 || !this.mIsFirstInstall) {
                loadConfig(nameSpaceDO);
            } else if (this.isAfterIdle.get()) {
                loadConfig(nameSpaceDO);
            } else {
                getConfigWaitingNetworkQueue().offer(nameSpaceDO);
                OLog.d(TAG, "offer a namespace", nameSpaceDO.name, "to network queue");
            }
        }
    }

    public void syncCriticalRequest(zs1<List<ConfigDO>> zs1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d869f2", new Object[]{this, zs1Var});
            return;
        }
        OLog.i(TAG, "syncCriticalRequest start", new Object[0]);
        List<ConfigDO> k2 = zs1Var.k();
        zs1.a i2 = zs1Var.i();
        boolean z = zs1Var.i;
        if (k2 != null) {
            for (ConfigDO configDO : k2) {
                if (configDO != null && this.mCriticalConfigCache.a(configDO)) {
                    eal.e(configDO.name, configDO.version, configDO.getChangeVersion(), Boolean.valueOf(z), i2.h);
                }
            }
            i2.b = System.currentTimeMillis();
            eal.m(this.f, "success", i2, z, zs1Var.a(), zs1Var.f, zs1Var.g, zs1Var.h);
            OLog.e(TAG, "fetchCriticalConfigs success", "v", this.f, "monitorData", JSON.toJSON(i2));
            return;
        }
        i2.b = System.currentTimeMillis();
        eal.m(null, "fail", i2, z, zs1Var.a(), zs1Var.f, zs1Var.g, zs1Var.h);
        OLog.e(TAG, "fetchCriticalConfigs fail", "code", zs1Var.a(), "msg", zs1Var.c(), "monitorData", JSON.toJSON(i2), "content", zs1Var.e);
    }

    public void unregisterListener(String str, ParcelableConfigListener parcelableConfigListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b557cef6", new Object[]{this, str, parcelableConfigListener});
        } else if (!TextUtils.isEmpty(str) && parcelableConfigListener != null) {
            synchronized (this.mListeners) {
                try {
                    Set<ParcelableConfigListener> set = this.mListeners.get(str);
                    if (set != null && set.size() > 0 && set.remove(parcelableConfigListener) && OLog.isPrintLog(1)) {
                        OLog.d(TAG, "unregisterListener", "namespace", str, "size", Integer.valueOf(set.size()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void registerListener(String str, ParcelableConfigListener parcelableConfigListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4337f705", new Object[]{this, str, parcelableConfigListener, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str) && parcelableConfigListener != null) {
            synchronized (this.mListeners) {
                try {
                    Set<ParcelableConfigListener> set = this.mListeners.get(str);
                    if (set == null) {
                        set = Collections.newSetFromMap(new LinkedHashMap<ParcelableConfigListener, Boolean>() { // from class: com.taobao.orange.ConfigCenter.7
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str2, Object... objArr) {
                                str2.hashCode();
                                int hashCode = str2.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/orange/ConfigCenter$7");
                            }

                            @Override // java.util.LinkedHashMap
                            public boolean removeEldestEntry(Map.Entry<ParcelableConfigListener, Boolean> entry) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    return ((Boolean) ipChange2.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
                                }
                                if (size() > 10) {
                                    return true;
                                }
                                return false;
                            }
                        });
                        this.mListeners.put(str, set);
                    }
                    if (!set.contains(parcelableConfigListener)) {
                        if (z) {
                            set.add(parcelableConfigListener);
                            if (OLog.isPrintLog(1)) {
                                OLog.d(TAG, "registerListener append", "namespace", str, "size", Integer.valueOf(set.size()));
                            }
                        } else {
                            if (OLog.isPrintLog(1)) {
                                OLog.d(TAG, "registerListener cover", "namespace", str);
                            }
                            set.clear();
                            set.add(parcelableConfigListener);
                        }
                        if (ibl.b() && !this.isAfterIdle.get()) {
                            this.mConfigCache.c(str);
                        }
                        ConfigDO configDO = this.mCriticalConfigCache.c().get(str);
                        if (configDO == null || configDO.isExpired.get()) {
                            ConfigDO configDO2 = this.mConfigCache.g().get(str);
                            if (configDO2 != null) {
                                String curVersion = configDO2.getCurVersion();
                                if (OLog.isPrintLog(0)) {
                                    OLog.v(TAG, "registerListener onConfigUpdate", "namespace", str, "version", curVersion);
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("fromCache", "true");
                                hashMap.put("configVersion", curVersion);
                                d(str, parcelableConfigListener, hashMap);
                                return;
                            }
                            NameSpaceDO m2 = this.mIndexCache.m(str);
                            if (this.mIndexCache == null || m2 == null || !this.mIsOrangeInit.get()) {
                                String str2 = com.taobao.orange.a.TAG;
                                a(str);
                            } else if (!b(str, false)) {
                                fck.c(new p(m2));
                            }
                        } else {
                            String curVersion2 = configDO.getCurVersion();
                            OLog.e(TAG, "registerListener hit critical config onConfigUpdate", "namespace", str, "version", curVersion2);
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("fromCache", "true");
                            hashMap2.put("isCritical", "true");
                            hashMap2.put("configVersion", curVersion2);
                            d(str, parcelableConfigListener, hashMap2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.taobao.orange.ConfigCenter$b, tb.gr1] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(com.taobao.orange.sync.IndexUpdateHandler.IndexUpdateInfo r25) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.ConfigCenter.f(com.taobao.orange.sync.IndexUpdateHandler$IndexUpdateInfo):boolean");
    }

    public final void j(Set<NameSpaceDO> set) {
        Set<NameSpaceDO> set2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd5eef75", new Object[]{this, set});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        OLog.i(TAG, "restoreConfigs", "start restore configs", Integer.valueOf(set.size()));
        if (this.c) {
            set2 = this.mConfigCache.j(set);
        } else {
            set2 = this.mConfigCache.i(set);
        }
        OLog.i(TAG, "restoreConfigs", "finish restore configs", Integer.valueOf(set.size()), "cost(ms)", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        if (!(set2 == null || set2.isEmpty())) {
            OLog.i(TAG, "restoreConfigs", "start load notMatchNamespaces", Integer.valueOf(set2.size()));
            long currentTimeMillis2 = System.currentTimeMillis();
            for (NameSpaceDO nameSpaceDO : set2) {
                eal.j(OConstant.MONITOR_PRIVATE_MODULE, OConstant.POINT_CONFIG_NOTMATCH_COUNTS, nameSpaceDO.name, 1.0d);
                loadConfig(nameSpaceDO);
            }
            OLog.e(TAG, "restoreConfigs", "finish load notMatchNamespaces", Integer.valueOf(set2.size()), "cost(ms)", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
        }
    }
}
