package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.megadesign.dx.view.DisplayVideoView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e46 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    public String A;
    public boolean o;
    public String p;
    public String q;
    public String r;
    public boolean s;
    public boolean v;
    public JSONObject w;
    public String x;
    public String y;
    public String z;

    /* renamed from: a  reason: collision with root package name */
    public final long f18252a = 1174195036188518487L;
    public final long b = 4692571841309926215L;
    public final long c = 1756289496339923034L;
    public final long d = 4951885508200836195L;
    public final long e = sf5.DXCARTLOTTIEVIEW_ISLOOP;
    public final long f = 9423396980483005L;
    public final long g = -5563993334780806377L;
    public final long h = 1015096712691932083L;
    public final long i = -7928569865764566238L;
    public final long j = 7062494548025744469L;
    public final long k = 5435952498458972235L;
    public final long l = -1723821953575824099L;
    public final long m = -2940280366635818861L;
    public final long n = 7344459856848172626L;
    public boolean t = true;
    public int u = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new e46();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("62ceb26e", new Object[]{this})).longValue();
            }
            return e46.access$getDXMEGAVIDEOVIEW_MEGAVIDEOVIEW$cp();
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c implements qtb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.qtb
        public final boolean hook() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
            }
            e46.this.postEvent(new DXEvent(18903999933159L));
            return true;
        }
    }

    public static final /* synthetic */ long access$getDXMEGAVIDEOVIEW_MEGAVIDEOVIEW$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("506f7179", new Object[0])).longValue();
        }
        return -1457195038351457670L;
    }

    public static /* synthetic */ Object ipc$super(e46 e46Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megadesign/dx/view/DXMegaVideoWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new e46();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == this.f18252a || j == this.e) {
            return 0;
        }
        if (j == this.f || j == this.g) {
            return 1;
        }
        if (j == this.h || j == this.i) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (j == 18903999933159L && (view instanceof DisplayVideoView)) {
            ((DisplayVideoView) view).hookRootViewClickListener(new c());
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        ckf.g(dXWidgetNode, "widgetNode");
        if (dXWidgetNode instanceof e46) {
            super.onClone(dXWidgetNode, z);
            e46 e46Var = (e46) dXWidgetNode;
            this.o = e46Var.o;
            this.p = e46Var.p;
            this.q = e46Var.q;
            this.r = e46Var.r;
            this.s = e46Var.s;
            this.t = e46Var.t;
            this.u = e46Var.u;
            this.v = e46Var.v;
            this.w = e46Var.w;
            this.x = e46Var.x;
            this.y = e46Var.y;
            this.z = e46Var.z;
            this.A = e46Var.A;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        return new DisplayVideoView(context, null, 0, 6, null);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ckf.g(context, "context");
        ckf.g(view, "weakView");
        if (view instanceof DisplayVideoView) {
            DisplayVideoView displayVideoView = (DisplayVideoView) view;
            displayVideoView.setLayoutMeasure(getMeasuredWidth(), getMeasuredHeight());
            displayVideoView.setVideoUrl(this.A);
            displayVideoView.setVideoID(this.x);
            displayVideoView.setPlayScene(this.y);
            displayVideoView.setVideoSource(this.z);
            displayVideoView.setCoverImage(this.q);
            displayVideoView.setPlayButtonImage(this.r);
            displayVideoView.setLooping(this.s);
            displayVideoView.setMuted(this.t);
            displayVideoView.setScaleType(this.u);
            displayVideoView.setUtParams(this.w);
            displayVideoView.setBizCode(this.p);
            displayVideoView.setShowProgress(this.v);
            displayVideoView.setAutoPlay(this.o);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == this.f18252a) {
            if (i == 0) {
                z = false;
            }
            this.o = z;
        } else if (j == this.e) {
            if (i == 0) {
                z = false;
            }
            this.s = z;
        } else if (j == this.f) {
            if (i == 0) {
                z = false;
            }
            this.t = z;
        } else if (j != this.g) {
            if (j == this.h) {
                this.u = i;
            } else if (j == this.i) {
                if (i == 0) {
                    z = false;
                }
                this.v = z;
            } else {
                super.onSetIntAttribute(j, i);
            }
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
        if (j == this.j) {
            this.w = jSONObject;
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
        if (j == this.b) {
            this.p = str;
        } else if (j == this.c) {
            this.q = str;
        } else if (j == this.d) {
            this.r = str;
        } else if (j == this.k) {
            this.x = str;
        } else if (j == this.l) {
            this.y = str;
        } else if (j == this.m) {
            this.z = str;
        } else if (j == this.n) {
            this.A = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }
}
