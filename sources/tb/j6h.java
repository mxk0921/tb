package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBDefaultLoadMoreFooter;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBLoadMoreFooter;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.view.item.ILoadMoreItemRender;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class j6h implements ILoadMoreItemRender {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ID = "loading";

    /* renamed from: a  reason: collision with root package name */
    public TBLoadMoreFooter.LoadMoreState f21794a = TBLoadMoreFooter.LoadMoreState.LOADING;
    public WeakReference<TBLoadMoreFooter> b;
    public final int c;
    public final IContainerDataService d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TBLoadMoreFooter tBLoadMoreFooter = (TBLoadMoreFooter) view;
            if (tBLoadMoreFooter.getCurrentState() == TBLoadMoreFooter.LoadMoreState.NONE) {
                tBLoadMoreFooter.changeToState(TBLoadMoreFooter.LoadMoreState.LOADING);
                j6h.d(j6h.this);
            }
        }
    }

    static {
        t2o.a(486539508);
        t2o.a(488636661);
    }

    public j6h(cfc cfcVar, int i) {
        this.c = 0;
        this.d = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.c = i;
    }

    public static /* synthetic */ void d(j6h j6hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a729afef", new Object[]{j6hVar});
        } else {
            j6hVar.j();
        }
    }

    @Override // com.taobao.infoflow.protocol.view.item.ILoadMoreItemRender
    public void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ccf9b6a", new Object[]{this, new Boolean(z), str});
        } else {
            k(z, g(str));
        }
    }

    @Override // tb.rgc
    public void bindData(View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43424acc", new Object[]{this, view, baseSectionModel});
            return;
        }
        eve.c("LoadMoreViewRender", "bindData_loadView");
        i(view, this.f21794a);
        eve.b("LoadMoreViewRender", "bindData_loadView");
    }

    @Override // tb.rgc
    public View createView(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("97790b1e", new Object[]{this, viewGroup, new Integer(i)});
        }
        eve.c("LoadMoreViewRender", "createView_loadView");
        TBDefaultLoadMoreFooter tBDefaultLoadMoreFooter = new TBDefaultLoadMoreFooter(viewGroup.getContext());
        tBDefaultLoadMoreFooter.setLoadMoreTips(e());
        tBDefaultLoadMoreFooter.setBackgroundColor(0);
        tBDefaultLoadMoreFooter.setOnClickListener(new a());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) ((tBDefaultLoadMoreFooter.getResources().getDisplayMetrics().density * 50.0f) + this.c));
        layoutParams.addRule(14);
        layoutParams.addRule(10);
        tBDefaultLoadMoreFooter.setLayoutParams(layoutParams);
        tBDefaultLoadMoreFooter.changeToState(TBLoadMoreFooter.LoadMoreState.LOADING);
        this.b = new WeakReference<>(tBDefaultLoadMoreFooter);
        eve.b("LoadMoreViewRender", "createView_loadView");
        return tBDefaultLoadMoreFooter;
    }

    public final String[] e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("a615b3e3", new Object[]{this});
        }
        i6h h = h();
        String b = h.b();
        String a2 = h.a();
        String q = Localization.q(R.string.taobao_app_1000_1_16712);
        String q2 = Localization.q(R.string.app_release_to_reload);
        if (TextUtils.isEmpty(b)) {
            b = Localization.q(R.string.taobao_app_1000_1_16709);
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = Localization.q(R.string.taobao_app_1000_1_16711);
        }
        return new String[]{q, q2, b, a2};
    }

    public final JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        IContainerDataService iContainerDataService = this.d;
        if (iContainerDataService == null) {
            fve.e("LoadMoreViewRender", "getExt dataService is null");
            return null;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            fve.e("LoadMoreViewRender", "getExt dataModel is null");
            return null;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base != null) {
            return base.getExt();
        }
        fve.e("LoadMoreViewRender", "getExt Base is null");
        return null;
    }

    public final TBLoadMoreFooter.LoadMoreState g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLoadMoreFooter.LoadMoreState) ipChange.ipc$dispatch("2ded40d", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return this.f21794a;
        }
        return TBLoadMoreFooter.LoadMoreState.valueOf(str);
    }

    @Override // tb.rgc
    public int getViewType(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9fbda37", new Object[]{this, baseSectionModel})).intValue();
        }
        return -3;
    }

    public final i6h h() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i6h) ipChange.ipc$dispatch("5fe8dfed", new Object[]{this});
        }
        JSONObject f = f();
        if (f != null) {
            str = f.getString(i6h.R_EXT_LOAD_MORE_TITLE);
            str2 = f.getString(i6h.R_EXT_LOAD_MORE_ERROR_TITLE);
        } else {
            str = null;
            str2 = null;
        }
        return new i6h(str, str2);
    }

    public final void i(View view, TBLoadMoreFooter.LoadMoreState loadMoreState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04883d8", new Object[]{this, view, loadMoreState});
        } else if (view instanceof TBLoadMoreFooter) {
            TBLoadMoreFooter tBLoadMoreFooter = (TBLoadMoreFooter) view;
            tBLoadMoreFooter.setLoadMoreTips(e());
            tBLoadMoreFooter.changeToState(loadMoreState);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67eba8f1", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = this.d;
        if (iContainerDataService == null) {
            fve.e("LoadMoreViewRender", "triggerLoadClick dataService is null");
        } else {
            iContainerDataService.triggerEvent("LoadingViewClick", null);
        }
    }

    public final void k(boolean z, TBLoadMoreFooter.LoadMoreState loadMoreState) {
        WeakReference<TBLoadMoreFooter> weakReference;
        TBLoadMoreFooter tBLoadMoreFooter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0ff5632", new Object[]{this, new Boolean(z), loadMoreState});
            return;
        }
        if (this.f21794a != loadMoreState) {
            z = true;
        }
        this.f21794a = loadMoreState;
        if (z && (weakReference = this.b) != null && (tBLoadMoreFooter = weakReference.get()) != null) {
            i(tBLoadMoreFooter, this.f21794a);
        }
    }

    @Override // tb.rgc
    public void preRender(Context context, BaseSectionModel<?> baseSectionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23eb059f", new Object[]{this, context, baseSectionModel, new Boolean(z), new Integer(i)});
        }
    }
}
