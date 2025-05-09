package com.alibaba.android.icart.core.data.request;

import com.alibaba.android.icart.core.data.config.CartRequestType;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b3o;
import tb.bd4;
import tb.c9x;
import tb.cb4;
import tb.cs1;
import tb.fsb;
import tb.juv;
import tb.o3o;
import tb.s7n;
import tb.sca;
import tb.t2o;
import tb.u55;
import tb.ux;
import tb.vav;
import tb.xap;
import tb.zxb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SendQueryNextPageRequest extends xap {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends o3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ux b;
        public final /* synthetic */ RequestConfig c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ux uxVar, ux uxVar2, RequestConfig requestConfig) {
            super(uxVar);
            this.b = uxVar2;
            this.c = requestConfig;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/request/SendQueryNextPageRequest$2");
        }

        @Override // tb.o3o, tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            ux uxVar = this.b;
            if (uxVar != null) {
                uxVar.a(i, mtopResponse, obj, z, map);
            }
            SendQueryNextPageRequest.this.f21638a.x().Y().e(1, mtopResponse, true);
        }

        @Override // tb.o3o, tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            ux uxVar = this.b;
            if (uxVar != null) {
                uxVar.b(i, mtopResponse, obj, fsbVar, map);
            }
            if (SendQueryNextPageRequest.this.f() && !fsbVar.d()) {
                SendQueryNextPageRequest.this.d.e0(false);
            }
            if (SendQueryNextPageRequest.this.f21638a.K()) {
                SendQueryNextPageRequest.this.f21638a.X(true);
            }
            SendQueryNextPageRequest.this.h(this.c);
        }
    }

    static {
        t2o.a(479199328);
    }

    public SendQueryNextPageRequest(zxb zxbVar) {
        super(zxbVar);
    }

    public static /* synthetic */ Object ipc$super(SendQueryNextPageRequest sendQueryNextPageRequest, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/request/SendQueryNextPageRequest");
    }

    @Override // tb.xap, tb.jod
    public String a(RequestConfig requestConfig, ux uxVar) {
        ArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("523b998e", new Object[]{this, requestConfig, uxVar});
        }
        juv.d(this.d, "Page_ShoppingCart_Query", new String[0]);
        requestConfig.m = vav.a(c9x.CART_BIZ_NAME, "disableDeleteQueryParamForNextQuery", false);
        HashMap<String, String> s = s(requestConfig);
        cs1 w = w();
        fsb c = this.f21638a.c();
        u55 u55Var = (u55) this.f21638a.c();
        if (!requestConfig.p()) {
            arrayList = null;
        } else if (sca.x(this.f21638a)) {
            arrayList = bd4.f(null, (u55) c, cb4.A(this.f21638a));
        } else {
            arrayList = bd4.f(null, (u55) c, cb4.z(this.f21638a.c()));
        }
        this.c.g(arrayList);
        c.g(this.c);
        w.a(new HashMap<String, String>(u55Var.v().a(u55Var, null), s) { // from class: com.alibaba.android.icart.core.data.request.SendQueryNextPageRequest.1
            public final /* synthetic */ HashMap val$params;
            public final /* synthetic */ String val$protocolData;

            {
                this.val$protocolData = r2;
                this.val$params = s;
                put("params", r2);
                put("feature", "{\"gzip\":\"true\"}");
                if (s != null) {
                    putAll(s);
                }
            }
        });
        this.f21638a.B().R(true);
        this.f21638a.B().F(cb4.C(c));
        u55 u55Var2 = (u55) c;
        JSONObject M = u55Var2.M();
        w.h(new a(uxVar, uxVar, requestConfig), c, requestConfig.g());
        u55Var2.E0(M);
        return w.f();
    }

    public final cs1 w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cs1) ipChange.ipc$dispatch("82f64275", new Object[]{this});
        }
        b3o t = t();
        zxb zxbVar = this.f21638a;
        s7n s7nVar = new s7n(zxbVar, zxbVar.x().getContext(), t, CartRequestType.queryNextPage);
        s7nVar.c().x(true);
        return s7nVar;
    }
}
