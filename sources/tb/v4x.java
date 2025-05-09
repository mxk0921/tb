package tb;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class v4x implements lce {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Rect f29782a = new Rect();

    static {
        t2o.a(786432155);
        t2o.a(982515856);
    }

    public final void a(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cdb4d0c", new Object[]{this, rect});
            return;
        }
        ckf.g(rect, "<set-?>");
        this.f29782a = rect;
    }

    @Override // tb.lce
    public Rect computeCurrentScreenMetrics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("e162c6e5", new Object[]{this});
        }
        return this.f29782a;
    }
}
