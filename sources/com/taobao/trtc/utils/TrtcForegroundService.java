package com.taobao.trtc.utils;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.taobao.R;
import tb.aig;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcForegroundService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_START = "action_start";
    public static final String ACTION_STOP = "action_stop";
    public static final String NOTIFICATION_CONTENT_TEXT = "notification_content_text";
    public static final String NOTIFICATION_CONTENT_TITLE = "notification_content_title";
    public static final String d = TrtcForegroundService.class.getName();

    /* renamed from: a  reason: collision with root package name */
    public String f13973a;
    public String b;
    public boolean c = false;

    static {
        t2o.a(395313640);
    }

    public static /* synthetic */ Object ipc$super(TrtcForegroundService trtcForegroundService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode == 1992651935) {
            return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/trtc/utils/TrtcForegroundService");
        }
    }

    public final void a(NotificationManager notificationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d1a28a", new Object[]{this, notificationManager});
        } else if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel a2 = aig.a("com.taobao.trtc.utils.TrtcForegroundService.id", "TrtcForegroundService", 4);
            a2.setSound(null, null);
            a2.setLockscreenVisibility(1);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(a2);
            }
        }
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fcc19e9", new Object[]{this})).intValue();
        }
        try {
            return getApplicationContext().getPackageManager().getApplicationInfo(getApplicationContext().getPackageName(), 0).icon;
        } catch (PackageManager.NameNotFoundException e) {
            String str = d;
            TrtcLog.i(str, "app icon NameNotFoundException: " + e);
            return R.drawable.float_close;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        TrtcLog.j(d, "onCreate()");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        String action = intent != null ? intent.getAction() : null;
        if (action == null) {
            return super.onStartCommand(intent, i, i2);
        }
        this.f13973a = intent.getStringExtra(NOTIFICATION_CONTENT_TITLE);
        this.b = intent.getStringExtra(NOTIFICATION_CONTENT_TEXT);
        TrtcLog.j(d, "onStartCommand, action: ".concat(action));
        if (action.equals(ACTION_STOP)) {
            e();
        } else if (action.equals(ACTION_START)) {
            d();
        }
        return super.onStartCommand(intent, i, i2);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01b4c37", new Object[]{this});
            return;
        }
        String str = d;
        TrtcLog.j(str, "startForegroundService, isForeground: " + this.c);
        if (!this.c) {
            c();
            this.c = true;
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22bc8c97", new Object[]{this});
            return;
        }
        String str = d;
        TrtcLog.j(str, "stopForegroundService, isForeground: " + this.c);
        if (this.c) {
            this.c = false;
            stopSelf();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TrtcLog.j(d, "onDestroy()");
        stopForeground(true);
        super.onDestroy();
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e2250f", new Object[]{this});
            return;
        }
        NotificationManager notificationManager = (NotificationManager) getSystemService(RemoteMessageConst.NOTIFICATION);
        a(notificationManager);
        Notification build = new NotificationCompat.Builder(getApplicationContext(), "com.taobao.trtc.utils.TrtcForegroundService.id").setContentTitle(this.f13973a).setContentText(this.b).setSmallIcon(b()).setAutoCancel(false).setOngoing(true).setCategory("service").setPriority(1).build();
        if (notificationManager != null) {
            notificationManager.notify(22222, build);
        }
        startForeground(22222, build);
    }
}
