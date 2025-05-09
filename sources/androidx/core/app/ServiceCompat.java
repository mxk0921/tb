package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ServiceCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_Q = 255;
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U = 1073745919;
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static void stopForeground(Service service, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a1c6755", new Object[]{service, new Integer(i)});
            } else {
                service.stopForeground(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static void startForeground(Service service, int i, Notification notification, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7482578", new Object[]{service, new Integer(i), notification, new Integer(i2)});
            } else if (i2 == 0 || i2 == -1) {
                service.startForeground(i, notification, i2);
            } else {
                service.startForeground(i, notification, i2 & 255);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api34Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api34Impl() {
        }

        public static void startForeground(Service service, int i, Notification notification, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7482578", new Object[]{service, new Integer(i), notification, new Integer(i2)});
            } else if (i2 == 0 || i2 == -1) {
                service.startForeground(i, notification, i2);
            } else {
                service.startForeground(i, notification, i2 & ServiceCompat.FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U);
            }
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
    }

    public static void startForeground(Service service, int i, Notification notification, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7482578", new Object[]{service, new Integer(i), notification, new Integer(i2)});
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            Api34Impl.startForeground(service, i, notification, i2);
        } else if (i3 >= 29) {
            Api29Impl.startForeground(service, i, notification, i2);
        } else {
            service.startForeground(i, notification);
        }
    }

    public static void stopForeground(Service service, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1c6755", new Object[]{service, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.stopForeground(service, i);
        } else {
            if ((i & 1) == 0) {
                z = false;
            }
            service.stopForeground(z);
        }
    }
}
