package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class oct extends FilterInputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ict f25303a;
    public long b = 0;
    public long c = 0;

    static {
        t2o.a(843055308);
    }

    public oct(InputStream inputStream) {
        super(inputStream);
    }

    public static /* synthetic */ Object ipc$super(oct octVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 862063607) {
            return new Integer(super.read((byte[]) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        }
        if (hashCode == 2047096050) {
            return new Long(super.skip(((Number) objArr[0]).longValue()));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/open/packages/parser/tar/TarInputStream");
    }

    public void e() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9dbb098", new Object[]{this});
            return;
        }
        ict ictVar = this.f25303a;
        if (ictVar != null) {
            if (ictVar.b() > this.b) {
                long j = 0;
                while (j < this.f25303a.b() - this.b) {
                    long skip = skip((this.f25303a.b() - this.b) - j);
                    if (skip != 0 || this.f25303a.b() - this.b <= 0) {
                        j += skip;
                    } else {
                        throw new IOException("Possible tar file corruption");
                    }
                }
            }
            this.f25303a = null;
            this.b = 0L;
            w();
        }
    }

    public ict g() throws IOException {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ict) ipChange.ipc$dispatch("ff15a60d", new Object[]{this});
        }
        e();
        byte[] c = vas.c(512);
        byte[] c2 = vas.c(512);
        int i2 = 0;
        while (i2 < 512) {
            int read = read(c2, 0, 512 - i2);
            if (read < 0) {
                break;
            }
            System.arraycopy(c2, 0, c, i2, read);
            i2 += read;
        }
        int length = c.length;
        while (true) {
            if (i >= length) {
                break;
            } else if (c[i] != 0) {
                this.f25303a = new ict(c);
                break;
            } else {
                i++;
            }
        }
        vas.h(c);
        vas.h(c2);
        return this.f25303a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52db0af", new Object[]{this, new Integer(i)});
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f11b06c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        return read != -1 ? bArr[0] & 255 : read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            throw new IOException("mark/reset not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
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

    public void w() throws IOException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7313091b", new Object[]{this});
            return;
        }
        long j = this.c;
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        ict ictVar = this.f25303a;
        if (ictVar != null) {
            if (this.b == ictVar.b()) {
                return -1;
            }
            if (this.f25303a.b() - this.b < i2) {
                i2 = (int) (this.f25303a.b() - this.b);
            }
        }
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            if (this.f25303a != null) {
                this.b += read;
            }
            this.c += read;
        }
        return read;
    }
}
