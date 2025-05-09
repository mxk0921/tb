package tb;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.thread.ThreadPoolType;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ve1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356462);
    }

    public static <Params, Progress, Result> AsyncTask<Params, Progress, Result> a(AsyncTask<Params, Progress, Result> asyncTask, ThreadPoolType threadPoolType, Params... paramsArr) {
        ThreadPoolExecutor a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AsyncTask) ipChange.ipc$dispatch("235b32e6", new Object[]{asyncTask, threadPoolType, paramsArr});
        }
        if (asyncTask == null) {
            return null;
        }
        art B = v2s.o().B();
        if (B == null || (a2 = B.a(threadPoolType)) == null) {
            return asyncTask.execute(paramsArr);
        }
        return asyncTask.executeOnExecutor(a2, paramsArr);
    }
}
