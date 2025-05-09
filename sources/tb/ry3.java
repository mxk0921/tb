package tb;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ry3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static File a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("26de027b", new Object[]{context, str});
        }
        File file = new File(context.getCacheDir().getParentFile(), "shared_prefs");
        return new File(file, str + ".xml");
    }

    public static String d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c33ab2a0", new Object[]{context, str});
        }
        String str2 = null;
        if (a(context, "bootimage_coldstart_launch").exists()) {
            str2 = context.getSharedPreferences("bootimage_coldstart_launch", 0).getString("userId", null);
        }
        if (str2 != null) {
            return str2;
        }
        try {
            return PreferenceManager.getDefaultSharedPreferences(context).getString("UserId", str);
        } catch (ClassCastException unused) {
            return str;
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23aa472", new Object[]{context})).booleanValue();
        }
        if (a(context, "bootimage_coldstart_launch").exists()) {
            return context.getSharedPreferences("bootimage_coldstart_launch", 0).getBoolean("needLaunchOnly", false);
        }
        String string = context.getSharedPreferences("android_bootimage_coldstart", 0).getString("bootimage_info_coldstart", "");
        return !TextUtils.isEmpty(string) && !TextUtils.equals("{\"result\":[]}", string);
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10134d79", new Object[]{context})).booleanValue();
        }
        if (a(context, "bootimage_coldstart_launch").exists()) {
            return context.getSharedPreferences("bootimage_coldstart_launch", 0).getBoolean("needLaunchRely", false);
        }
        String string = context.getSharedPreferences("android_bootimage_coldstart", 0).getString("cold_start_boot_info", "");
        return !TextUtils.isEmpty(string) && !TextUtils.equals(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264, string);
    }
}
