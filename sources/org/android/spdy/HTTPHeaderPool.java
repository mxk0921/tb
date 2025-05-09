package org.android.spdy;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HTTPHeaderPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final HTTPHeaderPool instance = new HTTPHeaderPool();
    private final LruCache<ByteBuffer, String> lruCache = new LruCache<>(128);

    private HTTPHeaderPool() {
    }

    public static HTTPHeaderPool getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HTTPHeaderPool) ipChange.ipc$dispatch("d2f45b00", new Object[0]);
        }
        return instance;
    }

    public String GetValueString(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac16fb82", new Object[]{this, byteBuffer});
        }
        String str = this.lruCache.get(byteBuffer);
        if (str != null) {
            return str;
        }
        try {
            str = new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.lruCache.put(byteBuffer, str);
        return str;
    }
}
