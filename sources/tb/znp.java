package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class znp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f32899a;
    public final String b;
    public final String c;
    public final float d;
    public final float e;

    static {
        t2o.a(766510315);
    }

    public znp(int i, String str, String str2, float f, float f2) {
        this.f32899a = i;
        this.b = str;
        this.c = str2;
        this.d = f;
        this.e = f2;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5bd3818", new Object[]{this})).intValue();
        }
        return this.f32899a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("951546a1", new Object[]{this});
        }
        return this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c99b0a53", new Object[]{this});
        }
        return this.c;
    }

    public final float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1123a61", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public final float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e9b9e1f", new Object[]{this})).floatValue();
        }
        return this.d;
    }
}
