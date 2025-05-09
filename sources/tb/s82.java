package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s82 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final s82 f27862a = new s82();

    static {
        t2o.a(404750625);
    }

    public static s82 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s82) ipChange.ipc$dispatch("81320012", new Object[0]);
        }
        return f27862a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b0607df", new Object[]{this});
        }
        return uep.a();
    }
}
