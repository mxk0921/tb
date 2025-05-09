package com.taobao.search.m3.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.m3.comment.CommentView;
import com.taobao.search.m3.composite.CompositeView;
import com.taobao.search.m3.discount.DiscountView;
import com.taobao.search.m3.flash.FlashSaleView;
import com.taobao.search.m3.icons.IconView;
import com.taobao.search.m3.interactive.InteractiveView;
import com.taobao.search.m3.price.M3PriceView;
import com.taobao.search.m3.price.PriceBottomView;
import com.taobao.search.m3.property.PropertyView;
import com.taobao.search.m3.shoinfo.ShopInfoView;
import com.taobao.search.m3.singlerow.SingleRowMultiView;
import com.taobao.search.m3.singlerow.SingleRowView;
import com.taobao.search.m3.title.M3Title;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import java.util.ArrayList;
import java.util.Iterator;
import tb.a07;
import tb.bpg;
import tb.ckf;
import tb.eif;
import tb.f1n;
import tb.hhf;
import tb.lsk;
import tb.md4;
import tb.mfe;
import tb.o1p;
import tb.p34;
import tb.pwm;
import tb.pzp;
import tb.rp7;
import tb.ruk;
import tb.t2o;
import tb.tqk;
import tb.vop;
import tb.wfe;
import tb.wuk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class M3WfContainer extends BaseAuctionView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int discountMarginBottom = 0;
    private bpg currentLine;
    public static final a Companion = new a(null);
    private static final int commonContentPadding = o1p.a(6.0f);
    private static final int contentPadding2024 = o1p.a(8.0f);
    private static final int titleTopMargin = o1p.a(4.0f);
    private static final int priceTopMargin = o1p.a(4.5f);
    private static final int bottomPriceMargin = o1p.a(6.0f);
    private static final int priceTopMarginUnderUSP = o1p.a(6.8f);
    private static final int shopInfoTopMargin = o1p.a(5.5f);
    private static final int shopInfoTopMarginWhenIconUp = o1p.a(8.0f);
    private static final int iconInfoTopMargin = o1p.a(6.0f);
    private static final int iconInfoTopMarginWhenMoveUp = o1p.a(2.0f);
    private static final int iconInfoBottomMargin = o1p.a(2.0f);
    private static final int uspTopMargin = o1p.a(2.0f);
    private static final int uspTopMarginWhenUnderPrice = o1p.a(6.0f);
    private static final int uspTopMarginWhenUspBottom = o1p.a(6.0f);
    private static final int dynamicMarginTop = o1p.a(8.0f);
    private static final int contentPaddingBottom = o1p.a(6.0f);
    private static final int contentPaddingBottomWhenDynamicCard = o1p.a(8.5f);
    private static final int discountMarginTop = o1p.a(2.0f);
    private int currentContentPadding = commonContentPadding;
    private final ArrayList<bpg> lines = new ArrayList<>(5);
    private int extraPaddingBottom = contentPaddingBottom;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792490);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("759bb038", new Object[]{this})).intValue();
            }
            return M3WfContainer.access$getDynamicMarginTop$cp();
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c092c720", new Object[]{this})).intValue();
            }
            return M3WfContainer.access$getIconInfoTopMargin$cp();
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4dd95243", new Object[]{this})).intValue();
            }
            return M3WfContainer.access$getShopInfoTopMargin$cp();
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1f9d38db", new Object[]{this})).intValue();
            }
            return M3WfContainer.access$getTitleTopMargin$cp();
        }

        public final int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("976c2961", new Object[]{this})).intValue();
            }
            return M3WfContainer.access$getUspTopMargin$cp();
        }

        public final int f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d3618196", new Object[]{this})).intValue();
            }
            return M3WfContainer.access$getUspTopMarginWhenUspBottom$cp();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792489);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3WfContainer(Context context) {
        super(context, true);
        ckf.g(context, "context");
        StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
        layoutParams.setFullSpan(false);
        setLayoutParams(layoutParams);
    }

    public static final /* synthetic */ int access$getBottomPriceMargin$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82803315", new Object[0])).intValue();
        }
        return bottomPriceMargin;
    }

    public static final /* synthetic */ int access$getCommonContentPadding$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9312b012", new Object[0])).intValue();
        }
        return commonContentPadding;
    }

    public static final /* synthetic */ int access$getContentPadding2024$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc9c6abd", new Object[0])).intValue();
        }
        return contentPadding2024;
    }

    public static final /* synthetic */ int access$getContentPaddingBottom$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("724f1a92", new Object[0])).intValue();
        }
        return contentPaddingBottom;
    }

    public static final /* synthetic */ int access$getContentPaddingBottomWhenDynamicCard$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("539ecbcf", new Object[0])).intValue();
        }
        return contentPaddingBottomWhenDynamicCard;
    }

    public static final /* synthetic */ int access$getDiscountMarginBottom$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70c46fb", new Object[0])).intValue();
        }
        return discountMarginBottom;
    }

    public static final /* synthetic */ int access$getDiscountMarginTop$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc35b67b", new Object[0])).intValue();
        }
        return discountMarginTop;
    }

    public static final /* synthetic */ int access$getDynamicMarginTop$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e8a24d", new Object[0])).intValue();
        }
        return dynamicMarginTop;
    }

    public static final /* synthetic */ int access$getIconInfoBottomMargin$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab3b6b75", new Object[0])).intValue();
        }
        return iconInfoBottomMargin;
    }

    public static final /* synthetic */ int access$getIconInfoTopMargin$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c80f5be5", new Object[0])).intValue();
        }
        return iconInfoTopMargin;
    }

    public static final /* synthetic */ int access$getIconInfoTopMarginWhenMoveUp$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf9f825f", new Object[0])).intValue();
        }
        return iconInfoTopMarginWhenMoveUp;
    }

    public static final /* synthetic */ int access$getPriceTopMargin$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9ae8fbb", new Object[0])).intValue();
        }
        return priceTopMargin;
    }

    public static final /* synthetic */ int access$getPriceTopMarginUnderUSP$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b8f3ec1", new Object[0])).intValue();
        }
        return priceTopMarginUnderUSP;
    }

    public static final /* synthetic */ int access$getShopInfoTopMargin$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c48d9e2", new Object[0])).intValue();
        }
        return shopInfoTopMargin;
    }

    public static final /* synthetic */ int access$getShopInfoTopMarginWhenIconUp$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2fd9a474", new Object[0])).intValue();
        }
        return shopInfoTopMarginWhenIconUp;
    }

    public static final /* synthetic */ int access$getTitleTopMargin$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6d502ca", new Object[0])).intValue();
        }
        return titleTopMargin;
    }

    public static final /* synthetic */ int access$getUspTopMargin$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e01cc84", new Object[0])).intValue();
        }
        return uspTopMargin;
    }

    public static final /* synthetic */ int access$getUspTopMarginWhenUnderPrice$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd5ab219", new Object[0])).intValue();
        }
        return uspTopMarginWhenUnderPrice;
    }

    public static final /* synthetic */ int access$getUspTopMarginWhenUspBottom$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1745af", new Object[0])).intValue();
        }
        return uspTopMarginWhenUspBottom;
    }

    private final int addItemHeight(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b744c06", new Object[]{this, view, new Integer(i)})).intValue();
        }
        if (view.getParent() == null) {
            return i;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return i + view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void addLine(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e467116", new Object[]{this, view});
            return;
        }
        bpg bpgVar = this.currentLine;
        if (bpgVar != null) {
            bpgVar.a(view);
        }
    }

    private final int getPriceMarginTop(M3CellBean m3CellBean) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a80a44c", new Object[]{this, m3CellBean})).intValue();
        }
        if (m3CellBean.getMergeLocToPrice() == 1) {
            z = true;
        }
        if (m3CellBean.getIconUspMerge() < 1 || m3CellBean.getUspBottom() || z) {
            return priceTopMarginUnderUSP;
        }
        return priceTopMargin;
    }

    private final int getUspMarginTop(M3CellBean m3CellBean) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d2f4b55", new Object[]{this, m3CellBean})).intValue();
        }
        if (m3CellBean.getMergeLocToPrice() == 1) {
            z = true;
        }
        if (m3CellBean.getIconUspMerge() >= 1 && !m3CellBean.getUspBottom() && !z) {
            return uspTopMarginWhenUnderPrice;
        }
        if (m3CellBean.getUspBottom()) {
            return uspTopMarginWhenUspBottom;
        }
        return uspTopMargin;
    }

    public static /* synthetic */ Object ipc$super(M3WfContainer m3WfContainer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2124330504:
                m3WfContainer.removeAllViews();
                return null;
            case -2121879877:
                super.addMoreButton(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue(), (M3CellBean) objArr[2], (lsk) objArr[3], ((Boolean) objArr[4]).booleanValue());
                return null;
            case -1901931481:
                super.updatePrice((M3CellBean) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1458277360:
                super.updateItemImage((M3CellBean) objArr[0], ((Boolean) objArr[1]).booleanValue(), (TbSearchStyle) objArr[2]);
                return null;
            case 703860183:
                super.addDynamicCard((View) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/widget/M3WfContainer");
        }
    }

    private final int layoutItem(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b930dc8", new Object[]{this, view, new Integer(i)})).intValue();
        }
        if (view.getParent() == null) {
            return i;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = marginLayoutParams.leftMargin;
        view.layout(i2, marginLayoutParams.topMargin + i, view.getMeasuredWidth() + i2, i + marginLayoutParams.topMargin + view.getMeasuredHeight());
        return view.getBottom() + marginLayoutParams.bottomMargin;
    }

    private final void measureItem(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b07921a", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else if (view.getParent() != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            view.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, Integer.MIN_VALUE), i2);
        }
    }

    private final void newLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91af883b", new Object[]{this});
            return;
        }
        bpg bpgVar = new bpg();
        this.currentLine = bpgVar;
        this.lines.add(bpgVar);
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView, tb.ohb
    public void addDynamicCard(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f40dd7", new Object[]{this, view, new Boolean(z)});
            return;
        }
        ckf.g(view, "view");
        super.addDynamicCard(view, z);
        showItem(getRainbowContainer(), 0, 0, 0, 0);
        this.extraPaddingBottom = contentPaddingBottomWhenDynamicCard;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView, tb.ohb
    public void addMoreButton(boolean z, boolean z2, M3CellBean m3CellBean, lsk lskVar, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8186aebb", new Object[]{this, new Boolean(z), new Boolean(z2), m3CellBean, lskVar, new Boolean(z3)});
            return;
        }
        ckf.g(m3CellBean, "bean");
        ckf.g(lskVar, DataReceiveMonitor.CB_LISTENER);
        super.addMoreButton(z, z2, m3CellBean, lskVar, z3);
        if (getMoreBtn().getParent() != this) {
            showItem(getMoreBtn(), 0, this.currentContentPadding, 0, 0);
            bpg bpgVar = this.currentLine;
            ckf.d(bpgVar);
            bpgVar.d(getMoreBtn());
            bpg bpgVar2 = this.currentLine;
            ckf.d(bpgVar2);
            bpgVar2.g();
        }
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void insertAdIcons(M3CellBean m3CellBean, boolean z, mfe mfeVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ccd761", new Object[]{this, m3CellBean, new Boolean(z), mfeVar});
            return;
        }
        ckf.g(m3CellBean, "bean");
        ckf.g(mfeVar, DataReceiveMonitor.CB_LISTENER);
        IconView icons = getIcons();
        int i2 = this.currentContentPadding;
        if (z) {
            i = iconInfoTopMargin;
        } else {
            i = iconInfoTopMarginWhenMoveUp;
        }
        showItem(icons, i2, 0, i, 0);
        IconView icons2 = getIcons();
        wfe iconInfo = m3CellBean.getIconInfo();
        ckf.d(iconInfo);
        icons2.update(iconInfo, true, mfeVar);
        bpg bpgVar = this.currentLine;
        ckf.d(bpgVar);
        bpgVar.d(getIcons());
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void layoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b254c2f6", new Object[]{this});
            return;
        }
        int layoutItem = layoutItem(getImagePic(), 0);
        if (getVideo().getParent() == this) {
            layoutItem(getVideo(), 0);
        }
        int layoutItem2 = layoutItem(getTitle(), layoutItem);
        int width = getWidth();
        Iterator<bpg> it = this.lines.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            bpg next = it.next();
            ckf.f(next, "next(...)");
            layoutItem2 += next.e(layoutItem2, 0, width);
        }
        if (getRainbowContainer().getParent() == this) {
            getRainbowContainer().layout(0, getHeight() - getRainbowContainer().getMeasuredHeight(), width, getHeight());
        }
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void measureContent(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c5cc822", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        getImagePic().measure(i, i2);
        if (getVideo().getParent() == this) {
            getVideo().measure(i, View.MeasureSpec.makeMeasureSpec(getImagePic().getMeasuredHeight(), 1073741824));
        }
        measureItem(getTitle(), i, i2);
        int addItemHeight = addItemHeight(getTitle(), getImagePic().getMeasuredHeight());
        Iterator<bpg> it = this.lines.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            bpg next = it.next();
            ckf.f(next, "next(...)");
            bpg bpgVar = next;
            bpgVar.f(i, i2);
            addItemHeight += bpgVar.c();
        }
        if (getRainbowContainer().getParent() == this) {
            getRainbowContainer().measure(i, i2);
            addItemHeight += getRainbowContainer().getMeasuredHeight();
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), addItemHeight + this.extraPaddingBottom);
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView, tb.ohb
    public void removeDynamicCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09633d2", new Object[]{this});
        } else {
            getRainbowContainer().removeAllViews();
        }
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        removeAllViews();
        this.lines.clear();
        this.extraPaddingBottom = contentPaddingBottom;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public boolean updateBottomTag(M3CellBean m3CellBean, eif eifVar, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f49ebcc", new Object[]{this, m3CellBean, eifVar, new Boolean(z)})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        ckf.g(eifVar, DataReceiveMonitor.CB_LISTENER);
        if (m3CellBean.getBottomTagInfo() == null) {
            return false;
        }
        newLine();
        InteractiveView interactiveView = getInteractiveView();
        int i2 = this.currentContentPadding;
        if (z) {
            i = BaseAuctionView.Companion.a();
        } else {
            i = uspTopMarginWhenUspBottom;
        }
        showItem(interactiveView, i2, i2, i, 0);
        InteractiveView interactiveView2 = getInteractiveView();
        hhf bottomTagInfo = m3CellBean.getBottomTagInfo();
        ckf.d(bottomTagInfo);
        interactiveView2.update(bottomTagInfo, eifVar, z);
        addLine(getInteractiveView());
        return true;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView, tb.ohb
    public boolean updateComment(M3CellBean m3CellBean, boolean z) {
        int uspMarginTop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34ab8f01", new Object[]{this, m3CellBean, new Boolean(z)})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        if (m3CellBean.getCommentInfo() == null) {
            return false;
        }
        newLine();
        CommentView commentView = getCommentView();
        int i = this.currentContentPadding;
        if (z) {
            uspMarginTop = BaseAuctionView.Companion.a();
        } else {
            uspMarginTop = getUspMarginTop(m3CellBean);
        }
        showItem(commentView, i, i, uspMarginTop, 0);
        CommentView commentView2 = getCommentView();
        p34 commentInfo = m3CellBean.getCommentInfo();
        ckf.d(commentInfo);
        commentView2.update(commentInfo, m3CellBean.getUspBottom());
        addLine(getCommentView());
        return true;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView, tb.ohb
    public boolean updateComposite(M3CellBean m3CellBean, boolean z) {
        int uspMarginTop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a772369", new Object[]{this, m3CellBean, new Boolean(z)})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        if (m3CellBean.getCompositeInfo() == null) {
            return false;
        }
        newLine();
        CompositeView compositeView = getCompositeView();
        int i = this.currentContentPadding;
        if (z) {
            uspMarginTop = BaseAuctionView.Companion.a();
        } else {
            uspMarginTop = getUspMarginTop(m3CellBean);
        }
        showItem(compositeView, i, i, uspMarginTop, 0);
        CompositeView compositeView2 = getCompositeView();
        md4 compositeInfo = m3CellBean.getCompositeInfo();
        ckf.d(compositeInfo);
        compositeView2.update(compositeInfo, m3CellBean.getUspBottom());
        addLine(getCompositeView());
        return true;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public boolean updateDiscount(M3CellBean m3CellBean, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7a7bfd5", new Object[]{this, m3CellBean, new Boolean(z)})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        if (m3CellBean.getDiscountInfo() == null) {
            return false;
        }
        newLine();
        DiscountView discountView = getDiscountView();
        int i2 = this.currentContentPadding;
        if (z) {
            i = BaseAuctionView.Companion.a();
        } else {
            i = discountMarginTop;
        }
        showItem(discountView, i2, i2, i, discountMarginBottom);
        addLine(getDiscountView());
        DiscountView discountView2 = getDiscountView();
        rp7 discountInfo = m3CellBean.getDiscountInfo();
        ckf.d(discountInfo);
        discountView2.update(discountInfo);
        return true;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView, tb.ohb
    public void updateFeedback(M3CellBean m3CellBean, tqk tqkVar, TbSearchStyle tbSearchStyle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b52bcb", new Object[]{this, m3CellBean, tqkVar, tbSearchStyle, new Boolean(z)});
            return;
        }
        ckf.g(m3CellBean, "bean");
        ckf.g(tqkVar, DataReceiveMonitor.CB_LISTENER);
        showItem(getFeedback(), 0, 0, 0, 0);
        getFeedback().update(m3CellBean, m3CellBean.getPicPath(), tqkVar, tbSearchStyle, z);
        getFeedback().setVisibility(0);
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public boolean updateFlashSale(M3CellBean m3CellBean, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48598139", new Object[]{this, m3CellBean, new Boolean(z)})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        if (m3CellBean.getFlashSaleInfo() == null) {
            return false;
        }
        newLine();
        FlashSaleView flashSaleView = getFlashSaleView();
        int i2 = this.currentContentPadding;
        if (z) {
            i = BaseAuctionView.Companion.a();
        } else {
            i = 0;
        }
        showItem(flashSaleView, i2, i2, i, 0);
        addLine(getFlashSaleView());
        getFlashSaleView().update(m3CellBean.getFlashSaleInfo());
        return true;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public boolean updateIcons(M3CellBean m3CellBean, boolean z, boolean z2, mfe mfeVar, boolean z3) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("196fb6ce", new Object[]{this, m3CellBean, new Boolean(z), new Boolean(z2), mfeVar, new Boolean(z3)})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        ckf.g(mfeVar, DataReceiveMonitor.CB_LISTENER);
        if (m3CellBean.getIconInfo() != null) {
            wfe iconInfo = m3CellBean.getIconInfo();
            ckf.d(iconInfo);
            if (!iconInfo.c().isEmpty()) {
                newLine();
                IconView icons = getIcons();
                int i2 = this.currentContentPadding;
                if (z3) {
                    i = BaseAuctionView.Companion.a();
                } else if (!z2) {
                    i = iconInfoTopMarginWhenMoveUp;
                } else {
                    i = iconInfoTopMargin;
                }
                showItem(icons, i2, i2, i, iconInfoBottomMargin);
                IconView icons2 = getIcons();
                wfe iconInfo2 = m3CellBean.getIconInfo();
                ckf.d(iconInfo2);
                icons2.update(iconInfo2, false, mfeVar);
                addLine(getIcons());
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView, tb.ohb
    public boolean updateInteractiveTag(M3CellBean m3CellBean, eif eifVar, boolean z) {
        int uspMarginTop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76775491", new Object[]{this, m3CellBean, eifVar, new Boolean(z)})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        ckf.g(eifVar, DataReceiveMonitor.CB_LISTENER);
        if (m3CellBean.getInteractiveInfo() == null) {
            return false;
        }
        newLine();
        InteractiveView interactiveView = getInteractiveView();
        int i = this.currentContentPadding;
        if (z) {
            uspMarginTop = BaseAuctionView.Companion.a();
        } else {
            uspMarginTop = getUspMarginTop(m3CellBean);
        }
        showItem(interactiveView, i, i, uspMarginTop, 0);
        InteractiveView interactiveView2 = getInteractiveView();
        hhf interactiveInfo = m3CellBean.getInteractiveInfo();
        ckf.d(interactiveInfo);
        interactiveView2.update(interactiveInfo, eifVar, z);
        addLine(getInteractiveView());
        return true;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void updateItemImage(M3CellBean m3CellBean, boolean z, TbSearchStyle tbSearchStyle) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9147410", new Object[]{this, m3CellBean, new Boolean(z), tbSearchStyle});
            return;
        }
        ckf.g(m3CellBean, "bean");
        if (tbSearchStyle == null || !tbSearchStyle.isTb2024) {
            i = commonContentPadding;
        } else {
            i = contentPadding2024;
        }
        this.currentContentPadding = i;
        super.updateItemImage(m3CellBean, z, tbSearchStyle);
        if (z) {
            getImagePic().setImageUrl("", m3CellBean.getWfRatio(), tbSearchStyle);
        } else {
            if (!TextUtils.isEmpty(m3CellBean.getUprightImage())) {
                str = m3CellBean.getUprightImage();
            } else {
                str = m3CellBean.getPicPath();
            }
            if (str != null) {
                getImagePic().setImageUrl(str, m3CellBean.getWfRatio(), tbSearchStyle);
            }
        }
        showItem(getImagePic(), 0, 0, 0, 0);
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void updatePrice(M3CellBean m3CellBean, boolean z) {
        int priceMarginTop;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea2d427", new Object[]{this, m3CellBean, new Boolean(z)});
            return;
        }
        ckf.g(m3CellBean, "bean");
        super.updatePrice(m3CellBean, z);
        if (m3CellBean.getPriceInfo() != null) {
            newLine();
            M3PriceView priceView = getPriceView();
            int i2 = this.currentContentPadding;
            if (z) {
                priceMarginTop = BaseAuctionView.Companion.a();
            } else {
                priceMarginTop = getPriceMarginTop(m3CellBean);
            }
            showItem(priceView, i2, i2, priceMarginTop, 0);
            M3PriceView priceView2 = getPriceView();
            pwm priceInfo = m3CellBean.getPriceInfo();
            ckf.d(priceInfo);
            priceView2.update(priceInfo, z);
            addLine(getPriceView());
            PriceBottomView priceBottomView = getPriceBottomView();
            pwm priceInfo2 = m3CellBean.getPriceInfo();
            ckf.d(priceInfo2);
            String k = priceInfo2.k();
            pwm priceInfo3 = m3CellBean.getPriceInfo();
            ckf.d(priceInfo3);
            if (priceBottomView.update(k, priceInfo3.j())) {
                newLine();
                PriceBottomView priceBottomView2 = getPriceBottomView();
                int i3 = this.currentContentPadding;
                if (z) {
                    i = BaseAuctionView.Companion.a();
                } else {
                    i = bottomPriceMargin;
                }
                showItem(priceBottomView2, i3, i3, i, 0);
                addLine(getPriceBottomView());
            }
        }
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView, tb.ohb
    public boolean updateProperty(M3CellBean m3CellBean, boolean z) {
        int uspMarginTop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a96e1969", new Object[]{this, m3CellBean, new Boolean(z)})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        if (m3CellBean.getPropertyInfo() == null) {
            return false;
        }
        newLine();
        PropertyView propertyView = getPropertyView();
        int i = this.currentContentPadding;
        if (z) {
            uspMarginTop = BaseAuctionView.Companion.a();
        } else {
            uspMarginTop = getUspMarginTop(m3CellBean);
        }
        showItem(propertyView, i, i, uspMarginTop, 0);
        PropertyView propertyView2 = getPropertyView();
        f1n propertyInfo = m3CellBean.getPropertyInfo();
        ckf.d(propertyInfo);
        propertyView2.update(propertyInfo, m3CellBean.getUspBottom(), false);
        addLine(getPropertyView());
        return true;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void updateShopInfo(M3CellBean m3CellBean, ruk rukVar, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ded2f0", new Object[]{this, m3CellBean, rukVar, new Boolean(z)});
            return;
        }
        ckf.g(m3CellBean, "bean");
        ckf.g(rukVar, DataReceiveMonitor.CB_LISTENER);
        if (m3CellBean.getShopInfo() != null) {
            newLine();
            ShopInfoView shopInfo = getShopInfo();
            int i2 = this.currentContentPadding;
            if (z) {
                i = BaseAuctionView.Companion.a();
            } else if (m3CellBean.getMergeLocToPrice() == 1) {
                i = shopInfoTopMarginWhenIconUp;
            } else {
                i = shopInfoTopMargin;
            }
            showItem(shopInfo, i2, i2, i, 0);
            ShopInfoView shopInfo2 = getShopInfo();
            vop shopInfo3 = m3CellBean.getShopInfo();
            ckf.d(shopInfo3);
            shopInfo2.update(shopInfo3, rukVar, z);
            addLine(getShopInfo());
        }
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView, tb.ohb
    public boolean updateSingleRow(M3CellBean m3CellBean, wuk wukVar, boolean z) {
        View view;
        int uspMarginTop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6597bc96", new Object[]{this, m3CellBean, wukVar, new Boolean(z)})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        ckf.g(wukVar, DataReceiveMonitor.CB_LISTENER);
        if (m3CellBean.getSingleRowInfo() == null) {
            return false;
        }
        newLine();
        pzp singleRowInfo = m3CellBean.getSingleRowInfo();
        ckf.d(singleRowInfo);
        if (singleRowInfo.a().size() > 1) {
            view = getMultiSingleRow();
        } else {
            view = getSingleRow();
        }
        int i = this.currentContentPadding;
        if (z) {
            uspMarginTop = BaseAuctionView.Companion.a();
        } else {
            uspMarginTop = getUspMarginTop(m3CellBean);
        }
        showItem(view, i, i, uspMarginTop, 0);
        if (view instanceof SingleRowView) {
            pzp singleRowInfo2 = m3CellBean.getSingleRowInfo();
            ckf.d(singleRowInfo2);
            ((SingleRowView) view).update(singleRowInfo2.a().get(0), m3CellBean.getUspBottom(), wukVar, true);
        } else {
            ckf.e(view, "null cannot be cast to non-null type com.taobao.search.m3.singlerow.SingleRowMultiView");
            pzp singleRowInfo3 = m3CellBean.getSingleRowInfo();
            ckf.d(singleRowInfo3);
            ((SingleRowMultiView) view).update(singleRowInfo3, m3CellBean.getUspBottom(), wukVar, true);
        }
        addLine(view);
        return true;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView, tb.ohb
    public boolean updateSummaryTips(M3CellBean m3CellBean, boolean z) {
        int uspMarginTop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f05e9e0", new Object[]{this, m3CellBean, new Boolean(z)})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        if (m3CellBean.getSummaryTips() == null) {
            return false;
        }
        newLine();
        PropertyView propertyView = getPropertyView();
        int i = this.currentContentPadding;
        if (z) {
            uspMarginTop = BaseAuctionView.Companion.a();
        } else {
            uspMarginTop = getUspMarginTop(m3CellBean);
        }
        showItem(propertyView, i, i, uspMarginTop, 0);
        PropertyView propertyView2 = getPropertyView();
        f1n summaryTips = m3CellBean.getSummaryTips();
        ckf.d(summaryTips);
        propertyView2.update(summaryTips, m3CellBean.getUspBottom(), true);
        addLine(getPropertyView());
        return true;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView, tb.ohb
    public void updateTitle(M3CellBean m3CellBean, TbSearchStyle tbSearchStyle) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862ef488", new Object[]{this, m3CellBean, tbSearchStyle});
            return;
        }
        ckf.g(m3CellBean, "bean");
        getTitle().update(m3CellBean.getTitleIcon(), m3CellBean.getTitle(), m3CellBean.isClicked(), m3CellBean.getWfTitleLines(), false, tbSearchStyle);
        M3Title title = getTitle();
        int i2 = this.currentContentPadding;
        if (tbSearchStyle == null || !tbSearchStyle.isTb2024) {
            i = titleTopMargin;
        } else {
            i = BaseAuctionView.Companion.a();
        }
        showItem(title, i2, i2, i, 0);
    }
}
