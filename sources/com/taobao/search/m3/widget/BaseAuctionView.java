package com.taobao.search.m3.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
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
import com.taobao.search.m3.more.MoreAreaView;
import com.taobao.search.m3.price.M3PriceView;
import com.taobao.search.m3.price.PriceBottomView;
import com.taobao.search.m3.property.PropertyView;
import com.taobao.search.m3.shoinfo.ShopInfoView;
import com.taobao.search.m3.singlerow.SingleRowMultiView;
import com.taobao.search.m3.singlerow.SingleRowView;
import com.taobao.search.m3.title.M3Title;
import com.taobao.search.m3.video.M3VideoView;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import java.util.List;
import tb.a07;
import tb.ckf;
import tb.dgw;
import tb.eif;
import tb.knh;
import tb.lsk;
import tb.mfe;
import tb.o1p;
import tb.ohb;
import tb.pwm;
import tb.ruk;
import tb.soc;
import tb.t2o;
import tb.tqk;
import tb.wuk;
import tb.xfe;
import tb.ykg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class BaseAuctionView extends ViewGroup implements ohb, knh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private static final int tb2024Margin = o1p.a(8.0f);
    private final CommentView commentView;
    private final CompositeView compositeView;
    private final DiscountView discountView;
    private final FeedbackView feedback;
    private final FlashSaleView flashSaleView;
    private final IconView icons;
    private final M3ImageView imagePic;
    private final InteractiveView interactiveView;
    private final MoreAreaView moreBtn;
    private final SingleRowMultiView multiSingleRow;
    private final PriceBottomView priceBottomView;
    private final M3PriceView priceView;
    private final PropertyView propertyView;
    private final FrameLayout rainbowContainer;
    private final ShopInfoView shopInfo;
    private final SingleRowView singleRow;
    private final M3Title title;
    private final M3VideoView video;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792474);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c53631ac", new Object[]{this})).intValue();
            }
            return BaseAuctionView.access$getTb2024Margin$cp();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792473);
        t2o.a(815792478);
        t2o.a(815792329);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAuctionView(Context context, boolean z) {
        super(context);
        ckf.g(context, "context");
        this.feedback = new FeedbackView(context, z);
        this.imagePic = new M3ImageView(context, z, false);
        this.video = new M3VideoView(context, z);
        this.title = new M3Title(context);
        this.flashSaleView = new FlashSaleView(context);
        this.discountView = new DiscountView(context);
        this.priceView = new M3PriceView(context, z);
        this.priceBottomView = new PriceBottomView(context);
        this.shopInfo = new ShopInfoView(context);
        this.icons = new IconView(context, this, z);
        this.interactiveView = new InteractiveView(context);
        boolean z2 = !z;
        this.commentView = new CommentView(context, z2);
        this.compositeView = new CompositeView(context);
        this.singleRow = new SingleRowView(context);
        this.multiSingleRow = new SingleRowMultiView(context);
        this.propertyView = new PropertyView(context, z);
        this.moreBtn = new MoreAreaView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.rainbowContainer = frameLayout;
        StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
        layoutParams.setFullSpan(z2);
        setLayoutParams(layoutParams);
        setClipChildren(false);
        frameLayout.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
    }

    public static final /* synthetic */ int access$getTb2024Margin$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7bcdc59", new Object[0])).intValue();
        }
        return tb2024Margin;
    }

    public static /* synthetic */ Object ipc$super(BaseAuctionView baseAuctionView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/widget/BaseAuctionView");
    }

    @Override // tb.ohb
    public void addDynamicCard(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f40dd7", new Object[]{this, view, new Boolean(z)});
            return;
        }
        ckf.g(view, "view");
        this.rainbowContainer.removeAllViews();
        this.rainbowContainer.addView(view, new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // tb.ohb
    public void addMoreButton(boolean z, boolean z2, M3CellBean m3CellBean, lsk lskVar, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8186aebb", new Object[]{this, new Boolean(z), new Boolean(z2), m3CellBean, lskVar, new Boolean(z3)});
            return;
        }
        ckf.g(m3CellBean, "bean");
        ckf.g(lskVar, DataReceiveMonitor.CB_LISTENER);
        this.moreBtn.update(z, m3CellBean.getPkInfo(), z2, m3CellBean.getJiaGouInfo(), lskVar, z3);
    }

    @Override // tb.ohb
    public boolean canPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d7069af", new Object[]{this})).booleanValue();
        }
        if (this.video.getParent() == this) {
            return true;
        }
        return false;
    }

    @Override // tb.knh
    public int getCardBackgroundColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b7f4369", new Object[]{this})).intValue();
        }
        return -1;
    }

    public final CommentView getCommentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommentView) ipChange.ipc$dispatch("5a0413f1", new Object[]{this});
        }
        return this.commentView;
    }

    public final CompositeView getCompositeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompositeView) ipChange.ipc$dispatch("b620c5f9", new Object[]{this});
        }
        return this.compositeView;
    }

    public final DiscountView getDiscountView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DiscountView) ipChange.ipc$dispatch("f0dfc243", new Object[]{this});
        }
        return this.discountView;
    }

    @Override // tb.ohb
    public List<xfe> getDisplayIcons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("64cf632", new Object[]{this});
        }
        if (this.icons.getParent() != this) {
            return null;
        }
        return this.icons.getDisplayIcons();
    }

    public final FeedbackView getFeedback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FeedbackView) ipChange.ipc$dispatch("c055c8e4", new Object[]{this});
        }
        return this.feedback;
    }

    public final FlashSaleView getFlashSaleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlashSaleView) ipChange.ipc$dispatch("e7b9f2d0", new Object[]{this});
        }
        return this.flashSaleView;
    }

    public final IconView getIcons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IconView) ipChange.ipc$dispatch("bda35614", new Object[]{this});
        }
        return this.icons;
    }

    public final M3ImageView getImagePic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M3ImageView) ipChange.ipc$dispatch("7e7b45e8", new Object[]{this});
        }
        return this.imagePic;
    }

    public final InteractiveView getInteractiveView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractiveView) ipChange.ipc$dispatch("c81b1b08", new Object[]{this});
        }
        return this.interactiveView;
    }

    public final MoreAreaView getMoreBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MoreAreaView) ipChange.ipc$dispatch("85bb3401", new Object[]{this});
        }
        return this.moreBtn;
    }

    public final SingleRowMultiView getMultiSingleRow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SingleRowMultiView) ipChange.ipc$dispatch("81363ea9", new Object[]{this});
        }
        return this.multiSingleRow;
    }

    public final PriceBottomView getPriceBottomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PriceBottomView) ipChange.ipc$dispatch("649306dd", new Object[]{this});
        }
        return this.priceBottomView;
    }

    public final M3PriceView getPriceView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M3PriceView) ipChange.ipc$dispatch("f6feb279", new Object[]{this});
        }
        return this.priceView;
    }

    public final PropertyView getPropertyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PropertyView) ipChange.ipc$dispatch("391c42af", new Object[]{this});
        }
        return this.propertyView;
    }

    public final FrameLayout getRainbowContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("cbe384f1", new Object[]{this});
        }
        return this.rainbowContainer;
    }

    public final ShopInfoView getShopInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopInfoView) ipChange.ipc$dispatch("9843c94d", new Object[]{this});
        }
        return this.shopInfo;
    }

    public final SingleRowView getSingleRow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SingleRowView) ipChange.ipc$dispatch("a37b769d", new Object[]{this});
        }
        return this.singleRow;
    }

    public final M3Title getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M3Title) ipChange.ipc$dispatch("80381fb6", new Object[]{this});
        }
        return this.title;
    }

    public final M3VideoView getVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M3VideoView) ipChange.ipc$dispatch("7aab1488", new Object[]{this});
        }
        return this.video;
    }

    @Override // tb.ohb
    public void hideFeedback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("757083ee", new Object[]{this});
        } else if (this.feedback.getParent() == this && this.feedback.getVisibility() == 0) {
            this.feedback.hide();
        }
    }

    public void insertAdIcons(M3CellBean m3CellBean, boolean z, mfe mfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ccd761", new Object[]{this, m3CellBean, new Boolean(z), mfeVar});
        } else {
            ohb.a.a(this, m3CellBean, z, mfeVar);
        }
    }

    public void layoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b254c2f6", new Object[]{this});
        }
    }

    public abstract void measureContent(int i, int i2);

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        layoutContent();
        if (this.feedback.getParent() == this) {
            ViewGroup.LayoutParams layoutParams = this.feedback.getLayoutParams();
            ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            FeedbackView feedbackView = this.feedback;
            int i5 = marginLayoutParams.leftMargin;
            feedbackView.layout(i5, marginLayoutParams.topMargin, feedbackView.getMeasuredWidth() + i5, marginLayoutParams.topMargin + this.feedback.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        measureContent(i, i2);
        if (this.feedback.getParent() == this) {
            ViewGroup.LayoutParams layoutParams = this.feedback.getLayoutParams();
            ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.feedback.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin, 1073741824));
        }
    }

    @Override // tb.ohb
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            this.video.play();
        }
    }

    @Override // tb.ohb
    public void removeDynamicCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09633d2", new Object[]{this});
        } else {
            this.rainbowContainer.removeAllViews();
        }
    }

    public final void showItem(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a962aa7b", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        ckf.g(view, "view");
        if (view.getParent() == null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i2;
            marginLayoutParams.topMargin = i3;
            marginLayoutParams.bottomMargin = i4;
            addView(view, marginLayoutParams);
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        removeAllViews();
        setTouchDelegate(null);
    }

    @Override // tb.ohb
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            this.video.stop();
        }
    }

    public abstract /* synthetic */ boolean updateBottomTag(M3CellBean m3CellBean, eif eifVar, boolean z);

    @Override // tb.ohb
    public abstract /* synthetic */ boolean updateComment(M3CellBean m3CellBean, boolean z);

    @Override // tb.ohb
    public abstract /* synthetic */ boolean updateComposite(M3CellBean m3CellBean, boolean z);

    public abstract /* synthetic */ boolean updateDiscount(M3CellBean m3CellBean, boolean z);

    @Override // tb.ohb
    public abstract /* synthetic */ void updateFeedback(M3CellBean m3CellBean, tqk tqkVar, TbSearchStyle tbSearchStyle, boolean z);

    public abstract /* synthetic */ boolean updateFlashSale(M3CellBean m3CellBean, boolean z);

    public abstract /* synthetic */ boolean updateIcons(M3CellBean m3CellBean, boolean z, boolean z2, mfe mfeVar, boolean z3);

    @Override // tb.ohb
    public abstract /* synthetic */ boolean updateInteractiveTag(M3CellBean m3CellBean, eif eifVar, boolean z);

    public void updateItemImage(M3CellBean m3CellBean, boolean z, TbSearchStyle tbSearchStyle) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9147410", new Object[]{this, m3CellBean, new Boolean(z), tbSearchStyle});
            return;
        }
        ckf.g(m3CellBean, "bean");
        this.imagePic.updateHotIcon(m3CellBean.getP4pIcon());
        this.imagePic.updateRightBottomP4pIcon(m3CellBean.getMoveP4pIconBottom(), m3CellBean.getP4pIconUrl(), m3CellBean.getP4pIconWidth(), m3CellBean.getP4pIconHeight(), m3CellBean.getP4pIconBottomLeft());
        this.imagePic.updateNewDate(m3CellBean.getNewDate());
        M3ImageView m3ImageView = this.imagePic;
        ykg leftScriptInfo = m3CellBean.getLeftScriptInfo();
        if (tbSearchStyle == null || !tbSearchStyle.isTb2024) {
            z2 = false;
        }
        m3ImageView.updateLeftScriptIcon(leftScriptInfo, z2);
    }

    public void updatePrice(M3CellBean m3CellBean, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea2d427", new Object[]{this, m3CellBean, new Boolean(z)});
            return;
        }
        ckf.g(m3CellBean, "bean");
        pwm priceInfo = m3CellBean.getPriceInfo();
        if (priceInfo == null || (str = priceInfo.b()) == null) {
            str = "";
        }
        setContentDescription(str);
    }

    @Override // tb.ohb
    public abstract /* synthetic */ boolean updateProperty(M3CellBean m3CellBean, boolean z);

    public abstract /* synthetic */ void updateShopInfo(M3CellBean m3CellBean, ruk rukVar, boolean z);

    @Override // tb.ohb
    public abstract /* synthetic */ boolean updateSingleRow(M3CellBean m3CellBean, wuk wukVar, boolean z);

    @Override // tb.ohb
    public abstract /* synthetic */ boolean updateSummaryTips(M3CellBean m3CellBean, boolean z);

    @Override // tb.ohb
    public abstract /* synthetic */ void updateTitle(M3CellBean m3CellBean, TbSearchStyle tbSearchStyle);

    public boolean updateVideo(M3CellBean m3CellBean, soc socVar, TbSearchStyle tbSearchStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("383c3a6b", new Object[]{this, m3CellBean, socVar, tbSearchStyle})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        ckf.g(socVar, DataReceiveMonitor.CB_LISTENER);
        if (!m3CellBean.getVideoAutoPlay()) {
            return false;
        }
        boolean update = this.video.update(m3CellBean, socVar, tbSearchStyle);
        if (update) {
            showItem(this.video, 0, 0, 0, 0);
        }
        return update;
    }
}
