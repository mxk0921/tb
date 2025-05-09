package tb;

import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.taolive.room.afccoldlunch.PreSimpleRequestParams;
import com.taobao.taolive.room.afccoldlunch.SimpleVideoInfo;
import com.taobao.taolive.room.afccoldlunch.simple.MtopTbliveRecommendVideoSimpleQueryResponse;
import com.taobao.taolive.room.afccoldlunch.simple.MtopTbliveRecommendVideoSimpleQueryResponseData;
import com.taobao.taolive.room.afccoldlunch.simple.MtopTbliveRecommendVideoSimpleQuerySafeResponse;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class znm implements lhb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = znm.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public Application f32895a;
    public String b;
    public wzc c;
    public qmr d;
    public boolean e;
    public boolean f;
    public boolean g;
    public volatile SimpleVideoInfo h;
    public List<g9c> i;
    public Handler j;
    public HandlerThread k;
    public Handler l;
    public ISmartLandingProxy.c m;
    public String n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (znm.b(znm.this) != null && znm.c(znm.this) != null) {
                znm.g("sendSuccess :" + znm.d(znm.this) + " " + znm.e(znm.this) + " " + znm.f(znm.this));
                for (g9c g9cVar : znm.b(znm.this)) {
                    g9cVar.b(znm.c(znm.this));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (znm.b(znm.this) != null) {
                znm.g("sendFail :" + znm.d(znm.this) + " " + znm.e(znm.this) + " " + znm.f(znm.this));
                for (g9c g9cVar : znm.b(znm.this)) {
                    g9cVar.a();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {
        public static final znm INSTANCE = new znm(null);

        static {
            t2o.a(779092783);
        }
    }

    static {
        t2o.a(779092780);
        t2o.a(806355973);
    }

    public /* synthetic */ znm(a aVar) {
        this();
    }

    public static /* synthetic */ List b(znm znmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c2d7e8ad", new Object[]{znmVar});
        }
        return znmVar.i;
    }

    public static /* synthetic */ SimpleVideoInfo c(znm znmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleVideoInfo) ipChange.ipc$dispatch("c46905ba", new Object[]{znmVar});
        }
        return znmVar.h;
    }

    public static /* synthetic */ boolean d(znm znmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("996fc960", new Object[]{znmVar})).booleanValue();
        }
        return znmVar.e;
    }

    public static /* synthetic */ boolean e(znm znmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ac158e1", new Object[]{znmVar})).booleanValue();
        }
        return znmVar.f;
    }

    public static /* synthetic */ boolean f(znm znmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c12e862", new Object[]{znmVar})).booleanValue();
        }
        return znmVar.g;
    }

    public static /* synthetic */ void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdec6286", new Object[]{str});
        } else {
            x(str);
        }
    }

    public static LiveItem.SpfPlayVideo j(SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem.SpfPlayVideo) ipChange.ipc$dispatch("85b31841", new Object[]{simpleVideoInfo});
        }
        if (simpleVideoInfo != null && !TextUtils.isEmpty(simpleVideoInfo.timeMovingSpfPlayVideo)) {
            return (LiveItem.SpfPlayVideo) fkx.f(simpleVideoInfo.timeMovingSpfPlayVideo, LiveItem.SpfPlayVideo.class);
        }
        return null;
    }

    public static znm k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (znm) ipChange.ipc$dispatch("99c9cde7", new Object[0]);
        }
        return c.INSTANCE;
    }

    public static MediaData m(SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("792d3f8e", new Object[]{simpleVideoInfo});
        }
        if (simpleVideoInfo == null) {
            return null;
        }
        MediaData mediaData = new MediaData();
        mediaData.liveUrlList = simpleVideoInfo.liveUrlList;
        mediaData.liveId = simpleVideoInfo.liveId;
        mediaData.anchorId = simpleVideoInfo.accountId;
        return mediaData;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2326bc6e", new Object[0])).booleanValue();
        }
        return zqq.c(q6f.c("TaoLive", "simpleLaunch", "isLiveRequestSmlData", "true"));
    }

    public static void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926938e6", new Object[]{str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str2 = TAG;
        sb.append(str2);
        sb.append("_");
        sb.append(str);
        sj9.D(sb.toString());
        Log.e("apm", str2 + "_InitTaoLiveColdLaunch_" + str);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        qmr qmrVar = this.d;
        if (qmrVar != null) {
            qmrVar.g();
            this.d = null;
        }
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = null;
        this.n = null;
        List<g9c> list = this.i;
        if (list != null) {
            list.clear();
            this.i = null;
        }
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.j = null;
        }
        HandlerThread handlerThread = this.k;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.k = null;
        }
        Handler handler2 = this.l;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.l = null;
        }
        this.b = null;
        this.f32895a = null;
        ISmartLandingProxy.c cVar = this.m;
        if (cVar != null) {
            cVar.destroy();
            this.m = null;
        }
    }

    public final JSONObject i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6f1f5f24", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("entrySpm", (Object) str);
        uc ucVar = new uc();
        jSONObject.put("isPad", (Object) Boolean.valueOf(ucVar.a(this.f32895a)));
        jSONObject.put("isFoldDevice", (Object) Boolean.valueOf(ucVar.b(this.f32895a)));
        jSONObject.put("switchIndex", (Object) "0");
        return jSONObject;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("570dc107", new Object[]{this});
        }
        return this.n;
    }

    public ISmartLandingProxy.c n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmartLandingProxy.c) ipChange.ipc$dispatch("e147b576", new Object[]{this});
        }
        return this.m;
    }

    @Override // tb.lhb
    public void onError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            return;
        }
        this.g = false;
        s();
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f0720c1", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public void q(Application application, wzc wzcVar, PreSimpleRequestParams preSimpleRequestParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("537e42ec", new Object[]{this, application, wzcVar, preSimpleRequestParams, str});
            return;
        }
        this.f32895a = application;
        this.b = str;
        this.c = wzcVar;
        w(preSimpleRequestParams, str);
    }

    public final void s() {
        List<g9c> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4154c84d", new Object[]{this});
        } else if (this.j != null && (list = this.i) != null && !list.isEmpty()) {
            this.j.post(new b());
        }
    }

    public final void t() {
        List<g9c> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f815e62", new Object[]{this});
        } else if (this.j != null && (list = this.i) != null && !list.isEmpty() && this.h != null) {
            this.j.post(new a());
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b76814f", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public znm() {
        this.e = false;
        this.f = false;
        this.g = false;
        this.i = new ArrayList();
        this.j = new Handler(Looper.getMainLooper());
    }

    @Override // tb.lhb
    public void a(NetResponse netResponse, NetBaseOutDo netBaseOutDo) {
        MtopTbliveRecommendVideoSimpleQueryResponseData data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4d2be6", new Object[]{this, netResponse, netBaseOutDo});
            return;
        }
        this.f = true;
        if (netBaseOutDo instanceof MtopTbliveRecommendVideoSimpleQuerySafeResponse) {
            this.h = ((MtopTbliveRecommendVideoSimpleQuerySafeResponse) netBaseOutDo).getData();
        } else if ((netBaseOutDo instanceof MtopTbliveRecommendVideoSimpleQueryResponse) && (data = ((MtopTbliveRecommendVideoSimpleQueryResponse) netBaseOutDo).getData()) != null) {
            this.h = data.model;
        }
        if (this.h != null) {
            this.g = true;
            sj9.C();
            x("simpleLiveDetailResponse " + this.h.liveId);
            r();
            t();
            return;
        }
        onError();
    }

    public final void r() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1361494", new Object[]{this});
        } else if (o() && this.h != null && !TextUtils.isEmpty(this.h.liveId) && !TextUtils.isEmpty(this.b) && d9m.E() != null) {
            Uri parse = Uri.parse(this.b);
            String str3 = null;
            if (parse == null || parse.isOpaque()) {
                str2 = null;
                str = null;
            } else {
                String queryParameter = parse.getQueryParameter("livesource");
                str2 = parse.getQueryParameter("spm");
                str = queryParameter;
            }
            this.b = this.b.replace("needRecommend=true", "id=" + this.h.liveId);
            x("requestSmlData " + this.h.liveId);
            if (pvs.G() && !TextUtils.isEmpty(this.h.timeMovingId)) {
                str3 = "TaoBaoHighLight";
            }
            this.m = d9m.E().createSmlDataManager(this.f32895a, "liveRoomPage", str3, str, str, this.h.liveId, this.h.accountId, this.b, this.h.holdItemIds, this.h.itemHoldType, this.h.dispatchItemID, i(str2), this.c);
        }
    }

    public boolean v(g9c g9cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("942078fa", new Object[]{this, g9cVar})).booleanValue();
        }
        x("setResponseListener :" + this.e + " " + this.f + " " + this.g);
        if (this.e) {
            if (this.f) {
                if (this.g) {
                    if (g9cVar != null) {
                        g9cVar.b(this.h);
                    }
                } else if (g9cVar != null) {
                    g9cVar.a();
                }
                return true;
            }
            List<g9c> list = this.i;
            if (list != null) {
                ((ArrayList) list).add(g9cVar);
                return true;
            }
        }
        return false;
    }

    public final void w(PreSimpleRequestParams preSimpleRequestParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5850", new Object[]{this, preSimpleRequestParams, str});
        } else if (preSimpleRequestParams == null) {
            x("params null");
        } else {
            qmr qmrVar = this.d;
            if (qmrVar != null) {
                qmrVar.g();
            }
            this.e = true;
            this.f = false;
            this.g = false;
            this.h = null;
            HandlerThread handlerThread = new HandlerThread("PreSimpleRequestLive");
            this.k = handlerThread;
            handlerThread.start();
            this.l = new Handler(this.k.getLooper());
            String d = rnv.d(preSimpleRequestParams.transParams, str);
            qmr qmrVar2 = new qmr(this.c);
            this.d = qmrVar2;
            qmrVar2.o(preSimpleRequestParams.needRecommend, preSimpleRequestParams.liveSource, preSimpleRequestParams.entryLiveSource, preSimpleRequestParams.feedId, preSimpleRequestParams.userId, preSimpleRequestParams.itemIds, preSimpleRequestParams.holdType, d);
            this.d.i(this);
            this.d.j(this.l);
            x("startSimpleRequest :" + preSimpleRequestParams.needRecommend + " " + preSimpleRequestParams.liveSource + " " + preSimpleRequestParams.entryLiveSource);
        }
    }
}
