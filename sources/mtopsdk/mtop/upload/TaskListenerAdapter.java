package mtopsdk.mtop.upload;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import tb.mzd;
import tb.ndt;
import tb.ozd;
import tb.t2o;
import tb.z6e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class TaskListenerAdapter implements mzd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.TaskListenerAdapter";
    private DefaultFileUploadListenerWrapper listenerWrapper;
    private UploadFileInfo uploadFileInfo;

    static {
        t2o.a(595591180);
    }

    public TaskListenerAdapter(UploadFileInfo uploadFileInfo, DefaultFileUploadListenerWrapper defaultFileUploadListenerWrapper) {
        this.listenerWrapper = defaultFileUploadListenerWrapper;
        this.uploadFileInfo = uploadFileInfo;
    }

    private void doRemove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c891f6", new Object[]{this});
        } else {
            FileUploadMgr.getInstance().removeArupTask(this.uploadFileInfo);
        }
    }

    @Override // tb.mzd
    public void onCancel(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d021ed", new Object[]{this, z6eVar});
        } else if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "onCancel called.");
        }
    }

    @Override // tb.mzd
    public void onFailure(z6e z6eVar, ndt ndtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7789334b", new Object[]{this, z6eVar, ndtVar});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "onFailure called.");
        }
        this.listenerWrapper.onError(ndtVar.f24666a, ndtVar.b, ndtVar.c);
        doRemove();
    }

    @Override // tb.mzd
    public void onPause(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85aa60f", new Object[]{this, z6eVar});
        } else if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "onPause called.");
        }
    }

    @Override // tb.mzd
    public void onProgress(z6e z6eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b23fa9", new Object[]{this, z6eVar, new Integer(i)});
        } else {
            this.listenerWrapper.onProgress(i);
        }
    }

    @Override // tb.mzd
    public void onResume(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e581d4da", new Object[]{this, z6eVar});
        } else if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "onResume called.");
        }
    }

    @Override // tb.mzd
    public void onStart(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33e623", new Object[]{this, z6eVar});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "onStart called.");
        }
        this.listenerWrapper.onStart();
    }

    @Override // tb.mzd
    public void onSuccess(z6e z6eVar, ozd ozdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10b3127c", new Object[]{this, z6eVar, ozdVar});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "onSuccess called.");
        }
        this.listenerWrapper.onFinish(this.uploadFileInfo, ozdVar.a());
        doRemove();
    }

    @Override // tb.mzd
    public void onWait(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e24ed2", new Object[]{this, z6eVar});
        } else if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "onWait called.");
        }
    }
}
