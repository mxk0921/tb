package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class me5 implements lxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597727);
        t2o.a(444597462);
    }

    @Override // tb.lxb
    public void a(DXWidgetNode dXWidgetNode, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af264e5e", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            dXWidgetNode.layoutWithButter(i, i2, i3, i4);
        }
    }

    @Override // tb.lxb
    public void b(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d7e3a6", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else {
            dXWidgetNode.endParserWithButter(z);
        }
    }

    @Override // tb.lxb
    public void c(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62e97a74", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else {
            dXWidgetNode.beginParserWithButter(z);
        }
    }

    @Override // tb.lxb
    public void d(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87cc25de", new Object[]{this, dXWidgetNode});
        } else {
            dXWidgetNode.beforeBindChildDataWithButter();
        }
    }

    @Override // tb.lxb
    public void e(DXWidgetNode dXWidgetNode, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35640ca", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2)});
        } else {
            dXWidgetNode.measureWithButter(i, i2);
        }
    }
}
