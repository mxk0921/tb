package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.BaseDetailBusiness;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoLiveHotKeyRequest;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoLiveHotWordResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qws extends BaseDetailBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378523);
    }

    public qws(IRemoteBaseListener iRemoteBaseListener) {
        super(iRemoteBaseListener);
    }

    public static /* synthetic */ Object ipc$super(qws qwsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/business/search/TaoLiveHotKeyBusiness");
    }

    public void j(b0h b0hVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b14c47", new Object[]{this, b0hVar, context});
            return;
        }
        TaoLiveHotKeyRequest taoLiveHotKeyRequest = new TaoLiveHotKeyRequest();
        taoLiveHotKeyRequest.source = "h5";
        g(0, taoLiveHotKeyRequest, TaoLiveHotWordResponse.class);
        mbu.c("requestStart", "firstRequest", taoLiveHotKeyRequest.API_NAME, taoLiveHotKeyRequest.VERSION, b0hVar);
    }
}
