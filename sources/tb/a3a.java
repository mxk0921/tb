package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import tb.bmi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class a3a extends bmi {
    public static final a Companion = new a(null);
    public static final String HIGHLIGHT_INTERACT_SWITCH = "GGMSG_highlightInteractSwitch";
    public static final String INTERACT_SWITCH_STATE_CHANGE_ARGS_STATE = "state";
    public static final String INTERACT_SWITCH_STATE_CHANGE_ARGS_STATE_OFF = "off";
    public static final String INTERACT_SWITCH_STATE_CHANGE_ARGS_STATE_ON = "on";
    public static final String INTERACT_SWITCH_STATE_CHANGE_NAME = "GGMSG_interactSwitchStateChange";
    public static final String RECEIVER_GG = "GG";
    public static final String SENDER_GG = "GG";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(689963228);
        }

        public a() {
        }

        public final a3a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a3a) ipChange.ipc$dispatch("3ed3f187", new Object[]{this, jSONObject});
            }
            ckf.g(jSONObject, "messageJSONObject");
            vgh.c(this, "GGPageMessage", "解析逛逛页面消息实体");
            Object obj = jSONObject.get("args");
            Object obj2 = jSONObject.get("timestamp");
            Object obj3 = jSONObject.get("sender");
            Object obj4 = jSONObject.get(bmi.KEY_RECEIVER);
            if ((obj instanceof JSONObject) && (obj2 instanceof Long) && (obj3 instanceof String) && (obj4 instanceof String)) {
                return b((JSONObject) obj, ((Number) obj2).longValue(), (String) obj3, (String) obj4, null);
            }
            vgh.c(this, "GGPageMessage", "解析逛逛页面消息实体，messageJSONObject参数无效");
            return null;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final a3a b(JSONObject jSONObject, long j, String str, String str2, bmi.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a3a) ipChange.ipc$dispatch("e679e6cf", new Object[]{this, jSONObject, new Long(j), str, str2, aVar});
            }
            ckf.g(jSONObject, "args");
            ckf.g(str, "sender");
            ckf.g(str2, bmi.KEY_RECEIVER);
            vgh.c(this, "GGPageMessage", "解析逛逛页面消息实体，timestamp=" + j + "，sender=" + str + "，receiver=" + str2);
            if ((!ckf.b(str, "Interact") || !ckf.b(str2, "Interact")) && (ckf.b(str, "Interact") || ckf.b(str2, "Interact"))) {
                Object obj = jSONObject.get(BaseOuterComponent.b.NAME);
                if (obj instanceof String) {
                    return new a3a((String) obj, jSONObject, j, str, str2, aVar, null);
                }
                vgh.c(this, "GGPageMessage", "解析逛逛页面消息实体，name无效");
                return null;
            }
            vgh.c(this, "GGPageMessage", "解析逛逛页面消息实体，sender和receiver无效");
            return null;
        }
    }

    static {
        t2o.a(689963227);
    }

    public /* synthetic */ a3a(String str, JSONObject jSONObject, long j, String str2, String str3, bmi.a aVar, a07 a07Var) {
        this(str, jSONObject, j, str2, str3, aVar);
    }

    public a3a(String str, JSONObject jSONObject, long j, String str2, String str3, bmi.a aVar) {
        super(str, jSONObject, j, str2, str3, aVar);
    }
}
