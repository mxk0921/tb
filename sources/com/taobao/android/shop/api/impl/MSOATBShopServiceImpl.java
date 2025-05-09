package com.taobao.android.shop.api.impl;

import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.egh;
import tb.jl2;
import tb.rrh;
import tb.t2o;
import tb.xl2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MSOATBShopServiceImpl implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SUCCESS_MSG = "";
    private static final String SUCCESS_MSG_KEY = "msg";

    static {
        t2o.a(764411947);
    }

    private void sendBroadcastCloseLoft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5d217", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(jl2.b);
        xl2.a().b(intent);
    }

    private void sendBroadcastRefreshHomePage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca59f2cb", new Object[]{this, str, str2});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(jl2.f22050a);
        intent.putExtra(jl2.c, str);
        intent.putExtra(jl2.d, str2);
        xl2.a().b(intent);
    }

    public void exitLoft(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4af3b20", new Object[]{this, str, str2, str3, new Boolean(z)});
            return;
        }
        egh.a("MSOATBShopServiceImpl::exitLoft begin");
        HashMap hashMap = new HashMap();
        hashMap.put("msg", "shopId=" + str2 + ",homePageId=" + str3 + ", needRefresh=" + z);
        sendBroadcastCloseLoft();
        if (z && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            sendBroadcastRefreshHomePage(str2, str3);
        }
        egh.a("MSOATBShopServiceImpl::exitLoft end");
        rrh.e().l(str, hashMap);
    }
}
