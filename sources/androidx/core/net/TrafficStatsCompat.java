package androidx.core.net;

import android.net.TrafficStats;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TrafficStatsCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static void tagDatagramSocket(DatagramSocket datagramSocket) throws SocketException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb12ae39", new Object[]{datagramSocket});
            } else {
                TrafficStats.tagDatagramSocket(datagramSocket);
            }
        }

        public static void untagDatagramSocket(DatagramSocket datagramSocket) throws SocketException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2b1912", new Object[]{datagramSocket});
            } else {
                TrafficStats.untagDatagramSocket(datagramSocket);
            }
        }
    }

    private TrafficStatsCompat() {
    }

    @Deprecated
    public static void clearThreadStatsTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cb15d9", new Object[0]);
        } else {
            TrafficStats.clearThreadStatsTag();
        }
    }

    @Deprecated
    public static int getThreadStatsTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7401e95", new Object[0])).intValue();
        }
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void incrementOperationCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed012c85", new Object[]{new Integer(i)});
        } else {
            TrafficStats.incrementOperationCount(i);
        }
    }

    @Deprecated
    public static void setThreadStatsTag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f08e815", new Object[]{new Integer(i)});
        } else {
            TrafficStats.setThreadStatsTag(i);
        }
    }

    public static void tagDatagramSocket(DatagramSocket datagramSocket) throws SocketException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb12ae39", new Object[]{datagramSocket});
        } else if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.tagDatagramSocket(datagramSocket);
        } else {
            ParcelFileDescriptor fromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
            TrafficStats.tagSocket(new DatagramSocketWrapper(datagramSocket, fromDatagramSocket.getFileDescriptor()));
            fromDatagramSocket.detachFd();
        }
    }

    @Deprecated
    public static void tagSocket(Socket socket) throws SocketException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38cd2fb", new Object[]{socket});
        } else {
            TrafficStats.tagSocket(socket);
        }
    }

    public static void untagDatagramSocket(DatagramSocket datagramSocket) throws SocketException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2b1912", new Object[]{datagramSocket});
        } else if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.untagDatagramSocket(datagramSocket);
        } else {
            ParcelFileDescriptor fromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
            TrafficStats.untagSocket(new DatagramSocketWrapper(datagramSocket, fromDatagramSocket.getFileDescriptor()));
            fromDatagramSocket.detachFd();
        }
    }

    @Deprecated
    public static void untagSocket(Socket socket) throws SocketException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da00fd4", new Object[]{socket});
        } else {
            TrafficStats.untagSocket(socket);
        }
    }

    @Deprecated
    public static void incrementOperationCount(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b324d71e", new Object[]{new Integer(i), new Integer(i2)});
        } else {
            TrafficStats.incrementOperationCount(i, i2);
        }
    }
}
