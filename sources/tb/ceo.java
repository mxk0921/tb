package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ceo extends deo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean i;
    public final FileChannel j;
    public final long k;
    public final FileDescriptor l;

    static {
        t2o.a(618659879);
    }

    public ceo(FileInputStream fileInputStream, int i) {
        super(fileInputStream, 0);
        this.j = fileInputStream.getChannel();
        try {
            this.l = fileInputStream.getFD();
        } catch (IOException unused) {
        }
        this.k = -1L;
        FileChannel fileChannel = this.j;
        if (fileChannel != null) {
            try {
                this.k = fileChannel.position();
            } catch (IOException unused2) {
            }
        }
        boolean w = w(null);
        this.i = w;
        if (!w) {
            g(i);
        } else if (this.l != null) {
            resetInputType(2);
        }
    }

    public static /* synthetic */ Object ipc$super(ceo ceoVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -868736240:
                return new Integer(super.read());
            case 85597122:
                super.rewind();
                return null;
            case 745104438:
                return new Integer(super.getBufferLength());
            case 862063607:
                return new Integer(super.read((byte[]) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/pexode/entity/RewindableFileInputStream");
        }
    }

    @Override // tb.deo, com.taobao.pexode.entity.RewindableStream
    public int getBufferLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c696436", new Object[]{this})).intValue();
        }
        try {
            if (this.j.size() > 0) {
                return (int) this.j.size();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.getBufferLength();
    }

    @Override // tb.deo, com.taobao.pexode.entity.RewindableStream
    public FileDescriptor getFD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileDescriptor) ipChange.ipc$dispatch("141de563", new Object[]{this});
        }
        return this.l;
    }

    @Override // tb.deo, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        if (this.i) {
            return this.f17760a.read(bArr, i, i2);
        }
        return super.read(bArr, i, i2);
    }

    @Override // tb.deo, com.taobao.pexode.entity.RewindableStream
    public void rewindAndSetBufferSize(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e5fb15", new Object[]{this, new Integer(i)});
            return;
        }
        rewind();
        g(i);
    }

    public final boolean w(IOException[] iOExceptionArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec904766", new Object[]{this, iOExceptionArr})).booleanValue();
        }
        long j = this.k;
        if (j >= 0) {
            try {
                this.j.position(j);
                return true;
            } catch (IOException e) {
                if (iOExceptionArr != null && iOExceptionArr.length > 0) {
                    iOExceptionArr[0] = e;
                }
            }
        }
        return false;
    }

    @Override // tb.deo, com.taobao.pexode.entity.RewindableStream
    public void rewind() throws IOException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a1bc2", new Object[]{this});
        } else if (!this.i) {
            super.rewind();
        } else if (!this.h) {
            IOException[] iOExceptionArr = new IOException[1];
            if (!w(iOExceptionArr)) {
                IOException iOException = iOExceptionArr[0];
                StringBuilder sb = new StringBuilder("cannot rewind cause file stream reposition(");
                sb.append(this.k);
                sb.append(":");
                sb.append(this.l);
                sb.append(") failed, detail=");
                if (iOException != null) {
                    str = iOException.getMessage();
                } else {
                    str = "null";
                }
                sb.append(str);
                sb.append(f7l.AND_NOT);
                throw new IOException(sb.toString());
            }
        } else {
            throw new IOException("cannot rewind cause file stream has been closed!");
        }
    }

    @Override // tb.deo, java.io.InputStream
    public int read() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        if (this.i) {
            return this.f17760a.read();
        }
        return super.read();
    }
}
