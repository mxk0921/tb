package com.taobao.android.shop.weex;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.tao.messagekit.base.network.MtopConnection;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.Map;
import tb.iiz;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ShopReportModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(764412034);
    }

    public static /* synthetic */ Object ipc$super(ShopReportModule shopReportModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/weex/ShopReportModule");
    }

    @JSMethod(uiThread = false)
    public void abtestActivateServer(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("752afb4e", new Object[]{this, str, jSCallback});
            return;
        }
        try {
            UTABTest.activateServer(str);
            jSCallback.invoke(pg1.ATOM_done);
        } catch (Throwable unused) {
            jSCallback.invoke("exception");
        }
    }

    @JSMethod(uiThread = false)
    public void report(String str, String str2, Map<String, String> map, JSCallback jSCallback) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d580072", new Object[]{this, str, str2, map, jSCallback});
            return;
        }
        try {
            l = Long.valueOf(Long.parseLong(str2));
        } catch (NumberFormatException unused) {
            l = null;
        }
        if (l == null) {
            l = Long.valueOf(System.currentTimeMillis());
        }
        Context context = this.mWXSDKInstance.getContext();
        if (context instanceof ShopRenderActivity) {
            String str3 = "";
            if (TextUtils.isEmpty(str) || !str.contains("will")) {
                ((ShopRenderActivity) context).showCostTime(str, l, "main-cost", map != null ? map.toString() : str3);
            } else {
                ((ShopRenderActivity) context).recordCostTime(str.replace("will", MtopConnection.KEY_DID), l.longValue());
            }
            if ((str.contains("pagedata") && str.contains("will")) || ((str.contains("downgrade") && str.contains("will")) || (str.contains(CredentialRpcData.ACTION_FETCH) && str.contains("will")))) {
                ShopRenderActivity shopRenderActivity = (ShopRenderActivity) context;
                if (map != null) {
                    str3 = map.toString();
                }
                shopRenderActivity.showCostTime(str, l, "main-cost", str3);
            } else if (!str.contains(iiz.PERF_STAG_TOTAL)) {
                str.contains("shopperf_interaction_time");
            }
        } else {
            jSCallback.invoke("failed. not ShopRenderActivity");
        }
    }
}
