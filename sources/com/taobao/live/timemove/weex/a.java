package com.taobao.live.timemove.weex;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.live.timemove.weex.TBLiveVideoRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.playcontrol.card.TBLOpenPlatformView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import tb.cpr;
import tb.cwd;
import tb.ehd;
import tb.fkx;
import tb.frr;
import tb.hbd;
import tb.l6s;
import tb.qlr;
import tb.rlr;
import tb.t2o;
import tb.t7d;
import tb.v2s;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a implements ehd, cpr.b, hbd, Handler.Callback, rlr, qlr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBLiveVideoRootView f10996a;
    public final Context b;
    public int c;
    public int d;
    public String e;
    public Handler f;
    public RecModel g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public TBLOpenPlatformView m;
    public JSONObject n;
    public String o;
    public boolean p;
    public String q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u = true;
    public final ArrayList<Integer> v = new ArrayList<>();
    public final t7d w;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.live.timemove.weex.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class C0582a implements TBLiveVideoRootView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0582a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
                return;
            }
            a.this.G();
            a.b(a.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements TBLiveVideoRootView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7606d219", new Object[]{this, new Integer(i)});
                return;
            }
            l6s.a("TBLiveNewNdView", "onVisibilityChanged from native " + i + " mLiveId:" + a.c(a.this));
            if (i != 0) {
                a.b(a.this);
            } else if (a.d(a.this) != null && a.e(a.this)) {
                a.f(a.this).callPareFireEvent("load");
                l6s.a("TBLiveNewNdView", "fireEvent EVENT_LOAD mLiveId:" + a.c(a.this));
            }
        }
    }

    static {
        t2o.a(779092240);
        t2o.a(779092239);
        t2o.a(806356196);
        t2o.a(806356197);
        t2o.a(806356528);
        t2o.a(806356527);
    }

    public a(Context context, int i, t7d t7dVar) {
        l6s.a("TBLiveNewNdView", "new TBLiveNewNdView " + this);
        this.b = context;
        this.w = t7dVar;
        com.android.tools.ir.runtime.a.a("com.taobao.taolive", null);
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202c4c76", new Object[]{aVar});
        } else {
            aVar.h();
        }
    }

    public static /* synthetic */ String c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d419162b", new Object[]{aVar});
        }
        return aVar.e;
    }

    public static /* synthetic */ TBLOpenPlatformView d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLOpenPlatformView) ipChange.ipc$dispatch("130ff95", new Object[]{aVar});
        }
        return aVar.m;
    }

    public static /* synthetic */ boolean e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e7ec857", new Object[]{aVar})).booleanValue();
        }
        return aVar.l;
    }

    public static /* synthetic */ t7d f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t7d) ipChange.ipc$dispatch("51fcc217", new Object[]{aVar});
        }
        return aVar.w;
    }

    public void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33df7fa", new Object[]{this, str});
            return;
        }
        l6s.a("TBLiveNewNdView", "JSMethod setMuted: " + str);
        try {
            this.p = Boolean.parseBoolean(str);
        } catch (Exception unused) {
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setMuted(this.p);
        }
    }

    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36fe8e6", new Object[]{this, str});
            return;
        }
        try {
            this.u = Boolean.parseBoolean(str);
            l6s.a("TBLiveNewNdView", "setNeedPM " + str + this);
        } catch (Exception unused) {
        }
    }

    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9558116", new Object[]{this, str});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setPMParams(str);
        }
    }

    public void D(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0994aaf", new Object[]{this, obj});
            return;
        }
        l6s.a("TBLiveNewNdView", "JSMethod setPageId: " + obj);
    }

    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846fd9a0", new Object[]{this, str});
            return;
        }
        this.q = str;
        w();
        l6s.a("TBLiveNewNdView", "setPoster " + str + this);
    }

    public void F(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf5f093", new Object[]{this, new Double(d)});
            return;
        }
        Context context = this.b;
        if (context != null) {
            this.c = (int) (context.getResources().getDisplayMetrics().density * d);
            TBLOpenPlatformView tBLOpenPlatformView = this.m;
            if (!(tBLOpenPlatformView == null || tBLOpenPlatformView.getLayoutParams() == null)) {
                this.m.getLayoutParams().width = this.c;
                this.m.invalidate();
            }
            l6s.a("TBLiveNewNdView", "setWidth value-" + d + " mWidth-" + this.c + " mLiveId:" + this.e + this);
        }
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (!this.s) {
            l6s.a("TBLiveNewNdView", "stop false mLiveId:" + this.e);
        } else {
            TBLOpenPlatformView tBLOpenPlatformView = this.m;
            if (tBLOpenPlatformView != null) {
                tBLOpenPlatformView.stopVideo();
            }
            l6s.a("TBLiveNewNdView", "stop mLiveId:" + this.e + this);
        }
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cefde8", new Object[]{this});
            return;
        }
        l6s.a("TBLiveNewNdView", "tryWarmPlayer mLiveId:" + this.e);
        if (this.m != null && frr.e()) {
            this.m.warmVideo();
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7257d3a", new Object[]{this});
            return;
        }
        l6s.a("TBLiveNewNdView", "unsubscribeAll");
        this.v.clear();
    }

    public void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17b8f3d", new Object[]{this, str});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.updatePMParams(str);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb80d819", new Object[]{this});
            return;
        }
        l6s.a("TBLiveNewNdView", "createVideoViewInner mLiveId:" + this.e + " mTBLOpenPlatformView = " + this.m);
        if (this.m == null) {
            TBLOpenPlatformView tBLOpenPlatformView = new TBLOpenPlatformView(this.b);
            this.m = tBLOpenPlatformView;
            tBLOpenPlatformView.setSubBusinessType("ND");
            this.m.setPlayVideo(true);
            this.m.setPageId(Integer.valueOf(this.b.hashCode()));
            this.m.setTBLiveOpenCardViewCallback(this);
            this.m.setPlayerCallback(this);
            this.m.setCloseSkipPlaySwitch(true);
            this.f10996a.addView(this.m, 0, new FrameLayout.LayoutParams(this.c, this.d));
        }
        this.m.setData(this.n);
        this.m.setMuted(this.p);
        w();
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670c847e", new Object[]{this});
            return;
        }
        Handler handler = this.f;
        if (handler != null) {
            handler.removeMessages(100);
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.stopSubscribePM();
        }
        this.t = false;
        l6s.a("TBLiveNewNdView", "destroyPM mLiveId:" + this.e);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 100) {
            n();
        }
        return false;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe8ec9a", new Object[]{this});
        } else if (this.g != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedId", (Object) this.g.liveId);
            jSONObject.put("liveUrlList", (Object) JSON.parseArray(JSON.toJSONString(this.g.liveUrlList)));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("roomStatus", (Object) "1");
            jSONObject2.put("queryParams", (Object) jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            this.n = jSONObject3;
            jSONObject3.put("playParams", (Object) jSONObject2);
            this.n.put("topic", (Object) this.g.topic);
            this.n.put("feed_id", (Object) this.g.liveId);
            this.n.put(z9u.KEY_ACCOUNT_ID, (Object) this.g.accountId);
            this.n.put("liveSource", (Object) "newdetail_2022");
            this.n.put("entry_source", (Object) "newdetail_2022");
            this.n.put("spm_url", (Object) "a2141.22412911");
            this.n.put("liveStatus", (Object) Integer.valueOf(this.g.roomStatus));
            this.n.put("playerScene", (Object) "NewDetailLive");
            RecModel.LiveInfo liveInfo = this.g.liveInfo;
            if (liveInfo != null) {
                this.n.put(z9u.KEY_ROOMTYPE, (Object) String.valueOf(liveInfo.roomType));
                this.n.put("newRoomType", (Object) String.valueOf(this.g.liveInfo.newRoomType));
                this.n.put("streamStatus", (Object) String.valueOf(this.g.liveInfo.streamStatus));
            }
            this.n.put("roomStatus", (Object) String.valueOf(this.g.roomStatus));
            this.n.put("trackInfo", (Object) this.g.trackInfo);
            this.n.put("liveServerParams", (Object) this.g.liveServerParams);
        }
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c97ea64", new Object[]{this});
        }
        if (this.m == null) {
            return "false";
        }
        return this.m.isMuted() + "";
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41c2c5d7", new Object[]{this});
        }
        l6s.a("TBLiveNewNdView", "getPlayerToken " + this.o + " mLiveId:" + this.e + this);
        return this.o;
    }

    public View l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        l6s.a("TBLiveNewNdView", "getView");
        return this.f10996a;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5c65aa1", new Object[]{this});
        }
        boolean z = this.t;
        l6s.a("TBLiveNewNdView", "ignorePV " + z + " mLiveId:" + this.e);
        h();
        return String.valueOf(z);
    }

    public final void n() {
        RecModel recModel;
        RecModel.LiveInfo liveInfo;
        int i;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ba114", new Object[]{this});
            return;
        }
        if (this.u && (recModel = this.g) != null && (liveInfo = recModel.liveInfo) != null && (i = liveInfo.roomStatus) == 1 && !this.h) {
            TBLOpenPlatformView tBLOpenPlatformView = this.m;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            tBLOpenPlatformView.startSubscribePM("NDLiveTab", z);
            this.m.addPowerMessageInterceptor(this);
            this.t = true;
            l6s.a("TBLiveNewNdView", "initPM mLiveId:" + this.e);
        }
        this.h = false;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff48d810", new Object[]{this});
            return;
        }
        l6s.a("TBLiveNewNdView", "onCreated mLiveId:" + this.e + this);
        Context context = this.b;
        if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
            ((Activity) this.b).getWindow().addFlags(128);
        }
        TBLiveVideoRootView tBLiveVideoRootView = (TBLiveVideoRootView) LayoutInflater.from(this.b).inflate(R.layout.taolive_nd_live_player_layout, (ViewGroup) null);
        this.f10996a = tBLiveVideoRootView;
        tBLiveVideoRootView.whenDetachedFromWindow(new C0582a());
        this.f10996a.whenVisibilityChanged(new b());
        this.f = new Handler(this);
        g();
        I();
    }

    @Override // tb.qlr
    public void onError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            return;
        }
        l6s.a("TBLiveNewNdView", "onError " + i + " mLiveId:" + this.e);
        if (this.j) {
            HashMap hashMap = new HashMap();
            hashMap.put("code", Integer.valueOf(i));
            hashMap.put("message", "");
            this.w.callPareFireEvent("error", hashMap);
            l6s.a("TBLiveNewNdView", "fireEvent EVENT_ERROR mLiveId:" + this.e);
        }
    }

    @Override // tb.qlr
    public void onInfo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44be144f", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.rlr
    public void onMediaError(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ee0aa", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        l6s.a("TBLiveNewNdView", "onError " + i + " mLiveId:" + this.e);
        if (this.j) {
            HashMap hashMap = new HashMap();
            hashMap.put("code", Integer.valueOf(i));
            hashMap.put("message", "");
            this.w.callPareFireEvent("error", hashMap);
            l6s.a("TBLiveNewNdView", "fireEvent EVENT_ERROR mLiveId:" + this.e);
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        l6s.a("TBLiveNewNdView", "resume mLiveId:" + this.e + this);
        u();
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d10508", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.playVideo();
            l6s.a("TBLiveNewNdView", "resumePlay mLiveId:" + this.e);
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50a00895", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setPlayerCover(this.q, R.drawable.tbliveuikit_nd_tab_bg);
        }
    }

    public void x(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde360e", new Object[]{this, new Double(d)});
            return;
        }
        Context context = this.b;
        if (context != null) {
            this.d = (int) (context.getResources().getDisplayMetrics().density * d);
            TBLOpenPlatformView tBLOpenPlatformView = this.m;
            if (!(tBLOpenPlatformView == null || tBLOpenPlatformView.getLayoutParams() == null)) {
                this.m.getLayoutParams().height = this.d;
                this.m.invalidate();
            }
            l6s.a("TBLiveNewNdView", "setWidth value-" + d + " mHeight-" + this.d + " mLiveId:" + this.e + this);
        }
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec12f01", new Object[]{this, str});
            return;
        }
        l6s.a("TBLiveNewNdView", "setMediaInfo: " + str);
        RecModel recModel = (RecModel) fkx.f(str, RecModel.class);
        this.g = recModel;
        if (recModel != null) {
            recModel.contentType = "simpleLive";
            recModel.mediaType = "live";
            this.e = recModel.liveId;
            i();
        }
    }

    public void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa9c5ec", new Object[]{this, str});
            return;
        }
        l6s.a("TBLiveNewNdView", "WXComponentProp setMuted: " + str);
        try {
            this.p = Boolean.parseBoolean(str);
        } catch (Exception unused) {
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setMuted(this.p);
        }
    }

    public void M(String str, String str2) {
        Handler handler;
        int i;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c4b75d", new Object[]{this, str, str2});
            return;
        }
        l6s.a("TBLiveNewNdView", "visibilityChanged from weex " + str + " mLiveId:" + this.e);
        try {
            z = Boolean.parseBoolean(str);
        } catch (Exception unused) {
        }
        if (z && (handler = this.f) != null) {
            handler.removeMessages(100);
            RecModel recModel = this.g;
            if (recModel != null && recModel.pmSubscriber && (i = recModel.subscriberDelay) >= 0) {
                this.f.sendEmptyMessageDelayed(100, i);
            }
        }
    }

    @Override // tb.hbd
    public boolean a(TLiveMsg tLiveMsg) {
        ArrayList<Integer> arrayList;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ca817c1", new Object[]{this, tLiveMsg})).booleanValue();
        }
        if (!(tLiveMsg == null || (arrayList = this.v) == null || !arrayList.contains(Integer.valueOf(tLiveMsg.type)))) {
            cwd A = v2s.o().A();
            A.a("TBLiveNewNdView", "onInterceptPowerMessage = " + JSON.toJSONString(tLiveMsg));
            switch (tLiveMsg.type) {
                case 10101:
                case 10103:
                case 10104:
                case 10105:
                    try {
                        str = JSON.toJSONString(tLiveMsg.data);
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                        str = "";
                        break;
                    }
                case 10102:
                default:
                    str = new String(tLiveMsg.data);
                    break;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("messageType", Integer.valueOf(tLiveMsg.type));
            hashMap.put("payload", str);
            this.w.callPareFireEvent("receivepm", hashMap);
        }
        return false;
    }

    @Override // tb.rlr
    public void onMediaInfo(long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5a2c6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
        } else if (((int) j) == 3) {
            l6s.a("TBLiveNewNdView", "onInfo MEDIA_INFO_VIDEO_RENDERING_START mLiveId:" + this.e);
            if (this.i) {
                this.w.callPareFireEvent("firstvideoframe");
            }
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efb0bc7", new Object[]{this});
            return;
        }
        l6s.a("TBLiveNewNdView", "onDispose mLiveId:" + this.e + this);
        Context context = this.b;
        if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
            ((Activity) this.b).getWindow().clearFlags(128);
        }
        Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.destroy();
            this.m = null;
        }
        h();
        this.h = false;
    }

    public void q(HashSet<String> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7615bd25", new Object[]{this, hashSet});
            return;
        }
        l6s.a("TBLiveNewNdView", "onUpdateEvents " + hashSet + this);
        if (hashSet != null) {
            Iterator<String> it = hashSet.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if ("error".equals(next)) {
                    this.j = true;
                } else if ("firstvideoframe".equals(next)) {
                    this.i = true;
                } else if ("pmmsg".equals(next)) {
                    this.k = true;
                } else if ("load".equals(next)) {
                    this.l = true;
                }
            }
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        l6s.a("TBLiveNewNdView", "play mLiveId:" + this.e + this);
        this.s = true;
        s();
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("836d4c02", new Object[]{this});
            return;
        }
        l6s.a("TBLiveNewNdView", "playStreamUrl start mLiveId:" + this.e);
        if (this.r) {
            this.r = false;
            l6s.a("TBLiveNewNdView", "playStreamUrl mReusePlayer mLiveId:" + this.e);
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.playVideo();
            this.o = this.m.getRecycleToken();
            l6s.a("TBLiveNewNdView", "playStreamUrl end mLiveId:" + this.e);
        }
    }

    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d5cb46", new Object[]{this, str});
            return;
        }
        try {
            this.r = Boolean.parseBoolean(str);
        } catch (Exception unused) {
        }
        this.h = true;
        l6s.a("TBLiveNewNdView", "reusePlayer:" + str + " mLiveId:" + this.e);
    }

    public void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92621818", new Object[]{this, str});
            return;
        }
        l6s.a("TBLiveNewNdView", "subscribePM:" + str);
        if (str != null) {
            for (String str2 : str.split(",")) {
                Integer valueOf = Integer.valueOf(str2);
                if (!this.v.contains(valueOf)) {
                    this.v.add(valueOf);
                }
            }
        }
    }

    public void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d718009f", new Object[]{this, str});
            return;
        }
        l6s.a("TBLiveNewNdView", "unsubscribePM:" + str);
        if (str != null) {
            for (String str2 : str.split(",")) {
                this.v.remove(Integer.valueOf(str2));
            }
        }
    }

    @Override // tb.gtc
    public void onMessageReceived(int i, Object obj) {
        RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i == 1004) {
            RecModel recModel2 = this.g;
            if (recModel2 != null) {
                recModel2.roomStatus = 2;
                if (this.k) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("type", Integer.valueOf(i));
                    hashMap.put("message", "");
                    this.w.callPareFireEvent("pmmsg", hashMap);
                    l6s.a("TBLiveNewNdView", "fireEvent EVENT_PMMSG MSG_TYPE_LIVE_END mLiveId:" + this.e);
                }
            }
        } else if (i == 1006 && (recModel = this.g) != null) {
            recModel.roomStatus = 0;
            if (this.k) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", Integer.valueOf(i));
                hashMap2.put("message", "");
                this.w.callPareFireEvent("pmmsg", hashMap2);
                l6s.a("TBLiveNewNdView", "fireEvent EVENT_PMMSG MSG_TYPE_ANCHOR_LEAVE mLiveId:" + this.e);
            }
        }
    }
}
