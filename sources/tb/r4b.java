package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.core.utils.transition.TransitionRunningFrameBinder;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.tao.util.ImageStrategyDecider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r4b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXTRA_FRAME_ANIM_HIT_FIXED = "extraFrameAnimHitFixed";
    public static final String KEY_EXTRA_FRAME_ANIM_REASON = "extraFrameAnimReason";
    public static final String KEY_EXTRA_FRAME_ANIM_TYPE = "extraFrameAnimType";

    static {
        t2o.a(486539758);
    }

    public static boolean A(Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e2c428e", new Object[]{pair})).booleanValue();
        }
        return f(pair, "f_home_tran_no_data");
    }

    public static boolean B(Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ca7514b", new Object[]{pair})).booleanValue();
        }
        return f(pair, "f_home_tran_check_data");
    }

    public static boolean C(Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d703a204", new Object[]{pair})).booleanValue();
        }
        return f(pair, "f_home_tran_all_device");
    }

    public static boolean D(Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b86e385d", new Object[]{pair})).booleanValue();
        }
        return f(pair, "f_home_tran_frame_anim");
    }

    public static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc7e6905", new Object[]{str, str2, str3})).booleanValue();
        }
        if (str != null && str3 != null && str.contains(str3)) {
            return true;
        }
        if (str2 == null || str3 == null || !str2.contains(str3)) {
            return false;
        }
        return true;
    }

    public static boolean f(Pair<String, String> pair, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a64597e7", new Object[]{pair, str})).booleanValue();
        }
        if (pair == null || !a((String) pair.first, (String) pair.second, str)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public static void g(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55f3db", new Object[]{bundle});
        } else if (bundle != null) {
            bundle.remove("extraEnableTransition");
        }
    }

    public static Pair<String, String> h() {
        String str;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("be64abed", new Object[0]);
        }
        try {
            str = whs.a();
        } catch (Throwable th) {
            fve.c("HomeTransitionForNewAnim", "TPPUtils.getNdAnimFeatureList 出错。", th);
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            fve.e("HomeTransitionForNewAnim", "homeTransitionTppAnimSwitchListStr:" + str);
        }
        try {
            str2 = (String) mza.d().c("ndAnimOptimizationFirst", String.class);
        } catch (Throwable th2) {
            fve.c("HomeTransitionForNewAnim", "调用HomeClientABTestTool.getAbTestValue 出错。", th2);
        }
        if (!TextUtils.isEmpty(str2)) {
            fve.e("HomeTransitionForNewAnim", "homeNavSjsAnimSwitchListStr:" + str2);
        }
        return new Pair<>(str, str2);
    }

    public static boolean i(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6933bca5", new Object[]{jSONObject, str})).booleanValue();
        }
        return j(jSONObject, str, false);
    }

    public static boolean j(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd448a57", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue();
        }
        return (jSONObject == null || str == null || !jSONObject.containsKey(str)) ? z : "true".equals(jSONObject.getString(str));
    }

    public static Activity k(View view, cfc cfcVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("9b9eef21", new Object[]{view, cfcVar});
        }
        Context context = view.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof bew) {
            Context b = ((bew) context).b();
            if (b instanceof Activity) {
                return (Activity) b;
            }
        }
        try {
            Context a2 = o3b.a(cfcVar);
            if (a2 instanceof Activity) {
                fve.e("HomeTransitionForNewAnim", "无极缩放的上下文通过 HomeRealContextUtil.getActivityContext 获取成功。");
                return (Activity) a2;
            }
            StringBuilder sb = new StringBuilder("无极缩放的上下文通过 HomeRealContextUtil.getActivityContext 获取失败。homeRealContext:");
            if (a2 == null) {
                str = "null";
            } else {
                str = a2.getClass().getCanonicalName();
            }
            sb.append(str);
            fve.e("HomeTransitionForNewAnim", sb.toString());
            return null;
        } catch (Exception unused) {
            fve.e("HomeTransitionForNewAnim", "异常:跨模块获取上下文失败，无法判断无极缩放是否执行。");
            return null;
        }
    }

    public static JSONObject l(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ad2de136", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || str == null || !jSONObject.containsKey(str)) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    public static String m(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b40fbc34", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || str == null || !jSONObject.containsKey(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[0])).booleanValue();
        }
        return "l".equals(sue.a());
    }

    public static peu q(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (peu) ipChange.ipc$dispatch("f976be6d", new Object[]{jSONObject, str, new Boolean(z)});
        }
        if (mve.a("forceCloseTransitionAnimParamsControl", false)) {
            return null;
        }
        l(jSONObject, "content");
        if (e(jSONObject, "enableLivePageTransition") != -1) {
            peu peuVar = new peu();
            peuVar.i = 3001;
            return peuVar;
        } else if (!z) {
            return null;
        } else {
            peu peuVar2 = new peu();
            peuVar2.i = 5001;
            return peuVar2;
        }
    }

    public static void r(cfc cfcVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae87da64", new Object[]{cfcVar, view});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            Activity k = k(view, cfcVar);
            Intent intent = k == null ? null : k.getIntent();
            if (intent != null) {
                intent.putExtra("dispatch_invisible_event_type", f.DXERROR_ENGINE_CREATE_VIEW_IN_GLOBAL_CENTER_MAP);
            }
            iMainFeedsViewService.dispatchWindowVisibility(4);
            if (intent != null) {
                intent.putExtra("dispatch_invisible_event_type", -30010);
            }
            fve.e("HomeTransitionForNewAnim", "播放暂停逻辑处理完成。");
        }
    }

    public static boolean s(peu peuVar, View view, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b3c61ae", new Object[]{peuVar, view, bundle, new Boolean(z)})).booleanValue();
        }
        return t(peuVar, view, bundle, z, null);
    }

    public static void w(View view, cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dda79d7", new Object[]{view, cfcVar});
            return;
        }
        Activity k = k(view, cfcVar);
        Intent intent = k == null ? null : k.getIntent();
        if (intent != null) {
            intent.putExtra("transition_jump_start_time", System.currentTimeMillis());
        }
        fve.e("HomeTransitionForNewAnim", "直播暂停逻辑延时处理。");
    }

    public static boolean b(View view, String str, Bundle bundle, peu peuVar) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e39af5bc", new Object[]{view, str, bundle, peuVar})).booleanValue();
        }
        if (str == null) {
            fve.e("HomeTransitionForNewAnim", "Error:targetUrl 为 null，不执行无极缩放开关固化。");
            if (bundle != null) {
                bundle.putString("extraFrameAnimReason", "targetUrlIsNull");
            }
            return false;
        }
        Context context = view.getContext();
        if (context == null) {
            fve.e("HomeTransitionForNewAnim", "Error:context 为 null，不执行无极缩放开关固化。");
            return false;
        } else if (d(str, bundle, context, peuVar)) {
            return true;
        } else {
            String d = mve.d("orange_key_anim_switch_fixed_url_list", "//newdetail.taobao.com,//litedetail.taobao.com,http://newdetail.taobao.com,https://newdetail.taobao.com,http://litedetail.taobao.com,https://litedetail.taobao.com");
            if (TextUtils.isEmpty(d)) {
                fve.e("HomeTransitionForNewAnim", "Error:拉取到的 Orange url 列表为空 ，不执行无极缩放开关固化。");
                if (bundle != null) {
                    bundle.putString("extraFrameAnimReason", "orangeIsNull");
                }
                return false;
            } else if (TBDeviceUtils.P(context)) {
                fve.e("HomeTransitionForNewAnim", "Abort:当前为 Pad ，不执行无极缩放开关固化。");
                if (bundle != null) {
                    bundle.putString("extraFrameAnimReason", "isTablet");
                }
                return false;
            } else if (TBDeviceUtils.p(context)) {
                fve.e("HomeTransitionForNewAnim", "Abort:当前为 折叠屏 ，并且命中无极缩放降级开关，不执行无极缩放开关固化。");
                if (bundle != null) {
                    bundle.putString("extraFrameAnimReason", "isFoldDevice");
                }
                return false;
            } else {
                for (String str2 : d.split(",")) {
                    if (str.startsWith(str2)) {
                        fve.e("HomeTransitionForNewAnim", "Success:无极缩放开关固化成功。fixedUrl:" + str2);
                        return true;
                    }
                }
                if (bundle != null) {
                    bundle.putString("extraFrameAnimReason", "noAnyUrlHit");
                }
                return false;
            }
        }
    }

    public static boolean c(Context context, JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edd8a41", new Object[]{context, jSONObject, jSONArray, jSONArray2, jSONArray3})).booleanValue();
        }
        if (TBDeviceUtils.P(context)) {
            if ("true".equals(jSONObject.getString("supportTablet"))) {
                fve.e("HomeTransitionForNewAnim", "Success:Pad:无极缩放开关固化成功。fixedConfigInfo 检测，比如穿搭星球之类。orStarts:" + jSONArray + " andContains:" + jSONArray2 + " notContains:" + jSONArray3);
                return true;
            }
            fve.e("HomeTransitionForNewAnim", "Abort:当前为 Pad ，不执行无极缩放开关固化。:fixedConfigInfo 检测:orStarts:" + jSONArray + " andContains:" + jSONArray2 + " notContains:" + jSONArray3);
            return false;
        } else if (!TBDeviceUtils.p(context)) {
            fve.e("HomeTransitionForNewAnim", "Success:Phone:无极缩放开关固化成功。fixedConfigInfo 检测:比如穿搭星球之类。orStarts:" + jSONArray + " andContains:" + jSONArray2 + " notContains:" + jSONArray3);
            return true;
        } else if ("true".equals(jSONObject.getString("supportFoldDevice"))) {
            fve.e("HomeTransitionForNewAnim", "Success:折叠屏:无极缩放开关固化成功。fixedConfigInfo 检测，比如穿搭星球之类。orStarts:" + jSONArray + " andContains:" + jSONArray2 + " notContains:" + jSONArray3);
            return true;
        } else {
            fve.e("HomeTransitionForNewAnim", "Abort:当前为 折叠屏 ，不执行无极缩放开关固化。:fixedConfigInfo 检测:orStarts" + jSONArray + " andContains:" + jSONArray2 + " notContains:" + jSONArray3);
            return false;
        }
    }

    public static int e(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4a1483d", new Object[]{jSONObject, str})).intValue();
        }
        String m = m(l(jSONObject, "content"), str);
        if (m != null && !m.isEmpty()) {
            if (m.startsWith("true")) {
                return 1;
            }
            if (m.startsWith("false|force")) {
                return 0;
            }
        }
        return -1;
    }

    public static void o(peu peuVar, View view, Bundle bundle, s2e s2eVar, cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f89874", new Object[]{peuVar, view, bundle, s2eVar, cfcVar});
        } else if (s2eVar.r()) {
            bundle.putBoolean("anim_item_support_full_alpha", true);
            peuVar.f = true;
            s2eVar.p(true);
            if (mve.a("orange_key_enable_auto_keep_delay_stop", false)) {
                w(view, cfcVar);
            }
            fve.e("HomeTransitionForNewAnim", "processDxRootViewReuse Hit keepLastLiveFrameForAutoKeep , Success . animItemIsRunning.  23:43 .");
        } else {
            s2eVar.p(false);
            fve.e("HomeTransitionForNewAnim", "processDxRootViewReuse Hit liveView Reuse , Success . pause .  21:40 .");
        }
    }

    public static void p(peu peuVar, View view, Bundle bundle, s2e s2eVar, Drawable drawable, cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee827a5", new Object[]{peuVar, view, bundle, s2eVar, drawable, cfcVar});
        } else if (s2eVar.r()) {
            bundle.putBoolean("anim_item_support_full_alpha", true);
            peuVar.f = true;
            if (mve.a("orange_key_enable_get_current_live_frame", false)) {
                TransitionRunningFrameBinder transitionRunningFrameBinder = new TransitionRunningFrameBinder(drawable);
                transitionRunningFrameBinder.setReuseSupport(s2eVar);
                bundle.putBinder("anim_item_running_frame", transitionRunningFrameBinder);
            }
            if (mve.a("orange_key_enable_delay_live_player_stop", true)) {
                w(view, cfcVar);
            }
            fve.e("HomeTransitionForNewAnim", "processDxRootViewReuse Hit liveView Reuse , Success . animItemIsRunning .  21:40 .");
        } else {
            fve.e("HomeTransitionForNewAnim", "processDxRootViewReuse Hit liveView Reuse , Success . pause .  21:40 .");
        }
    }

    public static boolean t(peu peuVar, View view, Bundle bundle, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("693034f8", new Object[]{peuVar, view, bundle, new Boolean(z), str})).booleanValue();
        }
        if (!(view instanceof DXRootView)) {
            fve.e("HomeTransitionForNewAnim", "processDxRootViewReuse , no dxRootView.");
            return false;
        }
        DXWidgetNode flattenWidgetNode = ((DXRootView) view).getFlattenWidgetNode();
        if (flattenWidgetNode == null) {
            fve.e("HomeTransitionForNewAnim", "processDxRootViewReuse , no dxFlattenWidgetNode.");
            return false;
        }
        if (str == null) {
            str = "imageTransfer";
        }
        DXWidgetNode queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId(str);
        if (!(queryWidgetNodeByUserId instanceof DXImageWidgetNode)) {
            fve.e("HomeTransitionForNewAnim", "processDxRootViewReuse , no imageNode.");
            return false;
        }
        DXRuntimeContext dXRuntimeContext = ((DXImageWidgetNode) queryWidgetNodeByUserId).getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            fve.e("HomeTransitionForNewAnim", "processDxRootViewReuse , no dxImageRuntimeContext.");
            return false;
        }
        View D = dXRuntimeContext.D();
        if (!(D instanceof ImageView)) {
            fve.e("HomeTransitionForNewAnim", "processDxRootViewReuse , no imageNativeView.");
            return false;
        }
        ImageView imageView = (ImageView) D;
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            fve.e("HomeTransitionForNewAnim", "processDxRootViewReuse , no imageViewDrawable.");
            return false;
        }
        if (z) {
            peuVar.e = imageView.getMeasuredHeight();
        }
        peuVar.c = drawable;
        fve.e("HomeTransitionForNewAnim", "processDxRootViewReuse Hit imageViewDrawable , Success . 20:48 .");
        return true;
    }

    public static boolean u(peu peuVar, View view, Bundle bundle, boolean z, cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f07ff3b", new Object[]{peuVar, view, bundle, new Boolean(z), cfcVar})).booleanValue();
        }
        if (!(view instanceof DXRootView)) {
            fve.e("HomeTransitionForNewAnim", "processDxRootViewReuse , no dxRootView.");
            return false;
        }
        DXWidgetNode flattenWidgetNode = ((DXRootView) view).getFlattenWidgetNode();
        if (flattenWidgetNode == null) {
            fve.e("HomeTransitionForNewAnim", "processDxRootViewReuse , no dxFlattenWidgetNode.");
            return false;
        }
        DXWidgetNode queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId("liveItemOnlinePlay");
        if (!(queryWidgetNodeByUserId instanceof s2e)) {
            fve.e("HomeTransitionForNewAnim", "processDxRootViewReuse , no liveDXNode.");
            return false;
        }
        s2e s2eVar = (s2e) queryWidgetNodeByUserId;
        Drawable j = s2eVar.j();
        if (j == null) {
            fve.e("HomeTransitionForNewAnim", "processDxRootViewReuse , no imageViewDrawable.");
            return false;
        }
        peuVar.c = j;
        View n = s2eVar.n();
        if (z && n != null) {
            peuVar.e = n.getMeasuredHeight();
        }
        if (mve.a("orange_key_enable_auto_keep_live_frame", true)) {
            o(peuVar, view, bundle, s2eVar, cfcVar);
        } else {
            p(peuVar, view, bundle, s2eVar, j, cfcVar);
        }
        return true;
    }

    public static void x(peu peuVar, View view, Bundle bundle, boolean z, JSONObject jSONObject, cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea504f4", new Object[]{peuVar, view, bundle, new Boolean(z), jSONObject, cfcVar});
            return;
        }
        boolean u = u(peuVar, view, bundle, z, cfcVar);
        boolean t = !u ? t(peuVar, view, bundle, z, "liveItemImageView") : false;
        boolean z2 = !peuVar.c("liveForceCloseBlurFeature") && !peuVar.f;
        if (!u && !t) {
            fve.e("HomeTransitionForNewAnim", "直播数据未命中。 hasFindLiveRenderView false , hasFindLiveImageView false.");
        }
        v(peuVar, view, jSONObject, bundle, z2, !peuVar.c("liveForceClosePreFetchFeature") && !peuVar.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean y(tb.cfc r9, com.alibaba.fastjson.JSONObject r10, android.os.Bundle r11, android.view.View r12, android.util.Pair<java.lang.String, java.lang.String> r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.r4b.y(tb.cfc, com.alibaba.fastjson.JSONObject, android.os.Bundle, android.view.View, android.util.Pair, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void z(tb.cfc r8, com.alibaba.fastjson.JSONObject r9, android.os.Bundle r10, android.view.View r11, tb.peu r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.r4b.z(tb.cfc, com.alibaba.fastjson.JSONObject, android.os.Bundle, android.view.View, tb.peu, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (r7.equals("RGB_565") == false) goto L_0x0088;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void E(tb.peu r6, com.alibaba.fastjson.JSONObject r7, java.lang.String r8, android.os.Bundle r9) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.r4b.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "d71bf3f3"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r6 = 3
            r5[r6] = r9
            r3.ipc$dispatch(r4, r5)
            return
        L_0x001b:
            if (r6 == 0) goto L_0x00bb
            if (r7 == 0) goto L_0x00bb
            if (r8 == 0) goto L_0x00bb
            if (r9 != 0) goto L_0x0025
            goto L_0x00bb
        L_0x0025:
            java.lang.String r8 = "dragBackAnim"
            boolean r9 = r7.containsKey(r8)
            if (r9 == 0) goto L_0x0037
            java.lang.Boolean r8 = r7.getBoolean(r8)
            boolean r8 = r8.booleanValue()
            r6.k = r8
        L_0x0037:
            java.lang.String r8 = "pageSnapshot"
            boolean r9 = r7.containsKey(r8)
            if (r9 == 0) goto L_0x004a
            java.lang.Boolean r8 = r7.getBoolean(r8)
            boolean r8 = r8.booleanValue()
            r6.l = r8
        L_0x004a:
            java.lang.String r8 = "pageWithPixelCopy"
            boolean r9 = r7.containsKey(r8)
            if (r9 == 0) goto L_0x005d
            java.lang.Boolean r8 = r7.getBoolean(r8)
            boolean r8 = r8.booleanValue()
            r6.m = r8
        L_0x005d:
            java.lang.String r8 = "pageForDecorView"
            boolean r9 = r7.containsKey(r8)
            if (r9 == 0) goto L_0x0070
            java.lang.Boolean r8 = r7.getBoolean(r8)
            boolean r8 = r8.booleanValue()
            r6.n = r8
        L_0x0070:
            java.lang.String r8 = "pageBitmapConfig"
            boolean r9 = r7.containsKey(r8)
            if (r9 == 0) goto L_0x00ba
            java.lang.String r7 = r7.getString(r8)
            r7.hashCode()
            r8 = -1
            int r9 = r7.hashCode()
            switch(r9) {
                case 223214739: goto L_0x009e;
                case 223337875: goto L_0x0093;
                case 1857362722: goto L_0x008a;
                default: goto L_0x0088;
            }
        L_0x0088:
            r0 = -1
            goto L_0x00a8
        L_0x008a:
            java.lang.String r9 = "RGB_565"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x00a8
            goto L_0x0088
        L_0x0093:
            java.lang.String r9 = "ARGB_8888"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x009c
            goto L_0x0088
        L_0x009c:
            r0 = 1
            goto L_0x00a8
        L_0x009e:
            java.lang.String r9 = "ARGB_4444"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x00a7
            goto L_0x0088
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            switch(r0) {
                case 0: goto L_0x00b6;
                case 1: goto L_0x00b1;
                case 2: goto L_0x00ac;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            goto L_0x00ba
        L_0x00ac:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565
            r6.p = r7
            goto L_0x00ba
        L_0x00b1:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            r6.p = r7
            goto L_0x00ba
        L_0x00b6:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_4444
            r6.p = r7
        L_0x00ba:
            return
        L_0x00bb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error:无极缩放参数检查失败。tranParam:"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " itemObj:"
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = " targetUrl:"
            r0.append(r6)
            r0.append(r8)
            java.lang.String r6 = " extras:"
            r0.append(r6)
            r0.append(r9)
            java.lang.String r6 = r0.toString()
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.String r7 = "HomeTransitionForNewAnim"
            tb.fve.e(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.r4b.E(tb.peu, com.alibaba.fastjson.JSONObject, java.lang.String, android.os.Bundle):void");
    }

    public static void v(peu peuVar, View view, JSONObject jSONObject, Bundle bundle, boolean z, boolean z2) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f0b9e54", new Object[]{peuVar, view, jSONObject, bundle, new Boolean(z), new Boolean(z2)});
        } else if (peuVar.f26051a) {
            String m = m(l(jSONObject, "content"), "imageUrl");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (TextUtils.isEmpty(m)) {
                fve.e("HomeTransitionForNewAnim", "mainImageUrl is empty , processLiveExtrasParams abort.");
                return;
            }
            String decideUrl = (!z || layoutParams == null) ? m : ImageStrategyDecider.decideUrl(m, Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height), null);
            int i2 = z ? 60 : 0;
            if (!z) {
                i = 0;
            }
            bundle.putString("coverImage", m);
            bundle.putString(yj4.PARAM_COVER_GAUSS_RADIUS, String.valueOf(i2));
            bundle.putString(yj4.PARAM_COVER_GAUSS_SAMPLING, String.valueOf(i));
            if (z2) {
                PhenixCreator T = s0m.B().T(decideUrl);
                if (z) {
                    T = T.bitmapProcessors(new yf2(view.getContext(), i2, i));
                }
                T.fetch();
            }
        }
    }

    public static boolean d(String str, Bundle bundle, Context context, peu peuVar) {
        boolean z;
        boolean z2;
        boolean z3;
        JSONArray jSONArray;
        String str2 = "notContains";
        String str3 = "andContains";
        String str4 = "orStarts";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dfbb106", new Object[]{str, bundle, context, peuVar})).booleanValue();
        }
        String d = mve.d("orange_key_anim_switch_fixed_config_info", "[{\"orStarts\":[\"http://h5.m.taobao.com/tnode/index.htm?tnode=page_content\",\"https://h5.m.taobao.com/tnode/index.htm?tnode=page_content\"],\"andContains\":[\"landingType=\",\"renderType=native\"],\"dragBackAnim\":\"true\",\"pageSnapshot\":\"true\",\"pageWithPixelCopy\":\"true\",\"pageForDecorView\":\"true\"},{\"orStarts\":[\"http://h5.m.taobao.com/tnode/index.htm?tnode=page_content\",\"https://h5.m.taobao.com/tnode/index.htm?tnode=page_content\"],\"andContains\":[\"landingType=\"],\"notContains\":[\"renderType=native\"],\"forceCloseAnim\":\"true\"}]");
        if (TextUtils.isEmpty(d)) {
            fve.e("HomeTransitionForNewAnim", "Error:拉取到的 fixedConfigInfo 为空 ，不执行无极缩放开关固化。");
            return false;
        }
        try {
            JSONArray parseArray = JSON.parseArray(d);
            if (cw6.b() && eue.b() && bve.u()) {
                if (parseArray == null) {
                    parseArray = new JSONArray();
                }
                fve.e("HomeTransitionForNewAnim", "Debug:追加 NewDetailPage 无极缩放 跟手返回 开关。");
                parseArray.add(JSON.parseObject("{\"orStarts\":[\"//newdetail.taobao.com\",\"//litedetail.taobao.com\",\"http://newdetail.taobao.com\",\"https://newdetail.taobao.com\",\"http://litedetail.taobao.com\",\"https://litedetail.taobao.com\"],\"dragBackAnim\":\"true\",\"pageSnapshot\":\"true\",\"pageWithPixelCopy\":\"true\",\"pageForDecorView\":\"true\"}"));
            }
            if (parseArray == null || parseArray.isEmpty()) {
                fve.e("HomeTransitionForNewAnim", "Error:拉取到的 fixedConfigInfo 数组为空，不执行无极缩放开关固化。降级了?");
                return false;
            }
            try {
                int size = parseArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = parseArray.getJSONObject(i);
                    JSONArray jSONArray2 = null;
                    JSONArray jSONArray3 = jSONObject.containsKey(str4) ? jSONObject.getJSONArray(str4) : null;
                    JSONArray jSONArray4 = jSONObject.containsKey(str3) ? jSONObject.getJSONArray(str3) : null;
                    if (jSONObject.containsKey(str2)) {
                        jSONArray2 = jSONObject.getJSONArray(str2);
                    }
                    if (jSONArray3 == null || jSONArray3.isEmpty()) {
                        str2 = str2;
                    } else {
                        str2 = str2;
                        for (int i2 = 0; i2 < jSONArray3.size(); i2++) {
                            if (!str.startsWith(jSONArray3.getString(i2))) {
                            }
                        }
                        z = false;
                        if (z || jSONArray4 == null || jSONArray4.isEmpty()) {
                            str3 = str3;
                        } else {
                            str3 = str3;
                            for (int i3 = 0; i3 < jSONArray4.size(); i3++) {
                                if (!str.contains(jSONArray4.getString(i3))) {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                        z2 = true;
                        if (z || !z2) {
                            parseArray = parseArray;
                            jSONArray = jSONArray2;
                            str4 = str4;
                        } else {
                            jSONArray = jSONArray2;
                            if (jSONArray == null || jSONArray.isEmpty()) {
                                str4 = str4;
                                parseArray = parseArray;
                            } else {
                                str4 = str4;
                                parseArray = parseArray;
                                for (int i4 = 0; i4 < jSONArray.size(); i4++) {
                                    if (str.contains(jSONArray.getString(i4))) {
                                        z3 = false;
                                        break;
                                    }
                                }
                            }
                        }
                        z3 = true;
                        if (!z && z2 && z3 && c(context, jSONObject, jSONArray3, jSONArray4, jSONArray)) {
                            if ("true".equals(jSONObject.getString("forceCloseAnim"))) {
                                if (peuVar == null) {
                                    fve.e("HomeTransitionForNewAnim", "Abort:强制降级失败:transitionAnimParams is null ,无极缩放强制降级失败。:fixedConfigInfo 检测: orStarts" + jSONArray3 + " andContains:" + jSONArray4 + " notContains:" + jSONArray);
                                } else {
                                    peuVar.j = true;
                                    fve.e("HomeTransitionForNewAnim", "Abort:强制降级开始:无极缩放强制降级开始。:fixedConfigInfo 检测: orStarts:" + jSONArray3 + " andContains:" + jSONArray4 + " notContains:" + jSONArray);
                                }
                                return false;
                            } else {
                                E(peuVar, jSONObject, str, bundle);
                                return true;
                            }
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    str3 = str3;
                    z2 = true;
                    if (z) {
                    }
                    parseArray = parseArray;
                    jSONArray = jSONArray2;
                    str4 = str4;
                    z3 = true;
                    if (!z) {
                    }
                }
                fve.e("HomeTransitionForNewAnim", "Skip:拉取到的 fixedConfigInfo 未检测到无极缩放固化标识。size:" + size + " fixedConfigInfo:" + d);
                return false;
            } catch (Exception e) {
                fve.e("HomeTransitionForNewAnim", "Error:拉取到的 fixedConfigInfo 检测遇到异常，不执行无极缩放开关固化。配错了?" + Log.getStackTraceString(e));
                return false;
            }
        } catch (Exception e2) {
            fve.e("HomeTransitionForNewAnim", "Error:拉取到的 fixedConfigInfo 解析失败 ，不执行无极缩放开关固化。" + Log.getStackTraceString(e2));
            return false;
        }
    }
}
