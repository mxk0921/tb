package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.taobao.android.diagnose.common.DiagnoseType;
import com.taobao.android.diagnose.model.PageInfo;
import com.taobao.android.diagnose.snapshot.SnapshotMtopUploader;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import com.taobao.tao.log.TLog;
import com.taobao.tinct.impl.collect.ChangeRecord;
import com.taobao.tinct.model.ABChangeInfo;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.tinct.model.OrangeChangeInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.b8q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b8q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String d;

    /* renamed from: a  reason: collision with root package name */
    public final File f16251a;
    public final o6e b;
    public n04 c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements r6e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DiagnoseType f16252a;

        public a(DiagnoseType diagnoseType) {
            this.f16252a = diagnoseType;
        }

        public final /* synthetic */ void b(String str, DiagnoseType diagnoseType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36713c4e", new Object[]{this, str, diagnoseType});
                return;
            }
            xk7.a(str, diagnoseType.getIndex(), 4);
            TLog.loge("Diagnose", "SnapshotManager", "Success to upload diagnose info: " + str);
            File c = b8q.c(b8q.this, str, diagnoseType);
            if (c.exists() && c.delete()) {
                idh.a("SnapshotManager", "Delete file after upload: " + c.getName());
            }
        }

        public void c(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
                return;
            }
            xk7.a(str, this.f16252a.getIndex(), 5);
            TLog.loge("Diagnose", "SnapshotManager", "Upload diagnose info " + str + " failed. ErrorCode=" + str2 + ",ErrorMsg=" + str3);
        }

        public void d(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            al7 b = al7.b();
            final DiagnoseType diagnoseType = this.f16252a;
            b.a(new Runnable() { // from class: tb.a8q
                @Override // java.lang.Runnable
                public final void run() {
                    b8q.a.this.b(str, diagnoseType);
                }
            });
        }
    }

    static {
        t2o.a(615514225);
        f();
    }

    public b8q(Context context) {
        File file = new File(uk7.i().k(), "snapshot");
        this.f16251a = file;
        if (!file.exists()) {
            file.mkdirs();
        }
        SnapshotMtopUploader snapshotMtopUploader = new SnapshotMtopUploader(context);
        this.b = snapshotMtopUploader;
        snapshotMtopUploader.a();
    }

    public static /* synthetic */ File c(b8q b8qVar, String str, DiagnoseType diagnoseType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c5c1241e", new Object[]{b8qVar, str, diagnoseType});
        }
        return b8qVar.g(str, diagnoseType);
    }

    public static String e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb15d645", new Object[0]);
        }
        qk7 g = uk7.i().g();
        if (g != null) {
            str = g.c().utdid;
        } else {
            str = "";
        }
        String a2 = d5v.a();
        String d2 = doh.d(String.format("%d_%s_%s", Long.valueOf(System.currentTimeMillis()), a2, str));
        if (TextUtils.isEmpty(d2)) {
            return String.format("%d_%s", Long.valueOf(System.currentTimeMillis()), a2);
        }
        return d2;
    }

    public static synchronized String f() {
        synchronized (b8q.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8bb26e50", new Object[0]);
            }
            String str = d;
            d = e();
            mk7.u(uk7.i().f(), d);
            TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.NATIVE_ONLY).addHeaderInfo("snapshotID", d);
            String str2 = d;
            idh.a("SnapshotManager", "updateSnapshotID from " + str + " to " + str2);
            return str;
        }
    }

    public static /* synthetic */ boolean i(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdbb9d77", new Object[]{file})).booleanValue();
        }
        if (file.isFile()) {
            if (file.getName().endsWith(".snapshot")) {
                return true;
            }
            file.delete();
        }
        return false;
    }

    public final String d(String str, DiagnoseType diagnoseType, qk7 qk7Var, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad660c09", new Object[]{this, str, diagnoseType, qk7Var, map});
        }
        idh.a("SnapshotManager", "formatDiagnoseInfo: " + str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("snapshotID", (Object) str);
            jSONObject.put("type", Integer.valueOf(diagnoseType.getIndex()));
            jSONObject.put("triggerTime", Long.valueOf(System.currentTimeMillis()));
            jSONObject.put("background", qk7Var.l());
            ChangeRecord d2 = qk7Var.d();
            if (d2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                if (!d2.orangeChangeMap.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (OrangeChangeInfo orangeChangeInfo : d2.orangeChangeMap.values()) {
                        if (!orangeChangeInfo.isExpire()) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(NotificationStyle.NOTIFICATION_STYLE, (Object) orangeChangeInfo.getNameSpace());
                            jSONObject3.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, (Object) orangeChangeInfo.getVersion());
                            jSONObject3.put(pg1.ATOM_EXT_gray, (Object) Boolean.valueOf(orangeChangeInfo.isGray()));
                            jSONObject3.put("used", (Object) Boolean.valueOf(orangeChangeInfo.isUsed()));
                            jSONObject3.put("time", (Object) Long.valueOf(orangeChangeInfo.getUpdateTime()));
                            jSONArray.add(jSONObject3);
                        }
                    }
                    jSONObject2.put("orange", (Object) jSONArray);
                }
                if (!d2.abInfoMap.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (ABChangeInfo aBChangeInfo : d2.abInfoMap.values()) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("experimentId", (Object) aBChangeInfo.getExperimentId());
                        jSONObject4.put("bucketId", (Object) aBChangeInfo.getBucketId());
                        jSONObject4.put("publishId", (Object) aBChangeInfo.getPublishId());
                        jSONArray2.add(jSONObject4);
                    }
                    jSONObject2.put("ab", (Object) jSONArray2);
                }
                InstantPatchChangeInfo instantPatchChangeInfo = d2.instantPatchInfo;
                if (instantPatchChangeInfo != null && !TextUtils.isEmpty(instantPatchChangeInfo.getVersion())) {
                    JSONArray jSONArray3 = new JSONArray();
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("type", (Object) Baggage.Amnet.SECURITY_INSTANT);
                    jSONObject5.put("version", (Object) d2.instantPatchInfo.getVersion());
                    jSONArray3.add(jSONObject5);
                    jSONObject2.put("escort", (Object) jSONArray3);
                }
                String customTinctTag = d2.getCustomTinctTag();
                if (!TextUtils.isEmpty(customTinctTag)) {
                    jSONObject2.put("custom", (Object) customTinctTag);
                }
                jSONObject.put("changeInfo", (Object) jSONObject2);
            }
            List<PageInfo> g = qk7Var.g();
            if (!g.isEmpty()) {
                jSONObject.put("historyPages", (Object) g);
            }
            jSONObject.put("netInfo", qk7Var.f());
            bjo i = qk7Var.i();
            if (i != null) {
                jSONObject.put("runtimeInfo", i.c());
            }
            if (!qk7Var.e().isEmpty()) {
                jSONObject.put(AgooConstants.MESSAGE_FLAG, qk7Var.e());
            }
            jSONObject.put(RVConstants.EXTRA_APPINFO, qk7Var.c());
            jSONObject.put(v4s.PARAM_IS_INNER, Boolean.valueOf(qk7Var.c().isInner));
            if (map != null && !map.isEmpty()) {
                jSONObject.put("typeInfo", (Object) map);
            }
            return jSONObject.toString();
        } catch (Exception e) {
            idh.c("SnapshotManager", "Failed to formatDiagnoseInfo: ", e);
            return null;
        }
    }

    public final File g(String str, DiagnoseType diagnoseType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("d844ef1", new Object[]{this, str, diagnoseType});
        }
        return new File(this.f16251a, String.format("%s_%d%s", str, Integer.valueOf(diagnoseType.getIndex()), ".snapshot"));
    }

    public final String k(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5641288", new Object[]{this, file});
        }
        if (!file.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            idh.c("SnapshotManager", "readDiagnoseFromFile", e);
        }
        return sb.toString();
    }

    public synchronized void l(String str, DiagnoseType diagnoseType, qk7 qk7Var, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5461eff3", new Object[]{this, str, diagnoseType, qk7Var, map});
            return;
        }
        try {
            n04 n04Var = this.c;
            if (!(n04Var == null || diagnoseType == DiagnoseType.NativeCrash)) {
                n04Var.a();
            }
            String d2 = d(str, diagnoseType, qk7Var, map);
            if (TextUtils.isEmpty(d2)) {
                xk7.a(str, diagnoseType.getIndex(), 9);
                TLog.loge("Diagnose", "SnapshotManager", "Failed to formatDiagnoseInfo.");
            } else if (!m(g(str, diagnoseType), d2)) {
                TLog.loge("Diagnose", "SnapshotManager", "Failed to save the diagnose to file.");
                xk7.a(str, diagnoseType.getIndex(), 7);
                if (diagnoseType == DiagnoseType.JavaCrash || diagnoseType == DiagnoseType.NativeCrash) {
                    n(diagnoseType, str, d2);
                }
            } else {
                xk7.a(str, diagnoseType.getIndex(), 2);
                if (diagnoseType != DiagnoseType.NativeCrash) {
                    n(diagnoseType, str, d2);
                }
            }
        } catch (Exception e) {
            idh.c("SnapshotManager", "Failed to uploadDiagnoseInfo: ", e);
        }
    }

    public final void o(final File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62169d7f", new Object[]{this, file});
            return;
        }
        idh.a("SnapshotManager", "upload snapshotFile: " + file.getName());
        if (!file.exists()) {
            TLog.loge("Diagnose", "SnapshotManager", "The snapshot file is not exist: " + file.getAbsolutePath());
        } else if (!mk7.q()) {
            idh.b("SnapshotManager", "Diagnose upload is disable");
        } else {
            al7.b().a(new Runnable() { // from class: tb.z7q
                @Override // java.lang.Runnable
                public final void run() {
                    b8q.this.h(file);
                }
            });
        }
    }

    public final void n(DiagnoseType diagnoseType, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ae1ccb", new Object[]{this, diagnoseType, str, str2});
        } else if (!mk7.q()) {
            xk7.a(str, diagnoseType.getIndex(), 6);
            idh.b("SnapshotManager", "Diagnose upload is disable");
        } else {
            idh.a("SnapshotManager", "uploadDiagnoseInfo: " + str);
            ((SnapshotMtopUploader) this.b).b(str, str2, new a(diagnoseType));
            xk7.a(str, diagnoseType.getIndex(), 3);
        }
    }

    public final boolean m(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("274a2fde", new Object[]{this, file, str})).booleanValue();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileChannel channel = fileOutputStream.getChannel();
            try {
                channel.write(Charset.forName("utf8").encode(str));
                channel.close();
                fileOutputStream.close();
                return true;
            } finally {
                try {
                    throw th;
                } catch (Throwable th) {
                }
            }
        } catch (Exception e) {
            idh.c("SnapshotManager", "saveDiagnoseToFile", e);
            return false;
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c58619", new Object[]{this});
            return;
        }
        File[] listFiles = this.f16251a.listFiles(new FileFilter() { // from class: tb.y7q
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                boolean i;
                i = b8q.i(file);
                return i;
            }
        });
        if (listFiles == null || listFiles.length == 0) {
            idh.a("SnapshotManager", "Can't find the snapshot file");
            return;
        }
        for (File file : listFiles) {
            try {
                if (System.currentTimeMillis() - file.lastModified() < mk7.g() * 86400000) {
                    o(file);
                } else {
                    file.delete();
                }
            } catch (Exception e) {
                idh.c("SnapshotManager", "uploadSnapshotFiles", e);
            }
        }
    }

    public final /* synthetic */ void h(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99abb789", new Object[]{this, file});
            return;
        }
        try {
            String name = file.getName();
            if (!name.endsWith(".snapshot")) {
                file.delete();
                return;
            }
            String[] split = name.substring(0, name.lastIndexOf(".snapshot")).split("_");
            if (split.length == 2) {
                String str = split[0];
                String str2 = split[1];
                String k = k(file);
                if (TextUtils.isEmpty(k)) {
                    file.delete();
                    TLog.loge("Diagnose", "SnapshotManager", "The snapshot file is empty: " + file.getAbsolutePath());
                    return;
                }
                n(DiagnoseType.parseByType(str2), str, k);
            }
        } catch (Exception e) {
            idh.c("SnapshotManager", "uploadSnapshotFile runnable: ", e);
        }
    }

    public boolean j(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7e15e22", new Object[]{this, strArr})).booleanValue();
        }
        if (strArr == null || strArr.length < 3 || !"scene_native_crash".equals(strArr[0])) {
            return false;
        }
        try {
            if (System.currentTimeMillis() - Long.parseLong(strArr[2]) > 43200000) {
                return false;
            }
            String absolutePath = g(strArr[1], DiagnoseType.NativeCrash).getAbsolutePath();
            String[] list = this.f16251a.list();
            if (list != null) {
                for (String str : list) {
                    if (absolutePath.equals(str)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
