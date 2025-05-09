package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zn1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ao1 f32882a = new ao1();
    public final IApmEventListener b = b21.s().j();
    public boolean c = false;
    public final Runnable d = new a();
    public final Runnable e = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (zn1.a(zn1.this)) {
                zn1.b(zn1.this).b(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (zn1.a(zn1.this)) {
                zn1.c(zn1.this).onEvent(50);
            }
        }
    }

    public static /* synthetic */ boolean a(zn1 zn1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53ec6244", new Object[]{zn1Var})).booleanValue();
        }
        return zn1Var.c;
    }

    public static /* synthetic */ ao1 b(zn1 zn1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ao1) ipChange.ipc$dispatch("89179a40", new Object[]{zn1Var});
        }
        return zn1Var.f32882a;
    }

    public static /* synthetic */ IApmEventListener c(zn1 zn1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IApmEventListener) ipChange.ipc$dispatch("bbe8a88c", new Object[]{zn1Var});
        }
        return zn1Var.b;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321c0a2e", new Object[]{this});
            return;
        }
        this.c = false;
        this.f32882a.a(false);
        this.f32882a.b(false);
        this.b.onEvent(2);
        Handler m = b21.s().m();
        m.removeCallbacks(this.d);
        m.removeCallbacks(this.e);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40aa7e4", new Object[]{this});
            return;
        }
        this.c = true;
        this.f32882a.a(true);
        this.b.onEvent(1);
        Handler m = b21.s().m();
        m.postDelayed(this.d, 300000L);
        m.postDelayed(this.e, 10000L);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.c = true;
        this.f32882a.a(true);
        b21.s().m().postDelayed(this.d, 300000L);
    }
}
