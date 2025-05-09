package com.etao.feimagesearch.quicksearch;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.taobao.R;
import tb.aig;
import tb.ckf;
import tb.e73;
import tb.t2o;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ScreenRecordForegroundService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f4859a = "com.taobao.taobao.plt.MediaService";
    public final String b = "com.taobao.taobao.plt.quick_search";
    public final String c = "com.taobao.taobao.plt.quick_search";
    public final int d = 313;

    static {
        t2o.a(730857692);
    }

    public static /* synthetic */ Object ipc$super(ScreenRecordForegroundService screenRecordForegroundService, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/quicksearch/ScreenRecordForegroundService");
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
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Object systemService = getSystemService(RemoteMessageConst.NOTIFICATION);
        if (systemService != null) {
            ((NotificationManager) systemService).cancel(this.d);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        a();
        return 1;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c0d0e", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 26) {
            try {
                PendingIntent c = ya.c(this, 0, new Intent(this, ScreenRecordForegroundService.class), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                ckf.f(c, "getActivity(\n          t….FLAG_IMMUTABLE\n        )");
                NotificationCompat.Builder builder = new NotificationCompat.Builder(this, this.f4859a);
                Resources resources = getResources();
                int i = R.drawable.ic_quick_search;
                NotificationCompat.Builder contentIntent = builder.setLargeIcon(BitmapFactory.decodeResource(resources, i)).setSmallIcon(i).setContentTitle(Localization.q(R.string.taobao_app_1007_1_19064)).setContentText(Localization.q(R.string.taobao_app_1007_1_19048)).setContentIntent(c);
                e73.a();
                NotificationChannel a2 = aig.a(this.f4859a, this.b, 3);
                a2.setDescription(this.c);
                Object systemService = getSystemService(RemoteMessageConst.NOTIFICATION);
                if (systemService != null) {
                    ((NotificationManager) systemService).createNotificationChannel(a2);
                    startForeground(this.d, contentIntent.build());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
