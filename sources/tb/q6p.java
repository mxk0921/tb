package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q6p extends pox {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792302);
    }

    public q6p(yko ykoVar) {
        super(ykoVar);
    }

    public static /* synthetic */ Object ipc$super(q6p q6pVar, String str, Object... objArr) {
        if (str.hashCode() == 1201560773) {
            super.w((XslSearchResult) objArr[0], (JSONObject) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/jarvis/rcmd/SearchXslResultAdapter");
    }

    @Override // tb.pox
    /* renamed from: H */
    public void w(XslSearchResult xslSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("479e5cc5", new Object[]{this, xslSearchResult, jSONObject});
            return;
        }
        super.w(xslSearchResult, jSONObject);
        JSONArray c = h19.c(jSONObject, "result");
        if (c != null && !c.isEmpty()) {
            JSONObject jSONObject2 = c.getJSONObject(0);
            JSONObject jSONObject3 = jSONObject2.getJSONObject("jarvisConfig");
            if (jSONObject3 != null) {
                xslSearchResult.addExtMod("jarvisConfig", jSONObject3.toString());
            }
            String string = jSONObject2.getString("jarvisContext");
            if (!TextUtils.isEmpty(string)) {
                xslSearchResult.addExtMod("jarvisContext", string);
            } else {
                xslSearchResult.popExtMod("jarvisContext");
            }
        }
    }
}
