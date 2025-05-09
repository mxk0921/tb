package com.alipay.mobile.common.logging;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.ProcessInfo;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ProcessInfoImpl implements ProcessInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final long A;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3942a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public Map<String, String> x = null;
    public Bundle y = null;
    public Uri z = null;

    public ProcessInfoImpl(Context context) {
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.A = -1L;
        if (context != null) {
            this.f3942a = context;
            String packageName = context.getPackageName();
            this.b = packageName;
            String b = b();
            this.d = b;
            this.e = packageName;
            String str = packageName + ":push";
            this.f = str;
            String str2 = packageName + ":tools";
            this.g = str2;
            String str3 = packageName + ":ext";
            this.h = str3;
            String str4 = packageName + ":region_helper";
            this.i = str4;
            boolean equals = packageName.equals(b);
            this.o = equals;
            boolean equals2 = str.equals(b);
            this.p = equals2;
            boolean equals3 = str2.equals(b);
            this.q = equals3;
            boolean equals4 = str3.equals(b);
            this.r = equals4;
            boolean equals5 = str4.equals(b);
            this.v = equals5;
            boolean equals6 = (packageName + ":sss").equals(b);
            this.w = equals6;
            this.s = b.startsWith(packageName.concat(":lite"));
            this.t = b.startsWith(packageName.concat(":sandboxed_"));
            this.u = isCurrentProcessIsolated();
            if (equals) {
                this.c = "main";
            } else if (equals2) {
                this.c = "push";
            } else if (equals3) {
                this.c = ProcessInfo.ALIAS_TOOLS;
            } else if (equals4) {
                this.c = "ext";
            } else if (equals5) {
                this.c = ProcessInfo.ALIAS_REGION_HELPER;
            } else if (equals6) {
                this.c = ProcessInfo.ALIAS_SSS;
            } else if (TextUtils.isEmpty(b)) {
                this.c = "unknown";
            } else {
                this.c = b.replace(packageName.concat(":"), "");
            }
            this.j = packageName + "-" + this.c;
            this.k = packageName.concat("-main");
            this.l = packageName.concat("-push");
            this.m = packageName.concat("-tools");
            this.n = packageName.concat("-ext");
            this.A = System.currentTimeMillis();
        }
    }

    public static Intent a(Object obj, String str) {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return (Intent) declaredField.get(obj);
    }

    public static boolean d(String str, Object obj) {
        if (ProcessInfo.RECORD_ACTIVITY.equals(str) || ProcessInfo.RECORD_RECEIVER.equals(str) || ProcessInfo.RECORD_SERVICE_CREATE.equals(str) || ProcessInfo.RECORD_SERVICE_BIND.equals(str) || ProcessInfo.RECORD_SERVICE_ARGS.equals(str) || ProcessInfo.RECORD_BACKUP_AGENT.equals(str) || ProcessInfo.RECORD_PROVIDER.equals(str) || ProcessInfo.RECORD_NEW_INTENT.equals(str) || ProcessInfo.RECORD_APP_BIND.equals(str)) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 28 || !ProcessInfo.CLIENT_TRANSACTION.equals(str)) {
            return false;
        }
        try {
            Field declaredField = obj.getClass().getDeclaredField("mActivityCallbacks");
            declaredField.setAccessible(true);
            List<Object> list = (List) declaredField.get(obj);
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (Object obj2 : list) {
                if (obj2.getClass().getSimpleName().equals(ProcessInfo.LAUNCH_ACTIVITY_ITEM)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void addStartupReasonParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5900db2d", new Object[]{this});
            return;
        }
        prepareStartupReason();
        try {
            Map<String, String> map = this.x;
            if (map == null) {
                LoggerFactory.getTraceLogger().warn("ProcessInfo", "addStartupReasonParams mStartupReason is null");
                return;
            }
            map.get("toString");
            CrashBridge.d();
            this.x.get(ProcessInfo.SR_ACTION_NAME);
            CrashBridge.d();
            this.x.get(ProcessInfo.SR_COMPONENT_NAME);
            CrashBridge.d();
            if (!TextUtils.isEmpty(this.x.get(LogContext.STORAGE_APPID))) {
                LoggerFactory.getLogContext().putContextParam(LogContext.STORAGE_APPID, this.x.get(ProcessInfo.SR_APP_ID));
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("ProcessInfo", "add CrashHeader StartupReason", th);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getExtProcessId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a181239", new Object[]{this})).intValue();
        }
        if (this.r) {
            return getProcessId();
        }
        return getProcessIdByName(this.h);
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getExtProcessName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9a828aa", new Object[]{this});
        }
        return this.h;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getExtProcessTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e40dd8c3", new Object[]{this});
        }
        return this.n;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getMainProcessId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78724d75", new Object[]{this})).intValue();
        }
        if (this.o) {
            return getProcessId();
        }
        return getProcessIdByName(this.e);
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getMainProcessName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f644bee", new Object[]{this});
        }
        return this.e;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getMainProcessTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("285e3cff", new Object[]{this});
        }
        return this.k;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getPackageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[]{this});
        }
        return this.b;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getProcessAlias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d25dbc2", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getProcessId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa1a83ae", new Object[]{this})).intValue();
        }
        return Process.myPid();
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getProcessIdByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61577bda", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.f3942a.getSystemService("activity")).getRunningAppProcesses()) {
                if (str.equals(runningAppProcessInfo.processName)) {
                    return runningAppProcessInfo.pid;
                }
            }
            return -1;
        } catch (Throwable th) {
            th.toString();
            return -1;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public Set<Integer> getProcessIdsByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("9d39ce61", new Object[]{this, str});
        }
        HashSet hashSet = new HashSet();
        if (TextUtils.isEmpty(str)) {
            return hashSet;
        }
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.f3942a.getSystemService("activity")).getRunningAppProcesses()) {
                if (str.equals(runningAppProcessInfo.processName)) {
                    hashSet.add(Integer.valueOf(runningAppProcessInfo.pid));
                }
            }
        } catch (Throwable th) {
            th.toString();
        }
        return hashSet;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getProcessName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62fd1115", new Object[]{this});
        }
        return this.d;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getProcessNameById(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("123a169a", new Object[]{this, new Integer(i)});
        }
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.f3942a.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == i) {
                    str = runningAppProcessInfo.processName;
                    break;
                }
            }
        } catch (Throwable th) {
            th.toString();
        }
        str = null;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public long getProcessStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95784991", new Object[]{this})).longValue();
        }
        return this.A;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getProcessTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b94b6f8", new Object[]{this});
        }
        return this.j;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getPushProcessId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4134a9b4", new Object[]{this})).intValue();
        }
        if (this.p) {
            return getProcessId();
        }
        return getProcessIdByName(this.f);
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getPushProcessName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f540314f", new Object[]{this});
        }
        return this.f;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getPushProcessTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dcafa77e", new Object[]{this});
        }
        return this.l;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getRegionHelperProcessId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1f3240c", new Object[]{this})).intValue();
        }
        if (this.v) {
            return getProcessId();
        }
        return getProcessIdByName(this.i);
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getRegionHelperProcessName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f8d27f7", new Object[]{this});
        }
        return this.i;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public Bundle getStartupBundle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d19a6274", new Object[]{this});
        }
        return this.y;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public Uri getStartupData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("6829d3cf", new Object[]{this});
        }
        return this.z;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public Map<String, String> getStartupReason() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b45ea527", new Object[]{this});
        }
        return this.x;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getThreadId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a77e935", new Object[]{this})).intValue();
        }
        return Process.myTid();
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getToolsProcessId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e9ab3f", new Object[]{this})).intValue();
        }
        if (this.q) {
            return getProcessId();
        }
        return getProcessIdByName(this.g);
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getToolsProcessName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1620f5e4", new Object[]{this});
        }
        return this.g;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getToolsProcessTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7097c49", new Object[]{this});
        }
        return this.m;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b14d7b6", new Object[]{this})).intValue();
        }
        return Process.myUid();
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isExtProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c7f8a63", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isExtProcessExist() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3ca9d0a", new Object[]{this})).booleanValue();
        }
        if (this.r || getProcessIdByName(this.h) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isIsolatedProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3de19317", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isLiteProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("472ca362", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isMainProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isMainProcessExist() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32b32a76", new Object[]{this})).booleanValue();
        }
        if (this.o || getProcessIdByName(this.e) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isPushProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d91a976", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isPushProcessExist() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c49ff1d7", new Object[]{this})).booleanValue();
        }
        if (this.p || getProcessIdByName(this.f) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isRegionHelperProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57c66dce", new Object[]{this})).booleanValue();
        }
        return this.v;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isRegionHelperProcessExist() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26f0247f", new Object[]{this})).booleanValue();
        }
        if (this.v || getProcessIdByName(this.i) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isSSSProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fca4f31", new Object[]{this})).booleanValue();
        }
        return this.w;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isSandboxProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a35d1cfd", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isStartupByLauncherIcon() {
        Map<String, String> startupReason;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3243420e", new Object[]{this})).booleanValue();
        }
        if (isMainProcess() && (startupReason = getStartupReason()) != null) {
            return "com.eg.android.AlipayGphone.AlipayLogin".equals(startupReason.get(ProcessInfo.SR_COMPONENT_NAME));
        }
        return false;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isToolsProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48cc47e9", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isToolsProcessExist() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f956344", new Object[]{this})).booleanValue();
        }
        if (this.q || getProcessIdByName(this.g) > 0) {
            return true;
        }
        return false;
    }

    public void prepareStartupReason() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b53ce1", new Object[]{this});
        } else if (this.x == null) {
            this.x = c(Looper.getMainLooper());
        }
    }

    public boolean isHuaweiPreloadDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84c2ff19", new Object[]{this})).booleanValue();
        }
        try {
            return PreferenceManager.getDefaultSharedPreferences(this.f3942a).getBoolean("huawei_preload_launch_models", "PAR-TL00 PAR-LX9 PAR-LX1 PAR-LX1M PAR-AL00 PAR-TL20".contains(Build.MODEL));
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isStartupByAnyActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e1cb11c", new Object[]{this})).booleanValue();
        }
        Map<String, String> startupReason = getStartupReason();
        if (startupReason == null) {
            return false;
        }
        return "true".equals(startupReason.get(ProcessInfo.SR_BY_ACTIVITY));
    }

    public static boolean isCurrentProcessIsolated() {
        try {
            Method declaredMethod = Process.class.getDeclaredMethod("isIsolated", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null && (invoke instanceof Boolean)) {
                    return ((Boolean) invoke).booleanValue();
                }
            }
        } catch (Throwable unused) {
        }
        int myUid = Process.myUid() % 100000;
        return myUid >= 99000 && myUid <= 99999;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #0 {all -> 0x0077, blocks: (B:3:0x000b, B:9:0x0045, B:10:0x004d, B:14:0x0057, B:18:0x0067, B:21:0x006e, B:25:0x0081, B:28:0x0089, B:30:0x008f, B:32:0x009b, B:33:0x00b6, B:34:0x00b7), top: B:150:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7 A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:3:0x000b, B:9:0x0045, B:10:0x004d, B:14:0x0057, B:18:0x0067, B:21:0x006e, B:25:0x0081, B:28:0x0089, B:30:0x008f, B:32:0x009b, B:33:0x00b6, B:34:0x00b7), top: B:150:0x000b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006d -> B:8:0x0043). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.String> c(android.os.Looper r19) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.ProcessInfoImpl.c(android.os.Looper):java.util.Map");
    }

    public final String b() {
        String str;
        try {
            Class<?> loadClass = getClass().getClassLoader().loadClass(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = loadClass.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Method declaredMethod2 = loadClass.getDeclaredMethod(ProcessUtils.GET_PROCESS_NAME, new Class[0]);
            declaredMethod2.setAccessible(true);
            str = (String) declaredMethod2.invoke(invoke, new Object[0]);
        } catch (Throwable unused) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Method declaredMethod3 = getClass().getClassLoader().loadClass("android.ddm.DdmHandleAppName").getDeclaredMethod("getAppName", new Class[0]);
            declaredMethod3.setAccessible(true);
            str = (String) declaredMethod3.invoke(null, new Object[0]);
        } catch (Throwable unused2) {
        }
        return !TextUtils.isEmpty(str) ? str : getProcessNameById(getProcessId());
    }
}
