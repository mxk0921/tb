package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2PrefetchCacheModule;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveHomePageX;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.business.FeedListResponse;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.business.LiveListRequest;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.business.LiveListResponse;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.business.PageRequestCtr$RefreshType;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.business.PageRequestCtr$RequestScope;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.DinamicDataObject;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.HomeMainListData;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.TemplateObject;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p0h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String h = p0h.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public c f25791a;
    public lqc b;
    public JSONObject e;
    public b0h g;
    public final AtomicBoolean c = new AtomicBoolean(true);
    public final Map<String, b> d = new HashMap();
    public long f = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopResponse f25792a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, MtopResponse mtopResponse, String str2) {
            super(str);
            this.f25792a = mtopResponse;
            this.b = str2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/business/LiveListBusiness$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = new String(this.f25792a.getBytedata());
            if (p0h.a(p0h.this) == null || !p0.i(p0h.a(p0h.this).f(), p0h.a(p0h.this).t(), this.b)) {
                kza.e(str);
            } else {
                kza.h(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public LiveListRequest f25793a;
        public boolean b;
        public PageRequestCtr$RequestScope c;
        public long d = 0;

        static {
            t2o.a(310378718);
        }

        public b(LiveListRequest liveListRequest, boolean z) {
            this.f25793a = liveListRequest;
            this.b = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f25795a;
        public final Object b;
        public boolean c = false;
        public final boolean d;
        public final long e;

        static {
            t2o.a(310378720);
        }

        public d(boolean z, Object obj, boolean z2, long j) {
            this.f25795a = z;
            this.b = obj;
            this.d = z2;
            this.e = j;
        }
    }

    static {
        t2o.a(310378716);
    }

    public static boolean P(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6054a61c", new Object[]{iArr})).booleanValue();
        }
        int i = 0;
        boolean z = false;
        for (int i2 : iArr) {
            if (i2 == 1) {
                i++;
            } else if (i2 > 1) {
                z = true;
            }
        }
        if (i != 2 || !z) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ b0h a(p0h p0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("5408bdc5", new Object[]{p0hVar});
        }
        return p0hVar.g;
    }

    public static /* synthetic */ void b(p0h p0hVar, RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d2a79f", new Object[]{p0hVar, remoteBusiness});
        } else {
            p0hVar.m(remoteBusiness);
        }
    }

    public static /* synthetic */ boolean c(p0h p0hVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("261587a7", new Object[]{p0hVar, mtopResponse})).booleanValue();
        }
        return p0hVar.w(mtopResponse);
    }

    public static /* synthetic */ d d(p0h p0hVar, MtopResponse mtopResponse, boolean z, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("b08021a1", new Object[]{p0hVar, mtopResponse, new Boolean(z), str, jSONObject});
        }
        return p0hVar.t(mtopResponse, z, str, jSONObject);
    }

    public static /* synthetic */ List e(p0h p0hVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("147463cf", new Object[]{p0hVar, obj});
        }
        return p0hVar.D(obj);
    }

    public static /* synthetic */ boolean f(p0h p0hVar, LiveListRequest liveListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de004b89", new Object[]{p0hVar, liveListRequest})).booleanValue();
        }
        return p0hVar.O(liveListRequest);
    }

    public static /* synthetic */ d g(p0h p0hVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("6aac6187", new Object[]{p0hVar, str, str2});
        }
        return p0hVar.y(str, str2);
    }

    public static /* synthetic */ void h(p0h p0hVar, MtopResponse mtopResponse, LiveListRequest liveListRequest, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68a49d2", new Object[]{p0hVar, mtopResponse, liveListRequest, str});
        } else {
            p0hVar.C(mtopResponse, liveListRequest, str);
        }
    }

    public static /* synthetic */ void i(p0h p0hVar, d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da18b441", new Object[]{p0hVar, dVar, str});
        } else {
            p0hVar.l(dVar, str);
        }
    }

    public static String v(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfee028a", new Object[]{inputStream});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public final void C(MtopResponse mtopResponse, LiveListRequest liveListRequest, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aae6a4a4", new Object[]{this, mtopResponse, liveListRequest, str});
        } else if (mtopResponse != null && mtopResponse.getBytedata() != null && liveListRequest != null && liveListRequest.s == 0) {
            Coordinator.postTask(new a("onCacheResponse", mtopResponse, str));
        }
    }

    public final List<IMTOPDataObject> D(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("158e11e4", new Object[]{this, obj});
        }
        if (!(obj instanceof FeedListResponse)) {
            return null;
        }
        FeedListResponse feedListResponse = (FeedListResponse) obj;
        if (feedListResponse.getData() != null) {
            return feedListResponse.getData().dataList;
        }
        return null;
    }

    public final MtopResponse E(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("4f92ad04", new Object[]{this, str, str2});
        }
        if (r(str) == null || 0 != r(str).s) {
            return null;
        }
        String z = z(str, str2);
        if (orq.a(z)) {
            return null;
        }
        MtopResponse mtopResponse = new MtopResponse();
        mtopResponse.setBytedata(z.getBytes());
        return mtopResponse;
    }

    public LiveListResponse J(MtopResponse mtopResponse, boolean z, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveListResponse) ipChange.ipc$dispatch("5db945ea", new Object[]{this, mtopResponse, new Boolean(z), jSONObject, str});
        }
        String str2 = (mtopResponse == null || mtopResponse.getBytedata() == null) ? null : new String(mtopResponse.getBytedata());
        if (!orq.a(str2)) {
            try {
                HomeMainListData homeMainListData = new HomeMainListData();
                LiveListResponse liveListResponse = new LiveListResponse();
                liveListResponse.setData(homeMainListData);
                if (jSONObject == null) {
                    jSONObject = JSON.parseObject(str2);
                }
                if (jSONObject != null) {
                    G(homeMainListData, jSONObject.getJSONObject("data"), z, str);
                }
                return liveListResponse;
            } catch (Exception e) {
                r0h.c(h, "responseConvert exp", e);
            }
        }
        return null;
    }

    public void K(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c490de", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }

    public void L(b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e78edcc", new Object[]{this, b0hVar});
        } else {
            this.g = b0hVar;
        }
    }

    public void M(lqc lqcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb14daeb", new Object[]{this, lqcVar});
        } else {
            this.b = lqcVar;
        }
    }

    public void N(String str, LiveListRequest liveListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2b5ba8", new Object[]{this, str, liveListRequest});
        } else if (!orq.a(str)) {
            ((HashMap) this.d).put(str, new b(liveListRequest, false));
        }
    }

    public final boolean O(LiveListRequest liveListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3170b76", new Object[]{this, liveListRequest})).booleanValue();
        }
        if (liveListRequest.s != 0 || !liveListRequest.mNeedCache) {
            return false;
        }
        return true;
    }

    public final JSONObject j(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9941a46b", new Object[]{this, str, new Long(j)});
        }
        JSONObject jSONObject = new JSONObject();
        if (p0.i("", this.g.t(), str)) {
            jSONObject.put("AB2025", (Object) this.g.t());
            if (nvs.r0()) {
                jSONObject.put("discoverRecentWatchCard", (Object) "true");
            } else {
                jSONObject.put("discoverRecentWatchCard", (Object) "false");
            }
        }
        jSONObject.put("realS", (Object) Long.valueOf(j));
        jSONObject.put("insertNatureCard", (Object) "true");
        if (nvs.h() && "subChannelFollow".equals(str)) {
            jSONObject.put("needFollowRecentWatch", (Object) "true");
        }
        if (nvs.M()) {
            jSONObject.put("newLiveStyle", (Object) "new");
        }
        if (nvs.v0()) {
            jSONObject.put("enableNewSmartCard", (Object) "true");
            jSONObject.put("newSmartUser", (Object) "true");
        }
        return jSONObject;
    }

    public final void k(JSONObject jSONObject, int i, JSONArray jSONArray, JSONArray jSONArray2, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156387ea", new Object[]{this, jSONObject, new Integer(i), jSONArray, jSONArray2, new Long(j), str});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("requestType", (Object) Integer.valueOf(i));
        jSONObject2.put("lastRefreshTime", (Object) Long.valueOf(j));
        jSONObject2.put("requestInterval", (Object) Long.valueOf((System.currentTimeMillis() - j) / 1000));
        jSONObject2.put("realExpoItemList", (Object) jSONArray2);
        b0h b0hVar = this.g;
        if (b0hVar != null && !p0.i(b0hVar.f(), this.g.t(), str)) {
            jSONObject.put("realExpoInfo", (Object) JSON.toJSONString(jSONObject2));
        }
        jSONObject2.put("realExpoItemList", (Object) jSONArray);
        jSONObject.put("realExpoInfoNew", (Object) JSON.toJSONString(jSONObject2));
    }

    public final void l(d dVar, String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398e07da", new Object[]{this, dVar, str});
        } else if (dVar != null && !orq.a(str) && (bVar = (b) ((HashMap) this.d).get(str)) != null) {
            try {
                if (dVar.f25795a) {
                    r0h.b(h, "feedList data is obtained successfully,doPostExecute start");
                    if (!dVar.d) {
                        if (!str.equals("subChannelFollow")) {
                            this.f = System.currentTimeMillis();
                        }
                        b0h b0hVar = this.g;
                        if (!(b0hVar == null || b0hVar.g() == null)) {
                            this.g.g().e = this.f;
                        }
                    }
                    lqc lqcVar = this.b;
                    if (lqcVar != null) {
                        PageRequestCtr$RequestScope pageRequestCtr$RequestScope = bVar.c;
                        PageRequestCtr$RequestScope pageRequestCtr$RequestScope2 = PageRequestCtr$RequestScope.FULLREFRESH;
                        if (pageRequestCtr$RequestScope == pageRequestCtr$RequestScope2) {
                            Object obj = dVar.b;
                            if (obj == null) {
                                lqcVar.h(str);
                            } else {
                                lqcVar.m((BaseOutDo) obj, dVar.d, str);
                            }
                        } else if (pageRequestCtr$RequestScope == PageRequestCtr$RequestScope.SECONDREFRESH) {
                            Object obj2 = dVar.b;
                            if (obj2 == null) {
                                lqcVar.h(str);
                            } else {
                                lqcVar.q((BaseOutDo) obj2, str);
                            }
                        } else {
                            lqcVar.k((BaseOutDo) dVar.b, str);
                        }
                        PageRequestCtr$RequestScope pageRequestCtr$RequestScope3 = bVar.c;
                        if (!(pageRequestCtr$RequestScope3 == PageRequestCtr$RequestScope.SECONDREFRESH || pageRequestCtr$RequestScope3 == pageRequestCtr$RequestScope2 || bVar.b)) {
                            bVar.b = dVar.c;
                        }
                        if (bVar.b) {
                            this.b.A(str);
                        }
                    }
                } else {
                    lqc lqcVar2 = this.b;
                    if (lqcVar2 != null) {
                        lqcVar2.u((String) dVar.b, str);
                    }
                }
                if (bVar.f25793a != null) {
                    bVar.d += dVar.e;
                }
                ((HashMap) this.d).put(str, bVar);
            } catch (Exception e) {
                r0h.c(h, "doPostExecute: exp", e);
            }
        }
    }

    public void n(String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff00c469", new Object[]{this, str});
        } else if (this.c.compareAndSet(true, false) && (bVar = (b) ((HashMap) this.d).get(str)) != null && bVar.f25793a != null && !orq.a(str)) {
            bVar.b = false;
            bVar.c = PageRequestCtr$RequestScope.FULLREFRESH;
            B(str);
            ((HashMap) this.d).put(str, bVar);
        }
    }

    public final String p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f16adce", new Object[]{this, str});
        }
        String str2 = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            str2 = v(inputStream);
            inputStream.close();
            return str2;
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public long q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecbec3cb", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public LiveListRequest r(String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveListRequest) ipChange.ipc$dispatch("7d728f6", new Object[]{this, str});
        }
        if (!orq.a(str) && (bVar = (b) ((HashMap) this.d).get(str)) != null) {
            return bVar.f25793a;
        }
        return null;
    }

    public final String s(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b847f1aa", new Object[]{this, str});
        }
        if (qw0.f() == 1) {
            str2 = "http://live-spare.alicdn.com/videoList/pre_videoList_jingxuan_0_" + TaoLiveHomePageX.getAppVersion(null);
        } else {
            str2 = "http://live-spare.alicdn.com/videoList/videoList_jingxuan_0_" + TaoLiveHomePageX.getAppVersion(null);
        }
        if (p0.i(this.g.f(), this.g.t(), str)) {
            return str2 + "_2025New_liveCard";
        }
        return str2 + "_withFollow";
    }

    public final d t(MtopResponse mtopResponse, boolean z, String str, JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("702f3f2e", new Object[]{this, mtopResponse, new Boolean(z), str, jSONObject});
        }
        try {
            LiveListResponse J = J(mtopResponse, z, jSONObject, str);
            if (!(J == null || J.getData() == null)) {
                J.mSubChannel = str;
                if (J.getData().dataList != null) {
                    i = J.getData().dataList.size();
                    J.mFeedListNum = i;
                }
                return new d(true, J, z, i);
            }
        } catch (Exception e) {
            r0h.c(h, "handle response exp.", e);
        }
        return new d(true, null, z, 0L);
    }

    public void u(String str, LiveListRequest liveListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfe5bddc", new Object[]{this, str, liveListRequest});
        } else {
            ((HashMap) this.d).put(str, new b(liveListRequest, false));
        }
    }

    public final boolean w(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34e031a3", new Object[]{this, mtopResponse})).booleanValue();
        }
        if (mtopResponse == null || !mtopResponse.isApiSuccess()) {
            return false;
        }
        return true;
    }

    public final void x(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24e5e13f", new Object[]{this, str});
            return;
        }
        b0h b0hVar = this.g;
        if (b0hVar == null || !p0.i(b0hVar.f(), this.g.t(), str)) {
            str2 = nwg.a(Globals.getApplication(), "live_flexalocal/discovery_video_list_new.json");
        } else {
            str2 = nwg.a(Globals.getApplication(), "live_flexalocal/discovery_video_list_new_single.json");
        }
        if (!orq.a(str2)) {
            MtopResponse mtopResponse = new MtopResponse();
            mtopResponse.setBytedata(str2.getBytes());
            l(t(mtopResponse, true, str, null), str);
        }
    }

    public final d y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("1dde9b66", new Object[]{this, str, str2});
        }
        b0h b0hVar = this.g;
        if (!(b0hVar == null || b0hVar.g() == null)) {
            this.g.g().d();
        }
        MtopResponse E = E(str, str2);
        if (E != null) {
            return t(E, false, str, null);
        }
        return null;
    }

    public final String z(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88d43628", new Object[]{this, str, str2});
        }
        if (orq.a(str)) {
            return null;
        }
        String s = s(str);
        p9m.e("tbLiveHome_query_cdn");
        if (v2s.o().s() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", s);
            dmc s2 = v2s.o().s();
            s2.a("tbLiveHome_query_cdn_" + str2, "Page_TaobaoLive", hashMap);
        }
        mbu.c("requestCdn", "firstRequest", s, "1.0", this.g);
        return p(s);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends AsyncTask<Void, Void, d> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b f25794a;
        public final String b;

        static {
            t2o.a(310378719);
        }

        public c(String str) {
            this.b = str;
            if (!orq.a(str)) {
                this.f25794a = (b) ((HashMap) p0h.this.d).get(str);
            }
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/business/LiveListBusiness$MtopRequestTask");
        }

        /* renamed from: b */
        public void onPostExecute(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b0c213c", new Object[]{this, dVar});
            } else {
                p0h.i(p0h.this, dVar, this.b);
            }
        }

        /* renamed from: a */
        public d doInBackground(Void... voidArr) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("8de1769e", new Object[]{this, voidArr});
            }
            mbu.b("homeMain_mtop_end", p0h.a(p0h.this));
            b bVar = this.f25794a;
            if (bVar == null) {
                return null;
            }
            RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) bVar.f25793a);
            p0h.b(p0h.this, build);
            MtopResponse syncRequest = build.syncRequest();
            if (p0h.c(p0h.this, syncRequest)) {
                mbu.d(ndv.UMB_FEATURE_REQUEST_SUCCESS, "firstRequest", syncRequest, p0h.a(p0h.this));
                d d = p0h.d(p0h.this, syncRequest, false, this.b, null);
                if (j5h.b(p0h.e(p0h.this, d.b))) {
                    if (p0h.f(p0h.this, this.f25794a.f25793a)) {
                        p9m.e("tbLiveHome_query_empty");
                        d = p0h.g(p0h.this, this.b, "empty");
                        if (d != null) {
                            return d;
                        }
                    } else if (!orq.a(this.b) && this.b.equals("subChannelFollow")) {
                        d.c = true;
                    }
                }
                if (this.f25794a.f25793a.needCache() && d != null) {
                    p0h.h(p0h.this, syncRequest, this.f25794a.f25793a, this.b);
                }
                return d;
            }
            mbu.d("requestError", "firstRequest", syncRequest, p0h.a(p0h.this));
            if (p0h.f(p0h.this, this.f25794a.f25793a)) {
                HashMap hashMap = new HashMap();
                if (syncRequest != null) {
                    hashMap.put("errorCode", syncRequest.getRetCode());
                    hashMap.put("errorMsg", syncRequest.getRetMsg());
                }
                p9m.g("tbLiveHome_query_error", hashMap);
                d g = p0h.g(p0h.this, this.b, "error");
                if (g != null) {
                    return g;
                }
            }
            if (syncRequest != null) {
                str = syncRequest.getRetCode();
            } else {
                str = "MTOP ERROR";
            }
            return new d(false, str, false, 0L);
        }
    }

    public void A(String str) {
        b bVar;
        LiveListRequest liveListRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c885ac", new Object[]{this, str});
        } else if (!orq.a(str) && (bVar = (b) ((HashMap) this.d).get(str)) != null && !bVar.b && bVar.f25793a != null) {
            c cVar = this.f25791a;
            if ((cVar == null || AsyncTask.Status.FINISHED == cVar.getStatus()) && (liveListRequest = bVar.f25793a) != null) {
                liveListRequest.s += liveListRequest.n;
                if (p0.i(this.g.f(), this.g.t(), str)) {
                    liveListRequest.n = 7L;
                } else {
                    liveListRequest.n = 20L;
                }
                liveListRequest.subChannelType = str;
                if (p0.i(this.g.f(), this.g.t(), str)) {
                    liveListRequest.moduleIndex += 7;
                } else {
                    liveListRequest.moduleIndex += 20;
                }
                liveListRequest.clientParam = j(str, bVar.d).toJSONString();
                liveListRequest.contentId = "";
                liveListRequest.subContentId = "";
                liveListRequest.mNeedCache = false;
                String str2 = liveListRequest.extendParams;
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        JSONObject parseObject = JSON.parseObject(str2);
                        PageRequestCtr$RefreshType pageRequestCtr$RefreshType = PageRequestCtr$RefreshType.MORE;
                        parseObject.put("requestType", (Object) Integer.valueOf(pageRequestCtr$RefreshType.type));
                        b0h b0hVar = this.g;
                        if (!(b0hVar == null || b0hVar.g() == null)) {
                            k(parseObject, pageRequestCtr$RefreshType.type, this.g.g().d, this.g.g().b, this.f, str);
                        }
                        liveListRequest.extendParams = parseObject.toJSONString();
                    }
                } catch (Exception unused) {
                }
                bVar.f25793a = liveListRequest;
                ((HashMap) this.d).put(str, bVar);
                bVar.c = PageRequestCtr$RequestScope.MOREINNER;
                this.f25791a = new c(str);
                I("loadMore", liveListRequest);
            }
        }
    }

    public final void B(String str) {
        JSONObject jSONObject;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f14468d", new Object[]{this, str});
            return;
        }
        mbu.c("requestBegin", UltronWeex2PrefetchCacheModule.MODULE_NAME, "videolist.cache", "1.0", this.g);
        b0h b0hVar = this.g;
        if (b0hVar == null || !p0.i(b0hVar.f(), this.g.t(), str)) {
            obj = kza.a();
            jSONObject = kza.e;
        } else {
            obj = kza.d();
            jSONObject = kza.d;
        }
        if (obj instanceof String) {
            MtopResponse mtopResponse = new MtopResponse();
            mtopResponse.setBytedata(((String) obj).getBytes());
            l(t(mtopResponse, true, str, jSONObject), str);
            mbu.c(ndv.UMB_FEATURE_REQUEST_SUCCESS, UltronWeex2PrefetchCacheModule.MODULE_NAME, "videolist.cache", "1.0", this.g);
            return;
        }
        x(str);
    }

    public final DinamicDataObject F(JSONObject jSONObject, String str) {
        TemplateObject template;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicDataObject) ipChange.ipc$dispatch("d6af89f3", new Object[]{this, jSONObject, str});
        }
        if (jSONObject == null) {
            return null;
        }
        DinamicDataObject dinamicDataObject = new DinamicDataObject();
        p0b p0bVar = new p0b();
        p0bVar.h(this.g.t());
        dinamicDataObject.dxUserContext = p0bVar;
        p0bVar.i(str);
        dinamicDataObject.type = jSONObject.getString("type");
        dinamicDataObject.templateName = jSONObject.getString(yh6.CONFIG_KEY_TEMPLATE_NAME);
        dinamicDataObject.uniqueId = jSONObject.getString("uniqueID");
        if (jSONObject.get("noLeftRightSpace") != null) {
            dinamicDataObject.noLeftRightSpace = jSONObject.getBoolean("noLeftRightSpace").booleanValue();
        }
        if (!TextUtils.isEmpty(dinamicDataObject.templateName) && (template = this.g.q().getTemplate(dinamicDataObject.templateName)) != null) {
            dinamicDataObject.span = template.span;
        }
        HashMap<String, JSONObject> hashMap = new HashMap<>(1);
        dinamicDataObject.data = hashMap;
        hashMap.put("data", jSONObject);
        return dinamicDataObject;
    }

    public void H(String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4183936a", new Object[]{this, str});
        } else if (!orq.a(str) && (bVar = (b) ((HashMap) this.d).get(str)) != null && bVar.f25793a != null) {
            c cVar = this.f25791a;
            if (cVar == null || AsyncTask.Status.FINISHED == cVar.getStatus()) {
                bVar.b = false;
                bVar.c = PageRequestCtr$RequestScope.FULLREFRESH;
                lqc lqcVar = this.b;
                if (lqcVar != null) {
                    lqcVar.G1(bVar.f25793a);
                }
                LiveListRequest liveListRequest = bVar.f25793a;
                if (liveListRequest != null) {
                    liveListRequest.s = 0L;
                    if (p0.i(this.g.f(), this.g.t(), str)) {
                        liveListRequest.n = 7L;
                    } else {
                        liveListRequest.n = 20L;
                    }
                    liveListRequest.clientParam = j(str, 0L).toJSONString();
                    liveListRequest.subChannelType = str;
                    liveListRequest.moduleIndex = 0;
                    liveListRequest.contentId = "";
                    liveListRequest.subContentId = "";
                    liveListRequest.mNeedCache = false;
                    String str2 = liveListRequest.extendParams;
                    try {
                        if (!TextUtils.isEmpty(str2)) {
                            JSONObject parseObject = JSON.parseObject(str2);
                            PageRequestCtr$RefreshType pageRequestCtr$RefreshType = PageRequestCtr$RefreshType.PULL;
                            parseObject.put("requestType", (Object) Integer.valueOf(pageRequestCtr$RefreshType.type));
                            b0h b0hVar = this.g;
                            if (!(b0hVar == null || b0hVar.g() == null)) {
                                k(parseObject, pageRequestCtr$RefreshType.type, this.g.g().c, this.g.g().f19452a, this.f, str);
                            }
                            liveListRequest.extendParams = parseObject.toJSONString();
                        }
                    } catch (Exception unused) {
                    }
                    bVar.f25793a = liveListRequest;
                    bVar.d = 0L;
                    ((HashMap) this.d).put(str, bVar);
                    this.f25791a = new c(str);
                    I("pullToRefresh", liveListRequest);
                }
            }
        }
    }

    public void I(String str, LiveListRequest liveListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c998c9fc", new Object[]{this, str, liveListRequest});
        } else if (this.f25791a != null && liveListRequest != null) {
            r0h.b(h, "feedList Mtop request start");
            mbu.c("requestBegin", str, liveListRequest.API_NAME, liveListRequest.VERSION, this.g);
            this.f25791a.execute(new Void[0]);
        }
    }

    public final void m(RemoteBusiness remoteBusiness) {
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

    public final void G(HomeMainListData homeMainListData, JSONObject jSONObject, boolean z, String str) {
        DinamicDataObject F;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        DinamicDataObject F2;
        DinamicDataObject F3;
        JSONObject jSONObject3;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cae4e2e", new Object[]{this, homeMainListData, jSONObject, new Boolean(z), str});
        } else if (jSONObject != null) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("cardList");
            if (jSONArray2.size() == 3) {
                if (!z || (jSONObject3 = iza.f21660a) == null || jSONObject3.size() <= 0) {
                    JSONObject jSONObject4 = jSONArray2.getJSONObject(0);
                    JSONObject jSONObject5 = this.e;
                    if (jSONObject5 != null) {
                        jSONObject4.putAll(jSONObject5);
                        jSONObject4.put("isCache", (Object) String.valueOf(z));
                    }
                    if (!(jSONObject4 == null || (F3 = F(Q(jSONObject4), str)) == null || orq.a(F3.templateName))) {
                        F3.mIsCache = z;
                        homeMainListData.headData = F3;
                    }
                } else {
                    DinamicDataObject F4 = F(iza.f21660a, str);
                    if (F4 != null && !orq.a(F4.templateName)) {
                        F4.mIsCache = true;
                        homeMainListData.headData = F4;
                    }
                }
                JSONObject jSONObject6 = jSONArray2.getJSONObject(1);
                if (jSONObject6 != null) {
                    jSONObject6.put("isCache", (Object) String.valueOf(z));
                    homeMainListData.tabData = jSONObject6;
                }
                if (!z || (jSONArray = iza.b) == null || jSONArray.size() <= 0) {
                    JSONObject jSONObject7 = jSONArray2.getJSONObject(2);
                    if (jSONObject7 != null && jSONObject7.getJSONArray("cardData") != null) {
                        JSONArray jSONArray3 = jSONObject7.getJSONArray("cardData");
                        if (!z && (jSONObject2 = jSONObject7.getJSONObject("toastInfo")) != null) {
                            homeMainListData.toastInfo = jSONObject2;
                        }
                        if (jSONArray3 != null && jSONArray3.size() > 0) {
                            homeMainListData.dataList = new ArrayList();
                            while (i < jSONArray3.size()) {
                                JSONObject jSONObject8 = jSONArray3.getJSONObject(i);
                                JSONObject jSONObject9 = this.e;
                                if (jSONObject9 != null) {
                                    jSONObject8.putAll(jSONObject9);
                                    jSONObject8.put("isCache", (Object) String.valueOf(z));
                                }
                                if (!(jSONObject8 == null || (F = F(jSONObject8, str)) == null || orq.a(F.templateName))) {
                                    F.mIsCache = z;
                                    homeMainListData.dataList.add(F);
                                }
                                i++;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                homeMainListData.dataList = new ArrayList();
                while (i < iza.b.size()) {
                    JSONObject jSONObject10 = iza.b.getJSONObject(i);
                    if (!(jSONObject10 == null || (F2 = F(jSONObject10, str)) == null || orq.a(F2.templateName))) {
                        F2.mIsCache = true;
                        homeMainListData.dataList.add(F2);
                    }
                    i++;
                }
            }
        }
    }

    public final JSONObject Q(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d10db0c", new Object[]{this, jSONObject});
        }
        if (!nvs.w0()) {
            return jSONObject;
        }
        new JSONArray();
        new JSONArray();
        if (jSONObject != null) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("cardTypes");
            JSONArray jSONArray4 = jSONObject.getJSONArray("cardData");
            if (nvs.v0() && jSONArray3 != null && jSONArray3.indexOf("liveSmartIsLandCard") >= 0 && jSONArray4.size() >= jSONArray3.size()) {
                int indexOf = jSONArray3.indexOf("liveSmartIsLandCard");
                JSONObject jSONObject2 = jSONArray4.getJSONObject(jSONArray3.indexOf("liveSmartIsLandCard"));
                if (jSONObject2 != null && (jSONObject2.get("newSmartIsland") instanceof String) && "true".equals(jSONObject2.getString("newSmartIsland")) && (jSONArray = jSONObject2.getJSONArray("cardData")) != null) {
                    int size = jSONArray.size();
                    if (size == 2 || size == 3) {
                        int[] iArr = new int[3];
                        int i = 0;
                        while (true) {
                            if (i >= jSONArray.size()) {
                                z = false;
                                break;
                            }
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                            if (jSONObject3 != null && (jSONObject3.get("resourceSmartCardMultiShowConfig") instanceof JSONArray) && (jSONArray2 = jSONObject3.getJSONArray("resourceSmartCardMultiShowConfig")) != null && jSONArray2.size() > 0) {
                                if (size == 2 && jSONArray2.size() < 2) {
                                    z = true;
                                    break;
                                } else if (size == 3) {
                                    iArr[i] = jSONArray2.size();
                                }
                            }
                            i++;
                        }
                        if (size == 3) {
                            z = !P(iArr);
                        }
                    }
                    if (z) {
                        jSONArray4.remove(indexOf);
                        jSONArray3.remove(indexOf);
                        jSONObject.put("cardData", (Object) jSONArray4);
                        jSONObject.put("cardTypes", (Object) jSONArray3);
                    }
                }
            }
        }
        return jSONObject;
    }

    public void o(boolean z, String str) {
        b bVar;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25bccad3", new Object[]{this, new Boolean(z), str});
        } else if (!orq.a(str) && (bVar = (b) ((HashMap) this.d).get(str)) != null && bVar.f25793a != null && !orq.a(str)) {
            bVar.b = false;
            if (z) {
                bVar.c = PageRequestCtr$RequestScope.SECONDREFRESH;
            } else {
                bVar.c = PageRequestCtr$RequestScope.FULLREFRESH;
            }
            lqc lqcVar = this.b;
            if (lqcVar != null) {
                lqcVar.G1(bVar.f25793a);
            }
            c cVar = this.f25791a;
            if (cVar != null) {
                cVar.cancel(true);
            }
            LiveListRequest liveListRequest = bVar.f25793a;
            if (str.equals("all")) {
                liveListRequest.mNeedCache = true;
            } else {
                liveListRequest.mNeedCache = false;
            }
            liveListRequest.s = 0L;
            if (p0.i(this.g.f(), this.g.t(), str)) {
                liveListRequest.n = 7L;
            } else {
                liveListRequest.n = 20L;
            }
            liveListRequest.clientParam = j(str, 0L).toJSONString();
            liveListRequest.subChannelType = str;
            liveListRequest.moduleIndex = 0;
            String str2 = liveListRequest.extendParams;
            try {
                if (!TextUtils.isEmpty(str2)) {
                    JSONObject parseObject = JSON.parseObject(str2);
                    PageRequestCtr$RefreshType pageRequestCtr$RefreshType = PageRequestCtr$RefreshType.ENTER;
                    parseObject.put("requestType", (Object) Integer.valueOf(pageRequestCtr$RefreshType.type));
                    b0h b0hVar = this.g;
                    if (!(b0hVar == null || b0hVar.g() == null)) {
                        int i = pageRequestCtr$RefreshType.type;
                        if (z) {
                            jSONArray = this.g.g().d;
                        } else {
                            jSONArray = this.g.g().c;
                        }
                        if (z) {
                            jSONArray2 = this.g.g().b;
                        } else {
                            jSONArray2 = this.g.g().f19452a;
                        }
                        k(parseObject, i, jSONArray, jSONArray2, this.g.g().e, str);
                    }
                    liveListRequest.extendParams = parseObject.toJSONString();
                }
            } catch (Exception unused) {
            }
            bVar.f25793a = liveListRequest;
            bVar.d = 0L;
            ((HashMap) this.d).put(str, bVar);
            this.f25791a = new c(str);
            I("firstRequest", liveListRequest);
            mbu.b("homeMain_mtop_start", this.g);
        }
    }
}
