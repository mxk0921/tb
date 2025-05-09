package tb;

import android.taobao.windvane.file.NotEnoughSpace;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class sb9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856183);
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("807b73c9", new Object[]{file})).booleanValue();
        }
        return b(file, true);
    }

    public static boolean b(File file, boolean z) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ef3b7b3", new Object[]{file, new Boolean(z)})).booleanValue();
        }
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                try {
                    for (File file2 : file.listFiles()) {
                        if (file2.isDirectory()) {
                            b(file2, true);
                        } else {
                            try {
                                file2.delete();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } catch (NullPointerException e2) {
                    e2.printStackTrace();
                }
            }
            if (z) {
                try {
                    return file.delete();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
        return false;
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("602541f1", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return new File(str).exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] e(java.io.File r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.sb9.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "620fc589"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            byte[] r5 = (byte[]) r5
            return r5
        L_0x0015:
            r0 = 0
            boolean r1 = r5.exists()     // Catch: all -> 0x0046, Exception -> 0x004b
            if (r1 != 0) goto L_0x001d
            return r0
        L_0x001d:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: all -> 0x0046, Exception -> 0x004b
            r1.<init>(r5)     // Catch: all -> 0x0046, Exception -> 0x004b
            java.nio.channels.FileChannel r5 = r1.getChannel()     // Catch: all -> 0x003f, Exception -> 0x0044
            long r2 = r5.size()     // Catch: all -> 0x003d, Exception -> 0x004d
            int r3 = (int) r2     // Catch: all -> 0x003d, Exception -> 0x004d
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r3)     // Catch: all -> 0x003d, Exception -> 0x004d
            r5.read(r2)     // Catch: all -> 0x003d, Exception -> 0x004d
            byte[] r0 = r2.array()     // Catch: all -> 0x003d, Exception -> 0x004d
            r1.close()     // Catch: IOException -> 0x0039
        L_0x0039:
            r5.close()     // Catch: IOException -> 0x003c
        L_0x003c:
            return r0
        L_0x003d:
            r0 = move-exception
            goto L_0x0062
        L_0x003f:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0062
        L_0x0044:
            r5 = r0
            goto L_0x004d
        L_0x0046:
            r5 = move-exception
            r1 = r0
            r0 = r5
            r5 = r1
            goto L_0x0062
        L_0x004b:
            r5 = r0
            r1 = r5
        L_0x004d:
            java.lang.String r2 = "FileAccesser"
            java.lang.String r3 = "read loacl file failed"
            tb.v7t.n(r2, r3)     // Catch: all -> 0x003d
            if (r1 == 0) goto L_0x005c
            r1.close()     // Catch: IOException -> 0x005b
            goto L_0x005c
        L_0x005b:
        L_0x005c:
            if (r5 == 0) goto L_0x0061
            r5.close()     // Catch: IOException -> 0x0061
        L_0x0061:
            return r0
        L_0x0062:
            if (r1 == 0) goto L_0x0069
            r1.close()     // Catch: IOException -> 0x0068
            goto L_0x0069
        L_0x0068:
        L_0x0069:
            if (r5 == 0) goto L_0x006e
            r5.close()     // Catch: IOException -> 0x006e
        L_0x006e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sb9.e(java.io.File):byte[]");
    }

    public static byte[] f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cc4c5616", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return e(new File(str));
    }

    public static boolean h(String str, ByteBuffer byteBuffer) throws NotEnoughSpace {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c0ab225", new Object[]{str, byteBuffer})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return g(new File(str), byteBuffer);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea11bd1c", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return b(new File(str), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
        r5.delete();
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(java.io.File r5, java.nio.ByteBuffer r6) throws android.taobao.windvane.file.NotEnoughSpace {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.sb9.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "1e078d98"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r5 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x001c:
            r2 = 0
            boolean r3 = r5.exists()     // Catch: all -> 0x0031, Exception -> 0x0035
            if (r3 != 0) goto L_0x0038
            java.io.File r3 = r5.getParentFile()     // Catch: all -> 0x0031, Exception -> 0x0035
            if (r3 != 0) goto L_0x002a
            return r1
        L_0x002a:
            r3.mkdirs()     // Catch: all -> 0x0031, Exception -> 0x0035
            r5.createNewFile()     // Catch: all -> 0x0031, Exception -> 0x0035
            goto L_0x0038
        L_0x0031:
            r5 = move-exception
            r0 = r2
            goto L_0x0099
        L_0x0035:
            r6 = move-exception
            r0 = r2
            goto L_0x0062
        L_0x0038:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: all -> 0x0031, Exception -> 0x0035
            r3.<init>(r5)     // Catch: all -> 0x0031, Exception -> 0x0035
            java.nio.channels.FileChannel r2 = r3.getChannel()     // Catch: all -> 0x005b, Exception -> 0x005f
            r6.position(r1)     // Catch: all -> 0x005b, Exception -> 0x005f
            r2.write(r6)     // Catch: all -> 0x005b, Exception -> 0x005f
            r2.force(r0)     // Catch: all -> 0x005b, Exception -> 0x005f
            r3.close()     // Catch: IOException -> 0x004e
            goto L_0x0052
        L_0x004e:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0052:
            r2.close()     // Catch: IOException -> 0x0056
            goto L_0x005a
        L_0x0056:
            r5 = move-exception
            r5.printStackTrace()
        L_0x005a:
            return r0
        L_0x005b:
            r5 = move-exception
            r0 = r2
            r2 = r3
            goto L_0x0099
        L_0x005f:
            r6 = move-exception
            r0 = r2
            r2 = r3
        L_0x0062:
            java.lang.String r3 = r6.getMessage()     // Catch: all -> 0x007a
            if (r3 == 0) goto L_0x007c
            java.lang.String r4 = "ENOSPC"
            boolean r3 = r3.contains(r4)     // Catch: all -> 0x007a
            if (r3 != 0) goto L_0x0071
            goto L_0x007c
        L_0x0071:
            android.taobao.windvane.file.NotEnoughSpace r5 = new android.taobao.windvane.file.NotEnoughSpace     // Catch: all -> 0x007a
            java.lang.String r6 = "not enouth space in flash"
            r5.<init>(r6)     // Catch: all -> 0x007a
            throw r5     // Catch: all -> 0x007a
        L_0x007a:
            r5 = move-exception
            goto L_0x0099
        L_0x007c:
            if (r5 == 0) goto L_0x0081
            r5.delete()     // Catch: all -> 0x007a
        L_0x0081:
            r6.printStackTrace()     // Catch: all -> 0x007a
            if (r2 == 0) goto L_0x008e
            r2.close()     // Catch: IOException -> 0x008a
            goto L_0x008e
        L_0x008a:
            r5 = move-exception
            r5.printStackTrace()
        L_0x008e:
            if (r0 == 0) goto L_0x0098
            r0.close()     // Catch: IOException -> 0x0094
            goto L_0x0098
        L_0x0094:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0098:
            return r1
        L_0x0099:
            if (r2 == 0) goto L_0x00a3
            r2.close()     // Catch: IOException -> 0x009f
            goto L_0x00a3
        L_0x009f:
            r6 = move-exception
            r6.printStackTrace()
        L_0x00a3:
            if (r0 == 0) goto L_0x00ad
            r0.close()     // Catch: IOException -> 0x00a9
            goto L_0x00ad
        L_0x00a9:
            r6 = move-exception
            r6.printStackTrace()
        L_0x00ad:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sb9.g(java.io.File, java.nio.ByteBuffer):boolean");
    }
}
