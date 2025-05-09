package com.alipay.mobile.common.logging;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.network.NetworkInfoGetter;
import com.alipay.mobile.common.logging.http.ConfigChangeBroadCastReceiver;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.uploader.HttpUploader;
import com.alipay.mobile.common.logging.uploader.RpcUploader;
import com.alipay.mobile.common.transport.monitor.NetworkServiceTracer;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MdapLogUploadManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static int f3941a = 52428800;
    public static final List<String> b = new ArrayList<String>() { // from class: com.alipay.mobile.common.logging.MdapLogUploadManager.1
        {
            add(NetworkServiceTracer.REPORT_SUB_NAME_RPC);
            add("MMTP");
            add("MASS");
            add(MonitorItemConstants.PARTITION_NAME);
            add("MISC");
            add("mdaplog");
            add("network");
            add("keybiztrace");
            add("footprint");
            add("exception");
            add("crash");
            add(LogCategory.CATEGORY_HIGHAVAIL);
            add("apm");
            add(LogCategory.CATEGORY_TRAFFICLOG);
            add(LogCategory.CATEGORY_DATAFLOW);
            add(LogCategory.CATEGORY_BATTERY);
        }
    };
    public static final Comparator<File> c = new Comparator<File>() { // from class: com.alipay.mobile.common.logging.MdapLogUploadManager.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, file, file2})).intValue();
            }
            return file.getName().compareTo(file2.getName());
        }
    };
    public static MdapLogUploadManager f;
    public final Context d;
    public final File e;

    public MdapLogUploadManager(Context context) {
        this.d = context;
        File file = new File(context.getFilesDir().getAbsolutePath() + "/mdap/upload/");
        this.e = file;
        if (!file.exists()) {
            file.mkdirs();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.mobile.client.multi.CONFIG_CHANGE");
        context.registerReceiver(new ConfigChangeBroadCastReceiver(), intentFilter);
    }

    public static synchronized MdapLogUploadManager a(Context context) {
        synchronized (MdapLogUploadManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MdapLogUploadManager) ipChange.ipc$dispatch("73cbec85", new Object[]{context});
            }
            if (f == null) {
                f = new MdapLogUploadManager(context);
            }
            return f;
        }
    }

    public final void c(String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91065937", new Object[]{this, str, str2, bundle});
            return;
        }
        LoggerFactory.getTraceLogger().info("MdapLogUploadManager", "http upload logCategory = ".concat(String.valueOf(str)));
        new HttpUploader(this.e, this.d).a(str, str2, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[Catch: all -> 0x0120, TRY_ENTER, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x0017, B:21:0x0061, B:30:0x00a4, B:34:0x00ac, B:36:0x00c8, B:38:0x00cc, B:40:0x00d2, B:42:0x00d8, B:45:0x00ef, B:46:0x00fa, B:22:0x0076, B:24:0x0081, B:26:0x0087), top: B:54:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.MdapLogUploadManager.b():void");
    }

    public static MdapLogUploadManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MdapLogUploadManager) ipChange.ipc$dispatch("d7279e8d", new Object[0]);
        }
        MdapLogUploadManager mdapLogUploadManager = f;
        if (mdapLogUploadManager != null) {
            return mdapLogUploadManager;
        }
        throw new IllegalStateException("need createInstance before use");
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else {
            f3941a = i;
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return b.contains(str);
    }

    public final synchronized void a(String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b028dd8", new Object[]{this, str, str2, bundle});
        } else if (LogStrategyManager.getInstance().isRealTimeLogCategory(str) && !a(str)) {
            if (LoggerFactory.getProcessInfo().isToolsProcess()) {
                LoggerFactory.getTraceLogger().warn("MdapLogUploadManager", "upload real time logCategory in tool!!");
            }
            new RpcUploader(this.e, this.d).a(str, bundle);
        } else if (!LoggerFactory.getProcessInfo().isPushProcess() || bundle == null || !"maxLogCount".equals(bundle.getString("event"))) {
            c(str, str2, bundle);
        } else {
            NetworkInfoGetter networkInfoGetter = LoggerFactory.getLogContext().getNetworkInfoGetter();
            if (networkInfoGetter == null || networkInfoGetter.isNetworkAvailable() || networkInfoGetter.isConnect()) {
                c(str, str2, bundle);
            } else {
                LoggerFactory.getTraceLogger().info("MdapLogUploadManager", "upload time is maxLogCount and network is not available!!! Do not upload category = ".concat(String.valueOf(str)));
            }
        }
    }
}
