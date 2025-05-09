package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j6s implements zfh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public z6e f21800a;
    public x6e b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends smv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21801a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j6s j6sVar, Context context, String str, String str2) {
            super(context);
            this.f21801a = str;
            this.b = str2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tlog/uploader/TLogUploader$1");
        }

        @Override // tb.smv, com.uploader.export.IUploaderEnvironment
        public String getAppKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
            }
            return this.b;
        }

        @Override // tb.smv, com.uploader.export.IUploaderEnvironment
        public String getAppVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
            }
            return this.f21801a;
        }

        @Override // tb.smv, com.uploader.export.IUploaderEnvironment
        public int getEnvironment() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("487b46d7", new Object[]{this})).intValue();
            }
            return 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements mzd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ff9 f21802a;

        public b(ff9 ff9Var) {
            this.f21802a = ff9Var;
        }

        @Override // tb.mzd
        public void onCancel(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7d021ed", new Object[]{this, z6eVar});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("fileName", z6eVar.getFilePath());
            if (z6eVar instanceof c) {
                c cVar = (c) z6eVar;
                hashMap.put(v4s.PARAM_UPLOAD_ID, cVar.f);
                hashMap.put(v4s.PARAM_TASK_ID, cVar.f);
                hashMap.put("fileSize", cVar.e);
                TLogEventHelper.g(v4s.UT_TLOG_ARUP_CANCEL, hashMap);
                j5s.j().s().c(b6s.g, cVar.f, "The upload task is canceled!");
                ff9 ff9Var = this.f21802a;
                if (ff9Var != null) {
                    ff9Var.onError(cVar.c, "Cancel", "The upload task is canceled!");
                }
            }
        }

        @Override // tb.mzd
        public void onFailure(z6e z6eVar, ndt ndtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7789334b", new Object[]{this, z6eVar, ndtVar});
                return;
            }
            File file = new File(z6eVar.getFilePath());
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", ndtVar.f24666a + "," + ndtVar.b);
            hashMap.put("errMsg", ndtVar.c);
            hashMap.put("fileName", file.getAbsolutePath());
            if (z6eVar instanceof c) {
                c cVar = (c) z6eVar;
                hashMap.put(v4s.PARAM_UPLOAD_ID, cVar.f);
                hashMap.put(v4s.PARAM_TASK_ID, cVar.f);
                if (file.exists()) {
                    hashMap.put("fileSize", cVar.e);
                } else {
                    hashMap.put("fileSize", "-1");
                }
                TLogEventHelper.g(v4s.UT_TLOG_ARUP_ERR, hashMap);
                String str = ndtVar.f24666a + ":" + ndtVar.b;
                j5s.j().s().c(b6s.g, cVar.f, str);
                ff9 ff9Var = this.f21802a;
                if (ff9Var != null) {
                    ff9Var.onError(cVar.c, str, ndtVar.c);
                }
            }
        }

        @Override // tb.mzd
        public void onPause(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c85aa60f", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onProgress(z6e z6eVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34b23fa9", new Object[]{this, z6eVar, new Integer(i)});
            }
        }

        @Override // tb.mzd
        public void onResume(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e581d4da", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onStart(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f33e623", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onSuccess(z6e z6eVar, ozd ozdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10b3127c", new Object[]{this, z6eVar, ozdVar});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("fileName", new File(z6eVar.getFilePath()).getName());
            if (z6eVar instanceof c) {
                c cVar = (c) z6eVar;
                hashMap.put(v4s.PARAM_UPLOAD_ID, cVar.f);
                hashMap.put(v4s.PARAM_TASK_ID, cVar.f);
                hashMap.put("fileSize", cVar.e);
                hashMap.put("costTime", String.valueOf(System.currentTimeMillis() - cVar.h));
                TLogEventHelper.g(v4s.UT_TLOG_ARUP_SUCCESS, hashMap);
                ff9 ff9Var = this.f21802a;
                if (ff9Var != null) {
                    ff9Var.a(cVar.c, ozdVar.a());
                }
            }
        }

        @Override // tb.mzd
        public void onWait(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3e24ed2", new Object[]{this, z6eVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements z6e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f21803a;
        public String b;
        public String c;
        public String d;
        public String e = "";
        public String f = "";
        public Map<String, String> g;
        public long h;

        @Override // tb.z6e
        public String getBizType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
            }
            return this.f21803a;
        }

        @Override // tb.z6e
        public String getFilePath() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
            }
            return this.b;
        }

        @Override // tb.z6e
        public String getFileType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this});
            }
            return this.d;
        }

        @Override // tb.z6e
        public Map<String, String> getMetaInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this});
            }
            return this.g;
        }
    }

    @Override // tb.zfh
    public tmv b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tmv) ipChange.ipc$dispatch("858544ba", new Object[]{this});
        }
        tmv tmvVar = new tmv();
        tmvVar.f28810a = "arup";
        return tmvVar;
    }

    @Override // tb.zfh
    public void a(vmv vmvVar, String str, ff9 ff9Var) {
        String str2;
        Exception e;
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("550b2760", new Object[]{this, vmvVar, str, ff9Var});
            return;
        }
        File file2 = new File(str);
        HashMap hashMap = new HashMap();
        hashMap.put("fileName", file2.getName());
        hashMap.put("fileSize", String.valueOf(file2.length()));
        hashMap.put(v4s.PARAM_UPLOAD_ID, vmvVar.c);
        hashMap.put(v4s.PARAM_TASK_ID, vmvVar.c);
        TLogEventHelper.g(v4s.UT_TLOG_ARUP_REQUEST, hashMap);
        Map<String, String> map = vmvVar.m;
        if (map == null) {
            String value = ErrorCode.DATA_EMPTY.getValue();
            j5s.j().s().c(b6s.g, vmvVar.c, "[ARUP Uploader] UploaderParam is null");
            TLogEventHelper.d(v4s.UT_TLOG_ARUP_ERR, value, "[ARUP Uploader] UploaderParam is null", hashMap);
            if (ff9Var != null) {
                ff9Var.onError(str, value, "[ARUP Uploader] UploaderParam is null");
                return;
            }
            return;
        }
        Context context = vmvVar.i;
        String str3 = vmvVar.j;
        String str4 = vmvVar.f32478a;
        String str5 = map.get("arupBizType");
        String str6 = vmvVar.m.get("ossObjectKey");
        if (str5 == null || str6 == null) {
            String value2 = ErrorCode.DATA_EMPTY.getValue();
            j5s.j().s().c(b6s.g, vmvVar.c, "[ARUP Uploader] BizType os ObjectKey is null");
            TLogEventHelper.d(v4s.UT_TLOG_ARUP_ERR, value2, "[ARUP Uploader] BizType os ObjectKey is null", hashMap);
            if (ff9Var != null) {
                ff9Var.onError(str, value2, "[ARUP Uploader] BizType os ObjectKey is null");
                return;
            }
            return;
        }
        x6e a2 = omv.a();
        this.b = a2;
        if (!a2.isInitialized()) {
            this.b.initialize(context, new pmv(context, new a(this, context, str3, str4)));
        }
        c cVar = new c();
        cVar.f = vmvVar.c;
        cVar.f21803a = str5;
        cVar.d = ".log";
        if (cVar.g == null) {
            cVar.g = new HashMap();
        }
        ((HashMap) cVar.g).put("arupBizType", str5);
        ((HashMap) cVar.g).put("ossObjectKey", str6);
        try {
            if (!TextUtils.isEmpty(vmvVar.k)) {
                File file3 = new File(vmvVar.k);
                if (!file3.exists()) {
                    file3.mkdirs();
                }
                file = g5s.a(file2, new File(file3, file2.getName()));
            } else {
                file = null;
            }
            if (file == null || !file.exists()) {
                cVar.b = str;
                cVar.e = String.valueOf(file2.length());
            } else {
                String.format("Copy to %s, length=%d", file.getAbsolutePath(), Long.valueOf(file.length()));
                cVar.b = file.getAbsolutePath();
                cVar.e = String.valueOf(file.length());
            }
            cVar.c = str;
            cVar.h = System.currentTimeMillis();
            this.f21800a = cVar;
            hashMap.put("fileSize", cVar.e);
            TLogEventHelper.g(v4s.UT_TLOG_ARUP_START, hashMap);
            s5s s = j5s.j().s();
            String str7 = b6s.g;
            s.b(str7, vmvVar.c, "[ARUP Uploader] Upload file：" + cVar.b + ", Size: " + cVar.e);
            if (!this.b.uploadAsync(this.f21800a, new b(ff9Var), null)) {
                String value3 = ErrorCode.NET_ERROR.getValue();
                str2 = v4s.UT_TLOG_ARUP_ERR;
                try {
                    TLogEventHelper.d(str2, value3, "[ARUP Uploader] Invoke uploadAsync failed!", hashMap);
                    j5s.j().s().b(str7, vmvVar.c, "[ARUP Uploader] Invoke uploadAsync failed!");
                    if (ff9Var != null) {
                        ff9Var.onError(str, value3, "[ARUP Uploader] Invoke uploadAsync failed!");
                    }
                } catch (Exception e2) {
                    e = e2;
                    String value4 = ErrorCode.CODE_EXC.getValue();
                    String str8 = "[ARUP Uploader] Exception: " + e.toString();
                    j5s.j().s().a(b6s.g, vmvVar.c, e);
                    TLogEventHelper.d(str2, value4, str8, hashMap);
                    if (ff9Var != null) {
                        ff9Var.onError(str, value4, str8);
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            str2 = v4s.UT_TLOG_ARUP_ERR;
        }
    }
}
