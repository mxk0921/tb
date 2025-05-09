package com.android.dingtalk.share.ddsharemodule.plugin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.ShareConstant;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DDVersionCheck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(90177569);
    }

    public static int getSdkVersionFromMetaData(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59831fa2", new Object[]{context, new Integer(i)})).intValue();
        }
        int innerGetSdkVersionFromMetaData = innerGetSdkVersionFromMetaData(context, ShareConstant.DD_APP_PACKAGE, -1);
        if (innerGetSdkVersionFromMetaData == -1) {
            return innerGetSdkVersionFromMetaData(context, ShareConstant.ALI_DD_APP_PACKAGE, i);
        }
        return innerGetSdkVersionFromMetaData;
    }

    private static int innerGetSdkVersionFromMetaData(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83cd1e62", new Object[]{context, str, new Integer(i)})).intValue();
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(str, 128).metaData;
            if (bundle != null) {
                return bundle.getInt(ShareConstant.DD_SDK_VERSION_META_KEY);
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
        return i;
    }
}
