package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f27431a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f27432a;
        public boolean b;

        static {
            t2o.a(80740388);
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3b718267", new Object[]{aVar})).longValue();
            }
            return aVar.f27432a;
        }

        public static /* synthetic */ boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e2ed5c38", new Object[]{aVar})).booleanValue();
            }
            return aVar.b;
        }

        public rk c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rk) ipChange.ipc$dispatch("c530b8f4", new Object[]{this});
            }
            return new rk(this);
        }

        public a d(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5fc807cc", new Object[]{this, new Long(j)});
            }
            this.f27432a = j;
            this.b = true;
            return this;
        }
    }

    static {
        t2o.a(80740387);
    }

    public rk(a aVar) {
        this.f27431a = a.a(aVar);
        a.b(aVar);
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17b347fd", new Object[]{this})).longValue();
        }
        return this.f27431a;
    }
}
