package com.ali.user.mobile.base.helper;

import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.ToastUtil;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SDKExceptionHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static SDKExceptionHelper instance = new SDKExceptionHelper();

    static {
        t2o.a(69206076);
    }

    private SDKExceptionHelper() {
    }

    public static SDKExceptionHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SDKExceptionHelper) ipChange.ipc$dispatch("3bd51925", new Object[0]);
        }
        return instance;
    }

    private void toast(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{this, str});
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.base.helper.SDKExceptionHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!TextUtils.isEmpty(str)) {
                        try {
                            ToastUtil.showToast(DataProviderFactory.getApplicationContext(), str, 0);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    public void rpcExceptionHandler(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4094dce", new Object[]{this, th});
            return;
        }
        th.printStackTrace();
        toast(ResourceUtil.getNetworkError());
    }
}
