package com.taobao.android.opencart;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.engine.CartVEngineFactory;
import com.taobao.android.opencart.broadcast.CartRefreshCheckBroadcast;
import com.taobao.android.opencart.broadcast.TBCartWVService;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ucp.util.LoginBroadcastReceiver;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import java.util.HashMap;
import java.util.Map;
import tb.hvd;
import tb.jpj;
import tb.nuv;
import tb.shv;
import tb.t8l;
import tb.y8l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class InitCart {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String sTabChangedBroadcastAction = "CartTabChangedEventAction";
    public static final String sTabChangedBroadcastExtraIndex = "index";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements y8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f9057a;

        public a(SharedPreferences sharedPreferences) {
            this.f9057a = sharedPreferences;
        }

        @Override // tb.y8l
        public void onConfigUpdate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
                return;
            }
            try {
                boolean c = t8l.c();
                shv.c("InitCart", "onConfigUpdate prefetchCartVEngine=" + c);
                this.f9057a.edit().putBoolean("isPrefetchCartVEngine", c).apply();
            } catch (Throwable th) {
                shv.c("InitCart", "sharedPreferences isPrefetchCartVEngine err=" + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements jpj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Handler f9058a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    InitCart.a();
                }
            }
        }

        public b(Handler handler) {
            this.f9058a = handler;
        }

        @Override // tb.jpj
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96f207b1", new Object[]{this});
            } else {
                this.f9058a.post(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements hvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f9060a;

        public c(Application application) {
            this.f9060a = application;
        }

        @Override // tb.hvd
        public void onTabChanged(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
                return;
            }
            if (i == 3) {
                InitCart.b();
            }
            try {
                Intent intent = new Intent();
                intent.setAction(InitCart.sTabChangedBroadcastAction);
                intent.putExtra("index", i);
                LocalBroadcastManager.getInstance(this.f9060a).sendBroadcast(intent);
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            f();
        }
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            e();
        }
    }

    public static void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e004e0", new Object[]{application});
        } else {
            com.taobao.tao.navigation.a.h(new c(application));
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee3e48", new Object[0]);
        } else {
            com.taobao.tao.navigation.a.g(new b(new Handler(Looper.getMainLooper())));
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e0d28d", new Object[0]);
        } else {
            nuv.c("tabbarCartClick", g());
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d93ce13b", new Object[0]);
        } else {
            nuv.c("tabbarExpo", g());
        }
    }

    public static Map<String, String> g() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e8a87743", new Object[0]);
        }
        com.taobao.tao.navigation.b q = com.taobao.tao.navigation.a.q(3);
        if (q != null) {
            str = q.n();
        } else {
            str = "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cartBadge", str);
        hashMap.put("type", k(str));
        return hashMap;
    }

    public static void h(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        TBCartWVService.registerPlugin();
        CartRefreshCheckBroadcast.f(application);
        j();
        LoginBroadcastHelper.registerLoginReceiver(application, new BroadcastReceiver() { // from class: com.taobao.android.opencart.InitCart.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/opencart/InitCart$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null && TextUtils.equals(intent.getAction(), LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS)) {
                    try {
                        CheckHoldManager.i().n(2, null, null, true);
                    } catch (Exception unused) {
                    }
                }
            }
        });
        d();
        c(application);
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1907a768", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ("99+".equals(str)) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a912ec3b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i(str)) {
            return RequestConfig.CHECKED_COUNT;
        }
        return "text";
    }

    public static void j() {
        try {
            SharedPreferences sharedPreferences = Globals.getApplication().getSharedPreferences("init_cart", 0);
            OrangeConfig.getInstance().registerListener(new String[]{t8l.SPACE_NAME}, new a(sharedPreferences));
            if (!sharedPreferences.getBoolean("isPrefetchCartVEngine", true)) {
                shv.c("InitCart", "don't prefetch cart engine, from sp");
                return;
            }
            IpChange ipChange = CartVEngineFactory.$ipChange;
            CartVEngineFactory.class.getDeclaredMethod("prefetchCartVEngine", Activity.class).invoke(null, (Activity) TBMainHost.b().getContext());
        } catch (Throwable th) {
            shv.c("InitCart", "invoke error msg=" + th.getMessage());
        }
    }
}
