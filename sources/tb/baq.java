package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class baq extends uy<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031835);
    }

    public static /* synthetic */ Object ipc$super(baq baqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/nav/detail/SourceConvertToFromTask");
    }

    /* renamed from: f */
    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82ca31ec", new Object[]{this, intent})).booleanValue();
        }
        return true;
    }

    /* renamed from: e */
    public boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67bd026b", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter("source");
            if (!TextUtils.isEmpty(queryParameter) && "1".equals(queryParameter)) {
                intent.putExtra("from", "OrderListActivity");
                String queryParameter2 = data.getQueryParameter("pageFrom");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    intent.putExtra("pageFrom", queryParameter2);
                }
                intent.putExtra(CoreConstants.USE_V2, Boolean.valueOf(data.getQueryParameter(CoreConstants.IN_PARAM_SERVER_V2)));
            }
        }
        return false;
    }
}
