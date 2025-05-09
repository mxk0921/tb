package com.taobao.wireless.security.adapter.common;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SPUtility2 {

    /* renamed from: а  reason: contains not printable characters */
    private static final String f527 = ".com.taobao.dp";

    /* renamed from: б  reason: contains not printable characters */
    private static final String f528 = "SGMANAGER_DATA";

    /* renamed from: в  reason: contains not printable characters */
    private static final String f529 = "SGMANAGER_DATA2";

    /* renamed from: г  reason: contains not printable characters */
    private static final String f530 = "sp.lock";

    /* renamed from: д  reason: contains not printable characters */
    private static Context f531 = null;

    /* renamed from: е  reason: contains not printable characters */
    private static C0810 f532 = null;

    /* renamed from: ж  reason: contains not printable characters */
    private static final int f533 = 1;

    /* renamed from: з  reason: contains not printable characters */
    private static final int f534 = 2;

    /* renamed from: и  reason: contains not printable characters */
    private static final int f535 = 3;

    /* renamed from: й  reason: contains not printable characters */
    private static final int f536 = 4;

    /* renamed from: к  reason: contains not printable characters */
    private static final int f537 = 5;

    /* renamed from: л  reason: contains not printable characters */
    private static final int f538 = 6;

    /* renamed from: м  reason: contains not printable characters */
    private static final int f539 = 0;

    /* renamed from: н  reason: contains not printable characters */
    private static final int f540 = 1;

    /* renamed from: ё  reason: contains not printable characters */
    private static final int f541 = 0;

    public static String getTempFile(String str) throws IOException {
        String rootDir = rootDir();
        if (rootDir == null) {
            return "";
        }
        File file = new File(rootDir, str);
        return (file.exists() || file.createNewFile()) ? file.getAbsolutePath() : "";
    }

    public static void init(Context context) {
        if (context != null) {
            f531 = context;
            f532 = new C0810(context, f530);
        }
    }

    public static String read(String str) {
        String str2 = "";
        if (!m339(1)) {
            return str2;
        }
        String tempFile = getTempFile(str);
        synchronized (SPUtility2.class) {
            if (f532.m360()) {
                str2 = m340(tempFile, true);
            }
            f532.m361();
        }
        return str2;
    }

    public static String readFromSPUnified(String str, String str2, String str3) {
        C0810 r3;
        String str4;
        if (str2 != null && str2.length() > 0 && str != null && str.length() > 0) {
            synchronized (SPUtility2.class) {
                try {
                    if (f532.m360() && (str4 = m342(str, str2, str3)) != null) {
                        if (str4.length() > 0) {
                            str3 = str4;
                        }
                    }
                    r3 = f532;
                } catch (Exception unused) {
                    r3 = f532;
                } catch (Throwable th) {
                    f532.m361();
                    throw th;
                }
                r3.m361();
            }
        }
        return str3;
    }

    public static String readSS(Context context, String str) {
        String str2 = null;
        if (context != null) {
            try {
                if ((Build.VERSION.SDK_INT < 23 || context.getApplicationInfo().targetSdkVersion < 23) && str != null && str.length() > 0) {
                    synchronized (SPUtility2.class) {
                        if (f532.m360()) {
                            str2 = Settings.System.getString(context.getContentResolver(), str);
                        }
                        f532.m361();
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return str2;
    }

    public static boolean removeFromSPUnified(String str, String str2, boolean z) {
        if (str2 == null || str2.length() <= 0 || str == null || str.length() <= 0) {
            return false;
        }
        synchronized (SPUtility2.class) {
            if (f532.m360()) {
                boolean z2 = m343(str, str2);
                f532.m361();
                return z2;
            }
            f532.m361();
            return false;
        }
    }

    public static String rootDir() {
        try {
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                return null;
            }
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + f527);
            if (file.exists() || file.mkdir()) {
                return file.getAbsolutePath();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int saveToFileUnifiedForNative(String str, String str2, String str3, boolean z) {
        int i = 1;
        if (str2 != null && str2.length() > 0 && str != null && str.length() > 0) {
            synchronized (SPUtility2.class) {
                if (f532.m360()) {
                    i = m346(f529, str + "_" + str2, str3);
                }
                f532.m361();
            }
        }
        return i;
    }

    public static boolean saveToSPUnified(String str, String str2, String str3, boolean z) {
        return saveToFileUnifiedForNative(str, str2, str3, z) == 0;
    }

    public static void write(String str, String str2) {
        String tempFile;
        try {
            if (m339(0) && (tempFile = getTempFile(str)) != null && tempFile.length() > 0) {
                synchronized (SPUtility2.class) {
                    if (f532.m360()) {
                        m345(tempFile, str2, false);
                    }
                    f532.m361();
                }
            }
        } catch (IOException unused) {
        }
    }

    public static boolean writeSS(Context context, String str, String str2) {
        boolean z = false;
        if (context != null) {
            try {
                if ((Build.VERSION.SDK_INT < 23 || context.getApplicationInfo().targetSdkVersion < 23) && str != null && str.length() > 0) {
                    synchronized (SPUtility2.class) {
                        if (f532.m360()) {
                            z = Settings.System.putString(context.getContentResolver(), str, str2);
                        }
                        f532.m361();
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return z;
    }

    /* renamed from: а  reason: contains not printable characters */
    private static boolean m339(int i) {
        Context context = f531;
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (context == null) {
            return false;
        }
        try {
            if (context.getApplicationInfo().targetSdkVersion < 23) {
                return true;
            }
            try {
                Method method = Context.class.getMethod("checkSelfPermission", String.class);
                if (method != null) {
                    String str = "android.permission.READ_EXTERNAL_STORAGE";
                    if (i == 0) {
                        str = "android.permission.WRITE_EXTERNAL_STORAGE";
                    }
                    if (((Integer) method.invoke(context, str)).intValue() == 0) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
            return false;
        } catch (Throwable unused2) {
            return true;
        }
    }

    /* renamed from: б  reason: contains not printable characters */
    private static String m340(String str, boolean z) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(str))));
        String readLine = bufferedReader.readLine();
        if (readLine == null) {
            readLine = "";
        }
        sb.append(readLine);
        if (!z) {
            while (true) {
                String readLine2 = bufferedReader.readLine();
                if (readLine2 == null) {
                    break;
                }
                sb.append(readLine2);
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    /* renamed from: в  reason: contains not printable characters */
    private static JSONObject m341(String str) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(f531.getFilesDir().getAbsolutePath() + File.separator + str))));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        bufferedReader.close();
                        return new JSONObject(sb.toString());
                    }
                }
            } catch (Exception unused) {
                if (bufferedReader == null) {
                    return null;
                }
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                    return null;
                }
            } catch (Throwable unused3) {
                if (bufferedReader == null) {
                    return null;
                }
                bufferedReader.close();
            }
        } catch (Exception unused4) {
            bufferedReader = null;
        } catch (Throwable unused5) {
            bufferedReader = null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: Exception -> 0x0031
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:136)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.convertToHandlers(AttachTryCatchVisitor.java:123)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:59)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:47)
        */
    /* renamed from: г  reason: contains not printable characters */
    private static java.lang.String m342(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
        /*
            if (r2 == 0) goto L_0x0031
            r2.length()
            r0 = move-result
            if (r0 <= 0) goto L_0x0031
            if (r1 == 0) goto L_0x0031
            r1.length()
            r0 = move-result
            if (r0 <= 0) goto L_0x0031
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            r0.append(r2)
            r0.toString()
            r1 = move-result
            java.lang.String r2 = "SGMANAGER_DATA2"
            m341(r2)
            r2 = move-result
            if (r2 == 0) goto L_0x0031
            r2.getString(r1)
            r1 = move-result
            r3 = r1
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.wireless.security.adapter.common.SPUtility2.m342(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: Exception -> 0x0040
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:136)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.convertToHandlers(AttachTryCatchVisitor.java:123)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:59)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:47)
        */
    /* renamed from: д  reason: contains not printable characters */
    private static boolean m343(java.lang.String r3, java.lang.String r4) {
        /*
            android.content.Context r0 = com.taobao.wireless.security.adapter.common.SPUtility2.f531
            r1 = 0
            if (r0 == 0) goto L_0x0040
            if (r4 == 0) goto L_0x0040
            r4.length()
            r2 = move-result
            if (r2 <= 0) goto L_0x0040
            if (r3 == 0) goto L_0x0040
            r3.length()
            r2 = move-result
            if (r2 <= 0) goto L_0x0040
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = "_"
            r2.append(r3)
            r2.append(r4)
            r2.toString()
            r3 = move-result
            java.lang.String r4 = "SGMANAGER_DATA2"
            m341(r4)
            r2 = move-result
            if (r2 == 0) goto L_0x0040
            r2.remove(r3)
            r2.toString()
            r3 = move-result
            m344(r0, r4, r3)
            r3 = move-result
            if (r3 != 0) goto L_0x0040
            r3 = 1
            r1 = 1
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.wireless.security.adapter.common.SPUtility2.m343(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: е  reason: contains not printable characters */
    private static int m344(Context context, String str, String str2) {
        Throwable th;
        OutputStreamWriter outputStreamWriter = null;
        try {
            String absolutePath = context.getFilesDir().getAbsolutePath();
            if (absolutePath != null && absolutePath.length() > 0) {
                File file = new File(absolutePath + File.separator + str + ".tmp");
                StringBuilder sb = new StringBuilder();
                sb.append(absolutePath);
                sb.append(File.separator);
                sb.append(str);
                File file2 = new File(sb.toString());
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(file));
                try {
                    outputStreamWriter2.write(str2);
                    outputStreamWriter2.close();
                    file2.delete();
                    return file.renameTo(file2) ? 0 : 5;
                } catch (Exception unused) {
                    outputStreamWriter = outputStreamWriter2;
                    if (outputStreamWriter == null) {
                        return 6;
                    }
                    try {
                        outputStreamWriter.close();
                        return 6;
                    } catch (Exception unused2) {
                        return 6;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    if (outputStreamWriter != null) {
                        try {
                            outputStreamWriter.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            }
            return 4;
        } catch (Exception unused4) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: ж  reason: contains not printable characters */
    private static void m345(String str, String str2, boolean z) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str), z);
        fileOutputStream.write(str2.getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: Exception -> 0x0029
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:136)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.convertToHandlers(AttachTryCatchVisitor.java:123)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:59)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:47)
        */
    /* renamed from: ё  reason: contains not printable characters */
    private static int m346(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        /*
            android.content.Context r0 = com.taobao.wireless.security.adapter.common.SPUtility2.f531
            if (r3 == 0) goto L_0x0029
            r3.length()
            r1 = move-result
            if (r1 <= 0) goto L_0x0029
            if (r2 == 0) goto L_0x0029
            r2.length()
            r1 = move-result
            if (r1 <= 0) goto L_0x0029
            m341(r2)
            r1 = move-result
            if (r1 != 0) goto L_0x001d
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r1.put(r3, r4)
            r1.toString()
            r3 = move-result
            m344(r0, r2, r3)
            r2 = move-result
            goto L_0x002a
        L_0x0029:
            r2 = 2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.wireless.security.adapter.common.SPUtility2.m346(java.lang.String, java.lang.String, java.lang.String):int");
    }
}
