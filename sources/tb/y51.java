package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IAppLaunchListener;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y51 implements IAppLaunchListener, skc<IAppLaunchListener> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<IAppLaunchListener> f31856a = new ArrayList(2);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IAppLaunchListener f31857a;

        public a(IAppLaunchListener iAppLaunchListener) {
            this.f31857a = iAppLaunchListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!y51.a(y51.this).contains(this.f31857a)) {
                y51.a(y51.this).add(this.f31857a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IAppLaunchListener f31858a;

        public b(IAppLaunchListener iAppLaunchListener) {
            this.f31858a = iAppLaunchListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                y51.a(y51.this).remove(this.f31858a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f31859a;
        public final /* synthetic */ int b;

        public c(int i, int i2) {
            this.f31859a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (IAppLaunchListener iAppLaunchListener : y51.a(y51.this)) {
                iAppLaunchListener.d(this.f31859a, this.b);
            }
        }
    }

    public static /* synthetic */ List a(y51 y51Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3da87591", new Object[]{y51Var});
        }
        return y51Var.f31856a;
    }

    /* renamed from: b */
    public void c(IAppLaunchListener iAppLaunchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cc13fba", new Object[]{this, iAppLaunchListener});
        } else if (iAppLaunchListener != null) {
            e(new a(iAppLaunchListener));
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.taobao.application.common.IAppLaunchListener
    public void d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cba989", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            e(new c(i, i2));
        }
    }

    public final void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a057ec18", new Object[]{this, runnable});
        } else {
            b21.s().z(runnable);
        }
    }

    /* renamed from: f */
    public void g(IAppLaunchListener iAppLaunchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e628c45d", new Object[]{this, iAppLaunchListener});
        } else if (iAppLaunchListener != null) {
            e(new b(iAppLaunchListener));
        } else {
            throw new IllegalArgumentException();
        }
    }
}
