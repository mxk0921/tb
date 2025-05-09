package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.live.home.dinamic.widget.DXTBLNativeTextView;
import java.lang.ref.WeakReference;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ie6 extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLLONGTEXTVIEW_AUTOMARQUEE = -5950721573490668908L;
    public static final long DXTBLLONGTEXTVIEW_AUTOSCROLLCOUNT = 7477792296168784448L;
    public static final long DXTBLLONGTEXTVIEW_MASKOFFSET = 246221371456618525L;
    public static final long DXTBLLONGTEXTVIEW_ONRENDERSTART = 475569627329002840L;
    public static final long DXTBLLONGTEXTVIEW_POSTDELAYTIME = 3435432043787506769L;
    public static final long DXTBLLONGTEXTVIEW_SCROLLSPEED = -3216884856980908405L;
    public static final long DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE = 8636106913325898820L;
    public static final int DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE_CHAR = 4;
    public static final int DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE_END = 3;
    public static final int DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE_MARQUEE = 5;
    public static final int DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE_MIDDLE = 2;
    public static final int DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE_NONE = 0;
    public static final int DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE_START = 1;
    public static final long DXTBLLONGTEXTVIEW_TBLLONGTEXTVIEW = -2687929348506082367L;
    public static final long DXTBLLONGTEXTVIEW_TBLNEEDTEXTGRADIENT = -2473910951344296284L;
    public static final long DXTBLLONGTEXTVIEW_TEXTANIMALTIME = 3840376292083896244L;

    /* renamed from: a  reason: collision with root package name */
    public boolean f21273a;
    public int b;
    public int d;
    public boolean e;
    public int f;
    public boolean g;
    public long i;
    public double c = 20.0d;
    public double h = 5.0d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355469);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new ie6();
        }
    }

    static {
        t2o.a(806355468);
    }

    public static /* synthetic */ Object ipc$super(ie6 ie6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1440851004:
                super.onSetLongAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue());
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
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/widget/DXTBLLongTextViewWidgetNode");
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new ie6();
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXTBLLONGTEXTVIEW_AUTOMARQUEE) {
            return 0;
        }
        if (j == DXTBLLONGTEXTVIEW_POSTDELAYTIME) {
            return 1000;
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

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode instanceof ie6) {
            super.onClone(dXWidgetNode, z);
            ie6 ie6Var = (ie6) dXWidgetNode;
            ie6Var.getClass();
            this.f21273a = ie6Var.f21273a;
            this.c = ie6Var.c;
            this.b = ie6Var.b;
            this.d = ie6Var.d;
            this.e = ie6Var.e;
            this.f = ie6Var.f;
            this.g = ie6Var.g;
            this.h = ie6Var.h;
            this.i = ie6Var.i;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXTBLNativeTextView dXTBLNativeTextView = new DXTBLNativeTextView(context);
        new WeakReference(dXTBLNativeTextView);
        return dXTBLNativeTextView;
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
        if (view instanceof DXTBLNativeTextView) {
            DXTBLNativeTextView dXTBLNativeTextView = (DXTBLNativeTextView) view;
            new WeakReference(dXTBLNativeTextView);
            dXTBLNativeTextView.setAutoMarquee(this.f21273a);
            dXTBLNativeTextView.setPostDelayTime(this.d);
            int i = this.b;
            if (i > 0) {
                dXTBLNativeTextView.setMarqueeRepeatLimit(i);
            }
            long j = this.i;
            if (j > 0) {
                dXTBLNativeTextView.setTextAnimalTime(j);
            }
            double d = this.h;
            if (d > vu3.b.GEO_NOT_SUPPORT) {
                dXTBLNativeTextView.setNewSpeed((float) d);
                dXTBLNativeTextView.startAnimalMarquee();
            }
            if (this.e) {
                dXTBLNativeTextView.startLongTextMarquee();
            } else {
                int i2 = this.f;
                if (i2 != -1) {
                    setNativeEllipsize(dXTBLNativeTextView, i2);
                    if (this.f == 5) {
                        dXTBLNativeTextView.startLongTextMarquee();
                    }
                }
            }
            if (this.g) {
                dXTBLNativeTextView.setHorizontalFadingEdgeEnabled(true);
                double d2 = this.c;
                if (d2 > vu3.b.GEO_NOT_SUPPORT) {
                    dXTBLNativeTextView.setFadingEdgeLength((int) d2);
                }
            }
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == DXTBLLONGTEXTVIEW_MASKOFFSET) {
            this.c = d;
        } else if (j == -3216884856980908405L) {
            this.h = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTBLLONGTEXTVIEW_AUTOMARQUEE) {
            if (i == 0) {
                z = false;
            }
            this.f21273a = z;
        } else if (j == DXTBLLONGTEXTVIEW_AUTOSCROLLCOUNT) {
            this.b = i;
        } else if (j == DXTBLLONGTEXTVIEW_ONRENDERSTART) {
            if (i == 0) {
                z = false;
            }
            this.e = z;
        } else if (j == DXTBLLONGTEXTVIEW_POSTDELAYTIME) {
            this.d = i;
        } else if (j == DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE) {
            this.f = i;
        } else if (j == DXTBLLONGTEXTVIEW_TBLNEEDTEXTGRADIENT) {
            if (i == 0) {
                z = false;
            }
            this.g = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        } else if (j == DXTBLLONGTEXTVIEW_TEXTANIMALTIME) {
            this.i = j2;
        } else {
            super.onSetLongAttribute(j, j2);
        }
    }

    @Override // tb.gi6
    public void setNativeEllipsize(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a49cb7a", new Object[]{this, textView, new Integer(i)});
        } else if (i == 0) {
            textView.setEllipsize(null);
        } else if (i == 1) {
            textView.setEllipsize(TextUtils.TruncateAt.START);
        } else if (i == 2) {
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i == 3) {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else if (i == 5) {
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        }
    }
}
