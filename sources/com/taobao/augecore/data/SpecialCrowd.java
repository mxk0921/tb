package com.taobao.augecore.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SpecialCrowd implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String lowbuyer;

    public String getLowbuyer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccf295c4", new Object[]{this});
        }
        return this.lowbuyer;
    }

    public void setLowbuyer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c3d7d32", new Object[]{this, str});
        } else {
            this.lowbuyer = str;
        }
    }
}
