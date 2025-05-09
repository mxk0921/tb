package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.subscriber.widget.OrderVesselContainer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q7x extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_URL = "url";
    public static final String KEY_QUERY_PARAM = "queryParams";
    public static final String NEXT_TAG_DISMISS = "dismiss";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements lqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b8v f26569a;

        public a(b8v b8vVar) {
            this.f26569a = b8vVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            } else {
                q7x.J(q7x.this, this.f26569a, "dismiss");
            }
        }
    }

    static {
        t2o.a(614465768);
    }

    public static /* synthetic */ void J(q7x q7xVar, b8v b8vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8e067d7", new Object[]{q7xVar, b8vVar, str});
        } else {
            q7xVar.C(b8vVar, str);
        }
    }

    public static /* synthetic */ Object ipc$super(q7x q7xVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/WeexPopV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "1819876949380220675";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (!(b8vVar.e() instanceof Activity) || E(b8vVar) == null || !(E(b8vVar).get("url") instanceof String)) {
            if (!(b8vVar.e() instanceof Activity)) {
                str = "content 异常" + b8vVar.e();
            } else if (E(b8vVar) == null) {
                str = "getEventFields 为空";
            } else {
                str = !(E(b8vVar).get("url") instanceof String) ? "url 参数有问题" : null;
            }
            uj8.a(q7x.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", str);
        } else {
            String string = E(b8vVar).getString("url");
            if (E(b8vVar).get("queryParams") instanceof JSONObject) {
                string = c2u.b(string, E(b8vVar).getJSONObject("queryParams"));
            }
            OrderVesselContainer.a(b8vVar.e(), string, new a(b8vVar));
        }
    }
}
