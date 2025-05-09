package com.taobao.android.rtqpixelstreamingandroid;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.json.JSONObject;
import tb.f10;
import tb.hi9;
import tb.hpl;
import tb.r4p;
import tb.sc;
import tb.t2o;
import tb.w4j;
import tb.yaa;
import tb.yib;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PixelStreamingPreLoadService implements yib {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PixelStreamingPreLoadService j = new PixelStreamingPreLoadService();

    /* renamed from: a  reason: collision with root package name */
    public boolean f9314a = false;
    public MtopResponse b = null;
    public MtopResponse c = null;
    public long d = 0;
    public long e = 0;
    public d f = null;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9315a;

        public a(String str) {
            this.f9315a = str;
        }

        @Override // com.taobao.android.rtqpixelstreamingandroid.PixelStreamingPreLoadService.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1065913a", new Object[]{this});
                return;
            }
            RTQPixelStreaming.info("RTQPixelStreaming requestDispatchInfo success");
            PixelStreamingPreLoadService.this.h(this.f9315a);
            PixelStreamingPreLoadService.this.g = false;
        }

        @Override // com.taobao.android.rtqpixelstreamingandroid.PixelStreamingPreLoadService.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb4ba614", new Object[]{this});
                return;
            }
            RTQPixelStreaming.info("RTQPixelStreaming requestDispatchInfo failed");
            PixelStreamingPreLoadService.this.g = false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9316a;

        public b(String str) {
            this.f9316a = str;
        }

        @Override // com.taobao.android.rtqpixelstreamingandroid.PixelStreamingPreLoadService.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1065913a", new Object[]{this});
                return;
            }
            RTQPixelStreaming.info("RTQPixelStreaming requestGameUserInfo success");
            PixelStreamingPreLoadService.this.h(this.f9316a);
            PixelStreamingPreLoadService.this.h = false;
        }

        @Override // com.taobao.android.rtqpixelstreamingandroid.PixelStreamingPreLoadService.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb4ba614", new Object[]{this});
                return;
            }
            RTQPixelStreaming.info("RTQPixelStreaming requestGameUserInfo failed");
            PixelStreamingPreLoadService.this.h = false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void b();

        void c();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9317a;
        public String b;
        public String c;
        public final String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public boolean j = false;
        public boolean k = false;
        public String l = "dh_dressup";

        static {
            t2o.a(316669964);
        }

        public d(PixelStreamingPreLoadService pixelStreamingPreLoadService) {
            String str = "";
            this.f9317a = str;
            this.b = str;
            this.c = str;
            this.d = str;
            this.e = str;
            this.f = str;
            this.g = str;
            this.h = str;
            this.i = str;
            String genGameUUID = PixelStreamingNativeLib.genGameUUID();
            this.d = genGameUUID != null ? genGameUUID : str;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("46fdb4b7", new Object[]{this});
            }
            JSONObject b = b();
            if (b != null) {
                return b.toString();
            }
            return "";
        }

        public JSONObject b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("eec8a477", new Object[]{this});
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("init_bitrate", 1048576);
                jSONObject.put("min_bitrate", 1048576);
                jSONObject.put("max_bitrate", 8388608);
                jSONObject.put("keyframeInterval", 30000);
                jSONObject.put("changeRes", "720x1560");
                jSONObject.put("token", this.i);
                JSONObject c = c();
                if (c != null) {
                    jSONObject.put("data", c.toString());
                }
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57ad714b", new Object[]{this})).booleanValue();
            }
            if (this.f9317a.isEmpty() || this.b.isEmpty() || this.c.isEmpty() || this.e.isEmpty() || this.f.isEmpty() || this.g.isEmpty() || this.h.isEmpty() || this.i.isEmpty()) {
                return false;
            }
            return true;
        }

        public void f(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29db9078", new Object[]{this, mtopResponse});
            } else if (!this.k) {
                this.k = true;
                try {
                    JSONObject optJSONObject = mtopResponse.getDataJsonObject().optJSONObject("data");
                    if (optJSONObject == null) {
                        RTQPixelStreaming.info("RTQPixelStreaming parse user info null");
                        return;
                    }
                    RTQPixelStreaming.info("RTQPixelStreaming parse user info: " + optJSONObject.toString());
                    this.b = optJSONObject.optString(SimpleProfile.KEY_GENDER, "");
                    this.f9317a = optJSONObject.optString("avatarId", "");
                } catch (Exception e) {
                    RTQPixelStreaming.info("RTQPixelStreaming parse user info exception: " + e.toString());
                }
            }
        }

        public JSONObject c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("36ee0cfd", new Object[]{this});
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", sc.initView);
                jSONObject.put("from", "h5");
                HashMap hashMap = new HashMap();
                hashMap.put("platformSessionId", this.h);
                hashMap.put("userId", this.c);
                jSONObject.put("info", hashMap);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("redundancy", 2);
                jSONObject2.put("sid", this.e);
                jSONObject.put("options", jSONObject2);
                jSONObject.put("timestamp", new Date().getTime());
                jSONObject.put("type", r4p.VALUE_BOT_SEARCH);
                jSONObject.put("uuid", this.d);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("x1", 0);
                jSONObject3.put("y1", 115);
                jSONObject3.put("x2", 720);
                jSONObject3.put("y2", 914);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("avatarId", this.f9317a);
                jSONObject4.put(SimpleProfile.KEY_GENDER, this.b);
                jSONObject4.put("position", jSONObject3);
                jSONObject4.put(hpl.VIEW_TYPE, this.l);
                jSONObject.put("data", jSONObject4);
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        public void e(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3aa79ce7", new Object[]{this, mtopResponse});
            } else if (!this.j) {
                this.j = true;
                try {
                    JSONObject optJSONObject = mtopResponse.getDataJsonObject().optJSONObject("data");
                    if (optJSONObject == null) {
                        RTQPixelStreaming.info("RTQPixelStreaming parse dispatch info null");
                        return;
                    }
                    RTQPixelStreaming.info("RTQPixelStreaming parse dispatch info: " + optJSONObject.toString());
                    optJSONObject.optString("connectionString", "");
                    this.g = optJSONObject.optString("fcLoginToken", "");
                    this.f = optJSONObject.optString("moqConnectionString", "");
                    this.h = optJSONObject.optString("sessionId", "");
                    this.e = optJSONObject.optString("sid", "");
                    this.i = optJSONObject.optString("token", "");
                    this.c = optJSONObject.optString("userId", "");
                } catch (Exception e) {
                    RTQPixelStreaming.info("RTQPixelStreaming parse dispatch info exception: " + e.toString());
                }
            }
        }
    }

    static {
        t2o.a(316669958);
        t2o.a(589299813);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aa81cb7", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
        this.d = 0L;
        this.e = 0L;
        this.f = null;
        this.i = true;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7834860", new Object[]{this})).booleanValue();
        }
        long time = new Date().getTime();
        if (this.b == null || time - this.d >= 20000) {
            return false;
        }
        return true;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71f757a1", new Object[]{this})).booleanValue();
        }
        long time = new Date().getTime();
        if (this.c == null || time - this.e >= 20000) {
            return false;
        }
        return true;
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "rtq_preload";
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e897b135", new Object[]{this, str});
            return;
        }
        if (this.f == null) {
            d dVar = new d(this);
            this.f = dVar;
            dVar.l = str;
        }
        MtopResponse mtopResponse = this.b;
        if (mtopResponse != null) {
            this.f.e(mtopResponse);
        }
        MtopResponse mtopResponse2 = this.c;
        if (mtopResponse2 != null) {
            this.f.f(mtopResponse2);
        }
        if (this.f.d() && !this.i) {
            RTQPixelStreaming.info("RTQPixelStreaming parsePreloadInfo success and startTransport");
            d dVar2 = this.f;
            PixelStreamingNativeLib.startTransport("preload_0000", dVar2.f, dVar2.a(), true, RTQPixelStreaming.disableRememberControlMessage, RTQPixelStreaming.enableSendFecStats, RTQPixelStreaming.disableAckNewConfig);
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbba45ec", new Object[]{this, str});
            return;
        }
        RTQPixelStreaming.info("RTQPixelStreaming begin preload game " + str);
        if (PixelStreamingJniHelper.hasValidTransport()) {
            RTQPixelStreaming.info("RTQPixelStreaming already has valid transport, so don't need preload");
            return;
        }
        this.i = false;
        if (!this.g && !this.h) {
            this.f = null;
            this.g = true;
            j(new a(str));
            this.h = true;
            k(new b(str));
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
        } else if (!this.f9314a) {
            this.f9314a = true;
            hi9 hi9Var = Mtop.getInstance(Mtop.Id.INNER).getMtopConfig().filterManager;
            if (hi9Var != null) {
                RTQPixelStreaming.info("RTQPixelStreaming filterManager.addBefore");
                ((f10) hi9Var).b(this);
            }
        }
    }

    @Override // tb.yib
    public String a(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8127648a", new Object[]{this, w4jVar});
        }
        if (w4jVar.d.reqSource != 1) {
            return "CONTINUE";
        }
        if (Objects.equals(w4jVar.b.getApiName(), "mtop.tmall.fc.cloud.rending.cd.dispatchservice")) {
            if (!f()) {
                return "CONTINUE";
            }
            w4jVar.c = this.b;
            RTQPixelStreaming.info("RTQPixelStreaming mtop.tmall.fc.cloud.rending.cd.dispatchservice use cache data");
            return "CONTINUE";
        } else if (!Objects.equals(w4jVar.b.getApiName(), "mtop.tmall.3dhuman.avatar.userinvite.queryuserentry") || !g()) {
            return "CONTINUE";
        } else {
            w4jVar.c = this.c;
            RTQPixelStreaming.info("RTQPixelStreaming mtop.tmall.3dhuman.avatar.userinvite.queryuserentry use cache data");
            return "CONTINUE";
        }
    }

    public final void k(final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e58e9d7", new Object[]{this, cVar});
            return;
        }
        Mtop instance = Mtop.getInstance(Mtop.Id.INNER);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.tmall.3dhuman.avatar.userinvite.queryuserentry");
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(true);
        MtopBusiness.build(instance, mtopRequest, yaa.f().g()).useWua().reqMethod(MethodEnum.POST).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.rtqpixelstreamingandroid.PixelStreamingPreLoadService.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    cVar.c();
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    PixelStreamingPreLoadService pixelStreamingPreLoadService = PixelStreamingPreLoadService.this;
                    pixelStreamingPreLoadService.c = mtopResponse;
                    pixelStreamingPreLoadService.e = new Date().getTime();
                    cVar.b();
                } catch (Exception unused) {
                    cVar.c();
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    cVar.c();
                }
            }
        }).startRequest();
    }

    public final void j(final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb6561a", new Object[]{this, cVar});
            return;
        }
        Mtop instance = Mtop.getInstance(Mtop.Id.INNER);
        JSONObject jSONObject = new JSONObject();
        MtopRequest mtopRequest = new MtopRequest();
        try {
            jSONObject.put("sceneId", "2022341256101");
            jSONObject.put(FluidException.SERVICE_NAME, "cGDispatchService");
            jSONObject.put("usePrefetch", false);
            jSONObject.put("extMap", "{\"getParamsOnly\":false}");
            mtopRequest.setApiName("mtop.tmall.fc.cloud.rending.cd.dispatchservice");
            mtopRequest.setVersion("1.0");
            mtopRequest.setNeedEcode(true);
            mtopRequest.setData(jSONObject.toString());
        } catch (Exception unused) {
        }
        MtopBusiness.build(instance, mtopRequest, yaa.f().g()).useWua().registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.rtqpixelstreamingandroid.PixelStreamingPreLoadService.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    cVar.c();
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    PixelStreamingPreLoadService pixelStreamingPreLoadService = PixelStreamingPreLoadService.this;
                    pixelStreamingPreLoadService.b = mtopResponse;
                    pixelStreamingPreLoadService.d = new Date().getTime();
                    cVar.b();
                } catch (Exception unused2) {
                    cVar.c();
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    cVar.c();
                }
            }
        }).startRequest();
    }
}
