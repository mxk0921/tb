package com.alibaba.security.realidentity.ui.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.alibaba.security.realidentity.a;
import com.alibaba.security.realidentity.e2;
import com.alibaba.security.realidentity.f2;
import com.alibaba.security.realidentity.h;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class BaseAlBioActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String d = "BaseBroadcastsActivity";

    /* renamed from: a  reason: collision with root package name */
    public RestartBiometricsBroadcast f2833a;
    public FinishBiometricsBroadcast b;
    public Handler c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class FinishBiometricsBroadcast extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public FinishBiometricsBroadcast() {
        }

        public static /* synthetic */ Object ipc$super(FinishBiometricsBroadcast finishBiometricsBroadcast, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/ui/activity/BaseAlBioActivity$FinishBiometricsBroadcast");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else {
                BaseAlBioActivity.this.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class RestartBiometricsBroadcast extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RestartBiometricsBroadcast() {
        }

        public static /* synthetic */ Object ipc$super(RestartBiometricsBroadcast restartBiometricsBroadcast, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/ui/activity/BaseAlBioActivity$RestartBiometricsBroadcast");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && TextUtils.equals(intent.getAction(), f2.l)) {
                Bundle bundleExtra = intent.getBundleExtra("data");
                String str = null;
                if (bundleExtra != null) {
                    i = bundleExtra.getInt(f2.m, e2.A);
                    str = bundleExtra.getString(f2.n, null);
                }
                BaseAlBioActivity.this.a(i, str);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(BaseAlBioActivity baseAlBioActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/security/realidentity/ui/activity/BaseAlBioActivity");
        }
    }

    public abstract void a(int i, String str);

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.c.post(runnable);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.f2833a == null) {
            this.f2833a = new RestartBiometricsBroadcast();
            h.a(this).a(this.f2833a, new IntentFilter(f2.l));
        }
        if (this.b == null) {
            this.b = new FinishBiometricsBroadcast();
            h.a(this).a(this.b, new IntentFilter(f2.k));
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.f2833a != null) {
            h.a(this).a(this.f2833a);
            this.f2833a = null;
        }
        if (this.b != null) {
            h.a(this).a(this.b);
            this.b = null;
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
        this.c = new Handler(Looper.getMainLooper());
        c();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        d();
    }

    public void a(Window window, boolean z) {
        if (window != null && Build.VERSION.SDK_INT > 28) {
            try {
                View decorView = window.getDecorView();
                decorView.getClass().getMethod("setForceDarkAllowed", Boolean.TYPE).invoke(decorView, Boolean.valueOf(z));
            } catch (Throwable th) {
                a.a(d, th);
            }
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : getResources().getConfiguration().orientation == 1 ? "竖屏" : "横屏";
    }
}
