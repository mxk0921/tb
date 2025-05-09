package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dc5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<DXWidgetNode> f17720a;
    public final List<String> b;

    static {
        t2o.a(444597737);
    }

    public dc5(WeakReference<DXWidgetNode> weakReference, List<String> list) {
        this.f17720a = weakReference;
        this.b = list;
    }

    public List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f808bf17", new Object[]{this});
        }
        return this.b;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2c2b0e50", new Object[]{this});
        }
        DXWidgetNode dXWidgetNode = this.f17720a.get();
        if (dXWidgetNode == null || dXWidgetNode.getDXRuntimeContext() == null) {
            return null;
        }
        return dXWidgetNode.getDXRuntimeContext().D();
    }
}
