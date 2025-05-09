package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.substitute.api.Constants;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.relation.DaifuBusiness;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class doj implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NavRelationDaifuUrlProcessor";

    public doj() {
        TLog.logd(TAG, "开关状态" + ef4.a());
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return TAG;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        if (ef4.a()) {
            return false;
        }
        return true;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (intent == null || intent.getData() == null) {
            return false;
        }
        Uri data = intent.getData();
        String queryParameter = data.getQueryParameter("userId");
        String queryParameter2 = data.getQueryParameter("daifuUserId");
        String queryParameter3 = data.getQueryParameter(Constants.BUNDLE_KEY_TRADE_NO);
        String queryParameter4 = data.getQueryParameter("orderId");
        String queryParameter5 = data.getQueryParameter(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT);
        String queryParameter6 = data.getQueryParameter("title");
        String queryParameter7 = data.getQueryParameter(SubstituteConstants.KEY_SUBSTITUTE_PAY_PAYURL);
        String queryParameter8 = data.getQueryParameter("itemPicUrl");
        if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2) || TextUtils.isEmpty(queryParameter3) || TextUtils.isEmpty(queryParameter4) || TextUtils.isEmpty(queryParameter5) || TextUtils.isEmpty(queryParameter7)) {
            TLog.loge(TAG, "https://tb.cn/n/im/biz/order attach empty parameter");
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT, (Object) Uri.decode(queryParameter5));
        jSONObject.put("totalFee", (Object) Uri.decode(queryParameter5));
        jSONObject.put("senderId", (Object) queryParameter);
        jSONObject.put("userId", (Object) queryParameter);
        jSONObject.put("daifuUserId", (Object) queryParameter2);
        jSONObject.put("receiverId", (Object) queryParameter2);
        jSONObject.put(Constants.BUNDLE_KEY_TRADE_NO, (Object) queryParameter3);
        jSONObject.put("orderId", (Object) queryParameter4);
        jSONObject.put("ccode", (Object) lo6.b(queryParameter, queryParameter2, 0));
        jSONObject.put("title", (Object) queryParameter6);
        jSONObject.put("actionUrl", (Object) Uri.decode(queryParameter7));
        jSONObject.put("itemPicUrl", (Object) queryParameter8);
        new DaifuBusiness().c(jSONObject);
        return false;
    }
}
