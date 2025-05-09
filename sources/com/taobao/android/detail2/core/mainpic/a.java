package com.taobao.android.detail2.core.mainpic;

import android.view.MotionEvent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.biz.detailcard.viewholder.ItemCardViewHolder;
import com.taobao.android.detail2.core.framework.base.weex.DetailWeexContainer;
import java.util.HashMap;
import tb.cxj;
import tb.dh7;
import tb.j83;
import tb.p0i;
import tb.ro7;
import tb.t2o;
import tb.txj;
import tb.ue7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MainPicContainer f7217a;
    public final cxj b;
    public final DetailWeexContainer c;
    public final j83 d;
    public final dh7 e;
    public ue7 f;
    public final ItemCardViewHolder g;
    public final b h;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail2.core.mainpic.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class C0394a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0394a() {
        }

        @Override // com.taobao.android.detail2.core.mainpic.a.b
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4e55424c", new Object[]{this})).intValue();
            }
            return a.b(a.this).r();
        }

        @Override // com.taobao.android.detail2.core.mainpic.a.b
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9052459f", new Object[]{this})).booleanValue();
            }
            return a.f(a.this).W0();
        }

        @Override // com.taobao.android.detail2.core.mainpic.a.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15f12883", new Object[]{this});
            } else {
                a.f(a.this).K3();
            }
        }

        @Override // com.taobao.android.detail2.core.mainpic.a.b
        public ue7 d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ue7) ipChange.ipc$dispatch("484318be", new Object[]{this});
            }
            return a.e(a.this);
        }

        @Override // com.taobao.android.detail2.core.mainpic.a.b
        public dh7 e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dh7) ipChange.ipc$dispatch("88def144", new Object[]{this});
            }
            return a.d(a.this);
        }

        @Override // com.taobao.android.detail2.core.mainpic.a.b
        public void f(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18b0e537", new Object[]{this, str, jSONObject});
            } else if (a.c(a.this) != null) {
                a.c(a.this).W(str, jSONObject);
            }
        }

        @Override // com.taobao.android.detail2.core.mainpic.a.b
        public j83 g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j83) ipChange.ipc$dispatch("d26a918a", new Object[]{this});
            }
            return a.b(a.this);
        }

        @Override // com.taobao.android.detail2.core.mainpic.a.b
        public cxj getNewDetailContext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cxj) ipChange.ipc$dispatch("e58a946c", new Object[]{this});
            }
            return a.a(a.this);
        }

        @Override // com.taobao.android.detail2.core.mainpic.a.b
        public ro7 h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ro7) ipChange.ipc$dispatch("9417eeca", new Object[]{this});
            }
            return a.d(a.this).G();
        }

        @Override // com.taobao.android.detail2.core.mainpic.a.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8c5a9aa6", new Object[]{this})).booleanValue();
            }
            if (a.c(a.this) != null) {
                return a.c(a.this).g0();
            }
            return false;
        }

        @Override // com.taobao.android.detail2.core.mainpic.a.b
        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d242ee1e", new Object[]{this});
                return;
            }
            a.f(a.this).L3();
            txj.e(txj.TAG_RENDER, "mainpic success hideOpenImmedPlaceHolder");
        }

        @Override // com.taobao.android.detail2.core.mainpic.a.b
        public HashMap<String, String> k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("66404d1b", new Object[]{this});
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("mountUniqId", a.f(a.this).A0());
            hashMap.put("mountBizType", "item");
            return hashMap;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        int a();

        boolean b();

        void c();

        ue7 d();

        dh7 e();

        void f(String str, JSONObject jSONObject);

        j83 g();

        cxj getNewDetailContext();

        ro7 h();

        boolean i();

        void j();

        HashMap<String, String> k();
    }

    static {
        t2o.a(352322126);
    }

    public a(View view, cxj cxjVar, DetailWeexContainer detailWeexContainer, j83 j83Var, dh7 dh7Var, ItemCardViewHolder itemCardViewHolder) {
        C0394a aVar = new C0394a();
        this.b = cxjVar;
        this.c = detailWeexContainer;
        this.d = j83Var;
        this.e = dh7Var;
        this.f7217a = new MainPicContainer(view, aVar);
        this.g = itemCardViewHolder;
    }

    public static /* synthetic */ cxj a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("c549ffaf", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static /* synthetic */ j83 b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j83) ipChange.ipc$dispatch("69a399ce", new Object[]{aVar});
        }
        return aVar.d;
    }

    public static /* synthetic */ DetailWeexContainer c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailWeexContainer) ipChange.ipc$dispatch("402743e8", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ dh7 d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dh7) ipChange.ipc$dispatch("2d04f964", new Object[]{aVar});
        }
        return aVar.e;
    }

    public static /* synthetic */ ue7 e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ue7) ipChange.ipc$dispatch("f29d5b46", new Object[]{aVar});
        }
        return aVar.f;
    }

    public static /* synthetic */ ItemCardViewHolder f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemCardViewHolder) ipChange.ipc$dispatch("4ccea203", new Object[]{aVar});
        }
        return aVar.g;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("157e8a0a", new Object[]{this});
        } else {
            this.f7217a.E();
        }
    }

    public boolean h(ue7 ue7Var) {
        p0i p0iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a942a58", new Object[]{this, ue7Var})).booleanValue();
        }
        if (ue7Var == null || (p0iVar = ue7Var.w0) == null) {
            this.f7217a.k();
            return false;
        }
        this.f = ue7Var;
        return this.f7217a.i(p0iVar);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f7217a.l();
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976827e5", new Object[]{this, str});
        } else {
            this.f7217a.w(str);
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506c035", new Object[]{this, str});
        } else {
            this.f7217a.y(str);
        }
    }

    public void l(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9743ba", new Object[]{this, motionEvent});
        } else {
            this.f7217a.z(motionEvent);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa32fdb4", new Object[]{this});
        } else {
            this.f7217a.A();
        }
    }

    public void n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae68639a", new Object[]{this, jSONObject});
        } else {
            this.f7217a.D(jSONObject);
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
        } else {
            this.f7217a.F(i);
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8210a55", new Object[]{this});
        } else {
            this.f7217a.G();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        } else {
            this.f7217a.H();
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        } else {
            this.f7217a.I();
        }
    }
}
