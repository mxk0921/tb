package tb;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.IWXComputeScreenAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x2x implements IWXComputeScreenAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Rect f31106a = new Rect();

    static {
        t2o.a(786432154);
        t2o.a(985661512);
    }

    @Override // com.taobao.weex.adapter.IWXComputeScreenAdapter
    public Rect computeCurrentScreenMetrics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("e162c6e5", new Object[]{this});
        }
        return this.f31106a;
    }
}
