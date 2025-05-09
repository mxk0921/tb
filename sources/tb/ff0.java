package tb;

import android.content.Context;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.AddressLoginBroadcast;
import com.taobao.android.address.wrapper.weex.AddressKinshipBridge;
import com.taobao.android.address.wrapper.weex.WVAddressModule;
import com.taobao.android.address.wrapper.weex.WXAddressModule;
import com.taobao.android.address.wrapper.weex.WXAddressModule2;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.taobao.weex.WXSDKEngine;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ff0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONSTANT_ADDRESS_ZCACHE_LIST_DEFAULT = "receiver-address-themis-address;receiver-address-weex2;receiver-address-weex2-list";
    public static final String SP_FILE_NAME = "address_config";
    public static final String SP_KEY_ADDRESS_ZCACHE_LIST = "address_zcache_list";
    public static final String TAG = "address.AddressConfig";

    /* renamed from: a  reason: collision with root package name */
    public static Context f19244a;

    public static Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        return f19244a;
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        try {
            f19244a = context;
            e();
            c();
            fsw.h("aluAddress", AddressKinshipBridge.class);
            fsw.h(WVAddressModule.PLUGIN_NAME, WVAddressModule.class);
            u58.g(context);
            u58.c(10000);
            u58.a(context);
            u58.b(context);
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "init error", th);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43fe4d0", new Object[0]);
            return;
        }
        try {
            WXSDKEngine.registerModule(WXAddressModule2.PLUGIN_NAME, WXAddressModule2.class);
            WXSDKEngine.registerModule(WXAddressModule.PLUGIN_NAME, WXAddressModule.class);
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "initWeex1Bridge error", th);
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca587524", new Object[0])).booleanValue();
        }
        try {
            if (Mtop.instance(a()).getMtopConfig().envMode.getEnvMode() == EnvModeEnum.PREPARE.getEnvMode()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "isPre error", th);
            return false;
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa2c666", new Object[0]);
            return;
        }
        try {
            if (Login.checkSessionValid()) {
                AdapterForTLog.loge(TAG, "address prefetch");
                rf0.B();
            } else {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(LoginAction.NOTIFY_LOGIN_SUCCESS.name());
                f19244a.getApplicationContext().registerReceiver(new AddressLoginBroadcast(), intentFilter);
            }
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "zcachePrefetch error", th);
        }
    }
}
