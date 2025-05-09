package tb;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a69 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Rect f15563a;

    static {
        t2o.a(491782765);
    }

    public a69(Rect rect) {
        this.f15563a = rect;
    }

    public Rect a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("8dbc0fc2", new Object[]{this});
        }
        return this.f15563a;
    }
}
