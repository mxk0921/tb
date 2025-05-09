package com.alibaba.evo.internal.bucketing.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ExperimentVariationConfigV5 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String scope;

    static {
        t2o.a(961544222);
    }

    public String getScope() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6e9f91b", new Object[]{this});
        }
        return this.scope;
    }

    public boolean isSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ca57e89", new Object[]{this})).booleanValue();
        }
        return "app".equals(this.scope);
    }

    public void setScope(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b32dc023", new Object[]{this, str});
        } else {
            this.scope = str;
        }
    }
}
