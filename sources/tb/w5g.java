package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w5g implements z5g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f30470a;

    static {
        t2o.a(407896085);
        t2o.a(407896088);
    }

    public w5g(long j) {
        this.f30470a = j;
    }

    @Override // tb.z5g
    public void a(x5g x5gVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d84963", new Object[]{this, x5gVar});
            return;
        }
        x5gVar.b((byte) 4);
        x5gVar.e(this.f30470a);
    }
}
