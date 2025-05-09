package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.taobao.TBActionBar;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.mmd.datasource.bean.SearchBarBean;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class gny extends phw<xhv, ViewGroup, acx<jrh>> implements wdd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TBActionView m0;
    public TUrlImageView n0;
    public View o0;
    public FrameLayout p0;
    public pwc q0;

    static {
        t2o.a(815793769);
        t2o.a(815793583);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gny(Activity activity, ude udeVar, acx<jrh> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
        ckf.g(vfwVar, "setter");
    }

    public static final void e(gny gnyVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b4c1da", new Object[]{gnyVar, view});
            return;
        }
        ckf.g(gnyVar, "this$0");
        gnyVar.getActivity().finish();
    }

    public static /* synthetic */ Object ipc$super(gny gnyVar, String str, Object... objArr) {
        if (str.hashCode() == -506257491) {
            super.findAllViews();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/searchbar/MuiseBarWidget");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View] */
    public final void A2(MSearchResult mSearchResult) {
        TemplateBean template;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ffd06a4", new Object[]{this, mSearchResult});
            return;
        }
        ckf.g(mSearchResult, "result");
        SearchBarBean searchBarInfo = mSearchResult.getSearchBarInfo();
        ckf.f(searchBarInfo, "getSearchBarInfo(...)");
        MuiseBean muiseBean = searchBarInfo.dynamicBean;
        if (ckf.b(searchBarInfo.type, "dynamic") && muiseBean != null && this.q0 == null && (template = getModel().e().getTemplate(muiseBean.type)) != null) {
            Object a2 = getModel().c().M().a(a(template));
            ckf.f(a2, "create(...)");
            pwc pwcVar = (pwc) a2;
            pwcVar.ensureView();
            FrameLayout frameLayout = this.p0;
            if (frameLayout != 0) {
                frameLayout.addView(pwcVar.getView());
                pwcVar.bindWithData(muiseBean);
                this.q0 = pwcVar;
                return;
            }
            ckf.y("dynamicContainer");
            throw null;
        }
    }

    public final gu1 a(TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gu1) ipChange.ipc$dispatch("aca0b350", new Object[]{this, templateBean});
        }
        return new gu1(new x02(getActivity(), this, getModel()), templateBean);
    }

    /* renamed from: b */
    public ViewGroup onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("3747fcae", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.nx_tbsearch_immersive_muise_bar, (ViewGroup) new FrameLayout(getActivity()), false);
        ckf.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) inflate;
    }

    @Override // tb.phw, tb.khq
    public void findAllViews() {
        TBPublicMenu publicMenu;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        super.findAllViews();
        View findView = findView(R.id.action_view);
        ckf.e(findView, "null cannot be cast to non-null type com.taobao.uikit.actionbar.TBActionView");
        TBActionView tBActionView = (TBActionView) findView;
        this.m0 = tBActionView;
        tBActionView.setTitle("됻:更多");
        Activity activity = getActivity();
        vdd vddVar = null;
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (!(baseActivity == null || (publicMenu = baseActivity.getPublicMenu()) == null)) {
            TBActionView tBActionView2 = this.m0;
            if (tBActionView2 != null) {
                publicMenu.setCustomOverflow(tBActionView2);
            } else {
                ckf.y("actionView");
                throw null;
            }
        }
        View findView2 = findView(R.id.imv_go_back);
        ckf.e(findView2, "null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
        this.n0 = (TUrlImageView) findView2;
        View findView3 = findView(R.id.btn_go_back);
        ckf.d(findView3);
        this.o0 = findView3;
        ViewProxy.setOnClickListener(findView3, new View.OnClickListener() { // from class: tb.tfz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gny.e(gny.this, view);
            }
        });
        View findView4 = findView(R.id.fl_dynamic_container);
        ckf.e(findView4, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.p0 = (FrameLayout) findView4;
        Object h = getModel().d().h(vdd.CONFIG_KEY);
        if (h instanceof vdd) {
            vddVar = (vdd) h;
        }
        if (vddVar != null) {
            vddVar.l2(this);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            znx.b(viewGroup, SystemBarDecorator.getStatusBarHeight(getActivity()));
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "MuiseBarWidget";
    }

    @Override // tb.wdd
    public void w1(SFPromotionBean sFPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76bf7be", new Object[]{this, sFPromotionBean});
        } else if (sFPromotionBean != null) {
            if (sFPromotionBean.f11550a == 10001) {
                TUrlImageView tUrlImageView = this.n0;
                if (tUrlImageView != null) {
                    tUrlImageView.setImageUrl(s0p.BACK_BUTTON_ICON_LIGHT);
                    u5p.c(true, getActivity());
                    TBActionView tBActionView = this.m0;
                    if (tBActionView != null) {
                        tBActionView.switchActionStyle(TBActionBar.ActionBarStyle.NORMAL);
                    } else {
                        ckf.y("actionView");
                        throw null;
                    }
                } else {
                    ckf.y("imvBackButton");
                    throw null;
                }
            } else {
                TUrlImageView tUrlImageView2 = this.n0;
                if (tUrlImageView2 != null) {
                    tUrlImageView2.setImageUrl(s0p.BACK_BUTTON_ICON_DARK);
                    u5p.c(false, getActivity());
                    TBActionView tBActionView2 = this.m0;
                    if (tBActionView2 != null) {
                        tBActionView2.switchActionStyle(TBActionBar.ActionBarStyle.DARK);
                    } else {
                        ckf.y("actionView");
                        throw null;
                    }
                } else {
                    ckf.y("imvBackButton");
                    throw null;
                }
            }
        }
    }
}
