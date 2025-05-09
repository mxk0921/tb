package tb;

import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class mkv implements dbh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(654311470);
        t2o.a(654311468);
    }

    @Override // tb.dbh
    public String a(String str, bsa bsaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38f15b0f", new Object[]{this, str, bsaVar});
        }
        if (str.indexOf("$UPDATE_TIME_ms") > -1) {
            str = str.replace("$UPDATE_TIME_ms", String.valueOf(b()));
        }
        if (str.indexOf("$UPDATE_TIME_s") > -1) {
            str = str.replace("$UPDATE_TIME_s", String.valueOf(b() / 1000));
        }
        return bsaVar.a(str);
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e585937", new Object[]{this})).longValue();
        }
        try {
            return d.d.getPackageManager().getPackageInfo(d.d.getPackageName(), 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0L;
        }
    }
}
