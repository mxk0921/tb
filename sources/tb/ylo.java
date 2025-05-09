package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.taobao.TBActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.sf.InshopResultActivity;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ylo extends phw<Void, View, acx<? extends o02<? extends BaseSearchResult, ?>>> implements View.OnClickListener, auc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final ay4<x02, phw> CREATOR = new a();
    public static final String DISPLAY_Q = "displayQ";

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f32170a;
    public TextView c;
    public View d;
    public TextView e;
    public TextView f;
    public View g;
    public TextView h;
    public final CommonSearchContext i;
    public final boolean j;
    public final boolean k = !l3p.INSTANCE.b();
    public final Activity b = getActivity();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ay4<x02, phw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public phw a(x02 x02Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (phw) ipChange.ipc$dispatch("de3eff53", new Object[]{this, x02Var});
            }
            return new ylo(x02Var.f31046a, x02Var.b, x02Var.c, x02Var.d, x02Var.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements g1a<String, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public xhv invoke(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("32558f08", new Object[]{this, str});
            }
            if (str != null) {
                ylo.q2(ylo.this);
                ylo.q2(ylo.this).setText(str);
                TextView q2 = ylo.q2(ylo.this);
                q2.setContentDescription(Localization.q(R.string.taobao_app_1005_1_16703) + str);
            }
            return xhv.INSTANCE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ylo.s2(ylo.this).setNavigationIcon(R.drawable.tbsearch_activate_back_btn);
            }
        }
    }

    static {
        t2o.a(815793770);
        t2o.a(993001866);
    }

    public ylo(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        this.j = false;
        CommonSearchContext commonSearchContext = (CommonSearchContext) acxVar.f();
        this.i = commonSearchContext;
        this.j = commonSearchContext.getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN);
        attachToContainer();
    }

    public static /* synthetic */ Object ipc$super(ylo yloVar, String str, Object... objArr) {
        if (str.hashCode() == 217607196) {
            super.onCtxResume();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/searchbar/SFShopActionBarWidget");
    }

    public static /* synthetic */ TextView q2(ylo yloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("3eae68ee", new Object[]{yloVar});
        }
        return yloVar.c;
    }

    public static /* synthetic */ Toolbar s2(ylo yloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toolbar) ipChange.ipc$dispatch("69f33d8a", new Object[]{yloVar});
        }
        return yloVar.f32170a;
    }

    @Override // tb.auc
    public void K0(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224521ba", new Object[]{this, new Boolean(z), new Float(f)});
        }
    }

    @Override // tb.auc
    public void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a95530d", new Object[]{this});
        }
    }

    @Override // tb.auc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6833c7a", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.auc
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    @Override // tb.auc
    public kr1 getBehavior() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr1) ipChange.ipc$dispatch("9c30dbef", new Object[]{this});
        }
        return new sra((View) getView(), true, new zwm(zwm.HALF_STICKY.b - 1, 1001, 2000));
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SFShopActionBarWidget";
    }

    @Override // tb.auc
    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726a97c8", new Object[]{this});
        }
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        if (FestivalMgr.i().v("global")) {
            u2();
        } else {
            t2();
        }
    }

    public final void onImageSearchBtnClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a81ba9d6", new Object[]{this});
            return;
        }
        try {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("pssource", "store");
            tnd f = getModel().f();
            arrayMap.put("sellerId", f.getParam("sellerId"));
            arrayMap.put("shopId", f.getParam("shopId"));
            Nav.from(getActivity()).toUri(f6p.a(h1p.PAILITAO_URL, arrayMap));
            sen.e("PhotoSearch_Enter");
        } catch (Throwable th) {
            b4p.l("SearchDoorActivity", "启动图搜失败！", th);
        }
    }

    @Override // tb.auc
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b11b6f", new Object[]{this});
            return;
        }
        FestivalMgr.i().C(this.b, TBActionBar.ActionBarStyle.NORMAL);
        int color = ContextCompat.getColor(this.b, R.color.big_K);
        ((TextView) this.g.findViewById(R.id.shop_search_result_category_bt)).setTextColor(color);
        ((TextView) this.g.findViewById(R.id.shop_search_result_category_text)).setTextColor(color);
        if (this.k) {
            this.d.setBackgroundResource(R.drawable.tbsearch_searchbar_input_background);
        }
        int b2 = o1p.b(15);
        this.d.setPadding(b2, 0, b2, 0);
    }

    public final void u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76acf4b7", new Object[]{this});
            return;
        }
        FestivalMgr.i().C(this.b, TBActionBar.ActionBarStyle.NORMAL);
        ((TextView) this.g.findViewById(R.id.shop_search_result_category_bt)).setTextColor(-1);
        ((TextView) this.g.findViewById(R.id.shop_search_result_category_text)).setTextColor(-1);
        int b2 = o1p.b(6);
        this.d.setPadding(b2, 0, b2, 0);
        if (this.k) {
            this.d.setBackgroundResource(R.drawable.tbsearch_style_searchbar_promotion);
        }
    }

    public final void v2(Toolbar toolbar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b10f782", new Object[]{this, toolbar, str});
            return;
        }
        TextView textView = (TextView) toolbar.findViewById(R.id.searchEdit);
        this.c = textView;
        textView.setFocusable(false);
        this.c.setText(str);
        TextView textView2 = this.c;
        textView2.setContentDescription(Localization.q(R.string.taobao_app_1005_1_16703) + str);
        this.c.setOnClickListener(this);
        String param = this.i.getParam("searchTips");
        if (!TextUtils.isEmpty(param)) {
            this.c.setHint(param);
        }
        this.d = toolbar.findViewById(R.id.searchbar_inner);
        View findViewById = toolbar.findViewById(R.id.shop_search_result_category_ll);
        this.g = findViewById;
        ViewProxy.setOnClickListener(findViewById, this);
        this.e = (TextView) toolbar.findViewById(R.id.shop_search_result_category_bt);
        this.f = (TextView) toolbar.findViewById(R.id.shop_search_result_category_text);
        this.h = (TextView) toolbar.findViewById(R.id.photoBtn);
        if (!this.k) {
            this.d.setBackgroundResource(R.drawable.tbsearch_active_search_bg);
            this.h.setVisibility(8);
            this.g.setVisibility(8);
        } else if ("true".equals(getModel().f().getParam("photoSearch"))) {
            this.h.setVisibility(0);
            this.h.setOnClickListener(this);
        }
        o02 b2 = getModel().b();
        if (b2 instanceof qsi) {
            ((qsi) b2).h1(new b());
        }
    }

    @Override // tb.phw
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        Toolbar toolbar = (Toolbar) LayoutInflater.from(this.b).inflate(R.layout.sf_tbsearch_shopsearchbar, this.mContainer, false);
        this.f32170a = toolbar;
        v2(toolbar, this.i.getParam("q", ""));
        ((AppCompatActivity) getActivity()).setSupportActionBar(this.f32170a);
        if (l3p.INSTANCE.b()) {
            this.f32170a.post(new c());
        }
        if (this.j) {
            this.c.setTextSize(1, h3p.c(14, true));
            this.e.setVisibility(8);
            this.f.setTextSize(1, h3p.c(14, true));
        }
        return this.f32170a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("shop_id", this.i.getParam("shopId", ""));
        arrayMap.put("seller_id", this.i.getParam("sellerId", ""));
        int id = view.getId();
        int i = R.id.shop_search_result_category_ll;
        String str = InshopResultActivity.SEARCH_PAGE_SPM;
        if (id == i) {
            ArrayMap arrayMap2 = new ArrayMap();
            arrayMap2.put("shop_id", this.i.getParam("shopId", ""));
            arrayMap2.put("user_id", this.i.getParam("sellerId", ""));
            String param = this.i.getParam(r4p.KEY_MINI_APP);
            String param2 = this.i.getParam(r4p.KEY_MINI_APP_CATEGORY_URL);
            if (!TextUtils.equals("true", param) || TextUtils.isEmpty(param2)) {
                z = false;
            }
            arrayMap2.put("isNewStyle", getModel().e().getParamValue("isNewStyle"));
            if (TextUtils.equals(this.i.getParam("from"), "category")) {
                this.b.finish();
            } else {
                arrayMap2.put("spm", str);
                if (z) {
                    Nav.from(this.b).toUri(param2);
                } else {
                    Nav.from(this.b).toUri(f6p.a("http://shop.m.taobao.com/category/index.htm", arrayMap2));
                }
            }
            sen.f("Category", arrayMap);
        } else if (view.getId() == R.id.searchEdit) {
            sen.e("Door");
            sen.e("ChangeSearch");
            sen.f(z9u.SEARCH_ENTRANCE_CLICK, arrayMap);
            ArrayMap arrayMap3 = new ArrayMap();
            arrayMap3.put("shopId", this.i.getParam("shopId", ""));
            arrayMap3.put("sellerId", this.i.getParam("sellerId", ""));
            arrayMap3.put(DISPLAY_Q, ((Object) this.c.getText()) + "");
            String param3 = this.i.getParam("photoSearch");
            if (!TextUtils.isEmpty(param3)) {
                arrayMap3.put("photoSearch", param3);
            }
            String param4 = this.i.getParam(r4p.KEY_STORE_ID);
            if (!TextUtils.isEmpty(param4)) {
                arrayMap3.put(r4p.KEY_STORE_ID, param4);
            }
            String param5 = this.i.getParam("searchTips");
            String param6 = this.i.getParam("searchWord");
            if (!TextUtils.isEmpty(param5) && !TextUtils.isEmpty(param6)) {
                arrayMap3.put("searchTips", param5);
                arrayMap3.put("searchWord", param6);
            }
            if (TextUtils.equals(this.i.getParam("from"), "category")) {
                str = InshopResultActivity.CATEGORY_PAGE_SPM;
            }
            arrayMap3.put("spm", str);
            arrayMap3.put("isNewStyle", getModel().e().getParamValue("isNewStyle"));
            if ("true".equals(this.i.getParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN))) {
                arrayMap3.put(r4p.KEY_SHOP_SEARCH_ELDER, sse.IN_SHOP_ELDER_HIT_VALUE);
            }
            String param7 = this.i.getParam("ifOverseas");
            if ("true".equals(param7)) {
                arrayMap3.put("ifOverseas", param7);
            }
            Nav.from(this.b).toUri(f6p.a("http://shop.m.taobao.com/goods/index.htm?gotoSearch=1", arrayMap3));
            this.b.finish();
        } else if (view.getId() == R.id.photoBtn) {
            onImageSearchBtnClicked();
        }
    }
}
