package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.SearchSdk;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.ut.device.UTDevice;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pwq extends n8u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CODE = "code";
    public static final String KEY_TTID = "ttid";
    public static final String KEY_UTDID = "utd_id";
    public static final String c = pwq.class.getSimpleName();

    static {
        t2o.a(815793097);
    }

    public pwq(String str, String str2, MethodEnum methodEnum) {
        super(str, str2, methodEnum);
        g();
    }

    public static /* synthetic */ Object ipc$super(pwq pwqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/data/SuggestApiTppBaseRequest");
    }

    public final void g() {
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
            b("utd_id", str);
        }
        b("ttid", TaoApplication.getTTID());
        b("code", "utf-8");
        b(r4p.KEY_IS_BETA, String.valueOf(SearchSdk.isBeta()));
    }
}
