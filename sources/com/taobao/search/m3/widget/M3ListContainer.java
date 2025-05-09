package com.taobao.search.m3.widget;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.m3.comment.CommentView;
import com.taobao.search.m3.composite.CompositeView;
import com.taobao.search.m3.discount.DiscountView;
import com.taobao.search.m3.feedback.FeedbackView;
import com.taobao.search.m3.flash.FlashSaleView;
import com.taobao.search.m3.icons.IconView;
import com.taobao.search.m3.image.M3ImageView;
import com.taobao.search.m3.interactive.InteractiveView;
import com.taobao.search.m3.price.M3PriceView;
import com.taobao.search.m3.price.PriceBottomView;
import com.taobao.search.m3.property.PropertyView;
import com.taobao.search.m3.shoinfo.ShopInfoView;
import com.taobao.search.m3.singlerow.SingleRowMultiView;
import com.taobao.search.m3.singlerow.SingleRowView;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import java.util.ArrayList;
import java.util.Iterator;
import tb.a07;
import tb.bpg;
import tb.ckf;
import tb.eif;
import tb.f1n;
import tb.hfn;
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
public final class M3ListContainer extends BaseAuctionView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bpg currentLine;
    private bpg rainbowLine;
    public static final a Companion = new a(null);
    private static final int imageLeftMargin = o1p.a(6.0f);
    private static final int padding = o1p.a(5.0f);
    private static final int commonMargin = o1p.a(3.0f);
    private static final int priceTopMargin = o1p.a(6.8f);
    private static final int bottomPriceTopMargin = o1p.a(4.5f);
    private static final int areaMargin = o1p.a(3.0f);
    private static final int contentLeftMargin = o1p.a(8.5f);
    private static final int contentRightMargin = o1p.a(8.0f);
    private static final int moreMarginLeft = o1p.a(8.0f);
    private static final int imageSize = o1p.a(140.0f);
    private final ArrayList<bpg> topLines = new ArrayList<>();
    private final ArrayList<bpg> bottomLines = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792486);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792485);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3ListContainer(Context context) {
        super(context, false);
        ckf.g(context, "context");
        int i = padding;
        setPadding(0, i, 0, i);
    }

    public static final /* synthetic */ int access$getBottomPriceTopMargin$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a34e0ed0", new Object[0])).intValue();
        }
        return bottomPriceTopMargin;
    }

    public static final /* synthetic */ int access$getPriceTopMargin$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9ae8fbb", new Object[0])).intValue();
        }
        return priceTopMargin;
    }

    private final int getUspMarginTop(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d2f4b55", new Object[]{this, m3CellBean})).intValue();
        }
        if (m3CellBean.getUspBottom()) {
            return M3WfContainer.Companion.f();
        }
        return M3WfContainer.Companion.e();
    }

    public static /* synthetic */ Object ipc$super(M3ListContainer m3ListContainer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2130491415:
                super.start();
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/widget/M3ListContainer");
        }
    }

    private final void newLine(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44231f9", new Object[]{this, new Boolean(z)});
            return;
        }
        bpg bpgVar = new bpg();
        this.currentLine = bpgVar;
        if (z) {
            this.topLines.add(bpgVar);
        } else {
            this.bottomLines.add(bpgVar);
        }
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
            showItem(getMoreBtn(), moreMarginLeft, 0, 0, 0);
            bpg bpgVar = this.currentLine;
            ckf.d(bpgVar);
            bpgVar.d(getMoreBtn());
            bpg bpgVar2 = this.currentLine;
            ckf.d(bpgVar2);
            bpgVar2.g();
        }
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void layoutContent() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b254c2f6", new Object[]{this});
            return;
        }
        int i2 = padding;
        M3ImageView imagePic = getImagePic();
        int i3 = imageLeftMargin;
        imagePic.layout(i3, i2, getImagePic().getMeasuredWidth() + i3, getImagePic().getMeasuredHeight() + i2);
        if (getVideo().getParent() == this) {
            getVideo().layout(getImagePic().getLeft(), getImagePic().getTop(), getImagePic().getRight(), getImagePic().getBottom());
        }
        bpg bpgVar = this.rainbowLine;
        if (bpgVar != null) {
            bpgVar.e(getImagePic().getBottom(), 0, getWidth());
        }
        int measuredWidth = i3 + getImagePic().getMeasuredWidth();
        int width = getWidth() - contentRightMargin;
        Iterator<bpg> it = this.topLines.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            bpg next = it.next();
            ckf.f(next, "next(...)");
            bpg bpgVar2 = next;
            bpgVar2.e(i2, measuredWidth, width);
            i2 += bpgVar2.c();
        }
        bpg bpgVar3 = this.rainbowLine;
        if (bpgVar3 != null) {
            i = getHeight() - bpgVar3.b();
        } else {
            i = getHeight() - padding;
        }
        for (int size = this.bottomLines.size() - 1; -1 < size; size--) {
            bpg bpgVar4 = this.bottomLines.get(size);
            ckf.f(bpgVar4, "get(...)");
            bpg bpgVar5 = bpgVar4;
            i -= bpgVar5.b();
            bpgVar5.e(i, measuredWidth, width);
        }
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void measureContent(int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c5cc822", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(imageSize, 1073741824);
        getImagePic().measure(makeMeasureSpec, makeMeasureSpec);
        if (getVideo().getParent() == this) {
            getVideo().measure(makeMeasureSpec, makeMeasureSpec);
        }
        bpg bpgVar = this.rainbowLine;
        if (bpgVar != null) {
            bpgVar.f(i, i2);
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(((size - getImagePic().getMeasuredWidth()) - imageLeftMargin) - contentRightMargin, Integer.MIN_VALUE);
        Iterator<bpg> it = this.topLines.iterator();
        ckf.f(it, "iterator(...)");
        int i4 = 0;
        while (it.hasNext()) {
            bpg next = it.next();
            ckf.f(next, "next(...)");
            bpg bpgVar2 = next;
            bpgVar2.f(makeMeasureSpec2, i2);
            i4 += bpgVar2.c();
        }
        int i5 = i4 + areaMargin;
        Iterator<bpg> it2 = this.bottomLines.iterator();
        ckf.f(it2, "iterator(...)");
        while (it2.hasNext()) {
            bpg next2 = it2.next();
            ckf.f(next2, "next(...)");
            bpg bpgVar3 = next2;
            bpgVar3.f(makeMeasureSpec2, i2);
            i5 += bpgVar3.c();
        }
        int i6 = padding;
        int c = hfn.c(i5, getImagePic().getMeasuredHeight()) + i6;
        bpg bpgVar4 = this.rainbowLine;
        if (bpgVar4 != null) {
            i3 = bpgVar4.c();
        }
        setMeasuredDimension(size, c + i3 + i6);
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        super.start();
        this.rainbowLine = null;
        this.topLines.clear();
        this.bottomLines.clear();
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public boolean updateBottomTag(M3CellBean m3CellBean, eif eifVar, boolean z) {
        int f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f49ebcc", new Object[]{this, m3CellBean, eifVar, new Boolean(z)})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        ckf.g(eifVar, DataReceiveMonitor.CB_LISTENER);
        if (m3CellBean.getBottomTagInfo() == null) {
            return false;
        }
        newLine(false);
        InteractiveView interactiveView = getInteractiveView();
        int i = contentLeftMargin;
        if (z) {
            f = BaseAuctionView.Companion.a();
        } else {
            f = M3WfContainer.Companion.f();
        }
        showItem(interactiveView, i, 0, f, 0);
        InteractiveView interactiveView2 = getInteractiveView();
        hhf bottomTagInfo = m3CellBean.getBottomTagInfo();
        ckf.d(bottomTagInfo);
        interactiveView2.update(bottomTagInfo, eifVar, z);
        bpg bpgVar = this.currentLine;
        ckf.d(bpgVar);
        bpgVar.a(getInteractiveView());
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
        newLine(!m3CellBean.getUspBottom());
        CommentView commentView = getCommentView();
        int i = contentLeftMargin;
        if (z) {
            uspMarginTop = BaseAuctionView.Companion.a();
        } else {
            uspMarginTop = getUspMarginTop(m3CellBean);
        }
        showItem(commentView, i, 0, uspMarginTop, 0);
        CommentView commentView2 = getCommentView();
        p34 commentInfo = m3CellBean.getCommentInfo();
        ckf.d(commentInfo);
        commentView2.update(commentInfo, m3CellBean.getUspBottom());
        bpg bpgVar = this.currentLine;
        ckf.d(bpgVar);
        bpgVar.a(getCommentView());
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
        newLine(!m3CellBean.getUspBottom());
        CompositeView compositeView = getCompositeView();
        int i = contentLeftMargin;
        if (z) {
            uspMarginTop = BaseAuctionView.Companion.a();
        } else {
            uspMarginTop = getUspMarginTop(m3CellBean);
        }
        showItem(compositeView, i, 0, uspMarginTop, 0);
        CompositeView compositeView2 = getCompositeView();
        md4 compositeInfo = m3CellBean.getCompositeInfo();
        ckf.d(compositeInfo);
        compositeView2.update(compositeInfo, m3CellBean.getUspBottom());
        bpg bpgVar = this.currentLine;
        ckf.d(bpgVar);
        bpgVar.a(getCompositeView());
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
        newLine(true);
        DiscountView discountView = getDiscountView();
        int i2 = contentLeftMargin;
        if (z) {
            i = BaseAuctionView.Companion.a();
        } else {
            i = commonMargin;
        }
        showItem(discountView, i2, 0, i, 0);
        DiscountView discountView2 = getDiscountView();
        rp7 discountInfo = m3CellBean.getDiscountInfo();
        ckf.d(discountInfo);
        discountView2.update(discountInfo);
        bpg bpgVar = this.currentLine;
        ckf.d(bpgVar);
        bpgVar.a(getDiscountView());
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
        FeedbackView feedback = getFeedback();
        int i = imageLeftMargin;
        int i2 = padding;
        showItem(feedback, i, i, i2, i2);
        getFeedback().update(m3CellBean, m3CellBean.getPicPath(), tqkVar, tbSearchStyle, false);
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
        newLine(true);
        FlashSaleView flashSaleView = getFlashSaleView();
        int i2 = contentLeftMargin;
        if (z) {
            i = BaseAuctionView.Companion.a();
        } else {
            i = commonMargin;
        }
        showItem(flashSaleView, i2, 0, i, 0);
        getFlashSaleView().update(m3CellBean.getFlashSaleInfo());
        bpg bpgVar = this.currentLine;
        ckf.d(bpgVar);
        bpgVar.a(getFlashSaleView());
        return true;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public boolean updateIcons(M3CellBean m3CellBean, boolean z, boolean z2, mfe mfeVar, boolean z3) {
        int b;
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
                newLine(z);
                IconView icons = getIcons();
                int i = contentLeftMargin;
                if (z3) {
                    b = BaseAuctionView.Companion.a();
                } else {
                    b = M3WfContainer.Companion.b();
                }
                showItem(icons, i, 0, b, 0);
                IconView icons2 = getIcons();
                wfe iconInfo2 = m3CellBean.getIconInfo();
                ckf.d(iconInfo2);
                icons2.update(iconInfo2, false, mfeVar);
                bpg bpgVar = this.currentLine;
                ckf.d(bpgVar);
                bpgVar.a(getIcons());
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
        newLine(!m3CellBean.getUspBottom());
        InteractiveView interactiveView = getInteractiveView();
        int i = contentLeftMargin;
        if (z) {
            uspMarginTop = BaseAuctionView.Companion.a();
        } else {
            uspMarginTop = getUspMarginTop(m3CellBean);
        }
        showItem(interactiveView, i, 0, uspMarginTop, 0);
        InteractiveView interactiveView2 = getInteractiveView();
        hhf interactiveInfo = m3CellBean.getInteractiveInfo();
        ckf.d(interactiveInfo);
        interactiveView2.update(interactiveInfo, eifVar, z);
        bpg bpgVar = this.currentLine;
        ckf.d(bpgVar);
        bpgVar.a(getInteractiveView());
        return true;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void updateItemImage(M3CellBean m3CellBean, boolean z, TbSearchStyle tbSearchStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9147410", new Object[]{this, m3CellBean, new Boolean(z), tbSearchStyle});
            return;
        }
        ckf.g(m3CellBean, "bean");
        super.updateItemImage(m3CellBean, z, tbSearchStyle);
        if (z) {
            getImagePic().setImageUrl("", 1.0f, tbSearchStyle);
        } else {
            String picPath = m3CellBean.getPicPath();
            if (picPath != null) {
                getImagePic().setImageUrl(picPath, 1.0f, tbSearchStyle);
            }
        }
        showItem(getImagePic(), 0, 0, 0, 0);
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void updatePrice(M3CellBean m3CellBean, boolean z) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea2d427", new Object[]{this, m3CellBean, new Boolean(z)});
            return;
        }
        ckf.g(m3CellBean, "bean");
        super.updatePrice(m3CellBean, z);
        if (m3CellBean.getPriceInfo() != null) {
            newLine(false);
            M3PriceView priceView = getPriceView();
            int i3 = contentLeftMargin;
            if (z) {
                i = BaseAuctionView.Companion.a();
            } else {
                i = priceTopMargin;
            }
            showItem(priceView, i3, 0, i, 0);
            M3PriceView priceView2 = getPriceView();
            pwm priceInfo = m3CellBean.getPriceInfo();
            ckf.d(priceInfo);
            priceView2.update(priceInfo, z);
            bpg bpgVar = this.currentLine;
            ckf.d(bpgVar);
            bpgVar.a(getPriceView());
            PriceBottomView priceBottomView = getPriceBottomView();
            pwm priceInfo2 = m3CellBean.getPriceInfo();
            ckf.d(priceInfo2);
            String k = priceInfo2.k();
            pwm priceInfo3 = m3CellBean.getPriceInfo();
            ckf.d(priceInfo3);
            if (priceBottomView.update(k, priceInfo3.j())) {
                newLine(false);
                PriceBottomView priceBottomView2 = getPriceBottomView();
                if (z) {
                    i2 = BaseAuctionView.Companion.a();
                } else {
                    i2 = bottomPriceTopMargin;
                }
                showItem(priceBottomView2, i3, 0, i2, 0);
                bpg bpgVar2 = this.currentLine;
                ckf.d(bpgVar2);
                bpgVar2.a(getPriceBottomView());
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
        newLine(!m3CellBean.getUspBottom());
        PropertyView propertyView = getPropertyView();
        int i = contentLeftMargin;
        if (z) {
            uspMarginTop = BaseAuctionView.Companion.a();
        } else {
            uspMarginTop = getUspMarginTop(m3CellBean);
        }
        showItem(propertyView, i, 0, uspMarginTop, 0);
        PropertyView propertyView2 = getPropertyView();
        f1n propertyInfo = m3CellBean.getPropertyInfo();
        ckf.d(propertyInfo);
        propertyView2.update(propertyInfo, m3CellBean.getUspBottom(), false);
        bpg bpgVar = this.currentLine;
        ckf.d(bpgVar);
        bpgVar.a(getPropertyView());
        return true;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void updateShopInfo(M3CellBean m3CellBean, ruk rukVar, boolean z) {
        int c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ded2f0", new Object[]{this, m3CellBean, rukVar, new Boolean(z)});
            return;
        }
        ckf.g(m3CellBean, "bean");
        ckf.g(rukVar, DataReceiveMonitor.CB_LISTENER);
        if (m3CellBean.getShopInfo() != null) {
            newLine(false);
            ShopInfoView shopInfo = getShopInfo();
            int i = contentLeftMargin;
            if (z) {
                c = BaseAuctionView.Companion.a();
            } else {
                c = M3WfContainer.Companion.c();
            }
            showItem(shopInfo, i, 0, c, 0);
            ShopInfoView shopInfo2 = getShopInfo();
            vop shopInfo3 = m3CellBean.getShopInfo();
            ckf.d(shopInfo3);
            shopInfo2.update(shopInfo3, rukVar, z);
            bpg bpgVar = this.currentLine;
            ckf.d(bpgVar);
            bpgVar.a(getShopInfo());
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
        newLine(!m3CellBean.getUspBottom());
        pzp singleRowInfo = m3CellBean.getSingleRowInfo();
        ckf.d(singleRowInfo);
        if (singleRowInfo.a().size() > 1) {
            view = getMultiSingleRow();
        } else {
            view = getSingleRow();
        }
        int i = contentLeftMargin;
        if (z) {
            uspMarginTop = BaseAuctionView.Companion.a();
        } else {
            uspMarginTop = getUspMarginTop(m3CellBean);
        }
        showItem(view, i, 0, uspMarginTop, 0);
        if (view instanceof SingleRowView) {
            pzp singleRowInfo2 = m3CellBean.getSingleRowInfo();
            ckf.d(singleRowInfo2);
            ((SingleRowView) view).update(singleRowInfo2.a().get(0), m3CellBean.getUspBottom(), wukVar, false);
        } else {
            ckf.e(view, "null cannot be cast to non-null type com.taobao.search.m3.singlerow.SingleRowMultiView");
            pzp singleRowInfo3 = m3CellBean.getSingleRowInfo();
            ckf.d(singleRowInfo3);
            ((SingleRowMultiView) view).update(singleRowInfo3, m3CellBean.getUspBottom(), wukVar, false);
        }
        bpg bpgVar = this.currentLine;
        ckf.d(bpgVar);
        bpgVar.a(view);
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
        newLine(!m3CellBean.getUspBottom());
        PropertyView propertyView = getPropertyView();
        int i = contentLeftMargin;
        if (z) {
            uspMarginTop = BaseAuctionView.Companion.a();
        } else {
            uspMarginTop = getUspMarginTop(m3CellBean);
        }
        showItem(propertyView, i, 0, uspMarginTop, 0);
        PropertyView propertyView2 = getPropertyView();
        f1n summaryTips = m3CellBean.getSummaryTips();
        ckf.d(summaryTips);
        propertyView2.update(summaryTips, m3CellBean.getUspBottom(), true);
        bpg bpgVar = this.currentLine;
        ckf.d(bpgVar);
        bpgVar.a(getPropertyView());
        return true;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView, tb.ohb
    public void updateTitle(M3CellBean m3CellBean, TbSearchStyle tbSearchStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862ef488", new Object[]{this, m3CellBean, tbSearchStyle});
            return;
        }
        ckf.g(m3CellBean, "bean");
        getTitle().update(m3CellBean.getTitleIcon(), m3CellBean.getTitle(), m3CellBean.isClicked(), m3CellBean.getListTitleLines(), false, tbSearchStyle);
        if (getTitle().getParent() == null) {
            newLine(true);
            showItem(getTitle(), contentLeftMargin, 0, M3WfContainer.Companion.d(), 0);
            bpg bpgVar = this.currentLine;
            ckf.d(bpgVar);
            bpgVar.a(getTitle());
        }
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
        if (z) {
            newLine(false);
            showItem(getRainbowContainer(), contentLeftMargin, 0, BaseAuctionView.Companion.a(), 0);
            bpg bpgVar = this.currentLine;
            ckf.d(bpgVar);
            bpgVar.a(getRainbowContainer());
            return;
        }
        this.rainbowLine = new bpg();
        showItem(getRainbowContainer(), 0, 0, M3WfContainer.Companion.a(), 0);
        bpg bpgVar2 = this.rainbowLine;
        ckf.d(bpgVar2);
        bpgVar2.a(getRainbowContainer());
    }
}
