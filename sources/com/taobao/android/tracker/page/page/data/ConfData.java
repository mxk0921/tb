package com.taobao.android.tracker.page.page.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ConfData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String intercept;
    private String rule;

    static {
        t2o.a(455082026);
    }

    public String getIntercept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33d9c6d", new Object[]{this});
        }
        return this.intercept;
    }

    public String getRule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2b8aac7", new Object[]{this});
        }
        return this.rule;
    }

    public void setIntercept(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b3ad11", new Object[]{this, str});
        } else {
            this.intercept = str;
        }
    }

    public void setRule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8dbee8f", new Object[]{this, str});
        } else {
            this.rule = str;
        }
    }
}
