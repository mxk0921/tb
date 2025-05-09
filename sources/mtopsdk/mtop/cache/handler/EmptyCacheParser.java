package mtopsdk.mtop.cache.handler;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.ResponseSource;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class EmptyCacheParser implements ICacheParser {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.EmptyCacheParser";

    static {
        t2o.a(589299869);
        t2o.a(589299874);
    }

    @Override // mtopsdk.mtop.cache.handler.ICacheParser
    public void parse(ResponseSource responseSource, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0249bc", new Object[]{this, responseSource, handler});
        } else if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[parse]EmptyCacheParser parse called");
        }
    }
}
