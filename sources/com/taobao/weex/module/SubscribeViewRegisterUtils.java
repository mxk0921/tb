package com.taobao.weex.module;

import com.alibaba.triver.triver_shop.tbsubscribe.EmbedSubscribeView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.WXLogUtils;
import tb.t2o;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SubscribeViewRegisterUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CLAZZ_NAME = "com.taobao.android.dinamicx.subscribe.protocol.shop.weex.ShopSubscribeWeexComponent";
    private static final String TAG = "SubscribeViewRegisterUtils";

    static {
        t2o.a(773849123);
    }

    public static void tryRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0cff05", new Object[0]);
            return;
        }
        WXLogUtils.e(TAG, "tryRegister");
        zk9.b(CLAZZ_NAME, new zk9.i() { // from class: com.taobao.weex.module.SubscribeViewRegisterUtils.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.zk9.i
            public void onClassLoaded(Class<?> cls) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                    return;
                }
                try {
                    WXSDKEngine.registerComponent(EmbedSubscribeView.TYPE, (Class<? extends WXComponent>) cls);
                } catch (Throwable th) {
                    WXLogUtils.e(SubscribeViewRegisterUtils.TAG, th);
                }
            }

            @Override // tb.zk9.i
            public void onClassNotFound() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                } else {
                    WXLogUtils.e(SubscribeViewRegisterUtils.TAG, "onClassNotFound");
                }
            }
        });
    }
}
