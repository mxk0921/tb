package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.widgets.preposefilter.perf.RecyclerPreposeFilterBean;
import tb.e65;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class e65 extends phw<RecyclerPreposeFilterBean, ViewGroup, b64> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f18312a;
    public phw<RecyclerPreposeFilterBean, ?, b64> b;
    public RecyclerPreposeFilterBean c;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.e65$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static final class C0910a extends xpo {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ e65 c;
            public final /* synthetic */ View d;

            public C0910a(e65 e65Var, View view) {
                this.c = e65Var;
                this.d = view;
            }

            public static /* synthetic */ Object ipc$super(C0910a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/preposefilter/perf/DRecyclerPreposeWidget$onCreateView$1$onAddView$1");
            }

            @Override // tb.xpo
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    return;
                }
                FrameLayout u2 = e65.u2(this.c);
                if (u2 != null) {
                    u2.getLayoutParams().height = -2;
                    FrameLayout u22 = e65.u2(this.c);
                    if (u22 != null) {
                        u22.addView(this.d);
                    } else {
                        ckf.y("rootView");
                        throw null;
                    }
                } else {
                    ckf.y("rootView");
                    throw null;
                }
            }
        }

        public a() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
                return;
            }
            ckf.g(view, "componentView");
            e65.this.getActivity().runOnUiThread(new C0910a(e65.this, view));
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            } else {
                ckf.g(view, "componentView");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements kzn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static final void c(e65 e65Var, phw phwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6a3961", new Object[]{e65Var, phwVar});
                return;
            }
            ckf.g(e65Var, "this$0");
            ckf.g(phwVar, "$widget");
            if (e65.s2(e65Var)) {
                phwVar.destroyAndRemoveFromParent();
                return;
            }
            e65.v2(e65Var, phwVar);
            phwVar.attachToContainer();
            RecyclerPreposeFilterBean q2 = e65.q2(e65Var);
            if (q2 != null) {
                phw t2 = e65.t2(e65Var);
                ckf.d(t2);
                t2.bindWithData(q2);
            }
        }

        @Override // tb.kzn
        public void a(final phw<?, ? extends View, ?> phwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa7e6235", new Object[]{this, phwVar});
                return;
            }
            ckf.g(phwVar, "widget");
            Activity activity = e65.this.getActivity();
            final e65 e65Var = e65.this;
            activity.runOnUiThread(new Runnable() { // from class: tb.f3z
                @Override // java.lang.Runnable
                public final void run() {
                    e65.b.c(e65.this, phwVar);
                }
            });
        }
    }

    static {
        t2o.a(815793755);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e65(Activity activity, ude udeVar, b64 b64Var, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, b64Var, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
    }

    public static /* synthetic */ Object ipc$super(e65 e65Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1303831088) {
            super.bindWithData(objArr[0]);
            return null;
        } else if (hashCode == -211767613) {
            super.onComponentDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/preposefilter/perf/DRecyclerPreposeWidget");
        }
    }

    public static final /* synthetic */ RecyclerPreposeFilterBean q2(e65 e65Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerPreposeFilterBean) ipChange.ipc$dispatch("270cc81", new Object[]{e65Var});
        }
        return e65Var.c;
    }

    public static final /* synthetic */ boolean s2(e65 e65Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e176bdd9", new Object[]{e65Var})).booleanValue();
        }
        return e65Var.d;
    }

    public static final /* synthetic */ phw t2(e65 e65Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phw) ipChange.ipc$dispatch("c3c3d45b", new Object[]{e65Var});
        }
        return e65Var.b;
    }

    public static final /* synthetic */ FrameLayout u2(e65 e65Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("1e74d8ea", new Object[]{e65Var});
        }
        return e65Var.f18312a;
    }

    public static final /* synthetic */ void v2(e65 e65Var, phw phwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6882d9", new Object[]{e65Var, phwVar});
        } else {
            e65Var.b = phwVar;
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "DRecyclerPreposeWidget";
    }

    @Override // tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        this.d = true;
    }

    /* renamed from: w2 */
    public void bindWithData(RecyclerPreposeFilterBean recyclerPreposeFilterBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a52e6a8b", new Object[]{this, recyclerPreposeFilterBean});
            return;
        }
        super.bindWithData(recyclerPreposeFilterBean);
        this.c = recyclerPreposeFilterBean;
        phw<RecyclerPreposeFilterBean, ?, b64> phwVar = this.b;
        if (phwVar != null) {
            phwVar.bindWithData(recyclerPreposeFilterBean);
        }
    }

    /* renamed from: x2 */
    public ViewGroup onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("3747fcae", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getActivity());
        this.f18312a = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, p1p.a(40.0f)));
        lzn lznVar = lzn.INSTANCE;
        Activity activity = this.mActivity;
        ckf.f(activity, "mActivity");
        b64 model = getModel();
        FrameLayout frameLayout2 = this.f18312a;
        if (frameLayout2 != null) {
            lznVar.g("recycler_preposefilter", new mzn(activity, this, model, frameLayout2, new a()), new b());
            FrameLayout frameLayout3 = this.f18312a;
            if (frameLayout3 != null) {
                return frameLayout3;
            }
            ckf.y("rootView");
            throw null;
        }
        ckf.y("rootView");
        throw null;
    }
}
