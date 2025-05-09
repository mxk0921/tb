package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class o4n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705566);
    }

    public static final List<String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2babf99", new Object[]{map});
        }
        ArrayList arrayList = new ArrayList();
        if (!map.isEmpty()) {
            String str = map.get("umi_edit_session");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (TextUtils.isEmpty(str) || !TextUtils.equals(l4n.f23108a, key)) {
                    arrayList.add(key + '=' + value);
                } else {
                    arrayList.add(key + '=' + str);
                }
            }
        }
        return arrayList;
    }

    public static final void b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("305431da", new Object[]{jSONObject, str});
            return;
        }
        ckf.g(str, "contentId");
        if (jSONObject != null) {
            Map<String, String> o = qrf.o(jSONObject);
            ckf.f(o, "JSONUtil.json2Map(urlParamsJson)");
            List<String> a2 = a(o);
            a2.add(z9u.ARG_CONTENT_ID.concat(str));
            Object[] array = a2.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                TBS.Ext.commitEvent("Page_UmiPublish", 2101, "Page_UmiPublish_ContentPubSuccess", null, null, (String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
