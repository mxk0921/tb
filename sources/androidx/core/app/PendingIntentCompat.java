package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.app.PendingIntentCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.UCExtension;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PendingIntentCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static void send(PendingIntent pendingIntent, Context context, int i, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String str, Bundle bundle) throws PendingIntent.CanceledException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96852756", new Object[]{pendingIntent, context, new Integer(i), intent, onFinished, handler, str, bundle});
            } else {
                pendingIntent.send(context, i, intent, onFinished, handler, str, bundle);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static PendingIntent getForegroundService(Context context, int i, Intent intent, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PendingIntent) ipChange.ipc$dispatch("bc1f47d4", new Object[]{context, new Integer(i), intent, new Integer(i2)});
            }
            return ya.f(context, i, intent, i2);
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface Flags {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class GatedCallback implements Closeable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private PendingIntent.OnFinished mCallback;
        private final CountDownLatch mComplete = new CountDownLatch(1);
        private boolean mSuccess = false;

        public GatedCallback(PendingIntent.OnFinished onFinished) {
            this.mCallback = onFinished;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b83b780", new Object[]{this, pendingIntent, intent, new Integer(i), str, bundle});
                return;
            }
            while (true) {
                try {
                    this.mComplete.await();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            PendingIntent.OnFinished onFinished = this.mCallback;
            if (onFinished != null) {
                onFinished.onSendFinished(pendingIntent, intent, i, str, bundle);
                this.mCallback = null;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                return;
            }
            if (!this.mSuccess) {
                this.mCallback = null;
            }
            this.mComplete.countDown();
        }

        public PendingIntent.OnFinished getCallback() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PendingIntent.OnFinished) ipChange.ipc$dispatch("95f6a6d3", new Object[]{this});
            }
            if (this.mCallback == null) {
                return null;
            }
            return new PendingIntent.OnFinished() { // from class: tb.ewl
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
                    PendingIntentCompat.GatedCallback.this.onSendFinished(pendingIntent, intent, i, str, bundle);
                }
            };
        }

        public void complete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77d7140", new Object[]{this});
            } else {
                this.mSuccess = true;
            }
        }
    }

    private PendingIntentCompat() {
    }

    private static int addMutabilityFlags(boolean z, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3b63dd1", new Object[]{new Boolean(z), new Integer(i)})).intValue();
        }
        if (z) {
            if (Build.VERSION.SDK_INT < 31) {
                return i;
            }
            i2 = UCExtension.EXTEND_INPUT_TYPE_IDCARD;
        } else if (Build.VERSION.SDK_INT < 23) {
            return i;
        } else {
            i2 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        return i | i2;
    }

    public static PendingIntent getActivities(Context context, int i, Intent[] intentArr, int i2, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PendingIntent) ipChange.ipc$dispatch("e4a333c2", new Object[]{context, new Integer(i), intentArr, new Integer(i2), bundle, new Boolean(z)}) : ya.b(context, i, intentArr, addMutabilityFlags(z, i2), bundle);
    }

    public static PendingIntent getActivity(Context context, int i, Intent intent, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PendingIntent) ipChange.ipc$dispatch("546076e1", new Object[]{context, new Integer(i), intent, new Integer(i2), new Boolean(z)}) : ya.c(context, i, intent, addMutabilityFlags(z, i2));
    }

    public static PendingIntent getBroadcast(Context context, int i, Intent intent, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("129d5ae7", new Object[]{context, new Integer(i), intent, new Integer(i2), new Boolean(z)});
        }
        return ya.e(context, i, intent, addMutabilityFlags(z, i2));
    }

    public static PendingIntent getForegroundService(Context context, int i, Intent intent, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("d48b89d8", new Object[]{context, new Integer(i), intent, new Integer(i2), new Boolean(z)});
        }
        return Api26Impl.getForegroundService(context, i, intent, addMutabilityFlags(z, i2));
    }

    public static PendingIntent getService(Context context, int i, Intent intent, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("2483ae5b", new Object[]{context, new Integer(i), intent, new Integer(i2), new Boolean(z)});
        }
        return ya.g(context, i, intent, addMutabilityFlags(z, i2));
    }

    public static void send(PendingIntent pendingIntent, int i, PendingIntent.OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70f1185", new Object[]{pendingIntent, new Integer(i), onFinished, handler});
            return;
        }
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            pendingIntent.send(i, gatedCallback.getCallback(), handler);
            gatedCallback.complete();
            gatedCallback.close();
        } catch (Throwable th) {
            try {
                gatedCallback.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static PendingIntent getActivities(Context context, int i, Intent[] intentArr, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PendingIntent) ipChange.ipc$dispatch("42266d2a", new Object[]{context, new Integer(i), intentArr, new Integer(i2), new Boolean(z)}) : ya.a(context, i, intentArr, addMutabilityFlags(z, i2));
    }

    public static PendingIntent getActivity(Context context, int i, Intent intent, int i2, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PendingIntent) ipChange.ipc$dispatch("6962c8ab", new Object[]{context, new Integer(i), intent, new Integer(i2), bundle, new Boolean(z)}) : ya.d(context, i, intent, addMutabilityFlags(z, i2), bundle);
    }

    public static void send(PendingIntent pendingIntent, Context context, int i, Intent intent, PendingIntent.OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4cc3f4", new Object[]{pendingIntent, context, new Integer(i), intent, onFinished, handler});
        } else {
            send(pendingIntent, context, i, intent, onFinished, handler, null, null);
        }
    }

    public static void send(PendingIntent pendingIntent, Context context, int i, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String str, Bundle bundle) throws PendingIntent.CanceledException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96852756", new Object[]{pendingIntent, context, new Integer(i), intent, onFinished, handler, str, bundle});
            return;
        }
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Api23Impl.send(pendingIntent, context, i, intent, onFinished, handler, str, bundle);
            } else {
                pendingIntent.send(context, i, intent, gatedCallback.getCallback(), handler, str);
            }
            gatedCallback.complete();
            gatedCallback.close();
        } catch (Throwable th) {
            try {
                gatedCallback.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
