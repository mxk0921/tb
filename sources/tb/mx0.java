package tb;

import android.graphics.PointF;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mx0 implements xx0<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    public final List<w4g<PointF>> f24362a;

    public mx0(List<w4g<PointF>> list) {
        this.f24362a = list;
    }

    @Override // tb.xx0
    public pw1<PointF, PointF> a() {
        List<w4g<PointF>> list = this.f24362a;
        if (list.get(0).h()) {
            return new r9m(list);
        }
        return new eul(list);
    }

    @Override // tb.xx0
    public List<w4g<PointF>> b() {
        return this.f24362a;
    }

    @Override // tb.xx0
    public boolean c() {
        List<w4g<PointF>> list = this.f24362a;
        if (list.size() != 1 || !list.get(0).h()) {
            return false;
        }
        return true;
    }
}
