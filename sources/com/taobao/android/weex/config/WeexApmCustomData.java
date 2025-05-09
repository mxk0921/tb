package com.taobao.android.weex.config;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexApmCustomData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long wxCustomContainerStartTimeStamp;
    private long wxCustomStartTimeStamp;
    private String wxRumPageType;

    static {
        t2o.a(982515860);
    }

    public long getWxCustomContainerStartTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38450f48", new Object[]{this})).longValue();
        }
        return this.wxCustomContainerStartTimeStamp;
    }

    public long getWxCustomStartTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70ad0677", new Object[]{this})).longValue();
        }
        return this.wxCustomStartTimeStamp;
    }

    public String getWxRumPageType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48d472bd", new Object[]{this});
        }
        return this.wxRumPageType;
    }

    public void setWxCustomContainerStartTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c68e8fc", new Object[]{this, new Long(j)});
        } else {
            this.wxCustomContainerStartTimeStamp = j;
        }
    }

    public void setWxCustomStartTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0c4c15", new Object[]{this, new Long(j)});
        } else {
            this.wxCustomStartTimeStamp = j;
        }
    }

    public void setWxRumPageType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("659c6c1", new Object[]{this, str});
        } else {
            this.wxRumPageType = str;
        }
    }
}
