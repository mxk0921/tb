package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.widgets.preposefilter.PreposeFilterBean;
import tb.qa7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class qa7 extends phw<PreposeFilterBean, ViewGroup, b64> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f26620a;
    public phw<PreposeFilterBean, ?, b64> b;
    public PreposeFilterBean c;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.qa7$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static final class C1035a extends xpo {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ qa7 c;
            public final /* synthetic */ View d;

            public C1035a(qa7 qa7Var, View view) {
                this.c = qa7Var;
                this.d = view;
            }

            public static /* synthetic */ Object ipc$super(C1035a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/preposefilter/DelegatePreposeFilterWidget$onCreateView$1$onAddView$1");
            }

            @Override // tb.xpo
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    return;
                }
                FrameLayout u2 = qa7.u2(this.c);
                if (u2 != null) {
                    u2.getLayoutParams().height = -2;
                    FrameLayout u22 = qa7.u2(this.c);
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
            qa7.this.getActivity().runOnUiThread(new C1035a(qa7.this, view));
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

        public static final void c(qa7 qa7Var, phw phwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1548b1", new Object[]{qa7Var, phwVar});
                return;
            }
            ckf.g(qa7Var, "this$0");
            ckf.g(phwVar, "$widget");
            if (qa7.s2(qa7Var)) {
                phwVar.destroyAndRemoveFromParent();
                return;
            }
            qa7.v2(qa7Var, phwVar);
            phwVar.attachToContainer();
            PreposeFilterBean q2 = qa7.q2(qa7Var);
            if (q2 != null) {
                phw t2 = qa7.t2(qa7Var);
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
            Activity activity = qa7.this.getActivity();
            final qa7 qa7Var = qa7.this;
            activity.runOnUiThread(new Runnable() { // from class: tb.u4z
                @Override // java.lang.Runnable
                public final void run() {
                    qa7.b.c(qa7.this, phwVar);
                }
            });
        }
    }

    static {
        t2o.a(815793744);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa7(Activity activity, ude udeVar, b64 b64Var, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, b64Var, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
    }

    public static /* synthetic */ Object ipc$super(qa7 qa7Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1303831088) {
            super.bindWithData(objArr[0]);
            return null;
        } else if (hashCode == -211767613) {
            super.onComponentDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/preposefilter/DelegatePreposeFilterWidget");
        }
    }

    public static final /* synthetic */ PreposeFilterBean q2(qa7 qa7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreposeFilterBean) ipChange.ipc$dispatch("8b4aa412", new Object[]{qa7Var});
        }
        return qa7Var.c;
    }

    public static final /* synthetic */ boolean s2(qa7 qa7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5556929", new Object[]{qa7Var})).booleanValue();
        }
        return qa7Var.d;
    }

    public static final /* synthetic */ phw t2(qa7 qa7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phw) ipChange.ipc$dispatch("ea752163", new Object[]{qa7Var});
        }
        return qa7Var.b;
    }

    public static final /* synthetic */ FrameLayout u2(qa7 qa7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b1159b9a", new Object[]{qa7Var});
        }
        return qa7Var.f26620a;
    }

    public static final /* synthetic */ void v2(qa7 qa7Var, phw phwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da5a739", new Object[]{qa7Var, phwVar});
        } else {
            qa7Var.b = phwVar;
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "DelegatePreposeFilter";
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
    public void bindWithData(PreposeFilterBean preposeFilterBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a56b612", new Object[]{this, preposeFilterBean});
            return;
        }
        super.bindWithData(preposeFilterBean);
        this.c = preposeFilterBean;
        phw<PreposeFilterBean, ?, b64> phwVar = this.b;
        if (phwVar != null) {
            phwVar.bindWithData(preposeFilterBean);
        }
    }

    /* renamed from: x2 */
    public ViewGroup onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("3747fcae", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getActivity());
        this.f26620a = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, p1p.a(40.0f)));
        lzn lznVar = lzn.INSTANCE;
        Activity activity = this.mActivity;
        ckf.f(activity, "mActivity");
        b64 model = getModel();
        FrameLayout frameLayout2 = this.f26620a;
        if (frameLayout2 != null) {
            lznVar.g("preposefilter", new mzn(activity, this, model, frameLayout2, new a()), new b());
            FrameLayout frameLayout3 = this.f26620a;
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
