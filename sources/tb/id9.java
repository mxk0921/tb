package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.performance.cpu.ParseException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class id9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21254a;
    public final byte[] b;
    public RandomAccessFile c;

    public id9(String str, byte[] bArr) throws ParseException {
        this.f21254a = str;
        this.b = bArr;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        RandomAccessFile randomAccessFile = this.c;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.c = null;
                throw th;
            }
            this.c = null;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        RandomAccessFile randomAccessFile = this.c;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(0L);
            } catch (IOException unused) {
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.c != null) {
            return -1;
        }
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f21254a, "r");
                this.c = randomAccessFile2;
                return randomAccessFile2.read(this.b);
            } catch (IOException e) {
                throw new ParseException("RAF err: " + e.getMessage());
            }
        } finally {
            a();
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            a();
        }
    }
}
