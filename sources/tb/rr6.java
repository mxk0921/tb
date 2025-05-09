package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.data.BaseMmAdModel;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rr6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_BANNER = "banner";
    public static final String TYPE_FEEDS = "feeds";
    public static final String TYPE_POPVIEW = "popView";
    public static final String TYPE_SEARCHTEXT = "searchText";

    static {
        t2o.a(573571131);
    }

    public String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dabbd871", new Object[]{this, jSONObject});
        }
        for (String str : Arrays.asList("feeds", "searchText", TYPE_BANNER, TYPE_POPVIEW)) {
            if (jSONObject.getJSONObject(str) != null) {
                return str;
            }
        }
        return null;
    }

    public BaseMmAdModel b(JSONObject jSONObject) {
        BaseMmAdModel baseMmAdModel;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseMmAdModel) ipChange.ipc$dispatch("e9b1a7c6", new Object[]{this, jSONObject});
        }
        try {
            baseMmAdModel = (BaseMmAdModel) JSON.parseObject(jSONObject.toJSONString(), BaseMmAdModel.class);
        } catch (Exception e2) {
            e = e2;
            baseMmAdModel = null;
        }
        try {
            baseMmAdModel.currentCountdownTime = baseMmAdModel.waitTime;
        } catch (Exception e3) {
            e = e3;
            jgh.b("DataParser", "BaseMmAdModel parse error", e);
            return baseMmAdModel;
        }
        return baseMmAdModel;
    }
}
