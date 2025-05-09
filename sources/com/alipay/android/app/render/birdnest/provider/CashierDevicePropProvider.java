package com.alipay.android.app.render.birdnest.provider;

import android.os.Build;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.app.render.birdnest.utils.ClientInfo;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.Map;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CashierDevicePropProvider implements BirdNestEngine.DevicePropProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ICashierProvider mProvider;

    public CashierDevicePropProvider(ICashierProvider iCashierProvider) {
        this.mProvider = iCashierProvider;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.DevicePropProvider
    public String getProperty(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f437f57", new Object[]{this, str, map});
        }
        if (DispatchConstants.PLATFORM_VERSION.equals(str)) {
            return Build.VERSION.RELEASE;
        }
        if ("clientVersion".equals(str) || "clientChannel".equals(str)) {
            return "";
        }
        if ("debug".equals(str)) {
            return "false";
        }
        if ("getClientInfo".equals(str)) {
            return ClientInfo.buildClientInfo(this.mProvider);
        }
        return null;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.DevicePropProvider
    public boolean capableOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4797978", new Object[]{this, str})).booleanValue();
        }
        return DispatchConstants.PLATFORM_VERSION.equals(str) || "clientVersion".equals(str) || "clientChannel".equals(str) || "debug".equals(str);
    }
}
