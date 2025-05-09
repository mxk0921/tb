package tb;

import android.app.AppOpsManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.accs.common.Constants;
import com.taobao.wireless.link.model.BrandVersion;
import com.taobao.wireless.link.model.SupportBrandVersion;
import com.taobao.wireless.link.pop.PopMessageData;
import com.taobao.wireless.link.pop.recevier.AccsConnectReceiver;
import com.taobao.wireless.link.pop.recevier.PopScreenReceiver;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zhm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f32776a = "tbopen://m.taobao.com/tbopen/index.html?source=auto&action=ali.open.nav&module=h5&bc_fl_src=";

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f0b955", new Object[]{context});
            return;
        }
        mr4.b().b = null;
        cno.b(context).f("pop_message");
    }

    public static int b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88b66f1e", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70372876", new Object[0]);
        }
        Calendar instance = Calendar.getInstance();
        return String.format("%02d:%02d", Integer.valueOf(instance.get(11)), Integer.valueOf(instance.get(12)));
    }

    public static PopMessageData d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopMessageData) ipChange.ipc$dispatch("db14f126", new Object[]{context});
        }
        PopMessageData popMessageData = mr4.b().b;
        if (popMessageData != null && popMessageData.messageType != 0) {
            return popMessageData;
        }
        try {
            return (PopMessageData) cno.b(context).a("pop_message", new PopMessageData());
        } catch (Exception e) {
            irg.a("link_tag", "PopUtils === getPushMessage == 从本地获取消息解析失败：" + e);
            return popMessageData;
        }
    }

    public static long g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("782dfa0f", new Object[]{context})).longValue();
        }
        return ((Long) cno.b(context).a("requestTime", 0L)).longValue();
    }

    public static long h(PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fa80039", new Object[]{popMessageData})).longValue();
        }
        if (popMessageData != null) {
            long j = popMessageData.showTime;
            if (j <= 15000) {
                return j;
            }
        }
        return 15000L;
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e8a79ac", new Object[]{context})).booleanValue();
        }
        if (d(context).messageType != 0) {
            return true;
        }
        return false;
    }

    public static boolean j(PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9d74cdb", new Object[]{popMessageData})).booleanValue();
        }
        if (popMessageData == null) {
            return false;
        }
        String str = popMessageData.blackList;
        String str2 = ypg.e().b;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str.contains(str2);
    }

    public static boolean m(Context context, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b77f093", new Object[]{context, popMessageData})).booleanValue();
        }
        if (popMessageData == null) {
            return false;
        }
        int i = popMessageData.messageType;
        if (i == 1) {
            if (TextUtils.isEmpty(popMessageData.title) || TextUtils.isEmpty(popMessageData.subTitle) || TextUtils.isEmpty(popMessageData.rightButtonText) || TextUtils.isEmpty(popMessageData.rightButtonUrl)) {
                return false;
            }
            return true;
        } else if (i != 2) {
            return true;
        } else {
            if (TextUtils.isEmpty(popMessageData.clickUrl) || TextUtils.isEmpty(popMessageData.picUrl)) {
                return false;
            }
            return true;
        }
    }

    public static boolean n(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66eb7f17", new Object[]{new Long(j), new Long(j2)})).booleanValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(6);
        instance.setTimeInMillis(j2);
        if (i == instance.get(6)) {
            return true;
        }
        return false;
    }

    public static void o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a56f56a", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            int i = Build.VERSION.SDK_INT;
            if (i <= 25) {
                intent.putExtra("app_package", context.getPackageName());
                intent.putExtra("app_uid", context.getApplicationInfo().uid);
            }
            if (i >= 26) {
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.putExtra(NotificationCompat.EXTRA_CHANNEL_ID, context.getApplicationInfo().uid);
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            irg.b("link_tag", "PopUtils === jumpPushPage === 跳转通知页面异常，跳转到应用详情页面" + e);
            try {
                Intent intent2 = new Intent();
                intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
                context.startActivity(intent2);
            } catch (Exception unused) {
                irg.b("link_tag", "PopUtils === jumpPushPage === 跳转通知页面异常,跳转到应用详情页面，还异常：" + e);
            }
        }
    }

    public static void p(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3cbcfaf", new Object[]{application});
            return;
        }
        AccsConnectReceiver accsConnectReceiver = new AccsConnectReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Constants.ACTION_CONNECT_INFO);
        application.registerReceiver(accsConnectReceiver, intentFilter);
    }

    public static void q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35ab81e3", new Object[]{context});
            return;
        }
        PopScreenReceiver popScreenReceiver = new PopScreenReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        context.registerReceiver(popScreenReceiver, intentFilter);
    }

    public static void r(Context context, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34f309b", new Object[]{context, popMessageData});
            return;
        }
        mr4.b().b = popMessageData;
        cno.b(context).d("pop_message", popMessageData);
    }

    public static void s(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b3d7c4", new Object[]{context, new Integer(i)});
        } else {
            cno.b(context).d("requestCount", Integer.valueOf(i));
        }
    }

    public static void t(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a6b07d", new Object[]{context, new Long(j)});
        } else {
            cno.b(context).d("requestTime", Long.valueOf(j));
        }
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0c78e9e", new Object[]{context})).intValue();
        }
        return ((Integer) cno.b(context).a("requestCount", 0)).intValue();
    }

    public static boolean k(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ca6e70", new Object[]{context, new Integer(i)})).booleanValue();
        }
        String g = aqg.g(context, "mtopRequestScene", "1,2,3");
        if (TextUtils.isEmpty(g)) {
            return true;
        }
        return g.contains(i + "");
    }

    public static boolean l(Context context) {
        List<BrandVersion> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26aeaaed", new Object[]{context})).booleanValue();
        }
        try {
            SupportBrandVersion supportBrandVersion = ypg.e().c.c;
            if (supportBrandVersion == null) {
                supportBrandVersion = (SupportBrandVersion) cno.b(context).a("popSupportBrandVersion", new SupportBrandVersion());
            }
            if (!(supportBrandVersion == null || (list = supportBrandVersion.supportBrandVersion) == null)) {
                for (BrandVersion brandVersion : list) {
                    String str = brandVersion.brand;
                    String str2 = Build.MANUFACTURER;
                    if (str.contains(str2.toLowerCase())) {
                        String str3 = brandVersion.version;
                        String str4 = Build.VERSION.RELEASE;
                        if (str3.contains(str4)) {
                            irg.a("link_tag", "PopUtils === isInWhiteLIst === 系统版本为：" + str4 + " 手机厂商为：" + str2.toLowerCase() + "，支持桌面消息功能");
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            irg.a("link_tag", "PopUtils === isInWhiteList == 获取白名单异常:" + e.getMessage());
        }
        return false;
    }

    static {
        t2o.a(1030750322);
    }

    public static String e(Context context) {
        boolean areNotificationsEnabled;
        boolean z = true;
        if (context == null) {
            return "unknown";
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                areNotificationsEnabled = ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled();
                return String.valueOf(areNotificationsEnabled);
            } catch (Throwable th) {
                irg.b("link_tag", "PopUtils === getPushState === >=24,获取通知状态异常：" + th);
                return "unknown";
            }
        } else {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i = applicationInfo.uid;
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
                Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(appOpsManager);
                num.intValue();
                if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i), packageName)).intValue() != 0) {
                    z = false;
                }
                return String.valueOf(z);
            } catch (Throwable th2) {
                irg.b("link_tag", "PopUtils === getPushState === 获取通知状态异常：：" + th2);
                return "unknown";
            }
        }
    }
}
