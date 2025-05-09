package tb;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class lat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BaseFrame f23215a;
    public final BaseFrame b;
    public final ViewGroup c;
    public final k0e d;
    public final Context e;
    public TBLiveDataModel f;
    public boolean g;
    public final a h;
    public final ux9 i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    static {
        t2o.a(779092918);
    }

    public lat(BaseFrame baseFrame, ViewGroup viewGroup, k0e k0eVar, Context context, TBLiveDataModel tBLiveDataModel, boolean z, ux9 ux9Var, a aVar) {
        this.b = baseFrame;
        this.c = viewGroup;
        this.d = k0eVar;
        this.e = context;
        this.f = tBLiveDataModel;
        this.g = z;
        this.i = ux9Var;
        this.h = aVar;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("daeee9c7", new Object[]{this})).intValue();
        }
        return (hw0.h() * 9) / 16;
    }

    public BaseFrame b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("438c581d", new Object[]{this});
        }
        return this.f23215a;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95cfaaeb", new Object[]{this, new Boolean(z)});
            return;
        }
        up6.O0(z, this.i);
        if (z) {
            if (((Activity) this.e).getRequestedOrientation() == 1) {
                ((Activity) this.e).setRequestedOrientation(0);
            }
        } else if (((Activity) this.e).getRequestedOrientation() == 0) {
            ((Activity) this.e).setRequestedOrientation(1);
        }
        up6.O0(false, this.i);
    }

    public void d(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9513b1a3", new Object[]{this, tBLiveDataModel});
        } else {
            this.f = tBLiveDataModel;
        }
    }

    public abstract void e();
}
