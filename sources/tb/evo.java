package tb;

import android.app.Activity;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class evo implements OnScreenChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public h01 f18840a;
    public final h9 b;
    public final Activity c;
    public final hab<?, ?> d;

    static {
        t2o.a(786432121);
    }

    public evo(h9 h9Var, Activity activity, hab<?, ?> habVar) {
        ckf.g(activity, "act");
        this.b = h9Var;
        this.c = activity;
        this.d = habVar;
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onActivityChanged(Activity activity, int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
        } else {
            ckf.g(configuration, VideoControllerManager.ARRAY_KEY_CONFIGURATION);
        }
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onScreenChanged(int i, Configuration configuration) {
        e9 e9Var;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        ckf.g(configuration, VideoControllerManager.ARRAY_KEY_CONFIGURATION);
        TLog.loge("stdPopTag", "stdPopTag", "onScreenChanged = " + i);
        h9 h9Var = this.b;
        if (h9Var != null) {
            if (i == 1) {
                z = true;
            }
            h9Var.e(z, this.c);
        }
        h9 h9Var2 = this.b;
        if (h9Var2 != null && (e9Var = h9Var2.f20479a) != null && e9Var.w()) {
            if (this.f18840a == null) {
                this.f18840a = new h01(this.c, this.b, this.d);
            }
            h01 h01Var = this.f18840a;
            if (h01Var != null) {
                h01Var.d(i, configuration);
            }
        }
    }
}
