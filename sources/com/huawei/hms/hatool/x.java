package com.huawei.hms.hatool;

import java.io.File;
import java.io.IOException;
import tb.ce8;
import tb.phl;
import tb.sva;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private String f5412a = q0.i().getFilesDir().getPath();

    private String b(String str) {
        String a2 = a(str);
        File file = new File(a2, "hianalytics_" + str);
        if (a(file)) {
            return k1.a(file);
        }
        String d = ce8.d(128);
        k1.a(file, d);
        return d;
    }

    public static boolean c() {
        return b(new File(q0.i().getFilesDir().getPath() + "/hms"));
    }

    private String d() {
        return "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc";
    }

    public String a() {
        String str;
        String str2;
        String str3;
        String str4;
        String d = d();
        if (b()) {
            v.c("hmsSdk", "refresh components");
            str = ce8.d(128);
            a("aprpap", str);
            str2 = ce8.d(128);
            a("febdoc", str2);
            str3 = ce8.d(128);
            a("marfil", str3);
            str4 = ce8.d(128);
            a("maywnj", str4);
            d.b(q0.i(), "Privacy_MY", "assemblyFlash", System.currentTimeMillis());
        } else {
            str = b("aprpap");
            str2 = b("febdoc");
            str3 = b("marfil");
            str4 = b("maywnj");
        }
        return sva.a(phl.b(a(str, str2, str3, d), sva.b(str4), 10000, 16));
    }

    private String a(String str) {
        return this.f5412a + "/hms/component/".replace("component", str);
    }

    private boolean b() {
        long a2 = d.a(q0.i(), "Privacy_MY", "assemblyFlash", -1L);
        if (-1 != a2) {
            return System.currentTimeMillis() - a2 > 31536000000L;
        }
        v.c("hmsSdk", "First init components");
        return true;
    }

    private void a(String str, String str2) {
        File file = new File(a(str));
        String a2 = a(str);
        File file2 = new File(a2, "hianalytics_" + str);
        if (!file.exists() && file.mkdirs()) {
            v.c("hmsSdk", "file directory is mkdirs");
        }
        if (a(file2)) {
            k1.a(file2, str2);
        } else {
            v.f("hmsSdk", "refreshComponent():file is not found,and file is create failed");
        }
    }

    private static boolean b(File file) {
        File[] listFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    v.c("hmsSdk", "delete file failed : " + file2.getName());
                }
            } else if (file2.isDirectory()) {
                b(file2);
            }
        }
        return file.delete();
    }

    private boolean a(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            v.f("hmsSdk", "create new file error!");
            return false;
        }
    }

    private char[] a(String str, String str2, String str3, String str4) {
        byte[] b = sva.b(str);
        byte[] b2 = sva.b(str2);
        byte[] b3 = sva.b(str3);
        byte[] b4 = sva.b(str4);
        int length = b.length;
        if (length > b2.length) {
            length = b2.length;
        }
        if (length > b3.length) {
            length = b3.length;
        }
        if (length > b4.length) {
            length = b4.length;
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (((b[i] ^ b2[i]) ^ b3[i]) ^ b4[i]);
        }
        return cArr;
    }
}
