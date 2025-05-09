package com.taobao.analysis.scene;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.ALog;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.abtest.ABTestCenter;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.message.uikit.util.ActivityJumpUtil;
import com.taobao.tao.TBMainHost;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.c21;
import tb.chb;
import tb.ctf;
import tb.e1r;
import tb.gjv;
import tb.hhg;
import tb.jj1;
import tb.mh1;
import tb.mk7;
import tb.qp0;
import tb.rg0;
import tb.t11;
import tb.u11;
import tb.v11;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SceneIdentifier {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_HOMEPAGE_EXIT_BY_TWO_CLICK = "HOMEPAGE_EXIT_BY_TWO_CLICK";
    public static final int DEVICE_LEVEL_HIGH = 1;
    public static final int DEVICE_LEVEL_LOW = 3;
    public static final int DEVICE_LEVEL_MID = 2;
    public static final int DEVICE_LEVEL_UNKNOWN = 0;
    public static final String PAGE_WELCOME = "com.taobao.tao.welcome.Welcome";
    public static final String TAG = "falco.SceneIdentifier";
    private static final String TAG_FIRST_LAUNCH = "isFirstLaunch";
    private static final String TAG_NEW_INSTALL = "isFullNewInstall";
    public static final int TYPE_COVER_LAUNCH = 2;
    public static final int TYPE_FULL_NEW_LAUNCH = 1;
    public static final int TYPE_HOT_LAUNCH = 3;
    public static final int TYPE_LUANCH_UNKNOWN = -1;
    public static final int TYPE_NORMAL_COLD_LAUNCH = 0;
    public static final int USER_TYPE_INNER = 1;
    public static final int USER_TYPE_NORMAL = 0;
    public static final int USER_TYPE_VIP = 2;
    private static volatile long appLaunchTime = 0;
    private static String bgType = null;
    private static volatile String currentPageName = "com.taobao.tao.welcome.Welcome";
    private static volatile int deviceLevel = 0;
    private static volatile long homeCreateTime = 0;
    private static long homeFragmentCreateTime = 0;
    private static volatile boolean isBackground = false;
    private static volatile Boolean isFromExternal = null;
    private static volatile Boolean isGrayVersion = null;
    private static Field isLauncherStartField = null;
    private static boolean isLinkManagerValid = false;
    private static boolean isTbMainValid = false;
    private static Field jumpUrlField = null;
    private static volatile long landingCompletionTime = 0;
    private static volatile long landingCreateTime = 0;
    private static Field landingUrlField = null;
    private static volatile long lastLaunchTime = 0;
    private static long launchPicEndTime = 0;
    private static Class linkMangerClazz = null;
    private static volatile long pageCreateTime = 0;
    private static volatile long pageResumeTime = 0;
    private static volatile String processName = null;
    private static volatile long processStartTime = 0;
    private static final BroadcastReceiver receiver;
    private static volatile int startType = -1;
    private static Class tbMainClazz;
    private static Method tbMainMethod;
    private static List<String> landingWhiteList = new ArrayList();
    private static volatile boolean isLandingFinished = false;
    private static AtomicBoolean isApmInited = new AtomicBoolean(false);
    private static CopyOnWriteArraySet<d> listeners = new CopyOnWriteArraySet<>();
    private static AtomicBoolean contextInitialize = new AtomicBoolean(false);
    private static volatile int userType = 0;
    private static volatile int processId = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements t11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else if (activity != null) {
                long currentTimeMillis = System.currentTimeMillis();
                SceneIdentifier.access$002(currentTimeMillis);
                SceneIdentifier.access$102(activity.getLocalClassName());
                FullTraceAnalysis.getInstance().log(null, "fulltrace", "pageIn", SceneIdentifier.access$100());
                if (SceneIdentifier.access$200(activity)) {
                    SceneIdentifier.access$302(currentTimeMillis);
                    if (e1r.b()) {
                        Log.e(SceneIdentifier.TAG, "homeActivityCreate=" + SceneIdentifier.access$300());
                    }
                }
                if (!SceneIdentifier.access$400() && SceneIdentifier.access$500(activity)) {
                    SceneIdentifier.access$602(currentTimeMillis);
                }
                ctf.j().d(SceneIdentifier.access$100());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else if (activity != null) {
                ctf.j().e(activity.getLocalClassName());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else if (activity != null) {
                ctf.j().h(activity.getLocalClassName());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else if (activity != null) {
                String localClassName = activity.getLocalClassName();
                if (SceneIdentifier.access$100() == null || !SceneIdentifier.access$100().equals(localClassName)) {
                    SceneIdentifier.access$102(localClassName);
                    SceneIdentifier.access$702(System.currentTimeMillis());
                    FullTraceAnalysis.getInstance().log(null, "fulltrace", "pageIn", SceneIdentifier.access$100());
                } else {
                    SceneIdentifier.access$102(localClassName);
                    SceneIdentifier.access$702(System.currentTimeMillis());
                }
                ctf.j().g(localClassName, SceneIdentifier.getCurrentPageUrl());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements v11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.application.common.IAppLaunchListener
        public void d(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60cba989", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            int access$800 = SceneIdentifier.access$800();
            if (i == 1 && access$800 != 3) {
                SceneIdentifier.access$902(System.currentTimeMillis());
                SceneIdentifier.access$802(3);
                SceneIdentifier.access$1002(Boolean.valueOf(SceneIdentifier.access$1100()));
            }
            if (i2 == 0) {
                SceneIdentifier.access$402(false);
                if (e1r.b()) {
                    Log.e(SceneIdentifier.TAG, "LAUNCH_DRAW_START=" + System.currentTimeMillis());
                }
            } else if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            SceneIdentifier.access$402(true);
                            SceneIdentifier.access$1202(System.currentTimeMillis());
                            if (e1r.b()) {
                                Log.e(SceneIdentifier.TAG, "LAUNCH_COMPLETED=" + System.currentTimeMillis());
                            }
                        }
                    } else if (e1r.b()) {
                        Log.e(SceneIdentifier.TAG, "LAUNCH_SKI_INTERACTIVE=" + System.currentTimeMillis());
                    }
                } else if (e1r.b()) {
                    Log.e(SceneIdentifier.TAG, "LAUNCH_INTERACTIVE=" + System.currentTimeMillis());
                }
            } else if (e1r.b()) {
                Log.e(SceneIdentifier.TAG, "LAUNCH_VISIBLE=" + System.currentTimeMillis());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                SceneIdentifier.access$1302(true);
                SceneIdentifier.access$1400(true);
            } else if (i == 2) {
                SceneIdentifier.access$1302(false);
                SceneIdentifier.access$1502(null);
                SceneIdentifier.access$1400(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        void background();

        void foreground();
    }

    public static /* synthetic */ long access$002(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1550f5f", new Object[]{new Long(j)})).longValue();
        }
        pageCreateTime = j;
        return j;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return currentPageName;
    }

    public static /* synthetic */ Boolean access$1002(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("9d3c0ce2", new Object[]{bool});
        }
        isFromExternal = bool;
        return bool;
    }

    public static /* synthetic */ String access$102(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de613c1c", new Object[]{str});
        }
        currentPageName = str;
        return str;
    }

    public static /* synthetic */ boolean access$1100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ad12feb", new Object[0])).booleanValue();
        }
        return updateUrlLaunch();
    }

    public static /* synthetic */ long access$1202(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4aa021ce", new Object[]{new Long(j)})).longValue();
        }
        landingCompletionTime = j;
        return j;
    }

    public static /* synthetic */ boolean access$1302(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2818acd", new Object[]{new Boolean(z)})).booleanValue();
        }
        isBackground = z;
        return z;
    }

    public static /* synthetic */ void access$1400(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f9066a", new Object[]{new Boolean(z)});
        } else {
            notifyLifecycleListener(z);
        }
    }

    public static /* synthetic */ String access$1502(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("192d5d09", new Object[]{str});
        }
        bgType = str;
        return str;
    }

    public static /* synthetic */ boolean access$200(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c85448f", new Object[]{activity})).booleanValue();
        }
        return isTbMain(activity);
    }

    public static /* synthetic */ long access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b88b92e", new Object[0])).longValue();
        }
        return homeCreateTime;
    }

    public static /* synthetic */ long access$302(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18f895fc", new Object[]{new Long(j)})).longValue();
        }
        homeCreateTime = j;
        return j;
    }

    public static /* synthetic */ boolean access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("906ef47f", new Object[0])).booleanValue();
        }
        return isLandingFinished;
    }

    public static /* synthetic */ boolean access$402(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80d9fefb", new Object[]{new Boolean(z)})).booleanValue();
        }
        isLandingFinished = z;
        return z;
    }

    public static /* synthetic */ boolean access$500(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8874f212", new Object[]{activity})).booleanValue();
        }
        return isLandingActivity(activity);
    }

    public static /* synthetic */ long access$602(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("509c1c99", new Object[]{new Long(j)})).longValue();
        }
        landingCreateTime = j;
        return j;
    }

    public static /* synthetic */ long access$702(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b87d4978", new Object[]{new Long(j)})).longValue();
        }
        pageResumeTime = j;
        return j;
    }

    public static /* synthetic */ int access$800() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6407e172", new Object[0])).intValue();
        }
        return startType;
    }

    public static /* synthetic */ int access$802(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("205e7295", new Object[]{new Integer(i)})).intValue();
        }
        startType = i;
        return i;
    }

    public static /* synthetic */ long access$902(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("883fa336", new Object[]{new Long(j)})).longValue();
        }
        appLaunchTime = j;
        return j;
    }

    private static boolean checkApmInitStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af817e43", new Object[0])).booleanValue();
        }
        if (c21.g() == chb.DEFAULT) {
            return false;
        }
        if (isApmInited.compareAndSet(false, true)) {
            c21.a(new a(), true);
            c21.d(new b());
            c21.c(new c());
        }
        return true;
    }

    public static long getAppLaunchTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7dcd66", new Object[0])).longValue();
        }
        if (!checkApmInitStatus()) {
            return 0L;
        }
        long j = appLaunchTime;
        if (j != 0) {
            return j;
        }
        long j2 = c21.g().getLong("startProcessSystemTime", 0L);
        appLaunchTime = j2;
        return j2;
    }

    public static String getBgType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f262f604", new Object[0]);
        }
        if (isBackground) {
            return bgType;
        }
        return null;
    }

    public static String getBucketInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50e4520b", new Object[0]);
        }
        return ABTestCenter.getTBSpeedBucket();
    }

    public static String getCurrentPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f927f6fc", new Object[0]);
        }
        if (!checkApmInitStatus()) {
            return "com.taobao.tao.welcome.Welcome";
        }
        return currentPageName;
    }

    public static String getCurrentPageNameWithFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21acb6e6", new Object[0]);
        }
        if (!checkApmInitStatus()) {
            return "com.taobao.tao.welcome.Welcome";
        }
        chb g = c21.g();
        if (g != null) {
            String string = g.getString("currFragmentName", null);
            if (!TextUtils.isEmpty(string)) {
                return currentPageName + "_" + string;
            }
        }
        return currentPageName;
    }

    public static String getCurrentPageUrl() {
        chb g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6efb597c", new Object[0]);
        }
        if (!checkApmInitStatus() || (g = c21.g()) == null) {
            return null;
        }
        String string = g.getString("currActivitySchemaUrl", null);
        if (e1r.b()) {
            Log.e(TAG, "getCurrentPageUrl=" + string);
        }
        return string;
    }

    public static long getHomeCreateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e653a299", new Object[0])).longValue();
        }
        if (!checkApmInitStatus()) {
            return 0L;
        }
        return homeCreateTime;
    }

    public static long getHomeFragmentCreateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93cd8009", new Object[0])).longValue();
        }
        return homeFragmentCreateTime;
    }

    public static String getInstallType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d78321a", new Object[0]);
        }
        boolean z = c21.g().getBoolean(TAG_NEW_INSTALL, false);
        boolean z2 = c21.g().getBoolean(TAG_FIRST_LAUNCH, false);
        if (z) {
            return "NEW";
        }
        if (z2) {
            return "UPDATE";
        }
        return "NONE";
    }

    public static String getJumpUrl() {
        if (!isLinkManagerValid) {
            return null;
        }
        try {
            if (jumpUrlField == null) {
                jumpUrlField = linkMangerClazz.getField(rg0.JUMP_URL);
            }
            return (String) jumpUrlField.get(linkMangerClazz);
        } catch (Exception e) {
            ALog.e(TAG, "getJumpUrl failed.", null, e, new Object[0]);
            return null;
        }
    }

    public static long getLandingCompletionTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3923085", new Object[0])).longValue();
        }
        if (!checkApmInitStatus()) {
            return 0L;
        }
        return landingCompletionTime;
    }

    public static long getLandingCreateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1b8d625", new Object[0])).longValue();
        }
        if (!checkApmInitStatus()) {
            return 0L;
        }
        return landingCreateTime;
    }

    public static String getLandingUrl() {
        if (!isLinkManagerValid) {
            return null;
        }
        try {
            if (landingUrlField == null) {
                landingUrlField = linkMangerClazz.getField(ActivityJumpUtil.LANDING_URL);
            }
            return (String) landingUrlField.get(linkMangerClazz);
        } catch (Exception e) {
            ALog.e(TAG, "getLandingUrl failed.", null, e, new Object[0]);
            return null;
        }
    }

    public static long getLastLaunchTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5544fc7", new Object[0])).longValue();
        }
        if (!checkApmInitStatus()) {
            return 0L;
        }
        long j = lastLaunchTime;
        if (j != 0) {
            return j;
        }
        long j2 = c21.g().getLong("lastStartProcessTime", 0L);
        lastLaunchTime = j2;
        return j2;
    }

    public static long getLaunchFinishTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71d0d84", new Object[0])).longValue();
        }
        return landingCompletionTime;
    }

    public static long getPageCreateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("582d5c49", new Object[0])).longValue();
        }
        if (!checkApmInitStatus()) {
            return 0L;
        }
        return pageCreateTime;
    }

    public static long getPageResumeTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d717c27a", new Object[0])).longValue();
        }
        if (!checkApmInitStatus()) {
            return 0L;
        }
        return pageResumeTime;
    }

    public static int getProcessId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa1a83ae", new Object[0])).intValue();
        }
        if (processId != -1) {
            return processId;
        }
        processId = Process.myPid();
        return processId;
    }

    public static String getProcessName() {
        String processName2;
        if (processName != null) {
            return processName;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            processName2 = Application.getProcessName();
            processName = processName2;
        } else {
            try {
                Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                processName = (String) declaredMethod.invoke(null, new Object[0]);
            } catch (Exception unused) {
                processName = GlobalAppRuntimeInfo.getCurrentProcess();
            }
        }
        return processName;
    }

    public static long getProcessStartTime() {
        long j;
        long startUptimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95784991", new Object[0])).longValue();
        }
        boolean checkApmInitStatus = checkApmInitStatus();
        long j2 = processStartTime;
        if (j2 != 0) {
            return j2;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            long currentTimeMillis = System.currentTimeMillis();
            long uptimeMillis = SystemClock.uptimeMillis();
            startUptimeMillis = Process.getStartUptimeMillis();
            j = currentTimeMillis - (uptimeMillis - startUptimeMillis);
        } else if (!checkApmInitStatus) {
            return 0L;
        } else {
            j = c21.g().getLong("startProcessSystemTime", 0L);
        }
        processStartTime = j;
        return j;
    }

    public static int getStartType() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c914980", new Object[0])).intValue();
        }
        if (!checkApmInitStatus()) {
            return -1;
        }
        int i2 = startType;
        if (i2 != -1) {
            return i2;
        }
        chb g = c21.g();
        boolean z = g.getBoolean(TAG_NEW_INSTALL, false);
        if (z) {
            i = 1;
        } else {
            boolean z2 = g.getBoolean(TAG_FIRST_LAUNCH, false);
            if (z || !z2) {
                String string = g.getString("launchType", "COLD");
                if (z || z2 || !"COLD".equalsIgnoreCase(string)) {
                    i = "HOT".equalsIgnoreCase(string) ? 3 : i2;
                }
            } else {
                i = 2;
            }
        }
        startType = i;
        return i;
    }

    public static int getUserType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acace15", new Object[0])).intValue();
        }
        return userType;
    }

    public static boolean isAppBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ca5f730", new Object[0])).booleanValue();
        }
        if (!checkApmInitStatus()) {
            return false;
        }
        return isBackground;
    }

    public static boolean isGrayVersion() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d7b876", new Object[0])).booleanValue();
        }
        if (isGrayVersion == null) {
            String str = (String) hhg.a("appVersion", null);
            if (TextUtils.isEmpty(str)) {
                isGrayVersion = Boolean.FALSE;
            } else {
                String[] split = str.split("\\.");
                if (split != null && split.length == 4) {
                    z = true;
                }
                isGrayVersion = Boolean.valueOf(z);
            }
        }
        return isGrayVersion.booleanValue();
    }

    public static boolean isLaunchFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1028d21a", new Object[0])).booleanValue();
        }
        return isLandingFinished;
    }

    public static boolean isLowBuyer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95f36214", new Object[0])).booleanValue();
        }
        try {
            return jj1.h().m();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean isTbMain(Activity activity) {
        boolean z = true;
        if (!isTbMainValid) {
            return false;
        }
        try {
            if (tbMainMethod.invoke(tbMainClazz, activity) == null) {
                z = false;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isUrlLaunch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5809d083", new Object[0])).booleanValue();
        }
        isFromExternal = Boolean.valueOf(updateUrlLaunch());
        return isFromExternal.booleanValue();
    }

    public static void registerLifecycleListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea58273", new Object[]{dVar});
        } else if (dVar != null) {
            listeners.add(dVar);
        }
    }

    public static void setLaunchPicEndTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f0290a", new Object[]{new Long(j)});
            return;
        }
        if (e1r.b()) {
            Log.e(TAG, "pictureEnd=" + j);
            if (homeFragmentCreateTime != 0) {
                Log.e(TAG, "picDuration=" + (j - homeFragmentCreateTime));
            }
        }
        launchPicEndTime = j;
    }

    public static void unregisterLifecycleListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818bcbcc", new Object[]{dVar});
        } else {
            listeners.remove(dVar);
        }
    }

    private static boolean updateUrlLaunch() {
        if (!isLinkManagerValid) {
            return false;
        }
        try {
            if (isLauncherStartField == null) {
                isLauncherStartField = linkMangerClazz.getField("isLauncherStart");
            }
            return !isLauncherStartField.getBoolean(linkMangerClazz);
        } catch (Exception unused) {
            ALog.e(TAG, "isUrlLaunch failed.", null, new Object[0]);
            return false;
        }
    }

    static {
        try {
            IpChange ipChange = AfcLifeCycleCenter.$ipChange;
            linkMangerClazz = AfcLifeCycleCenter.class;
            landingWhiteList.add("com.taobao.search.sf.MainSearchResultActivity");
            landingWhiteList.add("com.taobao.browser.BrowserActivity");
            landingWhiteList.add("com.taobao.android.detail.wrapper.activity.DetailActivity");
            landingWhiteList.add("com.taobao.order.detail.ui.OrderDetailActivity");
            landingWhiteList.add("com.taobao.message.accounts.activity.AccountActivity");
            landingWhiteList.add("com.taobao.android.shop.activity.ShopHomePageActivity");
            landingWhiteList.add("com.taobao.weex.WXActivity");
            landingWhiteList.add("com.taobao.android.trade.cart.CartActivity");
            isLinkManagerValid = true;
        } catch (Exception e) {
            ALog.e(TAG, "AfcLifeCycleCenter not support.", null, e, new Object[0]);
            isLinkManagerValid = false;
        }
        try {
            IpChange ipChange2 = TBMainHost.$ipChange;
            tbMainClazz = TBMainHost.class;
            tbMainMethod = TBMainHost.class.getDeclaredMethod("fromActivity", Activity.class);
            isTbMainValid = true;
        } catch (Exception e2) {
            ALog.e(TAG, "TBMainHost not support.", null, e2, new Object[0]);
            isTbMainValid = false;
        }
        checkApmInitStatus();
        receiver = new BroadcastReceiver() { // from class: com.taobao.analysis.scene.SceneIdentifier.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/analysis/scene/SceneIdentifier$4");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange3 = $ipChange;
                if (ipChange3 instanceof IpChange) {
                    ipChange3.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (SceneIdentifier.ACTION_HOMEPAGE_EXIT_BY_TWO_CLICK.equals(intent.getAction())) {
                    SceneIdentifier.access$1502("back");
                }
            }
        };
    }

    private static void notifyLifecycleListener(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b24a658", new Object[]{new Boolean(z)});
            return;
        }
        Iterator<d> it = listeners.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (z) {
                try {
                    next.background();
                } catch (Exception e) {
                    ALog.e(TAG, "notifyListener exception.", null, e, new Object[0]);
                }
            } else {
                next.foreground();
            }
        }
    }

    private static boolean isLandingActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22235559", new Object[]{activity})).booleanValue();
        }
        String name = activity.getClass().getName();
        if (!"com.taobao.browser.BrowserActivity".equals(name)) {
            return landingWhiteList.contains(name) || isTbMain(activity);
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            String dataString = intent.getDataString();
            if (!TextUtils.isEmpty(dataString) && dataString.contains("s.click.taobao.com")) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (com.taobao.android.ab.api.ABGlobal.b(r4, "taobao", "tbspeed", "home_local_broadcast_optimize") != false) goto L_0x0044;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setContext(android.content.Context r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.analysis.scene.SceneIdentifier.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "1a164154"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            if (r4 != 0) goto L_0x0015
            return
        L_0x0015:
            java.util.concurrent.atomic.AtomicBoolean r2 = com.taobao.analysis.scene.SceneIdentifier.contextInitialize
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0053
            setUserType(r4)
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "HOMEPAGE_EXIT_BY_TWO_CLICK"
            r0.addAction(r1)
            android.content.pm.ApplicationInfo r1 = r4.getApplicationInfo()     // Catch: all -> 0x004e
            int r1 = r1.flags     // Catch: all -> 0x004e
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0035
            goto L_0x0044
        L_0x0035:
            java.lang.String r1 = "taobao"
            java.lang.String r2 = "tbspeed"
            java.lang.String r3 = "home_local_broadcast_optimize"
            boolean r1 = com.taobao.android.ab.api.ABGlobal.b(r4, r1, r2, r3)     // Catch: all -> 0x004e
            if (r1 == 0) goto L_0x004e
        L_0x0044:
            androidx.localbroadcastmanager.content.LocalBroadcastManager r4 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r4)
            android.content.BroadcastReceiver r1 = com.taobao.analysis.scene.SceneIdentifier.receiver
            r4.registerReceiver(r1, r0)
            goto L_0x0053
        L_0x004e:
            android.content.BroadcastReceiver r1 = com.taobao.analysis.scene.SceneIdentifier.receiver
            r4.registerReceiver(r1, r0)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.analysis.scene.SceneIdentifier.setContext(android.content.Context):void");
    }

    private static void setUserType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844bd25a", new Object[]{context});
        } else if (context != null) {
            try {
                userType = context.getSharedPreferences(gjv.INNER_USER_CONFIG, 0).getInt(mk7.USER_TYPE, 0);
                ALog.e(TAG, "[setUserType]", null, mh1.PRD_USER_TYPE, Integer.valueOf(userType));
            } catch (Exception e) {
                userType = 0;
                ALog.e(TAG, "[setUserType]failed.", null, e, new Object[0]);
            }
        }
    }

    public static int getDeviceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        if (deviceLevel != 0) {
            return deviceLevel;
        }
        int b2 = qp0.b();
        if (b2 == 0) {
            deviceLevel = 1;
        } else if (b2 == 1) {
            deviceLevel = 2;
        } else if (b2 != 2) {
            deviceLevel = 0;
        } else {
            deviceLevel = 3;
        }
        ALog.e(TAG, "[getDeviceLevel]", null, "hardwareLevel", Integer.valueOf(b2), "deviceLevel", Integer.valueOf(deviceLevel));
        return deviceLevel;
    }
}
