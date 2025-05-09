package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.falco.m;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class tmf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final tmf INSTANCE = new tmf();
    public static final String MODULE_CHAIN = "PLT_CHAIN";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28800a;
    public static boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pmf f28801a;

        public a(pmf pmfVar) {
            this.f28801a = pmfVar;
        }

        @Override // com.taobao.falco.m.a
        public final void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
            } else if (mVar != null) {
                pmf pmfVar = this.f28801a;
                mVar.h(Long.valueOf(hfn.d(pmfVar.W0(), pmfVar.X0())));
            }
        }
    }

    static {
        t2o.a(481297182);
    }

    public static /* synthetic */ void b(tmf tmfVar, Map map, String str, long j, Long l, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f9a49f", new Object[]{tmfVar, map, str, new Long(j), l, new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        tmfVar.a(map, str, j, l);
    }

    @JvmStatic
    public static final void e(wlf wlfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc19d05", new Object[]{wlfVar});
        } else if (wlfVar != null) {
            tmf tmfVar = INSTANCE;
            tmfVar.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            tmfVar.g(wlfVar, linkedHashMap);
            HashMap hashMap = new HashMap();
            if (wlfVar.d()) {
                hashMap.put("success", Double.valueOf(1.0d));
                hashMap.put("failure", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT));
            } else {
                hashMap.put("failure", Double.valueOf(1.0d));
                hashMap.put("success", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT));
            }
            jzu.d("PLT", "IrpAva", hashMap, linkedHashMap);
        }
    }

    @JvmStatic
    public static final void f(pmf pmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a47ab4", new Object[]{pmfVar});
        } else if (pmfVar != null) {
            tmf tmfVar = INSTANCE;
            tmfVar.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            tmfVar.h(pmfVar, linkedHashMap);
            HashMap hashMap = new HashMap();
            tmfVar.i(pmfVar, hashMap);
            tmfVar.k(pmfVar, hashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            tmfVar.j(pmfVar, linkedHashMap2);
            jzu.d("PLT", "IrpLoad", hashMap, linkedHashMap);
            if (pmfVar.Y() != null) {
                zno.p(pmfVar.Y(), "irpPerfDimension", linkedHashMap);
                zno.p(pmfVar.Y(), "irpPerfMeasure", hashMap);
                zno.p(pmfVar.Y(), "irpPerfNodeResult", linkedHashMap2);
                zno.q(pmfVar.Y(), "bizPageLoadEnd", Long.valueOf(hfn.d(pmfVar.e(), pmfVar.f())));
                FalcoGlobalTracer.get().j(new a(pmfVar));
            }
            TLogTracker.f("IrpPerf", "Default", JSON.toJSONString(hashMap));
        }
    }

    public final void a(Map<String, Double> map, String str, long j, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b1a7aa", new Object[]{this, map, str, new Long(j), l});
        } else if (j > 0) {
            if (l == null || j <= l.longValue()) {
                map.put(str, Double.valueOf(j));
            }
        }
    }

    public final void g(wlf wlfVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aebd12bd", new Object[]{this, wlfVar, map});
            return;
        }
        String f = wlfVar.f();
        String str = "unknown";
        if (f == null) {
            f = str;
        }
        map.put("pssource", f);
        String e = wlfVar.e();
        if (e == null) {
            e = str;
        }
        map.put(wxi.KEY_PHOTO_FROM, e);
        map.put("device_level", String.valueOf(ri7.b()));
        String c = e0.c("tbAndroidPltIrpBackSourceOfflineV2");
        if (TextUtils.isEmpty(c)) {
            c = "-1";
        }
        ckf.f(c, "irpBucketId");
        map.put("bucket_id", c);
        map.put("ava_type", wlfVar.a());
        if (!wlfVar.d()) {
            String b2 = wlfVar.b();
            if (b2 == null) {
                b2 = str;
            }
            map.put("err_type", b2);
            String c2 = wlfVar.c();
            if (c2 != null) {
                str = c2;
            }
            map.put("err_msg", str);
        }
    }

    public final void h(pmf pmfVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31f2834", new Object[]{this, pmfVar, map});
            return;
        }
        map.put("page_rebuild", String.valueOf(pmfVar.d0()));
        String a0 = pmfVar.a0();
        String str = "unknown";
        if (a0 == null) {
            a0 = str;
        }
        map.put("pssource", a0);
        String Z = pmfVar.Z();
        if (Z != null) {
            str = Z;
        }
        map.put(wxi.KEY_PHOTO_FROM, str);
        String c = e0.c("tbAndroidPltIrpBackSourceOfflineV2");
        if (TextUtils.isEmpty(c)) {
            c = "-1";
        }
        ckf.f(c, "irpBucketId");
        map.put("bucket_id", c);
        map.put("device_level", String.valueOf(ri7.b()));
        String a2 = pmfVar.a();
        if (a2 == null) {
            a2 = "";
        }
        map.put("auto_task_id", a2);
        map.put("face_count", String.valueOf(pmfVar.c()));
        map.put("watermark_status", String.valueOf(pmfVar.b0()));
        map.put("channel", String.valueOf(pmfVar.b()));
        map.put("network_quality_level", String.valueOf(pmfVar.X()));
    }

    public final void i(pmf pmfVar, Map<String, Double> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acf338d", new Object[]{this, pmfVar, map});
            return;
        }
        b(this, map, "irp_open_with_first_item_render", pmfVar.z() - pmfVar.d(), null, 8, null);
        b(this, map, "irp_open_final", hfn.d(pmfVar.z(), pmfVar.F()) - pmfVar.d(), null, 8, null);
        b(this, map, "irp_open_with_anim", pmfVar.F() - pmfVar.d(), null, 8, null);
        b(this, map, "irp_open", pmfVar.E() - pmfVar.d(), null, 8, null);
        b(this, map, "irp_open_pre_process", pmfVar.x() - pmfVar.d(), null, 8, null);
        b(this, map, "irp_load_with_anim", pmfVar.F() - pmfVar.x(), null, 8, null);
        b(this, map, "irp_load", pmfVar.E() - pmfVar.x(), null, 8, null);
        b(this, map, "irp_init", pmfVar.w() - pmfVar.x(), null, 8, null);
        b(this, map, "irp_muise_init", pmfVar.I() - pmfVar.J(), null, 8, null);
        b(this, map, "irp_image_load_wait", pmfVar.s() - pmfVar.x(), null, 8, null);
        b(this, map, "irp_net_wait", pmfVar.S() - pmfVar.x(), null, 8, null);
        a(map, "irp_muise_data_transfer", pmfVar.E() - pmfVar.G(), 3000L);
    }

    public final void j(pmf pmfVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33b36bcb", new Object[]{this, pmfVar, map});
            return;
        }
        map.put("image_compress_maxlength", Integer.valueOf(pmfVar.n()));
        String m = pmfVar.m();
        String str = "";
        if (m == null) {
            m = str;
        }
        map.put("image_compress_format_type", m);
        String t = pmfVar.t();
        if (t == null) {
            t = str;
        }
        map.put("image_size_origin", t);
        map.put("image_base64_length", Long.valueOf(pmfVar.l()));
        map.put("image_compress_quality", Integer.valueOf(pmfVar.o()));
        String v = pmfVar.v();
        if (v != null) {
            str = v;
        }
        map.put("image_size_resized", str);
    }

    public final void k(pmf pmfVar, Map<String, Double> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85512b0e", new Object[]{this, pmfVar, map});
            return;
        }
        b(this, map, "image_load", pmfVar.r(), null, 8, null);
        b(this, map, "image_detect", pmfVar.p(), null, 8, null);
        b(this, map, "face_detect", pmfVar.h(), null, 8, null);
        b(this, map, "channel_detect", pmfVar.g(), null, 8, null);
        b(this, map, "watermark_detect", pmfVar.W(), null, 8, null);
        b(this, map, "video_watermark_detect", pmfVar.V(), null, 8, null);
        b(this, map, "image_feature_extract", pmfVar.q(), null, 8, null);
        b(this, map, "image_process", pmfVar.u(), null, 8, null);
        b(this, map, "image_base64_size", pmfVar.l(), null, 8, null);
        b(this, map, "net_event_call_time", pmfVar.S() - pmfVar.M(), null, 8, null);
        b(this, map, "net_all", pmfVar.L(), null, 8, null);
        b(this, map, "net_mtop_all", pmfVar.N(), null, 8, null);
        b(this, map, "net_send_size", pmfVar.T(), null, 8, null);
        b(this, map, "net_server_rt", pmfVar.U(), null, 8, null);
        b(this, map, "net_one_way_aserver", pmfVar.O(), null, 8, null);
        b(this, map, "net_recv_size", pmfVar.Q(), null, 8, null);
        b(this, map, "net_recv_time", pmfVar.R(), null, 8, null);
        b(this, map, "net_parse", pmfVar.P(), null, 8, null);
        b(this, map, "list_load_time", pmfVar.B(), null, 8, null);
        b(this, map, "list_data_parse_time", pmfVar.y(), null, 8, null);
        b(this, map, "list_templates_time", pmfVar.D(), null, 8, null);
        b(this, map, "list_templates_download_count", pmfVar.C(), null, 8, null);
        b(this, map, "list_first_render_time", pmfVar.A(), null, 8, null);
        b(this, map, "irp_muise_data_trans_time", pmfVar.i() - pmfVar.H(), null, 8, null);
        b(this, map, "irp_muise_list_process_time", pmfVar.k() - pmfVar.i(), null, 8, null);
        b(this, map, "irp_muise_page_process_time", pmfVar.j() - pmfVar.k(), null, 8, null);
        b(this, map, "irp_muise_process_call_time", pmfVar.K() - pmfVar.j(), null, 8, null);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7304358f", new Object[]{this});
        } else if (!b) {
            b = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("success");
            arrayList.add("failure");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("ava_type");
            arrayList2.add("bucket_id");
            arrayList2.add(wxi.KEY_PHOTO_FROM);
            arrayList2.add("pssource");
            arrayList2.add("ava_type");
            arrayList2.add("err_type");
            arrayList2.add("err_msg");
            arrayList2.add("device_level");
            jzu.m("PLT", "IrpAva", arrayList, arrayList2);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66cdb84", new Object[]{this});
        } else if (!f28800a) {
            f28800a = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("irp_open_with_anim");
            arrayList.add("irp_open");
            arrayList.add("irp_open_pre_process");
            arrayList.add("irp_load_with_anim");
            arrayList.add("irp_open_with_first_item_render");
            arrayList.add("irp_open_final");
            arrayList.add("irp_load");
            arrayList.add("irp_init");
            arrayList.add("irp_image_load_wait");
            arrayList.add("irp_net_wait");
            arrayList.add("irp_muise_init");
            arrayList.add("irp_muise_data_transfer");
            arrayList.add("image_load");
            arrayList.add("image_detect");
            arrayList.add("face_detect");
            arrayList.add("channel_detect");
            arrayList.add("watermark_detect");
            arrayList.add("video_watermark_detect");
            arrayList.add("image_process");
            arrayList.add("image_base64_size");
            arrayList.add("image_feature_extract");
            arrayList.add("net_all");
            arrayList.add("net_mtop_all");
            arrayList.add("net_one_way_aserver");
            arrayList.add("net_parse");
            arrayList.add("net_server_rt");
            arrayList.add("net_send_size");
            arrayList.add("net_recv_time");
            arrayList.add("net_recv_size");
            arrayList.add("list_data_parse_time");
            arrayList.add("list_load_time");
            arrayList.add("list_templates_time");
            arrayList.add("list_templates_download_count");
            arrayList.add("list_first_render_time");
            arrayList.add("irp_muise_data_trans_time");
            arrayList.add("irp_muise_page_process_time");
            arrayList.add("irp_muise_list_process_time");
            arrayList.add("irp_muise_process_call_time");
            arrayList.add("net_event_call_time");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("page_rebuild");
            arrayList2.add("bucket_id");
            arrayList2.add(wxi.KEY_PHOTO_FROM);
            arrayList2.add("pssource");
            arrayList2.add("device_level");
            arrayList2.add("auto_task_id");
            arrayList2.add("channel");
            arrayList2.add("watermark_status");
            arrayList2.add("face_count");
            arrayList2.add("network_quality_level");
            jzu.m("PLT", "IrpLoad", arrayList, arrayList2);
        }
    }
}
