package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.ArrayList;
import java.util.List;
import tb.eqa;
import tb.gqa;
import tb.tit;
import tb.vy5;
import tb.zpa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h5b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DinamicXEngine f20417a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements dvb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(h5b h5bVar) {
        }

        @Override // tb.dvb
        public /* synthetic */ boolean a() {
            return false;
        }

        @Override // tb.dvb
        public boolean b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a0472965", new Object[]{this, context})).booleanValue();
            }
            if (com.taobao.tao.topmultitab.service.controller.a.e() || !oza.a(context)) {
                return false;
            }
            return true;
        }

        @Override // tb.dvb
        public int c(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b7653c70", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
            }
            return i2;
        }

        @Override // tb.dvb
        public void disableForceDark(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ecef35d2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f20418a;

        public b(h5b h5bVar, e eVar) {
            this.f20418a = eVar;
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            tit.a b;
            e eVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
                return;
            }
            List<DXTemplateItem> list = k66Var.f22428a;
            if (!(list == null || list.isEmpty() || (eVar = this.f20418a) == null)) {
                eVar.onSuccess();
            }
            List<zh6> list2 = k66Var.c;
            if (!(list2 == null || list2.isEmpty())) {
                for (zh6 zh6Var : k66Var.c) {
                    if (zh6Var.c == 1000) {
                        JSONObject jSONObject = zh6Var.b;
                        ddv.e(zh6Var.f32770a, jSONObject, "-1", "homepage dinamicX3.0 render failed", "");
                        if (!(jSONObject == null || (b = tit.b(jSONObject.getJSONObject("template"))) == null)) {
                            b.a();
                            b.i(true);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final h5b f20419a = new h5b(null);

        static {
            t2o.a(729809266);
        }

        public static /* synthetic */ h5b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h5b) ipChange.ipc$dispatch("3074da60", new Object[0]);
            }
            return f20419a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
        void onSuccess();
    }

    static {
        t2o.a(729809263);
    }

    public /* synthetic */ h5b(a aVar) {
        this();
    }

    public static h5b e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h5b) ipChange.ipc$dispatch("1aeeecc6", new Object[0]);
        }
        return d.a();
    }

    public final void b(JSONObject jSONObject, List<DinamicTemplate> list, List<DXTemplateItem> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a35b52", new Object[]{this, jSONObject, list, list2});
            return;
        }
        tit.a b2 = tit.b(jSONObject);
        if (b2 != null) {
            if (!b2.h()) {
                DinamicTemplate c = b2.c();
                if (c != null) {
                    list.add(c);
                    return;
                }
                return;
            }
            DXTemplateItem b3 = b2.b();
            if (b3 != null) {
                list2.add(b3);
            }
        }
    }

    public void c(List<SectionModel> list, String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1d85dd", new Object[]{this, list, str, eVar});
        } else if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (SectionModel sectionModel : list) {
                a(sectionModel, arrayList, arrayList2);
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            if (!TextUtils.equals("homepage", str)) {
                bqa.d("HomepageDinamicXCenter", "current homePageEngine modulename is homepage, cannot handle module : " + str);
                return;
            }
            this.f20417a.p(arrayList2);
            this.f20417a.a1(new b(this, eVar));
        }
    }

    public DinamicXEngine d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("133ac77a", new Object[]{this});
        }
        if (!this.f20417a.q()) {
            this.f20417a.q0();
            f();
            bqa.d("HomepageDinamicXCenter", "engine init failed, rebuild engine.");
        }
        return this.f20417a;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        DinamicXEngine dinamicXEngine = this.f20417a;
        if (dinamicXEngine == null || !dinamicXEngine.q()) {
            f0b.i().p("HomepageDinamicXCenter-init", 4);
            DXEngineConfig.b c0 = new DXEngineConfig.b("homepage").Q(2).c0(1000);
            if (vxl.f()) {
                c0.S(false);
            }
            c0.c0(1000);
            if (b9b.b()) {
                c0.H(true, b9b.f());
            }
            this.f20417a = new DinamicXEngine(c0.F());
            f0b.i().c("HomepageDinamicXCenter-init");
        }
        this.f20417a.e1(1202423593942681808L, new zpa.a());
        this.f20417a.e1(-6240570111658900479L, new vy5.a());
        this.f20417a.W0(34696035233L, new g18(new c06()));
        this.f20417a.W0(-1980042490983877383L, new g18(new lc5()));
        this.f20417a.W0(sy5.DX_EVENT_HEDITIONSWITCH, new g18(new sy5()));
        this.f20417a.V0(-5348504102650243981L, new h18(new xj5()));
        this.f20417a.W0(fz5.DX_EVENT_HOPENPOP, new g18(new fz5()));
        this.f20417a.W0(mz5.DX_EVENT_HSEARCHTEXTSTORAGE, new g18(new mz5()));
        this.f20417a.W0(8520638904096683930L, new g18(new tz5()));
        this.f20417a.W0(-5738105571919564880L, new g18(new iz5()));
        this.f20417a.W0(b06.DX_EVENT_HTABCLICK, new g18(new b06()));
        this.f20417a.W0(fqa.DX_EVENT_HSAVEDATA, new g18(new fqa()));
        this.f20417a.W0(nz5.DX_EVENT_HSETDATATOMODEL, new g18(new nz5()));
        this.f20417a.W0(9068808819005234401L, new g18(new qz5()));
        this.f20417a.W0(2989037286431506580L, new g18(new kj6()));
        this.f20417a.W0(-1826592666711771899L, new g18(new hj6()));
        this.f20417a.W0(3191997408029463605L, new g18(new gz5()));
        this.f20417a.V0(9422011105736515L, new h18(new h16()));
        this.f20417a.V0(z36.DX_PARSER_MAPTOARRAY, new h18(new z36()));
        this.f20417a.V0(po5.DX_PARSER_NAVEXTHEIGHT, new h18(new po5()));
        this.f20417a.V0(hk5.DX_PARSER_FESTIVAL, new h18(new hk5()));
        this.f20417a.V0(1466861815985736590L, new h18(new em5()));
        this.f20417a.V0(-2517623531547489759L, new h18(new lq5()));
        this.f20417a.V0(zp5.DX_PARSER_REVISIONSWITCH, new h18(new zp5()));
        this.f20417a.V0(nm5.DX_PARSER_HTABSELECTEDINDEX, new h18(new nm5()));
        this.f20417a.V0(7444296532363656600L, new h18(new wk5()));
        this.f20417a.V0(nr5.DX_PARSER_TAOBAO_THEME_GET_CURRENT, new h18(new nr5()));
        this.f20417a.V0(or5.DX_PARSER_TAOBAO_THEME_VALID, new h18(new or5()));
        this.f20417a.V0(vl5.DX_PARSER_HGETDATA, new h18(new vl5()));
        this.f20417a.V0(6584495743641924598L, new h18(new am5()));
        this.f20417a.V0(im5.DX_PARSER_HISCLIENTCACHE, new h18(new im5()));
        this.f20417a.V0(yl5.DX_PARSER_HGETLASTCLICKEDPOPID, new h18(new yl5()));
        this.f20417a.V0(6875012019473020234L, new h18(new nj5()));
        this.f20417a.V0(jm5.DX_PARSER_HLOGIN, new h18(new jm5()));
        this.f20417a.V0(km5.DX_PARSER_HSEARCHBARDATA, new km5());
        this.f20417a.V0(wl5.DX_PARSER_HGETEXTERNALDATA, new wl5());
        this.f20417a.V0(sm5.DX_PARSER_HTABCONTENTDISPLAYLAYOUTTYPE, new h18(new sm5()));
        this.f20417a.V0(gn5.DX_PARSER_ISNEWPULL, new h18(new gn5()));
        this.f20417a.W0(5560765727008152586L, new g18(new h96()));
        this.f20417a.J0(gqa.HSHOWPOP, new gqa.b());
        this.f20417a.J0(eqa.HREFRESHIMAGE, new eqa.a());
        this.f20417a.O0(new a(this));
        rcm.f(j3z.DX_PARSER_HGETTABLAYOUTLEFTICONINFO, new j3z());
        rcm.e(sy5.DX_EVENT_HEDITIONSWITCH, new sy5());
        rcm.e(r3z.DX_EVENT_HUPDATEEDITIONSWITCH, new r3z());
        this.f20417a.V0(j3z.DX_PARSER_HGETTABLAYOUTLEFTICONINFO, new j3z());
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b51c9aa", new Object[]{this})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.f20417a;
        if (dinamicXEngine == null) {
            return false;
        }
        return dinamicXEngine.d().v();
    }

    public h5b() {
        f();
    }

    public final void a(JSONObject jSONObject, List<DinamicTemplate> list, List<DXTemplateItem> list2) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("700c7f04", new Object[]{this, jSONObject, list, list2});
        } else if (jSONObject != null) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("template");
            if (f0p.a() && TextUtils.equals(jSONObject.getString("sectionBizCode"), "DXSearchBar") && (jSONObject3 = jSONObject.getJSONObject("style")) != null) {
                jSONObject4 = jSONObject3.getJSONObject("template");
            }
            if (jSONObject4 != null) {
                b(jSONObject4, list, list2);
            }
            JSONObject jSONObject5 = jSONObject.getJSONObject("ext");
            if (!(jSONObject5 == null || !TextUtils.equals("true", jSONObject5.getString("downloadSubSectionTemplates")) || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null)) {
                for (int i = 0; jSONObject2.containsKey(String.valueOf(i)); i++) {
                    JSONObject jSONObject6 = jSONObject2.getJSONObject(String.valueOf(i));
                    JSONObject jSONObject7 = jSONObject6 != null ? jSONObject6.getJSONObject("template") : null;
                    if (jSONObject7 != null) {
                        b(jSONObject7, list, list2);
                    }
                }
            }
        }
    }
}
