package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x6n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MaResult f31181a;
    public final String b;

    static {
        t2o.a(760217734);
    }

    public x6n(MaResult maResult, String str) {
        this.f31181a = maResult;
        this.b = str;
    }

    public MaResult a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("405db3f8", new Object[]{this});
        }
        return this.f31181a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MaResultWrapper{maResult=" + this.f31181a + ", from='" + this.b + "'}";
    }
}
