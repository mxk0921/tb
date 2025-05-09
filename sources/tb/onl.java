package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IPageListener;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class onl implements IPageListener, skc<IPageListener> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<IPageListener> f25510a = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25511a;
        public final /* synthetic */ int b;
        public final /* synthetic */ long c;

        public a(String str, int i, long j) {
            this.f25511a = str;
            this.b = i;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = onl.a(onl.this).iterator();
            while (it.hasNext()) {
                ((IPageListener) it.next()).onPageChanged(this.f25511a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IPageListener f25512a;

        public b(IPageListener iPageListener) {
            this.f25512a = iPageListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!onl.a(onl.this).contains(this.f25512a)) {
                onl.a(onl.this).add(this.f25512a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IPageListener f25513a;

        public c(IPageListener iPageListener) {
            this.f25513a = iPageListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                onl.a(onl.this).remove(this.f25513a);
            }
        }
    }

    public static /* synthetic */ ArrayList a(onl onlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("eaac88c1", new Object[]{onlVar});
        }
        return onlVar.f25510a;
    }

    /* renamed from: b */
    public void c(IPageListener iPageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b5674b", new Object[]{this, iPageListener});
        } else if (iPageListener != null) {
            d(new b(iPageListener));
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
    public void f(IPageListener iPageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4048c8", new Object[]{this, iPageListener});
        } else if (iPageListener != null) {
            d(new c(iPageListener));
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.taobao.application.common.IPageListener
    public void onPageChanged(String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf1be38", new Object[]{this, str, new Integer(i), new Long(j)});
        } else {
            d(new a(str, i, j));
        }
    }
}
