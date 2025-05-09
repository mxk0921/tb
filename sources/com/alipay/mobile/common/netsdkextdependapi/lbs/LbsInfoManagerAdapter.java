package com.alipay.mobile.common.netsdkextdependapi.lbs;

import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LbsInfoManagerAdapter implements LbsInfoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.netsdkextdependapi.lbs.LbsInfoManager
    public String getExtLbsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78d67059", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.lbs.LbsInfoManager
    public String getKeyLBSInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52bd5f97", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.lbs.LbsInfoManager
    public double getLatitude() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b6fad57", new Object[]{this})).doubleValue();
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.lbs.LbsInfoManager
    public Long getLocationtime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("92019036", new Object[]{this});
        }
        return 0L;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.lbs.LbsInfoManager
    public double getLongitude() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b61adaee", new Object[]{this})).doubleValue();
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }
}
