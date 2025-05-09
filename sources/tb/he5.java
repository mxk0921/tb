package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeButterSwitch;
import com.taobao.android.dinamicx.view.DXNativeSwitch;
import com.taobao.android.dinamicx.widget.DXSwitchWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class he5 extends DXSwitchWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597272);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new he5();
        }
    }

    static {
        t2o.a(444597271);
    }

    public static /* synthetic */ Object ipc$super(he5 he5Var, String str, Object... objArr) {
        if (str.hashCode() == 1265841897) {
            super.w((Context) objArr[0], (DXNativeSwitch) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXButterSwitchWidgetNode");
    }

    @Override // com.taobao.android.dinamicx.widget.DXSwitchWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new he5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void layoutWithButter(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ce2f7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            ((DXNativeSwitch) getNativeView()).layout(i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void measureWithButter(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bfe8b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        DXNativeSwitch dXNativeSwitch = (DXNativeSwitch) getNativeView();
        dXNativeSwitch.measure(i, i2);
        setMeasuredDimension(dXNativeSwitch.getMeasuredWidthAndState(), dXNativeSwitch.getMeasuredHeightAndState());
    }

    @Override // com.taobao.android.dinamicx.widget.DXSwitchWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXNativeButterSwitch dXNativeButterSwitch = new DXNativeButterSwitch(context);
        dXNativeButterSwitch.setWidgetNode(this);
        return dXNativeButterSwitch;
    }

    @Override // com.taobao.android.dinamicx.widget.DXSwitchWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view != null && (view instanceof DXNativeSwitch)) {
            DXNativeSwitch dXNativeSwitch = (DXNativeSwitch) view;
            dXNativeSwitch.setClickable(true);
            dXNativeSwitch.setTextOn("");
            dXNativeSwitch.setTextOff("");
            dXNativeSwitch.setShowText(false);
            dXNativeSwitch.setThumbTextPadding(0);
            dXNativeSwitch.setSplitTrack(false);
            int layoutHeight = getLayoutHeight();
            if (layoutHeight > 0) {
                w(context, dXNativeSwitch, layoutHeight);
            }
            this.d = true;
            if (this.c != 1) {
                z = false;
            }
            dXNativeSwitch.setChecked(z);
            this.d = false;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXSwitchWidgetNode
    public void w(Context context, DXNativeSwitch dXNativeSwitch, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7336e9", new Object[]{this, context, dXNativeSwitch, new Integer(i)});
        } else {
            super.w(context, dXNativeSwitch, i);
        }
    }
}
