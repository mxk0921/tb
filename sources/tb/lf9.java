package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.appcompat.taobao.util.Globals;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class lf9 extends nf9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ERROR_CODE = "errorCode";
    public static final String KEY_TFS_KEY = "tfsKey";
    public static final String KEY_UPLOAD_URL = "url";
    public static final String KEY_VIDEO_ID = "videoID";
    public final Map<String, z6e> b = new HashMap();
    public final x6e c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends smv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(lf9 lf9Var, Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/util/FileUploader$1");
        }

        @Override // tb.smv, com.uploader.export.IUploaderEnvironment
        public String getAppKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
            }
            return caa.a();
        }

        @Override // tb.smv, com.uploader.export.IUploaderEnvironment
        public String getAppVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
            }
            return caa.p();
        }

        @Override // tb.smv, com.uploader.export.IUploaderEnvironment
        public int getEnvironment() {
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("487b46d7", new Object[]{this})).intValue();
            }
            int e = caa.e();
            if (e != 1) {
                i = 2;
                if (e != 2) {
                    return 0;
                }
            }
            return i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements z6e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23311a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f23311a = str;
            this.b = str2;
        }

        @Override // tb.z6e
        public String getBizType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
            }
            return lf9.b(lf9.this);
        }

        @Override // tb.z6e
        public String getFilePath() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
            }
            return this.f23311a;
        }

        @Override // tb.z6e
        public String getFileType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this});
            }
            return this.b;
        }

        @Override // tb.z6e
        public Map<String, String> getMetaInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this});
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements mzd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HashMap f23312a;
        public final /* synthetic */ Handler b;
        public final /* synthetic */ String c;

        public c(HashMap hashMap, Handler handler, String str) {
            this.f23312a = hashMap;
            this.b = handler;
            this.c = str;
        }

        @Override // tb.mzd
        public void onCancel(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7d021ed", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onFailure(z6e z6eVar, ndt ndtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7789334b", new Object[]{this, z6eVar, ndtVar});
                return;
            }
            String str = ndtVar.f24666a;
            String str2 = ndtVar.b;
            String str3 = ndtVar.c;
            agh.r("AutoDetect", nf9.TAG, "errcode:" + str + ",subcode:" + str2 + ",errMsg:" + str3);
            Handler handler = this.b;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = 30001;
                HashMap hashMap = new HashMap(10);
                hashMap.put("errorCode", ndtVar.b);
                HashMap hashMap2 = this.f23312a;
                if (hashMap2 != null && !hashMap2.isEmpty()) {
                    hashMap.putAll(this.f23312a);
                }
                obtainMessage.obj = hashMap;
                this.b.sendMessage(obtainMessage);
            }
            lf9.a(lf9.this).remove(this.c);
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
            Handler handler = this.b;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = nf9.MSG_FILE_UPLOAD_PROGRESS;
                obtainMessage.obj = Integer.valueOf(i);
                this.b.sendMessage(obtainMessage);
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
            } else {
                agh.r("AutoDetect", nf9.TAG, "onStart");
            }
        }

        @Override // tb.mzd
        public void onSuccess(z6e z6eVar, ozd ozdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10b3127c", new Object[]{this, z6eVar, ozdVar});
                return;
            }
            agh.r("AutoDetect", nf9.TAG, "onSuccess task.bizType " + z6eVar.getBizType() + ", result " + JSON.toJSONString(ozdVar));
            HashMap hashMap = new HashMap(5);
            String c = lf9.c(lf9.this, ozdVar.a());
            HashMap hashMap2 = this.f23312a;
            if (hashMap2 != null && !hashMap2.isEmpty()) {
                hashMap.putAll(this.f23312a);
                if (!TextUtils.isEmpty(c)) {
                    hashMap.put("tfskey", c);
                }
            }
            hashMap.put("url", ozdVar.a());
            Handler handler = this.b;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = 30000;
                obtainMessage.obj = hashMap;
                this.b.sendMessage(obtainMessage);
            }
            lf9.a(lf9.this).remove(this.c);
        }

        @Override // tb.mzd
        public void onWait(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3e24ed2", new Object[]{this, z6eVar});
            }
        }
    }

    static {
        t2o.a(481297593);
    }

    public lf9(String str) {
        super(str);
        x6e a2 = omv.a();
        this.c = a2;
        if (!a2.isInitialized()) {
            f();
        }
    }

    public static /* synthetic */ Map a(lf9 lf9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("75ab8254", new Object[]{lf9Var});
        }
        return lf9Var.b;
    }

    public static /* synthetic */ String b(lf9 lf9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7c82440", new Object[]{lf9Var});
        }
        return lf9Var.f24701a;
    }

    public static /* synthetic */ String c(lf9 lf9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2e53e15", new Object[]{lf9Var, str});
        }
        return lf9Var.e(str);
    }

    public static /* synthetic */ Object ipc$super(lf9 lf9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/util/FileUploader");
    }

    public void d(String str, Handler handler, String str2, HashMap<String, String> hashMap) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffce4600", new Object[]{this, str, handler, str2, hashMap});
        } else if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null) {
            String path = parse.getPath();
            b bVar = new b(path, str2);
            ((HashMap) this.b).put(path, bVar);
            this.c.uploadAsync(bVar, new c(hashMap, handler, path), null);
        }
    }

    public final String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc195e5b", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("/");
        return split[split.length - 1];
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c1add25", new Object[]{this});
        } else {
            this.c.initialize(Globals.getApplication(), new pmv(Globals.getApplication(), new a(this, Globals.getApplication())));
        }
    }
}
