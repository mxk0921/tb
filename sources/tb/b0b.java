package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b0b implements hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809372);
        t2o.a(729809365);
    }

    @Override // tb.hdc
    public boolean e(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        return a(wVCallBackContext);
    }

    @Override // tb.hdc
    public List<String> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return Collections.singletonList("getCardPopInfo");
    }

    public final boolean a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91545381", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        vqa e = vqa.k().i("Bridge").j("getCardPopInfo").e("homepage.HomePageWVPlugin.getCardPopInfo");
        imn d = zza.d(null);
        if (d == null) {
            wVCallBackContext.error("首页dataSource信息为空");
            e.e("首页dataSource信息为空").a();
            return false;
        }
        AwesomeGetContainerInnerData q = d.q(yyj.l().f32522a);
        if (q != null) {
            return b(q, wVCallBackContext, e);
        }
        wVCallBackContext.error("首页子容器信息为null");
        e.e("首页子容器信息为null").a();
        return false;
    }

    public final boolean b(AwesomeGetContainerInnerData awesomeGetContainerInnerData, WVCallBackContext wVCallBackContext, vqa vqaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ebe9629", new Object[]{this, awesomeGetContainerInnerData, wVCallBackContext, vqaVar})).booleanValue();
        }
        if (awesomeGetContainerInnerData == null) {
            wVCallBackContext.error("信息流的pop信息获取失败");
            vqaVar.g("AwesomeGetContainerInnerData", "null").e("信息流的pop信息获取失败").a();
            return false;
        }
        JSONObject jSONObject = awesomeGetContainerInnerData.extSections;
        if (jSONObject == null || jSONObject.getJSONObject(PopStrategy.IDENTIFIER_POPLAYER) == null) {
            wVCallBackContext.error("信息流的pop信息获取失败");
            vqaVar.g("extSections", "null").e("信息流的pop信息获取失败").a();
            return false;
        }
        JSONObject jSONObject2 = awesomeGetContainerInnerData.extSections.getJSONObject(PopStrategy.IDENTIFIER_POPLAYER);
        if (jSONObject2 == null) {
            wVCallBackContext.error("信息流的pop信息获取失败");
            vqaVar.g("popSection", "null").e("信息流的pop信息获取失败").a();
            return false;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("item");
        if (jSONObject3 == null) {
            wVCallBackContext.error("信息流的pop信息获取失败");
            vqaVar.g("item", "null").e("信息流的pop信息获取失败").a();
            return false;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject(PopStrategy.IDENTIFIER_POPLAYER);
        nsw nswVar = new nsw();
        nswVar.a(PopStrategy.IDENTIFIER_POPLAYER, jSONObject4);
        wVCallBackContext.success(nswVar);
        vqaVar.e("信息流pop信息获取success").a();
        return true;
    }
}
