package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cli implements mp6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer[] f17137a;
    public final long b;
    public long c;

    static {
        t2o.a(407896081);
        t2o.a(407896080);
    }

    public cli(File file, int i, int i2) throws IOException {
        long length = file.length();
        this.b = length;
        int i3 = ((int) (length / i)) + 1;
        this.f17137a = new ByteBuffer[i3];
        FileInputStream fileInputStream = new FileInputStream(file);
        long j = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            try {
                this.f17137a[i4] = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, j, Math.min(this.b - j, 1049600));
                this.f17137a[i4].order(mp6.HPROF_BYTE_ORDER);
                j += 1048576;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        }
        this.c = 0L;
        fileInputStream.close();
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return (int) (this.c / 1048576);
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7531f83", new Object[]{this})).intValue();
        }
        return (int) (this.c % 1048576);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71006f07", new Object[]{this})).booleanValue();
        }
        if (this.c < this.b) {
            return true;
        }
        return false;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f56124", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public void e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed244a4", new Object[]{this, bArr});
            return;
        }
        int a2 = a();
        this.f17137a[a2].position(b());
        if (bArr.length <= this.f17137a[a2].remaining()) {
            this.f17137a[a2].get(bArr, 0, bArr.length);
        } else {
            int position = 1048576 - this.f17137a[a2].position();
            this.f17137a[a2].get(bArr, 0, position);
            int length = bArr.length - position;
            int i = (1048575 + length) / 1048576;
            for (int i2 = 0; i2 < i; i2++) {
                int min = Math.min(length, 1048576);
                int i3 = a2 + 1 + i2;
                this.f17137a[i3].position(0);
                this.f17137a[i3].get(bArr, position, min);
                position += min;
                length -= min;
            }
        }
        this.c += bArr.length;
    }

    public byte f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a5be931", new Object[]{this})).byteValue();
        }
        byte b = this.f17137a[a()].get(b());
        this.c++;
        return b;
    }

    public float g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("104e47dd", new Object[]{this})).floatValue();
        }
        float f = this.f17137a[a()].getFloat(b());
        this.c += 4;
        return f;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4888f673", new Object[]{this})).intValue();
        }
        int i = this.f17137a[a()].getInt(b());
        this.c += 4;
        return i;
    }

    public long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e0874ad", new Object[]{this})).longValue();
        }
        long j = this.f17137a[a()].getLong(b());
        this.c += 8;
        return j;
    }

    public long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b5a4771", new Object[]{this})).longValue();
        }
        return this.b - this.c;
    }

    public cli(File file) throws IOException {
        this(file, 1048576, 1024);
    }
}
