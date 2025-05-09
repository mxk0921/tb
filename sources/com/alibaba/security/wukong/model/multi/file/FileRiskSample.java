package com.alibaba.security.wukong.model.multi.file;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.ThreadFactoryC1192ta;
import com.alibaba.security.ccrc.service.build.ob;
import com.alibaba.security.wukong.model.multi.MultiModelRiskSample;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class FileRiskSample extends MultiModelRiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String c = "FileRiskSample";
    public static ThreadPoolExecutor d;
    public static final int e = (Runtime.getRuntime().availableProcessors() * 2) + 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface Callback {
        void onFileDetectEnd(String str);

        void onFileDetectFail(String str, String str2);
    }

    public FileRiskSample(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(FileRiskSample fileRiskSample, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/multi/file/FileRiskSample");
    }

    public abstract void detect(CcrcService ccrcService, Callback callback);

    @Override // com.alibaba.security.wukong.model.multi.MultiModelRiskSample
    public abstract String type();

    public FileRiskSample(String str, Map<String, Object> map) {
        super(str, map);
    }

    public synchronized void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        if (d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1000L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1192ta(c));
            d = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        d.submit(new ob(this, runnable));
    }
}
