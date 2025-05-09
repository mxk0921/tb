package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nm1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750513);
    }

    public static ly1 a(ly1 ly1Var, JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("77029d1a", new Object[]{ly1Var, jSONObject, map});
        }
        if (ly1Var == null) {
            return null;
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            String string = jSONObject.getString("actionType");
            if (TextUtils.isEmpty(string)) {
                return ly1Var;
            }
            ly1Var.f23634a = jSONObject.getLongValue("seqId");
            ly1Var.d = jSONObject.getString("scene");
            ly1Var.b = jSONObject.getString("sessionId");
            ly1Var.c = jSONObject.getString("bizId");
            ly1Var.e = jSONObject.getLongValue("createTime");
            ly1Var.f = jSONObject.getLongValue(StWindow.UPDATE_TIME);
            ly1Var.g = jSONObject.getString("userId");
            if ("scrollStart".equals(string) || "scrollEnd".equals(string)) {
                ly1Var.h = "scroll";
            } else if ("exposeStart".equals(string) || "exposeEnd".equals(string)) {
                ly1Var.h = "expose";
            } else {
                ly1Var.h = string;
            }
            ly1Var.i = jSONObject.getString("actionName");
            ly1Var.j = jSONObject.getLongValue("actionDuration");
            ly1Var.k = jSONObject.getString("actionArgs");
            ly1Var.l = jSONObject.getString("bizArgs");
            ly1Var.m = jSONObject.getString("fromScene");
            ly1Var.n = jSONObject.getString("toScene");
            ly1Var.o = jSONObject.getString("reserve1");
            ly1Var.p = jSONObject.getString("reserve2");
            ly1Var.q = jSONObject.getString("periodSessionId");
            ly1Var.s = jSONObject.getBooleanValue(yj4.PARAM_IS_FIRST_ENTER);
            ly1Var.r = jSONObject.getJSONObject("actionArgs");
            ly1Var.a();
            if (map != null && !map.isEmpty()) {
                ly1Var.u = map;
                if (!gwv.C()) {
                    ly1Var.t = hqv.b(ly1Var.u);
                }
            }
        }
        return ly1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f5, code lost:
        if (r5.equals("exposeStart") == false) goto L_0x0028;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.ly1 b(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nm1.b(java.lang.String):tb.ly1");
    }
}
