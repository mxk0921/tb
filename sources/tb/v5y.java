package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.hihonor.push.framework.aidl.entity.PushTokenResult;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.common.data.DownMsgType;
import com.hihonor.push.sdk.common.data.UpMsgType;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class v5y {

    /* renamed from: a  reason: collision with root package name */
    public final Context f29801a;
    public final z9y b = new z9y();

    public v5y(Context context) {
        this.f29801a = context;
    }

    public static /* synthetic */ void i(p5b p5bVar, int i, String str) {
        if (p5bVar != null) {
            p5bVar.onFailure(i, str);
        }
    }

    public static /* synthetic */ void j(p5b p5bVar, Object obj) {
        if (p5bVar != null) {
            p5bVar.onSuccess(obj);
        }
    }

    public final String c(boolean z) throws Exception {
        this.b.getClass();
        try {
            dby dbyVar = new dby(UpMsgType.REQUEST_PUSH_TOKEN, null);
            dbyVar.d = zsx.a();
            String pushToken = ((PushTokenResult) zsx.c(o9y.c.a(dbyVar))).getPushToken();
            if (z && !TextUtils.isEmpty(pushToken)) {
                Bundle bundle = new Bundle();
                bundle.putString("event_type", DownMsgType.RECEIVE_TOKEN);
                bundle.putString("push_token", pushToken);
                qby qbyVar = new qby();
                Context context = this.f29801a;
                try {
                    Intent intent = new Intent();
                    intent.setPackage(context.getPackageName());
                    intent.setAction("com.hihonor.push.action.MESSAGING_EVENT");
                    Context applicationContext = context.getApplicationContext();
                    qbyVar.c = applicationContext;
                    qbyVar.b = bundle;
                    applicationContext.bindService(intent, qbyVar, 1);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            return pushToken;
        } catch (Exception e2) {
            throw zsx.b(e2);
        }
    }

    public final <T> void d(final Callable<T> callable, final p5b<T> p5bVar) {
        Runnable y4yVar = new Runnable() { // from class: tb.y4y
            @Override // java.lang.Runnable
            public final void run() {
                v5y.this.h(callable, p5bVar);
            }
        };
        x9y x9yVar = x9y.f;
        if (x9yVar.d == null) {
            synchronized (x9yVar.e) {
                try {
                    if (x9yVar.d == null) {
                        x9yVar.d = x9yVar.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ((ThreadPoolExecutor) x9yVar.d).execute(y4yVar);
    }

    public final void e(final p5b<?> p5bVar, final int i, final String str) {
        x9y.b(new Runnable() { // from class: tb.z4y
            @Override // java.lang.Runnable
            public final void run() {
                v5y.i(p5b.this, i, str);
            }
        });
    }

    public final <T> void f(final p5b<T> p5bVar, final T t) {
        x9y.b(new Runnable() { // from class: tb.a5y
            @Override // java.lang.Runnable
            public final void run() {
                v5y.j(p5b.this, t);
            }
        });
    }

    public void g(p5b<String> p5bVar, final boolean z) {
        d(new Callable() { // from class: tb.w4y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String c;
                c = v5y.this.c(z);
                return c;
            }
        }, p5bVar);
    }

    public final /* synthetic */ void h(Callable callable, p5b p5bVar) {
        try {
            f(p5bVar, callable.call());
        } catch (ApiException e) {
            e(p5bVar, e.getErrorCode(), e.getMessage());
        } catch (Exception unused) {
            HonorPushErrorEnum honorPushErrorEnum = HonorPushErrorEnum.ERROR_INTERNAL_ERROR;
            e(p5bVar, honorPushErrorEnum.getErrorCode(), honorPushErrorEnum.getMessage());
        }
    }
}
