package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class cg9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FileUtil";

    static {
        t2o.a(511705603);
    }

    public static float a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5730673b", new Object[]{new Long(j)})).floatValue();
        }
        return (float) (j / 1048576.0d);
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bee4b6f7", new Object[]{str, str2})).booleanValue();
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        File file2 = new File(str2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isDirectory()) {
                String path = listFiles[i].getPath();
                b(path, file2.getPath() + "/" + listFiles[i].getName());
            } else {
                File file3 = new File(listFiles[i].getPath());
                e(file3, file2.getPath() + "/" + listFiles[i].getName());
            }
        }
        return true;
    }

    public static boolean d(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("363ba12", new Object[]{context, str, str2, str3})).booleanValue();
        }
        if (!eag.C() || str == null || Build.VERSION.SDK_INT < 33) {
            return f(str2, str3);
        }
        return g(context, Uri.parse(str), str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    public static boolean e(File e, String str) {
        FileNotFoundException e2;
        IOException e3;
        FileChannel channel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d942e1d", new Object[]{e, str})).booleanValue();
        }
        if (e == 0 || str == null) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        FileChannel fileChannel = null;
        try {
            try {
                try {
                    channel = new FileInputStream(e).getChannel();
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    fileChannel = new FileOutputStream(file).getChannel();
                    channel.transferTo(0L, channel.size(), fileChannel);
                    try {
                        channel.close();
                        if (fileChannel == null) {
                            return true;
                        }
                        fileChannel.close();
                        return true;
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        return true;
                    }
                } catch (FileNotFoundException e6) {
                    e2 = e6;
                    fileChannel = channel;
                    e = fileChannel;
                    e2.printStackTrace();
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (e != 0) {
                        e.close();
                    }
                    return false;
                } catch (IOException e7) {
                    e3 = e7;
                    fileChannel = channel;
                    e = fileChannel;
                    e3.printStackTrace();
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (e != 0) {
                        e.close();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = channel;
                    e = fileChannel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                            throw th;
                        }
                    }
                    if (e != null) {
                        e.close();
                    }
                    throw th;
                }
            } catch (FileNotFoundException e9) {
                e2 = e9;
                e = 0;
            } catch (IOException e10) {
                e3 = e10;
                e = 0;
            } catch (Throwable th3) {
                th = th3;
                e = null;
            }
        } catch (IOException e11) {
            e = e11;
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.io.FileInputStream, java.io.InputStream] */
    public static boolean f(String str, String str2) {
        Throwable th;
        Exception e;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        Object obj = ipChange instanceof IpChange;
        if (obj != 0) {
            return ((Boolean) ipChange.ipc$dispatch("282f3b0", new Object[]{str, str2})).booleanValue();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (new File(str).exists()) {
                    obj = new FileInputStream(str);
                    try {
                        fileOutputStream = new FileOutputStream(str2);
                    } catch (Exception e2) {
                        e = e2;
                    }
                    try {
                        byte[] bArr = new byte[1444];
                        int i = 0;
                        while (true) {
                            int read = obj.read(bArr);
                            if (read != -1) {
                                i += read;
                                System.out.println(i);
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                odg.c(TAG, "copyFile 复制文件成功 " + str2);
                                u(fileOutputStream);
                                u(obj);
                                return true;
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileOutputStream2 = fileOutputStream;
                        try {
                            odg.c(TAG, "copyFile 复制单个文件出错 " + e.getMessage());
                            u(fileOutputStream2);
                            u(obj);
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            u(fileOutputStream2);
                            u(obj);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream2 = fileOutputStream;
                        u(fileOutputStream2);
                        u(obj);
                        throw th;
                    }
                } else {
                    try {
                        odg.c(TAG, "copyFile 复制单个文件出错, 文件不存在");
                        u(null);
                        u(null);
                        return false;
                    } catch (Exception e4) {
                        e = e4;
                        obj = 0;
                        odg.c(TAG, "copyFile 复制单个文件出错 " + e.getMessage());
                        u(fileOutputStream2);
                        u(obj);
                        return false;
                    } catch (Throwable th4) {
                        th = th4;
                        obj = 0;
                        u(fileOutputStream2);
                        u(obj);
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Exception e5) {
            e = e5;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public static boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8da68839", new Object[]{str})).booleanValue();
        }
        if (!l(str)) {
            return new File(str).mkdirs();
        }
        return false;
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea11bd18", new Object[]{str});
            return;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    public static void j(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f2740c5", new Object[]{file});
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                j(file2);
            }
        }
        file.delete();
    }

    public static long k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32e74358", new Object[]{str})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        File file = new File(str);
        if (file.exists()) {
            return file.length();
        }
        return 0L;
    }

    public static boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c5e2ca6", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5126a8b5", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || file.length() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean n(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a8db905", new Object[]{file, file2})).booleanValue();
        }
        if (file == file2) {
            return true;
        }
        if (file == null || file2 == null || !l(file.getAbsolutePath()) || !l(file2.getAbsolutePath()) || file.length() != file2.length()) {
            return false;
        }
        return true;
    }

    public static byte[] o(File file) {
        FileChannel fileChannel;
        FileInputStream fileInputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("620fc589", new Object[]{file});
        }
        try {
            if (!file.exists()) {
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                fileChannel = fileInputStream.getChannel();
                try {
                    ByteBuffer allocate = ByteBuffer.allocate((int) fileChannel.size());
                    fileChannel.read(allocate);
                    byte[] array = allocate.array();
                    try {
                        fileInputStream.close();
                    } catch (IOException unused) {
                    }
                    try {
                        fileChannel.close();
                    } catch (IOException unused2) {
                    }
                    return array;
                } catch (Exception unused3) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused5) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused7) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused8) {
                fileChannel = null;
            } catch (Throwable th3) {
                th = th3;
                fileChannel = null;
            }
        } catch (Exception unused9) {
            fileChannel = null;
            fileInputStream = null;
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            fileChannel = null;
        }
    }

    public static int p(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15a31d0", new Object[]{context, uri})).intValue();
        }
        try {
            if (Build.VERSION.SDK_INT < 24) {
                return 0;
            }
            InputStream f = knv.f(context, uri);
            if (f == null) {
                f = knv.f(context, Uri.fromFile(new File(uri.toString())));
            }
            g1m.a();
            int attributeInt = f1m.a(f).getAttributeInt(ExifInterface.TAG_ORIENTATION, 0);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int q(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ae41fe7", new Object[]{context, str})).intValue();
        }
        return p(context, Uri.parse(str));
    }

    public static int r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8973a57", new Object[]{str})).intValue();
        }
        return q(Globals.getApplication(), str);
    }

    public static String s(String str) {
        Throwable th;
        FileReader fileReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15ceaee2", new Object[]{str});
        }
        File file = new File(str);
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                            sb.append('\n');
                        } else {
                            u(bufferedReader2);
                            u(fileReader);
                            return sb.toString();
                        }
                    } catch (Exception unused) {
                        bufferedReader = bufferedReader2;
                        u(bufferedReader);
                        u(fileReader);
                        return "";
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        u(bufferedReader);
                        u(fileReader);
                        throw th;
                    }
                }
            } catch (Exception unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused3) {
            fileReader = null;
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
        }
    }

    public static void t(Object obj) {
        try {
            obj.getClass().getDeclaredMethod("close", new Class[0]).invoke(obj, new Object[0]);
        } catch (Throwable th) {
            odg.c(TAG, "FileUtil.reflectToClose failed. msg:" + Log.getStackTraceString(th));
        }
    }

    public static void u(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18088661", new Object[]{obj});
        } else if (obj != null) {
            if (!(obj instanceof Closeable)) {
                odg.e(TAG, "FileUtil.safelyClose. the obj is not closeable, close reflectly");
                t(obj);
                return;
            }
            try {
                ((Closeable) obj).close();
            } catch (Throwable th) {
                odg.c(TAG, "FileUtil.safelyClose failed. msg:" + Log.getStackTraceString(th));
            }
        }
    }

    public static boolean v(String str, String str2) {
        BufferedWriter bufferedWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e680c2a6", new Object[]{str, str2})).booleanValue();
        }
        File file = new File(str2);
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (Exception unused) {
        }
        try {
            bufferedWriter.write(str);
            bufferedWriter.close();
            return true;
        } catch (Exception unused2) {
            bufferedWriter2 = bufferedWriter;
            u(bufferedWriter2);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.io.InputStream] */
    public static boolean c(Context context, Uri uri, String str) {
        Throwable th;
        Exception e;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("215b125", new Object[]{context, uri, str})).booleanValue();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (!knv.h(context, uri)) {
                    u(null);
                    u(null);
                    return false;
                }
                context = knv.f(context, uri);
                try {
                    fileOutputStream = new FileOutputStream(str);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    byte[] bArr = new byte[1444];
                    while (true) {
                        int read = context.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            context.close();
                            odg.c(TAG, "复制文件成功 " + str);
                            u(fileOutputStream);
                            u(context);
                            return true;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    try {
                        odg.c(TAG, "复制单个文件出错 " + e.getMessage());
                        u(fileOutputStream2);
                        u(context);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        u(fileOutputStream2);
                        u(context);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = fileOutputStream;
                    u(fileOutputStream2);
                    u(context);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e4) {
            e = e4;
            context = 0;
        } catch (Throwable th5) {
            th = th5;
            context = 0;
        }
    }

    public static boolean g(Context context, Uri uri, String str) {
        Exception e;
        ParcelFileDescriptor openFileDescriptor;
        FileChannel channel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a9bd057", new Object[]{context, uri, str})).booleanValue();
        }
        FileChannel fileChannel = 0;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            channel = new FileInputStream(openFileDescriptor.getFileDescriptor()).getChannel();
        } catch (Exception e2) {
            e = e2;
            fileChannel = null;
        } catch (Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            fileChannel = new FileOutputStream(new File(str)).getChannel();
            fileChannel.transferFrom(channel, 0L, channel.size());
            openFileDescriptor.close();
            odg.c(TAG, "copyFileNio 复制成功,path = " + str);
            u(channel);
            u(fileChannel);
            return true;
        } catch (Exception e3) {
            e = e3;
            fileChannel = channel;
            try {
                odg.c(TAG, "copyFileNio 复制单个文件出错，error = " + e.getMessage());
                u(fileChannel);
                u(fileChannel);
                return false;
            } catch (Throwable th2) {
                th = th2;
                u(fileChannel);
                u(fileChannel);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileChannel = channel;
            u(fileChannel);
            u(fileChannel);
            throw th;
        }
    }
}
