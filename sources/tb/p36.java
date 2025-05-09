package tb;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.ad.impl.dx.view.CubeLayout;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p36 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMMCUBEPAGEVIEW_INTERVAL = 3522016527368756845L;
    public static final long DXMMCUBEPAGEVIEW_MMCUBEPAGEVIEW = 44205113334718783L;
    public static final long DXMMCUBEPAGEVIEW_OBJECTLISTDATA = 1050365400164686523L;
    public static final long DXMMCUBEPAGEVIEW_PAGEANIMDURATION = 5100487284296908920L;
    public static final long DXMMCUBEPAGEVIEW_PID = 525135168;
    public static final long DXMMCUBEPAGEVIEW_SCALETYPE = 1015096712691932083L;
    public static final int DXMMCUBEPAGEVIEW_SCALETYPE_CENTERCROP = 2;
    public static final int DXMMCUBEPAGEVIEW_SCALETYPE_FITCENTER = 0;
    public static final int DXMMCUBEPAGEVIEW_SCALETYPE_FITXY = 1;

    /* renamed from: a  reason: collision with root package name */
    public long f25852a;
    public JSONObject b;
    public long c;
    public String d;
    public int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            p36.this.postEvent(new DXEvent(-6544685697300501093L));
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new p36();
        }
    }

    public static /* synthetic */ Object ipc$super(p36 p36Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1440851004:
                super.onSetLongAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/node/DXMMCubePageViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new p36();
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
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof p36)) {
            super.onClone(dXWidgetNode, z);
            p36 p36Var = (p36) dXWidgetNode;
            this.f25852a = p36Var.f25852a;
            this.b = p36Var.b;
            this.c = p36Var.c;
            this.d = p36Var.d;
            this.e = p36Var.e;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new CubeLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        long eventId = dXEvent.getEventId();
        if (5288671110273408574L == eventId) {
            t();
            return true;
        } else if (5388973340095122049L != eventId) {
            return super.onEvent(dXEvent);
        } else {
            u();
            return true;
        }
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
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 1015096712691932083L) {
            this.e = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        } else if (j == 3522016527368756845L) {
            this.f25852a = j2;
        } else if (j == 5100487284296908920L) {
            this.c = j2;
        } else {
            super.onSetLongAttribute(j, j2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == 1050365400164686523L) {
            this.b = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 525135168) {
            this.d = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void t() {
        IMainFeedsViewService iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725f7687", new Object[]{this});
            return;
        }
        cfc c = j18.c(getDXRuntimeContext());
        if (c != null && (iMainFeedsViewService = (IMainFeedsViewService) c.a(IMainFeedsViewService.class)) != null) {
            boolean b2 = h93.b(iMainFeedsViewService);
            v1.b("DXMMCubePageViewWidgetNode", "onAppear isCacheCard=" + b2);
            if (!b2) {
                getDXRuntimeContext().L().postDelayed(new q36(this), this.f25852a);
            }
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94647df", new Object[]{this});
        } else if (getWRView() != null && (getWRView().get() instanceof CubeLayout)) {
            v1.b("DXMMCubePageViewWidgetNode", "onDisappear stopTick");
            ((CubeLayout) getWRView().get()).stopTick();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        v1.b("DXMMCubePageViewWidgetNode", "onRenderView");
        try {
            if (view instanceof CubeLayout) {
                CubeLayout cubeLayout = (CubeLayout) view;
                cubeLayout.setDuration((int) this.c);
                cubeLayout.setTickInterval(this.c + this.f25852a);
                int i = this.e;
                if (i == 0) {
                    cubeLayout.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
                } else if (i == 1) {
                    cubeLayout.setImageScaleType(ImageView.ScaleType.FIT_XY);
                } else if (i == 2) {
                    cubeLayout.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                cubeLayout.setOnLongClickListener(new a());
                cubeLayout.setPid(this.d);
                cubeLayout.bindData(ut6.a(this.b, (getDXRuntimeContext() == null || getDXRuntimeContext().i() == null) ? null : getDXRuntimeContext().i().getJSONObject("args")));
                t();
            }
        } catch (Throwable th) {
            v1.c("DXMMCubePageViewWidgetNode", "onRenderView", th);
        }
    }
}
