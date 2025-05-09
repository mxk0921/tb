package tb;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x93 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQUEST_ADD_ADDRESS = 50101;
    public static final int REQUEST_CHANGE_ADDRESS = 50102;

    static {
        t2o.a(478150774);
    }

    public static /* synthetic */ Object ipc$super(x93 x93Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/CartAddressClickSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        JSONObject fields;
        Fragment R;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        fdv.d(lcuVar);
        IDMComponent iDMComponent = this.e;
        if (iDMComponent != null && (fields = iDMComponent.getFields()) != null && (R = this.j.R()) != null) {
            if (fields.getBoolean("noAddress").booleanValue()) {
                Nav.from(this.b).withFragment(R).forResult(50101).toUri("http://my.m.taobao.com/deliver/add_address.htm");
                return;
            }
            JSONObject c = c();
            if (c == null) {
                lbq.b(c9x.CART_BIZ_NAME, "CartAddress", "CART_ADDRESS_01", "eventFields为空");
                return;
            }
            String string = c.getString("url");
            if (TextUtils.isEmpty(string)) {
                lbq.b(c9x.CART_BIZ_NAME, "CartAddress", "CART_ADDRESS_02", "url为空");
                return;
            }
            String b = sca.b(this.k);
            if (TextUtils.isEmpty(b)) {
                b = c.getString("data");
            }
            if (TextUtils.isEmpty(b)) {
                lbq.b(c9x.CART_BIZ_NAME, "CartAddress", "CART_ADDRESS_03", "data为空");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(sf0.K_COMMON_ADDRESS_URL, string);
            bundle.putString("data", b);
            Nav.from(this.b).withFragment(R).withExtras(bundle).forResult(50102).toUri("https://my.m.taobao.com/deliver/transparent_address.htm");
        }
    }
}
