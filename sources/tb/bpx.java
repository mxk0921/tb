package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bpx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static bpx f16540a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements qpx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ dfe f16541a;

        public a(bpx bpxVar, dfe dfeVar) {
            this.f16541a = dfeVar;
        }

        @Override // tb.qpx
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3a07be1", new Object[]{this, new Integer(i)});
            } else {
                this.f16541a.firstUpdateCount(i);
            }
        }
    }

    static {
        t2o.a(996147240);
    }

    public static bpx a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bpx) ipChange.ipc$dispatch("1df6b084", new Object[0]);
        }
        if (f16540a == null) {
            synchronized (bpx.class) {
                try {
                    if (f16540a == null) {
                        f16540a = new bpx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16540a;
    }

    public void b(dfe dfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84eb4e60", new Object[]{this, dfeVar});
        } else {
            bkv.d(new a(this, dfeVar), true);
        }
    }
}
