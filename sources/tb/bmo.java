package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.search.sf.widgets.topbar.SFTopBarBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bmo extends phw<SFTopBarBean, ViewGroup, acx<? extends o02<? extends BaseSearchResult, ?>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TOPBAR_STATUS_NORMAL = 1;
    public static final int TOPBAR_STATUS_TRANSPARENT = 2;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f16480a;
    public phw b;
    public SFTopBarBean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else {
                bmo.q2(bmo.this).addView(view);
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements kzn {
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
            phwVar.attachToContainer();
            bmo.t2(bmo.this, phwVar);
            if (bmo.s2(bmo.this) != null && bmo.u2(bmo.this) != null) {
                bmo.s2(bmo.this).bindWithData(bmo.u2(bmo.this));
            }
        }
    }

    static {
        t2o.a(815793805);
    }

    public bmo(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
    }

    public static /* synthetic */ Object ipc$super(bmo bmoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/topbar/delegate/SFTopBarDelegateWidget");
    }

    public static /* synthetic */ FrameLayout q2(bmo bmoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("4d302fea", new Object[]{bmoVar});
        }
        return bmoVar.f16480a;
    }

    public static /* synthetic */ phw s2(bmo bmoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phw) ipChange.ipc$dispatch("7ca151b1", new Object[]{bmoVar});
        }
        return bmoVar.b;
    }

    public static /* synthetic */ phw t2(bmo bmoVar, phw phwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phw) ipChange.ipc$dispatch("8fde5a0a", new Object[]{bmoVar, phwVar});
        }
        bmoVar.b = phwVar;
        return phwVar;
    }

    public static /* synthetic */ SFTopBarBean u2(bmo bmoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SFTopBarBean) ipChange.ipc$dispatch("77eaf9ee", new Object[]{bmoVar});
        }
        return bmoVar.c;
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SFTopBarDelegateWidget";
    }

    /* renamed from: v2 */
    public void bindWithData(SFTopBarBean sFTopBarBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b5980f9", new Object[]{this, sFTopBarBean});
            return;
        }
        this.c = sFTopBarBean;
        phw phwVar = this.b;
        if (phwVar != null && sFTopBarBean != null) {
            phwVar.bindWithData(sFTopBarBean);
        }
    }

    public String w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4efa134", new Object[]{this});
        }
        return "topBar";
    }

    /* renamed from: x2 */
    public ViewGroup onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("3747fcae", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getActivity());
        this.f16480a = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bcq.a().f(getActivity(), "tbsearch_remote");
        lzn.INSTANCE.g(w2(), new mzn(this.mActivity, this, getModel(), this.f16480a, new a()), new b());
        return this.f16480a;
    }
}
