package com.taobao.android;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AliLogImp implements AliLogInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AliLogImp f6241a = new AliLogImp();

    public static AliLogImp getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliLogImp) ipChange.ipc$dispatch("e5ec300", new Object[0]);
        }
        return f6241a;
    }

    @Override // com.taobao.android.AliLogInterface
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4508586", new Object[]{this, str, str2, str3});
        } else {
            TLog.loge(str, str2, str3);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e727b88a", new Object[]{this, str, str2, str3});
        } else {
            TLog.logi(str, str2, str3);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0631e57", new Object[]{this, str, str2, str3});
        } else {
            TLog.logv(str, str2, str3);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d118eb18", new Object[]{this, str, str2, str3});
        } else {
            TLog.logw(str, str2, str3);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939ab8c5", new Object[]{this, str, str2, str3});
        } else {
            TLog.logd(str, str2, str3);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void logd(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bebe7bb", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logd(str, str2);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void loge(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.loge(str, str2);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void logi(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0cbec0", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logi(str, str2);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void logw(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcf18ce", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logw(str, str2);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void loge(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc02eb9", new Object[]{this, str, str2, th});
        } else {
            AdapterForTLog.loge(str, str2, th);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void logw(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192407e7", new Object[]{this, str, str2, th});
        } else {
            AdapterForTLog.logw(str, str2, th);
        }
    }
}
