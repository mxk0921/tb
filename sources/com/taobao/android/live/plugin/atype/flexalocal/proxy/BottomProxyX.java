package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BackToLiveFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BottomBarFrame3;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BottomInputFrameKMP;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.DoubleClickFavFrame3;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.FavorCountFrame3;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.MoreFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.MoreFrame2;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.ReplayPlayFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.ReplayRateFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.ShareFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.highlightbottombar.HighlightBottomBarFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.replaybottombar.ReplayBottomBarFrame;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.c7m;
import tb.ejp;
import tb.pcc;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BottomProxyX implements IBottomProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Class<? extends BaseFrame>> frameClassMap = new HashMap<String, Class<? extends BaseFrame>>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.proxy.BottomProxyX.1
        {
            put(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_BAR_FRAME_3, BottomBarFrame3.class);
            put(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_BAR_REPLAY_FRAME, ReplayBottomBarFrame.class);
            put(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_MORE_FRAME_2, MoreFrame2.class);
            put(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_PLAY_FRAME, ReplayPlayFrame.class);
            put(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_BACK_TO_LIVE_FRAME, BackToLiveFrame.class);
            put(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_INPUT_FRAME, BottomInputFrameKMP.class);
            put(IBottomProxy.KEY_FRAME_CLASS_DOUBLE_CLICK_FAV_FRAME_3, DoubleClickFavFrame3.class);
            put(IBottomProxy.KEY_FRAME_CLASS_FAVOR_COUNT_FRAME_3, FavorCountFrame3.class);
            put(IBottomProxy.KEY_FRAME_CLASS_GOODS_ICON_FRAME, GoodsIconFrame.class);
            put(IBottomProxy.KEY_FRAME_CLASS_MORE_FRAME, MoreFrame.class);
            put(IBottomProxy.KEY_FRAME_CLASS_SHARE_FRAME, ShareFrame.class);
            put(IBottomProxy.KEY_FRAME_CLASS_REPLAY_RATE_FRAME, ReplayRateFrame.class);
        }
    };

    static {
        t2o.a(295699598);
        t2o.a(806355127);
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public BaseFrame createBottomBarFrame3(Context context, ux9 ux9Var, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("732b63a7", new Object[]{this, context, ux9Var, viewStub});
        }
        BottomBarFrame3 bottomBarFrame3 = new BottomBarFrame3(context, ux9Var);
        bottomBarFrame3.createView(viewStub);
        return bottomBarFrame3;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public BaseFrame createHighlightBottomBarFrame(Context context, ux9 ux9Var, ViewStub viewStub, pcc pccVar, JSONObject jSONObject, c7m c7mVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("b657161e", new Object[]{this, context, ux9Var, viewStub, pccVar, jSONObject, c7mVar, view});
        }
        HighlightBottomBarFrame highlightBottomBarFrame = new HighlightBottomBarFrame(context, ux9Var, pccVar, jSONObject, c7mVar, view);
        highlightBottomBarFrame.createView(viewStub);
        return highlightBottomBarFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public BaseFrame createReplayBottomBarFrame(Context context, ux9 ux9Var, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("2ff1bb1d", new Object[]{this, context, ux9Var, viewStub});
        }
        ReplayBottomBarFrame replayBottomBarFrame = new ReplayBottomBarFrame(context, ux9Var);
        replayBottomBarFrame.createView(viewStub);
        return replayBottomBarFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public IBottomProxy.a createShareFission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBottomProxy.a) ipChange.ipc$dispatch("850dd7c0", new Object[]{this});
        }
        return new ejp();
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public int getBottomBarBottomDP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffdab543", new Object[]{this})).intValue();
        }
        return BottomBarFrame3.sBottomBarBottomDP;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public int getBottomBarLeftDP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c29ad29f", new Object[]{this})).intValue();
        }
        return BottomBarFrame3.sBottomBarLeftDP;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public Class<? extends BaseFrame> getFrameClassMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3ad7fa99", new Object[]{this, str});
        }
        return this.frameClassMap.get(str);
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public Map<String, Integer> getIdMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5f99e47", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IBottomProxy.R_ID_TAOLIVE_BOTTOM_BAR_WARPPER, Integer.valueOf(R.id.taolive_bottom_bar_wrapper));
        hashMap.put(IBottomProxy.R_ID_TAOLIVE_REWARD_X_CARD_FRAME, Integer.valueOf(R.id.taolive_reward_x_card_frame));
        hashMap.put(IBottomProxy.R_ID_TAOLIVE_REWARD_X_ICON, Integer.valueOf(R.id.layout_taolive_reward));
        return hashMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public String getRewardGuideResponseDataActionOpenRewardPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b96a3a66", new Object[]{this});
        }
        return "openRewardPanel";
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public String getShareFissionLiveShareActionInfoParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81eaf378", new Object[]{this});
        }
        return ejp.LIVE_SHARE_ACTION_INFO_PARAMS;
    }
}
