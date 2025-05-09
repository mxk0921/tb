package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.zip.Checksum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vtx implements Checksum {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long[] b = new long[256];

    /* renamed from: a  reason: collision with root package name */
    public long f30254a = 0;

    static {
        for (int i = 0; i < 256; i++) {
            long j = i;
            for (int i2 = 0; i2 < 8; i2++) {
                if ((j & 1) == 1) {
                    j = (j >>> 1) ^ (-3932672073523589310L);
                } else {
                    j >>>= 1;
                }
            }
            b[i] = j;
        }
    }

    public void a(byte b2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8217954", new Object[]{this, new Byte(b2)});
            return;
        }
        long j = ~this.f30254a;
        this.f30254a = j;
        this.f30254a = ~((j >>> 8) ^ b[((int) (b2 ^ j)) & 255]);
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b6", new Object[]{this})).longValue();
        }
        return this.f30254a;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.f30254a = 0L;
        }
    }

    @Override // java.util.zip.Checksum
    public void update(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafc5c33", new Object[]{this, new Integer(i)});
        } else {
            a((byte) (i & 255));
        }
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd800837", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        while (i2 > 0) {
            i++;
            a(bArr[i]);
            i2--;
        }
    }
}
