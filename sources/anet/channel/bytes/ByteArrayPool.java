package anet.channel.bytes;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ByteArrayPool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_POOL_SIZE = 524288;
    public static final String TAG = "awcn.ByteArrayPool";
    private final TreeSet<ByteArray> byteArrayPool = new TreeSet<>();
    private final ByteArray std = ByteArray.create(0);
    private final Random random = new Random();
    private long total = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class SingleInstance {
        public static ByteArrayPool instance = new ByteArrayPool();

        static {
            t2o.a(607125570);
        }
    }

    static {
        t2o.a(607125569);
    }

    public static ByteArrayPool getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArrayPool) ipChange.ipc$dispatch("d610ab49", new Object[0]);
        }
        return SingleInstance.instance;
    }

    public synchronized void refund(ByteArray byteArray) {
        int i;
        ByteArray byteArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cccc8c80", new Object[]{this, byteArray});
            return;
        }
        if (byteArray != null && (i = byteArray.bufferLength) < 524288) {
            this.total += i;
            this.byteArrayPool.add(byteArray);
            while (this.total > 524288) {
                if (this.random.nextBoolean()) {
                    byteArray2 = this.byteArrayPool.pollFirst();
                } else {
                    byteArray2 = this.byteArrayPool.pollLast();
                }
                this.total -= byteArray2.bufferLength;
            }
        }
    }

    public synchronized ByteArray retrieve(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArray) ipChange.ipc$dispatch("60db0c37", new Object[]{this, new Integer(i)});
        } else if (i >= 524288) {
            return ByteArray.create(i);
        } else {
            ByteArray byteArray = this.std;
            byteArray.bufferLength = i;
            ByteArray ceiling = this.byteArrayPool.ceiling(byteArray);
            if (ceiling == null) {
                ceiling = ByteArray.create(i);
            } else {
                Arrays.fill(ceiling.buffer, (byte) 0);
                ceiling.dataLength = 0;
                this.byteArrayPool.remove(ceiling);
                this.total -= ceiling.bufferLength;
            }
            return ceiling;
        }
    }

    public ByteArray retrieveAndCopy(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArray) ipChange.ipc$dispatch("e51071d2", new Object[]{this, bArr, new Integer(i)});
        }
        ByteArray retrieve = retrieve(i);
        System.arraycopy(bArr, 0, retrieve.buffer, 0, i);
        retrieve.dataLength = i;
        return retrieve;
    }

    public ByteArray retrieveAndCopy(ByteBuffer byteBuffer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArray) ipChange.ipc$dispatch("bf945a4e", new Object[]{this, byteBuffer, new Integer(i)});
        }
        ByteArray retrieve = retrieve(i);
        byteBuffer.get(retrieve.buffer, 0, i);
        retrieve.dataLength = i;
        return retrieve;
    }
}
