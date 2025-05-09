package tb;

import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ls0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092791);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb959d34", new Object[]{str, str2, str3});
        } else if (gq0.c() != null) {
            gq0.c().c(str, str2, str3);
            if (vx9.d() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("ifs", str);
                hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, str2);
                rbu.c0(vx9.d(), "Show-Alimama_Exposure", hashMap);
            }
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321b3cb6", new Object[]{this, str, str2});
        } else if (gq0.c() != null) {
            gq0.c().a(str, str2);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d585bcf", new Object[]{this, str});
        } else if (gq0.c() != null) {
            gq0.c().d(str);
        }
    }

    public void d(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0f8aca", new Object[]{this, str, str2, list});
        } else if (gq0.c() != null) {
            gq0.c().b(str, str2, list);
        }
    }
}
