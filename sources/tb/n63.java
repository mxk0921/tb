package tb;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.tool.base.CaptureManager;
import com.etao.feimagesearch.struct.ViewWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class n63 extends ViewWidget<View, CaptureManager, n63> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile ojb l;
    public int m = -1;

    static {
        t2o.a(481296804);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n63(Activity activity, Object obj, CaptureManager captureManager, xfw xfwVar, ojb ojbVar) {
        super(activity, obj, captureManager, xfwVar, false, false, 48, null);
        ckf.g(activity, "activity");
        ckf.g(captureManager, "captureManager");
        ckf.g(xfwVar, "viewSetter");
        ckf.g(ojbVar, "navStateChangeListener");
        this.l = ojbVar;
    }

    public static /* synthetic */ Object ipc$super(n63 n63Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/bottom/nav/CaptureNavBaseWidget");
    }

    public final int h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c39320fb", new Object[]{this})).intValue();
        }
        return this.m;
    }

    public final ojb i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ojb) ipChange.ipc$dispatch("52175f69", new Object[]{this});
        }
        return this.l;
    }

    public final void j0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ce0807", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public abstract void k0(boolean z);
}
