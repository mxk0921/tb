package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.model.predeal.PreDealCustomEventParams;
import com.alibaba.poplayer.config.model.predeal.PreDealIndexContent;
import com.alibaba.poplayer.norm.IModuleSwitchAdapter;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.trigger.adapter.TriggerControllerInfoManager;
import com.alibaba.poplayer.trigger.page.PageTriggerService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ufu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DEAL_END_TIME = "dealEndTime";
    public static final String KEY_DEAL_START_TIME = "dealStartTime";
    public static final String KEY_INDEX_MAP = "indexMap";
    public static final String KEY_NO_ALG_FILTER_MAP = "noAlgFilterMap";
    public static final String KEY_SDK_WAIT_TIME = "sdkWaitTime";
    public static final String KEY_TRACE_ID = "traceId";
    public static final String KEY_TRACK_MAP = "trackMap";
    public static final String KEY_URI_SET = "uriSet";

    /* renamed from: a  reason: collision with root package name */
    public final InternalTriggerController f29349a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends TypeReference<HashMap<String, PreDealIndexContent>> {
        public a(ufu ufuVar) {
        }
    }

    static {
        t2o.a(626000022);
    }

    public ufu(InternalTriggerController internalTriggerController) {
        this.f29349a = internalTriggerController;
    }

    public final PreDealCustomEventParams a(String str, String str2, String str3, JSONObject jSONObject, String str4, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreDealCustomEventParams) ipChange.ipc$dispatch("80d9d93b", new Object[]{this, str, str2, str3, jSONObject, str4, new Long(j), new Long(j2), new Long(j3)});
        }
        try {
            PreDealCustomEventParams preDealCustomEventParams = new PreDealCustomEventParams();
            if (!TextUtils.isEmpty(str)) {
                preDealCustomEventParams.setUriSet(new HashSet(Arrays.asList(str.split(","))));
            }
            if (!TextUtils.isEmpty(str2)) {
                preDealCustomEventParams.setIndexMap((Map) JSON.parseObject(str2, new a(this), new Feature[0]));
            }
            preDealCustomEventParams.setTrackMap(jSONObject);
            preDealCustomEventParams.setTraceId(str4);
            preDealCustomEventParams.setDealStartTime(j);
            preDealCustomEventParams.setDealEndTime(j2);
            preDealCustomEventParams.setSdkWaitTime(j3);
            return preDealCustomEventParams;
        } catch (Throwable th) {
            wdm.h("TriggerBroadcastProcessor.triggerPreDealPop.getPreDealCustomEventParams.error.", th);
            return null;
        }
    }

    public void c(BaseConfigItem baseConfigItem, String str, String str2, JSONObject jSONObject, abd abdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b76a951", new Object[]{this, baseConfigItem, str, str2, jSONObject, abdVar});
        } else {
            PageTriggerService.instance().popHubAccept(baseConfigItem, str, str2, jSONObject, abdVar);
        }
    }

    public void b(String str, String str2, String str3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4cca1a", new Object[]{this, str, str2, str3, new Boolean(z), new Boolean(z2)});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "TriggerBroadcastProcessor.triggerFragmentSwitchPop.onReceive?fragmentName is empty");
                return;
            }
            if (str2 == null) {
                str2 = "";
            }
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "TriggerBroadcastProcessor.triggerFragmentSwitchPop..onReceive.fragmentName=" + str + ",param=" + str2 + ",needAcParam=" + z + ".fromBroadcast=" + z2);
            if (TextUtils.isEmpty(str3) || !str3.contains("clean")) {
                this.f29349a.onFragmentResumed(str, str2, z);
                return;
            }
            String curActivityKeyCode = TriggerControllerInfoManager.instance().getCurActivityKeyCode();
            PageTriggerService.instance().pageClean(InternalTriggerController.getKeyCode(curActivityKeyCode, str), curActivityKeyCode, false);
        } catch (Throwable th) {
            wdm.h("FragmentSwitchBroadcastReceiver.onReceive.fail", th);
        }
    }

    public void e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bebb3d", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "TriggerBroadcastProcessor.triggerSchemaPop.onReceive?uri=" + str + "&param=" + str2);
            if (!TextUtils.isEmpty(str)) {
                if (PopLayer.getReference().internalGetCurrentActivity() == null) {
                    wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "TriggerBroadcastProcessor.triggerSchemaPop.onReceive curActivity is empty.");
                    return;
                }
                if (str2 == null) {
                    str2 = "";
                }
                if (!str.startsWith(PageTriggerService.PAGE_SCHEME) && !TextUtils.isEmpty(str3) && str3.contains("clean")) {
                    String curActivityKeyCode = TriggerControllerInfoManager.instance().getCurActivityKeyCode();
                    PageTriggerService.instance().pageClean(curActivityKeyCode, curActivityKeyCode, true);
                }
                PageTriggerService.instance().activeAccept(str, str2);
            }
        } catch (Throwable th) {
            wdm.h("InternalBroadcastReceiver.onReceive.fail", th);
        }
    }

    public void d(String str, String str2, String str3, JSONObject jSONObject, String str4, long j, long j2, long j3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bdb794b", new Object[]{this, str, str2, str3, jSONObject, str4, new Long(j), new Long(j2), new Long(j3), new Boolean(z)});
            return;
        }
        try {
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "TriggerBroadcastProcessor.triggerPreDealPop.onReceive.fromBroadcast=" + z);
            qtv.s("start", "", new HashMap());
            IModuleSwitchAdapter a2 = jd0.c().a();
            if (a2 == null || a2.isPreDealTriggerEnable()) {
                wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "TriggerBroadcastProcessor.triggerPreDealPop.onReceive.uriSet=" + str + ".traceId=" + str4 + ".indexMap=" + str2);
                if (!TextUtils.isEmpty(str)) {
                    if (PopLayer.getReference().internalGetCurrentActivity() == null) {
                        wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "TriggerBroadcastProcessor.triggerPreDealPop.onReceive.current Activity is empty.");
                        return;
                    }
                    PreDealCustomEventParams a3 = a(str, str2, str3, jSONObject, str4, j, j2, j3);
                    if (a3 == null || a3.isValid()) {
                        nsu.l(a3);
                        PageTriggerService.instance().preDealCustomAccept(a3);
                        wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "TriggerBroadcastProcessor.triggerPreDealPop.onReceive.acceptDone.uriSet=" + str + "&indexMap=" + str2 + ".traceId=" + str4);
                        qtv.s("end", str4, new HashMap());
                        return;
                    }
                    wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "TriggerBroadcastProcessor.triggerPreDealPop.onReceive.preDealCustomEventParams.isInvalid.");
                    return;
                }
                return;
            }
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "TriggerBroadcastProcessor.triggerPreDealPop.onReceive.isPreDealTriggerEnable=false.return.");
        } catch (Throwable th) {
            wdm.h("TriggerBroadcastProcessor.triggerPreDealPop.onReceive.fail", th);
        }
    }
}
