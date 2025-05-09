package com.taobao.android.live.plugin.proxy.panel;

import android.content.Context;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IPanelProxy extends IProxy {
    public static final String KEY = "IPanelProxy";

    void blankFrame2Hide(Object obj);

    void blankFrame2HidePlayIcon(Object obj);

    void blankFrame2Show(Object obj, boolean z);

    Class<? extends BaseFrame> getBlankFrame2Class();

    BaseFrame getLiveAvatarNewFrame(Context context, ux9 ux9Var);

    BaseFrame getLiveAvatarNewFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel);

    Class<? extends BaseFrame> getLiveEndFrameClass();

    BaseFrame getLiveReadyFrame(Context context, ux9 ux9Var);

    BaseFrame getShowcaseFrame(Context context, ux9 ux9Var, LiveItem liveItem);

    BaseFrame getTopFakeBarFrame(Context context, ux9 ux9Var);

    Class<? extends BaseFrame> getWatermarkFrame3Class();

    Object showClearScreenGuide(Context context);

    Object showPlayRateScreenGuide(Context context);
}
