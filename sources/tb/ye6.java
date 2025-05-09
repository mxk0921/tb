package tb;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.view.GravityCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.dx.view.TLComponentProgress;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ye6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTLCOMPONENTPROGRESS_PROGRESS = 5587939702916175485L;
    public static final long DXTLCOMPONENTPROGRESS_PROGRESSCOLOR = -8545652221886607999L;
    public static final long DXTLCOMPONENTPROGRESS_PROGRESSRADIUS = -6301719628307304725L;
    public static final long DXTLCOMPONENTPROGRESS_PROGRESSWIDTH = -8544938226242412414L;
    public static final long DXTLCOMPONENTPROGRESS_STYLE = 19483287734262L;
    public static final long DXTLCOMPONENTPROGRESS_TLCOMPONENTPROGRESS = 1265485127565201339L;
    public int b;
    public int c;
    public int d;

    /* renamed from: a  reason: collision with root package name */
    public double f32018a = vu3.b.GEO_NOT_SUPPORT;
    public String e = "circle";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(295699896);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new ye6();
        }
    }

    static {
        t2o.a(295699895);
    }

    public static /* synthetic */ Object ipc$super(ye6 ye6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
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
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/dx/DXTLComponentProgressWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new ye6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == DXTLCOMPONENTPROGRESS_PROGRESS) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        return super.getDefaultValueForDoubleAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == DXTLCOMPONENTPROGRESS_STYLE) {
            return "circle";
        }
        return super.getDefaultValueForStringAttr(j);
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
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof ye6)) {
            super.onClone(dXWidgetNode, z);
            ye6 ye6Var = (ye6) dXWidgetNode;
            this.f32018a = ye6Var.f32018a;
            this.b = ye6Var.b;
            this.c = ye6Var.c;
            this.d = ye6Var.d;
            this.e = ye6Var.e;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        Log.e("DXTLComponentProgress", "onCreateView ===== style = " + this.e);
        if (!"horizontal".equals(this.e)) {
            return new TLComponentProgress(context);
        }
        ProgressBar progressBar = new ProgressBar(context, null, 16842872);
        progressBar.setMax(100);
        return progressBar;
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
        Log.e("DXTLComponentProgress", "onRenderView ===== style = " + this.e + " progress = " + this.f32018a + " progressColor = " + this.b);
        if (view instanceof TLComponentProgress) {
            TLComponentProgress tLComponentProgress = (TLComponentProgress) view;
            tLComponentProgress.setProgress(this.f32018a);
            tLComponentProgress.setProgressColor(this.b);
            tLComponentProgress.setProgressRadius(this.c);
            tLComponentProgress.setProgressWidth(this.d);
            tLComponentProgress.postInvalidate();
        } else if (view instanceof ProgressBar) {
            ProgressBar progressBar = (ProgressBar) view;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(iw0.a(context, 4.0f));
            gradientDrawable.setColor(this.b);
            ((LayerDrawable) progressBar.getProgressDrawable()).setDrawableByLayerId(16908301, new ScaleDrawable(gradientDrawable, GravityCompat.START, 1.0f, -1.0f));
            progressBar.setProgress((int) this.f32018a);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
            return;
        }
        Log.e("DXTLComponentProgress", "onSetDoubleAttribute ===== key = " + j + " attr = " + d);
        if (j == DXTLCOMPONENTPROGRESS_PROGRESS) {
            this.f32018a = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        Log.e("DXTLComponentProgress", "onSetIntAttribute ===== key = " + j + " attr = " + i);
        if (j == DXTLCOMPONENTPROGRESS_PROGRESSCOLOR) {
            this.b = i;
        } else if (j == DXTLCOMPONENTPROGRESS_PROGRESSRADIUS) {
            this.c = i;
        } else if (j == DXTLCOMPONENTPROGRESS_PROGRESSWIDTH) {
            this.d = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        Log.e("DXTLComponentProgress", "onSetStringAttribute ===== key = " + j + " attr = " + str);
        if (j == DXTLCOMPONENTPROGRESS_STYLE) {
            this.e = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }
}
