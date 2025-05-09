package com.alipay.android.msp.core.component;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.sys.NetConnectionType;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspNetWorkStateReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f3547a;

    public MspNetWorkStateReceiver(int i) {
        this.f3547a = i;
    }

    public static /* synthetic */ Object ipc$super(MspNetWorkStateReceiver mspNetWorkStateReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/core/component/MspNetWorkStateReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.f3547a);
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                LogUtil.record(8, "MspNetWorkStateReceiver:onReceive", "isAvailable false , mspContext=".concat(String.valueOf(mspContextByBizId)));
                AlertIntelligenceEngine.startAction(mspContextByBizId, "sys", "ne_disconnected", "", "");
                return;
            }
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                NetConnectionType typeByCode = NetConnectionType.getTypeByCode(activeNetworkInfo.getSubtype());
                LogUtil.record(8, "MspNetWorkStateReceiver:onReceive", typeByCode.getName() + " , mspContext=" + mspContextByBizId);
                if (mspContextByBizId != null) {
                    AlertIntelligenceEngine.startAction(mspContextByBizId, "sys", "ne_" + typeByCode.getName(), "", "");
                }
            } else if (type == 1) {
                LogUtil.record(8, "MspNetWorkStateReceiver:onReceive", "wifi , mspContext=".concat(String.valueOf(mspContextByBizId)));
                AlertIntelligenceEngine.startAction(mspContextByBizId, "sys", "ne_wifi", "", "");
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }
}
