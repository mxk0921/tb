package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.aspect.error.downgrade")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class e8r extends fv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEGRADE_OLD_CONTAINER = "Buy2DowngradeOldProtocol";
    public final AtomicBoolean d = new AtomicBoolean(false);

    static {
        t2o.a(708837489);
    }

    public static /* synthetic */ Object ipc$super(e8r e8rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/aspect/TBBuyErrorDowngradeExtension");
    }

    @Override // tb.fv
    public void J0(boolean z, JSONObject jSONObject, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5582d87e", new Object[]{this, new Boolean(z), jSONObject, str, str2, str3});
        } else if (!this.d.get()) {
            L0(z, jSONObject, str, str2, str3);
        }
    }

    public final void L0(boolean z, JSONObject jSONObject, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3558fb81", new Object[]{this, new Boolean(z), jSONObject, str, str2, str3});
            return;
        }
        Context f = L().f();
        if (!(f instanceof Activity)) {
            x().b(new mi(1, "DomainTaobaoGeneralPurchase", "downgrade-failed-none-activity", "context is null"));
            return;
        }
        this.d.set(true);
        Intent h = hh.h(f);
        if (h == null) {
            q8r.a("EMPTY_INTENT_FORM_(executeDowngrade)", "intent is empty");
            return;
        }
        M0(h);
        xt7.b((Activity) f, str2);
    }

    public final void M0(Intent intent) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39ade0c", new Object[]{this, intent});
            return;
        }
        try {
            Map map = (Map) intent.getSerializableExtra("buildOrderParams");
            if (map != null) {
                String str = (String) map.get("exParams");
                if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null && parseObject.containsKey("umfVersions")) {
                    parseObject.remove("umfVersions");
                    map.put("exParams", parseObject.toJSONString());
                }
            }
        } catch (Throwable th) {
            ck.g().b("TBBuyErrorDowngradeExtension", "rmUmfVersionParam", th.toString());
        }
    }
}
