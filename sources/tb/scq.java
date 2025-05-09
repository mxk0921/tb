package tb;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.split.core.splitinstall.SplitLoaderHolder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class scq extends hjq<bdq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static scq k;
    public final Handler i = new Handler(Looper.getMainLooper());
    public final kdq j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bdq f27953a;

        public a(bdq bdqVar) {
            this.f27953a = bdqVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                scq.this.e(this.f27953a);
            }
        }
    }

    static {
        t2o.a(677380253);
    }

    public scq(Context context, kdq kdqVar) {
        super((wnc) d62.b(wnc.class, "SplitInstallListenerRegistry"), new IntentFilter("com.alibaba.android.split.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.j = kdqVar;
    }

    public static /* synthetic */ Object ipc$super(scq scqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/splitinstall/SplitInstallListenerRegistry");
    }

    public static synchronized scq j(Context context) {
        synchronized (scq.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (scq) ipChange.ipc$dispatch("f88526a9", new Object[]{context});
            }
            if (k == null) {
                k = new scq(context, SplitLoaderHolder.INSTANCE);
            }
            return k;
        }
    }

    public static void l(scq scqVar, bdq bdqVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26686a2", new Object[]{scqVar, bdqVar, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            scqVar.m(bdqVar, i, i2, i3);
        }
    }

    public wnc k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wnc) ipChange.ipc$dispatch("531d6508", new Object[]{this});
        }
        return this.f20686a;
    }

    public final void m(bdq bdqVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27472ce", new Object[]{this, bdqVar, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.i.post(new ijq(this, bdqVar, i, i2, i3));
        bcq.a().c(new cdq(bdqVar.h(), i, i2, i3, bdqVar.a(), bdqVar.j(), bdqVar.f(), bdqVar.e(), bdqVar.g(), (ArrayList) bdqVar.d()));
    }

    @Override // tb.hjq
    public final void d(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("163710fe", new Object[]{this, context, intent});
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra != null) {
            bdq k2 = cdq.k(bundleExtra);
            gdq gdqVar = this.j.get();
            if (k2.i() == 3 && gdqVar != null) {
                e(k2);
                if (acq.p().h) {
                    gdqVar.load(k2.d(), new um8(this, k2, intent, context));
                } else {
                    acq.p().h = true;
                }
            } else if (k2.i() != 12) {
                if (k2.i() == 5 || k2.i() == 6) {
                    this.i.post(new a(k2));
                } else {
                    e(k2);
                }
            }
        }
    }
}
