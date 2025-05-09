package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dy implements LoggerInterface {

    /* renamed from: a  reason: collision with root package name */
    private static volatile dy f14843a;

    /* renamed from: a  reason: collision with other field name */
    private Context f877a;

    /* renamed from: a  reason: collision with other field name */
    private Handler f878a;
    private String b;
    private String c = "";

    /* renamed from: a  reason: collision with other field name */
    private static final SimpleDateFormat f875a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aaa");

    /* renamed from: a  reason: collision with other field name */
    public static String f874a = "/MiPushLog";

    /* renamed from: a  reason: collision with other field name */
    private static List<Pair<String, Throwable>> f876a = Collections.synchronizedList(new ArrayList());

    private dy(Context context) {
        this.f877a = context;
        if (context.getApplicationContext() != null) {
            this.f877a = context.getApplicationContext();
        }
        this.b = this.f877a.getPackageName() + "-" + Process.myPid();
        HandlerThread handlerThread = new HandlerThread("Log2FileHandlerThread");
        handlerThread.start();
        this.f878a = new Handler(handlerThread.getLooper());
    }

    public static dy a(Context context) {
        if (f14843a == null) {
            synchronized (dy.class) {
                try {
                    if (f14843a == null) {
                        f14843a = new dy(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14843a;
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void log(String str) {
        log(str, null);
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void setTag(String str) {
        this.b = str;
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void log(String str, Throwable th) {
        this.f878a.post(new dz(this, str, th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0143 -> B:102:0x0176). Please submit an issue!!! */
    public void a() {
        RandomAccessFile randomAccessFile;
        FileLock fileLock;
        Throwable th;
        Exception e;
        File file;
        File externalFilesDir;
        BufferedWriter bufferedWriter = null;
        try {
            try {
                try {
                    if (TextUtils.isEmpty(this.c) && (externalFilesDir = this.f877a.getExternalFilesDir(null)) != null) {
                        this.c = externalFilesDir.getAbsolutePath() + "";
                    }
                    file = new File(this.c + f874a);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
                fileLock = null;
                randomAccessFile = null;
            } catch (Throwable th3) {
                th = th3;
                fileLock = null;
                randomAccessFile = null;
            }
        } catch (IOException e3) {
            Log.e(this.b, "", e3);
        }
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            File file2 = new File(file, "log.lock");
            if (!file2.exists() || file2.isDirectory()) {
                file2.createNewFile();
            }
            randomAccessFile = new RandomAccessFile(file2, "rw");
            try {
                fileLock = randomAccessFile.getChannel().lock();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(file, "log1.txt"), true)));
                    while (!f876a.isEmpty()) {
                        try {
                            Pair<String, Throwable> remove = f876a.remove(0);
                            String str = (String) remove.first;
                            if (remove.second != null) {
                                str = (str + "\n") + Log.getStackTraceString((Throwable) remove.second);
                            }
                            bufferedWriter2.write(str + "\n");
                        } catch (Exception e4) {
                            e = e4;
                            bufferedWriter = bufferedWriter2;
                            Log.e(this.b, "", e);
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e5) {
                                    Log.e(this.b, "", e5);
                                }
                            }
                            if (fileLock != null && fileLock.isValid()) {
                                try {
                                    fileLock.release();
                                } catch (IOException e6) {
                                    Log.e(this.b, "", e6);
                                }
                            }
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e7) {
                                    Log.e(this.b, "", e7);
                                }
                            }
                            if (fileLock != null && fileLock.isValid()) {
                                try {
                                    fileLock.release();
                                } catch (IOException e8) {
                                    Log.e(this.b, "", e8);
                                }
                            }
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (IOException e9) {
                                    Log.e(this.b, "", e9);
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedWriter2.flush();
                    bufferedWriter2.close();
                    File file3 = new File(file, "log1.txt");
                    if (file3.length() >= 1048576) {
                        File file4 = new File(file, "log0.txt");
                        if (file4.exists() && file4.isFile()) {
                            file4.delete();
                        }
                        file3.renameTo(file4);
                    }
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException e10) {
                            Log.e(this.b, "", e10);
                        }
                    }
                    randomAccessFile.close();
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                fileLock = null;
            } catch (Throwable th5) {
                th = th5;
                fileLock = null;
            }
        }
    }
}
