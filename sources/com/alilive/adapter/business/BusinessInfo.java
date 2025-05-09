package com.alilive.adapter.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BusinessInfo implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String channel;
    public boolean mIsJumpGoodsDetail;
    public String mJumpUrl;
    public FissionTcpParam tcp;
    public String isAD = "0";
    public String clickType = "jumpItem";
    public String actionSource = "";

    static {
        t2o.a(806354952);
        t2o.a(806355930);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BusinessInfo{mIsJumpGoodsDetail=" + this.mIsJumpGoodsDetail + ", mJumpUrl='" + this.mJumpUrl + "', mTcpParam=" + this.tcp + '}';
    }
}
