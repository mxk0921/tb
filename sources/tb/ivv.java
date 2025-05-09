package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ivv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_TYPE_DARK_DETECT = "darkDetect";
    public static final String BIZ_TYPE_SCAN = "scan";
    public static final String BIZ_TYPE_SCAN_FRAME = "scanFrame";
    public static final String LOCAL_FILE_PATH = "localFilePath";

    /* renamed from: a  reason: collision with root package name */
    public static final nf9 f21605a;
    public static final b Companion = new b(null);
    public static final Handler b = new Handler(Looper.getMainLooper(), a.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297669);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public static final /* synthetic */ void a(b bVar, boolean z, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cdc0473e", new Object[]{bVar, new Boolean(z), obj});
            } else {
                bVar.e(z, obj);
            }
        }

        public final void b(boolean z, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72a8de2b", new Object[]{this, new Boolean(z), hashMap});
                return;
            }
            if (z) {
                mzu.m(p73.f25916a, "abnormalQuery", 19999, hashMap);
                if (hashMap.get("url") != null) {
                    agh.h("UtFileUploadManager", ckf.p("upload dark detect success. map=", JSON.toJSONString(hashMap)));
                }
            }
            String str = hashMap.get(ivv.LOCAL_FILE_PATH);
            if (str != null) {
                try {
                    yf9.c(new File(str));
                } catch (Exception unused) {
                    xhv xhvVar = xhv.INSTANCE;
                }
            }
        }

        public final void c(boolean z, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1da6b3a6", new Object[]{this, new Boolean(z), hashMap});
            } else if (z) {
                mzu.m("Page_PhotoSearchScan", "UploadScanFailedImage", 19999, hashMap);
            }
        }

        public final void d(boolean z, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28010e24", new Object[]{this, new Boolean(z), hashMap});
                return;
            }
            if (z) {
                mzu.m("Page_PhotoSearchScan", "UploadScanSuccessFrame", 2101, hashMap);
            }
            String str = hashMap.get(ivv.LOCAL_FILE_PATH);
            if (str != null) {
                try {
                    yf9.c(new File(str));
                } catch (Exception unused) {
                    xhv xhvVar = xhv.INSTANCE;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(boolean r5, java.lang.Object r6) {
            /*
                r4 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = tb.ivv.b.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L_0x001d
                java.lang.Boolean r1 = new java.lang.Boolean
                r1.<init>(r5)
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r2 = 0
                r5[r2] = r4
                r2 = 1
                r5[r2] = r1
                r1 = 2
                r5[r1] = r6
                java.lang.String r6 = "feaded9c"
                r0.ipc$dispatch(r6, r5)
                return
            L_0x001d:
                if (r6 == 0) goto L_0x00cf
                boolean r0 = r6 instanceof java.util.HashMap
                if (r0 == 0) goto L_0x00cf
                java.util.HashMap r6 = (java.util.HashMap) r6
                boolean r0 = r6.isEmpty()
                r1 = 0
                if (r0 == 0) goto L_0x002d
                goto L_0x0053
            L_0x002d:
                java.util.Set r0 = r6.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x0035:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0053
                java.lang.Object r2 = r0.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                boolean r3 = r3 instanceof java.lang.String
                if (r3 == 0) goto L_0x0052
                java.lang.Object r2 = r2.getValue()
                boolean r2 = r2 instanceof java.lang.String
                if (r2 == 0) goto L_0x0052
                goto L_0x0035
            L_0x0052:
                r6 = r1
            L_0x0053:
                if (r6 != 0) goto L_0x0057
                goto L_0x00cf
            L_0x0057:
                java.lang.String r0 = "bizType"
                java.lang.Object r0 = r6.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r2 = "UtFileUploadManager"
                if (r0 != 0) goto L_0x0064
                goto L_0x00c8
            L_0x0064:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "processUploadAlbumResult: bizType:"
                r1.<init>(r3)
                r1.append(r0)
                java.lang.String r3 = ", resultMap:"
                r1.append(r3)
                java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r6)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.String r3 = "AutoDetect"
                tb.agh.r(r3, r2, r1)
                int r1 = r0.hashCode()
                r3 = -1848411920(0xffffffff91d378f0, float:-3.3364464E-28)
                if (r1 == r3) goto L_0x00b7
                r3 = 3524221(0x35c67d, float:4.938485E-39)
                if (r1 == r3) goto L_0x00a7
                r3 = 1928204729(0x72ee11b9, float:9.430894E30)
                if (r1 == r3) goto L_0x0098
                goto L_0x00c6
            L_0x0098:
                java.lang.String r1 = "darkDetect"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00a1
                goto L_0x00c6
            L_0x00a1:
                tb.ivv$b r0 = tb.ivv.Companion
                r0.b(r5, r6)
                goto L_0x00c6
            L_0x00a7:
                java.lang.String r1 = "scan"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00b1
                goto L_0x00c6
            L_0x00b1:
                tb.ivv$b r0 = tb.ivv.Companion
                r0.c(r5, r6)
                goto L_0x00c6
            L_0x00b7:
                java.lang.String r1 = "scanFrame"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00c1
                goto L_0x00c6
            L_0x00c1:
                tb.ivv$b r0 = tb.ivv.Companion
                r0.d(r5, r6)
            L_0x00c6:
                tb.xhv r1 = tb.xhv.INSTANCE
            L_0x00c8:
                if (r1 != 0) goto L_0x00cf
                java.lang.String r5 = "bizType is empty"
                tb.agh.h(r2, r5)
            L_0x00cf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.ivv.b.e(boolean, java.lang.Object):void");
        }

        public final void f(String str, String str2, HashMap<String, String> hashMap, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9af876", new Object[]{this, str, str2, hashMap, str3});
                return;
            }
            ckf.g(str, "bizType");
            ckf.g(str2, "url");
            ckf.g(hashMap, "params");
            ckf.g(str3, v4s.PARAM_UPLOAD_FILE_TYPE);
            if (ivv.a() instanceof lf9) {
                hashMap.put("bizType", str);
                ((lf9) ivv.a()).d(str2, ivv.b(), str3, hashMap);
            }
        }

        public b() {
        }
    }

    static {
        t2o.a(481297668);
        nf9 a2 = of9.a(lg4.P3());
        ckf.f(a2, "createInstance(ConfigModel.getVideoOssNamespace())");
        f21605a = a2;
    }

    public static final /* synthetic */ nf9 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nf9) ipChange.ipc$dispatch("7bb6a019", new Object[0]);
        }
        return f21605a;
    }

    public static final /* synthetic */ Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7036baef", new Object[0]);
        }
        return b;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            ckf.g(message, "msg");
            agh.h("UtFileUploadManager", ckf.p("uploadResult=", Integer.valueOf(message.what)));
            int i = message.what;
            if (i == 30000) {
                b.a(ivv.Companion, true, message.obj);
                return true;
            } else if (i != 30001) {
                return false;
            } else {
                b.a(ivv.Companion, false, message.obj);
                return true;
            }
        }
    }
}
