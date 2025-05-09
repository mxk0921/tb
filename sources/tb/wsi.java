package tb;

import android.util.Log;
import io.unicorn.plugin.common.FlutterException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import tb.pa2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class wsi {

    /* renamed from: a  reason: collision with root package name */
    public final pa2 f30894a;
    public final String b;
    public final xsi c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface c {
        void a(vsi vsiVar, d dVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface d {
    }

    static {
        t2o.a(945815767);
    }

    public wsi(pa2 pa2Var, String str, xsi xsiVar) {
        this.f30894a = pa2Var;
        this.b = str;
        this.c = xsiVar;
    }

    public static void e() {
        b.b();
        a.d();
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        b bVar;
        ByteBuffer e = ((drf) this.c).e(new vsi(str, obj));
        if (dVar == null) {
            bVar = null;
        } else {
            bVar = new b(this, dVar);
        }
        this.f30894a.b(this.b, e, bVar);
    }

    public void f(c cVar) {
        a aVar;
        if (cVar == null) {
            aVar = null;
        } else {
            aVar = new a(this, cVar);
        }
        this.f30894a.a(this.b, aVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements pa2.a {

        /* renamed from: a  reason: collision with root package name */
        public final wsi f30895a;
        public final c b;

        /* compiled from: Taobao */
        /* renamed from: tb.wsi$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public class C1090a implements d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ pa2.b f30896a;

            public C1090a(pa2.b bVar) {
                this.f30896a = bVar;
            }

            public void a(String str, String str2, Object obj) {
                this.f30896a.a(((drf) a.this.f30895a.c).c(str, str2, obj));
            }

            public void b() {
                this.f30896a.a(null);
            }

            public void c(Object obj) {
                this.f30896a.a(((drf) a.this.f30895a.c).f(obj));
            }
        }

        static {
            t2o.a(945815768);
            t2o.a(945815759);
        }

        public a(wsi wsiVar, c cVar) {
            this.f30895a = wsiVar;
            this.b = cVar;
        }

        @Override // tb.pa2.a
        public void a(ByteBuffer byteBuffer, pa2.b bVar) {
            wsi wsiVar = this.f30895a;
            try {
                this.b.a(((drf) wsiVar.c).b(byteBuffer), new C1090a(bVar));
            } catch (RuntimeException e) {
                Log.e("MethodChannel#" + wsiVar.b, "Failed to handle method call", e);
                bVar.a(((drf) wsiVar.c).d("error", e.getMessage(), null, c(e)));
            }
        }

        public final String c(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }

        public static void d() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b implements pa2.b {

        /* renamed from: a  reason: collision with root package name */
        public final wsi f30897a;
        public final d b;

        static {
            t2o.a(945815770);
            t2o.a(945815760);
        }

        public b(wsi wsiVar, d dVar) {
            this.f30897a = wsiVar;
            this.b = dVar;
        }

        @Override // tb.pa2.b
        public void a(ByteBuffer byteBuffer) {
            wsi wsiVar = this.f30897a;
            d dVar = this.b;
            try {
                if (byteBuffer == null) {
                    ((a.C1090a) dVar).b();
                } else {
                    try {
                        ((a.C1090a) dVar).c(((drf) wsiVar.c).a(byteBuffer));
                    } catch (FlutterException e) {
                        ((a.C1090a) dVar).a(e.code, e.getMessage(), e.details);
                    }
                }
            } catch (RuntimeException e2) {
                Log.e("MethodChannel#" + wsiVar.b, "Failed to handle method call result", e2);
            }
        }

        public static void b() {
        }
    }
}
