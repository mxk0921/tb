package com.taobao.android.ultron.datamodel.imp;

import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.ErrorConstants;
import java.util.List;
import tb.eav;
import tb.f4w;
import tb.f9v;
import tb.hav;
import tb.j5e;
import tb.lbq;
import tb.q8v;
import tb.r7v;
import tb.t2o;
import tb.u55;
import tb.xh8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f9874a;
        public final List<IDMComponent> b;

        static {
            t2o.a(83886213);
        }

        public a(boolean z, List<IDMComponent> list) {
            this.f9874a = z;
            this.b = list;
        }

        public List<IDMComponent> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("c9f4973b", new Object[]{this});
            }
            return this.b;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("faac0410", new Object[]{this})).booleanValue();
            }
            return this.f9874a;
        }
    }

    static {
        t2o.a(83886212);
    }

    public static a a(u55 u55Var, JSONObject jSONObject, j5e j5eVar) {
        String str;
        Exception e;
        JSONObject jSONObject2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5eba6663", new Object[]{u55Var, jSONObject, j5eVar});
        }
        if (u55Var == null || u55Var.getBizName() == null) {
            str = "Ultron";
        } else {
            str = u55Var.getBizName();
        }
        try {
            if (u55Var == null || jSONObject == null) {
                return new a(false, null);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("hierarchy");
            if (jSONObject3 == null) {
                return new a(false, null);
            }
            if (!jSONObject3.containsKey("delta") || jSONObject3.get("delta") == null) {
                return new a(false, null);
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT);
            boolean b = eav.b(jSONObject4);
            try {
                if (!b) {
                    return new a(false, null);
                }
                JSONObject jSONObject5 = jSONObject.getJSONObject("data");
                if (jSONObject5 == null) {
                    hav.b(str, "UltronProtocolDeltaMerger", f4w.LOAD_DATA_NULL);
                    return new a(true, null);
                }
                JSONObject jSONObject6 = jSONObject.getJSONObject("linkage");
                JSONObject jSONObject7 = jSONObject.getJSONObject("global");
                JSONObject jSONObject8 = jSONObject3.getJSONObject("structure");
                u55Var.t().clear();
                ParseModule parseModule = (ParseModule) j5eVar;
                parseModule.x(u55Var, jSONObject5);
                JSONObject c0 = u55Var.c0(jSONObject6);
                JSONObject Y = u55Var.Y(jSONObject4);
                JSONObject X = u55Var.X(jSONObject8);
                r7v.a(u55Var, jSONObject);
                JSONObject A = u55Var.A();
                if (A == null) {
                    hav.d("UltronProtocolDeltaMerger", "hierarchy is null");
                    return new a(true, null);
                }
                A.remove("delta");
                u55Var.I().clear();
                u55Var.W(jSONObject5);
                A.put("structure", (Object) X);
                if (eav.a(Y)) {
                    jSONObject2 = q8v.b(jSONObject, jSONObject7, u55Var.i());
                } else {
                    jSONObject2 = u55Var.a0(jSONObject7);
                }
                parseModule.F(u55Var, jSONObject5);
                u55Var.y0(A);
                u55Var.w0(jSONObject2);
                if (c0 == null) {
                    c0 = new JSONObject();
                }
                u55Var.z0(c0);
                u55Var.t0(Y);
                if (Y != null) {
                    u55Var.B0(Y.getString("protocolVersion"));
                }
                parseModule.w(u55Var, jSONObject);
                u55Var.o0(c0.getJSONObject("common"));
                String K = u55Var.K();
                if (TextUtils.isEmpty(K)) {
                    K = A.getString("root");
                }
                if (TextUtils.isEmpty(K)) {
                    ErrorConstants errorConstants = ErrorConstants.PROTOCOL_ROOT_KEY_EMPTY;
                    lbq.a(str, "FullResponseParse", errorConstants.errorCode(), errorConstants.errorMessage());
                    return new a(true, null);
                }
                List<IDMComponent> i = parseModule.i(u55Var, K);
                parseModule.V(u55Var.I().get(K));
                return new a(true, i);
            } catch (Exception e2) {
                e = e2;
                z = b;
                f9v.q(xh8.a(str).c("UltronProtocolDeltaMerger#merge").message(e.getMessage()));
                return new a(z, null);
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}
