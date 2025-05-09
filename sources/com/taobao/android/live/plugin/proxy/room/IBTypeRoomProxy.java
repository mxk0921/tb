package com.taobao.android.live.plugin.proxy.room;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.b0d;
import tb.cv1;
import tb.o7c;
import tb.t2o;
import tb.ux9;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IBTypeRoomProxy extends IBTypeProxy {
    public static final String KEY = "IBTypeRoomProxy";
    public static final String KEY_FRAME_CLASS_BOTTOM_CONTAINER_FRAME = "BottomContainerFrame";
    public static final String KEY_FRAME_CLASS_CONNECTION_FRAME_2 = "ConnectionFrame2";
    public static final String KEY_FRAME_CLASS_FAVOR_ANIM_FRAME_3 = "FavorAnimFrame3";
    public static final String KEY_FRAME_CLASS_MESSAGE_CARD_FRAME_3 = "MessageCardFrame3";
    public static final String KEY_FRAME_CLASS_NOTICE_FRAME_2 = "NoticeFrame2";
    public static final String KEY_FRAME_CLASS_QA_EXPLAIN_FRAME = "QAExplainFrame";
    public static final String KEY_FRAME_CLASS_RANK_FRAME = "RankFrame";
    public static final String KEY_FRAME_CLASS_REWARD_FRAME = "RewardFrame";
    public static final String KEY_FRAME_CLASS_REWARD_FREE_GIFT_FRAME = "RewardPanelFreeGiftFrame";
    public static final String KEY_FRAME_CLASS_REWARD_PANEL_FRAME = "RewardPanelFrame";
    public static final String KEY_FRAME_CLASS_SUBSCRIBE_CARD_FRAME_2 = "SubscribeCardFrame2";
    public static final String KEY_FRAME_CLASS_TOP_SELECT_COMMENT = "TopSelectCommentFrame";
    public static final String KEY_FRAME_CLASS_VIRTUAL_ANCHOR_SIGN_FRAME = "VirtualAnchorSignFrame";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static abstract class AbsFavorCountFrame extends BaseFrame {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355240);
        }

        public AbsFavorCountFrame(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(AbsFavorCountFrame absFavorCountFrame, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/room/IBTypeRoomProxy$AbsFavorCountFrame");
        }

        public abstract void updateFavorCount(long j);

        public AbsFavorCountFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
            super(context, z, tBLiveDataModel);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(Intent intent, zmj zmjVar);

        void b(TBLiveDataModel tBLiveDataModel, cv1 cv1Var);

        void c(TBLiveDataModel tBLiveDataModel, cv1 cv1Var, ux9 ux9Var);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        boolean a(Activity activity, String str);

        boolean b();

        boolean c();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
        void a(int i, NetResponse netResponse, boolean z);
    }

    void adjustBBConnectionVideoSize(Context context, ux9 ux9Var, String str);

    boolean checkFollowFromCache(String str);

    boolean checkFollowFromCache(String str, d dVar);

    BaseFrame createConnectionFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var, ViewStub viewStub);

    BaseFrame createDecelerationZoneFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var);

    AbsFavorCountFrame createFavorCountFrame(Context context, long j, String str, boolean z, ViewStub viewStub);

    BaseFrame createNonageFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var);

    BaseFrame createPrivateVipFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ViewStub viewStub);

    BaseFrame createRankFrame(Context context, ux9 ux9Var);

    BaseFrame createRightBackwardTipsFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var);

    BaseFrame createSubscribeCardFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, View view, ViewGroup viewGroup);

    o7c createTBFollowBusiness(b0d b0dVar);

    o7c createTBFollowGuangBusiness(b0d b0dVar);

    c createTBLiveFollowBusiness(String str, int i, String str2, d dVar);

    a getBackwardX();

    Class<? extends BaseFrame> getFrameClassMap(String str);

    b getNonageServiceX();

    void initBTypeOtherFrame(BaseFrame baseFrame, Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var);

    void updateFollow(String str, boolean z);
}
