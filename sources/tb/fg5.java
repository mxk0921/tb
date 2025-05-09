package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fg5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f19271a;
    public int b;
    public final Map<String, DXWidgetNode> c = new HashMap();

    static {
        t2o.a(444597028);
    }

    public DXWidgetNode a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f77b1f04", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return (DXWidgetNode) ((HashMap) this.c).get(str);
    }

    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map<java.lang.String, com.taobao.android.dinamicx.widget.DXWidgetNode>, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, com.taobao.android.dinamicx.widget.DXWidgetNode> b(tb.lg5 r17, com.taobao.android.dinamicx.DXRuntimeContext r18, android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fg5.b(tb.lg5, com.taobao.android.dinamicx.DXRuntimeContext, android.content.Context):java.util.Map");
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df22cf22", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba0b67f6", new Object[]{this, new Integer(i)});
        } else {
            this.f19271a = i;
        }
    }
}
