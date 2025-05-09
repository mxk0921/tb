package com.taobao.search.searchdoor.sf.widgets.activate.cells;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.history.AuctionItemVO;
import com.etao.feimagesearch.history.HistoryResult;
import com.etao.feimagesearch.model.PhotoFrom;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.mmd.recommendtip.FlowLayout;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.cells.CombineHistoryCellViewHolder;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.CombineHistoryCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import tb.c2p;
import tb.ckf;
import tb.h1p;
import tb.jpu;
import tb.n7m;
import tb.oxb;
import tb.p1p;
import tb.r4p;
import tb.sen;
import tb.sqj;
import tb.t2o;
import tb.ude;
import tb.v3i;
import tb.v4p;
import tb.xho;
import tb.xyd;
import tb.z90;
import tb.zuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class CombineHistoryCellViewHolder extends BaseActivateCellViewHolder<CombineHistoryCellBean, c2p> implements View.OnClickListener, View.OnLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean A;
    public boolean B;
    public final View E;
    public final boolean F;
    public final TextView n;
    public final TextView o;
    public final View p;
    public final FrameLayout q;
    public final LinearLayout r;
    public final TextView s;
    public final TextView t;
    public final View u;
    public final SearchUrlImageView v;
    public FlowLayout w;
    public FlowLayout x;
    public List<? extends ActivateBean> y;
    public HistoryResult z;
    public final String m = "ImgHistoryClicked";
    public final int C = 20;
    public float D = 13.5f;

    static {
        t2o.a(815793176);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineHistoryCellViewHolder(View view, Activity activity, ude udeVar, c2p c2pVar) {
        super(view, activity, udeVar, c2pVar);
        String str;
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.tbsearch_history_expand_btn, (ViewGroup) new FrameLayout(activity), false);
        this.E = inflate;
        this.F = xyd.a(activity);
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.text_history_title);
            this.n = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.img_history_title);
            this.o = textView2;
            View findViewById = view.findViewById(R.id.delete_btn);
            this.p = findViewById;
            if (findViewById != null) {
                xho.c(findViewById);
                this.q = (FrameLayout) view.findViewById(R.id.fl_history_container);
                this.r = (LinearLayout) view.findViewById(R.id.ll_delete_combo);
                TextView textView3 = (TextView) view.findViewById(R.id.tv_delete_all);
                this.s = textView3;
                TextView textView4 = (TextView) view.findViewById(R.id.tv_delete_finish);
                this.t = textView4;
                this.u = view.findViewById(R.id.divider);
                this.v = (SearchUrlImageView) view.findViewById(R.id.imv_img_history_guide);
                if (textView != null) {
                    textView.setOnClickListener(this);
                    if (textView2 != null) {
                        textView2.setOnClickListener(this);
                        if (findViewById != null) {
                            ViewProxy.setOnClickListener(findViewById, this);
                            ViewProxy.setOnClickListener(inflate, this);
                            ckf.f(inflate, "tailView");
                            xho.c(inflate);
                            if (textView3 != null) {
                                textView3.setOnClickListener(this);
                                if (textView4 != null) {
                                    textView4.setOnClickListener(this);
                                    TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.imv_expand);
                                    if (tUrlImageView != null) {
                                        if (U0()) {
                                            str = "https://gw.alicdn.com/imgextra/i4/O1CN01pcxybo1Uw9AMPDGT3_!!6000000002581-2-tps-72-72.png";
                                        } else {
                                            str = "https://gw.alicdn.com/imgextra/i3/O1CN01OtDDNy1hFB0lmCbK1_!!6000000004247-2-tps-72-72.png";
                                        }
                                        tUrlImageView.setImageUrl(str);
                                        return;
                                    }
                                    return;
                                }
                                ckf.y("deleteFinishBtn");
                                throw null;
                            }
                            ckf.y("deleteAllBtn");
                            throw null;
                        }
                        ckf.y("deleteBtn");
                        throw null;
                    }
                    ckf.y("imgHistoryBtn");
                    throw null;
                }
                ckf.y("textHistoryBtn");
                throw null;
            }
            ckf.y("deleteBtn");
            throw null;
        }
    }

    public static /* synthetic */ Object ipc$super(CombineHistoryCellViewHolder combineHistoryCellViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/cells/CombineHistoryCellViewHolder");
    }

    public final void N0() {
        final AuctionItemVO auctionItemVO;
        final ViewGroup viewGroup;
        final ActivateBean activateBean;
        View view;
        String str;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16b4e66", new Object[]{this});
            return;
        }
        View view2 = this.p;
        if (view2 != null) {
            view2.setVisibility(8);
            LinearLayout linearLayout = this.r;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                final FlowLayout flowLayout = this.w;
                final FlowLayout flowLayout2 = this.x;
                LayoutInflater from = LayoutInflater.from(getActivity());
                boolean U0 = U0();
                if (flowLayout != null) {
                    flowLayout.setMaxLines(this.C);
                    if (!this.F) {
                        this.E.setVisibility(8);
                        flowLayout.requestLayout();
                    } else {
                        flowLayout.setExpanded(true);
                        flowLayout.requestLayout();
                    }
                    int childCount = flowLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = flowLayout.getChildAt(i3);
                        if (childAt instanceof ViewGroup) {
                            viewGroup = (ViewGroup) childAt;
                        } else {
                            viewGroup = null;
                        }
                        if (viewGroup != null) {
                            if (!ckf.b(viewGroup, this.E)) {
                                Object tag = viewGroup.getTag();
                                if (tag instanceof ActivateBean) {
                                    activateBean = (ActivateBean) tag;
                                } else {
                                    activateBean = null;
                                }
                                if (activateBean != null) {
                                    if (this.F) {
                                        if (U0) {
                                            i2 = R.layout.tbsearch_delete_text_history_item_dark;
                                        } else {
                                            i2 = R.layout.tbsearch_delete_text_history_item_new;
                                        }
                                        view = from.inflate(i2, viewGroup, false);
                                    } else {
                                        if (U0) {
                                            i = R.layout.tbsearch_delete_text_history_item_dark;
                                        } else {
                                            i = R.layout.tbsearch_delete_text_history_item;
                                        }
                                        view = from.inflate(i, viewGroup, false);
                                    }
                                    TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.imv_delete);
                                    if (U0) {
                                        str = "https://gw.alicdn.com/imgextra/i3/O1CN018VD3Id1eABqmJ8MBG_!!6000000003830-2-tps-36-36.png";
                                    } else {
                                        str = "https://img.alicdn.com/imgextra/i2/O1CN01D1o9Lo1t2bUSt2Kbu_!!6000000005844-2-tps-27-27.png";
                                    }
                                    tUrlImageView.setImageUrl(str);
                                    ViewProxy.setOnClickListener(view, new View.OnClickListener() { // from class: tb.y1z
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            CombineHistoryCellViewHolder.j(CombineHistoryCellViewHolder.this, activateBean, flowLayout, viewGroup, view3);
                                        }
                                    });
                                    viewGroup.addView(view, viewGroup.getMeasuredWidth(), -1);
                                }
                            } else {
                                return;
                            }
                        }
                    }
                } else if (flowLayout2 != null) {
                    flowLayout2.setMaxLines(2);
                    flowLayout2.requestLayout();
                    int childCount2 = flowLayout2.getChildCount();
                    for (int i4 = 0; i4 < childCount2; i4++) {
                        final View childAt2 = flowLayout2.getChildAt(i4);
                        Object tag2 = childAt2.getTag();
                        if (tag2 instanceof AuctionItemVO) {
                            auctionItemVO = (AuctionItemVO) tag2;
                        } else {
                            auctionItemVO = null;
                        }
                        if (auctionItemVO != null) {
                            FrameLayout frameLayout = (FrameLayout) childAt2.findViewById(R.id.fl_delete_btn);
                            frameLayout.setVisibility(0);
                            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: tb.z1z
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    CombineHistoryCellViewHolder.k(CombineHistoryCellViewHolder.this, auctionItemVO, flowLayout2, childAt2, view3);
                                }
                            });
                            ((TUrlImageView) childAt2.findViewById(R.id.imv_delete)).setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01D1o9Lo1t2bUSt2Kbu_!!6000000005844-2-tps-27-27.png");
                            childAt2.findViewById(R.id.fl_expand).setVisibility(8);
                        }
                    }
                }
            } else {
                ckf.y("deleteCombo");
                throw null;
            }
        } else {
            ckf.y("deleteBtn");
            throw null;
        }
    }

    public final void O0() {
        ViewGroup viewGroup;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f54fde0", new Object[]{this});
            return;
        }
        S0();
        FlowLayout flowLayout = this.w;
        FlowLayout flowLayout2 = this.x;
        if (flowLayout != null) {
            int childCount = flowLayout.getChildCount();
            while (i < childCount) {
                View childAt = flowLayout.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    viewGroup = (ViewGroup) childAt;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (!ckf.b(viewGroup, this.E)) {
                        View childAt2 = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
                        if (childAt2.getId() == R.id.fl_delete_btn) {
                            viewGroup.removeView(childAt2);
                        }
                    } else {
                        return;
                    }
                }
                i++;
            }
        } else if (flowLayout2 != null) {
            int childCount2 = flowLayout2.getChildCount();
            while (i < childCount2) {
                ((FrameLayout) flowLayout2.getChildAt(i).findViewById(R.id.fl_delete_btn)).setVisibility(8);
                i++;
            }
        }
    }

    public final boolean Q0() {
        int i;
        Map<Long, AuctionItemVO> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21ac7096", new Object[]{this})).booleanValue();
        }
        if (!((CombineHistoryCellBean) this.l).isShowPicMod()) {
            return false;
        }
        HistoryResult historyResult = this.z;
        if (historyResult == null || (map = historyResult.resultData) == null) {
            i = 0;
        } else {
            i = map.size();
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    public final boolean R0() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ae3b1b8", new Object[]{this})).booleanValue();
        }
        List<? extends ActivateBean> list = this.y;
        if (list == null || list.isEmpty()) {
            z = true;
        }
        return !z;
    }

    public final void S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd94d5e1", new Object[]{this});
            return;
        }
        View view = this.p;
        if (view != null) {
            view.setVisibility(0);
            LinearLayout linearLayout = this.r;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            } else {
                ckf.y("deleteCombo");
                throw null;
            }
        } else {
            ckf.y("deleteBtn");
            throw null;
        }
    }

    public final void T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f042c7be", new Object[]{this});
            return;
        }
        this.itemView.getLayoutParams().height = 0;
        this.itemView.requestLayout();
    }

    public final boolean U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        if (!(getActivity() instanceof oxb)) {
            return false;
        }
        Activity activity = getActivity();
        ckf.e(activity, "null cannot be cast to non-null type com.taobao.android.xsearchplugin.muise.IDarkModeHolder");
        if (((oxb) activity).E1()) {
            return true;
        }
        return false;
    }

    public final void V0() {
        List<ActivateBean> list;
        HistoryCellBean o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b117f655", new Object[]{this});
            return;
        }
        com.taobao.search.searchdoor.sf.widgets.activate.a c = ((c2p) l0()).c();
        if (c == null || (o = c.o()) == null) {
            list = null;
        } else {
            list = o.activateItems;
        }
        this.y = list;
        try {
            this.z = n7m.f(getActivity(), "image", false, 10);
        } catch (Exception unused) {
        }
    }

    public final boolean W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aa6269e", new Object[]{this})).booleanValue();
        }
        if (R0() || Q0()) {
            return false;
        }
        return true;
    }

    public final void b1(List<? extends ActivateBean> list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c3ad07", new Object[]{this, list});
        } else if (list != null) {
            FlowLayout flowLayout = new FlowLayout(getActivity());
            flowLayout.setShowFoldButton(((CombineHistoryCellBean) this.l).isShowFoldButton());
            flowLayout.setMaxLines(2);
            Map<String, String> z = ((c2p) l0()).a().z();
            ckf.f(z, "getSnapshotParams(...)");
            for (ActivateBean activateBean : list) {
                if (activateBean != null) {
                    i++;
                    if (i <= this.C) {
                        View I0 = HistoryCellViewHolder.I0(this.F, activateBean, getActivity(), U0(), false, ((CombineHistoryCellBean) this.l).newStyle, z);
                        ckf.f(I0, "createButton(...)");
                        ViewProxy.setOnClickListener(I0, this);
                        ViewProxy.setOnLongClickListener(I0, this);
                        flowLayout.addView(I0);
                    } else {
                        return;
                    }
                }
            }
            flowLayout.setTailView(this.E);
            this.w = flowLayout;
            FrameLayout frameLayout = this.q;
            if (frameLayout != null) {
                frameLayout.addView(flowLayout);
            } else {
                ckf.y("historyContainer");
                throw null;
            }
        }
    }

    public final void c1(TextView textView) {
        Typeface typeface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd370449", new Object[]{this, textView});
            return;
        }
        Typeface create = Typeface.create("PingFangSC-Medium", 1);
        if (create != null) {
            typeface = Typeface.create(create, 1);
        } else {
            typeface = Typeface.defaultFromStyle(1);
        }
        textView.setTypeface(typeface);
    }

    public final boolean f1(CombineHistoryCellBean combineHistoryCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6309526a", new Object[]{this, combineHistoryCellBean})).booleanValue();
        }
        if (combineHistoryCellBean == null || !combineHistoryCellBean.isShowGuide() || TextUtils.isEmpty(combineHistoryCellBean.getGuideUrl())) {
            return false;
        }
        return !v4p.b().getBoolean(this.m, false);
    }

    public static final void k(CombineHistoryCellViewHolder combineHistoryCellViewHolder, AuctionItemVO auctionItemVO, FlowLayout flowLayout, View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95cf4c1e", new Object[]{combineHistoryCellViewHolder, auctionItemVO, flowLayout, view, view2});
            return;
        }
        ckf.g(combineHistoryCellViewHolder, "this$0");
        ckf.g(auctionItemVO, "$auctionItem");
        n7m.e(combineHistoryCellViewHolder.getActivity(), auctionItemVO);
        flowLayout.removeView(view);
        if (flowLayout.getChildCount() == 0) {
            combineHistoryCellViewHolder.H0(0, null);
        }
    }

    public static final void l(CombineHistoryCellViewHolder combineHistoryCellViewHolder, DialogInterface dialogInterface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d05df1d", new Object[]{combineHistoryCellViewHolder, dialogInterface, new Integer(i)});
            return;
        }
        ckf.g(combineHistoryCellViewHolder, "this$0");
        FlowLayout flowLayout = combineHistoryCellViewHolder.w;
        if (flowLayout != null) {
            flowLayout.removeAllViews();
            com.taobao.search.searchdoor.sf.widgets.activate.a c = ((c2p) combineHistoryCellViewHolder.l0()).c();
            if (c != null) {
                c.j();
            }
            combineHistoryCellViewHolder.y = null;
            sen.d("ClearHistorySuccess", combineHistoryCellViewHolder.P0("tab1"));
        } else {
            FlowLayout flowLayout2 = combineHistoryCellViewHolder.x;
            if (flowLayout2 != null) {
                flowLayout2.removeAllViews();
                n7m.b(combineHistoryCellViewHolder.getActivity());
                combineHistoryCellViewHolder.z = null;
                sen.d("ClearHistorySuccess", combineHistoryCellViewHolder.P0("tab2"));
            }
        }
        combineHistoryCellViewHolder.H0(0, null);
    }

    public static final void n(Object obj, CombineHistoryCellViewHolder combineHistoryCellViewHolder, DialogInterface dialogInterface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e08d7fe", new Object[]{obj, combineHistoryCellViewHolder, dialogInterface, new Integer(i)});
            return;
        }
        ckf.g(combineHistoryCellViewHolder, "this$0");
        if (obj instanceof ActivateBean) {
            com.taobao.search.searchdoor.sf.widgets.activate.a c = ((c2p) combineHistoryCellViewHolder.l0()).c();
            if (c != null) {
                c.l((ActivateBean) obj);
            }
            sen.d("History_DeleteOnebyOne", combineHistoryCellViewHolder.P0("tab1"));
        } else if (obj instanceof AuctionItemVO) {
            n7m.e(combineHistoryCellViewHolder.getActivity(), (AuctionItemVO) obj);
            sen.d("History_DeleteOnebyOne", combineHistoryCellViewHolder.P0("tab2"));
        }
        combineHistoryCellViewHolder.H0(0, null);
    }

    public static final void o(View view, FlowLayout flowLayout, CombineHistoryCellViewHolder combineHistoryCellViewHolder, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f5e6a1", new Object[]{view, flowLayout, combineHistoryCellViewHolder, view2});
            return;
        }
        ckf.g(flowLayout, "$historyItemContainer");
        ckf.g(combineHistoryCellViewHolder, "this$0");
        view.setVisibility(8);
        flowLayout.setMaxLines(2);
        sen.d("History_Expand", combineHistoryCellViewHolder.P0("tab2"));
    }

    public static final void p(TUrlImageView tUrlImageView, AuctionItemVO auctionItemVO, View view, FlowLayout flowLayout, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781f674f", new Object[]{tUrlImageView, auctionItemVO, view, flowLayout, view2});
            return;
        }
        ckf.g(flowLayout, "$historyItemContainer");
        tUrlImageView.setImageUrl(auctionItemVO.picPath.toString());
        view.setVisibility(8);
        flowLayout.setMaxLines(2);
        sen.d("History_Expand", v3i.f(jpu.a("tabname", "tab2")));
    }

    public final void d1(TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba4a6ee8", new Object[]{this, textView, new Boolean(z)});
            return;
        }
        boolean z2 = ((CombineHistoryCellBean) this.l).newStyle;
        String str = "#888888";
        String str2 = "#111111";
        if (z) {
            textView.setTextColor(Color.parseColor(z2 ? "#333333" : str2));
            textView.setContentDescription(((Object) textView.getText()) + "，已选中，按钮");
        } else {
            textView.setTextColor(Color.parseColor(z2 ? "#bbbbbb" : str));
            textView.setContentDescription(((Object) textView.getText()) + sqj.BUTTON_DESC);
        }
        if (this.F) {
            if (z) {
                c1(textView);
                if (z2) {
                    str2 = "#11192D";
                }
                textView.setTextColor(Color.parseColor(str2));
                textView.setContentDescription(((Object) textView.getText()) + "，已选中，按钮");
                return;
            }
            textView.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            if (z2) {
                str = "#50607A";
            }
            textView.setTextColor(Color.parseColor(str));
            textView.setContentDescription(((Object) textView.getText()) + sqj.BUTTON_DESC);
        } else if (z) {
            c1(textView);
        } else {
            textView.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        ckf.g(view, "v");
        final Object tag = view.getTag();
        if (!(tag instanceof ActivateBean) && !(tag instanceof AuctionItemVO)) {
            return true;
        }
        new AlertDialog.Builder(getActivity()).setPositiveButton(Localization.q(R.string.app_sure), new DialogInterface.OnClickListener() { // from class: tb.u1z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CombineHistoryCellViewHolder.n(tag, this, dialogInterface, i);
            }
        }).setTitle(Localization.q(R.string.taobao_app_1005_1_16653)).setNegativeButton(Localization.q(R.string.app_cancel), (DialogInterface.OnClickListener) null).show();
        return true;
    }

    public static final void j(CombineHistoryCellViewHolder combineHistoryCellViewHolder, ActivateBean activateBean, FlowLayout flowLayout, ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a702f59a", new Object[]{combineHistoryCellViewHolder, activateBean, flowLayout, viewGroup, view});
            return;
        }
        ckf.g(combineHistoryCellViewHolder, "this$0");
        ckf.g(activateBean, "$activateItem");
        ckf.g(viewGroup, "$childView");
        com.taobao.search.searchdoor.sf.widgets.activate.a c = ((c2p) combineHistoryCellViewHolder.l0()).c();
        if (c != null) {
            c.l(activateBean);
        }
        flowLayout.removeView(viewGroup);
        if (flowLayout.getChildCount() == 1) {
            combineHistoryCellViewHolder.H0(0, null);
        }
    }

    /* renamed from: X0 */
    public void H0(int i, CombineHistoryCellBean combineHistoryCellBean) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("235b7e35", new Object[]{this, new Integer(i), combineHistoryCellBean});
            return;
        }
        V0();
        if ((combineHistoryCellBean != null ? combineHistoryCellBean.getTitleTextSize() : null) != null) {
            String titleTextSize = combineHistoryCellBean.getTitleTextSize();
            ckf.f(titleTextSize, "getTitleTextSize(...)");
            this.D = Float.parseFloat(titleTextSize);
        }
        g1();
        TextView textView = this.n;
        if (textView != null) {
            xho.a(textView);
            TextView textView2 = this.o;
            if (textView2 != null) {
                xho.a(textView2);
                ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                String picModName = combineHistoryCellBean != null ? combineHistoryCellBean.getPicModName() : null;
                if (!TextUtils.isEmpty(picModName)) {
                    TextView textView3 = this.o;
                    if (textView3 != null) {
                        textView3.setText(picModName);
                    } else {
                        ckf.y("imgHistoryBtn");
                        throw null;
                    }
                }
                String str = combineHistoryCellBean != null ? combineHistoryCellBean.name : null;
                if (!TextUtils.isEmpty(str)) {
                    TextView textView4 = this.n;
                    if (textView4 != null) {
                        textView4.setText(str);
                    } else {
                        ckf.y("textHistoryBtn");
                        throw null;
                    }
                }
                if (W0()) {
                    T0();
                    return;
                }
                boolean R0 = R0();
                boolean Q0 = Q0();
                if (R0) {
                    if (!this.A) {
                        this.A = true;
                        sen.l("Page_SearchDoor_Button-HistoryTab_Exp", P0("tab1"));
                    }
                    TextView textView5 = this.n;
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                    } else {
                        ckf.y("textHistoryBtn");
                        throw null;
                    }
                } else {
                    TextView textView6 = this.n;
                    if (textView6 != null) {
                        textView6.setVisibility(8);
                    } else {
                        ckf.y("textHistoryBtn");
                        throw null;
                    }
                }
                if (Q0) {
                    if (f1(combineHistoryCellBean)) {
                        SearchUrlImageView searchUrlImageView = this.v;
                        if (searchUrlImageView != null) {
                            searchUrlImageView.setVisibility(0);
                            SearchUrlImageView searchUrlImageView2 = this.v;
                            if (searchUrlImageView2 != null) {
                                ckf.d(combineHistoryCellBean);
                                searchUrlImageView2.setImageUrl(combineHistoryCellBean.getGuideUrl());
                            } else {
                                ckf.y("imgHistoryGuide");
                                throw null;
                            }
                        } else {
                            ckf.y("imgHistoryGuide");
                            throw null;
                        }
                    }
                    if (!this.B) {
                        this.B = true;
                        sen.l("Page_SearchDoor_Button-HistoryTab_Exp", P0("tab2"));
                    }
                    TextView textView7 = this.o;
                    if (textView7 != null) {
                        textView7.setVisibility(0);
                    } else {
                        ckf.y("imgHistoryBtn");
                        throw null;
                    }
                } else {
                    TextView textView8 = this.o;
                    if (textView8 != null) {
                        textView8.setVisibility(8);
                    } else {
                        ckf.y("imgHistoryBtn");
                        throw null;
                    }
                }
                View view = this.u;
                if (view != null) {
                    if (!R0 || !Q0) {
                        i2 = 8;
                    }
                    view.setVisibility(i2);
                    if (this.F) {
                        View view2 = this.u;
                        if (view2 != null) {
                            view2.setVisibility(8);
                        } else {
                            ckf.y("divider");
                            throw null;
                        }
                    }
                    S0();
                    if (!Q0) {
                        ((c2p) l0()).e(true);
                    }
                    layoutParams.height = -2;
                    this.itemView.requestLayout();
                    if (((c2p) l0()).d() && R0) {
                        h1();
                    } else if (Q0) {
                        e1();
                    }
                } else {
                    ckf.y("divider");
                    throw null;
                }
            } else {
                ckf.y("imgHistoryBtn");
                throw null;
            }
        } else {
            ckf.y("textHistoryBtn");
            throw null;
        }
    }

    public final void e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f750abdd", new Object[]{this});
            return;
        }
        SearchUrlImageView searchUrlImageView = this.v;
        if (searchUrlImageView != null) {
            searchUrlImageView.setVisibility(8);
            this.w = null;
            TextView textView = this.n;
            if (textView != null) {
                d1(textView, false);
                TextView textView2 = this.o;
                if (textView2 != null) {
                    d1(textView2, true);
                    FrameLayout frameLayout = this.q;
                    if (frameLayout != null) {
                        frameLayout.removeAllViews();
                        if (this.F) {
                            FrameLayout frameLayout2 = this.q;
                            if (frameLayout2 != null) {
                                ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                                ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.topMargin = p1p.a(5.0f);
                                marginLayoutParams.rightMargin = p1p.a(8.0f);
                                FrameLayout frameLayout3 = this.q;
                                if (frameLayout3 != null) {
                                    frameLayout3.setLayoutParams(marginLayoutParams);
                                } else {
                                    ckf.y("historyContainer");
                                    throw null;
                                }
                            } else {
                                ckf.y("historyContainer");
                                throw null;
                            }
                        }
                        if (Q0()) {
                            v4p.b().edit().putBoolean(this.m, true).apply();
                            SearchUrlImageView searchUrlImageView2 = this.v;
                            if (searchUrlImageView2 != null) {
                                searchUrlImageView2.setVisibility(8);
                                if (this.F) {
                                    a1();
                                } else {
                                    Y0();
                                }
                            } else {
                                ckf.y("imgHistoryGuide");
                                throw null;
                            }
                        }
                    } else {
                        ckf.y("historyContainer");
                        throw null;
                    }
                } else {
                    ckf.y("imgHistoryBtn");
                    throw null;
                }
            } else {
                ckf.y("textHistoryBtn");
                throw null;
            }
        } else {
            ckf.y("imgHistoryGuide");
            throw null;
        }
    }

    public final void g1() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b354795", new Object[]{this});
        } else if (((CombineHistoryCellBean) this.l).newStyle) {
            TextView textView = this.n;
            if (textView != null) {
                textView.setTextSize(1, this.D);
                TextView textView2 = this.o;
                if (textView2 != null) {
                    textView2.setTextSize(1, this.D);
                    TextView textView3 = this.s;
                    if (textView3 != null) {
                        textView3.setTextColor(Color.parseColor("#999999"));
                        FrameLayout frameLayout = this.q;
                        if (frameLayout != null) {
                            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                            if (marginLayoutParams != null) {
                                marginLayoutParams.topMargin = p1p.a(6.0f);
                            }
                            View view = this.E;
                            if (U0()) {
                                i = R.drawable.tbsearch_history_tag_background_night_new_style;
                            } else {
                                i = R.drawable.tbsearch_history_tag_background_new_style;
                            }
                            view.setBackgroundResource(i);
                            if (this.F) {
                                CombineHistoryCellBean combineHistoryCellBean = (CombineHistoryCellBean) this.l;
                                if ((combineHistoryCellBean != null ? combineHistoryCellBean.getTitleTextSize() : null) == null) {
                                    TextView textView4 = this.n;
                                    if (textView4 != null) {
                                        textView4.setTextSize(1, 15.0f);
                                        TextView textView5 = this.o;
                                        if (textView5 != null) {
                                            textView5.setTextSize(1, 15.0f);
                                            TextView textView6 = this.s;
                                            if (textView6 != null) {
                                                textView6.setTextSize(1, 13.0f);
                                                TextView textView7 = this.s;
                                                if (textView7 != null) {
                                                    textView7.setTextColor(Color.parseColor("#50607A"));
                                                } else {
                                                    ckf.y("deleteAllBtn");
                                                    throw null;
                                                }
                                            } else {
                                                ckf.y("deleteAllBtn");
                                                throw null;
                                            }
                                        } else {
                                            ckf.y("imgHistoryBtn");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("textHistoryBtn");
                                        throw null;
                                    }
                                }
                                if (marginLayoutParams != null) {
                                    marginLayoutParams.topMargin = p1p.a(9.0f);
                                }
                                this.E.setPadding(p1p.a(6.0f), p1p.a(6.0f), p1p.a(6.0f), p1p.a(6.0f));
                                View view2 = this.E;
                                if (U0()) {
                                    i2 = R.drawable.tbsearch_history_tag_background_night_new_style;
                                } else {
                                    i2 = R.drawable.tbsearch_history_tag_background_new_style_new;
                                }
                                view2.setBackgroundResource(i2);
                                ViewGroup.LayoutParams layoutParams2 = this.E.getLayoutParams();
                                ckf.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                marginLayoutParams2.setMargins(0, p1p.a(4.0f), 0, 0);
                                marginLayoutParams2.width = p1p.a(27.0f);
                                marginLayoutParams2.height = p1p.a(27.0f);
                                this.E.setLayoutParams(marginLayoutParams2);
                                TUrlImageView tUrlImageView = (TUrlImageView) this.E.findViewById(R.id.imv_expand);
                                ViewGroup.LayoutParams layoutParams3 = tUrlImageView.getLayoutParams();
                                ckf.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                marginLayoutParams3.height = p1p.a(5.85f);
                                marginLayoutParams3.width = p1p.a(9.75f);
                                tUrlImageView.setLayoutParams(marginLayoutParams3);
                                tUrlImageView.setImageUrl(null);
                                U0();
                                tUrlImageView.setBackgroundResource(R.drawable.tbsearch_icon_history_expand);
                                return;
                            }
                            return;
                        }
                        ckf.y("historyContainer");
                        throw null;
                    }
                    ckf.y("deleteAllBtn");
                    throw null;
                }
                ckf.y("imgHistoryBtn");
                throw null;
            }
            ckf.y("textHistoryBtn");
            throw null;
        }
    }

    public final void h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dff36f1", new Object[]{this});
            return;
        }
        this.x = null;
        TextView textView = this.n;
        if (textView != null) {
            d1(textView, true);
            TextView textView2 = this.o;
            if (textView2 != null) {
                d1(textView2, false);
                FrameLayout frameLayout = this.q;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                    if (this.F) {
                        FrameLayout frameLayout2 = this.q;
                        if (frameLayout2 != null) {
                            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                            ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.topMargin = p1p.a(9.0f);
                            marginLayoutParams.rightMargin = p1p.a(12.0f);
                            FrameLayout frameLayout3 = this.q;
                            if (frameLayout3 != null) {
                                frameLayout3.setLayoutParams(marginLayoutParams);
                            } else {
                                ckf.y("historyContainer");
                                throw null;
                            }
                        } else {
                            ckf.y("historyContainer");
                            throw null;
                        }
                    }
                    if (R0()) {
                        b1(this.y);
                        return;
                    }
                    return;
                }
                ckf.y("historyContainer");
                throw null;
            }
            ckf.y("imgHistoryBtn");
            throw null;
        }
        ckf.y("textHistoryBtn");
        throw null;
    }

    public final Map<String, String> P0(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("17186918", new Object[]{this, str});
        }
        SearchDoorContext a2 = ((c2p) l0()).a();
        ckf.f(a2, "getSearchDoorContext(...)");
        if (TextUtils.equals(a2.q(r4p.KEY_GOOD_PRICE), "true")) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        Pair a3 = jpu.a("tabname", str);
        Pair a4 = jpu.a(h1p.KEY_SUGGEST_RN, ((CombineHistoryCellBean) this.l).suggestRn);
        Pair a5 = jpu.a("digou_flag", str2);
        String q = a2.q("channelSrp");
        if (q == null) {
            q = "";
        }
        return kotlin.collections.a.j(a3, a4, a5, jpu.a("channelSrp", q));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        TextView textView = this.n;
        if (textView != null) {
            String str = "tab1";
            if (ckf.b(view, textView)) {
                sen.d("HistoryTab_Clk", P0(str));
                ((c2p) l0()).e(true);
                S0();
                V0();
                h1();
                return;
            }
            TextView textView2 = this.o;
            if (textView2 == null) {
                ckf.y("imgHistoryBtn");
                throw null;
            } else if (ckf.b(view, textView2)) {
                sen.d("HistoryTab_Clk", P0("tab2"));
                ((c2p) l0()).e(false);
                S0();
                V0();
                e1();
            } else {
                View view2 = this.p;
                if (view2 == null) {
                    ckf.y("deleteBtn");
                    throw null;
                } else if (ckf.b(view, view2)) {
                    if (this.w == null) {
                        str = "tab2";
                    }
                    sen.d("ClearHistory", P0(str));
                    N0();
                } else {
                    TextView textView3 = this.t;
                    if (textView3 == null) {
                        ckf.y("deleteFinishBtn");
                        throw null;
                    } else if (ckf.b(view, textView3)) {
                        O0();
                        V0();
                    } else {
                        TextView textView4 = this.s;
                        if (textView4 == null) {
                            ckf.y("deleteAllBtn");
                            throw null;
                        } else if (ckf.b(view, textView4)) {
                            new AlertDialog.Builder(getActivity()).setPositiveButton(Localization.q(R.string.app_sure), new DialogInterface.OnClickListener() { // from class: tb.x1z
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    CombineHistoryCellViewHolder.l(CombineHistoryCellViewHolder.this, dialogInterface, i);
                                }
                            }).setTitle(getActivity().getResources().getString(R.string.taobao_app_1005_1_22843)).setNegativeButton(Localization.q(R.string.app_cancel), (DialogInterface.OnClickListener) null).show();
                        } else if (ckf.b(view, this.E)) {
                            FlowLayout flowLayout = this.w;
                            ckf.d(flowLayout);
                            if (!flowLayout.isExpanded()) {
                                FlowLayout flowLayout2 = this.w;
                                if (flowLayout2 != null) {
                                    flowLayout2.setMaxLines(this.C);
                                }
                                FlowLayout flowLayout3 = this.w;
                                if (flowLayout3 != null) {
                                    flowLayout3.setExpanded(true);
                                }
                                FlowLayout flowLayout4 = this.w;
                                if (flowLayout4 != null) {
                                    flowLayout4.requestLayout();
                                }
                                sen.d("History_Expand", P0(str));
                                return;
                            }
                            FlowLayout flowLayout5 = this.w;
                            if (flowLayout5 != null) {
                                flowLayout5.setMaxLines(2);
                            }
                            FlowLayout flowLayout6 = this.w;
                            if (flowLayout6 != null) {
                                flowLayout6.setExpanded(false);
                            }
                            FlowLayout flowLayout7 = this.w;
                            if (flowLayout7 != null) {
                                flowLayout7.requestLayout();
                            }
                        } else {
                            ckf.d(view);
                            Object tag = view.getTag();
                            if (tag instanceof ActivateBean) {
                                sen.d("History_Clk", P0(str));
                                ViewParent parent = view.getParent();
                                ckf.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                                A0(z90.a((ActivateBean) tag, ((ViewGroup) parent).indexOfChild(view), ((CombineHistoryCellBean) this.l).suggestRn));
                            } else if (tag instanceof AuctionItemVO) {
                                sen.d("History_Clk", P0("tab2"));
                                n7m.d(getActivity(), (AuctionItemVO) tag, "ssk", PhotoFrom.Values.SSK_HISTORY);
                            }
                        }
                    }
                }
            }
        } else {
            ckf.y("textHistoryBtn");
            throw null;
        }
    }

    public final void a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8210e56e", new Object[]{this});
            return;
        }
        HistoryResult historyResult = this.z;
        if (historyResult != null) {
            final FlowLayout flowLayout = new FlowLayout(getActivity());
            flowLayout.setMaxLines(1);
            LayoutInflater from = LayoutInflater.from(getActivity());
            float f = 8.0f;
            int min = (int) Math.min(((zuo.e() - (2 * p1p.b(16.0f))) - (4 * p1p.b(8.0f))) / 5, p1p.b(58.0f));
            HistoryResult historyResult2 = this.z;
            ckf.d(historyResult2);
            Iterator<T> it = historyResult2.resultData.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                i++;
                final AuctionItemVO auctionItemVO = (AuctionItemVO) ((Map.Entry) it.next()).getValue();
                View inflate = from.inflate(R.layout.tbsearch_image_history_item_new, (ViewGroup) flowLayout, false);
                inflate.setTag(auctionItemVO);
                ViewProxy.setOnClickListener(inflate, this);
                ViewProxy.setOnLongClickListener(inflate, this);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(min, min);
                marginLayoutParams.rightMargin = p1p.a(f);
                marginLayoutParams.topMargin = p1p.a(f);
                flowLayout.addView(inflate, marginLayoutParams);
                final TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.imv_img_history);
                tUrlImageView.setImageUrl(auctionItemVO.picPath.toString());
                tUrlImageView.setContentDescription("图片，按钮");
                ((TUrlImageView) inflate.findViewById(R.id.imv_img_search)).setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01tM1ebM1rtc6OyMMYD_!!6000000005689-2-tps-48-48.png");
                if (i == 4 && historyResult.resultData.size() > 5) {
                    final View findViewById = inflate.findViewById(R.id.fl_expand);
                    findViewById.setVisibility(0);
                    findViewById.setContentDescription("展开，按钮");
                    ViewProxy.setOnClickListener(findViewById, new View.OnClickListener() { // from class: tb.w1z
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CombineHistoryCellViewHolder.p(TUrlImageView.this, auctionItemVO, findViewById, flowLayout, view);
                        }
                    });
                }
                f = 8.0f;
            }
            this.x = flowLayout;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
            FrameLayout frameLayout = this.q;
            if (frameLayout != null) {
                frameLayout.addView(flowLayout, marginLayoutParams2);
            } else {
                ckf.y("historyContainer");
                throw null;
            }
        }
    }

    public final void Y0() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b882680", new Object[]{this});
            return;
        }
        HistoryResult historyResult = this.z;
        if (historyResult != null) {
            final FlowLayout flowLayout = new FlowLayout(getActivity());
            flowLayout.setMaxLines(1);
            LayoutInflater from = LayoutInflater.from(getActivity());
            float e = zuo.e();
            float f = 2;
            float f2 = 4;
            int min = (int) Math.min(((e - (p1p.b(9.0f) * f)) - (p1p.b(5.5f) * f2)) / 5, p1p.b(65.0f));
            HistoryResult historyResult2 = this.z;
            ckf.d(historyResult2);
            Iterator<T> it = historyResult2.resultData.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                i++;
                AuctionItemVO auctionItemVO = (AuctionItemVO) ((Map.Entry) it.next()).getValue();
                View inflate = from.inflate(R.layout.tbsearch_image_history_item, flowLayout, z);
                inflate.setTag(auctionItemVO);
                ViewProxy.setOnClickListener(inflate, this);
                ViewProxy.setOnLongClickListener(inflate, this);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(min, min);
                if (i % 5 != 4) {
                    marginLayoutParams.rightMargin = (int) (((e - (p1p.b(9.0f) * f)) - (min * 5)) / f2);
                }
                marginLayoutParams.bottomMargin = p1p.a(7.0f);
                flowLayout.addView(inflate, marginLayoutParams);
                int i2 = R.id.imv_img_history;
                ((TUrlImageView) inflate.findViewById(i2)).setImageUrl(auctionItemVO.picPath.toString());
                ((TUrlImageView) inflate.findViewById(i2)).setContentDescription("图片，按钮");
                ((TUrlImageView) inflate.findViewById(R.id.imv_img_search)).setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01tM1ebM1rtc6OyMMYD_!!6000000005689-2-tps-48-48.png");
                ((TUrlImageView) inflate.findViewById(R.id.imv_img_expand)).setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01Woj2Au1bM9JRug4AP_!!6000000003450-2-tps-90-90.png");
                if (i == 4 && historyResult.resultData.size() > 5) {
                    final View findViewById = inflate.findViewById(R.id.fl_expand);
                    findViewById.setVisibility(0);
                    findViewById.setContentDescription("展开，按钮");
                    ViewProxy.setOnClickListener(findViewById, new View.OnClickListener() { // from class: tb.v1z
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CombineHistoryCellViewHolder.o(findViewById, flowLayout, this, view);
                        }
                    });
                }
                from = from;
                z = false;
            }
            this.x = flowLayout;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams2.topMargin = p1p.a(7.0f);
            FrameLayout frameLayout = this.q;
            if (frameLayout != null) {
                frameLayout.addView(flowLayout, marginLayoutParams2);
            } else {
                ckf.y("historyContainer");
                throw null;
            }
        }
    }
}
