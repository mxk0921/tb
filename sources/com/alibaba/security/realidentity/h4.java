package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.biz.dynamic.model.OssConfig;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.service.upload.UploadFileModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.mzd;
import tb.ndt;
import tb.omv;
import tb.ozd;
import tb.x6e;
import tb.z6e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class h4 extends j4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String e = "h4";
    public static final String f = "x-arup-biz-ret";
    public static final String g = "ossBucketName";
    public static final String h = "ossObjectKey";
    public final x6e d = omv.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements z6e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UploadFileModel f2735a;
        public final /* synthetic */ Map b;

        public a(UploadFileModel uploadFileModel, Map map) {
            this.f2735a = uploadFileModel;
            this.b = map;
        }

        @Override // tb.z6e
        public String getBizType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
            }
            return "rp_asset";
        }

        @Override // tb.z6e
        public String getFilePath() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
            }
            return this.f2735a.mLocalFilePath;
        }

        @Override // tb.z6e
        public String getFileType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this});
            }
            return this.f2735a.mFileType;
        }

        @Override // tb.z6e
        public Map<String, String> getMetaInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this});
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements mzd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6e f2736a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ l4 d;

        public b(z6e z6eVar, long j, long j2, l4 l4Var) {
            this.f2736a = z6eVar;
            this.b = j;
            this.c = j2;
            this.d = l4Var;
        }

        @Override // tb.mzd
        public void onCancel(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7d021ed", new Object[]{this, z6eVar});
            } else {
                this.d.onCancel();
            }
        }

        @Override // tb.mzd
        public void onFailure(z6e z6eVar, ndt ndtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7789334b", new Object[]{this, z6eVar, ndtVar});
                return;
            }
            String a2 = h4.a();
            com.alibaba.security.realidentity.a.a(a2, ">>>>>>>>>>>>>>>> " + ndtVar.f24666a + " : " + ndtVar.b + " : " + ndtVar.c);
            this.d.onError(ndtVar.toString());
            h4.this.a("oss upload failed", ndtVar.toString(), this.f2736a.getFilePath());
            h4.this.a(this.f2736a.getFilePath(), this.f2736a.getFileType(), null, ndtVar.f24666a, ndtVar.toString(), System.currentTimeMillis() - this.b, this.c);
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
                return;
            }
            long j = this.c;
            this.d.onProgress((i / 100.0f) * j, j);
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
            Map<String, String> result = ozdVar.getResult();
            String str = null;
            if (result != null && result.containsKey(h4.f)) {
                JSONObject parseObject = JSON.parseObject(result.get(h4.f));
                String string = (parseObject == null || !parseObject.containsKey("ossBucketName")) ? null : parseObject.getString("ossBucketName");
                String string2 = (parseObject == null || !parseObject.containsKey("ossObjectKey")) ? null : parseObject.getString("ossObjectKey");
                if (!(string == null || string2 == null)) {
                    str = "oss://" + string + ":" + string2;
                }
            }
            if (str == null) {
                h4.this.a(this.f2736a.getFilePath(), this.f2736a.getFileType(), str, "-1", "remote url is null", System.currentTimeMillis() - this.b, this.c);
                h4.this.a("oss upload failed", "remote url is null", this.f2736a.getFilePath());
                this.d.onError("remote url is null");
                return;
            }
            h4.this.a(this.f2736a.getFilePath(), this.f2736a.getFileType(), str, "0", null, System.currentTimeMillis() - this.b, this.c);
            this.d.onSuccess(str);
        }

        @Override // tb.mzd
        public void onWait(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3e24ed2", new Object[]{this, z6eVar});
            }
        }
    }

    public h4(Context context, String str, u4 u4Var) {
        super(context, str, u4Var);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : e;
    }

    public static /* synthetic */ Object ipc$super(h4 h4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/h4");
    }

    @Override // com.alibaba.security.realidentity.k4
    public Object a(String str, OssConfig ossConfig, UploadFileModel uploadFileModel, l4 l4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ae97a409", new Object[]{this, str, ossConfig, uploadFileModel, l4Var});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("arup-directory", uploadFileModel.mDestDir);
        hashMap.put("arup-file-name", uploadFileModel.mRemoteFileName);
        a aVar = new a(uploadFileModel, hashMap);
        long c = f.c(uploadFileModel.mLocalFilePath);
        long currentTimeMillis = System.currentTimeMillis();
        a(aVar.getFilePath(), aVar.getFileType(), c);
        this.d.uploadAsync(aVar, new b(aVar, currentTimeMillis, c, l4Var), null);
        return aVar;
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            a(TrackLog.createSdkExceptionLog(str, str2, str3));
        }
    }

    @Override // com.alibaba.security.realidentity.k4
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (obj instanceof z6e) {
            this.d.cancelAsync((z6e) obj);
        }
    }
}
