package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dojo.ability.log.ModuleName;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mr6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782442);
    }

    public static JSONArray a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("11ac02ef", new Object[]{iContainerDataModel});
        }
        JSONArray jSONArray = new JSONArray();
        if (iContainerDataModel == null) {
            sdh.b(ModuleName.PRELOAD_ABILITY, "dataModel == null");
            return jSONArray;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            sdh.b(ModuleName.PRELOAD_ABILITY, "base == null");
            return jSONArray;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            sdh.b(ModuleName.PRELOAD_ABILITY, "ext == null");
            return jSONArray;
        }
        String string = ext.getString("hasCouponSectionBizCode");
        if (TextUtils.isEmpty(string)) {
            sdh.b(ModuleName.PRELOAD_ABILITY, "isHasCoupon == null");
            return jSONArray;
        }
        try {
            return JSON.parseArray(string);
        } catch (Exception e) {
            sdh.a(ModuleName.PRELOAD_ABILITY, "parseException", "getHasCouponSectionBizCode Exception：" + e);
            return jSONArray;
        }
    }
}
