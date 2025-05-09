package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pda extends uy<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031834);
    }

    public static String f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("739466d6", new Object[]{intent});
        }
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        String queryParameter = data.getQueryParameter(CoreConstants.IN_PARAM_PAY_ORDER_ID);
        if (!TextUtils.isEmpty(queryParameter)) {
            return queryParameter;
        }
        String queryParameter2 = data.getQueryParameter("bizOrderId");
        return TextUtils.isEmpty(queryParameter2) ? data.getQueryParameter("orderId") : queryParameter2;
    }

    public static String g(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1de174d6", new Object[]{intent});
        }
        String stringExtra = intent.getStringExtra(CoreConstants.IN_PARAM_ARCHIVE);
        return TextUtils.isEmpty(stringExtra) ? intent.getStringExtra(CoreConstants.IN_PARAM_IS_ARCHIVE_ORDER) : stringExtra;
    }

    public static String h(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9342c25", new Object[]{intent});
        }
        String stringExtra = intent.getStringExtra("bizOrderId");
        if (!TextUtils.isEmpty(stringExtra)) {
            return stringExtra;
        }
        String stringExtra2 = intent.getStringExtra(CoreConstants.IN_PARAM_PAY_ORDER_ID);
        return TextUtils.isEmpty(stringExtra2) ? intent.getStringExtra("orderId") : stringExtra2;
    }

    public static /* synthetic */ Object ipc$super(pda pdaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/nav/detail/GoToV2DetailTask");
    }

    /* renamed from: e  reason: collision with other method in class */
    public boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67bd026b", new Object[]{this, intent})).booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.content.Intent r6) {
        /*
            r5 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = tb.pda.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001c
            java.lang.String r2 = "82ca31ec"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r3[r0] = r6
            java.lang.Object r6 = r1.ipc$dispatch(r2, r3)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            java.lang.String r1 = h(r6)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = "bizOrderId"
            java.lang.String r2 = f(r6)
            r6.putExtra(r1, r2)
        L_0x002f:
            java.lang.String r1 = g(r6)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0042
            java.lang.String r1 = "archive"
            java.lang.String r2 = e(r6)
            r6.putExtra(r1, r2)
        L_0x0042:
            boolean r1 = tb.dbl.m()
            if (r1 == 0) goto L_0x0067
            android.net.Uri r1 = r6.getData()
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = r1.getEncodedQuery()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0067
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "http://h5.m.taobao.com/awp/base/order/detailultron.htm?"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x0069
        L_0x0067:
            java.lang.String r1 = "http://h5.m.taobao.com/awp/base/order/detailultron.htm"
        L_0x0069:
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri r2 = tb.yfg.a(r1)
            r6.setData(r2)
            if (r1 == 0) goto L_0x007b
            java.lang.String r6 = r1.toString()
            goto L_0x007d
        L_0x007b:
            java.lang.String r6 = ""
        L_0x007d:
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.String r1 = "OrderNAV"
            java.lang.String r2 = "GoToV2Detail"
            tb.lor.c(r1, r2, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pda.a(android.content.Intent):boolean");
    }

    public static String e(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("911dc747", new Object[]{intent});
        }
        if (intent.getData() == null) {
            return null;
        }
        String queryParameter = intent.getData().getQueryParameter(CoreConstants.IN_PARAM_ARCHIVE);
        return TextUtils.isEmpty(queryParameter) ? intent.getData().getQueryParameter(CoreConstants.IN_PARAM_IS_ARCHIVE_ORDER) : queryParameter;
    }
}
