package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class i5p<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public h5p f21106a;
    public g5p<T> b;
    public v5p c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b<M> {

        /* renamed from: a  reason: collision with root package name */
        public h5p f21107a;
        public g5p<M> b;
        public v5p c;

        static {
            t2o.a(815792925);
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c<M> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b<M> f21108a = new b<>();

        static {
            t2o.a(815792926);
        }

        public i5p<M> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i5p) ipChange.ipc$dispatch("171cf651", new Object[]{this});
            }
            i5p<M> i5pVar = new i5p<>();
            i5p.a(i5pVar, this.f21108a.f21107a);
            i5p.b(i5pVar, this.f21108a.b);
            i5p.c(i5pVar, this.f21108a.c);
            return i5pVar;
        }

        public c<M> b(g5p<M> g5pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("743d864c", new Object[]{this, g5pVar});
            }
            this.f21108a.b = g5pVar;
            return this;
        }

        public c<M> c(h5p h5pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("5a8a236a", new Object[]{this, h5pVar});
            }
            this.f21108a.f21107a = h5pVar;
            return this;
        }

        public c<M> d(v5p v5pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("a63770f9", new Object[]{this, v5pVar});
            }
            this.f21108a.c = v5pVar;
            return this;
        }
    }

    static {
        t2o.a(815792923);
    }

    public static /* synthetic */ h5p a(i5p i5pVar, h5p h5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h5p) ipChange.ipc$dispatch("b7648bf7", new Object[]{i5pVar, h5pVar});
        }
        i5pVar.f21106a = h5pVar;
        return h5pVar;
    }

    public static /* synthetic */ g5p b(i5p i5pVar, g5p g5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g5p) ipChange.ipc$dispatch("e3d252b4", new Object[]{i5pVar, g5pVar});
        }
        i5pVar.b = g5pVar;
        return g5pVar;
    }

    public static /* synthetic */ v5p c(i5p i5pVar, v5p v5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v5p) ipChange.ipc$dispatch("a0200bc9", new Object[]{i5pVar, v5pVar});
        }
        i5pVar.c = v5pVar;
        return v5pVar;
    }

    public c5o<m4p> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5o) ipChange.ipc$dispatch("3aefa894", new Object[]{this});
        }
        return new c5o<>(this.f21106a, null, this.c);
    }

    public c5o<T> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5o) ipChange.ipc$dispatch("fda53336", new Object[]{this});
        }
        return new c5o<>(this.f21106a, this.b, this.c);
    }

    public i5p() {
    }
}
