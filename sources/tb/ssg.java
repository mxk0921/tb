package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.LinkedSplashData;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ssg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<LinkedSplashData> f28248a;
        public final rsg b;

        static {
            t2o.a(736100456);
        }

        public a(List<LinkedSplashData> list, rsg rsgVar) {
            this.f28248a = list;
            this.b = rsgVar;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            if (this.f28248a == null && this.b == null) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(736100455);
    }

    public a a(JSONObject jSONObject) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("32f3d3dd", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return new a(null, null);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        rsg rsgVar = new rsg(jSONObject2);
        JSONArray jSONArray = jSONObject.getJSONArray("sections");
        if (jSONArray == null || jSONArray.isEmpty()) {
            return new a(null, rsgVar);
        }
        List<LinkedSplashData> n = di2.n(jSONArray, jSONObject2);
        if (n.isEmpty()) {
            return new a(null, rsgVar);
        }
        return new a(n, rsgVar);
    }
}
