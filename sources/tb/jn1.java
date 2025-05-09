package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jn1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f22087a;
    public final float b;

    public jn1(long j, float f) {
        this.f22087a = j;
        this.b = f;
    }

    public float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc943ad5", new Object[]{this})).floatValue();
        }
        return this.b;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60072184", new Object[]{this})).longValue();
        }
        return this.f22087a;
    }
}
