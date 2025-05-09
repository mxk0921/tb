package com.taobao.android.detail.industry.scene.weex2.ar;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.arflow.ARTryViewContainer;
import com.taobao.android.detail.industry.ablility.views.ARMakeupNativeView;
import com.taobao.android.detail.industry.tool.monitor.DIMonitorUtil;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.taobao.R;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;
import tb.d3x;
import tb.hd;
import tb.i55;
import tb.j55;
import tb.pkd;
import tb.pvh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ARMakeupWeexView extends WeexPlatformView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ARMakeupWeexView";
    private ARMakeupNativeView nativeView;
    private long openCameraTimeStamp;
    private final FrameLayout rootView;
    private final hd uploadService = new hd();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f6604a;
        public final /* synthetic */ pvh b;

        public a(JSONObject jSONObject, pvh pvhVar) {
            this.f6604a = jSONObject;
            this.b = pvhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ARMakeupWeexView.access$000(ARMakeupWeexView.this, this.f6604a, this.b);
            }
        }
    }

    static {
        t2o.a(440401999);
    }

    public ARMakeupWeexView(Context context, int i) {
        super(context, i);
        this.rootView = new FrameLayout(context);
    }

    public static /* synthetic */ void access$000(ARMakeupWeexView aRMakeupWeexView, JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb1b8b8", new Object[]{aRMakeupWeexView, jSONObject, pvhVar});
        } else {
            aRMakeupWeexView.realOpenCamera(jSONObject, pvhVar);
        }
    }

    public static /* synthetic */ com.alibaba.fastjson.JSONObject access$100(ARMakeupWeexView aRMakeupWeexView, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("cde4536e", new Object[]{aRMakeupWeexView, new Boolean(z), str});
        }
        return aRMakeupWeexView.assembleResult(z, str);
    }

    public static /* synthetic */ long access$200(ARMakeupWeexView aRMakeupWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4b7f805", new Object[]{aRMakeupWeexView})).longValue();
        }
        return aRMakeupWeexView.openCameraTimeStamp;
    }

    public static /* synthetic */ void access$300(ARMakeupWeexView aRMakeupWeexView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78bd6e6", new Object[]{aRMakeupWeexView, str, str2});
        } else {
            aRMakeupWeexView.reportError(str, str2);
        }
    }

    private com.alibaba.fastjson.JSONObject assembleResult(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("a5f36568", new Object[]{this, new Boolean(z), str});
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("success", (Object) Boolean.valueOf(z));
        if (!z) {
            jSONObject.put("errorCode", (Object) str);
        }
        return jSONObject;
    }

    private ARMakeupNativeView getARMakeupNativeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ARMakeupNativeView) ipChange.ipc$dispatch("d2f0aaf2", new Object[]{this});
        }
        View view = (View) getMUSInstance().getRenderRoot().getParent();
        if (view == null) {
            return null;
        }
        View findViewById = view.findViewById(R.id.industry_ar_weex2_tt_detail_native_make_up_view);
        if (findViewById instanceof ARMakeupNativeView) {
            return (ARMakeupNativeView) findViewById;
        }
        return null;
    }

    private ARTryViewContainer getArTryContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ARTryViewContainer) ipChange.ipc$dispatch("9d838ea7", new Object[]{this});
        }
        new StringBuilder("getArTryContainer: getAuraWeexInstance()=").append(getAuraWeexInstance());
        if (this.nativeView == null && getAuraWeexInstance() != null && (getAuraWeexInstance().f() instanceof ARMakeupNativeView)) {
            this.nativeView = (ARMakeupNativeView) getAuraWeexInstance().f();
        }
        if (this.nativeView == null) {
            this.nativeView = getARMakeupNativeView();
        }
        ARMakeupNativeView aRMakeupNativeView = this.nativeView;
        if (aRMakeupNativeView == null) {
            return null;
        }
        return aRMakeupNativeView.getArTryViewContainer();
    }

    private d3x getAuraWeexInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d3x) ipChange.ipc$dispatch("10efb53e", new Object[]{this});
        }
        View view = (View) getMUSInstance().getRenderRoot().getParent();
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(R.id.aura_render_component_weex2_instance);
        if (tag instanceof d3x) {
            return (d3x) tag;
        }
        return null;
    }

    private ARMakeupNativeView getNativeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ARMakeupNativeView) ipChange.ipc$dispatch("64bf8bcc", new Object[]{this});
        }
        if (this.nativeView == null && getAuraWeexInstance() != null && (getAuraWeexInstance().f() instanceof ARMakeupNativeView)) {
            this.nativeView = (ARMakeupNativeView) getAuraWeexInstance().f();
        }
        if (this.nativeView == null) {
            this.nativeView = getARMakeupNativeView();
        }
        ARMakeupNativeView aRMakeupNativeView = this.nativeView;
        if (aRMakeupNativeView == null) {
            return null;
        }
        return aRMakeupNativeView;
    }

    public static /* synthetic */ Object ipc$super(ARMakeupWeexView aRMakeupWeexView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/scene/weex2/ar/ARMakeupWeexView");
    }

    private void realOpenCamera(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396151d3", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        Objects.toString(jSONObject);
        if (jSONObject != null && getNativeView() != null) {
            this.nativeView.init(getContext());
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(jSONObject.toString());
            if (!(!i55.h() || parseObject.getJSONObject("sourceParam") == null || parseObject.getJSONObject("sourceParam").getJSONObject("camera") == null)) {
                com.alibaba.fastjson.JSONObject jSONObject2 = parseObject.getJSONObject("sourceParam").getJSONObject("camera");
                jSONObject2.put("availablePreviewRatio", (Object) Double.valueOf(0.75d));
                jSONObject2.put("previewWidth", (Object) Integer.valueOf(this.nativeView.getHeight()));
                jSONObject2.put("previewHeight", (Object) Integer.valueOf(this.nativeView.getWidth()));
            }
            ARTryViewContainer arTryContainer = getArTryContainer();
            arTryContainer.setupAREngine(parseObject, new c(arTryContainer, pvhVar));
        }
    }

    private void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        try {
            ARMakeupNativeView aRMakeupNativeView = this.nativeView;
            if (aRMakeupNativeView != null) {
                aRMakeupNativeView.destroy();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("onActivityDestroy", "ARMakeupView#InternalError");
        }
    }

    private void reportError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fdab4f", new Object[]{this, str, str2});
            return;
        }
        d3x auraWeexInstance = getAuraWeexInstance();
        if (auraWeexInstance != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", str2);
            auraWeexInstance.q(str, hashMap);
        }
    }

    @JSMethod
    public void applyEffect(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6b5341", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        try {
            Objects.toString(jSONObject);
            if (jSONObject != null && getArTryContainer() != null) {
                getArTryContainer().applyAREffect(JSON.parseObject(jSONObject.toString()), new d(pvhVar));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("applyEffect", "ARMakeupView#InternalError");
        }
    }

    @JSMethod
    public void clearEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3848e3c5", new Object[]{this});
            return;
        }
        try {
            if (getArTryContainer() != null) {
                getArTryContainer().clearAllEffect();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("clearEffect", "ARMakeupView#InternalError");
        }
    }

    @JSMethod
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            release();
        }
    }

    @JSMethod
    public void getScreenshotUrl(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9feced", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        try {
            this.uploadService.b(getArTryContainer());
            this.uploadService.c(new e(pvhVar));
            this.uploadService.d(jSONObject.getString("bizCode"));
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("getScreenshotUrl", "ARMakeupView#InternalError");
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.rootView;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
        } else {
            release();
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        try {
            if (getArTryContainer() != null) {
                getArTryContainer().pause();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("onActivityPause", "ARMakeupView#InternalError");
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        try {
            if (getArTryContainer() != null) {
                getArTryContainer().resume();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("onActivityResume", "ARMakeupView#InternalError");
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff48d810", new Object[]{this});
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onDispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efb0bc7", new Object[]{this});
        } else {
            release();
        }
    }

    @JSMethod
    public void openCamera(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba19edd1", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        try {
            this.openCameraTimeStamp = System.currentTimeMillis();
            j55.a(getContext(), new a(jSONObject, pvhVar), new b(pvhVar));
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("openCamera", "ARMakeupView#InternalError");
        }
    }

    @JSMethod
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        try {
            if (getArTryContainer() != null) {
                getArTryContainer().pause();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("pause", "ARMakeupView#InternalError");
        }
    }

    @JSMethod
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        try {
            if (getArTryContainer() != null) {
                getArTryContainer().resume();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("resume", "ARMakeupView#InternalError");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f6605a;

        public b(pvh pvhVar) {
            this.f6605a = pvhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f6605a.b(ARMakeupWeexView.access$100(ARMakeupWeexView.this, false, "permissionDenied"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements pkd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ARTryViewContainer f6606a;
        public final /* synthetic */ pvh b;

        public c(ARTryViewContainer aRTryViewContainer, pvh pvhVar) {
            this.f6606a = aRTryViewContainer;
            this.b = pvhVar;
        }

        @Override // tb.pkd
        public void sendResult(boolean z, com.alibaba.fastjson.JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94051768", new Object[]{this, new Boolean(z), jSONObject});
                return;
            }
            DIMonitorUtil.a(i55.c(), "ar_mainPic4ARTrial", DIMonitorUtil.StageType.STAGE_OPEN_CAMERA.getValue(), System.currentTimeMillis() - ARMakeupWeexView.access$200(ARMakeupWeexView.this));
            Objects.toString(jSONObject);
            String string = jSONObject.getString("resultCode");
            com.alibaba.fastjson.JSONObject access$100 = ARMakeupWeexView.access$100(ARMakeupWeexView.this, z, string);
            if (!z) {
                ARMakeupWeexView.access$300(ARMakeupWeexView.this, "ARMakeupView#openCamera", string);
            } else {
                access$100.put("forceEnterAR", (Object) Boolean.TRUE);
                this.f6606a.resume();
            }
            this.b.b(access$100);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements pkd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f6607a;

        public d(pvh pvhVar) {
            this.f6607a = pvhVar;
        }

        @Override // tb.pkd
        public void sendResult(boolean z, com.alibaba.fastjson.JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94051768", new Object[]{this, new Boolean(z), jSONObject});
                return;
            }
            StringBuilder sb = new StringBuilder("applyEffect: ret=");
            sb.append(z);
            sb.append(", data=");
            sb.append(jSONObject);
            String string = jSONObject.getString("resultCode");
            if (!z) {
                ARMakeupWeexView.access$300(ARMakeupWeexView.this, "ARMakeupView#applyEffect", string);
            }
            this.f6607a.b(ARMakeupWeexView.access$100(ARMakeupWeexView.this, z, string));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements hd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f6608a;

        public e(pvh pvhVar) {
            this.f6608a = pvhVar;
        }

        @Override // tb.hd.b
        public void a(boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("198c6a65", new Object[]{this, new Boolean(z), str, str2});
                return;
            }
            StringBuilder sb = new StringBuilder("getScreenshotUrl: ret=");
            sb.append(z);
            sb.append(", code=");
            sb.append(str);
            sb.append(", url=");
            sb.append(str2);
            com.alibaba.fastjson.JSONObject access$100 = ARMakeupWeexView.access$100(ARMakeupWeexView.this, z, str);
            if (!z) {
                ARMakeupWeexView.access$300(ARMakeupWeexView.this, "ARMakeupView#getScreenshotUrl", str);
            } else {
                access$100.put("url", (Object) str2);
            }
            this.f6608a.b(access$100);
        }
    }
}
