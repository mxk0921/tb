package com.android.alibaba.ip.runtime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ApplicationPatch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NORMAL_CHANGE = 0;
    public static final int RES_CHANGE = 2;
    public static final int SYSCALL_CHANGE = 1;
    public final byte[] data;
    public final int mChange;
    public final int patchVersion;
    public final String path;

    static {
        t2o.a(493879315);
    }

    public ApplicationPatch(String str, int i, int i2) {
        this.path = str;
        this.mChange = i;
        this.patchVersion = i2;
        this.data = new byte[0];
    }

    public static final byte[] input2byte(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("78a8d0a1", new Object[]{inputStream});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[100];
        while (true) {
            int read = inputStream.read(bArr, 0, 100);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public byte[] getBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3e6c8fa1", new Object[]{this});
        }
        return this.data;
    }

    public int getChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f1bf820", new Object[]{this})).intValue();
        }
        return this.mChange;
    }

    public int getPatchVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a58ce760", new Object[]{this})).intValue();
        }
        return this.patchVersion;
    }

    public String getPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this});
        }
        return this.path;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ApplicationPatch{path='" + this.path + "', patchVersion=" + this.patchVersion + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.android.alibaba.ip.runtime.ApplicationPatch, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0080 -> B:37:0x009b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.android.alibaba.ip.runtime.ApplicationPatch> makePatch(java.lang.String r8, int r9) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            java.lang.String r3 = "resources.ap_"
            com.android.alibaba.ip.runtime.IpChange r4 = com.android.alibaba.ip.runtime.ApplicationPatch.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0020
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r9)
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r1] = r8
            r9[r0] = r3
            java.lang.String r8 = "b06234ef"
            java.lang.Object r8 = r4.ipc$dispatch(r8, r9)
            java.util.List r8 = (java.util.List) r8
            return r8
        L_0x0020:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.io.File r5 = new java.io.File
            r5.<init>(r8)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x009b
            r6 = 0
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile     // Catch: all -> 0x0084, IOException -> 0x0086
            r7.<init>(r5)     // Catch: all -> 0x0084, IOException -> 0x0086
            java.util.zip.ZipEntry r5 = r7.getEntry(r3)     // Catch: all -> 0x004d, IOException -> 0x0050
            if (r5 == 0) goto L_0x0053
            com.android.alibaba.ip.runtime.ApplicationPatch r6 = new com.android.alibaba.ip.runtime.ApplicationPatch     // Catch: all -> 0x004d, IOException -> 0x0050
            java.io.InputStream r5 = r7.getInputStream(r5)     // Catch: all -> 0x004d, IOException -> 0x0050
            byte[] r5 = input2byte(r5)     // Catch: all -> 0x004d, IOException -> 0x0050
            r6.<init>(r3, r2, r5, r9)     // Catch: all -> 0x004d, IOException -> 0x0050
            r4.add(r6)     // Catch: all -> 0x004d, IOException -> 0x0050
            goto L_0x0053
        L_0x004d:
            r8 = move-exception
            r6 = r7
            goto L_0x0090
        L_0x0050:
            r8 = move-exception
            r6 = r7
            goto L_0x0087
        L_0x0053:
            java.lang.String r2 = "classes.dex"
            java.util.zip.ZipEntry r2 = r7.getEntry(r2)     // Catch: all -> 0x004d, IOException -> 0x0050
            if (r2 == 0) goto L_0x0063
            com.android.alibaba.ip.runtime.ApplicationPatch r2 = new com.android.alibaba.ip.runtime.ApplicationPatch     // Catch: all -> 0x004d, IOException -> 0x0050
            r2.<init>(r8, r1, r9)     // Catch: all -> 0x004d, IOException -> 0x0050
            r4.add(r2)     // Catch: all -> 0x004d, IOException -> 0x0050
        L_0x0063:
            java.lang.String r1 = "classes2.dex"
            java.util.zip.ZipEntry r1 = r7.getEntry(r1)     // Catch: all -> 0x004d, IOException -> 0x0050
            if (r1 == 0) goto L_0x007b
            com.android.alibaba.ip.runtime.ApplicationPatch r2 = new com.android.alibaba.ip.runtime.ApplicationPatch     // Catch: all -> 0x004d, IOException -> 0x0050
            java.io.InputStream r1 = r7.getInputStream(r1)     // Catch: all -> 0x004d, IOException -> 0x0050
            byte[] r1 = input2byte(r1)     // Catch: all -> 0x004d, IOException -> 0x0050
            r2.<init>(r8, r0, r1, r9)     // Catch: all -> 0x004d, IOException -> 0x0050
            r4.add(r2)     // Catch: all -> 0x004d, IOException -> 0x0050
        L_0x007b:
            r7.close()     // Catch: IOException -> 0x007f
            goto L_0x009b
        L_0x007f:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x009b
        L_0x0084:
            r8 = move-exception
            goto L_0x0090
        L_0x0086:
            r8 = move-exception
        L_0x0087:
            r8.printStackTrace()     // Catch: all -> 0x0084
            if (r6 == 0) goto L_0x009b
            r6.close()     // Catch: IOException -> 0x007f
            goto L_0x009b
        L_0x0090:
            if (r6 == 0) goto L_0x009a
            r6.close()     // Catch: IOException -> 0x0096
            goto L_0x009a
        L_0x0096:
            r9 = move-exception
            r9.printStackTrace()
        L_0x009a:
            throw r8
        L_0x009b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.alibaba.ip.runtime.ApplicationPatch.makePatch(java.lang.String, int):java.util.List");
    }

    public ApplicationPatch(String str, int i, byte[] bArr, int i2) {
        this.path = str;
        this.mChange = i;
        this.patchVersion = i2;
        this.data = bArr;
    }
}
