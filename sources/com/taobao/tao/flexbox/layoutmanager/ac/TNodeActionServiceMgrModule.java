package com.taobao.tao.flexbox.layoutmanager.ac;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.l;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TNodeActionServiceMgrModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316562);
        t2o.a(503316559);
    }

    public static void report(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74733dd8", new Object[]{jVar});
            return;
        }
        o oVar = jVar.f11976a;
        l.e(oVar, (Map) jVar.b, oVar.d0());
    }

    public static void cb(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e638350d", new Object[]{jVar});
            return;
        }
        JSONObject jSONObject = (JSONObject) jVar.b;
        int intValue = jSONObject.getInteger("methodId").intValue();
        Object obj = jSONObject.get("data");
        Object obj2 = jSONObject.get("error");
        boolean booleanValue = jSONObject.containsKey("retain") ? jSONObject.getBoolean("retain").booleanValue() : false;
        if (obj != null) {
            jVar.f11976a.I().h(intValue, true, obj, booleanValue);
        } else if (obj2 != null) {
            jVar.f11976a.I().h(intValue, false, obj2, booleanValue);
        }
    }
}
