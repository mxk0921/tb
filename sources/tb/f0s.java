package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.dinamicext.view.tbliveFllowContent.mtop.dxConfig.TemplateListRequest;
import com.taobao.taolive.dinamicext.view.tbliveFllowContent.mtop.dxConfig.TemplateListResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f0s extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092484);
    }

    public f0s(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(f0s f0sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/view/tbliveFllowContent/mtop/dxConfig/TBliveFllowDXTemplateListBusiness");
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447a9796", new Object[]{this});
            return;
        }
        TemplateListRequest templateListRequest = new TemplateListRequest();
        templateListRequest.appVersion = "tblFllowContent_20230909";
        C(1, templateListRequest, TemplateListResponse.class);
    }
}
