package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class krf extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ByteBuffer K = ByteBuffer.allocate(0);
    public final BlockingQueue<ByteBuffer> J = new LinkedBlockingQueue(4096);

    static {
        t2o.a(150994946);
    }

    public krf(JSONReader.c cVar) {
        super(cVar, false);
        cVar.c();
    }

    public static /* synthetic */ Object ipc$super(krf krfVar, String str, Object... objArr) {
        if (str.hashCode() == 2028866241) {
            return krfVar.x3();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/streamjson/JSONStreamByteReaderUTF8");
    }

    public boolean G3(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f0cd54", new Object[]{this, byteBuffer})).booleanValue();
        }
        return ((LinkedBlockingQueue) this.J).offer(byteBuffer);
    }

    @Override // com.alibaba.fastjson2.a
    public void D3() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ed975c", new Object[]{this});
        } else if (!this.F) {
            try {
                ByteBuffer byteBuffer = (ByteBuffer) ((LinkedBlockingQueue) this.J).take();
                if (byteBuffer == this.K) {
                    this.F = true;
                    int i2 = this.E;
                    this.x = i2;
                    this.y = i2;
                    return;
                }
                int capacity = byteBuffer.capacity() - (this.G.length - this.E);
                if (capacity > 0) {
                    this.f2453a.getClass();
                    if (capacity > 524288) {
                        i = this.G.length + capacity;
                    } else {
                        int length = this.G.length;
                        this.f2453a.getClass();
                        i = 524288 + length;
                    }
                    this.G = Arrays.copyOf(this.G, i);
                }
                byteBuffer.get(this.G, this.E, byteBuffer.capacity());
                this.E += byteBuffer.capacity();
            } catch (Exception e) {
                throw new JSONException("read error", e);
            }
        }
    }
}
