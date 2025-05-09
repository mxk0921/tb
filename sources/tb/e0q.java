package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class e0q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f18198a;
    public int b = 0;

    static {
        t2o.a(962592923);
    }

    public e0q(String str, int i) {
        this.f18198a = str;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cbd2d4", new Object[]{this});
        } else {
            this.b++;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("989edcd5", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d02517fc", new Object[]{this});
        }
        return this.f18198a;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43339a6d", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }
}
