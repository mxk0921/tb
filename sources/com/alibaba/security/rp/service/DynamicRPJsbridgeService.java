package com.alibaba.security.rp.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.alibaba.security.realidentity.ui.webview.jsbridge.RP;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ihc;
import tb.kpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DynamicRPJsbridgeService extends Service implements ihc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(DynamicRPJsbridgeService dynamicRPJsbridgeService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/rp/service/DynamicRPJsbridgeService");
    }

    @Override // tb.ihc
    public Class<? extends kpw> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && str.equals("RP")) {
            return RP.class;
        }
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }
}
