package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import org.java_websocket.b;
import org.java_websocket.drafts.Draft;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class h97 implements d1x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        }
    }

    public b b(j0x j0xVar, List<Draft> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d212f8fa", new Object[]{this, j0xVar, list});
        }
        return new b(j0xVar, list);
    }

    /* renamed from: d */
    public SocketChannel c(SocketChannel socketChannel, SelectionKey selectionKey) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SocketChannel) ipChange.ipc$dispatch("4ea8f05", new Object[]{this, socketChannel, selectionKey});
        }
        return socketChannel;
    }
}
