package com.taobao.android.order.bundle.ultron.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ReallyPayFiles implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String alipayUrl;
    public String backUrl;
    public boolean canPay;
    public JSONObject cashierParam;
    public String cashierType;
    public ArrayList<String> orderIds;
    public ArrayList<String> orderOutIds;
    public List<String> payPhaseIds;
    public String payType;
    public String reason;
    public String signStr;
    public boolean simplePay;
    public String unSuccessUrl;

    static {
        t2o.a(713031907);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DoPayResult{canPay=" + this.canPay + ", orderOutIds=" + this.orderOutIds + ", orderIds=" + this.orderIds + ", payPhaseIds=" + this.payPhaseIds + ", alipayUrl='" + this.alipayUrl + "', reason='" + this.reason + "', backUrl='" + this.backUrl + "', unSuccessUrl='" + this.unSuccessUrl + "', signStr='" + this.signStr + "', payType='" + this.payType + "', cashierParam='" + this.cashierParam + "', simplePay=" + this.simplePay + '}';
    }
}
