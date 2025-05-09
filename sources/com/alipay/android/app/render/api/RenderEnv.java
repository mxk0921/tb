package com.alipay.android.app.render.api;

import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RenderEnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f3483a;

    public static String getLocal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80e9bc64", new Object[0]);
        }
        int mspLocale = PhoneCashierMspEngine.getMspBase().getMspLocale(PhoneCashierMspEngine.getMspWallet().getAlipayLocaleDes());
        if (!(mspLocale == -1 || mspLocale == 0)) {
            if (mspLocale == 1) {
                return "zh_CN";
            }
            if (mspLocale == 2) {
                return "zh_TW";
            }
            if (mspLocale == 3) {
                return "zh_HK";
            }
            if (mspLocale != 4) {
                return null;
            }
        }
        return "en_US";
    }

    public static boolean isWallet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("146e30ce", new Object[0])).booleanValue();
        }
        return f3483a;
    }

    public static void setIsWallet(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98ebe08", new Object[]{new Boolean(z)});
        } else {
            f3483a = z;
        }
    }
}
