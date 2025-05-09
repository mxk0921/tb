package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.component.mediabrowser.MediaBrowserComponent;
import kotlin.Metadata;
import tb.pol;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ybi extends teu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final MediaBrowserComponent f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements pol.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f31964a;

        public a(Runnable runnable) {
            this.f31964a = runnable;
        }

        @Override // tb.pol.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8df164ae", new Object[]{this});
            } else {
                this.f31964a.run();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean[] b;

        public b(boolean[] zArr) {
            this.b = zArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            boolean[] zArr = this.b;
            if (!zArr[0]) {
                zArr[0] = true;
                ybi.this.s();
            }
        }
    }

    static {
        t2o.a(918552641);
    }

    public ybi(MediaBrowserComponent mediaBrowserComponent) {
        ckf.g(mediaBrowserComponent, "browserComponent");
        this.f = mediaBrowserComponent;
    }

    public static /* synthetic */ Object ipc$super(ybi ybiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/component/mediabrowser/MediaBrowserTransitionPage");
    }

    @Override // tb.teu
    public ViewGroup a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("30aef49e", new Object[]{this});
        }
        VIEW view = this.f.getView();
        ckf.d(view);
        Context context = ((FrameLayout) view).getContext();
        if (context != null) {
            View findViewById = ((Activity) context).findViewById(16908290);
            if (findViewById != null) {
                return (ViewGroup) findViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    @Override // tb.teu
    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        VIEW view = this.f.getView();
        ckf.d(view);
        Context context = ((FrameLayout) view).getContext();
        ckf.f(context, "browserComponent.view!!.context");
        return context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // tb.teu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View d() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ybi.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "6d69b8fd"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            android.view.View r0 = (android.view.View) r0
            return r0
        L_0x0015:
            com.taobao.android.dressup.common.component.mediabrowser.MediaBrowserComponent r0 = r4.f
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x001e
            return r0
        L_0x001e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.View"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ybi.d():android.view.View");
    }

    @Override // tb.teu
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef076e6", new Object[]{this});
        } else {
            d().setVisibility(4);
        }
    }

    public void t(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8977076a", new Object[]{this, view});
        } else if (!f()) {
            o();
            n(true);
            pol h = h();
            b bVar = new b(new boolean[]{false});
            if (h != null) {
                h.a(view, new a(bVar));
            }
        }
    }
}
