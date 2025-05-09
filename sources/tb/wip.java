package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.vivid.presenter.PreRequestPresenter;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wip extends k30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ajp f30723a;

    static {
        t2o.a(491782666);
    }

    public wip(ajp ajpVar) {
        this.f30723a = ajpVar;
    }

    public static /* synthetic */ Object ipc$super(wip wipVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/sharedataservice/impl/jsnativefeature/feature/ShareDataFindSmartContentInfoFeature");
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
        }
        return "HSharedData.findSmartContentInfo";
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void b(JSONObject jSONObject, IJsBridgeService.a.AbstractC0565a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f743e3", new Object[]{this, jSONObject, aVar});
        } else if (!xti.d()) {
            fve.e("ShareDataFindSmartContentInfoFeature", "非新架构，功能不可用");
            aVar.error("-1");
        } else if (jSONObject == null) {
            fve.e("ShareDataFindSmartContentInfoFeature", "jsParams is empty");
            aVar.error("-4");
        } else {
            String string = jSONObject.getString("sectionBizCode");
            if (TextUtils.isEmpty(string)) {
                fve.e("ShareDataFindSmartContentInfoFeature", "sectionBizCode is empty");
                aVar.error("-4");
                return;
            }
            String string2 = jSONObject.getString("domain");
            if (TextUtils.isEmpty(string2)) {
                fve.e("ShareDataFindSmartContentInfoFeature", "domain is empty");
                aVar.error("-4");
                return;
            }
            String string3 = jSONObject.getString("id");
            if (TextUtils.isEmpty(string3)) {
                fve.e("ShareDataFindSmartContentInfoFeature", "id is empty");
                aVar.error("-4");
            } else if (this.f30723a.g(string) == null) {
                fve.e("ShareDataFindSmartContentInfoFeature", "shareData为查找到卡片");
                aVar.error(PreRequestPresenter.SOURCE_RATE_HISTORY);
            } else {
                JSONObject e = this.f30723a.e(string, string2, string3);
                if (e != null) {
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("data", e);
                    aVar.a(hashMap);
                    return;
                }
                fve.e("ShareDataFindSmartContentInfoFeature", "shareData为查找到卡片");
                aVar.error("-3");
            }
        }
    }
}
