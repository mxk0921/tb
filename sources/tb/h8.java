package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class h8 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, w8> f20463a;
    public final y8 b;
    public final v8 c;
    public final j8 d;
    public final bee e;
    public final l8 f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public HashMap<String, w8> f20464a;
        public v8 b;
        public y8 c;
        public j8 d;
        public l8 e;
        public bee f;

        static {
            t2o.a(336592913);
        }

        public static /* synthetic */ HashMap a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("4ee04911", new Object[]{bVar});
            }
            return bVar.f20464a;
        }

        public static /* synthetic */ v8 b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (v8) ipChange.ipc$dispatch("39dce586", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ y8 c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y8) ipChange.ipc$dispatch("7c8032fd", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ j8 d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j8) ipChange.ipc$dispatch("30d7a65", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ l8 e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l8) ipChange.ipc$dispatch("55e8ef6a", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ bee f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bee) ipChange.ipc$dispatch("703cd484", new Object[]{bVar});
            }
            return bVar.f;
        }

        public h8 g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h8) ipChange.ipc$dispatch("76bc0f21", new Object[]{this});
            }
            return new h8(this);
        }

        public b h(j8 j8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("487ba9d7", new Object[]{this, j8Var});
            }
            this.d = j8Var;
            return this;
        }

        public b i(v8 v8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("14689e14", new Object[]{this, v8Var});
            }
            this.b = v8Var;
            return this;
        }

        public b j(y8 y8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("21cc0fe4", new Object[]{this, y8Var});
            }
            this.c = y8Var;
            return this;
        }

        public b k(HashMap<String, w8> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5e22c3a", new Object[]{this, hashMap});
            }
            this.f20464a = hashMap;
            return this;
        }

        public b l(l8 l8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7c766f95", new Object[]{this, l8Var});
            }
            this.e = l8Var;
            return this;
        }

        public b m(bee beeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("34b9673e", new Object[]{this, beeVar});
            }
            this.f = beeVar;
            return this;
        }
    }

    static {
        t2o.a(336592911);
    }

    public h8(b bVar) {
        this.f20463a = b.a(bVar);
        this.c = b.b(bVar);
        this.b = b.c(bVar);
        this.d = b.d(bVar);
        this.f = b.e(bVar);
        this.e = b.f(bVar);
    }
}
