package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenReplayFrame2;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.android.live.plugin.atype.flexalocal.interactcenter.InteractBizCenterFrame;
import com.taobao.android.live.plugin.atype.flexalocal.push.model.LiveBizInfo;
import com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import java.util.Map;
import tb.m4l;
import tb.nh4;
import tb.o3h;
import tb.t2o;
import tb.ux9;
import tb.v3d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FullScreenProxyX implements IFullScreenProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FullScreenProxyX";
    private final Map<String, Integer> rIdMap = new HashMap<String, Integer>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.proxy.FullScreenProxyX.1
        {
            put(IFullScreenProxy.R_LAYOUT_TAOLIVE_CLOSE_BTN_LAYOUT, Integer.valueOf(R.layout.taolive_close_btn_layout_flexalocal));
            put(IFullScreenProxy.R_ID_TAOLIVE_ROOM_TOP_MORE_BTN, Integer.valueOf(R.id.taolive_room_top_more_btn));
            put(IFullScreenProxy.R_ID_TAOLIVE_ROOM_TOP_CLOSE_BTN, Integer.valueOf(R.id.taolive_room_top_close_btn));
        }
    };

    static {
        t2o.a(295699602);
        t2o.a(806355147);
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public BaseFrame createFullScreenLiveFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("7aa60476", new Object[]{this, context, new Boolean(z), tBLiveDataModel, ux9Var});
        }
        if (nh4.N0()) {
            return new ScheduleFullScreenLiveFrame(context, z, tBLiveDataModel, ux9Var);
        }
        return new FullScreenLiveFrame2(context, z, tBLiveDataModel, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public BaseFrame createFullScreenReplayFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("492b5c71", new Object[]{this, context, new Boolean(z), tBLiveDataModel, ux9Var});
        }
        return new FullScreenReplayFrame2(context, z, tBLiveDataModel, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public BaseFrame createInteractBizCenterFrame(Context context, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("6355e82c", new Object[]{this, context, ux9Var});
        }
        return new InteractBizCenterFrame(context, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public v3d createLiveRoomOpenPushManager(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v3d) ipChange.ipc$dispatch("40e542c3", new Object[]{this, context});
        }
        return new m4l(new LiveBizInfo(), new o3h(context));
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public Map<String, Integer> getRealRIdMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("45ea97df", new Object[]{this});
        }
        return this.rIdMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public boolean isInstanceOfFullScreenFrame(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a6f1503", new Object[]{this, obj})).booleanValue();
        }
        return obj instanceof FullScreenFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public boolean isInstanceOfFullScreenLiveFrame2(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26ecd109", new Object[]{this, obj})).booleanValue();
        }
        return obj instanceof FullScreenLiveFrame2;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public boolean isInstanceOfFullScreenReplayFrame2(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c0e8944", new Object[]{this, obj})).booleanValue();
        }
        return obj instanceof FullScreenReplayFrame2;
    }
}
