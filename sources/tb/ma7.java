package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.widgets.globaladdress.GlobalAddressBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ma7 extends phw<GlobalAddressBean, FrameLayout, b64> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f23886a;
    public phw<GlobalAddressBean, ?, b64> b;
    public GlobalAddressBean c;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.ma7$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static final class C0989a extends xpo {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ ma7 c;
            public final /* synthetic */ View d;

            public C0989a(ma7 ma7Var, View view) {
                this.c = ma7Var;
                this.d = view;
            }

            public static /* synthetic */ Object ipc$super(C0989a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/globaladdress/DelegateAddressWidget$onCreateView$1$onAddView$1");
            }

            @Override // tb.xpo
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    return;
                }
                FrameLayout u2 = ma7.u2(this.c);
                if (u2 != null) {
                    u2.getLayoutParams().height = -2;
                    FrameLayout u22 = ma7.u2(this.c);
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
            ma7.this.getActivity().runOnUiThread(new C0989a(ma7.this, view));
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

        @Override // tb.kzn
        public void a(phw<?, ? extends View, ?> phwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa7e6235", new Object[]{this, phwVar});
                return;
            }
            ckf.g(phwVar, "widget");
            if (ma7.t2(ma7.this)) {
                phwVar.destroyAndRemoveFromParent();
                return;
            }
            ma7.v2(ma7.this, phwVar);
            phwVar.attachToContainer();
            GlobalAddressBean s2 = ma7.s2(ma7.this);
            if (s2 != null) {
                phw q2 = ma7.q2(ma7.this);
                ckf.d(q2);
                q2.bindWithData(s2);
            }
        }
    }

    static {
        t2o.a(815793568);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma7(Activity activity, ude udeVar, b64 b64Var, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, b64Var, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
    }

    public static /* synthetic */ Object ipc$super(ma7 ma7Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1303831088) {
            super.bindWithData(objArr[0]);
            return null;
        } else if (hashCode == -211767613) {
            super.onComponentDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/globaladdress/DelegateAddressWidget");
        }
    }

    public static final /* synthetic */ phw q2(ma7 ma7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phw) ipChange.ipc$dispatch("8da89fe8", new Object[]{ma7Var});
        }
        return ma7Var.b;
    }

    public static final /* synthetic */ GlobalAddressBean s2(ma7 ma7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalAddressBean) ipChange.ipc$dispatch("a2ba48f5", new Object[]{ma7Var});
        }
        return ma7Var.c;
    }

    public static final /* synthetic */ boolean t2(ma7 ma7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ca6fd1c", new Object[]{ma7Var})).booleanValue();
        }
        return ma7Var.d;
    }

    public static final /* synthetic */ FrameLayout u2(ma7 ma7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("57386447", new Object[]{ma7Var});
        }
        return ma7Var.f23886a;
    }

    public static final /* synthetic */ void v2(ma7 ma7Var, phw phwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa378754", new Object[]{ma7Var, phwVar});
        } else {
            ma7Var.b = phwVar;
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "DelegateAddressWidget";
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
    public void bindWithData(GlobalAddressBean globalAddressBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf2ce48", new Object[]{this, globalAddressBean});
            return;
        }
        super.bindWithData(globalAddressBean);
        this.c = globalAddressBean;
        phw<GlobalAddressBean, ?, b64> phwVar = this.b;
        if (phwVar != null) {
            phwVar.bindWithData(globalAddressBean);
        }
    }

    /* renamed from: x2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getActivity());
        this.f23886a = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, o1p.a(44.0f)));
        lzn lznVar = lzn.INSTANCE;
        Activity activity = this.mActivity;
        ckf.f(activity, "mActivity");
        b64 model = getModel();
        FrameLayout frameLayout2 = this.f23886a;
        if (frameLayout2 != null) {
            lznVar.g("globalAddress", new mzn(activity, this, model, frameLayout2, new a()), new b());
            FrameLayout frameLayout3 = this.f23886a;
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
