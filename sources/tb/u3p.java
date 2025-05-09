package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u3p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29123a;
    public List<String> b = new ArrayList();
    public String c;

    static {
        t2o.a(912262623);
    }

    public static u3p a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3p) ipChange.ipc$dispatch("a826e8a3", new Object[]{mtopResponse});
        }
        try {
            JSONObject jSONObject = JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
            if (jSONObject == null) {
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("searchInfo");
            JSONObject jSONObject3 = jSONObject.getJSONObject("searchInfoList");
            if (jSONObject3 != null) {
                u3p u3pVar = new u3p();
                u3pVar.f29123a = jSONObject3.getString("url");
                jSONObject3.getString("utParams");
                u3pVar.c = jSONObject.getString(h1p.KEY_SUGGEST_RN);
                JSONArray jSONArray = jSONObject3.getJSONArray("searchtextList");
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        u3pVar.b.add(jSONArray.getString(i));
                    }
                } else {
                    u3pVar.b = null;
                }
                return u3pVar;
            } else if (jSONObject2 == null) {
                return null;
            } else {
                u3p u3pVar2 = new u3p();
                u3pVar2.f29123a = jSONObject2.getString("url");
                jSONObject2.getString("utParams");
                u3pVar2.c = jSONObject.getString(h1p.KEY_SUGGEST_RN);
                String string = jSONObject2.getString("searchtext");
                if (string != null) {
                    u3pVar2.b.add(string);
                } else {
                    u3pVar2.b = null;
                }
                return u3pVar2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
