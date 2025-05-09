package com.taobao.android.live.plugin.proxy.gift;

import android.content.Context;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.btype.flexaremote.proxy.GiftProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.tblive.gift.model.TBLiveGiftEntity;
import com.taobao.taolive.room.adapter.alphavideo.VideoGiftView;
import tb.ckd;
import tb.h9c;
import tb.k2n;
import tb.l9c;
import tb.o9c;
import tb.p9c;
import tb.t2o;
import tb.wud;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GiftProxy extends k2n<IGiftProxy> implements IGiftProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GiftProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final GiftProxy f8747a = new GiftProxy();

        static {
            t2o.a(806355151);
        }

        public static /* synthetic */ GiftProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GiftProxy) ipChange.ipc$dispatch("706d013d", new Object[0]);
            }
            return f8747a;
        }
    }

    static {
        t2o.a(806355149);
        t2o.a(806355152);
    }

    public static GiftProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GiftProxy) ipChange.ipc$dispatch("677c7e97", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(GiftProxy giftProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/gift/GiftProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void adjustGiftBottomHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a47237cb", new Object[]{this, new Integer(i)});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.adjustGiftBottomHeight(i);
        }
        FlexaLiveX.w("[GiftProxy#adjustGiftBottomHeight]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void adjustSmallHeightInAliveScene(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f3cced9", new Object[]{this, new Integer(i)});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.adjustSmallHeightInAliveScene(i);
        }
        FlexaLiveX.w("[GiftProxy#adjustSmallHeightInAliveScene]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void clearGiftQueue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3987b", new Object[]{this});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.clearGiftQueue();
        }
        FlexaLiveX.w("[GiftProxy#clearGiftQueue]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public ckd createResourceDownloaderManager() {
        ckd ckdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ckd) ipChange.ipc$dispatch("459b7477", new Object[]{this});
        }
        IGiftProxy real = getReal();
        if (real != null) {
            ckdVar = real.createResourceDownloaderManager();
        } else {
            ckdVar = null;
        }
        FlexaLiveX.w("[GiftProxy#createResourceDownloaderManager]  value: " + ckdVar);
        return ckdVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public wud createTBLiveGiftConfig(o9c o9cVar, h9c h9cVar) {
        wud wudVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wud) ipChange.ipc$dispatch("dee60d32", new Object[]{this, o9cVar, h9cVar});
        }
        IGiftProxy real = getReal();
        if (real != null) {
            wudVar = real.createTBLiveGiftConfig(o9cVar, h9cVar);
        } else {
            wudVar = null;
        }
        FlexaLiveX.w("[GiftProxy#createTBLiveGiftConfig]  value: " + wudVar);
        return wudVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.destroy();
        }
        FlexaLiveX.w("[GiftProxy#destroy]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public boolean enableBigGift() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e1fb958", new Object[]{this})).booleanValue();
        }
        IGiftProxy real = getReal();
        if (real != null) {
            z = real.enableBigGift();
        }
        FlexaLiveX.w("[GiftProxy#enableBigGift]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public boolean enableMD5FileCheck() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f1de1c", new Object[]{this})).booleanValue();
        }
        IGiftProxy real = getReal();
        if (real != null) {
            z = real.enableMD5FileCheck();
        }
        FlexaLiveX.w("[GiftProxy#enableMD5FileCheck]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public boolean enablePresaleScreenGift() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbbd0c8e", new Object[]{this})).booleanValue();
        }
        IGiftProxy real = getReal();
        if (real != null) {
            z = real.enablePresaleScreenGift();
        }
        FlexaLiveX.w("[GiftProxy#enablePresaleScreenGift]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void enableVideoGift(VideoGiftView videoGiftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb4c4fe0", new Object[]{this, videoGiftView});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.enableVideoGift(videoGiftView);
        }
        FlexaLiveX.w("[GiftProxy#enableVideoGift]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public Class<? extends BaseFrame> getGiftFrameClass() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("585e1705", new Object[]{this});
        }
        IGiftProxy real = getReal();
        if (real != null) {
            cls = real.getGiftFrameClass();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[GiftProxy#getGiftFrameClass]  clazz: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IGiftProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.btype.flexaremote.proxy.GiftProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return null;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "礼物库";
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void init(Context context, ViewStub viewStub, wud wudVar, p9c p9cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d4ca017", new Object[]{this, context, viewStub, wudVar, p9cVar});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.init(context, viewStub, wudVar, p9cVar);
        }
        FlexaLiveX.w("[GiftProxy#init]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void sendGift(TBLiveGiftEntity tBLiveGiftEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c2c7b2", new Object[]{this, tBLiveGiftEntity});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.sendGift(tBLiveGiftEntity);
        }
        FlexaLiveX.w("[GiftProxy#sendGift]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void setGuestSendGiftEffectStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c42583c", new Object[]{this, new Boolean(z)});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.setGuestSendGiftEffectStatus(z);
        }
        FlexaLiveX.w("[GiftProxy#setGuestSendGiftEffectStatus]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void setLogImpl(l9c l9cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5030d15", new Object[]{this, l9cVar});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.setLogImpl(l9cVar);
        }
        FlexaLiveX.w("[GiftProxy#setLogImpl]");
    }

    private GiftProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[GiftProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IGiftProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IGiftProxy) ipChange.ipc$dispatch("5ac938a0", new Object[]{this})) : new GiftProxyX();
    }
}
