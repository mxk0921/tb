package com.alipay.android.phone.mobilesdk.socketcraft;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SocketChannelIOHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Removed duplicated region for block: B:41:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean batch(com.alipay.android.phone.mobilesdk.socketcraft.WebSocketImpl r5, java.nio.channels.ByteChannel r6) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.android.phone.mobilesdk.socketcraft.SocketChannelIOHelper.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "fc48f147"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r5 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x001c:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r5.outQueue
            java.lang.Object r2 = r2.peek()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            if (r2 != 0) goto L_0x0037
            boolean r2 = r6 instanceof com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
            if (r2 == 0) goto L_0x0050
            r2 = r6
            com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel r2 = (com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel) r2
            boolean r3 = r2.isNeedWrite()
            if (r3 == 0) goto L_0x0051
            r2.writeMore()
            goto L_0x0051
        L_0x0037:
            r6.write(r2)
            int r2 = r2.remaining()
            if (r2 <= 0) goto L_0x0041
            return r1
        L_0x0041:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r5.outQueue
            r2.poll()
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r5.outQueue
            java.lang.Object r2 = r2.peek()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            if (r2 != 0) goto L_0x0037
        L_0x0050:
            r2 = 0
        L_0x0051:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r3 = r5.outQueue
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0084
            boolean r3 = r5.isFlushAndClose()
            if (r3 == 0) goto L_0x0084
            com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft r3 = r5.getDraft()
            if (r3 == 0) goto L_0x0084
            com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft r3 = r5.getDraft()
            com.alipay.android.phone.mobilesdk.socketcraft.WebSocket$Role r3 = r3.getRole()
            if (r3 == 0) goto L_0x0084
            com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft r3 = r5.getDraft()
            com.alipay.android.phone.mobilesdk.socketcraft.WebSocket$Role r3 = r3.getRole()
            com.alipay.android.phone.mobilesdk.socketcraft.WebSocket$Role r4 = com.alipay.android.phone.mobilesdk.socketcraft.WebSocket.Role.SERVER
            if (r3 != r4) goto L_0x0084
            monitor-enter(r5)
            r5.closeConnection()     // Catch: all -> 0x0081
            monitor-exit(r5)     // Catch: all -> 0x0081
            goto L_0x0084
        L_0x0081:
            r6 = move-exception
            monitor-exit(r5)     // Catch: all -> 0x0081
            throw r6
        L_0x0084:
            if (r2 == 0) goto L_0x008f
            com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel r6 = (com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel) r6
            boolean r5 = r6.isNeedWrite()
            if (r5 == 0) goto L_0x008f
            return r1
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mobilesdk.socketcraft.SocketChannelIOHelper.batch(com.alipay.android.phone.mobilesdk.socketcraft.WebSocketImpl, java.nio.channels.ByteChannel):boolean");
    }

    public static boolean read(ByteBuffer byteBuffer, WebSocketImpl webSocketImpl, ByteChannel byteChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("121c5e94", new Object[]{byteBuffer, webSocketImpl, byteChannel})).booleanValue();
        }
        byteBuffer.clear();
        int read = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (read == -1) {
            webSocketImpl.eot();
            return false;
        } else if (read != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean readMore(ByteBuffer byteBuffer, WebSocketImpl webSocketImpl, WrappedByteChannel wrappedByteChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82a7f846", new Object[]{byteBuffer, webSocketImpl, wrappedByteChannel})).booleanValue();
        }
        byteBuffer.clear();
        int readMore = wrappedByteChannel.readMore(byteBuffer);
        byteBuffer.flip();
        if (readMore != -1) {
            return wrappedByteChannel.isNeedRead();
        }
        webSocketImpl.eot();
        return false;
    }
}
