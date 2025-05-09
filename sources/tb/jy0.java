package tb;

import android.graphics.drawable.BitmapDrawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jy0 extends BitmapDrawable implements dy0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cy0 f22276a;

    static {
        t2o.a(502267912);
        t2o.a(503316569);
    }

    public jy0(cy0 cy0Var) {
        this.f22276a = cy0Var;
    }

    public static /* synthetic */ Object ipc$super(jy0 jy0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/adapter/impl/AnimationDrawable");
    }

    @Override // tb.dy0
    public BitmapDrawable a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("c5dfb3e1", new Object[]{this});
        }
        return this.f22276a;
    }

    @Override // tb.dy0
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4d5a73", new Object[]{this, new Integer(i)});
        } else {
            this.f22276a.B(i);
        }
    }

    @Override // tb.dy0
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.f22276a.C();
        }
    }

    @Override // tb.dy0
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            this.f22276a.D();
        }
    }
}
