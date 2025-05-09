package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.api.AbsServiceImpl;
import com.taobao.alimama.cpm.ifs.IfsBuilder;
import com.taobao.alimama.sdk.common.CommonService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e74 extends AbsServiceImpl implements CommonService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1017118771);
        t2o.a(1017118810);
    }

    public static /* synthetic */ Object ipc$super(e74 e74Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/common/CommonServiceImpl");
    }

    @Override // com.taobao.alimama.sdk.common.CommonService
    public IfsBuilder buildIfsExposure(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IfsBuilder) ipChange.ipc$dispatch("8d94aa9b", new Object[]{this, application, str});
        }
        return new IfsBuilder(application, str);
    }

    @Override // com.taobao.alimama.sdk.common.CommonService
    public String handleAdUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0744cab", new Object[]{this, str});
        }
        String handleAdUrl = handleAdUrl(str, true);
        i4g.a("common_handler_url", "original_uri=" + str, "new_url=" + handleAdUrl);
        return handleAdUrl;
    }

    @Override // com.taobao.alimama.sdk.common.CommonService
    public String handleAdUrlForClickId(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e978c67b", new Object[]{this, str, new Boolean(z)});
        }
        return js0.b().d(str, z);
    }

    @Override // com.taobao.alimama.sdk.common.CommonService
    public String handleAdUrl(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d1536da1", new Object[]{this, str, new Boolean(z)}) : handleAdUrl(str, z, false);
    }

    @Override // com.taobao.alimama.sdk.common.CommonService
    public String handleAdUrl(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fc586b6b", new Object[]{this, str, new Boolean(z), new Boolean(z2)}) : js0.b().c(str, z, z2);
    }
}
