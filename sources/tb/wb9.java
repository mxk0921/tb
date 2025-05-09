package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.cache.library.ProxyCacheException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wb9 implements pr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TEMP_POSTFIX = ".download";

    /* renamed from: a  reason: collision with root package name */
    public final nq7 f30586a;
    public File b;
    public RandomAccessFile c;

    static {
        t2o.a(774897908);
        t2o.a(774897870);
    }

    public wb9(File file, nq7 nq7Var) throws IOException {
        File file2;
        String str;
        try {
            if (nq7Var != null) {
                this.f30586a = nq7Var;
                kh9.b(file.getParentFile());
                boolean exists = file.exists();
                if (exists) {
                    file2 = file;
                } else {
                    File parentFile = file.getParentFile();
                    file2 = new File(parentFile, file.getName() + TEMP_POSTFIX);
                }
                this.b = file2;
                File file3 = this.b;
                if (exists) {
                    str = "r";
                } else {
                    str = "rw";
                }
                this.c = new RandomAccessFile(file3, str);
                return;
            }
            throw new NullPointerException();
        } catch (IOException e) {
            throw new IOException("Error using file " + file + " as disc cache", e);
        }
    }

    @Override // tb.pr2
    public synchronized void a(byte[] bArr, int i) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5684d0db", new Object[]{this, bArr, new Integer(i)});
            return;
        }
        try {
            if (!isCompleted()) {
                this.c.seek(available());
                this.c.write(bArr, 0, i);
                return;
            }
            throw new ProxyCacheException("Error append cache: cache file " + this.b + " is completed!");
        } catch (IOException e) {
            throw new ProxyCacheException(String.format("Error writing %d bytes to %s from buffer with size %d", Integer.valueOf(i), this.c, Integer.valueOf(bArr.length)), e);
        }
    }

    @Override // tb.pr2
    public synchronized long available() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f9282c4", new Object[]{this})).longValue();
        }
        try {
            return this.c.length();
        } catch (IOException e) {
            throw new ProxyCacheException("Error reading length of file " + this.b, e);
        }
    }

    @Override // tb.pr2
    public synchronized int b(byte[] bArr, long j, int i) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33628056", new Object[]{this, bArr, new Long(j), new Integer(i)})).intValue();
        }
        try {
            this.c.seek(j);
            return this.c.read(bArr, 0, i);
        } catch (IOException e) {
            throw new ProxyCacheException(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(available()), Integer.valueOf(bArr.length)), e);
        }
    }

    public final boolean c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76b665fc", new Object[]{this, file})).booleanValue();
        }
        return file.getName().endsWith(TEMP_POSTFIX);
    }

    @Override // tb.pr2
    public synchronized void close() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        try {
            this.c.close();
            ((ymh) this.f30586a).e(this.b);
        } catch (IOException e) {
            throw new ProxyCacheException("Error closing file " + this.b, e);
        }
    }

    @Override // tb.pr2
    public synchronized boolean isCompleted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c6bb44c", new Object[]{this})).booleanValue();
        }
        return true ^ c(this.b);
    }

    @Override // tb.pr2
    public synchronized void complete() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77d7140", new Object[]{this});
        } else if (!isCompleted()) {
            close();
            File file = new File(this.b.getParentFile(), this.b.getName().substring(0, this.b.getName().length() - 9));
            if (this.b.renameTo(file)) {
                this.b = file;
                try {
                    this.c = new RandomAccessFile(this.b, "r");
                } catch (IOException e) {
                    throw new ProxyCacheException("Error opening " + this.b + " as disc cache", e);
                }
            } else {
                throw new ProxyCacheException("Error renaming file " + this.b + " to " + file + " for completion!");
            }
        }
    }
}
