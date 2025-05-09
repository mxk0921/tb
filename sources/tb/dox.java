package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class dox implements utc<y64, XslSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993002080);
        t2o.a(993001494);
    }

    private final void n(String str, JSONObject jSONObject, List<isi> list, String str2, XslSearchResult xslSearchResult, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f75c140e", new Object[]{this, str, jSONObject, list, str2, xslSearchResult, jSONObject2});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                BaseTypedBean d = xslSearchResult.c().n().d(jSONArray.getJSONObject(i), xslSearchResult, jSONObject2);
                if (d != null) {
                    list.add(new isi(str2, d, ""));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01df, code lost:
        if (r14 != null) goto L_0x01e6;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(com.taobao.android.searchbaseframe.xsl.module.XslSearchResult r13, com.alibaba.fastjson.JSONObject r14, tb.yko r15) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dox.e(com.taobao.android.searchbaseframe.xsl.module.XslSearchResult, com.alibaba.fastjson.JSONObject, tb.yko):void");
    }
}
