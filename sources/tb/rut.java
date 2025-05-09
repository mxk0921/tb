package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262866);
    }

    public static String a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d25ef7e6", new Object[]{new Long(j), str});
        }
        if (j < 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new SimpleDateFormat(str, Locale.getDefault()).format((Date) new Timestamp(j));
        } catch (Exception unused) {
            return null;
        }
    }
}
