package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s2o implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String d = "exp_negative_problems";
    private static final String e = "startup";

    /* renamed from: a  reason: collision with root package name */
    private final String f27762a;
    private final String b;
    private final int c;

    public s2o(String str, String str2, int i) {
        this.b = str;
        this.f27762a = str2;
        this.c = i;
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47c8ead7", new Object[]{str})).booleanValue();
        }
        if (!UTAnalytics.getInstance().isInit()) {
            TLog.loge(erj.MODULE, erj.TAG, "ut is not ready for: " + str);
            return false;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("startup_data", str);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(d, 19999, e, null, null, hashMap).build());
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(erj.MODULE, erj.TAG, Boolean.TRUE.toString()))) {
            TLog.loge(erj.MODULE, erj.TAG, "switch is off, return");
        } else {
            SharedPreferences sharedPreferences = LauncherRuntime.h.getSharedPreferences(this.f27762a, 0);
            Map<String, ?> all = sharedPreferences.getAll();
            if (all == null || all.isEmpty()) {
                TLog.loge(erj.MODULE, erj.TAG, "no data in storage");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    String key = entry.getKey();
                    if (!TextUtils.equals(key, "version")) {
                        String str = (String) value;
                        TLog.loge(erj.MODULE, erj.TAG, str);
                        if (!TextUtils.equals(key, this.b)) {
                            i++;
                            if (i <= this.c && a(str)) {
                                arrayList.add(key);
                            }
                        } else if (a(str)) {
                            arrayList.add(key);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    edit.remove((String) it.next());
                }
                edit.commit();
            }
        }
    }
}
