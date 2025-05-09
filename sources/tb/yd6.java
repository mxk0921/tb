package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taolive.uikit.favor.TaoliveFavorComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yd6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLFAVORVIEW_TBCURRENTLIVESTATE = -5287008133921364644L;
    public static final long DXTBLFAVORVIEW_TBDISABLELEVEL = 8759178021899091344L;
    public static final long DXTBLFAVORVIEW_TBFAVORANIMATIONCOUNT = -8492291471854263150L;
    public static final long DXTBLFAVORVIEW_TBFAVORANIMATIONHEIGHT = -4364506365366730781L;
    public static final long DXTBLFAVORVIEW_TBFAVORANIMATIONINTERVAL = -2920205802351598127L;
    public static final long DXTBLFAVORVIEW_TBFAVORIMG = 6929601810429249275L;
    public static final long DXTBLFAVORVIEW_TBFAVORNUM = 6929601810769863950L;
    public static final long DXTBLFAVORVIEW_TBID = 38174466807L;
    public static final long DXTBLFAVORVIEW_TBLFAVORVIEW = -8385406434993395833L;
    public static final long DXTBLFAVORVIEW_TBVISIBLESTATE = 5637158515563704755L;

    /* renamed from: a  reason: collision with root package name */
    public String f32000a;
    public String b;
    public String c;
    public int d;
    public Object e;
    public String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779092429);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new yd6();
        }
    }

    static {
        t2o.a(779092428);
    }

    public yd6() {
        pb6.c(DinamicXEngine.x(), 8.0f);
        pb6.c(DinamicXEngine.x(), 200.0f);
    }

    public static /* synthetic */ Object ipc$super(yd6 yd6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/dinamicx/DXTBLFavorViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new yd6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == DXTBLFAVORVIEW_TBFAVORANIMATIONHEIGHT) {
            return pb6.c(DinamicXEngine.x(), 200.0f);
        }
        if (j == DXTBLFAVORVIEW_TBFAVORANIMATIONINTERVAL) {
            return 3.0d;
        }
        return super.getDefaultValueForDoubleAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXTBLFAVORVIEW_TBFAVORANIMATIONCOUNT) {
            return pb6.c(DinamicXEngine.x(), 8.0f);
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode instanceof yd6) {
            super.onClone(dXWidgetNode, z);
            yd6 yd6Var = (yd6) dXWidgetNode;
            this.f32000a = yd6Var.f32000a;
            this.b = yd6Var.b;
            this.c = yd6Var.c;
            this.d = yd6Var.d;
            this.e = yd6Var.e;
            this.f = yd6Var.f;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new TaoliveFavorComponent(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            setMeasuredDimension(owo.e(fkr.a(), "52ap", 52), owo.e(fkr.a(), "103ap", 103));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view instanceof TaoliveFavorComponent) {
            TaoliveFavorComponent taoliveFavorComponent = (TaoliveFavorComponent) view;
            if (!TextUtils.isEmpty(this.c)) {
                taoliveFavorComponent.setFavorImg(this.c);
            }
            taoliveFavorComponent.setFavorNum(this.d);
            t(taoliveFavorComponent);
            u(taoliveFavorComponent);
            Object obj = this.e;
            if (obj != null) {
                taoliveFavorComponent.setTag(obj);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j != DXTBLFAVORVIEW_TBFAVORANIMATIONHEIGHT && j != DXTBLFAVORVIEW_TBFAVORANIMATIONINTERVAL) {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j != DXTBLFAVORVIEW_TBFAVORANIMATIONCOUNT) {
            if (j == DXTBLFAVORVIEW_TBFAVORNUM) {
                this.d = i;
            } else {
                super.onSetIntAttribute(j, i);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == 38174466807L) {
            this.e = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == -5287008133921364644L) {
            this.f32000a = str;
        } else if (j == DXTBLFAVORVIEW_TBDISABLELEVEL) {
            this.b = str;
        } else if (j == DXTBLFAVORVIEW_TBFAVORIMG) {
            this.c = str;
        } else if (j == 5637158515563704755L) {
            this.f = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void t(TaoliveFavorComponent taoliveFavorComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29067927", new Object[]{this, taoliveFavorComponent});
        } else if (TextUtils.isEmpty(this.b)) {
            taoliveFavorComponent.setMaxDeviceLevel(100);
        } else if ("low".equals(this.b)) {
            taoliveFavorComponent.setMaxDeviceLevel(3);
        } else if ("middle".equals(this.b)) {
            taoliveFavorComponent.setMaxDeviceLevel(2);
        } else if ("high".equals(this.b)) {
            taoliveFavorComponent.setMaxDeviceLevel(1);
        } else {
            taoliveFavorComponent.setMaxDeviceLevel(100);
        }
    }

    public final void u(TaoliveFavorComponent taoliveFavorComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3591dc", new Object[]{this, taoliveFavorComponent});
        } else if (!TextUtils.isEmpty(this.f) && !TextUtils.isEmpty(this.f32000a)) {
            if (this.f.equals(this.f32000a)) {
                taoliveFavorComponent.setVisibility(0);
            } else {
                taoliveFavorComponent.setVisibility(8);
            }
        }
    }
}
