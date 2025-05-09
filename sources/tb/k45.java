package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class k45 implements l45 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f22392a;

    static {
        t2o.a(1034944697);
        t2o.a(1034944698);
    }

    public k45(String str) {
        this.f22392a = str;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3bd70bf", new Object[]{this});
        }
        return this.f22392a;
    }
}
