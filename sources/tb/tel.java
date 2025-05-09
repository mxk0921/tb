package tb;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tel extends s5l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465759);
    }

    public static /* synthetic */ Object ipc$super(tel telVar, String str, Object... objArr) {
        if (str.hashCode() == 342763541) {
            super.I((b8v) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/OrderOpenUrlV2Subscriber");
    }

    @Override // tb.s5l, tb.n6v
    public void I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        kor.a("TBOpenUrlV2Subscriber", "onHandleEventChain", "----");
        String string = E(b8vVar).getString("url");
        if (TextUtils.isEmpty(string) || !string.toLowerCase().startsWith("tel:")) {
            super.I(b8vVar);
            return;
        }
        kor.a("TBOpenUrlV2Subscriber", "onHandleEventChain", "截断 openUrl 并唤醒拨打电话逻辑 tel:".concat(string));
        J(b8vVar.e(), string);
    }

    public void J(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c16ecfb", new Object[]{this, context, str});
        } else if (!TextUtils.isEmpty(str) && context != null) {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse(str));
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                z4v.a(context, Localization.q(R.string.order_biz_not_support_call));
                kor.a("TBOpenUrlV2Subscriber", "callPhone", Localization.q(R.string.order_biz_not_support_call));
            }
        }
    }
}
