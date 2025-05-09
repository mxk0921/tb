package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yto<OUT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f32345a;
    public final boolean b;
    public OUT c;
    public float d;
    public Throwable e;

    public yto(int i, boolean z) {
        this.f32345a = i;
        this.b = z;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "type:" + this.f32345a + ",isLast:" + this.b;
    }
}
