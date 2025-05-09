package com.taobao.flowcustoms.afc.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.adaemon.TriggerService;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.ah0;
import tb.cmp;
import tb.fxp;
import tb.pg0;
import tb.t2o;
import tb.vp9;
import tb.zsa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AfcUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String c;
    public static String d;
    public static long f;

    /* renamed from: a  reason: collision with root package name */
    public static final String f10573a = "android.permission.READ_PHONE_STATE";
    public static int b = 0;
    public static boolean e = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum FlowType {
        SHARE(1, "afc_share"),
        MESSAGE(2, "afc_message"),
        LINK(3, "afc_link"),
        LAUNCH(4, "afc_launch");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int code;
        private String descs;

        FlowType(int i, String str) {
            this.code = i;
            this.descs = str;
        }

        public static /* synthetic */ String access$000(FlowType flowType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("771e15d6", new Object[]{flowType});
            }
            return flowType.descs;
        }

        public static String getDesc(int i) {
            FlowType[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("989bf08b", new Object[]{new Integer(i)});
            }
            for (FlowType flowType : values()) {
                if (flowType.code == i) {
                    return flowType.descs;
                }
            }
            return null;
        }

        public static /* synthetic */ Object ipc$super(FlowType flowType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/flowcustoms/afc/utils/AfcUtils$FlowType");
        }

        public static FlowType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FlowType) ipChange.ipc$dispatch("c6adba10", new Object[]{str});
            }
            return (FlowType) Enum.valueOf(FlowType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (AfcCustomSdk.h().f10563a != null && Boolean.parseBoolean(pg0.i().c("enableTaid", "true"))) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("devInitTime", String.valueOf(Build.TIME));
                    hashMap.put("sysBootTime", AfcUtils.a());
                    hashMap.put("sysUTime", AfcUtils.b());
                    vp9.a("linkx", "AFCUtils === reportTaid. " + hashMap.toString());
                    ah0.d(ah0.AFC_FLOW_TAID, null, null, hashMap);
                }
            } catch (Throwable unused) {
                vp9.a("linkx", "AFCUtils === reportTaid error");
            }
        }
    }

    static {
        t2o.a(467664977);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return h();
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return q();
    }

    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6064439", new Object[]{str, str2});
        }
        if (!TextUtils.equals("ali.open.nav", str)) {
            return str;
        }
        return str + "." + str2;
    }

    public static String e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb2d5a20", new Object[]{activity});
        }
        if (activity == null) {
            return "";
        }
        return activity.getClass().getName() + "@" + Integer.toHexString(activity.hashCode());
    }

    public static long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dde0e2cb", new Object[0])).longValue();
        }
        return f;
    }

    public static long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eecf132b", new Object[0])).longValue();
        }
        return System.currentTimeMillis();
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b9f9480", new Object[0]);
        }
        if (!TextUtils.isEmpty(d)) {
            return d;
        }
        try {
            char[] cArr = new char[36];
            if (36 == new FileReader("/proc/sys/kernel/random/boot_id").read(cArr)) {
                d = String.valueOf(cArr);
            }
        } catch (Exception unused) {
            d = "unknown";
        }
        return d;
    }

    public static String i(MessageDigest messageDigest) {
        byte[] digest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ebf7644", new Object[]{messageDigest});
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : messageDigest.digest()) {
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString(b2 & 15));
        }
        return sb.toString();
    }

    public static String j(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c75b864f", new Object[]{context, new Boolean(z)});
        }
        if (context != null && t()) {
            try {
                if (ContextCompat.checkSelfPermission(context, f10573a) == 0) {
                    return ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId((TelephonyManager) context.getSystemService("phone"));
                }
                if (z) {
                    ah0.d(ah0.ARG1_DEVICE_INFO_APPLY_PRIVILEGE_COUNT, "", "", null);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    public static String k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bee4406f", new Object[]{context});
        }
        if (context != null && t()) {
            try {
                if (ContextCompat.checkSelfPermission(context, f10573a) == 0) {
                    return ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId((TelephonyManager) context.getSystemService("phone"));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    public static String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a46456c7", new Object[]{str});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return i(instance);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String m(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fdc4ae3", new Object[]{application});
        }
        if (application != null) {
            return application.getPackageName();
        }
        return "";
    }

    public static int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2bade6c2", new Object[0])).intValue();
        }
        try {
            return TriggerService.f;
        } catch (Throwable unused) {
            vp9.b("linkx", "AFCUtils === getSimpleProcessTriggerGroupType === not support.");
            return -1;
        }
    }

    public static int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("152908e5", new Object[0])).intValue();
        }
        try {
            return TriggerService.e;
        } catch (Throwable unused) {
            vp9.b("linkx", "AFCUtils === getSimpleProcessTriggerType === not support.");
            return -1;
        }
    }

    public static String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdf3f79e", new Object[0]);
        }
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        try {
            byte[] bArr = new byte[256];
            String[] split = new String(bArr, 0, Runtime.getRuntime().exec("stat -c %X.%x /data/data").getInputStream().read(bArr), "utf-8").trim().split("[ \\|.]");
            if (split != null) {
                c = String.format("%d.%09d", Integer.valueOf(split.length > 0 ? Integer.valueOf(split[0]).intValue() : 0), Long.valueOf(split.length > 3 ? Long.valueOf(split[3]).longValue() : 0L));
            }
        } catch (Exception unused) {
            c = "unknown";
        }
        return c;
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77bcc720", new Object[0])).booleanValue();
        }
        try {
            return Boolean.valueOf(pg0.i().c("is_get_device_imei", "false")).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b87c84e5", new Object[0])).booleanValue();
        }
        try {
            return fxp.g(fxp.j()) == -2;
        } catch (Throwable unused) {
            vp9.b("linkx", "AFCUtils === isSimpleMainProcess === not support.");
            return false;
        }
    }

    public static void w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7b977f3", new Object[]{context});
        } else {
            cmp.b(context).d("app_first_installed", Boolean.FALSE);
        }
    }

    public static String y(Activity activity) {
        try {
            Field declaredField = Class.forName("android.app.Activity").getDeclaredField("mReferrer");
            declaredField.setAccessible(true);
            return (String) declaredField.get(activity);
        } catch (Exception e2) {
            vp9.a("linkx", "AFCUtils === reflectGetReferrer: 异常：" + e2.getMessage());
            return "";
        }
    }

    public static void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf09a23", new Object[0]);
        } else {
            zsa.b.a(new a());
        }
    }

    public static String c(Activity activity) {
        ComponentName componentName;
        ComponentName componentName2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b90f0e77", new Object[]{activity});
        }
        String str = "";
        if (activity == null) {
            return str;
        }
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                String y = y(activity);
                if (!TextUtils.isEmpty(y) && !y.equals(m(AfcCustomSdk.h().f10563a))) {
                    str = y;
                }
            } else if (b == 0) {
                Iterator<ActivityManager.RunningTaskInfo> it = ((ActivityManager) activity.getSystemService("activity")).getRunningTasks(2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningTaskInfo next = it.next();
                    componentName = next.baseActivity;
                    if (!componentName.getPackageName().equals(activity.getPackageName())) {
                        componentName2 = next.baseActivity;
                        str = componentName2.getPackageName();
                        break;
                    }
                }
                b++;
            }
        } catch (Exception e2) {
            vp9.a("linkx", "AFCUtils === extractPackageName: 异常：" + e2.getMessage());
        }
        if (!TextUtils.isEmpty(str)) {
            vp9.b("linkx", "AFCUtils === extractPackageName: 包名是：" + str);
        }
        return str;
    }

    public static boolean s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("902c5a30", new Object[]{context})).booleanValue();
        }
        if (e) {
            return true;
        }
        e = ((Boolean) cmp.b(context).a("app_first_installed", Boolean.TRUE)).booleanValue();
        vp9.a("linkx", "AFCUtils === isFirstInstall === APP首次安装打开:" + e);
        return e;
    }

    public static String x(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f519a1f", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        try {
            if ("212200".equals(context.getString(context.getResources().getIdentifier("ttid", "string", "com.taobao.taobao")))) {
                return "";
            }
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (!clipboardManager.hasPrimaryClip()) {
                return "";
            }
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if ((primaryClip == null ? 0 : primaryClip.getItemCount()) <= 0 || primaryClip.getItemAt(0) == null || primaryClip.getItemAt(0).getText() == null) {
                return "";
            }
            return primaryClip.getItemAt(0).getText().toString();
        } catch (Exception e2) {
            vp9.b("linkx", "AFCUtils === readClipBoard === 读取剪切板异常：" + e2);
            return "";
        }
    }

    public static String p(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce5a4b69", new Object[]{list, str});
        }
        if (!(list == null || list.size() == 0)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
                sb.append(str);
            }
            try {
                return sb.toString().substring(0, sb.length() - 1);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    public static boolean u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("376ec2ce", new Object[]{str})).booleanValue();
        }
        return str != null && (str.contains("tbopen://m.taobao.com/sso") || str.contains("tbopen://m.taobao.com/getway/oauth"));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String r(com.taobao.flowcustoms.afc.utils.AfcUtils.FlowType r17, java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.flowcustoms.afc.utils.AfcUtils.r(com.taobao.flowcustoms.afc.utils.AfcUtils$FlowType, java.lang.String, java.util.Map):java.lang.String");
    }
}
