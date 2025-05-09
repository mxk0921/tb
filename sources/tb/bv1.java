package tb;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.alibaba.android.aura.taobao.adapter.pageevent.AURAPageEventStrategy;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.themis.graphics.JNIBridge;
import com.taobao.android.themis.graphics.a;
import com.taobao.android.themis.graphics.audio.AudioContextFactory;
import com.taobao.themis.canvas.canvas.CanvasJSAPIBridge;
import com.taobao.themis.inside.adapter.TLogAdapterImpl;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.page.ITMSPage;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.text.Regex;
import tb.iwd;
import tb.s8c;
import tb.w5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class bv1 implements s8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f16645a;
    public final CanvasJSAPIBridge b;
    public com.taobao.android.themis.graphics.a c;
    public String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(834666544);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements AudioContextFactory.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements iwd.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ rhb f16647a;

            public a(rhb rhbVar) {
                this.f16647a = rhbVar;
            }

            @Override // tb.iwd.a
            public void fireEvent(String str, JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
                    return;
                }
                ckf.g(str, "event");
                ckf.g(jSONObject, "jsonObject");
                this.f16647a.c(str, jSONObject);
            }
        }

        public b() {
        }

        @Override // com.taobao.android.themis.graphics.audio.AudioContextFactory.a
        public final rhb a(String str) {
            iwd iwdVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rhb) ipChange.ipc$dispatch("eebf485d", new Object[]{this, str});
            }
            uhb uhbVar = (uhb) bv1.this.h().getExtension(uhb.class);
            if (uhbVar == null) {
                iwdVar = null;
            } else {
                ckf.f(str, "id");
                iwdVar = uhbVar.U0(str);
            }
            if (iwdVar == null) {
                return null;
            }
            wh1 wh1Var = new wh1(iwdVar);
            iwdVar.d(new a(wh1Var));
            return wh1Var;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements JNIBridge.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference<CanvasJSAPIBridge> f16648a;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ WeakReference<CanvasJSAPIBridge> f16649a;
            public final /* synthetic */ String b;
            public final /* synthetic */ JNIBridge.h c;

            public a(WeakReference<CanvasJSAPIBridge> weakReference, String str, JNIBridge.h hVar) {
                this.f16649a = weakReference;
                this.b = str;
                this.c = hVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                CanvasJSAPIBridge canvasJSAPIBridge = this.f16649a.get();
                if (canvasJSAPIBridge != null) {
                    canvasJSAPIBridge.callAriverAPI(JSON.parseObject(this.b), this.c);
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ WeakReference<CanvasJSAPIBridge> f16650a;
            public final /* synthetic */ ByteBuffer b;
            public final /* synthetic */ JNIBridge.h c;

            public b(WeakReference<CanvasJSAPIBridge> weakReference, ByteBuffer byteBuffer, JNIBridge.h hVar) {
                this.f16650a = weakReference;
                this.b = byteBuffer;
                this.c = hVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                CanvasJSAPIBridge canvasJSAPIBridge = this.f16650a.get();
                if (canvasJSAPIBridge != null) {
                    canvasJSAPIBridge.callAriverAPI(pmi.a().b(this.b), this.c);
                }
            }
        }

        public c(WeakReference<CanvasJSAPIBridge> weakReference) {
            this.f16648a = weakReference;
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.i
        public void a(ByteBuffer byteBuffer, JNIBridge.h hVar) {
            Executor executor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cee8c9e4", new Object[]{this, byteBuffer, hVar});
                return;
            }
            ckf.g(byteBuffer, "params");
            ckf.g(hVar, "handler");
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) != null) {
                executor.execute(new b(this.f16648a, byteBuffer, hVar));
            }
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.i
        public void b(String str, JNIBridge.h hVar) {
            Executor executor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d942c6e4", new Object[]{this, str, hVar});
                return;
            }
            ckf.g(str, "params");
            ckf.g(hVar, "handler");
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) != null) {
                executor.execute(new a(this.f16648a, str, hVar));
            }
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.i
        public void c(JSONObject jSONObject, JNIBridge.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e57eaf6a", new Object[]{this, jSONObject, hVar});
                return;
            }
            ckf.g(jSONObject, "params");
            ckf.g(hVar, "handler");
            if (q9s.u1()) {
                CanvasJSAPIBridge canvasJSAPIBridge = this.f16648a.get();
                if (canvasJSAPIBridge != null) {
                    canvasJSAPIBridge.callAriverAPI(jSONObject, hVar);
                    return;
                }
                return;
            }
            CanvasJSAPIBridge canvasJSAPIBridge2 = this.f16648a.get();
            if (canvasJSAPIBridge2 != null) {
                canvasJSAPIBridge2.callAriverAPI(JSON.parseObject(jSONObject.toString()), hVar);
            }
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.i
        public JSONObject d(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("a58408f8", new Object[]{this, jSONObject});
            }
            ckf.g(jSONObject, "params");
            try {
                CanvasJSAPIBridge canvasJSAPIBridge = this.f16648a.get();
                JSONObject callAriverAPISync = canvasJSAPIBridge == null ? null : canvasJSAPIBridge.callAriverAPISync(jSONObject);
                return callAriverAPISync == null ? new JSONObject() : callAriverAPISync;
            } catch (JSONException e) {
                TMSLogger.c("TMSBaseGameJSRuntimeExtension", "onDispatchAriverAPISync", e);
                return new JSONObject();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements JNIBridge.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public d(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.l
        public void a(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7fba4cd", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else if (!TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.b)) {
                String str = this.c;
                ckf.f(str, "appId");
                vbs.l(str, this.b, i, i2, i3, i4);
            }
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.l
        public void b(int i, int i2, int i3, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19a76eab", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), str});
                return;
            }
            ckf.g(str, pg1.ATOM_stack);
            if (!TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.b)) {
                String str2 = this.c;
                ckf.f(str2, "appId");
                vbs.m(str2, this.b, i, i2, i3, str);
            }
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.l
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d88a95c", new Object[]{this, str});
                return;
            }
            ckf.g(str, pg1.ATOM_stack);
            String L = bv1.this.h().getInstance().L();
            if (L != null && L.length() != 0 && !TextUtils.isEmpty(this.b)) {
                String str2 = this.c;
                ckf.f(str2, "appId");
                vbs.o(str2, this.b, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements JNIBridge.m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16652a;
        public final /* synthetic */ String b;

        public e(String str, String str2) {
            this.f16652a = str;
            this.b = str2;
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.m
        public void a(int i, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("829d0843", new Object[]{this, new Integer(i), new Double(d)});
            } else if (!TextUtils.isEmpty(this.f16652a) && !TextUtils.isEmpty(this.b)) {
                String str = this.f16652a;
                ckf.f(str, "appId");
                vbs.n(str, this.b, i, d);
            }
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.m
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2792e429", new Object[]{this, str});
                return;
            }
            ckf.g(str, "backtrace");
            if (!TextUtils.isEmpty(this.f16652a) && !TextUtils.isEmpty(this.b)) {
                String str2 = this.f16652a;
                ckf.f(str2, "appId");
                vbs.j(str2, this.b, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class g implements JNIBridge.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.k
        public final void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af48699b", new Object[]{this, str, str2});
                return;
            }
            bbs instance = bv1.this.h().getInstance();
            ckf.f(str2, "message");
            vbs.k(instance, str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class h implements IConfigAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference<com.taobao.android.themis.graphics.a> f16655a;

        public h(WeakReference<com.taobao.android.themis.graphics.a> weakReference) {
            this.f16655a = weakReference;
        }

        @Override // com.taobao.themis.kernel.adapter.IConfigAdapter.a
        public final void a(Map<String, String> map) {
            com.taobao.android.themis.graphics.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("943a89b4", new Object[]{this, map});
            } else if (map != null && (aVar = this.f16655a.get()) != null) {
                aVar.x(map);
            }
        }
    }

    static {
        t2o.a(834666543);
        t2o.a(843055248);
    }

    public bv1(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f16645a = iTMSPage;
        this.b = new CanvasJSAPIBridge(iTMSPage);
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            s8c.a.b(this, iTMSPage);
        }
    }

    @Override // tb.s8c
    public void I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10971ca7", new Object[]{this});
            return;
        }
        r();
        if (!M()) {
            n();
        }
        if (!s()) {
            l();
        }
    }

    public final boolean M() {
        String str;
        com.taobao.android.themis.graphics.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17e76e94", new Object[]{this})).booleanValue();
        }
        ekd ekdVar = (ekd) this.f16645a.getInstance().getExtension(ekd.class);
        if (ekdVar == null) {
            str = null;
        } else {
            str = ekdVar.c0();
        }
        if (str == null || str.length() == 0 || (aVar = this.c) == null) {
            return false;
        }
        aVar.s(str, "https://hybrid.miniapp.taobao.com/gm.fm.dev.js");
        return true;
    }

    public final void O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98a0c1ef", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            s8c.a.c(this);
        }
    }

    @Override // tb.s8c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ((IConfigAdapter) p8s.g(IConfigAdapter.class)).unregisterListener("themis_graphics_android");
        com.taobao.android.themis.graphics.a aVar = this.c;
        if (aVar != null) {
            aVar.d();
        }
        this.c = null;
        this.b.onDestroy();
    }

    @Override // tb.s8c
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        ckf.g(motionEvent, "event");
        com.taobao.android.themis.graphics.a aVar = this.c;
        if (aVar == null) {
            return false;
        }
        return aVar.dispatchTouchEvent(motionEvent);
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b0b73cf", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.s8c
    public void f0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be03ef5", new Object[]{this, str});
            return;
        }
        ckf.g(str, "canvasId");
        this.d = str;
        com.taobao.android.themis.graphics.a aVar = new com.taobao.android.themis.graphics.a(a(str).a());
        WeakReference weakReference = new WeakReference(aVar);
        IConfigAdapter iConfigAdapter = (IConfigAdapter) p8s.b(IConfigAdapter.class);
        if (iConfigAdapter != null) {
            iConfigAdapter.registerListener("themis_graphics_android", new h(weakReference));
            Map<String, String> configs = iConfigAdapter.getConfigs("themis_graphics_android");
            if (configs != null) {
                aVar.x(configs);
            }
        }
        if (!aVar.c()) {
            TMSLogger.b("TMSBaseGameJSRuntimeExtension", "初始化失败");
            return;
        }
        String L = h().getInstance().L();
        w5d w5dVar = (w5d) h().getExtension(w5d.class);
        if (w5dVar != null) {
            w5dVar.A(new i(L, this));
        }
        this.c = aVar;
    }

    public final com.taobao.android.themis.graphics.a g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.themis.graphics.a) ipChange.ipc$dispatch("cae6dc4b", new Object[]{this});
        }
        return this.c;
    }

    public final ITMSPage h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("b17e45f5", new Object[]{this});
        }
        return this.f16645a;
    }

    @Override // tb.s8c
    public void j0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a004721f", new Object[]{this});
            return;
        }
        com.taobao.android.themis.graphics.a aVar = this.c;
        if (aVar != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("url", h().c());
            hashMap.put("platform", "android");
            hashMap.put("preview", "true");
            hashMap.put("env", "online");
            hashMap.put("instanceId", f());
            if (o9s.h(h().getInstance().I())) {
                str = "debug";
            } else {
                str = "release";
            }
            hashMap.put("container", str);
            aVar.v(hashMap);
        }
    }

    public abstract void l();

    public abstract void n();

    @Override // tb.s8c
    public void p(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361bb065", new Object[]{this, str, jSONObject, new Boolean(z)});
            return;
        }
        ckf.g(str, "event");
        ckf.g(jSONObject, "params");
        com.taobao.android.themis.graphics.a aVar = this.c;
        if (aVar != null) {
            aVar.p(str, jSONObject, z);
        }
    }

    public final void r() {
        String H0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224bec60", new Object[]{this});
            return;
        }
        com.taobao.android.themis.graphics.a aVar = this.c;
        if (aVar != null) {
            String h2 = ias.h("tms_gm_api.json", this.f16645a.getInstance().I());
            ckf.f(h2, "readAssert(\n            …ance().activity\n        )");
            String str = "";
            String replace = new Regex("\n").replace(h2, str);
            String h3 = ias.h("tms_gm_event.json", this.f16645a.getInstance().I());
            ckf.f(h3, "readAssert(\n            …ance().activity\n        )");
            String replace2 = new Regex("\n").replace(h3, str);
            aVar.s("var __GAME_API_CONFIG__ = JSON.parse('" + replace + "'); var __GAME_EVENT_CONFIG__ = JSON.parse('" + replace2 + "');", "tms_gm_config");
            JSONObject jSONObject = new JSONObject();
            String h4 = h().getInstance().S().h(mop.KEY_CONTAINER_START);
            if (h4 == null) {
                h4 = str;
            }
            jSONObject.put((JSONObject) "containerInitStart", h4);
            pgd pgdVar = (pgd) h().getExtension(pgd.class);
            if (!(pgdVar == null || (H0 = pgdVar.H0()) == null)) {
                str = H0;
            }
            jSONObject.put((JSONObject) "falcoId", str);
            jSONObject.put((JSONObject) "memoryUsageLaunchStart", h().getInstance().S().f("memoryUsageLaunchStart"));
            jSONObject.put((JSONObject) "nativeMemoryUsageLaunchStart", h().getInstance().S().f("nativeMemoryUsageLaunchStart"));
            aVar.s(msq.i("\n       (function() {\n           globalThis.$AppMark=" + jSONObject + ";\n                })()\n        "), "tms_app_mark");
        }
    }

    public final boolean s() {
        String str;
        com.taobao.android.themis.graphics.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbbeb41c", new Object[]{this})).booleanValue();
        }
        ekd ekdVar = (ekd) this.f16645a.getInstance().getExtension(ekd.class);
        if (ekdVar == null) {
            str = null;
        } else {
            str = ekdVar.k();
        }
        if (str == null || str.length() == 0 || (aVar = this.c) == null) {
            return false;
        }
        aVar.s(str, "https://hybrid.miniapp.taobao.com/apifmext.hotpatch.js");
        return true;
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            s8c.a.a(this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class i implements w5d.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16656a;
        public final /* synthetic */ bv1 b;

        public i(String str, bv1 bv1Var) {
            this.f16656a = str;
            this.b = bv1Var;
        }

        @Override // tb.w5d.c
        public int getPriority() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
            }
            return 8;
        }

        @Override // tb.w5d.c
        public boolean a(ITMSPage iTMSPage, TMSBackPressedType tMSBackPressedType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("89a4e043", new Object[]{this, iTMSPage, tMSBackPressedType})).booleanValue();
            }
            ckf.g(iTMSPage, "page");
            ckf.g(tMSBackPressedType, "type");
            if (!qml.z(iTMSPage)) {
                return false;
            }
            String str = this.f16656a;
            ckf.f(str, "appId");
            if (!q9s.e(str)) {
                return false;
            }
            com.taobao.android.themis.graphics.a g = this.b.g();
            ckf.d(g);
            if (!g.r("onCloseWindow")) {
                return false;
            }
            iTMSPage.y("closeWindow", new JSONObject());
            return true;
        }
    }

    public a.f a(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.f) ipChange.ipc$dispatch("199218a0", new Object[]{this, str});
        }
        ckf.g(str, "canvasId");
        String L = this.f16645a.getInstance().L();
        String i2 = r8s.i(this.f16645a.getInstance());
        a.f k = new a.f(this.f16645a.getInstance().I().getApplication(), str).e(new b()).c(new c(new WeakReference(this.b))).j(new d(i2, L)).g(new e(L, i2)).d(new f(L, i2)).i(new g()).k(this.f16645a.getInstance().I().getResources().getDisplayMetrics().density);
        if (!l9s.c() || !l9s.d(this.f16645a.getInstance())) {
            z = false;
        }
        a.f b2 = k.f(z).b(q9s.v1());
        ckf.f(b2, "protected open fun gener…bleOptGMAsyncAPI())\n    }");
        return b2;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements JNIBridge.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16653a;
        public final /* synthetic */ String b;

        public f(String str, String str2) {
            this.f16653a = str;
            this.b = str2;
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.j
        public final void a(double d, double d2, double d3, List<String> list, List<String> list2, Map<String, Double> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f3bb3bb", new Object[]{this, new Double(d), new Double(d2), new Double(d3), list, list2, map});
            } else if (!TextUtils.isEmpty(this.f16653a) && !TextUtils.isEmpty(this.b)) {
                String str = this.f16653a;
                ckf.f(str, "appId");
                String str2 = this.b;
                ckf.f(list, "latency");
                ckf.f(list2, AURAPageEventStrategy.FREQUENCY);
                vbs.b(str, TLogAdapterImpl.TLOG_MODULE, str2, d, d2, d3, list, list2);
                for (Map.Entry<String, Double> entry : map.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey())) {
                        String str3 = this.f16653a;
                        ckf.f(str3, "appId");
                        String str4 = this.b;
                        String key = entry.getKey();
                        ckf.f(key, "entry.key");
                        Double value = entry.getValue();
                        ckf.f(value, "entry.value");
                        vbs.t(str3, TLogAdapterImpl.TLOG_MODULE, str4, key, value.doubleValue());
                    }
                }
            }
        }
    }
}
