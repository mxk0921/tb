package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbelder.TBElder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uot implements e0e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502267967);
        t2o.a(503316605);
    }

    public static Map c(a3w a3wVar) {
        t1c t1cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("baa9ca6", new Object[]{a3wVar});
        }
        JSONObject jSONObject = new JSONObject();
        if (a3wVar == null && (t1cVar = (t1c) n78.a(t1c.class)) != null) {
            a3wVar = t1cVar.queryCurrentVersionInfo();
        }
        if (a3wVar != null) {
            jSONObject.put((JSONObject) "dataVersion", a3wVar.f15531a);
            jSONObject.put((JSONObject) "versionCode", a3wVar.c);
            jSONObject.put((JSONObject) "activeType", a3wVar.d);
            jSONObject.put((JSONObject) "groupCode", a3wVar.b);
            jSONObject.put((JSONObject) "bizParams", (String) a3wVar.e);
        }
        return jSONObject;
    }

    @Override // tb.e0e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4e0938b", new Object[]{this})).booleanValue();
        }
        return TBElder.b();
    }

    @Override // tb.e0e
    public double b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a250d10b", new Object[]{this, context})).doubleValue();
        }
        return 1.0d;
    }

    @Override // tb.e0e
    public String getVersionCode() {
        a3w queryCurrentVersionInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e5608aa", new Object[]{this});
        }
        t1c t1cVar = (t1c) n78.a(t1c.class);
        if (t1cVar == null || (queryCurrentVersionInfo = t1cVar.queryCurrentVersionInfo()) == null) {
            return null;
        }
        return queryCurrentVersionInfo.c;
    }

    @Override // tb.e0e
    public Map v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("890195fa", new Object[]{this});
        }
        return c(null);
    }
}
