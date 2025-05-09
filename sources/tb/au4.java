package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class au4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16009a;

    static {
        t2o.a(989856460);
    }

    public au4(int i, String str) {
        this.f16009a = str;
    }

    public static au4 b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (au4) ipChange.ipc$dispatch("f209cd97", new Object[]{new Integer(i), str});
        }
        return new au4(i, str);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a817838e", new Object[]{this});
        }
        return this.f16009a;
    }
}
