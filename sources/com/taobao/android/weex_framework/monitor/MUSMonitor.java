package com.taobao.android.weex_framework.monitor;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValue;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.android.weex_framework.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.dwh;
import tb.e4d;
import tb.mq0;
import tb.t2o;
import tb.vu3;
import tb.vvh;
import tb.w4x;
import tb.zbf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIMS_PAGE_DATA_PRELOAD = "page_data_preload";
    public static final String DIMS_PAGE_DOWNLOAD_CACHE = "page_download_cache";
    public static final String DIMS_PAGE_TEMPLATE_DOWNLOAD_COUNT = "page_template_download_count";
    public static final String DIMS_PAGE_TEMPLATE_DOWNLOAD_SUCC_COUNT = "page_template_download_succ_count";
    public static final String KEY_BATCH_TIME = "batch_time";
    public static final String KEY_BG_TIME_ALL = "bg_time_all";
    public static final String KEY_BG_TIME_JS = "bg_time_js";
    public static final String KEY_BG_TIME_LAYOUT = "bg_time_layout";
    public static final String KEY_DELAY_TIME_AFTER = "thread_delay_time_after";
    public static final String KEY_DELAY_TIME_BEFORE = "thread_delay_time_before";
    public static final String KEY_DOWNLOAD_TIME = "download_time";
    public static final String KEY_MAIN_TIME_ALL = "main_time_all";
    public static final String KEY_MEM_MAX_SIZE = "mem_max_size";
    public static final String KEY_MEM_SIZE = "mem_size";
    public static final String KEY_MUS_UNICORN_RENDER = "mus_unicorn_render";
    public static final String KEY_MUS_UNICORN_RENDER_OPT = "mus_unicorn_render_opt";
    public static final String KEY_MUS_UNICORN_RENDER_OPT_RASTER = "mus_unicorn_render_raster_opt";
    public static final String KEY_NODE_COUNT = "node_count";
    public static final String KEY_NODE_DEPTH = "node_depth";
    public static final String KEY_NODE_MAX_COUNT = "node_max_count";
    public static final String KEY_NODE_MAX_DEPTH = "node_max_depth";
    public static final String KEY_PAGE_CONTAINER_TO_PRELOAD_FINISH = "page_container_to_preload_finish";
    public static final String KEY_PAGE_CONTAINER_TO_PRELOAD_START = "page_container_to_preload_start";
    public static final String KEY_PAGE_FIRST_SCREEN_TIME = "page_first_screen_time";
    public static final String KEY_PAGE_MTOP_TIME = "page_mtop_time";
    public static final String KEY_PAGE_RENDER_TIME = "page_render_time";
    public static final String KEY_PAGE_TEMPLATE_DOWNLOAD_COUNT = "page_template_download_count";
    public static final String KEY_PAGE_TEMPLATE_DOWNLOAD_SUCC_COUNT = "page_template_download_succ_count";
    public static final String KEY_PAGE_TEMPLATE_DOWNLOAD_TIME = "page_template_download_time";
    public static final String KEY_PAGE_WLM_DOWNLOAD = "page_wlm_download";
    public static final String KEY_RESERVE_1 = "reserve_1";
    public static final String KEY_RESERVE_10 = "reserve_10";
    public static final String KEY_RESERVE_2 = "reserve_2";
    public static final String KEY_RESERVE_3 = "reserve_3";
    public static final String KEY_RESERVE_4 = "reserve_4";
    public static final String KEY_RESERVE_5 = "reserve_5";
    public static final String KEY_RESERVE_6 = "reserve_6";
    public static final String KEY_RESERVE_7 = "reserve_7";
    public static final String KEY_RESERVE_8 = "reserve_8";
    public static final String KEY_RESERVE_9 = "reserve_9";
    public static final String MODULE = "MUSAppMonitor";
    public static final String MODULE_DIM_ABILITY = "ability";
    public static final String MODULE_DIM_API = "api";
    public static final String MODULE_DIM_BIZ_ID = "bizId";
    public static final String MODULE_DIM_CONTAINER_TYPE = "containerType";
    public static final String MODULE_INVOKE = "OpenAbility";
    public static final String MODULE_MEASURE_KEY_COUNT = "count";
    public static final int PHASE_DETAIL = 3;
    public static final int PHASE_PREPARE = 0;
    public static final int PHASE_REFRESH = 2;
    public static final int PHASE_RENDER = 1;
    public static final String POINT_DETAIL = "detail";
    public static final String POINT_PREPARE = "prepare";
    public static final String POINT_REFRESH = "refresh";
    public static final String POINT_RENDER = "render";
    public static final String POINT_TEMPLATE_DOWNLOAD = "template_download";
    public static e4d h;
    public static final boolean i;
    public static final int j;
    public static int k;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f9984a = new ConcurrentHashMap();
    public final Map<String, a> b = new ConcurrentHashMap();
    public final Map<String, a> c = new ConcurrentHashMap();
    public final Map<String, a> d = new ConcurrentHashMap();
    public final Map<String, String> e = new ConcurrentHashMap();
    public final Map<String, String> f = new ConcurrentHashMap();
    public final c g;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface DetailDimsType {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface DetailMeasureType {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface KEY {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface PHASE {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f9985a = 0;
        public double b = vu3.b.GEO_NOT_SUPPORT;

        static {
            t2o.a(982516190);
        }

        public synchronized double a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("da594647", new Object[]{this})).doubleValue();
            }
            int i = this.f9985a;
            if (i == 0) {
                return vu3.b.GEO_NOT_SUPPORT;
            }
            return this.b / i;
        }

        public synchronized void b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57488446", new Object[]{this, new Long(j)});
                return;
            }
            this.b += j;
            this.f9985a++;
        }

        public synchronized void c(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("518a33fb", new Object[]{this, new Long(j)});
                return;
            }
            this.b = j;
            this.f9985a = 1;
        }
    }

    static {
        t2o.a(982516189);
        i = true;
        int r = w4x.r();
        j = r;
        k = (int) (Math.random() * r);
        String[] strArr = {MUSAppMonitor.BUNDLE_URL, "page_name", MUSAppMonitor.T_ITEM_TYPE, MUSAppMonitor.SCRIPT_URL, "sversion", MUSAppMonitor.MUISE_SDK_VERSION, MUSAppMonitor.ALIMUISE_SDK_VERSION, MUSAppMonitor.BYTECODE};
        try {
            AppMonitor.register("MUSAppMonitor", "prepare", new String[]{KEY_BG_TIME_ALL, KEY_MAIN_TIME_ALL}, strArr, false);
            AppMonitor.register("MUSAppMonitor", "render", new String[]{KEY_BG_TIME_JS, KEY_BG_TIME_LAYOUT, KEY_BG_TIME_ALL, KEY_MAIN_TIME_ALL, KEY_BATCH_TIME, KEY_DELAY_TIME_BEFORE, KEY_DELAY_TIME_AFTER, KEY_MUS_UNICORN_RENDER}, strArr, false);
            AppMonitor.register("MUSAppMonitor", "refresh", new String[]{KEY_BG_TIME_JS, KEY_BG_TIME_LAYOUT, KEY_BG_TIME_ALL, KEY_MAIN_TIME_ALL, KEY_BATCH_TIME, KEY_DELAY_TIME_BEFORE, KEY_DELAY_TIME_AFTER}, strArr, false);
            AppMonitor.register("MUSAppMonitor", "detail", new String[]{KEY_NODE_COUNT, KEY_NODE_DEPTH, KEY_NODE_MAX_COUNT, KEY_NODE_MAX_DEPTH, KEY_MEM_SIZE, KEY_MEM_MAX_SIZE, KEY_PAGE_WLM_DOWNLOAD, KEY_PAGE_RENDER_TIME, "page_template_download_count", "page_template_download_succ_count", KEY_PAGE_FIRST_SCREEN_TIME, KEY_PAGE_TEMPLATE_DOWNLOAD_TIME, KEY_PAGE_MTOP_TIME, KEY_PAGE_CONTAINER_TO_PRELOAD_FINISH, KEY_PAGE_CONTAINER_TO_PRELOAD_START, KEY_RESERVE_1, KEY_RESERVE_2, KEY_RESERVE_3, KEY_RESERVE_4, KEY_RESERVE_5, KEY_RESERVE_6, KEY_RESERVE_7, KEY_RESERVE_8, KEY_RESERVE_9, KEY_RESERVE_10}, new String[]{DIMS_PAGE_DOWNLOAD_CACHE, DIMS_PAGE_DATA_PRELOAD, "page_template_download_count", "page_template_download_succ_count", MUSAppMonitor.BUNDLE_URL, "page_name", MUSAppMonitor.T_ITEM_TYPE, MUSAppMonitor.SCRIPT_URL, "sversion", MUSAppMonitor.MUISE_SDK_VERSION, MUSAppMonitor.ALIMUISE_SDK_VERSION, MUSAppMonitor.BYTECODE}, false);
            AppMonitor.register("MUSAppMonitor", POINT_TEMPLATE_DOWNLOAD, new String[]{KEY_DOWNLOAD_TIME}, strArr, false);
            DimensionSet create = DimensionSet.create();
            create.addDimension("containerType");
            create.addDimension(MODULE_DIM_ABILITY);
            create.addDimension("api");
            create.addDimension("bizId");
            MeasureSet create2 = MeasureSet.create();
            create2.addMeasure("count");
            AppMonitor.register(MODULE_INVOKE, "PreInvokeApi", create2, create, false);
        } catch (Throwable unused) {
            dwh.e("MUSMonitor AppMonitor not found");
            i = false;
        }
    }

    public MUSMonitor(c cVar) {
        this.g = cVar;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("224658fc", new Object[0])).booleanValue();
        }
        int i2 = k;
        k = i2 + 1;
        if (i2 % j == 0) {
            return true;
        }
        return false;
    }

    public static void g(c cVar, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("916f359e", new Object[]{cVar, new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KEY_DOWNLOAD_TIME, Double.valueOf(j2));
        m(cVar, "MUSAppMonitor", POINT_TEMPLATE_DOWNLOAD, hashMap, null, null);
    }

    public static void i(String str, String str2, String str3) {
        e4d e4dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fac2e7d", new Object[]{str, str2, str3});
        } else if (d() && i && (e4dVar = h) != null && ((mq0.a) e4dVar).a() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str4 = "unknown";
            if (!TextUtils.isEmpty(str3)) {
                try {
                    str4 = Uri.parse(str3).buildUpon().clearQuery().build().toString();
                } catch (Throwable unused) {
                }
            }
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("containerType", "muise");
                create.setValue(MODULE_DIM_ABILITY, str);
                create.setValue("api", str + '.' + str2);
                create.setValue("bizId", str4);
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("count", 1.0d);
                AppMonitor.Stat.commit(MODULE_INVOKE, "PreInvokeApi", create, create2);
            } catch (Throwable unused2) {
                dwh.e("AppMonitor not found");
            }
        }
    }

    public static void l(e4d e4dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587187c", new Object[]{e4dVar});
        } else {
            h = e4dVar;
        }
    }

    public synchronized void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba9a0ec", new Object[]{this, str, str2});
        } else {
            ((ConcurrentHashMap) this.e).put(str, str2);
        }
    }

    public synchronized void b(int i2, String str, long j2) {
        Map<String, a> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d68202", new Object[]{this, new Integer(i2), str, new Long(j2)});
            return;
        }
        if (i2 == 0) {
            map = this.f9984a;
        } else if (i2 == 1) {
            map = this.c;
        } else if (i2 == 2) {
            map = this.b;
        } else if (i2 == 3) {
            map = this.d;
        } else {
            return;
        }
        a aVar = map.get(str);
        if (aVar == null) {
            aVar = new a();
            map.put(str, aVar);
        }
        aVar.b(j2);
    }

    public Map<String, a> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c18f7b1b", new Object[]{this});
        }
        return this.d;
    }

    public Map<String, a> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e6b1d976", new Object[]{this});
        }
        return this.c;
    }

    public synchronized void f(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e099777b", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if ((z2 || z) && TextUtils.isEmpty(this.g.o()) && TextUtils.isEmpty(this.g.n())) {
            MUSAppMonitor.m(this.g);
        }
        if (z) {
            h("prepare", this.f9984a, null);
        }
        if (z2) {
            h("render", this.c, null);
            if (!((ConcurrentHashMap) this.b).isEmpty()) {
                Iterator it = ((ConcurrentHashMap) this.b).values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((a) it.next()).f9985a != 0) {
                            h("refresh", this.b, null);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            h("detail", this.d, this.f);
        }
    }

    public final void h(String str, Map<String, a> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e69e1c2", new Object[]{this, str, map, map2});
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, a> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), Double.valueOf(entry.getValue().a()));
        }
        m(this.g, "MUSAppMonitor", str, hashMap, new HashMap(this.e), map2);
    }

    public synchronized void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d75f9af9", new Object[]{this, str, str2});
        } else {
            ((ConcurrentHashMap) this.f).put(str, str2);
        }
    }

    public synchronized void k(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f8e193", new Object[]{this, str, new Long(j2)});
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.d;
        a aVar = (a) concurrentHashMap.get(str);
        if (aVar == null) {
            aVar = new a();
            concurrentHashMap.put(str, aVar);
        }
        aVar.c(j2);
    }

    public static void m(c cVar, String str, String str2, Map<String, Double> map, Map<String, String> map2, Map<String, String> map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6276da", new Object[]{cVar, str, str2, map, map2, map3});
        } else if (i) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                String e = cVar.e();
                String i2 = cVar.i();
                String o = cVar.o();
                String n = cVar.n();
                String f = cVar.f();
                String m = cVar.m();
                String h2 = cVar.h();
                String d = cVar.d();
                if (e != null) {
                    create.setValue(MUSAppMonitor.BUNDLE_URL, e);
                }
                if (i2 != null) {
                    create.setValue("page_name", i2);
                }
                if (o != null) {
                    create.setValue(MUSAppMonitor.T_ITEM_TYPE, o);
                }
                if (n != null) {
                    create.setValue(MUSAppMonitor.SCRIPT_URL, n);
                }
                if (f != null) {
                    create.setValue(MUSAppMonitor.BYTECODE, f);
                }
                if (m != null) {
                    create.setValue("sversion", m);
                }
                if (h2 != null) {
                    create.setValue(MUSAppMonitor.MUISE_SDK_VERSION, h2);
                }
                if (d != null) {
                    create.setValue(MUSAppMonitor.ALIMUISE_SDK_VERSION, d);
                }
                if (map2 != null) {
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        create.setValue(entry.getKey(), entry.getValue());
                    }
                }
                if (map3 != null) {
                    for (Map.Entry<String, String> entry2 : map3.entrySet()) {
                        create.setValue(entry2.getKey(), entry2.getValue());
                    }
                }
                MeasureValueSet create2 = MeasureValueSet.create();
                for (Map.Entry<String, Double> entry3 : map.entrySet()) {
                    create2.setValue(entry3.getKey(), entry3.getValue().doubleValue());
                }
                if (dwh.r()) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, MeasureValue> entry4 : create2.getMap().entrySet()) {
                        hashMap.put(entry4.getKey(), String.valueOf(entry4.getValue().getValue()));
                    }
                    if (vvh.m()) {
                        dwh.b(MUSAppMonitor.LOG_TAG, String.format("Track <%s>: %s\n    --Dim: %s", str2, hashMap, create.getMap()));
                    } else {
                        dwh.l(MUSAppMonitor.LOG_TAG, String.format("Track <%s>: %s\n    --Dim: %s", str2, hashMap, create.getMap()), null);
                    }
                }
                if (!vvh.m() && !zbf.a() && !cVar.p()) {
                    AppMonitor.Stat.commit(str, str2, create, create2);
                }
            } catch (Throwable unused) {
                dwh.e("AppMonitor not found");
            }
        }
    }
}
