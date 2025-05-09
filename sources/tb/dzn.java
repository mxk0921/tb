package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dzn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18179a;
    public static boolean b;
    public static boolean c;
    public static d d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements u5h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f18180a;

        public a(d dVar) {
            this.f18180a = dVar;
        }

        @Override // tb.u5h
        public void onLoadFinished(l6h l6hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3924ed3", new Object[]{this, l6hVar});
                return;
            }
            if (l6hVar.i()) {
                dzn.f(true);
                d dVar = this.f18180a;
                if (dVar != null) {
                    dVar.a();
                }
            } else {
                d dVar2 = this.f18180a;
                if (dVar2 != null) {
                    dVar2.b();
                }
            }
            dzn.f18179a = dzn.c() & dzn.e();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements u5h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.u5h
        public void onLoadFinished(l6h l6hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3924ed3", new Object[]{this, l6hVar});
                return;
            }
            if (l6hVar.i()) {
                dzn.d(true);
            } else if (dzn.g() != null) {
                dzn.g().b();
                dzn.h(null);
            }
            boolean c = dzn.c() & dzn.e();
            dzn.f18179a = c;
            if (c && dzn.g() != null) {
                dzn.g().a();
                dzn.h(null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements u5h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.u5h
        public void onLoadFinished(l6h l6hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3924ed3", new Object[]{this, l6hVar});
                return;
            }
            if (l6hVar.i()) {
                dzn.f(true);
            } else if (dzn.g() != null) {
                dzn.g().b();
                dzn.h(null);
            }
            boolean c = dzn.c() & dzn.e();
            dzn.f18179a = c;
            if (c && dzn.g() != null) {
                dzn.g().a();
                dzn.h(null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        void a();

        void b();
    }

    public static void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("700607fe", new Object[]{dVar});
        } else if (c) {
            dVar.a();
        } else {
            bzn.d().a("mnnqjs", new a(dVar));
        }
    }

    public static void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b99cc", new Object[]{dVar});
        } else if (f18179a) {
            dVar.a();
        } else {
            d = dVar;
            bzn.d().a("mnn_jsi", new b());
            bzn.d().a("mnnqjs", new c());
        }
    }

    public static /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return b;
    }

    public static /* synthetic */ boolean d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static /* synthetic */ boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue();
        }
        return c;
    }

    public static /* synthetic */ boolean f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        c = z;
        return z;
    }

    public static /* synthetic */ d g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("b9a791de", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ d h(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("a6f804bf", new Object[]{dVar});
        }
        d = dVar;
        return dVar;
    }
}
