package com.taobao.android.trade.cart.provider;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.cart.api.ITBCartService;
import com.taobao.tao.Globals;
import com.taobao.tao.util.TaoHelper;
import com.taobao.wireless.trade.mcart.sdk.co.mtop.MtopTradeAddBagRequest;
import java.io.Serializable;
import tb.fa3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBCartServiceImpl implements ITBCartService, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(697303050);
    }

    @Override // com.taobao.cart.api.ITBCartService
    public void addBag(String str, String str2, long j, String str3, String str4, String str5, Context context) {
        Context applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9aff28", new Object[]{this, str, str2, new Long(j), str3, str4, str5, context});
            return;
        }
        fa3 fa3Var = new fa3();
        MtopTradeAddBagRequest mtopTradeAddBagRequest = new MtopTradeAddBagRequest();
        mtopTradeAddBagRequest.setItemId(str2);
        mtopTradeAddBagRequest.setSkuId(str3);
        mtopTradeAddBagRequest.setQuantity(j);
        mtopTradeAddBagRequest.setExParams(str4);
        mtopTradeAddBagRequest.setCartFrom(str5);
        RemoteListener2 remoteListener2 = new RemoteListener2(str);
        if (context == null) {
            if (Globals.getApplication() == null) {
                applicationContext = null;
            } else {
                applicationContext = Globals.getApplication().getApplicationContext();
            }
            context = applicationContext;
        }
        if (context != null) {
            fa3Var.a(mtopTradeAddBagRequest, remoteListener2, context, TaoHelper.getTTID(), 97);
        }
    }
}
