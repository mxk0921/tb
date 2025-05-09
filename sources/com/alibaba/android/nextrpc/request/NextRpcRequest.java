package com.alibaba.android.nextrpc.request;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.Serializable;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NextRpcRequest implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    private double allTimeOutSeconds;
    private AttachedResponseStrategy attachedResponseStrategy;
    private JSONObject clientPerformance;
    private MtopBusiness mtopBusiness;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum AttachedResponseStrategy {
        IMMEDIATELY,
        FULL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static AttachedResponseStrategy getStrategyByOrdinal(int i) {
            AttachedResponseStrategy[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AttachedResponseStrategy) ipChange.ipc$dispatch("ef69ecdb", new Object[]{new Integer(i)});
            }
            for (AttachedResponseStrategy attachedResponseStrategy : values()) {
                if (i == attachedResponseStrategy.ordinal()) {
                    return attachedResponseStrategy;
                }
            }
            return IMMEDIATELY;
        }

        public static /* synthetic */ Object ipc$super(AttachedResponseStrategy attachedResponseStrategy, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/nextrpc/request/NextRpcRequest$AttachedResponseStrategy");
        }

        public static AttachedResponseStrategy valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AttachedResponseStrategy) ipChange.ipc$dispatch("9c58dcc9", new Object[]{str});
            }
            return (AttachedResponseStrategy) Enum.valueOf(AttachedResponseStrategy.class, str);
        }
    }

    public NextRpcRequest(MtopBusiness mtopBusiness, AttachedResponseStrategy attachedResponseStrategy) {
        this.allTimeOutSeconds = 30.0d;
        this.attachedResponseStrategy = AttachedResponseStrategy.IMMEDIATELY;
        this.mtopBusiness = mtopBusiness;
        if (attachedResponseStrategy != null) {
            this.attachedResponseStrategy = attachedResponseStrategy;
        }
    }

    public double getAllTimeOutSeconds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("806693e", new Object[]{this})).doubleValue();
        }
        return this.allTimeOutSeconds;
    }

    public AttachedResponseStrategy getAttachedResponseStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AttachedResponseStrategy) ipChange.ipc$dispatch("e6dec6a5", new Object[]{this});
        }
        return this.attachedResponseStrategy;
    }

    public JSONObject getClientPerformance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b3f976d6", new Object[]{this});
        }
        return this.clientPerformance;
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

    public void setAttachedResponseStrategy(AttachedResponseStrategy attachedResponseStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95b0cdf", new Object[]{this, attachedResponseStrategy});
        } else {
            this.attachedResponseStrategy = attachedResponseStrategy;
        }
    }

    public void setClientPerformance(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3d5206", new Object[]{this, jSONObject});
        } else {
            this.clientPerformance = jSONObject;
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
        return "NextRpcRequest [allTimeOutSeconds=" + this.allTimeOutSeconds + ", attachedResponseStrategy=" + this.attachedResponseStrategy + ']';
    }

    public NextRpcRequest(MtopBusiness mtopBusiness, double d, AttachedResponseStrategy attachedResponseStrategy) {
        this.allTimeOutSeconds = 30.0d;
        this.attachedResponseStrategy = AttachedResponseStrategy.IMMEDIATELY;
        this.mtopBusiness = mtopBusiness;
        if (d > vu3.b.GEO_NOT_SUPPORT) {
            this.allTimeOutSeconds = d;
        }
        if (attachedResponseStrategy != null) {
            this.attachedResponseStrategy = attachedResponseStrategy;
        }
    }
}
