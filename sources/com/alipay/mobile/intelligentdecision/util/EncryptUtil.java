package com.alipay.mobile.intelligentdecision.util;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.DecisionContext;
import com.alipay.mobile.intelligentdecision.rpc.FrameworkUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobile.verifyidentity.utils.task.ZFileUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EncryptUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface FileCallback {
        void a(JSONObject jSONObject);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            return "intelligentDecision_" + FrameworkUtils.getUserId() + "_stategyconfig";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        try {
            return "intelligentDecision_" + FrameworkUtils.getUserId() + "_config";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        try {
            return "intelligentDecision_" + FrameworkUtils.getUserId() + "_preditconfig";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        return "Intelligent_Decision";
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue() : ZFileUtil.write(str, "Intelligent_Decision", str2, false, DecisionContext.getInstance().getContext());
    }

    public static void a(final String str, final FileCallback fileCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bfb4f6", new Object[]{str, fileCallback});
        } else {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.intelligentdecision.util.EncryptUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = null;
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(DecisionContext.getInstance().getContext().getFilesDir());
                        String str3 = File.separator;
                        sb.append(str3);
                        sb.append(EncryptUtil.d());
                        sb.append(str3);
                        sb.append(str);
                        File file = new File(sb.toString());
                        if (file.exists()) {
                            str2 = ZFileUtil.read(file);
                        } else {
                            str2 = null;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            FileCallback fileCallback2 = fileCallback;
                            if (fileCallback2 != null) {
                                fileCallback2.a(null);
                                return;
                            }
                            return;
                        }
                        try {
                            jSONObject = JSON.parseObject(str2);
                        } catch (Throwable unused) {
                        }
                        FileCallback fileCallback3 = fileCallback;
                        if (fileCallback3 != null) {
                            fileCallback3.a(jSONObject);
                        }
                    } catch (Throwable unused2) {
                        FileCallback fileCallback4 = fileCallback;
                        if (fileCallback4 != null) {
                            fileCallback4.a(null);
                        }
                    }
                }
            }, "getConfigTask");
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(DecisionContext.getInstance().getContext().getFilesDir());
        String str2 = File.separator;
        sb.append(str2);
        sb.append("Intelligent_Decision");
        sb.append(str2);
        sb.append(str);
        File file = new File(sb.toString());
        if (file.exists()) {
            file.delete();
        }
    }
}
