package com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupView;
import java.util.HashMap;
import tb.kbc;
import tb.kkr;
import tb.nw0;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.xea;
import tb.zga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ItemGroupPopupView extends BasePopupView implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ItemGroupView mItemGroupView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ItemGroupView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e155e360", new Object[]{this});
            } else {
                ItemGroupPopupView.this.destroyWithAnimation();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            ItemGroupPopupView.access$000(ItemGroupPopupView.this).destroy();
            ItemGroupPopupView.access$100(ItemGroupPopupView.this).removeView(ItemGroupPopupView.access$000(ItemGroupPopupView.this));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    static {
        t2o.a(295699296);
        t2o.a(806355016);
    }

    public ItemGroupPopupView(xea xeaVar, ViewGroup viewGroup) {
        super(xeaVar, viewGroup);
        if (zga.b()) {
            sjr.g().a(this);
        }
    }

    public static /* synthetic */ ItemGroupView access$000(ItemGroupPopupView itemGroupPopupView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemGroupView) ipChange.ipc$dispatch("580436e1", new Object[]{itemGroupPopupView});
        }
        return itemGroupPopupView.mItemGroupView;
    }

    public static /* synthetic */ ViewGroup access$100(ItemGroupPopupView itemGroupPopupView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cf66443a", new Object[]{itemGroupPopupView});
        }
        return itemGroupPopupView.mViewGroup;
    }

    public static /* synthetic */ Object ipc$super(ItemGroupPopupView itemGroupPopupView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775111991) {
            super.hide();
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/itemgroup/ItemGroupPopupView");
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "ItemGroupPopupView";
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mItemGroupView.destroy();
        this.mViewGroup.removeView(this.mItemGroupView);
        if (zga.b()) {
            sjr.g().b(this);
        }
    }

    public void destroyWithAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2628020b", new Object[]{this});
            return;
        }
        Animation createTranslationOutAnimation = createTranslationOutAnimation();
        createTranslationOutAnimation.setAnimationListener(new b());
        this.mItemGroupView.startAnimation(createTranslationOutAnimation);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            super.hide();
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.live.search.refresh.list.inner"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return xea.E(((BasePopupView) this).mGoodLiveContext);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView
    public View onCreateContentView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a25b4d4b", new Object[]{this, viewGroup});
        }
        ItemGroupView itemGroupView = new ItemGroupView(((BasePopupView) this).mGoodLiveContext, false);
        this.mItemGroupView = itemGroupView;
        itemGroupView.setCloseHandler(new a());
        viewGroup.addView(this.mItemGroupView, new FrameLayout.LayoutParams(-1, -1));
        return this.mItemGroupView;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView
    public FrameLayout.LayoutParams onCreateLayoutParams(View view, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("46bd761c", new Object[]{this, view, displayMetrics});
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams.gravity = 85;
        xea xeaVar = ((BasePopupView) this).mGoodLiveContext;
        layoutParams.width = xeaVar.l.k;
        int e = (int) (nw0.e(xeaVar.O()) * 0.725f);
        layoutParams.height = e;
        if (e <= 0 || nw0.i(((BasePopupView) this).mGoodLiveContext.i())) {
            layoutParams.height = (int) (nw0.g() * 0.76f);
        }
        return layoutParams;
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        ItemGroupView itemGroupView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        str.hashCode();
        if (str.equals("com.taobao.taolive.live.search.refresh.list.inner") && (itemGroupView = this.mItemGroupView) != null && itemGroupView.getAdapter() != null) {
            this.mItemGroupView.getAdapter().notifyDataSetChanged();
        }
    }

    public void setPageInfo(kbc kbcVar, ItemGroupPageInfo itemGroupPageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("473d0a6d", new Object[]{this, kbcVar, itemGroupPageInfo});
        } else {
            this.mItemGroupView.setPageInfo(kbcVar, itemGroupPageInfo);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        this.mItemGroupView.show();
        this.mItemGroupView.startAnimation(createTranslationInAnimation());
        ItemGroupPageInfo pageInfo = this.mItemGroupView.getPageInfo();
        if (pageInfo != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            if (!TextUtils.isEmpty(pageInfo.id)) {
                hashMap.put("aggregation_id", pageInfo.id);
            }
            if (!TextUtils.isEmpty(pageInfo.type)) {
                hashMap.put("aggregation_type", pageInfo.type);
            }
            if (!TextUtils.isEmpty(pageInfo.source)) {
                hashMap.put("aggregation_source", pageInfo.source);
            }
            kkr.i().o().b("LiveDiscountItemList", hashMap);
        }
    }
}
