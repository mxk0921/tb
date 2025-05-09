package com.alipay.mobile.common.transport.sys.telephone;

import android.content.Context;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DefaultNetTelephonyManager extends NetTelephonyManagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TelephonyManager f4136a;

    public DefaultNetTelephonyManager() {
        this.f4136a = (TelephonyManager) TransportEnvUtil.getContext().getSystemService("phone");
    }

    public static /* synthetic */ Object ipc$super(DefaultNetTelephonyManager defaultNetTelephonyManager, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/sys/telephone/DefaultNetTelephonyManager");
    }

    @Override // com.alipay.mobile.common.transport.sys.telephone.NetTelephonyManagerAdapter, com.alipay.mobile.common.transport.sys.telephone.NetTelephonyManager
    public CellLocation getCellLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CellLocation) ipChange.ipc$dispatch("ded9583", new Object[]{this});
        }
        try {
            if (!MiscUtils.isAtFrontDesk(TransportEnvUtil.getContext())) {
                return null;
            }
            return this.f4136a.getCellLocation();
        } catch (Throwable th) {
            LogCatUtil.error("DefaultNetTelephonyManager", "getCellLocation ex= " + th.toString());
            return null;
        }
    }

    public DefaultNetTelephonyManager(Context context) {
        this.f4136a = (TelephonyManager) context.getSystemService("phone");
    }
}
