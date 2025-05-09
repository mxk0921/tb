package com.alipay.mobile.common.amnet.api.configs;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetRpcGlobalParamConfigHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, RpcGlobalParamConfigModel> f3888a;

    public static final Map<String, RpcGlobalParamConfigModel> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
        }
        Map<String, RpcGlobalParamConfigModel> map = f3888a;
        if (map != null) {
            return map;
        }
        synchronized (AmnetRpcGlobalParamConfigHelper.class) {
            try {
                Map<String, RpcGlobalParamConfigModel> map2 = f3888a;
                if (map2 != null) {
                    return map2;
                }
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(2);
                f3888a = concurrentHashMap;
                return concurrentHashMap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void addRpcGlobalParamConfig(String str, RpcGlobalParamConfigModel rpcGlobalParamConfigModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7c7165", new Object[]{str, rpcGlobalParamConfigModel});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                a().put(str, rpcGlobalParamConfigModel);
                LogCatUtil.info("amnet_AmnetRpcGlobalParamConfigHelper", "[addRpcGlobalParamConfig] Finished. operationType:" + str);
            } catch (Throwable th) {
                LogCatUtil.warn("amnet_AmnetRpcGlobalParamConfigHelper", "[addRpcGlobalParamConfig] Exception: " + th.toString());
            }
        }
    }

    public static final RpcGlobalParamConfigModel getRpcGlobalParamConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcGlobalParamConfigModel) ipChange.ipc$dispatch("cccfac54", new Object[]{str});
        }
        Map<String, RpcGlobalParamConfigModel> map = f3888a;
        if (map != null && !((ConcurrentHashMap) map).isEmpty()) {
            try {
                return (RpcGlobalParamConfigModel) ((ConcurrentHashMap) f3888a).get(str);
            } catch (Throwable th) {
                LogCatUtil.warn("amnet_AmnetRpcGlobalParamConfigHelper", "[getRpcGlobalParamConfig] Exception: " + th.toString());
            }
        }
        return null;
    }

    public static final boolean isIndependentChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("955de548", new Object[]{str})).booleanValue();
        }
        Map<String, RpcGlobalParamConfigModel> map = f3888a;
        if (map == null || ((ConcurrentHashMap) map).isEmpty()) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            LogCatUtil.info("amnet_AmnetRpcGlobalParamConfigHelper", "[isIndependentChannel] operationType is empty.");
            return false;
        }
        RpcGlobalParamConfigModel rpcGlobalParamConfigModel = (RpcGlobalParamConfigModel) ((ConcurrentHashMap) f3888a).get(str);
        if (rpcGlobalParamConfigModel == null) {
            return false;
        }
        boolean z = rpcGlobalParamConfigModel.independentChannel;
        LogCatUtil.info("amnet_AmnetRpcGlobalParamConfigHelper", "[isIndependentChannel] operationType:" + str + ", independentChannel:" + z);
        return z;
    }

    public static void removeRpcGlobalParamConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3eea1c", new Object[]{str});
            return;
        }
        Map<String, RpcGlobalParamConfigModel> map = f3888a;
        if (map != null && !((ConcurrentHashMap) map).isEmpty()) {
            try {
                ((ConcurrentHashMap) f3888a).remove(str);
            } catch (Throwable th) {
                LogCatUtil.warn("amnet_AmnetRpcGlobalParamConfigHelper", "[removeRpcGlobalParamConfig] Exception: " + th.toString());
            }
        }
    }
}
