package ka.ka.ka.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.atools.StaticHook;
import com.taobao.keepalive.KeepAliveManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ka.ka.ka.f.a;
import tb.izx;
import tb.k5y;
import tb.pxx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class a extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicBoolean b = new AtomicBoolean();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f15235a = null;

    static {
        t2o.a(499122203);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in ka/ka/ka/f/a");
    }

    public final void a() {
        if (this.f15235a == null) {
            pxx.f26392a.e("PreventKillReceiver", "pendingResult is null", new Object[0]);
            return;
        }
        pxx pxxVar = pxx.f26392a;
        pxxVar.e("PreventKillReceiver", "finishReceiverNow", new Object[0]);
        try {
            Method declaredMethod = this.f15235a.getClass().getSuperclass().getDeclaredMethod("finish", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.f15235a, new Object[0]);
            pxxVar.e("PreventKillReceiver", "pendingResult.finish() success", new Object[0]);
            b.get();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void b(Context context) {
        boolean z = false;
        pxx pxxVar = pxx.f26392a;
        pxxVar.e("PreventKillReceiver", "delayFinishReceiver", new Object[0]);
        try {
            Field e = StaticHook.e(BroadcastReceiver.class, "mPendingResult");
            e.setAccessible(true);
            this.f15235a = e.get(this);
            e.set(this, null);
            pxxVar.e("PreventKillReceiver", "delayFinishReceiver mPendingResult = null", new Object[0]);
            z = true;
        } catch (Exception e2) {
            this.f15235a = null;
            pxx.f26392a.d("PreventKillReceiver", "onReceive err: ", e2, new Object[0]);
        }
        if (this.f15235a != null && z) {
            izx.b().schedule(new Runnable() { // from class: tb.urx
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.a();
                }
            }, k5y.a.f22424a.a(context), TimeUnit.SECONDS);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent == null) {
            str = "";
        } else {
            str = intent.getAction();
        }
        pxx pxxVar = pxx.f26392a;
        pxxVar.e("PreventKillReceiver", "onReceive", "action", str);
        if (!TextUtils.isEmpty(str)) {
            if ("com.taobao.alive.kill.finish_delay".equals(str)) {
                if (!KeepAliveManager.isInstrMode()) {
                    b.set(false);
                    b(context);
                }
            } else if (!"com.taobao.alive.kill.finish_now".equals(str)) {
            } else {
                if (this.f15235a == null) {
                    pxxVar.e("PreventKillReceiver", "pendingResult is null", new Object[0]);
                    return;
                }
                pxxVar.e("PreventKillReceiver", "finishReceiverNow", new Object[0]);
                try {
                    Method declaredMethod = this.f15235a.getClass().getSuperclass().getDeclaredMethod("finish", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f15235a, new Object[0]);
                    pxxVar.e("PreventKillReceiver", "pendingResult.finish() success", new Object[0]);
                    b.get();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }
}
