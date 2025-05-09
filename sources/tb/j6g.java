package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j6g implements z5g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f21793a;

    static {
        t2o.a(407896091);
        t2o.a(407896088);
    }

    public j6g(Set<String> set) {
        this.f21793a = set;
    }

    @Override // tb.z5g
    public void a(x5g x5gVar) throws IOException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d84963", new Object[]{this, x5gVar});
            return;
        }
        x5gVar.b((byte) 6);
        Set<String> set = this.f21793a;
        if (set != null) {
            i = set.size();
        } else {
            i = 0;
        }
        x5gVar.c(i);
        Set<String> set2 = this.f21793a;
        if (set2 != null) {
            for (String str : set2) {
                if (str instanceof String) {
                    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                    x5gVar.c(bytes.length);
                    x5gVar.write(bytes);
                } else {
                    x5gVar.c(0);
                }
            }
        }
    }
}
