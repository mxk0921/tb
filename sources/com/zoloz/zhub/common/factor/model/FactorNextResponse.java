package com.zoloz.zhub.common.factor.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class FactorNextResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Integer nextIndex;
    public String versionToken = "";
    public List<FactorNextResponseInner> response = new ArrayList();
    public List<Map<String, String>> zStack = new ArrayList();

    static {
        t2o.a(245366991);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FactorNextResponse{nextIndex = " + this.nextIndex + ", versionToken = " + this.versionToken + ", response = " + this.response.toString() + ", zStack = " + this.zStack.toString() + '}';
    }
}
