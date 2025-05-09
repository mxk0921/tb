package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class f6s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TLOG_UDF_SWITCH = "tlog_udf_switch";

    public static List<String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89b756d3", new Object[]{context});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.taobao.mediatrace.TLogMediaTraceUploader");
        return arrayList;
    }

    public static boolean c(String str) {
        e5s e5sVar;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            new StringBuilder("setUdfUploader ").append(str);
            Object newInstance = Class.forName(str).newInstance();
            if ((newInstance instanceof e5s) && (e5sVar = (e5s) newInstance) != null) {
                j5s.j().I(e5sVar.getBizCode(), e5sVar);
                return true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        TLog.loge("TLOG", "TLogUdfUploaderManager", "Failed to set udf uploader: " + str);
        return false;
    }

    public static void b(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.contains(TLOG_UDF_SWITCH)) {
            z = defaultSharedPreferences.getBoolean(TLOG_UDF_SWITCH, true);
        }
        if (z) {
            for (String str : a(context)) {
                c(str);
            }
            return;
        }
        Log.e("TLogUdfUploaderManager", "The udf switch is disable!");
    }
}
