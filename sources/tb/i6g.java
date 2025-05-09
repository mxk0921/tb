package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i6g implements z5g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21125a;

    static {
        t2o.a(407896090);
        t2o.a(407896088);
    }

    public i6g(String str) {
        this.f21125a = str;
    }

    @Override // tb.z5g
    public void a(x5g x5gVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d84963", new Object[]{this, x5gVar});
            return;
        }
        byte[] bytes = this.f21125a.getBytes(StandardCharsets.UTF_8);
        x5gVar.a((byte) 1, bytes.length);
        x5gVar.write(bytes);
    }
}
