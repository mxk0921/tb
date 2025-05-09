package tb;

import android.content.Context;
import android.graphics.SurfaceTexture;
import java.util.HashMap;
import java.util.Map;
import tb.sce;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class f7w {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Long, sce> f19090a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements sce.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sce.a f19091a;

        public a(f7w f7wVar, sce.a aVar) {
            this.f19091a = aVar;
        }

        @Override // tb.sce.a
        public void a(long j) {
            this.f19091a.a(j);
        }

        @Override // tb.sce.a
        public void b(long j, long j2, long j3, int i, int i2, int i3) {
            this.f19091a.b(j, j2, j3, i, i2, i3);
        }

        @Override // tb.sce.a
        public void c(long j, int i, int i2) {
            this.f19091a.c(j, i, i2);
        }

        @Override // tb.sce.a
        public void d(long j, Map<String, Object> map) {
            this.f19091a.d(j, map);
        }

        @Override // tb.sce.a
        public void e(long j) {
            this.f19091a.e(j);
        }

        @Override // tb.sce.a
        public void f(long j) {
            this.f19091a.f(j);
        }

        @Override // tb.sce.a
        public void g(long j, Map<String, Object> map) {
            this.f19091a.g(j, map);
        }
    }

    static {
        t2o.a(945815746);
    }

    public void a(long j, String str) {
        HashMap hashMap = (HashMap) this.f19090a;
        if (hashMap.get(Long.valueOf(j)) != null) {
            ((sce) hashMap.get(Long.valueOf(j))).b(str);
        }
    }

    public void b(long j, long j2, String str, Context context, Map<String, Object> map, SurfaceTexture surfaceTexture, sce.a aVar) {
        sce a2 = ((haw) w9x.a().b()).a();
        ((HashMap) this.f19090a).put(Long.valueOf(j), a2);
        a2.c(j, j2, str, context, map, surfaceTexture, new a(this, aVar));
    }

    public void c(long j) {
        Map<Long, sce> map = this.f19090a;
        if (((HashMap) map).get(Long.valueOf(j)) != null) {
            ((sce) ((HashMap) map).get(Long.valueOf(j))).destroy();
        }
    }

    public void d() {
        Map<Long, sce> map = this.f19090a;
        for (Long l : ((HashMap) map).keySet()) {
            if (((HashMap) map).get(l) != null) {
                ((sce) ((HashMap) map).get(l)).destroy();
            }
        }
    }

    public float e(long j) {
        HashMap hashMap = (HashMap) this.f19090a;
        if (hashMap.get(Long.valueOf(j)) == null) {
            return 0.0f;
        }
        return ((sce) hashMap.get(Long.valueOf(j))).a();
    }

    public void f(long j) {
        HashMap hashMap = (HashMap) this.f19090a;
        if (hashMap.get(Long.valueOf(j)) != null) {
            ((sce) hashMap.get(Long.valueOf(j))).pause();
        }
    }

    public void g(long j) {
        HashMap hashMap = (HashMap) this.f19090a;
        if (hashMap.get(Long.valueOf(j)) != null) {
            ((sce) hashMap.get(Long.valueOf(j))).play();
        }
    }

    public void i(long j, boolean z) {
        HashMap hashMap = (HashMap) this.f19090a;
        if (hashMap.get(Long.valueOf(j)) != null) {
            ((sce) hashMap.get(Long.valueOf(j))).setLoop(z);
        }
    }

    public void j(long j, boolean z) {
        HashMap hashMap = (HashMap) this.f19090a;
        if (hashMap.get(Long.valueOf(j)) != null) {
            ((sce) hashMap.get(Long.valueOf(j))).setMuted(z);
        }
    }

    public void k(long j) {
        HashMap hashMap = (HashMap) this.f19090a;
        if (hashMap.get(Long.valueOf(j)) != null) {
            ((sce) hashMap.get(Long.valueOf(j))).stop();
        }
    }

    public static void h() {
    }
}
