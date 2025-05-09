package com.taobao.taolive.sdk.playcontrol.observe;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.c4o;
import tb.cwd;
import tb.d4s;
import tb.nt1;
import tb.qvs;
import tb.shi;
import tb.t2o;
import tb.v2s;
import tb.yj4;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RoomPlayerObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RoomPlayerObserver";

    /* renamed from: a  reason: collision with root package name */
    public final String f13297a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;
    public String q;
    public String r;
    public JSONObject s;
    public final List<RoomPlayerEvent> t = new ArrayList();
    public final List<RoomPlayerEvent> u = new ArrayList();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface CommonRoomEventType {
        public static final String COMPONENT_DID_APPEAR = "componentDidAppear";
        public static final String COMPONENT_DID_DISAPPEAR = "componentDidDisappear";
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface CommonRoomPlayerEventType {
        public static final String BACKGROUND_MUTE = "backgroundMute";
        public static final String CHANGE_MUTE = "changeMute";
        public static final String ENTER_BACKGROUND = "enterBackground";
        public static final String FORCE_PLAYER_PLAY = "forcePlayerPlay";
        public static final String GET_LIVE_DETAIL_FAILED = "getLiveDetailFailed";
        public static final String GET_LIVE_DETAIL_SUCCESS = "getLiveDetailSuccess";
        public static final String PLAYER_CORE_CREATE = "playerCoreCreate";
        public static final String PLAYER_CORE_DESTROY = "playerCoreDestroy";
        public static final String PLAYER_CORE_RECREATE = "playerCoreRecreate";
        public static final String PLAYER_FIRST_FRAME = "playerFirstFrame";
        public static final String PLAYER_INIT = "playerCreate";
        public static final String PLAYER_PAUSE = "playerPause";
        public static final String PLAYER_RESUME = "playerResume";
        public static final String PM_REFRESH_PLAY = "pmRefreshPlay";
        public static final String PM_SUBSCRIBE = "pmSubscribe";
        public static final String PM_UN_SUBSCRIBE = "pmUnSubscribe";
    }

    static {
        t2o.a(806356404);
        t2o.a(806356402);
    }

    public RoomPlayerObserver(String str) {
        this.f13297a = str;
    }

    public void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba25e0f1", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae7a3da", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f254cf", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2958effa", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a47c3e", new Object[]{this, str});
        } else if (m()) {
            this.i = str;
            this.f = shi.a(str);
        }
    }

    public void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f4074a", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void G(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc9729f", new Object[]{this, jSONObject});
        } else {
            this.s = jSONObject;
        }
    }

    public void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd745584", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba1fb82", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6837000", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf46ca5", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public void L(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d7e47d", new Object[]{this, str, str2});
        } else if (m()) {
            n("warmupStart");
            this.r = str2;
            this.q = str;
            b(new RoomPlayerEvent("WarmupStart", System.currentTimeMillis()));
        }
    }

    public void M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f90fc44", new Object[]{this, str});
        } else if (m()) {
            n(str);
            c(new RoomPlayerEvent(str, System.currentTimeMillis()));
        }
    }

    public void N(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee58556d", new Object[]{this, str, jSONObject});
        } else if (m()) {
            n(str);
            RoomPlayerEvent roomPlayerEvent = new RoomPlayerEvent(str, System.currentTimeMillis());
            if (jSONObject != null && !jSONObject.isEmpty()) {
                roomPlayerEvent.userAction = jSONObject;
            }
            b(roomPlayerEvent);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a426de3", new Object[]{this, str});
        } else {
            N(str, null);
        }
    }

    public final void b(RoomPlayerEvent roomPlayerEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e004ac12", new Object[]{this, roomPlayerEvent});
        } else {
            ((ArrayList) this.t).add(roomPlayerEvent);
        }
    }

    public final void c(RoomPlayerEvent roomPlayerEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885ede18", new Object[]{this, roomPlayerEvent});
        } else {
            ((ArrayList) this.u).add(roomPlayerEvent);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77bce860", new Object[]{this});
        } else if (m() && !this.o) {
            this.o = true;
            n("componentCreate");
            c(new RoomPlayerEvent("componentCreate", System.currentTimeMillis()));
            v();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e61244", new Object[]{this});
        } else if (m() && this.o) {
            this.o = false;
            n("componentDestroy");
            c(new RoomPlayerEvent("componentDestroy", System.currentTimeMillis()));
            u();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436c8bad", new Object[]{this});
        } else if (this.o) {
            a(CommonRoomPlayerEventType.ENTER_BACKGROUND);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1a8d42", new Object[]{this});
        } else if (m() && this.o) {
            n("enterForeground");
            c(new RoomPlayerEvent("enterForeground", System.currentTimeMillis()));
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f74387", new Object[]{this});
        } else {
            a(CommonRoomPlayerEventType.FORCE_PLAYER_PLAY);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6738ef7", new Object[]{this});
        } else {
            a(CommonRoomPlayerEventType.GET_LIVE_DETAIL_FAILED);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3ac4b7", new Object[]{this});
        } else {
            a(CommonRoomPlayerEventType.GET_LIVE_DETAIL_SUCCESS);
        }
    }

    public void l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70841e4c", new Object[]{this, jSONObject});
        } else if (m()) {
            n("getRecommendSuccess");
            RoomPlayerEvent roomPlayerEvent = new RoomPlayerEvent("getRecommendSuccess", System.currentTimeMillis());
            roomPlayerEvent.userAction = jSONObject;
            c(roomPlayerEvent);
        }
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        return d4s.e("enableRoomPlayerObserver2", true);
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else if (v2s.o().A() != null) {
            cwd A = v2s.o().A();
            A.a(TAG, this.f13297a + " - " + str);
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c9c415", new Object[]{this, new Integer(i)});
        } else if (m()) {
            n(MonitorMediaPlayer.mornitorPlayerError);
            RoomPlayerEvent roomPlayerEvent = new RoomPlayerEvent(MonitorMediaPlayer.mornitorPlayerError, System.currentTimeMillis());
            roomPlayerEvent.errCode = i;
            b(roomPlayerEvent);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7e14be5", new Object[]{this});
        } else {
            a(CommonRoomPlayerEventType.PLAYER_FIRST_FRAME);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbeaf19c", new Object[]{this});
        } else {
            a(CommonRoomPlayerEventType.PLAYER_PAUSE);
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d27ff5", new Object[]{this});
        } else {
            a(CommonRoomPlayerEventType.PLAYER_RESUME);
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("692601ec", new Object[]{this});
            return;
        }
        Map<String, String> i = i("componentDestroy");
        JSONArray parseArray = JSON.parseArray(JSON.toJSONString(this.u));
        JSONArray jSONArray = nt1.k;
        if (jSONArray != null && !jSONArray.isEmpty()) {
            parseArray.addAll(jSONArray);
        }
        i.put("roomEvents", Uri.encode(parseArray.toJSONString()));
        new StringBuilder("sendComponentDestroy = ").append(i.toString());
        if (v2s.o().E() != null) {
            v2s.o().E().track4Click(yj4.STAIN_TRACK_PAGE, "lpm_player_monitor", i);
        }
        jSONArray.clear();
        ((ArrayList) this.u).clear();
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24025114", new Object[]{this});
            return;
        }
        Map<String, String> i = i("componentCreate");
        new StringBuilder("componentCreate = ").append(i.toString());
        if (v2s.o().E() != null) {
            v2s.o().E().track4Click(yj4.STAIN_TRACK_PAGE, "lpm_player_monitor", i);
        }
        ((ArrayList) this.t).clear();
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4542f38", new Object[]{this});
            return;
        }
        Map<String, String> i = i("playerDestroy");
        i.put("playEvents", Uri.encode(JSON.parseArray(JSON.toJSONString(this.t)).toJSONString()));
        new StringBuilder("sendPlayerDestroy = ").append(i.toString());
        if (v2s.o().E() != null) {
            v2s.o().E().track4Click(yj4.STAIN_TRACK_PAGE, "lpm_player_monitor", i);
        }
        ((ArrayList) this.t).clear();
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97336160", new Object[]{this});
            return;
        }
        Map<String, String> i = i("playerPlay");
        new StringBuilder("playerPlay = ").append(i.toString());
        i.put("playEvents", Uri.encode(JSON.parseArray(JSON.toJSONString(this.t)).toJSONString()));
        if (v2s.o().E() != null) {
            v2s.o().E().track4Click(yj4.STAIN_TRACK_PAGE, "lpm_player_monitor", i);
        }
        ((ArrayList) this.t).clear();
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f7c5b8", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8af44c8", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final Map<String, String> i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7682241", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("liveId", this.b);
        hashMap.put("liveComponentSession", this.f13297a);
        hashMap.put("liveSource", this.c);
        hashMap.put("liveScene", this.d);
        hashMap.put("entryLiveSource", this.e);
        hashMap.put("mediaFormat", this.f);
        hashMap.put("playerSession", this.g);
        hashMap.put("entrySpm", this.h);
        hashMap.put("mediaUrl", this.i);
        hashMap.put("playerViewToken", this.j);
        hashMap.put(yj4.PARAM_PLAY_MODE, this.k);
        hashMap.put("roomStatus", this.l);
        hashMap.put("streamStatus", this.m);
        hashMap.put(c4o.KEY_DATA_SOURCE, this.n);
        hashMap.put("action", str);
        hashMap.put("time", String.valueOf(System.currentTimeMillis()));
        if (!TextUtils.isEmpty(this.q)) {
            hashMap.put(yj4.WARMUP_PLAYER_TOKEN, this.q);
        }
        if (!TextUtils.isEmpty(this.r)) {
            hashMap.put("warmupLiveId", this.r);
        }
        if (qvs.X0()) {
            hashMap.put("isStandardPlay", String.valueOf(true));
        }
        return hashMap;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cdbde0", new Object[]{this});
        } else if (m() && this.p) {
            this.p = false;
            n("playerDestroy");
            b(new RoomPlayerEvent("playerDestroy", System.currentTimeMillis()));
            w();
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ede3bc", new Object[]{this});
        } else if (m() && !this.p) {
            this.p = true;
            n("playerPlay");
            RoomPlayerEvent roomPlayerEvent = new RoomPlayerEvent("playerPlay", System.currentTimeMillis());
            JSONObject jSONObject = this.s;
            if (jSONObject != null && !jSONObject.isEmpty()) {
                roomPlayerEvent.userAction = this.s;
            }
            b(roomPlayerEvent);
            x();
        }
    }
}
