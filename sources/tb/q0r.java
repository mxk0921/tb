package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class q0r implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "switchMainImage";

    static {
        t2o.a(912261949);
        t2o.a(912261826);
    }

    public q0r(Context context, ze7 ze7Var) {
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        oa4 i;
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null || (i = yc4.i(runtimeAbilityParamArr)) == null || (f = i.getComponentData().f()) == null) {
            return false;
        }
        String string = a2.getString("imageUrl");
        f.put("mainImageUrl", (Object) string);
        JSONArray jSONArray = f.getJSONArray(Constants.Name.Recycler.LIST_DATA);
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (jSONObject != null) {
                    if (TextUtils.equals(jSONObject.getString("imageUrl"), string)) {
                        jSONObject.put(ThemisConfig.SCENE_SELECT, (Object) "true");
                    } else {
                        jSONObject.put(ThemisConfig.SCENE_SELECT, (Object) "false");
                    }
                }
            }
        }
        i.updateComponent();
        return true;
    }
}
