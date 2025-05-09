package tb;

import android.text.TextUtils;
import androidx.collection.LongSparseArray;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.detail.rate.vivid.presenter.PreRequestPresenter;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.de5;
import tb.dra;
import tb.gan;
import tb.gra;
import tb.jan;
import tb.tit;
import tb.u9n;
import tb.vy5;
import tb.wz5;
import tb.yz5;
import tb.zpa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class knn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DinamicXEngine f22784a;
    public final Map<String, WeakReference<DinamicXEngine>> b;
    public final LongSparseArray<qub> c;
    public final LongSparseArray<evb> d;
    public final LongSparseArray<mvb> e;
    public final LongSparseArray<w8> f;
    public final ra6 g;
    public final boolean h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f22785a;
        public final /* synthetic */ d b;

        public a(knn knnVar, d dVar, List list) {
            this.b = dVar;
            this.f22785a = list;
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            tit.a b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
                return;
            }
            List<DXTemplateItem> list = k66Var.f22428a;
            if (list == null || list.isEmpty()) {
                hrg.c(fdv.F_TEMPLATE_DOWNLOAD, "result_error", "3.0模板下载失败", "RecommendDinamicXCenter", "list : " + JSON.toJSONString(this.f22785a));
            } else {
                d dVar = this.b;
                if (dVar != null) {
                    dVar.onSuccess();
                }
            }
            List<zh6> list2 = k66Var.c;
            if (!(list2 == null || list2.isEmpty())) {
                for (zh6 zh6Var : k66Var.c) {
                    if (zh6Var.c == 1000) {
                        JSONObject jSONObject = zh6Var.b;
                        ddv.e(zh6Var.f32770a, jSONObject, PreRequestPresenter.SOURCE_RATE_HISTORY, "recommend dinamicX3 render failedv ", "GUESS_YOU_LIKE");
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
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final knn f22786a = new knn(null);

        static {
            t2o.a(729809646);
        }

        public static /* synthetic */ knn a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (knn) ipChange.ipc$dispatch("f45dfbe7", new Object[0]);
            }
            return f22786a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
        void onSuccess();
    }

    static {
        t2o.a(729809644);
    }

    public /* synthetic */ knn(a aVar) {
        this();
    }

    public static knn g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (knn) ipChange.ipc$dispatch("480107c1", new Object[0]);
        }
        return c.a();
    }

    public final boolean b(DXTemplateItem dXTemplateItem, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4929c1c", new Object[]{this, dXTemplateItem, list})).booleanValue();
        }
        for (DXTemplateItem dXTemplateItem2 : list) {
            if (dXTemplateItem2.equals(dXTemplateItem)) {
                return true;
            }
        }
        return false;
    }

    public final DinamicXEngine c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("908651ce", new Object[]{this});
        }
        return new DinamicXEngine(new DXEngineConfig.b("guess").Q(2).c0(1000).X(53).Y("guess").H(false, false).S(false).c0(1000).F());
    }

    public DinamicXEngine d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("e50c6a04", new Object[]{this, str});
        }
        if (!this.h) {
            return h();
        }
        DinamicXEngine c2 = c();
        if (b9b.c(str)) {
            c2.d().b(true, b9b.f());
        }
        m(c2);
        ((HashMap) this.b).put(str, new WeakReference(c2));
        return c2;
    }

    public void e(List<SectionModel> list, String str, d dVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d45552", new Object[]{this, list, str, dVar, str2});
        } else {
            f(list, str, false, dVar, str2);
        }
    }

    public void f(List<SectionModel> list, String str, boolean z, d dVar, String str2) {
        DinamicXEngine dinamicXEngine;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df6be0de", new Object[]{this, list, str, new Boolean(z), dVar, str2});
        } else if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            WeakReference weakReference = (WeakReference) ((HashMap) this.b).get(str2);
            if (!this.h) {
                dinamicXEngine = h();
            } else if (weakReference == null || weakReference.get() == null) {
                dinamicXEngine = this.f22784a;
            } else {
                dinamicXEngine = (DinamicXEngine) weakReference.get();
            }
            for (SectionModel sectionModel : list) {
                if (!(sectionModel == null || (jSONObject = sectionModel.getJSONObject("template")) == null)) {
                    tit.a b = tit.b(jSONObject);
                    if (z) {
                        b.a();
                    }
                    if (!b.h()) {
                        fve.e("RecommendDinamicXCenter", "不支持Dx2:" + b.d());
                    } else {
                        DXTemplateItem b2 = b.b();
                        if (b2 != null && !b(b2, arrayList)) {
                            arrayList.add(b2);
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (!TextUtils.equals("guess", str)) {
                bqa.d("RecommendDinamicXCenter", "current rmdEngine modulename is guess, cannot handle module : " + str);
                hrg.c(fdv.F_TEMPLATE_DOWNLOAD, "process_error", "不是猜你喜欢dinamic模块", "RecommendDinamicXCenter", "current rmdEngine modulename is guess, cannot handle module  : " + str + ", list3:" + JSON.toJSONString(arrayList));
                return;
            }
            dinamicXEngine.p(arrayList);
            dinamicXEngine.a1(new a(this, dVar, arrayList));
        }
    }

    public DinamicXEngine h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("99cc420b", new Object[]{this});
        }
        return this.f22784a;
    }

    public final void i(LongSparseArray<evb> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da956db", new Object[]{this, longSparseArray});
            return;
        }
        longSparseArray.put(z36.DX_PARSER_MAPTOARRAY, new z36());
        longSparseArray.put(9422011105736515L, new h16());
        longSparseArray.put(5284242828433939926L, new lp5());
        longSparseArray.put(1293712961081187802L, new np5());
        longSparseArray.put(-6150397287027100920L, new mm5());
        longSparseArray.put(nr5.DX_PARSER_TAOBAO_THEME_GET_CURRENT, new nr5());
        longSparseArray.put(or5.DX_PARSER_TAOBAO_THEME_VALID, new or5());
        longSparseArray.put(vl5.DX_PARSER_HGETDATA, new vl5());
        longSparseArray.put(6584495743641924598L, new am5());
        longSparseArray.put(6875012019473020234L, new nj5());
        longSparseArray.put(po5.DX_PARSER_NAVEXTHEIGHT, new po5());
        longSparseArray.put(hk5.DX_PARSER_FESTIVAL, new hk5());
        longSparseArray.put(-5348504102650243981L, new xj5());
        longSparseArray.put(9860385864900610L, new wo5());
        longSparseArray.put(8281326256809424134L, new ul5());
        longSparseArray.put(1466861815985736590L, new em5());
        longSparseArray.put(-2517623531547489759L, new lq5());
        longSparseArray.put(-8936854687533104177L, new ym5());
        longSparseArray.put(w18.DX_PARSER_HGETFROMCURRENTMODEL, new w18());
    }

    public final void j(LongSparseArray<mvb> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d704d4", new Object[]{this, longSparseArray});
            return;
        }
        longSparseArray.put(37581716043L, new e96());
        longSparseArray.put(d96.DX_EVENT_RTABITEMTAP, new d96());
        longSparseArray.put(5560765727008152586L, new h96());
        longSparseArray.put(6136827152325085276L, new z86());
        longSparseArray.put(-1980042490983877383L, new lc5());
        longSparseArray.put(fqa.DX_EVENT_HSAVEDATA, new fqa());
        longSparseArray.put(v36.DX_EVENT_MAINADDCART, new v36());
        longSparseArray.put(i16.DX_EVENT_INSERTCARDS, new i16());
        longSparseArray.put(xu5.DX_EVENT_ELDERTABCLICK, new xu5());
        longSparseArray.put(34696035233L, new c06());
        longSparseArray.put(-4629410644348754929L, new ub6());
        longSparseArray.put(sy5.DX_EVENT_HEDITIONSWITCH, new sy5());
        longSparseArray.put(fz5.DX_EVENT_HOPENPOP, new fz5());
        longSparseArray.put(mz5.DX_EVENT_HSEARCHTEXTSTORAGE, new mz5());
        longSparseArray.put(8520638904096683930L, new tz5());
        longSparseArray.put(-5738105571919564880L, new iz5());
        longSparseArray.put(9068808819005234401L, new qz5());
        longSparseArray.put(s66.DX_EVENT_OPENRECSKU, new s66());
        longSparseArray.put(h28.DX_EVENT_HSETTOCURRENTMODEL, new h28());
    }

    public final void k(LongSparseArray<qub> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a26d7e", new Object[]{this, longSparseArray});
            return;
        }
        longSparseArray.put(-7752096208734590680L, new u9n.b());
        if (vxl.o()) {
            longSparseArray.put(-8690577844899785500L, new gra.a());
        } else {
            longSparseArray.put(-8690577844899785500L, new dra.a());
        }
        longSparseArray.put(jan.d, new jan.b());
        longSparseArray.put(-6240570111658900479L, new vy5.a());
        longSparseArray.put(-5996311416603680075L, new yz5.d());
        longSparseArray.put(1202423593942681808L, new zpa.a());
        longSparseArray.put(-3771791355023224372L, new wz5.a());
    }

    public final boolean l() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80e67edb", new Object[]{this})).booleanValue();
        }
        if (b9b.h() || b9b.e()) {
            z = true;
        } else {
            z = false;
        }
        boolean b = f4b.b("enableSmallScreenMultiDxEngine", true);
        if (z || b) {
            return true;
        }
        return false;
    }

    public final void m(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0b7436d", new Object[]{this, dinamicXEngine});
            return;
        }
        e38.d(dinamicXEngine, this.c);
        dinamicXEngine.Q0(-7577370574697348630L, new gan.a());
        dinamicXEngine.P0(-7577370574697348630L, new de5.a());
        e38.b(dinamicXEngine, this.d);
        e38.c(dinamicXEngine, this.e);
        e38.a(dinamicXEngine, this.f);
        dinamicXEngine.T0(this.g);
        try {
            yc0.a(dinamicXEngine);
        } catch (Throwable th) {
            uqa.b("dxInit", "initFowAdDX error", th.getMessage());
        }
    }

    public knn() {
        this.b = new HashMap();
        LongSparseArray<qub> longSparseArray = new LongSparseArray<>();
        this.c = longSparseArray;
        LongSparseArray<evb> longSparseArray2 = new LongSparseArray<>();
        this.d = longSparseArray2;
        LongSparseArray<mvb> longSparseArray3 = new LongSparseArray<>();
        this.e = longSparseArray3;
        this.f = new LongSparseArray<>();
        this.g = new oa6();
        boolean l = l();
        this.h = l;
        fve.e("RecommendDinamicXCenter", "购后是否允许 DX多实例 ： " + l);
        k(longSparseArray);
        j(longSparseArray3);
        i(longSparseArray2);
        DinamicXEngine c2 = c();
        this.f22784a = c2;
        m(c2);
    }
}
