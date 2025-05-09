package tb;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.common.TRWidgetConstant;
import com.alibaba.triver.cannal_engine.event.IDXWidgetEvent;
import com.alibaba.triver.cannal_engine.event.nativeembed.NativeWidgetNestedRenderContainer;
import com.alibaba.triver.cannal_engine.manager.TRWidgetInstanceManager;
import com.alibaba.triver.cannal_engine.scene.WidgetStartParams;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gf6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTRWIDGETVIEW_DEBUGURL = 2039222475875855938L;
    public static final long DXTRWIDGETVIEW_DOWNGRADEPIC = -5669943142817255453L;
    public static final long DXTRWIDGETVIEW_EXTRADATA = 1374035529445903015L;
    public static final long DXTRWIDGETVIEW_INITDATA = 3521967542925970230L;
    public static final long DXTRWIDGETVIEW_LOADINGPIC = -5875488234411868668L;
    public static final long DXTRWIDGETVIEW_METAINFO = 4689624929528691771L;
    public static final long DXTRWIDGETVIEW_OFFLINEDOWNGRADEPIC = -1338052012691369043L;
    public static final long DXTRWIDGETVIEW_RELATIONURL = 7063849423137885340L;
    public static final long DXTRWIDGETVIEW_SCENEPARAMS = 4479639587008577405L;
    public static final long DXTRWIDGETVIEW_SPMURL = 10151332148980425L;
    public static final long DXTRWIDGETVIEW_SUBSCRIBESCENEID = 7704921073715745389L;
    public static final long DXTRWIDGETVIEW_TRWIDGETVIEW = -5329577880870718543L;
    public static final long DXTRWIDGETVIEW_VERSION = 5435381891761953165L;
    public static final long DXTRWIDGETVIEW_VISUALX = 5435960974756632435L;
    public static final long DXTRWIDGETVIEW_VISUALY = 5435960974756632564L;
    public static final long DXTRWIDGETVIEW_WIDGETHEIGHT = -2514211213979615255L;
    public static final long DXTRWIDGETVIEW_WIDGETID = 7638940145981662009L;
    public static final long DXTRWIDGETVIEW_WIDGETWIDTH = 5473119589518193295L;

    /* renamed from: a  reason: collision with root package name */
    public String f19941a;
    public String b;
    public JSONObject c;
    public String d;
    public String e;
    public JSONObject f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l = -1;
    public int m = -1;
    public int n = 0;
    public int o = 0;
    public String p;
    public String q;
    public TUrlImageView r;
    public FrameLayout s;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(gf6 gf6Var) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements TRWidgetInstance.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f19942a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ TRWidgetInstance d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ fks f19943a;

            public a(fks fksVar) {
                this.f19943a = fksVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b bVar = b.this;
                gf6.t(gf6.this, bVar.c, bVar.f19942a, this.f19943a);
            }
        }

        public b(FrameLayout frameLayout, String str, Context context, TRWidgetInstance tRWidgetInstance) {
            this.f19942a = frameLayout;
            this.b = str;
            this.c = context;
            this.d = tRWidgetInstance;
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.i
        public void e(fks fksVar, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3608db", new Object[]{this, fksVar, map});
                return;
            }
            this.f19942a.post(new a(fksVar));
            if (!TextUtils.equals(fksVar.f19372a, TRWidgetConstant.CL_TRIVER_INITING.f19372a)) {
                RVLogger.e("DXTRWidgetViewWidgetNode", "renderError" + fksVar.f19372a + fksVar.b);
                this.d.destroy();
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.i
        public void onRenderSuccess(View view) {
            FrameLayout frameLayout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b98d4f3d", new Object[]{this, view});
                return;
            }
            FrameLayout frameLayout2 = this.f19942a;
            int i = R.id.triver_widget_viewId;
            if ((frameLayout2.getTag(i) instanceof String) && TextUtils.equals(this.b, (String) this.f19942a.getTag(i)) && (frameLayout = this.f19942a) != null) {
                frameLayout.removeAllViews();
                this.f19942a.addView(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f19944a;

        public c(Context context) {
            this.f19944a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ((IDXWidgetEvent) RVProxy.get(IDXWidgetEvent.class)).openApp(this.f19944a, Uri.parse(gf6.u(gf6.this)), new Bundle());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$alibaba$triver$cannal_engine$common$TRWidgetConstant$WidgetState;

        static {
            int[] iArr = new int[TRWidgetConstant.WidgetState.values().length];
            $SwitchMap$com$alibaba$triver$cannal_engine$common$TRWidgetConstant$WidgetState = iArr;
            try {
                iArr[TRWidgetConstant.WidgetState.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$triver$cannal_engine$common$TRWidgetConstant$WidgetState[TRWidgetConstant.WidgetState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$triver$cannal_engine$common$TRWidgetConstant$WidgetState[TRWidgetConstant.WidgetState.INITING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$triver$cannal_engine$common$TRWidgetConstant$WidgetState[TRWidgetConstant.WidgetState.RENDERING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(gf6 gf6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
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
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/cannal_engine/scene/DXTRWidgetViewWidgetNode");
        }
    }

    public static /* synthetic */ void t(gf6 gf6Var, Context context, ViewGroup viewGroup, fks fksVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a64696", new Object[]{gf6Var, context, viewGroup, fksVar});
        } else {
            gf6Var.w(context, viewGroup, fksVar);
        }
    }

    public static /* synthetic */ String u(gf6 gf6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("328525a8", new Object[]{gf6Var});
        }
        return gf6Var.e;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new gf6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof gf6)) {
            super.onClone(dXWidgetNode, z);
            gf6 gf6Var = (gf6) dXWidgetNode;
            this.f19941a = gf6Var.f19941a;
            this.b = gf6Var.b;
            this.c = gf6Var.c;
            this.d = gf6Var.d;
            this.e = gf6Var.e;
            this.f = gf6Var.f;
            this.g = gf6Var.g;
            this.h = gf6Var.h;
            this.i = gf6Var.i;
            this.p = gf6Var.p;
            this.j = gf6Var.j;
            this.k = gf6Var.k;
            this.l = gf6Var.l;
            this.m = gf6Var.m;
            this.n = gf6Var.n;
            this.o = gf6Var.o;
            this.q = gf6Var.q;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setOnTouchListener(new a(this));
        return this.s;
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
        if (this.g == null) {
            this.g = getDXRuntimeContext().c();
        }
        if (view != null && (view instanceof FrameLayout)) {
            x(context, view);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTRWIDGETVIEW_VISUALX) {
            this.n = i;
        } else if (j == DXTRWIDGETVIEW_VISUALY) {
            this.o = i;
        } else if (j == DXTRWIDGETVIEW_WIDGETHEIGHT) {
            this.l = i;
        } else if (j == DXTRWIDGETVIEW_WIDGETWIDTH) {
            this.m = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == DXTRWIDGETVIEW_EXTRADATA) {
            this.c = jSONObject;
        } else if (j == DXTRWIDGETVIEW_SCENEPARAMS) {
            this.f = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXTRWIDGETVIEW_DEBUGURL) {
            this.f19941a = str;
        } else if (j == DXTRWIDGETVIEW_DOWNGRADEPIC) {
            this.b = str;
        } else if (j == DXTRWIDGETVIEW_OFFLINEDOWNGRADEPIC) {
            this.d = str;
        } else if (j == DXTRWIDGETVIEW_RELATIONURL) {
            this.e = str;
        } else if (j == DXTRWIDGETVIEW_SUBSCRIBESCENEID) {
            this.g = str;
        } else if (j == 5435381891761953165L) {
            this.h = str;
        } else if (j == DXTRWIDGETVIEW_LOADINGPIC) {
            this.k = str;
        } else if (j == DXTRWIDGETVIEW_WIDGETID) {
            this.i = str;
        } else if (j == DXTRWIDGETVIEW_SPMURL) {
            this.j = str;
        } else if (j == DXTRWIDGETVIEW_METAINFO) {
            this.p = str;
        } else if (j == DXTRWIDGETVIEW_INITDATA) {
            this.q = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void v(Context context, String str, FrameLayout frameLayout) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a92b79", new Object[]{this, context, str, frameLayout});
            return;
        }
        frameLayout.removeAllViews();
        TRWidgetInstance tRWidgetInstance = new TRWidgetInstance((FragmentActivity) context);
        tRWidgetInstance.setRootContainer(new NativeWidgetNestedRenderContainer(context));
        tRWidgetInstance.registerWidgetRenderListener(new b(frameLayout, str, context, tRWidgetInstance));
        WidgetStartParams widgetStartParams = new WidgetStartParams();
        widgetStartParams.setDebugUrl(this.f19941a);
        widgetStartParams.setWidgetId(this.i);
        widgetStartParams.setVersion(this.h);
        widgetStartParams.setRelationUrl(this.e);
        widgetStartParams.setSpmUrl(this.j);
        JSONObject jSONObject = this.f;
        String str3 = "";
        if (jSONObject != null) {
            str2 = jSONObject.toJSONString();
        } else {
            str2 = str3;
        }
        widgetStartParams.setSceneParams(str2);
        JSONObject jSONObject2 = this.c;
        if (jSONObject2 != null) {
            str3 = jSONObject2.toJSONString();
        }
        widgetStartParams.setExtraData(str3);
        widgetStartParams.setInitData(this.q);
        widgetStartParams.setHeight(String.valueOf(this.l));
        widgetStartParams.setWidth(String.valueOf(this.m));
        widgetStartParams.setMetaInfo(this.p);
        widgetStartParams.setVisualX(String.valueOf(this.n));
        widgetStartParams.setVisualY(String.valueOf(this.o));
        tRWidgetInstance.render(widgetStartParams);
    }

    public final void w(Context context, ViewGroup viewGroup, fks fksVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4deb1e5a", new Object[]{this, context, viewGroup, fksVar});
        } else if (viewGroup != null && context != null) {
            TUrlImageView tUrlImageView = new TUrlImageView(context);
            this.r = tUrlImageView;
            tUrlImageView.setBackgroundColor(Color.parseColor("#F5F5F5"));
            if (TextUtils.equals(fksVar.f19372a, TRWidgetConstant.WIDGET_OFFLINE_ERROR_CODE)) {
                str = this.d;
            } else if (TextUtils.equals(fksVar.f19372a, TRWidgetConstant.CL_TRIVER_INITING.f19372a)) {
                str = this.k;
            } else {
                String str2 = this.b;
                this.r.setOnClickListener(new c(context));
                str = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.r.setSkipAutoSize(true);
                this.r.setImageUrl(str);
            }
            viewGroup.removeAllViews();
            viewGroup.addView(this.r);
        }
    }

    public final void x(Context context, View view) {
        WeakReference<TRWidgetInstance> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd74a550", new Object[]{this, context, view});
            return;
        }
        try {
            String string = getDXRuntimeContext().i().getString("id");
            view.setTag(R.id.triver_widget_viewId, string);
            TRWidgetInstance tRWidgetInstance = (TextUtils.isEmpty(string) || (weakReference = TRWidgetInstanceManager.d().e(this.g).get(string)) == null) ? null : weakReference.get();
            if (tRWidgetInstance != null) {
                int i = d.$SwitchMap$com$alibaba$triver$cannal_engine$common$TRWidgetConstant$WidgetState[tRWidgetInstance.getWidgetState().a().ordinal()];
                if (i == 1) {
                    v(context, string, (FrameLayout) view);
                } else if (i == 2) {
                    View rootView = tRWidgetInstance.getRootView();
                    if (rootView.getParent() != null) {
                        ((FrameLayout) rootView.getParent()).removeView(rootView);
                    }
                    ((FrameLayout) view).removeAllViews();
                    RVLogger.e("TRWidgetInstanceManager", "reuse instance in cache, scene id: " + this.g + ",cache id :" + string);
                    ((FrameLayout) view).addView(rootView);
                }
            } else {
                v(context, string, (FrameLayout) view);
            }
        } catch (Exception e) {
            w(context, (FrameLayout) view, TRWidgetConstant.CL_CONTEXT_ERROR);
            RVLogger.e("DXTRWidgetViewWidgetNode", e.getMessage());
        }
    }
}
