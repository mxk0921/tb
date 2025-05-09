package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeButterFastText;
import com.taobao.android.dinamicx.view.DXNativeFastText;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xd5 extends cx5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597265);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new xd5();
        }
    }

    static {
        t2o.a(444597264);
    }

    public static /* synthetic */ Object ipc$super(xd5 xd5Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 28626114) {
            super.onEndParser();
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/DXButterFastTextWidgetNode");
        }
    }

    @Override // tb.cx5, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new xd5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void layoutWithButter(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ce2f7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            ((DXNativeFastText) getNativeView()).layout(i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void measureWithButter(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bfe8b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            getNativeView().measure(i, i2);
        }
    }

    @Override // tb.cx5, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXNativeButterFastText dXNativeButterFastText = new DXNativeButterFastText(context);
        dXNativeButterFastText.setWidgetNode(this);
        ic5.i(dXNativeButterFastText);
        return dXNativeButterFastText;
    }

    @Override // tb.cx5, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
            return;
        }
        super.onEndParser();
        CharSequence charSequence = this.text;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = "";
        }
        setAccessibilityText(str);
    }

    @Override // tb.cx5, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // tb.cx5, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ic5.k(view);
        view.requestLayout();
        view.invalidate();
    }

    public float t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89487db3", new Object[]{this})).floatValue();
        }
        return getPaddingLeft();
    }

    public float u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89569534", new Object[]{this})).floatValue();
        }
        return this.translateY + this.realPaddingTop;
    }
}
