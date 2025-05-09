package androidx.core.os;

import android.os.Build;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MessageCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean sTryIsAsynchronous = true;
    private static boolean sTrySetAsynchronous = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api22Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api22Impl() {
        }

        public static boolean isAsynchronous(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("af746cf0", new Object[]{message})).booleanValue();
            }
            return message.isAsynchronous();
        }

        public static void setAsynchronous(Message message, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9edbd730", new Object[]{message, new Boolean(z)});
            } else {
                message.setAsynchronous(z);
            }
        }
    }

    private MessageCompat() {
    }

    public static boolean isAsynchronous(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af746cf0", new Object[]{message})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 22) {
            return Api22Impl.isAsynchronous(message);
        }
        if (sTryIsAsynchronous) {
            try {
                return Api22Impl.isAsynchronous(message);
            } catch (NoSuchMethodError unused) {
                sTryIsAsynchronous = false;
            }
        }
        return false;
    }

    public static void setAsynchronous(Message message, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9edbd730", new Object[]{message, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 22) {
            Api22Impl.setAsynchronous(message, z);
        } else if (sTrySetAsynchronous) {
            try {
                Api22Impl.setAsynchronous(message, z);
            } catch (NoSuchMethodError unused) {
                sTrySetAsynchronous = false;
            }
        }
    }
}
