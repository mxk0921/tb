package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.loader.config.ConfigItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oal implements atd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_CODE = "1";
    public static final String ERROR_MSG = "config is empty";

    /* renamed from: a  reason: collision with root package name */
    public static List<ConfigItem> f25260a;

    static {
        t2o.a(806355037);
        t2o.a(806355036);
    }

    public void a(dg4 dg4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6b4670", new Object[]{this, dg4Var});
            return;
        }
        List<ConfigItem> list = f25260a;
        if (list == null || ((ArrayList) list).isEmpty()) {
            String b = v2s.o().p().b("tblive", "componentStrategyConfig", "");
            if (!TextUtils.isEmpty(b)) {
                try {
                    JSONObject parseObject = JSON.parseObject(b);
                    if (parseObject != null) {
                        JSONArray jSONArray = parseObject.getJSONArray("components");
                        ArrayList arrayList = new ArrayList();
                        if (!(jSONArray == null || jSONArray.isEmpty())) {
                            for (int i = 0; i < jSONArray.size(); i++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i);
                                ConfigItem configItem = new ConfigItem();
                                configItem.component = jSONObject.getString("component");
                                configItem.delay = jSONObject.getLong("delay").longValue();
                                arrayList.add(configItem);
                            }
                            f25260a = arrayList;
                            ((ecp) dg4Var).s(arrayList);
                        }
                    }
                } catch (Exception e) {
                    o3s.b("OrangeStrategyConfig", "OrangeStrategyConfig.load : " + e.getMessage());
                    ((ecp) dg4Var).r("1", e.getMessage());
                }
            } else {
                ((ecp) dg4Var).r("1", ERROR_MSG);
            }
        } else {
            ((ecp) dg4Var).s(f25260a);
        }
    }
}
