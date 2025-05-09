package tb;

import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.data.WidgetContentData;
import com.taobao.desktop.widget.template.combine.WidgetCombineMiuiReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoCaiReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoMsgNewReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoMsgReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoVideoReceiver;
import com.taobao.desktop.widget.template.gold.WidgetTaoGoldReceiver;
import com.taobao.desktop.widget.template.standard.WidgetMainInteractionReceiver;
import com.taobao.desktop.widget.template.standard.WidgetStandardMiuiReceiver;
import com.taobao.desktop.widget.template.standard.WidgetStandardReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoCartReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoGameReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoGuessReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoShakeReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoSignReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoVideoSmallReceiver;
import com.taobao.desktop.widget.template.taolife.WidgetTaoLifeReceiver;
import com.taobao.login4android.api.Login;
import com.taobao.widgetvivo.server.WidgetVivoService;
import com.taobao.wireless.link.widget.combine.WidgetCombineReceiver;
import com.taobao.wireless.link.widget.dynamic.WidgetDynamicReceiver;
import com.taobao.wireless.link.widget.farm.WidgetFarmReceiver;
import com.taobao.wireless.link.widget.live.WidgetLiveReceiver;
import com.taobao.wireless.link.widget.order.WidgetOrderReceiver;
import com.taobao.wireless.link.widget.tjb.TjbWidgetReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dcx extends m32 implements yyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile dcx f;
    public sde d;
    public final ConcurrentHashMap<String, sde> e = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f17734a;

        public a(Intent intent) {
            this.f17734a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dcx.this.v(this.f17734a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f17735a;

        public b(boolean z) {
            this.f17735a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f17735a) {
                dcx.F(dcx.this);
            } else {
                dcx.G(dcx.this);
            }
            dcx.this.n();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17736a;

        public c(String str) {
            this.f17736a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dcx.H(dcx.this, this.f17736a);
            }
        }
    }

    static {
        t2o.a(437256271);
        t2o.a(437256228);
    }

    public dcx(Context context) {
        if (context.getApplicationContext() != null) {
            this.f23749a = context.getApplicationContext();
        } else {
            this.f23749a = context;
        }
        sd7.d().j(this.f23749a);
    }

    public static /* synthetic */ void F(dcx dcxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2cee81", new Object[]{dcxVar});
        } else {
            dcxVar.O();
        }
    }

    public static /* synthetic */ void G(dcx dcxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea8df260", new Object[]{dcxVar});
        } else {
            dcxVar.N();
        }
    }

    public static /* synthetic */ void H(dcx dcxVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2310ae49", new Object[]{dcxVar, str});
        } else {
            dcxVar.J(str);
        }
    }

    public static dcx I(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dcx) ipChange.ipc$dispatch("36f81a3e", new Object[]{context});
        }
        if (f == null) {
            synchronized (dcx.class) {
                try {
                    if (f == null) {
                        f = new dcx(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public static /* synthetic */ Object ipc$super(dcx dcxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/manager/WidgetProvideMediator");
    }

    public final void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("501c9bce", new Object[]{this, str});
            return;
        }
        HashMap<String, String> c2 = pbx.a(this.f23749a).c(str);
        if (c2 != null && !c2.isEmpty()) {
            if (b9l.y(this.f23749a)) {
                x(c2);
            } else {
                w(c2);
            }
        }
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d57cf4", new Object[]{this, str});
        } else if (obx.f(this.f23749a).e(str)) {
            L(str, null);
        }
    }

    public void L(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea668b1", new Object[]{this, str, intent});
            return;
        }
        if (this.e.get(str) == null) {
            if (str.equals(WidgetDynamicReceiver.class.getName())) {
                this.d = new tcx(this.f23749a, str);
            } else if (str.equals(WidgetCombineReceiver.class.getName()) || str.equals(WidgetCombineMiuiReceiver.class.getName()) || str.equals(WidgetTaoVideoReceiver.class.getName()) || str.equals(WidgetTaoCaiReceiver.class.getName()) || str.equals(WidgetTaoMsgReceiver.class.getName()) || str.equals(WidgetTaoMsgNewReceiver.class.getName())) {
                this.d = new xr7(this.f23749a, str);
            } else if (str.equals(WidgetStandardReceiver.class.getName()) || str.equals(WidgetStandardMiuiReceiver.class.getName()) || str.equals(WidgetTaoLifeReceiver.class.getName()) || str.equals(WidgetOrderReceiver.class.getName()) || str.equals(WidgetFarmReceiver.class.getName()) || str.equals(WidgetTaoSignReceiver.class.getName()) || str.equals(WidgetTaoGameReceiver.class.getName()) || str.equals(WidgetMainInteractionReceiver.class.getName()) || str.equals(TjbWidgetReceiver.class.getName()) || str.equals(WidgetTaoGoldReceiver.class.getName()) || str.equals(WidgetTaoVideoSmallReceiver.class.getName()) || str.equals(WidgetTaoShakeReceiver.class.getName()) || str.equals(WidgetTaoCartReceiver.class.getName()) || str.equals(WidgetLiveReceiver.class.getName())) {
                this.d = new yr7(this.f23749a, str);
            } else if (str.equals(WidgetTaoGuessReceiver.class.getName())) {
                this.d = new ucx(this.f23749a, str);
            }
            sde sdeVar = this.d;
            if (sdeVar == null) {
                hgh.c(dcx.class, "register mWidgetDataUpdate == null");
                return;
            }
            this.e.put(str, sdeVar);
            hgh.c(dcx.class, "register mWidgetProviderMap: " + this.e);
        }
        if (intent != null) {
            nn8.c().execute(new a(intent));
        }
    }

    public void M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2bec30", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            nn8.c().execute(new b(z));
        } catch (Exception e) {
            hgh.c(dcx.class, "requestBackground error: " + e.getMessage());
        }
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be672fc", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) zcx.c).iterator();
        while (it.hasNext()) {
            K((String) it.next());
        }
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df94ab11", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) zcx.b).iterator();
        while (it.hasNext()) {
            K((String) it.next());
        }
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7411934b", new Object[]{this});
        } else {
            vd7.e(this.f23749a).i(Login.getUserId());
        }
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25842d10", new Object[]{this});
        } else if (b9l.m(this.f23749a)) {
            WidgetVivoService.n(this.f23749a, "");
        }
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69440539", new Object[]{this});
            return;
        }
        if (qj7.m(this.f23749a)) {
            cdx.a("widget_xiaomi_support");
        }
        if (qj7.q(this.f23749a, "")) {
            cdx.a("widget_vivo_support");
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9284262", new Object[]{this});
        } else {
            obx.f(this.f23749a).G();
        }
    }

    @Override // tb.yyb
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da277f39", new Object[]{this, str});
        }
    }

    @Override // tb.yyb
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad91c6f4", new Object[]{this, str});
        } else {
            nn8.c().execute(new c(str));
        }
    }

    @Override // tb.m32
    public void y(String str, Integer num, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f165dbb9", new Object[]{this, str, num, str2});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(num);
        z(str, arrayList, str2);
    }

    public void S(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("235efcd", new Object[]{this, hashMap});
            return;
        }
        try {
            R();
            P();
            M(false);
            T();
            Q();
        } catch (Throwable th) {
            hgh.c(dcx.class, "workBackground error: " + th.getMessage());
        }
    }

    @Override // tb.m32
    public void z(String str, List<Integer> list, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce76a043", new Object[]{this, str, list, str2});
            return;
        }
        try {
            if (o8l.b()) {
                if (((JSONObject) JSON.parse(str2)).containsKey("id")) {
                    WidgetContentData widgetContentData = (WidgetContentData) JSON.parseObject(str2, WidgetContentData.class);
                    if (this.e.size() > 0) {
                        hgh.c(dcx.class, "widgetDataUpdate mWidgetProviderMap: " + this.e);
                        for (Map.Entry<String, sde> entry : this.e.entrySet()) {
                            if (widgetContentData.isDynamic()) {
                                entry.getValue().b(str, list, widgetContentData);
                                hgh.c(dcx.class, "widgetDataUpdate notifyDataUpdate isDynamic=true, name=" + entry.getKey());
                            } else {
                                JSONArray jSONArray = ((JSONObject) JSON.parse(widgetContentData.getJsonContent())).getJSONArray("data");
                                if (!(jSONArray == null || jSONArray.size() == 0)) {
                                    entry.getValue().a(str, list, ((JSONObject) jSONArray.get(0)).toString());
                                    hgh.c(dcx.class, "widgetDataUpdate notifyDataUpdate isDynamic=false, name=" + entry.getKey());
                                }
                                return;
                            }
                        }
                    }
                } else if (this.e.size() > 0) {
                    hgh.c(dcx.class, "widgetDataUpdate mWidgetProviderMap old: " + this.e);
                    for (Map.Entry<String, sde> entry2 : this.e.entrySet()) {
                        entry2.getValue().a(str, list, str2);
                    }
                }
            } else if (this.e.size() > 0) {
                hgh.c(dcx.class, "widgetDataUpdate mWidgetProviderMap: " + this.e);
                for (Map.Entry<String, sde> entry3 : this.e.entrySet()) {
                    entry3.getValue().a(str, list, str2);
                }
            }
        } catch (Exception e) {
            hgh.c(dcx.class, "widgetDataUpdate error" + e.getMessage());
            cdx.b("widget_catch_error", "widgetDataUpdate error", e.getMessage(), null);
        }
    }

    @Override // tb.m32
    public void m(List<String> list, String str, x3o x3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6df683c", new Object[]{this, list, str, x3oVar});
        } else if (list != null && list.size() != 0) {
            if (!qym.a() || !b9l.u(this.f23749a)) {
                hcx.d(list, str, false, this, x3oVar);
                return;
            }
            hgh.b("requestData widgetProcess");
            hcx.d(list, str, true, this, x3oVar);
        }
    }
}
