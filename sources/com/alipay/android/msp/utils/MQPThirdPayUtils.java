package com.alipay.android.msp.utils;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.biz.thirdpay.ThirdPayManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.pay.GlobalConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.fyu;
import tb.k6e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MQPThirdPayUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEBUG_MERCHANT_INFO = "888000053990004";
    private static final String LOG_TAG = "MQPThirdPayUtils";
    private static final String RELEASE_MERCHANT_INFO = "888000053990002";
    private static final String RELEASE_MODE = "00";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface CupDirectAppsCallback {
        void onResult(List<String> list);
    }

    public static void getCupDirectApps(Context context, final CupDirectAppsCallback cupDirectAppsCallback) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ac4b", new Object[]{context, cupDirectAppsCallback});
            return;
        }
        LogUtil.record(2, LOG_TAG, "getCupDirectApps");
        if (context != null) {
            GlobalHelper.getInstance().init(context);
            if (GlobalConstant.DEBUG) {
                str = DEBUG_MERCHANT_INFO;
            } else {
                str = RELEASE_MERCHANT_INFO;
            }
            fyu.x(context, RELEASE_MODE, str, new k6e() { // from class: com.alipay.android.msp.utils.MQPThirdPayUtils.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.k6e
                public void onError(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("97d08c84", new Object[]{this, str2, str3});
                        return;
                    }
                    LogUtil.record(2, MQPThirdPayUtils.LOG_TAG, "getCupDirectApps onError s:" + str2 + " s1:" + str3);
                    ThirdPayManager.refreshListCupDirectApps(null);
                    CupDirectAppsCallback cupDirectAppsCallback2 = CupDirectAppsCallback.this;
                    if (cupDirectAppsCallback2 != null) {
                        cupDirectAppsCallback2.onResult(ThirdPayManager.getListCupDirectApps());
                    }
                }

                @Override // tb.k6e
                public void onResult(Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4d1d691", new Object[]{this, bundle});
                        return;
                    }
                    if (bundle != null) {
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("directApps");
                        LogUtil.record(2, MQPThirdPayUtils.LOG_TAG, "getCupDirectApps onResult directApps:" + JSON.toJSONString(stringArrayList));
                        ThirdPayManager.refreshListCupDirectApps(stringArrayList);
                    }
                    CupDirectAppsCallback cupDirectAppsCallback2 = CupDirectAppsCallback.this;
                    if (cupDirectAppsCallback2 != null) {
                        cupDirectAppsCallback2.onResult(ThirdPayManager.getListCupDirectApps());
                    }
                }
            });
        }
    }
}
