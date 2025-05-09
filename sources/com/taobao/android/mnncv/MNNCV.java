package com.taobao.android.mnncv;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPython;
import com.taobao.android.mnncv.mtop.MRTConfigRequest;
import com.taobao.mrt.MRT;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTPythonLibDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.taobao.orange.OrangeConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.aqh;
import tb.bzn;
import tb.fh9;
import tb.gqh;
import tb.if4;
import tb.iph;
import tb.kgh;
import tb.oqh;
import tb.rqh;
import tb.xqh;
import tb.zqh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MNNCV {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_WALLE_CONFIG_SYNC = "com.taobao.mrt.walle_config";
    public static final String CONFIG_UPDATE_ORANGE_NAMESPACE = "EdgeComputingIsEnabled";
    private static final String TAG = "MNNCV";
    public static final String TASK_READY = "com.taobao.mrt.cv_task_ready";
    private static boolean mAvailable = false;
    private static boolean mInit = false;
    private static volatile boolean mRemoteConfigArrive = false;
    public static final String mServiceId = "MNNCV";
    public static final String mServiceIdCache = "MNNCV-Cache";
    private static volatile boolean mTaskReadyMsgSend;
    private static HashSet mValidTaskName = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f8982a;

        public a(Context context) {
            this.f8982a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MNNCV.access$000(this.f8982a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements MRTConfigRequest.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f8983a;

        public b(Context context) {
            this.f8983a = context;
        }

        @Override // com.taobao.android.mnncv.mtop.MRTConfigRequest.c
        public void a(MRTRuntimeException mRTRuntimeException, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e64f9ad9", new Object[]{this, mRTRuntimeException, str});
                return;
            }
            if (MRT.j()) {
                kgh.a("MNNCV", "e:" + mRTRuntimeException + ", config:" + str);
            }
            MNNCV.access$100(this.f8983a, str);
            if4.b().d(str);
        }
    }

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            asyncFetchCVTask(context);
        }
    }

    public static /* synthetic */ void access$100(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd8dda", new Object[]{context, str});
        } else {
            parseAndUpdateConfig(context, str);
        }
    }

    public static void addToValidTaskNameMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bf0c9d", new Object[]{str});
            return;
        }
        synchronized (mValidTaskName) {
            mValidTaskName.add(str);
        }
    }

    private static void asyncFetchCVTask(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f3ed2b", new Object[]{context});
        } else if (!isCVDisabled()) {
            MRTConfigRequest.h(MRT.f11137a, new b(context));
        }
    }

    public static List<String> getTppLibs() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd700974", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        try {
            String config = OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "libName", "");
            if (!TextUtils.isEmpty(config) && (split = config.trim().split(",")) != null) {
                for (String str : split) {
                    arrayList.add(str.trim());
                }
            }
        } catch (Throwable th) {
            kgh.t("MNNCV", "get orange config failed", th);
        }
        return arrayList;
    }

    public static synchronized void init(Context context) {
        synchronized (MNNCV.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{context});
            } else if (!mInit) {
                kgh.j("MNNCV", "init");
                AliNNPython.initialize(context);
                if (!AliNNPython.nativeAvailable()) {
                    kgh.s("MNNCV", "AliNNPython init failed");
                    return;
                }
                xqh.d();
                fh9.a(context);
                if (isLowDevice()) {
                    kgh.s("MNNCV", "low device,not start MNNCV");
                    mInit = true;
                    return;
                }
                initMNNPyBridge(context);
                mAvailable = bzn.d().c("mnncv").i();
                kgh.j("[MNNCV]", "Load Lib With RemoteSo -" + mAvailable);
                oqh.d().c(1, 0, "MNNCV");
                oqh.d().c(0, 1, mServiceIdCache);
                asyncFetchCVTask(context);
                MRTConfigRequest.e(new a(context));
                mInit = true;
            }
        }
    }

    private static void initMNNPyBridge(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fccbcdb2", new Object[]{context});
            return;
        }
        try {
            if (iph.a()) {
                kgh.a("mnncv", "MNNBridge load success");
            } else {
                kgh.c("mnncv", "MNNBridge load fail");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void initNumPy(Context context) {
        try {
            Method method = Class.forName("com.alibaba.numpy.Numpy").getMethod("init", Context.class);
            if (method != null) {
                method.invoke(null, context);
            }
        } catch (Throwable th) {
            kgh.t("MRT.cv", "init numpy or cv error", th);
        }
    }

    private static void initOpenCV(Context context) {
        try {
            Method method = Class.forName("com.alibaba.opencv.OpenCv").getMethod("init", Context.class);
            if (method != null) {
                method.invoke(null, context);
            }
        } catch (Throwable th) {
            kgh.t("MRT.cv", "init alicvkit or cv error", th);
        }
    }

    public static boolean isAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[0])).booleanValue();
        }
        if (!mAvailable || !MRT.i()) {
            return false;
        }
        return true;
    }

    public static boolean isCVDisabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eea224c4", new Object[0])).booleanValue();
        }
        try {
            return Boolean.valueOf(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "isCVDisabled", "false")).booleanValue();
        } catch (Throwable th) {
            kgh.t("MNNCV", "get orange config failed", th);
            return false;
        }
    }

    private static boolean isLowDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[0])).booleanValue();
        }
        gqh a2 = zqh.d().a();
        if (a2 == null) {
            return false;
        }
        return "low".equalsIgnoreCase(a2.getDeviceLevel());
    }

    public static boolean isTaskRunnable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d2f3a1", new Object[]{str})).booleanValue();
        }
        return mValidTaskName.contains(str);
    }

    public static void registerOrUpdateTask(MRTTaskDescription mRTTaskDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21353657", new Object[]{mRTTaskDescription});
            return;
        }
        MRTTaskDescription e = oqh.d().e(mRTTaskDescription.name);
        if (e == null) {
            oqh.d().i(mRTTaskDescription);
        } else if (!mRTTaskDescription.equals(e)) {
            oqh.d().i(mRTTaskDescription);
        } else {
            kgh.j("MNNCV", "task " + mRTTaskDescription.name + " config is same :" + mRTTaskDescription.cid + "&" + e.cid);
        }
    }

    public static void updateValidTaskNameMap(Set set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce668fdf", new Object[]{set});
            return;
        }
        synchronized (mValidTaskName) {
            mValidTaskName.clear();
            mValidTaskName.addAll(set);
        }
    }

    private static synchronized void parseAndUpdateConfig(Context context, String str) {
        synchronized (MNNCV.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1cf71c", new Object[]{context, str});
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                aqh aqhVar = new aqh(str);
                List<MRTPythonLibDescription> list = aqhVar.b;
                if (list != null && list.size() > 0) {
                    List<String> tppLibs = getTppLibs();
                    for (MRTPythonLibDescription mRTPythonLibDescription : aqhVar.b) {
                        if (!tppLibs.contains(mRTPythonLibDescription.resourceName)) {
                            rqh.b().e(mRTPythonLibDescription);
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (MRTTaskDescription mRTTaskDescription : aqhVar.f15937a) {
                    if (mRTTaskDescription != null) {
                        registerOrUpdateTask(mRTTaskDescription);
                        hashSet.add(mRTTaskDescription.name);
                    }
                }
                mRemoteConfigArrive = true;
                updateValidTaskNameMap(hashSet);
                Intent intent = new Intent(ACTION_WALLE_CONFIG_SYNC);
                intent.putExtra("result", aqhVar.c);
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                sendCVTaskReady(context);
            } else {
                kgh.s("MNNCV", "cv config sync failed:");
            }
        }
    }

    private static synchronized void sendCVTaskReady(Context context) {
        synchronized (MNNCV.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6b9a89e", new Object[]{context});
            } else if (mTaskReadyMsgSend) {
                kgh.j("MNNCV", "cv_task_ready msg has sent");
            } else {
                if (isAvailable()) {
                    mTaskReadyMsgSend = true;
                    LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.taobao.mrt.cv_task_ready"));
                    xqh.c();
                    kgh.s("MNNCV", "send cv_task_ready msg");
                }
            }
        }
    }
}
