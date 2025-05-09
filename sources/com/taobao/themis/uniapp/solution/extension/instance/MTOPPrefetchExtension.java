package com.taobao.themis.uniapp.solution.extension.instance;

import android.net.Uri;
import android.os.SystemClock;
import com.alibaba.ability.impl.mtop.MtopAbility;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.DataPrefetch;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.text.Regex;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.hbs;
import tb.ies;
import tb.jr;
import tb.k8s;
import tb.mcs;
import tb.ncs;
import tb.pl4;
import tb.q9s;
import tb.t2o;
import tb.tsq;
import tb.uq;
import tb.wsq;
import tb.xhv;
import tb.xoc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class MTOPPrefetchExtension implements xoc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public bbs f13782a;
    public final Regex b = new Regex("\\$\\{([^}]+)\\}");
    public final AtomicInteger c = new AtomicInteger(0);
    public final ConcurrentLinkedQueue<Pair<JSONObject, JSONObject>> d = new ConcurrentLinkedQueue<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.themis.uniapp.solution.extension.instance.MTOPPrefetchExtension$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class C0780a implements uq {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f13783a;

            public C0780a(c cVar) {
                this.f13783a = cVar;
            }

            @Override // tb.uq
            public final void a(jr jrVar, boolean z) {
                String str;
                boolean z2 = true;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
                    return;
                }
                c cVar = this.f13783a;
                if (jrVar == null || !jrVar.d()) {
                    z2 = false;
                }
                String str2 = null;
                if (jrVar == null) {
                    str = null;
                } else {
                    str = jrVar.b();
                }
                if (jrVar != null) {
                    str2 = jrVar.c();
                }
                cVar.a(z2, str, str2);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class b implements uq {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f13784a;

            public b(c cVar) {
                this.f13784a = cVar;
            }

            @Override // tb.uq
            public final void a(jr jrVar, boolean z) {
                String str;
                boolean z2 = true;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
                    return;
                }
                c cVar = this.f13784a;
                if (jrVar == null || !jrVar.d()) {
                    z2 = false;
                }
                String str2 = null;
                if (jrVar == null) {
                    str = null;
                } else {
                    str = jrVar.b();
                }
                if (jrVar != null) {
                    str2 = jrVar.c();
                }
                cVar.a(z2, str, str2);
            }
        }

        static {
            t2o.a(848298018);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static final /* synthetic */ void a(a aVar, bbs bbsVar, JSONObject jSONObject, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88dafbb2", new Object[]{aVar, bbsVar, jSONObject, cVar});
            } else {
                aVar.b(bbsVar, jSONObject, cVar);
            }
        }

        public a() {
        }

        public final void b(bbs bbsVar, JSONObject jSONObject, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("937a294f", new Object[]{this, bbsVar, jSONObject, cVar});
            } else if (bbsVar != null) {
                k8s.j().d(bbsVar, TMSCalendarBridge.namespace, null, null, "mtop", MtopAbility.API_PREFETCH_DATA, jSONObject, new C0780a(cVar));
            } else {
                k8s.j().e(TMSCalendarBridge.namespace, null, "mtop", MtopAbility.API_PREFETCH_DATA, jSONObject, new b(cVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a(boolean z, String str, String str2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f13786a;
        public final /* synthetic */ MTOPPrefetchExtension b;
        public final /* synthetic */ Pair<JSONObject, JSONObject> c;
        public final /* synthetic */ long d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(JSONObject jSONObject, MTOPPrefetchExtension mTOPPrefetchExtension, Pair<? extends JSONObject, ? extends JSONObject> pair, long j) {
            this.f13786a = jSONObject;
            this.b = mTOPPrefetchExtension;
            this.c = pair;
            this.d = j;
        }

        @Override // com.taobao.themis.uniapp.solution.extension.instance.MTOPPrefetchExtension.c
        public void a(boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e7edafd", new Object[]{this, new Boolean(z), str, str2});
                return;
            }
            String string = this.f13786a.getString("pageTraceId");
            String str3 = "";
            if (string == null) {
                string = str3;
            }
            String string2 = this.f13786a.getString("requestTraceId");
            if (string2 != null) {
                str3 = string2;
            }
            JSONObject jSONObject = new JSONObject();
            Pair<JSONObject, JSONObject> pair = this.c;
            long j = this.d;
            jSONObject.put((JSONObject) "isSuccess", (String) Boolean.valueOf(z));
            jSONObject.put((JSONObject) "request", (String) pair.getSecond());
            jSONObject.put((JSONObject) "cost", (String) Long.valueOf(SystemClock.uptimeMillis() - j));
            if (!z) {
                jSONObject.put((JSONObject) "errorCode", str);
                jSONObject.put((JSONObject) "errorMsg", str2);
            }
            xhv xhvVar = xhv.INSTANCE;
            mcs.e("Themis/Performance/Prefetch", "On_Prefetch_Result", string, str3, jSONObject);
            MTOPPrefetchExtension.b(this.b).decrementAndGet();
            MTOPPrefetchExtension.t(this.b);
        }
    }

    static {
        t2o.a(848298017);
        t2o.a(848298015);
    }

    public static /* synthetic */ void O(MTOPPrefetchExtension mTOPPrefetchExtension, TMSMetaInfoWrapper tMSMetaInfoWrapper, String str, String str2, String str3, int i, Object obj) {
        bbs bbsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd1a989c", new Object[]{mTOPPrefetchExtension, tMSMetaInfoWrapper, str, str2, str3, new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0 && ((bbsVar = mTOPPrefetchExtension.f13782a) == null || (str3 = ncs.d(bbsVar)) == null)) {
            str3 = mcs.GLOBAL_EVENT_ROOT_ID;
        }
        mTOPPrefetchExtension.I(tMSMetaInfoWrapper, str, str2, str3);
    }

    public static final /* synthetic */ AtomicInteger b(MTOPPrefetchExtension mTOPPrefetchExtension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("d1cdfd5e", new Object[]{mTOPPrefetchExtension});
        }
        return mTOPPrefetchExtension.c;
    }

    public static final /* synthetic */ void t(MTOPPrefetchExtension mTOPPrefetchExtension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9979854", new Object[]{mTOPPrefetchExtension});
        } else {
            mTOPPrefetchExtension.g0();
        }
    }

    public static final /* synthetic */ String y(MTOPPrefetchExtension mTOPPrefetchExtension, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4351d3b", new Object[]{mTOPPrefetchExtension, str, bVar});
        }
        return mTOPPrefetchExtension.h0(str, bVar);
    }

    public final void I(TMSMetaInfoWrapper tMSMetaInfoWrapper, String str, String str2, String str3) {
        AppManifest r;
        AppManifest.Container container;
        AppManifest.Performance performance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296f1edb", new Object[]{this, tMSMetaInfoWrapper, str, str2, str3});
            return;
        }
        List<DataPrefetch> list = null;
        if (!(tMSMetaInfoWrapper == null || (r = tMSMetaInfoWrapper.r()) == null || (container = r.getContainer()) == null || (performance = container.getPerformance()) == null)) {
            list = performance.getDataPrefetch();
        }
        if (list != null) {
            for (JSONObject jSONObject : z(list, str, str2)) {
                ConcurrentLinkedQueue<Pair<JSONObject, JSONObject>> concurrentLinkedQueue = this.d;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "pageTraceId", str3);
                jSONObject2.put((JSONObject) "requestTraceId", mcs.d(str3));
                concurrentLinkedQueue.add(new Pair<>(jSONObject2, jSONObject));
                g0();
            }
        }
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        xoc.a.a(this, bbsVar);
        this.f13782a = bbsVar;
    }

    public void W(TMSMetaInfoWrapper tMSMetaInfoWrapper, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27f2d5b", new Object[]{this, tMSMetaInfoWrapper, str, str2});
            return;
        }
        ckf.g(tMSMetaInfoWrapper, "metaInfo");
        ckf.g(str, pl4.KEY_PAGE_ID);
        ckf.g(str2, "pageUrl");
        if (q9s.w2()) {
            O(this, tMSMetaInfoWrapper, str, str2, null, 8, null);
        }
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            xoc.a.b(this);
        }
    }

    public void e0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ec4112", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, pl4.KEY_PAGE_ID);
        ckf.g(str2, "pageUrl");
        if (q9s.w2()) {
            bbs bbsVar = this.f13782a;
            O(this, bbsVar == null ? null : bbsVar.U(), str, str2, null, 8, null);
        }
    }

    public final void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97de7b69", new Object[]{this});
            return;
        }
        while (this.c.get() < 3 && !this.d.isEmpty()) {
            Pair<JSONObject, JSONObject> poll = this.d.poll();
            if (poll != null) {
                JSONObject first = poll.getFirst();
                JSONObject second = poll.getSecond();
                String string = first.getString("pageTraceId");
                String str = "";
                if (string == null) {
                    string = str;
                }
                String string2 = first.getString("requestTraceId");
                if (string2 != null) {
                    str = string2;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "requestParam", (String) poll.getSecond());
                xhv xhvVar = xhv.INSTANCE;
                mcs.e("Themis/Performance/Prefetch", "Send_Prefetch", string, str, jSONObject);
                a.a(Companion, this.f13782a, second, new d(first, this, poll, SystemClock.uptimeMillis()));
            }
        }
    }

    public final String h0(String str, b bVar) throws UnsupportedOperationException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d698750", new Object[]{this, str, bVar});
        }
        if (!wsq.O(str, "${", false, 2, null)) {
            return str;
        }
        return this.b.replace(str, new MTOPPrefetchExtension$translateTemplateParam$1(bVar, str));
    }

    @Override // tb.xoc
    public void v(ITMSPage iTMSPage) {
        String g;
        String k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b98aa9", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        if (q9s.w2() && (g = iTMSPage.getPageParams().e().g()) != null && (k = iTMSPage.getPageParams().e().k()) != null) {
            bbs bbsVar = this.f13782a;
            I(bbsVar == null ? null : bbsVar.U(), g, k, ncs.c(iTMSPage));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f13785a;
        public final Map<String, String> b;
        public final Uri c;

        static {
            t2o.a(848298021);
        }

        public b(String str) {
            ckf.g(str, "url");
            this.f13785a = str;
            this.b = ies.f(str, true);
            Uri g = ies.g(str);
            ckf.f(g, "parseUrl(url)");
            this.c = g;
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("68e7d20f", new Object[]{this, str});
            }
            ckf.g(str, "key");
            if (ckf.b(str, "url")) {
                return this.f13785a;
            }
            if (ckf.b(str, "queryParams")) {
                String query = this.c.getQuery();
                return query == null ? "" : query;
            } else if (!tsq.I(str, "queryParams.", false, 2, null)) {
                return "";
            } else {
                Map<String, String> map = this.b;
                String substring = str.substring(12);
                ckf.f(substring, "this as java.lang.String).substring(startIndex)");
                String str2 = map.get(substring);
                return str2 == null ? "" : str2;
            }
        }
    }

    public final List<JSONObject> z(List<DataPrefetch> list, String str, String str2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5b552abb", new Object[]{this, list, str, str2});
        }
        b bVar = new b(str2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (U(str, (DataPrefetch) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DataPrefetch dataPrefetch = (DataPrefetch) it.next();
            JSONObject jSONObject = null;
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "api", dataPrefetch.getApi());
                jSONObject2.put((JSONObject) "v", dataPrefetch.getV());
                jSONObject2.put((JSONObject) ICallService.KEY_NEED_LOGIN, (String) Boolean.valueOf(ckf.b(dataPrefetch.getNeedLogin(), "true")));
                JSONObject data = dataPrefetch.getData();
                jSONObject2.put((JSONObject) "data", (String) (data == null ? null : hbs.d(data, new MTOPPrefetchExtension$generateRequestParams$2$1$1(this, bVar))));
                JSONObject extHeaders = dataPrefetch.getExtHeaders();
                if (extHeaders != null && extHeaders.containsKey("prefetchTimeout")) {
                    i = extHeaders.get("prefetchTimeout");
                } else {
                    i = 10000;
                }
                jSONObject2.put((JSONObject) "prefetchTimeout", (String) i);
                JSONObject extHeaders2 = dataPrefetch.getExtHeaders();
                jSONObject2.put((JSONObject) "extHeaders", (String) (extHeaders2 == null ? null : hbs.d(extHeaders2, new MTOPPrefetchExtension$generateRequestParams$2$1$3(this, bVar))));
                jSONObject = jSONObject2;
            } catch (Throwable th) {
                TMSLogger.c("MTOPPrefetchExtension", th.getMessage(), th);
            }
            if (jSONObject != null) {
                arrayList2.add(jSONObject);
            }
        }
        return arrayList2;
    }

    public final boolean U(String str, DataPrefetch dataPrefetch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a77508ad", new Object[]{this, str, dataPrefetch})).booleanValue();
        }
        if (!ckf.b(dataPrefetch.getType(), "mtop")) {
            TMSLogger.b("MTOPPrefetchExtension", "type is not mtop");
            return false;
        } else if (dataPrefetch.getV() == null) {
            TMSLogger.b("MTOPPrefetchExtension", "v is null");
            return false;
        } else if (dataPrefetch.getApi() == null) {
            TMSLogger.b("MTOPPrefetchExtension", "api is null");
            return false;
        } else if (dataPrefetch.getPageId() == null) {
            TMSLogger.b("MTOPPrefetchExtension", "pageId is null");
            return false;
        } else {
            String pageId = dataPrefetch.getPageId();
            if (pageId != null) {
                for (String str2 : wsq.z0(pageId, new String[]{"&"}, false, 0, 6, null)) {
                    if (ckf.b(str, str2)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
