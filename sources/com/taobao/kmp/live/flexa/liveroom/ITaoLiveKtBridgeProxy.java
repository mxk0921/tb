package com.taobao.kmp.live.flexa.liveroom;

import com.taobao.kmp.live.flexa.IKTProxy;
import com.taobao.kmp.live.flexa.openArch.IOpenArchProxy;
import com.taobao.kmp.live.flexa.powermsg.IOpenArchMessageProxy;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService;
import kotlin.Metadata;
import tb.nyd;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/taobao/kmp/live/flexa/liveroom/ITaoLiveKtBridgeProxy;", "Lcom/taobao/kmp/live/flexa/IKTProxy;", "Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtComponentOpenService;", "getBizManager", "()Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtComponentOpenService;", "Lcom/taobao/kmp/live/flexa/openArch/IOpenArchProxy;", "getOpenArchProxy", "()Lcom/taobao/kmp/live/flexa/openArch/IOpenArchProxy;", "Lcom/taobao/kmp/live/flexa/powermsg/IOpenArchMessageProxy;", "getOpenArchMessageProxy", "()Lcom/taobao/kmp/live/flexa/powermsg/IOpenArchMessageProxy;", "Ltb/xhv;", "clearBizManager", "()V", "Ltb/nyd;", "getSwitchRoomManager", "()Ltb/nyd;", "clearSwitchRoomManager", "Companion", "a", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtBridgeProxy extends IKTProxy {
    public static final a Companion = a.$$INSTANCE;
    public static final String KEY = "ITaoLiveKtBridgeProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String KEY = "ITaoLiveKtBridgeProxy";

        static {
            t2o.a(1003487259);
        }
    }

    void clearBizManager();

    void clearSwitchRoomManager();

    ITaoLiveKtComponentOpenService getBizManager();

    IOpenArchMessageProxy getOpenArchMessageProxy();

    IOpenArchProxy getOpenArchProxy();

    nyd getSwitchRoomManager();
}
