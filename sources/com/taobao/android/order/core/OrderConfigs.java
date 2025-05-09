package com.taobao.android.order.core;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.ui.RefundAdapter;
import java.util.HashMap;
import java.util.Map;
import tb.brb;
import tb.f4d;
import tb.fcl;
import tb.gkb;
import tb.kz;
import tb.t2o;
import tb.u3o;
import tb.vel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OrderConfigs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BACKGROUND = "background";
    public static final String BOTTOM = "bottom";
    public static final String FOREGROUND = "foreground";
    public static final String Header = "header";
    public static final String RECYCLERVIEW = "recyclerView";
    public static final String TAB = "tab";
    public static final String TOP = "top";
    public static final String VIEWPAGER = "viewPager";
    public Pair<JSONObject, JSONObject> A;

    /* renamed from: a  reason: collision with root package name */
    public final u3o f9137a;
    public final Map<String, ViewGroup> b;
    public final f4d c;
    public final Context d;
    public final brb e;
    public final BizNameType f;
    public String g;
    public final boolean h;
    public JSONArray i;
    public final kz j;
    public final gkb k;
    public final String l;
    public final String m;
    public String n;
    public final View o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public vel u;
    public UltronWeex2DialogFragment v;
    public UltronWeex2DialogFragment w;
    public final boolean x;
    public Bundle y;
    public boolean z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum BizNameType {
        ORDER_DETAIL(OrderBizCode.orderDetail),
        ORDER_LIST(OrderBizCode.orderList);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String bizName;

        BizNameType(String str) {
            this.bizName = str;
        }

        public static /* synthetic */ Object ipc$super(BizNameType bizNameType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/OrderConfigs$BizNameType");
        }

        public static BizNameType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BizNameType) ipChange.ipc$dispatch("79757299", new Object[]{str});
            }
            return (BizNameType) Enum.valueOf(BizNameType.class, str);
        }

        public String getBizName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
            }
            return this.bizName;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f9138a;
        public u3o b;
        public BizNameType d;
        public brb e;
        public JSONArray f;
        public String g;
        public boolean h;
        public gkb i;
        public kz j;
        public String k;
        public String l;
        public View o;
        public vel p;
        public UltronWeex2DialogFragment q;
        public UltronWeex2DialogFragment r;
        public final Map<String, ViewGroup> c = new HashMap();
        public boolean m = false;
        public boolean n = false;
        public boolean s = false;

        static {
            t2o.a(614465613);
        }

        public b(Context context) {
            this.f9138a = context;
        }

        public static /* synthetic */ BizNameType a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BizNameType) ipChange.ipc$dispatch("72403b02", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ u3o b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (u3o) ipChange.ipc$dispatch("466e082d", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ boolean c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b822c923", new Object[]{bVar})).booleanValue();
            }
            return bVar.h;
        }

        public static /* synthetic */ String d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("33a3dac0", new Object[]{bVar});
            }
            return bVar.k;
        }

        public static /* synthetic */ String e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("75bb081f", new Object[]{bVar});
            }
            return bVar.l;
        }

        public static /* synthetic */ View f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("cee7324", new Object[]{bVar});
            }
            return bVar.o;
        }

        public static /* synthetic */ vel g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vel) ipChange.ipc$dispatch("27cd9cd9", new Object[]{bVar});
            }
            return bVar.p;
        }

        public static /* synthetic */ boolean h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bafc8e8", new Object[]{bVar})).booleanValue();
            }
            return bVar.m;
        }

        public static /* synthetic */ boolean i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1c6595a9", new Object[]{bVar})).booleanValue();
            }
            return bVar.n;
        }

        public static /* synthetic */ UltronWeex2DialogFragment j(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UltronWeex2DialogFragment) ipChange.ipc$dispatch("883b6bea", new Object[]{bVar});
            }
            return bVar.q;
        }

        public static /* synthetic */ UltronWeex2DialogFragment k(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UltronWeex2DialogFragment) ipChange.ipc$dispatch("cb200b09", new Object[]{bVar});
            }
            return bVar.r;
        }

        public static /* synthetic */ boolean l(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4e86fbec", new Object[]{bVar})).booleanValue();
            }
            return bVar.s;
        }

        public static /* synthetic */ Map m(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("943f61a7", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ Context n(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("7ad661ab", new Object[]{bVar});
            }
            return bVar.f9138a;
        }

        public static /* synthetic */ brb o(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (brb) ipChange.ipc$dispatch("43c54e9f", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ JSONArray p(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("4322ee69", new Object[]{bVar});
            }
            return bVar.f;
        }

        public static /* synthetic */ JSONObject q(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("b03fe516", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ String r(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f21dfac9", new Object[]{bVar});
            }
            return bVar.g;
        }

        public static /* synthetic */ gkb s(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gkb) ipChange.ipc$dispatch("375b1d6c", new Object[]{bVar});
            }
            return bVar.i;
        }

        public static /* synthetic */ kz t(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kz) ipChange.ipc$dispatch("d3482fd6", new Object[]{bVar});
            }
            return bVar.j;
        }

        public b A(brb brbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a09d9f", new Object[]{this, brbVar});
            }
            this.e = brbVar;
            return this;
        }

        public b B(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("fbfa89e", new Object[]{this, jSONArray});
            }
            this.f = jSONArray;
            return this;
        }

        public b C(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d3e10afa", new Object[]{this, new Boolean(z)});
            }
            this.s = z;
            return this;
        }

        public b D(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b2e3158e", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }

        public b E(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e271e5ea", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public b F(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c479873f", new Object[]{this, new Boolean(z)});
            }
            this.n = z;
            return this;
        }

        public b G(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("38900227", new Object[]{this, str});
            }
            this.k = str;
            return this;
        }

        public b H(u3o u3oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("df2d78bb", new Object[]{this, u3oVar});
            }
            this.b = u3oVar;
            return this;
        }

        public b I(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f2df567", new Object[]{this, str});
            }
            this.l = str;
            return this;
        }

        public b J(UltronWeex2DialogFragment ultronWeex2DialogFragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("53f6563e", new Object[]{this, ultronWeex2DialogFragment});
            }
            this.r = ultronWeex2DialogFragment;
            return this;
        }

        public b K(UltronWeex2DialogFragment ultronWeex2DialogFragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e5231e51", new Object[]{this, ultronWeex2DialogFragment});
            }
            this.q = ultronWeex2DialogFragment;
            return this;
        }

        public b L(vel velVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5a210a3a", new Object[]{this, velVar});
            }
            this.p = velVar;
            return this;
        }

        public b M(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a0edc003", new Object[]{this, view});
            }
            this.o = view;
            return this;
        }

        public b N(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("acab4dde", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public b O(kz kzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c005204d", new Object[]{this, kzVar});
            }
            this.j = kzVar;
            return this;
        }

        public b u(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("88836741", new Object[]{this, linearLayout, recyclerView, linearLayout2});
            }
            ((HashMap) this.c).put("header", linearLayout);
            ((HashMap) this.c).put(OrderConfigs.RECYCLERVIEW, recyclerView);
            ((HashMap) this.c).put("bottom", linearLayout2);
            return this;
        }

        public b v(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b0c702a2", new Object[]{this, linearLayout, recyclerView, linearLayout2, viewGroup});
            }
            ((HashMap) this.c).put("header", linearLayout);
            ((HashMap) this.c).put(OrderConfigs.RECYCLERVIEW, recyclerView);
            ((HashMap) this.c).put("bottom", linearLayout2);
            ((HashMap) this.c).put("background", viewGroup);
            return this;
        }

        public b w(LinearLayout linearLayout, ViewPager viewPager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("508a69f6", new Object[]{this, linearLayout, viewPager});
            }
            ((HashMap) this.c).put("header", linearLayout);
            ((HashMap) this.c).put(OrderConfigs.VIEWPAGER, viewPager);
            return this;
        }

        public b x(BizNameType bizNameType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("af9bed8e", new Object[]{this, bizNameType});
            }
            this.d = bizNameType;
            return this;
        }

        public OrderConfigs y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OrderConfigs) ipChange.ipc$dispatch("a986f931", new Object[]{this});
            }
            return new OrderConfigs(this);
        }

        public b z(gkb gkbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e750b491", new Object[]{this, gkbVar});
            }
            this.i = gkbVar;
            return this;
        }
    }

    static {
        t2o.a(614465610);
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff819aba", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public void B(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa3ccfb", new Object[]{this, viewGroup});
        } else {
            this.b.put("bottom", viewGroup);
        }
    }

    public void C(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d31c6c50", new Object[]{this, viewGroup});
        } else {
            this.b.put("foreground", viewGroup);
        }
    }

    public void D(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a56833e0", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public void E(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea48e9a", new Object[]{this, viewGroup});
        } else {
            this.b.put("header", viewGroup);
        }
    }

    public void F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c9d1df", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff78b57d", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public void H(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d15a60", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c6b792", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public void J(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99017e3e", new Object[]{this, jSONArray});
        } else {
            this.i = jSONArray;
        }
    }

    public void K(UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec411b71", new Object[]{this, ultronWeex2DialogFragment});
        } else {
            this.w = ultronWeex2DialogFragment;
        }
    }

    public void L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c76076f", new Object[]{this, new Boolean(z)});
        }
    }

    public void M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c471a34", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public void N(vel velVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3691e0f5", new Object[]{this, velVar});
        } else {
            this.u = velVar;
        }
    }

    public void O(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d096e15", new Object[]{this, view});
        } else {
            this.b.put(RECYCLERVIEW, (ViewGroup) view);
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b2697c", new Object[]{this});
        } else {
            Q(this.o);
        }
    }

    public void Q(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e71d85d6", new Object[]{this, view});
            return;
        }
        ViewGroup viewGroup = this.b.get(RECYCLERVIEW);
        if ((viewGroup instanceof RecyclerView) && view != null) {
            ((RecyclerView) viewGroup).setAdapter(new RefundAdapter(view));
        }
    }

    public void R(Pair<JSONObject, JSONObject> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1f7bf7d", new Object[]{this, pair});
        } else {
            this.A = pair;
        }
    }

    public void S(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b16156", new Object[]{this, bundle});
        } else {
            this.y = bundle;
        }
    }

    public void T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f92b436", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void U(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97bdcde", new Object[]{this, viewGroup});
        } else {
            this.b.put("tab", viewGroup);
        }
    }

    public void V(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3304de9e", new Object[]{this, viewGroup});
        } else {
            this.b.put("top", viewGroup);
        }
    }

    public void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8b6e8f", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void X(UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a4ec14", new Object[]{this, ultronWeex2DialogFragment});
        } else {
            this.v = ultronWeex2DialogFragment;
        }
    }

    public void Y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5257d5ec", new Object[]{this, new Boolean(z)});
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c2dcd12", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public Map<String, ViewGroup> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ed8a35c0", new Object[]{this});
        }
        return this.b;
    }

    public BizNameType c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BizNameType) ipChange.ipc$dispatch("c22b34f4", new Object[]{this});
        }
        return this.f;
    }

    public gkb d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gkb) ipChange.ipc$dispatch("4faf3dfe", new Object[]{this});
        }
        return this.k;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f64be8d", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ace2ac12", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public JSONArray g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("a40daf5c", new Object[]{this});
        }
        return this.i;
    }

    public f4d h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4d) ipChange.ipc$dispatch("510b3cf3", new Object[]{this});
        }
        return this.c;
    }

    public UltronWeex2DialogFragment i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronWeex2DialogFragment) ipChange.ipc$dispatch("30c8b5c5", new Object[]{this});
        }
        return this.w;
    }

    public UltronWeex2DialogFragment j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronWeex2DialogFragment) ipChange.ipc$dispatch("f4f55e58", new Object[]{this});
        }
        return this.v;
    }

    public vel k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vel) ipChange.ipc$dispatch("a2e2989b", new Object[]{this});
        }
        return this.u;
    }

    public Pair<JSONObject, JSONObject> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("d7e312d3", new Object[]{this});
        }
        return this.A;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c0ab178", new Object[]{this});
        }
        return this.l;
    }

    public u3o n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("930f067e", new Object[]{this});
        }
        return this.f9137a;
    }

    public Bundle o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("41096f6", new Object[]{this});
        }
        return this.y;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36586e40", new Object[]{this});
        }
        return this.n;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f14fc4b8", new Object[]{this});
        }
        return this.m;
    }

    public ViewGroup r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1743ef8a", new Object[]{this});
        }
        return this.b.get("tab");
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return this.g;
    }

    public kz t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kz) ipChange.ipc$dispatch("a1f31f72", new Object[]{this});
        }
        return this.j;
    }

    public brb u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brb) ipChange.ipc$dispatch("6c3d977e", new Object[]{this});
        }
        return this.e;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eadaea83", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20da5d73", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2ae936c", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d6836fd", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed898761", new Object[]{this})).booleanValue();
        }
        if (this.o != null) {
            return true;
        }
        return false;
    }

    public OrderConfigs(b bVar) {
        this.b = new HashMap();
        this.p = false;
        this.s = false;
        this.z = false;
        this.f = b.a(bVar);
        this.f9137a = b.b(bVar);
        this.b = b.m(bVar);
        this.d = b.n(bVar);
        this.c = new fcl();
        this.e = b.o(bVar);
        this.i = b.p(bVar);
        b.q(bVar);
        this.g = b.r(bVar);
        this.k = b.s(bVar);
        this.j = b.t(bVar);
        this.h = b.c(bVar);
        this.l = b.d(bVar);
        this.m = b.e(bVar);
        this.o = b.f(bVar);
        this.u = b.g(bVar);
        this.p = b.h(bVar);
        this.s = b.i(bVar);
        this.v = b.j(bVar);
        this.w = b.k(bVar);
        this.x = b.l(bVar);
    }
}
