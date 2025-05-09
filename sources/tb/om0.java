package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class om0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989896);
    }

    public static JSONObject a(kk kkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a0193e4b", new Object[]{kkVar});
        }
        JSONObject b = kkVar.b();
        if (bh.b(b)) {
            return null;
        }
        JSONObject jSONObject = b.getJSONObject("data");
        if (!bh.b(jSONObject) && sl.a(jSONObject)) {
            return jSONObject;
        }
        return null;
    }

    public static boolean b(lo loVar, kk kkVar) {
        AliBuyPresenterImpl aliBuyPresenterImpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("986bd525", new Object[]{loVar, kkVar})).booleanValue();
        }
        if (loVar == null) {
            return false;
        }
        JSONObject a2 = a(kkVar);
        if (bh.b(a2) || (aliBuyPresenterImpl = (AliBuyPresenterImpl) loVar.g(AliBuyPresenterImpl.class.getSimpleName(), AliBuyPresenterImpl.class)) == null) {
            return false;
        }
        aliBuyPresenterImpl.e(a2);
        return true;
    }
}
