package tb;

import android.util.Log;
import java.nio.ByteBuffer;
import tb.m40;
import tb.pa2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class t42<T> {
    public static final String CHANNEL_BUFFERS_CHANNEL = "dev.flutter/channel-buffers";

    /* renamed from: a  reason: collision with root package name */
    public final pa2 f28474a;
    public final String b;
    public final qmi<T> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b<T> implements pa2.a {

        /* renamed from: a  reason: collision with root package name */
        public final d<T> f28475a;
        public final t42<T> b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public class a implements e<T> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ pa2.b f28476a;

            public a(pa2.b bVar) {
                this.f28476a = bVar;
            }

            public void a(T t) {
                this.f28476a.a(b.this.b.c.b(t));
            }
        }

        static {
            t2o.a(945815753);
            t2o.a(945815759);
        }

        @Override // tb.pa2.a
        public void a(ByteBuffer byteBuffer, pa2.b bVar) {
            t42<T> t42Var = this.b;
            try {
                ((m40.b) this.f28475a).a(t42Var.c.a(byteBuffer), new a(bVar));
            } catch (RuntimeException e) {
                Log.e("BasicMessageChannel#" + t42Var.b, "Failed to handle message", e);
                bVar.a(null);
            }
        }

        public b(t42<T> t42Var, d<T> dVar) {
            this.b = t42Var;
            this.f28475a = dVar;
        }

        public static void c() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class c implements pa2.b {

        /* renamed from: a  reason: collision with root package name */
        public final e<T> f28477a;

        static {
            t2o.a(945815755);
            t2o.a(945815760);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tb.pa2.b
        public void a(ByteBuffer byteBuffer) {
            t42 t42Var = t42.this;
            try {
                ((b.a) this.f28477a).a(t42Var.c.a(byteBuffer));
            } catch (RuntimeException e) {
                Log.e("BasicMessageChannel#" + t42Var.b, "Failed to handle message reply", e);
            }
        }

        public c(e<T> eVar) {
            this.f28477a = eVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface d<T> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface e<T> {
    }

    static {
        t2o.a(945815751);
    }

    public t42(pa2 pa2Var, String str, qmi<T> qmiVar) {
        this.f28474a = pa2Var;
        this.b = str;
        this.c = qmiVar;
    }

    public static void c() {
        b.c();
    }

    public void d(T t) {
        e(t, null);
    }

    public void e(T t, e<T> eVar) {
        ByteBuffer b2 = this.c.b(t);
        c cVar = null;
        if (eVar != null) {
            cVar = new c(eVar);
        }
        this.f28474a.b(this.b, b2, cVar);
    }

    public void f(d<T> dVar) {
        b bVar = null;
        if (dVar != null) {
            bVar = new b(dVar);
        }
        this.f28474a.a(this.b, bVar);
    }
}
