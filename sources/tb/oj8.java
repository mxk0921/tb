package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareBusiness;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class oj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_STATE_EVENT = "dataStateEvent";
    public static final JSONObject EMPTY_EVENT = new JSONObject();
    public static final String GET_CONTACTS_INFO_EVENT = "TBWeexShare.getContactsInfo";
    public static final String HIDE_BUBBLE_EVENT = "hideBubbleEvent";
    public static final String REGISTER_SHARE_LISTENER_EVENT = "TBWeexShare.registerWeexShareListener";
    public static final String SHARE_CONTENT_KEY = "shareContent";
    public static final String SHARE_UT_ARGS_EVENT = "shareUTArgs";
    public static final String SHOW_BUBBLE_EVENT = "showBubbleEvent";
    public static final String SHOW_COVER_EVENT = "showGuideEvent";
    public static final String SHOW_GIFT_EVENT = "shareGiftEvent";
    public static final String SHOW_TIPS_EVENT = "showTipsEvent";

    /* renamed from: a  reason: collision with root package name */
    public WVCallBackContext f25428a;
    public final ConcurrentHashMap<String, JSONObject> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final oj8 f25429a = new oj8();

        static {
            t2o.a(667942944);
        }

        public static /* synthetic */ oj8 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oj8) ipChange.ipc$dispatch("7695bb42", new Object[0]);
            }
            return f25429a;
        }
    }

    static {
        t2o.a(667942942);
    }

    public static oj8 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oj8) ipChange.ipc$dispatch("a32a6726", new Object[0]);
        }
        return b.a();
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b5ba24", new Object[]{this, jSONObject});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.b(SHARE_CONTENT_KEY, jSONObject.toJSONString());
        WVCallBackContext wVCallBackContext = this.f25428a;
        if (wVCallBackContext != null) {
            wVCallBackContext.success(nswVar);
            fwr.a("EventCenter", "callback wvCallbackContext not null, data: " + nswVar.m());
            ShareBusiness.sShareUTArgs.put(ShareBusiness.NATIVE_PUSH_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
            d().b();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad106e6c", new Object[]{this});
        } else if (ShareBusiness.sShareUTArgs.containsKey(ShareBusiness.BIZ_CONFIG_END_KEY) && ShareBusiness.sShareUTArgs.containsKey(ShareBusiness.CC_LIST_END_KEY) && ShareBusiness.sShareUTArgs.containsKey(ShareBusiness.WEEX_RENDER_END_KEY) && ShareBusiness.sShareUTArgs.containsKey(ShareBusiness.WEEX_LOAD_END_KEY)) {
            if (ShareBusiness.sShareUTArgs.containsKey(ShareBusiness.NATIVE_PUSH_KEY) || ShareBusiness.sShareUTArgs.containsKey(ShareBusiness.WEEX_PULL_KEY)) {
                c("shareUTArgs", ShareBusiness.sShareUTArgs);
                fwr.b("TIMECOST", "total time: " + (System.currentTimeMillis() - ShareBusiness.sShareStartTime) + ", detail: " + ShareBusiness.sShareUTArgs.toJSONString());
            }
        }
    }

    public void c(String str, JSONObject jSONObject) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
            return;
        }
        WVCallBackContext wVCallBackContext = this.f25428a;
        if (wVCallBackContext != null) {
            String str3 = "";
            if (jSONObject == null) {
                str2 = str3;
            } else {
                str2 = jSONObject.toJSONString();
            }
            wVCallBackContext.fireEvent(str, str2);
            StringBuilder sb = new StringBuilder("fireEvent wvCallbackContext not null, fire eventName: ");
            sb.append(str);
            sb.append(", eventParam: ");
            if (jSONObject != null) {
                str3 = jSONObject.toJSONString();
            }
            sb.append(str3);
            fwr.a("EventCenter", sb.toString());
            return;
        }
        this.b.put(str, jSONObject);
        fwr.a("EventCenter", "fireEvent wvCallbackContext null, cache eventName: " + str);
    }

    public void e(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2809cbcd", new Object[]{this, wVCallBackContext});
            return;
        }
        this.f25428a = wVCallBackContext;
        try {
            if (wVCallBackContext != null) {
                try {
                    if (this.b.size() > 0) {
                        for (Map.Entry<String, JSONObject> entry : this.b.entrySet()) {
                            String str = "";
                            this.f25428a.fireEvent(entry.getKey(), entry.getValue() == null ? str : entry.getValue().toJSONString());
                            StringBuilder sb = new StringBuilder();
                            sb.append("fireEvent wvCallbackContext not null, fire cache eventName: ");
                            sb.append(entry.getKey());
                            sb.append(", eventParam: ");
                            if (entry.getValue() != null) {
                                str = entry.getValue().toJSONString();
                            }
                            sb.append(str);
                            fwr.a("EventCenter", sb.toString());
                            if (REGISTER_SHARE_LISTENER_EVENT.equals(entry.getKey())) {
                                ShareBusiness.sShareUTArgs.put(ShareBusiness.WEEX_PULL_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
                                d().b();
                            }
                        }
                    }
                } catch (Exception e) {
                    fwr.a("EventCenter", "fireEvent wvCallbackContext not null, fire cache event err: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        } finally {
            this.b.clear();
            fwr.a("EventCenter", "fireEvent wvCallbackContext not null, fire cache event finally: clear");
        }
    }

    public oj8() {
        this.b = new ConcurrentHashMap<>();
    }
}
