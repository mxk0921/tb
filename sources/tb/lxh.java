package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.UIKitEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static lxh b;

    /* renamed from: a  reason: collision with root package name */
    public wpc f23622a;

    static {
        t2o.a(982516234);
    }

    public static lxh b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lxh) ipChange.ipc$dispatch("8166b987", new Object[0]);
        }
        if (b == null) {
            synchronized (lxh.class) {
                try {
                    if (b == null) {
                        b = new lxh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public View a(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("12e103dd", new Object[]{this, mUSDKInstance});
        }
        if (mUSDKInstance == null) {
            dwh.e("instance is null when create musview!");
            return null;
        }
        wpc wpcVar = this.f23622a;
        if (wpcVar != null) {
            return ((UIKitEngine.a) wpcVar).a(mUSDKInstance);
        }
        dwh.e("MUSView has not register!");
        return null;
    }

    public void c(wpc wpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f14509cf", new Object[]{this, wpcVar});
        } else {
            this.f23622a = wpcVar;
        }
    }
}
