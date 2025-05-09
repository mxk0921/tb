package com.alipay.android.app.render.birdnest.utils;

import android.os.Build;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ClientInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String buildClientInfo(ICashierProvider iCashierProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55c43657", new Object[]{iCashierProvider});
        }
        StringBuilder sb = new StringBuilder("{\"client.version\":\"\", \"client.patch\":\"\", \"umidToken\":\"\",\"os.name\":\"Android\",");
        String str = Build.VERSION.RELEASE;
        sb.append("\"os.version\":\"" + str + "\"");
        sb.append(",\"device.id\":\"\"}");
        return sb.toString();
    }
}
