package com.alibaba.android.nextrpc.stream.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.Serializable;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class StreamNextRpcRequest implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    private double allTimeOutSeconds;
    private MtopBusiness mtopBusiness;

    public StreamNextRpcRequest(MtopBusiness mtopBusiness) {
        this.allTimeOutSeconds = 30.0d;
        this.mtopBusiness = mtopBusiness;
    }

    public double getAllTimeOutSeconds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("806693e", new Object[]{this})).doubleValue();
        }
        return this.allTimeOutSeconds;
    }

    public MtopBusiness getMtopBusiness() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("7f3ef02f", new Object[]{this});
        }
        return this.mtopBusiness;
    }

    public void setAllTimeOutSeconds(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0abcfa", new Object[]{this, new Double(d)});
        } else {
            this.allTimeOutSeconds = d;
        }
    }

    public void setMtopBusiness(MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811e5e0f", new Object[]{this, mtopBusiness});
        } else {
            this.mtopBusiness = mtopBusiness;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "StreamNextRpcRequest [allTimeOutSeconds=" + this.allTimeOutSeconds + ']';
    }

    public StreamNextRpcRequest(MtopBusiness mtopBusiness, double d) {
        this(mtopBusiness);
        if (d > vu3.b.GEO_NOT_SUPPORT) {
            this.allTimeOutSeconds = d;
        }
    }
}
