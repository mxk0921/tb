package com.android.tools.bundleInfo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleListing;
import com.taobao.tao.TaobaoApplication;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.d62;
import tb.jvc;
import tb.o49;
import tb.y49;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BundleInfoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION = "MergeFeatureInfo";
    public static final String TAG = "BundleInfoManager";
    private static BundleInfoManager sManager;
    private Context mContext;
    private BundleListing mCurrentBundleListing;
    private final ThreadPoolExecutor mExecutor;
    private String mVersionName;
    private volatile boolean mInit = false;
    private Map<String, DynamicFeatureInfo> features = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(BundleInfoManager bundleInfoManager) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "loaddffromdisk");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements y49 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.y49
        public void a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6bf56534", new Object[]{this, str, new Integer(i)});
            } else {
                BundleInfoManager.this.updateFeatureStatus(str, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements Comparator<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2b88f5f3", new Object[]{this, str, str2})).intValue();
            }
            return BundleInfoManager.access$000(BundleInfoManager.this, str) - BundleInfoManager.access$000(BundleInfoManager.this, str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f4603a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;

        public d(boolean z, String str, long j, String str2, int i) {
            this.f4603a = z;
            this.b = str;
            this.c = j;
            this.d = str2;
            this.e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (d62.a(jvc.class, new Object[0]) != null) {
                try {
                    jvc jvcVar = (jvc) d62.a(jvc.class, new Object[0]);
                    boolean z = this.f4603a;
                    String str = this.b;
                    long j = this.c;
                    if (z) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    jvcVar.b(BundleInfoManager.ACTION, z, str, j, i, this.d, this.e);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private BundleInfoManager() {
        if (this.mCurrentBundleListing == null) {
            try {
                this.mCurrentBundleListing = BundleInfoGenerator.generateBundleInfo();
                Log.e(TAG, "generate info from generator");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(this));
        this.mExecutor = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        o49.b().e(new b(), null);
    }

    public static /* synthetic */ int access$000(BundleInfoManager bundleInfoManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b33d28a3", new Object[]{bundleInfoManager, str})).intValue();
        }
        return bundleInfoManager.getFeaturePriority(str);
    }

    private DynamicFeatureInfo deepCopy(DynamicFeatureInfo dynamicFeatureInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicFeatureInfo) ipChange.ipc$dispatch("a83285a6", new Object[]{this, dynamicFeatureInfo});
        }
        DynamicFeatureInfo dynamicFeatureInfo2 = new DynamicFeatureInfo();
        dynamicFeatureInfo2.bindingActivities = dynamicFeatureInfo.bindingActivities;
        dynamicFeatureInfo2.appVersion = dynamicFeatureInfo.appVersion;
        dynamicFeatureInfo2.dependencies = dynamicFeatureInfo.dependencies;
        dynamicFeatureInfo2.matchedAppVersion = dynamicFeatureInfo.matchedAppVersion;
        dynamicFeatureInfo2.matchedFeatureMd5 = dynamicFeatureInfo.matchedFeatureMd5;
        dynamicFeatureInfo2.matchedAppFeatureMd5 = dynamicFeatureInfo.matchedAppFeatureMd5;
        dynamicFeatureInfo2.featureName = dynamicFeatureInfo.featureName;
        dynamicFeatureInfo2.md5 = dynamicFeatureInfo.md5;
        dynamicFeatureInfo2.priority = dynamicFeatureInfo.priority;
        dynamicFeatureInfo2.size = dynamicFeatureInfo.size;
        dynamicFeatureInfo2.status = dynamicFeatureInfo.status;
        dynamicFeatureInfo2.version = dynamicFeatureInfo.version;
        dynamicFeatureInfo2.url = dynamicFeatureInfo.url;
        dynamicFeatureInfo2.views = dynamicFeatureInfo.views;
        dynamicFeatureInfo2.fragments = dynamicFeatureInfo.fragments;
        dynamicFeatureInfo2.classes = dynamicFeatureInfo.classes;
        dynamicFeatureInfo2.implServices = dynamicFeatureInfo.implServices;
        dynamicFeatureInfo2.featureInitalClass = dynamicFeatureInfo.featureInitalClass;
        return dynamicFeatureInfo2;
    }

    private int getFeaturePriority(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23271408", new Object[]{this, str})).intValue();
        }
        return this.features.get(str).priority;
    }

    public static synchronized BundleInfoManager instance() {
        synchronized (BundleInfoManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BundleInfoManager) ipChange.ipc$dispatch("c1b1eda9", new Object[0]);
            }
            if (sManager == null) {
                sManager = new BundleInfoManager();
            }
            return sManager;
        }
    }

    private void report(String str, boolean z, long j, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35391a64", new Object[]{this, str, new Boolean(z), new Long(j), str2, new Integer(i)});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new d(z, str, j, str2, i), 5000L);
        }
    }

    public List<String> getActivityBindingFeatures(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("14426319", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    List<String> list = dynamicFeatureInfo.bindingActivities;
                    if (list != null && list.contains(str)) {
                        arrayList.add(dynamicFeatureInfo.featureName);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public BundleListing getBundleInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BundleListing) ipChange.ipc$dispatch("d3303193", new Object[]{this}) : this.mCurrentBundleListing;
    }

    public BundleListing.a getBundleInfoFromActivity(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BundleListing.a) ipChange.ipc$dispatch("be4df252", new Object[]{this, str});
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        BundleListing bundleListing = this.mCurrentBundleListing;
        if (!(bundleListing == null || bundleListing.getBundles() == null)) {
            for (BundleListing.a aVar : this.mCurrentBundleListing.bundles.values()) {
                if (aVar.g.containsKey(str)) {
                    return aVar;
                }
            }
            new StringBuilder("Could not find info for: ").append(str);
        }
        return null;
    }

    public BundleListing.a getBundleInfoFromReceiver(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BundleListing.a) ipChange.ipc$dispatch("d48b9932", new Object[]{this, str});
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        BundleListing bundleListing = this.mCurrentBundleListing;
        if (!(bundleListing == null || bundleListing.getBundles() == null)) {
            for (BundleListing.a aVar : this.mCurrentBundleListing.bundles.values()) {
                if (aVar.f.containsKey(str)) {
                    return aVar;
                }
            }
            new StringBuilder("Could not find info for: ").append(str);
        }
        return null;
    }

    public BundleListing.a getBundleInfoFromService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BundleListing.a) ipChange.ipc$dispatch("9fe57c98", new Object[]{this, str});
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        BundleListing bundleListing = this.mCurrentBundleListing;
        if (!(bundleListing == null || bundleListing.getBundles() == null)) {
            for (BundleListing.a aVar : this.mCurrentBundleListing.bundles.values()) {
                if (aVar.h.containsKey(str)) {
                    return aVar;
                }
            }
            new StringBuilder("Could not find info for: ").append(str);
        }
        return null;
    }

    public String getDownGradeUri(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87eade42", new Object[]{this, str});
        }
        BundleListing bundleListing = this.mCurrentBundleListing;
        if (bundleListing == null || bundleListing.getBundles().size() <= 0) {
            return "";
        }
        for (BundleListing.a aVar : this.mCurrentBundleListing.bundles.values()) {
            if (aVar.f4604a.booleanValue() && aVar.c.equals(str)) {
                return aVar.e;
            }
        }
        return "";
    }

    public DynamicFeatureInfo getDynamicFeatureInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicFeatureInfo) ipChange.ipc$dispatch("936fbedb", new Object[]{this, str});
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        synchronized (this.features) {
            try {
                DynamicFeatureInfo dynamicFeatureInfo = this.features.get(str);
                if (dynamicFeatureInfo == null) {
                    return null;
                }
                return deepCopy(dynamicFeatureInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<String> getDynamicFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6778dba", new Object[]{this});
        }
        return new ArrayList(this.features.keySet());
    }

    public DynamicFeatureInfo getDynamicInfoFromFragment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicFeatureInfo) ipChange.ipc$dispatch("b2920771", new Object[]{this, str});
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    if (dynamicFeatureInfo != null && dynamicFeatureInfo.fragments.contains(str)) {
                        return dynamicFeatureInfo;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<String> getFeatureBindingActivities(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9f1cdd64", new Object[]{this, str});
        }
        return this.features.get(str).bindingActivities;
    }

    public List<DynamicFeatureInfo> getFeatureInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5a9af81b", new Object[]{this});
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        ArrayList arrayList = new ArrayList();
        for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
            arrayList.add(deepCopy(dynamicFeatureInfo));
        }
        return arrayList;
    }

    public Collection<String> getHighInstallFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("c6eff8e0", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    if (dynamicFeatureInfo.priority == 1) {
                        arrayList.add(dynamicFeatureInfo.featureName);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public Collection<String> getImmediatelyInstallFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("fb782690", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    if (dynamicFeatureInfo.priority == 0) {
                        arrayList.add(dynamicFeatureInfo.featureName);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public Set<String> getLastestAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("cb233807", new Object[]{this});
        }
        return BundleInfoGenerator.lastestAppVersions;
    }

    public Collection<String> getLowInstallFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("e71308e6", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    if (dynamicFeatureInfo.priority > 9) {
                        arrayList.add(dynamicFeatureInfo.featureName);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public Collection<String> getMediumInstallFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("61575633", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    int i = dynamicFeatureInfo.priority;
                    if (i > 1 && i < 10) {
                        arrayList.add(dynamicFeatureInfo.featureName);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList, new c());
        return arrayList;
    }

    public String getRedirectActivity(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3704148e", new Object[]{this, str});
        }
        BundleListing bundleListing = this.mCurrentBundleListing;
        if (bundleListing == null || bundleListing.getBundles().size() <= 0) {
            return "";
        }
        for (BundleListing.a aVar : this.mCurrentBundleListing.bundles.values()) {
            if (aVar.f4604a.booleanValue() && aVar.c.equals(str)) {
                return aVar.d;
            }
        }
        return "";
    }

    public synchronized void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!this.mInit) {
            this.mContext = context;
            this.features = FeatureInfoGenerator.generate();
            this.mInit = true;
        }
    }

    public boolean isAppBundleEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11272d93", new Object[]{this})).booleanValue();
        }
        return BundleInfoGenerator.appBundleEnabled.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isAppComponent(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.android.tools.bundleInfo.BundleInfoManager.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "4ab4043b"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            boolean r2 = r5.mInit
            if (r2 != 0) goto L_0x0025
            com.taobao.tao.TaobaoApplication r2 = com.taobao.tao.TaobaoApplication.sApplication
            r5.init(r2)
        L_0x0025:
            com.android.tools.bundleInfo.BundleListing r2 = r5.mCurrentBundleListing
            if (r2 == 0) goto L_0x0061
            java.util.concurrent.ConcurrentHashMap r2 = r2.getBundles()
            if (r2 != 0) goto L_0x0030
            goto L_0x0061
        L_0x0030:
            com.android.tools.bundleInfo.BundleListing r2 = r5.mCurrentBundleListing
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.android.tools.bundleInfo.BundleListing$a> r2 = r2.bundles
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x003c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0061
            java.lang.Object r3 = r2.next()
            com.android.tools.bundleInfo.BundleListing$a r3 = (com.android.tools.bundleInfo.BundleListing.a) r3
            java.util.Map<java.lang.String, java.lang.Boolean> r4 = r3.f
            boolean r4 = r4.containsKey(r6)
            if (r4 != 0) goto L_0x0060
            java.util.Map<java.lang.String, java.lang.Boolean> r4 = r3.g
            boolean r4 = r4.containsKey(r6)
            if (r4 != 0) goto L_0x0060
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r3.h
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x003c
        L_0x0060:
            return r0
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.tools.bundleInfo.BundleInfoManager.isAppComponent(java.lang.String):boolean");
    }

    public boolean isDisabledAutoInstallFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af998ae", new Object[]{this})).booleanValue();
        }
        return BundleInfoGenerator.disabledAutoInstallFeatures.booleanValue();
    }

    public boolean isDynamicActivity(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("267f7179", new Object[]{this, str})).booleanValue();
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        BundleListing bundleListing = this.mCurrentBundleListing;
        if (!(bundleListing == null || bundleListing.getBundles() == null)) {
            for (BundleListing.a aVar : this.mCurrentBundleListing.bundles.values()) {
                if (aVar.f4604a.booleanValue() && ((HashMap) aVar.g).containsKey(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDynamicFragment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c70109fa", new Object[]{this, str})).booleanValue();
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    if (dynamicFeatureInfo != null && dynamicFeatureInfo.fragments.contains(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isDynamicReceiver(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74690059", new Object[]{this, str})).booleanValue();
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        BundleListing bundleListing = this.mCurrentBundleListing;
        if (!(bundleListing == null || bundleListing.getBundles() == null)) {
            for (BundleListing.a aVar : this.mCurrentBundleListing.bundles.values()) {
                if (aVar.f4604a.booleanValue() && ((HashMap) aVar.f).containsKey(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDynamicService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("922f5bd5", new Object[]{this, str})).booleanValue();
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        BundleListing bundleListing = this.mCurrentBundleListing;
        if (!(bundleListing == null || bundleListing.getBundles() == null)) {
            for (BundleListing.a aVar : this.mCurrentBundleListing.bundles.values()) {
                if (aVar.f4604a.booleanValue() && ((HashMap) aVar.h).containsKey(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDynamicView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc2d170f", new Object[]{this, str})).booleanValue();
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    if (dynamicFeatureInfo != null && dynamicFeatureInfo.views.contains(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isFlexaEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("553867ee", new Object[]{this})).booleanValue();
        }
        return BundleInfoGenerator.flexaEnabled.booleanValue();
    }

    public boolean isLocalMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("688342f", new Object[]{this})).booleanValue();
        }
        return BundleInfoGenerator.localMode.booleanValue();
    }

    public boolean isMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public String queryFeatureFromClassName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4a072a4", new Object[]{this, str});
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    if (dynamicFeatureInfo != null && dynamicFeatureInfo.classes.contains(str)) {
                        return dynamicFeatureInfo.featureName;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String queryFeatureFromFragment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a1500e7", new Object[]{this, str});
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    if (dynamicFeatureInfo != null && dynamicFeatureInfo.fragments.contains(str)) {
                        return dynamicFeatureInfo.featureName;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String queryFeatureFromInitalClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e00368a", new Object[]{this, str});
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    if (!(dynamicFeatureInfo == null || TextUtils.isEmpty(dynamicFeatureInfo.featureInitalClass) || !dynamicFeatureInfo.featureInitalClass.equals(str))) {
                        return dynamicFeatureInfo.featureName;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String queryFeatureFromService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f5a05d2", new Object[]{this, str});
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    if (dynamicFeatureInfo != null && dynamicFeatureInfo.implServices.containsKey(str)) {
                        return dynamicFeatureInfo.featureName;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String queryFeatureFromView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ecf66f2", new Object[]{this, str});
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    if (dynamicFeatureInfo != null && dynamicFeatureInfo.views.contains(str)) {
                        return dynamicFeatureInfo.featureName;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String queryFeatureInitialClassName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de5e1b22", new Object[]{this, str});
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    if (dynamicFeatureInfo != null && dynamicFeatureInfo.featureName.equals(str)) {
                        return dynamicFeatureInfo.featureInitalClass;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String queryServiceFromInterface(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7949ef0d", new Object[]{this, str});
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    if (dynamicFeatureInfo != null && dynamicFeatureInfo.implServices.containsKey(str)) {
                        return dynamicFeatureInfo.implServices.get(str);
                    }
                }
                for (BundleListing.a aVar : this.mCurrentBundleListing.getBundles().values()) {
                    String str2 = aVar.k.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        return str2;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void updateFeatureStatus(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5994773", new Object[]{this, str, new Integer(i)});
            return;
        }
        synchronized (this.features) {
            try {
                if (this.features.containsKey(str)) {
                    this.features.get(str).status = i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public BundleListing.a getBundleInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BundleListing.a) ipChange.ipc$dispatch("707b27d9", new Object[]{this, str});
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        BundleListing bundleListing = this.mCurrentBundleListing;
        if (!(bundleListing == null || bundleListing.getBundles() == null)) {
            BundleListing.a aVar = this.mCurrentBundleListing.getBundles().get(str);
            if (aVar != null) {
                return aVar;
            }
            new StringBuilder("Could not find info for: ").append(str);
        }
        return null;
    }

    public String queryServiceFromInterface(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60b97143", new Object[]{this, str, str2});
        }
        if (!this.mInit) {
            init(TaobaoApplication.sApplication);
        }
        synchronized (this.features) {
            try {
                for (DynamicFeatureInfo dynamicFeatureInfo : this.features.values()) {
                    if (dynamicFeatureInfo != null && dynamicFeatureInfo.implServices.containsKey(str) && dynamicFeatureInfo.featureName.equals(str2)) {
                        return dynamicFeatureInfo.implServices.get(str);
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
