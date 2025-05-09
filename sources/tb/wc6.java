package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.l5q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wc6 extends gi6 implements ird, l5q.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXSMARTLAYERCOUNTDOWNTEXTVIEW_ENDTEXT = 4804791587174250339L;
    public static final long DXSMARTLAYERCOUNTDOWNTEXTVIEW_ONCOUNTDOWNFINISH = -6786364507638278416L;
    public static final long DXSMARTLAYERCOUNTDOWNTEXTVIEW_PREFIXTEXT = 1675538150673624637L;
    public static final long DXSMARTLAYERCOUNTDOWNTEXTVIEW_REMAINTIME = 7635389953633429269L;
    public static final long DXSMARTLAYERCOUNTDOWNTEXTVIEW_SEPARATOR = 2224965791600290522L;
    public static final long DXSMARTLAYERCOUNTDOWNTEXTVIEW_SMARTLAYERCOUNTDOWNTEXTVIEW = 1841553034361292032L;
    public int c;

    /* renamed from: a  reason: collision with root package name */
    public String f30608a = "";
    public String b = "";
    public String d = "";

    static {
        t2o.a(295699815);
        t2o.a(295699818);
        t2o.a(295699821);
    }

    public static /* synthetic */ Object ipc$super(wc6 wc6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/widgetnode/DXSmartLayerCountDownTextViewWidgetNode");
        }
    }

    public final void A(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d2786", new Object[]{this, new Integer(i)});
            return;
        }
        if (i <= 0) {
            str = this.f30608a;
        } else {
            str = this.b + i + this.d;
        }
        setText(str);
        requestLayout(true);
    }

    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20651e80", new Object[]{this});
        }
        String userId = getUserId();
        return !TextUtils.isEmpty(userId) ? userId : "smart_layer_count_down_node";
    }

    @Override // tb.l5q.b
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e07d19", new Object[]{this, new Long(j)});
        } else {
            A((int) Math.ceil(j / 1000.0d));
        }
    }

    @Override // tb.ird
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaba1ceb", new Object[]{this});
        } else {
            w();
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new wc6();
    }

    @Override // tb.l5q.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b342ed41", new Object[]{this});
        } else {
            v();
        }
    }

    @Override // tb.ird
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c6d5d6", new Object[]{this});
        } else {
            z();
        }
    }

    @Override // tb.ird
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e8be86", new Object[]{this});
        } else {
            x();
        }
    }

    @Override // tb.ird
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8803ed", new Object[]{this});
        } else {
            t();
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

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof wc6)) {
            super.onClone(dXWidgetNode, z);
            wc6 wc6Var = (wc6) dXWidgetNode;
            this.f30608a = wc6Var.f30608a;
            this.b = wc6Var.b;
            this.c = wc6Var.c;
            this.d = wc6Var.d;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return super.onCreateView(context);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        n5q a2 = qn6.a(this);
        if (a2 != null) {
            if (!TextUtils.equals((String) a2.F(B(), "isRender"), "true") && a2.e) {
                a2.E(B(), "isRender", "true");
                d();
            }
            l5q u = u();
            if (u != null && u.b() != null && u.b() != this) {
                u.h(this);
                a(u.e);
            }
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXSMARTLAYERCOUNTDOWNTEXTVIEW_REMAINTIME) {
            this.c = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXSMARTLAYERCOUNTDOWNTEXTVIEW_ENDTEXT) {
            this.f30608a = str;
        } else if (j == DXSMARTLAYERCOUNTDOWNTEXTVIEW_PREFIXTEXT) {
            this.b = str;
        } else if (j == DXSMARTLAYERCOUNTDOWNTEXTVIEW_SEPARATOR) {
            this.d = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("483f279", new Object[]{this});
            return;
        }
        l5q u = u();
        if (u != null) {
            u.h(null);
            u.a();
        }
    }

    public final l5q u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5q) ipChange.ipc$dispatch("3668d073", new Object[]{this});
        }
        n5q a2 = qn6.a(this);
        if (a2 == null) {
            return null;
        }
        Object F = a2.F(B(), "countDownTimer");
        if (F instanceof l5q) {
            return (l5q) F;
        }
        return null;
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41659c6c", new Object[]{this});
            return;
        }
        t();
        A(0);
        postEvent(new DXEvent(DXSMARTLAYERCOUNTDOWNTEXTVIEW_ONCOUNTDOWNFINISH));
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702ba802", new Object[]{this});
            return;
        }
        l5q u = u();
        if (u != null) {
            u.e();
            u.h(null);
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2493972b", new Object[]{this});
            return;
        }
        l5q u = u();
        if (u != null) {
            u.h(this);
            u.f();
        }
    }

    public final void y(l5q l5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d26d135", new Object[]{this, l5qVar});
            return;
        }
        n5q a2 = qn6.a(this);
        if (a2 != null) {
            a2.E(B(), "countDownTimer", l5qVar);
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3ad916", new Object[]{this});
        } else if (u() == null) {
            int i = this.c;
            if (i <= 0) {
                A(0);
                return;
            }
            A(i);
            l5q l5qVar = new l5q(this.c * 1000, 1000L);
            l5qVar.h(this);
            l5qVar.g();
            y(l5qVar);
        } else {
            x();
        }
    }
}
