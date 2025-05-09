package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.task.Coordinator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class q46 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_MTBSLIDEREXPOSEUT = 8542676456097187284L;
    public static final Map<String, Boolean> b = new HashMap(4);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f26499a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f26500a;

        public a(Object obj) {
            this.f26500a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = (JSONObject) this.f26500a;
            if (q46.a(q46.this)) {
                suv.e(u3j.b, 2201, jSONObject.getString("arg1"), null, null, jSONObject.getJSONObject("args"));
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
            if (jSONObject2 != null) {
                suv.e(jSONObject2.getString("page"), jSONObject2.getIntValue("eventId"), jSONObject2.getString("arg1"), null, null, jSONObject2.getJSONObject("args"));
            }
        }
    }

    static {
        t2o.a(745538122);
    }

    public q46(boolean z) {
        this.f26499a = z;
    }

    public static /* synthetic */ boolean a(q46 q46Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec10547d", new Object[]{q46Var})).booleanValue();
        }
        return q46Var.f26499a;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[0]);
        } else {
            ((HashMap) b).clear();
        }
    }

    public static /* synthetic */ Object ipc$super(q46 q46Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/event/DXMtbSliderExposeUTEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 2) {
            String str = (String) objArr[0];
            List list = (List) objArr[1];
            int i = ((DXPageChangeEvent) dXEvent).pageIndex;
            if (list != null && list.size() > i && i >= 0) {
                String str2 = str + i;
                Map<String, Boolean> map = b;
                if (!((HashMap) map).containsKey(str2)) {
                    Object obj = list.get(i);
                    if (obj instanceof JSONObject) {
                        ((HashMap) map).put(str2, Boolean.TRUE);
                        Coordinator.execute(new a(obj));
                    }
                }
            }
        }
    }
}
