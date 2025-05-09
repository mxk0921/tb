package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;
import android.util.SparseArray;
import com.alibaba.ut.abtest.internal.bucketing.HighPriorityExperimentStorage;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.manager.FeatureManager;
import com.taobao.android.knife.perf.PerfKnife;
import com.taobao.tao.TaobaoApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mtopsdk.common.util.ConfigStoreManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i1d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray<SharedPreferences> f21037a = new SparseArray<>();
    public static final List<String> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    static {
        ArrayList arrayList = new ArrayList(128);
        b = arrayList;
        Trace.beginSection("IOKnife#cinit");
        arrayList.add(FeatureManager.FEATURE_KEY_CRASH);
        arrayList.add("instant_patch");
        arrayList.add("ab_watcher_indices_evo_switches");
        arrayList.add("ab_watcher_indices");
        arrayList.add("TaobaoThemeKit");
        arrayList.add("uikit_sp_group");
        arrayList.add("dynamic_features_config");
        arrayList.add("fragment_model_downgrade_switch");
        arrayList.add("group_dinamicX_common_android");
        arrayList.add("homepage_switch");
        arrayList.add("multiClass");
        arrayList.add("newNav");
        arrayList.add("template_data_debug");
        arrayList.add("android_bootimage_coldstart");
        arrayList.add("bootimage_coldstart_launch");
        arrayList.add("ab_watcher_indices_evo");
        arrayList.add("ab_watcher_indices_switches");
        arrayList.add(HighPriorityExperimentStorage.SP_NAME_BETA_SINGLE);
        arrayList.add(HighPriorityExperimentStorage.SP_NAME_RELEASE);
        arrayList.add("SwallowsRemoteSoSwitch");
        arrayList.add("SwallowsRemoteSoIndex");
        arrayList.add("com.taobao.tao.welcome.Welcome");
        arrayList.add("com.taobao.taobao_preferences");
        arrayList.add("festivalSP");
        arrayList.add("deviceevaluator");
        arrayList.add("rvision_switch");
        arrayList.add("ut-ab");
        arrayList.add("ut-ab-config");
        arrayList.add("apm");
        arrayList.add("ability_storage_home_atmos");
        arrayList.add("homepage_fragment_sp");
        arrayList.add("homepage_um_ab");
        arrayList.add("home_client_abtest");
        arrayList.add("sp_poplayer_info_v2");
        arrayList.add("UTCommon");
        arrayList.add("mmAdBiz");
        arrayList.add("bootImageMonitor");
        arrayList.add("com.taobao.taobao_NotLogin");
        arrayList.add("adaemon");
        arrayList.add("network_ssl_ticket");
        arrayList.add(ConfigStoreManager.MTOP_CONFIG_STORE);
        arrayList.add(txn.SP_NAME);
        arrayList.add(hc6.DX_GLOBAL_SP);
        arrayList.add("WALLE");
        arrayList.add("home_dx_data");
        arrayList.add("homepage_location_sp");
        arrayList.add("homepage_common");
        arrayList.add("home_pass_params");
        arrayList.add("home_device");
        arrayList.add(exl.KEY);
        arrayList.add("globalAddress");
        arrayList.add("homepage_biz_switch");
        Trace.endSection();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0919332", new Object[0]);
        } else {
            PerfKnife.autoBindBigCore();
        }
    }

    public static SharedPreferences b(Context context, String str, int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("ef93257c", new Object[]{context, str, new Integer(i), aVar});
        }
        SharedPreferences sharedPreferences = f21037a.get(str.hashCode());
        if (sharedPreferences == null) {
            return ((TaobaoApplication.a) aVar).a(context, str, i);
        }
        return sharedPreferences;
    }

    public static void c(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e4e46c", new Object[]{context, aVar});
            return;
        }
        try {
            Trace.beginSection("IOKnife#init");
            lq4.a(context);
            lq4.b();
            Iterator it = ((ArrayList) b).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                f21037a.put(str.hashCode(), ((TaobaoApplication.a) aVar).a(context, str, 0));
            }
        } finally {
            Trace.endSection();
        }
    }
}
