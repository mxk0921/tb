package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.MessageQueue;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import tb.b5m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u5m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f29161a;
        public final /* synthetic */ b5m.x b;
        public final /* synthetic */ String c;

        public a(Context context, b5m.x xVar, String str) {
            this.f29161a = context;
            this.b = xVar;
            this.c = str;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            if (!pq4.a(this.f29161a) && !tq4.e(this.f29161a)) {
                this.b.b(this.f29161a, this.c);
            }
            return false;
        }
    }

    static {
        t2o.a(912262829);
    }

    public static Drawable a(boolean z, boolean z2) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("67964054", new Object[]{new Boolean(z), new Boolean(z2)});
        }
        b5m.x R = b5m.R();
        if (R != null) {
            drawable = R.e(z, z2);
        } else {
            drawable = null;
        }
        if (drawable == null) {
            return new v0q();
        }
        return drawable;
    }

    public static Drawable b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("90f4026f", new Object[0]);
        }
        b5m.x R = b5m.R();
        if (R != null) {
            return R.a();
        }
        return null;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52c9c892", new Object[0])).intValue();
        }
        b5m.x R = b5m.R();
        if (R != null) {
            return R.h();
        }
        return mr7.a(8.0f);
    }

    public static Drawable d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("c1d05e48", new Object[0]);
        }
        b5m.x R = b5m.R();
        if (R != null) {
            return R.c();
        }
        return null;
    }

    public static Drawable e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("78b49f8f", new Object[0]);
        }
        b5m.x R = b5m.R();
        if (R != null) {
            return R.g();
        }
        return null;
    }

    public static Drawable f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("d7fd5f6", new Object[0]);
        }
        b5m.x R = b5m.R();
        if (R != null) {
            return R.d();
        }
        return null;
    }

    public static Drawable g(boolean z, boolean z2) {
        Drawable drawable;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("127fe6f7", new Object[]{new Boolean(z), new Boolean(z2)});
        }
        b5m.x R = b5m.R();
        if (R != null) {
            drawable = R.i(z, z2);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        if (z) {
            f = 0.0f;
        } else if (nj7.e()) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        return new x0q().f(f);
    }

    public static boolean h(Context context, String str) {
        b5m.x R;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d07d73d", new Object[]{context, str})).booleanValue();
        }
        if (Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sDisableAllPreload)) || (R = b5m.R()) == null) {
            return false;
        }
        Looper.myQueue().addIdleHandler(new a(context, R, str));
        return true;
    }
}
