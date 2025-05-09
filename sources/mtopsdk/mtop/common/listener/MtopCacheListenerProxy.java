package mtopsdk.mtop.common.listener;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopListener;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MtopCacheListenerProxy extends MtopBaseListenerProxy implements MtopCallback.MtopCacheListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopCacheListenerProxy";

    static {
        t2o.a(589299894);
        t2o.a(589299880);
    }

    public MtopCacheListenerProxy(MtopListener mtopListener) {
        super(mtopListener);
    }

    public static /* synthetic */ Object ipc$super(MtopCacheListenerProxy mtopCacheListenerProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/common/listener/MtopCacheListenerProxy");
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopCacheListener
    public void onCached(MtopCacheEvent mtopCacheEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0c28d9", new Object[]{this, mtopCacheEvent, obj});
            return;
        }
        MtopListener mtopListener = this.listener;
        if (mtopListener instanceof MtopCallback.MtopCacheListener) {
            ((MtopCallback.MtopCacheListener) mtopListener).onCached(mtopCacheEvent, obj);
            this.isCached = true;
        }
    }
}
