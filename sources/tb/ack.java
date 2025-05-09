package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ack implements vuo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bck f15660a;
    public final paq b;
    public final ack c;

    static {
        t2o.a(315621410);
        t2o.a(315621379);
    }

    public ack(bck bckVar, paq paqVar) {
        this.f15660a = bckVar;
        this.b = paqVar;
        this.c = bckVar.f16318a.get();
        bckVar.f16318a.set(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.f15660a.f16318a.get() == this) {
            this.f15660a.f16318a.set(this.c);
        }
    }

    public paq e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (paq) ipChange.ipc$dispatch("c844e39", new Object[]{this});
        }
        return this.b;
    }
}
