package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class gs9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f20187a;
    final /* synthetic */ String[] b;
    final /* synthetic */ Handler c;
    final /* synthetic */ Runnable d;
    final /* synthetic */ fs9 e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            gs9 gs9Var = gs9.this;
            gs9Var.e.b(gs9Var.f20187a.getApplicationContext(), gs9.this.b);
            gs9 gs9Var2 = gs9.this;
            gs9Var2.c.post(gs9Var2.d);
        }
    }

    public gs9(fs9 fs9Var, Context context, String[] strArr, Handler handler, Runnable runnable) {
        this.e = fs9Var;
        this.f20187a = context;
        this.b = strArr;
        this.c = handler;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.e.d.get();
            new Handler(Looper.getMainLooper()).post(new a());
        } catch (Exception e) {
            dwh.g("FlutterLoader", "Flutter initialization failed.", e);
            throw new RuntimeException(e);
        }
    }
}
