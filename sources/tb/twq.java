package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class twq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29006a;

    static {
        t2o.a(815793285);
    }

    public twq(String str) {
        this.f29006a = str;
    }

    public static twq a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (twq) ipChange.ipc$dispatch("ec3243c1", new Object[]{str});
        }
        return new twq(str);
    }
}
