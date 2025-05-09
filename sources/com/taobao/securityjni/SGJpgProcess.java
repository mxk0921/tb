package com.taobao.securityjni;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Process;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SGJpgProcess {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SG_Compatible";
    private static Method sOpenNonAssetMethod;
    private static boolean sOpenNonAssetMethodFetched;
    private Context ctx;
    private static String ROOT_FOLDER = "SGLib";
    private static String JPG_PREFIX = "yw_1222";
    private static String JPG_DIR_PREFIX = "jpgs_";
    private static String FINISHED_FILE_NAME = "SGJpgProcessFinished";
    private static String[] DEFAULT_FILES = {"res/drawable/yw_1222.jpg", "res/drawable/yw_1222_mwua.jpg", "res/drawable/yw_1222_sharetoken.jpg"};

    public SGJpgProcess(Context context) {
        this.ctx = context;
    }

    private boolean deleteDir(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d8c8424", new Object[]{this, file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            String[] list = file.list();
            for (int i = 0; list != null && i < list.length; i++) {
                if (!deleteDir(new File(file, list[i]))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    private static String getProcessName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7512d303", new Object[]{context});
        }
        try {
            int myPid = Process.myPid();
            if (context == null) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    String str = runningAppProcessInfo.processName;
                    if (str != null) {
                        return str;
                    }
                    return "";
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private boolean isMainProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[]{this})).booleanValue();
        }
        try {
            return getProcessName(this.ctx).equals(this.ctx.getPackageName());
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean isPathSecurityValid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a128742", new Object[]{this, str})).booleanValue();
        }
        if (Pattern.compile("\\S*(\\.\\.)+(%)*\\S*").matcher(str).find()) {
            return false;
        }
        return true;
    }

    private boolean unzipByPrefix(String str, String str2, String str3, String[] strArr) {
        ZipEntry entry;
        int indexOf;
        FileOutputStream fileOutputStream;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe3c9ad", new Object[]{this, str, str2, str3, strArr})).booleanValue();
        }
        if (strArr != null) {
            try {
                if (strArr.length > 0) {
                    ZipFile zipFile = new ZipFile(str);
                    int length = strArr.length;
                    for (int i2 = 0; i2 < length; i2 += i) {
                        String str4 = strArr[i2];
                        if (isPathSecurityValid(str4) && (entry = zipFile.getEntry(str4)) != null && (indexOf = str4.indexOf(str3)) >= 0) {
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
                                int i3 = 0;
                                while (i3 < size) {
                                    int read = inputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    bufferedOutputStream.write(bArr, 0, read);
                                    i3 += read;
                                }
                                if (i3 != size) {
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
                                i = 1;
                            } catch (Exception unused5) {
                                bufferedOutputStream2 = bufferedOutputStream;
                                try {
                                    bufferedOutputStream2.flush();
                                    bufferedOutputStream2.close();
                                    fileOutputStream.close();
                                } catch (Exception unused6) {
                                }
                                return false;
                            } catch (Throwable th4) {
                                th = th4;
                                bufferedOutputStream2 = bufferedOutputStream;
                                try {
                                    bufferedOutputStream2.flush();
                                    bufferedOutputStream2.close();
                                    fileOutputStream.close();
                                } catch (Exception unused7) {
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

    private boolean writeEmptyFile(File file) {
        Throwable th;
        IOException e;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6013ca8c", new Object[]{this, file})).booleanValue();
        }
        FileOutputStream fileOutputStream2 = null;
        if (file != null) {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file.getAbsolutePath());
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException unused) {
                }
                return true;
            } catch (IOException e3) {
                e = e3;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        } else {
            throw null;
        }
    }

    public InputStream openNonAsset(AssetManager assetManager, String str) {
        fetchOpenNonAssetMethod();
        Method method = sOpenNonAssetMethod;
        if (method == null) {
            return null;
        }
        try {
            return (InputStream) method.invoke(assetManager, str);
        } catch (IllegalAccessException unused) {
            return null;
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    public boolean unzipFinished() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("67cb0a05", new Object[]{this})).booleanValue() : unzipFinished(DEFAULT_FILES);
    }

    public boolean unzipFinished(String[] strArr) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8c5d182", new Object[]{this, strArr})).booleanValue();
        }
        try {
            if (this.ctx != null && isMainProcess()) {
                String absolutePath = this.ctx.getDir(ROOT_FOLDER, 0).getAbsolutePath();
                String str = this.ctx.getApplicationInfo().sourceDir;
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
                File file4 = new File(str2, FINISHED_FILE_NAME);
                if (file4.exists()) {
                    return true;
                }
                if (unzipByAssetManager(str2, JPG_PREFIX, strArr) || unzipByPrefix(str, str2, JPG_PREFIX, strArr)) {
                    return writeEmptyFile(file4);
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void fetchOpenNonAssetMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db4780af", new Object[]{this});
        } else if (!sOpenNonAssetMethodFetched) {
            try {
                Method declaredMethod = AssetManager.class.getDeclaredMethod("openNonAsset", String.class);
                sOpenNonAssetMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sOpenNonAssetMethodFetched = true;
        }
    }

    private boolean unzipByAssetManager(String str, String str2, String[] strArr) {
        int indexOf;
        FileOutputStream fileOutputStream;
        Throwable th;
        int available;
        BufferedOutputStream bufferedOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9353d0c", new Object[]{this, str, str2, strArr})).booleanValue();
        }
        for (String str3 : strArr) {
            if (isPathSecurityValid(str3) && (indexOf = str3.indexOf(str2)) >= 0) {
                try {
                    InputStream openNonAsset = openNonAsset(this.ctx.getAssets(), str3);
                    if (openNonAsset == null) {
                        return false;
                    }
                    String substring = str3.substring(indexOf);
                    BufferedOutputStream bufferedOutputStream2 = null;
                    try {
                        available = openNonAsset.available();
                        fileOutputStream = new FileOutputStream(new File(str, substring));
                        try {
                            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
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
                        byte[] bArr = new byte[available];
                        int i = 0;
                        while (i < available) {
                            int read = openNonAsset.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                            i += read;
                        }
                        if (i != available) {
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
                            return false;
                        }
                    } catch (Exception unused5) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        try {
                            bufferedOutputStream2.flush();
                            bufferedOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Exception unused6) {
                        }
                        return false;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedOutputStream2 = bufferedOutputStream;
                        try {
                            bufferedOutputStream2.flush();
                            bufferedOutputStream2.close();
                            fileOutputStream.close();
                            throw th;
                        } catch (Exception unused7) {
                            return false;
                        }
                    }
                } catch (Exception unused8) {
                    if (str3.indexOf(MspEventTypes.ACTION_STRING_SHARETOKEN) == -1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    static {
        t2o.a(421527567);
    }
}
