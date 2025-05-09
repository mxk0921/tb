package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pt1 implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALLBACK_EVENT_KEY = "callbackEventKey";
    public static final String CALLBACK_IS_SUCCESS = "callbackIsSuccess";

    /* renamed from: a  reason: collision with root package name */
    public final Object f26280a;
    public final a b;
    public final String c;
    public final JSONObject d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    static {
        t2o.a(352321623);
        t2o.a(723517443);
    }

    public pt1(Object obj) {
        this.f26280a = obj;
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return kk8.a(getClass(), this.f26280a);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return this.d;
    }

    public pt1(Object obj, JSONObject jSONObject) {
        this.f26280a = obj;
        if (jSONObject != null) {
            this.c = jSONObject.getString(hxj.EVENT_KEY);
            this.d = jSONObject.getJSONObject("params");
            Object obj2 = jSONObject.get("callback");
            if (obj2 != null) {
                this.b = (a) obj2;
            }
        }
    }
}
