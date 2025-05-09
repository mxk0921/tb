package com.taobao.live.liveroom.liveBizComponent.ktProxy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.flexa.liveroom.ITaoLiveKtBridgeProxy;
import com.taobao.kmp.live.flexa.openArch.IOpenArchProxy;
import com.taobao.kmp.live.flexa.powermsg.IOpenArchMessageProxy;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService;
import com.taobao.kmp.nexus.arch.openArch.OpenArchProxy;
import com.taobao.kmp.nexus.arch.openArch.service.message.flexa.OpenArchMessageProxy;
import com.taobao.live.liveroom.liveBizComponent.ktManager.manager.TaoLiveKtBizManager;
import com.taobao.live.liveroom.liveBizComponent.ktProxy.TaoLiveKtBridgeProxyX;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import tb.d1a;
import tb.njg;
import tb.nyd;
import tb.s3t;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001b\u0010\u001b\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\fR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/ktProxy/TaoLiveKtBridgeProxyX;", "Lcom/taobao/kmp/live/flexa/liveroom/ITaoLiveKtBridgeProxy;", "<init>", "()V", "Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtComponentOpenService;", "getBizManager", "()Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtComponentOpenService;", "Lcom/taobao/kmp/live/flexa/openArch/IOpenArchProxy;", "getOpenArchProxy", "()Lcom/taobao/kmp/live/flexa/openArch/IOpenArchProxy;", "Lcom/taobao/kmp/live/flexa/powermsg/IOpenArchMessageProxy;", "getOpenArchMessageProxy", "()Lcom/taobao/kmp/live/flexa/powermsg/IOpenArchMessageProxy;", "Ltb/xhv;", "clearBizManager", "Ltb/nyd;", "getSwitchRoomManager", "()Ltb/nyd;", "clearSwitchRoomManager", "mBizManager", "Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtComponentOpenService;", "mOpenArchProxy$delegate", "Ltb/njg;", "getMOpenArchProxy", "mOpenArchProxy", "mOpenArchMessageProxy$delegate", "getMOpenArchMessageProxy", "mOpenArchMessageProxy", "mSwitchRoomManager", "Ltb/nyd;", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtBridgeProxyX implements ITaoLiveKtBridgeProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ITaoLiveKtComponentOpenService mBizManager;
    private final njg mOpenArchMessageProxy$delegate;
    private final njg mOpenArchProxy$delegate;
    private nyd mSwitchRoomManager;

    static {
        t2o.a(1010827306);
        t2o.a(1003487258);
    }

    public TaoLiveKtBridgeProxyX() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.mOpenArchProxy$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.vwy
            @Override // tb.d1a
            public final Object invoke() {
                OpenArchProxy mOpenArchProxy_delegate$lambda$0;
                mOpenArchProxy_delegate$lambda$0 = TaoLiveKtBridgeProxyX.mOpenArchProxy_delegate$lambda$0();
                return mOpenArchProxy_delegate$lambda$0;
            }
        });
        this.mOpenArchMessageProxy$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.xwy
            @Override // tb.d1a
            public final Object invoke() {
                OpenArchMessageProxy mOpenArchMessageProxy_delegate$lambda$1;
                mOpenArchMessageProxy_delegate$lambda$1 = TaoLiveKtBridgeProxyX.mOpenArchMessageProxy_delegate$lambda$1();
                return mOpenArchMessageProxy_delegate$lambda$1;
            }
        });
    }

    private final IOpenArchMessageProxy getMOpenArchMessageProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOpenArchMessageProxy) ipChange.ipc$dispatch("e3750fcd", new Object[]{this});
        }
        return (IOpenArchMessageProxy) this.mOpenArchMessageProxy$delegate.getValue();
    }

    private final IOpenArchProxy getMOpenArchProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOpenArchProxy) ipChange.ipc$dispatch("45fb1c31", new Object[]{this});
        }
        return (IOpenArchProxy) this.mOpenArchProxy$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OpenArchMessageProxy mOpenArchMessageProxy_delegate$lambda$1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchMessageProxy) ipChange.ipc$dispatch("c76412d6", new Object[0]);
        }
        return new OpenArchMessageProxy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OpenArchProxy mOpenArchProxy_delegate$lambda$0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchProxy) ipChange.ipc$dispatch("71b00bd6", new Object[0]);
        }
        return new OpenArchProxy();
    }

    @Override // com.taobao.kmp.live.flexa.liveroom.ITaoLiveKtBridgeProxy
    public void clearBizManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4b13e4e", new Object[]{this});
        } else {
            this.mBizManager = null;
        }
    }

    @Override // com.taobao.kmp.live.flexa.liveroom.ITaoLiveKtBridgeProxy
    public void clearSwitchRoomManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb743b8", new Object[]{this});
        } else {
            this.mSwitchRoomManager = null;
        }
    }

    @Override // com.taobao.kmp.live.flexa.liveroom.ITaoLiveKtBridgeProxy
    public ITaoLiveKtComponentOpenService getBizManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtComponentOpenService) ipChange.ipc$dispatch("950a88f8", new Object[]{this});
        }
        if (this.mBizManager == null) {
            this.mBizManager = new TaoLiveKtBizManager();
        }
        return this.mBizManager;
    }

    @Override // com.taobao.kmp.live.flexa.liveroom.ITaoLiveKtBridgeProxy
    public IOpenArchMessageProxy getOpenArchMessageProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOpenArchMessageProxy) ipChange.ipc$dispatch("c019260e", new Object[]{this});
        }
        return getMOpenArchMessageProxy();
    }

    @Override // com.taobao.kmp.live.flexa.liveroom.ITaoLiveKtBridgeProxy
    public IOpenArchProxy getOpenArchProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOpenArchProxy) ipChange.ipc$dispatch("220c832", new Object[]{this});
        }
        return getMOpenArchProxy();
    }

    @Override // com.taobao.kmp.live.flexa.liveroom.ITaoLiveKtBridgeProxy
    public nyd getSwitchRoomManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nyd) ipChange.ipc$dispatch("dcb9598b", new Object[]{this});
        }
        if (this.mSwitchRoomManager == null) {
            this.mSwitchRoomManager = new s3t();
        }
        return this.mSwitchRoomManager;
    }
}
