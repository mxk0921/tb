package mtopsdk.common.util;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Character;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import tb.itw;
import tb.ohh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MtopUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MTOP_BIZID = 4099;
    private static final String TAG = "mtopsdk.MtopUtils";
    private static volatile Context mContext = null;
    private static volatile String mProcessName = null;
    private static final int mask = Integer.MAX_VALUE;
    private static AtomicInteger counter = new AtomicInteger();
    private static AtomicInteger ssrCounter = new AtomicInteger();
    public static final List<String> apiWhiteList = Collections.singletonList("mtop.common.gettimestamp$*");
    private static final char[] UPPER_CASE_ENCRYPT_CHARS = {ohh.LEVEL_E, 'T', 'A', 'O', ohh.LEVEL_I, 'N', 'S', 'R', 'H', ohh.LEVEL_L, ohh.LEVEL_D, 'C', 'U', 'M', 'F', 'P', 'G', ohh.LEVEL_W, 'Y', 'B', ohh.LEVEL_V, 'K', 'X', 'J', 'Q', 'Z'};
    private static final char[] LOWER_CASE_ENCRYPT_CHARS = {'e', 't', 'a', 'o', 'i', 'n', 's', 'r', 'h', 'l', 'd', 'c', 'u', 'm', 'f', 'p', 'g', 'w', 'y', 'b', 'v', 'k', 'x', 'j', 'q', 'z'};
    private static final char[] NUMBER_ENCRYPT_CHARS = {'8', '6', '1', '5', '9', '2', '3', '0', '4', '7'};

    public static String caesarEncrypt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18570047", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                charAt = UPPER_CASE_ENCRYPT_CHARS[charAt - 'A'];
            } else if (charAt >= 'a' && charAt <= 'z') {
                charAt = LOWER_CASE_ENCRYPT_CHARS[charAt - 'a'];
            } else if (charAt >= '0' && charAt <= '9') {
                charAt = NUMBER_ENCRYPT_CHARS[charAt - '0'];
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static long convertTimeFormatGMT2Long(String str) {
        Date date;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be8101dc", new Object[]{str})).longValue();
        }
        if (StringUtils.isBlank(str)) {
            return -1L;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            date = simpleDateFormat.parse(str);
        } catch (Exception unused) {
            TBSdkLog.e(TAG, "[convertTimeFormatGMT2Long]parse gmt timeformat error");
            date = null;
        }
        if (date != null) {
            return date.getTime() / 1000;
        }
        return -1L;
    }

    public static int createIntSeqNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d16cee7", new Object[0])).intValue();
        }
        return counter.incrementAndGet() & Integer.MAX_VALUE;
    }

    public static int createSsrIntSeqNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf817a61", new Object[0])).intValue();
        }
        return ssrCounter.incrementAndGet() & Integer.MAX_VALUE;
    }

    public static Context getContext() {
        if (mContext == null) {
            synchronized (MtopUtils.class) {
                if (mContext == null) {
                    try {
                        Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                        Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
                        mContext = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        TBSdkLog.e(TAG, "getContext through reflection error.");
                    }
                }
            }
        }
        return mContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        mtopsdk.common.util.MtopUtils.mProcessName = r2.processName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (mtopsdk.common.util.TBSdkLog.isLogEnable(mtopsdk.common.util.TBSdkLog.LogEnable.InfoEnable) == false) goto L_0x0085;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        mtopsdk.common.util.TBSdkLog.i(mtopsdk.common.util.MtopUtils.TAG, "get current processName succeed,processName=" + mtopsdk.common.util.MtopUtils.mProcessName);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getCurrentProcessName(android.content.Context r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = mtopsdk.common.util.MtopUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = "f9f5f1b6"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0016:
            if (r4 != 0) goto L_0x001b
            java.lang.String r4 = mtopsdk.common.util.MtopUtils.mProcessName
            return r4
        L_0x001b:
            java.lang.String r0 = mtopsdk.common.util.MtopUtils.mProcessName
            if (r0 != 0) goto L_0x0089
            java.lang.Class<mtopsdk.common.util.MtopUtils> r0 = mtopsdk.common.util.MtopUtils.class
            monitor-enter(r0)
            java.lang.String r1 = mtopsdk.common.util.MtopUtils.mProcessName     // Catch: all -> 0x0079
            if (r1 != 0) goto L_0x0085
            int r1 = android.os.Process.myPid()     // Catch: all -> 0x0079, Exception -> 0x007b
            java.lang.String r2 = "activity"
            java.lang.Object r4 = r4.getSystemService(r2)     // Catch: all -> 0x0079, Exception -> 0x007b
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch: all -> 0x0079, Exception -> 0x007b
            java.util.List r4 = r4.getRunningAppProcesses()     // Catch: all -> 0x0079, Exception -> 0x007b
            if (r4 == 0) goto L_0x0085
            int r2 = r4.size()     // Catch: all -> 0x0079, Exception -> 0x007b
            if (r2 <= 0) goto L_0x0085
            java.util.Iterator r4 = r4.iterator()     // Catch: all -> 0x0079, Exception -> 0x007b
        L_0x0042:
            boolean r2 = r4.hasNext()     // Catch: all -> 0x0079, Exception -> 0x007b
            if (r2 == 0) goto L_0x0085
            java.lang.Object r2 = r4.next()     // Catch: all -> 0x0079, Exception -> 0x007b
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: all -> 0x0079, Exception -> 0x007b
            int r3 = r2.pid     // Catch: all -> 0x0079, Exception -> 0x007b
            if (r3 != r1) goto L_0x0042
            java.lang.String r4 = r2.processName     // Catch: all -> 0x0079, Exception -> 0x007b
            mtopsdk.common.util.MtopUtils.mProcessName = r4     // Catch: all -> 0x0079, Exception -> 0x007b
            mtopsdk.common.util.TBSdkLog$LogEnable r4 = mtopsdk.common.util.TBSdkLog.LogEnable.InfoEnable     // Catch: all -> 0x0079, Exception -> 0x007b
            boolean r4 = mtopsdk.common.util.TBSdkLog.isLogEnable(r4)     // Catch: all -> 0x0079, Exception -> 0x007b
            if (r4 == 0) goto L_0x0085
            java.lang.String r4 = "mtopsdk.MtopUtils"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x0079, Exception -> 0x007b
            r1.<init>()     // Catch: all -> 0x0079, Exception -> 0x007b
            java.lang.String r2 = "get current processName succeed,processName="
            r1.append(r2)     // Catch: all -> 0x0079, Exception -> 0x007b
            java.lang.String r2 = mtopsdk.common.util.MtopUtils.mProcessName     // Catch: all -> 0x0079, Exception -> 0x007b
            r1.append(r2)     // Catch: all -> 0x0079, Exception -> 0x007b
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x0079, Exception -> 0x007b
            mtopsdk.common.util.TBSdkLog.i(r4, r1)     // Catch: all -> 0x0079, Exception -> 0x007b
            goto L_0x0085
        L_0x0079:
            r4 = move-exception
            goto L_0x0087
        L_0x007b:
            r4 = move-exception
            java.lang.String r1 = "mtopsdk.MtopUtils"
            java.lang.String r2 = "get current processName failed."
            mtopsdk.common.util.TBSdkLog.e(r1, r2, r4)     // Catch: all -> 0x0079
        L_0x0085:
            monitor-exit(r0)     // Catch: all -> 0x0079
            goto L_0x0089
        L_0x0087:
            monitor-exit(r0)     // Catch: all -> 0x0079
            throw r4
        L_0x0089:
            java.lang.String r4 = mtopsdk.common.util.MtopUtils.mProcessName
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.common.util.MtopUtils.getCurrentProcessName(android.content.Context):java.lang.String");
    }

    public static final boolean isContainChineseCharacter(String str) {
        char[] charArray;
        Character.UnicodeBlock of;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4b8933b", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        for (char c : str.toCharArray()) {
            try {
                of = Character.UnicodeBlock.of(c);
            } catch (Throwable unused) {
                if (c < 19968) {
                    continue;
                } else if (c <= 40959) {
                    return true;
                }
            }
            if (of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == Character.UnicodeBlock.GENERAL_PUNCTUATION || of == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || of == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    public static String urlDecode(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd9d9a48", new Object[]{str, str2});
        }
        if (StringUtils.isBlank(str)) {
            return str;
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (Exception e) {
            TBSdkLog.e(TAG, "[urlDecode] URLDecoder decode error. input=" + str + ", charset= " + str2, e);
            return null;
        }
    }

    public static String convertUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("652ec3f3", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(itw.URL_SEPARATOR)) {
                str = "http:".concat(str);
            }
            try {
                int indexOf = str.indexOf("?");
                if (indexOf != -1) {
                    str = str.substring(0, indexOf);
                } else {
                    int indexOf2 = str.indexOf("#");
                    if (indexOf2 != -1) {
                        str = str.substring(0, indexOf2);
                    }
                }
                return str;
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static boolean isAppOpenMock(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cee985a", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            context = getContext();
        }
        if (context == null) {
            TBSdkLog.e(TAG, "[isAppOpenMock] context is null!");
            return false;
        }
        try {
            byte[] readFile = readFile(context.getFilesDir().getCanonicalPath() + "/mock/openMock.json");
            if (readFile != null) {
                try {
                    return new JSONObject(new String(readFile)).getBoolean("openMock");
                } catch (Exception e) {
                    TBSdkLog.e(TAG, "[isAppOpenMock]parse openMock flag error in isOpenMock.json .", e);
                }
            }
            return false;
        } catch (IOException e2) {
            TBSdkLog.e(TAG, "[isAppOpenMock] parse ExternalFilesDir/mock/openMock.json filePath error.", e2);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
        if (r5 == null) goto L_0x009a;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00a2: IF  (r5 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:42:0x00a7, block:B:40:0x00a2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.ByteArrayOutputStream, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] readFile(java.lang.String r9) {
        /*
            r0 = 0
            java.lang.String r1 = "readFile error.filePath={"
            java.lang.String r2 = "mtopsdk.MtopUtils"
            com.android.alibaba.ip.runtime.IpChange r3 = mtopsdk.common.util.MtopUtils.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r1 = "f08cf7fa"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r9
            java.lang.Object r9 = r3.ipc$dispatch(r1, r2)
            byte[] r9 = (byte[]) r9
            return r9
        L_0x001c:
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch: all -> 0x004d, FileNotFoundException -> 0x0051
            r4.<init>(r9)     // Catch: all -> 0x004d, FileNotFoundException -> 0x0051
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: all -> 0x004d, FileNotFoundException -> 0x0051
            r5.<init>(r4)     // Catch: all -> 0x004d, FileNotFoundException -> 0x0051
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0048, FileNotFoundException -> 0x004b
            r4.<init>()     // Catch: all -> 0x0048, FileNotFoundException -> 0x004b
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch: all -> 0x003b, FileNotFoundException -> 0x0078
        L_0x0030:
            int r7 = r5.read(r6)     // Catch: all -> 0x003b, FileNotFoundException -> 0x0078
            r8 = -1
            if (r7 == r8) goto L_0x003d
            r4.write(r6, r0, r7)     // Catch: all -> 0x003b, FileNotFoundException -> 0x0078
            goto L_0x0030
        L_0x003b:
            r0 = move-exception
            goto L_0x0054
        L_0x003d:
            byte[] r3 = r4.toByteArray()     // Catch: all -> 0x003b, FileNotFoundException -> 0x0078
            r4.close()     // Catch: IOException -> 0x0044
        L_0x0044:
            r5.close()     // Catch: IOException -> 0x009a
            goto L_0x009a
        L_0x0048:
            r0 = move-exception
            r4 = r3
            goto L_0x0054
        L_0x004b:
            r4 = r3
            goto L_0x0078
        L_0x004d:
            r0 = move-exception
            r4 = r3
            r5 = r4
            goto L_0x0054
        L_0x0051:
            r4 = r3
            r5 = r4
            goto L_0x0078
        L_0x0054:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x0076
            r6.<init>()     // Catch: all -> 0x0076
            r6.append(r1)     // Catch: all -> 0x0076
            r6.append(r9)     // Catch: all -> 0x0076
            java.lang.String r9 = "}"
            r6.append(r9)     // Catch: all -> 0x0076
            java.lang.String r9 = r6.toString()     // Catch: all -> 0x0076
            mtopsdk.common.util.TBSdkLog.w(r2, r9, r0)     // Catch: all -> 0x0076
            if (r4 == 0) goto L_0x0073
            r4.close()     // Catch: IOException -> 0x0072
            goto L_0x0073
        L_0x0072:
        L_0x0073:
            if (r5 == 0) goto L_0x009a
            goto L_0x0044
        L_0x0076:
            r9 = move-exception
            goto L_0x009b
        L_0x0078:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x0076
            r0.<init>()     // Catch: all -> 0x0076
            r0.append(r1)     // Catch: all -> 0x0076
            r0.append(r9)     // Catch: all -> 0x0076
            java.lang.String r9 = "} is not found."
            r0.append(r9)     // Catch: all -> 0x0076
            java.lang.String r9 = r0.toString()     // Catch: all -> 0x0076
            mtopsdk.common.util.TBSdkLog.w(r2, r9)     // Catch: all -> 0x0076
            if (r4 == 0) goto L_0x0097
            r4.close()     // Catch: IOException -> 0x0096
            goto L_0x0097
        L_0x0096:
        L_0x0097:
            if (r5 == 0) goto L_0x009a
            goto L_0x0044
        L_0x009a:
            return r3
        L_0x009b:
            if (r4 == 0) goto L_0x00a2
            r4.close()     // Catch: IOException -> 0x00a1
            goto L_0x00a2
        L_0x00a1:
        L_0x00a2:
            if (r5 == 0) goto L_0x00a7
            r5.close()     // Catch: IOException -> 0x00a7
        L_0x00a7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.common.util.MtopUtils.readFile(java.lang.String):byte[]");
    }

    public static boolean isApkDebug(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34f1efe4", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            context = getContext();
        }
        if (context == null) {
            TBSdkLog.e(TAG, "[isApkDebug] context is null!");
            return false;
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r4.importance == 100) goto L_0x0061;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
        mtopsdk.common.util.TBSdkLog.e(mtopsdk.common.util.MtopUtils.TAG, "get current process is background succeed, result=" + r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isCurrentProcessBackground(android.content.Context r6) {
        /*
            r0 = 0
            r1 = 1
            java.lang.String r2 = "mtopsdk.MtopUtils"
            com.android.alibaba.ip.runtime.IpChange r3 = mtopsdk.common.util.MtopUtils.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r2 = "4992b017"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r2, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            mtopsdk.mtop.global.SwitchConfig r3 = mtopsdk.mtop.global.SwitchConfig.getInstance()
            boolean r3 = r3.getProcessBgMethodNew()
            if (r3 != 0) goto L_0x002b
            boolean r6 = tb.inx.h()
            return r6
        L_0x002b:
            if (r6 != 0) goto L_0x002e
            return r0
        L_0x002e:
            int r3 = android.os.Process.myPid()     // Catch: all -> 0x0077
            java.lang.String r4 = "activity"
            java.lang.Object r6 = r6.getSystemService(r4)     // Catch: all -> 0x0077
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6     // Catch: all -> 0x0077
            java.util.List r6 = r6.getRunningAppProcesses()     // Catch: all -> 0x0077
            if (r6 == 0) goto L_0x008e
            int r4 = r6.size()     // Catch: all -> 0x0077
            if (r4 <= 0) goto L_0x008e
            java.util.Iterator r6 = r6.iterator()     // Catch: all -> 0x0077
        L_0x004a:
            boolean r4 = r6.hasNext()     // Catch: all -> 0x0077
            if (r4 == 0) goto L_0x008e
            java.lang.Object r4 = r6.next()     // Catch: all -> 0x0077
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4     // Catch: all -> 0x0077
            int r5 = r4.pid     // Catch: all -> 0x0077
            if (r5 != r3) goto L_0x004a
            int r6 = r4.importance     // Catch: all -> 0x0077
            r3 = 100
            if (r6 == r3) goto L_0x0061
            r0 = 1
        L_0x0061:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x0077
            r6.<init>()     // Catch: all -> 0x0077
            java.lang.String r1 = "get current process is background succeed, result="
            r6.append(r1)     // Catch: all -> 0x0077
            r6.append(r0)     // Catch: all -> 0x0077
            java.lang.String r6 = r6.toString()     // Catch: all -> 0x0077
            mtopsdk.common.util.TBSdkLog.e(r2, r6)     // Catch: all -> 0x0077
            goto L_0x008e
        L_0x0077:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "get current process whether background exception, "
            r1.<init>(r3)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            mtopsdk.common.util.TBSdkLog.e(r2, r6)
        L_0x008e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.common.util.MtopUtils.isCurrentProcessBackground(android.content.Context):boolean");
    }

    static {
        t2o.a(589299797);
    }

    public static Serializable readObject(File file, String str) {
        Serializable serializable;
        FileInputStream fileInputStream;
        Throwable th;
        File file2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Serializable) ipChange.ipc$dispatch("d8581e0d", new Object[]{file, str});
        }
        try {
            file2 = new File(file, str);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            serializable = null;
        }
        if (!file2.exists()) {
            return null;
        }
        fileInputStream = new FileInputStream(file2);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(fileInputStream));
            serializable = (Serializable) objectInputStream.readObject();
            try {
                objectInputStream.close();
            } catch (Throwable th3) {
                th = th3;
                try {
                    TBSdkLog.w(TAG, String.format("readObject error.fileDir={%s},fileName={%s}", file, str), th);
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            serializable = null;
            TBSdkLog.w(TAG, String.format("readObject error.fileDir={%s},fileName={%s}", file, str), th);
        }
        try {
        } catch (IOException unused2) {
            return serializable;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean writeObject(java.io.Serializable r10, java.io.File r11, java.lang.String r12) {
        /*
            r0 = 2
            r1 = 3
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = mtopsdk.common.util.MtopUtils.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001f
            java.lang.String r5 = "1b03af5e"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r2] = r11
            r1[r0] = r12
            java.lang.Object r10 = r4.ipc$dispatch(r5, r1)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L_0x001f:
            r4 = 0
            boolean r5 = r11.exists()     // Catch: all -> 0x002a
            if (r5 != 0) goto L_0x002e
            r11.mkdirs()     // Catch: all -> 0x002a
            goto L_0x002e
        L_0x002a:
            r5 = move-exception
            r6 = r5
            r5 = r4
            goto L_0x0071
        L_0x002e:
            java.io.File r5 = new java.io.File     // Catch: all -> 0x002a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x002a
            r6.<init>()     // Catch: all -> 0x002a
            r6.append(r12)     // Catch: all -> 0x002a
            java.util.Random r7 = new java.util.Random     // Catch: all -> 0x002a
            r7.<init>()     // Catch: all -> 0x002a
            r8 = 10
            int r7 = r7.nextInt(r8)     // Catch: all -> 0x002a
            r6.append(r7)     // Catch: all -> 0x002a
            java.lang.String r6 = r6.toString()     // Catch: all -> 0x002a
            r5.<init>(r11, r6)     // Catch: all -> 0x002a
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: all -> 0x0070
            r6.<init>(r5)     // Catch: all -> 0x0070
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch: all -> 0x006b
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch: all -> 0x006b
            r7.<init>(r6)     // Catch: all -> 0x006b
            r4.<init>(r7)     // Catch: all -> 0x006b
            r4.writeObject(r10)     // Catch: all -> 0x006b
            r4.flush()     // Catch: all -> 0x006b
            r4.close()     // Catch: all -> 0x006b
            r6.close()     // Catch: IOException -> 0x0069
            goto L_0x008e
        L_0x0069:
            goto L_0x008e
        L_0x006b:
            r4 = move-exception
            r9 = r6
            r6 = r4
            r4 = r9
            goto L_0x0071
        L_0x0070:
            r6 = move-exception
        L_0x0071:
            java.lang.String r7 = "mtopsdk.MtopUtils"
            java.lang.String r8 = "writeObject error.fileDir={%s},fileName={%s},object={%s}"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: all -> 0x009a
            r1[r3] = r11     // Catch: all -> 0x009a
            r1[r2] = r12     // Catch: all -> 0x009a
            r1[r0] = r10     // Catch: all -> 0x009a
            java.lang.String r10 = java.lang.String.format(r8, r1)     // Catch: all -> 0x009a
            mtopsdk.common.util.TBSdkLog.w(r7, r10, r6)     // Catch: all -> 0x009a
            if (r4 == 0) goto L_0x008d
            r4.close()     // Catch: IOException -> 0x008c
            goto L_0x008d
        L_0x008c:
        L_0x008d:
            r2 = 0
        L_0x008e:
            if (r2 == 0) goto L_0x0099
            java.io.File r10 = new java.io.File
            r10.<init>(r11, r12)
            boolean r2 = r5.renameTo(r10)
        L_0x0099:
            return r2
        L_0x009a:
            r10 = move-exception
            if (r4 == 0) goto L_0x00a0
            r4.close()     // Catch: IOException -> 0x00a0
        L_0x00a0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.common.util.MtopUtils.writeObject(java.io.Serializable, java.io.File, java.lang.String):boolean");
    }
}
