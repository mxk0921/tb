package com.taobao.android.live.plugin.atype.flexalocal.good.view.search;

import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView;
import com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView;
import com.taobao.android.live.plugin.atype.flexalocal.good.insideprefetch.InsidePrefetchHelper;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.TypeDX;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.AbstractGoodsRecyclerAdapter;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.ItemGroupAdapter2;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.view.RecyclerViewNoBugLinearLayoutManager;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchPopView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.search.TaoLiveSearchHistoryView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import tb.a1u;
import tb.bdd;
import tb.cpf;
import tb.hha;
import tb.ijr;
import tb.kkr;
import tb.pfa;
import tb.q4g;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.uga;
import tb.vac;
import tb.vc;
import tb.wda;
import tb.xac;
import tb.xea;
import tb.xha;
import tb.yga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodListSearchView extends GoodsBaseView<xac> implements TaoLiveSearchHistoryView.c, View.OnClickListener, vac, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int INPUT_MAX_WORD = 30;
    public static final String TAG = "GoodListSearchView";
    private TUrlImageView mBackBtn;
    private String mCurrentResultKey;
    private TUrlImageView mDeleteAllInputBtn;
    private AppCompatEditText mEditText;
    private AliUrlImageView mEmptyImage;
    private AliUrlImageView mErrorImage;
    private Button mErrorRetryButton;
    private TaoLiveSearchHistoryView mHistoryView;
    private f mICancelClickListener;
    private View mResultContainerView;
    private View mResultEmptyView;
    private View mResultErrorView;
    private AbstractGoodsRecyclerAdapter mResultListAdapter;
    private TextView mResultNumView;
    private ViewGroup mResultSearchEntryView;
    private View mSearchBtn;
    private CloseRecyclerView mSearchResultListView;
    private cpf mViewFactory;
    private boolean enableSearchUIOptimize = yga.H();
    private final Runnable prefetchRunnable = new a();
    private final int searchResultFirstShowPreFetchDelayDuration = yga.t0();
    private final boolean enableShowGoodsSearchItem = yga.K();
    private String mGoodsListSearchMoreUrl = yga.c0();
    private Handler handler = new Handler();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                GoodListSearchView.this.preFetchInsideDetailData(InsidePrefetchHelper.OPEN_SOURCE_OPEN_SEARCH);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f8554a;
        public int b;

        public b() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            this.f8554a = i;
            this.b = i3;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                return;
            }
            StringBuilder sb = new StringBuilder("afterTextChanged: s=");
            sb.append((Object) editable);
            sb.append("   mStart=");
            sb.append(this.f8554a);
            sb.append("   mCount=");
            sb.append(this.b);
            sb.append("   start=");
            sb.append(GoodListSearchView.access$000(GoodListSearchView.this).getSelectionStart());
            sb.append(" end=");
            sb.append(GoodListSearchView.access$000(GoodListSearchView.this).getSelectionEnd());
            if (editable == null || TextUtils.isEmpty(editable.toString())) {
                GoodListSearchView.access$400(GoodListSearchView.this).setVisibility(8);
                return;
            }
            GoodListSearchView.access$400(GoodListSearchView.this).setVisibility(0);
            String obj = editable.toString();
            if (obj.length() > 30) {
                a1u.a(GoodListSearchView.access$500(GoodListSearchView.this).i(), "最多只能输入30个字哦");
                int i = this.f8554a;
                int i2 = this.b;
                editable.delete((i + i2) - (obj.length() - 30), i + i2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnFocusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            int i;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                return;
            }
            View access$600 = GoodListSearchView.access$600(GoodListSearchView.this);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            access$600.setVisibility(i);
            TUrlImageView access$400 = GoodListSearchView.access$400(GoodListSearchView.this);
            if (!z || TextUtils.isEmpty(GoodListSearchView.access$000(GoodListSearchView.this).getText())) {
                i2 = 8;
            }
            access$400.setVisibility(i2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                q4g.b(GoodListSearchView.access$000(GoodListSearchView.this), 1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements CloseRecyclerView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e067b313", new Object[]{this, new Boolean(z)});
            } else {
                ((xac) GoodListSearchView.access$800(GoodListSearchView.this)).g(GoodListSearchView.access$700(GoodListSearchView.this), "");
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
        public void b(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9fcd8b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
        public void c(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf6d3fca", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6de45c84", new Object[]{this});
            } else if (kkr.i().d() != null) {
                kkr.i().d().c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface f {
    }

    static {
        t2o.a(295699383);
        t2o.a(295699404);
        t2o.a(295699405);
        t2o.a(806355016);
    }

    public GoodListSearchView(xea xeaVar) {
        super(xeaVar, false);
        uga ugaVar;
        initView();
        xha.i(this.mGoodLiveContext.u(), this.mGoodLiveContext.g());
        sjr.g().a(this);
        if (!wda.e()) {
            com.alibaba.android.ultron.vfw.instance.a D = this.mGoodLiveContext.D();
            ugaVar = new uga(this.mGoodLiveContext, D.G().c0(), D);
        } else {
            ugaVar = null;
        }
        this.mViewFactory = new cpf(this.mGoodLiveContext, ugaVar);
    }

    public static /* synthetic */ AppCompatEditText access$000(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppCompatEditText) ipChange.ipc$dispatch("9680100f", new Object[]{goodListSearchView});
        }
        return goodListSearchView.mEditText;
    }

    public static /* synthetic */ void access$100(GoodListSearchView goodListSearchView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd46e3b", new Object[]{goodListSearchView, str, new Integer(i)});
        } else {
            goodListSearchView.search(str, i);
        }
    }

    public static /* synthetic */ xea access$200(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("da74bebd", new Object[]{goodListSearchView});
        }
        return goodListSearchView.mGoodLiveContext;
    }

    public static /* synthetic */ xea access$300(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("6dc91d7e", new Object[]{goodListSearchView});
        }
        return goodListSearchView.mGoodLiveContext;
    }

    public static /* synthetic */ TUrlImageView access$400(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("1cc83681", new Object[]{goodListSearchView});
        }
        return goodListSearchView.mDeleteAllInputBtn;
    }

    public static /* synthetic */ xea access$500(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("9471db00", new Object[]{goodListSearchView});
        }
        return goodListSearchView.mGoodLiveContext;
    }

    public static /* synthetic */ View access$600(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("50c4985b", new Object[]{goodListSearchView});
        }
        return goodListSearchView.mSearchBtn;
    }

    public static /* synthetic */ String access$700(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eda347e8", new Object[]{goodListSearchView});
        }
        return goodListSearchView.mCurrentResultKey;
    }

    public static /* synthetic */ bdd access$800(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("d1f4ed35", new Object[]{goodListSearchView});
        }
        return goodListSearchView.mPresenter;
    }

    private void buildSearchEntryView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17188f2", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            hha.b(TAG, "buildSearchEntryView in blank | searchKey is empty.");
        } else if (vc.i(this.mGoodLiveContext.i())) {
            hha.b(TAG, "buildSearchEntryView in blank | Devices is tablet.");
        } else if (!this.enableShowGoodsSearchItem) {
            hha.b(TAG, "buildSearchEntryView in blank | enableShowGoodsSearchItem is false.");
        } else {
            TypeDX a2 = this.mViewFactory.a(10);
            JSONObject d2 = pfa.d(true, str, this.mGoodsListSearchMoreUrl, ((xac) this.mPresenter).l());
            this.mResultSearchEntryView.removeAllViews();
            if (a2 != null && a2.itemView != null && a2.b0() != null) {
                this.mResultSearchEntryView.addView(a2.itemView);
                a2.b0().a(a2, d2, -1);
                xha.g(this.mGoodLiveContext.u(), this.mGoodLiveContext.g(), d2);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(GoodListSearchView goodListSearchView, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/search/GoodListSearchView");
    }

    private void removeResultSearchEntryView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5886f5", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.mResultSearchEntryView;
        if (viewGroup != null && viewGroup.getChildCount() > 0) {
            this.mResultSearchEntryView.removeAllViews();
        }
    }

    private void search(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb647ea", new Object[]{this, str, new Integer(i)});
            return;
        }
        ((xac) this.mPresenter).D(str, "", i);
        if (this.enableSearchUIOptimize && !TextUtils.isEmpty(str)) {
            this.mEditText.clearFocus();
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return TAG;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        ((xac) this.mPresenter).p();
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.prefetchRunnable);
        }
        sjr.g().b(this);
    }

    @Override // tb.sac
    public AbstractGoodsRecyclerAdapter getAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractGoodsRecyclerAdapter) ipChange.ipc$dispatch("9330d3b6", new Object[]{this});
        }
        return this.mResultListAdapter;
    }

    @Override // tb.sac
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.hide.member.identification.inner", "com.taobao.taolive.room.goodlist.timepoint.asked.inner", "com.taobao.taolive.room.goodlist.all.refresh.item.inner"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return xea.E(this.mGoodLiveContext);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.taolive_good_search_delete_all) {
            this.mEditText.setText("");
            this.mDeleteAllInputBtn.setVisibility(8);
            showInitState();
            xha.d(this.mGoodLiveContext.u(), this.mGoodLiveContext.g());
        } else if (view.getId() == R.id.taolive_good_bak_container) {
            xha.a(this.mGoodLiveContext.u(), this.mGoodLiveContext.g());
            f fVar = this.mICancelClickListener;
            if (fVar != null) {
                ((GoodListSearchPopView.a) fVar).a();
            }
        } else if (view.getId() == R.id.taolive_goods_search_retry_new) {
            search(this.mCurrentResultKey, 1);
        } else if (view.getId() == R.id.taolive_good_search_button) {
            if (this.mEditText.getText() != null) {
                search(this.mEditText.getText().toString(), 2);
            }
            q4g.a(this.mEditText, null);
            xha.e(this.mGoodLiveContext.u(), this.mGoodLiveContext.g(), true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r7.equals("com.taobao.taolive.hide.member.identification.inner") == false) goto L_0x0023;
     */
    @Override // tb.s3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvent(java.lang.String r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "c3897928"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r3.ipc$dispatch(r4, r5)
            return
        L_0x0018:
            r7.hashCode()
            r3 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case -2034149202: goto L_0x0039;
                case 189607490: goto L_0x002e;
                case 224943025: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0043
        L_0x0025:
            java.lang.String r1 = "com.taobao.taolive.hide.member.identification.inner"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0043
            goto L_0x0023
        L_0x002e:
            java.lang.String r0 = "com.taobao.taolive.room.goodlist.timepoint.asked.inner"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0037
            goto L_0x0023
        L_0x0037:
            r0 = 1
            goto L_0x0043
        L_0x0039:
            java.lang.String r0 = "com.taobao.taolive.room.goodlist.all.refresh.item.inner"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0042
            goto L_0x0023
        L_0x0042:
            r0 = 0
        L_0x0043:
            switch(r0) {
                case 0: goto L_0x004f;
                case 1: goto L_0x004f;
                case 2: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x005c
        L_0x0047:
            T extends tb.bdd r7 = r6.mPresenter
            tb.xac r7 = (tb.xac) r7
            r7.a()
            goto L_0x005c
        L_0x004f:
            boolean r7 = r8 instanceof com.taobao.taolive.sdk.model.common.LiveItem
            if (r7 == 0) goto L_0x005c
            T extends tb.bdd r7 = r6.mPresenter
            tb.xac r7 = (tb.xac) r7
            com.taobao.taolive.sdk.model.common.LiveItem r8 = (com.taobao.taolive.sdk.model.common.LiveItem) r8
            r7.h(r8)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchView.onEvent(java.lang.String, java.lang.Object):void");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.search.TaoLiveSearchHistoryView.c
    public void onSearchHistoryTagClicked(SearchHistory searchHistory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79deef47", new Object[]{this, searchHistory});
        } else if (searchHistory != null && !TextUtils.isEmpty(searchHistory.getKey())) {
            this.mCurrentResultKey = null;
            this.mEditText.setText(searchHistory.getKey());
            this.mEditText.setSelection(searchHistory.getKey().length());
            search(searchHistory.getKey(), 3);
        }
    }

    public void setCancelClickListener(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b939ee4", new Object[]{this, fVar});
        } else {
            this.mICancelClickListener = fVar;
        }
    }

    @Override // tb.sac
    public void showEmpty(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00b2ee1", new Object[]{this, str});
            return;
        }
        this.mHistoryView.setVisibility(8);
        this.mResultContainerView.setVisibility(8);
        this.mResultEmptyView.setVisibility(0);
        buildSearchEntryView(str);
        this.mResultErrorView.setVisibility(8);
        this.mCurrentResultKey = str;
        String l = ((xac) this.mPresenter).l();
        if (((xac) this.mPresenter).z() != 3) {
            z = false;
        }
        xha.h(l, str, z, false);
    }

    @Override // tb.sac
    public void showError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce476d5c", new Object[]{this, str});
            return;
        }
        this.mHistoryView.setVisibility(8);
        this.mResultContainerView.setVisibility(8);
        this.mResultEmptyView.setVisibility(8);
        removeResultSearchEntryView();
        this.mResultErrorView.setVisibility(0);
        this.mCurrentResultKey = str;
    }

    public void showInitState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39edd6b", new Object[]{this});
            return;
        }
        if (this.mHistoryView.updateView(this.mGoodLiveContext) || !this.mGoodLiveContext.T()) {
            this.mHistoryView.setVisibility(8);
        } else {
            this.mHistoryView.setVisibility(0);
        }
        this.mResultContainerView.setVisibility(8);
        this.mResultEmptyView.setVisibility(8);
        removeResultSearchEntryView();
        this.mResultErrorView.setVisibility(8);
        this.mResultListAdapter.N().clear();
        this.mResultListAdapter.notifyDataSetChanged();
        this.mCurrentResultKey = null;
    }

    @Override // tb.vac
    public void updateHistoryView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85e0d57", new Object[]{this});
        } else {
            this.mHistoryView.updateView(this.mGoodLiveContext);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    public xac initInjector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xac) ipChange.ipc$dispatch("536bc4ac", new Object[]{this});
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.view.search.a aVar = new com.taobao.android.live.plugin.atype.flexalocal.good.view.search.a(this.mGoodLiveContext);
        this.mHistoryView.setDataClearListener(aVar);
        this.mHistoryView.setHistoryKeyWords(aVar.U());
        showInitState();
        return aVar;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    public View onCreateContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a20e10cc", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.taolive_goods_search_pop_layout_flexalocal, (ViewGroup) null);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.taolive_good_bak_container);
        this.mBackBtn = tUrlImageView;
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01JAqp1b1PIEfddYnUp_!!6000000001817-2-tps-80-80.png");
        this.mBackBtn.setOnClickListener(this);
        View findViewById = inflate.findViewById(R.id.taolive_good_search_button);
        this.mSearchBtn = findViewById;
        ViewProxy.setOnClickListener(findViewById, this);
        this.mEditText = (AppCompatEditText) inflate.findViewById(R.id.taolive_good_search_edit_text);
        String h = ijr.h();
        if (!TextUtils.isEmpty(h)) {
            this.mEditText.setHint(h);
        }
        this.mEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                }
                if (i != 3 && keyEvent != null && (66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
                    return false;
                }
                if (GoodListSearchView.access$000(GoodListSearchView.this).getText() != null) {
                    str = GoodListSearchView.access$000(GoodListSearchView.this).getText().toString();
                } else {
                    str = "";
                }
                GoodListSearchView.access$100(GoodListSearchView.this, str, 2);
                xha.e(GoodListSearchView.access$200(GoodListSearchView.this).u(), GoodListSearchView.access$300(GoodListSearchView.this).g(), false);
                return true;
            }
        });
        this.mEditText.addTextChangedListener(new b());
        if (this.enableSearchUIOptimize) {
            this.mEditText.setOnFocusChangeListener(new c());
        }
        this.mEditText.postDelayed(new d(), 50L);
        TaoLiveSearchHistoryView taoLiveSearchHistoryView = (TaoLiveSearchHistoryView) inflate.findViewById(R.id.taolive_good_search_history_view);
        this.mHistoryView = taoLiveSearchHistoryView;
        if (taoLiveSearchHistoryView != null) {
            taoLiveSearchHistoryView.setSearchTagClickListener(this);
        }
        this.mResultContainerView = inflate.findViewById(R.id.taolive_goods_search_result_container);
        this.mResultNumView = (TextView) inflate.findViewById(R.id.taolive_goods_search_result_num);
        CloseRecyclerView closeRecyclerView = (CloseRecyclerView) inflate.findViewById(R.id.taolive_goods_search_listview);
        this.mSearchResultListView = closeRecyclerView;
        closeRecyclerView.setLayoutManager(new RecyclerViewNoBugLinearLayoutManager(this.mGoodLiveContext.i(), 1, false));
        ItemGroupAdapter2 itemGroupAdapter2 = new ItemGroupAdapter2(this.mGoodLiveContext, new ArrayList(), this.mSearchResultListView);
        this.mResultListAdapter = itemGroupAdapter2;
        this.mSearchResultListView.setAdapter(itemGroupAdapter2);
        this.mSearchResultListView.setItemViewCacheSize(0);
        this.mSearchResultListView.setCloseViewListener(new e());
        TUrlImageView tUrlImageView2 = (TUrlImageView) inflate.findViewById(R.id.taolive_good_search_delete_all);
        this.mDeleteAllInputBtn = tUrlImageView2;
        tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01T0fb1g1a5NK4g3psa_!!6000000003278-2-tps-60-60.png");
        this.mDeleteAllInputBtn.setOnClickListener(this);
        InsidePrefetchHelper insidePrefetchHelper = this.insidePrefetchHelper;
        if (insidePrefetchHelper != null) {
            insidePrefetchHelper.g(this.mSearchResultListView, InsidePrefetchHelper.OPEN_SOURCE_SCROLL_SEARCH);
        }
        this.mResultEmptyView = inflate.findViewById(R.id.taolive_goods_search_empty_new);
        this.mResultSearchEntryView = (ViewGroup) inflate.findViewById(R.id.taolive_goods_search_entry_new);
        AliUrlImageView aliUrlImageView = (AliUrlImageView) inflate.findViewById(R.id.taolive_goods_search_empty_view_new);
        this.mEmptyImage = aliUrlImageView;
        aliUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01CQCH2r1kjoOoMGwzx_!!6000000004720-2-tps-440-440.png");
        this.mResultErrorView = inflate.findViewById(R.id.taolive_goods_search_error_new);
        AliUrlImageView aliUrlImageView2 = (AliUrlImageView) inflate.findViewById(R.id.taolive_goods_search_error_view_new);
        this.mErrorImage = aliUrlImageView2;
        aliUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01CQCH2r1kjoOoMGwzx_!!6000000004720-2-tps-440-440.png");
        Button button = (Button) inflate.findViewById(R.id.taolive_goods_search_retry_new);
        this.mErrorRetryButton = button;
        button.setOnClickListener(this);
        return inflate;
    }

    @Override // tb.sac
    public void showGoodList(int i, String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ec5e0e", new Object[]{this, new Integer(i), str});
            return;
        }
        this.mHistoryView.setVisibility(8);
        this.mResultContainerView.setVisibility(0);
        this.mResultEmptyView.setVisibility(8);
        removeResultSearchEntryView();
        this.mResultErrorView.setVisibility(8);
        this.mResultNumView.setText(String.format("共%d个搜索结果", Integer.valueOf(i)));
        this.mCurrentResultKey = str;
        this.handler.postDelayed(this.prefetchRunnable, this.searchResultFirstShowPreFetchDelayDuration);
        String l = ((xac) this.mPresenter).l();
        if (((xac) this.mPresenter).z() == 3) {
            z = true;
        }
        xha.h(l, str, z, true);
    }
}
