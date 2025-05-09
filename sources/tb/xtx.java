package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.a;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class xtx implements j5y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wtx f31605a;
    public volatile WeakReference<lxx> b;
    public final int c = hashCode();

    public xtx(a aVar, wtx wtxVar) {
        this.f31605a = wtxVar;
    }

    @Override // tb.j5y
    public wtx a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wtx) ipChange.ipc$dispatch("7798d648", new Object[]{this});
        }
        return this.f31605a;
    }

    @Override // tb.j5y
    public void b(lxx lxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e6b961", new Object[]{this, lxxVar});
        } else {
            this.b = new WeakReference<>(lxxVar);
        }
    }

    public lxx e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lxx) ipChange.ipc$dispatch("9859d5e3", new Object[]{this});
        }
        WeakReference<lxx> weakReference = this.b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
