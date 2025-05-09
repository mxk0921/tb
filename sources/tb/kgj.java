package tb;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.MytaobaoApplication;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kgj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_EDITION_CODE_CHANGED = "EDITON_SWITCHER_EDITTION_CODE_CHANGED";
    public static final String ACTION_REFRESH_ORDER_NUM = "MyTaobao_Order_Refresh";
    public static final String ACTION_REFRESH_PAGE = "MyTaobao_Page_Refresh";
    public static final String ACTION_REFRESH_PAGE_WHEN_SHOW = "MyTaobao_Page_Refresh_When_Show";
    public static final String ACTION_REVISION_SWITCH = "taobao.action.ACTION_REVISION_SWITCH_CHANGE";
    public static final String ACTION_SCROLL_TO_CARD = "SCROLL_TO_CARD";
    public static final String TAG = "MyTaobaoBroadCastHelper";

    static {
        t2o.a(745537725);
    }

    public static void a(boolean z, BroadcastReceiver broadcastReceiver, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daba940", new Object[]{new Boolean(z), broadcastReceiver, strArr});
            return;
        }
        MytaobaoApplication application = MytaobaoApplication.getApplication();
        if (application != null && strArr != null && broadcastReceiver != null) {
            IntentFilter intentFilter = new IntentFilter();
            for (String str : strArr) {
                intentFilter.addAction(str);
            }
            if (z) {
                LocalBroadcastManager.getInstance(application).registerReceiver(broadcastReceiver, intentFilter);
            } else {
                application.registerReceiver(broadcastReceiver, intentFilter);
            }
        }
    }

    public static void b(boolean z, String str, String... strArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4584ee1", new Object[]{new Boolean(z), str, strArr});
            return;
        }
        MytaobaoApplication application = MytaobaoApplication.getApplication();
        if (application != null && str != null) {
            Intent intent = new Intent();
            intent.setAction(str);
            if (strArr != null) {
                while (i < strArr.length) {
                    StringBuilder sb = new StringBuilder("arg");
                    int i2 = i + 1;
                    sb.append(i2);
                    intent.putExtra(sb.toString(), strArr[i]);
                    i = i2;
                }
            }
            if (z) {
                LocalBroadcastManager.getInstance(application).sendBroadcast(intent);
            } else {
                application.sendBroadcast(intent);
            }
        }
    }

    public static void c(boolean z, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3cb8378", new Object[]{new Boolean(z), broadcastReceiver});
            return;
        }
        try {
            MytaobaoApplication application = MytaobaoApplication.getApplication();
            if (application != null) {
                if (z) {
                    LocalBroadcastManager.getInstance(application).unregisterReceiver(broadcastReceiver);
                } else {
                    application.unregisterReceiver(broadcastReceiver);
                }
            }
        } catch (Exception unused) {
        }
    }
}
