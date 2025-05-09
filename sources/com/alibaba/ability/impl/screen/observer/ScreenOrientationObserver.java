package com.alibaba.ability.impl.screen.observer;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.g1a;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ScreenOrientationObserver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2021a;
    public Integer b;
    public final Activity c;
    public final g1a<Integer, xhv> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ScreenOrientationObserver.a(ScreenOrientationObserver.this).registerReceiver(ScreenOrientationObserver.this, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ScreenOrientationObserver.a(ScreenOrientationObserver.this).unregisterReceiver(ScreenOrientationObserver.this);
            }
        }
    }

    static {
        t2o.a(130023430);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScreenOrientationObserver(Activity activity, g1a<? super Integer, xhv> g1aVar) {
        ckf.g(activity, "activity");
        ckf.g(g1aVar, "onScreenOrientationChanged");
        this.c = activity;
        this.d = g1aVar;
    }

    public static final /* synthetic */ Activity a(ScreenOrientationObserver screenOrientationObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("7cec1bdc", new Object[]{screenOrientationObserver});
        }
        return screenOrientationObserver.c;
    }

    public static /* synthetic */ Object ipc$super(ScreenOrientationObserver screenOrientationObserver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/screen/observer/ScreenOrientationObserver");
    }

    public final Integer b() {
        Configuration configuration;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("12221d08", new Object[]{this});
        }
        Resources resources = this.c.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            return null;
        }
        return Integer.valueOf(configuration.orientation);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3799b774", new Object[]{this});
        } else {
            MegaUtils.A(new a(), 0L, 2, null);
        }
    }

    public final synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!this.f2021a) {
            this.b = b();
            c();
            this.f2021a = true;
        }
    }

    public final synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.f2021a) {
            f();
            this.f2021a = false;
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("102efb7b", new Object[]{this});
        } else {
            MegaUtils.A(new b(), 0L, 2, null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        Integer b2 = b();
        if (b2 != null) {
            int intValue = b2.intValue();
            Integer num = this.b;
            if (num == null || intValue != num.intValue()) {
                this.b = Integer.valueOf(intValue);
                this.d.invoke(Integer.valueOf(intValue));
            }
        }
    }
}
