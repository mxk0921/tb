package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t56 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f28495a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean b;

        /* renamed from: a  reason: collision with root package name */
        public boolean f28496a = true;
        public boolean c = true;

        static {
            t2o.a(444596514);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4eba7959", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9d6e59af", new Object[]{this})).booleanValue();
            }
            return this.b;
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e46ed365", new Object[]{this})).booleanValue();
            }
            return this.f28496a;
        }

        public void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a81a357", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }

        public void e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4fa29c1", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        public void f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("654a40cb", new Object[]{this, new Boolean(z)});
            } else {
                this.f28496a = z;
            }
        }
    }

    static {
        t2o.a(444596513);
    }

    public a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("668e1dcb", new Object[]{this});
        }
        return this.f28495a;
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84897cb", new Object[]{this, aVar});
        } else {
            this.f28495a = aVar;
        }
    }
}
