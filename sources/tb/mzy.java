package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.download.DownloadErrorCode;
import com.taobao.android.nanocompose.resource_loader.download.DownloadTask;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class mzy extends DownloadTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737182);
    }

    public static final /* synthetic */ void f(mzy mzyVar, String str, DownloadErrorCode downloadErrorCode, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd77e8d6", new Object[]{mzyVar, str, downloadErrorCode, str2});
            return;
        }
        throw null;
    }

    public static /* synthetic */ Object ipc$super(mzy mzyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/resource_loader/download/BatchDownloadTask");
    }
}
