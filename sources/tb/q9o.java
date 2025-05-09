package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class q9o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f26604a = null;

    static {
        t2o.a(589300036);
    }

    public abstract InputStream a();

    public abstract long b() throws IOException;

    public byte[] c() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3e6c8fa1", new Object[]{this});
        }
        if (this.f26604a == null) {
            this.f26604a = d();
        }
        return this.f26604a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.DataInputStream, java.io.Closeable] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] d() throws java.io.IOException {
        /*
            r9 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.q9o.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "891889e1"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r9
            java.lang.Object r0 = r1.ipc$dispatch(r2, r3)
            byte[] r0 = (byte[]) r0
            return r0
        L_0x0015:
            long r1 = r9.b()
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x008c
            java.io.InputStream r3 = r9.a()
            r4 = 0
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch: all -> 0x0057, Exception -> 0x005a
            r5.<init>(r3)     // Catch: all -> 0x0057, Exception -> 0x005a
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0051, Exception -> 0x0054
            r3.<init>()     // Catch: all -> 0x0051, Exception -> 0x0054
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: all -> 0x003e, Exception -> 0x0041
        L_0x0033:
            int r7 = r5.read(r6)     // Catch: all -> 0x003e, Exception -> 0x0041
            r8 = -1
            if (r7 == r8) goto L_0x0043
            r3.write(r6, r0, r7)     // Catch: all -> 0x003e, Exception -> 0x0041
            goto L_0x0033
        L_0x003e:
            r0 = move-exception
        L_0x003f:
            r4 = r5
            goto L_0x0085
        L_0x0041:
            r0 = move-exception
            goto L_0x005d
        L_0x0043:
            r3.flush()     // Catch: all -> 0x003e, Exception -> 0x0041
            byte[] r0 = r3.toByteArray()     // Catch: all -> 0x003e, Exception -> 0x0041
            tb.xvj.b(r5)
            tb.xvj.b(r3)
            goto L_0x006c
        L_0x0051:
            r0 = move-exception
            r3 = r4
            goto L_0x003f
        L_0x0054:
            r0 = move-exception
            r3 = r4
            goto L_0x005d
        L_0x0057:
            r0 = move-exception
            r3 = r4
            goto L_0x0085
        L_0x005a:
            r0 = move-exception
            r3 = r4
            r5 = r3
        L_0x005d:
            java.lang.String r6 = "mtopsdk.ResponseBody"
            java.lang.String r7 = "[readBytes] read bytes from byteStream error."
            mtopsdk.common.util.TBSdkLog.e(r6, r7, r0)     // Catch: all -> 0x003e
            tb.xvj.b(r5)
            tb.xvj.b(r3)
            r0 = r4
        L_0x006c:
            if (r0 != 0) goto L_0x006f
            return r4
        L_0x006f:
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0084
            int r3 = r0.length
            long r3 = (long) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x007c
            goto L_0x0084
        L_0x007c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Content-Length and stream length disagree"
            r0.<init>(r1)
            throw r0
        L_0x0084:
            return r0
        L_0x0085:
            tb.xvj.b(r4)
            tb.xvj.b(r3)
            throw r0
        L_0x008c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.q9o.d():byte[]");
    }
}
