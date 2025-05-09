package anet.channel.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ByteCounterInputStream extends InputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long cnt = 0;
    private InputStream is;

    static {
        t2o.a(607125934);
    }

    public ByteCounterInputStream(InputStream inputStream) {
        this.is = null;
        if (inputStream != null) {
            this.is = inputStream;
            return;
        }
        throw new NullPointerException("input stream cannot be null");
    }

    public static /* synthetic */ Object ipc$super(ByteCounterInputStream byteCounterInputStream, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/util/ByteCounterInputStream");
    }

    public long getReadByteCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45773f36", new Object[]{this})).longValue();
        }
        return this.cnt;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        this.cnt++;
        return this.is.read();
    }

    public ByteArrayOutputStream getByteArrayOutputStream(String str) {
        IOException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArrayOutputStream) ipChange.ipc$dispatch("903df488", new Object[]{this, str});
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                byte[] bArr = new byte[1024];
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = this.is.read(bArr);
                        if (read != -1) {
                            byteArrayOutputStream2.write(bArr, 0, read);
                        } else {
                            try {
                                break;
                            } catch (Throwable th) {
                                ALog.e("ByteCounterInputStream", "inputStream close fail, e=" + th.toString(), str, new Object[0]);
                                return byteArrayOutputStream2;
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        ALog.e("ByteCounterInputStream", "inputStream io fail, e=" + e.toString(), str, new Object[0]);
                        try {
                            InputStream inputStream = this.is;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } catch (Throwable th2) {
                            ALog.e("ByteCounterInputStream", "inputStream close fail, e=" + th2.toString(), str, new Object[0]);
                        }
                        return byteArrayOutputStream;
                    }
                }
                InputStream inputStream2 = this.is;
                if (inputStream2 == null) {
                    return byteArrayOutputStream2;
                }
                inputStream2.close();
                return byteArrayOutputStream2;
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th3) {
            try {
                InputStream inputStream3 = this.is;
                if (inputStream3 != null) {
                    inputStream3.close();
                }
            } catch (Throwable th4) {
                ALog.e("ByteCounterInputStream", "inputStream close fail, e=" + th4.toString(), str, new Object[0]);
            }
            throw th3;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        int read = this.is.read(bArr, i, i2);
        if (read != -1) {
            this.cnt += read;
        }
        return read;
    }
}
