package com.taobao.tao.flexbox.layoutmanager.core;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.HashMap;
import java.util.Map;
import tb.hk8;
import tb.nwv;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final o f12202a;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.core.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class RunnableC0690a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f12203a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String c;
        public final /* synthetic */ hk8 d;

        public RunnableC0690a(n nVar, Map map, String str, hk8 hk8Var) {
            this.f12203a = nVar;
            this.b = map;
            this.c = str;
            this.d = hk8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap<String, Object> hashMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n g0 = this.f12203a.g0();
            JSONObject jSONObject = new JSONObject();
            r rVar = this.f12203a.c;
            if (!(rVar == null || (hashMap = rVar.n) == null)) {
                jSONObject.put("attrs", (Object) hashMap);
            }
            jSONObject.put("target", (Object) Integer.valueOf(this.f12203a.U()));
            jSONObject.put("time", (Object) Long.valueOf(System.nanoTime()));
            jSONObject.put("params", (Object) this.b);
            jSONObject.put("msg", (Object) this.c);
            jSONObject.put("instanceId", (Object) Integer.valueOf(g0.U()));
            jSONObject.put("tid", (Object) this.f12203a.n0());
            String R = this.f12203a.R();
            jSONObject.put("keypath", (Object) R);
            if (this.f12203a.b0() != null) {
                jSONObject.put("props", (Object) this.f12203a.b0());
            }
            int i = g0.f12238a.n;
            jSONObject.put("version", (Object) Integer.valueOf(i));
            if (i <= 0) {
                jSONObject.put("data", g0.t0());
                g0.f12238a.n = 1;
            } else if (R == null) {
                tfs.d("keypath is null : " + this.c);
                jSONObject.put("data", this.f12203a.t0());
            }
            o.y yVar = g0.f12238a;
            if (yVar.o <= 0) {
                jSONObject.put("options", (Object) yVar.j);
                g0.f12238a.o = 1;
            }
            hk8 hk8Var = this.d;
            if (hk8Var != null) {
                this.f12203a.o1(this.c, hk8Var);
            }
            d.j jVar = new d.j(a.a(a.this), jSONObject, null);
            jVar.d = this.d;
            d I = a.a(a.this).I();
            String G = this.f12203a.G();
            String o0 = this.f12203a.o0();
            I.u(G + "." + o0 + "." + this.c, this.f12203a, jVar);
        }
    }

    static {
        t2o.a(503316977);
        t2o.a(503317092);
    }

    public a(o oVar) {
        this.f12202a = oVar;
    }

    public static /* synthetic */ o a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("c31cabaf", new Object[]{aVar});
        }
        return aVar.f12202a;
    }

    public final void b(n nVar, String str, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f2ca9b", new Object[]{this, nVar, str, map, hk8Var});
        } else {
            nVar.f12238a.m.l1(new RunnableC0690a(nVar, map, str, hk8Var));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        return onHandleTNodeMessage(gVar.b, gVar.c, gVar.d, null, gVar.e, gVar.g);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        if (nVar2 != null) {
            nVar2.s(str, map);
        }
        if (str2 == null && nVar2 != null) {
            str2 = nwv.I(nVar2.H(str), null);
        }
        if (str2 == null || !str2.startsWith("$://")) {
            return false;
        }
        b(nVar2, str2.substring(4), map, hk8Var);
        return true;
    }
}
