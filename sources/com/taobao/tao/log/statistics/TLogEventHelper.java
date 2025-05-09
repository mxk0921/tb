package com.taobao.tao.log.statistics;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.c6s;
import tb.ff9;
import tb.fwd;
import tb.g6s;
import tb.j5s;
import tb.q4s;
import tb.t2o;
import tb.v4s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TLogEventHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, g6s> f12494a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class UploadEventInfo {
        public UploadFileType fileType = UploadFileType.UNKNOWN;
        public UploadReason reason = UploadReason.UNKNOWN;
        public String bizCode = "";
        public String bizType = "";
        public String sessionID = "";
        public Map<String, String> extraInfo = null;
        @JSONField(serialize = false)
        public ff9 listener = null;
        public List<String> fileList = null;
        public long requestTime = System.currentTimeMillis();
        public String uploadID = "";
        @JSONField(serialize = false)
        public boolean isRetry = false;
        public int flag = 0;

        static {
            t2o.a(767557689);
        }
    }

    static {
        t2o.a(767557688);
    }

    public static synchronized void a(String str) {
        synchronized (TLogEventHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2135f1", new Object[]{str});
            } else {
                f12494a.remove(str);
            }
        }
    }

    public static void b(String str, ErrorCode errorCode, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cd590f4", new Object[]{str, errorCode, str2});
        } else {
            d(str, errorCode.getValue(), str2, null);
        }
    }

    public static void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca89de17", new Object[]{str, str2, str3});
        } else {
            d(str, str2, str3, null);
        }
    }

    public static void d(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2b2c8e", new Object[]{str, str2, str3, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errCode", str2);
        hashMap.put("errMsg", str3);
        if (map != null) {
            hashMap.putAll(map);
        }
        g(str, hashMap);
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c365dab", new Object[]{str});
        } else {
            g(str, null);
        }
    }

    public static void f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6289593f", new Object[]{str, str2, str3});
        } else if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str2, str3);
            g(str, hashMap);
        } else {
            g(str, null);
        }
    }

    public static void g(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d365127a", new Object[]{str, map});
            return;
        }
        if (j5s.j().v()) {
            k(str, map);
        }
        if (c6s.b()) {
            fwd o = j5s.j().o();
            if (o != null && !TextUtils.isEmpty(str)) {
                try {
                    map.put(v4s.PARAM_IS_SLICE, String.valueOf(q4s.o()));
                    map.put(v4s.PARAM_IS_INNER, Boolean.toString(q4s.h()));
                    map.put(v4s.PARAM_IS_DEBUG, String.valueOf(q4s.g()));
                    o.d(str, map);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (map != null) {
            map.toString();
        }
    }

    public static void h(int i, long j, int i2, int i3, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ef321f", new Object[]{new Integer(i), new Long(j), new Integer(i2), new Integer(i3), new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("totalCount", String.valueOf(i));
        hashMap.put("totalSize", String.valueOf(j));
        hashMap.put("totalDays", String.valueOf(i2));
        hashMap.put("prevCount", String.valueOf(i3));
        hashMap.put("prevSize", String.valueOf(j2));
        g(v4s.UT_TLOG_FILE_SIZE, hashMap);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r4.equals("application/x-udf") == false) goto L_0x0022;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.tao.log.statistics.UploadFileType i(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.log.statistics.TLogEventHelper.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "21d065cb"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            com.taobao.tao.log.statistics.UploadFileType r4 = (com.taobao.tao.log.statistics.UploadFileType) r4
            return r4
        L_0x0015:
            if (r4 != 0) goto L_0x001a
            com.taobao.tao.log.statistics.UploadFileType r4 = com.taobao.tao.log.statistics.UploadFileType.UNKNOWN
            return r4
        L_0x001a:
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case -1348220061: goto L_0x0045;
                case -39861260: goto L_0x003a;
                case 728226032: goto L_0x002f;
                case 1154829348: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            r0 = -1
            goto L_0x004e
        L_0x0024:
            java.lang.String r0 = "application/x-tlog"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x002d
            goto L_0x0022
        L_0x002d:
            r0 = 3
            goto L_0x004e
        L_0x002f:
            java.lang.String r0 = "application/x-perf-heapdump"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0038
            goto L_0x0022
        L_0x0038:
            r0 = 2
            goto L_0x004e
        L_0x003a:
            java.lang.String r0 = "application/x-perf-methodtrace"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0043
            goto L_0x0022
        L_0x0043:
            r0 = 1
            goto L_0x004e
        L_0x0045:
            java.lang.String r1 = "application/x-udf"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x004e
            goto L_0x0022
        L_0x004e:
            switch(r0) {
                case 0: goto L_0x005d;
                case 1: goto L_0x005a;
                case 2: goto L_0x0057;
                case 3: goto L_0x0054;
                default: goto L_0x0051;
            }
        L_0x0051:
            com.taobao.tao.log.statistics.UploadFileType r4 = com.taobao.tao.log.statistics.UploadFileType.UNKNOWN
            return r4
        L_0x0054:
            com.taobao.tao.log.statistics.UploadFileType r4 = com.taobao.tao.log.statistics.UploadFileType.LOG
            return r4
        L_0x0057:
            com.taobao.tao.log.statistics.UploadFileType r4 = com.taobao.tao.log.statistics.UploadFileType.HEAP_DUMP
            return r4
        L_0x005a:
            com.taobao.tao.log.statistics.UploadFileType r4 = com.taobao.tao.log.statistics.UploadFileType.METHOD_TRACE
            return r4
        L_0x005d:
            com.taobao.tao.log.statistics.UploadFileType r4 = com.taobao.tao.log.statistics.UploadFileType.UDF
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.log.statistics.TLogEventHelper.i(java.lang.String):com.taobao.tao.log.statistics.UploadFileType");
    }

    public static synchronized void j(String str, g6s g6sVar) {
        synchronized (TLogEventHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("471df34f", new Object[]{str, g6sVar});
            } else {
                f12494a.put(str, g6sVar);
            }
        }
    }

    public static void l(UploadEventInfo uploadEventInfo, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1054e89", new Object[]{uploadEventInfo, new Integer(i), new Integer(i2)});
        } else if (uploadEventInfo != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(v4s.PARAM_UPLOAD_FILE_TYPE, uploadEventInfo.fileType.getValue());
            hashMap.put("reason", uploadEventInfo.reason.getValue());
            hashMap.put(v4s.PARAM_UPLOAD_ID, uploadEventInfo.uploadID);
            hashMap.put(v4s.PARAM_TASK_ID, uploadEventInfo.sessionID);
            hashMap.put(v4s.PARAM_UPLOAD_FILE_COUNT, String.valueOf(i));
            hashMap.put("successCount", String.valueOf(i2));
            hashMap.put(v4s.PARAM_IS_RETRY, String.valueOf(uploadEventInfo.isRetry));
            g(v4s.UT_TLOG_FILE_UPLOAD_DONE, hashMap);
        }
    }

    public static void m(String str, UploadEventInfo uploadEventInfo, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e1348c7", new Object[]{str, uploadEventInfo, str2});
            return;
        }
        if (uploadEventInfo == null) {
            uploadEventInfo = new UploadEventInfo();
        }
        o(str, uploadEventInfo.fileType, uploadEventInfo.reason, uploadEventInfo.bizType, uploadEventInfo.bizCode, str2);
    }

    public static void n(String str, UploadFileType uploadFileType, UploadReason uploadReason, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88d96d34", new Object[]{str, uploadFileType, uploadReason, str2});
        } else {
            o(str, uploadFileType, uploadReason, null, null, str2);
        }
    }

    public static void o(String str, UploadFileType uploadFileType, UploadReason uploadReason, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e11848", new Object[]{str, uploadFileType, uploadReason, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(v4s.PARAM_UPLOAD_FILE_TYPE, uploadFileType.getValue());
        hashMap.put("reason", uploadReason.getValue());
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("bizType", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("bizCode", str3);
        }
        hashMap.put(v4s.PARAM_UPLOAD_ID, str4);
        hashMap.put(v4s.PARAM_TASK_ID, str4);
        g(str, hashMap);
    }

    public static void p(UploadEventInfo uploadEventInfo, UploadStage uploadStage, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b6f49e", new Object[]{uploadEventInfo, uploadStage, str, str2, str3});
            return;
        }
        if (uploadEventInfo == null) {
            uploadEventInfo = new UploadEventInfo();
        }
        r(uploadEventInfo.fileType, uploadEventInfo.reason, uploadEventInfo.bizType, uploadEventInfo.bizCode, uploadStage, str, str2, str3);
    }

    public static void q(UploadFileType uploadFileType, UploadReason uploadReason, UploadStage uploadStage, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54cb0b21", new Object[]{uploadFileType, uploadReason, uploadStage, str, str2, str3});
        } else {
            r(uploadFileType, uploadReason, null, null, uploadStage, str, str2, str3);
        }
    }

    public static void r(UploadFileType uploadFileType, UploadReason uploadReason, String str, String str2, UploadStage uploadStage, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3d7b18d", new Object[]{uploadFileType, uploadReason, str, str2, uploadStage, str3, str4, str5});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(v4s.PARAM_UPLOAD_STAGE, uploadStage.getValue());
        hashMap.put(v4s.PARAM_UPLOAD_FILE_TYPE, uploadFileType.getValue());
        hashMap.put("reason", uploadReason.getValue());
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("bizType", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("bizCode", str2);
        }
        hashMap.put("errCode", str3);
        hashMap.put("errMsg", str4);
        hashMap.put(v4s.PARAM_UPLOAD_ID, str5);
        hashMap.put(v4s.PARAM_TASK_ID, str5);
        g(v4s.UT_TLOG_FILE_UPLOAD_ERR, hashMap);
    }

    public static void s(UploadEventInfo uploadEventInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f1c76f5", new Object[]{uploadEventInfo, str});
        } else {
            m(v4s.UT_TLOG_FILE_UPLOAD_ONE, uploadEventInfo, str);
        }
    }

    public static void t(UploadEventInfo uploadEventInfo, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d101bdc7", new Object[]{uploadEventInfo, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(v4s.PARAM_UPLOAD_FILE_TYPE, uploadEventInfo.fileType.getValue());
        hashMap.put("reason", uploadEventInfo.reason.getValue());
        hashMap.put("bizType", uploadEventInfo.bizType);
        hashMap.put("bizCode", uploadEventInfo.bizCode);
        hashMap.put(v4s.PARAM_UPLOAD_ID, str);
        hashMap.put(v4s.PARAM_TASK_ID, str);
        hashMap.put("errCode", str2);
        hashMap.put("errMsg", str3);
        hashMap.put(v4s.PARAM_IS_RETRY, String.valueOf(uploadEventInfo.isRetry));
        g(v4s.UT_TLOG_FILE_UPLOAD_ONE_ERROR, hashMap);
    }

    public static void u(UploadEventInfo uploadEventInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96345d3", new Object[]{uploadEventInfo, str});
        } else {
            m(v4s.UT_TLOG_FILE_UPLOAD_ONE_RETRY, uploadEventInfo, str);
        }
    }

    public static void v(UploadEventInfo uploadEventInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a95d84ae", new Object[]{uploadEventInfo, str});
        } else {
            m(v4s.UT_TLOG_FILE_UPLOAD_ONE_SUCCESS, uploadEventInfo, str);
        }
    }

    public static void w(UploadEventInfo uploadEventInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76f006d", new Object[]{uploadEventInfo});
        } else if (uploadEventInfo != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(v4s.PARAM_UPLOAD_FILE_TYPE, uploadEventInfo.fileType.getValue());
            hashMap.put("reason", uploadEventInfo.reason.getValue());
            hashMap.put("bizType", uploadEventInfo.bizType);
            hashMap.put("bizCode", uploadEventInfo.bizCode);
            hashMap.put(v4s.PARAM_UPLOAD_ID, uploadEventInfo.uploadID);
            hashMap.put(v4s.PARAM_TASK_ID, uploadEventInfo.sessionID);
            g(v4s.UT_TLOG_FILE_UPLOAD_RETRY, hashMap);
        }
    }

    public static synchronized void k(String str, Map<String, String> map) {
        ConcurrentHashMap<String, g6s> concurrentHashMap;
        String str2;
        char c = 1;
        synchronized (TLogEventHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6caf4d55", new Object[]{str, map});
                return;
            }
            try {
                concurrentHashMap = f12494a;
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!concurrentHashMap.isEmpty() && map != null && !map.isEmpty()) {
                String str3 = "";
                g6s g6sVar = null;
                if (map.containsKey(v4s.PARAM_TASK_ID)) {
                    str3 = map.get(v4s.PARAM_TASK_ID);
                    if (!TextUtils.isEmpty(str3) && concurrentHashMap.containsKey(str3)) {
                        g6sVar = concurrentHashMap.get(str3);
                    }
                }
                UploadStage.UNKNOWN.getValue();
                switch (str.hashCode()) {
                    case -1985564511:
                        if (str.equals(v4s.UT_TLOG_ARUP_ERR)) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1735725634:
                        if (str.equals(v4s.UT_TLOG_ARUP_CANCEL)) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1722410037:
                        if (str.equals(v4s.UT_TLOG_ARUP_REQUEST)) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1149039458:
                        if (str.equals(v4s.UT_TLOG_ARUP_START)) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1139276476:
                        if (str.equals(v4s.UT_TLOG_FILE_UPLOAD_REPLY_SUCCESS)) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1066216896:
                        if (str.equals(v4s.UT_TLOG_FILE_UPLOAD_ONE_SUCCESS)) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -390305473:
                        if (str.equals(v4s.UT_TLOG_ARUP_SUCCESS)) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -296544474:
                        if (str.equals(v4s.UT_TLOG_FILE_UPLOAD_REPLY_ERROR)) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case -199294341:
                        if (str.equals(v4s.UT_TLOG_FILE_UPLOAD_ERR)) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case -199284868:
                        if (str.equals(v4s.UT_TLOG_FILE_UPLOAD_ONE)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -199282252:
                        if (str.equals(v4s.UT_TLOG_FILE_UPLOAD_REQ)) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -114048478:
                        if (str.equals(v4s.UT_TLOG_FILE_UPLOAD_ONE_ERROR)) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -112724597:
                        if (str.equals(v4s.UT_TLOG_FILE_UPLOAD_EXECUTE)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 278646254:
                        if (str.equals(v4s.UT_TLOG_FILE_UPLOAD_TOKEN_REQ)) {
                            break;
                        }
                        c = 65535;
                        break;
                    case 278646256:
                        if (str.equals(v4s.UT_TLOG_FILE_UPLOAD_TOKEN_RES)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2080186405:
                        if (str.equals(v4s.UT_TLOG_FILE_UPLOAD_ONE_RETRY)) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        str2 = UploadStage.STAGE_REQ.getValue();
                        break;
                    case 1:
                        str2 = UploadStage.STAGE_REQ_TOKEN.getValue();
                        break;
                    case 2:
                        str2 = UploadStage.STAGE_RES_TOKEN.getValue();
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                        str2 = UploadStage.STAGE_UPLOAD.getValue();
                        break;
                    case 15:
                        str2 = map.get(v4s.PARAM_UPLOAD_STAGE);
                        break;
                    default:
                        return;
                }
                if (g6sVar != null) {
                    g6sVar.a(str3, str2, str, map);
                }
            }
        }
    }
}
