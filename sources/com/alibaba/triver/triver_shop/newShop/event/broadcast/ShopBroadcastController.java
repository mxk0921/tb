package com.alibaba.triver.triver_shop.newShop.event.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.a1v;
import tb.fmi;
import tb.g1a;
import tb.mmi;
import tb.npp;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShopBroadcastController {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<Context, ShopBroadcastController> f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final mmi f3089a;
    public b b;
    public final Context c;
    public final Map<String, g1a<JSONObject, xhv>> d = new ConcurrentHashMap();
    public final BroadcastReceiver e = new BroadcastReceiver() { // from class: com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/event/broadcast/ShopBroadcastController$2");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String str = com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_FOLLOWED;
            boolean equals = "true".equals(intent.getStringExtra(str));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_FOLLOW_ACTION, (Object) com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_FOLLOW_ACTION_REFRESH);
            jSONObject.put("_msg_name", (Object) com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_FOLLOW_SETSTATUS);
            jSONObject.put("_msg_target", (Object) "*");
            jSONObject.put("_msg_source", (Object) com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
            if (!equals) {
                str = com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_UNFOLLOWED;
            }
            jSONObject.put("status", (Object) str);
            ShopBroadcastController.c(ShopBroadcastController.this).d(jSONObject.toJSONString());
            ShopBroadcastController.d(ShopBroadcastController.this, equals);
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements fmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3091a;

        public a(Context context) {
            this.f3091a = context;
        }

        @Override // tb.fmi
        public void b(Object obj) {
            g1a g1aVar;
            JSONObject d;
            JSONArray jSONArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
                return;
            }
            com.alibaba.triver.triver_shop.newShop.event.broadcast.a aVar = new com.alibaba.triver.triver_shop.newShop.event.broadcast.a(obj);
            npp.a(aVar.c().toString());
            if (aVar.v()) {
                if (ShopBroadcastController.a(ShopBroadcastController.this) != null) {
                    ShopBroadcastController.a(ShopBroadcastController.this).a2(aVar.i(), aVar.d());
                }
            } else if (!aVar.t()) {
                if (!(!"shop.markPerformance".equals(aVar.m()) || ShopBroadcastController.a(ShopBroadcastController.this) == null || (d = aVar.d()) == null || (jSONArray = d.getJSONArray("data")) == null)) {
                    ShopBroadcastController.a(ShopBroadcastController.this).Y1(jSONArray);
                }
                if ("shoptab.checkstatus".equals(aVar.m()) && ShopBroadcastController.a(ShopBroadcastController.this) != null) {
                    ShopBroadcastController.a(ShopBroadcastController.this).a1(aVar.k());
                }
                if ("aplus.enter".equals(aVar.m()) && aVar.q() && ShopBroadcastController.a(ShopBroadcastController.this) != null) {
                    ShopBroadcastController.a(ShopBroadcastController.this).a1(aVar.k());
                }
                if (aVar.n()) {
                    a1v.e(this.f3091a, aVar.b(), aVar.a(), aVar.k());
                }
                if (aVar.u() && ShopBroadcastController.a(ShopBroadcastController.this) != null) {
                    ShopBroadcastController.a(ShopBroadcastController.this).h1();
                }
                if (aVar.r() && ShopBroadcastController.a(ShopBroadcastController.this) != null) {
                    ShopBroadcastController.a(ShopBroadcastController.this).N2();
                }
                if (aVar.s() && ShopBroadcastController.a(ShopBroadcastController.this) != null) {
                    ShopBroadcastController.a(ShopBroadcastController.this).E0();
                }
                if ("shop.refreshDXWidget".equals(aVar.j()) && ShopBroadcastController.a(ShopBroadcastController.this) != null) {
                    ShopBroadcastController.a(ShopBroadcastController.this).W0(aVar.f(), aVar.e());
                }
                String g = aVar.g();
                if (!(g == null || ShopBroadcastController.a(ShopBroadcastController.this) == null)) {
                    ShopBroadcastController.a(ShopBroadcastController.this).T(g, aVar.h());
                }
                String j = aVar.j();
                if (j != null && (g1aVar = (g1a) ShopBroadcastController.b(ShopBroadcastController.this).get(j)) != null) {
                    g1aVar.invoke(aVar.d());
                }
            } else if (ShopBroadcastController.a(ShopBroadcastController.this) != null) {
                ShopBroadcastController.a(ShopBroadcastController.this).F0(aVar.d());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
        void E0();

        void F0(JSONObject jSONObject);

        void N2();

        void T(String str, String str2);

        void W0(String str, JSONObject jSONObject);

        ShopDataParser Y();

        void Y1(JSONArray jSONArray);

        void a1(String str);

        void a2(boolean z, JSONObject jSONObject);

        void h1();
    }

    static {
        t2o.a(766509477);
    }

    public ShopBroadcastController(Context context) {
        this.c = context;
        this.f3089a = new mmi(context, "mashop_broadcast", new a(context));
        g();
    }

    public static /* synthetic */ b a(ShopBroadcastController shopBroadcastController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("fce9e0fa", new Object[]{shopBroadcastController});
        }
        return shopBroadcastController.b;
    }

    public static /* synthetic */ Map b(ShopBroadcastController shopBroadcastController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8b562939", new Object[]{shopBroadcastController});
        }
        return shopBroadcastController.d;
    }

    public static /* synthetic */ mmi c(ShopBroadcastController shopBroadcastController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mmi) ipChange.ipc$dispatch("7018298a", new Object[]{shopBroadcastController});
        }
        return shopBroadcastController.f3089a;
    }

    public static /* synthetic */ void d(ShopBroadcastController shopBroadcastController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a5b30e", new Object[]{shopBroadcastController, new Boolean(z)});
        } else {
            shopBroadcastController.v(z);
        }
    }

    public static synchronized ShopBroadcastController f(Context context) {
        synchronized (ShopBroadcastController.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShopBroadcastController) ipChange.ipc$dispatch("70d5ddac", new Object[]{context});
            } else if (context == null) {
                return null;
            } else {
                Map<Context, ShopBroadcastController> map = f;
                ShopBroadcastController shopBroadcastController = (ShopBroadcastController) ((HashMap) map).get(context);
                if (shopBroadcastController != null) {
                    return shopBroadcastController;
                }
                ShopBroadcastController shopBroadcastController2 = new ShopBroadcastController(context);
                ((HashMap) map).put(context, shopBroadcastController2);
                return shopBroadcastController2;
            }
        }
    }

    public static synchronized void h(Context context) {
        synchronized (ShopBroadcastController.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12608688", new Object[]{context});
            } else if (context != null) {
                ((HashMap) f).remove(context);
            }
        }
    }

    public final String e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1314fa35", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (i == 1) {
            return i + ".0." + i2;
        }
        return i + "." + i2 + ".0";
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f5ddab", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("TBSubsrcibe_relation_widget_follow_status");
        LocalBroadcastManager.getInstance(this.c).registerReceiver(this.e, intentFilter);
    }

    public void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d68f06", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.f3089a.d(jSONObject.toJSONString());
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19c754df", new Object[]{this, str});
        } else {
            this.f3089a.d(new a.b().b("container.appear").c(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT).d("*").e(str).f("container.appear").a().c().toJSONString());
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b9b8fb", new Object[]{this, str});
        } else {
            this.f3089a.d(new a.b().b("container.disappear").c(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT).d("*").e(str).f("container.disappear").a().c().toJSONString());
        }
    }

    public void l(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e881c4", new Object[]{this, str, new Boolean(z)});
            return;
        }
        JSONObject c = new a.b().b(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_FOLLOW_SETSTATUS).c(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT).d("*").e(str).f(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_FOLLOW_SETSTATUS).a().c();
        if (z) {
            c.put("status", (Object) com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_FOLLOWED);
        } else {
            c.put("status", (Object) com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_UNFOLLOWED);
        }
        this.f3089a.d(c.toJSONString());
    }

    public void o(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d065f8c4", new Object[]{this, str, str2});
            return;
        }
        a.b bVar = new a.b();
        bVar.f("homelive.liveroom.close");
        bVar.d(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        bVar.e(str);
        bVar.c("0.0.0");
        JSONObject c = bVar.a().c();
        c.put("shopInstanceId", (Object) str2);
        this.f3089a.d(c.toJSONString());
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37b023e7", new Object[]{this, str});
        } else {
            this.f3089a.d(new a.b().b("onShow").c(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT).d("*").e(str).f("onShow").a().c().toJSONString());
        }
    }

    public void q(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a732da7f", new Object[]{this, new Integer(i), new Integer(i2), str});
        } else {
            this.f3089a.d(new a.b().b(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_PAGE_APPEAR).c(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT).d(e(i, i2)).e(str).f(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_PAGE_APPEAR).a().c().toJSONString());
        }
    }

    public void r(int i, int i2, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5580ec51", new Object[]{this, new Integer(i), new Integer(i2), str, jSONObject});
            return;
        }
        JSONObject c = new a.b().b(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_PAGE_APPEAR).c(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT).d(e(i, i2)).e(str).f(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_PAGE_APPEAR).a().c();
        if (jSONObject != null) {
            c.putAll(jSONObject);
        }
        String jSONString = c.toJSONString();
        this.f3089a.d(jSONString);
        npp.a(jSONString);
    }

    public void s(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669385ff", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        String jSONString = new a.b().b(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_PAGE_DISAPPEAR).c(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT).d(e(i, i2)).e(str).f(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_PAGE_DISAPPEAR).a().c().toJSONString();
        this.f3089a.d(jSONString);
        npp.a(jSONString);
    }

    public void t(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e0cee5", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.e);
        mmi mmiVar = this.f3089a;
        if (mmiVar != null) {
            mmiVar.a();
        }
        h(this.c);
    }

    public final void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d815b3", new Object[]{this, new Boolean(z)});
            return;
        }
        b bVar = this.b;
        if (bVar != null && bVar.Y() != null && this.b.Y().w0().d() != null) {
            this.b.Y().w0().d().invoke(Boolean.valueOf(z));
        }
    }

    public void m(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b605b007", new Object[]{this, str, new Integer(i)});
            return;
        }
        JSONObject c = new a.b().b(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_HEADER_COLLAPSED).c(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT).d("*").e(str).f(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_HEADER_COLLAPSED).a().c();
        c.put("embedPageOffset", (Object) Integer.valueOf(i));
        c.put("isCollapsed", (Object) 1);
        this.f3089a.d(c.toJSONString());
    }

    public void n(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5d870e", new Object[]{this, str, new Integer(i)});
            return;
        }
        JSONObject c = new a.b().b(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_HEADER_UNCOLLAPSED).c(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT).d("*").e(str).f(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_HEADER_UNCOLLAPSED).a().c();
        c.put("embedPageOffset", (Object) Integer.valueOf(i));
        c.put("isCollapsed", (Object) 0);
        this.f3089a.d(c.toJSONString());
    }
}
