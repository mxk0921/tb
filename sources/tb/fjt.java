package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.goodlist.TemplateListRequest;
import com.taobao.taolive.sdk.goodlist.TemplateListResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fjt extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356123);
    }

    public fjt(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(fjt fjtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/goodlist/TemplateListBusiness");
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447a9796", new Object[]{this});
            return;
        }
        TemplateListRequest templateListRequest = new TemplateListRequest();
        if (!TextUtils.isEmpty(zga.f())) {
            templateListRequest.appVersion = zga.f();
        }
        F(1, templateListRequest, TemplateListResponse.class, false, false, qvs.j());
    }
}
