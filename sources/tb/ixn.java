package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ixn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<RectF> f21632a;
    public RectF b;

    static {
        t2o.a(481296436);
    }

    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b82ff89", new Object[]{this, new Float(f), new Float(f2)});
        } else if (f != 1.0f || f2 != 1.0f) {
            RectF rectF = this.b;
            if (rectF != null) {
                rectF.top *= f2;
                rectF.bottom *= f2;
                rectF.left *= f;
                rectF.right *= f;
            }
            List<RectF> list = this.f21632a;
            if (list != null && list.size() > 0) {
                for (RectF rectF2 : this.f21632a) {
                    rectF2.top *= f2;
                    rectF2.bottom *= f2;
                    rectF2.left *= f2;
                    rectF2.right *= f2;
                }
            }
        }
    }

    public RectF b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("8718094b", new Object[]{this});
        }
        return this.b;
    }

    public List<RectF> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("32c9990a", new Object[]{this});
        }
        return this.f21632a;
    }

    public void d(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3add21", new Object[]{this, rectF});
        } else {
            this.b = rectF;
        }
    }

    public void e(List<RectF> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7406e9a", new Object[]{this, list});
        } else {
            this.f21632a = list;
        }
    }
}
