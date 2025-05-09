package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.upp.UppProtocolImpl;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a0i extends r30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809842);
    }

    public a0i(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(a0i a0iVar, String str, Object... objArr) {
        if (str.hashCode() == -1062072309) {
            super.e((imn) objArr[0], (JSONObject) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/newface/subcontainer/cn/MainLandSubContainerDataProcess");
    }

    @Override // tb.r30
    public void e(imn imnVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b2100b", new Object[]{this, imnVar, jSONObject});
            return;
        }
        super.e(imnVar, jSONObject);
        vqa e = vqa.k().i("MTopRequest").j(fdv.F_DATA_PROCESS).e("MainLandSubContainerDataProcess;");
        e.g("requestType", jSONObject.getString("requestType"));
        AwesomeGetContainerData u = imnVar.u(yyj.e().k());
        if (u == null) {
            e.g("containerData", "null").a();
            return;
        }
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = u.base;
        if (awesomeGetContainerInnerData != null && (jSONObject2 = awesomeGetContainerInnerData.ext) != null && awesomeGetContainerInnerData.dataChange && awesomeGetContainerInnerData.isFirstPage) {
            awesomeGetContainerInnerData.infoFlowCardStartBizCode = jSONObject2.getString("feedsStartSectionBizCode");
            e.g("infoFlowCardStartBizCode", u.base.infoFlowCardStartBizCode);
            JSONObject jSONObject3 = u.base.ext.getJSONObject("ucpConfig");
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            phg.b("addBizFeatures");
            UppProtocolImpl.getInstance().addBizFeatures(jSONObject3, "Page_Home_Sub");
            phg.a("addBizFeatures");
            e.g("ucpConfig content ", jSONObject3.toString());
        }
        phg.b("uploadEvent");
        e.a();
        phg.a("uploadEvent");
    }
}
