package com.taobao.android.detail.industry.scene.weex2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.arflow.ARTryViewContainer;
import com.taobao.android.detail.industry.ablility.views.ARMakeupNativeView;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.d3x;
import tb.h55;
import tb.i55;
import tb.j55;
import tb.lo;
import tb.pkd;
import tb.pvh;
import tb.q2q;
import tb.rb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DIWeex2Module extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f6600a;

        public a(pvh pvhVar) {
            this.f6600a = pvhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DIWeex2Module.access$000(DIWeex2Module.this, this.f6600a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements pkd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f6602a;

        public c(pvh pvhVar) {
            this.f6602a = pvhVar;
        }

        @Override // tb.pkd
        public void sendResult(boolean z, JSONObject jSONObject) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94051768", new Object[]{this, new Boolean(z), jSONObject});
                return;
            }
            if (jSONObject != null) {
                str = jSONObject.getString("code");
            } else {
                str = "";
            }
            this.f6602a.b(DIWeex2Module.access$100(DIWeex2Module.this, z, str));
        }
    }

    static {
        t2o.a(440401993);
    }

    public DIWeex2Module(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ void access$000(DIWeex2Module dIWeex2Module, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51daa87e", new Object[]{dIWeex2Module, pvhVar});
        } else {
            dIWeex2Module.callSuccess(pvhVar);
        }
    }

    public static /* synthetic */ JSONObject access$100(DIWeex2Module dIWeex2Module, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("926ee0a8", new Object[]{dIWeex2Module, new Boolean(z), str});
        }
        return dIWeex2Module.assembleResult(z, str);
    }

    private JSONObject assembleResult(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5f36568", new Object[]{this, new Boolean(z), str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.valueOf(z));
        if (!z) {
            jSONObject.put("code", (Object) str);
        }
        return jSONObject;
    }

    private d3x getAuraWeexInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d3x) ipChange.ipc$dispatch("10efb53e", new Object[]{this});
        }
        View view = (View) getInstance().getRenderRoot().getParent();
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(R.id.aura_render_component_weex2_instance);
        if (tag instanceof d3x) {
            return (d3x) tag;
        }
        return null;
    }

    private TTDetailARWeex2Component getDetail3NewHeaderARComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailARWeex2Component) ipChange.ipc$dispatch("7b1c1e6e", new Object[]{this});
        }
        View view = (View) getInstance().getRenderRoot().getParent();
        if (view == null) {
            return null;
        }
        View findViewById = view.findViewById(R.id.industry_ar_weex2_tt_detail_native_make_up_view);
        if (findViewById instanceof ARMakeupNativeView) {
            Object tag = ((ARMakeupNativeView) findViewById).getTag();
            if (tag instanceof TTDetailARWeex2Component) {
                return (TTDetailARWeex2Component) tag;
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(DIWeex2Module dIWeex2Module, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/scene/weex2/DIWeex2Module");
    }

    @MUSMethod
    public void exitExpendPicGallery(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7414051e", new Object[]{this, str, pvhVar});
            return;
        }
        d3x auraWeexInstance = getAuraWeexInstance();
        try {
            if (auraWeexInstance != null) {
                if (auraWeexInstance.e().c() == null) {
                    h55.b("DIWeex2Module", "exitExpendPicGallery auraInstance null");
                } else {
                    h55.b("DIWeex2Module", "exitExpendPicGallery send auraEvent");
                }
                callSuccess(pvhVar);
                return;
            }
            TTDetailARWeex2Component detail3NewHeaderARComponent = getDetail3NewHeaderARComponent();
            if (detail3NewHeaderARComponent != null) {
                callSuccess(pvhVar);
                detail3NewHeaderARComponent.shrinkComponent();
            }
        } catch (Exception e) {
            callError(pvhVar, e.getMessage());
            if (auraWeexInstance != null) {
                auraWeexInstance.q("exitExpendPicGallery|" + e.getMessage(), null);
            }
        }
    }

    @MUSMethod
    public void expendPicGallery(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d48e0e0", new Object[]{this, str, pvhVar});
            return;
        }
        d3x auraWeexInstance = getAuraWeexInstance();
        try {
            if (auraWeexInstance != null) {
                if (auraWeexInstance.e().c() == null) {
                    h55.b("DIWeex2Module", "expendPicGallery auraInstance null");
                } else {
                    h55.b("DIWeex2Module", "expendPicGallery send auraEvent");
                }
                callSuccess(pvhVar);
                return;
            }
            TTDetailARWeex2Component detail3NewHeaderARComponent = getDetail3NewHeaderARComponent();
            if (detail3NewHeaderARComponent != null) {
                callSuccess(pvhVar);
                detail3NewHeaderARComponent.expandComponent();
            }
        } catch (Exception e) {
            callError(pvhVar, e.getMessage());
            if (auraWeexInstance != null) {
                auraWeexInstance.q("expendPicGallery|" + e.getMessage(), null);
            }
        }
    }

    public void goIntentSetting(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53cc8495", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
    }

    @MUSMethod
    public void isSupport(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b049eeff", new Object[]{this, str, pvhVar});
        } else if (str.equals("expendPicGallery") && i55.g()) {
            callSuccess(pvhVar);
        } else if (str.equals("requestARTryPermission")) {
            callSuccess(pvhVar);
        } else {
            callError(pvhVar, "");
        }
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @MUSMethod(uiThread = true)
    public void openCameraSetting(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da68f411", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        d3x auraWeexInstance = getAuraWeexInstance();
        try {
            h55.b("DIWeex2Module", "openCameraSetting:" + jSONObject.toJSONString());
            goIntentSetting(getInstance().getUIContext());
            callSuccess(pvhVar);
        } catch (Exception e) {
            callError(pvhVar, e.getMessage());
            if (auraWeexInstance != null) {
                auraWeexInstance.q("selectSKU|" + jSONObject.toJSONString() + "|" + e.getMessage(), null);
            }
        }
    }

    @MUSMethod
    public void prefetchMakeupModel(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5ee3", new Object[]{this, str, pvhVar});
        } else if (str != null) {
            try {
                ARTryViewContainer.downloadResources(getInstance().getContext().a(), JSON.parseObject(str), new c(pvhVar));
            } catch (Exception e) {
                callError(pvhVar, e.getMessage());
                d3x auraWeexInstance = getAuraWeexInstance();
                if (auraWeexInstance != null) {
                    auraWeexInstance.q("prefetchMakeupModel|" + e.getMessage(), null);
                }
            }
        }
    }

    @MUSMethod
    public void requestARTryPermission(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a19304", new Object[]{this, str, pvhVar});
            return;
        }
        try {
            j55.a(getInstance().getUIContext(), new a(pvhVar), new b(pvhVar));
        } catch (Throwable th) {
            th.printStackTrace();
            callError(pvhVar, "" + th.getMessage());
        }
    }

    @MUSMethod(uiThread = true)
    public void selectSKU(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c087683b", new Object[]{this, str, pvhVar});
            return;
        }
        d3x auraWeexInstance = getAuraWeexInstance();
        try {
            h55.b("DIWeex2Module", "selectSKU:" + str);
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null) {
                callError(pvhVar, "no params");
                return;
            }
            String str2 = (String) parseObject.get(q2q.KEY_SKU_ID);
            String str3 = (String) parseObject.get("pvPath");
            if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str2)) {
                callError(pvhVar, "skuId invalid and pvPath invalid");
            } else if (auraWeexInstance != null) {
                lo e = auraWeexInstance.e();
                if (!(e == null || e.f() == null)) {
                    callSuccess(pvhVar);
                    return;
                }
                callError(pvhVar, "cannot get context");
            } else if (getDetail3NewHeaderARComponent() != null) {
                callSuccess(pvhVar);
            } else {
                callError(pvhVar, "get instance fail");
            }
        } catch (Exception e2) {
            callError(pvhVar, e2.getMessage());
            if (auraWeexInstance != null) {
                auraWeexInstance.q(str + "|" + e2.getMessage(), null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f6601a;

        public b(pvh pvhVar) {
            this.f6601a = pvhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f6601a.b(DIWeex2Module.access$100(DIWeex2Module.this, false, "permissionDenied"));
            }
        }
    }

    private void callError(pvh pvhVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8825c4", new Object[]{this, pvhVar, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(rb.RESULT_KEY, (Object) "fail");
        jSONObject.put("errorMsg", (Object) str);
        pvhVar.b(jSONObject);
    }

    private void callSuccess(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b86c35", new Object[]{this, pvhVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(rb.RESULT_KEY, (Object) "success");
        pvhVar.b(jSONObject);
    }

    @MUSMethod(uiThread = true)
    public void onError(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3aa9923", new Object[]{this, str, pvhVar});
            return;
        }
        d3x auraWeexInstance = getAuraWeexInstance();
        try {
            h55.b("DIWeex2Module", "onError:" + str);
            if (!TextUtils.isEmpty(str)) {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject == null) {
                    pvhVar.b("no params");
                } else if (auraWeexInstance != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.putAll(parseObject);
                    auraWeexInstance.q("onJsError", hashMap);
                    callSuccess(pvhVar);
                } else if (getDetail3NewHeaderARComponent() != null) {
                    callSuccess(pvhVar);
                } else {
                    callError(pvhVar, "report failed");
                }
            }
        } catch (Exception e) {
            callError(pvhVar, e.getMessage());
            if (auraWeexInstance != null) {
                auraWeexInstance.q(str + "|" + e.getMessage(), null);
            }
        }
    }
}
