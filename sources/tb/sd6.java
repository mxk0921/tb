package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.detail.rate.vivid.dinamicX.view.error.DisplayErrorView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class sd6 extends DXWidgetNode implements DisplayErrorView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final long f27965a = 4656405053079209922L;
    public final long b = -1456081616717209175L;
    public final long c = 2348669943913866329L;
    public final long d = 4951885508200836195L;
    public final long e = 8714565938644618098L;
    public final long f = 8458835585798141787L;
    public final long g = 8946215571925488374L;
    public final long h = 5286704319545317965L;
    public final long i = 6474759779441984340L;
    public final long j = 19621076582151L;
    public final long k = 7061442455336343891L;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public JSONObject u;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1c243bd0", new Object[]{this})).longValue();
            }
            return sd6.a();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static final /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46bc34d7", new Object[0])).longValue();
        }
        return 4124152101559887174L;
    }

    public static /* synthetic */ Object ipc$super(sd6 sd6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/view/DXTBErrorViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new sd6();
    }

    @Override // com.taobao.detail.rate.vivid.dinamicX.view.error.DisplayErrorView.a
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6418871e", new Object[]{this});
        } else {
            postEvent(new DXEvent(this.f));
        }
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
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof sd6)) {
            super.onClone(dXWidgetNode, z);
            sd6 sd6Var = (sd6) dXWidgetNode;
            this.l = sd6Var.l;
            this.n = sd6Var.n;
            this.o = sd6Var.o;
            this.p = sd6Var.p;
            this.q = sd6Var.q;
            this.r = sd6Var.r;
            this.m = sd6Var.m;
            this.s = sd6Var.s;
            this.t = sd6Var.t;
            this.u = sd6Var.u;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        return new DisplayErrorView(context, null, 0, 6, null);
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
        if (view instanceof DisplayErrorView) {
            DisplayErrorView displayErrorView = (DisplayErrorView) view;
            displayErrorView.setButtonListener(this);
            displayErrorView.setSubTitle(this.s);
            displayErrorView.setTitle(this.t);
            displayErrorView.setIconUrl(this.o);
            displayErrorView.setButtonTitle(this.m);
            displayErrorView.setMappingCode(this.p);
            displayErrorView.setRetCode(this.r);
            displayErrorView.setErrorMsg(this.n);
            displayErrorView.setApiName(this.l);
            displayErrorView.setResponseCode(this.q);
            displayErrorView.setUserMtopInfo(this.u);
            displayErrorView.initView();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
            return;
        }
        ckf.g(jSONObject, "attr");
        if (j == this.k) {
            this.u = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        ckf.g(str, "attr");
        if (j == this.f27965a) {
            this.l = str;
        } else if (j == this.b) {
            this.m = str;
        } else if (j == this.c) {
            this.n = str;
        } else if (j == this.d) {
            this.o = str;
        } else if (j == this.e) {
            this.p = str;
        } else if (j == this.g) {
            this.q = str;
        } else if (j == this.h) {
            this.r = str;
        } else if (j == this.i) {
            this.s = str;
        } else if (j == this.j) {
            this.t = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }
}
