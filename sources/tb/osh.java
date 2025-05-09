package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.mytaobao.newSettingV2.data.NewGeneralSettingDataManager;
import com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class osh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile long f25618a = 480;
    public static volatile String b = NewTaobaoSettingActivity.DEFAULT_COMPLIANCE_SETTING_DATA;
    public static volatile JSONObject c = NewGeneralSettingDataManager.GENERAL_SETTING_DEFAULT_STATUS_DATA;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            osh.b = ih4.f(p3g.K_DATA_COMPLIANCE_SETTING_DATA, NewTaobaoSettingActivity.DEFAULT_COMPLIANCE_SETTING_DATA);
            osh.c = ih4.e(p3g.f25856a, NewGeneralSettingDataManager.GENERAL_SETTING_DEFAULT_STATUS_DATA);
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c30119cf", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("mpm_data_switch", "wx_js_min_version", null);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bcaae1", new Object[0]);
        } else {
            Coordinator.execute(new a());
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f440c258", new Object[0])).booleanValue();
        }
        return ih4.a("isForceRequestSecData", true);
    }

    static {
        t2o.a(745538217);
    }
}
