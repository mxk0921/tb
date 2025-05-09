package com.zoloz.zhub.common.factor.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class FactorNextRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String hummerId = "";
    public Integer nextIndex = 0;
    public Map<String, Object> params = new HashMap();
    public String bizId = "";
    public String versionToken = "";
    public List<Map<String, String>> zStack = new ArrayList();

    static {
        t2o.a(245366990);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FactorNextRequest{hummerId = " + this.hummerId + ", nextIndex = " + this.nextIndex + ", bizId = " + this.bizId + ", versionToken = " + this.versionToken + ", zStack = " + this.zStack.toString() + ", params = " + this.params.toString() + '}';
    }
}
