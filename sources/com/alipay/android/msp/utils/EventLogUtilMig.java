package com.alipay.android.msp.utils;

import android.text.TextUtils;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EventLogUtilMig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void appendBizInfoToLogMap(Map<String, String> map, MspContext mspContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f387a", new Object[]{map, mspContext});
        } else if (map != null && mspContext != null) {
            try {
                if (mspContext instanceof MspTradeContext) {
                    str = ((MspTradeContext) mspContext).getApLinkToken();
                } else {
                    str = "";
                }
                if (!TextUtils.isEmpty(str) && !map.containsKey("ap_link_token")) {
                    map.put("ap_link_token", str);
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            try {
                String attr = mspContext.getStatisticInfo().getAttr(Vector.Trade, "bizType");
                if (!TextUtils.isEmpty(attr) && !map.containsKey("biz_type")) {
                    map.put("biz_type", attr);
                }
            } catch (Exception e2) {
                LogUtil.printExceptionStackTrace(e2);
            }
        }
    }

    public static void appendBizInfoToLogMap(Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aeecc7f", new Object[]{map, new Integer(i)});
            return;
        }
        try {
            appendBizInfoToLogMap(map, MspContextManager.getInstance().getMspContextByBizId(i));
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }
}
