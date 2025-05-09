package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mt4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f24288a;
    public final float b;

    static {
        t2o.a(982516245);
    }

    public mt4(float f, float f2) {
        this.f24288a = f;
        this.b = f2;
    }

    public float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("754e2f39", new Object[]{this})).floatValue();
        }
        return this.f24288a;
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("755c46ba", new Object[]{this})).floatValue();
        }
        return this.b;
    }
}
