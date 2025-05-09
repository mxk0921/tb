package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yr0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32296a;
    public final String b;

    static {
        t2o.a(301989958);
    }

    public yr0(boolean z, String str) {
        this.f32296a = z;
        this.b = str;
    }

    public static yr0 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yr0) ipChange.ipc$dispatch("6a4be4aa", new Object[0]);
        }
        return new yr0(true, "");
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        return this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.f32296a;
    }
}
