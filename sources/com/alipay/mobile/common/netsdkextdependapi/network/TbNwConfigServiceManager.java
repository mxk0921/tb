package com.alipay.mobile.common.netsdkextdependapi.network;

import android.content.Context;
import com.alipay.android.msp.framework.assist.MspWalletImpl;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.mobile.common.netsdkextdependapi.configservice.NwConfigServiceAdapter;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TbNwConfigServiceManager extends NwConfigServiceAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f4022a = new HashMap();

    public TbNwConfigServiceManager(Context context) {
        b(context);
        c(context);
        a();
    }

    public static /* synthetic */ Object ipc$super(TbNwConfigServiceManager tbNwConfigServiceManager, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/netsdkextdependapi/network/TbNwConfigServiceManager");
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.configservice.NwConfigServiceAdapter, com.alipay.mobile.common.netsdkextdependapi.configservice.NwConfigService
    public String getConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d74258f7", new Object[]{this, str});
        }
        return (String) ((HashMap) this.f4022a).get(str);
    }

    public final void a() {
        Object invoke;
        int i = 0;
        String str = null;
        try {
            IpChange ipChange = MspWalletImpl.$ipChange;
            invoke = PhoneCashierMspEngine.class.getDeclaredMethod("getMspWallet", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            LogCatUtil.error("TbNwConfigServiceManager", "saveConfig v1, ex" + th.toString());
        }
        if (MspWalletImpl.class.isInstance(invoke)) {
            Method declaredMethod = MspWalletImpl.class.getDeclaredMethod("getWalletConfig", String.class);
            declaredMethod.setAccessible(true);
            str = (String) declaredMethod.invoke(invoke, "ant_network_core");
            if (str == null || str.isEmpty()) {
                LogCatUtil.error("TbNwConfigServiceManager", "saveConfig, value empty");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                while (true) {
                    int length = jSONObject.names().length();
                    Map<String, String> map = this.f4022a;
                    if (i < length) {
                        String string = jSONObject.names().getString(i);
                        map.put(string, jSONObject.optString(string));
                        i++;
                    } else {
                        LogCatUtil.info("TbNwConfigServiceManager", "saveConfig ok, map:" + map.toString());
                        return;
                    }
                }
            } catch (Throwable th2) {
                LogCatUtil.warn("TbNwConfigServiceManager", "saveConfig v2 , ex" + th2.toString());
            }
        } else {
            LogCatUtil.error("TbNwConfigServiceManager", "saveConfig fail");
        }
    }

    public final void b(Context context) {
        try {
            Method declaredMethod = GlobalHelper.class.getDeclaredMethod("getInstance", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(GlobalHelper.class, new Object[0]);
            Method declaredMethod2 = GlobalHelper.class.getDeclaredMethod("init", Context.class);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(invoke, context);
            LogCatUtil.info("TbNwConfigServiceManager", "initDrm ok");
        } catch (Throwable th) {
            LogCatUtil.error("TbNwConfigServiceManager", "initDrm ex:" + th);
        }
    }

    public final void c(Context context) {
        try {
            IpChange ipChange = MspWalletImpl.$ipChange;
            Object invoke = PhoneCashierMspEngine.class.getDeclaredMethod("getMspWallet", new Class[0]).invoke(null, new Object[0]);
            if (MspWalletImpl.class.isInstance(invoke)) {
                Method declaredMethod = MspWalletImpl.class.getDeclaredMethod("initConfigManger", Context.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(invoke, context);
                LogCatUtil.info("TbNwConfigServiceManager", "initConfigModule ok");
            } else {
                LogCatUtil.error("TbNwConfigServiceManager", "initConfigModule fail");
            }
        } catch (Throwable th) {
            LogCatUtil.warn("TbNwConfigServiceManager", "initConfigModule, ex" + th.toString());
        }
    }
}
