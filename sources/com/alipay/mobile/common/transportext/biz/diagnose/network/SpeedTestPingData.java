package com.alipay.mobile.common.transportext.biz.diagnose.network;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SpeedTestPingData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int seq = -1;
    public String ip = null;
    public int ttl = 0;
    public float time = 0.0f;
    public String data = null;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str = "";
        StringBuilder sb = new StringBuilder();
        sb.append(str + this.seq);
        sb.append(";");
        String str2 = this.ip;
        if (str2 != null) {
            str = str2;
        }
        sb.append(str);
        return (sb.toString() + ";" + this.ttl) + ";" + this.time;
    }
}
