package org.java_websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import tb.ijx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class a {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(org.java_websocket.b r4, java.nio.channels.ByteChannel r5) throws java.io.IOException {
        /*
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.f15416a
            java.util.concurrent.LinkedBlockingQueue r0 = (java.util.concurrent.LinkedBlockingQueue) r0
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1 = 0
            if (r0 != 0) goto L_0x001e
            boolean r0 = r5 instanceof tb.ijx
            if (r0 == 0) goto L_0x003b
            r0 = r5
            tb.ijx r0 = (tb.ijx) r0
            boolean r2 = r0.isNeedWrite()
            if (r2 == 0) goto L_0x003c
            r0.writeMore()
            goto L_0x003c
        L_0x001e:
            r5.write(r0)
            int r0 = r0.remaining()
            if (r0 <= 0) goto L_0x0028
            return r1
        L_0x0028:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.f15416a
            java.util.concurrent.LinkedBlockingQueue r0 = (java.util.concurrent.LinkedBlockingQueue) r0
            r0.poll()
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.f15416a
            java.util.concurrent.LinkedBlockingQueue r0 = (java.util.concurrent.LinkedBlockingQueue) r0
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            if (r0 != 0) goto L_0x001e
        L_0x003b:
            r0 = 0
        L_0x003c:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r4.f15416a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x006f
            boolean r2 = r4.v()
            if (r2 == 0) goto L_0x006f
            org.java_websocket.drafts.Draft r2 = r4.getDraft()
            if (r2 == 0) goto L_0x006f
            org.java_websocket.drafts.Draft r2 = r4.getDraft()
            org.java_websocket.WebSocket$Role r2 = r2.m()
            if (r2 == 0) goto L_0x006f
            org.java_websocket.drafts.Draft r2 = r4.getDraft()
            org.java_websocket.WebSocket$Role r2 = r2.m()
            org.java_websocket.WebSocket$Role r3 = org.java_websocket.WebSocket.Role.SERVER
            if (r2 != r3) goto L_0x006f
            monitor-enter(r4)
            r4.e()     // Catch: all -> 0x006c
            monitor-exit(r4)     // Catch: all -> 0x006c
            goto L_0x006f
        L_0x006c:
            r5 = move-exception
            monitor-exit(r4)     // Catch: all -> 0x006c
            throw r5
        L_0x006f:
            if (r0 == 0) goto L_0x0079
            tb.ijx r5 = (tb.ijx) r5
            boolean r4 = r5.isNeedWrite()
            if (r4 != 0) goto L_0x007a
        L_0x0079:
            r1 = 1
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.java_websocket.a.a(org.java_websocket.b, java.nio.channels.ByteChannel):boolean");
    }

    public static boolean b(ByteBuffer byteBuffer, b bVar, ByteChannel byteChannel) throws IOException {
        byteBuffer.clear();
        int read = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (read == -1) {
            bVar.m();
            return false;
        } else if (read != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean c(ByteBuffer byteBuffer, b bVar, ijx ijxVar) throws IOException {
        byteBuffer.clear();
        int readMore = ijxVar.readMore(byteBuffer);
        byteBuffer.flip();
        if (readMore != -1) {
            return ijxVar.isNeedRead();
        }
        bVar.m();
        return false;
    }
}
