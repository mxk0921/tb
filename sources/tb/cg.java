package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17038a;
    public final String b;

    static {
        t2o.a(79691850);
    }

    public cg() {
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9670bde8", new Object[]{this});
        }
        return this.f17038a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9144416d", new Object[]{this});
        }
        return this.b;
    }

    public cg(String str, String str2) {
        this.f17038a = str;
        this.b = str2;
    }
}
