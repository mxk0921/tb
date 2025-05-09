package com.taobao.wetao.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.flexbox.layoutmanager.save.TBSNSWVSavePlugin;
import com.taobao.wetao.common.module.TBSNSWVPlugin;
import tb.ihc;
import tb.kpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DynamicJsbridgeService extends Service implements ihc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DynamicJsbridgeService() {
        ApplicationInvoker.getInstance("com.taobao.taobao").invoke("com.taobao.allspark.AllSparkApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(DynamicJsbridgeService dynamicJsbridgeService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wetao/service/DynamicJsbridgeService");
    }

    @Override // tb.ihc
    public Class<? extends kpw> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("TBSNSWVPlugin".equals(str)) {
            return TBSNSWVPlugin.class;
        }
        if ("TBSNSWVSave".equals(str)) {
            return TBSNSWVSavePlugin.class;
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
