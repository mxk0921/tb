package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.MatchBasedAutoClear;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizActionData;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.message.disk.IStorageClearService;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.tao.log.TLog;
import com.uc.webview.export.extension.StorageUtils;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.w12;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y15 extends w12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements w12.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Map<String, Set<String>> d = new HashMap();

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, Long> f31781a;
        public final Map<String, Long> b;
        public final String c;

        /* compiled from: Taobao */
        /* renamed from: tb.y15$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class RunnableC1104a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TLog.loge(yr2.MODULE, "BizClearTask", "clearHttpCacheAsync: http cache clear complete.");
                }
            }
        }

        static {
            t2o.a(737148993);
            t2o.a(737148990);
        }

        public a(Map<String, Long> map, Map<String, Long> map2, String str) {
            this.f31781a = map;
            this.b = map2;
            this.c = str;
        }

        public static void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86184b76", new Object[0]);
                return;
            }
            TLog.loge(yr2.MODULE, "BizClearTask", "clearHttpCacheAsync: http cache clear start.");
            StorageUtils.clearHttpCache(new RunnableC1104a());
        }

        public static long c() {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6d45fb69", new Object[0])).longValue();
            }
            if (hg4.j().p(hg4.BIZ_MSG)) {
                return 0L;
            }
            IStorageClearService iStorageClearService = (IStorageClearService) GlobalContainer.getInstance().get(IStorageClearService.class);
            if (iStorageClearService != null) {
                IStorageClearService.Options options = new IStorageClearService.Options();
                options.daysAgo = 7;
                options.mode = 1;
                j = iStorageClearService.delete(IStorageClearService.Keys.OUTER, options).size;
            } else {
                j = -1;
            }
            hg4.j().q(hg4.BIZ_MSG);
            return j;
        }

        public static void d(Map<String, String> map) {
            long j;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97f12888", new Object[]{map});
            } else if (!hg4.j().p(hg4.BIZ_MSG_V2)) {
                IStorageClearService iStorageClearService = (IStorageClearService) GlobalContainer.getInstance().get(IStorageClearService.class);
                if (iStorageClearService != null) {
                    if (map == null || (str = map.get("beforeTime")) == null || str.isEmpty()) {
                        j = 15778800000L;
                    } else {
                        j = Long.parseLong(str);
                    }
                    iStorageClearService.cleanUpLocalConversation(System.currentTimeMillis() - j, null);
                }
                hg4.j().q(hg4.BIZ_MSG_V2);
            }
        }

        public static long e(Map<String, Long> map, Map<String, Long> map2, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9adcf38d", new Object[]{map, map2, list})).longValue();
            }
            if (list.isEmpty()) {
                return -1L;
            }
            long j = 0;
            long j2 = 0;
            for (String str : list) {
                if (map2.containsKey(str)) {
                    j2 += map2.get(str).longValue();
                }
                if (map.containsKey(str)) {
                    j += map.get(str).longValue();
                }
            }
            return pbn.a(list.get(0), j, j2);
        }

        public static long f(Map<String, Long> map, Map<String, Long> map2, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("653bddf", new Object[]{map, map2, list})).longValue();
            }
            if (list.isEmpty()) {
                return -1L;
            }
            long j = 0;
            long j2 = 0;
            for (String str : list) {
                if (map2.containsKey(str)) {
                    j2 += map2.get(str).longValue();
                }
                if (map.containsKey(str)) {
                    j += map.get(str).longValue();
                }
            }
            if (!wn1.a(j, j2, new HashMap())) {
                return 0L;
            }
            return -1L;
        }

        public static long g(Map<String, Long> map, Map<String, Long> map2, List<String> list) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9642c6b1", new Object[]{map, map2, list})).longValue();
            }
            int i2 = 0;
            for (String str : list) {
                if (map2.containsKey(str)) {
                    i2 += map2.get(str).intValue();
                }
                if (map.containsKey(str)) {
                    i += map.get(str).intValue();
                }
            }
            return b5s.d(i << 10, i2 << 10, new HashMap());
        }

        public static Set<String> j(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("b2de690e", new Object[]{file});
            }
            File[] listFiles = file.listFiles();
            HashSet hashSet = new HashSet();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2 != null) {
                        hashSet.add(file2.getName());
                    }
                }
            }
            return hashSet;
        }

        public static void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7f264fa", new Object[0]);
                return;
            }
            Set<String> set = (Set) ((HashMap) d).get("MNNRTModels");
            if (set == null) {
                TLog.loge(yr2.MODULE, "BizClearTask", "notifyMnnFiles: last mnn files is empty.");
                return;
            }
            Set<String> j = j(new File(hg4.j().h().getFilesDir(), "MNNRTModels"));
            for (String str : set) {
                if (!j.contains(str)) {
                    oqh.d().h(str);
                }
            }
        }

        public static void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9b1ee02", new Object[0]);
                return;
            }
            ((HashMap) d).put("MNNRTModels", j(new File(hg4.j().h().getFilesDir(), "MNNRTModels")));
        }

        @Override // tb.w12.a
        public long a(BizActionData bizActionData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("69382a88", new Object[]{this, bizActionData})).longValue();
            }
            String str = bizActionData.bizId;
            long j = -1;
            if (TextUtils.isEmpty(str)) {
                TLog.loge(yr2.MODULE, "BizClearTask", "doAction: bizId is empty.");
                return -1L;
            }
            try {
                j = i(str, bizActionData);
            } catch (Throwable th) {
                TLog.loge(yr2.MODULE, "BizClearTask", "doAction: with exception " + th);
            }
            TLog.loge(yr2.MODULE, "BizClearTask", "biz " + str + " complete action with clear size " + j + " KB.");
            return j;
        }

        public final void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("937681dc", new Object[]{this});
            } else if (!hg4.j().p(hg4.BIZ_Z_CACHE)) {
                if (hg4.j().i().isEnableNewZcacheV1()) {
                    yox.c(this.c);
                } else {
                    yox.a();
                }
                hg4.j().q(hg4.BIZ_Z_CACHE);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00c6, code lost:
            if (r7.equals("TaoPai") == false) goto L_0x002a;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long i(java.lang.String r7, com.taobao.android.cachecleaner.autoclear.biz.data.BizActionData r8) {
            /*
                Method dump skipped, instructions count: 460
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.y15.a.i(java.lang.String, com.taobao.android.cachecleaner.autoclear.biz.data.BizActionData):long");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements w12.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(737148995);
            t2o.a(737148990);
        }

        @Override // tb.w12.a
        public long a(BizActionData bizActionData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("69382a88", new Object[]{this, bizActionData})).longValue();
            }
            return MatchBasedAutoClear.a(hg4.j().h(), bizActionData.configList);
        }
    }

    static {
        t2o.a(737148992);
    }

    public y15(Context context, BizTaskData bizTaskData, String str) {
        super(context, bizTaskData);
        this.f = str;
    }

    public static /* synthetic */ Object ipc$super(y15 y15Var, String str, Object... objArr) {
        if (str.hashCode() == 434035084) {
            return super.g((Map) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cachecleaner/autoclear/biz/task/CustomTask");
    }

    @Override // tb.w12
    public long f(BizActionData bizActionData, Map<String, Long> map) {
        w12.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ed4b665", new Object[]{this, bizActionData, map})).longValue();
        }
        if (bizActionData == null) {
            TLog.loge(yr2.MODULE, "BizClearTask", "doAction: data is empty.");
            return -1L;
        }
        String str = bizActionData.type;
        str.hashCode();
        if (str.equals("common")) {
            aVar = new b();
        } else if (!str.equals("custom")) {
            TLog.loge(yr2.MODULE, "BizClearTask", "doAction: unknown action type " + bizActionData.type);
            return -1L;
        } else {
            aVar = new a(this.d, map, this.f);
        }
        return aVar.a(bizActionData);
    }

    @Override // tb.w12
    public w12.b g(Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w12.b) ipChange.ipc$dispatch("19ded98c", new Object[]{this, map});
        }
        w12.b g = super.g(map);
        String str = this.f30390a;
        boolean g2 = g.g();
        long f = g.f();
        String e = g.e();
        TLog.loge(yr2.MODULE, "BizClearTask", "execute: task " + str + " clear success " + g2 + ", clear size " + f + ", with msg " + e + ",");
        return g;
    }
}
