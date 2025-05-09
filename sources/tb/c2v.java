package tb;

import android.app.Activity;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTPageStatus;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c2v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ISBF = "isbf";
    public static final String ISFM = "isfm";
    public static final String SPM_URL = "spm-url";
    public static final String UTPARAM_CNT = "utparam-cnt";
    public static final String UT_ISBK = "ut_isbk";
    public static final c2v w = new c2v();
    public static final ArrayList<a> x = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, d> f16804a = new HashMap();
    public final Queue<String> b = new LinkedList();
    public boolean c = false;
    public Map<String, String> d = new HashMap();
    public final Map<String, c> e = new HashMap();
    public String f = null;
    public Map<String, String> g = new HashMap();
    public Map<String, String> h = new HashMap();
    public boolean i = false;
    public Map<String, String> j = null;
    public Map<String, String> k = null;
    public String l = null;
    public final Queue<c> m = new LinkedList();
    public final Map<String, String> n = new HashMap();
    public final Queue<String> o = new LinkedList();
    public String p = null;
    public String q = null;
    public String r = null;
    public String s = null;
    public String t = null;
    public final Map<String, b> u = new HashMap();
    public final Set<String> v = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onPageAppear(Object obj);

        void onPageDisAppear(Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public int mRouterIndex = 0;

        static {
            t2o.a(962593167);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, String> f16805a = new HashMap();
        public long b = 0;
        public long c = 0;
        public Uri d = null;
        public String e = null;
        public String f = null;
        public UTPageStatus g = null;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public String k = null;
        public int l = 0;
        public Map<String, String> m = null;
        public Map<String, String> n = new HashMap();
        public Map<String, String> o = null;

        static {
            t2o.a(962593168);
        }

        public String getCacheKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e0d367e6", new Object[]{this});
            }
            return this.k;
        }

        public Map<String, String> getNextPageProperties() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("5e7392a7", new Object[]{this});
            }
            return this.m;
        }

        public Map<String, String> getNextPageTmpProperties() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d0de98ee", new Object[]{this});
            }
            return this.o;
        }

        public long getPageAppearTimestamp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7e155bb7", new Object[]{this})).longValue();
            }
            return this.b;
        }

        public String getPageName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
            }
            return this.e;
        }

        public Map<String, String> getPageProperties() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a7f3a94", new Object[]{this});
            }
            return this.f16805a;
        }

        public UTPageStatus getPageStatus() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UTPageStatus) ipChange.ipc$dispatch("99feab1", new Object[]{this});
            }
            return this.g;
        }

        public int getPageStatusCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9960005e", new Object[]{this})).intValue();
            }
            return this.l;
        }

        public long getPageStayTimstamp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1a2d1b44", new Object[]{this})).longValue();
            }
            return this.c;
        }

        public Map<String, String> getPageTmpProperties() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("f1494de1", new Object[]{this});
            }
            return this.n;
        }

        public Uri getPageUrl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("d05f8ee8", new Object[]{this});
            }
            return this.d;
        }

        public String getRefPage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("523494ed", new Object[]{this});
            }
            return this.f;
        }

        public boolean isH5Called() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b959e47f", new Object[]{this})).booleanValue();
            }
            return this.j;
        }

        public boolean isPageAppearCalled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bb8809f6", new Object[]{this})).booleanValue();
            }
            return this.h;
        }

        public boolean isSkipPage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ca155483", new Object[]{this})).booleanValue();
            }
            return this.i;
        }

        public void resetPropertiesWithoutSkipFlagAndH5Flag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2601866", new Object[]{this});
                return;
            }
            this.f16805a = new HashMap();
            this.n = new HashMap();
            this.b = 0L;
            this.c = 0L;
            this.d = null;
            this.e = null;
            this.f = null;
            UTPageStatus uTPageStatus = this.g;
            if (uTPageStatus == null || uTPageStatus != UTPageStatus.UT_H5_IN_WebView) {
                this.g = null;
            }
            this.h = false;
            this.j = false;
            this.l = 0;
            this.m = null;
            this.o = null;
        }

        public void setCacheKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c476ef50", new Object[]{this, str});
            } else {
                this.k = str;
            }
        }

        public void setH5Called() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7df67fb3", new Object[]{this});
            } else {
                this.j = true;
            }
        }

        public void setNextPageProperties(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d27b3c7", new Object[]{this, map});
            } else {
                this.m = map;
            }
        }

        public void setNextPageTmpProperties(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c75cf8", new Object[]{this, map});
            } else {
                this.o = map;
            }
        }

        public void setPageAppearCalled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("251ed2a", new Object[]{this});
            } else {
                this.h = true;
            }
        }

        public void setPageAppearTimestamp(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4635c6d", new Object[]{this, new Long(j)});
            } else {
                this.b = j;
            }
        }

        public void setPageName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
            } else {
                this.e = str;
            }
        }

        public void setPageProperties(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b020637a", new Object[]{this, map});
            } else {
                this.f16805a = map;
            }
        }

        public void setPageStatus(UTPageStatus uTPageStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("676435a3", new Object[]{this, uTPageStatus});
            } else {
                this.g = uTPageStatus;
            }
        }

        public void setPageStatusCode(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0e53f6c", new Object[]{this, new Integer(i)});
            } else {
                this.l = i;
            }
        }

        public void setPageStayTimstamp(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb8977e8", new Object[]{this, new Long(j)});
            } else {
                this.c = j;
            }
        }

        public void setPageTmpProperties(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9badac65", new Object[]{this, map});
            } else {
                this.n = map;
            }
        }

        public void setPageUrl(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f69e8c2", new Object[]{this, uri});
            } else {
                this.d = uri;
            }
        }

        public void setRefPage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb619191", new Object[]{this, str});
            } else {
                this.f = str;
            }
        }

        public void setToSkipPage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b1f1952", new Object[]{this});
            } else {
                this.i = true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mSpmCnt = null;
        public String mSpmUrl = null;
        public String mSpmPre = null;
        public boolean mIsBack = false;
        public boolean mIsFrame = false;
        public boolean mIsSwitchBackground = false;
        public String mUtparamCnt = null;
        public String mUtparamUrl = null;
        public String mUtparamPre = null;
        public String mScmUrl = null;
        public String mScmPre = null;
        public boolean mIsSkipBack = false;
        public boolean mIsSkipBackForever = false;
        public boolean mIsH5Page = false;

        static {
            t2o.a(962593169);
        }

        public Map<String, String> getPageStatMap(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2eebfa1f", new Object[]{this, new Boolean(z)});
            }
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(this.mSpmCnt)) {
                hashMap.put("spm-cnt", this.mSpmCnt);
            }
            if (!TextUtils.isEmpty(this.mSpmUrl)) {
                hashMap.put("spm-url", this.mSpmUrl);
            }
            if (!TextUtils.isEmpty(this.mSpmPre)) {
                hashMap.put("spm-pre", this.mSpmPre);
            }
            if (!TextUtils.isEmpty(this.mScmPre)) {
                hashMap.put("scm-pre", this.mScmPre);
            }
            if (this.mIsSwitchBackground) {
                hashMap.put(c2v.ISBF, "1");
            } else if (this.mIsFrame && z) {
                hashMap.put(c2v.ISFM, "1");
            } else if (this.mIsBack) {
                hashMap.put(c2v.UT_ISBK, "1");
            }
            if (!TextUtils.isEmpty(this.mUtparamCnt)) {
                hashMap.put("utparam-cnt", this.mUtparamCnt);
            }
            if (!TextUtils.isEmpty(this.mUtparamUrl)) {
                hashMap.put(z9u.KEY_UTPARAM_URL, this.mUtparamUrl);
            }
            if (!TextUtils.isEmpty(this.mUtparamPre)) {
                hashMap.put("utparam-pre", this.mUtparamPre);
            }
            return hashMap;
        }
    }

    static {
        t2o.a(962593165);
    }

    public static synchronized void addPageChangerListener(a aVar) {
        synchronized (c2v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963679a2", new Object[]{aVar});
            } else if (aVar != null) {
                ArrayList<a> arrayList = x;
                if (!arrayList.contains(aVar)) {
                    arrayList.add(aVar);
                }
            }
        }
    }

    public static synchronized void dispatchPageChangerEvent(int i, Object obj) {
        synchronized (c2v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9071b157", new Object[]{new Integer(i), obj});
                return;
            }
            int size = x.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = x.get(i2);
                if (aVar != null) {
                    if (i == 0) {
                        aVar.onPageAppear(obj);
                    } else {
                        aVar.onPageDisAppear(obj);
                    }
                }
            }
        }
    }

    public static c2v getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c2v) ipChange.ipc$dispatch("64ccd4c6", new Object[0]);
        }
        return w;
    }

    public static String k(Uri uri) {
        List<String> queryParameters;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f8155e9", new Object[]{uri});
        }
        if (uri == null || (queryParameters = uri.getQueryParameters("ttid")) == null) {
            return null;
        }
        for (String str : queryParameters) {
            if (!(str.contains("@") || str.contains("%40"))) {
                return str;
            }
        }
        return null;
    }

    public static String o(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5b793cc", new Object[]{obj});
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.toLowerCase().endsWith("activity")) {
            return simpleName.substring(0, simpleName.length() - 8);
        }
        return simpleName;
    }

    public static boolean r(Object obj, String str) {
        String o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("953b8843", new Object[]{obj, str})).booleanValue();
        }
        if (!(obj instanceof Activity) || (o = o(obj)) == null || !o.equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final synchronized void A() {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fbbb641", new Object[]{this});
                return;
            }
            if (((LinkedList) this.b).size() > 100) {
                for (int i = 0; i < 50; i++) {
                    String str = (String) ((LinkedList) this.b).poll();
                    if (str != null) {
                        ((HashMap) this.f16804a).remove(str);
                    }
                }
            }
        }
    }

    public final synchronized void B(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ced72b", new Object[]{this, obj});
        } else {
            ((HashMap) this.e).remove(l(obj));
        }
    }

    public final void C(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19611e1b", new Object[]{this, obj, new Integer(i)});
        } else if (i > 0) {
            String n = n(obj);
            if (((HashMap) this.u).containsKey(n)) {
                b bVar = (b) ((HashMap) this.u).get(n);
                if (bVar != null) {
                    int i2 = bVar.mRouterIndex;
                    bVar.mRouterIndex = i;
                    String m = m(obj, i);
                    d orNewUTPageStateObject = getOrNewUTPageStateObject(obj);
                    boolean z = orNewUTPageStateObject.mIsSwitchBackground;
                    c(orNewUTPageStateObject);
                    if (i < i2) {
                        orNewUTPageStateObject.mIsBack = true;
                    } else if (i != i2) {
                    } else {
                        if (z) {
                            orNewUTPageStateObject.mIsSwitchBackground = true;
                        } else if (m.equalsIgnoreCase(this.p)) {
                            orNewUTPageStateObject.mIsFrame = true;
                        } else {
                            orNewUTPageStateObject.mIsBack = true;
                        }
                    }
                }
            } else {
                b bVar2 = new b();
                bVar2.mRouterIndex = i;
                ((HashMap) this.u).put(n, bVar2);
            }
        }
    }

    public final void D(d dVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c99811f", new Object[]{this, dVar, map});
        } else if (dVar != null && map != null) {
            String str = map.get("force-spm-cnt");
            if (!TextUtils.isEmpty(str)) {
                dVar.mSpmCnt = str;
            }
            String str2 = map.get("force-spm-url");
            if (!TextUtils.isEmpty(str2)) {
                dVar.mSpmUrl = str2;
            }
        }
    }

    public final void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d716ec", new Object[]{this, map});
            return;
        }
        try {
            Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Object value = it.next().getValue();
                if (value == null) {
                    it.remove();
                } else if ((value instanceof String) && TextUtils.isEmpty((String) value)) {
                    it.remove();
                }
            }
        } catch (Exception e) {
            nhh.f("", e);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63d5b90", new Object[]{this});
            return;
        }
        this.d = new HashMap();
        this.f = null;
        this.l = null;
        this.j = null;
        this.k = null;
        u4v.getInstance().setBackupH5Url(null);
    }

    public final void c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c1161bc", new Object[]{this, dVar});
            return;
        }
        dVar.mIsBack = false;
        dVar.mIsFrame = false;
        dVar.mIsSwitchBackground = false;
        dVar.mIsSkipBack = false;
        dVar.mIsSkipBackForever = false;
        dVar.mIsH5Page = false;
    }

    public final synchronized void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743f42f", new Object[]{this, obj});
            return;
        }
        String n = n(obj);
        if (((HashMap) this.u).containsKey(n)) {
            if (((b) ((HashMap) this.u).get(n)) != null) {
                String str = n + "###";
                Iterator it = ((HashMap) this.f16804a).entrySet().iterator();
                while (it.hasNext()) {
                    String str2 = (String) ((Map.Entry) it.next()).getKey();
                    if (str2 != null && str2.startsWith(str)) {
                        it.remove();
                    }
                }
                ((HashMap) this.u).remove(n);
            } else {
                return;
            }
        }
        ((HashSet) this.v).remove(n);
    }

    public final synchronized void e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f559b1", new Object[]{this, cVar});
        } else {
            ((HashMap) this.e).remove(cVar.getCacheKey());
        }
    }

    public final void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a9baaa", new Object[]{this, map});
        } else if (map != null && map.size() > 0) {
            map.remove("spm-cnt");
            map.remove("spm-url");
            map.remove("spm-pre");
            map.remove("utparam-cnt");
            map.remove(z9u.KEY_UTPARAM_URL);
            map.remove("utparam-pre");
            map.remove("scm-pre");
        }
    }

    public final d g(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("1faead27", new Object[]{this, dVar});
        }
        if (dVar == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.mSpmCnt = dVar.mSpmCnt;
        dVar2.mSpmUrl = dVar.mSpmUrl;
        dVar2.mSpmPre = dVar.mSpmPre;
        dVar2.mIsBack = dVar.mIsBack;
        dVar2.mIsFrame = dVar.mIsFrame;
        dVar2.mIsSwitchBackground = dVar.mIsSwitchBackground;
        dVar2.mUtparamCnt = dVar.mUtparamCnt;
        dVar2.mUtparamUrl = dVar.mUtparamUrl;
        dVar2.mUtparamPre = dVar.mUtparamPre;
        dVar2.mScmUrl = dVar.mScmUrl;
        dVar2.mScmPre = dVar.mScmPre;
        dVar2.mIsSkipBack = dVar.mIsSkipBack;
        dVar2.mIsSkipBackForever = dVar.mIsSkipBackForever;
        return dVar2;
    }

    public String getCurrentPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f927f6fc", new Object[]{this});
        }
        return this.l;
    }

    public String getLastCacheKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bd0dff0", new Object[]{this});
        }
        return this.p;
    }

    public String getLastCacheKeyScmUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62d9d1be", new Object[]{this});
        }
        return this.r;
    }

    public String getLastCacheKeySpmUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ae30a51", new Object[]{this});
        }
        return this.q;
    }

    public String getLastCacheKeyUtParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("410921d4", new Object[]{this});
        }
        return this.s;
    }

    public String getLastCacheKeyUtParamCnt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1245895", new Object[]{this});
        }
        return this.t;
    }

    public synchronized Map<String, String> getNextPageProperties(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2bb81903", new Object[]{this, obj});
        } else if (obj == null) {
            return null;
        } else {
            return i(obj).getNextPageProperties();
        }
    }

    public synchronized Map<String, String> getNextPageTmpProperties(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1eebb8a", new Object[]{this, obj});
        } else if (obj == null) {
            return null;
        } else {
            return i(obj).getNextPageTmpProperties();
        }
    }

    public synchronized d getOrNewUTPageStateObject(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("5effff94", new Object[]{this, obj});
        } else if (!(obj instanceof Activity)) {
            return null;
        } else {
            String l = l(obj);
            if (!((LinkedList) this.b).contains(l)) {
                ((LinkedList) this.b).add(l);
            }
            if (((HashMap) this.f16804a).containsKey(l)) {
                return (d) ((HashMap) this.f16804a).get(l);
            }
            d dVar = new d();
            ((HashMap) this.f16804a).put(l, dVar);
            return dVar;
        }
    }

    public synchronized Map<String, String> getPageProperties(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97847fb0", new Object[]{this, obj});
        } else if (obj == null) {
            return null;
        } else {
            HashMap hashMap = new HashMap();
            Map<String, String> map = this.d;
            if (map != null) {
                hashMap.putAll(map);
            }
            Map<String, String> pageProperties = i(obj).getPageProperties();
            if (pageProperties != null) {
                hashMap.putAll(pageProperties);
            }
            return hashMap;
        }
    }

    public synchronized String getPageScmPre(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a24e39c", new Object[]{this, activity});
        }
        Map<String, String> pageAllProperties = getPageAllProperties(activity);
        if (pageAllProperties == null) {
            return "";
        }
        String str = pageAllProperties.get("scm-pre");
        return hsq.f(str) ? "" : str;
    }

    public synchronized String getPageSpmPre(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("796f1bef", new Object[]{this, activity});
        }
        Map<String, String> pageAllProperties = getPageAllProperties(activity);
        if (pageAllProperties == null) {
            return "";
        }
        String str = pageAllProperties.get("spm-pre");
        return hsq.f(str) ? "" : str;
    }

    public synchronized String getPageSpmUrl(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d3bc1a3", new Object[]{this, activity});
        }
        Map<String, String> pageAllProperties = getPageAllProperties(activity);
        if (pageAllProperties == null) {
            return "";
        }
        String str = pageAllProperties.get("spm-url");
        return hsq.f(str) ? "" : str;
    }

    public synchronized String getPageUrl(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a16f8af3", new Object[]{this, obj});
        } else if (obj == null) {
            return null;
        } else {
            c i = i(obj);
            if (i == null || i.getPageUrl() == null) {
                return null;
            }
            return i.getPageUrl().toString();
        }
    }

    public final int h(Object obj) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("feac001d", new Object[]{this, obj})).intValue();
        }
        String n = n(obj);
        if (!((HashMap) this.u).containsKey(n) || (bVar = (b) ((HashMap) this.u).get(n)) == null) {
            return 0;
        }
        return bVar.mRouterIndex;
    }

    public final synchronized c i(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("334cb7b4", new Object[]{this, obj});
        }
        String l = l(obj);
        if (((HashMap) this.e).containsKey(l)) {
            return (c) ((HashMap) this.e).get(l);
        }
        c cVar = new c();
        ((HashMap) this.e).put(l, cVar);
        cVar.setCacheKey(l);
        return cVar;
    }

    public final synchronized d j(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("3479b94b", new Object[]{this, obj, new Integer(i)});
        } else if (!(obj instanceof Activity)) {
            return null;
        } else {
            String m = m(obj, i);
            if (!((LinkedList) this.b).contains(m)) {
                ((LinkedList) this.b).add(m);
            }
            if (((HashMap) this.f16804a).containsKey(m)) {
                return (d) ((HashMap) this.f16804a).get(m);
            }
            d dVar = new d();
            ((HashMap) this.f16804a).put(m, dVar);
            return dVar;
        }
    }

    public final String l(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f06559a", new Object[]{this, obj});
        }
        return m(obj, h(obj));
    }

    public final String m(Object obj, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd6fb260", new Object[]{this, obj, new Integer(i)});
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = obj.getClass().getSimpleName();
        }
        int hashCode = obj.hashCode();
        StringBuilder sb = new StringBuilder(64);
        sb.append(str);
        sb.append(hashCode);
        if (i > 0) {
            sb.append("###");
            sb.append(i);
        }
        return sb.toString();
    }

    public final String n(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55968565", new Object[]{this, obj});
        }
        if (!(obj instanceof Activity)) {
            return "";
        }
        return obj.getClass().getSimpleName() + obj.hashCode();
    }

    @Deprecated
    public synchronized void pageAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52025aa7", new Object[]{this, obj});
        } else {
            pageAppear(obj, null, false, 0);
        }
    }

    public void pageAppearByAuto(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24952ce3", new Object[]{this, activity});
        } else if (!this.c) {
            pageAppear(activity);
        }
    }

    public synchronized void pageDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19526863", new Object[]{this, activity});
            return;
        }
        d(activity);
        String l = l(activity);
        ((HashMap) this.f16804a).remove(l);
        ((LinkedList) this.b).remove(l);
        A();
    }

    @Deprecated
    public synchronized void pageDisAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f29b97", new Object[]{this, obj});
        } else {
            pageDisAppear(obj, UTAnalytics.getInstance().getDefaultTracker());
        }
    }

    public void pageDisAppearByAuto(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509d01d3", new Object[]{this, activity});
        } else if (!this.c) {
            pageDisAppear(activity, UTAnalytics.getInstance().getDefaultTracker());
        }
    }

    public synchronized void pageSwitchBackground() {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf12438", new Object[]{this});
            return;
        }
        if (((HashMap) this.f16804a).containsKey(this.p) && (dVar = (d) ((HashMap) this.f16804a).get(this.p)) != null) {
            dVar.mIsSwitchBackground = true;
        }
    }

    public final String q(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa62bdce", new Object[]{this, map, str});
        }
        if (map == null) {
            return str;
        }
        String str2 = map.get("spm-url");
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String str3 = map.get("spm_url");
        if (!TextUtils.isEmpty(str3)) {
            return str3;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str4 = map.get("spm");
        return !TextUtils.isEmpty(str4) ? str4 : "";
    }

    public String refreshUtParam(String str, String str2) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("608ed72", new Object[]{this, str, str2});
        }
        try {
            Map<String, Object> map2 = null;
            if (!TextUtils.isEmpty(str)) {
                map = v(str);
            } else {
                map = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                map2 = v(str2);
            }
            if (!s(map) && !s(map2)) {
                map2.putAll(map);
                a(map2);
                return JSON.toJSONString(map2);
            } else if (!s(map) && s(map2)) {
                a(map);
                return JSON.toJSONString(map);
            } else if (!s(map) || s(map2)) {
                return "";
            } else {
                a(map2);
                return JSON.toJSONString(map2);
            }
        } catch (Exception e) {
            nhh.f("", e);
            return "";
        }
    }

    public final boolean s(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc54476a", new Object[]{this, map})).booleanValue();
        }
        if (map == null || map.size() < 1) {
            return true;
        }
        return false;
    }

    public synchronized void setH5Called(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65b08cf", new Object[]{this, obj});
            return;
        }
        if (obj != null) {
            c i = i(obj);
            if (i.getPageStatus() != null) {
                i.setH5Called();
            }
        }
    }

    public void setLastCacheKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee99286", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public void setLastCacheKeyScmUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c322178", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    public void setLastCacheKeySpmUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454ffb45", new Object[]{this, str});
        } else {
            this.q = str;
        }
    }

    public void setLastCacheKeyUtParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f0938a", new Object[]{this, str});
        } else {
            this.s = str;
        }
    }

    public void setLastCacheKeyUtParamCnt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e10f81", new Object[]{this, str});
        } else {
            this.t = str;
        }
    }

    public final boolean t(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce3d26fc", new Object[]{this, cVar})).booleanValue();
        }
        if (cVar == null || cVar.getPageStatus() == null || UTPageStatus.UT_H5_IN_WebView != cVar.getPageStatus()) {
            return false;
        }
        return true;
    }

    public synchronized void turnOffAutoPageTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21c1f82", new Object[]{this});
        } else {
            this.c = true;
        }
    }

    public final boolean u(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e59eb2e", new Object[]{this, obj})).booleanValue();
        }
        String n = n(obj);
        if (hsq.h(n)) {
            return ((HashSet) this.v).contains(n);
        }
        return false;
    }

    public synchronized void updatePageProperties(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{this, obj, map});
            return;
        }
        if (!(obj == null || map == null || map.size() == 0)) {
            nhh.f("UTPageHitHelper", "updatePageProperties pageObject", obj, "pageProperties", map);
            HashMap hashMap = new HashMap(map);
            c i = i(obj);
            Map<String, String> pageProperties = i.getPageProperties();
            if (pageProperties == null) {
                i.setPageProperties(hashMap);
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(pageProperties);
                hashMap2.putAll(hashMap);
                i.setPageProperties(hashMap2);
            }
            d2v.updatePageProperties(obj);
            return;
        }
        nhh.i("UTPageHitHelper", "failed to update project properties");
    }

    public final Map<String, Object> v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49fe660b", new Object[]{this, str});
        }
        try {
            return (Map) JSON.parseObject(str, Map.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public final synchronized void w(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bc8580", new Object[]{this, str, cVar});
        } else {
            ((HashMap) this.e).put(str, cVar);
        }
    }

    public final void x(d dVar, Map<String, String> map, String str, String str2, String str3, String str4) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19ebb4", new Object[]{this, dVar, map, str, str2, str3, str4});
            return;
        }
        String str6 = map.get("spm-cnt");
        if (!TextUtils.isEmpty(str6)) {
            dVar.mSpmCnt = str6;
        } else {
            dVar.mSpmCnt = map.get("spm_cnt");
        }
        dVar.mSpmUrl = q(map, str);
        if (!TextUtils.isEmpty(this.p)) {
            dVar.mSpmPre = this.q;
        } else {
            dVar.mSpmPre = "";
        }
        if (!TextUtils.isEmpty(str3)) {
            dVar.mScmUrl = str3;
        } else {
            dVar.mScmUrl = map.get("scm");
        }
        if (!TextUtils.isEmpty(this.p)) {
            dVar.mScmPre = this.r;
        } else {
            dVar.mScmPre = "";
        }
        String refreshUtParam = refreshUtParam(map.get("utparam-cnt"), str4);
        if (!TextUtils.isEmpty(refreshUtParam)) {
            dVar.mUtparamCnt = refreshUtParam;
        } else {
            dVar.mUtparamCnt = "";
        }
        if (!TextUtils.isEmpty(this.p)) {
            str5 = this.t;
        } else {
            str5 = "";
        }
        dVar.mUtparamUrl = refreshUtParam(str2, refreshUtParam(map.get(z9u.KEY_UTPARAM_URL), str5));
        if (!TextUtils.isEmpty(this.p)) {
            dVar.mUtparamPre = this.s;
        } else {
            dVar.mUtparamPre = "";
        }
    }

    public final synchronized void y(String str) {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6fa66ce", new Object[]{this, str});
                return;
            }
            if (!((LinkedList) this.o).contains(str)) {
                ((LinkedList) this.o).add(str);
            }
            if (((LinkedList) this.o).size() > 100) {
                for (int i = 0; i < 50; i++) {
                    String str2 = (String) ((LinkedList) this.o).poll();
                    if (str2 != null) {
                        ((HashMap) this.n).remove(str2);
                    }
                }
            }
        }
    }

    public final synchronized void z(c cVar) {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec63c74b", new Object[]{this, cVar});
                return;
            }
            cVar.resetPropertiesWithoutSkipFlagAndH5Flag();
            if (!((LinkedList) this.m).contains(cVar)) {
                ((LinkedList) this.m).add(cVar);
            }
            if (((LinkedList) this.m).size() > 200) {
                for (int i = 0; i < 100; i++) {
                    c cVar2 = (c) ((LinkedList) this.m).poll();
                    if (cVar2 != null) {
                        ((HashMap) this.e).remove(cVar2.getCacheKey());
                    }
                }
            }
        }
    }

    public static Map<String, String> encodeUtParam(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8c19aa9b", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        try {
            String str = map.get("utparam-cnt");
            if (!TextUtils.isEmpty(str)) {
                map.put("utparam-cnt", URLEncoder.encode(str));
            }
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
        try {
            String str2 = map.get(z9u.KEY_UTPARAM_URL);
            if (!TextUtils.isEmpty(str2)) {
                map.put(z9u.KEY_UTPARAM_URL, URLEncoder.encode(str2));
            }
        } catch (Throwable th2) {
            nhh.h(null, th2, new Object[0]);
        }
        try {
            String str3 = map.get("utparam-pre");
            if (!TextUtils.isEmpty(str3)) {
                map.put("utparam-pre", URLEncoder.encode(str3));
            }
        } catch (Throwable th3) {
            nhh.h(null, th3, new Object[0]);
        }
        try {
            String str4 = map.get(e2v.UT_SEQ);
            if (!TextUtils.isEmpty(str4)) {
                map.put(e2v.UT_SEQ, URLEncoder.encode(str4));
            }
        } catch (Throwable th4) {
            nhh.h(null, th4, new Object[0]);
        }
        return map;
    }

    public final String p(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8103a57c", new Object[]{this, uri});
        }
        String queryParameter = uri.getQueryParameter("spm");
        if (hsq.f(queryParameter)) {
            try {
                uri = Uri.parse(URLDecoder.decode(uri.toString(), "UTF-8"));
                queryParameter = uri.getQueryParameter("spm");
            } catch (Exception e) {
                nhh.u("", e, new Object[0]);
            }
        }
        if (!hsq.f(queryParameter)) {
            return queryParameter;
        }
        String queryParameter2 = uri.getQueryParameter("spm_url");
        if (!hsq.f(queryParameter2)) {
            return queryParameter2;
        }
        try {
            return Uri.parse(URLDecoder.decode(uri.toString(), "UTF-8")).getQueryParameter("spm_url");
        } catch (Exception e2) {
            nhh.u("", e2, new Object[0]);
            return queryParameter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[Catch: all -> 0x001a, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0009, B:12:0x0020, B:15:0x0026, B:17:0x0030, B:20:0x003d, B:22:0x0047, B:25:0x0054, B:27:0x0061, B:28:0x0068, B:30:0x0076, B:32:0x007c, B:40:0x00a4, B:42:0x00ae, B:44:0x00b2, B:47:0x00b7, B:48:0x00be, B:49:0x00c1, B:50:0x00c4, B:52:0x00ce, B:54:0x00dd, B:56:0x00e1, B:58:0x00e5, B:59:0x00e9, B:61:0x00ed, B:64:0x00f3, B:65:0x00fa, B:66:0x00ff, B:68:0x0103, B:69:0x0106, B:70:0x0110, B:73:0x011c), top: B:88:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4 A[Catch: all -> 0x001a, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0009, B:12:0x0020, B:15:0x0026, B:17:0x0030, B:20:0x003d, B:22:0x0047, B:25:0x0054, B:27:0x0061, B:28:0x0068, B:30:0x0076, B:32:0x007c, B:40:0x00a4, B:42:0x00ae, B:44:0x00b2, B:47:0x00b7, B:48:0x00be, B:49:0x00c1, B:50:0x00c4, B:52:0x00ce, B:54:0x00dd, B:56:0x00e1, B:58:0x00e5, B:59:0x00e9, B:61:0x00ed, B:64:0x00f3, B:65:0x00fa, B:66:0x00ff, B:68:0x0103, B:69:0x0106, B:70:0x0110, B:73:0x011c), top: B:88:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.Map<java.lang.String, java.lang.String> getPageAllProperties(android.app.Activity r13) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.c2v.getPageAllProperties(android.app.Activity):java.util.Map");
    }

    public synchronized void pageAppear(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cac8b1", new Object[]{this, obj, str});
        } else {
            pageAppear(obj, str, false, 0);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:23|(4:26|(1:28)|29|(5:33|(1:35)|36|37|38))|39|(2:41|(10:43|(1:49)|50|(1:52)(1:53)|54|(1:56)(1:57)|(1:59)(1:60)|(1:68)(1:67)|69|(1:72)))|73|(1:77)|78|(1:80)|81|(3:278|84|(26:86|(1:88)|89|(4:91|92|284|93)(1:94)|(1:98)|(1:102)|104|(1:106)|107|(6:110|(1:112)|113|(1:117)|118|(16:120|122|(34:269|124|125|292|126|(7:128|271|129|130|280|131|(1:139)(1:135))(1:142)|288|143|282|144|275|145|(2:286|147)|150|(3:152|273|153)(1:156)|157|(1:159)|160|(1:162)|163|(1:165)|166|180|(2:(3:183|(2:187|189)(1:188)|190)(5:191|(4:193|(1:199)|200|(1:205))(1:206)|207|(1:209)|210)|211)(1:212)|290|213|(1:215)|218|(1:222)|223|(4:225|(1:229)|242|(3:244|(1:246)|247)(2:248|249))(1:230)|(2:232|(5:234|(1:236)(1:237)|238|(1:240)|241))|242|(0)(0))(1:179)|178|180|(0)(0)|290|213|(0)|218|(2:220|222)|223|(0)(0)|(0)|242|(0)(0)))|121|122|(0)(0)|178|180|(0)(0)|290|213|(0)|218|(0)|223|(0)(0)|(0)|242|(0)(0)))|103|104|(0)|107|(6:110|(0)|113|(2:115|117)|118|(0))|121|122|(0)(0)|178|180|(0)(0)|290|213|(0)|218|(0)|223|(0)(0)|(0)|242|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x049c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x049d, code lost:
        tb.nhh.f("", r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0235 A[Catch: all -> 0x002b, TryCatch #4 {, blocks: (B:4:0x0016, B:6:0x001c, B:10:0x002e, B:12:0x0046, B:16:0x005a, B:18:0x005e, B:21:0x006c, B:23:0x0082, B:26:0x00a4, B:28:0x00aa, B:29:0x00c1, B:31:0x00c7, B:33:0x00cd, B:35:0x00df, B:36:0x00e1, B:39:0x00e9, B:41:0x00fb, B:43:0x0100, B:45:0x0106, B:47:0x010f, B:49:0x0115, B:50:0x012f, B:52:0x0135, B:54:0x013b, B:56:0x0144, B:59:0x014c, B:62:0x0154, B:65:0x015c, B:69:0x0165, B:72:0x016d, B:73:0x0170, B:75:0x017a, B:78:0x0182, B:80:0x0186, B:81:0x018b, B:104:0x022f, B:106:0x0235, B:107:0x023c, B:110:0x0242, B:113:0x0250, B:115:0x0256, B:117:0x025c, B:118:0x0265, B:122:0x0277, B:177:0x0387, B:180:0x03a2, B:183:0x03aa, B:185:0x03ae, B:188:0x03b8, B:189:0x03c9, B:190:0x03cc, B:191:0x03cf, B:193:0x03de, B:195:0x03ed, B:197:0x03f1, B:199:0x03f5, B:200:0x03fa, B:202:0x03fe, B:205:0x0404, B:206:0x0410, B:207:0x0416, B:209:0x041a, B:211:0x041f, B:213:0x0484, B:215:0x0496, B:217:0x049d, B:218:0x04ac, B:220:0x04b2, B:222:0x04be, B:223:0x04ca, B:225:0x04d2, B:227:0x04da, B:232:0x04e5, B:234:0x04ef, B:236:0x04f8, B:238:0x04ff, B:241:0x0506, B:242:0x0520, B:244:0x0557, B:246:0x0564, B:247:0x056b, B:248:0x0587, B:249:0x058e, B:250:0x058f, B:252:0x05b2, B:253:0x05b6, B:255:0x05bc, B:256:0x05c0, B:258:0x05c6, B:259:0x05ca, B:261:0x05cf, B:262:0x05d3), top: B:277:0x0016, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0496 A[Catch: all -> 0x002b, Exception -> 0x049c, TRY_LEAVE, TryCatch #11 {Exception -> 0x049c, blocks: (B:213:0x0484, B:215:0x0496), top: B:290:0x0484, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04b2 A[Catch: all -> 0x002b, TryCatch #4 {, blocks: (B:4:0x0016, B:6:0x001c, B:10:0x002e, B:12:0x0046, B:16:0x005a, B:18:0x005e, B:21:0x006c, B:23:0x0082, B:26:0x00a4, B:28:0x00aa, B:29:0x00c1, B:31:0x00c7, B:33:0x00cd, B:35:0x00df, B:36:0x00e1, B:39:0x00e9, B:41:0x00fb, B:43:0x0100, B:45:0x0106, B:47:0x010f, B:49:0x0115, B:50:0x012f, B:52:0x0135, B:54:0x013b, B:56:0x0144, B:59:0x014c, B:62:0x0154, B:65:0x015c, B:69:0x0165, B:72:0x016d, B:73:0x0170, B:75:0x017a, B:78:0x0182, B:80:0x0186, B:81:0x018b, B:104:0x022f, B:106:0x0235, B:107:0x023c, B:110:0x0242, B:113:0x0250, B:115:0x0256, B:117:0x025c, B:118:0x0265, B:122:0x0277, B:177:0x0387, B:180:0x03a2, B:183:0x03aa, B:185:0x03ae, B:188:0x03b8, B:189:0x03c9, B:190:0x03cc, B:191:0x03cf, B:193:0x03de, B:195:0x03ed, B:197:0x03f1, B:199:0x03f5, B:200:0x03fa, B:202:0x03fe, B:205:0x0404, B:206:0x0410, B:207:0x0416, B:209:0x041a, B:211:0x041f, B:213:0x0484, B:215:0x0496, B:217:0x049d, B:218:0x04ac, B:220:0x04b2, B:222:0x04be, B:223:0x04ca, B:225:0x04d2, B:227:0x04da, B:232:0x04e5, B:234:0x04ef, B:236:0x04f8, B:238:0x04ff, B:241:0x0506, B:242:0x0520, B:244:0x0557, B:246:0x0564, B:247:0x056b, B:248:0x0587, B:249:0x058e, B:250:0x058f, B:252:0x05b2, B:253:0x05b6, B:255:0x05bc, B:256:0x05c0, B:258:0x05c6, B:259:0x05ca, B:261:0x05cf, B:262:0x05d3), top: B:277:0x0016, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04d2 A[Catch: all -> 0x002b, TryCatch #4 {, blocks: (B:4:0x0016, B:6:0x001c, B:10:0x002e, B:12:0x0046, B:16:0x005a, B:18:0x005e, B:21:0x006c, B:23:0x0082, B:26:0x00a4, B:28:0x00aa, B:29:0x00c1, B:31:0x00c7, B:33:0x00cd, B:35:0x00df, B:36:0x00e1, B:39:0x00e9, B:41:0x00fb, B:43:0x0100, B:45:0x0106, B:47:0x010f, B:49:0x0115, B:50:0x012f, B:52:0x0135, B:54:0x013b, B:56:0x0144, B:59:0x014c, B:62:0x0154, B:65:0x015c, B:69:0x0165, B:72:0x016d, B:73:0x0170, B:75:0x017a, B:78:0x0182, B:80:0x0186, B:81:0x018b, B:104:0x022f, B:106:0x0235, B:107:0x023c, B:110:0x0242, B:113:0x0250, B:115:0x0256, B:117:0x025c, B:118:0x0265, B:122:0x0277, B:177:0x0387, B:180:0x03a2, B:183:0x03aa, B:185:0x03ae, B:188:0x03b8, B:189:0x03c9, B:190:0x03cc, B:191:0x03cf, B:193:0x03de, B:195:0x03ed, B:197:0x03f1, B:199:0x03f5, B:200:0x03fa, B:202:0x03fe, B:205:0x0404, B:206:0x0410, B:207:0x0416, B:209:0x041a, B:211:0x041f, B:213:0x0484, B:215:0x0496, B:217:0x049d, B:218:0x04ac, B:220:0x04b2, B:222:0x04be, B:223:0x04ca, B:225:0x04d2, B:227:0x04da, B:232:0x04e5, B:234:0x04ef, B:236:0x04f8, B:238:0x04ff, B:241:0x0506, B:242:0x0520, B:244:0x0557, B:246:0x0564, B:247:0x056b, B:248:0x0587, B:249:0x058e, B:250:0x058f, B:252:0x05b2, B:253:0x05b6, B:255:0x05bc, B:256:0x05c0, B:258:0x05c6, B:259:0x05ca, B:261:0x05cf, B:262:0x05d3), top: B:277:0x0016, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04e5 A[Catch: all -> 0x002b, TryCatch #4 {, blocks: (B:4:0x0016, B:6:0x001c, B:10:0x002e, B:12:0x0046, B:16:0x005a, B:18:0x005e, B:21:0x006c, B:23:0x0082, B:26:0x00a4, B:28:0x00aa, B:29:0x00c1, B:31:0x00c7, B:33:0x00cd, B:35:0x00df, B:36:0x00e1, B:39:0x00e9, B:41:0x00fb, B:43:0x0100, B:45:0x0106, B:47:0x010f, B:49:0x0115, B:50:0x012f, B:52:0x0135, B:54:0x013b, B:56:0x0144, B:59:0x014c, B:62:0x0154, B:65:0x015c, B:69:0x0165, B:72:0x016d, B:73:0x0170, B:75:0x017a, B:78:0x0182, B:80:0x0186, B:81:0x018b, B:104:0x022f, B:106:0x0235, B:107:0x023c, B:110:0x0242, B:113:0x0250, B:115:0x0256, B:117:0x025c, B:118:0x0265, B:122:0x0277, B:177:0x0387, B:180:0x03a2, B:183:0x03aa, B:185:0x03ae, B:188:0x03b8, B:189:0x03c9, B:190:0x03cc, B:191:0x03cf, B:193:0x03de, B:195:0x03ed, B:197:0x03f1, B:199:0x03f5, B:200:0x03fa, B:202:0x03fe, B:205:0x0404, B:206:0x0410, B:207:0x0416, B:209:0x041a, B:211:0x041f, B:213:0x0484, B:215:0x0496, B:217:0x049d, B:218:0x04ac, B:220:0x04b2, B:222:0x04be, B:223:0x04ca, B:225:0x04d2, B:227:0x04da, B:232:0x04e5, B:234:0x04ef, B:236:0x04f8, B:238:0x04ff, B:241:0x0506, B:242:0x0520, B:244:0x0557, B:246:0x0564, B:247:0x056b, B:248:0x0587, B:249:0x058e, B:250:0x058f, B:252:0x05b2, B:253:0x05b6, B:255:0x05bc, B:256:0x05c0, B:258:0x05c6, B:259:0x05ca, B:261:0x05cf, B:262:0x05d3), top: B:277:0x0016, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0557 A[Catch: all -> 0x002b, TryCatch #4 {, blocks: (B:4:0x0016, B:6:0x001c, B:10:0x002e, B:12:0x0046, B:16:0x005a, B:18:0x005e, B:21:0x006c, B:23:0x0082, B:26:0x00a4, B:28:0x00aa, B:29:0x00c1, B:31:0x00c7, B:33:0x00cd, B:35:0x00df, B:36:0x00e1, B:39:0x00e9, B:41:0x00fb, B:43:0x0100, B:45:0x0106, B:47:0x010f, B:49:0x0115, B:50:0x012f, B:52:0x0135, B:54:0x013b, B:56:0x0144, B:59:0x014c, B:62:0x0154, B:65:0x015c, B:69:0x0165, B:72:0x016d, B:73:0x0170, B:75:0x017a, B:78:0x0182, B:80:0x0186, B:81:0x018b, B:104:0x022f, B:106:0x0235, B:107:0x023c, B:110:0x0242, B:113:0x0250, B:115:0x0256, B:117:0x025c, B:118:0x0265, B:122:0x0277, B:177:0x0387, B:180:0x03a2, B:183:0x03aa, B:185:0x03ae, B:188:0x03b8, B:189:0x03c9, B:190:0x03cc, B:191:0x03cf, B:193:0x03de, B:195:0x03ed, B:197:0x03f1, B:199:0x03f5, B:200:0x03fa, B:202:0x03fe, B:205:0x0404, B:206:0x0410, B:207:0x0416, B:209:0x041a, B:211:0x041f, B:213:0x0484, B:215:0x0496, B:217:0x049d, B:218:0x04ac, B:220:0x04b2, B:222:0x04be, B:223:0x04ca, B:225:0x04d2, B:227:0x04da, B:232:0x04e5, B:234:0x04ef, B:236:0x04f8, B:238:0x04ff, B:241:0x0506, B:242:0x0520, B:244:0x0557, B:246:0x0564, B:247:0x056b, B:248:0x0587, B:249:0x058e, B:250:0x058f, B:252:0x05b2, B:253:0x05b6, B:255:0x05bc, B:256:0x05c0, B:258:0x05c6, B:259:0x05ca, B:261:0x05cf, B:262:0x05d3), top: B:277:0x0016, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0587 A[Catch: all -> 0x002b, TryCatch #4 {, blocks: (B:4:0x0016, B:6:0x001c, B:10:0x002e, B:12:0x0046, B:16:0x005a, B:18:0x005e, B:21:0x006c, B:23:0x0082, B:26:0x00a4, B:28:0x00aa, B:29:0x00c1, B:31:0x00c7, B:33:0x00cd, B:35:0x00df, B:36:0x00e1, B:39:0x00e9, B:41:0x00fb, B:43:0x0100, B:45:0x0106, B:47:0x010f, B:49:0x0115, B:50:0x012f, B:52:0x0135, B:54:0x013b, B:56:0x0144, B:59:0x014c, B:62:0x0154, B:65:0x015c, B:69:0x0165, B:72:0x016d, B:73:0x0170, B:75:0x017a, B:78:0x0182, B:80:0x0186, B:81:0x018b, B:104:0x022f, B:106:0x0235, B:107:0x023c, B:110:0x0242, B:113:0x0250, B:115:0x0256, B:117:0x025c, B:118:0x0265, B:122:0x0277, B:177:0x0387, B:180:0x03a2, B:183:0x03aa, B:185:0x03ae, B:188:0x03b8, B:189:0x03c9, B:190:0x03cc, B:191:0x03cf, B:193:0x03de, B:195:0x03ed, B:197:0x03f1, B:199:0x03f5, B:200:0x03fa, B:202:0x03fe, B:205:0x0404, B:206:0x0410, B:207:0x0416, B:209:0x041a, B:211:0x041f, B:213:0x0484, B:215:0x0496, B:217:0x049d, B:218:0x04ac, B:220:0x04b2, B:222:0x04be, B:223:0x04ca, B:225:0x04d2, B:227:0x04da, B:232:0x04e5, B:234:0x04ef, B:236:0x04f8, B:238:0x04ff, B:241:0x0506, B:242:0x0520, B:244:0x0557, B:246:0x0564, B:247:0x056b, B:248:0x0587, B:249:0x058e, B:250:0x058f, B:252:0x05b2, B:253:0x05b6, B:255:0x05bc, B:256:0x05c0, B:258:0x05c6, B:259:0x05ca, B:261:0x05cf, B:262:0x05d3), top: B:277:0x0016, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0285 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void pageDisAppear(java.lang.Object r34, com.ut.mini.UTTracker r35) {
        /*
            Method dump skipped, instructions count: 1509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.c2v.pageDisAppear(java.lang.Object, com.ut.mini.UTTracker):void");
    }

    public synchronized void skipNextPageBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c53dbcf", new Object[]{this});
            return;
        }
        nhh.f("UTPageHitHelper", "skipNextPageBack");
        this.i = true;
    }

    public synchronized boolean isH52001(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90ec60fd", new Object[]{this, obj})).booleanValue();
        } else if (obj == null || !t(i(obj))) {
            nhh.f("UTPageHitHelper", "isH52001:false pageObject", obj);
            return false;
        } else {
            nhh.f("UTPageHitHelper", "isH52001:true pageObject", obj);
            return true;
        }
    }

    public synchronized void skipBack(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2cdf29", new Object[]{this, obj});
        } else if (obj != null) {
            nhh.f("UTPageHitHelper", "skipBack", obj);
            d orNewUTPageStateObject = getOrNewUTPageStateObject(obj);
            if (orNewUTPageStateObject != null) {
                orNewUTPageStateObject.mIsSkipBack = true;
            }
        }
    }

    public synchronized void skipPage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ec0ed1", new Object[]{this, obj});
        } else if (obj != null) {
            nhh.f("UTPageHitHelper", a1v.SKIP_PAGE, obj);
            i(obj).setToSkipPage();
        }
    }

    public synchronized void updateNextPageProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203bbc0", new Object[]{this, map});
            return;
        }
        if (map != null) {
            nhh.f("UTPageHitHelper", "updateNextPageProperties pageProperties", map);
            Map<String, String> map2 = this.g;
            if (map2 == null) {
                this.g = new HashMap(map);
            } else {
                map2.putAll(map);
            }
        }
    }

    public synchronized void updateNextPageTmpProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30b265f", new Object[]{this, map});
            return;
        }
        if (map != null) {
            nhh.f("UTPageHitHelper", "updateNextPageTmpProperties nextPageTmpProperties", map);
            Map<String, String> map2 = this.h;
            if (map2 == null) {
                this.h = new HashMap(map);
            } else {
                map2.putAll(map);
            }
        }
    }

    public synchronized void updateNextPageUtparam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ce5d14", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            nhh.f("UTPageHitHelper", "updateNextPageUtparam pageUtparam", str);
            String str2 = "";
            Map<String, String> map = this.g;
            if (map != null) {
                str2 = map.get(z9u.KEY_UTPARAM_URL);
            } else {
                this.g = new HashMap();
            }
            String refreshUtParam = refreshUtParam(str, str2);
            if (!TextUtils.isEmpty(refreshUtParam)) {
                HashMap hashMap = new HashMap();
                hashMap.put(z9u.KEY_UTPARAM_URL, refreshUtParam);
                this.g.putAll(hashMap);
            }
        }
    }

    public synchronized void updateNextPageUtparamCnt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38161b7", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            nhh.f("UTPageHitHelper", "updateNextPageUtparamCnt pageUtparamCnt", str);
            String str2 = "";
            Map<String, String> map = this.g;
            if (map != null) {
                str2 = map.get("utparam-cnt");
            } else {
                this.g = new HashMap();
            }
            String refreshUtParam = refreshUtParam(str, str2);
            if (!TextUtils.isEmpty(refreshUtParam)) {
                HashMap hashMap = new HashMap();
                hashMap.put("utparam-cnt", refreshUtParam);
                this.g.putAll(hashMap);
            }
        }
    }

    public synchronized void pageAppear(Object obj, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08f0043", new Object[]{this, obj, str, new Boolean(z)});
        } else {
            pageAppear(obj, str, z, 0);
        }
    }

    public synchronized void setPageStatusCode(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e662d0", new Object[]{this, obj, new Integer(i)});
        } else if (obj != null) {
            nhh.f("UTPageHitHelper", "setPageStatusCode pageObject", obj, "pageStatusCode", Integer.valueOf(i));
            i(obj).setPageStatusCode(i);
        }
    }

    public synchronized void skipBackForever(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43a5f5f0", new Object[]{this, obj, new Boolean(z)});
        } else if (obj != null) {
            nhh.f("UTPageHitHelper", "skipBackForever pageObject", obj, "skipBack", Boolean.valueOf(z));
            d orNewUTPageStateObject = getOrNewUTPageStateObject(obj);
            if (orNewUTPageStateObject != null) {
                orNewUTPageStateObject.mIsSkipBackForever = z;
            }
        }
    }

    public synchronized void updatePageName(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be12fe50", new Object[]{this, obj, str});
            return;
        }
        nhh.f("UTPageHitHelper", "updatePageName pageObject", obj, "pageName", str);
        if (obj != null && !hsq.f(str)) {
            i(obj).setPageName(str);
            this.l = str;
        }
    }

    public synchronized void updatePageStatus(Object obj, UTPageStatus uTPageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954041a6", new Object[]{this, obj, uTPageStatus});
        } else if (obj != null) {
            nhh.f("UTPageHitHelper", "setPageStatusCode pageObject", obj, "pageStatus", uTPageStatus);
            if (uTPageStatus == UTPageStatus.UT_PV_WITH_ROUTER_INDEX) {
                String n = n(obj);
                if (hsq.h(n)) {
                    ((HashSet) this.v).add(n);
                }
            } else {
                i(obj).setPageStatus(uTPageStatus);
            }
        }
    }

    public synchronized void updatePageTmpProperties(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6101da30", new Object[]{this, obj, map});
            return;
        }
        if (!(obj == null || map == null || map.size() == 0)) {
            nhh.f("UTPageHitHelper", "updatePageTmpProperties pageObject", obj, wua.KEY_PROPERTIES, map);
            HashMap hashMap = new HashMap(map);
            c i = i(obj);
            Map<String, String> pageTmpProperties = i.getPageTmpProperties();
            if (pageTmpProperties == null) {
                i.setPageTmpProperties(hashMap);
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(pageTmpProperties);
                hashMap2.putAll(hashMap);
                i.setPageTmpProperties(hashMap2);
            }
            return;
        }
        nhh.i("UTPageHitHelper", "failed to update project tmp properties");
    }

    public synchronized void updatePageUrl(Object obj, Uri uri) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db943cd", new Object[]{this, obj, uri});
        } else if (obj != null) {
            if (nhh.n()) {
                if (uri == null) {
                    nhh.f("UTPageHitHelper", "updatePageUrl pageObject", obj, "uri is null");
                } else {
                    nhh.f("UTPageHitHelper", "updatePageUrl pageObject", obj, "host", uri.getHost(), "query", uri.getQuery());
                }
            }
            i(obj).setPageUrl(uri);
            if (uri != null) {
                try {
                    queryParameter = uri.getQueryParameter("spmcnt");
                } catch (Throwable unused) {
                }
                if (hsq.h(queryParameter)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("spm-cnt", queryParameter);
                    updatePageProperties(obj, hashMap);
                }
            }
            d2v.updatePageProperties(obj);
        }
    }

    public synchronized void updatePageUtparam(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c541ce3", new Object[]{this, obj, str});
            return;
        }
        if (obj != null && !hsq.f(str)) {
            nhh.f("UTPageHitHelper", "updatePageUtparam pageObject", obj, "pageUtparam", str);
            Map<String, String> pageProperties = getPageProperties(obj);
            String str2 = "";
            if (pageProperties != null) {
                str2 = pageProperties.get("utparam-cnt");
            }
            String refreshUtParam = refreshUtParam(str, str2);
            if (!TextUtils.isEmpty(refreshUtParam)) {
                HashMap hashMap = new HashMap();
                hashMap.put("utparam-cnt", refreshUtParam);
                updatePageProperties(obj, hashMap);
            }
            d2v.updatePageProperties(obj);
        }
    }

    public synchronized void pageAppear(Object obj, String str, boolean z, int i) {
        d j;
        d j2;
        String h5Url;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21517b20", new Object[]{this, obj, str, new Boolean(z), new Integer(i)});
            return;
        }
        nhh.f("UTPageHitHelper", "pageAppear pageObject", obj, "pageName", str, "isNotSkipFlag", Boolean.valueOf(z), "routerIndex", Integer.valueOf(i));
        if (!UTAnalytics.getInstance().isInit()) {
            nhh.i("UTPageHitHelper", a1v.PAGE_APPEAR, "Please initialize UT_Analytics first");
            return;
        }
        if (obj != null) {
            boolean u = u(obj);
            nhh.f("UTPageHitHelper", "pageAppear isPageWithRouter", Boolean.valueOf(u));
            if (!u || i > 0) {
                int i2 = !u ? 0 : i;
                if (l(obj).equals(this.f)) {
                    nhh.v("UTPageHitHelper", "pageAppear repeat", this.f);
                    return;
                }
                if (this.f != null) {
                    nhh.i("lost 2001", "Last page requires leave(" + this.f + ").");
                }
                C(obj, i2);
                String l = l(obj);
                c i3 = i(obj);
                if (z || !i3.isSkipPage()) {
                    l2v.pageAppear();
                    p3v.getInstance().pageAppear(UTAnalytics.getInstance().getDefaultTracker(), obj, str, z);
                    dispatchPageChangerEvent(0, obj);
                    x1v.getInstance().addAction("pageAppear:".concat(obj.getClass().getSimpleName()));
                    if (!u && (h5Url = u4v.getInstance().getH5Url()) != null) {
                        u4v.getInstance().setBackupH5Url(h5Url);
                        Uri parse = Uri.parse(h5Url);
                        String queryParameter = parse.getQueryParameter("spm");
                        String queryParameter2 = parse.getQueryParameter("scm");
                        if (hsq.h(queryParameter)) {
                            ((HashMap) this.d).put("spm", queryParameter);
                        }
                        if (hsq.h(queryParameter2)) {
                            ((HashMap) this.d).put("scm", queryParameter2);
                        }
                        String queryParameter3 = parse.getQueryParameter("spmcnt");
                        if (hsq.h(queryParameter3)) {
                            ((HashMap) this.d).put("spm-cnt", queryParameter3);
                        }
                        u4v.getInstance().setH5Url(null);
                    }
                    String o = o(obj);
                    if (!u && b1v.bJTrackExtend) {
                        try {
                            String pageName = ssf.getPageName(obj.getClass().getSimpleName());
                            if (!TextUtils.isEmpty(pageName)) {
                                if (pageName.toLowerCase().endsWith("activity")) {
                                    pageName = pageName.substring(0, pageName.length() - 8);
                                }
                                nhh.m("JTrack", "PageName", pageName);
                                o = pageName;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (!hsq.f(str)) {
                        o = str;
                    }
                    if (!hsq.f(i3.getPageName())) {
                        o = i3.getPageName();
                    }
                    this.l = o;
                    i3.setPageName(o);
                    i3.setPageAppearTimestamp(System.currentTimeMillis());
                    i3.setPageStayTimstamp(SystemClock.elapsedRealtime());
                    i3.setRefPage(u4v.getInstance().getRefPage());
                    i3.setPageAppearCalled();
                    Map<String, String> map = this.g;
                    if (map != null) {
                        this.j = map;
                        i3.setNextPageProperties(map);
                        Map<String, String> pageProperties = i3.getPageProperties();
                        if (pageProperties == null) {
                            i3.setPageProperties(this.g);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.putAll(pageProperties);
                            hashMap.putAll(this.g);
                            i3.setPageProperties(hashMap);
                        }
                    }
                    this.g = null;
                    Map<String, String> map2 = this.h;
                    if (map2 != null) {
                        this.k = map2;
                        i3.setNextPageTmpProperties(map2);
                        Map<String, String> pageTmpProperties = i3.getPageTmpProperties();
                        if (pageTmpProperties == null) {
                            i3.setPageTmpProperties(this.h);
                        } else {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.putAll(pageTmpProperties);
                            hashMap2.putAll(this.h);
                            i3.setPageTmpProperties(hashMap2);
                        }
                    }
                    this.h = null;
                    this.f = l;
                    if (this.i && (j2 = j(obj, i2)) != null) {
                        j2.mIsSkipBack = true;
                        this.i = false;
                    }
                    e(i3);
                    w(l, i3);
                    if (z && i3.isSkipPage() && !u && (j = j(obj, i2)) != null) {
                        j.mIsFrame = true;
                    }
                } else {
                    nhh.m("skip page[pageAppear]", "page name:".concat(obj.getClass().getSimpleName()));
                }
            } else {
                nhh.v("UTPageHitHelper", "skip old pageAppear api in UT_PV_WITH_ROUTER_INDEX ~~~");
            }
        } else {
            nhh.i(a1v.PAGE_APPEAR, "The page object should not be null");
        }
    }

    @Deprecated
    public synchronized void updatePageProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a94ff3", new Object[]{this, map});
            return;
        }
        if (map != null) {
            nhh.i("UTPageHitHelper", "UTPageHitHelper.updatePageProperties is deprecated.Please use UTAnalytics.getInstance().getDefaultTracker().updatePageProperties with PageObject parameter.");
            nhh.f("UTPageHitHelper", "updatePageProperties pageProperties", map);
            ((HashMap) this.d).putAll(map);
        }
    }
}
