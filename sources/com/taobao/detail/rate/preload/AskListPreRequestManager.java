package com.taobao.detail.rate.preload;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom.TradeHybridCustomAnnotation;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.ckf;
import tb.qbv;
import tb.u38;
import tb.u9v;
import tb.wsq;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/taobao/detail/rate/preload/AskListPreRequestManager;", "", "<init>", "()V", "Companion", "a", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class AskListPreRequestManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AB_COMPONENT = "ask_list_performance_component";
    private static final String AB_ENABLE_PRE_REQUEST = "enable_pre_request";
    private static final String AB_MODULE = "ask_list_performance_module";
    private static final String ASK_LIST_URL_PATH = "app/mtb/taobao-ugc/ask/list";
    public static final a Companion = new a(null);
    private static final String KEY_ITEM_ID = "refId";
    private static final String KEY_NAV_PRE_REQUEST = "navPreRequest";
    private static final String KEY_REQUEST_PARAMS = "requestParams";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final void a(String str, JSONObject jSONObject, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a0b2712", new Object[]{this, str, jSONObject, str2});
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "preRequestParams", (String) jSONObject);
            jSONObject2.put((JSONObject) "storageKey", str);
            jSONObject2.put((JSONObject) "bizName", "askList");
            jSONObject2.put((JSONObject) "preRequestUniqueKey", str);
            qbv.j().a(UltronTradeHybridStage.ON_NAV, str2, jSONObject2);
        }

        public final JSONObject b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("62bcb410", new Object[]{this, str});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("itemId", (Object) str);
            return jSONObject;
        }

        @TradeHybridCustomAnnotation
        @JvmStatic
        public final void d(Activity activity, String str, String str2, Map<?, ?> map) {
            String str3;
            Uri data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85f70396", new Object[]{this, activity, str, str2, map});
                return;
            }
            Object obj = null;
            Object obj2 = map != null ? map.get("nav_process_param_intent") : null;
            if (obj2 instanceof Intent) {
                obj = obj2;
            }
            Intent intent = (Intent) obj;
            if (intent == null || (data = intent.getData()) == null || (str3 = data.toString()) == null) {
                str3 = "";
            }
            if (e(str3) && intent != null) {
                g(intent);
            }
        }

        @JvmStatic
        public final void g(Intent intent) {
            String str;
            Uri.Builder buildUpon;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37154817", new Object[]{this, intent});
                return;
            }
            ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            Uri data = intent.getData();
            String queryParameter = data != null ? data.getQueryParameter("requestParams") : null;
            Uri data2 = intent.getData();
            if (data2 == null || (str = data2.getQueryParameter(AskListPreRequestManager.KEY_ITEM_ID)) == null) {
                str = "";
            }
            boolean f = f();
            if (!TextUtils.isEmpty(str) && f) {
                long currentTimeMillis = System.currentTimeMillis();
                String str2 = currentTimeMillis + "_askList_" + str;
                String str3 = currentTimeMillis + "_askItemInfo_" + str;
                a(str2, c(str, queryParameter), "ask_list");
                a(str3, b(str), "ask_list_item_info");
                Uri data3 = intent.getData();
                if (data3 != null && (buildUpon = data3.buildUpon()) != null) {
                    buildUpon.appendQueryParameter("preRequestUniqueKeyList", str2);
                    buildUpon.appendQueryParameter("preRequestUniqueKeyItem", str3);
                    buildUpon.appendQueryParameter(AskListPreRequestManager.KEY_NAV_PRE_REQUEST, "true");
                    intent.setData(buildUpon.build());
                }
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final JSONObject c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("9e1af12f", new Object[]{this, str, str2});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("itemId", (Object) str);
            jSONObject.put("page", (Object) 1);
            jSONObject.put("pageSize", (Object) 10);
            jSONObject.put("tagId", (Object) "");
            jSONObject.put("type", (Object) "mix_group");
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("extraInfo", (Object) str2);
            return jSONObject;
        }

        public final boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2752864", new Object[]{this})).booleanValue();
            }
            return u9v.f(u38.NAME_SPACE, "enableAskListPreRequest", true) && UltronTradeHybridSwitcherHelper.i("ask_list", "askList");
        }

        @JvmStatic
        public final boolean e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ef78ad02", new Object[]{this, str})).booleanValue();
            }
            ckf.g(str, "url");
            return wsq.O(str, AskListPreRequestManager.ASK_LIST_URL_PATH, false, 2, null) && f();
        }
    }

    @TradeHybridCustomAnnotation
    @JvmStatic
    public static final void hybridStage(Activity activity, String str, String str2, Map<?, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f70396", new Object[]{activity, str, str2, map});
        } else {
            Companion.d(activity, str, str2, map);
        }
    }

    @JvmStatic
    public static final boolean isAskList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef78ad02", new Object[]{str})).booleanValue();
        }
        return Companion.e(str);
    }

    @JvmStatic
    public static final void onNavAskList(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37154817", new Object[]{intent});
        } else {
            Companion.g(intent);
        }
    }
}
