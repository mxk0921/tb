package com.taobao.uc.service;

import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.multiprocess.SandboxedProcessService;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GpuProcessService0 extends SandboxedProcessService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(922746883);
    }

    public static /* synthetic */ Object ipc$super(GpuProcessService0 gpuProcessService0, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 51128253) {
            return super.onBind((Intent) objArr[0]);
        } else {
            if (hashCode == 413640386) {
                super.onCreate();
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/uc/service/GpuProcessService0");
        }
    }

    @Override // com.uc.webview.export.multiprocess.SandboxedProcessService, android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return super.onBind(intent);
    }

    @Override // com.uc.webview.export.multiprocess.SandboxedProcessService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            super.onCreate();
        }
    }

    @Override // com.uc.webview.export.multiprocess.SandboxedProcessService, android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
