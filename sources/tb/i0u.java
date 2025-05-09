package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class i0u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile i0u b;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f21025a = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f21026a;
        public final /* synthetic */ CharSequence b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        public a(Context context, CharSequence charSequence, int i, int i2, int i3, int i4) {
            this.f21026a = context;
            this.b = charSequence;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                i0u.a(i0u.this, this.f21026a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    static {
        t2o.a(481297698);
    }

    public static /* synthetic */ void a(i0u i0uVar, Context context, CharSequence charSequence, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c08ea1", new Object[]{i0uVar, context, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            i0uVar.c(context, charSequence, i, i2, i3, i4);
        }
    }

    public static i0u b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0u) ipChange.ipc$dispatch("68cd0b38", new Object[0]);
        }
        if (b == null) {
            synchronized (i0u.class) {
                try {
                    if (b == null) {
                        b = new i0u();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static void f(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e920f2af", new Object[]{context, str, new Integer(i)});
        } else {
            b().c(context, str, i, 17, 0, 0);
        }
    }

    public final void c(Context context, CharSequence charSequence, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17719411", new Object[]{this, context, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            Toast makeText = Toast.makeText(context, charSequence, i);
            makeText.setGravity(i2, i3, i4);
            makeText.show();
        } else {
            this.f21025a.post(new a(context, charSequence, i, i2, i3, i4));
        }
    }

    public void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1b2e41", new Object[]{this, context, str});
        } else {
            c(context, str, 0, 17, 0, 0);
        }
    }

    public void e(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994b0ce2", new Object[]{this, context, str, new Integer(i)});
        } else {
            c(context, str, i, 17, 0, 0);
        }
    }
}
