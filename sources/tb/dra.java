package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.home.component.view.HVideoView;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dra extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_HVIDEOVIEW_ASPECTRATIO = 7594222789952419722L;
    public static final long DX_HVIDEOVIEW_CANPLAY = 4728577732966363983L;
    public static final long DX_HVIDEOVIEW_COVERURL = 1756289496339923034L;
    public static final long DX_HVIDEOVIEW_DURATION = 2057626925900400238L;
    public static final long DX_HVIDEOVIEW_ICONOFFSETY = 8577182346642010996L;
    public static final long DX_HVIDEOVIEW_ICONSIZE = 3509390040415201356L;
    public static final long DX_HVIDEOVIEW_ICONURL = 4951885508200836195L;
    public static final long DX_HVIDEOVIEW_ONENDPLAYING = -2313153628473349676L;
    public static final long DX_HVIDEOVIEW_ONERRORPLAYING = -2442905352582921527L;
    public static final long DX_HVIDEOVIEW_SCALETYPE = 1015096712691932083L;
    public static final long DX_HVIDEOVIEW_VIDEOURL = 7344459856848172626L;
    public static final long H_VIDEO_VIEW = -8690577844899785500L;
    public static final String TAG = "dx.HVideoView";
    public static final long USER_DEFINE_PARAM_HASH_CODE = 9999999999L;

    /* renamed from: a  reason: collision with root package name */
    public String f18028a = "noDefined";
    public String b = "noDefined";
    public String c = "noDefined";
    public String d = "noDefined";
    public String e = "noDefined";
    public String f = "noDefined";
    public boolean g = true;
    public int h = -1;
    public double i = vu3.b.GEO_NOT_SUPPORT;
    public JSONObject j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729809077);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new dra();
        }
    }

    static {
        t2o.a(729809076);
    }

    public static /* synthetic */ Object ipc$super(dra draVar, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/widgetnode/HVideoViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new dra();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof dra) {
            dra draVar = (dra) dXWidgetNode;
            this.h = draVar.h;
            this.f = draVar.f;
            this.e = draVar.e;
            this.c = draVar.c;
            this.d = draVar.d;
            this.b = draVar.b;
            this.f18028a = draVar.f18028a;
            this.i = draVar.i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        HVideoView hVideoView = new HVideoView(context);
        hVideoView.setEnableQueue(false);
        return hVideoView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (Double.compare(this.i, vu3.b.GEO_NOT_SUPPORT) <= 0) {
            super.onMeasure(i, i2);
        } else {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 != 1073741824) {
                size2 = (int) (size / this.i);
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
            if (mode != 1073741824 && mode2 == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec((int) (size2 * this.i), 1073741824);
            }
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view instanceof HVideoView) {
            HVideoView hVideoView = (HVideoView) view;
            JSONObject i = getDXRuntimeContext().i();
            this.j = i;
            hVideoView.updateData(i);
            if (!"noDefined".equals(this.e)) {
                hVideoView.setVideoUrl(this.e);
                sfh.f("dx.HVideoView", "video_load_url=" + this.e);
            }
            if (!"noDefined".equals(this.c)) {
                hVideoView.setIconOffsetY(this.c);
            }
            if (!"noDefined".equals(this.d)) {
                hVideoView.setIconSize(this.d);
            }
            if (!"noDefined".equals(this.f18028a)) {
                hVideoView.setCoverImage(this.f18028a);
            }
            if (!"noDefined".equals(this.f)) {
                hVideoView.setPlayButtonImage(this.f);
            }
            if (!"noDefined".equals(this.b)) {
                hVideoView.setDurationTime(this.b);
            }
            int i2 = this.h;
            if (i2 != -1) {
                u(hVideoView, i2);
            }
            hVideoView.canPlay(this.g);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 7594222789952419722L) {
            this.i = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 1015096712691932083L) {
            this.h = i;
        } else if (j == 4728577732966363983L) {
            if (i != 1) {
                z = false;
            }
            this.g = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 1756289496339923034L) {
            this.f18028a = str;
        } else if (j == 2057626925900400238L) {
            this.b = str;
        } else if (j == 8577182346642010996L) {
            this.c = str;
        } else if (j == 3509390040415201356L) {
            this.d = str;
        } else if (j == 7344459856848172626L) {
            this.e = str;
        } else if (j == 4951885508200836195L) {
            this.f = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void u(HVideoView hVideoView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e541ddde", new Object[]{this, hVideoView, new Integer(i)});
        } else if (i == 0) {
            hVideoView.setScaleType(0);
            hVideoView.setCoverScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (i == 1) {
            hVideoView.setScaleType(3);
            hVideoView.setCoverScaleType(ImageView.ScaleType.FIT_XY);
        } else if (i != 2) {
            hVideoView.setScaleType(0);
            hVideoView.setCoverScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            hVideoView.setScaleType(1);
            hVideoView.setCoverScaleType(ImageView.ScaleType.CENTER_CROP);
        }
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
        if (eventId == 5288671110273408574L) {
            return t("play");
        }
        if (eventId == 5388973340095122049L) {
            return t("pause");
        }
        return false;
    }

    public final boolean t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8857b09", new Object[]{this, str})).booleanValue();
        }
        View D = getDXRuntimeContext().D();
        if (!(D instanceof HVideoView)) {
            return false;
        }
        String str2 = "";
        if (TextUtils.equals(str, "play")) {
            ((HVideoView) D).playVideo();
            JSONObject jSONObject = this.j;
            if (jSONObject != null) {
                str2 = jSONObject.getString("sectionBizCode");
            }
            bqa.e("dx.HVideoView", "start video: section:", str2);
        } else if (TextUtils.equals(str, "pause")) {
            ((HVideoView) D).pauseVideo();
            JSONObject jSONObject2 = this.j;
            if (jSONObject2 != null) {
                str2 = jSONObject2.getString("sectionBizCode");
            }
            bqa.e("dx.HVideoView", "pause video: section:", str2);
            return true;
        }
        return false;
    }
}
