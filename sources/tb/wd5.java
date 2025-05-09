package tb;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeButterCheckBox;
import com.taobao.android.dinamicx.widget.DXCheckBoxWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wd5 extends DXCheckBoxWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597263);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new wd5();
        }
    }

    static {
        t2o.a(444597262);
    }

    public wd5() {
        setAsyncImageLoad(true);
    }

    public static /* synthetic */ Object ipc$super(wd5 wd5Var, String str, Object... objArr) {
        if (str.hashCode() == 347506153) {
            super.v((AppCompatCheckBox) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXButterCheckBoxWidgetNode");
    }

    @Override // com.taobao.android.dinamicx.widget.DXCheckBoxWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new wd5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void layoutWithButter(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ce2f7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            ((AppCompatCheckBox) getNativeView()).layout(i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void measureWithButter(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bfe8b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) getNativeView();
        appCompatCheckBox.measure(i, i2);
        setMeasuredDimension(appCompatCheckBox.getMeasuredWidthAndState(), appCompatCheckBox.getMeasuredHeightAndState());
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeginSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad746430", new Object[]{this, context});
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXCheckBoxWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        DXNativeButterCheckBox dXNativeButterCheckBox;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        if (this.h) {
            dXNativeButterCheckBox = new DXNativeButterCheckBox(context, null, -1);
        } else {
            dXNativeButterCheckBox = new DXNativeButterCheckBox(context);
        }
        dXNativeButterCheckBox.setWidgetNode(this);
        return dXNativeButterCheckBox;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6436122", new Object[]{this, context});
        } else {
            createNativeView(context);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXCheckBoxWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view instanceof AppCompatCheckBox) {
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view;
            appCompatCheckBox.setClickable(true);
            int layoutWidth = getLayoutWidth();
            int layoutHeight = getLayoutHeight();
            if (layoutWidth > 0 && layoutHeight > 0) {
                v(appCompatCheckBox, layoutWidth, layoutHeight);
            }
            if (u() != 1) {
                z = false;
            }
            w(appCompatCheckBox, z);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXCheckBoxWidgetNode
    public void v(AppCompatCheckBox appCompatCheckBox, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b685e9", new Object[]{this, appCompatCheckBox, new Integer(i), new Integer(i2)});
        } else {
            super.v(appCompatCheckBox, i, i2);
        }
    }
}
