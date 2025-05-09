package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.e2s;
import tb.lm0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b8r extends lm0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public e2s.a f16253a;

    static {
        t2o.a(708837455);
    }

    public static /* synthetic */ Object ipc$super(b8r b8rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/config/TBBuyDinamicXConfig");
    }

    @Override // tb.lm0
    public e2s.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2s.a) ipChange.ipc$dispatch("ee1be7dd", new Object[]{this});
        }
        if (this.f16253a == null) {
            this.f16253a = new d2s();
        }
        return this.f16253a;
    }

    @Override // tb.lm0
    public void b(lm0.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5333382b", new Object[]{this, aVar});
            return;
        }
        y7r.b(aVar);
        y7r.d(aVar);
    }
}
