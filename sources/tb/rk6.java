package tb;

import android.animation.TimeInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dxv4common.exception.DXAnimationException;
import tb.pk6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class rk6<T> implements jub<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f27435a;
    public final int b;
    public final int c;
    public final int d;
    public final TimeInterpolator e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends rk6<Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597758);
        }

        public a(int i, int i2, int i3, int i4, TimeInterpolator timeInterpolator) {
            super(i, i2, i3, i4, timeInterpolator);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/animation/spec/DXTweenSpec$DXFloatTweenSpec");
        }

        @Override // tb.jub
        public iub<Float> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (iub) ipChange.ipc$dispatch("f893e2c0", new Object[]{this});
            }
            return new pk6.b(this);
        }
    }

    static {
        t2o.a(444597757);
        t2o.a(444597745);
    }

    public rk6(int i, int i2, int i3, int i4, TimeInterpolator timeInterpolator) {
        this.f27435a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = timeInterpolator;
    }

    public static <T> rk6<T> b(Class<T> cls, int i, int i2, int i3, int i4, TimeInterpolator timeInterpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rk6) ipChange.ipc$dispatch("8ecb8124", new Object[]{cls, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), timeInterpolator});
        }
        if (cls == Float.class) {
            return new a(i, i2, i3, i4, timeInterpolator);
        }
        throw new DXAnimationException("不支持的 DXTweenSpec 类型: ".concat(cls.getSimpleName()));
    }
}
