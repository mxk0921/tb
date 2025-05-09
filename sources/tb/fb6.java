package tb;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling.DXMeasuredRollingTextView;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling.RollingNumberView;
import tb.ofo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fb6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXROLLINGNUMBERVIEW_ISROLLTEXTBOLD = 35744353439362217L;
    public static final long DXROLLINGNUMBERVIEW_ONRENDERFINISH = 8225465646077119148L;
    public static final long DXROLLINGNUMBERVIEW_ROLLDURATION = 1804505513984238091L;
    public static final long DXROLLINGNUMBERVIEW_ROLLINGNUMBERVIEW = 5267730759588085740L;
    public static final long DXROLLINGNUMBERVIEW_ROLLINTERVAL = 6702524853565958922L;
    public static final long DXROLLINGNUMBERVIEW_ROLLREPETITIONCOUNT = -6075904309217442568L;
    public static final long DXROLLINGNUMBERVIEW_ROLLTEXT = 6173449365121493862L;
    public static final long DXROLLINGNUMBERVIEW_ROLLTEXTCOLOR = 8850543877302593130L;
    public static final long DXROLLINGNUMBERVIEW_ROLLTEXTCOLORSTRING = -6003350147710985241L;
    public static final long DXROLLINGNUMBERVIEW_ROLLTEXTFONT = 2837648429109017857L;
    public static final long DXROLLINGNUMBERVIEW_ROLLTEXTSIZE = 2837649331581772805L;
    public static final long DXROLLINGNUMBERVIEW_ROLLTEXTSIZESTRING = -19326424667478654L;
    public static final long DXROLLINGNUMBERVIEW_ROLLTEXTSPACE = 8851115877917452119L;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19162a;
    public String e;
    public String g;
    public int i;
    public int b = 1000;
    public int c = 1000;
    public int d = 1;
    public int f = Color.parseColor("#9F6D45");
    public int h = 74;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(486539477);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new fb6();
        }
    }

    static {
        t2o.a(486539476);
    }

    public static /* synthetic */ Object ipc$super(fb6 fb6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
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
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/widgetnode/DXRollingNumberViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new fb6();
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
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof fb6)) {
            super.onClone(dXWidgetNode, z);
            fb6 fb6Var = (fb6) dXWidgetNode;
            this.f19162a = fb6Var.f19162a;
            this.b = fb6Var.b;
            this.c = fb6Var.c;
            this.d = fb6Var.d;
            this.e = fb6Var.e;
            this.f = fb6Var.f;
            this.g = fb6Var.g;
            this.h = fb6Var.h;
            this.i = fb6Var.i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new RollingNumberView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            super.onMeasure(i, i2);
        } else {
            DXMeasuredRollingTextView dXMeasuredRollingTextView = new DXMeasuredRollingTextView(DinamicXEngine.x());
            dXMeasuredRollingTextView.setText(mfo.b(this.e));
            dXMeasuredRollingTextView.setTextSize(0, this.h);
            int i3 = this.i;
            if (i3 != 0) {
                dXMeasuredRollingTextView.setLetterSpacing(i3);
            }
            mfo.f(dXMeasuredRollingTextView, this.f19162a, this.g);
            dXMeasuredRollingTextView.onMeasure(i, i2);
            setMeasuredDimension(dXMeasuredRollingTextView.getMeasuredWidthAndState(), dXMeasuredRollingTextView.getMeasuredHeightAndState());
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
        if (!(view instanceof RollingNumberView)) {
            fve.e("DXRollingNumberViewWidgetNode", "onRenderView：当前的view不是RollingNumberView类型");
            return;
        }
        ((RollingNumberView) view).setRollingViewStyleAttributes(new ofo.b(this.e, this.b).m(this.c).k(this.f19162a).p(this.f).r(this.h).n(this.d).s(this.i).q(this.g).o(getMeasuredHeight()).l());
        postEvent(new DXEvent(DXROLLINGNUMBERVIEW_ONRENDERFINISH));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXROLLINGNUMBERVIEW_ISROLLTEXTBOLD) {
            if (i == 0) {
                z = false;
            }
            this.f19162a = z;
        } else if (j == DXROLLINGNUMBERVIEW_ROLLDURATION) {
            this.b = i;
        } else if (j == DXROLLINGNUMBERVIEW_ROLLINTERVAL) {
            this.c = i;
        } else if (j == DXROLLINGNUMBERVIEW_ROLLREPETITIONCOUNT) {
            this.d = i;
        } else if (j == DXROLLINGNUMBERVIEW_ROLLTEXTCOLOR) {
            this.f = i;
        } else if (j == DXROLLINGNUMBERVIEW_ROLLTEXTSIZE) {
            this.h = i;
        } else if (j == DXROLLINGNUMBERVIEW_ROLLTEXTSPACE) {
            this.i = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXROLLINGNUMBERVIEW_ROLLTEXT) {
            this.e = str;
        } else if (j != DXROLLINGNUMBERVIEW_ROLLTEXTCOLORSTRING) {
            if (j == DXROLLINGNUMBERVIEW_ROLLTEXTFONT) {
                this.g = str;
            } else if (j != DXROLLINGNUMBERVIEW_ROLLTEXTSIZESTRING) {
                super.onSetStringAttribute(j, str);
            }
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
        View D = getDXRuntimeContext().D();
        if (!(D instanceof RollingNumberView)) {
            fve.e("DXRollingNumberViewWidgetNode", "onEvent：当前的view不是RollingNumberView类型");
            return false;
        }
        if (dXEvent.getEventId() == 5388973340095122049L) {
            fve.e("DXRollingNumberViewWidgetNode", "disAppear");
            ((RollingNumberView) D).stopAnimation();
        }
        return true;
    }
}
