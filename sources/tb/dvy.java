package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.component.revisitedu.data.RevisitEduDialogModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class dvy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final dvy INSTANCE = new dvy();

    static {
        t2o.a(689963104);
    }

    public final RevisitEduDialogModel.a b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RevisitEduDialogModel.a) ipChange.ipc$dispatch("bb30fc0c", new Object[]{this, jSONObject});
        }
        Object obj = jSONObject.get("educationTitle");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        Object obj2 = jSONObject.get("educationPicUrl");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        Object obj3 = jSONObject.get("educationButtonText");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        String str3 = (String) obj3;
        if (str != null && str2 != null && str3 != null) {
            return new RevisitEduDialogModel.a(new RevisitEduDialogModel.a.e(new RevisitEduDialogModel.a.d(str)), new RevisitEduDialogModel.a.b(new RevisitEduDialogModel.a.c(str2)), new RevisitEduDialogModel.a.C0667a(new RevisitEduDialogModel.a.d(str3)));
        }
        vgh.c(this, "RevisitEduDialogResponseDataProcessor", "解析为回访教育弹窗View模型实体，firstFrameData中相关字段为空");
        return null;
    }

    public final RevisitEduDialogModel a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RevisitEduDialogModel) ipChange.ipc$dispatch("92173dc4", new Object[]{this, jSONObject});
        }
        List list = null;
        if (jSONObject == null) {
            vgh.c(this, "RevisitEduDialogResponseDataProcessor", "解析返回数据，data为空");
            return null;
        }
        Object obj = jSONObject.get("models");
        if (!(obj instanceof JSONArray)) {
            obj = null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (jSONArray == null || jSONArray.isEmpty()) {
            vgh.c(this, "RevisitEduDialogResponseDataProcessor", "解析返回数据，models为空");
            return null;
        }
        Object obj2 = jSONArray.get(0);
        if (!(obj2 instanceof JSONObject)) {
            obj2 = null;
        }
        JSONObject jSONObject2 = (JSONObject) obj2;
        if (jSONObject2 == null) {
            vgh.c(this, "RevisitEduDialogResponseDataProcessor", "解析返回数据，firstModel为空");
            return null;
        }
        Object obj3 = jSONObject2.get("data");
        if (!(obj3 instanceof JSONObject)) {
            obj3 = null;
        }
        JSONObject jSONObject3 = (JSONObject) obj3;
        if (jSONObject3 == null) {
            vgh.c(this, "RevisitEduDialogResponseDataProcessor", "解析返回数据，firstModelData为空");
            return null;
        }
        Object obj4 = jSONObject3.get("frameList");
        if (!(obj4 instanceof JSONArray)) {
            obj4 = null;
        }
        JSONArray jSONArray2 = (JSONArray) obj4;
        if (jSONArray2 == null || jSONArray2.isEmpty()) {
            vgh.c(this, "RevisitEduDialogResponseDataProcessor", "解析返回数据，frameList为空");
            return null;
        }
        Object obj5 = jSONArray2.get(0);
        if (!(obj5 instanceof JSONObject)) {
            obj5 = null;
        }
        JSONObject jSONObject4 = (JSONObject) obj5;
        if (jSONObject4 == null) {
            vgh.c(this, "RevisitEduDialogResponseDataProcessor", "解析返回数据，firstFrame为空");
            return null;
        }
        Object obj6 = jSONObject4.get("data");
        if (!(obj6 instanceof JSONObject)) {
            obj6 = null;
        }
        JSONObject jSONObject5 = (JSONObject) obj6;
        if (jSONObject5 == null) {
            vgh.c(this, "RevisitEduDialogResponseDataProcessor", "解析返回数据，firstFrameData为空");
            return null;
        }
        RevisitEduDialogModel.a b = b(jSONObject5);
        if (b == null) {
            vgh.c(this, "RevisitEduDialogResponseDataProcessor", "解析返回数据，revisitEduDialogPopViewModel为空");
            return null;
        }
        Object obj7 = jSONObject5.get("validTabList");
        if (!(obj7 instanceof JSONArray)) {
            obj7 = null;
        }
        JSONArray jSONArray3 = (JSONArray) obj7;
        if (jSONArray3 != null) {
            list = i04.B0(jSONArray3);
        }
        return new RevisitEduDialogModel(b, list);
    }

    public final boolean c(RevisitEduDialogModel revisitEduDialogModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89ae2a3d", new Object[]{this, revisitEduDialogModel})).booleanValue();
        }
        if (revisitEduDialogModel == null) {
            vgh.c(this, "RevisitEduDialogResponseDataProcessor", "验证回访教育弹窗数据有效性，revisitEduDialogModel为空");
            return false;
        }
        RevisitEduDialogModel.a revisitEduDialogPopViewModel = revisitEduDialogModel.getRevisitEduDialogPopViewModel();
        if (revisitEduDialogPopViewModel.c().a().a().length() != 0 && revisitEduDialogPopViewModel.b().a().a().length() != 0 && revisitEduDialogPopViewModel.a().a().a().length() != 0) {
            return true;
        }
        vgh.c(this, "RevisitEduDialogResponseDataProcessor", "验证回访教育弹窗数据有效性，revisitEduDialogPopViewModel中相关字段为空");
        return false;
    }
}
