package com.alibaba.ut.abtest;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.a;
import com.alibaba.ut.abtest.internal.bucketing.DefaultVariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.bzu;
import tb.do8;
import tb.ku0;
import tb.n;
import tb.ogh;
import tb.t2o;
import tb.ydt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class UTABTest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_NAV = "UTABTestNav";
    public static final String COMPONENT_URI = "Rewrite";
    private static final VariationSet EMPTY_VARIATION_SET = new DefaultVariationSet(new do8());
    private static final String TAG = "UTABTest";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3375a;
        public final /* synthetic */ Object b;

        public a(String str, Object obj) {
            this.f3375a = str;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                n.j().k().f(this.f3375a, this.b);
            } catch (Throwable th) {
                ku0.j("UTABTest.activateServerInternal.Async", th);
            }
        }
    }

    static {
        t2o.a(961544256);
    }

    private UTABTest() {
    }

    public static VariationSet activate(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VariationSet) ipChange.ipc$dispatch("fadd607b", new Object[]{str, str2}) : activate(str, str2, null, null);
    }

    public static void activateServer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e361427", new Object[]{str});
        } else {
            activateServerInternal(str, null, false);
        }
    }

    public static void activateServerSync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f98759a2", new Object[]{str});
        } else {
            activateServerInternal(str, null, true);
        }
    }

    @Deprecated
    public static void addDataListener(String str, String str2, bzu bzuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc284c3e", new Object[]{str, str2, bzuVar});
            return;
        }
        try {
            if (!isInitialized()) {
                ogh.l(TAG, "请先调用 UTABTest.initialize() 方法初始化SDK。");
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && bzuVar != null) {
                ogh.e(TAG, "addDataListener. component=" + str + ", module=" + str2 + ", listener=" + bzuVar);
                n.j().e().q(str, str2, bzuVar);
                return;
            }
            ogh.l(TAG, "参数不合法，组件名称，模块名称或监听回调为空！");
        } catch (Throwable th) {
            ku0.j("UTABTest.addDataListener", th);
        }
    }

    public static String getAppActivateTrackId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2948a711", new Object[0]);
        }
        return n.j().k().d();
    }

    public static VariationSet getVariations(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VariationSet) ipChange.ipc$dispatch("78518cd8", new Object[]{str, str2}) : getVariations(str, str2, null);
    }

    public static void initBeforeExperimentTask(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21917510", new Object[]{context});
        } else {
            EVO.initBeforeExperimentTask(context);
        }
    }

    @Deprecated
    public static synchronized void initialize(Context context, com.alibaba.ut.abtest.a aVar) {
        synchronized (UTABTest.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e5c6f07", new Object[]{context, aVar});
            } else {
                EVO.initializeAsync(context, aVar);
            }
        }
    }

    @Deprecated
    public static synchronized void initializeSync(Context context, com.alibaba.ut.abtest.a aVar) {
        synchronized (UTABTest.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc432582", new Object[]{context, aVar});
            } else {
                EVO.initializeSync(context, aVar);
            }
        }
    }

    @Deprecated
    public static boolean isInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[0])).booleanValue();
        }
        return EVO.isInitialized();
    }

    public static a.C0105a newConfigurationBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.C0105a) ipChange.ipc$dispatch("714e113d", new Object[0]);
        }
        return new a.C0105a();
    }

    @Deprecated
    public static void removeDataListener(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bbe6d3d", new Object[]{str, str2});
        } else {
            removeDataListener(str, str2, null);
        }
    }

    @Deprecated
    public static synchronized void updateUserAccount(String str, String str2) {
        synchronized (UTABTest.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("782de874", new Object[]{str, str2});
            } else {
                EVO.updateUserAccount(str, str2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0139 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:6:0x0039, B:9:0x0049, B:13:0x0054, B:15:0x0062, B:17:0x006b, B:19:0x0071, B:22:0x007a, B:24:0x0080, B:26:0x008e, B:28:0x0097, B:31:0x00a2, B:33:0x00b0, B:35:0x00c2, B:36:0x00df, B:38:0x00e9, B:39:0x00f9, B:40:0x010e, B:41:0x0123, B:43:0x0129, B:49:0x0139, B:50:0x013b, B:54:0x0148, B:56:0x0152, B:58:0x0158, B:61:0x015f, B:62:0x0175, B:63:0x0185, B:65:0x0190, B:67:0x0196, B:70:0x019d, B:71:0x01c0, B:72:0x01e5, B:74:0x01eb), top: B:78:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0152 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:6:0x0039, B:9:0x0049, B:13:0x0054, B:15:0x0062, B:17:0x006b, B:19:0x0071, B:22:0x007a, B:24:0x0080, B:26:0x008e, B:28:0x0097, B:31:0x00a2, B:33:0x00b0, B:35:0x00c2, B:36:0x00df, B:38:0x00e9, B:39:0x00f9, B:40:0x010e, B:41:0x0123, B:43:0x0129, B:49:0x0139, B:50:0x013b, B:54:0x0148, B:56:0x0152, B:58:0x0158, B:61:0x015f, B:62:0x0175, B:63:0x0185, B:65:0x0190, B:67:0x0196, B:70:0x019d, B:71:0x01c0, B:72:0x01e5, B:74:0x01eb), top: B:78:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0185 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:6:0x0039, B:9:0x0049, B:13:0x0054, B:15:0x0062, B:17:0x006b, B:19:0x0071, B:22:0x007a, B:24:0x0080, B:26:0x008e, B:28:0x0097, B:31:0x00a2, B:33:0x00b0, B:35:0x00c2, B:36:0x00df, B:38:0x00e9, B:39:0x00f9, B:40:0x010e, B:41:0x0123, B:43:0x0129, B:49:0x0139, B:50:0x013b, B:54:0x0148, B:56:0x0152, B:58:0x0158, B:61:0x015f, B:62:0x0175, B:63:0x0185, B:65:0x0190, B:67:0x0196, B:70:0x019d, B:71:0x01c0, B:72:0x01e5, B:74:0x01eb), top: B:78:0x0039 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.ut.abtest.VariationSet activate(java.lang.String r18, java.lang.String r19, java.util.Map<java.lang.String, java.lang.Object> r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ut.abtest.UTABTest.activate(java.lang.String, java.lang.String, java.util.Map, java.lang.Object):com.alibaba.ut.abtest.VariationSet");
    }

    public static void activateServer(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2691e843", new Object[]{str, obj});
        } else {
            activateServerInternal(str, obj, false);
        }
    }

    private static void activateServerInternal(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc577ab4", new Object[]{str, obj, new Boolean(z)});
            return;
        }
        try {
            long nanoTime = System.nanoTime();
            if (!n.j().a().w()) {
                ogh.n(TAG, "【服务端实验】一休已禁止使用。");
            } else if (TextUtils.isEmpty(str)) {
                ogh.n(TAG, "【服务端实验】添加埋点规则失败，埋点规则不合法。");
            } else {
                if (z) {
                    n.j().k().f(str, obj);
                } else {
                    ydt.b(new a(str, obj));
                }
                long nanoTime2 = System.nanoTime();
                if (z) {
                    ku0.e(ku0.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER_SYNC, !TextUtils.isEmpty(str), nanoTime2 - nanoTime);
                } else {
                    ku0.e(ku0.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER, !TextUtils.isEmpty(str), nanoTime2 - nanoTime);
                }
                ku0.b(ku0.EXPERIMENT_ACTIVATE_COUNTER, ku0.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER);
            }
        } catch (Throwable th) {
            ku0.j("UTABTest.activateServerInternal", th);
        }
    }

    public static void activateServerSync(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd8e4fe", new Object[]{str, obj});
        } else {
            activateServerInternal(str, obj, true);
        }
    }

    public static VariationSet getVariations(String str, String str2, Map<String, Object> map) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("4dbf3835", new Object[]{str, str2, map});
        }
        try {
            long nanoTime = System.nanoTime();
            if (!isInitialized()) {
                ogh.l(TAG, "getVariations方法调用，需要先调用 UTABTest.initialize() 方法初始化SDK。");
                return EMPTY_VARIATION_SET;
            } else if (!n.j().a().w()) {
                ogh.n(TAG, "【运行实验】一休已禁止使用。");
                return EMPTY_VARIATION_SET;
            } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                ogh.n(TAG, "【运行实验】参数不合法，命名空间或实验标识为空！");
                return EMPTY_VARIATION_SET;
            } else {
                ogh.k(TAG, "【运行实验】获取实验变量。命名空间：" + str + "，实验标识：" + str2);
                VariationSet a2 = n.j().k().a(str, str2, map, false, null);
                if (a2 == null) {
                    a2 = EMPTY_VARIATION_SET;
                }
                long nanoTime2 = System.nanoTime();
                if (a2.size() > 0) {
                    z = true;
                }
                ku0.e(ku0.EXPERIMENT_ACTIVATE_STAT_TYPE_VARIATION, z, nanoTime2 - nanoTime);
                if (a2.size() == 0) {
                    ogh.k(TAG, "【运行实验】运行失败。命名空间：" + str + "，实验标识：" + str2);
                } else {
                    ku0.b(ku0.EXPERIMENT_EFFECTIVE_COUNTER, ku0.EXPERIMENT_ACTIVATE_STAT_TYPE_VARIATION);
                    ogh.k(TAG, "【运行实验】运行成功。命名空间：" + str + "，实验标识：" + str2 + "，进入实验分组：" + a2.getExperimentBucketId());
                }
                ku0.b(ku0.EXPERIMENT_ACTIVATE_COUNTER, ku0.EXPERIMENT_ACTIVATE_STAT_TYPE_VARIATION);
                return a2;
            }
        } catch (Throwable th) {
            ku0.j("UTABTest.getVariations", th);
            return EMPTY_VARIATION_SET;
        }
    }

    @Deprecated
    public static void removeDataListener(String str, String str2, bzu bzuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec851a1", new Object[]{str, str2, bzuVar});
            return;
        }
        try {
            if (!isInitialized()) {
                ogh.l(TAG, "请先调用 UTABTest.initialize() 方法初始化SDK。");
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                ogh.e(TAG, "removeDataListener. component=" + str + ", module=" + str2 + ", listener=" + bzuVar);
                n.j().e().o(str, str2, bzuVar);
                return;
            }
            ogh.l(TAG, "参数不合法，组件名称或模块名称为空！");
        } catch (Throwable th) {
            ku0.j("UTABTest.removeDataListener", th);
        }
    }
}
