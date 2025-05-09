package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class f22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final RectF f18954a = new RectF();

    static {
        t2o.a(481297399);
    }

    public static final RectF a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("64a786f2", new Object[0]);
        }
        return f18954a;
    }

    public static final float b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8eb3ab5", new Object[]{new Float(f)})).floatValue();
        }
        return f * f;
    }
}
