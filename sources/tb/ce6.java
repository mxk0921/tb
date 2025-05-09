package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TBLiveAnimatedView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ce6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLHOMEANIMATEDVIEW_GIFURL = 9274838684923695L;
    public static final long DXTBLHOMEANIMATEDVIEW_INANIMATIONDURATION = -4736355116972779568L;
    public static final long DXTBLHOMEANIMATEDVIEW_MAXLOOPCOUNT = 1982976705946089973L;
    public static final long DXTBLHOMEANIMATEDVIEW_OUTANIMATIONDURATION = 3628868537261324882L;
    public static final long DXTBLHOMEANIMATEDVIEW_PLAYONCE = 5581002417072968515L;
    public static final long DXTBLHOMEANIMATEDVIEW_SCALETYPE = 1015096712691932083L;
    public static final int DXTBLHOMEANIMATEDVIEW_SCALETYPE_CENTERCROP = 2;
    public static final int DXTBLHOMEANIMATEDVIEW_SCALETYPE_FITCENTER = 0;
    public static final int DXTBLHOMEANIMATEDVIEW_SCALETYPE_FITXY = 1;
    public static final long DXTBLHOMEANIMATEDVIEW_TBLHOMEANIMATEDVIEW = -4943396377093514692L;

    /* renamed from: a  reason: collision with root package name */
    public String f17012a;
    public int c;
    public int b = 0;
    public int d = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(310378541);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new ce6();
        }
    }

    static {
        t2o.a(310378540);
    }

    public static /* synthetic */ Object ipc$super(ce6 ce6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
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
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/DXTBLHomeAnimatedViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new ce6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXTBLHOMEANIMATEDVIEW_INANIMATIONDURATION || j == DXTBLHOMEANIMATEDVIEW_OUTANIMATIONDURATION || j == DXTBLHOMEANIMATEDVIEW_PLAYONCE) {
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof ce6)) {
            super.onClone(dXWidgetNode, z);
            ce6 ce6Var = (ce6) dXWidgetNode;
            this.f17012a = ce6Var.f17012a;
            this.b = ce6Var.b;
            this.c = ce6Var.c;
            this.d = ce6Var.d;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new TBLiveAnimatedView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
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
        if (view instanceof TBLiveAnimatedView) {
            ((TBLiveAnimatedView) view).onRender(this.f17012a, this.c, this.b, this.d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTBLHOMEANIMATEDVIEW_INANIMATIONDURATION) {
            this.b = i;
        } else if (j == 1982976705946089973L) {
            this.c = i;
        } else if (j == DXTBLHOMEANIMATEDVIEW_OUTANIMATIONDURATION) {
            this.d = i;
        } else if (j != DXTBLHOMEANIMATEDVIEW_PLAYONCE && j != 1015096712691932083L) {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 9274838684923695L) {
            this.f17012a = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }
}
