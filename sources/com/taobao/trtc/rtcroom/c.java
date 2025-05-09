package com.taobao.trtc.rtcroom;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import anet.channel.util.ErrorConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.FailedBinderCallBack;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.login4android.api.Login;
import com.taobao.trtc.api.TrtcAudioDevice;
import com.taobao.trtc.api.TrtcConstants;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.call.ITrtcCallEngine;
import com.taobao.trtc.call.TrtcCallImpl;
import com.taobao.trtc.impl.PermissionActivity;
import com.taobao.trtc.rtcroom.TrtcWvPlugin;
import com.taobao.trtc.rtcroom.c;
import com.taobao.trtc.utils.TrtcForegroundService;
import com.taobao.trtc.utils.TrtcLog;
import com.uc.webview.base.cyclone.BSError;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.c3e;
import tb.cmu;
import tb.iu2;
import tb.nfs;
import tb.nmu;
import tb.qlu;
import tb.t2o;
import tb.tmu;
import tb.ucq;
import tb.vrf;
import tb.wmu;
import tb.xcq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c implements ITrtcCallEngine.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String v = c.class.getName();
    public static c w = null;

    /* renamed from: a  reason: collision with root package name */
    public h f13963a;
    public Application.ActivityLifecycleCallbacks b;
    public int c;
    public ITrtcCallEngine d;
    public qlu e;
    public nmu f;
    public Intent g;
    public TrtcWvPlugin k;
    public g m;
    public wmu n;
    public String q;
    public String r;
    public String s;
    public boolean h = false;
    public boolean i = false;
    public int j = -1;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final Object o = new Object();
    public int p = 0;
    public boolean t = false;
    public boolean u = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            String c = c.c();
            TrtcLog.j(c, "onActivityCreated: " + activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            String c = c.c();
            TrtcLog.j(c, "onActivityDestroyed: " + activity + " ,getActivity: " + c.this.A());
            if (c.this.A() == activity && !c.i(c.this)) {
                c.this.l0(TrtcForegroundService.ACTION_STOP);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            String c = c.c();
            TrtcLog.j(c, "onActivityPaused: " + activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            String c = c.c();
            TrtcLog.j(c, "onActivityResumed: " + activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                return;
            }
            String c = c.c();
            TrtcLog.j(c, "onActivitySaveInstanceState: " + activity + " ,outState: " + bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            String c = c.c();
            TrtcLog.j(c, "onActivityStarted: " + activity);
            if (c.d(c.this) == 0) {
                TrtcLog.j(c.c(), "+++++++ foreground");
                if (!c.i(c.this)) {
                    c.this.l0(TrtcForegroundService.ACTION_STOP);
                }
                c.j(c.this, "foreground", 14, false);
            }
            c.g(c.this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            String c = c.c();
            TrtcLog.j(c, "onActivityStopped : " + activity);
            c.h(c.this);
            if (c.d(c.this) == 0) {
                TrtcLog.j(c.c(), "+++++++ background");
                if (!c.i(c.this)) {
                    c.this.l0(TrtcForegroundService.ACTION_START);
                }
                c.j(c.this, "background", 13, true);
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
            } else if (c.k(c.this) != null) {
                c.k(c.this).d(c.l(c.this).b);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.trtc.rtcroom.c$c  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class RunnableC0788c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13966a;

        public RunnableC0788c(String str) {
            this.f13966a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c.k(c.this).e(JSON.parseObject(this.f13966a));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13967a;

        public d(String str) {
            this.f13967a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c.n(c.this).e(JSON.parseObject(this.f13967a));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13968a;

        public e(String str) {
            this.f13968a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!TextUtils.isEmpty(this.f13968a)) {
                i = vrf.c(JSON.parseObject(this.f13968a), "cause", -1);
            } else {
                i = 0;
            }
            c.o(c.this, "ServerCommand", i, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13969a;
        public final /* synthetic */ int b;

        public f(String str, int i) {
            this.f13969a = str;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (c.p(c.this)) {
                try {
                    if (c.k(c.this) != null) {
                        c.k(c.this).d(TrtcCallImpl.CallStatus.E_CALL_STATUS_IDLE);
                        c.this.s0("releaseSession");
                    }
                    if (c.n(c.this) != null) {
                        c.o(c.this, "releaseSession", 11, false);
                    }
                    if (c.q(c.this) != null) {
                        c.q(c.this).a(this.f13969a, this.b);
                    }
                    c.m(c.this, null);
                    if (c.e(c.this) != null) {
                        c.e(c.this).b();
                        c.f(c.this, null);
                    }
                    String c = c.c();
                    TrtcLog.j(c, "release session for: " + this.f13969a + ", code: " + this.b);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public long f13970a;
        public TrtcCallImpl.CallStatus b;
        public String c;
        public String d;
        public boolean e;
        public boolean f;
        public int g;

        static {
            t2o.a(395313627);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public ITrtcCallEngine.d f13971a;
        public JSONObject d;
        public int g;
        public int h;
        public boolean b = false;
        public boolean c = false;
        public int e = 1;
        public int f = 10;

        static {
            t2o.a(395313628);
        }
    }

    static {
        t2o.a(395313620);
        t2o.a(395313473);
    }

    public static synchronized c D() {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("e4fc8e83", new Object[0]);
            }
            if (w == null) {
                s();
            }
            return w;
        }
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return v;
    }

    public static /* synthetic */ int d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c03f486a", new Object[]{cVar})).intValue();
        }
        return cVar.c;
    }

    public static /* synthetic */ wmu e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wmu) ipChange.ipc$dispatch("6c123e62", new Object[]{cVar});
        }
        return cVar.n;
    }

    public static /* synthetic */ wmu f(c cVar, wmu wmuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wmu) ipChange.ipc$dispatch("c5e0b3ef", new Object[]{cVar, wmuVar});
        }
        cVar.n = wmuVar;
        return wmuVar;
    }

    public static /* synthetic */ int g(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea4abe72", new Object[]{cVar})).intValue();
        }
        int i = cVar.c;
        cVar.c = 1 + i;
        return i;
    }

    public static /* synthetic */ int h(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("832bb1c9", new Object[]{cVar})).intValue();
        }
        int i = cVar.c;
        cVar.c = i - 1;
        return i;
    }

    public static /* synthetic */ boolean i(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ae00afc", new Object[]{cVar})).booleanValue();
        }
        return cVar.t;
    }

    public static /* synthetic */ void j(c cVar, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c94d674", new Object[]{cVar, str, new Integer(i), new Boolean(z)});
        } else {
            cVar.k0(str, i, z);
        }
    }

    public static /* synthetic */ qlu k(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qlu) ipChange.ipc$dispatch("76927159", new Object[]{cVar});
        }
        return cVar.e;
    }

    public static /* synthetic */ g l(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("13f9d69a", new Object[]{cVar});
        }
        return cVar.m;
    }

    public static /* synthetic */ g m(c cVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("5e238cd9", new Object[]{cVar, gVar});
        }
        cVar.m = gVar;
        return gVar;
    }

    public static /* synthetic */ nmu n(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmu) ipChange.ipc$dispatch("7e680f71", new Object[]{cVar});
        }
        return cVar.f;
    }

    public static /* synthetic */ void o(c cVar, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c392b678", new Object[]{cVar, str, new Integer(i), new Boolean(z)});
        } else {
            cVar.t0(str, i, z);
        }
    }

    public static /* synthetic */ Object p(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b135f8f4", new Object[]{cVar});
        }
        return cVar.o;
    }

    public static /* synthetic */ ITrtcCallEngine q(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcCallEngine) ipChange.ipc$dispatch("444b4852", new Object[]{cVar});
        }
        return cVar.d;
    }

    public static synchronized c s() {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("8c0e82b2", new Object[0]);
            }
            if (w != null) {
                u();
            }
            TrtcLog.j(v, "new instance");
            c cVar = new c();
            w = cVar;
            return cVar;
        }
    }

    public static synchronized void u() {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226c8326", new Object[0]);
                return;
            }
            c cVar = w;
            if (cVar != null) {
                cVar.t();
            }
            TrtcLog.j(v, ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX);
            w = null;
        }
    }

    public static synchronized boolean v() {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2e1f8830", new Object[0])).booleanValue();
            }
            if (w == null) {
                z = true;
            }
            return z;
        }
    }

    public Activity A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        TrtcWvPlugin trtcWvPlugin = this.k;
        if (trtcWvPlugin != null) {
            return trtcWvPlugin.getActivity();
        }
        return null;
    }

    public int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e988102", new Object[]{this})).intValue();
        }
        synchronized (this.o) {
            try {
                g gVar = this.m;
                if (gVar == null || gVar.b != TrtcCallImpl.CallStatus.E_CALL_STATUS_TALKING || gVar.f13970a > SystemClock.elapsedRealtime()) {
                    return 0;
                }
                return (int) (SystemClock.elapsedRealtime() - this.m.f13970a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbed9853", new Object[]{this})).booleanValue();
        }
        qlu qluVar = this.e;
        if (qluVar == null || !qluVar.c()) {
            return false;
        }
        return true;
    }

    public int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("700d68cc", new Object[]{this})).intValue();
        }
        return this.p;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5def84ed", new Object[]{this})).booleanValue();
        }
        nmu nmuVar = this.f;
        if (nmuVar == null || !nmuVar.b()) {
            return false;
        }
        return true;
    }

    public g G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("721567a0", new Object[]{this});
        }
        return this.m;
    }

    public TrtcWvPlugin.a H(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("e3573aa0", new Object[]{this, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        n0("hangup", 0);
        return aVar;
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue();
        }
        try {
            if ((this.k.getActivity().getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public synchronized boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[]{this})).booleanValue();
        }
        return this.l.get();
    }

    public TrtcWvPlugin.a M(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("f259d941", new Object[]{this, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        synchronized (this.o) {
            try {
                if (this.m != null) {
                    aVar.d(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "call busy");
                    return aVar;
                }
                ITrtcCallEngine.c i0 = i0(jSONObject);
                ITrtcCallEngine iTrtcCallEngine = this.d;
                if (iTrtcCallEngine == null || !((TrtcCallImpl) iTrtcCallEngine).W(i0)) {
                    aVar.c(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA);
                } else {
                    aVar.c(200);
                    g gVar = new g();
                    this.m = gVar;
                    gVar.b = TrtcCallImpl.CallStatus.E_CALL_STATUS_CALLING;
                    gVar.d = i0.b;
                    gVar.c = i0.f13903a;
                    gVar.e = i0.d;
                    gVar.f = i0.e;
                    gVar.g = i0.f;
                    wmu wmuVar = new wmu(this.k.getContext());
                    this.n = wmuVar;
                    wmuVar.a();
                    qlu qluVar = this.e;
                    if (qluVar != null) {
                        qluVar.d(this.m.b);
                    }
                }
                return aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public TrtcWvPlugin.a N(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("316daa10", new Object[]{this, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a(200, "");
        if (this.m == null) {
            aVar.d(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "no active call");
            return aVar;
        }
        Boolean bool = jSONObject.getBoolean("muteMic");
        Boolean bool2 = jSONObject.getBoolean("mutePlayout");
        synchronized (this.o) {
            try {
                ITrtcCallEngine iTrtcCallEngine = this.d;
                if (!(iTrtcCallEngine == null || this.m == null)) {
                    if (bool != null && iTrtcCallEngine.muteLocal(bool.booleanValue())) {
                        this.m.e = bool.booleanValue();
                    }
                    if (bool2 != null && this.d.b(bool2.booleanValue(), this.m.c)) {
                        this.m.f = bool2.booleanValue();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final void O(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba04e90d", new Object[]{this, str, jSONObject});
        } else {
            P(str, jSONObject, true);
        }
    }

    public final synchronized void P(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8698eb67", new Object[]{this, str, jSONObject, new Boolean(z)});
            return;
        }
        TrtcWvPlugin trtcWvPlugin = this.k;
        if (trtcWvPlugin != null) {
            trtcWvPlugin.notify2Js(str, jSONObject, z);
        }
    }

    public final synchronized void Q(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ef462a", new Object[]{this, new Integer(i), str});
            return;
        }
        TrtcWvPlugin trtcWvPlugin = this.k;
        if (trtcWvPlugin != null) {
            trtcWvPlugin.notifyError2Js(i, str);
            y(i, str);
        }
    }

    public void R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ee76ea1", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", (Object) "WIN_CLIENT_STATUS");
        jSONObject2.put("params", (Object) jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("remoteId", (Object) this.m.c);
        jSONObject3.put("data", (Object) jSONObject2.toJSONString());
        p0(jSONObject3, 500);
    }

    public final void S(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7045d3b7", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            jSONObject.put("code", (Object) 200);
            jSONObject.put("msg", "initialize success");
        } else {
            jSONObject.put("code", (Object) Integer.valueOf((int) BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA));
            jSONObject.put("msg", "initialize fail");
        }
        O("onInitializeResult", jSONObject);
    }

    public final void T(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0438ac", new Object[]{this, new Integer(i), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) Integer.valueOf(i));
        jSONObject.put("msg", (Object) str);
        this.k.notify2Js("onScreenInteractionResult", jSONObject);
    }

    public void U(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751be840", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) Integer.valueOf(i));
        jSONObject.put("code", (Object) Integer.valueOf(i2));
        jSONObject.put("msg", (Object) str);
        this.k.notify2Js("onScreenInteractionStatus", jSONObject);
    }

    public void V(ITrtcCallEngine.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4356d69", new Object[]{this, aVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        this.q = aVar.b;
        jSONObject.put("remoteId", (Object) aVar.f13902a);
        jSONObject.put(FailedBinderCallBack.CALLER_ID, (Object) aVar.b);
        jSONObject.put("callMode", (Object) Integer.valueOf(aVar.c));
        jSONObject.put("answer", (Object) Boolean.valueOf(aVar.d));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("custom", (Object) aVar.e);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("callParams", (Object) jSONObject);
        jSONObject3.put("extraParams", (Object) jSONObject2);
        synchronized (this.o) {
            try {
                if (aVar.d) {
                    g gVar = this.m;
                    if (gVar != null) {
                        gVar.f13970a = SystemClock.elapsedRealtime();
                        g gVar2 = this.m;
                        gVar2.b = TrtcCallImpl.CallStatus.E_CALL_STATUS_TALKING;
                        this.d.muteLocal(gVar2.e);
                        ITrtcCallEngine iTrtcCallEngine = this.d;
                        g gVar3 = this.m;
                        iTrtcCallEngine.b(gVar3.f, gVar3.c);
                        this.k.getActivity().runOnUiThread(new b());
                    }
                } else {
                    n0("remote reject", BSError.BSDIFF_NEW_FILE_MD5_MISMATCH);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        O("onAnswer", jSONObject3);
    }

    public void W(TrtcDefines.TrtcAudioFocusState trtcAudioFocusState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b113c2", new Object[]{this, trtcAudioFocusState});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TrtcConstants.TRTC_PARAMS_AUDIO_FOCUS, (Object) Integer.valueOf(trtcAudioFocusState.ordinal()));
        O("onAudioFocus", jSONObject);
        tmu.e(this.f13963a.f13971a.b + "^^^OnAudioFocusChanged^^^state^^^" + trtcAudioFocusState.ordinal(), this.q);
    }

    public void X(TrtcDefines.TrtcAudioRouteDevice trtcAudioRouteDevice) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fbafe5", new Object[]{this, trtcAudioRouteDevice});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("playoutMode", (Object) Integer.valueOf(trtcAudioRouteDevice.ordinal()));
        O("onPlayoutMode", jSONObject);
        tmu.e(this.f13963a.f13971a.b + "^^^OnArtcBridgeEvent^^^onPlayoutMode^^^" + trtcAudioRouteDevice.ordinal(), this.q);
    }

    public void Z(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8214c5b", new Object[]{this, new Boolean(z), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("remoteId", (Object) str);
        synchronized (this.o) {
            try {
                g gVar = this.m;
                if (gVar != null) {
                    gVar.getClass();
                    jSONObject.put(FailedBinderCallBack.CALLER_ID, (Object) this.m.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            O("onFirstAudioFrame", jSONObject);
        } else {
            O("onFirstVideoFrame", jSONObject);
        }
    }

    public void a0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17bfcc4", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("remoteId", (Object) str);
        O("onParticipantEnter", jSONObject);
    }

    public void b0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27e6e33", new Object[]{this, str, str2});
            return;
        }
        n0("remote leave", BSError.BSDIFF_NEW_FILE_INVALID_SIZE);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("remoteId", (Object) str);
        O("onParticipantLeave", jSONObject);
    }

    public void d0(TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ceb50d9", new Object[]{this, trtcMediaConnectionState});
        } else if (trtcMediaConnectionState == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_DISCONNECTED) {
            Q(ErrorConstant.ERROR_GET_PROCESS_NULL, "network discconect");
            n0("network discconect", ErrorConstant.ERROR_GET_PROCESS_NULL);
        }
    }

    public void e0(TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fee0eb", new Object[]{this, trtcNetWorkQuality});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("quality", (Object) Integer.valueOf(trtcNetWorkQuality.ordinal()));
        O("onNetworkQuality", jSONObject);
    }

    public void f0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bca71d3", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("networkType", (Object) Integer.valueOf(i));
        O("onNetworkType", jSONObject);
        this.p = i;
    }

    public void g0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e581379", new Object[]{this, new Integer(i)});
        } else if (this.m != null && i == 113) {
            Q(-1101, "system phone active");
        }
    }

    public final void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47d1d29e", new Object[]{this});
            return;
        }
        this.c = 1;
        this.b = new a();
        this.k.getActivity().getApplication().registerActivityLifecycleCallbacks(this.b);
    }

    public final void n0(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06ad23", new Object[]{this, str, new Integer(i)});
        } else {
            this.k.getActivity().runOnUiThread(new f(str, i));
        }
    }

    public TrtcWvPlugin.a o0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("59a940e7", new Object[]{this, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        int c = vrf.c(jSONObject, "cmd", -1);
        synchronized (this.o) {
            try {
                if (c == 0) {
                    t0("API", 12, true);
                } else if (c == 1) {
                    r0();
                } else {
                    aVar.c(-103);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public TrtcWvPlugin.a p0(JSONObject jSONObject, int i) {
        ITrtcCallEngine iTrtcCallEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("547f3090", new Object[]{this, jSONObject, new Integer(i)});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        if (this.m == null) {
            aVar.d(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "no active call");
            return aVar;
        }
        String string = jSONObject.getString("remoteId");
        String string2 = jSONObject.getString("data");
        String str = v;
        TrtcLog.j(str, "SEND DATA: " + string2);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || (iTrtcCallEngine = this.d) == null) {
            aVar.c(-103);
        } else {
            ((TrtcCallImpl) iTrtcCallEngine).a0(string2, i);
        }
        return aVar;
    }

    public void q0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730e26bb", new Object[]{this, str});
            return;
        }
        synchronized (this.o) {
            String str2 = v;
            tmu.f(str2, "startFloatWindow, action: " + str);
            if (this.e == null || !PermissionActivity.e(this.k.getContext())) {
                TrtcLog.i(str2, "start failed for permission");
            } else {
                try {
                    this.e.h();
                    nmu nmuVar = this.f;
                    if (nmuVar != null && nmuVar.b()) {
                        this.f.c();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d2ed0a7", new Object[]{this});
            return;
        }
        ucq h2 = com.taobao.appbundle.a.Companion.a().h();
        String str = v;
        TrtcLog.j(str, "checkLayoutManagerInstall, manager: " + h2);
        if (h2 != null) {
            h2.c(xcq.c().l("layoutmanager_feature").n());
        }
    }

    public void s0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef1d71b", new Object[]{this, str});
            return;
        }
        synchronized (this.o) {
            qlu qluVar = this.e;
            if (qluVar != null && qluVar.c()) {
                String str2 = v;
                tmu.f(str2, "stopFloatWindow, action: " + str);
                try {
                    this.e.i();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public synchronized void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe36af8", new Object[]{this});
        } else if (!this.l.get()) {
            TrtcLog.j(v, "already deInitialize");
        } else {
            this.l.set(false);
            this.t = false;
            l0(TrtcForegroundService.ACTION_STOP);
            if (this.b != null) {
                this.k.getActivity().getApplication().unregisterActivityLifecycleCallbacks(this.b);
                this.b = null;
            }
            qlu qluVar = this.e;
            if (qluVar != null) {
                qluVar.a();
                this.e = null;
            }
            nmu nmuVar = this.f;
            if (nmuVar != null) {
                nmuVar.a();
                this.f = null;
                this.g = null;
            }
            ITrtcCallEngine iTrtcCallEngine = this.d;
            if (iTrtcCallEngine != null) {
                ((TrtcCallImpl) iTrtcCallEngine).O();
                this.d = null;
            }
            PermissionActivity.f();
            n0("deInitialize", BSError.BSDIFF_NEW_FILE_SIZE_MISMATC);
            TrtcLog.j(v, "deInitialize success!");
        }
    }

    public TrtcWvPlugin.a v0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("8cf99218", new Object[]{this, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        synchronized (this.o) {
            try {
                if (this.f13963a == null || !jSONObject.containsKey("floatWindowConfig")) {
                    aVar.c(-103);
                } else {
                    this.f13963a.d = jSONObject.getJSONObject("floatWindowConfig");
                    qlu qluVar = this.e;
                    if (qluVar != null) {
                        qluVar.f(this.f13963a.d);
                    }
                    TrtcLog.j(v, "updateFloatConfig success");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public h w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("96e29b05", new Object[]{this});
        }
        return this.f13963a;
    }

    public synchronized void w0(TrtcWvPlugin trtcWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137cf6d1", new Object[]{this, trtcWvPlugin});
            return;
        }
        String str = v;
        TrtcLog.j(str, "UpdatePlugin " + this.k + " -> " + trtcWvPlugin);
        this.k = trtcWvPlugin;
    }

    public Object x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7d1c191e", new Object[]{this});
        }
        return this.o;
    }

    public void y(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35fade7", new Object[]{this, new Integer(i), str});
            return;
        }
        String str2 = v;
        TrtcLog.i(str2, "errorCode: " + i + " ,errorMsg: " + str);
        h hVar = this.f13963a;
        if (hVar != null && hVar.f13971a != null) {
            tmu.e(this.f13963a.f13971a.b + "^^^OnArtcBridgeError^^^" + i + "^^^" + str, this.q);
        }
    }

    public TrtcWvPlugin.a z(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("9d307141", new Object[]{this, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        int c = vrf.c(jSONObject, "cmd", -1);
        if (c == 0) {
            s0("API");
        } else if (c == 1) {
            q0("API");
        } else {
            aVar.c(-103);
        }
        return aVar;
    }

    public synchronized TrtcWvPlugin.a I(TrtcWvPlugin trtcWvPlugin, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("5606636f", new Object[]{this, trtcWvPlugin, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        this.k = trtcWvPlugin;
        if (this.l.get()) {
            TrtcLog.j(v, "already initialized");
            return aVar.c(200);
        }
        r();
        m0();
        if (!j0(jSONObject)) {
            TrtcLog.i(v, "initialize error, invalid params");
            return aVar.c(-103);
        } else if (this.f13963a.c && !Login.checkSessionValid()) {
            TrtcLog.i(v, "check login invalid");
            return aVar.d(-102, "login invalid");
        } else if (!com.taobao.trtc.api.c.b()) {
            TrtcLog.i(v, "trtc engine is not available!!!");
            return aVar.d(-126, "artc not available");
        } else {
            this.d = c3e.a(trtcWvPlugin.getContext(), this.f13963a.f13971a);
            this.e = new qlu(trtcWvPlugin.getActivity(), this, this.f13963a.d);
            nfs.b b2 = nfs.b();
            if (b2 == null) {
                TrtcLog.i(v, "create ScreenInteractionAdapter, cursorHelper is null");
            } else {
                h hVar = this.f13963a;
                this.f = new nmu(this, hVar.e, hVar.g, hVar.h, b2);
            }
            TrtcLog.j(v, "initialize success!");
            this.l.set(true);
            return aVar.c(200);
        }
    }

    public void Y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            return;
        }
        switch (i) {
            case -104:
                n0("makecall error", BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA);
                Q(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "unkown");
                return;
            case -103:
                n0("timeout", -119);
                Q(-119, "timeout");
                return;
            case -102:
                n0("join error", BSError.BSDIFF_OLD_FILE_DEC_FAILED);
                Q(BSError.BSDIFF_OLD_FILE_DEC_FAILED, "join room error, code: " + i);
                return;
            case -101:
                S(false);
                return;
            default:
                return;
        }
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine.b
    public void a(String str, TrtcDefines.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a935208", new Object[]{this, str, fVar});
            return;
        }
        String str2 = new String(fVar.f13880a);
        if (J()) {
            String str3 = v;
            TrtcLog.j(str3, "OnRecvData | type: " + fVar.b + ", " + str2);
        }
        if (this.m != null) {
            int i = fVar.b;
            if (i == 1 || i == -1) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("remoteId", (Object) str);
                jSONObject.put(FailedBinderCallBack.CALLER_ID, (Object) this.m.d);
                jSONObject.put("data", (Object) str2);
                O("onRecvData", jSONObject);
                return;
            }
            try {
                if (i == 500) {
                    if (this.e != null && fVar.f13880a.length > 0) {
                        if (!TextUtils.isEmpty(str2)) {
                            this.k.getActivity().runOnUiThread(new RunnableC0788c(str2));
                        }
                    }
                } else if (i == 501) {
                    if (!TextUtils.isEmpty(str2) && this.f != null) {
                        this.k.getActivity().runOnUiThread(new d(str2));
                    }
                } else if (i == 502) {
                    this.k.getActivity().runOnUiThread(new e(str2));
                } else {
                    String str4 = v;
                    TrtcLog.i(str4, "onRecvData | unkown type: " + fVar.b);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void c0(TrtcAudioDevice.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("937d4e6c", new Object[]{this, bVar});
            return;
        }
        g gVar = this.m;
        if (gVar != null && bVar.h >= 0 && gVar.b == TrtcCallImpl.CallStatus.E_CALL_STATUS_TALKING) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isLocal", (Object) Boolean.TRUE);
            jSONObject.put("remoteId", (Object) this.m.c);
            jSONObject.put("db", (Object) Integer.valueOf(this.m.e ? 0 : bVar.h));
            P("onAudioDb", jSONObject, false);
        }
    }

    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1a118b", new Object[]{this});
            return;
        }
        TrtcLog.j(v, "onReady");
        S(true);
    }

    public final synchronized void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4790084b", new Object[]{this});
            return;
        }
        l0(TrtcForegroundService.ACTION_START);
        this.t = true;
        String str = v;
        TrtcLog.j(str, "startScreenInteraction | action: API");
        if (!(this.m == null || this.d == null || this.f == null)) {
            if (this.g != null) {
                T(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "already started");
                return;
            }
            PermissionActivity.m(new PermissionActivity.b() { // from class: tb.xmu
                @Override // com.taobao.trtc.impl.PermissionActivity.b
                public final void a(boolean z, Intent intent) {
                    c.this.L(z, intent);
                }
            });
            TrtcLog.j(str, "start permission activity");
            Intent intent = new Intent(this.k.getActivity(), PermissionActivity.class);
            intent.addFlags(268435456);
            intent.putExtra(PermissionActivity.PERMISSION_TYPE_MEDIA_PEOJECTION, true);
            this.k.getActivity().startActivity(intent);
            this.h = true;
            return;
        }
        T(-127, "interaction not avaiable");
    }

    public final ITrtcCallEngine.c i0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcCallEngine.c) ipChange.ipc$dispatch("20a9fa3", new Object[]{this, jSONObject});
        }
        ITrtcCallEngine.c cVar = new ITrtcCallEngine.c();
        JSONObject jSONObject2 = jSONObject.getJSONObject("callParams");
        if (jSONObject2 != null) {
            cVar.f13903a = vrf.d(jSONObject2, "remoteId");
            String d2 = vrf.d(jSONObject2, FailedBinderCallBack.CALLER_ID);
            cVar.b = d2;
            this.q = d2;
            cVar.c = vrf.c(jSONObject2, "callMode", 0);
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("extraParams");
        if (jSONObject3 != null) {
            cVar.d = vrf.a(jSONObject3, "muteMic", false);
            cVar.e = vrf.a(jSONObject3, "mutePlayout", false);
            cVar.f = vrf.c(jSONObject3, "playoutMode", 1);
            cVar.g = vrf.c(jSONObject3, "timeout", 20000);
            cVar.h = vrf.d(jSONObject3, "custom");
        }
        return cVar;
    }

    public final boolean j0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("305d9b4a", new Object[]{this, jSONObject})).booleanValue();
        }
        this.f13963a = new h();
        ITrtcCallEngine.d dVar = new ITrtcCallEngine.d();
        dVar.b = vrf.d(jSONObject, FluidException.SERVICE_NAME);
        dVar.f13904a = vrf.e(jSONObject, "appKey", "21646297");
        dVar.c = this;
        if (TextUtils.isEmpty(dVar.b) || TextUtils.isEmpty(dVar.f13904a)) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("extraParams");
        if (jSONObject2 != null) {
            dVar.d = vrf.d(jSONObject2, "userId");
            this.s = vrf.e(jSONObject2, "foregroundServiceNotificationText", "语音通话中");
            this.r = vrf.e(jSONObject2, "foregroundServiceNotificationTitle", "淘宝客服");
            this.f13963a.c = vrf.a(jSONObject2, "checkLogin", false);
            this.f13963a.b = vrf.a(jSONObject2, iu2.CALENDAR_EVENT_PERMISSION_CHECK, true);
            if (vrf.a(jSONObject2, "audioLevelEvent", true)) {
                dVar.e = cmu.e("local_audio_interval_ms", 300);
            }
            this.f13963a.d = jSONObject2.getJSONObject("floatWindowConfig");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("screenInteractionConfig");
            this.f13963a.e = vrf.c(jSONObject3, "definition", 1);
            this.f13963a.f = vrf.c(jSONObject3, "fps", 10);
            String e2 = vrf.e(jSONObject3, "mainColor", "#0058FF");
            String e3 = vrf.e(jSONObject3, "secColor", "#85C2FF");
            try {
                this.f13963a.g = Color.parseColor(e2);
                this.f13963a.h = Color.parseColor(e3);
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(dVar.d)) {
            dVar.d = Login.getUserId();
        }
        this.f13963a.f13971a = dVar;
        return true;
    }

    public final synchronized void k0(String str, int i, boolean z) {
        int i2 = 2;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48b2e932", new Object[]{this, str, new Integer(i), new Boolean(z)});
                return;
            }
            if (z) {
                String str2 = v;
                tmu.f(str2, "pauseScreenInteraction | action: " + str + ", code: " + i);
            } else {
                String str3 = v;
                tmu.f(str3, "resumeScreenInteraction | action: " + str + ", code: " + i);
            }
            if (!(this.g == null || this.f == null || this.m == null)) {
                ((TrtcCallImpl) this.d).X(z);
                nmu nmuVar = this.f;
                if (!z) {
                    i2 = 1;
                }
                nmuVar.d(i2, i, str);
            }
        }
    }

    public void l0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b21794", new Object[]{this, str});
            return;
        }
        try {
            if (!cmu.b("foreground_service_enable", true)) {
                return;
            }
            if (TrtcForegroundService.ACTION_START == str) {
                this.u = true;
                if (!this.t) {
                    String str2 = v;
                    TrtcLog.j(str2, "processForegroundService, status: " + str);
                    Intent intent = new Intent(this.k.getContext(), TrtcForegroundService.class);
                    intent.putExtra(TrtcForegroundService.NOTIFICATION_CONTENT_TITLE, this.r);
                    intent.putExtra(TrtcForegroundService.NOTIFICATION_CONTENT_TEXT, this.s);
                    intent.setAction(str);
                    if (Build.VERSION.SDK_INT >= 26) {
                        this.k.getContext().startForegroundService(intent);
                    } else {
                        this.k.getContext().startService(intent);
                    }
                }
            } else if (TrtcForegroundService.ACTION_STOP != str) {
            } else {
                if (!this.u) {
                    TrtcLog.j(v, "ForegroundService is not runing");
                    return;
                }
                TrtcLog.j(v, "stopForegroundService");
                this.k.getContext().stopService(new Intent(this.k.getContext(), TrtcForegroundService.class));
                this.u = false;
            }
        } catch (Exception e2) {
            String str3 = v;
            TrtcLog.i(str3, "processForegroundService, ForegroundService Exception: " + e2);
        }
    }

    public final synchronized void t0(String str, int i, boolean z) {
        ITrtcCallEngine iTrtcCallEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd19c4a6", new Object[]{this, str, new Integer(i), new Boolean(z)});
            return;
        }
        this.t = false;
        l0(TrtcForegroundService.ACTION_STOP);
        String str2 = v;
        TrtcLog.j(str2, "stopScreenInteraction | action: " + str + ", code: " + i);
        if (this.h && str.equalsIgnoreCase("ServerCommand")) {
            TrtcLog.j(str2, "stop a starting screen interaction");
            this.i = true;
            this.j = i;
        } else if (this.g == null) {
            TrtcLog.j(str2, "ScreenInteraction not started");
            if (z) {
                T(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "not started");
            }
        } else {
            this.g = null;
            if (!(this.m == null || (iTrtcCallEngine = this.d) == null)) {
                ((TrtcCallImpl) iTrtcCallEngine).c0();
            }
            if (z) {
                T(200, "success");
            }
            nmu nmuVar = this.f;
            if (nmuVar != null) {
                nmuVar.d(0, i, str);
            }
        }
    }

    public final /* synthetic */ void L(boolean z, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5e8f7d", new Object[]{this, new Boolean(z), intent});
            return;
        }
        this.h = false;
        String str = v;
        TrtcLog.j(str, "screen permission: " + z);
        if (this.i) {
            this.i = false;
            T(this.j, "server canceled");
        } else if (!z || intent == null) {
            T(BSError.BSDIFF_NEW_FILE_CLOSE_FAILED, "permission invalid");
        } else {
            this.g = intent;
            ITrtcCallEngine.e eVar = new ITrtcCallEngine.e();
            h hVar = this.f13963a;
            if (hVar.e == 2) {
                eVar.f13905a = 1080;
                eVar.b = 1920;
            } else {
                eVar.f13905a = 720;
                eVar.b = 1280;
            }
            eVar.c = hVar.f;
            eVar.d = this.g;
            if (((TrtcCallImpl) this.d).b0(eVar)) {
                T(200, "success");
                this.f.d(1, 10, "success");
                return;
            }
            T(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "start screen capture error");
        }
    }

    public TrtcWvPlugin.a u0(JSONObject jSONObject) {
        g gVar;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("580d8d27", new Object[]{this, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        if (this.m == null) {
            aVar.d(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "no active call");
            return aVar;
        }
        int intValue = jSONObject.getIntValue("playoutMode");
        if (intValue == 1 || intValue == 2) {
            synchronized (this.o) {
                try {
                    ITrtcCallEngine iTrtcCallEngine = this.d;
                    if (iTrtcCallEngine != null) {
                        if (intValue != 2) {
                            z = false;
                        }
                        if (((TrtcCallImpl) iTrtcCallEngine).P(z) && (gVar = this.m) != null) {
                            gVar.g = intValue;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            aVar.c(-103);
        }
        return aVar;
    }
}
