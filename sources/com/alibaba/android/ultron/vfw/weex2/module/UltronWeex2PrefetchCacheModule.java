package com.alibaba.android.ultron.vfw.weex2.module;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.dbv;
import tb.t2o;
import tb.v9v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronWeex2PrefetchCacheModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "requestCache";

    static {
        t2o.a(157286959);
    }

    public UltronWeex2PrefetchCacheModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(UltronWeex2PrefetchCacheModule ultronWeex2PrefetchCacheModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/module/UltronWeex2PrefetchCacheModule");
    }

    @MUSMethod(uiThread = true)
    public void setCacheData(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccdbf589", new Object[]{this, jSONObject, str});
        }
    }

    @MUSMethod(uiThread = true)
    public void removeCacheData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83beaab9", new Object[]{this, str});
            return;
        }
        if (!v9v.i("babelorder", "enableOrderWeex2Prefetch", false)) {
            UnifyLog.e("UltronWeex2PrefetchCacheModule.removeCacheData", "orange is disable");
        }
        if (TextUtils.isEmpty(str)) {
            UnifyLog.e("UltronWeex2PrefetchCacheModule.removeCacheData", "key is empty");
            return;
        }
        a instance = getInstance();
        if (instance == null) {
            UnifyLog.e("UltronWeex2PrefetchCacheModule.removeCacheData", "instance is null");
            return;
        }
        Object tag = instance.getTag("tradePrefetchCache");
        if (!(tag instanceof UltronWeex2DataPrefetchCache)) {
            UnifyLog.e("UltronWeex2PrefetchCacheModule.removeCacheData", "invalid prefetchCache");
            return;
        }
        String[] split = str.split("_");
        if (split.length <= 0 || TextUtils.isEmpty(split[0])) {
            UnifyLog.e("UltronWeex2PrefetchCacheModule.removeCacheData", "PrimaryKey is null");
        } else {
            ((UltronWeex2DataPrefetchCache) tag).h(dbv.BIZ_ORDER_DETAIL, split[0]);
        }
    }
}
