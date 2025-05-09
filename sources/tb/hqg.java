package tb;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.core.content.FileProvider;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.wireless.link.download.LinkDownloadItem;
import java.io.File;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, a> f20818a = new HashMap<>();
    public final Context b;
    public final NotificationManager c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f20819a;
        public long b;

        static {
            t2o.a(1030750281);
        }
    }

    static {
        t2o.a(1030750280);
    }

    public hqg(Context context) {
        this.b = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        this.c = notificationManager;
        if (Build.VERSION.SDK_INT >= 26) {
            c(notificationManager);
        }
    }

    public static String a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c20f209b", new Object[]{new Integer(i), str});
        }
        return i + ":" + str;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1988fd56", new Object[]{this, str});
            return;
        }
        irg.a("LinkDownloadNotification", "cancelNotification. packageName=" + str);
        synchronized (this.f20818a) {
            this.f20818a.remove(str);
        }
        try {
            this.c.cancel(a(1, str), 0);
        } catch (Throwable th) {
            irg.c("LinkDownloadNotification", th.getMessage(), th);
        }
        try {
            this.c.cancel(a(2, str), 0);
        } catch (Throwable th2) {
            irg.c("LinkDownloadNotification", th2.getMessage(), th2);
        }
    }

    public void f(LinkDownloadItem linkDownloadItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d228558", new Object[]{this, linkDownloadItem, new Integer(i)});
            return;
        }
        synchronized (this.f20818a) {
            try {
                a aVar = this.f20818a.get(linkDownloadItem.packageName);
                if (aVar == null) {
                    aVar = new a();
                    aVar.b = System.currentTimeMillis();
                    aVar.f20819a = i;
                    this.f20818a.put(linkDownloadItem.packageName, aVar);
                } else if (aVar.f20819a != i) {
                    aVar.f20819a = i;
                } else {
                    return;
                }
                this.c.notify(a(1, linkDownloadItem.packageName), 0, d(linkDownloadItem, aVar).build());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(LinkDownloadItem linkDownloadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961517e", new Object[]{this, linkDownloadItem});
        } else {
            this.c.notify(a(2, linkDownloadItem.packageName), 0, e(linkDownloadItem).build());
        }
    }

    public final void c(NotificationManager notificationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d1a28a", new Object[]{this, notificationManager});
            return;
        }
        NotificationChannel a2 = aig.a("taobao_linkdownloader_active", aqg.g(this.b, "linkDownloadChannelName", "应用下载通知"), 4);
        a2.canBypassDnd();
        a2.enableLights(true);
        a2.enableVibration(false);
        a2.shouldShowLights();
        a2.getAudioAttributes();
        a2.setLightColor(-65536);
        a2.setLockscreenVisibility(0);
        a2.setShowBadge(true);
        a2.setBypassDnd(true);
        try {
            notificationManager.createNotificationChannel(a2);
        } catch (Throwable th) {
            irg.c("LinkDownloadNotification", th.getMessage(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.core.app.NotificationCompat.Builder d(com.taobao.wireless.link.download.LinkDownloadItem r8, tb.hqg.a r9) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.hqg.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "6a41e118"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r7
            r5[r1] = r8
            r5[r0] = r9
            java.lang.Object r8 = r3.ipc$dispatch(r4, r5)
            androidx.core.app.NotificationCompat$Builder r8 = (androidx.core.app.NotificationCompat.Builder) r8
            return r8
        L_0x001b:
            java.lang.String r3 = r8.notificationUrl
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x003e
            java.lang.String r3 = r8.notificationUrl     // Catch: Exception -> 0x0034
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: Exception -> 0x0034
            android.content.Context r4 = r7.b     // Catch: Exception -> 0x0034
            com.taobao.android.nav.Nav r4 = com.taobao.android.nav.Nav.from(r4)     // Catch: Exception -> 0x0034
            android.content.Intent r3 = r4.intentForUri(r3)     // Catch: Exception -> 0x0034
            goto L_0x003f
        L_0x0034:
            r3 = move-exception
            java.lang.String r4 = "LinkDownloadNotification"
            java.lang.String r5 = r3.getMessage()
            tb.irg.c(r4, r5, r3)
        L_0x003e:
            r3 = 0
        L_0x003f:
            androidx.core.app.NotificationCompat$Builder r4 = new androidx.core.app.NotificationCompat$Builder
            android.content.Context r5 = r7.b
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "taobao_linkdownloader_active"
            r4.<init>(r5, r6)
            long r5 = r9.b
            androidx.core.app.NotificationCompat$Builder r4 = r4.setWhen(r5)
            androidx.core.app.NotificationCompat$Builder r4 = r4.setOnlyAlertOnce(r1)
            androidx.core.app.NotificationCompat$Builder r4 = r4.setOngoing(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r8.title
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x006c
            java.lang.String r8 = "未知应用"
            goto L_0x006e
        L_0x006c:
            java.lang.String r8 = r8.title
        L_0x006e:
            r5.append(r8)
            java.lang.String r8 = " 正在下载..."
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            androidx.core.app.NotificationCompat$Builder r8 = r4.setContentTitle(r8)
            r4 = 17301633(0x1080081, float:2.4979616E-38)
            androidx.core.app.NotificationCompat$Builder r8 = r8.setSmallIcon(r4)
            r4 = 5
            androidx.core.app.NotificationCompat$Builder r8 = r8.setDefaults(r4)
            long[] r1 = new long[r1]
            r4 = 0
            r1[r2] = r4
            androidx.core.app.NotificationCompat$Builder r8 = r8.setVibrate(r1)
            androidx.core.app.NotificationCompat$Builder r8 = r8.setPriority(r0)
            androidx.core.app.NotificationCompat$Builder r8 = r8.setAutoCancel(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r9.f20819a
            r0.append(r1)
            java.lang.String r1 = "%"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.core.app.NotificationCompat$Builder r8 = r8.setContentText(r0)
            r0 = 100
            int r9 = r9.f20819a
            androidx.core.app.NotificationCompat$Builder r8 = r8.setProgress(r0, r9, r2)
            if (r3 == 0) goto L_0x00c6
            android.content.Context r9 = r7.b
            android.app.PendingIntent r9 = tb.ya.c(r9, r2, r3, r2)
            r8.setContentIntent(r9)
        L_0x00c6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hqg.d(com.taobao.wireless.link.download.LinkDownloadItem, tb.hqg$a):androidx.core.app.NotificationCompat$Builder");
    }

    public NotificationCompat.Builder e(LinkDownloadItem linkDownloadItem) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationCompat.Builder) ipChange.ipc$dispatch("2bcd13b7", new Object[]{this, linkDownloadItem});
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        if (Build.VERSION.SDK_INT >= 24) {
            irg.a("link_tag", "DownloadCenter === installApp === 安装APP，7.0以上");
            Uri uriForFile = FileProvider.getUriForFile(this.b, "com.taobao.taobao.update.provider", new File(linkDownloadItem.filePath));
            intent.addFlags(1);
            intent.addFlags(268435456);
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        } else {
            irg.a("link_tag", "DownloadCenter === installApp === 安装APP，7.0以下");
            intent.addFlags(268435456);
            intent.setDataAndType(Uri.fromFile(new File(linkDownloadItem.filePath)), "application/vnd.android.package-archive");
        }
        NotificationCompat.Builder ongoing = new NotificationCompat.Builder(this.b.getApplicationContext(), "taobao_linkdownloader_active").setWhen(System.currentTimeMillis()).setOnlyAlertOnce(true).setOngoing(false);
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(linkDownloadItem.title)) {
            str = "未知应用";
        } else {
            str = linkDownloadItem.title;
        }
        sb.append(str);
        sb.append(" 下载完成");
        NotificationCompat.Builder contentText = ongoing.setContentTitle(sb.toString()).setSmallIcon(17301634).setDefaults(5).setVibrate(new long[]{0}).setPriority(2).setAutoCancel(false).setContentText("点击开始安装");
        contentText.setContentIntent(ya.c(this.b, 0, intent, 0));
        return contentText;
    }
}
