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
public class hzv extends uy<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031836);
    }

    public static /* synthetic */ Object ipc$super(hzv hzvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/nav/detail/V2ToV1ToH5Task");
    }

    /* renamed from: e */
    public boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67bd026b", new Object[]{this, intent})).booleanValue();
        }
        return "TBOrderDetailActivity".equals(krl.a(intent));
    }

    /* renamed from: f */
    public boolean a(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82ca31ec", new Object[]{this, intent})).booleanValue();
        }
        if (intent != null) {
            String c = krl.c(intent);
            String b = krl.b(intent);
            String y = dbl.y();
            boolean isEmpty = TextUtils.isEmpty(c);
            boolean isEmpty2 = TextUtils.isEmpty(y);
            if (isEmpty || isEmpty2) {
                return false;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bizOrderId", (Object) c);
            jSONObject.put(CoreConstants.IN_PARAM_ARCHIVE, (Object) b);
            Uri parse = Uri.parse(c2u.b(y, jSONObject));
            intent.setData(parse);
            if (parse != null) {
                str = parse.toString();
            } else {
                str = "";
            }
            lor.c(CoreConstants.NAV_TAG, "ODV2ToV1ToH5Task", str);
        }
        return true;
    }
}
