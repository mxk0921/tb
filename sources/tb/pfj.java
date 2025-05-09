package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pfj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static File f26062a = null;
    public static FileChannel b;
    public static FileLock c;

    static {
        t2o.a(962592997);
    }

    public static synchronized void b() {
        synchronized (pfj.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[0]);
                return;
            }
            FileLock fileLock = c;
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    c = null;
                    throw th;
                }
                c = null;
            }
            FileChannel fileChannel = b;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (Exception unused2) {
                }
                b = null;
            }
        }
    }

    public static synchronized boolean a(Context context) {
        FileLock fileLock;
        synchronized (pfj.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ded08bda", new Object[]{context})).booleanValue();
            } else if (context == null) {
                return true;
            } else {
                if (f26062a == null) {
                    f26062a = new File(context.getFilesDir() + File.separator + "Analytics.Lock");
                }
                boolean exists = f26062a.exists();
                if (!exists) {
                    try {
                        exists = f26062a.createNewFile();
                    } catch (IOException unused) {
                    }
                }
                if (!exists) {
                    return true;
                }
                if (b == null) {
                    try {
                        b = new RandomAccessFile(f26062a, "rw").getChannel();
                    } catch (Exception unused2) {
                        return false;
                    }
                }
                try {
                    fileLock = b.tryLock();
                    if (fileLock != null) {
                        c = fileLock;
                        return true;
                    }
                } catch (Throwable unused3) {
                    fileLock = null;
                }
                new StringBuilder("mLock:").append(fileLock);
                return false;
            }
        }
    }
}
