package com.taobao.taolive.crossplatformfoundation;

import android.app.Application;
import android.os.Bundle;
import com.alibaba.security.realidentity.p1;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.flexa.TLNexusInitial;
import com.taobao.live.liveroom.liveBizComponent.ktProxy.TaoLiveKtBridgeProxyX;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import tb.p5c;
import tb.r2s;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/TLCrossPlatformInitial;", "Ltb/p5c;", "Ljava/io/Serializable;", "<init>", "()V", "Landroid/app/Application;", "p0", "Landroid/os/Bundle;", p1.d, "Ltb/xhv;", "init", "(Landroid/app/Application;Landroid/os/Bundle;)V", "", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class TLCrossPlatformInitial implements p5c, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG = "TLCrossPlatformInitial";

    static {
        t2o.a(1010827420);
    }

    @Override // tb.p5c
    public void init(Application application, Bundle bundle) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d5e6ac", new Object[]{this, application, bundle});
            return;
        }
        try {
            new TLNexusInitial().init(application, bundle);
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        if (Result.m1115isSuccessimpl(obj)) {
            xhv xhvVar = (xhv) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("ITaoLiveKtBridgeProxy", new TaoLiveKtBridgeProxyX());
            r2s.INSTANCE.b(linkedHashMap);
        }
    }
}
