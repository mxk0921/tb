package com.taobao.android.sku;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.vfw.dataloader.a;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.AliXSkuCore;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.HashMap;
import tb.ag0;
import tb.b8v;
import tb.cjz;
import tb.coc;
import tb.hdv;
import tb.nr0;
import tb.o3q;
import tb.t2o;
import tb.tq6;
import tb.uq6;
import tb.wq6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class JSCore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AliXSkuCore f9423a;
    public final com.alibaba.android.ultron.vfw.instance.a b;
    public final nr0 c;
    public ViewGroup d;
    public volatile b e;
    public volatile boolean f = SkuCore.l;
    public volatile boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends uq6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AliXSkuCore.h f9424a;

        public a(JSCore jSCore, AliXSkuCore.h hVar) {
            this.f9424a = hVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 2143708973) {
                super.b((wq6) objArr[0], (UltronError) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/JSCore$4");
        }

        @Override // tb.uq6, tb.sq6
        public void a(wq6 wq6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d2b290d", new Object[]{this, wq6Var});
                return;
            }
            AliXSkuCore.h hVar = this.f9424a;
            if (hVar != null) {
                hVar.a();
            }
        }

        @Override // tb.uq6, tb.sq6
        public void b(wq6 wq6Var, UltronError ultronError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fc6672d", new Object[]{this, wq6Var, ultronError});
            } else {
                super.b(wq6Var, ultronError);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f9425a;
        private String b;
        private String c;
        private String d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements coc {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(b bVar) {
            }

            @Override // tb.coc
            public void a(String str) {
                UMLinkLogInterface a2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c6d1441a", new Object[]{this, str});
                } else if (!TextUtils.isEmpty(str) && (a2 = hdv.a()) != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("errorMsg", str);
                    try {
                        a2.commitFailure("Main", "", "", "New_Sku", "Main", hashMap, SkuLogUtils.UM_DOWNGRADE_E, str);
                    } catch (Throwable th) {
                        SkuLogUtils.i(th.toString());
                    }
                }
            }
        }

        static {
            t2o.a(442499115);
        }

        public b(String str, String str2, String str3, String str4) {
            this.f9425a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!JSCore.a(JSCore.this)) {
                tq6 a2 = tq6.a();
                a2.h(tq6.DATA_LOADER_TYPE_CLIENT);
                a2.m(this.f9425a);
                a2.k(this.c);
                a2.j(this.d);
                JSCore.c(JSCore.this).q0(a2);
                JSCore.c(JSCore.this).m(o3q.EVENT_TYPE, "alarm001", new a(this));
                JSCore.b(JSCore.this, true);
            }
        }
    }

    static {
        t2o.a(442499109);
    }

    public JSCore(SkuCore skuCore, AliXSkuCore aliXSkuCore, com.alibaba.android.ultron.vfw.instance.a aVar, nr0 nr0Var) {
        if (cjz.a()) {
            SkuLogUtils.x("JSCore_init");
        }
        this.f9423a = aliXSkuCore;
        this.b = aVar;
        this.c = nr0Var;
    }

    public static /* synthetic */ boolean a(JSCore jSCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("156947c1", new Object[]{jSCore})).booleanValue();
        }
        return jSCore.g;
    }

    public static /* synthetic */ boolean b(JSCore jSCore, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf1009bd", new Object[]{jSCore, new Boolean(z)})).booleanValue();
        }
        jSCore.g = z;
        return z;
    }

    public static /* synthetic */ com.alibaba.android.ultron.vfw.instance.a c(JSCore jSCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("f09c84a8", new Object[]{jSCore});
        }
        return jSCore.b;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4e9dfc5", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public void f(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b553f89", new Object[]{this, str, str2, str3, str4});
            return;
        }
        this.e = new b(str, str2, str3, str4);
        this.f |= h();
        if (!this.f) {
            this.e.run();
        }
    }

    public void g(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5600888b", new Object[]{this, linearLayout});
        } else if (linearLayout != null) {
            this.d = linearLayout;
        }
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72944032", new Object[]{this})).booleanValue();
        }
        if (nr0.C(this.c.x()) || nr0.C(this.c.s())) {
            return true;
        }
        return false;
    }

    public void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98de7839", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            String string = jSONObject.getString("action");
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.putAll(jSONObject.getJSONObject("params"));
            } catch (Throwable unused) {
            }
            if ("pv_sku_update".equals(string)) {
                b8v e = this.f9423a.K().getEventHandler().e();
                e.t(ag0.EVENT_TYPE);
                e.r(new DMEvent(ag0.EVENT_TYPE, new JSONObject() { // from class: com.taobao.android.sku.JSCore.1
                    {
                        put("subType", "change_prop");
                        put("payload", (Object) new JSONObject());
                    }
                }, null));
                e.u("extraParams", new ArrayList<Object>(jSONObject2) { // from class: com.taobao.android.sku.JSCore.2
                    public final /* synthetic */ JSONObject val$params;

                    {
                        this.val$params = jSONObject2;
                        add("propChangeFromBigImageView");
                        add(jSONObject2);
                    }
                }.toArray());
                this.f9423a.K().getEventHandler().k(e);
                return;
            }
            b8v e2 = this.f9423a.K().getEventHandler().e();
            e2.t(ag0.EVENT_TYPE);
            e2.r(new DMEvent(ag0.EVENT_TYPE, new JSONObject(string, jSONObject2) { // from class: com.taobao.android.sku.JSCore.3
                public final /* synthetic */ String val$action;
                public final /* synthetic */ JSONObject val$params;

                {
                    this.val$action = string;
                    this.val$params = jSONObject2;
                    put("subType", (Object) string);
                    put("payload", (Object) new JSONObject() { // from class: com.taobao.android.sku.JSCore.3.1
                        {
                            putAll(AnonymousClass3.this.val$params);
                        }
                    });
                }
            }, null));
            this.f9423a.K().getEventHandler().k(e2);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c936ba40", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    public void k(String str, String str2, a.h hVar, AliXSkuCore.h hVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17fa09c9", new Object[]{this, str, str2, hVar, hVar2});
            return;
        }
        if (!this.g) {
            if (this.e != null) {
                this.e.run();
            } else {
                return;
            }
        }
        JSONObject n = this.c.n();
        if (n != null) {
            j();
            a.C0075a aVar = new a.C0075a();
            aVar.f2326a = n;
            aVar.d = this.c.e();
            com.alibaba.android.ultron.vfw.dataloader.a B = this.b.B();
            if (B != null) {
                aVar.a(B.d());
            }
            com.alibaba.android.ultron.vfw.dataloader.a b2 = com.alibaba.android.ultron.vfw.dataloader.a.b("initial", aVar);
            b2.j(str2);
            b2.i(hVar);
            this.b.i0(str, b2, new a(this, hVar2));
        } else if (hVar2 != null) {
            hVar2.a();
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2aa64", new Object[]{this, str});
            return;
        }
        if (!this.g) {
            if (this.e != null) {
                this.e.run();
            } else {
                return;
            }
        }
        a.C0075a aVar = new a.C0075a();
        aVar.f2326a = this.c.n();
        aVar.d = this.c.e();
        this.b.i0(str, com.alibaba.android.ultron.vfw.dataloader.a.b("initial", aVar), new uq6());
    }
}
