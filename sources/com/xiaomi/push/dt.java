package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.bj;
import com.xiaomi.push.service.bw;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class dt {

    /* renamed from: a  reason: collision with root package name */
    private static String f14835a = "/MiPushLog";

    /* renamed from: a  reason: collision with other field name */
    private int f855a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f858a;

    /* renamed from: b  reason: collision with other field name */
    private String f859b;
    private String c;

    /* renamed from: a  reason: collision with other field name */
    private final SimpleDateFormat f856a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private int b = 2097152;

    /* renamed from: a  reason: collision with other field name */
    private ArrayList<File> f857a = new ArrayList<>();

    /* renamed from: a  reason: collision with other method in class */
    public dt m597a(File file) {
        if (file.exists()) {
            this.f857a.add(file);
        }
        return this;
    }

    public dt a(Date date, Date date2) {
        String format;
        if (date.after(date2)) {
            this.f859b = this.f856a.format(date2);
            format = this.f856a.format(date);
        } else {
            this.f859b = this.f856a.format(date);
            format = this.f856a.format(date2);
        }
        this.c = format;
        return this;
    }

    public File a(Context context, Date date, Date date2, File file) {
        File file2;
        File file3;
        if ("com.xiaomi.xmsf".equalsIgnoreCase(context.getPackageName())) {
            file2 = new File(context.getExternalFilesDir(null), bj.Q);
            if (!file2.exists()) {
                file2 = new File(context.getFilesDir(), bj.Q);
            }
            if (!file2.exists()) {
                file2 = context.getFilesDir();
            }
            m597a(new File(file2, "xmsf.log.1"));
            file3 = new File(file2, "xmsf.log");
        } else {
            file2 = new File(context.getExternalFilesDir(null) + f14835a);
            m597a(new File(file2, "log0.txt"));
            file3 = new File(file2, "log1.txt");
        }
        m597a(file3);
        if (!file2.isDirectory()) {
            return null;
        }
        File file4 = new File(file, date.getTime() + "-" + date2.getTime() + ".zip");
        if (file4.exists()) {
            return null;
        }
        a(date, date2);
        long currentTimeMillis = System.currentTimeMillis();
        File file5 = new File(file, "log.txt");
        a(file5);
        b.c("LOG: filter cost = " + (System.currentTimeMillis() - currentTimeMillis));
        if (file5.exists()) {
            long currentTimeMillis2 = System.currentTimeMillis();
            x.a(file4, file5);
            b.c("LOG: zip cost = " + (System.currentTimeMillis() - currentTimeMillis2));
            file5.delete();
            if (file4.exists()) {
                return file4;
            }
        }
        return null;
    }

    public void a(int i) {
        if (i != 0) {
            this.b = i;
        }
    }

    private void a(BufferedReader bufferedReader, BufferedWriter bufferedWriter, Pattern pattern) {
        char[] cArr = new char[4096];
        int read = bufferedReader.read(cArr);
        boolean z = false;
        while (read != -1 && !z) {
            String str = new String(cArr, 0, read);
            Matcher matcher = pattern.matcher(str);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= read || !matcher.find(i)) {
                    break;
                }
                int start = matcher.start();
                String substring = str.substring(start, this.f859b.length() + start);
                if (this.f858a) {
                    if (substring.compareTo(this.c) > 0) {
                        read = start;
                        z = true;
                        break;
                    }
                } else if (substring.compareTo(this.f859b) >= 0) {
                    this.f858a = true;
                    i2 = start;
                }
                int indexOf = str.indexOf(10, start);
                if (indexOf == -1) {
                    indexOf = this.f859b.length();
                }
                i = start + indexOf;
            }
            if (this.f858a) {
                int i3 = read - i2;
                this.f855a += i3;
                bufferedWriter.write(cArr, i2, i3);
                if (z || this.f855a > this.b) {
                    return;
                }
            }
            read = bufferedReader.read(cArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.xiaomi.push.dt] */
    private void a(File file) {
        Throwable th;
        FileNotFoundException e;
        Object obj;
        String str;
        IOException e2;
        Object obj2;
        BufferedWriter bufferedWriter = "model :";
        Pattern compile = Pattern.compile("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
        bufferedWriter = 0;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                try {
                    bufferedWriter2.write(((String) bufferedWriter) + Build.MODEL + "; os :" + Build.VERSION.INCREMENTAL + "; uid :" + bw.m1062a() + "; lng :" + Locale.getDefault().toString() + "; sdk :48; andver :" + Build.VERSION.SDK_INT + "\n");
                    this.f855a = 0;
                    Iterator<File> it = this.f857a.iterator();
                    while (it.hasNext()) {
                        bufferedWriter = new BufferedReader(new InputStreamReader(new FileInputStream(it.next())));
                        try {
                            a(bufferedWriter, bufferedWriter2, compile);
                            bufferedWriter.close();
                            bufferedWriter = bufferedWriter;
                        } catch (FileNotFoundException e3) {
                            e = e3;
                            bufferedWriter = bufferedWriter2;
                            obj = bufferedWriter;
                            str = "LOG: filter error = " + e.getMessage();
                            bufferedWriter = obj;
                            bufferedWriter = bufferedWriter;
                            b.c(str);
                            x.a((Closeable) bufferedWriter);
                            x.a((Closeable) bufferedWriter);
                            return;
                        } catch (IOException e4) {
                            e2 = e4;
                            bufferedWriter = bufferedWriter2;
                            obj2 = bufferedWriter;
                            str = "LOG: filter error = " + e2.getMessage();
                            bufferedWriter = obj2;
                            bufferedWriter = bufferedWriter;
                            b.c(str);
                            x.a((Closeable) bufferedWriter);
                            x.a((Closeable) bufferedWriter);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedWriter = bufferedWriter2;
                            x.a(bufferedWriter);
                            x.a((Closeable) bufferedWriter);
                            throw th;
                        }
                    }
                    bufferedWriter2.write(cs.a().c());
                    x.a(bufferedWriter2);
                    x.a((Closeable) bufferedWriter);
                } catch (FileNotFoundException e5) {
                    e = e5;
                } catch (IOException e6) {
                    e2 = e6;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (FileNotFoundException e7) {
            e = e7;
            obj = null;
        } catch (IOException e8) {
            e2 = e8;
            obj2 = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedWriter = 0;
        }
    }
}
