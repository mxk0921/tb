package tb;

import android.content.Context;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.live.home.dinamic.view.TBLFrameLayout;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.taolivecontainer.TBLiveH5Container;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class re6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLVWEBVIEW_DATAINFO = 2034718900751390766L;
    public static final long DXTBLVWEBVIEW_DISABLEDEFAULTLIFECYCLE = 1092412866410492448L;
    public static final long DXTBLVWEBVIEW_TBLVWEBVIEW = -4365067432113244932L;
    public static final long DXTBLVWEBVIEW_WEBURL = 10439701118004535L;
    public String b;
    public nkr c;
    public TBLiveH5Container d;
    public TBLFrameLayout e;
    public boolean f;

    /* renamed from: a  reason: collision with root package name */
    public boolean f27314a = false;
    public boolean g = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements z1e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(re6 re6Var) {
        }

        @Override // tb.z1e
        public void a(String str, String str2, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10db17d0", new Object[]{this, str, str2, hashMap});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "0", hashMap).build());
            }
        }

        @Override // tb.z1e
        public void b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("686d1575", new Object[]{this, str, str2, str3});
            } else {
                TLog.loge(str, str2, str3);
            }
        }

        @Override // tb.z1e
        public void c(String str, String str2, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f19d48be", new Object[]{this, str, str2, hashMap});
                return;
            }
            UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str, "Button-" + str2);
            uTHitBuilders$UTControlHitBuilder.setProperties(hashMap);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements zdb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(re6 re6Var) {
        }

        @Override // tb.zdb
        public String a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("86036ea6", new Object[]{this, str, str2, str3});
            }
            return OrangeConfig.getInstance().getConfig(str, str2, str3);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355479);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new re6();
        }
    }

    static {
        t2o.a(806355476);
    }

    public static /* synthetic */ Object ipc$super(re6 re6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
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
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/widget/DXTBLVWebViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new re6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXTBLVWEBVIEW_DISABLEDEFAULTLIFECYCLE) {
            return 0;
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof re6)) {
            super.onClone(dXWidgetNode, z);
            re6 re6Var = (re6) dXWidgetNode;
            this.f27314a = re6Var.f27314a;
            this.b = re6Var.b;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        if (context == null) {
            return super.onCreateView(context);
        }
        r0h.b("DXTBLVWebViewWidgetNode", "onCreateView " + this);
        TBLFrameLayout tBLFrameLayout = new TBLFrameLayout(context);
        this.e = tBLFrameLayout;
        return tBLFrameLayout;
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
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTBLVWEBVIEW_DISABLEDEFAULTLIFECYCLE) {
            if (i == 0) {
                z = false;
            }
            this.f27314a = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j != 2034718900751390766L) {
            super.onSetMapAttribute(j, jSONObject);
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
        r0h.b("DXTBLVWebViewWidgetNode", "onRenderView " + this + " mUrlChanged:" + this.g);
        if (this.e == null && view != null && (view instanceof TBLFrameLayout)) {
            TBLFrameLayout tBLFrameLayout = (TBLFrameLayout) view;
            if (tBLFrameLayout.getChildCount() > 0 && (tBLFrameLayout.getChildAt(0) instanceof TBLiveH5Container)) {
                ((TBLiveH5Container) tBLFrameLayout.getChildAt(0)).destroy();
                tBLFrameLayout.removeAllViews();
            }
            this.e = tBLFrameLayout;
        }
        if (this.c == null || this.g) {
            this.g = false;
            r0h.b("DXTBLVWebViewWidgetNode", "onRenderView " + this + " new mTBLiveH5ContainerBuilder");
            nkr nkrVar = new nkr(context, "LiveHomeTab", new a(this), new b(this));
            this.c = nkrVar;
            nkrVar.n(this.b);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXTBLVWEBVIEW_WEBURL) {
            if (!TextUtils.isEmpty(this.b) && !this.b.equals(str)) {
                this.g = true;
            }
            r0h.b("DXTBLVWebViewWidgetNode", "onSetStringAttribute " + this + " webUrl:" + this.b);
            this.b = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent.getEventId() == 10002 || dXEvent.getEventId() == 5288671110273408574L) {
            r0h.b("DXTBLVWebViewWidgetNode", "onEvent " + this + " DX_APPEAR");
            if (!this.f && this.e != null) {
                r0h.b("DXTBLVWebViewWidgetNode", "onEvent " + this + " DX_APPEAR mInit false");
                this.f = true;
                this.c.k(this.b);
                TBLiveH5Container f = this.c.f();
                this.d = f;
                f.setEnableWebViewGestureLogic(e2h.p());
                this.e.addView(this.d);
            }
            if (this.d != null) {
                r0h.b("DXTBLVWebViewWidgetNode", "onEvent " + this + " mTBLiveH5Container.pageAppear()");
                if (this.f27314a) {
                    WVStandardEventCenter.postNotificationToJS(this.d, "TBLiveHomePlugin.onSearchTopADCardAppear", "{}");
                } else {
                    this.d.pageAppear();
                }
            }
        } else if (dXEvent.getEventId() == 10003 || dXEvent.getEventId() == 5388973340095122049L) {
            if (this.d != null) {
                r0h.b("DXTBLVWebViewWidgetNode", "onEvent " + this + " mTBLiveH5Container.pageDisAppear()");
                if (this.f27314a) {
                    WVStandardEventCenter.postNotificationToJS(this.d, "TBLiveHomePlugin.onSearchTopADCardDisappear", "{}");
                } else {
                    this.d.pageDisAppear();
                }
            }
        } else if (dXEvent.getEventId() == 10000) {
            if (this.d != null) {
                r0h.b("DXTBLVWebViewWidgetNode", "onEvent " + this + " mTBLiveH5Container.onResume()");
                this.d.onResume();
            }
        } else if (dXEvent.getEventId() == 10001) {
            if (this.d != null) {
                r0h.b("DXTBLVWebViewWidgetNode", "onEvent " + this + " mTBLiveH5Container.onPause()");
                this.d.onPause();
            }
        } else if (dXEvent.getEventId() == 10004) {
            if (this.d != null) {
                r0h.b("DXTBLVWebViewWidgetNode", "onEvent " + this + " mTBLiveH5Container.destroy()");
                this.d.destroy();
            } else {
                z = false;
            }
            if (this.c != null && !z) {
                r0h.b("DXTBLVWebViewWidgetNode", "onEvent " + this + " mTBLiveH5ContainerBuilder.destroy()");
                this.c.a();
            }
        }
        return super.onEvent(dXEvent);
    }
}
