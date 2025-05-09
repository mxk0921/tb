package io.unicorn.adapter.muise;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.instance.WeexCanalMainInstance;
import com.taobao.android.weex.instance.WeexCanalSubInstance;
import io.unicorn.adapter.UnicornAdapterJNI;
import io.unicorn.embedding.android.RenderMode;
import io.unicorn.embedding.android.TransparencyMode;
import io.unicorn.embedding.engine.FlutterJNI;
import io.unicorn.embedding.engine.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import tb.bs9;
import tb.dhv;
import tb.dwh;
import tb.g5x;
import tb.is9;
import tb.q6x;
import tb.qbq;
import tb.r6x;
import tb.rrd;
import tb.t2o;
import tb.u8x;
import tb.w4x;
import tb.wid;
import tb.x8x;
import tb.xid;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class UnicornMuiseJNI {
    private static final String PREFIX_ENGINE_ID = "Weex_";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements wid {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeexInstanceImpl f15165a;
        public final /* synthetic */ long b;

        public a(WeexInstanceImpl weexInstanceImpl, long j) {
            this.f15165a = weexInstanceImpl;
            this.b = j;
        }

        public void a(WeexInstanceImpl weexInstanceImpl) {
            UnicornMuiseJNI.createUnicornComponent(this.f15165a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class c implements qbq {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rrd f15167a;

        public c(rrd rrdVar) {
            this.f15167a = rrdVar;
        }

        public View a(Context context, Bundle bundle) {
            return this.f15167a.b(context, bundle);
        }

        public void b(Runnable runnable) {
            this.f15167a.a(runnable);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class d extends yio {
        final /* synthetic */ WeexInstanceImpl d;
        final /* synthetic */ String e;
        final /* synthetic */ int f;
        final /* synthetic */ double g;
        final /* synthetic */ double h;

        public d(WeexInstanceImpl weexInstanceImpl, String str, int i, double d, double d2) {
            this.d = weexInstanceImpl;
            this.e = str;
            this.f = i;
            this.g = d;
            this.h = d2;
        }

        @Override // tb.yio
        public void e() throws Exception {
            if (this.d != null) {
                u8x.a("createEmbedUnicornComponentAsync");
                synchronized (this.d) {
                    try {
                        if (this.d.isDestroyed()) {
                            u8x.b("createEmbedUnicornComponentAsync");
                            return;
                        }
                        WeexInstance D = ((x8x) this.d.getExtend(q6x.class)).D(this.d.getContext(), this.e, this.f, (float) this.g, (float) this.h);
                        D.initWithURL(this.e);
                        D.render(null);
                        u8x.b("createEmbedUnicornComponentAsync");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class e implements FlutterJNI.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeexInstanceImpl f15168a;
        public final /* synthetic */ io.unicorn.embedding.engine.a b;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;
        public final /* synthetic */ x8x e;

        public e(WeexInstanceImpl weexInstanceImpl, io.unicorn.embedding.engine.a aVar, String str, long j, x8x x8xVar) {
            this.f15168a = weexInstanceImpl;
            this.b = aVar;
            this.c = str;
            this.d = j;
            this.e = x8xVar;
        }

        @Override // io.unicorn.embedding.engine.FlutterJNI.d
        public void onReady() {
            if (this.f15168a.isDestroyed()) {
                dwh.e("shell async onReady return, isDestroyed");
                this.b.n();
                bs9.b().f(this.c);
                return;
            }
            dwh.e("shell async onReady success");
            UnicornMuiseJNI.bindUnicornComponentWithEngine(this.b, this.c, this.f15168a, this.d, this.e);
        }
    }

    static {
        t2o.a(945815611);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bindUnicornComponentWithEngine(io.unicorn.embedding.engine.a aVar, String str, WeexInstanceImpl weexInstanceImpl, long j, x8x x8xVar) {
        u8x.a("bindUnicornComponentWithEngine");
        bindUnicornEngineId(aVar.r().getUnicornEngineId(), j);
        aVar.t().e0(weexInstanceImpl);
        dhv.a X = dhv.X(str);
        X.c(true);
        WeexUnicornConfig f = weexInstanceImpl.getInstanceConfig().f();
        if (f == null) {
            f = new WeexUnicornConfig();
        }
        RenderMode renderMode = RenderMode.surface;
        if (f.c() == WeexUnicornConfig.RenderMode.texture) {
            renderMode = RenderMode.texture;
        } else if (f.c() == WeexUnicornConfig.RenderMode.image) {
            renderMode = RenderMode.image;
        } else if (f.c() == WeexUnicornConfig.RenderMode.offscreen) {
            renderMode = RenderMode.offscreen;
        }
        X.e(renderMode);
        if (f.f()) {
            X.g(TransparencyMode.transparent);
        }
        rrd K = x8xVar.K();
        if (K != null) {
            X.f(new c(K));
        }
        dhv a2 = X.a(weexInstanceImpl.getContext());
        a2.T(j);
        x8xVar.x(a2);
        u8x.b("bindUnicornComponentWithEngine");
    }

    private static void bindUnicornEngineId(long j, long j2) {
        if (j != 0) {
            nativeBindUnicornEngineId(j, j2);
        }
    }

    public static void createEmbedUnicornComponent(WeexInstanceImpl weexInstanceImpl, String str, double d2, double d3, int i) {
        if (weexInstanceImpl != null && !weexInstanceImpl.isDestroyed()) {
            WeexInstance C = ((x8x) weexInstanceImpl.getExtend(q6x.class)).C(weexInstanceImpl.getContext(), str, i, (float) d2, (float) d3);
            C.initWithURL(str);
            C.render(null);
        }
    }

    public static void createEmbedUnicornComponentAsync(WeexInstanceImpl weexInstanceImpl, String str, double d2, double d3, int i) {
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new d(weexInstanceImpl, str, i, d2, d3));
    }

    public static void createUnicornComponent(WeexInstanceImpl weexInstanceImpl, long j) {
        String str;
        io.unicorn.embedding.engine.a aVar;
        boolean z;
        u8x.a("createUnicornComponent");
        int instanceId = weexInstanceImpl.getInstanceId();
        x8x x8xVar = (x8x) weexInstanceImpl.getExtend(q6x.class);
        boolean N = x8xVar.N();
        ArrayList arrayList = new ArrayList(x8xVar.L());
        Context context = weexInstanceImpl.getContext();
        if ((context instanceof Activity) && "com.unicorn.playground".equals(context.getPackageName())) {
            Activity activity = (Activity) context;
            if (activity.getIntent() != null) {
                arrayList.addAll(Arrays.asList(is9.a(activity.getIntent()).b()));
            }
        }
        boolean z2 = weexInstanceImpl instanceof WeexCanalSubInstance;
        boolean z3 = false;
        if (z2) {
            str = ((WeexCanalSubInstance) weexInstanceImpl).createEngine((String[]) arrayList.toArray(new String[0]));
        } else {
            str = PREFIX_ENGINE_ID + instanceId;
        }
        if (N) {
            bindUnicornEngineId(bs9.b().a(PREFIX_ENGINE_ID + x8xVar.H().getInstanceId()).r().getUnicornEngineId(), j);
            u8x.b("createUnicornComponent");
            return;
        }
        if (z2 || !w4x.e() || context == null) {
            aVar = null;
        } else {
            aVar = bs9.b().c();
            if (aVar != null) {
                u8x.a("reuseUnicornEngine");
                aVar.z(context, (String[]) arrayList.toArray(new String[0]));
                bs9.b().d(str, aVar);
                u8x.b("reuseUnicornEngine");
            }
        }
        if (aVar == null) {
            if (!arrayList.contains("--enable-async-shell-setup2=true") || z2) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add("--use-async-setup=true");
                aVar = createUnicornEngineAsync(weexInstanceImpl, (String[]) arrayList.toArray(new String[0]), str, j, x8xVar);
            } else {
                aVar = createUnicornEngine(weexInstanceImpl, str, (String[]) arrayList.toArray(new String[0]));
            }
            z3 = z;
        }
        aVar.A(!z2);
        aVar.g(new b(x8xVar));
        if (!z3) {
            bindUnicornComponentWithEngine(aVar, str, weexInstanceImpl, j, x8xVar);
        }
        u8x.b("createUnicornComponent");
    }

    public static void createUnicornComponentController(WeexInstanceImpl weexInstanceImpl, long j) {
        u8x.a("createUnicornComponentController");
        ((x8x) weexInstanceImpl.getExtend(q6x.class)).w(new a(weexInstanceImpl, j));
        u8x.b("createUnicornComponentController");
    }

    private static io.unicorn.embedding.engine.a createUnicornEngine(WeexInstanceImpl weexInstanceImpl, String str, String[] strArr) {
        u8x.a("createUnicornEngine");
        Context context = weexInstanceImpl.getContext();
        io.unicorn.embedding.engine.a a2 = bs9.b().a(str);
        if (a2 == null && UnicornAdapterJNI.instance().libraryLoaded() && context != null) {
            a2 = new io.unicorn.embedding.engine.a(context, (String[]) null, strArr);
            bs9.b().d(str, a2);
        }
        u8x.b("createUnicornEngine");
        return a2;
    }

    private static io.unicorn.embedding.engine.a createUnicornEngineAsync(WeexInstanceImpl weexInstanceImpl, String[] strArr, String str, long j, x8x x8xVar) {
        u8x.a("createUnicornEngine");
        Context context = weexInstanceImpl.getContext();
        io.unicorn.embedding.engine.a a2 = bs9.b().a(str);
        if (a2 == null && UnicornAdapterJNI.instance().libraryLoaded() && context != null) {
            io.unicorn.embedding.engine.a aVar = new io.unicorn.embedding.engine.a(context, true);
            dwh.e("create engine async put engine with id:" + str);
            bs9.b().d(str, aVar);
            aVar.h(new e(weexInstanceImpl, aVar, str, j, x8xVar));
            aVar.i(context, strArr);
            a2 = aVar;
        }
        u8x.b("createUnicornEngine");
        return a2;
    }

    public static void createUnicornEngineGroup(WeexInstanceImpl weexInstanceImpl) {
        WeexCanalMainInstance weexCanalMainInstance = (WeexCanalMainInstance) weexInstanceImpl;
        weexCanalMainInstance.setEngineGroup(new g5x(weexInstanceImpl.getContext(), null, (String[]) weexCanalMainInstance.getUnicornConfigStrings().toArray(new String[0])));
    }

    public static void createWidgetUnicornComponent(WeexInstanceImpl weexInstanceImpl, double d2, double d3, int i, HashMap<String, String> hashMap) {
        ((r6x) weexInstanceImpl.getExtend(r6x.class)).createWidgetComponent(i, hashMap);
    }

    public static void destroyEmbedUnicornComponent(WeexInstanceImpl weexInstanceImpl, int i) {
        destroyExternalUnicornComponent(weexInstanceImpl, i);
    }

    public static void destroyExternalUnicornComponent(WeexInstanceImpl weexInstanceImpl, int i) {
        if (weexInstanceImpl != null) {
            ((r6x) weexInstanceImpl.getExtend(r6x.class)).destroyWidgetComponent(i);
            x8x x8xVar = (x8x) weexInstanceImpl.getExtend(q6x.class);
            WeexInstance F = x8xVar.F(i);
            if (F != null) {
                x8xVar.a0(i);
                F.destroy();
            }
        }
    }

    public static void destroyRenderEngine(long j) {
        nativeDestroyRenderEngine(j);
    }

    public static void destroyWidgetUnicornComponent(WeexInstanceImpl weexInstanceImpl, int i) {
        destroyExternalUnicornComponent(weexInstanceImpl, i);
    }

    public static HashMap<String, String> getPerformanceInfo(long j) {
        return nativeGetUnicornMuiseFirstScreenInfo(j, false);
    }

    public static int getUnicornAverageFPS(WeexInstanceImpl weexInstanceImpl) {
        x8x x8xVar;
        xid f;
        if (weexInstanceImpl == null || (x8xVar = (x8x) weexInstanceImpl.getExtend(q6x.class)) == null || (f = x8xVar.f()) == null) {
            return 0;
        }
        return f.p();
    }

    public static HashMap<String, String> getUnicornMuiseFirstScreenInfo(long j) {
        return nativeGetUnicornMuiseFirstScreenInfo(j, true);
    }

    public static void initAfterSDKLoad() {
        try {
            nativeInitAfterSDKLoad();
        } catch (Throwable th) {
            dwh.i(th);
        }
    }

    private static native void nativeBindUnicornEngineId(long j, long j2);

    private static native void nativeDestroyRenderEngine(long j);

    private static native HashMap<String, String> nativeGetUnicornMuiseFirstScreenInfo(long j, boolean z);

    private static native void nativeInitAfterSDKLoad();

    public static void updateEmbedUnicornComponent(WeexInstanceImpl weexInstanceImpl, String str, double d2, double d3, int i) {
        destroyEmbedUnicornComponent(weexInstanceImpl, i);
        createEmbedUnicornComponent(weexInstanceImpl, str, d2, d3, i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x8x f15166a;

        public b(x8x x8xVar) {
            this.f15166a = x8xVar;
        }

        @Override // io.unicorn.embedding.engine.a.b
        public void a() {
            Map<Integer, WeexInstance> G = this.f15166a.G();
            for (Map.Entry<Integer, WeexInstance> entry : G.entrySet()) {
                entry.getValue().destroy();
            }
            G.clear();
        }

        @Override // io.unicorn.embedding.engine.a.b
        public void b() {
        }
    }

    public static void updateWidgetUnicornComponent(WeexInstanceImpl weexInstanceImpl, String str, double d2, double d3, int i) {
    }
}
