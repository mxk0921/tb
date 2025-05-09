package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zml implements c6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final nfc f32870a;

    static {
        t2o.a(491782786);
        t2o.a(488636516);
    }

    public zml(nfc nfcVar) {
        this.f32870a = nfcVar;
    }

    @Override // tb.c6d
    public JSONObject getCurrentPageParams() {
        Map<String, String> currentPageParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58f7263f", new Object[]{this});
        }
        b6d pageInfo = this.f32870a.getPageInfo();
        if (pageInfo == null || (currentPageParams = pageInfo.getCurrentPageParams()) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(currentPageParams);
        return jSONObject;
    }

    @Override // tb.c6d
    public JSONObject getCurrentUTParams() {
        String currentUTParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83ce92ef", new Object[]{this});
        }
        b6d pageInfo = this.f32870a.getPageInfo();
        if (pageInfo == null || (currentUTParams = pageInfo.getCurrentUTParams()) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", (Object) currentUTParams);
        return jSONObject;
    }

    @Override // tb.c6d
    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        b6d pageInfo = this.f32870a.getPageInfo();
        if (pageInfo == null) {
            return null;
        }
        return pageInfo.getExt();
    }
}
