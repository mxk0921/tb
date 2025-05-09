package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.remote.MediaContentDetailRequest;
import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.login4android.session.constants.SessionConstants;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tg7 implements njd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f28704a;
    public final JSONObject b;
    public final MediaContentDetailRequest c;
    public String d;
    public Map e;

    static {
        t2o.a(468714227);
        t2o.a(468714247);
    }

    public tg7(pep pepVar) {
        JSONObject jSONObject = new JSONObject();
        this.f28704a = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        this.b = jSONObject2;
        jSONObject.put("data", (Object) jSONObject2);
        if (!(pepVar == null || pepVar.a() == null)) {
            jSONObject2.putAll(pepVar.a());
        }
        this.c = new MediaContentDetailRequest();
    }

    public tg7 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg7) ipChange.ipc$dispatch("d8465995", new Object[]{this});
        }
        this.f28704a.put("api", (Object) this.c.getApi());
        this.f28704a.put("v", (Object) this.c.getVersion());
        this.f28704a.put(SessionConstants.ECODE, (Object) Integer.valueOf(this.c.isNeedEcode() ? 1 : 0));
        this.f28704a.put(MspGlobalDefine.SESSION, (Object) Integer.valueOf(this.c.isNeedSession() ? 1 : 0));
        return this;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8392bcfb", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.njd
    public JSONObject build() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d1d5fb15", new Object[]{this});
        }
        return this.f28704a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71a2b708", new Object[]{this});
        }
        return this.c.detailParameters;
    }

    public Map d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this});
        }
        return this.e;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e2f771f", new Object[]{this});
        }
        return this.c.extendParameters;
    }

    public tg7 f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg7) ipChange.ipc$dispatch("7693a3cf", new Object[]{this, str});
        }
        if (str != null && ws6.f()) {
            ir9.b("RequestParam", "setBizTopic - bizTopic= ".concat(str));
            JSONObject jSONObject = this.f28704a.getJSONObject("options");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                this.f28704a.put("options", (Object) jSONObject);
            }
            jSONObject.put(MtopModule.KEY_MTOP_BIZ_TOPIC, (Object) str);
            jSONObject.put("bizId", (Object) "TBVideoSDK");
        }
        return this;
    }

    public tg7 g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg7) ipChange.ipc$dispatch("6cc447b", new Object[]{this, str});
        }
        this.c.contentId = str;
        this.d = str;
        this.b.put("contentId", (Object) str);
        return this;
    }

    @Override // tb.njd
    public IMTOPRequest getMtopRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMTOPRequest) ipChange.ipc$dispatch("8167cd7e", new Object[]{this});
        }
        return this.c;
    }

    public tg7 h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg7) ipChange.ipc$dispatch("2c329b30", new Object[]{this, str});
        }
        this.c.detailParameters = str;
        this.b.put("detailParameters", (Object) str);
        return this;
    }

    public tg7 i(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg7) ipChange.ipc$dispatch("3ba5dd45", new Object[]{this, map});
        }
        this.e = map;
        return this;
    }

    public tg7 j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg7) ipChange.ipc$dispatch("b2d1e807", new Object[]{this, str});
        }
        this.c.extendParameters = str;
        this.b.put("extendParameters", (Object) str);
        return this;
    }

    public tg7 k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg7) ipChange.ipc$dispatch("99919e6", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.f28704a.put("type", (Object) str);
        }
        return this;
    }

    public tg7 l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg7) ipChange.ipc$dispatch("1911adb0", new Object[]{this, str});
        }
        this.c.source = str;
        this.b.put("source", (Object) str);
        return this;
    }
}
