package com.taobao.login4android.membercenter.bind;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BindParam implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -3090063464818391781L;
    public String apdid;
    public String appId;
    public String appKey;
    public String bizSence;
    public String signData;

    static {
        t2o.a(70254963);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return z9u.ARG_TAOKE_BIZSCENE + this.bizSence + "&signData=" + this.signData + "&appKey=" + this.appKey + "&appId=" + this.appId + "&apdid=" + this.apdid;
    }
}
