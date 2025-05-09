package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cg4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f17043a = yz3.l("https://g.alicdn.com/appworks/", "https://dev.g.alicdn.com/appworks/", "https://g.alicdn.com/??appworks/", "https://dev.g.alicdn.com/??appworks/");

    static {
        t2o.a(998244387);
    }

    public static final /* synthetic */ List a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a8267066", new Object[0]);
        }
        return f17043a;
    }
}
