package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.fae;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rl6<K extends View, T extends fae> extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final me5 widgetNodeStrategy = new me5();

    /* renamed from: a  reason: collision with root package name */
    public final nu<K, T> f27455a;
    public final T b;
    public final T c;
    public final tn6 d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a<K extends View, T extends an6> implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final nu<K, T> f27456a;

        static {
            t2o.a(444597426);
            t2o.a(444597451);
        }

        public a(nu<K, T> nuVar) {
            this.f27456a = nuVar;
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new rl6(this.f27456a);
        }
    }

    static {
        t2o.a(444597425);
    }

    public rl6(nu<K, T> nuVar) {
        this.isEnableButter = true;
        setStrategy(widgetNodeStrategy);
        this.f27455a = nuVar;
        tn6 tn6Var = new tn6();
        this.d = tn6Var;
        tn6Var.j(this);
        this.b = nuVar.e();
        this.c = nuVar.e();
    }

    public static /* synthetic */ Object ipc$super(rl6 rl6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1384881104:
                super.onBeginSetConstAttribute((Context) objArr[0]);
                return null;
            case -1237098206:
                super.onEndSetConstAttribute((Context) objArr[0]);
                return null;
            case -857616453:
                super.setBackground((View) objArr[0]);
                return null;
            case -630327606:
                super.sendBroadcastEvent((DXEvent) objArr[0]);
                return null;
            case 220004047:
                return new Integer(super.tryFetchDarkModeColor((String) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXV3WrapperWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new rl6(this.f27455a);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void layoutWithButter(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ce2f7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            getNativeView().layout(i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void measureWithButter(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bfe8b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        getNativeView().measure(i, i2);
        setMeasuredDimension(getNativeView().getMeasuredWidthAndState(), getNativeView().getMeasuredHeightAndState());
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeginSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad746430", new Object[]{this, context});
        } else if (!this.f27455a.b()) {
            super.onBeginSetConstAttribute(context);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        super.onBindEvent(context, view, j);
        lrb b = this.d.b();
        if (b instanceof un6) {
            ((un6) b).a(j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        this.d.e(context);
        K g = this.f27455a.g(this.d, this.c);
        this.d.h(g);
        vn6 vn6Var = (vn6) this.f27455a.d(this.d);
        if (vn6Var != null) {
            this.d.g(vn6Var);
        }
        un6 un6Var = (un6) this.f27455a.c(this.d);
        if (un6Var != null) {
            un6Var.b();
            this.d.f(un6Var);
        }
        return g;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6436122", new Object[]{this, context});
            return;
        }
        super.onEndSetConstAttribute(context);
        if (this.f27455a.b()) {
            createNativeView(context);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (super.onEvent(dXEvent)) {
            return true;
        }
        lrb b = this.d.b();
        if (b instanceof un6) {
            return ((un6) b).c(dXEvent);
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        this.f27455a.l(this.d, view, this.b, this.c);
        this.b.b(this.c);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else {
            this.c.h(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else {
            this.c.d(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else {
            this.c.a(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        } else {
            this.c.e(j, j2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else {
            this.c.f(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else {
            this.c.c(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else {
            this.c.g(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void sendBroadcastEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6df6ca", new Object[]{this, dXEvent});
            return;
        }
        super.sendBroadcastEvent(dXEvent);
        if (getVisibility() == 0) {
            if (5288671110273408574L == dXEvent.getEventId()) {
                this.f27455a.h(this.d);
            } else if (5388973340095122049L == dXEvent.getEventId()) {
                this.f27455a.i(this.d);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setBackground(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
        } else if (!this.f27455a.j(this.d)) {
            super.setBackground(view);
        }
    }

    public T t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((fae) ipChange.ipc$dispatch("29b7288f", new Object[]{this}));
        }
        return this.c;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int tryFetchDarkModeColor(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1cfecf", new Object[]{this, str, new Integer(i), new Integer(i2)})).intValue();
        }
        return super.tryFetchDarkModeColor(str, i, i2);
    }
}
