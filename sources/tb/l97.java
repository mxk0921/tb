package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l97<T> implements pee<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final p1c<T> f23192a;

    static {
        t2o.a(511705480);
        t2o.a(511705481);
    }

    public l97(p1c<T> p1cVar) {
        this.f23192a = p1cVar;
    }

    @Override // tb.pee
    public p1c<T> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p1c) ipChange.ipc$dispatch("63976734", new Object[]{this});
        }
        return this.f23192a;
    }

    @Override // tb.pee
    public void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee59742", new Object[]{this, t});
        } else {
            this.f23192a.set(t);
        }
    }
}
