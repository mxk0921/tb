package mtopsdk.mtop.intf;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.stat.PrefetchStatistics;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import org.json.JSONObject;
import tb.t2o;
import tb.w4j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MtopPrefetch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_PREFETCH_EXPIRE_TIME = 15000;
    private static final String TAG = "mtopsdk.MtopPrefetch";
    public long prefetchStartTime;
    public PrefetchStatistics stat;
    private long prefetchExpireTime = 5000;
    public volatile long prefetchResponseTime = 0;
    public long prefetchHitTime = 0;
    public AtomicBoolean response = new AtomicBoolean(false);
    public w4j mergeContext = null;
    public ReentrantLock lock = new ReentrantLock();
    public List<String> whiteListParams = new ArrayList();
    private IPrefetchCallback callback = null;
    private IPrefetchComparator comparator = null;
    private int prefetchMode = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class CompareResult {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean same = false;
        public HashMap<String, String> data = new HashMap<>();

        static {
            t2o.a(589299952);
        }

        public HashMap<String, String> getData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("1d90c64a", new Object[]{this});
            }
            return this.data;
        }

        public boolean isSame() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45c0493b", new Object[]{this})).booleanValue();
            }
            return this.same;
        }

        public void setData(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0fd2920", new Object[]{this, hashMap});
            } else {
                this.data = hashMap;
            }
        }

        public void setSame(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87cd8045", new Object[]{this, new Boolean(z)});
            } else {
                this.same = z;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class DefaultPrefetchComparator implements IPrefetchComparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(589299953);
            t2o.a(589299957);
        }

        private boolean compareJsonStr(String str, String str2, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("233c2c94", new Object[]{this, str, str2, list})).booleanValue();
            }
            if (!StringUtils.isBlank(str) && !StringUtils.isBlank(str2)) {
                if (str.equals(str2)) {
                    return true;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObject2 = new JSONObject(str2);
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (StringUtils.isNotBlank(next) && (list == null || !list.contains(next))) {
                            hashMap.put(next, jSONObject.getString(next));
                        }
                    }
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        if (StringUtils.isNotBlank(next2) && (list == null || !list.contains(next2))) {
                            hashMap2.put(next2, jSONObject2.getString(next2));
                        }
                    }
                    if (hashMap.size() != hashMap2.size()) {
                        return false;
                    }
                    for (String str3 : hashMap.keySet()) {
                        if (StringUtils.isNotBlank(str3) && !compareJsonStr((String) hashMap.get(str3), (String) hashMap2.get(str3), list)) {
                            return false;
                        }
                    }
                    return true;
                } catch (Throwable unused) {
                }
            }
            return false;
        }

        private boolean isSameRequest(MtopRequest mtopRequest, MtopRequest mtopRequest2, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3d52df9b", new Object[]{this, mtopRequest, mtopRequest2, list})).booleanValue();
            }
            if (StringUtils.isBlank(mtopRequest.getKey()) || !mtopRequest.getKey().equals(mtopRequest2.getKey()) || mtopRequest.isNeedEcode() != mtopRequest2.isNeedEcode() || mtopRequest.isNeedSession() != mtopRequest2.isNeedSession()) {
                return false;
            }
            return compareJsonStr(mtopRequest.getData(), mtopRequest2.getData(), list);
        }

        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchComparator
        public CompareResult compare(MtopBuilder mtopBuilder, MtopBuilder mtopBuilder2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CompareResult) ipChange.ipc$dispatch("cca63c2e", new Object[]{this, mtopBuilder, mtopBuilder2});
            }
            CompareResult compareResult = new CompareResult();
            compareResult.setSame(isSameRequest(mtopBuilder.getMtopContext().b, mtopBuilder2.getMtopContext().b, mtopBuilder2.getMtopPrefetch().whiteListParams));
            return compareResult;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface IPrefetchCallback {
        public static final String DATA_API = "data_api";
        public static final String DATA_COST_TIME = "data_cost_time";
        public static final String DATA_KEY = "data_key";
        public static final String DATA_REQ_PARAM = "data_req_param";
        public static final String DATA_SEQ = "data_seq";
        public static final String DATA_VERSION = "data_version";

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public interface PrefetchCallbackType {
            public static final String TYPE_CLEAR = "TYPE_CLEAR";
            public static final String TYPE_EXPIRE = "TYPE_EXPIRE";
            public static final String TYPE_FULL = "TYPE_FULL";
            public static final String TYPE_HIT = "TYPE_HIT";
            public static final String TYPE_MERGE = "TYPE_MERGE";
            public static final String TYPE_MISS = "TYPE_MISS";

            /* compiled from: Taobao */
            @Retention(RetentionPolicy.SOURCE)
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
            public @interface Definition {
            }
        }

        void onPrefetch(String str, HashMap<String, String> hashMap);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface IPrefetchComparator {
        CompareResult compare(MtopBuilder mtopBuilder, MtopBuilder mtopBuilder2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface PrefetchMode {
        public static final int MODE_DEFAULT = 0;
        public static final int MODE_LOCAL = 1;

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public @interface Definition {
        }
    }

    static {
        t2o.a(589299950);
    }

    public MtopPrefetch(PrefetchStatistics prefetchStatistics) {
        this.prefetchStartTime = 0L;
        this.stat = prefetchStatistics;
        this.prefetchStartTime = System.currentTimeMillis();
    }

    private static HashMap<String, String> buildCallbackData(String str, w4j w4jVar, MtopPrefetch mtopPrefetch, HashMap<String, String> hashMap) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("fecb37c1", new Object[]{str, w4jVar, mtopPrefetch, hashMap});
        }
        if (mtopPrefetch == null || w4jVar == null) {
            return null;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put(IPrefetchCallback.DATA_SEQ, w4jVar.h);
        hashMap2.put("data_key", w4jVar.b.getKey());
        hashMap2.put(IPrefetchCallback.DATA_API, w4jVar.b.getApiName());
        hashMap2.put(IPrefetchCallback.DATA_VERSION, w4jVar.b.getVersion());
        long j2 = mtopPrefetch.prefetchHitTime;
        if (j2 != 0) {
            j = j2 - mtopPrefetch.prefetchResponseTime;
        } else {
            j = -1;
        }
        hashMap2.put(IPrefetchCallback.DATA_COST_TIME, String.valueOf(j));
        if ("TYPE_MISS".equals(str)) {
            hashMap2.put(IPrefetchCallback.DATA_REQ_PARAM, w4jVar.b.getData());
        }
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        return hashMap2;
    }

    public static void cleanPrefetchCache(Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396ee122", new Object[]{mtop});
        } else if (mtop != null && !mtop.getPrefetchBuilderMap().isEmpty() && 15000 < System.currentTimeMillis() - mtop.lastPrefetchResponseTime) {
            synchronized (MtopPrefetch.class) {
                try {
                    if (!mtop.getPrefetchBuilderMap().isEmpty()) {
                        Iterator<String> it = mtop.getPrefetchBuilderMap().keySet().iterator();
                        while (it.hasNext()) {
                            MtopBuilder mtopBuilder = mtop.getPrefetchBuilderMap().get(it.next());
                            if (mtopBuilder != null && System.currentTimeMillis() - mtopBuilder.getMtopPrefetch().prefetchResponseTime > mtopBuilder.getMtopPrefetch().getPrefetchExpireTime()) {
                                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                                    TBSdkLog.d(TAG, "clean prefetch cache " + mtopBuilder.request.getKey());
                                }
                                onPrefetchAndCommit(IPrefetchCallback.PrefetchCallbackType.TYPE_CLEAR, mtopBuilder.getMtopPrefetch(), mtopBuilder.mtopContext, null);
                                it.remove();
                            }
                        }
                    }
                }
            }
        }
    }

    public static void onPrefetchAndCommit(final String str, MtopPrefetch mtopPrefetch, w4j w4jVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("157d9f83", new Object[]{str, mtopPrefetch, w4jVar, hashMap});
        } else if (mtopPrefetch != null) {
            try {
                final HashMap<String, String> buildCallbackData = buildCallbackData(str, w4jVar, mtopPrefetch, hashMap);
                MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.mtop.intf.MtopPrefetch.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MtopPrefetch.this.getCallback().onPrefetch(str, buildCallbackData);
                        }
                    }
                });
                PrefetchStatistics prefetchStatistics = mtopPrefetch.stat;
                if (prefetchStatistics != null) {
                    prefetchStatistics.doPrefetchCommit(str, buildCallbackData);
                }
            } catch (Throwable th) {
                TBSdkLog.e(TAG, "onPrefetch Error" + th.toString());
            }
        }
    }

    public IPrefetchCallback getCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPrefetchCallback) ipChange.ipc$dispatch("dc499df5", new Object[]{this});
        }
        return this.callback;
    }

    public IPrefetchComparator getComparator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPrefetchComparator) ipChange.ipc$dispatch("9b662193", new Object[]{this});
        }
        return this.comparator;
    }

    public long getPrefetchExpireTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f99f03d4", new Object[]{this})).longValue();
        }
        return this.prefetchExpireTime;
    }

    public boolean isLocalMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("688342f", new Object[]{this})).booleanValue();
        }
        if (this.prefetchMode == 1) {
            return true;
        }
        return false;
    }

    public void setCallback(IPrefetchCallback iPrefetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13cbe62f", new Object[]{this, iPrefetchCallback});
        } else {
            this.callback = iPrefetchCallback;
        }
    }

    public void setComparator(IPrefetchComparator iPrefetchComparator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532f0e0f", new Object[]{this, iPrefetchComparator});
        } else {
            this.comparator = iPrefetchComparator;
        }
    }

    public void setPrefetchExpireTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5071d458", new Object[]{this, new Long(j)});
        } else {
            this.prefetchExpireTime = j;
        }
    }

    public void setPrefetchMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2934b20", new Object[]{this, new Integer(i)});
        } else if (i == 1 || i == 0) {
            this.prefetchMode = i;
        }
    }
}
