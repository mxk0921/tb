package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.tao.Globals;
import com.ut.device.UTDevice;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n8u extends h5p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_ID_KEY = "appId";
    public static final String KEY_UTDID = "utd_id";

    static {
        t2o.a(815792927);
    }

    public n8u(String str, String str2, MethodEnum methodEnum) {
        super("mtop.relationrecommend.WirelessRecommend.recommend", "2.0", true, false, true, str2, methodEnum);
        String str3;
        a("appId", str);
        b("_input_charset", "UTF8");
        b("_output_charset", "UTF8");
        b("sversion", r4p.SERVER_VERSION_VALUE);
        e();
        try {
            str3 = UTDevice.getUtdid(Globals.getApplication());
        } catch (Throwable th) {
            b4p.p("TppRxMtopRequest", "获取utdid失败", th);
            str3 = "";
        }
        if (!TextUtils.isEmpty(str3)) {
            b("utd_id", str3);
        }
        String c = k1p.c();
        if (!TextUtils.isEmpty(c)) {
            b(r4p.KEY_EDITION_CODE, c);
        }
        b("elderHome", String.valueOf(cvr.INSTANCE.c()));
    }

    public static /* synthetic */ Object ipc$super(n8u n8uVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/rx/network/tpp/TppRxMtopRequest");
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2140d8f1", new Object[]{this});
        } else {
            ScreenType.a(this.f20426a.g);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9945baeb", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            a("appId", str);
        }
    }

    public n8u(String str, String str2) {
        this(str, str2, null);
    }
}
