package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.base.parallelbiz.a;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.constants.TabType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jql {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IN_PARAM_ORDER_LIST_TYPE = "OrderListType";
    public static final String IN_PARAM_TAB_CODE = "tabCode";
    public static final String ORDER_ID = "orderId";
    public static final String QUERY_SOURCE = "querySource";
    public static final String QUERY_WORD = "queryWord";
    public static final String SEARCH_KEY = "searchKey";
    public static final String SEARCH_TEXT = "searchText";
    public static final String WORD_TERM = "wordTerm";
    public static final String WORD_TYPE = "wordType";

    static {
        t2o.a(713031799);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f77d5e8c", new Object[]{str});
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isLowerCase(charAt)) {
                stringBuffer.append(Character.toUpperCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static String b(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b089e669", new Object[]{list});
        }
        String str = "";
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (String str2 : list) {
                size--;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (size > 0) {
                    str2 = str2 + ";";
                }
                sb.append(str2);
                str = sb.toString();
            }
        }
        lor.c("ParamsHelper", "generateOrderIds", "orderIds = " + str);
        return str;
    }

    public static String c(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4d48551", new Object[]{intent});
        }
        if (intent == null || (data = intent.getData()) == null) {
            return null;
        }
        for (String str : data.getQueryParameterNames()) {
            if (str != null && str.startsWith("debug_autotest")) {
                return data.getQueryParameter(str);
            }
        }
        return null;
    }

    public static Map d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dc086f9", new Object[]{intent});
        }
        if (intent == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            String stringExtra = intent.getStringExtra("from");
            String stringExtra2 = intent.getStringExtra("pageFrom");
            if (stringExtra != null) {
                hashMap.put("from", stringExtra);
            }
            if (stringExtra2 != null) {
                hashMap.put("pageFrom", stringExtra2);
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static String e(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("880171bc", new Object[]{intent});
        }
        if (intent == null) {
            return "";
        }
        return intent.getStringExtra("from");
    }

    public static String f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4d22f9a", new Object[]{intent});
        }
        String str = "";
        if (intent == null) {
            return str;
        }
        try {
            str = intent.getStringExtra(CoreConstants.IN_PARAM_ARCHIVE);
            if (TextUtils.isEmpty(str)) {
                str = intent.getStringExtra(CoreConstants.IN_PARAM_IS_ARCHIVE_ORDER);
            }
        } catch (Exception e) {
            lor.c("ParamsHelper", "getIsArchive", "get mArchive  error= " + e.toString());
        }
        if (intent.getData() != null && TextUtils.isEmpty(str)) {
            str = intent.getData().getQueryParameter(CoreConstants.IN_PARAM_ARCHIVE);
            if (TextUtils.isEmpty(str)) {
                str = intent.getData().getQueryParameter(CoreConstants.IN_PARAM_IS_ARCHIVE_ORDER);
            }
        }
        lor.c("ParamsHelper", "getIsArchive", "mArchive = " + str);
        return str;
    }

    public static String g(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77dcc7e9", new Object[]{intent});
        }
        String str = "";
        if (intent == null) {
            return str;
        }
        try {
            str = intent.getStringExtra("bizOrderId");
            if (TextUtils.isEmpty(str)) {
                str = intent.getStringExtra(CoreConstants.IN_PARAM_PAY_ORDER_ID);
                if (TextUtils.isEmpty(str)) {
                    str = intent.getStringExtra("orderId");
                    if (TextUtils.isEmpty(str)) {
                        str = intent.getStringExtra(CoreConstants.IN_PARAM_ORDERID_1);
                    }
                }
            }
        } catch (Exception e) {
            lor.c("ParamsHelper", "getOrderId", "get orderId  error= " + e.toString());
        }
        Uri data = intent.getData();
        if (data != null && TextUtils.isEmpty(str)) {
            String queryParameter = data.getQueryParameter(CoreConstants.IN_PARAM_PAY_ORDER_ID);
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = data.getQueryParameter("bizOrderId");
            }
            str = TextUtils.isEmpty(queryParameter) ? data.getQueryParameter("orderId") : queryParameter;
            if (TextUtils.isEmpty(str)) {
                str = data.getQueryParameter(CoreConstants.IN_PARAM_ORDERID_1);
            }
        }
        lor.c("ParamsHelper", "getOrderId", "orderId =" + str);
        return str;
    }

    public static String h(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa2ca517", new Object[]{intent});
        }
        if (intent == null) {
            return TabType.ALL.getValue();
        }
        Bundle extras = intent.getExtras();
        String p = p(intent.getData());
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        String o = o(extras);
        if (!TextUtils.isEmpty(o)) {
            return o;
        }
        return TabType.ALL.getValue();
    }

    public static String i(CoreConstants.OrderListType orderListType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41596edc", new Object[]{orderListType});
        }
        if (orderListType == null) {
            return null;
        }
        if (orderListType == CoreConstants.OrderListType.WAIT_TO_PAY) {
            return TabType.WAIT_PAY.getValue();
        }
        if (orderListType == CoreConstants.OrderListType.WAIT_TO_SHIPMENTS) {
            return TabType.WAIT_SEND.getValue();
        }
        if (orderListType == CoreConstants.OrderListType.WAIT_TO_CONFIRM) {
            return TabType.WAIT_CONFIRM.getValue();
        }
        if (orderListType == CoreConstants.OrderListType.WAIT_TO_EVALUATE) {
            return TabType.WAIT_RATE.getValue();
        }
        if (CoreConstants.OrderListType.ALLSPAEK_SENDFINISHED_ORDERS == orderListType || CoreConstants.OrderListType.TOTAL_ORDERS == orderListType) {
            return TabType.ALL.getValue();
        }
        if (CoreConstants.OrderListType.REFUND == orderListType) {
            return TabType.REFUND.getValue();
        }
        return null;
    }

    public static String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca5dc801", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a2 = a(str.trim());
        if (CoreConstants.OrderListType.WAIT_TO_PAY.toString().equals(a2)) {
            return TabType.WAIT_PAY.getValue();
        }
        if (CoreConstants.OrderListType.WAIT_TO_SHIPMENTS.toString().equals(a2)) {
            return TabType.WAIT_SEND.getValue();
        }
        if (CoreConstants.OrderListType.WAIT_TO_CONFIRM.toString().equals(a2)) {
            return TabType.WAIT_CONFIRM.getValue();
        }
        if (CoreConstants.OrderListType.WAIT_TO_EVALUATE.toString().equals(a2)) {
            return TabType.WAIT_RATE.getValue();
        }
        if (CoreConstants.OrderListType.ALLSPAEK_SENDFINISHED_ORDERS.toString().equals(a2) || CoreConstants.OrderListType.TOTAL_ORDERS.toString().equals(a2)) {
            return TabType.ALL.getValue();
        }
        if (CoreConstants.OrderListType.REFUND.toString().equalsIgnoreCase(a2)) {
            return TabType.REFUND.getValue();
        }
        return null;
    }

    public static String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e26e7216", new Object[]{str});
        }
        TabType[] values = TabType.values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].getValue().equals(str)) {
                return values[i].getValue();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String l(android.content.Intent r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "ParamsHelper"
            com.android.alibaba.ip.runtime.IpChange r1 = tb.jql.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001a
            java.lang.String r0 = "e8bb8d95"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            java.lang.Object r5 = r1.ipc$dispatch(r0, r2)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x001a:
            java.lang.String r1 = ""
            if (r5 == 0) goto L_0x0082
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L_0x0025
            goto L_0x0082
        L_0x0025:
            java.lang.String r2 = r5.getStringExtra(r6)     // Catch: Exception -> 0x0040
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: Exception -> 0x003e
            if (r3 == 0) goto L_0x0063
            android.net.Uri r3 = r5.getData()     // Catch: Exception -> 0x003e
            if (r3 == 0) goto L_0x0063
            android.net.Uri r5 = r5.getData()     // Catch: Exception -> 0x003e
            java.lang.String r2 = r5.getQueryParameter(r6)     // Catch: Exception -> 0x003e
            goto L_0x0063
        L_0x003e:
            r5 = move-exception
            goto L_0x0042
        L_0x0040:
            r5 = move-exception
            r2 = r1
        L_0x0042:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "get "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r4 = " error= "
            r3.append(r4)
            java.lang.String r5 = r5.toString()
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            tb.lor.c(r0, r6, r5)
        L_0x0063:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r3 = " = "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            tb.lor.c(r0, r6, r5)
            if (r2 != 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r1 = r2
        L_0x0082:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jql.l(android.content.Intent, java.lang.String):java.lang.String");
    }

    public static String m(Intent intent, String str) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4684151", new Object[]{intent, str});
        }
        if (intent == null) {
            return "";
        }
        String stringExtra = intent.getStringExtra(str);
        if (!TextUtils.isEmpty(stringExtra) || intent.getData() == null || (queryParameter = intent.getData().getQueryParameter(str)) == null) {
            return stringExtra;
        }
        return queryParameter.trim();
    }

    public static String n(Intent intent) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8a5d0f3", new Object[]{intent});
        }
        if (intent == null) {
            return "";
        }
        String stringExtra = intent.getStringExtra("isSearch");
        return (!TextUtils.isEmpty(stringExtra) || intent.getData() == null || (queryParameter = intent.getData().getQueryParameter("isSearch")) == null) ? stringExtra : queryParameter.trim();
    }

    public static String o(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f804188b", new Object[]{bundle});
        }
        if (bundle == null) {
            return null;
        }
        try {
            Serializable serializable = bundle.getSerializable(IN_PARAM_ORDER_LIST_TYPE);
            if (serializable != null) {
                if (serializable instanceof CoreConstants.OrderListType) {
                    str = i((CoreConstants.OrderListType) bundle.getSerializable(IN_PARAM_ORDER_LIST_TYPE));
                } else {
                    str = serializable instanceof String ? j(bundle.getString(IN_PARAM_ORDER_LIST_TYPE)) : null;
                }
                try {
                    if (!TextUtils.isEmpty(str)) {
                        a.b(ParallelBizValueHelper.PageType.order_list, "_OrderListType", null);
                        return str;
                    }
                } catch (Exception unused) {
                    return str;
                }
            } else {
                str = null;
            }
            Object obj = bundle.get("tabCode");
            if (obj instanceof String) {
                str = k((String) obj);
                if (!TextUtils.isEmpty(str)) {
                    a.b(ParallelBizValueHelper.PageType.order_list, "_tabCode", null);
                }
            }
            return str;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static String p(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41ef7030", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        String j = j(uri.getQueryParameter(IN_PARAM_ORDER_LIST_TYPE));
        if (!TextUtils.isEmpty(j)) {
            a.b(ParallelBizValueHelper.PageType.order_list, "_OrderListType", null);
            return j;
        }
        String k = k(uri.getQueryParameter("tabCode"));
        if (TextUtils.isEmpty(k)) {
            return k;
        }
        a.b(ParallelBizValueHelper.PageType.order_list, "_tabCode", null);
        return k;
    }

    public static String q(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66d206b2", new Object[]{intent});
        }
        if (intent == null || (data = intent.getData()) == null) {
            return null;
        }
        return data.getQueryParameter("refundUrl");
    }

    public static void r(HashMap<String, String> hashMap, Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337a689d", new Object[]{hashMap, intent});
        } else if (intent != null && (data = intent.getData()) != null) {
            for (String str : data.getQueryParameterNames()) {
                if (str != null && str.startsWith("test")) {
                    hashMap.put(str, data.getQueryParameter(str));
                }
            }
        }
    }
}
