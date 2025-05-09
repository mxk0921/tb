package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.OrderListFragment;
import com.taobao.android.order.bundle.constants.CoreConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qda extends uy<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031840);
    }

    public static /* synthetic */ Object ipc$super(qda qdaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/nav/list/GoToV2ListTask");
    }

    /* renamed from: e */
    public boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67bd026b", new Object[]{this, intent})).booleanValue();
        }
        return true;
    }

    /* renamed from: f */
    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82ca31ec", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        String str = "http://h5.m.taobao.com/awp/base/order/listultron.htm";
        if (data != null) {
            String encodedQuery = data.getEncodedQuery();
            if (!TextUtils.isEmpty(encodedQuery)) {
                str = "http://h5.m.taobao.com/awp/base/order/listultron.htm?" + encodedQuery;
            }
            try {
                if ("true".equalsIgnoreCase(data.getQueryParameter("isOLFragmentPop"))) {
                    intent.putExtra(qxq.KEY_FRAGMENT_NAME, OrderListFragment.class.getName());
                }
            } catch (UnsupportedOperationException unused) {
            }
        }
        Uri parse = Uri.parse(str);
        intent.setData(yfg.a(parse));
        if (parse.getQueryParameter("jumpParams") != null) {
            intent.setFlags(65536);
        }
        lor.c(CoreConstants.NAV_TAG, "GoToV2ListTask", parse.toString());
        return true;
    }
}
