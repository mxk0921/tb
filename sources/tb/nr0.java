package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.AliXSkuCore;
import com.taobao.android.sku.data.AliXSkuDataContext;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nr0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<mr0> f24897a = new ArrayList();
    public final AliXSkuDataContext b = new AliXSkuDataContext();

    static {
        t2o.a(442499166);
    }

    public nr0(AliXSkuCore aliXSkuCore, Context context, a aVar) {
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b48f2aa", new Object[]{this})).booleanValue();
        }
        return this.b.isTradeCartOrBuyEnable("buyEnable");
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b6aa798", new Object[]{this})).booleanValue();
        }
        return this.b.isTradeCartOrBuyEnable("cartEnable");
    }

    public void D(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cfe67f5", new Object[]{this, str, jSONObject});
        } else {
            this.b.saveGlobalData(str, jSONObject);
        }
    }

    public void E(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a1cf8e", new Object[]{this, jSONObject});
            return;
        }
        this.b.cleanBizData();
        this.b.setBizData(jSONObject);
    }

    public void F(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1997e", new Object[]{this, jSONObject});
        } else {
            this.b.setExtInput(jSONObject);
        }
    }

    public void G(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2733c3a", new Object[]{this, jSONObject});
            return;
        }
        this.b.cleanOperationData();
        this.b.setOperationData(jSONObject);
    }

    public void H(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37798f30", new Object[]{this, jSONObject});
        } else {
            this.b.setStaticExtInput(jSONObject);
        }
    }

    public void I(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5426b8ba", new Object[]{this, jSONObject});
            return;
        }
        this.b.cleanStoredData();
        this.b.setStoredData(jSONObject);
    }

    public void J(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02da145", new Object[]{this, jSONObject});
            return;
        }
        this.b.cleanStoredData();
        this.b.cleanOperationData();
        this.b.cleanBizData();
        this.b.initOriginalData(jSONObject);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b307ee0a", new Object[]{this});
        } else {
            this.b.cleanTimeExtInput();
        }
    }

    public JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24c2ff41", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            this.b.cleanOperationData();
            this.b.setOperationData(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        List<mr0> list = this.f24897a;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) this.f24897a).iterator();
            while (it.hasNext()) {
                Map<String, kfb> a2 = ((mr0) it.next()).a();
                if (a2 != null) {
                    for (Map.Entry<String, kfb> entry : a2.entrySet()) {
                        if (!TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                            jSONObject2.put(entry.getKey(), entry.getValue().a(this.b.getOriginalData(), this.b.getStoredData(), this.b.getOperationData()));
                        }
                    }
                }
            }
            this.b.cleanOperationData();
            this.b.cleanBizData();
            this.b.setBizData(jSONObject2);
        }
        return jSONObject2;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f2bc674e", new Object[]{this});
        }
        return this.b.getBizData();
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c473df4", new Object[]{this});
        }
        return this.b.getDegradeSkuH5Url();
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b53477c6", new Object[]{this});
        }
        return this.b.getExtInput();
    }

    public JSONObject f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("92cf54", new Object[]{this, str});
        }
        return this.b.getGlobalData(str);
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abc85acd", new Object[]{this});
        }
        return this.b.getH5Url();
    }

    public String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a65c6d03", new Object[]{this, str});
        }
        return this.b.getH5Url(str);
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.b.getItemId();
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b0c8cde", new Object[]{this});
        }
        return this.b.getJavaScriptMd5();
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("408a7d8d", new Object[]{this});
        }
        return this.b.getJavaScriptUrl();
    }

    public JSONObject l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8bec4586", new Object[]{this});
        }
        return this.b.getJsH5SkuInfo();
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbc8547d", new Object[]{this})).booleanValue();
        }
        return this.b.getNewbuyShowSkuFeature();
    }

    public JSONObject n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2b45ceb8", new Object[]{this});
        }
        return this.b.getOriginalData();
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c6289", new Object[]{this});
        }
        return this.b.getSellerId();
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75e0a577", new Object[]{this})).booleanValue();
        }
        return this.b.getShowSkuFeature();
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("157c86cc", new Object[]{this});
        }
        return this.b.getSkuParams();
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1846d6af", new Object[]{this})).booleanValue();
        }
        return this.b.getSkuSilentActionFeature();
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b7c26ef", new Object[]{this});
        }
        return this.b.getSkuV3WeexUrl();
    }

    public JSONObject t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("57c7140a", new Object[]{this});
        }
        return this.b.getStoredData();
    }

    public JSONObject u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a2383433", new Object[]{this});
        }
        return this.b.getTimeExtInput();
    }

    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1f685df", new Object[]{this});
        }
        return this.b.getUltronTemplateMd5();
    }

    public String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7774768e", new Object[]{this});
        }
        return this.b.getUltronTemplateUrl();
    }

    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b36c81", new Object[]{this});
        }
        return this.b.getWeexUrl();
    }

    public void y(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f242af", new Object[]{this, jSONObject});
        } else {
            this.b.initOriginalData(jSONObject);
        }
    }

    public void z(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b553f89", new Object[]{this, str, str2, str3, str4});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("AliXSkuDataEngine.initData");
        }
        this.b.initOriginalData(str, str2, str3, str4);
    }

    public static boolean C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("896e2418", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(Uri.parse(str).getQueryParameter("enable_sukopt"));
        } catch (Throwable th) {
            SkuLogUtils.j("isLazyInitSku2()", th.toString());
            return false;
        }
    }
}
