package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.dinamic.TemplateListRequest;
import com.taobao.live.home.dinamic.business.TemplateCardListOwner;
import com.taobao.live.home.dinamic.business.TemplateRequest;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.tao.Globals;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d5h extends TemplateCardListOwner {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355360);
    }

    public static /* synthetic */ Object ipc$super(d5h d5hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/LiveTemplateListController");
    }

    @Override // com.taobao.live.home.dinamic.business.TemplateCardListOwner
    public TemplateRequest h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateRequest) ipChange.ipc$dispatch("81bfb25", new Object[]{this});
        }
        return new TemplateListRequest();
    }

    @Override // com.taobao.live.home.dinamic.business.TemplateCardListOwner
    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9b3f9b9", new Object[]{this});
        }
        return nwg.a(Globals.getApplication(), d9m.H().getBailoutTemplate());
    }

    @Override // com.taobao.live.home.dinamic.business.TemplateCardListOwner
    public List<TemplateObject> u(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e469afeb", new Object[]{this, str});
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
            return null;
        }
        try {
            return JSON.parseArray(jSONObject.getString("result"), TemplateObject.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
