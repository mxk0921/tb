package com.taobao.android.trade.cart.provider.msoa;

import android.text.TextUtils;
import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TaoHelper;
import com.taobao.wireless.trade.mcart.sdk.co.mtop.MtopTradeAddBagRequest;
import java.io.Serializable;
import tb.fa3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MsoaCartServiceImpl implements MsoaCartService, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(697303052);
        t2o.a(697303051);
    }

    @Override // com.taobao.android.trade.cart.provider.msoa.MsoaCartService
    public void addCartBag(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        long j;
        NumberFormatException e;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2461888", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8, str9});
            return;
        }
        if (TextUtils.isEmpty(str8)) {
            str8 = TaoHelper.getTTID();
        }
        if (TextUtils.isEmpty(str9)) {
            str9 = "97";
        }
        try {
            j = Long.parseLong(str4);
        } catch (NumberFormatException e2) {
            e = e2;
            j = 0;
        }
        try {
            i = Integer.parseInt(str9);
        } catch (NumberFormatException e3) {
            e = e3;
            e.printStackTrace();
            MtopTradeAddBagRequest mtopTradeAddBagRequest = new MtopTradeAddBagRequest();
            mtopTradeAddBagRequest.setItemId(str2);
            mtopTradeAddBagRequest.setSkuId(str3);
            mtopTradeAddBagRequest.setQuantity(j);
            mtopTradeAddBagRequest.setExParams(str5);
            mtopTradeAddBagRequest.setFeature(str6);
            mtopTradeAddBagRequest.setCartFrom(str7);
            new fa3().a(mtopTradeAddBagRequest, new RemoteListener(str), Globals.getApplication().getApplicationContext(), str8, i);
        }
        MtopTradeAddBagRequest mtopTradeAddBagRequest2 = new MtopTradeAddBagRequest();
        mtopTradeAddBagRequest2.setItemId(str2);
        mtopTradeAddBagRequest2.setSkuId(str3);
        mtopTradeAddBagRequest2.setQuantity(j);
        mtopTradeAddBagRequest2.setExParams(str5);
        mtopTradeAddBagRequest2.setFeature(str6);
        mtopTradeAddBagRequest2.setCartFrom(str7);
        new fa3().a(mtopTradeAddBagRequest2, new RemoteListener(str), Globals.getApplication().getApplicationContext(), str8, i);
    }
}
