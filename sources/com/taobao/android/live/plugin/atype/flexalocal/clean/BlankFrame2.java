package com.taobao.android.live.plugin.atype.flexalocal.clean;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.ReplayPlayFrame;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.czd;
import tb.d9m;
import tb.dzd;
import tb.f3c;
import tb.fkx;
import tb.giv;
import tb.hw0;
import tb.nh4;
import tb.o3s;
import tb.rbt;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.to8;
import tb.uo8;
import tb.ux9;
import tb.uyg;
import tb.w2s;
import tb.yga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BlankFrame2 extends BaseFrame implements ViewPager.OnPageChangeListener, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TBLiveDataModel liveDataModel;
    private View mBottomContainer;
    private boolean mIsSwipeClearScreen;
    private TUrlImageView mIvGoods;
    private boolean needHideGoodsIcon = false;
    private View playIconView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                BlankFrame2.access$000(BlankFrame2.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            HashMap hashMap = new HashMap();
            if (BlankFrame2.access$100(BlankFrame2.this)) {
                str = "slide";
            } else {
                str = "click";
            }
            hashMap.put("interact_type", str);
            giv.f().m(BlankFrame2.this.mFrameContext, "ClearScreen_Goodslist", hashMap);
            uo8.f(BlankFrame2.this.mFrameContext, to8.GOODS_IN, 0L);
            HashMap hashMap2 = new HashMap();
            if (BlankFrame2.access$100(BlankFrame2.this)) {
                str2 = "clearscreen_type_slide";
            } else {
                str2 = "clearscreen_type_click";
            }
            hashMap2.put("glopenfrom", str2);
            f3c h = BlankFrame2.this.mFrameContext.h();
            ux9 ux9Var = BlankFrame2.this.mFrameContext;
            h.c(uyg.EVENT_SHOW_GOODSPACKAGE, hashMap2, ux9Var == null ? null : ux9Var.C());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/clean/BlankFrame2$3");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (BlankFrame2.access$200(BlankFrame2.this) != null) {
                BlankFrame2.access$200(BlankFrame2.this).setVisibility(4);
            }
        }
    }

    static {
        t2o.a(295698561);
        t2o.a(806355016);
    }

    public BlankFrame2(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ void access$000(BlankFrame2 blankFrame2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edad1c83", new Object[]{blankFrame2});
        } else {
            blankFrame2.exitClearScreen();
        }
    }

    public static /* synthetic */ boolean access$100(BlankFrame2 blankFrame2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81e15a6", new Object[]{blankFrame2})).booleanValue();
        }
        return blankFrame2.mIsSwipeClearScreen;
    }

    public static /* synthetic */ View access$200(BlankFrame2 blankFrame2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4419d8c3", new Object[]{blankFrame2});
        }
        return blankFrame2.playIconView;
    }

    private boolean enableHideGoodsIcon() {
        TBLiveDataModel tBLiveDataModel;
        VideoInfo videoInfo;
        VideoInfo.CommonGrayAbConfig commonGrayAbConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bf20095", new Object[]{this})).booleanValue();
        }
        if (!nh4.T() || (tBLiveDataModel = this.liveDataModel) == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || (commonGrayAbConfig = videoInfo.commonGrayAbConfig) == null || !"1".equals(commonGrayAbConfig.enableCleanScreenHideGoodsIcon)) {
            return false;
        }
        return true;
    }

    private void exitClearScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1214e422", new Object[]{this});
            return;
        }
        f3c h = this.mFrameContext.h();
        Boolean bool = Boolean.FALSE;
        ux9 ux9Var = this.mFrameContext;
        h.c(uyg.EVENT_CLEAR_SCREEN_NEW, bool, ux9Var == null ? null : ux9Var.C());
    }

    private void initPlayIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c69f904", new Object[]{this});
            return;
        }
        ReplayPlayFrame replayPlayFrame = new ReplayPlayFrame(this.mContext, this.mFrameContext);
        replayPlayFrame.createView((ViewStub) findViewById(R.id.blank_play_stub));
        this.playIconView = replayPlayFrame.getComponentView();
        addComponent(replayPlayFrame);
    }

    public static /* synthetic */ Object ipc$super(BlankFrame2 blankFrame2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -340027132:
                super.show();
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/clean/BlankFrame2");
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "BlankFrame2";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_room_blank_frame2_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        View view = this.mContainer;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void hidePlayIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("868cb636", new Object[]{this});
            return;
        }
        View view = this.playIconView;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(250L);
            ofFloat.start();
            ofFloat.addListener(new c());
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean lazyInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4de9efe", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.goods_list_showing", uyg.EVENT_CLEAR_SCREEN_AND_HIDE_GOODS_ICON};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        sjr.g().b(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.liveDataModel = tBLiveDataModel;
        sjr.g().a(this);
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.goods_list_showing".equals(str)) {
            if ((obj instanceof Boolean) && !((Boolean) obj).booleanValue()) {
                exitClearScreen();
            }
        } else if (uyg.EVENT_CLEAR_SCREEN_AND_HIDE_GOODS_ICON.equals(str) && (obj instanceof Boolean)) {
            TUrlImageView tUrlImageView = this.mIvGoods;
            if (tUrlImageView != null) {
                if (((Boolean) obj).booleanValue()) {
                    i = 4;
                } else {
                    i = 0;
                }
                tUrlImageView.setVisibility(i);
            }
            View view = this.playIconView;
            if (view != null) {
                if (((Boolean) obj).booleanValue()) {
                    i2 = 4;
                }
                view.setVisibility(i2);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.mBottomContainer;
        if (view != null) {
            if (i == 0) {
                view.setVisibility(0);
                handleGoodsIcon();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mBottomContainer, "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(250L);
                ofFloat.start();
                return;
            }
            view.setVisibility(8);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        String str;
        ux9 ux9Var;
        ATaoLiveOpenEntity A;
        czd czdVar;
        Float l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        if (nh4.z()) {
            super.onViewCreated(view);
        }
        o3s.b("BlankFrame2", "onViewCreated");
        this.mBottomContainer = view.findViewById(R.id.blank_container);
        View findViewById = findViewById(R.id.taolive_clear_screen_exit);
        ViewProxy.setOnClickListener(findViewById, new a());
        ((TUrlImageView) findViewById(R.id.taolive_clear_screen_exit_icon)).setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01wRRQfg1WnYv2lpzyZ_!!6000000002833-2-tps-48-48.png");
        findViewById.setVisibility(8);
        this.mIvGoods = (TUrlImageView) findViewById(R.id.taolive_clear_screen_goods);
        JSONObject d = fkx.d(yga.l0());
        if (d != null) {
            str = d.getString("static");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mIvGoods.getLayoutParams();
            marginLayoutParams.height = w2s.c(this.mContext, 50.0f);
            marginLayoutParams.width = w2s.c(this.mContext, 53.0f);
            this.mIvGoods.setLayoutParams(marginLayoutParams);
        } else {
            str = "https://img.alicdn.com/imgextra/i2/O1CN0195JhVE1W58UwuNDbG_!!6000000002736-2-tps-108-108.png";
        }
        this.mIvGoods.setImageUrl(str);
        if (!(giv.c().b() || (ux9Var = this.mFrameContext) == null || (A = ux9Var.A()) == null || (czdVar = A.uiCompontent) == null || ((rbt) czdVar).b() == null)) {
            dzd b2 = ((rbt) A.uiCompontent).b();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mIvGoods.getLayoutParams();
            if (b2 != null && (l = b2.l()) != null && l.floatValue() > 0.0f && l.floatValue() <= 500.0f) {
                layoutParams.bottomMargin = ((int) l.floatValue()) - 32;
            }
        }
        this.mIvGoods.setOnClickListener(new b());
        ((RelativeLayout.LayoutParams) findViewById.getLayoutParams()).addRule(9);
        ((RelativeLayout.LayoutParams) findViewById.getLayoutParams()).removeRule(11);
        ((RelativeLayout.LayoutParams) findViewById.getLayoutParams()).leftMargin = hw0.b(this.mContext, 12.0f);
        ((RelativeLayout.LayoutParams) this.mIvGoods.getLayoutParams()).addRule(11);
        ((RelativeLayout.LayoutParams) this.mIvGoods.getLayoutParams()).removeRule(9);
        ((RelativeLayout.LayoutParams) this.mIvGoods.getLayoutParams()).rightMargin = hw0.b(this.mContext, 4.0f);
        if (nh4.w0(this.mLiveDataModel)) {
            initPlayIcon();
        }
    }

    public void setNeedHideGoodsIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77f1bbb8", new Object[]{this, new Boolean(z)});
        } else {
            this.needHideGoodsIcon = z;
        }
    }

    public void setSwipeClearScreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976ba5cc", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsSwipeClearScreen = z;
        }
    }

    public void showPlayIcon() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b3f371", new Object[]{this});
            return;
        }
        View view = this.playIconView;
        if (view != null) {
            view.setAlpha(1.0f);
            View view2 = this.playIconView;
            if (this.needHideGoodsIcon) {
                i = 4;
            }
            view2.setVisibility(i);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        inflateViewOnNeed();
        if (this.mContainer != null) {
            o3s.b("BlankFrame2", "show");
            if (nh4.w0(this.mLiveDataModel)) {
                showPlayIcon();
            }
            View view = this.mContainer;
            if (view != null) {
                view.setVisibility(0);
            }
            handleGoodsIcon();
            View view2 = this.mBottomContainer;
            if (view2 != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(250L);
                ofFloat.start();
            }
        }
    }

    private void handleGoodsIcon() {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be4924ae", new Object[]{this});
        } else if (this.mIvGoods != null) {
            if (enableHideGoodsIcon() && d9m.n() != null) {
                Object gLConfig = d9m.n().getGLConfig(this.mFrameContext, "glItemNum");
                if ((gLConfig instanceof Integer) && ((Integer) gLConfig).intValue() == 0) {
                    this.needHideGoodsIcon = true;
                }
            }
            TUrlImageView tUrlImageView = this.mIvGoods;
            if (this.needHideGoodsIcon) {
                i = 4;
            }
            tUrlImageView.setVisibility(i);
            HashMap<String, String> hashMap = new HashMap<>();
            if (this.mIsSwipeClearScreen) {
                str = "slide";
            } else {
                str = "click";
            }
            hashMap.put("interact_type", str);
            giv.f().p(this.mFrameContext, "ClearScreen_Goodslist", hashMap);
        }
    }
}
