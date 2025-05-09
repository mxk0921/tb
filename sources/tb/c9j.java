package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class c9j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16927a;

    static {
        t2o.a(815793104);
    }

    public c9j(String str) {
        ckf.g(str, "searchText");
        this.f16927a = str;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df2fcee", new Object[]{this});
        }
        return this.f16927a;
    }
}
