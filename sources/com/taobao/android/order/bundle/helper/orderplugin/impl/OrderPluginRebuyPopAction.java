package com.taobao.android.order.bundle.helper.orderplugin.impl;

import android.content.Context;
import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.TBOrderListActivity;
import com.taobao.android.order.bundle.TBOrderListFragment;
import com.taobao.android.order.bundle.constants.CoreConstants;
import java.util.HashMap;
import tb.gb0;
import tb.kdl;
import tb.qxq;
import tb.t2o;
import tb.yw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OrderPluginRebuyPopAction extends yw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACTION = "rebuyPopBridge";
    public static final String QUERY_KEY_SHOW_REBUYPOP = "showRebuyPop";

    static {
        t2o.a(713031813);
    }

    public static /* synthetic */ Object ipc$super(OrderPluginRebuyPopAction orderPluginRebuyPopAction, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/helper/orderplugin/impl/OrderPluginRebuyPopAction");
    }

    public final void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6972e689", new Object[]{this, context, str});
        } else {
            Nav.from(context).toUri(str);
        }
    }

    public final void c(Context context, String str) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4966c1a", new Object[]{this, context, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            intent = new Intent();
            intent.putExtra(CoreConstants.QUERY_PARAM_KEY_CONDITION, new HashMap<String, Object>(str) { // from class: com.taobao.android.order.bundle.helper.orderplugin.impl.OrderPluginRebuyPopAction.1
                public final /* synthetic */ String val$showRebuyPop;

                {
                    this.val$showRebuyPop = str;
                    put(OrderPluginRebuyPopAction.QUERY_KEY_SHOW_REBUYPOP, str);
                }
            });
        } else {
            intent = null;
        }
        gb0.e(context, true, intent);
    }

    @Override // tb.yw
    public boolean a(Context context, IWVWebView iWVWebView, String str, WVCallBackContext wVCallBackContext) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("156556cf", new Object[]{this, context, iWVWebView, str, wVCallBackContext})).booleanValue();
        }
        if (str == null || context == null || (a2 = kdl.a(str)) == null) {
            return false;
        }
        if (context instanceof TBOrderListActivity) {
            c(context, a2.getString(QUERY_KEY_SHOW_REBUYPOP));
        } else if (!(context instanceof FragmentActivity)) {
            b(context, a2.getString("orderListUrl"));
        } else if (qxq.h(((FragmentActivity) context).getSupportFragmentManager()) instanceof TBOrderListFragment) {
            c(context, a2.getString(QUERY_KEY_SHOW_REBUYPOP));
        }
        return true;
    }
}
