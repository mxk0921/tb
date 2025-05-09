package com.taobao.search.searchdoor.shop.widget.bar;

import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.b4p;
import tb.bql;
import tb.cm1;
import tb.f6p;
import tb.h1p;
import tb.hk4;
import tb.i5p;
import tb.iqp;
import tb.jqp;
import tb.jrk;
import tb.kqp;
import tb.l3p;
import tb.o4p;
import tb.or7;
import tb.ox;
import tb.r4p;
import tb.rqp;
import tb.s4p;
import tb.sen;
import tb.t2o;
import tb.tse;
import tb.u0p;
import tb.v5p;
import tb.yko;
import tb.ylo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShopSearchBarPresenter extends ox<jqp, kqp> implements View.OnClickListener, TextWatcher, TextView.OnEditorActionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SHOP_SEARCH_HINT_APP_ID = "28890";
    private static final String SHOP_SEARCH_MTOP_ALIAS = "inShopHintDataTpp";
    private static final String SHOP_SEARCH_UPLOAD_EXPOSE = "Page_Shop_Search_Button-CPlaceholder";
    private jrk changedListener;
    private String displayHint;
    private String displayQuery;
    private String mLastSuggestRn;
    private or7 requestHintDisposable;
    private String searchHint;
    private String searchWord;
    private String searchWordShow;
    private boolean showPhotoSearch;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements hk4<ArrayList<InShopSearchHintBean>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public void accept(ArrayList<InShopSearchHintBean> arrayList) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("419f837b", new Object[]{this, arrayList});
            } else if (arrayList.size() > 0) {
                InShopSearchHintBean inShopSearchHintBean = arrayList.get(0);
                if (!TextUtils.isEmpty(ShopSearchBarPresenter.access$000(ShopSearchBarPresenter.this)) && !TextUtils.isEmpty(ShopSearchBarPresenter.access$100(ShopSearchBarPresenter.this))) {
                    inShopSearchHintBean.setDisplayText(ShopSearchBarPresenter.access$000(ShopSearchBarPresenter.this));
                    inShopSearchHintBean.setSearchText(ShopSearchBarPresenter.access$100(ShopSearchBarPresenter.this));
                }
                ShopSearchBarPresenter.access$200(ShopSearchBarPresenter.this, inShopSearchHintBean);
                ShopSearchBarPresenter.access$002(ShopSearchBarPresenter.this, null);
                ShopSearchBarPresenter.access$102(ShopSearchBarPresenter.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends u0p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(ShopSearchBarPresenter shopSearchBarPresenter, String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1569381830) {
                super.accept((Throwable) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/shop/widget/bar/ShopSearchBarPresenter$2");
        }

        @Override // tb.u0p
        /* renamed from: a */
        public void accept(Throwable th) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d8addc6", new Object[]{this, th});
                return;
            }
            super.accept(th);
            TLogTracker.i("Default", "-1", th.getMessage());
        }
    }

    static {
        t2o.a(815793312);
    }

    public static /* synthetic */ String access$000(ShopSearchBarPresenter shopSearchBarPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18dcaabc", new Object[]{shopSearchBarPresenter});
        }
        return shopSearchBarPresenter.searchWordShow;
    }

    public static /* synthetic */ String access$002(ShopSearchBarPresenter shopSearchBarPresenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cec4b434", new Object[]{shopSearchBarPresenter, str});
        }
        shopSearchBarPresenter.searchWordShow = str;
        return str;
    }

    public static /* synthetic */ String access$100(ShopSearchBarPresenter shopSearchBarPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe88073d", new Object[]{shopSearchBarPresenter});
        }
        return shopSearchBarPresenter.searchWord;
    }

    public static /* synthetic */ String access$102(ShopSearchBarPresenter shopSearchBarPresenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dac5275", new Object[]{shopSearchBarPresenter, str});
        }
        shopSearchBarPresenter.searchWord = str;
        return str;
    }

    public static /* synthetic */ void access$200(ShopSearchBarPresenter shopSearchBarPresenter, InShopSearchHintBean inShopSearchHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b929e732", new Object[]{shopSearchBarPresenter, inShopSearchHintBean});
        } else {
            shopSearchBarPresenter.updateShopSearchBarHint(inShopSearchHintBean);
        }
    }

    private String getAppId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94038553", new Object[]{this});
        }
        if (l3p.INSTANCE.b()) {
            return cm1.I18N_APP_ID;
        }
        return SHOP_SEARCH_HINT_APP_ID;
    }

    private List<String> getWhiteListParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5543bee9", new Object[]{this});
        }
        return Arrays.asList(o4p.v().split("&"));
    }

    public static /* synthetic */ Object ipc$super(ShopSearchBarPresenter shopSearchBarPresenter, String str, Object... objArr) {
        if (str.hashCode() == -170288889) {
            super.bind((ShopSearchBarPresenter) objArr[0], objArr[1], (yko) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/shop/widget/bar/ShopSearchBarPresenter");
    }

    private void jumpToSearchResultPage(String str, ArrayMap<String, String> arrayMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7816fef", new Object[]{this, str, arrayMap});
        } else {
            rqp.n(getWidget().getModel(), getWidget().getActivity(), str, arrayMap, getWidget());
        }
    }

    private void onImageSearchBtnClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a81ba9d6", new Object[]{this});
            return;
        }
        try {
            String u = o4p.u();
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("pssource", "store");
            s4p model = getWidget().getModel();
            arrayMap.put("sellerId", rqp.f(model));
            arrayMap.put("shopId", rqp.g(model));
            Nav.from(getWidget().getActivity()).toUri(f6p.a(u, arrayMap));
            sen.e("PhotoSearch_Enter");
        } catch (Throwable th) {
            b4p.l("SearchDoorActivity", "启动图搜失败！", th);
        }
    }

    private void onSearchTriggered(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d26bbd", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        String g = rqp.g(getWidget().getModel());
        String f = rqp.f(getWidget().getModel());
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap<String, String> arrayMap2 = new ArrayMap<>();
        if (z) {
            arrayMap.put("keyword", str);
            arrayMap.put("seller_id", f);
            arrayMap.put("shop_id", g);
            String str3 = this.mLastSuggestRn;
            if (str3 != null && !str3.isEmpty()) {
                arrayMap2.put(h1p.KEY_SUGGEST_RN, this.mLastSuggestRn);
            }
            sen.f("CPlaceholder", arrayMap);
        } else {
            arrayMap.put("seller_id", f);
            arrayMap.put("shop_id", g);
            sen.f(r4p.VALUE_SEARCH_ACTION_ZD, arrayMap);
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayMap2.put("from", str2);
        }
        jumpToSearchResultPage(str, arrayMap2);
    }

    private void requestSearchHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b501c5", new Object[]{this});
            return;
        }
        or7 or7Var = this.requestHintDisposable;
        if (or7Var != null && !or7Var.isDisposed()) {
            this.requestHintDisposable.dispose();
        }
        HashMap hashMap = new HashMap();
        if (l3p.INSTANCE.b()) {
            hashMap.put("ovsFrom", "inshop");
        }
        hashMap.put("shop_id", rqp.g(getWidget().getModel()));
        List<String> whiteListParams = getWhiteListParams();
        Map<String, String> w = getWidget().getModel().w();
        if (whiteListParams != null) {
            for (String str : whiteListParams) {
                String str2 = w.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put(str, str2);
                }
            }
        }
        this.requestHintDisposable = new i5p.c().c(new iqp(getAppId(), SHOP_SEARCH_MTOP_ALIAS, hashMap)).b(new tse()).d(new v5p("BGWords")).a().e().j().n(new a(), new b(this, "BGWords"));
    }

    private void updateInputText(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19cc9b92", new Object[]{this, intent});
            return;
        }
        String str = bql.e(intent.getData()).get(ylo.DISPLAY_Q);
        if (str == null) {
            str = "";
        }
        getIView().V(str);
        this.displayQuery = str;
    }

    private void updateShopSearchBarHint(InShopSearchHintBean inShopSearchHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f4d8fa", new Object[]{this, inShopSearchHintBean});
            return;
        }
        this.displayHint = inShopSearchHintBean.getDisplayText();
        this.searchHint = inShopSearchHintBean.getSearchText();
        this.mLastSuggestRn = inShopSearchHintBean.getSuggest_rn();
        sen.l(SHOP_SEARCH_UPLOAD_EXPOSE, inShopSearchHintBean.getUtLogMap());
        getIView().W(inShopSearchHintBean.getDisplayText());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            return;
        }
        String obj = editable.toString();
        int length = obj.length();
        jqp iView = getIView();
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        iView.U(z);
        if (this.showPhotoSearch) {
            jqp iView2 = getIView();
            if (length != 0) {
                z2 = false;
            }
            iView2.Y(z2);
        }
        jrk jrkVar = this.changedListener;
        if (jrkVar != null) {
            ((kqp) jrkVar).z2(obj.trim());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.ox, tb.ddd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        or7 or7Var = this.requestHintDisposable;
        if (or7Var != null && !or7Var.isDisposed()) {
            this.requestHintDisposable.dispose();
        }
    }

    public String getDisplayHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec5a7ba6", new Object[]{this});
        }
        return this.displayHint;
    }

    public String getDisplayQuery() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bd0fcdd", new Object[]{this});
        }
        return this.displayQuery;
    }

    public void handleIntent(Intent intent, jqp jqpVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf993e4", new Object[]{this, intent, jqpVar, new Boolean(z)});
            return;
        }
        this.showPhotoSearch = "true".equals(rqp.l(getWidget().getModel()));
        getIView().Y(this.showPhotoSearch);
        updateInputText(intent);
    }

    @Override // tb.ddd
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.iv_back) {
            getWidget().getActivity().finish();
        } else if (view.getId() == R.id.tv_search) {
            onSearchClick();
        } else if (view.getId() == R.id.fl_oversea_search) {
            onSearchClick();
        } else if (view.getId() == R.id.tv_delete) {
            getIView().X("");
        } else if (view.getId() == R.id.photoBtn) {
            onImageSearchBtnClicked();
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 3 && i != 0) {
            return false;
        }
        onSearchClick();
        return true;
    }

    public void onSearchClick() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6402d68", new Object[]{this});
            return;
        }
        String P = getIView().P();
        if (TextUtils.isEmpty(P)) {
            P = this.searchHint;
            z = true;
        }
        if (!TextUtils.isEmpty(P)) {
            onSearchTriggered(P, z, r4p.VALUE_SEARCH_ACTION_ZD);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    public void setTextChangeListener(jrk jrkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca72f40", new Object[]{this, jrkVar});
        } else {
            this.changedListener = jrkVar;
        }
    }

    public void bind(jqp jqpVar, kqp kqpVar, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec21460", new Object[]{this, jqpVar, kqpVar, ykoVar});
            return;
        }
        super.bind((ShopSearchBarPresenter) jqpVar, (jqp) kqpVar, ykoVar);
        handleIntent(kqpVar.getActivity().getIntent(), jqpVar, true);
        Uri data = kqpVar.getActivity().getIntent().getData();
        if (data != null) {
            this.searchWordShow = data.getQueryParameter("searchWord_show");
            this.searchWord = data.getQueryParameter("searchWord");
        }
        requestSearchHint();
    }
}
