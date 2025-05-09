package tb;

import android.content.Context;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class s4y {
    public static final s4y e = new s4y();

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Context> f27801a;
    public volatile boolean b = false;
    public volatile boolean c = false;
    public v5y d;

    public Context d() {
        return this.f27801a.get();
    }

    public final void e(final Runnable runnable, final p5b<?> p5bVar) {
        x9y.b(new Runnable() { // from class: tb.m3y
            @Override // java.lang.Runnable
            public final void run() {
                s4y.this.h(runnable, p5bVar);
            }
        });
    }

    public void f(final p5b<String> p5bVar, final boolean z) {
        e(new Runnable() { // from class: tb.k3y
            @Override // java.lang.Runnable
            public final void run() {
                s4y.this.i(p5bVar, z);
            }
        }, p5bVar);
    }

    public void g(final p6y p6yVar) {
        x9y.b(new Runnable() { // from class: tb.l3y
            @Override // java.lang.Runnable
            public final void run() {
                s4y.this.j(p6yVar);
            }
        });
    }

    public final /* synthetic */ void h(Runnable runnable, p5b p5bVar) {
        if (this.b) {
            runnable.run();
        } else if (p5bVar != null) {
            HonorPushErrorEnum honorPushErrorEnum = HonorPushErrorEnum.ERROR_NOT_INITIALIZED;
            p5bVar.onFailure(honorPushErrorEnum.getErrorCode(), honorPushErrorEnum.getMessage());
        }
    }

    public final /* synthetic */ void i(p5b p5bVar, boolean z) {
        this.d.g(p5bVar, z);
    }

    public final void j(p6y p6yVar) {
        if (!this.b) {
            this.b = true;
            this.f27801a = new WeakReference<>(p6yVar.f25914a);
            this.c = p6yVar.b;
            this.d = new v5y(p6yVar.f25914a);
            if (this.c) {
                f(null, true);
            }
        }
    }
}
