package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.TemplateCardListOwner;
import com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.TemplateListRequest;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.TemplateObject;
import com.taobao.live.home.dinamic.business.TemplateRequest;
import com.taobao.tao.Globals;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e5h extends TemplateCardListOwner {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String c;

    static {
        t2o.a(310378618);
    }

    public e5h(String str) {
        this.c = str;
    }

    public static /* synthetic */ Object ipc$super(e5h e5hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dxengine/LiveTemplateListController");
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.TemplateCardListOwner
    public TemplateRequest h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateRequest) ipChange.ipc$dispatch("81bfb25", new Object[]{this});
        }
        return new TemplateListRequest(this.c);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.TemplateCardListOwner
    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9b3f9b9", new Object[]{this});
        }
        return nwg.a(Globals.getApplication(), d9m.H().getBailoutTemplate());
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.TemplateCardListOwner
    public List<TemplateObject> t(String str) {
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
