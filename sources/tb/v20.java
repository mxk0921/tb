package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class v20 implements IPageLifeCycle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810219);
        t2o.a(729810222);
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acffd587", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onLazyInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1fcb0aa", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onResume(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72eca07d", new Object[]{this, str});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
        }
    }
}
