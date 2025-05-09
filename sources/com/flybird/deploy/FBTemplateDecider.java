package com.flybird.deploy;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.birdnest.platform.ConnectionUtils;
import com.alipay.birdnest.platform.Platform;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocumentAssistor;
import com.flybird.FBTools;
import com.flybird.deploy.FBTemplateDecider;
import com.flybird.deploy.a;
import com.flybird.deploy.callback.FBTemplateDeciderSingleFileModelCallback;
import com.flybird.deploy.callback.FBTemplateDeciderTemplateListModelCallback;
import com.flybird.deploy.callback.FBTemplateDeciderTemplateModelCallback;
import com.flybird.deploy.callback.a;
import com.flybird.deploy.model.FBFullTplInfo;
import com.flybird.deploy.model.FBSimpleTplInfo;
import com.flybird.deploy.model.FBTemplateContent;
import com.flybird.deploy.model.FBUpdatePolicy$DeploymentType;
import com.flybird.deploy.model.IFBTplInfo;
import com.flybird.support.basics.AppContextHolder;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import tb.cpr;
import tb.eng;
import tb.fua;
import tb.hr6;
import tb.jst;
import tb.k8u;
import tb.l2w;
import tb.man;
import tb.pgh;
import tb.pt8;
import tb.pu8;
import tb.qu8;
import tb.saa;
import tb.td9;
import tb.tu8;
import tb.uca;
import tb.uu8;
import tb.vu8;
import tb.y0a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBTemplateDecider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, FBTemplateDecider> f4986a;
    public static final Map<String, FBTemplateContent> b;
    public static final Map<String, File> c;
    public static final hr6<String, Void> d;
    public static final hr6<String, Void> e;
    public static final hr6<Object, byte[]> f;
    public volatile State g = State.READY;
    public final String h;
    public final tu8 i;
    public final long j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum State {
        NOT_READY,
        READY,
        DESTROYED
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements y0a<Boolean, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f4988a = false;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        public a(long j, long j2) {
            this.c = j;
            this.d = j2;
        }

        /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Void, java.lang.Object] */
        @Override // tb.y0a
        public Void apply(Boolean bool) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7a74adc1", new Object[]{this, bool});
            }
            Boolean bool2 = bool;
            if (this.f4988a) {
                return null;
            }
            this.f4988a = true;
            jst.a();
            if (FBTemplateDecider.this.g != State.READY) {
                pgh.d("C -> forceDownloadShouldRetry callback->x");
                FBTemplateDecider.returnForceDownloadShouldRetry(this.c, this.d, false);
                return null;
            }
            pgh.h("C -> forceDownloadShouldRetry callback->" + bool2);
            long j = this.c;
            long j2 = this.d;
            if (bool2 != null) {
                z = bool2.booleanValue();
            }
            FBTemplateDecider.returnForceDownloadShouldRetry(j, j2, z);
            return null;
        }

        @Override // tb.y0a
        public void error(Void r5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25621cab", new Object[]{this, r5});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b implements y0a<a.b, Void, Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f4989a;
        public final /* synthetic */ long b;

        public b(long j, long j2) {
            this.f4989a = j;
            this.b = j2;
        }

        /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Void, java.lang.Object] */
        @Override // tb.y0a
        public Void apply(a.b bVar) {
            byte[] bArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7a74adc1", new Object[]{this, bVar});
            }
            a.b bVar2 = bVar;
            if (bVar2 == null || (bArr = bVar2.c) == null || bArr.length <= 0) {
                FBTemplateDecider.returnDownloadCdnFileResult(this.f4989a, this.b, 2002, null);
                return null;
            }
            StringBuilder sb = new StringBuilder("C -> downloadCdnFile done for ");
            long j = this.f4989a;
            IpChange ipChange2 = l2w.$ipChange;
            sb.append(Long.toHexString(j));
            sb.append(", returning ");
            sb.append(bVar2.c.length);
            sb.append(" bytes");
            pgh.h(sb.toString());
            FBTemplateDecider.returnDownloadCdnFileResult(this.f4989a, this.b, 0, bVar2.c);
            return null;
        }

        @Override // tb.y0a
        public void error(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25621cab", new Object[]{this, th});
                return;
            }
            StringBuilder sb = new StringBuilder("C -> downloadCdnFile exception for ");
            long j = this.f4989a;
            IpChange ipChange2 = l2w.$ipChange;
            sb.append(Long.toHexString(j));
            pgh.g(sb.toString(), th);
            FBTemplateDecider.returnDownloadCdnFileResult(this.f4989a, this.b, 2002, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class c extends hr6<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/deploy/FBTemplateDecider$13");
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.String] */
        @Override // tb.hr6
        public String a(File file, Void r6) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c2b7697", new Object[]{this, file, r6});
            }
            return ConnectionUtils.b(fua.e(file));
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.lang.String] */
        @Override // tb.hr6
        public String c(String str, Void r6) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, r6});
            }
            return str;
        }

        /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.lang.String] */
        @Override // tb.hr6
        public String d(String str, Void r6, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("5a0a24eb", new Object[]{this, str, r6, th});
            }
            pgh.m(th, "dataPtrToCharsProcessor failed");
            return "";
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.lang.String] */
        @Override // tb.hr6
        public String e(byte[] bArr, Void r6) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7b9ded47", new Object[]{this, bArr, r6});
            }
            return ConnectionUtils.b(bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class d extends hr6<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/deploy/FBTemplateDecider$14");
        }

        /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.lang.String] */
        @Override // tb.hr6
        public String a(File file, Void r6) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c2b7697", new Object[]{this, file, r6});
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[1024];
                MessageDigest instance = MessageDigest.getInstance("MD5");
                int i = 0;
                while (i != -1) {
                    i = fileInputStream.read(bArr);
                    if (i > 0) {
                        instance.update(bArr, 0, i);
                    }
                }
                String a2 = ConnectionUtils.a(instance.digest());
                fileInputStream.close();
                return a2;
            } catch (Exception e) {
                pgh.m(e, "error while md5 file");
                return null;
            }
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.String] */
        @Override // tb.hr6
        public String c(String str, Void r6) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, r6});
            }
            return fua.c(ConnectionUtils.a(str));
        }

        /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.lang.String] */
        @Override // tb.hr6
        public String d(String str, Void r6, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("5a0a24eb", new Object[]{this, str, r6, th});
            }
            pgh.m(th, "dataPtrGetMd5Processor failed");
            return "";
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.lang.String] */
        @Override // tb.hr6
        public String e(byte[] bArr, Void r6) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7b9ded47", new Object[]{this, bArr, r6});
            }
            return fua.c(bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class e extends hr6<Object, byte[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/deploy/FBTemplateDecider$15");
        }

        @Override // tb.hr6
        public Object a(File file, byte[] bArr) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c2b7697", new Object[]{this, file, bArr});
            }
            throw new RuntimeException("Unsupported, sorry");
        }

        @Override // tb.hr6
        public Object c(String str, byte[] bArr) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, bArr});
            }
            throw new RuntimeException("Unsupported behavior");
        }

        @Override // tb.hr6
        public Object d(String str, byte[] bArr, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("5a0a24eb", new Object[]{this, str, bArr, th});
            }
            pgh.m(th, "dataPtrDecryptProcessor failed");
            return new byte[0];
        }

        @Override // tb.hr6
        public Object e(byte[] bArr, byte[] bArr2) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7b9ded47", new Object[]{this, bArr, bArr2});
            }
            byte[] bArr3 = bArr2;
            try {
                Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
                instance.init(2, new SecretKeySpec(bArr3, "AES"));
                return instance.doFinal(bArr);
            } catch (Throwable th) {
                pgh.m(th, "error while aes");
                return null;
            }
        }
    }

    static {
        try {
            Platform.i();
        } catch (Throwable unused) {
        }
        f4986a = new HashMap();
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
        d = new c();
        e = new d();
        f = new e();
    }

    public FBTemplateDecider(String str, tu8 tu8Var) {
        AppContextHolder.feedAppContext(tu8Var.a());
        saa.a();
        eng.a();
        this.h = str;
        this.i = tu8Var;
        this.j = createNativeDecider(str, tu8Var.c(), this);
    }

    public static FBTemplateContent a(String str, String str2) {
        FBTemplateContent fBTemplateContent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateContent) ipChange.ipc$dispatch("3d90d583", new Object[]{str, str2});
        }
        if (AppContextHolder.b && (fBTemplateContent = b.get(ConnectionUtils.a(str2, str))) != null) {
            try {
                return FBTemplateContent.fromJSONObject(FBFullTplInfo.toJSONObject(fBTemplateContent));
            } catch (Exception e2) {
                pgh.g("_getOverrideForTools: exception", e2);
            }
        }
        return null;
    }

    public static native void basicDownloadTplByTplInfo(long j, String str, FBTemplateDeciderTemplateModelCallback fBTemplateDeciderTemplateModelCallback);

    public static native void basicGetTemplateByTplInfo(long j, String str, int i, FBTemplateDeciderTemplateModelCallback fBTemplateDeciderTemplateModelCallback);

    public static /* synthetic */ void c(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{new Long(j), new Long(j2)});
            return;
        }
        pgh.i("Decider", "dispatchCoreTak: 2 " + j + ", " + j2);
        nativeCallDeployCoreFuncPtr(j, j2);
    }

    private static void callRpc(long j, long j2, FBTemplateDecider fBTemplateDecider, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9827de", new Object[]{new Long(j), new Long(j2), fBTemplateDecider, str, str2, str3});
        } else if (jst.b()) {
            pgh.e("Decider", "callRpc on main thread");
            returnCallRpcResult(j, j2, null, null, "callRpc on main thread");
        } else {
            try {
                if (TextUtils.isEmpty(str)) {
                    pgh.p("missing op_type");
                }
                IpChange ipChange2 = Platform.$ipChange;
                returnCallRpcResult(j, j2, new JSONObject(new HashMap()).toString(), "", null);
            } catch (Throwable th) {
                pgh.f("Decider", "callRpc error", th);
                returnCallRpcResult(j, j2, null, null, "caught exception");
            }
        }
    }

    private static void clearPackageCache(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af654ae4", new Object[]{str, str2});
            return;
        }
        try {
            String a2 = ConnectionUtils.a(str, str2, FBTemplateStorage$StorageType.DEFAULT);
            td9.k("fb__tpl_storage/pack", ConnectionUtils.b(a2));
            td9.l("fb__tpl_storage/pack", a2);
        } catch (Throwable th) {
            pgh.f("Decider", "clearPackageCache error", th);
        }
    }

    public static native long createNativeDecider(String str, String str2, FBTemplateDecider fBTemplateDecider);

    public static native String delayedGetWaitQueueTpls(long j);

    private static void deleteTemplates(FBTemplateDecider fBTemplateDecider, String str, int i, long j) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d45f552", new Object[]{fBTemplateDecider, str, new Integer(i), new Long(j)});
            return;
        }
        StringBuilder sb = new StringBuilder("C -> deleteTemplates on ");
        sb.append(fBTemplateDecider);
        sb.append(", tplIdsJoinedByComma=");
        sb.append(str);
        sb.append(", storageType=");
        sb.append(i);
        sb.append(" *cb=");
        IpChange ipChange2 = l2w.$ipChange;
        sb.append(Long.toHexString(j));
        pgh.h(sb.toString());
        jst.a();
        if (m(fBTemplateDecider) == null) {
            pgh.d("C -> deleteTemplates no options");
            returnDeleteTemplatesResult(j, 1);
            return;
        }
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str4 : split) {
            arrayList.add(FBSimpleTplInfo.a(str4));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FBSimpleTplInfo fBSimpleTplInfo = (FBSimpleTplInfo) it.next();
            try {
                pgh.h("C -> deleteTemplates removing " + fBSimpleTplInfo + " on " + i);
                synchronized (ConnectionUtils.class) {
                    td9.l("fb__tpl_storage", ConnectionUtils.a(fBTemplateDecider, fBSimpleTplInfo, ConnectionUtils.a(i)));
                }
            } catch (Exception e2) {
                if (fBSimpleTplInfo != null) {
                    str2 = fBSimpleTplInfo.b();
                } else {
                    str2 = "";
                }
                fBTemplateDecider.f(str2, "e:decider:cDelTplEx", "", e2.getMessage());
                StringBuilder sb2 = new StringBuilder("C -> deleteTemplates error while deleting ");
                if (fBSimpleTplInfo != null) {
                    str3 = fBSimpleTplInfo.b();
                } else {
                    str3 = "-null";
                }
                sb2.append(str3);
                pgh.g(sb2.toString(), e2);
            }
        }
        pgh.h("C -> deleteTemplates all done, returning to *cb=" + Long.toHexString(j));
        returnDeleteTemplatesResult(j, 0);
    }

    private static void dispatchDeployCoreTask(int i, FBTemplateDecider fBTemplateDecider, final long j, final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d90469", new Object[]{new Integer(i), fBTemplateDecider, new Long(j), new Long(j2)});
            return;
        }
        pgh.i("Decider", "dispatchCoreTask: get " + i + ", " + j + ", " + j2);
        if (i != 2) {
            pgh.e("Decider", "dispatchCoreTask: unknown type " + i);
            return;
        }
        jst.b.submit(new Runnable() { // from class: tb.nu8
            @Override // java.lang.Runnable
            public final void run() {
                FBTemplateDecider.c(j, j2);
            }
        });
    }

    private static void downloadCdnFile(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70cd172", new Object[]{str, new Long(j), new Long(j2)});
            return;
        }
        StringBuilder sb = new StringBuilder("C -> downloadCdnFile url ");
        sb.append(str);
        sb.append(" *cb=");
        IpChange ipChange2 = l2w.$ipChange;
        sb.append(Long.toHexString(j));
        sb.append(" *task=");
        sb.append(Long.toHexString(j2));
        pgh.h(sb.toString());
        jst.a();
        pgh.b("Decider", "C -> downloadCdnFile url appended result " + str);
        com.flybird.deploy.a.b(str, new b(j, j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void downloadTemplate(com.flybird.deploy.FBTemplateDecider r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, long r27, long r29, long r31, boolean r33) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.deploy.FBTemplateDecider.downloadTemplate(com.flybird.deploy.FBTemplateDecider, java.lang.String, java.lang.String, java.lang.String, int, long, long, long, boolean):void");
    }

    public static native void enhancedGetTemplateByTplInfo(long j, String str, FBTemplateDeciderTemplateModelCallback fBTemplateDeciderTemplateModelCallback);

    private static void exceptionLog(FBTemplateDecider fBTemplateDecider, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a080762", new Object[]{fBTemplateDecider, str, str2});
            return;
        }
        try {
            tu8 m = m(fBTemplateDecider);
            if (m == null) {
                pgh.d("C -> exceptionLog missing decider");
                return;
            }
            uu8 e2 = m.e();
            if (e2 == null) {
                pgh.d("C -> exceptionLog no listener");
                return;
            }
            pgh.d("C -> exceptionLog err: " + str + " " + str2 + " on " + fBTemplateDecider);
            e2.onError(str, str2);
        } catch (Throwable th) {
            pgh.g("C -> exceptionLog ex when error log", th);
        }
    }

    private static Object fileDataPtrDecrypt(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ba1820", new Object[]{obj, str});
        }
        try {
            return f.b(obj, str.getBytes("UTF-8"));
        } catch (Throwable th) {
            pgh.f("Decider", "fileDataPtrDecrypt error", th);
            return null;
        }
    }

    private static String fileDataPtrGetMd5(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ae19a2d", new Object[]{obj});
        }
        try {
            return e.b(obj, null);
        } catch (Exception e2) {
            pgh.f("Decider", "error on fileDataPtrGetMd5", e2);
            return null;
        }
    }

    private static String fileDataPtrToChars(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c367dde3", new Object[]{obj});
        }
        try {
            return d.b(obj, null);
        } catch (Exception unused) {
            return "";
        }
    }

    private static void forceDownloadShouldRetry(FBTemplateDecider fBTemplateDecider, FBTemplateDeciderTemplateModelCallback fBTemplateDeciderTemplateModelCallback, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb92197", new Object[]{fBTemplateDecider, fBTemplateDeciderTemplateModelCallback, new Long(j), new Long(j2)});
            return;
        }
        StringBuilder sb = new StringBuilder("C -> forceDownloadShouldRetry on ");
        sb.append(fBTemplateDecider);
        sb.append(" *task=");
        IpChange ipChange2 = l2w.$ipChange;
        sb.append(Long.toHexString(j));
        sb.append(" *cb=");
        sb.append(j2);
        pgh.h(sb.toString());
        jst.a();
        tu8 m = m(fBTemplateDecider);
        if (m == null) {
            pgh.d("C -> forceDownloadShouldRetry check failed");
            returnForceDownloadShouldRetry(j, j2, false);
        } else if (fBTemplateDeciderTemplateModelCallback == null) {
            pgh.d("C -> forceDownloadShouldRetry check failed 2");
            returnForceDownloadShouldRetry(j, j2, false);
        } else {
            m.f().askUserShouldRetry(new a(j, j2), fBTemplateDeciderTemplateModelCallback.f4995a);
        }
    }

    public static native boolean freeNativeDecider(long j);

    public static boolean g(FBTemplateContent fBTemplateContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("186b5815", new Object[]{fBTemplateContent})).booleanValue();
        }
        Pair a2 = uca.a("App:PackageInfo");
        if (((Boolean) a2.first).booleanValue()) {
            String str = ((PackageInfo) a2.second).versionName;
            boolean equals = TextUtils.equals(fBTemplateContent.getNoBundledCheckedPkgVer(), str);
            pgh.h("C -> _updateValidVersion local version " + str + ", returning " + equals);
            return equals;
        }
        pgh.d("C -> _updateValidVersion failed to get pkg info");
        return false;
    }

    private static Object[] getBundleTpl(FBTemplateDecider fBTemplateDecider, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("b3e523a6", new Object[]{fBTemplateDecider, str, str2});
        }
        pgh.h("C -> getBundleTpl on " + fBTemplateDecider + ", tplId=" + str + ", tplInfo=" + str2);
        jst.a();
        Object[] objArr = new Object[2];
        tu8 m = m(fBTemplateDecider);
        if (m == null) {
            pgh.p("C -> getBundleTpl missing options of " + fBTemplateDecider);
            return null;
        }
        k8u c2 = ConnectionUtils.c(str);
        if (c2.f22480a == null) {
            m.c();
        }
        String str3 = c2.b;
        if (str3 == null) {
            str3 = fBTemplateDecider.h;
        }
        String str4 = c2.c;
        if (str4 == null || str3 == null) {
            pgh.p("C -> getBundleTpl missing pageid or bizid of " + fBTemplateDecider);
            return null;
        }
        String a2 = ConnectionUtils.a(str4, str3);
        pgh.h("C -> getBundleTpl filePath=" + a2);
        String readAssetsFile = FBTools.readAssetsFile(a2, m.a());
        pgh.h("C -> getBundleTpl tplContent length " + readAssetsFile.length() + " chars");
        try {
            if (!TextUtils.isEmpty(readAssetsFile)) {
                FBTemplateContent fromJsonString = FBTemplateContent.fromJsonString(readAssetsFile);
                objArr[0] = fromJsonString;
                objArr[1] = pt8.c(FBTemplateContent.toBasicTplInfo(fromJsonString));
                pgh.h("C -> getBundleTpl final content " + objArr[0] + ", info" + objArr[1]);
                return objArr;
            }
            pgh.d("C -> getBundleTpl cannot find tpl " + str + " on " + fBTemplateDecider);
            return null;
        } catch (Throwable th) {
            fBTemplateDecider.f(str, "e:decider:cGetBundleEx", "", th.getMessage());
            pgh.g("C -> getBundleTpl parse bundled tpl error of " + fBTemplateDecider, th);
            return null;
        }
    }

    private static String getBundleTplInfoFileContent(FBTemplateDecider fBTemplateDecider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1943070", new Object[]{fBTemplateDecider});
        }
        pgh.h("C -> getBundleTplInfoFileContent on " + fBTemplateDecider);
        jst.a();
        tu8 m = m(fBTemplateDecider);
        if (m == null) {
            pgh.p("C -> getBundleTplInfoFileContent missing options of " + fBTemplateDecider);
            return null;
        }
        String readAssetsFile = FBTools.readAssetsFile("template.info", m.a());
        pgh.h("C -> getBundleTplInfoFileContent content length " + readAssetsFile.length());
        return readAssetsFile;
    }

    private static Object getFileDataFromPackage(FBTemplateDecider fBTemplateDecider, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f212b0fb", new Object[]{fBTemplateDecider, str, str2, str3});
        }
        try {
            String b2 = ConnectionUtils.b(ConnectionUtils.a(str, str2, FBTemplateStorage$StorageType.DEFAULT));
            return td9.d("fb__tpl_storage/pack", b2 + File.separator + str3, false);
        } catch (Throwable th) {
            pgh.f("Decider", "getFileDataFromPackage error", th);
            return null;
        }
    }

    private static Object getJsPackageFile(String str, String str2, long j) {
        File d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d3767aac", new Object[]{str, str2, new Long(j)});
        }
        jst.a();
        try {
            synchronized (ConnectionUtils.class) {
                d2 = td9.d("fb__tpl_storage/js", ConnectionUtils.c(str, str2), true);
            }
            return d2;
        } catch (Throwable th) {
            pgh.f("Decider", "getJs error on run", th);
            return null;
        }
    }

    public static FBTemplateDecider i(String str, tu8 tu8Var) {
        FBTemplateDecider fBTemplateDecider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateDecider) ipChange.ipc$dispatch("8511debf", new Object[]{str, tu8Var});
        }
        pgh.h("_create identifier is " + str + " options is " + tu8Var);
        jst.a();
        Map<String, FBTemplateDecider> map = f4986a;
        synchronized (map) {
            try {
                synchronized (map) {
                    fBTemplateDecider = map.get(str);
                }
                return fBTemplateDecider;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (fBTemplateDecider != null) {
            pgh.h("_create identifier " + str + " already existed");
        } else {
            fBTemplateDecider = new FBTemplateDecider(str, tu8Var);
            map.put(str, fBTemplateDecider);
            pgh.h("_create identifier " + str + " created: " + fBTemplateDecider);
        }
        return fBTemplateDecider;
    }

    public static native void idleGetTplsToDownload(long j, boolean z, FBTemplateDeciderTemplateListModelCallback fBTemplateDeciderTemplateListModelCallback);

    private static boolean isTplModelValidVersionMatched(FBTemplateContent fBTemplateContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c1e9c19", new Object[]{fBTemplateContent})).booleanValue();
        }
        pgh.h("C -> isTplModelValidVersionMatched on " + fBTemplateContent);
        return g(fBTemplateContent);
    }

    public static FBTemplateDecider j(String str) {
        FBTemplateDecider fBTemplateDecider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateDecider) ipChange.ipc$dispatch("a979421", new Object[]{str});
        }
        Map<String, FBTemplateDecider> map = f4986a;
        synchronized (map) {
            fBTemplateDecider = map.get(str);
        }
        return fBTemplateDecider;
    }

    public static String k(FBTemplateDecider fBTemplateDecider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2eb16fcf", new Object[]{fBTemplateDecider});
        }
        if (fBTemplateDecider == null) {
            return null;
        }
        fBTemplateDecider.b();
        return fBTemplateDecider.h;
    }

    private static void logPackageDownloadTask(FBTemplateDecider fBTemplateDecider, Object obj, int i, int i2, String str, String str2, String str3, String str4, long j) {
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7917fad8", new Object[]{fBTemplateDecider, obj, new Integer(i), new Integer(i2), str, str2, str3, str4, new Long(j)});
            return;
        }
        if (i == 0 && obj == null) {
            i = 3999;
        }
        HashMap hashMap = new HashMap(16);
        hashMap.put("deploy_type", String.valueOf(i2));
        hashMap.put("packageName", str);
        hashMap.put("packageHash", str2);
        hashMap.put("packageUrl", str3);
        hashMap.put("filePath", str4);
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(j));
        hashMap.put("resultCode", String.valueOf(i));
        if (fBTemplateDecider != null) {
            fBTemplateDecider.b();
            str5 = fBTemplateDecider.h;
        } else {
            str5 = "";
        }
        hashMap.put("bizCode", str5);
        try {
            str6 = ConnectionUtils.a(AppContextHolder.f5004a);
        } catch (Throwable unused) {
            str6 = "err";
        }
        hashMap.put("netType", str6);
        Platform.a("10101082", hashMap);
    }

    public static tu8 m(FBTemplateDecider fBTemplateDecider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tu8) ipChange.ipc$dispatch("795c6d27", new Object[]{fBTemplateDecider});
        }
        if (fBTemplateDecider == null) {
            return null;
        }
        fBTemplateDecider.b();
        return fBTemplateDecider.i;
    }

    public static native void makeTemplateUpdateExceptionLog(long j, String str, String str2);

    public static native void nativeAcquireMetaInfoFile(long j, String str, FBTemplateDeciderSingleFileModelCallback fBTemplateDeciderSingleFileModelCallback);

    public static native void nativeCallDeployCoreFuncPtr(long j, long j2);

    public static native boolean nativeCheckHasTplInBundle(long j, String str);

    public static native FBTemplateContent nativeGetLocalTemplate(long j, String str, String str2, boolean z);

    public static native void nativePackAcquireAndGetFile(long j, String str, String str2, String str3, String str4, FBTemplateDeciderSingleFileModelCallback fBTemplateDeciderSingleFileModelCallback);

    private static void notifyDeciderTaskStatus(FBTemplateDecider fBTemplateDecider, String str, String str2, int i, int i2) {
        vu8 g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4f9c05", new Object[]{fBTemplateDecider, str, str2, new Integer(i), new Integer(i2)});
            return;
        }
        pgh.h("C -> notifyDeciderTaskStatus on " + fBTemplateDecider + " for " + str + " " + str2 + " status " + i + " downloadMode " + i2);
        jst.a();
        tu8 m = m(fBTemplateDecider);
        if (m != null && (g = m.g()) != null) {
            pgh.h("C -> notifyDeciderTaskStatus sent " + g + " " + str + " " + str2 + " status " + i + " downloadMode " + i2);
            g.onStatusNotify(str, str2, i, i2);
        }
    }

    public static native void returnCallRpcResult(long j, long j2, String str, String str2, String str3);

    public static native void returnDeleteTemplatesResult(long j, int i);

    public static native void returnDownloadCdnFileResult(long j, long j2, int i, byte[] bArr);

    public static native void returnDownloadTemplateResult(long j, long j2, long j3, FBTemplateContent fBTemplateContent, int i);

    public static native void returnForceDownloadShouldRetry(long j, long j2, boolean z);

    public static native void returnPackSaveResult(long j, long j2, int i);

    public static native void returnSaveTemplatesResult(long j, int i);

    private static void saveTemplates(FBTemplateDecider fBTemplateDecider, FBTemplateContent[] fBTemplateContentArr, int i, long j) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("524b0c6a", new Object[]{fBTemplateDecider, fBTemplateContentArr, new Integer(i), new Long(j)});
            return;
        }
        StringBuilder sb = new StringBuilder("C -> saveTemplates on ");
        sb.append(fBTemplateDecider);
        sb.append(", models=");
        sb.append(Arrays.toString(fBTemplateContentArr));
        sb.append(", storageType=");
        sb.append(i);
        sb.append(" *cb=");
        IpChange ipChange2 = l2w.$ipChange;
        sb.append(Long.toHexString(j));
        pgh.h(sb.toString());
        jst.a();
        if (m(fBTemplateDecider) == null) {
            pgh.d("C -> saveTemplates no options");
            returnSaveTemplatesResult(j, 1);
            return;
        }
        for (FBTemplateContent fBTemplateContent : fBTemplateContentArr) {
            try {
                pgh.h("C -> saveTemplates saving " + fBTemplateContent + " to " + i);
                fBTemplateDecider.h(fBTemplateContent);
                ConnectionUtils.a(fBTemplateDecider, fBTemplateContent, i);
            } catch (Exception e2) {
                if (fBTemplateContent != null) {
                    str = fBTemplateContent.getTplId();
                } else {
                    str = "";
                }
                fBTemplateDecider.f(str, "e:decider:cSaveTplEx", "", e2.getMessage());
                StringBuilder sb2 = new StringBuilder("C -> saveTemplates error while writing ");
                if (fBTemplateContent != null) {
                    str2 = fBTemplateContent.getTplId();
                } else {
                    str2 = "-null";
                }
                sb2.append(str2);
                pgh.g(sb2.toString(), e2);
            }
        }
        pgh.h("C -> saveTemplates all done, returning to *cb=" + Long.toHexString(j));
        returnSaveTemplatesResult(j, 0);
    }

    private static void updateTplModelValidVersionSync(FBTemplateContent fBTemplateContent, FBTemplateDecider fBTemplateDecider, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a02e808", new Object[]{fBTemplateContent, fBTemplateDecider, new Integer(i)});
            return;
        }
        pgh.h("C -> updateTplModelValidVersionSync on " + fBTemplateContent);
        fBTemplateDecider.h(fBTemplateContent);
        try {
            ConnectionUtils.a(fBTemplateDecider, fBTemplateContent, i);
        } catch (Exception e2) {
            if (fBTemplateContent != null) {
                str = fBTemplateContent.getTplId();
            } else {
                str = "";
            }
            fBTemplateDecider.f(str, "e:decider:cValidUpdateEx", "", e2.getMessage());
            pgh.g("C -> updateTplModelValidVersionSync error while writing " + fBTemplateContent.getTplId(), e2);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.g != State.READY) {
            pgh.p("state of FBTemplateDecider is not ready");
        }
    }

    public final void e(String str, FBTemplateContent fBTemplateContent, boolean z, long j) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b739848b", new Object[]{this, str, fBTemplateContent, new Boolean(z), new Long(j)});
            return;
        }
        b();
        HashMap hashMap = new HashMap();
        b();
        hashMap.put("bizCode", this.h);
        if (z) {
            str2 = "T";
        } else {
            str2 = UTConstant.Args.UT_SUCCESS_F;
        }
        hashMap.put("success", str2);
        if (str == null) {
            str = "";
        }
        if (fBTemplateContent != null) {
            if (TextUtils.isEmpty(str)) {
                str = fBTemplateContent.getTplId();
            }
            String expId = fBTemplateContent.getExpId();
            if (!TextUtils.isEmpty(expId)) {
                str = str + "_" + expId;
            }
            hashMap.put("tpl_hash", fBTemplateContent.getTplHash());
            hashMap.put("tpl_trace", fBTemplateContent.getTplTrace());
        }
        if (fBTemplateContent != null) {
            hashMap.put("tpl_version", fBTemplateContent.getTplVersion());
            hashMap.put("time", fBTemplateContent.getTime());
        }
        hashMap.put("tpl_id", str);
        if (j != Long.MIN_VALUE) {
            hashMap.put("bd_renderTime", String.valueOf(j));
        }
        if (fBTemplateContent != null) {
            String optFromLocalMap = fBTemplateContent.optFromLocalMap("fb::deploy::log_time_cost_deploy_ms");
            if (!TextUtils.isEmpty(optFromLocalMap)) {
                hashMap.put("bd_tplDownloadTime", optFromLocalMap);
            }
        }
        Platform.a("10101041", hashMap);
    }

    public final void f(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        b();
        long j = this.j;
        makeTemplateUpdateExceptionLog(j, str2, str + "_" + str3 + "_" + str4);
    }

    public final void h(FBTemplateContent fBTemplateContent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17f4f212", new Object[]{this, fBTemplateContent});
            return;
        }
        Pair a2 = uca.a("App:PackageInfo");
        if (((Boolean) a2.first).booleanValue()) {
            String str2 = ((PackageInfo) a2.second).versionName;
            fBTemplateContent.setNoBundledCheckedPkgVer(str2);
            pgh.h("C -> _updateValidVersion version set to " + str2);
            return;
        }
        if (fBTemplateContent != null) {
            str = fBTemplateContent.getTplId();
        } else {
            str = "";
        }
        f(str, "e:decider:cValidUpdateNoInfo", "", "");
        pgh.d("C -> _updateValidVersion failed to get pkg info");
    }

    public void n(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2523b5c9", new Object[]{this, str, str2, str3, str4});
        } else {
            f(str, str2, str3, str4);
        }
    }

    public void o(String str, FBTemplateContent fBTemplateContent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfea9de", new Object[]{this, str, fBTemplateContent, new Boolean(z)});
        } else {
            e(str, fBTemplateContent, z, Long.MIN_VALUE);
        }
    }

    @Deprecated
    public void p(String str, FBTemplateContent fBTemplateContent, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5319a52f", new Object[]{this, str, fBTemplateContent, new Boolean(z), new Long(j)});
        } else {
            e(str, fBTemplateContent, z, j);
        }
    }

    public void q(com.flybird.deploy.model.a aVar, com.flybird.deploy.callback.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d24b6a5a", new Object[]{this, aVar, aVar2});
            return;
        }
        b();
        jst.a();
        jst.b.submit(new qu8(this, aVar, aVar2));
    }

    public void r(FBFullTplInfo fBFullTplInfo, com.flybird.deploy.model.b bVar, com.flybird.deploy.callback.a aVar) {
        FBTemplateContent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e0dac2", new Object[]{this, fBFullTplInfo, bVar, aVar});
            return;
        }
        pgh.h("_updateAndGetTplInfoEnhancedAsyncNonBlocking called on " + this + " tplId: " + fBFullTplInfo + " options: " + bVar);
        jst.a();
        b();
        pgh.o(fBFullTplInfo, "must have tpl info");
        a.C0245a aVar2 = new a.C0245a();
        String tplId = fBFullTplInfo.getTplId();
        aVar2.deploymentType = FBUpdatePolicy$DeploymentType.EnhancedDeployment;
        aVar2.requests.add(fBFullTplInfo);
        aVar2.customToken = bVar.b();
        aVar2.customInfo.a(bVar.a());
        if (AppContextHolder.b && (a2 = a(this.h, fBFullTplInfo.getTplId())) != null) {
            try {
                aVar.onSuccess(Collections.singletonList(a2), aVar2);
                return;
            } catch (Throwable th) {
                pgh.g("_updateAndGetTplInfoEnhancedAsyncNonBlocking err", th);
            }
        }
        try {
            enhancedGetTemplateByTplInfo(this.j, FBFullTplInfo.toJSONString(fBFullTplInfo), new pu8(this, aVar2, tplId, fBFullTplInfo, aVar));
        } catch (Throwable th2) {
            aVar2.errors.add(th2);
            f(tplId, "e:decider:enhanceOverallEx", "", th2.getMessage());
            pgh.g("_updateAndGetTplInfoEnhancedAsync failed on " + this + " tplId: " + fBFullTplInfo + " callback ctx: " + aVar2, th2);
            d(null, aVar2);
            aVar.onFailure(aVar2);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("FBTemplateDecider{state=");
        sb.append(this.g);
        sb.append(", identifier='");
        sb.append(this.h);
        sb.append("', ptrNativeDecider=");
        long j = this.j;
        IpChange ipChange2 = l2w.$ipChange;
        sb.append(Long.toHexString(j));
        sb.append('}');
        return sb.toString();
    }

    private static boolean hasJsPackageFile(String str, String str2, long j) {
        boolean exists;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a5ef98e", new Object[]{str, str2, new Long(j)})).booleanValue();
        }
        jst.a();
        try {
            synchronized (ConnectionUtils.class) {
                String c2 = ConnectionUtils.c(str, str2);
                jst.a();
                exists = td9.m("fb__tpl_storage/js", c2).exists();
            }
            return exists;
        } catch (Throwable th) {
            pgh.f("Decider", "hasJs error on run", th);
            return false;
        }
    }

    private static void saveJsPackageFile(String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce3d87e", new Object[]{str, str2, bArr});
            return;
        }
        jst.a();
        try {
            synchronized (ConnectionUtils.class) {
                td9.c("fb__tpl_storage/js", ConnectionUtils.c(str, str2), bArr, true);
            }
        } catch (Throwable th) {
            pgh.f("Decider", "saveJs error on run", th);
        }
    }

    private static void savePackFile(FBTemplateDecider fBTemplateDecider, String str, String str2, Object obj, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56816fdb", new Object[]{fBTemplateDecider, str, str2, obj, new Long(j), new Long(j2)});
            return;
        }
        try {
            ConnectionUtils.a(str, str2, obj);
            returnPackSaveResult(j, j2, 0);
        } catch (Throwable th) {
            pgh.f("Decider", "savePackFile error", th);
            returnPackSaveResult(j, j2, cpr.MSG_TYPE_MEDIADATA);
        }
    }

    public final void d(FBTemplateContent fBTemplateContent, a.C0245a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        com.flybird.deploy.callback.b d2;
        FBUpdatePolicy$DeploymentType fBUpdatePolicy$DeploymentType;
        FBFullTplInfo fBFullTplInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c3b6604", new Object[]{this, fBTemplateContent, aVar});
        } else if (aVar == null || aVar.hasUpdated) {
            HashMap hashMap = new HashMap();
            b();
            hashMap.put("bizCode", this.h);
            String str7 = "";
            if (fBTemplateContent == null) {
                if (aVar != null && !aVar.requests.isEmpty()) {
                    IFBTplInfo iFBTplInfo = (IFBTplInfo) aVar.requests.get(0);
                    if (iFBTplInfo instanceof FBSimpleTplInfo) {
                        str = ((FBSimpleTplInfo) iFBTplInfo).b();
                    } else if (iFBTplInfo instanceof pt8) {
                        str = ((pt8) iFBTplInfo).a();
                    } else if (iFBTplInfo instanceof FBFullTplInfo) {
                        str = ((FBFullTplInfo) iFBTplInfo).getTplId();
                    }
                }
                str = str7;
            } else if (!TextUtils.isEmpty(fBTemplateContent.getExpId())) {
                str = fBTemplateContent.getTplId() + "_" + fBTemplateContent.getExpId();
            } else {
                str = fBTemplateContent.getTplId();
            }
            hashMap.put("tpl_id", str);
            if (aVar == null || aVar.locals.isEmpty() || (fBFullTplInfo = (FBFullTplInfo) aVar.locals.get(0)) == null) {
                str3 = str7;
                str2 = str3;
            } else {
                str2 = fBFullTplInfo.getTplVersion();
                str3 = fBFullTplInfo.getTime();
            }
            String str8 = "NULL";
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                str4 = TLogTracker.LEVEL_DEBUG;
                str5 = str8;
            } else {
                str5 = str2.replaceAll("\\.", str7) + str3;
                str4 = "U";
            }
            String str9 = UTConstant.Args.UT_SUCCESS_F;
            if (aVar != null && aVar.isForceUpdated) {
                str4 = str9;
            }
            hashMap.put("local_version", str5);
            hashMap.put(HiAnalyticsConstant.BI_KEY_UPDATE_TYPE, str4);
            if (fBTemplateContent != null && !TextUtils.isEmpty(fBTemplateContent.getTplVersion())) {
                str8 = fBTemplateContent.getTplVersion().replaceAll("\\.", str7) + fBTemplateContent.getTime();
            }
            hashMap.put("version", str8);
            try {
                str6 = ConnectionUtils.a(AppContextHolder.f5004a);
            } catch (Throwable unused) {
                str6 = "err";
            }
            hashMap.put("netType", str6);
            if (!(fBTemplateContent == null || aVar == null || aVar.successRequests.isEmpty())) {
                str9 = "T";
            }
            hashMap.put(UTConstant.Args.UT_PROPERTY_SUCCESS, str9);
            hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, aVar != null ? String.valueOf(aVar.costTimeMillis) : str7);
            hashMap.put("flow_type", fBTemplateContent != null ? fBTemplateContent.optFromLocalMap("fb::deploy::log_update_flow_type") : str7);
            hashMap.put("needRender", aVar != null ? aVar.customInfo.getPreDefEntry("fb::deploy::log_need_render") : str7);
            hashMap.put("deploy_type", (aVar == null || (fBUpdatePolicy$DeploymentType = aVar.deploymentType) == null) ? str7 : fBUpdatePolicy$DeploymentType.inEventLogValue);
            if (aVar != null) {
                str7 = String.valueOf(aVar.updateSource);
            }
            hashMap.put("update_source", str7);
            b();
            tu8 tu8Var = this.i;
            if (!(tu8Var == null || (d2 = tu8Var.d()) == null)) {
                try {
                    d2.handleLogMap(new HashMap<>(hashMap), aVar);
                } catch (Throwable th) {
                    pgh.g("error on handle cashier log", th);
                }
            }
            Platform.a("10101042", hashMap);
        }
    }

    private static String getContentWithVerify(byte[] bArr) {
        Object obj;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70c8af10", new Object[]{bArr});
        }
        StringBuilder sb = new StringBuilder("C -> getContentWithVerify ");
        if (bArr != null) {
            obj = Integer.valueOf(bArr.length);
        } else {
            obj = "null";
        }
        sb.append(obj);
        sb.append("bytes");
        pgh.h(sb.toString());
        if (bArr == null) {
            return null;
        }
        try {
            JSONObject d2 = ConnectionUtils.d(ConnectionUtils.b(ConnectionUtils.c(bArr)));
            String optString = d2.optString("c");
            String optString2 = d2.optString("s");
            int currentNetworkEnvironment = FBDocumentAssistor.getCurrentNetworkEnvironment();
            if (currentNetworkEnvironment == 0 || currentNetworkEnvironment == 1) {
                str = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmGXVAHIyf0O+kvhDKUSM4uWNP3/Gig7DVD1dwbTFWwZz7HpYcMulZRxY3iYgPrMeZ/B2AfTeq21H7MqZ/PwjZbGhq1/noRSXfG+KPo4vlnkTAwBQ+mr3PpuPqqZz9D6SRhq5lzoSynLoUUfQVvYDgnUVTnnq3EyqC/B1DpwQMuesemtvS2HYqJfmPRskyt8y/LbHhXLyX4NrdhB33SAdLSLafTSGpATfbV+v/i6HT9P9HLsGLT2ydxItjxEFu6DJfoe+U8vguBJpp/ftjxBuOzW2sWBVycfrybba1PWtd9U0ZHhMauJJ+1mp69wFr6c/DNegLdcDqa3Af9tGFN146wIDAQAB";
            } else {
                str = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhLHc2n1DzRk5DSXBnwvg+fMAWTOwy9k1XXmohc0xecbtaEEh47cquTLHGBgaL+MS87iBo5Wnx3ZsVNxE+GSJXU3gz9nVagNJJ8ncdgM3dRMj2m7+UrhWHGZcIJjCSi6r57eqb0desgq8xGkI5J3oGFZfX5h2EcWGuptisBwiS1xTe2CyiZA04Hga0CuijD2DTVdbIhrtF1U90GIE9UjRirHW+N+O4umNNNqVStyMnojNCYqLYtyRyOwTOwaYJr4vxKLFSF7uYOxfUM3Z9P44Fpx6s+6hXXRTVNSX6apud6k3vDHU+z2Yqro2IrNoIt9QB/k1fmRbg2hze26oaKPGTwIDAQAB";
            }
            byte[] a2 = ConnectionUtils.a(optString);
            byte[] decode = Base64.decode(optString2, 0);
            PublicKey generatePublic = KeyFactory.getInstance(man.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(generatePublic);
            instance.update(a2);
            boolean verify = instance.verify(decode);
            pgh.h("C -> getContentWithVerify signStr=" + optString2 + ", checkResult=" + verify);
            if (verify) {
                return optString;
            }
            pgh.d("check sign: found mismatch");
            return null;
        } catch (Throwable th) {
            pgh.g("C -> getContentWithVerify error while checking with content", th);
            return null;
        }
    }

    private static boolean hasPackageCache(FBTemplateDecider fBTemplateDecider, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c24283c7", new Object[]{fBTemplateDecider, str, str2})).booleanValue();
        }
        try {
            return ConnectionUtils.e(str, str2) != null;
        } catch (Throwable th) {
            pgh.f("Decider", "hasPackageCache error", th);
            return false;
        }
    }

    public FBTemplateContent l(FBSimpleTplInfo fBSimpleTplInfo) {
        FBTemplateContent a2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateContent) ipChange.ipc$dispatch("1f203f6d", new Object[]{this, fBSimpleTplInfo});
        }
        pgh.h("_getLocalTemplate for " + fBSimpleTplInfo + " on " + this);
        jst.a();
        b();
        pgh.o(fBSimpleTplInfo, "missing tpl info");
        String b2 = fBSimpleTplInfo.b();
        if (AppContextHolder.b && (a2 = a(this.h, b2)) != null) {
            return a2;
        }
        try {
            b();
            tu8 tu8Var = this.i;
            String d2 = FBSimpleTplInfo.d(fBSimpleTplInfo);
            long j = this.j;
            if (tu8Var.b() != FBUpdatePolicy$DeploymentType.BasicDeployment) {
                z = false;
            }
            FBTemplateContent nativeGetLocalTemplate = nativeGetLocalTemplate(j, d2, b2, z);
            pgh.h("_getLocalTemplate for " + fBSimpleTplInfo + " on " + this);
            return nativeGetLocalTemplate;
        } catch (Exception e2) {
            f(b2, "e:decider:getLoc2Ex", "", e2.getMessage());
            pgh.g("_getLocalTemplate: exception", e2);
            return null;
        }
    }

    private static Object[] selectTemplate(FBTemplateDecider fBTemplateDecider, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("6e25c0cb", new Object[]{fBTemplateDecider, str, new Integer(i)});
        }
        jst.a();
        pgh.h("selectTemplate decider is " + fBTemplateDecider + " tplId is " + str + " tplId is " + str + " storageType is " + i);
        if (m(fBTemplateDecider) == null) {
            pgh.p("C -> selectTemplate no options" + fBTemplateDecider);
            return null;
        }
        Object[] objArr = new Object[3];
        try {
            FBTemplateContent a2 = ConnectionUtils.a(fBTemplateDecider, FBSimpleTplInfo.a(str), i);
            if (a2 == null) {
                objArr[0] = null;
                objArr[1] = null;
                objArr[2] = null;
                pgh.h("C -> selectTemplate cant find " + str + ", returning null");
            } else {
                objArr[0] = a2;
                objArr[1] = pt8.c(FBTemplateContent.toBasicTplInfo(a2));
                objArr[2] = a2.getTplId();
                pgh.h("C -> selectTemplate found " + str + " -> " + a2);
            }
        } catch (Exception e2) {
            fBTemplateDecider.f(str, "e:decider:cSelTplEx", "", e2.getMessage());
            pgh.g("C -> selectTemplate error", e2);
        }
        return objArr;
    }
}
