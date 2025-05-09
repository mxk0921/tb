package tb;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.live.home.business.BaseListRequest;
import com.taobao.live.home.dinamic.business.FeedListResponse;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class ax1<ResponseBaseOutDo extends FeedListResponse, ItemClass extends IMTOPDataObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String i = ax1.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public BaseListRequest f16050a;
    public ax1<ResponseBaseOutDo, ItemClass>.c b;
    public w6d c;
    public boolean d = false;
    public boolean e = false;
    public final AtomicBoolean f = new AtomicBoolean(true);
    public boolean g = false;
    public boolean h = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopResponse f16051a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, MtopResponse mtopResponse) {
            super(str);
            this.f16051a = mtopResponse;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/business/BaseLiveListBusiness$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = new String(this.f16051a.getBytedata());
            String a2 = ax1.a(ax1.this);
            r0h.d(ax1.b(), "feedList Mtop response write cache");
            nwg.d(a2, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends AsyncTask<Void, Void, d> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355356);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/business/BaseLiveListBusiness$LocalCacheTask");
        }

        /* renamed from: a */
        public d doInBackground(Void... voidArr) {
            d d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("4530798", new Object[]{this, voidArr});
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            r0h.d(ax1.b(), "feedList localCache read start");
            ax1 ax1Var = ax1.this;
            MtopResponse p = ax1Var.p(ax1.c(ax1Var));
            if (p == null || (d = ax1.d(ax1.this, p)) == null) {
                r0h.b(ax1.b(), "feedList localCache data is NULL");
                return new d(false, null);
            }
            Object obj = d.b;
            if (obj != null) {
                ax1.this.t(obj);
            }
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            String b = ax1.b();
            r0h.b(b, "feedList localCache read success,spent time " + uptimeMillis2);
            return d;
        }

        /* renamed from: b */
        public void onPostExecute(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("149c5b4", new Object[]{this, dVar});
            } else if (dVar != null && dVar.f16054a) {
                ax1.e(ax1.this, dVar);
            }
        }

        public /* synthetic */ b(ax1 ax1Var, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c extends AsyncTask<Void, Void, d> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355357);
        }

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/business/BaseLiveListBusiness$RequestTask");
        }

        public final d a() {
            d d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("8c2db861", new Object[]{this});
            }
            r0h.b(ax1.b(), "RequestTask.bailoutDataRequest 请求失败，走打底数据");
            MtopResponse q = ax1.this.q();
            if (q == null || (d = ax1.d(ax1.this, q)) == null) {
                return null;
            }
            return d;
        }

        public final boolean d(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("34e031a3", new Object[]{this, mtopResponse})).booleanValue();
            }
            if (mtopResponse == null || !mtopResponse.isApiSuccess()) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public void onPostExecute(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("149c5b4", new Object[]{this, dVar});
            } else {
                ax1.e(ax1.this, dVar);
            }
        }

        public /* synthetic */ c(ax1 ax1Var, a aVar) {
            this();
        }

        public final void c(RemoteBusiness remoteBusiness) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c82eb0f3", new Object[]{this, remoteBusiness});
                return;
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put(p1t.kLiveMtopBizCodeKey, "TAOBAO");
            remoteBusiness.headers((Map<String, String>) hashMap);
            remoteBusiness.reqMethod(MethodEnum.POST);
            remoteBusiness.setBizId(47);
        }

        /* renamed from: b */
        public d doInBackground(Void... voidArr) {
            String str;
            String str2;
            d a2;
            d a3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("4530798", new Object[]{this, voidArr});
            }
            RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) ax1.c(ax1.this));
            c(build);
            ax1.this.x(false);
            ax1.this.w(false);
            long uptimeMillis = SystemClock.uptimeMillis();
            MtopResponse syncRequest = build.syncRequest();
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (syncRequest != null) {
                String b = ax1.b();
                r0h.b(b, "request [" + syncRequest.getApi() + "] spent time " + uptimeMillis2);
            }
            if (d(syncRequest)) {
                String b2 = ax1.b();
                r0h.d(b2, "feedList Mtop response success, response:" + syncRequest.getApi());
                if (ax1.c(ax1.this).needCache()) {
                    ax1.this.n(syncRequest);
                }
                d d = ax1.d(ax1.this, syncRequest);
                if (d == null) {
                    String b3 = ax1.b();
                    r0h.b(b3, "feedList Mtop response success, handle fail,response:" + syncRequest.toString());
                    m1h.a(m1h.MTOP_REQUEST, syncRequest.getApi(), "", "dataParse error");
                    if (ax1.f(ax1.this) && (a3 = a()) != null) {
                        return a3;
                    }
                } else {
                    String b4 = ax1.b();
                    r0h.d(b4, "feedList Mtop response dataParse start,apiName:" + syncRequest.getApi());
                    if (j5h.b(ax1.this.o(d.b))) {
                        String b5 = ax1.b();
                        r0h.b(b5, "feedList Mtop response dataParse NULL,response" + syncRequest.toString());
                        m1h.a(m1h.MTOP_REQUEST, syncRequest.getApi(), "", "返回的数据为0");
                        if (ax1.f(ax1.this)) {
                            d = a();
                            if (d != null) {
                                return d;
                            }
                        } else {
                            d.c = true;
                        }
                    }
                    m1h.b(m1h.MTOP_REQUEST, syncRequest.getApi());
                    return d;
                }
            } else {
                String b6 = ax1.b();
                StringBuilder sb = new StringBuilder("feedList Mtop response fail, response:");
                if (syncRequest == null) {
                    str = "response is NULL =";
                } else {
                    str = syncRequest.toString();
                }
                sb.append(str);
                r0h.b(b6, sb.toString());
                HashMap hashMap = new HashMap();
                if (syncRequest != null) {
                    hashMap.put("errorCode", syncRequest.getRetCode());
                    hashMap.put("errorMsg", syncRequest.getRetMsg());
                    String b7 = ax1.b();
                    r0h.b(b7, "MTOP : " + syncRequest.toString());
                } else {
                    hashMap.put("errorCode", "response is null");
                    hashMap.put("errorMsg", "response is null");
                    r0h.b(ax1.b(), "MTOP response is null");
                }
                s9m.c("taoliveFeedList", "mtopRequestError", hashMap);
                if (syncRequest != null) {
                    str2 = syncRequest.getApi();
                } else {
                    str2 = "";
                }
                m1h.a(m1h.MTOP_REQUEST, str2, "", "网络请求失败");
                if (ax1.f(ax1.this) && (a2 = a()) != null) {
                    return a2;
                }
            }
            String b8 = ax1.b();
            StringBuilder sb2 = new StringBuilder("MTOP ret:");
            String str3 = "MTOP ERROR";
            sb2.append(syncRequest != null ? syncRequest.getRetCode() : str3);
            r0h.b(b8, sb2.toString());
            if (syncRequest != null) {
                str3 = syncRequest.getRetCode();
            }
            return new d(false, str3);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f16054a;
        public final Object b;
        public boolean c = false;

        static {
            t2o.a(806355358);
        }

        public d(boolean z, Object obj) {
            this.f16054a = z;
            this.b = obj;
        }
    }

    static {
        t2o.a(806355354);
    }

    public static /* synthetic */ String a(ax1 ax1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccc91004", new Object[]{ax1Var});
        }
        return ax1Var.k();
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return i;
    }

    public static /* synthetic */ BaseListRequest c(ax1 ax1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseListRequest) ipChange.ipc$dispatch("60722820", new Object[]{ax1Var});
        }
        return ax1Var.f16050a;
    }

    public static /* synthetic */ d d(ax1 ax1Var, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("d7402ac7", new Object[]{ax1Var, mtopResponse});
        }
        return ax1Var.l(mtopResponse);
    }

    public static /* synthetic */ void e(ax1 ax1Var, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d2eecf", new Object[]{ax1Var, dVar});
        } else {
            ax1Var.h(dVar);
        }
    }

    public static /* synthetic */ boolean f(ax1 ax1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd23967", new Object[]{ax1Var})).booleanValue();
        }
        return ax1Var.A();
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47d6f5ec", new Object[]{this})).booleanValue();
        }
        if (this.f16050a.s == 0) {
            return true;
        }
        return false;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ax1<ResponseBaseOutDo, ItemClass>.c cVar = this.b;
        if (cVar != null) {
            cVar.cancel(true);
        }
        this.c = null;
    }

    public final void h(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df8fd60", new Object[]{this, dVar});
        } else if (dVar != null) {
            try {
                if (dVar.f16054a) {
                    r0h.d(i, "feedList data is obtained successfully,doPostExecute start");
                    w6d w6dVar = this.c;
                    if (w6dVar != null) {
                        if (this.e) {
                            w6dVar.onPageReload((BaseOutDo) dVar.b);
                        } else {
                            w6dVar.onPageReceived((BaseOutDo) dVar.b);
                        }
                        boolean onJudgeEnd = this.c.onJudgeEnd();
                        this.d = onJudgeEnd;
                        if (!this.e && !onJudgeEnd) {
                            this.d = dVar.c;
                        }
                        if (this.d) {
                            this.c.onPageEnd();
                            return;
                        }
                        return;
                    }
                    return;
                }
                w6d w6dVar2 = this.c;
                if (w6dVar2 != null) {
                    w6dVar2.onPageError((String) dVar.b);
                }
            } catch (Exception e) {
                r0h.c(i, "doPostExecute: exp", e);
            }
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0a0a470", new Object[]{this});
        } else if (this.f.compareAndSet(true, false)) {
            new b(this, null).execute(new Void[0]);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7528eeb", new Object[]{this});
            return;
        }
        BaseListRequest baseListRequest = this.f16050a;
        if (baseListRequest != null) {
            this.d = false;
            this.e = true;
            w6d w6dVar = this.c;
            if (w6dVar != null) {
                w6dVar.i1(baseListRequest);
            }
            if (this.f16050a.needCache() && e2h.m()) {
                i();
            }
            ax1<ResponseBaseOutDo, ItemClass>.c cVar = this.b;
            if (cVar != null) {
                cVar.cancel(true);
            }
            this.b = new c(this, null);
            r();
        }
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd6b6a27", new Object[]{this});
        }
        if (this.f16050a == null) {
            return "mtop_response_cache_default";
        }
        return "mtop_response_cache_" + moh.a(this.f16050a.toString());
    }

    public final d l(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("2091cf6", new Object[]{this, mtopResponse});
        }
        try {
            ResponseBaseOutDo s = s(mtopResponse);
            if (s == null || s.getData() == null) {
                if (z()) {
                    m1h.a(m1h.CDN_REQUEST, "", "", "cdn-data-none");
                    r0h.b(i, "feedList CDN response handle fail");
                }
                if (y()) {
                    r0h.b(i, "feedList localDefault data handle fail");
                }
                if (y()) {
                    return null;
                }
                m1h.a(m1h.FEEDLIST_REQUEST, "", "", "feedlist-data-none");
                return null;
            }
            if (z()) {
                m1h.b(m1h.CDN_REQUEST, "");
                r0h.d(i, "feedList CDN response handle success");
            }
            if (y()) {
                r0h.b(i, "feedList localDefault data handle success");
            }
            if (!y()) {
                m1h.b(m1h.FEEDLIST_REQUEST, "");
            }
            return new d(true, s);
        } catch (Exception e) {
            if (z()) {
                m1h.a(m1h.CDN_REQUEST, "", "", "cdn-responseConvert-fail");
            }
            if (!y()) {
                m1h.a(m1h.FEEDLIST_REQUEST, "", "", "cdn-responseConvert-fail");
            }
            r0h.c(i, "handle response exp.", e);
            return null;
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f65f062", new Object[]{this});
        } else if (!this.d && this.f16050a != null) {
            ax1<ResponseBaseOutDo, ItemClass>.c cVar = this.b;
            if (cVar == null || AsyncTask.Status.FINISHED == cVar.getStatus()) {
                this.e = false;
                w6d w6dVar = this.c;
                if (w6dVar != null) {
                    w6dVar.Q1(this.f16050a);
                }
                this.b = new c(this, null);
                r();
            }
        }
    }

    public void n(MtopResponse mtopResponse) {
        BaseListRequest baseListRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade2b5d0", new Object[]{this, mtopResponse});
        } else if (mtopResponse != null && mtopResponse.getBytedata() != null && (baseListRequest = this.f16050a) != null && baseListRequest.s == 0) {
            Coordinator.postTask(new a("onCacheResponse", mtopResponse));
        }
    }

    public abstract List<ItemClass> o(Object obj);

    public MtopResponse p(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("2761f7d0", new Object[]{this, baseListRequest});
        }
        if (baseListRequest == null || 0 != baseListRequest.s) {
            return null;
        }
        String k = k();
        String str = i;
        r0h.a(str, "read cache: " + k);
        Object b2 = nwg.b(k);
        if (!(b2 instanceof String)) {
            return null;
        }
        String str2 = (String) b2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        MtopResponse mtopResponse = new MtopResponse();
        mtopResponse.setBytedata(str2.getBytes());
        return mtopResponse;
    }

    public MtopResponse q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("6853ca18", new Object[]{this});
        }
        return null;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2436c28", new Object[]{this});
        } else if (this.b != null) {
            r0h.d(i, "feedList Mtop request start");
            this.b.execute(new Void[0]);
        }
    }

    public abstract ResponseBaseOutDo s(MtopResponse mtopResponse);

    public void t(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684c7dd9", new Object[]{this, obj});
        }
    }

    public void u(w6d w6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d014f3f2", new Object[]{this, w6dVar});
        } else {
            this.c = w6dVar;
        }
    }

    public void v(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5263df3c", new Object[]{this, baseListRequest});
        } else {
            this.f16050a = baseListRequest;
        }
    }

    public void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffad3285", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50edc005", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ba62375", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c52f02b1", new Object[]{this})).booleanValue();
        }
        return this.g;
    }
}
