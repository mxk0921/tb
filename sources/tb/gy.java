package tb;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.IPager;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.Pager;
import com.taobao.android.searchbaseframe.datasource.param.SearchParam;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.m1p;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class gy<RESULT extends SearchResult, PARAM extends SearchParam, LOCAL extends LocalDataManager> implements m1p<RESULT, PARAM, LOCAL> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static int DS_ID = 1;
    private static final String LOG_TAG = "AbsSearchDatasource";
    public z4p<RESULT> mAdapter;
    public String mBundleUrl;
    @Deprecated
    private m1p.a mCacheProvider;
    public yko mCore;
    private Map<String, String> mDebugParams;
    private final gy<?, ?, ?> mDelegate;
    public int mDsTokenId;
    private hj8 mEventBus;
    private y5p mFirstRequestPerf;
    private boolean mIsDestroyed;
    private boolean mIsFirstSearch;
    private boolean mIsTaskRunning;
    private RESULT mLastResult;
    public Map<String, String> mLatestParamsSnapshot;
    private ListStyle mListStyle;
    @Deprecated
    private boolean mLoadNextInCacheEnabled;
    private LOCAL mLocalDataManager;
    private IPager mPager;
    private int mRequestCount;
    private PARAM mSearchParam;
    private gy<RESULT, PARAM, LOCAL>.d mSearchTask;
    public lit mTemplateAsyncManager;
    public ConcurrentHashMap<String, rpc.c> mTemplateFiles;
    private Map<String, TemplateBean> mTemplates;
    private final List<yzd> mTemplatesLoadListeners;
    private RESULT mTotalResult;
    @Deprecated
    public volatile boolean mWaitingForDownload;
    private final m1c mWeexInstanceManager;
    public znd perfStaticsCallback;
    private xno srpLifeCycleWatcher;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            c4p.m(gy.LOG_TAG, "callback the task");
            gy.this.triggerAfter(true, false, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements nld<RESULT> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f20305a;
        public final /* synthetic */ List b;
        public final /* synthetic */ CountDownLatch c;
        public final /* synthetic */ c d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ long f;
        public final /* synthetic */ y5p g;
        public final /* synthetic */ AsyncTask h;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SearchResult f20306a;

            public a(SearchResult searchResult) {
                this.f20306a = searchResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b bVar = b.this;
                gy.access$100(gy.this, this.f20306a, bVar.d, bVar.e, bVar.f, bVar.g);
            }
        }

        public b(AtomicBoolean atomicBoolean, List list, CountDownLatch countDownLatch, c cVar, Map map, long j, y5p y5pVar, AsyncTask asyncTask) {
            this.f20305a = atomicBoolean;
            this.b = list;
            this.c = countDownLatch;
            this.d = cVar;
            this.e = map;
            this.f = j;
            this.g = y5pVar;
            this.h = asyncTask;
        }

        public RESULT a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RESULT) ((SearchResult) ipChange.ipc$dispatch("ccf9fbf6", new Object[]{this}));
            }
            RESULT result = (RESULT) gy.this.createResult(this.d.f20307a);
            result.setSearchConfig(this.d);
            result.setSseMode(true);
            return result;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7c0663cd", new Object[]{this})).booleanValue();
            }
            return this.h.isCancelled();
        }

        public void c(RESULT result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ef0ff1d", new Object[]{this, result});
                return;
            }
            this.b.add(result);
            this.c.countDown();
        }

        public void d(RESULT result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5da5227", new Object[]{this, result});
            } else if (!this.f20305a.get()) {
                this.b.add(result);
                this.c.countDown();
            }
        }

        public void e(RESULT result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6ea30bf", new Object[]{this, result});
                return;
            }
            try {
                Map<String, TemplateBean> templates = result.getTemplates();
                if (templates != null) {
                    String extractPageNameFrom = gy.this.extractPageNameFrom(result);
                    com.taobao.android.weex_framework.c cVar = new com.taobao.android.weex_framework.c();
                    cVar.q(gy.this.mBundleUrl);
                    cVar.r(extractPageNameFrom);
                    if (gy.this.mWaitingForDownload) {
                        gy gyVar = gy.this;
                        xjt.c(cVar, templates, gyVar.mCore, gyVar.mTemplateFiles);
                    } else {
                        gy gyVar2 = gy.this;
                        xjt.b(cVar, templates, gyVar2.mCore, gyVar2.mTemplateFiles);
                    }
                    gy.this.mergeTemplates(templates);
                    gy gyVar3 = gy.this;
                    List<String> findNoTemplateCards = gyVar3.findNoTemplateCards(gy.access$000(gyVar3), result);
                    if (findNoTemplateCards != null && findNoTemplateCards.size() > 0) {
                        for (String str : findNoTemplateCards) {
                            rpc.c e = gxh.o().e(str);
                            if (e != null) {
                                gy.this.mTemplateFiles.put(e.f(), e);
                            }
                        }
                    }
                    gy gyVar4 = gy.this;
                    gyVar4.removeNoTemplateDataAndCheckRequire(gy.access$000(gyVar4), result);
                }
            } catch (Exception unused) {
            }
            if (result.isSseFinished()) {
                this.f20305a.set(true);
                this.b.add(result);
                this.c.countDown();
                return;
            }
            new Handler(Looper.getMainLooper()).post(new a(result));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static int k = 1;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f20307a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final Set<String> h;
        public final Object i;
        public final int j;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public boolean f20308a;
            public int b;
            public boolean c;
            public boolean d;
            public boolean e;
            public boolean f;
            public boolean g;
            public Set<String> h;
            public Object i;

            static {
                t2o.a(993001757);
            }

            public static /* synthetic */ boolean a(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("9feda18a", new Object[]{aVar})).booleanValue();
                }
                return aVar.f20308a;
            }

            public static /* synthetic */ boolean b(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("c833e1cb", new Object[]{aVar})).booleanValue();
                }
                return aVar.c;
            }

            public static /* synthetic */ boolean c(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f07a220c", new Object[]{aVar})).booleanValue();
                }
                return aVar.d;
            }

            public static /* synthetic */ boolean d(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("18c0624d", new Object[]{aVar})).booleanValue();
                }
                return aVar.e;
            }

            public static /* synthetic */ Object e(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("c9ec99e8", new Object[]{aVar});
                }
                return aVar.i;
            }

            public static /* synthetic */ boolean f(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("694ce2cf", new Object[]{aVar})).booleanValue();
                }
                return aVar.f;
            }

            public static /* synthetic */ int g(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("919322ff", new Object[]{aVar})).intValue();
                }
                return aVar.b;
            }

            public static /* synthetic */ boolean h(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("b9d96351", new Object[]{aVar})).booleanValue();
                }
                return aVar.g;
            }

            public c i() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (c) ipChange.ipc$dispatch("c1277c00", new Object[]{this});
                }
                return new c(this);
            }

            public a j(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("ebb684f3", new Object[]{this, new Boolean(z)});
                }
                this.f = z;
                return this;
            }

            public a k(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("1f8aae3c", new Object[]{this, new Boolean(z)});
                }
                this.f20308a = z;
                return this;
            }

            public a l(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("95534eb", new Object[]{this, new Integer(i)});
                }
                this.b = i;
                return this;
            }

            public a m(Set<String> set) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("22f0f58a", new Object[]{this, set});
                }
                this.h = set;
                return this;
            }

            public a n(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("f1984fd9", new Object[]{this, obj});
                }
                this.i = obj;
                return this;
            }

            public a o(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("97fb0039", new Object[]{this, new Boolean(z)});
                }
                this.c = z;
                return this;
            }

            public a p(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("76f0804b", new Object[]{this, new Boolean(z)});
                }
                this.d = z;
                return this;
            }

            public a q(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("b099d8ed", new Object[]{this, new Boolean(z)});
                }
                this.e = z;
                return this;
            }

            public a r(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("a60bd39c", new Object[]{this, new Boolean(z)});
                }
                this.g = z;
                return this;
            }
        }

        static {
            t2o.a(993001756);
        }

        public c(a aVar) {
            int i = k;
            k = i + 1;
            this.j = i;
            this.f20307a = a.a(aVar);
            this.c = a.b(aVar);
            this.d = a.c(aVar);
            this.e = a.d(aVar);
            this.i = a.e(aVar);
            this.h = aVar.h;
            this.f = a.f(aVar);
            this.b = a.g(aVar);
            this.g = a.h(aVar);
        }

        public static a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("db70b84e", new Object[0]);
            }
            return new a();
        }

        public static c c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("6ca4a1ef", new Object[0]);
            }
            return a().k(true).p(true).i();
        }

        public static c d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("157f8b0b", new Object[0]);
            }
            return a().k(true).i();
        }

        public static c e(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("96d5fd6f", new Object[]{obj});
            }
            return a().k(true).n(obj).i();
        }

        public static c f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("80b5910a", new Object[]{new Integer(i)});
            }
            return a().k(true).l(i).i();
        }

        public static c g(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("1917c9ad", new Object[]{obj});
            }
            return a().k(false).n(obj).i();
        }

        public static c h(Set<String> set, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("59e53b2f", new Object[]{set, obj});
            }
            return a().k(false).q(true).m(set).n(obj).i();
        }

        public static c i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("7289f4b2", new Object[0]);
            }
            return a().k(true).o(true).j(true).i();
        }

        public static c j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("2dc4ea00", new Object[0]);
            }
            return a().k(true).q(true).i();
        }

        public static c k(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("6bcf6924", new Object[]{obj});
            }
            return a().k(true).q(true).n(obj).i();
        }

        public static c l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("efe73cf4", new Object[0]);
            }
            return a().q(true).i();
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d6544202", new Object[]{this})).booleanValue();
            }
            if (this.h != null) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public final class d extends AsyncTask<Void, Void, RESULT> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final long f20309a;
        public final y5p b;
        public final c c;
        public final Map<String, String> d;
        public final z4p<RESULT> e;
        public boolean f = false;

        static {
            t2o.a(993001758);
        }

        public d(c cVar, Map<String, String> map, m1p.a aVar, z4p<RESULT> z4pVar, long j, y5p y5pVar) {
            this.c = cVar;
            this.d = map;
            this.e = z4pVar;
            this.f20309a = j;
            this.b = y5pVar;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/datasource/AbsSearchDatasource$SearchTask");
        }

        /* renamed from: a */
        public RESULT doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RESULT) ((SearchResult) ipChange.ipc$dispatch("4d31916d", new Object[]{this, voidArr}));
            }
            if (isCancelled()) {
                RESULT result = (RESULT) gy.this.createResult(this.c.f20307a);
                result.setResultError(new ResultError(2));
                return result;
            }
            gy.this.asyncAppendParams(this.d, this.c);
            c cVar = this.c;
            if (cVar.g) {
                return (RESULT) gy.this.doSseSearchRequest(cVar, this.d, this.e, this.f20309a, this.b, this);
            }
            return (RESULT) gy.this.doSearchRequest(cVar, this.d, this.e, this.f20309a, this.b, null);
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
            }
            if (isCancelled() || this.f) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void onPostExecute(RESULT result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8e4ef49", new Object[]{this, result});
                return;
            }
            this.b.r = System.currentTimeMillis();
            if (isCancelled()) {
                this.f = true;
                return;
            }
            gy.access$100(gy.this, result, this.c, this.d, this.f20309a, this.b);
            this.f = true;
        }
    }

    static {
        t2o.a(993001752);
        t2o.a(993001765);
    }

    public gy(yko ykoVar) {
        this(ykoVar, null, null);
    }

    public static /* synthetic */ Map access$000(gy gyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3070cb9c", new Object[]{gyVar});
        }
        return gyVar.mTemplates;
    }

    public static /* synthetic */ void access$100(gy gyVar, SearchResult searchResult, c cVar, Map map, long j, y5p y5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a0628", new Object[]{gyVar, searchResult, cVar, map, new Long(j), y5pVar});
        } else {
            gyVar.handleResult(searchResult, cVar, map, j, y5pVar);
        }
    }

    private void checkAndCallbackFinishedResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d0506a", new Object[]{this});
            return;
        }
        gy<RESULT, PARAM, LOCAL>.d dVar = this.mSearchTask;
        if (dVar == null) {
            c4p.m(LOG_TAG, "there is no task");
        } else if (dVar.getStatus() != AsyncTask.Status.FINISHED) {
            c4p.m(LOG_TAG, "the task is not finished");
        } else {
            new Handler(Looper.getMainLooper()).post(new a());
        }
    }

    private hj8 getEventBus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hj8) ipChange.ipc$dispatch("b10e50cd", new Object[]{this});
        }
        gy<?, ?, ?> gyVar = this.mDelegate;
        if (gyVar != null) {
            return gyVar.getEventBus();
        }
        return this.mEventBus;
    }

    private void handleResult(RESULT result, c cVar, Map<String, String> map, long j, y5p y5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c4984e", new Object[]{this, result, cVar, map, new Long(j), y5pVar});
            return;
        }
        boolean onPostRequest = onPostRequest(result, cVar, j, y5pVar);
        if (!result.isSseMode()) {
            c().i().k(f5p.a(result, this, getResultTrackArgs(map)));
        }
        if (result.isSuccess()) {
            c4p.D("[XS.request]", "[Request][Datasource:%d][token:%d] Request finished, summary: %s", Integer.valueOf(this.mDsTokenId), Integer.valueOf(cVar.j), result);
        } else {
            c4p.C("[XS.request]", "[Request][Datasource:%d][token:%d] Request failed, error: %s", Integer.valueOf(this.mDsTokenId), Integer.valueOf(cVar.j), result.getError());
        }
        onTriggerEventAfterSearchTask(cVar, result, onPostRequest);
    }

    private void triggerPartialAfter(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b7767e", new Object[]{this, cVar});
        } else if (enableEventBus()) {
            getEventBus().k(w2p.a(this, cVar.h));
        }
    }

    private void triggerPartialBefore(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("302f9cd3", new Object[]{this, cVar});
        } else if (enableEventBus()) {
            getEventBus().k(x2p.a(this, cVar.h));
        }
    }

    public final void addWeexInstance(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d6485a", new Object[]{this, obj});
            return;
        }
        m1c m1cVar = this.mWeexInstanceManager;
        if (m1cVar != null) {
            m1cVar.c(obj);
        }
    }

    public void asyncAppendParams(Map<String, String> map, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f814586", new Object[]{this, map, cVar});
        }
    }

    public Map<String, String> buildSearchParams(PARAM param) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7da20b8c", new Object[]{this, param}) : buildSearchParams(param, null);
    }

    public abstract Map<String, String> buildSearchParams(PARAM param, c cVar);

    public yko c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("827434f7", new Object[]{this});
        }
        return this.mCore;
    }

    public void cancelCurrent() {
        gy<RESULT, PARAM, LOCAL>.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed366a6", new Object[]{this});
        } else if (this.mIsTaskRunning && (dVar = this.mSearchTask) != null) {
            dVar.cancel(false);
            c().l().A(LOG_TAG, "Task cancel");
        }
    }

    public abstract RESULT createResult(boolean z);

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!this.mIsDestroyed) {
            this.mIsDestroyed = true;
            gy<RESULT, PARAM, LOCAL>.d dVar = this.mSearchTask;
            if (dVar != null) {
                dVar.cancel(true);
                this.mSearchTask = null;
            }
            m1c m1cVar = this.mWeexInstanceManager;
            if (m1cVar != null) {
                m1cVar.a();
            }
            if (this.mDelegate == null && shouldResetEventBus()) {
                this.mEventBus = agg.a();
            }
        }
    }

    public boolean doLoadCacheSearch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d307d304", new Object[]{this})).booleanValue() : searchInternal(c.c());
    }

    public boolean doNewSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d0ffe50", new Object[]{this, jSONObject})).booleanValue() : searchInternal(c.e(jSONObject));
    }

    public boolean doNewSearchWithAssignPage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d3329ff", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return searchInternal(c.f(i));
    }

    public boolean doNextPageSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c51b2a98", new Object[]{this, jSONObject})).booleanValue();
        }
        if (this.mIsTaskRunning) {
            return false;
        }
        return searchInternal(c.g(jSONObject));
    }

    public boolean doPartialSearch(Set<String> set, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f027b5a", new Object[]{this, set, jSONObject})).booleanValue();
        }
        return searchInternal(c.h(set, jSONObject));
    }

    public boolean doPreLoadNewSearch(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b948ff", new Object[]{this, str})).booleanValue() : searchInternal(c.e(str));
    }

    public boolean doRefreshListSearch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9269161", new Object[]{this})).booleanValue();
        }
        return searchInternal(c.i());
    }

    public boolean doSilentNewSearch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dbb48313", new Object[]{this})).booleanValue() : searchInternal(c.j());
    }

    public boolean doSilentNextPageSearch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e183e4d5", new Object[]{this})).booleanValue();
        }
        return searchInternal(c.l());
    }

    public RESULT doSseSearchRequest(c cVar, Map<String, String> map, z4p<RESULT> z4pVar, long j, y5p y5pVar, AsyncTask<Void, Void, RESULT> asyncTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RESULT) ((SearchResult) ipChange.ipc$dispatch("fa0dc90e", new Object[]{this, cVar, map, z4pVar, new Long(j), y5pVar, asyncTask}));
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList arrayList = new ArrayList(1);
        z4pVar.b(map, cVar, new b(new AtomicBoolean(false), arrayList, countDownLatch, cVar, map, j, y5pVar, asyncTask));
        try {
            countDownLatch.await();
        } catch (Exception unused) {
        }
        if (!arrayList.isEmpty()) {
            return (RESULT) ((SearchResult) arrayList.get(0));
        }
        RESULT createResult = createResult(cVar.f20307a);
        createResult.setResultError(new ResultError(0, ""));
        return createResult;
    }

    public void downloadTemplates(y5p y5pVar, RESULT result, c cVar) {
        rpc.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c691b5d7", new Object[]{this, y5pVar, result, cVar});
            return;
        }
        c4p.D("[XS.request]", "[Request][Datasource:%d][token:%d] Template download start", Integer.valueOf(this.mDsTokenId), Integer.valueOf(cVar.j));
        long currentTimeMillis = System.currentTimeMillis();
        xno xnoVar = this.srpLifeCycleWatcher;
        if (xnoVar != null) {
            xnoVar.x(null);
        }
        Map<String, TemplateBean> templates = result.getTemplates();
        if (templates != null) {
            String extractPageNameFrom = extractPageNameFrom(result);
            com.taobao.android.weex_framework.c cVar2 = new com.taobao.android.weex_framework.c();
            cVar2.q(this.mBundleUrl);
            cVar2.r(extractPageNameFrom);
            if (this.mWaitingForDownload) {
                dVar = xjt.c(cVar2, templates, this.mCore, this.mTemplateFiles);
            } else {
                dVar = xjt.b(cVar2, templates, this.mCore, this.mTemplateFiles);
            }
            y5pVar.t = dVar.b;
            y5pVar.u = dVar.c;
            y5pVar.s = dVar.d;
        }
        xno xnoVar2 = this.srpLifeCycleWatcher;
        if (xnoVar2 != null) {
            xnoVar2.s(y5pVar.s, null);
        }
        c4p.D("[XS.request]", "[Request][Datasource:%d][token:%d] Template download finished, count: %d, timecost: %d", Integer.valueOf(this.mDsTokenId), Integer.valueOf(cVar.j), Integer.valueOf(y5pVar.t), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        mergeTemplates(templates);
    }

    public StringBuilder dumpDebugInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("baef482f", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("page: ");
        sb.append(this.mPager.getCurrentPage());
        sb.append("\nphysics page: ");
        sb.append(this.mPager.getCurrentPhysicsPage());
        sb.append("\nTemplate总计: ");
        sb.append(this.mTemplates.size());
        sb.append("\n请求次数: ");
        sb.append(this.mRequestCount);
        sb.append('\n');
        return sb;
    }

    public JSONObject dumpDebugParamsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("17a2339a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = this.mDebugParams;
        if (map != null) {
            jSONObject.putAll(map);
        }
        return jSONObject;
    }

    public boolean enableEventBus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c633f434", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public String extractPageNameFrom(RESULT result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f9fa7c6", new Object[]{this, result});
        }
        return getTrackingName();
    }

    public abstract List<String> findNoTemplateCards(Map<String, TemplateBean> map, RESULT result);

    public Map<String, TemplateBean> getAllTemplates() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8e72f80a", new Object[]{this});
        }
        return this.mTemplates;
    }

    public String getBundleUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee20482", new Object[]{this});
        }
        return this.mBundleUrl;
    }

    public yko getCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
        }
        return this.mCore;
    }

    public int getCurrentPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ddb71ec", new Object[]{this})).intValue();
        }
        return this.mPager.getCurrentPage();
    }

    public final PARAM getCurrentParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PARAM) ((SearchParam) ipChange.ipc$dispatch("1026d9db", new Object[]{this}));
        }
        return this.mSearchParam;
    }

    public Executor getExecutor(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("f5f0af1a", new Object[]{this, cVar});
        }
        return this.mCore.f().j().f21080a;
    }

    public y5p getFirstRequestPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y5p) ipChange.ipc$dispatch("74ad29a0", new Object[]{this});
        }
        return this.mFirstRequestPerf;
    }

    public RESULT getLastSearchResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RESULT) ((SearchResult) ipChange.ipc$dispatch("1487eace", new Object[]{this}));
        }
        return this.mLastResult;
    }

    public Map<String, String> getLatestParamsSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("978a803", new Object[]{this});
        }
        if (this.mLatestParamsSnapshot == null) {
            this.mLatestParamsSnapshot = buildSearchParams(getCurrentParam());
        }
        return new HashMap(this.mLatestParamsSnapshot);
    }

    public final LOCAL getLocalDataManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LOCAL) ((LocalDataManager) ipChange.ipc$dispatch("2d07aafc", new Object[]{this}));
        }
        return this.mLocalDataManager;
    }

    public final int getNextPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55f3e612", new Object[]{this})).intValue();
        }
        return this.mPager.getNextPageNum();
    }

    public final int getPageSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2822d620", new Object[]{this})).intValue();
        }
        return this.mPager.getPageSize();
    }

    public final IPager getPager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPager) ipChange.ipc$dispatch("30d8585b", new Object[]{this});
        }
        return this.mPager;
    }

    public int getRequestCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a831bbb0", new Object[]{this})).intValue();
        }
        return this.mRequestCount;
    }

    public Map<String, String> getResultTrackArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7baebd7e", new Object[]{this, map});
        }
        return new HashMap();
    }

    public xno getSrpLifeCycleWatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xno) ipChange.ipc$dispatch("fd35bd12", new Object[]{this});
        }
        return this.srpLifeCycleWatcher;
    }

    public TemplateBean getTemplate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("5cdb49ef", new Object[]{this, str});
        }
        return this.mTemplates.get(str);
    }

    public rpc.c getTemplateFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("ac4c6847", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mTemplateFiles.get(str);
    }

    public ConcurrentHashMap<String, rpc.c> getTemplateFiles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("1ef720b8", new Object[]{this});
        }
        return this.mTemplateFiles;
    }

    public int getTotalResultCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("738c06fe", new Object[]{this})).intValue();
        }
        return this.mPager.getTotalNum();
    }

    public RESULT getTotalSearchResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RESULT) ((SearchResult) ipChange.ipc$dispatch("969984d0", new Object[]{this}));
        }
        return this.mTotalResult;
    }

    @Override // tb.m1p
    public String getTrackingName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b87969a1", new Object[]{this});
        }
        return "search";
    }

    public String getTrackingPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13f4b452", new Object[]{this});
        }
        if (getTotalSearchResult() == null) {
            return "";
        }
        return extractPageNameFrom(this.mLastResult);
    }

    public ListStyle getUserListStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("e9fd2cb6", new Object[]{this});
        }
        return this.mListStyle;
    }

    public boolean hasNextPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39d52367", new Object[]{this})).booleanValue();
        }
        RESULT result = this.mLastResult;
        if (result == null || this.mLoadNextInCacheEnabled || !result.isCache()) {
            return this.mPager.hasNextPage();
        }
        return false;
    }

    public final boolean isCacheEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46efd7b4", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isFirstSearchDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9666aa1b", new Object[]{this})).booleanValue();
        }
        if (this.mSearchTask != null) {
            return true;
        }
        return false;
    }

    public boolean isLoadNextInCacheEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b61e5b52", new Object[]{this})).booleanValue();
        }
        return this.mLoadNextInCacheEnabled;
    }

    public boolean isMultiTasksMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bad986d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isSSEMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97ca1a49", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isSubscribed(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15dd96cb", new Object[]{this, obj})).booleanValue();
        }
        return getEventBus().i(obj);
    }

    public boolean isTaskRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa36517b", new Object[]{this})).booleanValue();
        }
        return this.mIsTaskRunning;
    }

    public void mergeTemplates(Map<String, TemplateBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fcfa49d", new Object[]{this, map});
        } else {
            c().t().c(this.mTemplates, map);
        }
    }

    public abstract LOCAL onCreateLocalDataManager();

    public abstract z4p<RESULT> onCreateRequestAdapter();

    public abstract PARAM onCreateSearchParam();

    public abstract m1c onCreateWeexInstanceManager();

    public void onMergeResult(RESULT result, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb890e4d", new Object[]{this, result, cVar});
        } else if (cVar.b()) {
            this.mTotalResult.partialMerge(cVar.h, result);
        } else if (!cVar.f20307a) {
            this.mTotalResult.merge(result);
        }
    }

    public void onNewTask(gy<RESULT, PARAM, LOCAL>.d dVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6071312", new Object[]{this, dVar, cVar});
        }
    }

    public boolean onPostRequest(RESULT result, c cVar, long j, y5p y5pVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a1c1e5e", new Object[]{this, result, cVar, new Long(j), y5pVar})).booleanValue();
        }
        if (!cVar.e) {
            updateResult(result, cVar.f20307a);
            z = true;
        } else {
            z = false;
        }
        if (result.isFailed()) {
            this.mIsTaskRunning = false;
            return z;
        }
        if (cVar.e) {
            updateResult(result, cVar.f20307a);
        }
        onMergeResult(result, cVar);
        onPostSearch(cVar.f20307a, this.mTotalResult, result);
        y5pVar.f = extractPageNameFrom(result);
        long currentTimeMillis = System.currentTimeMillis();
        y5pVar.h = currentTimeMillis;
        y5pVar.i = currentTimeMillis - y5pVar.g;
        y5pVar.v = result.getPageNo();
        this.mIsTaskRunning = false;
        c().i().k(y5pVar);
        this.mIsFirstSearch = false;
        if (this.mFirstRequestPerf == null && result.isSuccess()) {
            this.mFirstRequestPerf = y5pVar;
        }
        return true;
    }

    public void onPostSearch(boolean z, RESULT result, RESULT result2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f5ba6", new Object[]{this, new Boolean(z), result, result2});
            return;
        }
        this.mPager.increasePage();
        if (z) {
            this.mPager.setTotalNum(result.getTotalResult());
            this.mPager.setPageSize(result.getPageSize());
        }
        if (result2.isPageFinished() || (!this.mLoadNextInCacheEnabled && result2.isCache())) {
            this.mPager.setFinished();
        } else {
            this.mPager.setNotFinished();
        }
        for (yzd yzdVar : this.mTemplatesLoadListeners) {
            yzdVar.a(result2.getTemplates());
        }
    }

    public void onPreSearch(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45651857", new Object[]{this, cVar});
        } else if (cVar.f20307a || (cVar.b() && cVar.h.contains("listItems"))) {
            int i = cVar.b;
            if (i > 0) {
                this.mPager.resetWithAssignPage(i);
            } else {
                this.mPager.reset();
            }
        }
    }

    public void onPreSearchOfParams(c cVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e70bed1", new Object[]{this, cVar, map});
        }
    }

    public void onTriggerEventAfterSearchTask(c cVar, RESULT result, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb3e0e1", new Object[]{this, cVar, result, new Boolean(z)});
        } else if (!z) {
        } else {
            if (cVar.b()) {
                triggerPartialAfter(cVar);
            } else if (cVar.c) {
                triggerRefreshList();
            } else {
                triggerAfter(cVar.f20307a, cVar.e, result.isCache());
            }
        }
    }

    public void postEvent(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e40efd", new Object[]{this, obj});
        } else {
            getEventBus().k(obj);
        }
    }

    public void registerTemplateListener(String str, tzd tzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e75503c", new Object[]{this, str, tzdVar});
        } else {
            this.mTemplateAsyncManager.g(str, tzdVar);
        }
    }

    public void registerTemplateLoadListener(yzd yzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ea2182", new Object[]{this, yzdVar});
        } else {
            this.mTemplatesLoadListeners.add(yzdVar);
        }
    }

    public abstract void removeNoTemplateDataAndCheckRequire(Map<String, TemplateBean> map, RESULT result);

    public void removeWeexInstance(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7320f7d", new Object[]{this, obj});
            return;
        }
        m1c m1cVar = this.mWeexInstanceManager;
        if (m1cVar != null) {
            m1cVar.b(obj);
        }
    }

    public void restoreInstance(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbdfd44a", new Object[]{this, bundle});
            return;
        }
        RESULT result = (RESULT) ((SearchResult) bundle.getParcelable("1"));
        this.mLastResult = result;
        if (result != null) {
            result.setCore(c());
        }
        RESULT result2 = (RESULT) ((SearchResult) bundle.getParcelable("2"));
        this.mTotalResult = result2;
        if (result2 != null) {
            result2.setCore(c());
        }
        this.mSearchParam = (PARAM) ((SearchParam) bundle.getSerializable("3"));
        this.mLocalDataManager = (LOCAL) ((LocalDataManager) bundle.getParcelable("4"));
        this.mPager = (Pager) bundle.getSerializable("5");
        Bundle bundle2 = bundle.getBundle("6");
        for (String str : bundle2.keySet()) {
            this.mTemplates.put(str, (TemplateBean) bundle2.getSerializable(str));
        }
        this.mListStyle = (ListStyle) bundle.getSerializable("7");
    }

    public void saveInstance(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e442c77b", new Object[]{this, bundle});
            return;
        }
        bundle.putParcelable("1", this.mLastResult);
        bundle.putParcelable("2", this.mTotalResult);
        bundle.putSerializable("3", this.mSearchParam);
        bundle.putParcelable("4", this.mLocalDataManager);
        bundle.putSerializable("5", this.mPager);
        Bundle bundle2 = new Bundle(this.mTemplates.size());
        for (Map.Entry<String, TemplateBean> entry : this.mTemplates.entrySet()) {
            bundle2.putSerializable(entry.getKey(), entry.getValue());
        }
        bundle.putBundle("6", bundle2);
        bundle.putSerializable("7", this.mListStyle);
    }

    public void setBundleUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9c479c", new Object[]{this, str});
        } else {
            this.mBundleUrl = str;
        }
    }

    public final void setCacheProvider(m1p.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef1a8af", new Object[]{this, aVar});
        }
    }

    public void setCurrentPage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18fd536", new Object[]{this, new Integer(i)});
        } else {
            this.mPager.setCurrentPage(i);
        }
    }

    public final void setLastResult(RESULT result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6119216a", new Object[]{this, result});
        } else {
            this.mLastResult = result;
        }
    }

    public void setLoadNextInCacheEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d04f0e", new Object[]{this, new Boolean(z)});
        } else {
            this.mLoadNextInCacheEnabled = z;
        }
    }

    public void setLocalDataManager(LOCAL local) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9975f93c", new Object[]{this, local});
        } else if (local != null) {
            this.mLocalDataManager = local;
        }
    }

    public final void setPager(IPager iPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10514961", new Object[]{this, iPager});
        } else {
            this.mPager = iPager;
        }
    }

    public final void setRequestAdapter(z4p<RESULT> z4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b156274", new Object[]{this, z4pVar});
        } else {
            this.mAdapter = z4pVar;
        }
    }

    public void setSearchParam(PARAM param) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5632d0", new Object[]{this, param});
        } else if (param != null) {
            this.mSearchParam = param;
        }
    }

    public void setTemplateFiles(ConcurrentHashMap<String, rpc.c> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d7e9b2", new Object[]{this, concurrentHashMap});
        } else if (concurrentHashMap != null) {
            this.mTemplateFiles = concurrentHashMap;
        }
    }

    public void setTemplates(Map<String, TemplateBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2939c7", new Object[]{this, map});
        } else if (map != null) {
            this.mTemplates = map;
        }
    }

    public void setTotalResult(RESULT result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2883c0", new Object[]{this, result});
        } else {
            this.mTotalResult = result;
        }
    }

    public void setUserListStyle(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef10dd40", new Object[]{this, listStyle});
        } else {
            this.mListStyle = listStyle;
        }
    }

    public final void setWaitingForDownload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295f6b07", new Object[]{this, new Boolean(z)});
        } else {
            this.mWaitingForDownload = z;
        }
    }

    public boolean shouldResetEventBus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b4a808d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void subscribe(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f215636", new Object[]{this, obj, new Integer(i)});
        } else {
            getEventBus().p(obj, i);
        }
    }

    public void subscribePreSearch(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7648c19f", new Object[]{this, obj, new Integer(i)});
            return;
        }
        subscribe(obj, i);
        checkAndCallbackFinishedResult();
    }

    public final void triggerAfter(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902ec2e9", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (enableEventBus()) {
            if (z2) {
                getEventBus().k(z2p.a(z, z3, this));
            } else {
                getEventBus().k(t2p.a(z, z3, this));
            }
        }
    }

    public final void triggerBefore(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc4c0b36", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (enableEventBus()) {
            if (z2) {
                getEventBus().k(a3p.a(z, z3, this));
            } else {
                getEventBus().k(u2p.a(z, z3, this));
            }
        }
    }

    public void triggerRefreshList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136add48", new Object[]{this});
        } else if (enableEventBus()) {
            getEventBus().k(y2p.a());
        }
    }

    public void unregisterTemplateListener(String str, tzd tzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46475183", new Object[]{this, str, tzdVar});
        } else {
            this.mTemplateAsyncManager.h(str, tzdVar);
        }
    }

    public final void unsubscribe(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c0c8b4", new Object[]{this, obj});
        } else {
            getEventBus().s(obj);
        }
    }

    public void updateFirstRequestPerf(y5p y5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5fe4b3", new Object[]{this, y5pVar});
        } else if (y5pVar != null) {
            this.mFirstRequestPerf = y5pVar;
        }
    }

    public void updateRequestCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("279739d3", new Object[]{this, new Integer(i)});
        } else {
            this.mRequestCount = i;
        }
    }

    public void updateResult(RESULT result, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80d239b", new Object[]{this, result, new Boolean(z)});
            return;
        }
        this.mLastResult = result;
        if (z) {
            this.mTotalResult = result;
        }
    }

    public gy(yko ykoVar, xno xnoVar) {
        this(ykoVar, null, xnoVar);
    }

    public boolean doLoadCacheSearch(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b09e3cce", new Object[]{this, str})).booleanValue() : searchInternal(c.a().k(true).p(true).q(true).n(str).i());
    }

    public boolean doNewSearch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4097f128", new Object[]{this})).booleanValue() : searchInternal(c.d());
    }

    public boolean doPreLoadNewSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d803b3a3", new Object[]{this, jSONObject})).booleanValue() : searchInternal(c.e(jSONObject));
    }

    public boolean doSilentNewSearch(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("967aa71d", new Object[]{this, str})).booleanValue() : searchInternal(c.k(str));
    }

    public void subscribe(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6c6a6d", new Object[]{this, obj});
        } else {
            getEventBus().o(obj);
        }
    }

    public gy(yko ykoVar, gy<?, ?, ?> gyVar) {
        this(ykoVar, gyVar, null);
    }

    public boolean doSilentNewSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afb295c5", new Object[]{this, jSONObject})).booleanValue() : searchInternal(c.k(jSONObject));
    }

    public gy(yko ykoVar, gy<?, ?, ?> gyVar, xno xnoVar) {
        this.mTemplateAsyncManager = new lit();
        this.mEventBus = agg.a();
        this.mTemplatesLoadListeners = new ArrayList();
        this.mPager = new Pager();
        this.mIsTaskRunning = false;
        this.mIsFirstSearch = true;
        this.mTemplates = new ConcurrentHashMap();
        this.mTemplateFiles = new ConcurrentHashMap<>();
        this.mListStyle = null;
        int i = DS_ID;
        DS_ID = i + 1;
        this.mDsTokenId = i;
        this.mIsDestroyed = false;
        this.mLoadNextInCacheEnabled = false;
        this.mWaitingForDownload = true;
        this.mDelegate = gyVar;
        this.mCore = ykoVar;
        this.srpLifeCycleWatcher = xnoVar;
        this.mSearchParam = onCreateSearchParam();
        this.mLocalDataManager = onCreateLocalDataManager();
        this.mAdapter = onCreateRequestAdapter();
        this.mWeexInstanceManager = onCreateWeexInstanceManager();
    }

    public boolean doLoadCacheSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("872cc7f4", new Object[]{this, jSONObject})).booleanValue() : searchInternal(c.a().k(true).p(true).q(true).n(jSONObject).i());
    }

    public boolean searchInternal(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a774754", new Object[]{this, cVar})).booleanValue();
        }
        boolean z = cVar.f20307a;
        boolean z2 = cVar.c;
        boolean z3 = cVar.e;
        Object obj = cVar.i;
        if (isMultiTasksMode()) {
            this.mIsTaskRunning = false;
        }
        if (obj == null || (obj instanceof String) || (obj instanceof JSONObject)) {
            if (this.mIsTaskRunning) {
                if (cVar.f) {
                    cancelCurrent();
                } else {
                    c4p.E("[XS.request]", "[Request][Datasource:%d][token:%d] Request skipped, last search not finished", Integer.valueOf(this.mDsTokenId), Integer.valueOf(cVar.j));
                    return false;
                }
            }
            this.mIsTaskRunning = true;
            xno xnoVar = this.srpLifeCycleWatcher;
            if (xnoVar != null) {
                xnoVar.j(z);
                this.srpLifeCycleWatcher.m();
            }
            long currentTimeMillis = System.currentTimeMillis();
            y5p y5pVar = new y5p();
            y5pVar.e = getTrackingName();
            y5pVar.g = currentTimeMillis;
            y5pVar.w = z5p.a();
            c().l().c(LOG_TAG, "SEARCH [start] <isNew: %b> <cache: %b> <silent: %b> <refreshList: %b> <preLoad: %b>", Boolean.valueOf(z), Boolean.FALSE, Boolean.valueOf(z3), Boolean.valueOf(z2), Boolean.valueOf(obj != null));
            onPreSearch(cVar);
            Map<String, String> buildSearchParams = buildSearchParams(this.mSearchParam, cVar);
            this.mLatestParamsSnapshot = new HashMap(buildSearchParams);
            onPreSearchOfParams(cVar, buildSearchParams);
            if (this.mCore.g().isDebug()) {
                this.mDebugParams = buildSearchParams;
            }
            c4p.D("[XS.request]", "[Request][Datasource:%d][token:%d] Request start, params: %s", Integer.valueOf(this.mDsTokenId), Integer.valueOf(cVar.j), buildSearchParams);
            gy<RESULT, PARAM, LOCAL>.d dVar = new d(cVar, buildSearchParams, null, this.mAdapter, currentTimeMillis, y5pVar);
            this.mSearchTask = dVar;
            onNewTask(dVar, cVar);
            this.mSearchTask.executeOnExecutor(getExecutor(cVar), new Void[0]);
            this.mRequestCount++;
            if (cVar.b()) {
                triggerPartialBefore(cVar);
            } else {
                triggerBefore(z, z3, false);
            }
            return true;
        }
        throw new IllegalArgumentException("preLoad must be String or JSONObject(fastjson)");
    }

    public RESULT doSearchRequest(c cVar, Map<String, String> map, z4p<RESULT> z4pVar, long j, y5p y5pVar, m1p.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RESULT) ((SearchResult) ipChange.ipc$dispatch("2879a5fd", new Object[]{this, cVar, map, z4pVar, new Long(j), y5pVar, aVar}));
        }
        RESULT createResult = createResult(cVar.f20307a);
        createResult.setSearchConfig(cVar);
        boolean z = cVar.d && aVar != null;
        try {
            if (cVar.i != null) {
                createResult.setPreLoad(true);
                createResult.setCache(cVar.d);
                y5pVar.c = true;
                y5pVar.b = cVar.d;
                z4pVar.c(createResult, cVar.i, y5pVar);
            } else {
                if (z) {
                    String b2 = aVar.b();
                    if (!TextUtils.isEmpty(b2)) {
                        createResult.setCache(z);
                        y5pVar.b = true;
                        z4pVar.c(createResult, b2, y5pVar);
                    }
                }
                z4pVar.a(createResult, map, y5pVar, aVar, cVar);
            }
        } catch (Throwable th) {
            c().l().e(LOG_TAG, "request error", th);
            createResult.setResultError(new ResultError(0));
        }
        if (createResult.isFailed()) {
            return createResult;
        }
        c4p.D("[XS.request]", "[Request][Datasource:%d][token:%d] Mtop return, timecost: %d", Integer.valueOf(this.mDsTokenId), Integer.valueOf(cVar.j), Long.valueOf(System.currentTimeMillis() - j));
        downloadTemplates(y5pVar, createResult, cVar);
        List<String> findNoTemplateCards = findNoTemplateCards(this.mTemplates, createResult);
        if (findNoTemplateCards != null && findNoTemplateCards.size() > 0) {
            for (String str : findNoTemplateCards) {
                rpc.c e = gxh.o().e(str);
                if (e != null) {
                    this.mTemplateFiles.put(e.f(), e);
                }
            }
        }
        removeNoTemplateDataAndCheckRequire(this.mTemplates, createResult);
        xno xnoVar = this.srpLifeCycleWatcher;
        if (xnoVar != null) {
            xnoVar.w(null);
        }
        y5pVar.q = System.currentTimeMillis();
        return createResult;
    }
}
