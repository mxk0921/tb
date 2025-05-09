package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kct implements Closeable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int OPEN_DELETE = 4;
    public static final int OPEN_READ = 1;
    public static final String TAG = "TarFile";

    /* renamed from: a  reason: collision with root package name */
    public File f22571a;
    public RandomAccessFile b;
    public final MappedByteBuffer c;
    public ict d;
    public long e;
    public long f;

    static {
        t2o.a(843055306);
    }

    public kct(String str) {
        this(new File(str), 1);
    }

    public void A() throws IOException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7313091b", new Object[]{this});
            return;
        }
        long j = this.f;
        long j2 = 0;
        if (j > 0 && (i = (int) (j % 512)) > 0) {
            while (true) {
                long j3 = 512 - i;
                if (j2 < j3) {
                    j2 += skip(j3 - j2);
                } else {
                    return;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        RandomAccessFile randomAccessFile = this.b;
        if (randomAccessFile != null) {
            synchronized (randomAccessFile) {
                vas.b(this.c);
                this.b = null;
                randomAccessFile.close();
            }
            File file = this.f22571a;
            if (file != null) {
                file.delete();
                this.f22571a = null;
            }
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6530e2fe", new Object[]{this});
        } else if (this.b == null) {
            throw new IllegalStateException("Tar file closed");
        }
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            super.finalize();
        } catch (Throwable th) {
            throw new AssertionError(th);
        }
    }

    public void g() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9dbb098", new Object[]{this});
            return;
        }
        ict ictVar = this.d;
        if (ictVar != null) {
            if (ictVar.b() > this.e) {
                long j = 0;
                while (j < this.d.b() - this.e) {
                    long skip = skip((this.d.b() - this.e) - j);
                    if (skip != 0 || this.d.b() - this.e <= 0) {
                        j += skip;
                    } else {
                        throw new IOException("Possible tar file corruption");
                    }
                }
            }
            this.d = null;
            this.e = 0L;
            A();
        }
    }

    public int read(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue() : read(bArr, 0, bArr.length);
    }

    public long skip(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a0434f2", new Object[]{this, new Long(j)})).longValue();
        }
        if (j <= 0) {
            return 0L;
        }
        byte[] c = vas.c(2048);
        long j2 = j;
        while (j2 > 0) {
            long j3 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
            if (j2 < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) {
                j3 = j2;
            }
            int read = read(c, 0, (int) j3);
            if (read < 0) {
                break;
            }
            j2 -= read;
        }
        vas.h(c);
        return j - j2;
    }

    public ict w() throws IOException {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ict) ipChange.ipc$dispatch("ff15a60d", new Object[]{this});
        }
        e();
        g();
        byte[] c = vas.c(512);
        try {
            this.c.get(c, 0, 512);
        } catch (BufferUnderflowException unused) {
        }
        int length = c.length;
        while (true) {
            if (i >= length) {
                break;
            } else if (c[i] != 0) {
                this.d = new ict(c);
                break;
            } else {
                i++;
            }
        }
        vas.h(c);
        return this.d;
    }

    public kct(File file, int i) {
        String path = file.getPath();
        if (i == 1 || i == 5) {
            if ((i & 4) != 0) {
                this.f22571a = file;
                file.deleteOnExit();
            } else {
                this.f22571a = null;
            }
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
                this.b = randomAccessFile;
                this.c = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, this.b.length());
            } catch (Throwable unused) {
                vas.b(this.c);
                vas.a(this.b);
            }
        } else {
            throw new IllegalArgumentException("Bad mode: " + i);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        e();
        ict ictVar = this.d;
        if (ictVar != null) {
            if (this.e == ictVar.b()) {
                return -1;
            }
            if (this.d.b() - this.e < i2) {
                i2 = (int) (this.d.b() - this.e);
            }
        }
        try {
            this.c.get(bArr, i, i2);
            i3 = i2;
        } catch (BufferUnderflowException unused) {
            i3 = -1;
        }
        if (i3 != -1) {
            if (this.d != null) {
                this.e += i2;
            }
            this.f += i2;
            return i2;
        }
        throw new IOException();
    }
}
