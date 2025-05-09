package com.taobao.android.trade.component.data;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.component.data.Component;
import java.util.Iterator;
import java.util.Map;
import tb.ne8;
import tb.sb4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final sb4 f9686a;

    static {
        t2o.a(758120458);
    }

    public a(sb4 sb4Var) {
        this.f9686a = sb4Var;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b807a61f", new Object[]{this, jSONObject});
            return;
        }
        ne8 ne8Var = this.f9686a.f27925a;
        new StringBuilder("Linkage Before Replacing: \n").append(ne8Var.c);
        JSONObject jSONObject2 = jSONObject.getJSONObject("linkage");
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                if (TextUtils.equals(entry.getKey(), "common")) {
                    JSONObject jSONObject3 = (JSONObject) entry.getValue();
                    if (jSONObject3 != null) {
                        JSONObject jSONObject4 = ne8Var.d;
                        if (jSONObject4 != null) {
                            for (Map.Entry<String, Object> entry2 : jSONObject3.entrySet()) {
                                jSONObject4.put(entry2.getKey(), entry2.getValue());
                            }
                        } else {
                            ne8Var.d = jSONObject3;
                        }
                    }
                } else {
                    ne8Var.c.put(entry.getKey(), entry.getValue());
                }
            }
        }
        new StringBuilder("Linkage After Replacing: \n").append(ne8Var.c);
        b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b025b0a", new Object[]{this});
            return;
        }
        ne8 b = this.f9686a.b();
        b.e = b.c.getJSONArray("request");
        b.c.getJSONArray("input");
        if (b.e == null) {
            b.e = new JSONArray(4);
        }
        Iterator<Object> it = b.e.iterator();
        while (it.hasNext()) {
            Component component = b.g.get((String) it.next());
            if (component != null) {
                component.n(Component.LinkageType.REQUEST);
            }
        }
    }
}
