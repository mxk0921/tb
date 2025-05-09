package tb;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class kat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BaseFrame f22518a;
    public final BaseFrame b;
    public final ViewGroup c;
    public final k0e d;
    public final Context e;
    public final TBLiveDataModel f;
    public boolean g;
    public final a h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    static {
        t2o.a(779092706);
    }

    public kat(BaseFrame baseFrame, ViewGroup viewGroup, k0e k0eVar, Context context, TBLiveDataModel tBLiveDataModel, boolean z, a aVar) {
        this.b = baseFrame;
        this.c = viewGroup;
        this.d = k0eVar;
        this.e = context;
        this.f = tBLiveDataModel;
        this.g = z;
        this.h = aVar;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("daeee9c7", new Object[]{this})).intValue();
        }
        return (gw0.d() * 9) / 16;
    }

    public void b(boolean z, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a353913", new Object[]{this, new Boolean(z), ux9Var});
            return;
        }
        up6.O0(z, ux9Var);
        if (z) {
            if (((Activity) this.e).getRequestedOrientation() == 1) {
                ((Activity) this.e).setRequestedOrientation(0);
            }
        } else if (((Activity) this.e).getRequestedOrientation() == 0) {
            ((Activity) this.e).setRequestedOrientation(1);
        }
    }

    public abstract void c(ux9 ux9Var);
}
