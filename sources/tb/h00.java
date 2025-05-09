package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class h00 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Application mApplication;
    public IRemoteBaseListener mRemoteListener;

    static {
        t2o.a(789577729);
    }

    public h00(Application application) {
        this.mApplication = application;
    }

    public void registerRemoteListener(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de8eb052", new Object[]{this, iRemoteBaseListener});
        } else {
            this.mRemoteListener = iRemoteBaseListener;
        }
    }
}
