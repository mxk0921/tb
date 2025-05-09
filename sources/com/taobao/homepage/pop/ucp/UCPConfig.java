package com.taobao.homepage.pop.ucp;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.j3e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UCPConfig implements j3e, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bizCode;
    public boolean enable;
    public String popType;

    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return this.bizCode;
    }

    @Override // tb.j3e
    public boolean enable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6308e", new Object[]{this})).booleanValue();
        }
        return this.enable;
    }

    public String popType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c10482ae", new Object[]{this});
        }
        return this.popType;
    }
}
