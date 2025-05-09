package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.HashMap;
import tb.rdc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nfe extends k30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dge f24702a;

    static {
        t2o.a(491782365);
    }

    public nfe(dge dgeVar) {
        this.f24702a = dgeVar;
    }

    public static /* synthetic */ Object ipc$super(nfe nfeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/iconbackanimeservice/impl/IconFinderJsFeature");
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
        }
        return "miniApp.canPlayBackAnimation";
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void b(JSONObject jSONObject, IJsBridgeService.a.AbstractC0565a aVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f743e3", new Object[]{this, jSONObject, aVar});
        } else if (jSONObject == null) {
            aVar.error("1001");
            fve.e("IconFinderJsFeature", "jsParams is empty");
        } else if (!this.f24702a.h()) {
            aVar.error("1002");
            fve.e("IconFinderJsFeature", "page is not init");
        } else {
            try {
                rdc.a m = rdc.a.m(jSONObject);
                if (m != null) {
                    if (!this.f24702a.g(m) && this.f24702a.e(m) == null) {
                        z = false;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", (Object) Boolean.valueOf(z));
                    HashMap hashMap = new HashMap();
                    hashMap.put("data", jSONObject2);
                    aVar.a(hashMap);
                    fve.e("IconFinderJsFeature", "canAnime:" + z);
                    return;
                }
                aVar.error("1001");
                fve.e("IconFinderJsFeature", "jsParams is empty");
            } catch (Throwable th) {
                aVar.error("executeFeature error" + th.toString());
                fve.c("IconFinderJsFeature", "executeFeature error", th);
            }
        }
    }
}
