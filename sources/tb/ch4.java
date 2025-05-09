package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ch4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else if ("codetrack".equals(str)) {
                xq2.a("CodeTrack.ConfigUtil", "orange groupName updated, codetrack");
            }
        }
    }

    public static double a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc943ad3", new Object[0])).doubleValue();
        }
        String config = OrangeConfig.getInstance().getConfig("codetrack", "codetrackV2SampleRate", String.valueOf(0.01d));
        if (TextUtils.isEmpty(config)) {
            return 0.01d;
        }
        try {
            double parseDouble = Double.parseDouble(config);
            if (parseDouble >= vu3.b.GEO_NOT_SUPPORT) {
                return parseDouble;
            }
            return 0.01d;
        } catch (Throwable unused) {
            return 0.01d;
        }
    }

    public static long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3395ffc", new Object[0])).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig("codetrack", "codetrackTimeInterval", String.valueOf((long) m.CONFIG_TRACK_1022_INTERVAL_TIME));
        if (TextUtils.isEmpty(config)) {
            return m.CONFIG_TRACK_1022_INTERVAL_TIME;
        }
        try {
            return Long.parseLong(config);
        } catch (NumberFormatException unused) {
            return m.CONFIG_TRACK_1022_INTERVAL_TIME;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b133eba", new Object[0])).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("codetrack", "codetrackV2Enable", Boolean.TRUE.toString());
        if (TextUtils.isEmpty(config) || !Boolean.parseBoolean(config)) {
            return false;
        }
        return true;
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12ab9373", new Object[]{context})).booleanValue();
        }
        if (System.currentTimeMillis() - b(context) < c()) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98606aaf", new Object[0])).booleanValue();
        }
        double random = Math.random();
        double a2 = a();
        Log.e("CodeTrack.ConfigUtil", "realRate = " + random + ", configRate = " + a2);
        return random < a2;
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c111c8c", new Object[0]);
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"codetrack"}, new a());
        }
    }

    public static long b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8b6bb", new Object[]{context})).longValue();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("codetrack_sp", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getLong("upload_time", 0L);
        }
        return 0L;
    }

    public static void g(Context context) {
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66bc7146", new Object[]{context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("codetrack_sp", 0);
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
            edit.putLong("upload_time", System.currentTimeMillis());
            edit.apply();
        }
    }
}
