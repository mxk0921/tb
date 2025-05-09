package io.unicorn.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.unicorn.embedding.engine.FlutterJNI;
import io.unicorn.plugin.platform.PlatformViewsController;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import tb.ehv;
import tb.es9;
import tb.f5w;
import tb.fs9;
import tb.hdh;
import tb.hs9;
import tb.ke8;
import tb.m40;
import tb.o47;
import tb.png;
import tb.t2o;
import tb.u8x;
import tb.vvh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f15192a;
    public final hs9 b;
    public final ehv c;
    public final m40 d;
    public final png e;
    public final PlatformViewsController f;
    public final ke8 g;
    public f5w h;
    public final Set<b> i;
    public FlutterJNI.d j;
    public final b k;
    public boolean l;
    public boolean m;

    /* compiled from: Taobao */
    /* renamed from: io.unicorn.embedding.engine.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class C0857a implements FlutterJNI.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15193a;

        public C0857a(Context context) {
            this.f15193a = context;
        }

        @Override // io.unicorn.embedding.engine.FlutterJNI.d
        public void onReady() {
            AssetManager assets;
            boolean a2 = vvh.a();
            Context context = this.f15193a;
            if (!a2) {
                u8x.a("createPackageContext");
                assets = context.getAssets();
                u8x.b("createPackageContext");
            } else {
                try {
                    u8x.a("createPackageContext");
                    assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
                    u8x.b("createPackageContext");
                } catch (PackageManager.NameNotFoundException unused) {
                    assets = context.getAssets();
                }
            }
            a aVar = a.this;
            if (assets != null) {
                aVar.f15192a.setAssetManager(assets);
            }
            u8x.a("registerBuiltInPlatformViews");
            o47.a().b(aVar.f.D(), aVar.f15192a);
            u8x.b("registerBuiltInPlatformViews");
            aVar.l = true;
            if (aVar.j != null) {
                aVar.j.onReady();
                aVar.j = null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface b {
        void a();

        void b();
    }

    static {
        t2o.a(945815677);
    }

    public a(Context context) {
        this(context, null, new FlutterJNI(), new PlatformViewsController(), null, null, false);
    }

    public static void y() {
        c.c();
    }

    public void A(boolean z) {
        this.m = z;
    }

    public a B(Context context, String[] strArr) {
        if (w()) {
            return new a(context, (fs9) null, this.f15192a.spawn(strArr));
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    public void g(b bVar) {
        ((HashSet) this.i).add(bVar);
    }

    public void h(FlutterJNI.d dVar) {
        this.j = dVar;
    }

    public void i(Context context, String[] strArr) {
        C0857a aVar = new C0857a(context);
        FlutterJNI flutterJNI = this.f15192a;
        flutterJNI.addShellSetupListener(aVar);
        if (!flutterJNI.isAttached()) {
            l(strArr);
        }
    }

    public void j(Context context) {
        this.f.c(context, this.b, this.c);
    }

    public final void k(Context context, String[] strArr) {
        AssetManager assets;
        FlutterJNI flutterJNI = this.f15192a;
        if (!flutterJNI.isAttached()) {
            u8x.a("attachToJni");
            l(strArr);
            u8x.b("attachToJni");
            if (!vvh.a()) {
                u8x.a("createPackageContext");
                assets = context.getAssets();
                u8x.b("createPackageContext");
            } else {
                try {
                    u8x.a("createPackageContext");
                    AssetManager assets2 = context.createPackageContext(context.getPackageName(), 0).getAssets();
                    u8x.b("createPackageContext");
                    assets = assets2;
                } catch (PackageManager.NameNotFoundException unused) {
                    assets = context.getAssets();
                }
            }
            if (assets != null) {
                flutterJNI.setAssetManager(assets);
            }
        }
        u8x.a("registerBuiltInPlatformViews");
        o47.a().b(this.f.D(), flutterJNI);
        u8x.b("registerBuiltInPlatformViews");
    }

    public final void l(String[] strArr) {
        hdh.e("FlutterEngine", "Attaching to JNI.");
        this.f15192a.attachToNative(strArr);
        if (!w()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    public boolean m() {
        return this.m;
    }

    public void n() {
        hdh.e("FlutterEngine", "Destroying.");
        Iterator it = ((HashSet) this.i).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        f5w f5wVar = this.h;
        if (f5wVar != null) {
            f5wVar.d();
        }
        PlatformViewsController platformViewsController = this.f;
        platformViewsController.q();
        platformViewsController.R();
        this.c.g();
        b bVar = this.k;
        FlutterJNI flutterJNI = this.f15192a;
        flutterJNI.removeEngineLifecycleListener(bVar);
        flutterJNI.detachFromNativeAndReleaseResources();
    }

    public void o() {
        HashSet hashSet = (HashSet) this.i;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        hashSet.clear();
        this.h.d();
        this.h = null;
        this.g.d();
        PlatformViewsController platformViewsController = this.f;
        platformViewsController.q();
        platformViewsController.R();
        this.f15192a.detachToNative();
        this.j = null;
    }

    public m40 p() {
        return this.d;
    }

    public ke8 q() {
        return this.g;
    }

    public FlutterJNI r() {
        return this.f15192a;
    }

    public png s() {
        return this.e;
    }

    public PlatformViewsController t() {
        return this.f;
    }

    public hs9 u() {
        return this.b;
    }

    public ehv v() {
        return this.c;
    }

    public final boolean w() {
        return this.f15192a.isAttached();
    }

    public boolean x() {
        return this.l;
    }

    public void z(Context context, String[] strArr) {
        this.h = new f5w(this.c, this.b, context);
        FlutterJNI flutterJNI = this.f15192a;
        flutterJNI.reattachToNative(strArr);
        o47.a().b(this.f.D(), flutterJNI);
    }

    public a(Context context, String[] strArr) {
        this(context, null, new FlutterJNI(), new PlatformViewsController(), strArr, null, false);
    }

    public a(Context context, String[] strArr, String[] strArr2) {
        this(context, null, new FlutterJNI(), new PlatformViewsController(), strArr, strArr2, false);
    }

    public a(Context context, boolean z) {
        this(context, null, new FlutterJNI(), new PlatformViewsController(), null, null, z);
    }

    public a(Context context, fs9 fs9Var, FlutterJNI flutterJNI) {
        this(context, fs9Var, flutterJNI, new PlatformViewsController(), null, null, false);
    }

    public a(Context context, fs9 fs9Var, FlutterJNI flutterJNI, PlatformViewsController platformViewsController, String[] strArr, String[] strArr2, boolean z) {
        new HashSet();
        this.i = new HashSet();
        c cVar = new c(this);
        this.k = cVar;
        this.l = false;
        this.m = false;
        u8x.a("UnicornExecutorAttach");
        ehv ehvVar = new ehv(flutterJNI);
        this.c = ehvVar;
        ehvVar.f();
        u8x.b("UnicornExecutorAttach");
        u8x.a("createChannel");
        this.d = new m40(ehvVar, flutterJNI);
        this.e = new png(ehvVar);
        this.g = new ke8(ehvVar);
        u8x.b("createChannel");
        u8x.a("setupFlutterJNI");
        this.f15192a = flutterJNI;
        fs9Var = fs9Var == null ? es9.b().a() : fs9Var;
        if (!flutterJNI.isAttached()) {
            fs9Var.b(context.getApplicationContext(), strArr);
        }
        flutterJNI.addEngineLifecycleListener(cVar);
        flutterJNI.setPlatformViewsController(platformViewsController);
        hs9 hs9Var = new hs9(flutterJNI);
        this.b = hs9Var;
        this.h = new f5w(ehvVar, hs9Var, context);
        this.f = platformViewsController;
        platformViewsController.P();
        u8x.b("setupFlutterJNI");
        if (!z) {
            k(context, strArr2);
            this.l = true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final a f15194a;

        static {
            t2o.a(945815680);
            t2o.a(945815679);
        }

        public c(a aVar) {
            this.f15194a = aVar;
        }

        @Override // io.unicorn.embedding.engine.a.b
        public void b() {
            hdh.e("FlutterEngine", "onPreEngineRestart()");
            a aVar = this.f15194a;
            Iterator it = ((HashSet) aVar.i).iterator();
            while (it.hasNext()) {
                ((b) it.next()).b();
            }
            aVar.f.V();
        }

        public static void c() {
        }

        @Override // io.unicorn.embedding.engine.a.b
        public void a() {
        }
    }
}
