package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hd3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f20557a = "cartRefreshData";
    public static final String b = "cartInstanceId";
    public static final String c = "itemCountChanged";
    public static final String d = "itemCount";
    public static final String e = "cartBroadcastFrom";
    public static final String f = "fromCheck";
    public static final String g = "modalBuyCreateOrder";
    public static final String h = "updateBeforeRequest";
    public static final String i = "updateAfterResponse";

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6434b3", new Object[]{context});
        } else if (context != null) {
            String str = f20557a;
            hav.g(c9x.CART_BIZ_NAME, "CartRefreshUtils#sendCartRefreshBroadCast,action=", str);
            Intent intent = new Intent(str);
            intent.putExtra(b, context.hashCode());
            intent.putExtra(c, false);
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        }
    }

    public static void b(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3a4e9", new Object[]{context, bundle});
        } else if (context != null) {
            String str = f20557a;
            hav.g(c9x.CART_BIZ_NAME, "CartRefreshUtils#sendItemChangeBroadCast,action=", str);
            Intent intent = new Intent(str);
            intent.putExtra(b, context.hashCode());
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        }
    }

    static {
        t2o.a(479199573);
    }
}
