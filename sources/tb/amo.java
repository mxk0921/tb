package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.track.XSWeexRenderTrackEvent;
import java.util.HashSet;
import java.util.Set;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class amo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIMENSION_BUSINESS_NAME = "businessName";
    public static final String DIMENSION_ERROR_MSG = "errorMsg";
    public static final String DIMENSION_ITEM_TYPE = "tItemType";
    public static final String DIMENSION_JSVERSION = "jsversion";
    public static final String DIMENSION_PAGENAME = "pageName";
    public static final String DIMENSION_QKING3 = "qking_version";
    public static final String DIMENSION_SVERSION = "sversion";
    public static final String DIMENSION_URL = "url";
    public static final double FAIL = 1.0d;
    public static final String MODULE_NAME = "XSearch";
    public static final double SUCCESS = 0.0d;
    public static final Set<String> WEEX_ERR_CODE_WHITE_LIST;
    public static boolean g = false;
    public static boolean h = false;
    public static boolean i = false;
    public static boolean j = false;
    public static boolean k = false;

    /* renamed from: a  reason: collision with root package name */
    public final String f15839a;
    public final yko b;
    public final a c = new a();
    public final d d = new d();
    public final e e = new e();
    public final b f = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final double DATA_WRONG_FORMAT = 2.0d;
        public static final String ERROR_POINT_NAME = "availableError";
        public static final double JS_DOWNLOAD_FAIL = 5.0d;
        public static final double JS_ERROR = 3.0d;
        public static final String MEASURE_CODE = "code";
        public static final String POINT_NAME = "available";
        public static final double SERVER_TEMPLATE_MISS = 4.0d;

        static {
            t2o.a(993002169);
        }

        public a() {
        }

        public void a(String str, String str2, String str3, double d, String str4, String str5) {
            String str6 = str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34d35eb8", new Object[]{this, str, str2, str3, new Double(d), str6, str5});
                return;
            }
            amo.a();
            amo amoVar = amo.this;
            AppMonitor.Stat.commit(amo.MODULE_NAME, POINT_NAME, amoVar.i(amoVar.g(), str, str2, str3, str5), amo.this.m("code", d, vu3.b.GEO_NOT_SUPPORT));
            if (!TextUtils.isEmpty(str4)) {
                int indexOf = str6.indexOf("exception function:");
                if (indexOf > 0) {
                    str6 = str6.substring(indexOf + 19);
                }
                int indexOf2 = str6.indexOf(", extInitTime:");
                if (indexOf2 > 0) {
                    str6 = str6.substring(0, indexOf2);
                }
                str6 = str6.replace("\n", "__n__");
                if (str6.length() > 1024) {
                    str6 = str6.substring(0, 1024);
                }
            }
            amo.b();
            amo amoVar2 = amo.this;
            AppMonitor.Stat.commit(amo.MODULE_NAME, ERROR_POINT_NAME, amoVar2.k(amoVar2.g(), str, str2, str3, str6, str5), amo.this.m("code", d, vu3.b.GEO_NOT_SUPPORT));
        }

        public void b(String str, String str2, String str3, double d, String str4, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b6a0c26", new Object[]{this, str, str2, str3, new Double(d), str4, new Boolean(z)});
            } else {
                a(str, str2, str3, d, str4, "");
            }
        }

        public void c(String str, String str2, String str3, double d, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcc42ff7", new Object[]{this, str, str2, str3, new Double(d), str4});
                return;
            }
            amo.a();
            amo amoVar = amo.this;
            AppMonitor.Stat.commit(amo.MODULE_NAME, POINT_NAME, amoVar.i(amoVar.g(), str, str2, str3, str4), amo.this.m("code", d, vu3.b.GEO_NOT_SUPPORT));
        }

        public void d(String str, String str2, String str3, double d, String str4, String str5, String str6) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b948e62", new Object[]{this, str, str2, str3, new Double(d), str4, str5, str6});
            } else {
                a(str, str2, str3, d, str5, str6);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MEASURE_CODE = "code";
        public static final String POINT_NAME = "degradation";

        static {
            t2o.a(993002170);
        }

        public b() {
        }

        public void a(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("426ed724", new Object[]{this, str, str2, str3, str4});
                return;
            }
            amo.r();
            amo amoVar = amo.this;
            AppMonitor.Stat.commit(amo.MODULE_NAME, POINT_NAME, amoVar.i(amoVar.g(), str, str2, str3, str4), amo.this.m("code", 1.0d, vu3.b.GEO_NOT_SUPPORT));
        }

        public void b(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcc5c67b", new Object[]{this, str, str2, str3, str4});
                return;
            }
            amo.r();
            amo amoVar = amo.this;
            AppMonitor.Stat.commit(amo.MODULE_NAME, POINT_NAME, amoVar.i(amoVar.g(), str, str2, str3, str4), amo.this.m("code", vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MEASURE_TOTAL_TIME = "totalTime";
        public static final String POINT_NAME = "downloadTime";

        static {
            t2o.a(993002171);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MEASURE_TOTAL_TIME = "totalTime";
        public static final String POINT_NAME = "loadPerformance";

        static {
            t2o.a(993002172);
        }

        public d() {
        }

        public void a(String str, String str2, String str3, double d, boolean z, boolean z2) {
            String str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6615cc22", new Object[]{this, str, str2, str3, new Double(d), new Boolean(z), new Boolean(z2)});
                return;
            }
            amo.c();
            amo amoVar = amo.this;
            DimensionValueSet i = amoVar.i(amoVar.g(), str, str2, str3, "");
            if (z2) {
                str4 = "2.0";
            } else {
                str4 = k75.VIDEOCONFIG_API_VERSION_3;
            }
            i.setValue(amo.DIMENSION_QKING3, str4);
            AppMonitor.Stat.commit(amo.MODULE_NAME, POINT_NAME, i, amo.this.m("totalTime", d, 1.0d));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MEASURE_TOTAL_TIME = "totalTime";
        public static final String POINT_NAME = "refreshPerformance";

        static {
            t2o.a(993002173);
        }

        public e() {
        }

        public void a(String str, String str2, String str3, double d, boolean z, boolean z2) {
            String str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6615cc22", new Object[]{this, str, str2, str3, new Double(d), new Boolean(z), new Boolean(z2)});
                return;
            }
            amo.d();
            amo amoVar = amo.this;
            DimensionValueSet i = amoVar.i(amoVar.g(), str, str2, str3, "");
            if (z2) {
                str4 = "2.0";
            } else {
                str4 = k75.VIDEOCONFIG_API_VERSION_3;
            }
            i.setValue(amo.DIMENSION_QKING3, str4);
            AppMonitor.Stat.commit(amo.MODULE_NAME, POINT_NAME, i, amo.this.m("totalTime", d, 1.0d));
        }
    }

    static {
        t2o.a(993002168);
        HashSet hashSet = new HashSet();
        WEEX_ERR_CODE_WHITE_LIST = hashSet;
        hashSet.add("-2013");
        hashSet.add("-2116");
        hashSet.add("-9400");
        hashSet.add("-9401");
        hashSet.add("-9600");
        hashSet.add("-9700");
        hashSet.add("-9611");
        hashSet.add("-9616");
        hashSet.add("-9619");
        hashSet.add("-9620");
        hashSet.add("-9801");
        hashSet.add("-1007");
        hashSet.add("-1006");
        hashSet.add("-1000");
    }

    public amo(String str, yko ykoVar) {
        this.f15839a = str;
        this.b = ykoVar;
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            p();
        }
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            q();
        }
    }

    public static /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a27df9", new Object[0]);
        } else {
            s();
        }
    }

    public static /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b88b93a", new Object[0]);
        } else {
            t();
        }
    }

    public static DimensionSet h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionSet) ipChange.ipc$dispatch("d4bafc46", new Object[0]);
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension(DIMENSION_BUSINESS_NAME);
        create.addDimension("tItemType");
        create.addDimension("sversion");
        create.addDimension(DIMENSION_JSVERSION);
        create.addDimension("pageName");
        create.addDimension("url");
        return create;
    }

    public static DimensionSet j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionSet) ipChange.ipc$dispatch("ecc3e602", new Object[0]);
        }
        DimensionSet h2 = h();
        h2.addDimension("errorMsg");
        return h2;
    }

    public static MeasureSet l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureSet) ipChange.ipc$dispatch("a2fd2695", new Object[]{str});
        }
        MeasureSet create = MeasureSet.create();
        create.addMeasure(str);
        create.addMeasure("__type__" + str);
        return create;
    }

    public static void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7847a4ed", new Object[0]);
        } else if (!h) {
            h = true;
            AppMonitor.register(MODULE_NAME, a.POINT_NAME, l("code"), h(), true);
        }
    }

    public static void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3461c9", new Object[0]);
        } else if (!i) {
            i = true;
            AppMonitor.register(MODULE_NAME, a.ERROR_POINT_NAME, l("code"), j(), true);
        }
    }

    public static void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec84fada", new Object[0]);
        } else if (!g) {
            g = true;
            AppMonitor.register(MODULE_NAME, b.POINT_NAME, l("code"), h(), true);
        }
    }

    public static void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26a1f4e", new Object[0]);
        } else if (!j) {
            j = true;
            DimensionSet h2 = h();
            h2.addDimension(DIMENSION_QKING3);
            AppMonitor.register(MODULE_NAME, d.POINT_NAME, l("totalTime"), h2);
        }
    }

    public static void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44aa9edf", new Object[0]);
        } else if (!k) {
            k = true;
            DimensionSet h2 = h();
            h2.addDimension(DIMENSION_QKING3);
            AppMonitor.register(MODULE_NAME, e.POINT_NAME, l("totalTime"), h2);
        }
    }

    public a e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("11d63aa7", new Object[]{this});
        }
        return this.c;
    }

    public b f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b5c82a6d", new Object[]{this});
        }
        return this.f;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4431af83", new Object[]{this});
        }
        return this.f15839a;
    }

    public DimensionValueSet i(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionValueSet) ipChange.ipc$dispatch("7594fcd0", new Object[]{this, str, str2, str3, str4, str5});
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue(DIMENSION_BUSINESS_NAME, str);
        create.setValue("tItemType", str2);
        create.setValue("sversion", this.b.g().a());
        create.setValue(DIMENSION_JSVERSION, str3);
        create.setValue("pageName", str4);
        create.setValue("url", str5);
        return create;
    }

    public DimensionValueSet k(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionValueSet) ipChange.ipc$dispatch("4cb7542", new Object[]{this, str, str2, str3, str4, str5, str6});
        }
        DimensionValueSet i2 = i(str, str2, str3, str4, str6);
        i2.setValue("errorMsg", str5);
        return i2;
    }

    public MeasureValueSet m(String str, double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureValueSet) ipChange.ipc$dispatch("b0addfcd", new Object[]{this, str, new Double(d2), new Double(d3)});
        }
        MeasureValueSet create = MeasureValueSet.create();
        create.setValue(str, d2);
        create.setValue("__type__" + str, d3);
        return create;
    }

    public d n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("6ed1061f", new Object[]{this});
        }
        return this.d;
    }

    public e o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("9cb7f09d", new Object[]{this});
        }
        return this.e;
    }

    public void onEventMainThread(XSWeexRenderTrackEvent xSWeexRenderTrackEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858fab49", new Object[]{this, xSWeexRenderTrackEvent});
            return;
        }
        String currentPageName = c2v.getInstance().getCurrentPageName();
        int i2 = xSWeexRenderTrackEvent.f9347a;
        if (i2 == 0) {
            if (xSWeexRenderTrackEvent.g < 8000.0d) {
                d n = n();
                TemplateBean templateBean = xSWeexRenderTrackEvent.d;
                n.a(templateBean.templateName, templateBean.version, currentPageName, xSWeexRenderTrackEvent.g, templateBean.binary, xSWeexRenderTrackEvent.h);
            }
            a e2 = e();
            TemplateBean templateBean2 = xSWeexRenderTrackEvent.d;
            e2.c(templateBean2.templateName, templateBean2.version, currentPageName, vu3.b.GEO_NOT_SUPPORT, xSWeexRenderTrackEvent.c);
        } else if (i2 == 1) {
            if (xSWeexRenderTrackEvent.g < 8000.0d) {
                e o = o();
                TemplateBean templateBean3 = xSWeexRenderTrackEvent.d;
                o.a(templateBean3.templateName, templateBean3.version, currentPageName, xSWeexRenderTrackEvent.g, templateBean3.binary, xSWeexRenderTrackEvent.h);
            }
            a e3 = e();
            TemplateBean templateBean4 = xSWeexRenderTrackEvent.d;
            e3.c(templateBean4.templateName, templateBean4.version, currentPageName, vu3.b.GEO_NOT_SUPPORT, xSWeexRenderTrackEvent.c);
        } else if (i2 == 2) {
            a e4 = e();
            TemplateBean templateBean5 = xSWeexRenderTrackEvent.d;
            e4.d(templateBean5.templateName, templateBean5.version, currentPageName, 1.0d, xSWeexRenderTrackEvent.e, xSWeexRenderTrackEvent.f, xSWeexRenderTrackEvent.c);
        } else if (i2 == 3) {
            e().a(xSWeexRenderTrackEvent.b, null, currentPageName, 4.0d, "template miss", xSWeexRenderTrackEvent.c);
        } else if (i2 == 4) {
            if (xSWeexRenderTrackEvent.f == null) {
                f().b(xSWeexRenderTrackEvent.b, null, currentPageName, xSWeexRenderTrackEvent.c);
            } else {
                f().a(xSWeexRenderTrackEvent.b, null, currentPageName, xSWeexRenderTrackEvent.c);
            }
        }
    }
}
