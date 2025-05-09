package com.taobao.android.ucp.algo;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.b;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import com.taobao.tao.log.TLog;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import tb.bnv;
import tb.f82;
import tb.ke4;
import tb.o0r;
import tb.q82;
import tb.t2o;
import tb.v82;
import tb.wsa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NativeAlgo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_BUFFER_SIZE = 2147483639;
    private static final String SP_GROUP = "UCPNativeAlgo";
    private static final String SP_MODEL_STORE_KEY = "_ucp_mnn_model_url";
    private static Handler downloadHandler;
    private static Handler executeHandler;
    private static HandlerThread ucpNativeAlgoThreadDownload;
    private static HandlerThread ucpNativeAlgoThreadExecute;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ke4 d;

        public a(Map map, String str, ke4 ke4Var) {
            this.b = map;
            this.c = str;
            this.d = ke4Var;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/algo/NativeAlgo$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            JSONObject jSONObject = (JSONObject) JSON.parse(NativeAlgo.access$000(this.c, new JSONObject(this.b).toString()));
            if (jSONObject == null) {
                JSONObject access$100 = NativeAlgo.access$100(this.b);
                access$100.put("error", (Object) "native algo result empty");
                this.d.a("NativeAlgo", "5001", "模型执行失败", access$100);
            } else if (jSONObject.getBoolean("success").booleanValue()) {
                this.d.b("NativeAlgo", jSONObject);
            } else {
                JSONObject access$1002 = NativeAlgo.access$100(this.b);
                String string = jSONObject.getString("msg");
                if (!TextUtils.isEmpty(string)) {
                    access$1002.put("error", (Object) com.taobao.android.behavir.util.a.b("msg", string));
                }
                this.d.a("NativeAlgo", "5002", "模型执行失败了", access$1002);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public b(String str) {
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/algo/NativeAlgo$2");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.b).openConnection();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    httpURLConnection.disconnect();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.flush();
                    if (byteArray == null) {
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return;
                    }
                    Map access$200 = NativeAlgo.access$200(byteArray, bnv.c() + "NativeAlgoRoot" + File.separator);
                    if (access$200 != null && !access$200.isEmpty()) {
                        NativeAlgo.access$300(this.b);
                        NativeAlgo.access$400();
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return;
                    }
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    static {
        t2o.a(404750707);
    }

    public static /* synthetic */ String access$000(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a953ef5", new Object[]{str, str2});
        }
        return execute(str, str2);
    }

    public static /* synthetic */ JSONObject access$100(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("319d08ed", new Object[]{map});
        }
        return buildModelErrorResult(map);
    }

    public static /* synthetic */ Map access$200(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df6caaff", new Object[]{bArr, str});
        }
        return unzip(bArr, str);
    }

    public static /* synthetic */ void access$300(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58bc884", new Object[]{str});
        } else {
            putLocalUrl(str);
        }
    }

    public static /* synthetic */ void access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("906ef47b", new Object[0]);
        } else {
            setupModelAndConfig();
        }
    }

    private static JSONObject buildModelErrorResult(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f1feaf14", new Object[]{map});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("input", (Object) map);
        jSONObject2.put("msg", (Object) "native algo failed");
        jSONObject.put("model", (Object) jSONObject2);
        return jSONObject;
    }

    public static void downloadCDNResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2f8404", new Object[]{str});
        } else if (innerIsEnableNativeAlgo() && !TextUtils.isEmpty(str) && !TextUtils.equals(getLocalUrl(), str)) {
            if (downloadHandler == null) {
                synchronized (NativeAlgo.class) {
                    try {
                        if (downloadHandler == null) {
                            HandlerThread a2 = wsa.a("UCPNativeAlgoDownload");
                            ucpNativeAlgoThreadDownload = a2;
                            a2.start();
                            downloadHandler = new Handler(ucpNativeAlgoThreadDownload.getLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            downloadHandler.post(new b(str));
        }
    }

    private static native String execute(String str, String str2);

    public static Handler getExecuteHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("fe149374", new Object[0]);
        }
        return executeHandler;
    }

    private static String getLocalUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d83b8fbf", new Object[0]);
        }
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null) {
            return sharedPreferences.getString(SP_MODEL_STORE_KEY, "");
        }
        return "";
    }

    private static SharedPreferences getSharedPreferences() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[0]);
        }
        Application d = f82.d();
        if (d != null) {
            return d.getSharedPreferences(SP_GROUP, 0);
        }
        return null;
    }

    public static void initializeNativeAlgo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f9a641", new Object[0]);
        } else if (innerIsEnableNativeAlgo()) {
            setupModelAndConfig();
        }
    }

    private static boolean innerIsEnableNativeAlgo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ccd1938", new Object[0])).booleanValue();
        }
        try {
            BHXCXXBaseBridge.LoadCXXLib();
            return false;
        } catch (Throwable unused) {
            TLog.logd("UCP", "innerIsEnableNativeAlgo error");
            return false;
        }
    }

    private static void putLocalUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3908c84", new Object[]{str});
            return;
        }
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(SP_MODEL_STORE_KEY, str);
            edit.apply();
        }
    }

    public static void run(String str, Map<String, Object> map, ke4 ke4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c897a7", new Object[]{str, map, ke4Var});
        } else if (!innerIsEnableNativeAlgo()) {
            ke4Var.a("NativeAlgo", IDecisionResult.ENGINE_ERROR, "模型执行失败", buildModelErrorResult(map));
        } else {
            if (executeHandler == null) {
                synchronized (NativeAlgo.class) {
                    try {
                        if (executeHandler == null) {
                            HandlerThread a2 = wsa.a("UCPNativeAlgoExecute");
                            ucpNativeAlgoThreadExecute = a2;
                            a2.start();
                            executeHandler = new Handler(ucpNativeAlgoThreadExecute.getLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            executeHandler.post(new a(map, str, ke4Var));
        }
    }

    private static native void setupManagers(String str);

    private static void setupModelAndConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bf5cb4", new Object[0]);
            return;
        }
        try {
            if (innerIsEnableNativeAlgo()) {
                setupRootDir(bnv.c() + "NativeAlgoRoot/NativeAlgo" + File.separator);
            }
        } catch (Exception e) {
            q82.f("UCP_setupModelAndConfig_error", null, null, e);
        }
    }

    private static native void setupRootDir(String str);

    private static Map<String, byte[]> unzip(byte[] bArr, String str) {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("614575f5", new Object[]{bArr, str});
        }
        if (bArr == null || TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new ByteArrayInputStream(bArr)));
            loop0: while (true) {
                z = false;
                while (true) {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        break loop0;
                    }
                    try {
                        byte[] bArr2 = new byte[8192];
                        String name = nextEntry.getName();
                        if (!nextEntry.getName().contains("../") && !nextEntry.isDirectory()) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            String str2 = str + name;
                            File file = new File(new File(str2).getParent());
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            while (true) {
                                int read = zipInputStream.read(bArr2, 0, 8192);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                            hashMap.put(str2, byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.flush();
                            z = true;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            zipInputStream.close();
            z2 = z;
        } catch (Throwable unused2) {
            hashMap.clear();
        }
        if (!z2) {
            return null;
        }
        return hashMap;
    }

    public static boolean isEnableNativeAlgo(String str) {
        JSONArray parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a54398c", new Object[]{str})).booleanValue();
        }
        if (!innerIsEnableNativeAlgo()) {
            return false;
        }
        String m = v82.m(o0r.c.K_NATIVE_ALGO_NAMES, "[\"cml_cc_ucp2_home_pop_worker\"]");
        if (!TextUtils.isEmpty(m) && (parseArray = JSON.parseArray(m)) != null) {
            if (parseArray.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
