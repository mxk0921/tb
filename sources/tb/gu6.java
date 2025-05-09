package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.refactor.MSController;
import com.taobao.search.sf.context.CommonSearchContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gu6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        jrh d(boolean z);
    }

    static {
        t2o.a(815793396);
    }

    public static jrh a(boolean z, CommonSearchContext commonSearchContext, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jrh) ipChange.ipc$dispatch("c32d554a", new Object[]{new Boolean(z), commonSearchContext, aVar});
        }
        Map<String, String> paramsSnapshot = commonSearchContext.getParamsSnapshot();
        c11 c = c(paramsSnapshot);
        jrh d = aVar.d(z);
        d.Q(c);
        if (z) {
            d.setParams(paramsSnapshot);
            d.g();
            d.a();
        } else {
            d.setParams(commonSearchContext.getOtherTabParams());
        }
        return d;
    }

    public static jrh b(boolean z, CommonSearchContext commonSearchContext, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jrh) ipChange.ipc$dispatch("65c6175f", new Object[]{new Boolean(z), commonSearchContext, ykoVar});
        }
        return a(z, commonSearchContext, new MSController(ykoVar));
    }

    public static c11 c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c11) ipChange.ipc$dispatch("49ed2674", new Object[]{map});
        }
        if (map == null) {
            return c11.a();
        }
        String remove = map.remove("apiInfo");
        if (TextUtils.isEmpty(remove)) {
            return c11.a();
        }
        try {
            JSONObject parseObject = JSON.parseObject(remove);
            c11 c11Var = new c11();
            c11Var.f16765a = parseObject.getString("apiName");
            c11Var.b = parseObject.getString("apiVersion");
            c11Var.c = "wsearch";
            return c11Var;
        } catch (Exception unused) {
            return c11.a();
        }
    }
}
