package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class oe6 extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLTEXTVIEW_TBBACKGROUND = -6737373688188729886L;
    public static final long DXTBLTEXTVIEW_TBCURRENTLIVESTATE = -5287008133921364644L;
    public static final long DXTBLTEXTVIEW_TBFORMAT = 6747344829235899719L;
    public static final long DXTBLTEXTVIEW_TBGONEIFNULL = 1035483994773344437L;
    public static final long DXTBLTEXTVIEW_TBGRAVITY = 3862299103696272581L;
    public static final long DXTBLTEXTVIEW_TBID = 38174466807L;
    public static final long DXTBLTEXTVIEW_TBLTEXTVIEW = -751409426283369939L;
    public static final long DXTBLTEXTVIEW_TBMAXEMS = 6747375821444433961L;
    public static final long DXTBLTEXTVIEW_TBPADDINGBOTTOM = 7022375299976625425L;
    public static final long DXTBLTEXTVIEW_TBPADDINGLEFT = -6983831935715007195L;
    public static final long DXTBLTEXTVIEW_TBPADDINGRIGHT = -7076232766810975591L;
    public static final long DXTBLTEXTVIEW_TBPADDINGTOP = 3122016736477979084L;
    public static final long DXTBLTEXTVIEW_TBTEXT = 10220209854042305L;
    public static final long DXTBLTEXTVIEW_TBVISIBLESTATE = 5637158515563704755L;

    /* renamed from: a  reason: collision with root package name */
    public String f25328a;
    public String b;
    public String c;
    public Object d;
    public String e;
    public Object f;
    public int g = -1;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public String l;
    public String m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779092446);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new oe6();
        }
    }

    static {
        t2o.a(779092445);
    }

    public static /* synthetic */ Object ipc$super(oe6 oe6Var, String str, Object... objArr) {
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
            case -732824995:
                super.onBeforeMeasure((TextView) objArr[0]);
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/dinamicx/DXTBLTextViewWidgetNode");
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new oe6();
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXTBLTEXTVIEW_TBMAXEMS) {
            return -1;
        }
        if (j == DXTBLTEXTVIEW_TBPADDINGBOTTOM || j == DXTBLTEXTVIEW_TBPADDINGLEFT || j == DXTBLTEXTVIEW_TBPADDINGRIGHT || j == DXTBLTEXTVIEW_TBPADDINGTOP) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == -6737373688188729886L || j == -5287008133921364644L || j == DXTBLTEXTVIEW_TBFORMAT || j == DXTBLTEXTVIEW_TBGRAVITY || j == 5637158515563704755L) {
            return "";
        }
        return super.getDefaultValueForStringAttr(j);
    }

    @Override // tb.gi6
    public void onBeforeMeasure(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        u(textView);
        t(textView);
        if (!TextUtils.isEmpty(this.e)) {
            textView.setGravity(xm7.c(this.e));
        }
        if (!TextUtils.isEmpty(this.f25328a)) {
            try {
                textView.setBackgroundResource(xm7.d(this.f25328a));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        textView.setPadding(this.i, this.k, this.j, this.h);
        super.onBeforeMeasure(textView);
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
        } else if (dXWidgetNode instanceof oe6) {
            super.onClone(dXWidgetNode, z);
            oe6 oe6Var = (oe6) dXWidgetNode;
            this.f25328a = oe6Var.f25328a;
            this.b = oe6Var.b;
            this.c = oe6Var.c;
            this.d = oe6Var.d;
            this.e = oe6Var.e;
            this.f = oe6Var.f;
            this.g = oe6Var.g;
            this.h = oe6Var.h;
            this.i = oe6Var.i;
            this.j = oe6Var.j;
            this.k = oe6Var.k;
            this.l = oe6Var.l;
            this.m = oe6Var.m;
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
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            u(textView);
            Object obj = this.f;
            if (obj != null) {
                textView.setTag(obj);
            }
            if (!TextUtils.isEmpty(this.f25328a)) {
                try {
                    textView.setBackgroundResource(xm7.d(this.f25328a));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (!TextUtils.isEmpty(this.e)) {
                textView.setGravity(xm7.c(this.e));
            }
            v(textView);
            textView.setPadding(this.i, this.k, this.j, this.h);
            t(textView);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTBLTEXTVIEW_TBMAXEMS) {
            this.g = i;
        } else if (j == DXTBLTEXTVIEW_TBPADDINGBOTTOM) {
            this.h = i;
        } else if (j == DXTBLTEXTVIEW_TBPADDINGLEFT) {
            this.i = i;
        } else if (j == DXTBLTEXTVIEW_TBPADDINGRIGHT) {
            this.j = i;
        } else if (j == DXTBLTEXTVIEW_TBPADDINGTOP) {
            this.k = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == 1035483994773344437L) {
            this.d = obj;
        } else if (j == 38174466807L) {
            this.f = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == -6737373688188729886L) {
            this.f25328a = str;
        } else if (j == -5287008133921364644L) {
            this.b = str;
        } else if (j == DXTBLTEXTVIEW_TBFORMAT) {
            this.c = str;
        } else if (j == DXTBLTEXTVIEW_TBGRAVITY) {
            this.e = str;
        } else if (j == DXTBLTEXTVIEW_TBTEXT) {
            this.l = str;
        } else if (j == 5637158515563704755L) {
            this.m = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void t(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc34074", new Object[]{this, textView});
        } else if (this.g > 0 && !TextUtils.isEmpty(getText()) && getText().length() > this.g) {
            CharSequence subSequence = getText().subSequence(0, this.g);
            setText(subSequence);
            textView.setText(subSequence);
        }
    }

    public final void u(TextView textView) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9c50bb", new Object[]{this, textView});
        } else if (!TextUtils.isEmpty(this.l)) {
            if ("overTenMillion".equals(this.c)) {
                str = vak.b(arq.e(this.l));
            } else if ("onLineNumber".equals(this.c)) {
                str = vak.a(arq.e(this.l));
            } else if (!TextUtils.isEmpty(this.l)) {
                str = this.l;
            } else {
                str = (String) getText();
            }
            setText(str);
            textView.setText(str);
        }
    }

    public final void v(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4766b27c", new Object[]{this, textView});
        } else if (!TextUtils.isEmpty(this.m) && !TextUtils.isEmpty(this.b)) {
            if (this.m.equals(this.b)) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
    }
}
