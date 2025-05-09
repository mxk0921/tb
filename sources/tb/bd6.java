package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx_v4.animation.impl.DXSpringAnimation;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bd6 implements jub<Float> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f16331a;
    public final float b;

    static {
        t2o.a(444597756);
        t2o.a(444597745);
    }

    public bd6(float f, float f2) {
        this.f16331a = f;
        this.b = f2;
    }

    public static bd6 b(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bd6) ipChange.ipc$dispatch("f6fb08eb", new Object[]{new Float(f), new Float(f2)});
        }
        return new bd6(f, f2);
    }

    @Override // tb.jub
    public iub<Float> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iub) ipChange.ipc$dispatch("f893e2c0", new Object[]{this});
        }
        return new DXSpringAnimation(this);
    }
}
