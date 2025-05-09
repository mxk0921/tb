package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.home.component.view.HImageView;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gra extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_HVIDEOVIEW_ASPECTRATIO = 7594222789952419722L;
    public static final long DX_HVIDEOVIEW_CANPLAY = 4728577732966363983L;
    public static final long DX_HVIDEOVIEW_COVERURL = 1756289496339923034L;
    public static final long DX_HVIDEOVIEW_DURATION = 2057626925900400238L;
    public static final long DX_HVIDEOVIEW_ICONOFFSETY = 8577182346642010996L;
    public static final long DX_HVIDEOVIEW_ICONURL = 4951885508200836195L;
    public static final long DX_HVIDEOVIEW_ONENDPLAYING = -2313153628473349676L;
    public static final long DX_HVIDEOVIEW_ONERRORPLAYING = -2442905352582921527L;
    public static final long DX_HVIDEOVIEW_SCALETYPE = 1015096712691932083L;
    public static final long DX_HVIDEOVIEW_VIDEOURL = 7344459856848172626L;
    public static final long H_VIDEO_VIEW = -8690577844899785500L;
    public static final String TAG = "dx.HVideoView";
    public static final long USER_DEFINE_PARAM_HASH_CODE = 9999999999L;

    /* renamed from: a  reason: collision with root package name */
    public String f20178a = "noDefined";
    public int b = -1;
    public double c = vu3.b.GEO_NOT_SUPPORT;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729809079);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new gra();
        }
    }

    static {
        t2o.a(729809078);
    }

    public static /* synthetic */ Object ipc$super(gra graVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/widgetnode/HVideoViewWidgetNodeClone");
        }
    }

    public final boolean a(DXMsgCenterEvent dXMsgCenterEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bf528f8", new Object[]{this, dXMsgCenterEvent})).booleanValue();
        }
        return true;
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ba6e632", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new gra();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 4728577732966363983L) {
            return 1;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof gra) {
            gra graVar = (gra) dXWidgetNode;
            this.b = graVar.b;
            this.f20178a = graVar.f20178a;
            this.c = graVar.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        HImageView hImageView = new HImageView(context);
        bqa.d(h36.TAG, "videoview=" + getDXRuntimeContext().p());
        return hImageView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent == null) {
            return false;
        }
        if (super.onEvent(dXEvent)) {
            return true;
        }
        long eventId = dXEvent.getEventId();
        if (eventId == -1747756056147111305L) {
            return a((DXMsgCenterEvent) dXEvent);
        }
        if (eventId == 5288671110273408574L) {
            return b("ViewAppear");
        }
        if (eventId == 5388973340095122049L) {
            return b("ViewDisappear");
        }
        if (eventId == -2313153628473349676L) {
            return b("VideoEndPlaying");
        }
        if (eventId == -2442905352582921527L) {
            return b("VideoErrorPlaying");
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (Double.compare(this.c, vu3.b.GEO_NOT_SUPPORT) <= 0) {
            super.onMeasure(i, i2);
        } else {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 != 1073741824) {
                size2 = (int) (size / this.c);
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
            if (mode != 1073741824 && mode2 == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec((int) (size2 * this.c), 1073741824);
            }
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view instanceof HImageView) {
            HImageView hImageView = (HImageView) view;
            setImageScaleType(hImageView, this.b);
            if (!TextUtils.isEmpty(this.f20178a)) {
                p2b.q(hImageView, this.f20178a, "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG);
                hImageView.setImageUrl(this.f20178a);
            }
            hImageView.setAspectRatio((float) this.c);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 7594222789952419722L) {
            this.c = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 1015096712691932083L) {
            this.b = i;
        } else if (j != 4728577732966363983L) {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 1756289496339923034L) {
            this.f20178a = str;
        } else if (j != 2057626925900400238L && j != 8577182346642010996L && j != 7344459856848172626L && j != 4951885508200836195L) {
            super.onSetStringAttribute(j, str);
        }
    }
}
