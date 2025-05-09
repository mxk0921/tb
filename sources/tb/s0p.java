package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;
import androidx.appcompat.taobao.TBActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.mmd.datasource.bean.SearchBarBean;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.searchbar.SearchBarTagBean;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s0p extends phw<Void, ViewGroup, acx<? extends o02<? extends BaseSearchResult, ?>>> implements wdd, zo6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BACK_BUTTON_ICON_DARK = "https://img.alicdn.com/imgextra/i3/O1CN01NJOAim1JBT5vetxFd_!!6000000000990-2-tps-80-80.png";
    public static final String BACK_BUTTON_ICON_LIGHT = "https://img.alicdn.com/imgextra/i1/O1CN01tDF3uq1uvOau3MfqW_!!6000000006099-2-tps-80-80.png";
    public static final String PHOTO_SEARCH_ICON = "https://gw.alicdn.com/imgextra/i4/O1CN01cH7J8D1MMPKsMda4D_!!6000000001420-2-tps-120-111.png";
    public static final String PHOTO_SEARCH_ICON_2024 = "https://gw.alicdn.com/imgextra/i2/O1CN01cgCAeP1pYQeISAJ5G_!!6000000005372-2-tps-80-80.png";
    public static final String PHOTO_SEARCH_ICON_2024_DARK = "https://img.alicdn.com/imgextra/i3/O1CN01gdGmNS1qOdo4kQXue_!!6000000005486-2-tps-80-80.png";
    public static final String PHOTO_SEARCH_ICON_I18N = "https://gw.alicdn.com/imgextra/i1/O1CN01Ow0lo51j9ndXbzPVP_!!6000000004506-2-tps-80-80.png";
    public static final String PHOTO_SEARCH_ICON_LIGHT = "https://gw.alicdn.com/imgextra/i3/O1CN01e6A34b25KGBg9w8i1_!!6000000007507-2-tps-120-111.png";
    public static final String SHARE_IMAGE_URL = "https://gw.alicdn.com/mt/TB1MtXRhhuTBuNkHFNRXXc9qpXa-200-200.jpg_150x150.jpg";
    public static final String v = Localization.q(R.string.taobao_app_1005_1_16690);
    public static final String w = Localization.q(R.string.taobao_app_1005_1_16646);
    public static final String x = Localization.q(R.string.taobao_app_1005_1_16705);
    public ActionBar d;
    public TextView e;
    public TUrlImageView f;
    public View g;
    public TextView h;
    public SearchUrlImageView i;
    public TUrlImageView j;
    public Toolbar k;
    public TUrlImageView l;
    public View m;
    public TextView n;
    public TUrlImageView o;
    public LinearLayout p;
    public final boolean t;

    /* renamed from: a  reason: collision with root package name */
    public SFPromotionBean f27720a = null;
    public TBPublicMenu b = null;
    public boolean q = false;
    public boolean r = false;
    public final View.OnClickListener u = new b();
    public final boolean c = "UOne".equals(((CommonBaseDatasource) getModel().b()).getParamValueIncludingGlobal("searchBoxShowType"));
    public final boolean s = getModel().f().getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (s0p.t2(s0p.this) != null) {
                s0p.t2(s0p.this).hide();
            }
            if (s0p.z2(s0p.this) != null) {
                s0p.z2(s0p.this).setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            SearchBarTagBean searchBarTagBean = (SearchBarTagBean) view.getTag();
            if (searchBarTagBean != null) {
                if (o4p.v2()) {
                    s0p.q2(s0p.this, searchBarTagBean);
                } else if (s0p.this.getActivity() instanceof BaseResultActivity) {
                    ((BaseResultActivity) s0p.this.getActivity()).x4(searchBarTagBean);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                s0p.s2(s0p.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f27724a;

        public d(AppCompatActivity appCompatActivity) {
            this.f27724a = appCompatActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            s0p.u2(s0p.this, this.f27724a.getSupportActionBar());
            s0p.v2(s0p.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            s0p s0pVar = s0p.this;
            s0p.x2(s0pVar, s0p.w2(s0pVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                s0p.y2(s0p.this).finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27727a;

        public g(String str) {
            this.f27727a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                Toast.makeText(s0p.this.getActivity(), this.f27727a, 0).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27728a;
        public final /* synthetic */ String b;
        public final /* synthetic */ CommonBaseDatasource c;

        public h(String str, String str2, CommonBaseDatasource commonBaseDatasource) {
            this.f27728a = str;
            this.b = str2;
            this.c = commonBaseDatasource;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/searchbar/SearchBarWidget$7");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                x3p.b(this.f27728a, this.b, this.c.k(), s0p.this.getActivity(), "srp", false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                s0p.s2(s0p.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                String str = "ssk";
                String paramValueIncludingGlobal = s0p.this.getModel().e().getParamValueIncludingGlobal("channelSrp");
                if (!TextUtils.isEmpty(paramValueIncludingGlobal)) {
                    str = "ssk-" + paramValueIncludingGlobal;
                }
                Nav.from(s0p.this.getActivity()).toUri("http://h5.m.taobao.com/tusou/index.html?pssource=" + str);
                sen.h("PhotoSearch_Enter", "a2141.7631709.1999021211.4922322");
            } catch (Throwable unused) {
                b4p.b("SearchDoorActivity", "启动图搜失败！");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class k implements MenuItem.OnMenuItemClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Activity f27731a;
        public final tnd b;

        static {
            t2o.a(815793787);
        }

        public k(Activity activity, tnd tndVar) {
            this.f27731a = activity;
            this.b = tndVar;
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1a1cce6", new Object[]{this});
            } else {
                ShareBusiness.share(this.f27731a, s0p.G2(this.b), (ShareBusinessListener) null);
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
            }
            if (menuItem != null && menuItem.getItemId() == 1001) {
                a();
            }
            return false;
        }
    }

    static {
        t2o.a(815793776);
        t2o.a(815793583);
        t2o.a(993002134);
    }

    public s0p(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        this.t = xyd.a(activity);
        attachToContainer();
        acxVar.b().subscribe(this);
        subscribeEvent(this);
        vdd vddVar = (vdd) getModel().d().h(vdd.CONFIG_KEY);
        if (vddVar != null) {
            vddVar.l2(this);
        }
        if (activity instanceof oxb) {
            ((oxb) activity).P(this);
        }
    }

    public static /* synthetic */ Object ipc$super(s0p s0pVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -211767613) {
            super.onComponentDestroy();
            return null;
        } else if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/searchbar/SearchBarWidget");
        }
    }

    public static /* synthetic */ void q2(s0p s0pVar, SearchBarTagBean searchBarTagBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb5173", new Object[]{s0pVar, searchBarTagBean});
        } else {
            s0pVar.O2(searchBarTagBean);
        }
    }

    public static /* synthetic */ void s2(s0p s0pVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa87c50", new Object[]{s0pVar, new Boolean(z)});
        } else {
            s0pVar.N2(z);
        }
    }

    public static /* synthetic */ ActionBar t2(s0p s0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionBar) ipChange.ipc$dispatch("a292ace3", new Object[]{s0pVar});
        }
        return s0pVar.d;
    }

    public static /* synthetic */ ActionBar u2(s0p s0pVar, ActionBar actionBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionBar) ipChange.ipc$dispatch("bd15bf6f", new Object[]{s0pVar, actionBar});
        }
        s0pVar.d = actionBar;
        return actionBar;
    }

    public static /* synthetic */ void v2(s0p s0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda1f86", new Object[]{s0pVar});
        } else {
            s0pVar.X2();
        }
    }

    public static /* synthetic */ SFPromotionBean w2(s0p s0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SFPromotionBean) ipChange.ipc$dispatch("d05090ec", new Object[]{s0pVar});
        }
        return s0pVar.f27720a;
    }

    public static /* synthetic */ void x2(s0p s0pVar, SFPromotionBean sFPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("928a95ad", new Object[]{s0pVar, sFPromotionBean});
        } else {
            s0pVar.R2(sFPromotionBean);
        }
    }

    public static /* synthetic */ Activity y2(s0p s0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("4b3ce5ff", new Object[]{s0pVar});
        }
        return s0pVar.mActivity;
    }

    public static /* synthetic */ Toolbar z2(s0p s0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toolbar) ipChange.ipc$dispatch("5bfd6c59", new Object[]{s0pVar});
        }
        return s0pVar.k;
    }

    public final void B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab85daae", new Object[]{this});
        } else {
            this.g.setVisibility(8);
        }
    }

    public final void C2() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66b3ffa", new Object[]{this});
            return;
        }
        if (this.d != null) {
            if (!(getActivity() instanceof oxb) || !((oxb) getActivity()).E1()) {
                this.d.setHomeAsUpIndicator(getActivity().getResources().getDrawable(R.drawable.tbsearch_ck_android_black));
                setStatusBarColor(true);
            } else {
                this.d.setHomeAsUpIndicator(getActivity().getResources().getDrawable(R.drawable.actionbar_left_arrow));
                setStatusBarColor(false);
            }
            if (this.t) {
                this.d.setDisplayHomeAsUpEnabled(false);
            }
        }
        this.h.setTextColor(Color.parseColor("#333333"));
        if (this.t && this.l != null) {
            if (!(getActivity() instanceof oxb) || !((oxb) getActivity()).E1()) {
                this.l.setImageUrl(BACK_BUTTON_ICON_LIGHT);
                setStatusBarColor(true);
            } else {
                this.l.setImageUrl(BACK_BUTTON_ICON_DARK);
                setStatusBarColor(false);
            }
        }
        TBPublicMenu tBPublicMenu = this.b;
        if (!(tBPublicMenu == null || tBPublicMenu.getCustomOverflow() == null)) {
            if (!(getActivity() instanceof oxb) || !((oxb) getActivity()).E1()) {
                this.b.getCustomOverflow().switchActionStyle(TBActionBar.ActionBarStyle.NORMAL);
            } else {
                this.b.getCustomOverflow().switchActionStyle(TBActionBar.ActionBarStyle.DARK);
            }
        }
        TUrlImageView tUrlImageView = this.j;
        if (tUrlImageView == null) {
            return;
        }
        if (!this.t) {
            if (Localization.p()) {
                str = PHOTO_SEARCH_ICON_LIGHT;
            } else {
                str = PHOTO_SEARCH_ICON_I18N;
            }
            tUrlImageView.setImageUrl(str);
        } else if (!(getActivity() instanceof oxb) || !((oxb) getActivity()).E1()) {
            this.j.setImageUrl(PHOTO_SEARCH_ICON_2024);
        } else {
            this.j.setImageUrl(PHOTO_SEARCH_ICON_2024_DARK);
        }
    }

    public final void D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd1743b", new Object[]{this});
            return;
        }
        Toolbar toolbar = this.k;
        if (toolbar != null) {
            ViewCompat.setBackground(toolbar, null);
        }
        E2();
        View view = this.g;
        if (view != null) {
            view.setAlpha(0.5f);
        }
    }

    public final void E2() {
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bde835e", new Object[]{this});
            return;
        }
        setStatusBarColor(false);
        if (this.t && (tUrlImageView = this.l) != null) {
            tUrlImageView.setImageUrl(BACK_BUTTON_ICON_DARK);
        }
        ActionBar actionBar = this.d;
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(getActivity().getResources().getDrawable(R.drawable.actionbar_left_arrow));
            if (this.t) {
                this.d.setDisplayHomeAsUpEnabled(false);
            }
        }
        this.h.setTextColor(-1);
        TBPublicMenu tBPublicMenu = this.b;
        if (tBPublicMenu != null && tBPublicMenu.getCustomOverflow() != null) {
            this.b.getCustomOverflow().switchActionStyle(TBActionBar.ActionBarStyle.DARK);
        }
    }

    public int F2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        if (this.t) {
            return R.layout.nx_tbsearch_searchbar_immersive_with_tag_new;
        }
        return R.layout.nx_tbsearch_searchbar_immersive_with_tag;
    }

    public final boolean H2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4da21fa", new Object[]{this})).booleanValue();
        }
        return ((CommonSearchContext) getModel().f()).isPopupSrp();
    }

    public final TextView L2() {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("c7d861f5", new Object[]{this});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.setMargins(o1p.b(3), 0, 0, 0);
        TextView textView = new TextView(getActivity());
        textView.setLayoutParams(layoutParams);
        if (this.s) {
            textView.setTextSize(1, h3p.c(14, true));
        } else {
            if (this.t) {
                f2 = 15.0f;
            } else {
                f2 = 13.5f;
            }
            textView.setTextSize(1, f2);
        }
        textView.setGravity(16);
        textView.setTextColor(Color.parseColor("#333333"));
        textView.setBackgroundResource(R.drawable.tbsearch_searchbar_tag_background);
        return textView;
    }

    /* renamed from: M2 */
    public ViewGroup onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("3747fcae", new Object[]{this});
        }
        Toolbar K2 = K2();
        this.k = K2;
        if (K2 == null) {
            Toolbar toolbar = (Toolbar) LayoutInflater.from(this.mActivity).inflate(F2(), this.mContainer, false);
            this.k = toolbar;
            Activity activity = this.mActivity;
            if (activity instanceof BaseResultActivity) {
                ((BaseResultActivity) activity).z4(toolbar);
            }
        }
        return this.k;
    }

    public final void N2(boolean z) {
        String str;
        Iterator<SearchBarTagBean> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba89c0e", new Object[]{this, new Boolean(z)});
            return;
        }
        sen.h("Door", "a2141.7631709.1999021211.4922321");
        sen.e("ChangeSearch");
        CommonSearchContext commonSearchContext = (CommonSearchContext) getModel().f();
        CommonBaseDatasource commonBaseDatasource = (CommonBaseDatasource) getModel().a();
        boolean booleanParam = commonSearchContext.getBooleanParam(r4p.KEY_SRP_SEARCH_BAR_TAG_STYLE);
        List<SearchBarTagBean> J = getActivity() instanceof rnd ? ((rnd) getActivity()).J() : null;
        if (o4p.O1()) {
            str = this.e.getText().toString();
        } else {
            str = getModel().b().getKeyword();
        }
        if ((getModel().b().getTotalSearchResult() instanceof CommonSearchResult) && ((CommonSearchResult) getModel().b().getTotalSearchResult()).guideSearch) {
            str = getModel().b().getKeyword();
        }
        String str2 = "";
        if (J != null && !J.isEmpty()) {
            while (J.iterator().hasNext()) {
                str = str + " " + it.next().getShowKeyword();
            }
        } else if (!z && booleanParam) {
            str = str2;
        }
        if ("true".equals(commonBaseDatasource.getParamValue(r4p.KEY_HAS_TAB))) {
            str2 = commonBaseDatasource.getTab();
        }
        if (commonSearchContext.isPopupSrp()) {
            ((BaseResultActivity) this.mActivity).v3(new h(str, str2, commonBaseDatasource));
        } else {
            x3p.a(str, str2, commonBaseDatasource.k(), getActivity(), "srp");
        }
    }

    public final void O2(SearchBarTagBean searchBarTagBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1a85a2", new Object[]{this, searchBarTagBean});
        } else if (getActivity() instanceof BaseResultActivity) {
            List<SearchBarTagBean> J = ((BaseResultActivity) getActivity()).J();
            if (J == null || J.isEmpty()) {
                N2(false);
            } else if (searchBarTagBean == J.get(J.size() - 1)) {
                getActivity().finish();
            } else {
                N2(false);
            }
        }
    }

    public void Q2(CommonSearchContext commonSearchContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4e3e31a", new Object[]{this, commonSearchContext});
            return;
        }
        String param = commonSearchContext.getParam(h1p.a.PARAM_COMBO_BIZ_NAME, "");
        if (TextUtils.isEmpty(param)) {
            this.m.setVisibility(8);
            return;
        }
        this.m.setVisibility(0);
        this.n.setText(param);
    }

    public final void R2(SFPromotionBean sFPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afaf2281", new Object[]{this, sFPromotionBean});
        } else if ((getActivity() instanceof oxb) && ((oxb) getActivity()).E1()) {
            C2();
            Toolbar toolbar = this.k;
            if (toolbar != null) {
                ViewCompat.setBackground(toolbar, null);
            }
        } else if (sFPromotionBean != null) {
            Toolbar toolbar2 = this.k;
            if (toolbar2 != null) {
                ViewCompat.setBackground(toolbar2, null);
            }
            if (sFPromotionBean.f11550a == 10002) {
                E2();
            } else {
                C2();
            }
        }
    }

    public final void U2(SearchBarBean searchBarBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7274833", new Object[]{this, searchBarBean});
        } else if (searchBarBean == null) {
            this.f.setVisibility(8);
        } else {
            String str = searchBarBean.suffixIcon;
            if (TextUtils.isEmpty(str)) {
                this.f.setVisibility(8);
                return;
            }
            this.f.setVisibility(0);
            this.f.getLayoutParams().width = (int) (searchBarBean.suffixIconRatio * this.f.getLayoutParams().height);
            this.f.setImageUrl(str);
            this.f.requestLayout();
            this.e.setIncludeFontPadding(false);
        }
    }

    public final void V2(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c05236", new Object[]{this, menu});
        } else if (menu != null) {
            menu.add(0, 1001, 0, getActivity().getResources().getString(R.string.uik_icon_share) + v).setOnMenuItemClickListener(new k(getActivity(), getModel().f()));
        }
    }

    public final void W2(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e05fa5", new Object[]{this, new Integer(i2)});
        } else {
            ((ViewGroup.MarginLayoutParams) this.g.getLayoutParams()).rightMargin = i2;
        }
    }

    public final void X2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7583887", new Object[]{this});
            return;
        }
        this.e.setOnClickListener(new i());
        this.j.setOnClickListener(new j());
        ActionBar actionBar = this.d;
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public final void elderHomeAdapt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ea9ea0", new Object[]{this});
            return;
        }
        this.n.setTextSize(1, h3p.c(14, true));
        this.e.setTextSize(1, h3p.c(14, true));
        this.h.setTextSize(1, h3p.c(14, true));
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SearchBarWidget";
    }

    @Override // tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        if (getActivity() instanceof oxb) {
            ((oxb) getActivity()).j0(this);
        }
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
        } else {
            super.onCtxResume();
        }
    }

    public void onEventMainThread(t2p t2pVar) {
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b8d6ed", new Object[]{this, t2pVar});
        } else if (t2pVar.c() && (commonSearchResult = (CommonSearchResult) getModel().b().getTotalSearchResult()) != null && !commonSearchResult.isFailed()) {
            P2(commonSearchResult);
            if (!this.q) {
                SearchBarBean searchBarInfo = commonSearchResult.getSearchBarInfo();
                if ("search".equals(searchBarInfo.type)) {
                    this.g.setVisibility(0);
                    if (!TextUtils.isEmpty(searchBarInfo.text)) {
                        this.e.setText(searchBarInfo.text);
                    }
                } else {
                    this.g.setVisibility(8);
                }
                if ("title".equals(searchBarInfo.type)) {
                    this.h.setText(searchBarInfo.text);
                    this.h.setVisibility(0);
                    return;
                }
                this.h.setVisibility(8);
            }
        }
    }

    @Override // tb.zo6
    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
            return;
        }
        C2();
        Toolbar toolbar = this.k;
        if (toolbar != null) {
            ViewCompat.setBackground(toolbar, null);
        }
    }

    public final void setStatusBarColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1424789", new Object[]{this, new Boolean(z)});
        } else {
            u5p.c(z, getActivity());
        }
    }

    @Override // tb.wdd
    public void w1(SFPromotionBean sFPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76bf7be", new Object[]{this, sFPromotionBean});
            return;
        }
        this.f27720a = sFPromotionBean;
        R2(sFPromotionBean);
    }

    public void A2(MSearchResult mSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ffd06a4", new Object[]{this, mSearchResult});
        } else if (!mSearchResult.isFailed()) {
            P2(mSearchResult);
            if (!this.q) {
                SearchBarBean searchBarInfo = mSearchResult.getSearchBarInfo();
                if ("search".equals(searchBarInfo.type)) {
                    this.g.setVisibility(0);
                    if (!TextUtils.isEmpty(searchBarInfo.text)) {
                        this.e.setText(searchBarInfo.text);
                    }
                    U2(searchBarInfo);
                } else {
                    this.g.setVisibility(8);
                }
                if ("title".equals(searchBarInfo.type)) {
                    this.h.setText(searchBarInfo.text);
                    this.h.setVisibility(0);
                    return;
                }
                this.h.setVisibility(8);
            }
        }
    }

    public final Toolbar K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toolbar) ipChange.ipc$dispatch("348b8ead", new Object[]{this});
        }
        if (!(this.mActivity instanceof BaseResultActivity)) {
            return null;
        }
        if (o4p.F1()) {
            Log.e("SearchBarWidget", "回收toolbar被禁用");
            return null;
        }
        Toolbar toolbar = ((BaseResultActivity) this.mActivity).getToolbar();
        if (toolbar == null) {
            Log.e("SearchBarWidget", "回收toolbar为空");
            return null;
        }
        this.k = toolbar;
        ViewGroup viewGroup = (ViewGroup) toolbar.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.k);
        }
        this.r = true;
        return toolbar;
    }

    public final void P2(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c406db8", new Object[]{this, commonSearchResult});
            return;
        }
        this.e.setText(getModel().b().getKeyword());
        CommonSearchContext commonSearchContext = (CommonSearchContext) getModel().f();
        J2();
        I2();
        if (commonSearchResult != null) {
            T2(commonSearchResult.getSearchBarInfo());
        }
        if (!this.q) {
            Q2(commonSearchContext);
            this.p.removeAllViews();
            this.p.addView(this.e);
            this.p.addView(this.f);
            boolean booleanParam = commonSearchContext.getBooleanParam(r4p.KEY_SRP_SEARCH_BAR_TAG_STYLE);
            List<SearchBarTagBean> J = getActivity() instanceof rnd ? ((rnd) getActivity()).J() : null;
            if (!TextUtils.isEmpty(commonSearchContext.getParam(r4p.KEY_SEARCH_BAR_ICON)) || (!booleanParam && (J == null || J.isEmpty()))) {
                this.e.setBackgroundDrawable(null);
                this.g.setPadding(0, 0, o1p.b(15), 0);
                S2();
                return;
            }
            this.e.setBackgroundResource(R.drawable.tbsearch_searchbar_tag_background);
            this.g.setPadding(o1p.b(3), 0, o1p.b(15), 0);
            if (!(J == null || J.isEmpty())) {
                for (SearchBarTagBean searchBarTagBean : J) {
                    TextView L2 = L2();
                    L2.setTag(searchBarTagBean);
                    L2.setText(searchBarTagBean.getShowKeyword());
                    L2.setOnClickListener(this.u);
                    if (!this.s) {
                        xho.b(L2, false);
                    }
                    this.p.addView(L2);
                }
            }
        }
    }

    public final void S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e570d7e", new Object[]{this});
            return;
        }
        String param = ((CommonSearchContext) getModel().f()).getParam(r4p.KEY_SEARCH_BAR_ICON);
        if (!TextUtils.isEmpty(param)) {
            try {
                JSONObject parseObject = JSON.parseObject(param);
                int intValue = parseObject.getIntValue("width");
                int intValue2 = parseObject.getIntValue("height");
                int a2 = o1p.a(51.5f);
                int a3 = o1p.a(14.0f);
                if (!(intValue2 == 0 || intValue == 0)) {
                    a2 = (int) (((intValue * 1.0f) / intValue2) * a3);
                }
                TUrlImageView tUrlImageView = new TUrlImageView(getActivity());
                tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a2, a3);
                layoutParams.leftMargin = o1p.a(1.0f);
                layoutParams.gravity = 16;
                this.p.addView(tUrlImageView, layoutParams);
                tUrlImageView.setImageUrl(parseObject.getString("url"));
                this.e.setIncludeFontPadding(false);
            } catch (Exception e2) {
                b4p.b("renderSearchIcon", "原始数据" + param);
                b4p.b("renderSearchIcon", e2.getLocalizedMessage());
            }
        }
    }

    public final void T2(SearchBarBean searchBarBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9964db80", new Object[]{this, searchBarBean});
        } else if (!TextUtils.equals(searchBarBean.type, "title")) {
            this.o.setVisibility(8);
        } else {
            String str = searchBarBean.info;
            String str2 = searchBarBean.icon;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                this.o.setVisibility(8);
                return;
            }
            this.o.setVisibility(0);
            this.o.setImageUrl(str2);
            this.o.setOnClickListener(new g(str));
        }
    }

    @Override // tb.phw, tb.khq
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        if ((appCompatActivity.getSupportActionBar() instanceof WindowDecorActionBar) || this.r) {
            Log.e("SearchBarWidget", "actionbar exists, cannot set toolbar");
            AppMonitor.Alarm.commitFail("SearchResultPage", DxContainerActivity.PARAMS_SHOW_ACTION_BAR, "actionBarExists", "true");
        } else {
            appCompatActivity.setSupportActionBar((Toolbar) getView());
            AppMonitor.Alarm.commitSuccess("SearchResultPage", DxContainerActivity.PARAMS_SHOW_ACTION_BAR);
        }
        this.m = findView(R.id.search_bar_left_container);
        TextView textView = (TextView) findView(R.id.sblc_txt_tv);
        this.n = textView;
        textView.setTextColor(Color.parseColor("#777777"));
        this.e = (TextView) findView(R.id.searchEdit);
        this.f = (TUrlImageView) findView(R.id.iv_suffix_icon);
        TUrlImageView tUrlImageView = (TUrlImageView) findView(R.id.photoBtn);
        this.j = tUrlImageView;
        if (tUrlImageView != null) {
            xho.c(tUrlImageView);
            if (!this.t) {
                if (Localization.p()) {
                    this.j.setImageUrl(PHOTO_SEARCH_ICON);
                } else {
                    this.j.setImageUrl(PHOTO_SEARCH_ICON_I18N);
                }
            } else if (!(getActivity() instanceof oxb) || !((oxb) getActivity()).E1()) {
                this.j.setImageUrl(PHOTO_SEARCH_ICON_2024);
            } else {
                this.j.setImageUrl(PHOTO_SEARCH_ICON_2024_DARK);
            }
        }
        this.g = findView(R.id.searchbar_inner);
        this.h = (TextView) findView(R.id.search_title);
        this.i = (SearchUrlImageView) findView(R.id.imv_search_title);
        if (!this.s) {
            xho.a(this.h);
            xho.a(this.e);
            xho.a(this.n);
        }
        TUrlImageView tUrlImageView2 = (TUrlImageView) findView(R.id.imv_title_icon);
        this.o = tUrlImageView2;
        xho.c(tUrlImageView2);
        this.p = (LinearLayout) findView(R.id.ll_tags_container);
        RelativeLayout relativeLayout = (RelativeLayout) findView(R.id.search_bar_wrapper);
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new c());
        }
        appCompatActivity.runOnUiThread(new d(appCompatActivity));
        this.g.setVisibility(0);
        this.h.setVisibility(8);
        P2(null);
        CommonSearchContext commonSearchContext = (CommonSearchContext) getModel().f();
        if (getActivity() instanceof ITBPublicMenu) {
            this.b = ((ITBPublicMenu) getActivity()).getPublicMenu();
        }
        ((ViewGroup) getView()).post(new e());
        if (this.s) {
            elderHomeAdapt();
        }
        if (this.t) {
            TUrlImageView tUrlImageView3 = (TUrlImageView) findView(R.id.btn_go_back);
            this.l = tUrlImageView3;
            xho.c(tUrlImageView3);
            this.l.setOnClickListener(new f());
            this.g.setBackgroundResource(R.drawable.tbsearch_searchdoor_bar_bg_uone_new);
        } else if (this.c) {
            this.g.setBackgroundResource(R.drawable.tbsearch_searchdoor_bar_bg_uone);
        } else if (!Localization.p()) {
            this.g.setBackgroundResource(R.drawable.tbsearch_searchdoor_bar_bg_i18n);
        }
        if (Arrays.asList(o4p.U()).contains(commonSearchContext.getChannelSrp())) {
            this.j.setVisibility(8);
        } else {
            this.j.setVisibility(0);
        }
        if (H2()) {
            W2(DensityUtil.dip2px(this.mActivity, 30.0f));
            ViewGroup.LayoutParams layoutParams = this.b.getCustomOverflow().getLayoutParams();
            if (layoutParams == null) {
                this.b.getCustomOverflow().setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                return;
            }
            layoutParams.width = 0;
            layoutParams.height = 0;
            this.b.getCustomOverflow().requestLayout();
        }
    }

    public static ShareContent G2(tnd tndVar) {
        Map<String, String> map;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("a271a430", new Object[]{tndVar});
        }
        ShareContent shareContent = new ShareContent();
        if (tndVar != null) {
            str = tndVar.getParam("q");
            map = tndVar.getParamsSnapshot();
        } else {
            map = new HashMap<>(1);
            str = "";
        }
        shareContent.url = f6p.c(o4p.D(), map);
        if (TextUtils.isEmpty(str)) {
            shareContent.description = x;
        } else {
            shareContent.description = String.format(w, str);
        }
        shareContent.businessId = "shoutaosearch";
        shareContent.imageUrl = SHARE_IMAGE_URL;
        return shareContent;
    }

    public final void I2() {
        CommonSearchContext commonSearchContext;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8beab14", new Object[]{this});
        } else if (!this.q && (commonSearchContext = (CommonSearchContext) getModel().f()) != null) {
            if (commonSearchContext.isSameStyleModule()) {
                str = Globals.getApplication().getResources().getString(R.string.same_result_activity_title);
            } else {
                str = "";
            }
            if (commonSearchContext.isSimilarModule()) {
                str = Globals.getApplication().getResources().getString(R.string.similar_result_activity_title);
            }
            if (commonSearchContext.isLongSleeveRecommendModule()) {
                str = Globals.getApplication().getResources().getString(R.string.recommend_result_activity_title);
            }
            if (commonSearchContext.isShopSimilarSearchModule()) {
                str = Globals.getApplication().getString(R.string.shopsimilar_result_activity_title);
            }
            String param = commonSearchContext.getParam(h1p.KEY_SRP_CUSTOM_TITLE);
            if (!TextUtils.isEmpty(param)) {
                str = param;
            }
            if (!TextUtils.isEmpty(str)) {
                this.h.setText(str);
                this.h.setVisibility(0);
                this.g.setVisibility(8);
                this.i.setVisibility(8);
                this.q = true;
            }
        }
    }

    public final void J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c5244d5", new Object[]{this});
            return;
        }
        CommonSearchContext commonSearchContext = (CommonSearchContext) getModel().f();
        if (commonSearchContext != null) {
            String param = commonSearchContext.getParam(h1p.KEY_SRP_CUSTOM_TITLE_IMG);
            if (!TextUtils.isEmpty(param)) {
                this.h.setVisibility(8);
                this.g.setVisibility(8);
                this.i.setVisibility(0);
                this.i.setImageUrl(param);
                this.q = true;
            }
        }
    }

    public void onEventMainThread(exk exkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef4856e8", new Object[]{this, exkVar});
        } else if ("1".equals(exkVar.f18868a)) {
            B2();
        } else if ("2".equals(exkVar.f18868a)) {
            D2();
        }
    }

    public void onEventMainThread(m0p m0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f6cc5a", new Object[]{this, m0pVar});
        } else {
            V2(m0pVar.f23699a);
        }
    }

    public void onEventMainThread(g0p g0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0dfc47", new Object[]{this, g0pVar});
        } else {
            new Handler(Looper.getMainLooper()).post(new a());
        }
    }
}
