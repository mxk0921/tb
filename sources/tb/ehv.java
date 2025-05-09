package tb;

import io.unicorn.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import tb.pa2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ehv implements pa2 {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f18585a;
    public final khv b;
    public final pa2 c;
    public final pa2.a d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class c implements pa2 {

        /* renamed from: a  reason: collision with root package name */
        public final khv f18587a;

        static {
            t2o.a(945815724);
            t2o.a(945815758);
        }

        @Override // tb.pa2
        public void a(String str, pa2.a aVar) {
            this.f18587a.a(str, aVar);
        }

        @Override // tb.pa2
        public void b(String str, ByteBuffer byteBuffer, pa2.b bVar) {
            this.f18587a.b(str, byteBuffer, bVar);
        }

        public c(khv khvVar) {
            this.f18587a = khvVar;
        }

        public static void c() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface d {
    }

    static {
        t2o.a(945815721);
        t2o.a(945815758);
    }

    public ehv(FlutterJNI flutterJNI) {
        b bVar = new b(this);
        this.f18585a = flutterJNI;
        khv khvVar = new khv(flutterJNI);
        this.b = khvVar;
        khvVar.a("unicorn/isolate", bVar);
        this.c = new c(khvVar);
    }

    public static void h() {
        b.b();
        c.c();
    }

    @Override // tb.pa2
    public void a(String str, pa2.a aVar) {
        ((c) this.c).a(str, aVar);
    }

    @Override // tb.pa2
    public void b(String str, ByteBuffer byteBuffer, pa2.b bVar) {
        ((c) this.c).b(str, byteBuffer, bVar);
    }

    public void e() {
        FlutterJNI flutterJNI = this.f18585a;
        if (flutterJNI.isAttached()) {
            flutterJNI.notifyLowMemoryWarning();
        }
    }

    public void f() {
        hdh.e("ScriptExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f18585a.setPlatformMessageHandler(this.b);
    }

    public void g() {
        hdh.e("ScriptExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f18585a.setPlatformMessageHandler(null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b implements pa2.a {

        /* renamed from: a  reason: collision with root package name */
        public final ehv f18586a;

        static {
            t2o.a(945815723);
            t2o.a(945815759);
        }

        public b(ehv ehvVar) {
            this.f18586a = ehvVar;
        }

        @Override // tb.pa2.a
        public void a(ByteBuffer byteBuffer, pa2.b bVar) {
            jqq.INSTANCE.a(byteBuffer);
            ehv ehvVar = this.f18586a;
            ehvVar.getClass();
            ehvVar.getClass();
        }

        public static void b() {
        }
    }
}
