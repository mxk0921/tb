package com.alipay.android.msp.framework.statisticsv2.collector;

import android.text.TextUtils;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ThreadSafeDateFormat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TimeCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d8e41eb", new Object[]{new Integer(i)});
        }
        String trId = PhoneCashierMspEngine.getMspWallet().getTrId();
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId == null) {
                return trId;
            }
            String apLinkToken = tradeContextByBizId.getApLinkToken();
            if (!TextUtils.isEmpty(apLinkToken)) {
                return apLinkToken;
            }
            return trId;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return trId;
        }
    }

    public static String collectData(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae92bc42", new Object[]{str, new Integer(i)});
        }
        String str2 = Grammar.ATTR_DEFAULT_VALUE;
        str.hashCode();
        if (!str.equals("traceId")) {
            return !str.equals("time") ? str2 : ThreadSafeDateFormat.format(new Date(), "yyyy-MM-dd HH:mm:ss:SSS");
        }
        return a(i);
    }
}
