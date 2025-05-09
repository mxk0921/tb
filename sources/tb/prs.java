package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class prs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f26263a;
    public int b;
    public boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f26264a;
        public int b;
        public boolean c;

        static {
            t2o.a(815792780);
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8a96cf41", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public prs b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (prs) ipChange.ipc$dispatch("4542daab", new Object[]{this});
            }
            prs prsVar = new prs();
            prs.a(prsVar, this.c);
            prs.b(prsVar, this.b);
            prs.c(prsVar, this.f26264a);
            return prsVar;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f3107150", new Object[]{this, new Integer(i)});
            }
            this.f26264a = i;
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a808171d", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }
    }

    static {
        t2o.a(815792779);
    }

    public static /* synthetic */ boolean a(prs prsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("300492d5", new Object[]{prsVar, new Boolean(z)})).booleanValue();
        }
        prsVar.c = z;
        return z;
    }

    public static /* synthetic */ int b(prs prsVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21adf912", new Object[]{prsVar, new Integer(i)})).intValue();
        }
        prsVar.b = i;
        return i;
    }

    public static /* synthetic */ int c(prs prsVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13579f31", new Object[]{prsVar, new Integer(i)})).intValue();
        }
        prsVar.f26263a = i;
        return i;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("756dbba7", new Object[]{this})).intValue();
        }
        return this.f26263a;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5db8bfe0", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42a09bda", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
        } else {
            this.f26263a = i;
        }
    }
}
