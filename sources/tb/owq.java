package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.ut.device.UTDevice;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class owq extends h5p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CODE = "code";
    public static final String KEY_TTID = "ttid";
    public static final String KEY_UTDID = "utd_id";
    public static final String c = owq.class.getSimpleName();

    static {
        t2o.a(815792917);
    }

    public owq(String str, String str2, boolean z, boolean z2, String str3) {
        super(str, str2, z, z2, str3);
        e();
    }

    public static /* synthetic */ Object ipc$super(owq owqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/rx/network/business/request/SuggestApiBaseRequest");
    }

    public final void e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6667b570", new Object[]{this});
            return;
        }
        try {
            str = UTDevice.getUtdid(Globals.getApplication());
        } catch (Throwable th) {
            b4p.p(c, "获取utdid失败", th);
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            a("utd_id", str);
        }
        a("ttid", TaoApplication.getTTID());
        a("code", "utf-8");
        a("elderHome", String.valueOf(cvr.INSTANCE.c()));
    }
}
