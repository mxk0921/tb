package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.jsi.WVJsi;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.ultron.inter.UltronDebugFetcher;
import com.alibaba.android.ultron.inter.UltronDebugInterface;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.jsi.standard.JSEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import tb.a8v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class e9v implements q5e<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int m = 3000;
    public static final AtomicInteger n = new AtomicInteger(0);
    public static final Map<String, String> o = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public Handler f18385a;
    public Handler b;
    public final Context e;
    public final String f;
    public final a8v.b h;
    public HandlerThread j;
    public final qe8 l;
    public JSEngine c = null;
    public dqf d = null;
    public final Map<String, Queue<kih<JSONObject>>> g = new HashMap();
    public boolean i = false;
    public volatile boolean k = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
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
            try {
                UnifyLog.e("UltronJSIEngine", "ultronBizName:" + e9v.w(e9v.this) + "#real do destroy in thread,mJSEngine=" + e9v.u(e9v.this));
                if (e9v.u(e9v.this) != null && e9v.g(e9v.this) != null) {
                    e9v.u(e9v.this).removeContext(e9v.g(e9v.this));
                    e9v.u(e9v.this).dispose();
                    e9v.v(e9v.this, null);
                    if (e9v.l(e9v.this) != null) {
                        e9v.l(e9v.this).removeCallbacksAndMessages(null);
                    }
                    e9v.m(e9v.this, null);
                    e9v.o(e9v.this).quit();
                    e9v.p(e9v.this, null);
                    if (e9v.q(e9v.this) != null) {
                        e9v.q(e9v.this).removeCallbacksAndMessages(null);
                    }
                    e9v.r(e9v.this, null);
                }
            } catch (Throwable th) {
                String w = e9v.w(e9v.this);
                UnifyLog.m(w, "UltronJSIEngine", "destroy error: " + th.toString(), new String[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UltronError f18387a;

        public b(UltronError ultronError) {
            this.f18387a = ultronError;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (e9v.s(e9v.this) != null) {
                e9v.s(e9v.this).a(this.f18387a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/engine/logic/UltronJSIEngine$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 10001) {
                e9v.d(e9v.this, true);
                UltronError ultronError = new UltronError("js 执行超时");
                ultronError.code = "F_ULTRON_ENGINE_10005_JSI";
                e9v.e(e9v.this, ultronError);
            } else if (i == 10002) {
                e9v.n(e9v.this, true);
                e9v.t(e9v.this, "JSI 初始化超时");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class f extends ypf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            if (str.hashCode() == 1102003264) {
                return super.onCallFunction((jb1) objArr[0]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/engine/logic/UltronJSIEngine$4");
        }

        @Override // tb.ypf
        public ksf onCallFunction(jb1 jb1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ksf) ipChange.ipc$dispatch("41af3c40", new Object[]{this, jb1Var});
            }
            try {
                ksf c = jb1Var.c(0);
                c.t(jb1Var.d());
                c.delete();
            } catch (Throwable th) {
                String w = e9v.w(e9v.this);
                UnifyLog.m(w, "UltronJSIEngine", "console.log crashed: " + th.toString(), new String[0]);
            }
            return super.onCallFunction(jb1Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class g extends ypf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            if (str.hashCode() == 1102003264) {
                return super.onCallFunction((jb1) objArr[0]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/engine/logic/UltronJSIEngine$5");
        }

        @Override // tb.ypf
        public ksf onCallFunction(jb1 jb1Var) {
            JSONObject parseObject;
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ksf) ipChange.ipc$dispatch("41af3c40", new Object[]{this, jb1Var});
            }
            e9v.A(e9v.this);
            if (e9v.c(e9v.this)) {
                return super.onCallFunction(jb1Var);
            }
            try {
                ksf c = jb1Var.c(0);
                String t = c.t(jb1Var.d());
                c.delete();
                parseObject = JSON.parseObject(t);
            } catch (Throwable th) {
                UnifyLog.m(e9v.w(e9v.this), "UltronJSIEngine", "jsCallback exception ", th.toString());
            }
            if (parseObject == null || (string = parseObject.getString("method")) == null) {
                return null;
            }
            Queue queue = (Queue) e9v.f(e9v.this).get(string);
            if (queue != null) {
                kih kihVar = (kih) queue.poll();
                if (kihVar != null) {
                    kihVar.onReceiveValue(parseObject.getJSONObject("methodReturn"));
                } else {
                    UnifyLog.m(e9v.w(e9v.this), "UltronJSIEngine", "JSFunction but logicCallBack is null", new String[0]);
                }
            }
            return super.onCallFunction(jb1Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class h implements rsd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h(e9v e9vVar, String str) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18393a;
        public final /* synthetic */ String b;

        public i(String str, String str2) {
            this.f18393a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (e9v.g(e9v.this) == null) {
                UnifyLog.m(e9v.w(e9v.this), "UltronJSIEngine", "executeJS，mJSContext is null！", new String[0]);
            } else {
                dqf g = e9v.g(e9v.this);
                if (g.k().isDisposed()) {
                    e9v.h(e9v.this, "JSEngine disposed");
                } else if (g.r()) {
                    e9v.h(e9v.this, "JSContext disposed");
                } else {
                    ye8 ye8Var = new ye8(g.k());
                    try {
                        ksf c = g.c(this.f18393a, this.b);
                        if (g.q()) {
                            kqf g2 = g.g();
                            if (g2 != null) {
                                g2.delete();
                                e9v.i(e9v.this, (((("name: " + g2.c(g)) + "; message: ") + g2.b(g)) + "; stack: ") + g2.d(g));
                            } else {
                                e9v.h(e9v.this, "get exception failed");
                            }
                        } else if (c == null) {
                            e9v.h(e9v.this, "unexpected error");
                        }
                        if (c != null) {
                            c.delete();
                        }
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18394a;
        public final /* synthetic */ String b;

        public j(String str, String str2) {
            this.f18394a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e9v.j(e9v.this, this.f18394a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18395a;
        public final /* synthetic */ List b;
        public final /* synthetic */ kih c;

        public k(String str, List list, kih kihVar) {
            this.f18395a = str;
            this.b = list;
            this.c = kihVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (e9v.g(e9v.this) == null) {
                UnifyLog.m(e9v.w(e9v.this), "UltronJSIEngine", "callMethod，mJSContext is null！", new String[0]);
            } else {
                UnifyLog.e("UltronJSIEngine", "ultronBizName:" + e9v.w(e9v.this) + "#real do callMethod:" + this.f18395a);
                e9v.k(e9v.this, this.f18395a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(157286423);
        t2o.a(157286421);
    }

    public e9v(Context context, com.alibaba.android.ultron.vfw.instance.a aVar, String str, qe8 qe8Var, a8v.b bVar) {
        this.f18385a = null;
        this.b = null;
        UnifyLog.e("UltronJSIEngine", "ultronBizName:" + str + "#new instance:" + this);
        this.e = context;
        this.f = str;
        this.l = qe8Var;
        this.h = bVar;
        if (this.f18385a == null) {
            HandlerThread handlerThread = new HandlerThread("UltronJSIEngine");
            this.j = handlerThread;
            handlerThread.start();
            this.f18385a = new Handler(this.j.getLooper());
        }
        if (this.b == null) {
            this.b = new c(Looper.getMainLooper());
        }
        R();
    }

    public static /* synthetic */ void A(e9v e9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a686b7", new Object[]{e9vVar});
        } else {
            e9vVar.Y();
        }
    }

    public static /* synthetic */ boolean c(e9v e9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e23d63e4", new Object[]{e9vVar})).booleanValue();
        }
        return e9vVar.i;
    }

    public static /* synthetic */ boolean d(e9v e9vVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c8ed37a", new Object[]{e9vVar, new Boolean(z)})).booleanValue();
        }
        e9vVar.i = z;
        return z;
    }

    public static /* synthetic */ void e(e9v e9vVar, UltronError ultronError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b550f666", new Object[]{e9vVar, ultronError});
        } else {
            e9vVar.S(ultronError);
        }
    }

    public static /* synthetic */ Map f(e9v e9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30d8d606", new Object[]{e9vVar});
        }
        return e9vVar.g;
    }

    public static /* synthetic */ dqf g(e9v e9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dqf) ipChange.ipc$dispatch("2b69b0b5", new Object[]{e9vVar});
        }
        return e9vVar.d;
    }

    public static /* synthetic */ void h(e9v e9vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7c19d5", new Object[]{e9vVar, str});
        } else {
            e9vVar.U(str);
        }
    }

    public static /* synthetic */ void i(e9v e9vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492d83f4", new Object[]{e9vVar, str});
        } else {
            e9vVar.W(str);
        }
    }

    public static /* synthetic */ void j(e9v e9vVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a9d91d", new Object[]{e9vVar, str, str2});
        } else {
            e9vVar.Q(str, str2);
        }
    }

    public static /* synthetic */ void k(e9v e9vVar, String str, List list, kih kihVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef3a53f", new Object[]{e9vVar, str, list, kihVar});
        } else {
            e9vVar.G(str, list, kihVar);
        }
    }

    public static /* synthetic */ Handler l(e9v e9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("bf1303f4", new Object[]{e9vVar});
        }
        return e9vVar.f18385a;
    }

    public static /* synthetic */ Handler m(e9v e9vVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("6ef29ac6", new Object[]{e9vVar, handler});
        }
        e9vVar.f18385a = handler;
        return handler;
    }

    public static /* synthetic */ boolean n(e9v e9vVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e80dc37c", new Object[]{e9vVar, new Boolean(z)})).booleanValue();
        }
        e9vVar.k = z;
        return z;
    }

    public static /* synthetic */ HandlerThread o(e9v e9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("ce66a54b", new Object[]{e9vVar});
        }
        return e9vVar.j;
    }

    public static /* synthetic */ HandlerThread p(e9v e9vVar, HandlerThread handlerThread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("9b0a2887", new Object[]{e9vVar, handlerThread});
        }
        e9vVar.j = handlerThread;
        return handlerThread;
    }

    public static /* synthetic */ Handler q(e9v e9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e0ab776", new Object[]{e9vVar});
        }
        return e9vVar.b;
    }

    public static /* synthetic */ Handler r(e9v e9vVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("f5bf7948", new Object[]{e9vVar, handler});
        }
        e9vVar.b = handler;
        return handler;
    }

    public static /* synthetic */ a8v.b s(e9v e9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a8v.b) ipChange.ipc$dispatch("3d80ce8e", new Object[]{e9vVar});
        }
        return e9vVar.h;
    }

    public static /* synthetic */ void t(e9v e9vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b99407", new Object[]{e9vVar, str});
        } else {
            e9vVar.V(str);
        }
    }

    public static /* synthetic */ JSEngine u(e9v e9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSEngine) ipChange.ipc$dispatch("7806df40", new Object[]{e9vVar});
        }
        return e9vVar.c;
    }

    public static /* synthetic */ JSEngine v(e9v e9vVar, JSEngine jSEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSEngine) ipChange.ipc$dispatch("f327707e", new Object[]{e9vVar, jSEngine});
        }
        e9vVar.c = jSEngine;
        return jSEngine;
    }

    public static /* synthetic */ String w(e9v e9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55137ac5", new Object[]{e9vVar});
        }
        return e9vVar.f;
    }

    public static /* synthetic */ String x(e9v e9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("358cd0c6", new Object[]{e9vVar});
        }
        return e9vVar.H();
    }

    public static /* synthetic */ void y(e9v e9vVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ac12fb", new Object[]{e9vVar, new Boolean(z)});
        } else {
            e9vVar.P(z);
        }
    }

    public static /* synthetic */ qe8 z(e9v e9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qe8) ipChange.ipc$dispatch("650adbd3", new Object[]{e9vVar});
        }
        return e9vVar.l;
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0c4f75", new Object[]{this});
            return;
        }
        ye8 ye8Var = new ye8(this.d.k());
        try {
            yrf p = this.d.p();
            yrf yrfVar = new yrf(this.d);
            oqf oqfVar = new oqf(this.d, new f(), "log");
            yrfVar.J(this.d, "log", oqfVar);
            p.J(this.d, "console", yrfVar);
            oqfVar.delete();
            yrfVar.delete();
            p.delete();
        } finally {
            ye8Var.c();
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dca776a", new Object[]{this});
            return;
        }
        ye8 ye8Var = new ye8(this.d.k());
        try {
            yrf p = this.d.p();
            yrf yrfVar = new yrf(this.d);
            oqf oqfVar = new oqf(this.d, new e(), "call");
            yrfVar.J(this.d, "call", oqfVar);
            p.J(this.d, "nativeBridge", yrfVar);
            oqfVar.delete();
            yrfVar.delete();
            p.delete();
        } finally {
            ye8Var.c();
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2d4a27a", new Object[]{this});
            return;
        }
        ye8 ye8Var = new ye8(this.d.k());
        try {
            yrf p = this.d.p();
            oqf oqfVar = new oqf(this.d, new g(), "jsCallback");
            p.J(this.d, "jsCallback", oqfVar);
            oqfVar.delete();
            p.delete();
        } finally {
            ye8Var.c();
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba71885", new Object[]{this});
            return;
        }
        Handler handler = this.b;
        if (handler != null) {
            this.b.sendMessageDelayed(Message.obtain(handler, 10002), 3000L);
        }
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e449dc", new Object[]{this});
            return;
        }
        Handler handler = this.b;
        if (handler != null) {
            this.b.sendMessageDelayed(Message.obtain(handler, 10001), m);
        }
    }

    public final void G(String str, List<String> list, kih<JSONObject> kihVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6421dd3b", new Object[]{this, str, list, kihVar});
            return;
        }
        UnifyLog.m(this.f, "UltronJSIEngine", "callJsMethodInternal start", new String[0]);
        Queue queue = (Queue) ((HashMap) this.g).get(str);
        if (queue == null) {
            queue = new ArrayDeque();
        }
        ((HashMap) this.g).put(str, queue);
        queue.offer(kihVar);
        F();
        K(str, list);
        UnifyLog.m(this.f, "UltronJSIEngine", "callJsMethodInternal finished", new String[0]);
    }

    public final String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22f02f71", new Object[]{this});
        }
        try {
            String v8SoPath = WVCore.getInstance().getV8SoPath();
            if (v8SoPath == null) {
                return "getV8SoPath is null";
            }
            if (new File(v8SoPath).exists()) {
                return Boolean.TRUE.toString();
            }
            E();
            long currentTimeMillis = System.currentTimeMillis();
            boolean extractWebCoreLibrary = WVCore.getInstance().extractWebCoreLibrary(this.e);
            X();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (this.k) {
                return "extract success,but has timeout: " + currentTimeMillis2;
            } else if (!extractWebCoreLibrary) {
                return "extractWebCoreLibrary fail";
            } else {
                if (new File(WVCore.getInstance().getV8SoPath()).exists()) {
                    return Boolean.TRUE.toString();
                }
                return "extractWebCoreLibrary success,but so file not exists";
            }
        } catch (Exception unused) {
            return "checkJSEngineSoExist exception";
        }
    }

    public final void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb1a5f8f", new Object[]{this, str});
            return;
        }
        String str2 = this.f + "_logicFile.js";
        if (yv6.b(this.e)) {
            if (str2.equals(null)) {
                str = null;
            }
            UltronDebugFetcher.getUltronDebug(this.f).sendStatusEvent("STATUS_ENGINE_LOGIC_ENGINE_INIT_FILE", new UltronDebugInterface.a().b("content", str).b("fileName", str2).a());
            UltronDebugFetcher.getUltronDebug(this.f).registerStatusCallback("EVENT_UPDATA_JS_FILE", new h(this, str2));
        }
        i iVar = new i(str, str2);
        Handler handler = this.f18385a;
        if (handler != null) {
            if (handler.getLooper() == Looper.myLooper()) {
                iVar.run();
            } else {
                this.f18385a.post(iVar);
            }
        }
    }

    public final JSONArray M(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("fbd8fa8e", new Object[]{this, file});
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                JSONArray M = M(file2);
                if (M != null) {
                    jSONArray.addAll(M);
                }
            } else {
                JSONObject O = O(file2);
                if (O != null) {
                    jSONArray.add(O);
                }
            }
        }
        return jSONArray;
    }

    public final String N() {
        File parentFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10bb5ca5", new Object[]{this});
        }
        try {
            String v8SoPath = WVCore.getInstance().getV8SoPath();
            UnifyLog.m(this.f, "UltronJSIEngine", "getJSISoInfo v8SoPath", v8SoPath);
            if (v8SoPath == null || (parentFile = new File(v8SoPath).getParentFile()) == null) {
                return null;
            }
            UnifyLog.m(this.f, "UltronJSIEngine", "getJSISoInfo firstParent: ", parentFile.getAbsolutePath());
            File parentFile2 = parentFile.getParentFile();
            if (parentFile2 == null) {
                return null;
            }
            UnifyLog.m(this.f, "UltronJSIEngine", "getJSISoInfo secondParent: ", parentFile2.getAbsolutePath());
            File parentFile3 = parentFile2.getParentFile();
            if (parentFile3 == null) {
                return null;
            }
            UnifyLog.m(this.f, "UltronJSIEngine", "getJSISoInfo thirdParent: ", parentFile3.getAbsolutePath());
            JSONArray M = M(parentFile3);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v8SoPath", (Object) v8SoPath);
            if (M != null) {
                jSONObject.put("allSoInfos", (Object) M.toJSONString());
            }
            UnifyLog.m(this.f, "UltronJSIEngine", "getJSISoInfo soInfo ", jSONObject.toJSONString());
            return jSONObject.toJSONString();
        } catch (Exception e2) {
            UnifyLog.m(this.f, "UltronJSIEngine", "getJSISoInfo error", e2.getMessage());
            return null;
        }
    }

    public final JSONObject O(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8f7e09a", new Object[]{this, file});
        }
        if (file == null || !file.exists()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        long lastModified = file.lastModified();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(lastModified);
        jSONObject.put("lastModified", (Object) simpleDateFormat.format(instance.getTime()));
        jSONObject.put("absolutePath", (Object) file.getAbsolutePath());
        jSONObject.put("fileLength", (Object) Long.valueOf(file.length()));
        return jSONObject;
    }

    public final void P(boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d33bfd7", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            z2 = I();
        } else {
            z2 = J();
        }
        if (!z2) {
            V("jsEngineSoPath is null");
            return;
        }
        JSEngine jSEngine = this.c;
        this.d = jSEngine.createContext("Context_" + this.f);
        B();
        C();
        D();
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773ca717", new Object[]{this});
        } else if (this.c == null) {
            this.f18385a.post(new d());
        }
    }

    public final void S(UltronError ultronError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc93b658", new Object[]{this, ultronError});
            return;
        }
        b bVar = new b(ultronError);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            bVar.run();
        } else {
            this.b.post(bVar);
        }
    }

    public final void U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4c4e04f", new Object[]{this, str});
            return;
        }
        Y();
        UltronError ultronError = new UltronError("js engine error:" + str);
        ultronError.code = "F_ULTRON_ENGINE_10004_JSI";
        ultronError.domain = "client_engine";
        S(ultronError);
    }

    public final void V(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e2ee1f", new Object[]{this, str});
            return;
        }
        UltronError ultronError = new UltronError("js engine init error:" + str);
        ultronError.code = "F_ULTRON_ENGINE_10002_JSI";
        ultronError.domain = "client_engine";
        ultronError.extraMsg = N();
        Handler handler = this.f18385a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        S(ultronError);
    }

    public final void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e02df1", new Object[]{this, str});
            return;
        }
        Y();
        UltronError ultronError = new UltronError("js exception:" + str);
        ultronError.code = "F_ULTRON_ENGINE_10003_JSI";
        ultronError.domain = "client_engine";
        S(ultronError);
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68d08260", new Object[]{this});
            return;
        }
        Handler handler = this.b;
        if (handler != null) {
            handler.removeMessages(10002);
        }
    }

    public final void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1948b8a1", new Object[]{this});
            return;
        }
        Handler handler = this.b;
        if (handler != null) {
            handler.removeMessages(10001);
        }
    }

    @Override // tb.q5e
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a8c22b", new Object[]{this, str, str2});
            return;
        }
        Handler handler = this.f18385a;
        if (handler != null) {
            handler.post(new j(str, str2));
        }
    }

    @Override // tb.q5e
    public void destroy() {
        JSEngine jSEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        UnifyLog.e("UltronJSIEngine", "ultronBizName:" + this.f + "#destroy," + this + ",mJSEngine=" + this.c);
        if (yv6.b(this.e) && (jSEngine = this.c) != null) {
            jSEngine.printObjects();
        }
        Handler handler = this.f18385a;
        if (handler != null) {
            handler.post(new a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (e9v.u(e9v.this) == null) {
                UnifyLog.m(e9v.w(e9v.this), "UltronJSIEngine", "initialize JSI", new String[0]);
                boolean h = sh4.h(sh4.KEY_ENABLE_CREATE_JSENGINE_WITH_JSI, true);
                if (!h) {
                    str = e9v.x(e9v.this);
                } else {
                    str = "";
                }
                UnifyLog.e("UltronJSIEngine", "soExit=" + str);
                if (!h) {
                    try {
                        if (!Boolean.TRUE.toString().equals(str)) {
                            String w = e9v.w(e9v.this);
                            UnifyLog.e(w, "UltronJSIEngine", "checkJSEngineSoExist false: " + str);
                            e9v.t(e9v.this, str);
                        }
                    } catch (Throwable th) {
                        String w2 = e9v.w(e9v.this);
                        UnifyLog.e(w2, "UltronJSIEngine", "initializeJSI exception: " + Log.getStackTraceString(th));
                        e9v.t(e9v.this, th.getMessage());
                        return;
                    }
                }
                e9v.y(e9v.this, h);
            }
        }
    }

    public final void Q(String str, String str2) {
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c289ef2", new Object[]{this, str, str2});
        } else if (str != null) {
            UnifyLog.m(this.f, "UltronJSIEngine", "initLogicEngine jsFilePath:".concat(str), new String[0]);
            HashMap hashMap = (HashMap) o;
            if (hashMap.containsKey(str)) {
                str3 = (String) hashMap.get(str);
            } else {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String path = parse.getPath();
                if (scheme == null || !scheme.startsWith("file") || path == null || !path.contains("android_asset")) {
                    str4 = fg9.d(this.e, str);
                } else {
                    str4 = fg9.b(this.e, path.replace("/android_asset/", ""));
                }
                String a2 = hoh.a(str4);
                if (TextUtils.isEmpty(str2) || !str2.equals(a2)) {
                    UltronError ultronError = new UltronError("md5 check failed");
                    ultronError.code = "F_ULTRON_ENGINE_10006_JSI";
                    UnifyLog.m(this.f, "UltronJSIEngine", "js file md5 check failed", new String[0]);
                    S(ultronError);
                    return;
                }
                if (!TextUtils.isEmpty(str4)) {
                    hashMap.put(str, str4);
                }
                str3 = str4;
            }
            if (str3 != null) {
                L(str3);
            } else {
                UnifyLog.m(this.f, "UltronJSIEngine", "initLogicEngine but jsContent is null", new String[0]);
            }
        } else {
            throw new IllegalArgumentException("jsFilePath can not be null");
        }
    }

    public final void T(dqf dqfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b08c9af", new Object[]{this, dqfVar, str});
            return;
        }
        Y();
        if (this.i) {
            UnifyLog.m(this.f, "UltronJSIEngine", "jsCallback timeout, return!", new String[0]);
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                String string = parseObject.getString("method");
                String str2 = this.f;
                UnifyLog.m(str2, "UltronJSIEngine", "onJsCallback, method:" + string, new String[0]);
                if (string != null) {
                    Queue queue = (Queue) ((HashMap) this.g).get(string);
                    if (queue != null) {
                        kih kihVar = (kih) queue.poll();
                        if (kihVar != null) {
                            kihVar.onReceiveValue(parseObject.getJSONObject("methodReturn"));
                        } else {
                            UnifyLog.m(this.f, "UltronJSIEngine", "JSFunction but logicCallBack is null", new String[0]);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            UnifyLog.m(this.f, "UltronJSIEngine", "jsCallback exception ", th.toString());
        }
    }

    @Override // tb.q5e
    public void b(String str, List<String> list, kih<JSONObject> kihVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2302181", new Object[]{this, str, list, kihVar});
        } else if (str == null) {
            throw new IllegalArgumentException("method can not be null");
        } else if (this.f18385a != null) {
            UnifyLog.e("UltronJSIEngine", "ultronBizName:" + this.f + "#callMethod:" + str + "," + this);
            this.i = false;
            this.f18385a.post(new k(str, list, kihVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e extends ypf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 1102003264) {
                return super.onCallFunction((jb1) objArr[0]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/engine/logic/UltronJSIEngine$3");
        }

        @Override // tb.ypf
        public ksf onCallFunction(jb1 jb1Var) {
            coc b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ksf) ipChange.ipc$dispatch("41af3c40", new Object[]{this, jb1Var});
            }
            if (jb1Var == null || jb1Var.b() < 3) {
                Log.e("UltronJSIEngine", "bridge.call() error: args is null or args count() < 3");
                UnifyLog.m(e9v.w(e9v.this), "UltronJSIEngine", "bridge.call() error: args is null or args count() < 3", new String[0]);
            }
            try {
                ksf c = jb1Var.c(0);
                ksf c2 = jb1Var.c(1);
                ksf c3 = jb1Var.c(2);
                String t = c.t(jb1Var.d());
                String t2 = c2.t(jb1Var.d());
                String t3 = c3.t(jb1Var.d());
                if (!(e9v.z(e9v.this) == null || (b = e9v.z(e9v.this).b(t, t2)) == null)) {
                    try {
                        b.a(t3);
                    } catch (Throwable unused) {
                    }
                }
                c.delete();
                c2.delete();
                c3.delete();
                Log.e("UltronJSIEngine", t3 == null ? "null" : t3);
                String w = e9v.w(e9v.this);
                UnifyLog.m(w, "UltronJSIEngine", "bridge.call(): " + t3, new String[0]);
            } catch (Throwable th) {
                Log.e("UltronJSIEngine", "bridge.call() crashed: " + th.toString());
                String w2 = e9v.w(e9v.this);
                UnifyLog.m(w2, "UltronJSIEngine", "bridge.call() crashed: " + th.toString(), new String[0]);
            }
            return super.onCallFunction(jb1Var);
        }
    }

    public final boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a66e4be", new Object[]{this})).booleanValue();
        }
        WVJsi.InstanceBuilder instanceBuilder = WVJsi.instanceBuilder(this.e);
        WVJsi.InstanceBuilder name = instanceBuilder.name("new_ultron_" + n.getAndIncrement());
        WVJsi.InstanceResult build = name.dataDir("new_ultron_" + this.f).version("1.0").bizName(this.f).build();
        if (build == null || !build.isSuccess()) {
            return false;
        }
        this.c = build.getJsEngine();
        return true;
    }

    public final boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a04a49a", new Object[]{this})).booleanValue();
        }
        Bundle bundle = new Bundle();
        String v8SoPath = WVCore.getInstance().getV8SoPath();
        if (v8SoPath == null) {
            return false;
        }
        bundle.putString("jsiSoPath", v8SoPath.replace("libwebviewuc.so", "libjsi.so"));
        bundle.putString("jsEngineSoPath", v8SoPath);
        JSEngine.loadSo(this.e, bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", "new_ultron_" + n.getAndIncrement());
        bundle2.putString("version", "1.0");
        bundle2.putString("datadir", "new_ultron_" + this.f);
        this.c = JSEngine.createInstance(this.e, bundle2);
        return true;
    }

    public final void K(String str, List<String> list) {
        ksf[] ksfVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636b7cf6", new Object[]{this, str, list});
            return;
        }
        dqf dqfVar = this.d;
        if (dqfVar.k().isDisposed()) {
            U("JSEngine disposed");
        } else if (dqfVar.r()) {
            U("JSContext disposed");
        } else {
            ye8 ye8Var = new ye8(dqfVar.k());
            try {
                ksf h2 = this.d.h(str);
                if (h2 != null) {
                    oqf oqfVar = (oqf) h2;
                    if (list == null || list.isEmpty()) {
                        ksfVarArr = null;
                    } else {
                        ksfVarArr = new ksf[list.size()];
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            ksfVarArr[i2] = new esf(list.get(i2));
                        }
                    }
                    ksf M = oqfVar.M(this.d, null, ksfVarArr);
                    if (M != null) {
                        T(dqfVar, M.t(dqfVar));
                        M.delete();
                    } else {
                        kqf g2 = this.d.g();
                        if (g2 != null) {
                            g2.delete();
                            W((((("name: " + g2.c(this.d)) + "; message: ") + g2.b(this.d)) + "; stack: ") + g2.d(this.d));
                        } else {
                            U("get exception failed");
                        }
                        g2.delete();
                    }
                    if (ksfVarArr != null) {
                        for (ksf ksfVar : ksfVarArr) {
                            ksfVar.delete();
                        }
                    }
                    h2.delete();
                } else {
                    U("get global failed, method : " + str);
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
