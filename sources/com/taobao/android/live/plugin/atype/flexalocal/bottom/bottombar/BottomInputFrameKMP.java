package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.utils.AccessibilityUtils;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.ui.newstyle.utils.NewStyleUtils;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import java.util.HashMap;
import java.util.Map;
import tb.b0d;
import tb.bl9;
import tb.cpr;
import tb.d9m;
import tb.fkx;
import tb.giv;
import tb.kj2;
import tb.s3c;
import tb.t2o;
import tb.ux9;
import tb.uyg;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BottomInputFrameKMP extends BaseFrame implements s3c, View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CLOSE_COMMENTS = 1;
    private static final String EVENT_REPLAY_BACK_TO_LIVE = "com.taobao.taolive.room.replay_backToLive";
    private static final String ICON_URL = "https://img.alicdn.com/tfs/TB1tRmcyHr1gK0jSZR0XXbP8XXa-48-48.png";
    private View mBackToLive;
    private AliUrlImageView mBackToLiveImg;
    private TextView mBackToLiveText;
    private TextView mChatView;
    private int mCommentStatus;
    private String mLiveId;
    private final cpr.b mMessageListener = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements cpr.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.gtc
        public void onMessageReceived(int i, Object obj) {
            JSONObject d;
            BottomInputFrameKMP bottomInputFrameKMP;
            TBLiveDataModel tBLiveDataModel;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            } else if (i == 1072 && (obj instanceof String) && (d = fkx.d(String.valueOf(obj))) != null && (tBLiveDataModel = (bottomInputFrameKMP = BottomInputFrameKMP.this).mLiveDataModel) != null && tBLiveDataModel.mVideoInfo != null) {
                BottomInputFrameKMP.access$002(bottomInputFrameKMP, d.getIntValue("switchStatus"));
                BottomInputFrameKMP.access$100(BottomInputFrameKMP.this);
                BottomInputFrameKMP bottomInputFrameKMP2 = BottomInputFrameKMP.this;
                bottomInputFrameKMP2.mLiveDataModel.mVideoInfo.commentSwitchStatus = BottomInputFrameKMP.access$000(bottomInputFrameKMP2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(BottomInputFrameKMP bottomInputFrameKMP) {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/BottomInputFrameKMP$2");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1072) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VideoInfo f8359a;

        public c(VideoInfo videoInfo) {
            this.f8359a = videoInfo;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            BottomInputFrameKMP.access$400(BottomInputFrameKMP.this);
            BottomInputFrameKMP.access$202(BottomInputFrameKMP.this, null);
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo != null && netBaseOutDo.getData() != null) {
                LiveDetailMessinfoResponseData liveDetailMessinfoResponseData = (LiveDetailMessinfoResponseData) fkx.f(fkx.i(netBaseOutDo.getData()), LiveDetailMessinfoResponseData.class);
                if (liveDetailMessinfoResponseData == null || TextUtils.isEmpty(liveDetailMessinfoResponseData.hasLive)) {
                    BottomInputFrameKMP.access$400(BottomInputFrameKMP.this);
                    BottomInputFrameKMP.access$202(BottomInputFrameKMP.this, null);
                    return;
                }
                BottomInputFrameKMP.access$202(BottomInputFrameKMP.this, liveDetailMessinfoResponseData.hasLive);
                BottomInputFrameKMP.access$300(BottomInputFrameKMP.this, this.f8359a);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            BottomInputFrameKMP.access$400(BottomInputFrameKMP.this);
            BottomInputFrameKMP.access$202(BottomInputFrameKMP.this, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            int measuredWidth = BottomInputFrameKMP.access$500(BottomInputFrameKMP.this).getMeasuredWidth();
            int measuredHeight = BottomInputFrameKMP.access$500(BottomInputFrameKMP.this).getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                int i = measuredWidth / measuredHeight;
                if (i < 2) {
                    BottomInputFrameKMP.access$600(BottomInputFrameKMP.this).setText("直播");
                    BottomInputFrameKMP.access$600(BottomInputFrameKMP.this).setTextSize(1, 10.0f);
                    BottomInputFrameKMP.access$700(BottomInputFrameKMP.this).setVisibility(8);
                } else if (i < 3) {
                    BottomInputFrameKMP.access$600(BottomInputFrameKMP.this).setText("回直播");
                    BottomInputFrameKMP.access$700(BottomInputFrameKMP.this).setVisibility(8);
                }
            }
            BottomInputFrameKMP.access$500(BottomInputFrameKMP.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    static {
        t2o.a(295698446);
        t2o.a(806355016);
    }

    public BottomInputFrameKMP(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ int access$000(BottomInputFrameKMP bottomInputFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19eb34b8", new Object[]{bottomInputFrameKMP})).intValue();
        }
        return bottomInputFrameKMP.mCommentStatus;
    }

    public static /* synthetic */ int access$002(BottomInputFrameKMP bottomInputFrameKMP, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21c8f58f", new Object[]{bottomInputFrameKMP, new Integer(i)})).intValue();
        }
        bottomInputFrameKMP.mCommentStatus = i;
        return i;
    }

    public static /* synthetic */ void access$100(BottomInputFrameKMP bottomInputFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff969146", new Object[]{bottomInputFrameKMP});
        } else {
            bottomInputFrameKMP.setDefaultInputHint();
        }
    }

    public static /* synthetic */ String access$202(BottomInputFrameKMP bottomInputFrameKMP, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97400c2d", new Object[]{bottomInputFrameKMP, str});
        }
        bottomInputFrameKMP.mLiveId = str;
        return str;
    }

    public static /* synthetic */ void access$300(BottomInputFrameKMP bottomInputFrameKMP, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4651f85", new Object[]{bottomInputFrameKMP, videoInfo});
        } else {
            bottomInputFrameKMP.showBackLiveBtn(videoInfo);
        }
    }

    public static /* synthetic */ void access$400(BottomInputFrameKMP bottomInputFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b098a6c9", new Object[]{bottomInputFrameKMP});
        } else {
            bottomInputFrameKMP.hideBackLiveBtn();
        }
    }

    public static /* synthetic */ View access$500(BottomInputFrameKMP bottomInputFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("28281d0c", new Object[]{bottomInputFrameKMP});
        }
        return bottomInputFrameKMP.mBackToLive;
    }

    public static /* synthetic */ TextView access$600(BottomInputFrameKMP bottomInputFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("56d8173f", new Object[]{bottomInputFrameKMP});
        }
        return bottomInputFrameKMP.mBackToLiveText;
    }

    public static /* synthetic */ AliUrlImageView access$700(BottomInputFrameKMP bottomInputFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUrlImageView) ipChange.ipc$dispatch("40d0422e", new Object[]{bottomInputFrameKMP});
        }
        return bottomInputFrameKMP.mBackToLiveImg;
    }

    private void backToLive() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e3d355", new Object[]{this});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && videoInfo.broadCaster != null && "2".equals(videoInfo.roomStatus)) {
            this.mFrameContext.h().c(EVENT_REPLAY_BACK_TO_LIVE, this.mLiveId, observeUniqueIdentification());
            if (giv.f() != null) {
                giv.f().n(this.mFrameContext, "PlaybackToLive", new String[0]);
            }
        }
    }

    private void checkRoomStatus(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d783b55", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && videoInfo.broadCaster != null) {
            if ("2".equals(videoInfo.roomStatus)) {
                ux9 ux9Var = this.mFrameContext;
                if (ux9Var != null && ux9Var.q() != null) {
                    this.mFrameContext.q().d(new c(videoInfo));
                    return;
                }
                return;
            }
            hideBackLiveBtn();
        }
    }

    private void hideBackLiveBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a52854e", new Object[]{this});
            return;
        }
        TextView textView = this.mChatView;
        if (textView != null) {
            textView.setVisibility(0);
        }
        View view = this.mBackToLive;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static /* synthetic */ Object ipc$super(BottomInputFrameKMP bottomInputFrameKMP, String str, Object... objArr) {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/BottomInputFrameKMP");
        }
    }

    private void setHint(String str) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5062bda", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (textView = this.mChatView) != null) {
            textView.setText(str);
        }
    }

    private void showInputMethod(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab00bf50", new Object[]{this, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        this.mFrameContext.h().c(uyg.EVENT_INPUT_SHOW, map, observeUniqueIdentification());
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "BottomInputFrameKMP";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "commentInput";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_bottombar_input_layout_kmp_flexalocal;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{kj2.c};
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
        this.mFrameContext.t().a(this.mMessageListener);
        this.mFrameContext.h().b(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IBTypeRoomProxy.b nonageServiceX;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.j() == null || !this.mFrameContext.j().d())) {
            this.mFrameContext.h().c(uyg.e, "assembly", observeUniqueIdentification());
        }
        if (view.getId() == R.id.taolive_chat_msg_btn) {
            if (!(!bl9.g().b() || d9m.e() == null || d9m.e().getNonageServiceX() == null || (nonageServiceX = d9m.e().getNonageServiceX()) == null)) {
                Context context = this.mContext;
                if ((context instanceof Activity) && nonageServiceX.a((Activity) context, "评论")) {
                    return;
                }
            }
            showInputMethod(null);
        } else if (view.getId() == R.id.taolive_timeplay_back_to_live) {
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
        this.mFrameContext.h().a(this);
        this.mFrameContext.t().l(this.mMessageListener, new b(this));
        checkRoomStatus(tBLiveDataModel);
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (kj2.c.equals(str)) {
            if (obj instanceof HashMap) {
                hashMap = (HashMap) obj;
            } else {
                hashMap = null;
            }
            showInputMethod(hashMap);
        }
    }

    private void setDefaultInputHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90a5039", new Object[]{this});
        } else if (this.mCommentStatus == 1) {
            setHint("评论已关闭");
        } else {
            setHint(this.mContext.getResources().getString(R.string.taolive_liveroom_new_style_chat_msg_btn_text_flexalocal));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        TextView textView = (TextView) view.findViewById(R.id.taolive_chat_msg_btn);
        this.mChatView = textView;
        textView.setOnClickListener(this);
        TextView textView2 = this.mChatView;
        textView2.setContentDescription(((Object) this.mChatView.getText()) + "，");
        this.mChatView.setTextSize(1, 13.0f);
        NewStyleUtils.b(this.mContext, this.mChatView, NewStyleUtils.NewStyleType.LARGE);
        AccessibilityUtils.b(this.mChatView);
        this.mBackToLive = view.findViewById(R.id.taolive_timeplay_back_to_live);
        this.mBackToLiveImg = (AliUrlImageView) view.findViewById(R.id.tblive_icon_back_to_live_img);
        this.mBackToLiveText = (TextView) view.findViewById(R.id.tblive_icon_back_to_live_text);
        this.mBackToLive.setVisibility(8);
        ViewProxy.setOnClickListener(this.mBackToLive, this);
    }

    private void showBackLiveBtn(VideoInfo videoInfo) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90fc283a", new Object[]{this, videoInfo});
        } else if (videoInfo != null) {
            TextView textView = this.mChatView;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view2 = this.mBackToLive;
            if (!(view2 == null || view2.getVisibility() == 0)) {
                this.mBackToLive.setVisibility(0);
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
            if ("2".equals(videoInfo.roomStatus)) {
                this.mBackToLiveText.setText(this.mContext.getResources().getText(R.string.taolive_timeplay_back_to_live_1_new_flexalocal));
                this.mBackToLiveImg.setSkipAutoSize(true);
                this.mBackToLiveImg.setImageUrl(ICON_URL);
                if (giv.f() != null) {
                    giv.f().p(this.mFrameContext, "Show-PlaybackToLive", null);
                }
            }
            if (this.mBackToLiveText != null && (view = this.mBackToLive) != null && this.mBackToLiveImg != null) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new d());
            }
        }
    }
}
