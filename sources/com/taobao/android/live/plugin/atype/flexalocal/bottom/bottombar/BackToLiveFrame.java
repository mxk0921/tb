package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import tb.b0d;
import tb.f3c;
import tb.fkx;
import tb.giv;
import tb.hw0;
import tb.o3s;
import tb.t2o;
import tb.ux9;
import tb.x0u;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BackToLiveFrame extends BaseFrame implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_BACK_TO_LIVE = "com.taobao.taolive.room.backToLive";
    private static final String EVENT_REPLAY_BACK_TO_LIVE = "com.taobao.taolive.room.replay_backToLive";
    private static final String LIVE_ICON_URL = "https://img.alicdn.com/imgextra/i1/O1CN01VMlQ7m1vNKj6xUWCA_!!6000000006160-54-tps-64-64.apng";
    private static final String MULTIPLE_PLAY_ICON_URL = "https://gw.alicdn.com/imgextra/i1/O1CN01Sh0gBV1ZJk7xOpa0z_!!6000000003174-54-tps-48-48.apng";
    private static final String TAG = "BackToLiveFrame";
    private View mBackToLive;
    private AliUrlImageView mBackToLiveImg;
    private TextView mBackToLiveText;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private String mLiveId;
    private AliUrlImageView mMultiplePlayImg;
    private long mTimeShiftStart;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VideoInfo f8351a;

        public a(VideoInfo videoInfo) {
            this.f8351a = videoInfo;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            BackToLiveFrame.access$200(BackToLiveFrame.this);
            BackToLiveFrame.access$002(BackToLiveFrame.this, null);
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo != null && netBaseOutDo.getData() != null) {
                LiveDetailMessinfoResponseData liveDetailMessinfoResponseData = (LiveDetailMessinfoResponseData) fkx.f(fkx.i(netBaseOutDo.getData()), LiveDetailMessinfoResponseData.class);
                if (liveDetailMessinfoResponseData == null || TextUtils.isEmpty(liveDetailMessinfoResponseData.hasLive)) {
                    BackToLiveFrame.access$200(BackToLiveFrame.this);
                    BackToLiveFrame.access$002(BackToLiveFrame.this, null);
                    return;
                }
                BackToLiveFrame.access$002(BackToLiveFrame.this, liveDetailMessinfoResponseData.hasLive);
                BackToLiveFrame.access$100(BackToLiveFrame.this, this.f8351a);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            BackToLiveFrame.access$200(BackToLiveFrame.this);
            BackToLiveFrame.access$002(BackToLiveFrame.this, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(intValue);
                gradientDrawable.setCornerRadius(hw0.b(BackToLiveFrame.this.mContext, 10.0f));
                BackToLiveFrame.access$300(BackToLiveFrame.this).setBackground(gradientDrawable);
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (BackToLiveFrame.access$300(BackToLiveFrame.this) != null) {
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), -52429, -2146561767);
                ofObject.setDuration(300L);
                ofObject.addUpdateListener(new a());
                ofObject.start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            int measuredWidth = BackToLiveFrame.access$300(BackToLiveFrame.this).getMeasuredWidth();
            int measuredHeight = BackToLiveFrame.access$300(BackToLiveFrame.this).getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                int i = measuredWidth / measuredHeight;
                if (i < 2) {
                    BackToLiveFrame.access$400(BackToLiveFrame.this).setText("直播");
                    BackToLiveFrame.access$400(BackToLiveFrame.this).setTextSize(1, 10.0f);
                    BackToLiveFrame.access$500(BackToLiveFrame.this).setVisibility(8);
                } else if (i < 3) {
                    BackToLiveFrame.access$400(BackToLiveFrame.this).setText("回直播");
                    BackToLiveFrame.access$500(BackToLiveFrame.this).setVisibility(8);
                }
            }
            BackToLiveFrame.access$300(BackToLiveFrame.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    static {
        t2o.a(295698437);
    }

    public BackToLiveFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ String access$002(BackToLiveFrame backToLiveFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a0de5ce", new Object[]{backToLiveFrame, str});
        }
        backToLiveFrame.mLiveId = str;
        return str;
    }

    public static /* synthetic */ void access$100(BackToLiveFrame backToLiveFrame, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aded4826", new Object[]{backToLiveFrame, videoInfo});
        } else {
            backToLiveFrame.showBackLiveBtn(videoInfo);
        }
    }

    public static /* synthetic */ void access$200(BackToLiveFrame backToLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32c94c8", new Object[]{backToLiveFrame});
        } else {
            backToLiveFrame.hideBackLiveBtn();
        }
    }

    public static /* synthetic */ View access$300(BackToLiveFrame backToLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f67571cb", new Object[]{backToLiveFrame});
        }
        return backToLiveFrame.mBackToLive;
    }

    public static /* synthetic */ TextView access$400(BackToLiveFrame backToLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("e167893e", new Object[]{backToLiveFrame});
        }
        return backToLiveFrame.mBackToLiveText;
    }

    public static /* synthetic */ AliUrlImageView access$500(BackToLiveFrame backToLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUrlImageView) ipChange.ipc$dispatch("3d8e9aed", new Object[]{backToLiveFrame});
        }
        return backToLiveFrame.mBackToLiveImg;
    }

    private void backToLive() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e3d355", new Object[]{this});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && videoInfo.broadCaster != null) {
            String str = null;
            if ("2".equals(videoInfo.roomStatus)) {
                f3c h = this.mFrameContext.h();
                String str2 = this.mLiveId;
                ux9 ux9Var = this.mFrameContext;
                if (ux9Var != null) {
                    str = ux9Var.C();
                }
                h.c(EVENT_REPLAY_BACK_TO_LIVE, str2, str);
                if (giv.f() != null) {
                    giv.f().n(this.mFrameContext, "PlaybackToLive", new String[0]);
                    return;
                }
                return;
            }
            HashMap hashMap = new HashMap();
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                hashMap.put(z9u.KEY_ACCOUNT_ID, accountInfo.accountId);
            }
            hashMap.put("feed_id", videoInfo.liveId);
            hashMap.put("istimeshift", "1");
            hashMap.put("duration", (System.currentTimeMillis() - this.mTimeShiftStart) + "");
            if (!giv.c().b() && giv.f() != null) {
                hashMap.put("item_id", giv.f().i(this.mFrameContext));
            }
            hashMap.put("click_time", Long.toString(System.currentTimeMillis()));
            if (giv.f() != null) {
                giv.f().m(this.mFrameContext, "Gotolive", hashMap);
            }
            Context context = this.mContext;
            x0u.a(context, context.getResources().getText(R.string.taolive_timeplay_back_to_toast3_flexalocal));
            this.mFrameContext.h().c("com.taobao.taolive.room.backToLive", null, this.mFrameContext.C());
        }
    }

    private void hideBackLiveBtn() {
        AliUrlImageView aliUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a52854e", new Object[]{this});
        } else if (this.mBackToLive != null && (aliUrlImageView = this.mBackToLiveImg) != null && this.mBackToLiveText != null) {
            aliUrlImageView.setVisibility(8);
            this.mBackToLiveText.setVisibility(8);
            this.mBackToLive.setBackgroundColor(0);
        }
    }

    public static /* synthetic */ Object ipc$super(BackToLiveFrame backToLiveFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode == 91531079) {
            super.onViewCreated((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/BackToLiveFrame");
        }
    }

    public void checkTimePlayMode(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c5521cc", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && videoInfo.broadCaster != null) {
            if ("2".equals(videoInfo.roomStatus)) {
                ux9 ux9Var = this.mFrameContext;
                if (ux9Var != null && ux9Var.q() != null) {
                    this.mFrameContext.q().d(new a(videoInfo));
                    return;
                }
                return;
            }
            hideBackLiveBtn();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl-bottom-back-to-live";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_bottombar_back_to_live_layout_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.q() == null)) {
            this.mFrameContext.q().onDestroy();
        }
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            backToLive();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        AliUrlImageView aliUrlImageView = this.mMultiplePlayImg;
        if (aliUrlImageView != null) {
            aliUrlImageView.setImageUrl(MULTIPLE_PLAY_ICON_URL);
        }
        checkTimePlayMode(tBLiveDataModel);
        o3s.b("BackToLiveFrame", Constants.KEY_DATA_RECEIVED_TIME);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mBackToLive = view.findViewById(R.id.taolive_repaly_back_to_live_layout);
        this.mBackToLiveImg = (AliUrlImageView) view.findViewById(R.id.tblive_icon_back_to_live_img);
        this.mBackToLiveText = (TextView) view.findViewById(R.id.tblive_icon_back_to_live_text);
        AliUrlImageView aliUrlImageView = (AliUrlImageView) view.findViewById(R.id.tblive_icon_multiple_play_img);
        this.mMultiplePlayImg = aliUrlImageView;
        aliUrlImageView.setSkipAutoSize(true);
        ViewProxy.setOnClickListener(this.mBackToLive, this);
    }

    private void showBackLiveBtn(VideoInfo videoInfo) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90fc283a", new Object[]{this, videoInfo});
        } else if (videoInfo != null) {
            if (!(this.mBackToLive == null || this.mBackToLiveText == null || this.mBackToLiveImg == null)) {
                o3s.b("BackToLiveFrame", "showBackLiveBtn");
                this.mTimeShiftStart = System.currentTimeMillis();
                this.mBackToLive.setVisibility(0);
                this.mBackToLive.setBackgroundResource(R.drawable.taolive_replay_back_to_live_btn_flexalocal);
                this.mBackToLiveText.setVisibility(0);
                this.mBackToLiveImg.setVisibility(0);
                HashMap<String, String> hashMap = new HashMap<>();
                AccountInfo accountInfo = videoInfo.broadCaster;
                if (accountInfo != null) {
                    hashMap.put(z9u.KEY_ACCOUNT_ID, accountInfo.accountId);
                }
                hashMap.put("feed_id", videoInfo.liveId);
                hashMap.put("istimeshift", "1");
                if (!giv.c().b() && giv.f() != null) {
                    hashMap.put("item_id", giv.f().i(this.mFrameContext));
                }
                hashMap.put("show_time", Long.toString(System.currentTimeMillis()));
                if (giv.f() != null) {
                    giv.f().p(this.mFrameContext, "Show-Gotolive", hashMap);
                }
            }
            this.mHandler.postDelayed(new b(), 10000L);
            if ("2".equals(videoInfo.roomStatus)) {
                TextView textView = this.mBackToLiveText;
                if (textView != null) {
                    textView.setText(this.mContext.getString(R.string.taolive_replay_back_to_live_flexalocal));
                }
                AliUrlImageView aliUrlImageView = this.mBackToLiveImg;
                if (aliUrlImageView != null) {
                    aliUrlImageView.setSkipAutoSize(true);
                    this.mBackToLiveImg.setImageUrl(LIVE_ICON_URL);
                }
                if (giv.f() != null) {
                    giv.f().p(this.mFrameContext, "Show-PlaybackToLive", null);
                }
            } else {
                TextView textView2 = this.mBackToLiveText;
                if (textView2 != null) {
                    textView2.setText(this.mContext.getResources().getText(R.string.taolive_replay_back_to_live_flexalocal));
                }
                AliUrlImageView aliUrlImageView2 = this.mBackToLiveImg;
                if (aliUrlImageView2 != null) {
                    aliUrlImageView2.setSkipAutoSize(false);
                    this.mBackToLiveImg.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01gcSUph26gX0bOH03L_!!6000000007691-2-tps-64-64.png");
                }
            }
            if (this.mBackToLiveText != null && (view = this.mBackToLive) != null && this.mBackToLiveImg != null) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new c());
            }
        }
    }
}
