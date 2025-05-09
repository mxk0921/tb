package tb;

import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.bridge.MUSThreadStrategy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface cwh<T> {
    MUSThreadStrategy a();

    Object b(a aVar, Object obj, T t, MUSValue[] mUSValueArr) throws Exception;

    Object c(MUSDKInstance mUSDKInstance, T t, Object obj) throws Exception;

    Object d(MUSDKInstance mUSDKInstance, T t, MUSValue mUSValue) throws Exception;

    Object e(MUSDKInstance mUSDKInstance, Object obj, T t, MUSValue[] mUSValueArr) throws Exception;
}
