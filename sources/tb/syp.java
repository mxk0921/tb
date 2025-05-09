package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class syp implements mzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.mzd
    public void onCancel(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d021ed", new Object[]{this, z6eVar});
        }
    }

    @Override // tb.mzd
    public void onFailure(z6e z6eVar, ndt ndtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7789334b", new Object[]{this, z6eVar, ndtVar});
        }
    }

    @Override // tb.mzd
    public void onPause(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85aa60f", new Object[]{this, z6eVar});
        }
    }

    @Override // tb.mzd
    public void onProgress(z6e z6eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b23fa9", new Object[]{this, z6eVar, new Integer(i)});
        }
    }

    @Override // tb.mzd
    public void onResume(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e581d4da", new Object[]{this, z6eVar});
        }
    }

    @Override // tb.mzd
    public void onStart(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33e623", new Object[]{this, z6eVar});
        }
    }

    @Override // tb.mzd
    public void onSuccess(z6e z6eVar, ozd ozdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10b3127c", new Object[]{this, z6eVar, ozdVar});
        }
    }

    @Override // tb.mzd
    public void onWait(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e24ed2", new Object[]{this, z6eVar});
        }
    }
}
