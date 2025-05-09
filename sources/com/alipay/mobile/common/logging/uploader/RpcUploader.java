package com.alipay.mobile.common.logging.uploader;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.encrypt.LogEncryptClient;
import com.alipay.mobile.common.logging.api.rpc.LogRpcResult;
import com.alipay.mobile.common.logging.api.rpc.RpcClient;
import com.alipay.mobile.common.logging.api.rpc.RpcLogData;
import com.alipay.mobile.common.logging.api.rpc.RpcLogRequestParam;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.util.FileUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcUploader extends BaseUploader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public RpcUploader(File file, Context context) {
        super(file, context);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        LogEncryptClient logEncryptClient = LoggerFactory.getLogContext().getLogEncryptClient();
        if (logEncryptClient == null) {
            return str;
        }
        if (str.startsWith("1_")) {
            String decrypt = logEncryptClient.decrypt(str.substring(2));
            if (!TextUtils.isEmpty(decrypt)) {
                return decrypt;
            }
        }
        return str;
    }

    public static /* synthetic */ Object ipc$super(RpcUploader rpcUploader, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/logging/uploader/RpcUploader");
    }

    public final void a(String str, Bundle bundle) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            th.toString();
        }
        if (bundle != null) {
            z = bundle.getBoolean(LogContext.IS_MERGE_UPLOAD, false);
        }
        File[] listFiles = this.b.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            String str2 = BaseUploader.f3986a;
            traceLogger.info(str2, str + " do not need upload RpcUploader");
            return;
        }
        TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
        String str3 = BaseUploader.f3986a;
        traceLogger2.info(str3, str + " will upload, count of all mdap files: " + listFiles.length + " isMerge = " + z);
        if (z) {
            f(str, listFiles);
        } else {
            g(str, listFiles, bundle);
        }
    }

    public final void e(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1273636", new Object[]{this, bundle, str});
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        LoggerFactory.getTraceLogger().info(BaseUploader.f3986a, "doDegradeUploadByLogCategory logCategory = ".concat(String.valueOf(str)));
        bundle.putBoolean(LogContext.IS_DEGRADE_UPLOAD, true);
        new HttpUploader(this.b, this.c).a(str, null, bundle);
    }

    public final void f(String str, File[] fileArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9269a0da", new Object[]{this, str, fileArr});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            if (file != null && file.exists() && file.isFile()) {
                String name = file.getName();
                try {
                    String a2 = BaseUploader.a(name);
                    if (!TextUtils.isEmpty(a2) && LogStrategyManager.getInstance().isRealTimeLogCategory(a2) && LogStrategyManager.getInstance().isLogSend(name)) {
                        arrayList.add(file);
                    }
                } catch (Throwable th) {
                    LoggerFactory.getTraceLogger().error(BaseUploader.f3986a, th);
                }
            }
        }
        h(arrayList);
        LoggerFactory.getTraceLogger().info(BaseUploader.f3986a, "target " + str + " merge uploadLog end");
    }

    public final void i(List<File> list, List<RpcLogData> list2, RpcClient rpcClient, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834f1cbd", new Object[]{this, list, list2, rpcClient, new Integer(i)});
            return;
        }
        RpcLogRequestParam rpcLogRequestParam = new RpcLogRequestParam();
        rpcLogRequestParam.logs = list2;
        int size = list.size();
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        String str = BaseUploader.f3986a;
        traceLogger.info(str, "doMergeUpload start, files count = " + size + " logCount = " + i);
        try {
            LogRpcResult uploadLog = rpcClient.uploadLog(rpcLogRequestParam, "merge", null);
            TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
            String str2 = BaseUploader.f3986a;
            traceLogger2.info(str2, "doMergeUpload success, files count = " + size + " logCount = " + i);
            if (uploadLog == null || uploadLog.respCode != 1000) {
                j(list);
                return;
            }
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    list.get(i2).delete();
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            j(list);
            LoggerFactory.getTraceLogger().error(BaseUploader.f3986a, th);
        }
    }

    public final void h(List<File> list) {
        Throwable th;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list.isEmpty()) {
            LoggerFactory.getTraceLogger().info(BaseUploader.f3986a, "uploadMergeFile files is empty");
        } else {
            int size = list.size();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            RpcClient logUploadRpcClient = LoggerFactory.getLogContext().getLogUploadRpcClient();
            if (logUploadRpcClient == null) {
                LoggerFactory.getTraceLogger().info(BaseUploader.f3986a, "getRpcClient = null do http upload");
                j(list);
                return;
            }
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = arrayList;
            Integer num = 0;
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    File file = list.get(i2);
                    if (file != null && file.exists()) {
                        String readFile = FileUtil.readFile(file);
                        if (TextUtils.isEmpty(readFile)) {
                            file.delete();
                            throw new IllegalStateException("file content is empty");
                            break;
                        }
                        String[] split = readFile.split("\\$\\$");
                        int length = split.length;
                        if (!arrayList3.isEmpty() && num.intValue() + length >= 100) {
                            i(arrayList4, arrayList3, logUploadRpcClient, num.intValue());
                            num = Integer.valueOf(i);
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                arrayList4 = new ArrayList();
                                arrayList3 = arrayList5;
                            } catch (Throwable th2) {
                                th = th2;
                                arrayList3 = arrayList5;
                                LoggerFactory.getTraceLogger().error(BaseUploader.f3986a, th);
                            }
                        }
                        String a2 = BaseUploader.a(file.getName());
                        RpcLogData rpcLogData = new RpcLogData();
                        rpcLogData.bizCode = a2;
                        ArrayList arrayList6 = new ArrayList();
                        int length2 = split.length;
                        while (i < length2) {
                            try {
                                if (!TextUtils.isEmpty(split[i])) {
                                    arrayList6.add(d(split[i]));
                                }
                                i++;
                            } catch (Throwable th3) {
                                th = th3;
                                i = 0;
                                LoggerFactory.getTraceLogger().error(BaseUploader.f3986a, th);
                            }
                        }
                        rpcLogData.log = arrayList6;
                        arrayList3.add(rpcLogData);
                        int intValue = num.intValue() + arrayList6.size();
                        num = Integer.valueOf(intValue);
                        arrayList4.add(file);
                        if (intValue >= 100) {
                            i(arrayList4, arrayList3, logUploadRpcClient, intValue);
                            i = 0;
                            num = 0;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList4 = new ArrayList();
                                arrayList3 = arrayList7;
                            } catch (Throwable th4) {
                                th = th4;
                                arrayList3 = arrayList7;
                                LoggerFactory.getTraceLogger().error(BaseUploader.f3986a, th);
                            }
                        } else {
                            i = 0;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            if (!arrayList3.isEmpty()) {
                i(arrayList4, arrayList3, logUploadRpcClient, num.intValue());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.util.List<java.io.File> r21) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.uploader.RpcUploader.j(java.util.List):void");
    }

    public final void g(String str, File[] fileArr, Bundle bundle) {
        int i;
        String str2;
        Throwable th;
        String str3 = str;
        File[] fileArr2 = fileArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e651ba", new Object[]{this, str3, fileArr2, bundle});
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < fileArr2.length) {
            File file = fileArr2[i2];
            if (file != null && file.exists() && file.isFile()) {
                String name = file.getName();
                try {
                    str2 = LogStrategyManager.getInstance().isLogSend(name, str3);
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str;
                }
                if (str2 != null) {
                    String str4 = "default";
                    if (bundle != null) {
                        try {
                            if (!TextUtils.isEmpty(bundle.getString("event"))) {
                                str4 = bundle.getString("event");
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            String th4 = th.toString();
                            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                            String str5 = BaseUploader.f3986a;
                            traceLogger.error(str5, str2 + " uploadByCategory failed: " + name + " at " + th4);
                            i = 1;
                            i2 += i;
                            str3 = str;
                            fileArr2 = fileArr;
                        }
                    }
                    String readFile = FileUtil.readFile(file);
                    if (TextUtils.isEmpty(readFile)) {
                        file.delete();
                        throw new IllegalStateException("file content is empty");
                        break;
                    }
                    RpcClient logUploadRpcClient = LoggerFactory.getLogContext().getLogUploadRpcClient();
                    if (logUploadRpcClient != null) {
                        ArrayList arrayList = new ArrayList();
                        RpcLogData rpcLogData = new RpcLogData();
                        rpcLogData.bizCode = str2;
                        ArrayList arrayList2 = new ArrayList();
                        String[] split = readFile.split("\\$\\$");
                        int length = split.length;
                        int i4 = 0;
                        while (i4 < length) {
                            arrayList2.add(d(split[i4]));
                            i4++;
                            split = split;
                        }
                        rpcLogData.log = arrayList2;
                        arrayList.add(rpcLogData);
                        RpcLogRequestParam rpcLogRequestParam = new RpcLogRequestParam();
                        rpcLogRequestParam.logs = arrayList;
                        LogRpcResult uploadLog = logUploadRpcClient.uploadLog(rpcLogRequestParam, str4, bundle);
                        if (uploadLog == null) {
                            LoggerFactory.getTraceLogger().info(BaseUploader.f3986a, "rpc upload fail result is null");
                            e(bundle, str2);
                        } else if (uploadLog.respCode == 1000) {
                            LoggerFactory.getTraceLogger().info(BaseUploader.f3986a, "rpc upload success category = ".concat(str2));
                            file.delete();
                        } else {
                            TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                            String str6 = BaseUploader.f3986a;
                            traceLogger2.info(str6, "rpc upload fail respCode = " + uploadLog.respCode + " resp des = " + uploadLog.errorMsg);
                            e(bundle, str2);
                        }
                    } else {
                        e(bundle, str2);
                    }
                    TraceLogger traceLogger3 = LoggerFactory.getTraceLogger();
                    String str7 = BaseUploader.f3986a;
                    traceLogger3.info(str7, str2 + " uploadByCategory upload success: " + name + " event = " + str4);
                    i = 1;
                    i3++;
                    i2 += i;
                    str3 = str;
                    fileArr2 = fileArr;
                }
            }
            i = 1;
            i2 += i;
            str3 = str;
            fileArr2 = fileArr;
        }
        LoggerFactory.getTraceLogger().info(BaseUploader.f3986a, "uploadByCategory end, realUploadCount: ".concat(String.valueOf(i3)));
    }
}
