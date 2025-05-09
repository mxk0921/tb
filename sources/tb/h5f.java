package tb;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h5f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "SGLib";
    private static final String f = "yw_1222";
    private static final String g = "SGJpgProcessFinished";
    private static final String[] h = {"res/drawable/yw_1222.jpg", "res/drawable/yw_1222_mwua.jpg", "res/drawable/yw_1222_sharetoken.jpg"};
    private static final String i = "SG_Compatible";
    private static Method j;
    private static boolean k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final Pattern f20420a = Pattern.compile("\\S*(\\.\\.)+(%)*\\S*");

        public static /* synthetic */ Pattern a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pattern) ipChange.ipc$dispatch("d6fe7a40", new Object[0]);
            }
            return f20420a;
        }
    }

    public h5f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(h5f h5fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitSGJpgProcess");
    }

    public static InputStream r(AssetManager assetManager, String str) {
        q();
        Method method = j;
        if (method == null) {
            return null;
        }
        try {
            return (InputStream) method.invoke(assetManager, str);
        } catch (IllegalAccessException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    private static boolean t(String str, String str2, String str3, String[] strArr) {
        ZipEntry entry;
        int indexOf;
        FileOutputStream fileOutputStream;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe3c9ad", new Object[]{str, str2, str3, strArr})).booleanValue();
        }
        if (strArr != null) {
            try {
                if (strArr.length > 0) {
                    ZipFile zipFile = new ZipFile(str);
                    for (String str4 : strArr) {
                        if (!a.a().matcher(str4).find() && (entry = zipFile.getEntry(str4)) != null && (indexOf = str4.indexOf(str3)) >= 0) {
                            InputStream inputStream = zipFile.getInputStream(entry);
                            int size = (int) entry.getSize();
                            String substring = str4.substring(indexOf);
                            BufferedOutputStream bufferedOutputStream2 = null;
                            try {
                                fileOutputStream = new FileOutputStream(new File(str2, substring));
                                try {
                                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream, size);
                                } catch (Exception unused) {
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Exception unused2) {
                                fileOutputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream = null;
                            }
                            try {
                                byte[] bArr = new byte[size];
                                int i2 = 0;
                                while (i2 < size) {
                                    int read = inputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    bufferedOutputStream.write(bArr, 0, read);
                                    i2 += read;
                                }
                                if (i2 != size) {
                                    try {
                                        bufferedOutputStream.flush();
                                        bufferedOutputStream.close();
                                        fileOutputStream.close();
                                    } catch (Exception unused3) {
                                    }
                                    return false;
                                }
                                try {
                                    bufferedOutputStream.flush();
                                    bufferedOutputStream.close();
                                    fileOutputStream.close();
                                } catch (Exception unused4) {
                                }
                            } catch (Exception unused5) {
                                bufferedOutputStream2 = bufferedOutputStream;
                                if (bufferedOutputStream2 != null) {
                                    try {
                                        bufferedOutputStream2.flush();
                                        bufferedOutputStream2.close();
                                    } catch (Exception unused6) {
                                        return false;
                                    }
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                return false;
                            } catch (Throwable th4) {
                                th = th4;
                                bufferedOutputStream2 = bufferedOutputStream;
                                if (bufferedOutputStream2 != null) {
                                    try {
                                        bufferedOutputStream2.flush();
                                        bufferedOutputStream2.close();
                                    } catch (Exception unused7) {
                                        throw th;
                                    }
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        }
                    }
                    return true;
                }
            } catch (IOException unused8) {
            }
        }
        return false;
    }

    private static boolean v(File file) {
        Throwable th;
        IOException e2;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6013ca8c", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file.getAbsolutePath());
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e2 = e3;
        }
        try {
            fileOutputStream.close();
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            return true;
        } catch (IOException e4) {
            e2 = e4;
            fileOutputStream2 = fileOutputStream;
            e2.printStackTrace();
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
        } else if (!u(application, h)) {
            jdh.m("SGJpgProcess", "unzipFinished return false", new Object[0]);
        }
    }

    private static void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db4780af", new Object[0]);
        } else if (!k) {
            try {
                Method declaredMethod = AssetManager.class.getDeclaredMethod("openNonAsset", String.class);
                j = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                jdh.f(i, "Failed to retrieve openNonAsset method", e2);
            }
            k = true;
        }
    }

    private static boolean s(Context context, String str, String[] strArr) {
        int indexOf;
        FileOutputStream fileOutputStream;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ca11034", new Object[]{context, str, strArr})).booleanValue();
        }
        for (String str2 : strArr) {
            if (!a.a().matcher(str2).find() && (indexOf = str2.indexOf(f)) >= 0) {
                try {
                    InputStream r = r(context.getAssets(), str2);
                    if (r == null) {
                        return false;
                    }
                    String substring = str2.substring(indexOf);
                    BufferedOutputStream bufferedOutputStream2 = null;
                    try {
                        int available = r.available();
                        fileOutputStream = new FileOutputStream(new File(str, substring));
                        try {
                            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        } catch (Exception unused) {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            byte[] bArr = new byte[available];
                            int i2 = 0;
                            while (i2 < available) {
                                int read = r.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, read);
                                i2 += read;
                            }
                            if (i2 != available) {
                                try {
                                    bufferedOutputStream.flush();
                                    bufferedOutputStream.close();
                                    fileOutputStream.close();
                                } catch (Exception unused2) {
                                }
                                return false;
                            }
                            try {
                                bufferedOutputStream.flush();
                                bufferedOutputStream.close();
                                fileOutputStream.close();
                            } catch (Exception unused3) {
                                return false;
                            }
                        } catch (Exception unused4) {
                            bufferedOutputStream2 = bufferedOutputStream;
                            if (bufferedOutputStream2 != null) {
                                try {
                                    bufferedOutputStream2.flush();
                                    bufferedOutputStream2.close();
                                } catch (Exception unused5) {
                                    return false;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return false;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedOutputStream2 = bufferedOutputStream;
                            if (bufferedOutputStream2 != null) {
                                try {
                                    bufferedOutputStream2.flush();
                                    bufferedOutputStream2.close();
                                } catch (Exception unused6) {
                                    return false;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception unused7) {
                        fileOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = null;
                    }
                } catch (Exception unused8) {
                    if (!str2.contains(MspEventTypes.ACTION_STRING_SHARETOKEN)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean u(Context context, String[] strArr) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("265b20dc", new Object[]{context, strArr})).booleanValue();
        }
        try {
            String absolutePath = context.getDir(e, 0).getAbsolutePath();
            String str = context.getApplicationInfo().sourceDir;
            String str2 = null;
            if (str != null) {
                if (new File(str).exists()) {
                    str2 = absolutePath + "/app_" + (file.lastModified() / 1000);
                }
                File file2 = new File(str2);
                if (!file2.exists()) {
                    file2.mkdir();
                }
                str2 = str2 + "/pre_unzip_jpgs";
                File file3 = new File(str2);
                if (!file3.exists()) {
                    file3.mkdir();
                }
            }
            File file4 = new File(str2, g);
            if (file4.exists()) {
                return true;
            }
            if (s(context, str2, strArr) || t(str, str2, f, strArr)) {
                return v(file4);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
