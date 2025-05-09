package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.datastructure.GatewayActionInfo;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements d90 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GatewayActionInfo f29776a;
        public final /* synthetic */ i5a b;

        public a(GatewayActionInfo gatewayActionInfo, i5a i5aVar) {
            this.f29776a = gatewayActionInfo;
            this.b = i5aVar;
        }

        public void a(String str, JSONObject jSONObject, t4a t4aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e3acdf7", new Object[]{this, str, jSONObject, t4aVar});
                return;
            }
            b5a b5aVar = new b5a(str, this.f29776a.getTargetComponent(), jSONObject, this.f29776a.getCallbackConfig().getJSONArray(str), this.f29776a.getTriggerEvent());
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(b5aVar);
            d5a.e(arrayList, this.b);
        }
    }

    static {
        t2o.a(475004932);
    }

    public static void a(GatewayActionInfo gatewayActionInfo, i5a i5aVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808cc5d6", new Object[]{gatewayActionInfo, i5aVar});
            return;
        }
        String str2 = "";
        if (gatewayActionInfo == null) {
            str = str2;
        } else if (gatewayActionInfo.getTargetComponent() != null) {
            str = gatewayActionInfo.getTargetComponent().c();
        } else {
            str = "null";
        }
        if (gatewayActionInfo != null) {
            str2 = gatewayActionInfo.getActionName() + "," + str;
        }
        TLog.logd("gateway2-GatewayActionExecutor.executeActionWithInfo", str2);
        s4a a2 = i5aVar.c().a(gatewayActionInfo.getActionName());
        if (a2 != null) {
            a2.a(gatewayActionInfo.getActionParam(), new a(gatewayActionInfo, i5aVar));
        }
    }
}
