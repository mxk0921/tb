package tb;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.taobao.R;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.provider.UpdateProvider;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vvu implements kvu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f30287a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f30288a = 34858;
        public final String b = "update_channel_34858";
        public final NotificationManager c;
        public final Context d;
        public final Notification.Builder e;

        static {
            t2o.a(947912727);
        }

        public a(Context context) {
            this.d = context;
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
            this.c = notificationManager;
            if (Build.VERSION.SDK_INT >= 26) {
                e73.a();
                notificationManager.createNotificationChannel(aig.a("update_channel_34858", "更新部署", 2));
            }
            this.e = new Notification.Builder(UpdateRuntime.getContext());
        }

        public void error(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
            } else if (nkv.isNotificationPermissioned()) {
                this.e.setContentText(nkv.getAppNameString(R.string.update_notification_fail, UpdateRuntime.sAppName)).setProgress(0, 0, false).setSmallIcon(UpdateRuntime.sLogoResourceId);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.e.setChannelId(this.b);
                }
                this.c.notify(this.f30288a, this.e.build());
            }
        }

        public void updateProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28975706", new Object[]{this, new Integer(i)});
                return;
            }
            try {
                if (nkv.isNotificationPermissioned()) {
                    Notification.Builder contentTitle = this.e.setContentTitle("更新包下载中...");
                    contentTitle.setContentText(nkv.getAppNameString(R.string.update_notification_downloading, UpdateRuntime.sAppName) + i + f7l.MOD).setSmallIcon(UpdateRuntime.sLogoResourceId);
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 26) {
                        this.e.setChannelId(this.b);
                    }
                    this.e.setProgress(100, i, false);
                    this.c.notify(this.f30288a, this.e.build());
                    if (i == 100) {
                        this.c.cancel(this.f30288a);
                        this.e.setContentTitle("更新包校验中...").setContentText(nkv.getAppNameString(R.string.update_notification_finish, UpdateRuntime.sAppName)).setSmallIcon(UpdateRuntime.sLogoResourceId);
                        if (i2 >= 26) {
                            this.e.setChannelId(this.b);
                        }
                        this.e.setProgress(0, 0, false);
                        this.c.notify(this.f30288a, this.e.build());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public void finish(String str) {
            PendingIntent pendingIntent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a86ec6e4", new Object[]{this, str});
            } else if (nkv.isNotificationPermissioned()) {
                this.e.setContentTitle("点击安装").setContentText(nkv.getAppNameString(R.string.update_notification_finish, UpdateRuntime.sAppName)).setSmallIcon(UpdateRuntime.sLogoResourceId);
                this.e.setProgress(0, 0, false);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(268435456);
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        Uri uriForFile = UpdateProvider.getUriForFile(this.d, new File(str));
                        intent.addFlags(1);
                        for (ResolveInfo resolveInfo : this.d.getPackageManager().queryIntentActivities(intent, 65536)) {
                            this.d.grantUriPermission(resolveInfo.activityInfo.packageName, uriForFile, 1);
                        }
                        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
                    } catch (Throwable th) {
                        th.printStackTrace();
                        return;
                    }
                } else {
                    intent.setDataAndType(Uri.fromFile(new File(str)), "application/vnd.android.package-archive");
                }
                int i = Build.VERSION.SDK_INT;
                if (i > 22) {
                    pendingIntent = ya.c(this.d, 0, intent, 201326592);
                } else {
                    pendingIntent = ya.c(this.d, 0, intent, 134217728);
                }
                this.e.setContentIntent(pendingIntent);
                if (i >= 26) {
                    this.e.setChannelId(this.b);
                }
                this.c.notify(this.f30288a, this.e.build());
            }
        }
    }

    static {
        t2o.a(947912726);
        t2o.a(946864135);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.f30287a = null;
        }
    }

    @Override // tb.kvu
    public void notifyDownloadError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfd84e8", new Object[]{this, str});
            return;
        }
        a();
        new a(UpdateRuntime.getContext()).error(str);
    }

    @Override // tb.kvu
    public void notifyDownloadFinish(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909a6275", new Object[]{this, str});
            return;
        }
        a();
        new a(UpdateRuntime.getContext()).finish(str);
    }

    @Override // tb.kvu
    public void notifyDownloadProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2646e5de", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.f30287a == null) {
            this.f30287a = new a(UpdateRuntime.getContext());
        }
        this.f30287a.updateProgress(i);
    }
}
