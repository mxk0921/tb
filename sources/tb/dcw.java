package tb;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dcw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f17733a;
    public final Rect b;

    static {
        t2o.a(491782768);
    }

    public dcw(float f, Rect rect) {
        this.f17733a = f;
        this.b = rect;
    }

    public float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58eb905", new Object[]{this})).floatValue();
        }
        return this.f17733a;
    }

    public Rect b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("38a298f9", new Object[]{this});
        }
        return this.b;
    }
}
