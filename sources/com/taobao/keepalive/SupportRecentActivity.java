package com.taobao.keepalive;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.atools.Constants;
import com.taobao.keepalive.SupportRecentActivity;
import java.util.Calendar;
import tb.acq;
import tb.cux;
import tb.hkq;
import tb.izx;
import tb.lef;
import tb.pxx;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SupportRecentActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f10866a = true;
    public boolean b = false;
    public final BroadcastReceiver d = new a();

    static {
        t2o.a(499122184);
    }

    public static /* synthetic */ void d(SupportRecentActivity supportRecentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b4f318", new Object[]{supportRecentActivity});
        } else {
            supportRecentActivity.c();
        }
    }

    public static /* synthetic */ Object ipc$super(SupportRecentActivity supportRecentActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/keepalive/SupportRecentActivity");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            finish();
            Process.killProcess(Process.myPid());
        } catch (Throwable th) {
            pxx.f26392a.d("SupportRecentActivity", "finishSelf err", th, new Object[0]);
            hkq.b("keepalive", Constants.POINT_FULL_VERIFY, "finishSelf err", vu3.b.GEO_NOT_SUPPORT);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c) {
            try {
                unregisterReceiver(this.d);
            } catch (Throwable th) {
                pxx.f26392a.d("SupportRecentActivity", "onDestroy err", th, new Object[0]);
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        pxx.f26392a.e("SupportRecentActivity", "onDestroy", new Object[0]);
        izx.a().execute(new Runnable() { // from class: tb.xxq
            @Override // java.lang.Runnable
            public final void run() {
                SupportRecentActivity.this.f();
            }
        });
    }

    @Override // android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        pxx.f26392a.e("SupportRecentActivity", "onStart", new Object[0]);
        moveTaskToBack(false);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(499122185);
        }

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/keepalive/SupportRecentActivity$a");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            if (intent == null) {
                str = "";
            } else {
                str = intent.getAction();
            }
            pxx.f26392a.e("SupportRecentActivity", "onReceive", "action", str);
            if ("tb.alive.recent.finish".equals(str)) {
                SupportRecentActivity.d(SupportRecentActivity.this);
            }
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            registerReceiver(this.d, new IntentFilter("tb.alive.recent.finish"));
            this.c = true;
        } catch (Throwable th) {
            pxx.f26392a.d("SupportRecentActivity", "registerReceiver err", th, new Object[0]);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        pxx.f26392a.e("SupportRecentActivity", "onCreate", new Object[0]);
        Window window = getWindow();
        window.setGravity(51);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        attributes.height = 1;
        attributes.width = 1;
        window.setAttributes(attributes);
        int i = Calendar.getInstance().get(6);
        Context applicationContext = getApplicationContext();
        cux.h(applicationContext, KeepAliveManager.FILE_RECENT_ENTRANCE, i + "");
        izx.a().execute(new Runnable() { // from class: tb.wxq
            @Override // java.lang.Runnable
            public final void run() {
                SupportRecentActivity.this.e();
            }
        });
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        pxx.f26392a.e("SupportRecentActivity", "onNewIntent", new Object[0]);
        this.b = true;
    }

    @Override // android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        Object[] objArr = {"isFirstStart", Boolean.valueOf(this.f10866a), "hasNewIntent", Boolean.valueOf(this.b)};
        pxx pxxVar = pxx.f26392a;
        pxxVar.e("SupportRecentActivity", "onStop", objArr);
        if (this.f10866a) {
            this.f10866a = false;
            if (SystemClock.elapsedRealtime() - getIntent().getLongExtra("time", 0L) < 60000) {
                Context applicationContext = getApplicationContext();
                pxxVar.e("SupportRecentActivity", "startTinyProcess", new Object[0]);
                Intent intent = new Intent();
                intent.setPackage(applicationContext.getPackageName());
                intent.setClassName(applicationContext, "com.taobao.adaemon.TriggerService");
                intent.putExtra("type", 8);
                lef.f(applicationContext, intent);
                return;
            }
            pxxVar.e("SupportRecentActivity", "first start from recent task", new Object[0]);
        }
        if (this.b) {
            this.b = false;
            return;
        }
        try {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            launchIntentForPackage.putExtra("afcTriggerType", 1);
            launchIntentForPackage.addFlags(268435456);
            startActivity(launchIntentForPackage);
            hkq.b("keepalive", Constants.POINT_FULL_VERIFY, "recent click", vu3.b.GEO_NOT_SUPPORT);
        } catch (Throwable th) {
            pxx.f26392a.d("SupportRecentActivity", "onStop, start launch err", th, new Object[0]);
            hkq.b("keepalive", Constants.POINT_FULL_VERIFY, "recent click err", vu3.b.GEO_NOT_SUPPORT);
        }
        c();
    }
}
