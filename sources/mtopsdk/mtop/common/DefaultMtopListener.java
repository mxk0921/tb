package mtopsdk.mtop.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCallback;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class DefaultMtopListener extends DefaultMtopCallback implements MtopCallback.MtopCacheListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.DefaultMtopListener";

    static {
        t2o.a(589299877);
        t2o.a(589299880);
    }

    public static /* synthetic */ Object ipc$super(DefaultMtopListener defaultMtopListener, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/common/DefaultMtopListener");
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopCacheListener
    public void onCached(MtopCacheEvent mtopCacheEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0c28d9", new Object[]{this, mtopCacheEvent, obj});
        } else if (mtopCacheEvent != null && mtopCacheEvent.getMtopResponse() != null && TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            String str = mtopCacheEvent.seqNo;
            TBSdkLog.d(TAG, str, "[onCached]" + mtopCacheEvent.getMtopResponse().toString());
        }
    }
}
