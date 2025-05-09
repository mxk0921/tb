package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.w12;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class md2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23961a;
        public final /* synthetic */ List b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ CacheOverviewInfo d;
        public final /* synthetic */ String e;

        public a(Context context, List list, Map map, CacheOverviewInfo cacheOverviewInfo, String str) {
            this.f23961a = context;
            this.b = list;
            this.c = map;
            this.d = cacheOverviewInfo;
            this.e = str;
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                c21.k(this);
                Context context = this.f23961a;
                List list = this.b;
                Map map = this.c;
                CacheOverviewInfo cacheOverviewInfo = this.d;
                md2.a(context, list, map, cacheOverviewInfo, "clean_type_back_" + this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23962a;
        public final /* synthetic */ List b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ CacheOverviewInfo d;
        public final /* synthetic */ String e;

        public b(Context context, List list, Map map, CacheOverviewInfo cacheOverviewInfo, String str) {
            this.f23962a = context;
            this.b = list;
            this.c = map;
            this.d = cacheOverviewInfo;
            this.e = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            md2.b(this.f23962a, this.b, this.c, this.d, this.e);
            as2.a().c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        @JSONField(name = "as")
        public long afterSize;
        @JSONField(name = "bs")
        public long beforeSize;
        @JSONField(name = "id")
        public String id;
        @JSONField(name = "r")
        public boolean result;
        @JSONField(name = "f")
        public boolean satisfied;

        static {
            t2o.a(737148975);
        }
    }

    static {
        t2o.a(737148972);
    }

    public static /* synthetic */ void a(Context context, List list, Map map, CacheOverviewInfo cacheOverviewInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9db07f7", new Object[]{context, list, map, cacheOverviewInfo, str});
        } else {
            f(context, list, map, cacheOverviewInfo, str);
        }
    }

    public static /* synthetic */ void b(Context context, List list, Map map, CacheOverviewInfo cacheOverviewInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263d5f8", new Object[]{context, list, map, cacheOverviewInfo, str});
        } else {
            e(context, list, map, cacheOverviewInfo, str);
        }
    }

    public static long c(File file, int i) {
        long length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bae9c11", new Object[]{file, new Integer(i)})).longValue();
        }
        long j = 0;
        if (file != null && i <= 10) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            length = c(file2, i + 1);
                        } else {
                            length = file2.length();
                        }
                        j += length;
                    }
                }
            } catch (Throwable th) {
                TLog.loge(yr2.MODULE, "BizAutoClear", "calculateDirSize: with exception " + th);
            }
        }
        return j;
    }

    public static void d(Context context, List<BizTaskData> list, Map<String, Long> map, CacheOverviewInfo cacheOverviewInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230423a3", new Object[]{context, list, map, cacheOverviewInfo, str});
        } else if (list == null || list.isEmpty()) {
            TLog.loge(yr2.MODULE, "BizAutoClear", "clearBizCache: quota data is empty.");
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (BizTaskData bizTaskData : list) {
                String str2 = bizTaskData.triggerTime;
                str2.hashCode();
                char c2 = 65535;
                switch (str2.hashCode()) {
                    case -1332194002:
                        if (str2.equals("background")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1109843021:
                        if (str2.equals("launch")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1081415738:
                        if (str2.equals(BizTaskData.MANUAL_TIME)) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        arrayList2.add(new y15(context, bizTaskData, str));
                        break;
                    case 1:
                    case 2:
                        arrayList.add(new y15(context, bizTaskData, str));
                        break;
                    default:
                        TLog.loge(yr2.MODULE, "BizAutoClear", "clearBizCache: unknown trigger time " + bizTaskData.triggerTime);
                        break;
                }
            }
            if (!arrayList.isEmpty()) {
                e(context, arrayList, map, cacheOverviewInfo, "clean_type_front_" + str);
            }
            if (!arrayList2.isEmpty()) {
                c21.c(new a(context, arrayList2, map, cacheOverviewInfo, str));
            }
        }
    }

    public static void e(Context context, List<w12> list, Map<String, Long> map, CacheOverviewInfo cacheOverviewInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad87660", new Object[]{context, list, map, cacheOverviewInfo, str});
        } else if (list.isEmpty()) {
            TLog.loge(yr2.MODULE, "BizAutoClear", "executeCustomTasks: empty task.");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            s71.d("clean_start", str, 0L);
            ArrayList arrayList = new ArrayList();
            for (w12 w12Var : list) {
                w12.b g = w12Var.g(map);
                if (!w12.b.MSG_VERSION_CONDITION_MATCH_FAILED.equals(g.e()) && !w12.b.MSG_CONDITION_MATCH_FAILED.equals(g.e())) {
                    arrayList.add(h(context, w12Var, g, map));
                }
            }
            s71.d("clean_success", str, System.currentTimeMillis() - currentTimeMillis);
            g(arrayList, cacheOverviewInfo, str);
        }
    }

    public static void f(Context context, List<w12> list, Map<String, Long> map, CacheOverviewInfo cacheOverviewInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb85dcaa", new Object[]{context, list, map, cacheOverviewInfo, str});
        } else {
            as2.a().b(new b(context, list, map, cacheOverviewInfo, str));
        }
    }

    public static void g(List<c> list, CacheOverviewInfo cacheOverviewInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("499b3215", new Object[]{list, cacheOverviewInfo, str});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("biz_cache_clear");
        uTHitBuilders$UTCustomHitBuilder.setProperty("executeDetail", JSON.toJSONString(list));
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
        long j = 0;
        for (c cVar : list) {
            long j2 = cVar.beforeSize;
            long j3 = cVar.afterSize;
            if (j2 - j3 > 0) {
                j += j2 - j3;
            }
        }
        if (j > 0) {
            cacheOverviewInfo.setTotalUsedSize(cacheOverviewInfo.getTotalUsedSize() - j);
            s71.c(cacheOverviewInfo, str);
        }
    }

    public static c h(Context context, w12 w12Var, w12.b bVar, Map<String, Long> map) {
        long j;
        long j2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("18a5d6a9", new Object[]{context, w12Var, bVar, map});
        }
        c cVar = new c();
        Map<String, Long> i = w12Var.i();
        long j3 = 0;
        if (i != null) {
            j = 0;
            long j4 = 0;
            for (String str : i.keySet()) {
                Long l = map.get(str);
                if (l != null) {
                    j4 += l.longValue();
                }
                j += c(vs3.l(context, str), 0) >> 10;
                Long l2 = i.get(str);
                if (l2 != null) {
                    j3 += l2.longValue();
                }
            }
            j2 = j3;
            j3 = j4;
        } else {
            j2 = 0;
            j = 0;
        }
        cVar.beforeSize = j3;
        cVar.afterSize = j;
        if (j >= j2) {
            z = false;
        }
        cVar.satisfied = z;
        cVar.id = w12Var.h();
        cVar.result = bVar.g();
        return cVar;
    }
}
