package com.alipay.android.msp.framework.hardwarepay.old.bracelet;

import android.content.Context;
import com.alipay.android.app.hardwarepay.bracelet.impl.BraceletPayHelperImpl;
import com.alipay.android.msp.framework.hardwarepay.old.base.BaseCommonPayHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class BraceletPayHelper extends BaseCommonPayHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static BraceletPayHelper hg;

    public static BraceletPayHelper getInstance() {
        if (hg == null) {
            synchronized (BraceletPayHelper.class) {
                try {
                    if (hg == null) {
                        hg = (BraceletPayHelper) BraceletPayHelperImpl.class.newInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return hg;
    }

    public static /* synthetic */ Object ipc$super(BraceletPayHelper braceletPayHelper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/hardwarepay/old/bracelet/BraceletPayHelper");
    }

    public abstract String[] getAuthInfo();

    public abstract int initHardwarePay(Context context, int i, String str);

    public abstract String process(int i, String str, int i2);

    public abstract void process(int i, int i2, String str, int i3, Object obj, Context context);
}
