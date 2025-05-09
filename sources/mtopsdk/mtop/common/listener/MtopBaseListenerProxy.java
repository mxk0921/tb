package mtopsdk.mtop.common.listener;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.DefaultMtopCallback;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.common.MtopHeaderEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.common.MtopProgressEvent;
import mtopsdk.mtop.domain.MtopResponse;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MtopBaseListenerProxy extends DefaultMtopCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopListenerProxy";
    public MtopListener listener;
    public MtopResponse response = null;
    public Object reqContext = null;
    public boolean isCached = false;

    static {
        t2o.a(589299893);
    }

    public MtopBaseListenerProxy(MtopListener mtopListener) {
        this.listener = mtopListener;
    }

    public static /* synthetic */ Object ipc$super(MtopBaseListenerProxy mtopBaseListenerProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/common/listener/MtopBaseListenerProxy");
    }

    @Override // mtopsdk.mtop.common.DefaultMtopCallback, mtopsdk.mtop.common.MtopCallback.MtopProgressListener
    public void onDataReceived(MtopProgressEvent mtopProgressEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea8f321", new Object[]{this, mtopProgressEvent, obj});
            return;
        }
        MtopListener mtopListener = this.listener;
        if (mtopListener instanceof MtopCallback.MtopProgressListener) {
            ((MtopCallback.MtopProgressListener) mtopListener).onDataReceived(mtopProgressEvent, obj);
        }
    }

    @Override // mtopsdk.mtop.common.DefaultMtopCallback, mtopsdk.mtop.common.MtopCallback.MtopFinishListener
    public void onFinished(MtopFinishEvent mtopFinishEvent, Object obj) {
        MtopResponse mtopResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732e17e0", new Object[]{this, mtopFinishEvent, obj});
            return;
        }
        if (!(mtopFinishEvent == null || mtopFinishEvent.getMtopResponse() == null)) {
            this.response = mtopFinishEvent.getMtopResponse();
            this.reqContext = obj;
        }
        synchronized (this) {
            try {
                notifyAll();
            } catch (Exception unused) {
                TBSdkLog.e(TAG, "[onFinished] notify error");
            }
        }
        if (!(this.listener instanceof MtopCallback.MtopFinishListener)) {
            return;
        }
        if (!this.isCached || ((mtopResponse = this.response) != null && mtopResponse.isApiSuccess())) {
            ((MtopCallback.MtopFinishListener) this.listener).onFinished(mtopFinishEvent, obj);
        }
    }

    @Override // mtopsdk.mtop.common.DefaultMtopCallback, mtopsdk.mtop.common.MtopCallback.MtopHeaderListener
    public void onHeader(MtopHeaderEvent mtopHeaderEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d28e9f", new Object[]{this, mtopHeaderEvent, obj});
            return;
        }
        MtopListener mtopListener = this.listener;
        if (mtopListener instanceof MtopCallback.MtopHeaderListener) {
            ((MtopCallback.MtopHeaderListener) mtopListener).onHeader(mtopHeaderEvent, obj);
        }
    }
}
