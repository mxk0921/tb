package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.d;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class dgg implements dbh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(654311467);
        t2o.a(654311468);
    }

    @Override // tb.dbh
    public String a(String str, bsa bsaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38f15b0f", new Object[]{this, str, bsaVar});
        }
        if (str.indexOf("$LAST_MODIFIED_s") > -1) {
            str = str.replace("$LAST_MODIFIED_s", b(d.d));
        }
        return bsaVar.a(str);
    }

    public final String b(Application application) {
        String str;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6108749d", new Object[]{this, application});
        }
        try {
            String str3 = application.getApplicationInfo().sourceDir;
            if (str3 == null) {
                return str3;
            }
            try {
                File file = new File(str3);
                if (!file.exists()) {
                    return str3;
                }
                return (file.lastModified() / 1000) + str2;
            } catch (Exception unused) {
                str2 = str;
                return str2;
            }
        } catch (Exception unused2) {
        }
    }
}
