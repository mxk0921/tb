package com.taobao.android.live.plugin.proxy.gift;

import android.content.Context;
import android.view.ViewStub;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.android.tblive.gift.model.TBLiveGiftEntity;
import com.taobao.taolive.room.adapter.alphavideo.VideoGiftView;
import tb.ckd;
import tb.h9c;
import tb.l9c;
import tb.o9c;
import tb.p9c;
import tb.wud;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IGiftProxy extends IProxy {
    public static final String KEY = "IGiftProxy";

    void adjustGiftBottomHeight(int i);

    void adjustSmallHeightInAliveScene(int i);

    void clearGiftQueue();

    ckd createResourceDownloaderManager();

    wud createTBLiveGiftConfig(o9c o9cVar, h9c h9cVar);

    void destroy();

    boolean enableBigGift();

    boolean enableMD5FileCheck();

    boolean enablePresaleScreenGift();

    void enableVideoGift(VideoGiftView videoGiftView);

    Class<? extends BaseFrame> getGiftFrameClass();

    void init(Context context, ViewStub viewStub, wud wudVar, p9c p9cVar);

    void sendGift(TBLiveGiftEntity tBLiveGiftEntity);

    void setGuestSendGiftEffectStatus(boolean z);

    void setLogImpl(l9c l9cVar);
}
