package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ktv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASYN_CHECK_SUCCESS = "asynCheck_Success";
    public static final String PAGE_AUGE = "Page_Auge";
    public static final String SYN_CHECK_SUCCESS = "synCheck_Success";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f22919a;

        public a(Map map) {
            this.f22919a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                UTAnalytics.getInstance().getDefaultTracker().send(this.f22919a);
                hj1.a(jj1.LOG_TAG, "sendCustomHitMulti === 多个打点:" + this.f22919a.toString());
            } catch (Exception e) {
                hj1.b(jj1.LOG_TAG, "UserTracerUtils  ===  sendCustomHitMulti = 打点异常：" + e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f22920a;

        public b(Map map) {
            this.f22920a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                UTAnalytics.getInstance().getDefaultTracker().send(this.f22920a);
                hj1.a(jj1.LOG_TAG, "sendCustomHitSingle === 单个打点:" + this.f22920a.toString());
            } catch (Exception e) {
                hj1.b(jj1.LOG_TAG, "UserTracerUtils  ===  sendCustomHitSingle = 打点异常：" + e);
            }
        }
    }

    public static void a(String str, String str2, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fdaf89c", new Object[]{str, str2, list, list2});
            return;
        }
        HashMap hashMap = new HashMap();
        if (list != null && list.size() > 0) {
            for (String str3 : list) {
                if (list2.contains(str3)) {
                    hashMap.put(str3, "true");
                } else {
                    hashMap.put(str3, "false");
                }
            }
        }
        Coordinator.execute(new a(new UTOriginalCustomHitBuilder(PAGE_AUGE, 19999, str, str2, JSON.toJSONString(hashMap), null).build()));
    }

    public static void b(String str, String str2, Map<String, String> map) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1adc1d28", new Object[]{str, str2, map});
            return;
        }
        if (map != null) {
            str3 = JSON.toJSONString(map);
        } else {
            str3 = "";
        }
        Coordinator.execute(new b(new UTOriginalCustomHitBuilder(PAGE_AUGE, 19999, str, str2, str3, null).build()));
    }
}
