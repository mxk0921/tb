package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.TLogNative;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadFileType;
import com.taobao.tao.log.statistics.UploadReason;
import com.taobao.tao.log.statistics.UploadStage;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hf9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_NEED_WIFI = 2;
    public static final int FLAG_NO_RETRY = 1;
    public static final int FLAG_ORIGIN_FILE = 4;
    public static final int FLAG_ORIGIN_WITH_WIFI = 6;
    public static final int FLAG_ORIGIN_WITH_WIFI_NO_RETRY = 7;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, TLogEventHelper.UploadEventInfo> f20598a = new ConcurrentHashMap();

    static {
        t2o.a(767557718);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707bcb4d", new Object[0]);
            return;
        }
        TLog.logd("TLOG", "FileUploadManager", "checkFailedUpload");
        File[] listFiles = b5s.h().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.isDirectory()) {
                    try {
                        TLog.logd("TLOG", "FileUploadManager", "Handle retry file: " + file.getName());
                        if (((ConcurrentHashMap) f20598a).containsKey(file.getName())) {
                            TLog.loge("TLOG", "FileUploadManager", "Ignore the new upload task: " + file.getName());
                        } else {
                            String j = n6s.j(file.getAbsolutePath());
                            if (!TextUtils.isEmpty(j)) {
                                TLogEventHelper.UploadEventInfo uploadEventInfo = (TLogEventHelper.UploadEventInfo) JSON.parseObject(j, TLogEventHelper.UploadEventInfo.class);
                                if (uploadEventInfo != null && System.currentTimeMillis() - uploadEventInfo.requestTime < AuthenticatorCache.MAX_CACHE_TIME) {
                                    TLogEventHelper.w(uploadEventInfo);
                                    if (!(uploadEventInfo.reason == UploadReason.LOCAL_PUSH || uploadEventInfo.fileType == UploadFileType.UDF)) {
                                        j5s.j().s().b(b6s.c, uploadEventInfo.uploadID, "[PULL Failed Retry] Retry to upload");
                                        na1.a(null, uploadEventInfo.uploadID, uploadEventInfo.fileList, uploadEventInfo.fileType, null, true);
                                    }
                                    j5s.j().s().b(b6s.c, uploadEventInfo.sessionID, "[PUSH Failed Retry] Retry to upload : " + uploadEventInfo.bizCode);
                                    ra1.a(uploadEventInfo.sessionID, uploadEventInfo.reason, uploadEventInfo.fileList, uploadEventInfo.fileType, uploadEventInfo.bizType, uploadEventInfo.bizCode, uploadEventInfo.extraInfo, null, true, uploadEventInfo.flag);
                                }
                                TLog.logd("TLOG", "FileUploadManager", "Delete retry file: " + file.getName());
                                file.delete();
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        file.delete();
                    }
                }
            }
        }
    }

    public static synchronized TLogEventHelper.UploadEventInfo b(String str) {
        synchronized (hf9.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TLogEventHelper.UploadEventInfo) ipChange.ipc$dispatch("69ba9e2d", new Object[]{str});
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    Map<String, TLogEventHelper.UploadEventInfo> map = f20598a;
                    if (((ConcurrentHashMap) map).containsKey(str)) {
                        return (TLogEventHelper.UploadEventInfo) ((ConcurrentHashMap) map).get(str);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new TLogEventHelper.UploadEventInfo();
        }
    }

    public static synchronized void c(String str) {
        synchronized (hf9.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f394f044", new Object[]{str});
                return;
            }
            try {
                ((ConcurrentHashMap) f20598a).remove(str);
                File file = new File(b5s.h(), str);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void d(TLogEventHelper.UploadEventInfo uploadEventInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f208c0c", new Object[]{uploadEventInfo});
            return;
        }
        try {
            File file = new File(b5s.h(), uploadEventInfo.sessionID);
            if (!file.exists()) {
                n6s.m(file.getAbsolutePath(), JSON.toJSONString(uploadEventInfo));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized void e(String str, TLogEventHelper.UploadEventInfo uploadEventInfo) {
        synchronized (hf9.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0be3f8a", new Object[]{str, uploadEventInfo});
                return;
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    ((ConcurrentHashMap) f20598a).put(str, uploadEventInfo);
                    if ((uploadEventInfo.flag & 1) == 0) {
                        d(uploadEventInfo);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void f(String str, String str2, Map<String, String> map, ff9 ff9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6a5739", new Object[]{str, str2, map, ff9Var});
        } else if (!q4s.o() || q4s.f() <= 0) {
            m(str, str2, map, ff9Var);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            l(currentTimeMillis - q4s.f(), currentTimeMillis, str, str2, map, ff9Var);
        }
    }

    public static boolean g(String str, UploadReason uploadReason, List<String> list, UploadFileType uploadFileType, String str2, String str3, Map<String, String> map, ff9 ff9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b428a755", new Object[]{str, uploadReason, list, uploadFileType, str2, str3, map, ff9Var})).booleanValue();
        }
        return h(str, uploadReason, list, uploadFileType, str2, str3, map, ff9Var, 0);
    }

    public static void j(String str, String[] strArr, long j, long j2, String str2, String str3, Map<String, String> map, ff9 ff9Var) {
        String str4;
        List<String> list;
        List<String> list2;
        List<String> q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b731e68b", new Object[]{str, strArr, new Long(j), new Long(j2), str2, str3, map, ff9Var});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str4 = ten.a();
        } else {
            str4 = str;
        }
        u5s.d();
        TLogNative.appenderFlushData(false);
        if (strArr != null) {
            list = b5s.p(strArr);
        } else if (j <= 0 || j2 <= 0) {
            list = null;
        } else {
            list = b5s.q(j, j2);
        }
        if (list == null || list.isEmpty()) {
            TLogNative.appenderFlushData(true);
            if (strArr != null) {
                q = b5s.p(strArr);
            } else if (j > 0 && j2 > 0) {
                q = b5s.q(j, j2);
            }
            list2 = q;
            g(str4, UploadReason.LOCAL_PUSH, list2, UploadFileType.LOG, str2, str3, map, ff9Var);
        }
        list2 = list;
        g(str4, UploadReason.LOCAL_PUSH, list2, UploadFileType.LOG, str2, str3, map, ff9Var);
    }

    public static void k(String[] strArr, String str, String str2, Map<String, String> map, ff9 ff9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76bde0af", new Object[]{strArr, str, str2, map, ff9Var});
        } else {
            j(null, strArr, -1L, -1L, str, str2, map, ff9Var);
        }
    }

    public static void l(long j, long j2, String str, String str2, Map<String, String> map, ff9 ff9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed149cb4", new Object[]{new Long(j), new Long(j2), str, str2, map, ff9Var});
        } else {
            j(null, null, j, j2, str, str2, map, ff9Var);
        }
    }

    public static void m(String str, String str2, Map<String, String> map, ff9 ff9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f614579", new Object[]{str, str2, map, ff9Var});
        } else {
            k(n6s.f(1), str, str2, map, ff9Var);
        }
    }

    public static boolean n(String str, List<String> list, String str2, String str3, Map<String, String> map, ff9 ff9Var, int i, UploadFileType uploadFileType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5ebc706", new Object[]{str, list, str2, str3, map, ff9Var, new Integer(i), uploadFileType})).booleanValue();
        }
        return h(str, UploadReason.LOCAL_PUSH, list, uploadFileType, str2, str3, map, ff9Var, i);
    }

    public static boolean o(List<String> list, String str, String str2, Map<String, String> map, ff9 ff9Var, int i, UploadFileType uploadFileType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0d4597c", new Object[]{list, str, str2, map, ff9Var, new Integer(i), uploadFileType})).booleanValue();
        }
        return n(ten.a(), list, str, str2, map, ff9Var, i, uploadFileType);
    }

    public static void i(String str, String str2, Map<String, String> map, ff9 ff9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e11fc41", new Object[]{str, str2, map, ff9Var});
        } else if (q4s.c() == 0) {
            TLog.loge("TLOG", "FileUploadManager", "Failed to uploadMiniTLogFile, miniTlogBlocks == 0");
            ff9Var.onError("", ErrorCode.MINI_TLOG_BLOCK_ERROR.getValue(), "miniTlogBlocks == 0");
        } else {
            String a2 = ten.a();
            TLogNative.appenderFlushData(true);
            File r = b5s.r();
            String absolutePath = new File(r, str2 + "_minitlog_" + SystemClock.elapsedRealtime() + ".mtlog").getAbsolutePath();
            n6s.k(r);
            int writeMiniTLogToFile = TLogNative.writeMiniTLogToFile(absolutePath);
            if (writeMiniTLogToFile != 0) {
                TLog.loge("TLOG", "FileUploadManager", "Failed to uploadMiniTLogFile, TLogNative.writeMiniTLogToFile ret=" + writeMiniTLogToFile);
                String value = ErrorCode.MINI_TLOG_WRITE_FAILED.getValue();
                ff9Var.onError(absolutePath, value, "writeMiniTLogToFile ret = " + writeMiniTLogToFile);
                return;
            }
            g(a2, UploadReason.LOCAL_PUSH, Collections.singletonList(absolutePath), UploadFileType.LOG, str, str2, map, ff9Var);
        }
    }

    public static boolean h(String str, UploadReason uploadReason, List<String> list, UploadFileType uploadFileType, String str2, String str3, Map<String, String> map, ff9 ff9Var, int i) {
        String str4;
        String value;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0ecb5d6", new Object[]{str, uploadReason, list, uploadFileType, str2, str3, map, ff9Var, new Integer(i)})).booleanValue();
        }
        UploadStage uploadStage = UploadStage.STAGE_REQ;
        TLogEventHelper.o(v4s.UT_TLOG_FILE_UPLOAD_REQ, uploadFileType, uploadReason, str2, str3, str);
        s5s s = j5s.j().s();
        String str6 = b6s.g;
        String value2 = uploadReason.getValue();
        String name = uploadFileType.getName();
        if (map == null) {
            str4 = "null";
        } else {
            str4 = map.toString();
        }
        s.b(str6, str, "[FILE_UPLOAD]: Upload reason:" + value2 + ", fileType:" + name + ", bizType:" + str2 + ", bizCode:" + str3 + ", extra:" + str4);
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || "exception".equalsIgnoreCase(str2)) {
            String value3 = ErrorCode.BIZ_ERROR.getValue();
            TLogEventHelper.r(uploadFileType, uploadReason, str2, str3, uploadStage, value3, "[FILE_UPLOAD] Invalid biz info.", str);
            j5s.j().s().c(str6, str, "[FILE_UPLOAD] Invalid biz info.");
            if (ff9Var != null) {
                ff9Var.onError("", value3, "[FILE_UPLOAD] Invalid biz info.");
            }
            return false;
        } else if (list == null || list.isEmpty()) {
            if (!TLogNative.isSoOpen()) {
                value = ErrorCode.TLOG_INIT_ERROR.getValue();
                str5 = "[FILE_UPLOAD] TLog Init failed.";
            } else {
                value = ErrorCode.UPLOAD_NO_FILE.getValue();
                str5 = "[FILE_UPLOAD] The file list is empty.";
            }
            TLogEventHelper.r(uploadFileType, uploadReason, str2, str3, uploadStage, value, str5, str);
            j5s.j().s().c(str6, str, str5);
            if (ff9Var != null) {
                ff9Var.onError("", value, str5);
            }
            return false;
        } else {
            ra1.a(str, uploadReason, list, uploadFileType, str2, str3, map, ff9Var, false, i);
            return true;
        }
    }
}
