package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xip extends k30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ajp f31413a;

    static {
        t2o.a(491782667);
    }

    public xip(ajp ajpVar) {
        this.f31413a = ajpVar;
    }

    public static /* synthetic */ Object ipc$super(xip xipVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/sharedataservice/impl/jsnativefeature/feature/ShareDataGetPassParams");
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
        }
        return "HSharedData.getPassParams";
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void b(JSONObject jSONObject, IJsBridgeService.a.AbstractC0565a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f743e3", new Object[]{this, jSONObject, aVar});
        } else if (jSONObject == null) {
            aVar.error("jsParams is empty");
            fve.e("ShareDataGetPassParams", "jsParams is empty");
        } else {
            JSONObject h = this.f31413a.h();
            HashMap hashMap = new HashMap(1);
            hashMap.put("data", h);
            aVar.a(hashMap);
        }
    }
}
