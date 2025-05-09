package com.alipay.mobile.verifyidentity.module.zface.proxy;

import android.os.Bundle;
import com.alibaba.ability.impl.mtop.MtopAbility;
import com.alipay.mobile.security.zim.api.ZIMCallback;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.api.ZIMResponse;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannelCallback;
import com.alipay.mobile.verifyidentity.sentry.ASProxy;
import com.alipay.mobile.verifyidentity.sentry.SentryDelegate;
import com.alipay.mobile.verifyidentity.sentry.SentryHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZIMFacadeProxy implements ASProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SentryDelegate delegate;
    private ZIMFacade zimFacade;

    public ZIMFacadeProxy(ZIMFacade zIMFacade) {
        this.zimFacade = zIMFacade;
    }

    public static /* synthetic */ SentryDelegate access$000(ZIMFacadeProxy zIMFacadeProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SentryDelegate) ipChange.ipc$dispatch("4ee36c9d", new Object[]{zIMFacadeProxy});
        }
        return zIMFacadeProxy.delegate;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        }
    }

    public void verify(String str, Map<String, String> map, final ZimMessageChannel zimMessageChannel, final ZIMCallback zIMCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1265d31a", new Object[]{this, str, map, zimMessageChannel, zIMCallback});
            return;
        }
        SentryDelegate sentryDelegate = new SentryDelegate();
        this.delegate = sentryDelegate;
        if (sentryDelegate.f4450a) {
            HashMap hashMap = new HashMap(map);
            hashMap.remove("zimInitResp");
            hashMap.remove("desensName");
            hashMap.remove("USER_ID");
            SentryHelper.a(hashMap);
        }
        this.zimFacade.verify(str, map, new ZimMessageChannel() { // from class: com.alipay.mobile.verifyidentity.module.zface.proxy.ZIMFacadeProxy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onAction(Bundle bundle, ZimMessageChannelCallback zimMessageChannelCallback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b399c2d", new Object[]{this, bundle, zimMessageChannelCallback});
                    return;
                }
                if (ZIMFacadeProxy.access$000(ZIMFacadeProxy.this).f4450a) {
                    Bundle bundle2 = new Bundle(bundle);
                    if (bundle2.containsKey(MtopAbility.API_REQUEST_DATA)) {
                        bundle2.remove(MtopAbility.API_REQUEST_DATA);
                    }
                    ZIMFacadeProxy.access$000(ZIMFacadeProxy.this);
                    SentryHelper.a(bundle2);
                }
                ZimMessageChannel zimMessageChannel2 = zimMessageChannel;
                if (zimMessageChannel2 != null) {
                    zimMessageChannel2.onAction(bundle, zimMessageChannelCallback);
                }
            }
        }, new ZIMCallback() { // from class: com.alipay.mobile.verifyidentity.module.zface.proxy.ZIMFacadeProxy.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public boolean response(ZIMResponse zIMResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("60fd2bfb", new Object[]{this, zIMResponse})).booleanValue();
                }
                if (ZIMFacadeProxy.access$000(ZIMFacadeProxy.this).f4450a) {
                    if (zIMResponse != null) {
                        ZIMFacadeProxy.access$000(ZIMFacadeProxy.this);
                        SentryHelper.a(zIMResponse);
                    } else {
                        ZIMFacadeProxy.access$000(ZIMFacadeProxy.this);
                    }
                }
                ZIMCallback zIMCallback2 = zIMCallback;
                if (zIMCallback2 != null) {
                    return zIMCallback2.response(zIMResponse);
                }
                return true;
            }
        });
    }
}
