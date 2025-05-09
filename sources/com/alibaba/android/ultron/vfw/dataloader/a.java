package com.alibaba.android.ultron.vfw.dataloader;

import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OP_TYPE_ADJUST = "adjust";
    public static final String OP_TYPE_INIT = "initial";

    /* renamed from: a  reason: collision with root package name */
    public String f2325a;
    public C0075a b;
    public final Map<String, Object> c = new HashMap();
    public String d;
    public a.h e;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.android.ultron.vfw.dataloader.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class C0075a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f2326a;
        public JSONObject b;
        public JSONObject c;
        public JSONObject d;

        static {
            t2o.a(157286598);
        }

        public void a(C0075a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("335eb190", new Object[]{this, aVar});
            } else if (aVar != null) {
                JSONObject jSONObject = aVar.c;
                this.c = jSONObject;
                if (jSONObject != null) {
                    jSONObject.remove("initialState");
                    this.c.remove("extInput");
                }
            }
        }
    }

    static {
        t2o.a(157286597);
    }

    public static a b(String str, C0075a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8824ef96", new Object[]{str, aVar});
        }
        a aVar2 = new a();
        aVar2.f2325a = str;
        aVar2.b = aVar;
        return aVar2;
    }

    public static a c(String str, C0075a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5add1a67", new Object[]{str, aVar, aVar2});
        }
        a aVar3 = new a();
        aVar3.f2325a = str;
        aVar3.b = aVar;
        if (aVar2 != null) {
            aVar3.d = aVar2.d;
            aVar3.e = aVar2.e;
        }
        return aVar3;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("126ad766", new Object[]{this, str, obj});
        } else {
            ((HashMap) this.c).put(str, obj);
        }
    }

    public C0075a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0075a) ipChange.ipc$dispatch("ade50bd2", new Object[]{this});
        }
        return this.b;
    }

    public Object e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("37f60f1d", new Object[]{this, str});
        }
        return ((HashMap) this.c).get(str);
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec24bbe8", new Object[]{this});
        }
        return this.f2325a;
    }

    public a.h g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.h) ipChange.ipc$dispatch("7ffd3428", new Object[]{this});
        }
        return this.e;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cbb1772", new Object[]{this});
        }
        return this.d;
    }

    public void i(a.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e26281e", new Object[]{this, hVar});
        } else {
            this.e = hVar;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ab5fac", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }
}
