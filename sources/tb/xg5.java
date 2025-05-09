package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xg5 extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCONDITIONALNODE_CONDITIONALNODE = 4861660327064501257L;
    public static final long DXCONDITIONALNODE_IF = 754805;
    public DXWidgetNode b;
    public DXWidgetNode c;
    public boolean d;
    public int e;

    /* renamed from: a  reason: collision with root package name */
    public boolean f31375a = false;
    public final int f = 1;
    public final int g = 2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597507);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new xg5();
        }
    }

    static {
        t2o.a(444597506);
    }

    public xg5() {
        setLayoutWidth(-2);
        setLayoutHeight(-2);
    }

    public static /* synthetic */ Object ipc$super(xg5 xg5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1143923816:
                return super.deepClone((DXRuntimeContext) objArr[0]);
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/logic/DXConditionalNodeWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new xg5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode deepClone(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("442ee468", new Object[]{this, dXRuntimeContext});
        }
        if (eb5.b()) {
            return super.deepClone(dXRuntimeContext);
        }
        xg5 xg5Var = (xg5) shallowClone(dXRuntimeContext, true);
        w(xg5Var);
        return xg5Var;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 754805) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof xg5)) {
            super.onClone(dXWidgetNode, z);
            xg5 xg5Var = (xg5) dXWidgetNode;
            this.f31375a = xg5Var.f31375a;
            this.b = xg5Var.b;
            this.c = xg5Var.c;
            this.d = xg5Var.d;
            this.c = xg5Var.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else {
            super.onRenderView(context, view);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 754805) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f31375a = z;
            if (i == 0) {
                z2 = false;
            }
            u(z2);
            this.d = this.f31375a;
            v(this.g);
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    public boolean t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a34bb4be", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if ((this.e & i) == i) {
            return true;
        }
        return false;
    }

    public void u(boolean z) {
        DXWidgetNode dXWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2e9968", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!t(this.f)) {
            w(this);
        }
        if (!t(this.g) || z != this.d) {
            removeAllChild();
            if (!z || (dXWidgetNode = this.b) == null) {
                DXWidgetNode dXWidgetNode2 = this.c;
                if (dXWidgetNode2 != null) {
                    addChild(dXWidgetNode2.deepClone(getDXRuntimeContext()));
                    return;
                }
                return;
            }
            addChild(dXWidgetNode.deepClone(getDXRuntimeContext()));
        }
    }

    public void v(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9f752e", new Object[]{this, new Integer(i)});
        } else {
            this.e = i | this.e;
        }
    }

    public final void w(xg5 xg5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d8824f", new Object[]{this, xg5Var});
        } else if (getChildren() == null || getChildren().size() == 0) {
            xg5Var.v(this.f);
        } else {
            if (getChildrenCount() == 1) {
                xg5Var.b = getChildAt(0);
                xg5Var.removeChildAt(0);
            } else if (getChildrenCount() == 2) {
                xg5Var.b = getChildAt(0);
                xg5Var.c = getChildAt(1);
                xg5Var.removeAllChild();
            }
            xg5Var.v(this.f);
        }
    }
}
