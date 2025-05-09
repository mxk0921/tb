package com.alipay.mobile.common.transportext.biz.shared.spdy;

import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.api.ExtTransportManager;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportManagerImpl;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportStrategy;
import com.alipay.mobile.common.transportext.util.InnerLogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SpdyShortTimeoutHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static long f4214a = -1;

    public static final void adjustmentSpdyTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342929", new Object[0]);
            return;
        }
        LogCatUtil.info(InnerLogUtil.MWALLET_SPDY_TAG, "start adjustmentSpdyTimeout");
        if (!NetworkTunnelStrategy.getInstance().isCanUseSpdy()) {
            LogCatUtil.info(InnerLogUtil.MWALLET_SPDY_TAG, "adjustmentSpdyTimeout.  spdy off.");
            return;
        }
        ExtTransportManager spdyTransportManager = ((ExtTransportManagerImpl) ExtTransportOffice.getInstance().getExtTransportManager()).getSpdyTransportManager();
        if (spdyTransportManager == null) {
            LogCatUtil.warn(InnerLogUtil.MWALLET_SPDY_TAG, "[adjustmentSpdyTimeout] Spdy not supported.");
        } else if (!spdyTransportManager.isConnected()) {
            LogCatUtil.info(InnerLogUtil.MWALLET_SPDY_TAG, "adjustmentSpdyTimeout.  spdy connection closed.");
        } else if (spdyTransportManager.isNetworkActive()) {
            LogCatUtil.info(InnerLogUtil.MWALLET_SPDY_TAG, "adjustmentSpdyTimeout. spdy not active.");
        } else {
            int intValue = TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.SPDY_TIME_TO_ASLEEP);
            long currentTimeMillis = System.currentTimeMillis() - f4214a;
            LogCatUtil.info(InnerLogUtil.MWALLET_SPDY_TAG, "adjustmentSpdyTimeout. leaveTime=[" + f4214a + "] leaveHowTime=[" + currentTimeMillis + "] timeToAsleep=[" + intValue + "]");
            if (f4214a != -1 && currentTimeMillis > intValue) {
                ExtTransportStrategy.setUseSpdyShortReadTimeout(true);
                LogCatUtil.info(InnerLogUtil.MWALLET_SPDY_TAG, "adjustmentSpdyTimeout. setUseSpdyShortReadTimeout");
            }
        }
    }

    public static final void setLeaveTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d508c7b", new Object[]{new Long(j)});
        } else {
            f4214a = j;
        }
    }
}
