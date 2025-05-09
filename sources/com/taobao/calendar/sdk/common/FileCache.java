package com.taobao.calendar.sdk.common;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FileCache {
    private static final String TAG = "CACHE";
    private final File mCahceDir;
    private final Context mContext;

    static {
        t2o.a(414187550);
    }

    public FileCache(Context context) {
        this.mContext = context;
        File cacheDir = context.getCacheDir();
        this.mCahceDir = cacheDir;
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }
        cacheDir.getAbsolutePath();
    }

    public static String encryptMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }

    public void clear() {
        for (File file : this.mCahceDir.listFiles()) {
            file.delete();
        }
    }

    public InputStream get(String str) {
        File file = new File(this.mCahceDir, encryptMD5(str));
        if (file.exists()) {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    public boolean put(String str, InputStream inputStream) {
        FileNotFoundException e;
        IOException e2;
        File file = new File(this.mCahceDir, encryptMD5(str));
        FileOutputStream fileOutputStream = null;
        try {
            try {
                byte[] bArr = new byte[1024];
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            try {
                                break;
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        }
                    } catch (FileNotFoundException e4) {
                        e = e4;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        try {
                            inputStream.close();
                            if (fileOutputStream != null) {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        return true;
                    } catch (IOException e6) {
                        e2 = e6;
                        fileOutputStream = fileOutputStream2;
                        e2.printStackTrace();
                        try {
                            inputStream.close();
                            if (fileOutputStream != null) {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            }
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                        return true;
                    } catch (Throwable unused) {
                        fileOutputStream = fileOutputStream2;
                        try {
                            inputStream.close();
                            if (fileOutputStream != null) {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        return true;
                    }
                }
                inputStream.close();
                fileOutputStream2.flush();
                fileOutputStream2.close();
                return true;
            } catch (Throwable unused2) {
            }
        } catch (FileNotFoundException e9) {
            e = e9;
        } catch (IOException e10) {
            e2 = e10;
        }
    }
}
