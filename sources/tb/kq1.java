package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.push.model.ActionInfo;
import com.taobao.android.live.plugin.atype.flexalocal.push.model.ClientCtlInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class kq1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f22845a;
    public final ux9 b;
    public final ActionInfo c;
    public final ClientCtlInfo d;

    static {
        t2o.a(295699625);
    }

    public kq1(kq1 kq1Var) {
        if (kq1Var != null) {
            this.f22845a = kq1Var.f22845a;
            this.b = kq1Var.b;
            this.c = kq1Var.c;
            this.d = kq1Var.d;
        }
    }

    public yac a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yac) ipChange.ipc$dispatch("f59707c6", new Object[]{this});
        }
        ux9 ux9Var = this.b;
        if (ux9Var == null || ux9Var.k() == null) {
            return null;
        }
        return (yac) this.b.k();
    }

    public VideoInfo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("5c4fa617", new Object[]{this});
        }
        ux9 ux9Var = this.b;
        if (ux9Var == null || ux9Var.g() == null) {
            return null;
        }
        return this.b.g().a();
    }

    public kq1(Context context, ux9 ux9Var, ActionInfo actionInfo, ClientCtlInfo clientCtlInfo) {
        this.f22845a = context;
        this.b = ux9Var;
        this.c = actionInfo;
        this.d = clientCtlInfo;
    }
}
