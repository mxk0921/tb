package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xt3 implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "clickContent";

    /* renamed from: a  reason: collision with root package name */
    public final a f31591a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(912261861);
        t2o.a(912261826);
    }

    public xt3(Context context, ze7 ze7Var, a aVar) {
        this.f31591a = aVar;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject jSONObject;
        String string;
        String str = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        try {
            jSONObject = (JSONObject) ((Object[]) runtimeAbilityParamArr[0].getValue())[0];
            string = jSONObject.getString("contentId");
        } catch (Exception unused) {
            str = str;
        }
        try {
            str = jSONObject.getString("title");
            ((TTDetailPageManager.d) this.f31591a).a(string, str);
        } catch (Exception unused2) {
            str = string;
            ((TTDetailPageManager.d) this.f31591a).a(str, str);
            return true;
        }
        return true;
    }
}
