package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vug extends uy<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031843);
    }

    public static /* synthetic */ Object ipc$super(vug vugVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/nav/list/ListV2ToV1ToH5Task");
    }

    /* renamed from: e */
    public boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67bd026b", new Object[]{this, intent})).booleanValue();
        }
        return "TBOrderListActivity".equals(krl.a(intent));
    }

    /* renamed from: f */
    public boolean a(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82ca31ec", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        String A = dbl.A();
        if (TextUtils.isEmpty(A)) {
            return false;
        }
        String h = jql.h(intent);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tabCode", (Object) h);
        Uri parse = Uri.parse(c2u.b(A, jSONObject));
        intent.setData(parse);
        if (parse != null) {
            str = parse.toString();
        } else {
            str = "";
        }
        lor.c(CoreConstants.NAV_TAG, "ListV2ToV1ToH5Task", str);
        return true;
    }
}
