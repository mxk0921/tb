package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y11 implements IApmEventListener, skc<IApmEventListener> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<IApmEventListener> f31776a = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f31777a;

        public a(int i) {
            this.f31777a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = y11.a(y11.this).iterator();
            while (it.hasNext()) {
                ((IApmEventListener) it.next()).onEvent(this.f31777a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IApmEventListener f31778a;

        public b(IApmEventListener iApmEventListener) {
            this.f31778a = iApmEventListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!y11.a(y11.this).contains(this.f31778a)) {
                y11.a(y11.this).add(this.f31778a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IApmEventListener f31779a;

        public c(IApmEventListener iApmEventListener) {
            this.f31779a = iApmEventListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                y11.a(y11.this).remove(this.f31779a);
            }
        }
    }

    public static /* synthetic */ ArrayList a(y11 y11Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("b0a194e", new Object[]{y11Var});
        }
        return y11Var.f31776a;
    }

    /* renamed from: b */
    public void c(IApmEventListener iApmEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5be19e", new Object[]{this, iApmEventListener});
        } else if (iApmEventListener != null) {
            d(new b(iApmEventListener));
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a057ec18", new Object[]{this, runnable});
        } else {
            b21.s().z(runnable);
        }
    }

    /* renamed from: e */
    public void f(IApmEventListener iApmEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736fbc9b", new Object[]{this, iApmEventListener});
        } else if (iApmEventListener != null) {
            d(new c(iApmEventListener));
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.taobao.application.common.IApmEventListener
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
        } else {
            d(new a(i));
        }
    }
}
