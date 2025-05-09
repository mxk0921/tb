package androidx.core.util;

import android.util.AtomicFile;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.pg1;
import tb.uj3;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a7\u0010\b\u001a\u00020\u0006*\u00020\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0012\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\n*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroid/util/AtomicFile;", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lkotlin/ParameterName;", "name", "out", "Ltb/xhv;", pg1.ATOM_EXT_block, "tryWrite", "(Landroid/util/AtomicFile;Ltb/g1a;)V", "", "array", "writeBytes", "(Landroid/util/AtomicFile;[B)V", "", "text", "Ljava/nio/charset/Charset;", "charset", "writeText", "(Landroid/util/AtomicFile;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "readBytes", "(Landroid/util/AtomicFile;)[B", "readText", "(Landroid/util/AtomicFile;Ljava/nio/charset/Charset;)Ljava/lang/String;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class AtomicFileKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final byte[] readBytes(AtomicFile atomicFile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e3b590ac", new Object[]{atomicFile});
        }
        return atomicFile.readFully();
    }

    public static final String readText(AtomicFile atomicFile, Charset charset) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d21fe8f", new Object[]{atomicFile, charset});
        }
        return new String(atomicFile.readFully(), charset);
    }

    public static /* synthetic */ String readText$default(AtomicFile atomicFile, Charset charset, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1be2355", new Object[]{atomicFile, charset, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            charset = uj3.UTF_8;
        }
        return readText(atomicFile, charset);
    }

    public static final void tryWrite(AtomicFile atomicFile, g1a<? super FileOutputStream, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc68ac08", new Object[]{atomicFile, g1aVar});
            return;
        }
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            g1aVar.invoke(startWrite);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    public static final void writeBytes(AtomicFile atomicFile, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62542ca1", new Object[]{atomicFile, bArr});
            return;
        }
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    public static final void writeText(AtomicFile atomicFile, String str, Charset charset) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b721512", new Object[]{atomicFile, str, charset});
            return;
        }
        byte[] bytes = str.getBytes(charset);
        ckf.f(bytes, "this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static /* synthetic */ void writeText$default(AtomicFile atomicFile, String str, Charset charset, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("878199ea", new Object[]{atomicFile, str, charset, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            charset = uj3.UTF_8;
        }
        writeText(atomicFile, str, charset);
    }
}
