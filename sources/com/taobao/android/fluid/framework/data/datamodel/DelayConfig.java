package com.taobao.android.fluid.framework.data.datamodel;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DelayConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean enableDelayInit = true;
    public final String delayInitTime = "1";
    public final String defaultTimeOut = "3000";

    static {
        t2o.a(468714186);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DelayConfig{enableDelayInit=true, delayInitTime='1', defaultTimeOut='3000'}";
    }
}
