package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.multi.file.FileRiskSample;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class Gb<T extends FileRiskSample> extends Hb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String c = "BaseFileSamplePre";
    public static ThreadPoolExecutor d;
    public FileRiskSample.Callback e;

    public static /* synthetic */ Object ipc$super(Gb gb, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Gb");
    }

    public abstract void a(CcrcService ccrcService, T t);

    public synchronized void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        if (d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1000L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1192ta(FileRiskSample.c));
            d = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        d.submit(new Fb(this, runnable));
    }

    public void a(FileRiskSample.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("952abbd4", new Object[]{this, callback});
        } else {
            this.e = callback;
        }
    }
}
