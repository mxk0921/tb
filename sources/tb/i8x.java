package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.WeexFrameLayout;
import com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.GuangProfileWeexModule;
import com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.WeexContainer;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.tao.flexbox.layoutmanager.core.l;
import com.taobao.weex.common.Constants;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import org.json.JSONObject;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i8x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f21161a;
    public WeexInstance b;
    public WeexContainer c;
    public int d;
    public final cod e;
    public String g;
    public Uri h;
    public final j6x i = new c();
    public final Activity f = new Activity();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements dde {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.dde
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4568a0fc", new Object[]{this, map});
            } else if (map != null && "horizontal".equals(map.get("axis"))) {
                Object obj = map.get(Constants.Name.CONTENT_OFFSET);
                if ((obj instanceof JSONObject) && ((JSONObject) obj).optDouble("x", vu3.b.GEO_NOT_SUPPORT) > i8x.a(i8x.this)) {
                    i8x.b(i8x.this).setWeexConsume(WeexFrameLayout.WEEX_STATE_NOT_CONSUME);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements pce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.pce
        public void a(Map<String, Object> map) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("267b7fce", new Object[]{this, map});
            } else if (map != null && !map.isEmpty()) {
                boolean o = nwv.o(map.get("state"), false);
                WeexContainer b = i8x.b(i8x.this);
                if (o) {
                    str = WeexFrameLayout.WEEX_STATE_CONSUME;
                } else {
                    str = WeexFrameLayout.WEEX_STATE_NOT_CONSUME;
                }
                b.setWeexConsume(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements j6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.j6x
        public void E1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
                return;
            }
            tfs.e("WeexSecondPage", "onInitSuccess @" + weexInstance.getInstanceId());
        }

        @Override // tb.j6x
        public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            } else {
                i8x.c(i8x.this, "onRenderFailed", new String[]{"isRefresh", String.valueOf(z), "WeexErrorType", weexErrorType.name(), "errorMsg", str});
            }
        }

        @Override // tb.j6x
        public void I1(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
                return;
            }
            tfs.e("WeexSecondPage", "onDestroyed @" + weexInstance.getInstanceId());
        }

        @Override // tb.j6x
        public void K0(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            }
        }

        @Override // tb.j6x
        public void K1(WeexInstance weexInstance, boolean z) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
                return;
            }
            StringBuilder sb = new StringBuilder("onRenderSuccess @");
            sb.append(weexInstance.getInstanceId());
            sb.append(":");
            if (i8x.d(i8x.this) == null) {
                str = "";
            } else {
                str = i8x.d(i8x.this).toString();
            }
            sb.append(str);
            tfs.e("WeexSecondPage", sb.toString());
        }

        @Override // tb.j6x
        public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
            } else {
                i8x.c(i8x.this, "onEngineException", new String[]{"WeexErrorType", weexErrorType.name(), "errorMsg", str});
            }
        }

        @Override // tb.j6x
        public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
            } else {
                i8x.c(i8x.this, "onScriptException", new String[]{"WeexErrorType", weexErrorType.name(), "errorMsg", str});
            }
        }

        @Override // tb.j6x
        public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
            } else {
                i8x.c(i8x.this, "onExecuteFailed", new String[]{"WeexErrorType", weexErrorType.name(), "errorMsg", str});
            }
        }

        @Override // tb.j6x
        public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            } else {
                i8x.c(i8x.this, "onInitFailed", new String[]{"isCache", String.valueOf(z), "WeexErrorType", weexErrorType.name(), "errorMsg", str});
            }
        }
    }

    static {
        t2o.a(502268081);
    }

    public i8x(cod codVar) {
        this.e = codVar;
    }

    public static /* synthetic */ int a(i8x i8xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4e0db9", new Object[]{i8xVar})).intValue();
        }
        return i8xVar.d;
    }

    public static /* synthetic */ WeexContainer b(i8x i8xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexContainer) ipChange.ipc$dispatch("94f52e54", new Object[]{i8xVar});
        }
        return i8xVar.c;
    }

    public static /* synthetic */ void c(i8x i8xVar, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d1bf94d", new Object[]{i8xVar, str, strArr});
        } else {
            i8xVar.k(str, strArr);
        }
    }

    public static /* synthetic */ Uri d(i8x i8xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("5b5c3a80", new Object[]{i8xVar});
        }
        return i8xVar.h;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6377f2", new Object[]{this});
            return;
        }
        m();
        WeexInstance weexInstance = this.b;
        if (weexInstance != null) {
            weexInstance.onViewDisappear();
            this.b.dispatchEvent(WeexEventTarget.WINDOW_TARGET, "onDataClear", null);
            tfs.e("WeexSecondPage", "onClearContent @" + this.b.getInstanceId());
        }
    }

    public View f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f896c361", new Object[]{this, context});
        }
        tfs.e("WeexSecondPage", "onCreateRootView context:" + context + " ;;; " + this);
        this.f21161a = context;
        WeexContainer weexContainer = new WeexContainer(context);
        this.c = weexContainer;
        weexContainer.setBackgroundColor(-1);
        this.d = nwv.t(akt.H2("weexTouchSlop", "3"), 3);
        return this.c;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (this.b != null) {
            tfs.e("WeexSecondPage", "onDestroy @" + this.b.getInstanceId());
            this.b.destroy();
            this.b = null;
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        m();
        WeexInstance weexInstance = this.b;
        if (weexInstance != null) {
            weexInstance.onViewDisappear();
            tfs.e("WeexSecondPage", "onPause @" + this.b.getInstanceId());
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        l();
        WeexInstance weexInstance = this.b;
        if (weexInstance != null) {
            weexInstance.onViewAppear();
            tfs.e("WeexSecondPage", "onResume @" + this.b.getInstanceId());
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c22035b6", new Object[]{this});
            return;
        }
        c2v.getInstance().pageDestroyed(this.f);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(this.g);
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(this.f);
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86e8650", new Object[]{this});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f);
        }
    }

    public void i(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0b38e86", new Object[]{this, uri, str});
            return;
        }
        this.h = uri;
        this.g = str;
        l();
        WeexValue b2 = com.taobao.android.weex.b.e().b(new com.alibaba.fastjson.JSONObject(a0n.b(uri)));
        tfs.e("WeexSecondPage", "onRenderContent weexInstance: " + this.b + " ;;; context: " + this.f21161a + " ;;; " + this);
        if (this.c != null) {
            WeexInstance weexInstance = this.b;
            if (weexInstance != null) {
                weexInstance.onViewAppear();
                this.b.dispatchEvent(WeexEventTarget.WINDOW_TARGET, "onDataChange", b2);
            } else if (this.f21161a != null) {
                WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
                WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
                weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
                weexUnicornConfig.k(true);
                weexInstanceConfig.s(weexUnicornConfig);
                Context context = this.f21161a;
                WeexInstance a2 = com.taobao.android.weex.b.a(context, a0n.a() + "&profileContainerMode=embed", WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, weexInstanceConfig);
                this.b = a2;
                a2.setTag("ut_page_object", this.f);
                this.b.addInstanceListener(this.i);
                this.b.initWithURL(a0n.a());
                this.b.render(b2);
                this.b.setTag("profileContainer", this.e);
                this.b.registerModule("guangProfile", GuangProfileWeexModule.class);
                ((q6x) this.b.getExtend(q6x.class)).setWeexScrollListener(new a());
                ((q6x) this.b.getExtend(q6x.class)).setGestureEventListener(new b());
                View rootView = this.b.getRootView();
                if (rootView.getParent() != null) {
                    ((ViewGroup) rootView.getParent()).removeView(rootView);
                }
                this.c.addView(rootView, new FrameLayout.LayoutParams(-1, -1));
            }
            this.c.setWeexConsume(WeexFrameLayout.WEEX_STATE_NOT_EXIST);
        }
        StringBuilder sb = new StringBuilder("onRenderContent end");
        Uri uri2 = this.h;
        Object obj = "";
        sb.append(uri2 == null ? obj : uri2.toString());
        sb.append("@");
        WeexInstance weexInstance2 = this.b;
        if (weexInstance2 != null) {
            obj = Integer.valueOf(weexInstance2.getInstanceId());
        }
        sb.append(obj);
        tfs.e("WeexSecondPage", sb.toString());
    }

    public final void k(String str, String... strArr) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea46f43a", new Object[]{this, str, strArr});
            return;
        }
        StringBuilder sb = new StringBuilder("profileUrl=");
        Uri uri = this.h;
        if (uri == null) {
            str2 = "";
        } else {
            str2 = uri.toString();
        }
        sb.append(str2);
        for (int i = 0; i < strArr.length; i += 2) {
            sb.append(",");
            String str4 = strArr[i];
            int i2 = i + 1;
            if (i2 < strArr.length) {
                str3 = strArr[i2];
            } else {
                str3 = "";
            }
            sb.append(str4);
            sb.append("=");
            sb.append(str3);
        }
        String sb2 = sb.toString();
        l.d(false, 100, str, null, sb2, a0n.a(), null, null, null, null);
        tfs.e("WeexSecondPage", "reportError:" + sb2);
    }
}
