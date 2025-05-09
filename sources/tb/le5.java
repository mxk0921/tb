package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class le5 extends me5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597726);
    }

    public static /* synthetic */ Object ipc$super(le5 le5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_smooth_butter/DXButterWidgetNodeCompatibleStrategy");
    }

    @Override // tb.me5, tb.lxb
    public void a(DXWidgetNode dXWidgetNode, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af264e5e", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        View nativeView = dXWidgetNode.getNativeView();
        if (nativeView != null) {
            nativeView.layout(i, i2, i3, i4);
        } else {
            dXWidgetNode.layoutWithButter(i, i2, i3, i4);
        }
    }

    @Override // tb.me5, tb.lxb
    public void e(DXWidgetNode dXWidgetNode, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35640ca", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2)});
            return;
        }
        View nativeView = dXWidgetNode.getNativeView();
        if (!(dXWidgetNode instanceof j)) {
            dXWidgetNode.measureWithButter(i, i2);
            dXWidgetNode.getNativeView().measure(View.MeasureSpec.makeMeasureSpec(dXWidgetNode.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(dXWidgetNode.getMeasuredHeight(), 1073741824));
        } else if (nativeView != null) {
            nativeView.measure(i, i2);
        } else {
            dXWidgetNode.measureWithButter(i, i2);
        }
    }
}
