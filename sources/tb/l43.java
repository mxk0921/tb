package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.perf.MnnOnceDetectRecord;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class l43 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final l43 INSTANCE = new l43();

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23102a;
    public static boolean b;

    static {
        t2o.a(481296685);
    }

    public static final /* synthetic */ void a(l43 l43Var, ol1 ol1Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e38add5", new Object[]{l43Var, ol1Var, map});
        } else {
            l43Var.c(ol1Var, map);
        }
    }

    public static final /* synthetic */ void b(l43 l43Var, Map map, String str, long j, Long l, Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fb7f4e7", new Object[]{l43Var, map, str, new Long(j), l, l2});
        } else {
            l43Var.d(map, str, j, l, l2);
        }
    }

    public final void c(ol1 ol1Var, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8b27d3", new Object[]{this, ol1Var, map});
            return;
        }
        map.put("device_level", String.valueOf(ri7.b()));
        map.put("first_model_type", String.valueOf(ol1Var.f()));
        map.put("is_tao_init", String.valueOf(ol1Var.o()));
        map.put("is_page_init", String.valueOf(ol1Var.m()));
        map.put("is_smart_lens", String.valueOf(ol1Var.n()));
    }

    public final void d(Map<String, Double> map, String str, long j, Long l, Long l2) {
        long j2;
        long j3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72114be9", new Object[]{this, map, str, new Long(j), l, l2});
            return;
        }
        if (l == null) {
            j2 = 0;
        } else {
            j2 = l.longValue();
        }
        if (j > j2) {
            if (l2 == null) {
                j3 = Long.MAX_VALUE;
            } else {
                j3 = l2.longValue();
            }
            if (j < j3) {
                map.put(str, Double.valueOf(j));
            }
        }
    }

    public final void h(ol1 ol1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a8eebf4", new Object[]{this, ol1Var});
        } else if (ol1Var != null) {
            f();
            VExecutors.defaultSharedThreadPool().submit(new a(ol1Var.j(), ol1Var));
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f1d6f9", new Object[]{this});
        } else if (!f23102a) {
            f23102a = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("detect_cost_frames");
            arrayList.add("detect_cost_time");
            arrayList.add("mnn_detect_cost_frames");
            arrayList.add("mnn_detect_cost_time");
            arrayList.add("alinn_cost_frames");
            arrayList.add("alinn_cost_time");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("is_tao_init");
            arrayList2.add("is_page_init");
            arrayList2.add("device_level");
            arrayList2.add("first_model_type");
            arrayList2.add("is_smart_lens");
            jzu.m("PLT", "AutodetectPerf", arrayList, arrayList2);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6398b8", new Object[]{this});
        } else if (!b) {
            b = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("client_cost_time");
            arrayList.add("mnn_cost_time");
            arrayList.add("pre_time");
            arrayList.add("infer_time");
            arrayList.add("logic_time");
            arrayList.add("post_time");
            arrayList.add("const_time");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("is_tao_init");
            arrayList2.add("is_page_init");
            arrayList2.add("device_level");
            arrayList2.add("first_model_type");
            arrayList2.add("is_smart_lens");
            arrayList2.add("is_detect_result");
            jzu.m("PLT", "AutodetectOncePerfV2", arrayList, arrayList2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List<MnnOnceDetectRecord> f23103a;
        public final /* synthetic */ ol1 b;

        public a(List<MnnOnceDetectRecord> list, ol1 ol1Var) {
            this.f23103a = list;
            this.b = ol1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.f23103a.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ol1 ol1Var = this.b;
                List<MnnOnceDetectRecord> list = this.f23103a;
                l43.a(l43.INSTANCE, ol1Var, linkedHashMap);
                int size = list.size();
                while (i < size) {
                    i++;
                    MnnOnceDetectRecord mnnOnceDetectRecord = list.get(i);
                    if (mnnOnceDetectRecord.getMnnTime() > 0) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        l43 l43Var = l43.INSTANCE;
                        l43.b(l43Var, linkedHashMap2, "client_cost_time", mnnOnceDetectRecord.getCostTime(), 0L, 10000L);
                        l43.b(l43Var, linkedHashMap2, "mnn_cost_time", mnnOnceDetectRecord.getMnnTime(), 0L, 10000L);
                        l43.b(l43Var, linkedHashMap2, "pre_time", mnnOnceDetectRecord.getMnnPreTime(), 0L, 10000L);
                        l43.b(l43Var, linkedHashMap2, "infer_time", mnnOnceDetectRecord.getMnnInferTime(), 0L, 10000L);
                        l43.b(l43Var, linkedHashMap2, "logic_time", mnnOnceDetectRecord.getMnnLogicTime(), 0L, 10000L);
                        l43.b(l43Var, linkedHashMap2, "post_time", mnnOnceDetectRecord.getMnnPostTime(), 0L, 10000L);
                        l43.b(l43Var, linkedHashMap2, "const_time", mnnOnceDetectRecord.getMnnPreTransTime(), 0L, 10000L);
                        arrayList.add(linkedHashMap2);
                        linkedHashMap.put("is_detect_result", String.valueOf(mnnOnceDetectRecord.isDetectRegion()));
                        jzu.d("PLT", "AutodetectOncePerfV2", linkedHashMap2, linkedHashMap);
                    }
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("dimension", linkedHashMap);
                linkedHashMap3.put("measure", arrayList);
                TLogTracker.f("AutoDetectTrace", "Default", JSON.toJSONString(linkedHashMap3));
            }
        }
    }

    public final void g(ol1 ol1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe62c913", new Object[]{this, ol1Var});
        } else if (ol1Var != null) {
            e();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c(ol1Var, linkedHashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            d(linkedHashMap2, "detect_cost_time", ol1Var.k() - ol1Var.e(), 0L, 10000L);
            d(linkedHashMap2, "detect_cost_frames", ol1Var.d(), -1L, 10000L);
            d(linkedHashMap2, "mnn_detect_cost_time", ol1Var.i(), 0L, 10000L);
            d(linkedHashMap2, "mnn_detect_cost_frames", ol1Var.h(), -1L, 10000L);
            d(linkedHashMap2, "alinn_cost_time", ol1Var.c(), 0L, 10000L);
            d(linkedHashMap2, "alinn_cost_frames", ol1Var.b(), -1L, 10000L);
            jzu.d("PLT", "AutodetectPerf", linkedHashMap2, linkedHashMap);
            if (caa.q()) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("dimension", linkedHashMap);
                linkedHashMap3.put("measure", linkedHashMap2);
                TLogTracker.f("AutoDetectTrace", "Default", JSON.toJSONString(linkedHashMap3));
            }
        }
    }
}
