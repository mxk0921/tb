package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.network.PreholdingPhoneNumberResult;
import com.taobao.android.detail.alicom.model.network.QueryContractPhoneNumberResult;
import com.taobao.android.detail.alicom.mtop.RemoteBusinessListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(703594522);
    }

    public static RemoteBusiness a(String str, String str2, String str3, String str4, String str5, String str6, String str7, RemoteBusinessListener remoteBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("d8b38c3", new Object[]{str, str2, str3, str4, str5, str6, str7, remoteBusinessListener});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.com.alicom.wtt.trade.WttItemDetail.preUseNum2");
        mtopRequest.setVersion("1.0");
        HashMap hashMap = new HashMap();
        hashMap.put("phoneNum", str);
        hashMap.put("cityId", str2);
        hashMap.put("provId", str3);
        hashMap.put(q2q.KEY_SKU_ID, str4);
        hashMap.put("planId", str5);
        hashMap.put("itemId", str6);
        hashMap.put("versionCode", str7);
        mtopRequest.setData(JSON.toJSONString(hashMap));
        RemoteBusiness registeListener = RemoteBusiness.build(mtopRequest).registeListener((IRemoteListener) remoteBusinessListener);
        registeListener.setUnitStrategy("UNIT_TRADE");
        registeListener.startRequest(PreholdingPhoneNumberResult.class);
        return registeListener;
    }

    public static RemoteBusiness b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, RemoteBusinessListener remoteBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("91922c73", new Object[]{str, str2, str3, str4, str5, str6, str7, str8, remoteBusinessListener});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.com.alicom.wtt.trade.WttItemDetail.selectNum2");
        mtopRequest.setVersion("1.0");
        HashMap hashMap = new HashMap();
        hashMap.put("phoneNum", str);
        hashMap.put("cityId", str2);
        hashMap.put("provId", str3);
        hashMap.put(q2q.KEY_SKU_ID, str4);
        hashMap.put("planId", str5);
        hashMap.put("itemId", str6);
        hashMap.put("maxCount", str7);
        hashMap.put("network", str8);
        mtopRequest.setData(JSON.toJSONString(hashMap));
        RemoteBusiness registeListener = RemoteBusiness.build(mtopRequest).registeListener((IRemoteListener) remoteBusinessListener);
        registeListener.setUnitStrategy("UNIT_TRADE");
        registeListener.startRequest(QueryContractPhoneNumberResult.class);
        return registeListener;
    }
}
