package com.vivo.push.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import com.vivo.push.PushClient;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.m;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.VivoPushException;
import com.vivo.push.util.u;
import com.vivo.push.util.x;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PushServiceReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static HandlerThread f14646a;
    private static Handler b;
    private static a c = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Context f14647a;
        private String b;

        public static /* synthetic */ void a(a aVar, Context context, String str) {
            aVar.f14647a = ContextDelegate.getContext(context);
            aVar.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            NetworkInfo a2 = x.a(this.f14647a);
            if (!(a2 != null ? a2.isConnectedOrConnecting() : false)) {
                u.d("PushServiceReceiver", this.f14647a.getPackageName() + ": 无网络  by " + this.b);
                Context context = this.f14647a;
                u.a(context, "触发静态广播:无网络(" + this.b + "," + this.f14647a.getPackageName() + f7l.BRACKET_END_STR);
                return;
            }
            u.d("PushServiceReceiver", this.f14647a.getPackageName() + ": 执行开始出发动作: " + this.b);
            Context context2 = this.f14647a;
            u.a(context2, "触发静态广播(" + this.b + "," + this.f14647a.getPackageName() + f7l.BRACKET_END_STR);
            m.a().a(this.f14647a);
            if (!ClientConfigManagerImpl.getInstance(this.f14647a).isCancleBroadcastReceiver()) {
                try {
                    PushClient.getInstance(this.f14647a).initialize(com.vivo.push.restructure.a.a().e().l());
                } catch (VivoPushException e) {
                    e.printStackTrace();
                    Context context3 = this.f14647a;
                    u.a(context3, " 初始化异常 error= " + e.getMessage());
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Context context2 = ContextDelegate.getContext(context);
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) || "android.intent.action.ACTION_POWER_CONNECTED".equals(action) || "android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
            if (f14646a == null) {
                HandlerThread handlerThread = new HandlerThread("PushServiceReceiver");
                f14646a = handlerThread;
                handlerThread.start();
                b = new Handler(f14646a.getLooper());
            }
            u.d("PushServiceReceiver", context2.getPackageName() + ": start PushSerevice for by " + action + "  ; handler : " + b);
            a.a(c, context2, action);
            b.removeCallbacks(c);
            b.postDelayed(c, 2000L);
        }
    }
}
