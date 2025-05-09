package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.combo.dataobject.ComTaobaoMclFavAddCollectResponse;
import com.taobao.tao.combo.dataobject.ComTaobaoMclFavCheckcollectResponse;
import com.taobao.tao.combo.dataobject.ComTaobaoMclFavDelcollectResponseData;
import com.taobao.tao.request.BasicRequest;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b29 extends x32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(764412111);
    }

    public b29(Application application) {
        super(application);
    }

    public static /* synthetic */ Object ipc$super(b29 b29Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/request/FavCollectBusiness");
    }

    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d91da1b", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        BasicRequest basicRequest = new BasicRequest();
        basicRequest.setAPI_NAME("com.taobao.mcl.fav.delcollect");
        basicRequest.setNEED_ECODE(true);
        basicRequest.setNEED_SESSION(true);
        basicRequest.setORIGINALJSON(true);
        basicRequest.setVERSION("2.0");
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", Long.valueOf(j));
        hashMap.put("favType", 1);
        startRequest(Long.valueOf(j), i, basicRequest, ComTaobaoMclFavDelcollectResponseData.class, hashMap);
    }

    public void b(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9154ccc2", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        BasicRequest basicRequest = new BasicRequest();
        basicRequest.setAPI_NAME("com.taobao.mcl.fav.checkcollect");
        basicRequest.setNEED_ECODE(true);
        basicRequest.setNEED_SESSION(true);
        basicRequest.setORIGINALJSON(true);
        basicRequest.setVERSION("2.0");
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", Long.valueOf(j));
        hashMap.put("favType", 1);
        startRequest(Long.valueOf(j), i, basicRequest, ComTaobaoMclFavCheckcollectResponse.class, hashMap);
    }

    public void c(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ab3b5e", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        BasicRequest basicRequest = new BasicRequest();
        basicRequest.setAPI_NAME("com.taobao.mcl.fav.addCollect");
        basicRequest.setNEED_ECODE(true);
        basicRequest.setNEED_SESSION(true);
        basicRequest.setORIGINALJSON(true);
        basicRequest.setVERSION("2.0");
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", Long.valueOf(j));
        hashMap.put("favType", 1);
        startRequest(Long.valueOf(j), i, basicRequest, ComTaobaoMclFavAddCollectResponse.class, hashMap);
    }
}
