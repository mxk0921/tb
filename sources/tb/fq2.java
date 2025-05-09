package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Base64;
import com.alibaba.ability.impl.nfc.NfcAbility;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.message_sdk.cdn.CDNMessage;
import com.taobao.taolive.message_sdk.cdn.CDNMessageResponse;
import com.taobao.taolive.message_sdk.cdn.mtopget.CDNMessageGetResponse;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fq2 extends yx1 implements e0c, b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public b3s c;
    public vp2 d;
    public Handler f;
    public long h;
    public int i;
    public HandlerThread e = null;
    public final Object g = new Object();
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final AtomicBoolean k = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/message_sdk/receive/CDNMessageReceive$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1000) {
                fq2.e(fq2.this);
                fq2.f(fq2.this);
            } else if (i == 1001) {
                fq2.f(fq2.this);
            }
        }
    }

    public fq2(c1h c1hVar, mtc mtcVar) {
        super(c1hVar, mtcVar);
        this.i = c1hVar.b.d;
    }

    public static /* synthetic */ void e(fq2 fq2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0d5ea", new Object[]{fq2Var});
        } else {
            fq2Var.h();
        }
    }

    public static /* synthetic */ void f(fq2 fq2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c604deb", new Object[]{fq2Var});
        } else {
            fq2Var.m();
        }
    }

    public static /* synthetic */ Object ipc$super(fq2 fq2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/message_sdk/receive/CDNMessageReceive");
    }

    @Override // tb.yx1
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886dbb1c", new Object[]{this});
            return;
        }
        this.k.set(true);
        k6s.a("fq2", "onAppInBackground, stopFetchCDNData");
        o();
    }

    @Override // tb.yx1
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111bbcb1", new Object[]{this});
            return;
        }
        this.k.set(false);
        k6s.a("fq2", "onAppInBackground, startFetchCDNData");
        n();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb03ab7e", new Object[]{this});
            return;
        }
        try {
            Handler handler = this.f;
            if (handler != null) {
                handler.removeMessages(1000);
                this.f.removeMessages(1001);
                this.f.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.e;
            if (handlerThread != null) {
                handlerThread.quit();
                this.e = null;
            }
        } catch (Exception e) {
            k6s.a("fq2", "Exception: " + ("destroyFetchCDNData" + e.toString()));
        }
    }

    public final void h() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa6fb64", new Object[]{this});
            return;
        }
        synchronized (this.g) {
            try {
                try {
                    if (this.c != null) {
                        long serverTime = v2s.o().C().getServerTime() / 1000;
                        long j = serverTime - this.f32401a.b.e;
                        long j2 = this.h;
                        long j3 = 0;
                        if (j2 > 0) {
                            j3 = Math.max(j, j2);
                        }
                        if (this.j.get()) {
                            b3s b3sVar = this.c;
                            a1h a1hVar = this.f32401a.b;
                            b3sVar.c(a1hVar.l + a1hVar.s);
                            str = this.f32401a.b.g;
                        } else {
                            this.c.c(this.f32401a.b.l);
                            str = this.f32401a.b.f;
                        }
                        String str2 = str + this.f32401a.e + "/" + j3 + "/" + serverTime;
                        if (this.f32401a.b.h) {
                            str2 = str2 + "?deviceId=" + this.f32401a.c;
                        }
                        k6s.b("fq2", "fetchCDNData ,isLongPull: " + this.j.get() + " ,URL: " + str2 + " ,lastPullTime: " + j3 + " ,currentTime: " + serverTime);
                        b3s b3sVar2 = this.c;
                        if (b3sVar2 != null) {
                            b3sVar2.b(str2, this.f32401a.e, String.valueOf(j3), String.valueOf(serverTime));
                        }
                    }
                } catch (Exception e) {
                    String str3 = "onError[parse]:" + e.toString();
                    k6s.a("fq2", "fetchCDNData Exception:" + str3);
                    w71.a(w71.MODULE_POINT_CDN_RECEIVE, w71.ERROR_CODE_DATA_ERROR, str3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(String str, String str2, String str3, String str4, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b45f0974", new Object[]{this, str, str2, str3, str4, obj});
            return;
        }
        try {
            if (this.j.get()) {
                this.j.set(false);
                Handler handler = this.f;
                if (handler != null) {
                    handler.removeMessages(1000);
                    this.f.sendEmptyMessageDelayed(1000, 1000L);
                }
            }
            String str5 = "onError:" + obj.toString() + " url " + str;
            w71.a(w71.MODULE_POINT_CDN_RECEIVE, w71.ERROR_CODE_LISTENER_ERROR, str5);
            j(11001, obj, str5);
            if (this.f32401a.a()) {
                c1h c1hVar = this.f32401a;
                if (c1hVar.b.i) {
                    if (this.d == null) {
                        this.d = new vp2(this, c1hVar.d);
                    }
                    this.d.r(str2, str3, str4);
                }
            }
        } catch (Exception e) {
            k6s.a("fq2", "Exception: " + ("onError" + e.toString()));
        }
    }

    public final void j(int i, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f1f747", new Object[]{this, new Integer(i), obj, str});
            return;
        }
        try {
            k6s.a("fq2", str);
            mtc mtcVar = this.b;
            if (mtcVar != null) {
                ((f1h) mtcVar).a(i, obj);
            } else {
                k6s.a("fq2", "onError[OnErrorListener is null]:" + this.f32401a.f16771a);
            }
        } catch (Exception e) {
            k6s.a("fq2", "Exception: " + ("onErrorLog" + e.toString()));
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9a9824", new Object[]{this});
        } else if (this.f != null) {
            k6s.a("fq2", "postFetchCDNData ,isLongPull: " + this.j.get());
            if (!this.j.get()) {
                this.f.removeMessages(1000);
                this.f.sendEmptyMessageDelayed(1000, this.i * 1000);
            }
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e50386", new Object[]{this});
            return;
        }
        Handler handler = this.f;
        if (handler != null) {
            handler.removeMessages(1000);
            this.f.removeMessages(1001);
        }
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        k6s.a("fq2", "onError[MtopGet]:" + i + " " + netResponse + " " + obj);
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        try {
            if (netBaseOutDo instanceof CDNMessageGetResponse) {
                l(((CDNMessageGetResponse) netBaseOutDo).getData(), netBaseOutDo.getApi(), false);
            }
        } catch (Exception unused) {
            k6s.a("fq2", "onError[MtopGet_parseData]:" + i + " " + netResponse + " " + obj);
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        k6s.a("fq2", "onError[MtopGet_onSystemError]:" + i + " " + netResponse + " " + obj);
    }

    public void p(zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417a7ade", new Object[]{this, zqiVar});
            return;
        }
        try {
            if (this.e == null) {
                HandlerThread handlerThread = new HandlerThread("CDN Message Thread");
                this.e = handlerThread;
                handlerThread.start();
                this.f = new a(this.e.getLooper());
                this.c = new b3s(this, this.f32401a.b.l);
                n();
            }
        } catch (Exception e) {
            k6s.a("fq2", "Exception: " + ("subscribe: " + e.toString()));
        }
    }

    public void q(zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e2fc97", new Object[]{this, zqiVar});
            return;
        }
        synchronized (this.g) {
            try {
                try {
                    g();
                    b3s b3sVar = this.c;
                    if (b3sVar != null) {
                        b3sVar.a();
                        this.c = null;
                    }
                    vp2 vp2Var = this.d;
                    if (vp2Var != null) {
                        vp2Var.i();
                        this.d = null;
                    }
                    this.b = null;
                } catch (Exception e) {
                    k6s.a("fq2", "Exception: " + (NfcAbility.API_UNSUBSCRIBE + e.toString()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(String str, String str2, String str3, String str4, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e6d1ef", new Object[]{this, str, str2, str3, str4, obj});
        } else if (!this.f32401a.a()) {
            String str5 = "onSuccess[" + this.f32401a.f16771a + "(cdn)]:" + obj;
            w71.a(w71.MODULE_POINT_CDN_RECEIVE, w71.ERROR_CODE_NO_RUNNING, str5);
            k6s.a("fq2", str5);
        } else {
            try {
                if (obj instanceof String) {
                    l(String.valueOf(obj), str, true);
                    w71.b(w71.MODULE_POINT_CDN_RECEIVE);
                } else {
                    String str6 = "onError[parse]:object instanceof String url " + str;
                    w71.a(w71.MODULE_POINT_CDN_RECEIVE, w71.ERROR_CODE_DATA_ERROR, str6);
                    j(11002, null, str6);
                }
            } catch (Exception e) {
                String str7 = "onError[parse]:" + e + " url " + str;
                w71.a(w71.MODULE_POINT_CDN_RECEIVE, w71.ERROR_CODE_DATA_ERROR, str7);
                j(11002, e, str7);
            }
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef4ffe6", new Object[]{this});
            return;
        }
        try {
            Handler handler = this.f;
            if (handler != null) {
                handler.removeMessages(1000);
                this.j.set(false);
                long serverTime = v2s.o().C().getServerTime() / 1000;
                long j = serverTime - this.i;
                k6s.a("fq2", "startFetchCDNData currentTime:" + serverTime + " ,cdnFetchMSGLast: " + j + " ,cdnFetchMSGIntervalService: " + this.i + " ,mLastPullTime: " + this.h + " ,(mLastPullTime - cdnFetchMSGLast):" + (this.h - j));
                long j2 = this.h;
                if (j2 <= 0 || j2 <= j) {
                    this.f.sendEmptyMessage(1000);
                } else {
                    this.f.sendEmptyMessageDelayed(1000, (j2 - j) * 1000);
                }
            }
        } catch (Exception e) {
            k6s.a("fq2", "Exception: " + ("startFetchCDNData" + e.toString()));
        }
    }

    public final void l(String str, String str2, boolean z) throws Exception {
        String str3;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594ac7bc", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        synchronized (this.g) {
            try {
                try {
                    k6s.a("fq2", "onSuccess[fetchCDNData]:" + str + " url " + str2);
                    CDNMessageResponse cDNMessageResponse = (CDNMessageResponse) JSON.parseObject(str, CDNMessageResponse.class);
                    JSONObject parseObject = JSON.parseObject(str);
                    if (z && parseObject.containsKey("endTime")) {
                        this.h = cDNMessageResponse.endTime;
                    }
                    if (parseObject.containsKey("pullInterval") && (i = cDNMessageResponse.pullInterval) > 0) {
                        this.i = i;
                    }
                    if (parseObject.containsKey("subTypeColorRate")) {
                        this.f32401a.h.d(cDNMessageResponse.subTypeColorRate);
                    }
                    if (parseObject.containsKey("pullPolicy")) {
                        if (cDNMessageResponse.pullPolicy.isEmpty()) {
                            if (this.j.get()) {
                                this.j.set(false);
                                Handler handler = this.f;
                                if (handler != null) {
                                    handler.removeMessages(1000);
                                    this.f.sendEmptyMessageDelayed(1000, 1000L);
                                }
                            }
                        } else if (!cDNMessageResponse.pullPolicy.equals("SHORT")) {
                            this.j.set(cDNMessageResponse.pullPolicy.equals("LONG") && !this.f32401a.b.j);
                        } else if (this.j.get()) {
                            this.j.set(false);
                            Handler handler2 = this.f;
                            if (handler2 != null) {
                                handler2.removeMessages(1001);
                                this.f.sendEmptyMessage(1001);
                            }
                        }
                        k6s.a("fq2", "parseData ,isLongPull: " + this.j.get());
                        if (this.j.get() && !this.k.get()) {
                            this.f.removeMessages(1000);
                            this.f.sendEmptyMessage(1000);
                        }
                    }
                    ArrayList<CDNMessage> arrayList = cDNMessageResponse.payloads;
                    if (arrayList == null || arrayList.isEmpty()) {
                        k6s.a("fq2", "onSuccess[Payloads is null]:" + this.f32401a.f16771a + " url " + str2);
                    } else {
                        Iterator<CDNMessage> it = cDNMessageResponse.payloads.iterator();
                        while (it.hasNext()) {
                            CDNMessage next = it.next();
                            TLiveMsg tLiveMsg = new TLiveMsg();
                            tLiveMsg.data = Base64.decode(next.getData(), 0);
                            tLiveMsg.type = next.getSubType();
                            tLiveMsg.bizCode = this.f32401a.d;
                            tLiveMsg.messageId = next.getMsgId();
                            c1h c1hVar = this.f32401a;
                            tLiveMsg.sendFullTags = c1hVar.h.c(c1hVar.c, next.getMsgId(), next.getSubType());
                            tLiveMsg.timestamp = next.getPushTime();
                            tLiveMsg.topic = next.getTopic();
                            int i2 = z ? 1 : 3;
                            if (z) {
                                str3 = "cdn";
                            } else {
                                str3 = "MTOP";
                            }
                            c1h c1hVar2 = this.f32401a;
                            c1hVar2.h.e(i2, str3, tLiveMsg, c1hVar2);
                            mtc mtcVar = this.b;
                            if (mtcVar != null) {
                                ((f1h) mtcVar).b(str3, tLiveMsg);
                            } else {
                                k6s.a("fq2", "onSuccess[OnErrorListener is null]:" + this.f32401a.f16771a + " " + tLiveMsg + " url " + str2);
                            }
                        }
                    }
                } catch (Exception e) {
                    k6s.a("fq2", "Exception: " + ("parseData" + e.toString()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
