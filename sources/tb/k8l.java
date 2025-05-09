package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k8l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f22471a;
    public static List<String> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(393216112);
            t2o.a(613417024);
        }

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                return;
            }
            try {
                if ("aranger".equals(str)) {
                    b5d.i("OrangeAdapter", "aranger onConfigUpdate", new Object[0]);
                    k8l.f(OrangeConfig.getInstance().getConfigs("aranger"), laq.SP_ORI_NAME);
                }
            } catch (Throwable th) {
                b5d.h("OrangeAdapter", "onConfigUpdate", th, new Object[0]);
            }
        }
    }

    static {
        t2o.a(393216111);
        try {
            IpChange ipChange = OrangeConfig.$ipChange;
            f22471a = true;
            OrangeConfig.getInstance().registerListener(new String[]{"aranger"}, new a());
        } catch (Exception unused) {
            f22471a = false;
        }
    }

    public static String a(Map<String, ?> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3eb59ea8", new Object[]{map, str, str2});
        }
        if (map.containsKey(str)) {
            return String.valueOf(map.get(str));
        }
        return str2;
    }

    public static List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d5839b06", new Object[0]);
        }
        if (b == null) {
            try {
                String c = laq.c(re.r(), "hook_services_v1", "com.taobao.login4android.aidl.LoginService,anetwork.channel.aidl.NetworkService,com.alibaba.android.nextrpc.internal.accs.AccsReceiveService,com.alibaba.dingtalk.accs.connection.AccsBridgeService,com.taobao.calendar.bridge.service.CalendarServiceImpl,com.taobao.accs.data.MsgDistributeService,com.taobao.accs.AccsMainService,com.taobao.appfrmbundle.mkt.AccsReceiverService,com.taobao.orange.service.OrangeBindService,com.taobao.taobao.TaobaoIntentService,com.taobao.accs.ChannelService,org.android.agoo.accs.AgooService");
                b5d.i("OrangeAdapter", "getHookServiceList", "services", c);
                ArrayList arrayList = new ArrayList();
                Collections.addAll(arrayList, c.split(","));
                b = arrayList;
            } catch (Throwable th) {
                b5d.h("OrangeAdapter", "getHookServiceList err", th, new Object[0]);
                b = Collections.emptyList();
            }
        }
        return b;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ef8823f", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(laq.c(re.r(), "provider_retry_times", "3"));
        } catch (Throwable th) {
            b5d.h("OrangeAdapter", "getProviderRetryTimes err", th, new Object[0]);
            return 3;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eb31d0", new Object[0])).booleanValue();
        }
        try {
            return laq.b(re.r(), "normal_changes_enabled", true);
        } catch (Throwable th) {
            b5d.h("OrangeAdapter", "normalChangesEnabled err", th, new Object[0]);
            return true;
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94b4b83", new Object[0]);
        } else {
            f(laq.a(re.r(), laq.SP_ORI_NAME), laq.SP_NAME);
        }
    }

    public static void f(Map<String, ?> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22566ea9", new Object[]{map, str});
        } else if (!f22471a) {
            b5d.i("OrangeAdapter", "no orange sdk", new Object[0]);
        } else if (map == null || map.isEmpty()) {
            b5d.i("OrangeAdapter", "oriMap is empty", new Object[0]);
        } else {
            try {
                HashMap hashMap = new HashMap(2);
                hashMap.put("normal_changes_enabled", a(map, "normal_changes_enabled", "true"));
                hashMap.put("hook_services_v1", a(map, "hook_services_v1", "com.taobao.login4android.aidl.LoginService,anetwork.channel.aidl.NetworkService,com.alibaba.android.nextrpc.internal.accs.AccsReceiveService,com.alibaba.dingtalk.accs.connection.AccsBridgeService,com.taobao.calendar.bridge.service.CalendarServiceImpl,com.taobao.accs.data.MsgDistributeService,com.taobao.accs.AccsMainService,com.taobao.appfrmbundle.mkt.AccsReceiverService,com.taobao.orange.service.OrangeBindService,com.taobao.taobao.TaobaoIntentService,com.taobao.accs.ChannelService,org.android.agoo.accs.AgooService"));
                hashMap.put("provider_retry_times", a(map, "provider_retry_times", "3"));
                laq.d(re.r(), str, hashMap);
            } catch (Throwable th) {
                b5d.h("OrangeAdapter", "saveConfig err", th, new Object[0]);
            }
        }
    }
}
