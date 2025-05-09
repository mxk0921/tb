package tb;

import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.avplayer.DWNetworkAdapter;
import com.taobao.avplayer.core.model.DWRequest;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.mediaplay.model.MediaVideoResponse;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b95 implements qvd {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean e = false;
    public static volatile String f;
    public static volatile float g;
    public static volatile String h;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f16261a;
    public final ktb b;
    public final String c;
    public a9e d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ltb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ltb
        public void onError(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
            } else if (b95.c(b95.this) != null) {
                MediaVideoResponse mediaVideoResponse = new MediaVideoResponse();
                if (dWResponse != null) {
                    mediaVideoResponse.data = dWResponse.data;
                    mediaVideoResponse.errorCode = dWResponse.errorCode;
                    mediaVideoResponse.errorMsg = dWResponse.errorMsg;
                }
                b95.c(b95.this).a(mediaVideoResponse);
            }
        }

        @Override // tb.ltb
        public void onSuccess(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
            } else if (b95.c(b95.this) != null) {
                MediaVideoResponse mediaVideoResponse = new MediaVideoResponse();
                if (dWResponse != null) {
                    mediaVideoResponse.data = dWResponse.data;
                    mediaVideoResponse.errorCode = dWResponse.errorCode;
                    mediaVideoResponse.errorMsg = dWResponse.errorMsg;
                }
                b95.c(b95.this).b(mediaVideoResponse);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452984935);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/DWPlayControlAdapter$QueryVideoConfigDataTask");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            b95.this.e();
            return null;
        }

        /* renamed from: b */
        public void onPostExecute(Void r5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("213d104", new Object[]{this, r5});
            } else {
                b95.b(b95.this);
            }
        }

        public /* synthetic */ b(b95 b95Var, a aVar) {
            this();
        }
    }

    static {
        t2o.a(452984933);
        t2o.a(774897763);
    }

    public b95(String str, HashMap<String, String> hashMap) {
        if (!TextUtils.isEmpty(str)) {
            this.c = str;
        }
        if (hashMap != null) {
            this.f16261a = hashMap;
        }
        try {
            int i = DWNetworkAdapter.f10096a;
            this.b = (ktb) DWNetworkAdapter.class.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (InstantiationException e4) {
            e4.printStackTrace();
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
        }
    }

    public static /* synthetic */ void b(b95 b95Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c8ef07", new Object[]{b95Var});
        } else {
            b95Var.f();
        }
    }

    public static /* synthetic */ a9e c(b95 b95Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a9e) ipChange.ipc$dispatch("ed79f23", new Object[]{b95Var});
        }
        return b95Var.d;
    }

    @Override // tb.qvd
    public void a(a9e a9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab971ca5", new Object[]{this, a9eVar});
        } else if (a9eVar != null && this.f16261a != null && !TextUtils.isEmpty(this.c)) {
            this.d = a9eVar;
            if (!e) {
                new b(this, null).execute(new Void[0]);
            } else {
                f();
            }
        }
    }

    public final DWRequest d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWRequest) ipChange.ipc$dispatch("fb2c01ba", new Object[]{this});
        }
        DWRequest dWRequest = new DWRequest();
        dWRequest.responseClass = null;
        dWRequest.apiName = k75.VIDEOCONFIG_API_NAME;
        dWRequest.apiVersion = k75.VIDEOCONFIG_API_VERSION_3;
        HashMap hashMap = new HashMap();
        dWRequest.paramMap = hashMap;
        hashMap.put("expectedCodec", "h265");
        dWRequest.paramMap.put("sdkVersion", k75.f22443a);
        dWRequest.paramMap.put("videoId", this.c);
        dWRequest.paramMap.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        dWRequest.paramMap.put("cpuModel", f);
        Map<String, String> map = dWRequest.paramMap;
        map.put("cpuHz", "" + g);
        dWRequest.paramMap.put("deviceMemory", h);
        Map<String, String> map2 = dWRequest.paramMap;
        map2.put("aliHARuntimeEvaluationLevel", "" + lp0.d().f().f23479a);
        Map<String, String> map3 = dWRequest.paramMap;
        map3.put("androidSDKVersion", "" + Build.VERSION.SDK_INT);
        dWRequest.paramMap.put("useServerPriority", "1");
        dWRequest.paramMap.putAll(this.f16261a);
        return dWRequest;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f2788", new Object[]{this});
        } else if (!e) {
            f = ew0.e();
            g = 0.0f;
            int b2 = dx4.b();
            for (int i = 0; i < b2; i++) {
                try {
                    float c = l95.c(dx4.a(i)) / 1000000.0f;
                    if (c > g) {
                        g = c;
                    }
                } catch (Exception e2) {
                    AVSDKLog.e(tfb.MODULE_SDK_PAGE, "Get MaxCpuFreq Error " + e2);
                }
            }
            h = String.format("%.2f", Double.valueOf((lp0.d().e().f23478a / 1000.0d) / 1000.0d));
            e = true;
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ac079e", new Object[]{this});
        } else {
            g(d(), new a());
        }
    }

    public final void g(DWRequest dWRequest, ltb ltbVar) {
        ktb ktbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a930e88c", new Object[]{this, dWRequest, ltbVar});
        } else if (dWRequest == null || (ktbVar = this.b) == null) {
            ltbVar.onError(null);
        } else {
            ktbVar.sendRequest(ltbVar, dWRequest);
        }
    }
}
