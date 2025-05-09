package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class khg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public jhg a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jhg) ipChange.ipc$dispatch("d9e0eca6", new Object[]{this, str, new Long(j)});
        }
        d();
        c();
        if (TextUtils.isEmpty(str)) {
            if (o48.j) {
                return new qrg(j);
            }
            return null;
        } else if (o48.j) {
            return new qrg(str, j);
        } else {
            return null;
        }
    }

    public jhg b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jhg) ipChange.ipc$dispatch("9b2ae277", new Object[]{this, new Long(j)});
        }
        d();
        c();
        if (o48.j) {
            return new jhg(j);
        }
        return null;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4e5442", new Object[]{this});
        } else if (!o48.j) {
            SharedPreferences.Editor edit = w9a.g().k().edit();
            edit.putString(ikv.KEY_LAST_LAUNCH_SESSION, "");
            edit.apply();
        }
    }

    public final void d() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f170aa08", new Object[]{this});
            return;
        }
        if (nca.k != 1) {
            z = true;
        }
        nca.k = 1;
        if (o48.n) {
            emv.a().e(new ikv(z));
            emv.a().f(true);
        }
    }
}
