package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.plugin.notification.HmsNotificationManagerEx;
import com.huawei.hms.push.plugin.notification.NotificationStatus;
import com.taobao.accs.utl.ALog;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hi0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String POST_NOTIFICATIONS_PERMISSION = "android.permission.POST_NOTIFICATIONS";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20652a;

        public a(String str) {
            this.f20652a = str;
        }

        @Override // tb.hi0.f
        public void onFailure(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str});
                return;
            }
            ALog.e("AgooNotificationManager", "enableNotification.vip.onFailure()", "errCode", Integer.valueOf(i), "errMsg", str);
            hi0.b(this.f20652a, false, i, str);
        }

        @Override // tb.hi0.f
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            ALog.e("AgooNotificationManager", "enableNotification.vip.onSuccess()", new Object[0]);
            hi0.a(this.f20652a, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20653a;
        public final /* synthetic */ Context b;

        public b(String str, Context context) {
            this.f20653a = str;
            this.b = context;
        }

        @Override // tb.hi0.f
        public void onFailure(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str});
                return;
            }
            ALog.e("AgooNotificationManager", "enableNotification.mix.onFailure()", "errCode", Integer.valueOf(i), "errMsg", str);
            hi0.c(this.b);
            hi0.a(this.f20653a, true);
        }

        @Override // tb.hi0.f
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            ALog.e("AgooNotificationManager", "enableNotification.mix.onSuccess()", new Object[0]);
            hi0.a(this.f20653a, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20654a;

        public c(String str) {
            this.f20654a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ALog.e("AgooNotificationManager", "POST_NOTIFICATIONS_PERMISSION denied", new Object[0]);
            c71.b("agoo", "noti_perm_req", this.f20654a + "_D");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20655a;

        public d(String str) {
            this.f20655a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ALog.e("AgooNotificationManager", "POST_NOTIFICATIONS_PERMISSION granted", new Object[0]);
            c71.b("agoo", "noti_perm_req", this.f20655a + "_G");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference f20656a;
        public final /* synthetic */ f b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements qqk {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.qqk
            public void onFailure(Exception exc) {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    return;
                }
                if (exc == null) {
                    str = "";
                } else {
                    str = exc.toString();
                }
                ALog.e("AgooNotificationManager", "HW onFailure: " + str, new Object[0]);
                f fVar = e.this.b;
                if (fVar != null) {
                    fVar.onFailure(1002, str);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements xpk<NotificationStatus> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Activity f20658a;

            public b(Activity activity) {
                this.f20658a = activity;
            }

            @Override // tb.xpk
            public void onComplete(tct<NotificationStatus> tctVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("92d06e34", new Object[]{this, tctVar});
                    return;
                }
                ALog.e("AgooNotificationManager", "HW onComplete: ", new Object[0]);
                try {
                    if (tctVar.h() && tctVar.e() != null && tctVar.e().hasResolution()) {
                        tctVar.e().startResolutionForResult(this.f20658a, 1);
                        f fVar = e.this.b;
                        if (fVar != null) {
                            fVar.onSuccess();
                        }
                    }
                } catch (Throwable th) {
                    ALog.e("AgooNotificationManager", "onComplete err", th, new Object[0]);
                    f fVar2 = e.this.b;
                    if (fVar2 != null) {
                        fVar2.onFailure(1003, th.toString());
                    }
                }
            }
        }

        public e(WeakReference weakReference, f fVar) {
            this.f20656a = weakReference;
            this.b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Activity activity = (Activity) this.f20656a.get();
            if (activity == null) {
                f fVar = this.b;
                if (fVar != null) {
                    fVar.onFailure(1001, "");
                }
            } else if ("honor".equalsIgnoreCase(Build.BRAND)) {
                x2w.a(activity, this.b);
            } else {
                try {
                    tct<NotificationStatus> enableNotification = HmsNotificationManagerEx.getInstance(activity).enableNotification();
                    enableNotification.a(new b(activity));
                    enableNotification.b(new a());
                } catch (Throwable th) {
                    ALog.e("AgooNotificationManager", "enableNotificationByVip err", th, new Object[0]);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface f {
        void onFailure(int i, String str);

        void onSuccess();
    }

    static {
        t2o.a(343933296);
    }

    public static /* synthetic */ void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6620173", new Object[]{str, new Boolean(z)});
        } else {
            i(str, z);
        }
    }

    public static /* synthetic */ void b(String str, boolean z, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a36703b", new Object[]{str, new Boolean(z), new Integer(i), str2});
        } else {
            h(str, z, i, str2);
        }
    }

    public static /* synthetic */ void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04487ef", new Object[]{context});
        } else {
            e(context);
        }
    }

    public static void f(Context context, f fVar) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724b7efd", new Object[]{context, fVar});
            return;
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = c21.i();
        }
        brt.d().execute(new e(new WeakReference(activity), fVar));
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8217fe59", new Object[]{context})).booleanValue();
        }
        return !"false".equals(xd0.j(context));
    }

    public static void h(String str, boolean z, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6aac62", new Object[]{str, new Boolean(z), new Integer(i), str2});
            return;
        }
        c71.a("agoo", RemoteMessageConst.NOTIFICATION, str + "|" + z, i + "", str2);
    }

    public static void i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25bd26fa", new Object[]{str, new Boolean(z)});
            return;
        }
        c71.b("agoo", RemoteMessageConst.NOTIFICATION, str + "|" + z);
    }

    public static void j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f292f056", new Object[]{context, str});
        } else {
            com.taobao.runtimepermission.a.c(context, new String[]{POST_NOTIFICATIONS_PERMISSION}).y(1L).s(true).A(new d(str)).z(new c(str)).m();
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79bd5c0d", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent();
            int i = Build.VERSION.SDK_INT;
            if (i <= 25) {
                intent.putExtra("app_package", context.getPackageName());
                intent.putExtra("app_uid", context.getApplicationInfo().uid);
            }
            if (i >= 26) {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.putExtra(NotificationCompat.EXTRA_CHANNEL_ID, context.getApplicationInfo().uid);
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e2) {
            ALog.e("AgooNotificationManager", "enableNotificationBySystem err", e2, new Object[0]);
            try {
                Intent intent2 = new Intent();
                intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
                context.startActivity(intent2);
            } catch (Exception e3) {
                ALog.e("AgooNotificationManager", "enableNotificationBySystem, app settings err", e3, new Object[0]);
            }
        }
    }

    public static void d(Context context, String str, int i) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd87e9c6", new Object[]{context, str, new Integer(i)});
        } else if (context == null) {
            ALog.e("AgooNotificationManager", "enableNotification illegalArguments", new Object[0]);
        } else if (g(context)) {
            ALog.e("AgooNotificationManager", "notification switch was enabled", new Object[0]);
        } else {
            ALog.e("AgooNotificationManager", "enableNotification", "scene", str, "type", Integer.valueOf(i));
            if (i < 1 || i > 5) {
                i = 1;
            }
            try {
                if (i == 1) {
                    e(context);
                    i(str, true);
                } else if (i == 2) {
                    f(context, new a(str));
                } else if (i == 3) {
                    f(context, new b(str, context));
                } else if (i != 4) {
                    if (i == 5 && Build.VERSION.SDK_INT >= 33 && ContextCompat.checkSelfPermission(context, POST_NOTIFICATIONS_PERMISSION) != 0) {
                        ALog.e("AgooNotificationManager", "permission not granted", new Object[0]);
                        j(context, str);
                    }
                } else if (Build.VERSION.SDK_INT >= 33) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        activity = c21.i();
                    }
                    if (ActivityCompat.shouldShowRequestPermissionRationale(activity, POST_NOTIFICATIONS_PERMISSION)) {
                        ALog.e("AgooNotificationManager", "shouldShow return true", new Object[0]);
                        c71.a("agoo", "noti_perm_req", str, "-1", "Return early");
                        return;
                    }
                    j(context, str);
                }
            } catch (Throwable th) {
                ALog.e("AgooNotificationManager", "enableNotification err", th, new Object[0]);
            }
        }
    }
}
