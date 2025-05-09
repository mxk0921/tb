package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.datamanager.model.RecModel;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lzk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093067);
    }

    public static Map<String, Object> a(RecModel recModel, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e86dceaa", new Object[]{recModel, ux9Var});
        }
        HashMap hashMap = new HashMap();
        if (recModel == null) {
            return hashMap;
        }
        hashMap.put("liveId", recModel.liveId);
        hashMap.put("accountId", recModel.accountId);
        hashMap.put("trackInfo", recModel.trackInfo);
        hashMap.put("liveUrlList", recModel.liveUrlList);
        hashMap.put("mediaConfig", recModel.mediaConfig);
        LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo = recModel.alimama;
        if (alimamaInfo != null) {
            hashMap.put("alimama", fkx.i(alimamaInfo));
        }
        hashMap.put(yj4.PARAM_SJSD_ITEM_ID, recModel.sjsdItemId);
        hashMap.put(yj4.PARAM_PRODUCT_TYPE, recModel.productType);
        if (!TextUtils.isEmpty(recModel.initParams.get("timeMoveId")) && up6.q0(ux9Var)) {
            hashMap.put(yj4.PARAM_PRODUCT_TYPE, com.taobao.live.timemove.base.data.RecModel.MEDIA_TYPE_TIMEMOVE);
        }
        Map<String, String> map = recModel.initParams;
        if (map != null) {
            hashMap.putAll(map);
            if (recModel.initParams.get(yj4.PARAM_GOODS_HOLD_TAG) != null && TextUtils.equals("true", recModel.initParams.get(yj4.PARAM_GOODS_HOLD_TAG))) {
                hashMap.remove(yj4.PARAM_ITEM_IDS);
                hashMap.remove(yj4.PARAM_ITEM_HOLD_TYPE);
            }
        }
        return hashMap;
    }

    public static String b(n2g<Object> n2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cacc3a93", new Object[]{n2gVar});
        }
        if (n2gVar.a() == null || !(n2gVar.a() instanceof kzk)) {
            return null;
        }
        Object obj = ((kzk) n2gVar.a()).a().b().get("paramsLifecycleType");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static Map<String, Object> c(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eaf689e7", new Object[]{ux9Var});
        }
        HashMap hashMap = new HashMap();
        if (!(ux9Var == null || ux9Var.g() == null)) {
            hashMap.put("entryLiveSource", ux9Var.g().c());
            hashMap.put("entryLiveItemId", ux9Var.g().Y0());
            hashMap.put("entrySpm", ux9Var.g().n0());
            hashMap.put("liveToken", ux9Var.p());
        }
        hashMap.put("needSendPowerMsg", String.valueOf(pvs.j0()));
        return hashMap;
    }
}
