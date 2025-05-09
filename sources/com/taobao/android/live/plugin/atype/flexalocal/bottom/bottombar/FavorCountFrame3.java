package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.utils.AccessibilityUtils;
import com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeManager;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.newstyle.utils.NewStyleUtils;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import tb.d1a;
import tb.d9m;
import tb.giv;
import tb.gnk;
import tb.hw0;
import tb.k0r;
import tb.lly;
import tb.nh4;
import tb.o3s;
import tb.q0h;
import tb.qvs;
import tb.s3c;
import tb.t2o;
import tb.to8;
import tb.uak;
import tb.uo8;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.xhv;
import tb.yqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FavorCountFrame3 extends BaseFrame implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long MAX_TIME_INTERVAL = 2000;
    private static final String TAG = "FavorCountFrame3";
    private boolean isFavFirstClick;
    private f mBubbleRect;
    private long mFavorCount;
    private TextView mFavorCountView;
    private FrameLayout mFavorLayout;
    private View mRootView;
    private ITaoLiveKtLikeManager mTaoLiveKtLikeManager;
    private final LinkedList<Long> mFavorTimeList = new LinkedList<>();
    private final TextWatcher watcher = new a();
    private final int mFavorEffectThreshold = qvs.z0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            } else {
                FavorCountFrame3.access$000(FavorCountFrame3.this);
            }
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
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            FavorCountFrame3.access$100(FavorCountFrame3.this, true);
            FavorCountFrame3.access$200(FavorCountFrame3.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public xhv invoke() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("c1e1c5fe", new Object[]{this});
            }
            if (FavorCountFrame3.access$300(FavorCountFrame3.this) == null || FavorCountFrame3.access$300(FavorCountFrame3.this).getLikeViewModel() == null) {
                return null;
            }
            FavorCountFrame3 favorCountFrame3 = FavorCountFrame3.this;
            FavorCountFrame3.access$400(favorCountFrame3, FavorCountFrame3.access$300(favorCountFrame3).getLikeViewModel().getShowLikeCount());
            FavorCountFrame3.this.mFrameContext.h().c(uyg.EVENT_KMP_LIKE_ADD_FAVOR, Long.valueOf(FavorCountFrame3.access$300(FavorCountFrame3.this).getLikeViewModel().getRemoteLikeDiff()), FavorCountFrame3.this.mFrameContext.C());
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f8364a;
        public int b;
        public int c;
        public int d;

        static {
            t2o.a(295698456);
        }

        public f() {
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ea845f58", new Object[]{this})).booleanValue();
            }
            if (this.b <= 0 || this.c <= 0) {
                return true;
            }
            return false;
        }

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    static {
        t2o.a(295698452);
        t2o.a(806355016);
    }

    public FavorCountFrame3(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ void access$000(FavorCountFrame3 favorCountFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330add34", new Object[]{favorCountFrame3});
        } else {
            favorCountFrame3.updateContentDescription();
        }
    }

    public static /* synthetic */ void access$100(FavorCountFrame3 favorCountFrame3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47c04e1", new Object[]{favorCountFrame3, new Boolean(z)});
        } else {
            favorCountFrame3.performClick(z);
        }
    }

    public static /* synthetic */ void access$200(FavorCountFrame3 favorCountFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ec9372", new Object[]{favorCountFrame3});
        } else {
            favorCountFrame3.animationFavor();
        }
    }

    public static /* synthetic */ ITaoLiveKtLikeManager access$300(FavorCountFrame3 favorCountFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtLikeManager) ipChange.ipc$dispatch("95413f27", new Object[]{favorCountFrame3});
        }
        return favorCountFrame3.mTaoLiveKtLikeManager;
    }

    public static /* synthetic */ void access$400(FavorCountFrame3 favorCountFrame3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46fb6314", new Object[]{favorCountFrame3, new Long(j)});
        } else {
            favorCountFrame3.updateFavorCount(j);
        }
    }

    private f getRect() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("962b292", new Object[]{this});
        }
        f fVar = new f(null);
        if (this.mLandscape) {
            str = k0r.O();
        } else {
            str = k0r.P();
        }
        int b2 = hw0.b(this.mContext, 60.0f) / 2;
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("-");
                int b3 = hw0.b(this.mContext, yqq.o(split[0])) + b2;
                int b4 = hw0.b(this.mContext, yqq.o(split[1])) + b2;
                int b5 = hw0.b(this.mContext, yqq.o(split[2])) + b2;
                int f2 = (int) (hw0.f() * yqq.j(split[3]));
                fVar.f8364a = b3;
                fVar.d = (hw0.f() - b5) - f2;
                fVar.b = (hw0.i() - b3) - b4;
                fVar.c = f2;
            }
        } catch (Exception e) {
            q0h.a("FavorCountFrame3", e.getMessage());
        }
        return fVar;
    }

    private void initComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb1a5fd4", new Object[]{this});
        } else if (d9m.f() == null) {
            o3s.b("FavorCountFrame3", "TaoLiveKtLikeManager kmp init fail");
        } else {
            ITaoLiveKtLikeManager likeManager = d9m.f().getLikeManager();
            this.mTaoLiveKtLikeManager = likeManager;
            likeManager.setLikeInputImpl(new TaoLiveKtLikeInputImpl(this.mFrameContext));
            this.mTaoLiveKtLikeManager.setLikeRemoteCountUpdateCallback(new c());
        }
    }

    public static /* synthetic */ Object ipc$super(FavorCountFrame3 favorCountFrame3, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode == 91531079) {
            super.onViewCreated((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/FavorCountFrame3");
        }
    }

    private void performClick(boolean z, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c870ec85", new Object[]{this, new Boolean(z), llyVar});
        } else if (v2s.o().u() != null && v2s.o().u().checkSessionValid()) {
            processClickLike(z, llyVar);
            uo8.f(this.mFrameContext, to8.FAVOR, 0L);
        } else if (v2s.o().u() != null) {
            v2s.o().u().a((Activity) this.mContext, null);
        }
    }

    private void removeWatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca24151f", new Object[]{this});
            return;
        }
        TextView textView = this.mFavorCountView;
        if (textView != null) {
            textView.removeTextChangedListener(this.watcher);
        }
    }

    private void showBubbleInMiddle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d7532a", new Object[]{this});
            return;
        }
        f fVar = this.mBubbleRect;
        if (fVar != null && !fVar.a()) {
            int i = this.mBubbleRect.f8364a;
            double random = Math.random();
            f fVar2 = this.mBubbleRect;
            this.mFrameContext.h().c(uyg.EVENT_CLICK_FAVOR_IN_MIDDLE, new PointF(i + ((int) (random * fVar2.b)), fVar2.d + ((int) (Math.random() * this.mBubbleRect.c))), observeUniqueIdentification());
        }
    }

    private void updateContentDescription() {
        String str;
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386fc4f3", new Object[]{this});
        } else if (this.mRootView != null) {
            if (this.mFavorCount <= 0 || (textView = this.mFavorCountView) == null || textView.getVisibility() != 0) {
                str = "";
            } else {
                str = "当前" + this.mFavorCount + "个爱心";
            }
            if (!TextUtils.isEmpty(str)) {
                str = str + ",";
            }
            this.mRootView.setContentDescription(str + "点赞");
            AccessibilityUtils.a(this.mRootView);
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "FavorCountFrame3";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl-bottom-favor";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_frame_favor_count3_flexalocal;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taolive.taolive.room.mediaplatform_addfavor"};
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
        this.mFrameContext.h().b(this);
        this.mFavorTimeList.clear();
        removeWatcher();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        this.mRootView.setVisibility(0);
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (videoInfo != null && gnk.a().f(tBLiveDataModel)) {
            yqq.n(videoInfo.officialLiveInfo.praiseCount, 0L);
        }
        initComponent();
        ITaoLiveKtLikeManager iTaoLiveKtLikeManager = this.mTaoLiveKtLikeManager;
        if (!(iTaoLiveKtLikeManager == null || iTaoLiveKtLikeManager.getLikeViewModel() == null)) {
            updateFavorCount(this.mTaoLiveKtLikeManager.getLikeViewModel().getShowLikeCount());
        }
        if (videoInfo != null) {
            View componentView = getComponentView();
            if (videoInfo.status == 1) {
                z = false;
            }
            componentView.setEnabled(z);
        }
        ViewProxy.setOnClickListener(getComponentView(), new b());
        this.mFrameContext.h().a(this);
        this.mFrameContext.z().c(uyg.INTERACTIVE_EVENT_BIZ_CENTER_NOTIFY, "Like", observeUniqueIdentification());
        this.mBubbleRect = getRect();
    }

    private void updateFavorCount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a51c43", new Object[]{this, new Long(j)});
            return;
        }
        this.mFavorCount = j;
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (!(tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null)) {
            if (gnk.a().f(this.mLiveDataModel)) {
                this.mLiveDataModel.mVideoInfo.officialLiveInfo.praiseCount = Long.toString(this.mFavorCount);
                this.mLiveDataModel.mVideoInfo.originalData.getJSONObject("officialLiveInfo").put("praiseCount", (Object) Long.valueOf(this.mFavorCount));
            } else {
                VideoInfo videoInfo = this.mLiveDataModel.mVideoInfo;
                long j2 = this.mFavorCount;
                videoInfo.praiseCount = j2;
                videoInfo.originalData.put("praiseCount", (Object) Long.valueOf(j2));
            }
        }
        TextView textView = this.mFavorCountView;
        if (textView != null) {
            long j3 = 0;
            if (j > 0) {
                textView.setVisibility(0);
                Object tag = this.mFavorCountView.getTag();
                if (tag != null) {
                    j3 = ((Long) tag).longValue();
                }
                if (j3 < j) {
                    this.mFavorCountView.setTag(Long.valueOf(j));
                    this.mFavorCountView.setText(uak.a(j));
                    return;
                }
                return;
            }
            textView.setVisibility(4);
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!"com.taolive.taolive.room.mediaplatform_addfavor".equals(str)) {
        } else {
            if (obj instanceof Boolean) {
                performClick(((Boolean) obj).booleanValue());
            } else if (obj instanceof Map) {
                Map map = (Map) obj;
                Object obj2 = map.get("callBack");
                lly llyVar = obj2 instanceof lly ? (lly) obj2 : null;
                Object obj3 = map.get("showDoubleClickFavorAnim");
                if (obj3 instanceof Boolean) {
                    z = ((Boolean) obj3).booleanValue();
                }
                performClick(z, llyVar);
            } else {
                performClick(false);
            }
        }
    }

    private void processClickLike(boolean z, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91064efc", new Object[]{this, new Boolean(z), llyVar});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null) {
            VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
            if (videoInfo != null) {
                if (z && k0r.o()) {
                    showBubbleInMiddle();
                }
                this.mFrameContext.h().c(uyg.EVENT_FAVOR_FRAME_SEND_FAVOR, videoInfo.topic, this.mFrameContext.C());
                this.mFrameContext.h().c(uyg.EVENT_PK_SEND_FAVOR, null, this.mFrameContext.C());
            }
            TextView textView = this.mFavorCountView;
            if (textView != null) {
                Object tag = textView.getTag();
                long longValue = tag != null ? ((Long) tag).longValue() : 0L;
                if (llyVar != null) {
                    llyVar.a(true, null);
                }
                updateFavorCount(longValue + 1);
            } else if (llyVar != null) {
                llyVar.a(false, null);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.mFavorTimeList.size() >= this.mFavorEffectThreshold) {
                this.mFavorTimeList.remove(0);
            }
            this.mFavorTimeList.add(Long.valueOf(currentTimeMillis));
            if (this.mFavorTimeList.size() >= this.mFavorEffectThreshold && currentTimeMillis - this.mFavorTimeList.get(0).longValue() < 2000) {
                HashMap hashMap = new HashMap();
                hashMap.put("source", "click");
                giv.f().m(this.mFrameContext, "likeAtmos", hashMap);
                this.mFrameContext.h().c(uyg.EVENT_FAVOR_EFFECT_SHOW, "recommend_atmosphere_1", observeUniqueIdentification());
                this.mFavorTimeList.clear();
            }
            if (!this.isFavFirstClick) {
                giv.f().h(this.mFrameContext, "taobaolive.client.detail.fvr");
                this.isFavFirstClick = true;
            }
            giv.h().c(1);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        TextView textView;
        TextView textView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        if (nh4.z()) {
            super.onViewCreated(view);
        }
        this.mRootView = view;
        view.setVisibility(8);
        this.mFavorCountView = (TextView) view.findViewById(R.id.taolive_favor_count);
        this.mFavorLayout = (FrameLayout) view.findViewById(R.id.taolive_favor_layout);
        TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.taolive_favor_img);
        tUrlImageView.setImageResource(R.drawable.taolive_icon_new_style_favor_flexalocal);
        NewStyleUtils.e(this.mContext, tUrlImageView);
        Context context = this.mContext;
        if (!(context == null || (textView2 = this.mFavorCountView) == null)) {
            textView2.setBackground(context.getResources().getDrawable(R.drawable.taolive_bottombar_new_style_favor_count_bg_flexalocal));
        }
        if (!(this.mContext == null || (textView = this.mFavorCountView) == null || !(textView.getBackground() instanceof GradientDrawable))) {
            GradientDrawable gradientDrawable = (GradientDrawable) this.mFavorCountView.getBackground().mutate();
            gradientDrawable.setColor(Color.parseColor("#FF000A"));
            gradientDrawable.setCornerRadius(hw0.b(this.mContext, 9.0f));
            this.mFavorCountView.setIncludeFontPadding(false);
            this.mFavorCountView.setTextSize(1, 9.0f);
            this.mFavorCountView.setMinHeight(hw0.b(this.mContext, 11.0f));
        }
        NewStyleUtils.b(this.mContext, this.mFavorLayout, NewStyleUtils.NewStyleType.LARGE);
        View view2 = this.mRootView;
        if (view2 != null) {
            view2.setContentDescription("点赞");
            AccessibilityUtils.a(this.mRootView);
        }
        this.mFavorCountView.addTextChangedListener(this.watcher);
        giv.h().a(1, view);
    }

    private void animationFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f6f2ca1", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.mFavorLayout, "scaleX", 1.0f, 1.4f, 1.0f), ObjectAnimator.ofFloat(this.mFavorLayout, "scaleY", 1.0f, 1.4f, 1.0f));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    private void performClick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdeaece6", new Object[]{this, new Boolean(z)});
        } else {
            performClick(z, null);
        }
    }
}
