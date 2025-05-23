package com.meizu.cloud.pushsdk.d;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final SimpleDateFormat f5783a = new SimpleDateFormat("yyyy-MM-dd");
    private final d b = new d("lo");
    private BufferedWriter c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements FileFilter {
        public a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.getName().endsWith(".log.txt");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Comparator<File> {
        public b() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            int i = ((file.lastModified() - file2.lastModified()) > 0L ? 1 : ((file.lastModified() - file2.lastModified()) == 0L ? 0 : -1));
            if (i > 0) {
                return -1;
            }
            if (i == 0) {
                return 0;
            }
            return 1;
        }
    }

    public void a() throws IOException {
        BufferedWriter bufferedWriter = this.c;
        if (bufferedWriter != null) {
            bufferedWriter.flush();
            this.c.close();
            this.c = null;
        }
    }

    public void a(File file) {
        File[] listFiles = file.listFiles(new a());
        if (listFiles != null) {
            if (listFiles.length > 7) {
                Arrays.sort(listFiles, new b());
                for (int i = 7; i < listFiles.length; i++) {
                    listFiles[i].delete();
                }
            }
        }
    }

    public void a(String str) throws IOException {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            String format = this.f5783a.format(new Date());
            File file2 = new File(str, format + ".log.txt");
            if (!file2.exists()) {
                if (!file2.createNewFile()) {
                    Log.e("EncryptionWriter", "create new file " + format + " failed !!!");
                } else {
                    a(file);
                }
            }
            this.c = new BufferedWriter(new FileWriter(file2, true));
            return;
        }
        throw new IOException("create " + str + " dir failed!!!");
    }

    public void a(String str, String str2, String str3) throws IOException {
        if (this.c != null) {
            this.c.write(this.b.a((str + str2 + " " + str3).getBytes()));
            this.c.write("\r\n");
        }
    }
}
