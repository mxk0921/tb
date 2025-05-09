package com.taobao.search.searchdoor.sf.widgets.activate.cells;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.mmd.recommendtip.FlowLayout;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aa0;
import tb.b4p;
import tb.c2p;
import tb.da0;
import tb.ea0;
import tb.l3p;
import tb.o1p;
import tb.o4p;
import tb.oxb;
import tb.r4p;
import tb.rg3;
import tb.sen;
import tb.t2o;
import tb.ude;
import tb.xho;
import tb.xrl;
import tb.xyd;
import tb.z90;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HistoryCellViewHolder extends BaseActivateCellViewHolder<HistoryCellBean, c2p> implements View.OnClickListener, View.OnLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TextView m;
    public final TIconFontTextView n;
    public final FlowLayout o;
    public final View p;
    public final int q;
    public boolean r = false;
    public final boolean s;
    public static final int t = o1p.b(4);
    public static final int u = o1p.b(7);
    public static final int v = o1p.b(4);
    public static final int w = o1p.b(6);
    public static final int x = o1p.b(16);
    public static final int y = o1p.b(5);
    public static final int z = o1p.b(12);
    public static final rg3.b CREATOR = new a();
    public static final rg3.b COMBINE_CREATOR = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements rg3.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public WidgetViewHolder a(rg3.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetViewHolder) ipChange.ipc$dispatch("70fcae1f", new Object[]{this, cVar});
            }
            return new HistoryCellViewHolder(R.layout.tbsearch_sf_activate_group, cVar.f27354a, cVar.b, cVar.c, (c2p) cVar.f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements rg3.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public WidgetViewHolder a(rg3.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetViewHolder) ipChange.ipc$dispatch("70fcae1f", new Object[]{this, cVar});
            }
            if (xyd.a(cVar.f27354a)) {
                return new CombineHistoryCellViewHolder(LayoutInflater.from(cVar.f27354a).inflate(R.layout.tbsearch_sf_combine_history_new, cVar.c, false), cVar.f27354a, cVar.b, (c2p) cVar.f);
            }
            return new CombineHistoryCellViewHolder(LayoutInflater.from(cVar.f27354a).inflate(R.layout.tbsearch_sf_combine_history, cVar.c, false), cVar.f27354a, cVar.b, (c2p) cVar.f);
        }
    }

    static {
        t2o.a(815793177);
        o1p.b(5);
    }

    public HistoryCellViewHolder(int i, Activity activity, ude udeVar, ViewGroup viewGroup, c2p c2pVar) {
        super(LayoutInflater.from(activity).inflate(i, viewGroup, false), activity, udeVar, c2pVar);
        this.q = 10;
        this.s = xyd.a(activity);
        TextView textView = (TextView) this.itemView.findViewById(R.id.group_title);
        this.m = textView;
        if ((activity instanceof oxb) && ((oxb) activity).E1()) {
            textView.setTextColor(-1);
        }
        TIconFontTextView tIconFontTextView = (TIconFontTextView) this.itemView.findViewById(R.id.delete_btn);
        this.n = tIconFontTextView;
        tIconFontTextView.setOnClickListener(this);
        FlowLayout flowLayout = (FlowLayout) this.itemView.findViewById(R.id.activate_item_container);
        this.o = flowLayout;
        View findViewById = this.itemView.findViewById(R.id.unfold_arrow_btn);
        this.p = findViewById;
        ViewProxy.setOnClickListener(findViewById, this);
        if (l3p.INSTANCE.b()) {
            this.itemView.findViewById(R.id.divier_line).setVisibility(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) flowLayout.getLayoutParams();
            marginLayoutParams.topMargin = o1p.b(12);
            flowLayout.setLayoutParams(marginLayoutParams);
        }
        this.q = o4p.E(10);
        E0(this);
        if (J0()) {
            findViewById.setBackgroundResource(R.drawable.tbsearch_history_tag_background_night);
        }
    }

    public static View I0(boolean z2, ActivateBean activateBean, Activity activity, boolean z3, boolean z4, boolean z5, Map<String, String> map) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a6c4ab6", new Object[]{new Boolean(z2), activateBean, activity, new Boolean(z3), new Boolean(z4), new Boolean(z5), map});
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(new ViewGroup.LayoutParams(-2, o1p.b(29)));
        if (z2) {
            marginLayoutParams.height = o1p.b(27);
        }
        frameLayout.setLayoutParams(marginLayoutParams);
        if (z2) {
            marginLayoutParams.setMargins(0, t, v, 0);
        } else {
            marginLayoutParams.setMargins(0, u, w, 0);
        }
        frameLayout.setTag(activateBean);
        TUrlImageView tUrlImageView = new TUrlImageView(activity);
        int i = x;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 53;
        tUrlImageView.setLayoutParams(layoutParams);
        if (!TextUtils.isEmpty(activateBean.iconUrl)) {
            tUrlImageView.setImageUrl(activateBean.iconUrl);
        }
        xho.c(tUrlImageView);
        TextView textView = new TextView(activity);
        Resources resources = activity.getResources();
        if (map != null && "cart_search".equals(map.get(xrl.G_CHANNELSRP))) {
            drawable = resources.getDrawable(R.drawable.tbsearch_history_tag_background_cart);
        } else if (z5) {
            if (z3) {
                drawable = resources.getDrawable(R.drawable.tbsearch_history_tag_background_night_new_style);
            } else {
                drawable = resources.getDrawable(R.drawable.tbsearch_history_tag_background_new_style);
            }
            if (z2) {
                if (z3) {
                    drawable = resources.getDrawable(R.drawable.tbsearch_history_tag_background_night_new_style);
                } else {
                    drawable = resources.getDrawable(R.drawable.tbsearch_history_tag_background_new_style_new);
                }
            }
        } else if (z3) {
            drawable = resources.getDrawable(R.drawable.tbsearch_history_tag_background_night);
        } else {
            drawable = resources.getDrawable(R.drawable.tbsearch_history_tag_background);
        }
        textView.setBackgroundDrawable(drawable);
        int i2 = z;
        int i3 = y;
        textView.setPadding(i2, i3, i2, i3);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        if (z3) {
            textView.setTextColor(resources.getColor(R.color.gray_aa));
        } else {
            textView.setTextColor(resources.getColor(R.color.gray_66));
        }
        if (z2) {
            if (z3) {
                textView.setTextColor(resources.getColor(R.color.gray_aa));
            } else {
                textView.setTextColor(Color.parseColor("#11192d"));
            }
        }
        textView.setText(activateBean.keyword);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        if (o4p.S0() && z4) {
            textView.setTextSize(1, 21.0f);
            marginLayoutParams.height = o1p.b(39);
        }
        xho.a(textView);
        frameLayout.addView(textView);
        frameLayout.addView(tUrlImageView);
        return frameLayout;
    }

    public static /* synthetic */ Object ipc$super(HistoryCellViewHolder historyCellViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/cells/HistoryCellViewHolder");
    }

    public final boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        if (!(getActivity() instanceof oxb) || !((oxb) getActivity()).E1()) {
            return false;
        }
        return true;
    }

    public final void L0(List<ActivateBean> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d39f868", new Object[]{this, list, new Integer(i)});
            return;
        }
        this.o.removeAllViews();
        if (list != null) {
            if (i <= 0) {
                i = 2;
            }
            this.o.setMaxLines(i);
            Map<String, String> z2 = ((c2p) l0()).a().z();
            int i2 = 0;
            for (ActivateBean activateBean : list) {
                if (activateBean != null) {
                    i2++;
                    if (i2 <= this.q) {
                        View I0 = I0(this.s, activateBean, this.f9341a, J0(), this.r, ((HistoryCellBean) this.l).newStyle, z2);
                        ViewProxy.setOnClickListener(I0, this);
                        ViewProxy.setOnLongClickListener(I0, this);
                        this.o.addView(I0);
                    } else {
                        return;
                    }
                }
            }
            this.o.setVisibility(0);
        }
    }

    public final void M0() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b354795", new Object[]{this});
        } else if (((HistoryCellBean) this.l).newStyle) {
            this.m.setTextColor(Color.parseColor("#333333"));
            this.m.setTextSize(1, 13.5f);
            this.n.setTextColor(Color.parseColor("#999999"));
            View view = this.p;
            if (J0()) {
                i = R.drawable.tbsearch_history_tag_background_night_new_style;
            } else {
                i = R.drawable.tbsearch_history_tag_background_new_style;
            }
            view.setBackgroundResource(i);
        }
    }

    public final void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85f5c74", new Object[]{this});
        } else if (this.s) {
            this.n.setText(getActivity().getResources().getString(R.string.uik_icon_tb_DeleteOutlined));
        } else {
            this.n.setText(getActivity().getResources().getString(R.string.uik_icon_delete));
        }
    }

    public final void O0(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33a0741", new Object[]{this, historyCellBean});
            return;
        }
        HistoryCellBean historyCellBean2 = (HistoryCellBean) getData();
        if (historyCellBean2 == null || historyCellBean == null) {
            b4p.b("HistoryActivateCell", "history group or new history group is null ");
            return;
        }
        historyCellBean2.activateItems = historyCellBean.activateItems;
        H0(i0(), historyCellBean2);
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.activate.cells.BaseActivateCellViewHolder, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "HistoryActivateCell";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == this.n.getId()) {
            A0(da0.a());
        } else {
            View view2 = this.p;
            if (view == view2) {
                view2.setVisibility(8);
                this.o.setMaxLines(60);
                this.o.requestLayout();
                HashMap hashMap = new HashMap();
                hashMap.put("channelSrp", ((c2p) l0()).a().d());
                sen.d("SearchHistory_expand", hashMap);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                i = viewGroup.indexOfChild(view);
            }
            Object tag = view.getTag();
            if (tag instanceof ActivateBean) {
                A0(z90.a((ActivateBean) tag, i, ((HistoryCellBean) this.l).suggestRn));
            }
        }
    }

    public void onEventMainThread(ea0 ea0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e90e1ba0", new Object[]{this, ea0Var});
        } else {
            O0(ea0Var.f18398a);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        ActivateBean activateBean = (ActivateBean) view.getTag();
        if (activateBean != null) {
            A0(aa0.a(activateBean));
        }
        return true;
    }

    /* renamed from: K0 */
    public void H0(int i, HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c709fc2e", new Object[]{this, new Integer(i), historyCellBean});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        HashMap hashMap = new HashMap();
        if (historyCellBean == null) {
            layoutParams.width = 0;
            layoutParams.height = 0;
            this.itemView.setLayoutParams(layoutParams);
            hashMap.put("errCode", "-1");
            hashMap.put("errMsg", "activateGroup is null");
            TLogTracker.j("History", "DataConvert", hashMap);
            return;
        }
        com.taobao.search.searchdoor.sf.widgets.activate.a c = ((c2p) l0()).c();
        if (c == null) {
            hashMap.put("searchHistoryManager", "searchHistoryManager is null");
        }
        boolean C = ((c2p) l0()).a().C();
        hashMap.put("isOpenHistory", String.valueOf(C));
        if (c != null && C) {
            b4p.a("HistoryActivateCell", "need not to synchronize history, use local history ");
            HistoryCellBean o = c.o();
            if (o != null) {
                historyCellBean.activateItems = o.activateItems;
            }
        }
        List<ActivateBean> list = historyCellBean.activateItems;
        if (list == null || list.size() == 0) {
            layoutParams.width = 0;
            layoutParams.height = 0;
            this.itemView.setLayoutParams(layoutParams);
            hashMap.put("historyCount", "0");
            TLogTracker.r("History", "DataConvert", hashMap);
            return;
        }
        hashMap.put("historyCount", String.valueOf(historyCellBean.activateItems.size()));
        TLogTracker.r("History", "DataConvert", hashMap);
        this.m.setText(historyCellBean.name);
        M0();
        if (o4p.S0()) {
            boolean equals = "true".equals(((c2p) l0()).a().q(r4p.KEY_SEARCH_ELDER_HOME_OPEN));
            this.r = equals;
            if (equals) {
                this.n.setText(Localization.q(R.string.taobao_app_1005_1_16686));
                this.n.setTextSize(1, 19.0f);
                this.m.setTextSize(1, 21.0f);
            } else {
                N0();
                float f = 16.0f;
                this.n.setTextSize(1, ((HistoryCellBean) this.l).newStyle ? 16.0f : 20.0f);
                TextView textView = this.m;
                if (((HistoryCellBean) this.l).newStyle) {
                    f = 13.5f;
                }
                textView.setTextSize(1, f);
            }
        }
        L0(historyCellBean.activateItems, historyCellBean.rownnum);
        this.o.setTailView(this.p);
        layoutParams.width = -1;
        layoutParams.height = -2;
        this.itemView.setLayoutParams(layoutParams);
    }
}
