package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveHomePageX;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.BaseDetailBusiness;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.insertCard.InsertCardQueryRequest;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.insertCard.InsertCardQueryResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dbf extends BaseDetailBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378519);
    }

    public dbf(IRemoteBaseListener iRemoteBaseListener) {
        super(iRemoteBaseListener);
    }

    public static /* synthetic */ Object ipc$super(dbf dbfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/business/insertCard/InsertCardBusiness");
    }

    public void j(b0h b0hVar, Context context, JSONObject jSONObject, JSONObject jSONObject2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f09475c", new Object[]{this, b0hVar, context, jSONObject, jSONObject2, new Integer(i)});
            return;
        }
        InsertCardQueryRequest insertCardQueryRequest = new InsertCardQueryRequest();
        insertCardQueryRequest.setChannelType("jingxuan");
        insertCardQueryRequest.setChannelId("0");
        insertCardQueryRequest.setS(i);
        insertCardQueryRequest.setAppVersion(TaoLiveHomePageX.getAppVersion(null));
        insertCardQueryRequest.setExtendParams(jSONObject.toJSONString());
        insertCardQueryRequest.setExtendCommonParams(jSONObject2.toJSONString());
        f(true);
        g(0, insertCardQueryRequest, InsertCardQueryResponse.class);
        mbu.c("requestStart", "firstRequest", insertCardQueryRequest.API_NAME, insertCardQueryRequest.VERSION, b0hVar);
    }
}
