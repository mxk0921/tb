package anet.channel.encode;

import android.util.Pair;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.Zstd;
import com.android.taobao.zstd.ZstdStreamDeflater;
import com.android.taobao.zstd.ZstdStreamInflater;
import com.android.taobao.zstd.dict.ZstdDecompressDict;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import tb.crx;
import tb.drx;
import tb.frx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class EncodingHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.EncodingHelper";
    public static final int encodingFail = -408;
    private static final String gzip = "gzip";
    private static volatile boolean isZstdValid = false;
    private static final String zstd = "zstd";
    private static final String zstdDict = "zstd-d";

    static {
        t2o.a(607125615);
        try {
            IpChange ipChange = Zstd.$ipChange;
            isZstdValid = true;
        } catch (Throwable unused) {
            isZstdValid = false;
        }
    }

    private static byte[] compressWithGzip(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9232b80d", new Object[]{bArr});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] decompress(String str, byte[] bArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("44e82342", new Object[]{str, bArr});
        }
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        if (str.equalsIgnoreCase("gzip")) {
            return decompressWithGzip(bArr);
        }
        return (!isZstdValid() || !str.equalsIgnoreCase("zstd")) ? bArr : Zstd.c(bArr);
    }

    private static byte[] decompressWithGzip(byte[] bArr) throws Exception {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a1ae2a6c", new Object[]{bArr});
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            }
            gZIPInputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th3) {
            th = th3;
            gZIPInputStream2 = gZIPInputStream;
            if (gZIPInputStream2 != null) {
                try {
                    gZIPInputStream2.close();
                } catch (Exception unused2) {
                    throw th;
                }
            }
            byteArrayOutputStream.close();
            throw th;
        }
    }

    public static InputStream getInputStream(String str, InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("286a3971", new Object[]{str, inputStream});
        }
        if (str.equalsIgnoreCase("gzip")) {
            return new GZIPInputStream(inputStream);
        }
        return (!str.equalsIgnoreCase("zstd") || !isZstdValid()) ? inputStream : new crx(inputStream);
    }

    public static Pair<crx, Pair<ZstdDecompressDict, ZstdStreamInflater>> getZstdDictInputStream(byte[] bArr, InputStream inputStream, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("84b15bc4", new Object[]{bArr, inputStream, str});
        }
        if (!isZstdValid() || bArr == null || bArr.length == 0 || inputStream == null) {
            return null;
        }
        ZstdStreamInflater zstdStreamInflater = new ZstdStreamInflater();
        ZstdDecompressDict zstdDecompressDict = new ZstdDecompressDict(bArr, 0, bArr.length);
        zstdStreamInflater.setDict(zstdDecompressDict);
        return Pair.create(new crx(inputStream, zstdStreamInflater), Pair.create(zstdDecompressDict, zstdStreamInflater));
    }

    public static boolean isZstdValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba02c014", new Object[0])).booleanValue();
        }
        try {
            if (!isZstdValid) {
                return false;
            }
            if (drx.b()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            ALog.e(TAG, "[zstd-d] ZstdLoader isReady fail, e=" + e.toString(), null, new Object[0]);
            return false;
        }
    }

    public static byte[] compress(String str, byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("fab4dba3", new Object[]{str, bArr});
        }
        if (bArr != null && bArr.length > 0) {
            if (str.equalsIgnoreCase("gzip")) {
                return compressWithGzip(bArr);
            }
            if (isZstdValid() && str.equalsIgnoreCase("zstd")) {
                return Zstd.b(bArr, 1);
            }
        }
        return null;
    }

    public static Pair<OutputStream, ZstdStreamDeflater> getOutputStream(String str, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("69a82b6d", new Object[]{str, byteArrayOutputStream});
        }
        if (str.equalsIgnoreCase("gzip")) {
            return Pair.create(new GZIPOutputStream(byteArrayOutputStream), null);
        }
        if (!str.equalsIgnoreCase("zstd") || !isZstdValid()) {
            return null;
        }
        ZstdStreamDeflater zstdStreamDeflater = new ZstdStreamDeflater(1);
        return Pair.create(new frx(byteArrayOutputStream, zstdStreamDeflater), zstdStreamDeflater);
    }

    public static int getBodyDeflatedType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74e432ef", new Object[]{str})).intValue();
        }
        if ("gzip".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("br".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("zstd".equalsIgnoreCase(str)) {
            return 3;
        }
        return "zstd-d".equalsIgnoreCase(str) ? 4 : 0;
    }

    public static InputStream getInputStream(InputStream inputStream, ZstdStreamInflater zstdStreamInflater) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("572b48c3", new Object[]{inputStream, zstdStreamInflater}) : isZstdValid() ? new crx(inputStream, zstdStreamInflater) : inputStream;
    }
}
