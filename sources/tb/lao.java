package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lao {
    public static final bap b = new bap();

    /* renamed from: a  reason: collision with root package name */
    public final c f23212a = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fao f23213a;
        final /* synthetic */ b b;

        public a(fao faoVar, b bVar) {
            this.f23213a = faoVar;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean b = lao.this.b(this.f23213a.a(), this.f23213a.d(), this.f23213a.c());
            b bVar = this.b;
            if (bVar == null) {
                return;
            }
            if (b) {
                bVar.b(this.f23213a);
            } else {
                bVar.a(this.f23213a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void a(fao faoVar);

        void b(fao faoVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c {
        static {
            t2o.a(813695030);
        }

        public boolean a(String str, String str2, byte[] bArr) {
            pe2 pe2Var;
            try {
                if (str != null) {
                    pe2Var = epv.b(str2, bArr);
                } else {
                    pe2Var = epv.a(str, str2, bArr);
                }
                return pe2Var.a();
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
    }

    static {
        t2o.a(813695027);
    }

    public final boolean b(String str, String str2, byte[] bArr) {
        return this.f23212a.a(str, str2, bArr);
    }

    public void c(fao faoVar, b bVar) {
        b.c(new a(faoVar, bVar));
    }
}
