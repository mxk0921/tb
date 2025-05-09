package com.alibaba.ability.impl.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Environment;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.android.abilityidl.ability.AbsSharePannelAbility;
import com.taobao.android.abilityidl.ability.SharePannelQRResult;
import com.taobao.android.weex.WeexInstance;
import com.taobao.share.qrcode.ShareQRCodeTask;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.a0m;
import tb.ckf;
import tb.fq1;
import tb.hhi;
import tb.iih;
import tb.kdb;
import tb.ldb;
import tb.ppd;
import tb.q6x;
import tb.qpd;
import tb.rb;
import tb.rjp;
import tb.rpd;
import tb.sjp;
import tb.sm8;
import tb.t2o;
import tb.tjp;
import tb.v3i;
import tb.xx4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class SharePannelAbility extends AbsSharePannelAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(132120579);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qpd f2028a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public b(qpd qpdVar, String str, String str2) {
            this.f2028a = qpdVar;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f2028a.O(new ErrorResult(this.b, this.c, (Map) null, 4, (a07) null));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rpd f2029a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public c(rpd rpdVar, String str, String str2) {
            this.f2029a = rpdVar;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f2029a.O(new ErrorResult(this.b, this.c, (Map) null, 4, (a07) null));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements ShareBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ppd f2030a;

        public d(ppd ppdVar) {
            this.f2030a = ppdVar;
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onFinished(Map<String, String> map) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff43b50d", new Object[]{this, map});
                return;
            }
            if (map == null || (str = map.get("platform")) == null) {
                str = "unknown";
            }
            String str2 = map != null ? map.get(rb.RESULT_KEY) : null;
            if (str2 != null) {
                int hashCode = str2.hashCode();
                if (hashCode != -1867169789) {
                    if (hashCode != -1367724422) {
                        if (hashCode == 3135262 && str2.equals("fail")) {
                            this.f2030a.onFail(str);
                        }
                    } else if (str2.equals("cancel")) {
                        this.f2030a.onCancel(str);
                    }
                } else if (str2.equals("success")) {
                    this.f2030a.onSuccess(str);
                }
            }
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onShare(ShareContent shareContent, ShareTargetType shareTargetType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a481375", new Object[]{this, shareContent, shareTargetType});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e implements ShareQRCodeTask.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ qpd b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ String b;

            public a(String str) {
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                SharePannelQRResult sharePannelQRResult = new SharePannelQRResult();
                sharePannelQRResult.qrImage = this.b;
                e.this.b.l1(sharePannelQRResult);
            }
        }

        public e(qpd qpdVar) {
            this.b = qpdVar;
        }

        @Override // com.taobao.share.qrcode.ShareQRCodeTask.a
        public final void a(int i, Bitmap bitmap, boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5840d252", new Object[]{this, new Integer(i), bitmap, new Boolean(z), str});
                return;
            }
            iih iihVar = iih.INSTANCE;
            iihVar.a("SharePannelAbility", "requestShortLinkQRCode, generateCallBack, code=" + i + ", bitmap=" + bitmap + ", shareDisableQRCode=" + z + ", url=" + str);
            if (bitmap == null) {
                SharePannelAbility.access$handleRequestQRCodeError(SharePannelAbility.this, TaobaoConstants.DEVICETOKEN_ERROR, "bitmap is null", this.b);
                return;
            }
            String a2 = fq1.INSTANCE.a(bitmap);
            bitmap.recycle();
            if (a2 == null || a2.length() == 0) {
                SharePannelAbility.access$handleRequestQRCodeError(SharePannelAbility.this, "505", "base64 is null or empty", this.b);
            } else {
                MegaUtils.A(new a(a2), 0L, 2, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ kdb b;
        public final /* synthetic */ rpd c;
        public final /* synthetic */ Bitmap d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    f.this.c.onFinish();
                }
            }
        }

        public f(kdb kdbVar, rpd rpdVar, Bitmap bitmap) {
            this.b = kdbVar;
            this.c = rpdVar;
            this.d = bitmap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
            Context context = this.b.l().getContext();
            if (externalStoragePublicDirectory == null || context == null) {
                SharePannelAbility.access$handleSaveImageError(SharePannelAbility.this, "501", "file is null or context is null", this.c);
                this.d.recycle();
                return;
            }
            String c = hhi.c(true, this.d, externalStoragePublicDirectory, context, Boolean.FALSE, false);
            iih iihVar = iih.INSTANCE;
            iihVar.a("SharePannelAbility", "saveBitmap, filePath=" + c);
            this.d.recycle();
            if (c == null || c.length() == 0) {
                SharePannelAbility.access$handleSaveImageError(SharePannelAbility.this, "501", "filePath is null or empty", this.c);
            } else {
                MegaUtils.A(new a(), 0L, 2, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ rpd b;

        public g(rpd rpdVar) {
            this.b = rpdVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SharePannelAbility.access$handleSaveImageError(SharePannelAbility.this, "500", "permission denied", this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ kdb b;
        public final /* synthetic */ tjp c;
        public final /* synthetic */ rpd d;

        public h(kdb kdbVar, tjp tjpVar, rpd rpdVar) {
            this.b = kdbVar;
            this.c = tjpVar;
            this.d = rpdVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SharePannelAbility.access$saveLongScreenShot(SharePannelAbility.this, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class i implements q6x.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ rpd b;
        public final /* synthetic */ kdb c;

        public i(rpd rpdVar, kdb kdbVar) {
            this.b = rpdVar;
            this.c = kdbVar;
        }

        @Override // tb.q6x.b
        public final void a(Bitmap bitmap, int i, int i2, double d, double d2, double d3, double d4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f6d3284", new Object[]{this, bitmap, new Integer(i), new Integer(i2), new Double(d), new Double(d2), new Double(d3), new Double(d4)});
                return;
            }
            iih iihVar = iih.INSTANCE;
            iihVar.a("SharePannelAbility", "saveLongScreenShot, onSnapshot, bitmap=" + bitmap + ", width=" + i + ", height=" + i2 + ", rectX=" + d + ", rectY=" + d2 + ", rectWidth=" + d3 + ", rectHeight=" + d4);
            if (bitmap == null) {
                SharePannelAbility.access$handleSaveImageError(SharePannelAbility.this, "503", "bitmap is null", this.b);
            } else {
                SharePannelAbility.access$saveBitmap(SharePannelAbility.this, this.c, bitmap, this.b);
            }
        }
    }

    static {
        t2o.a(132120578);
    }

    public static final /* synthetic */ void access$handleRequestQRCodeError(SharePannelAbility sharePannelAbility, String str, String str2, qpd qpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1750ff1", new Object[]{sharePannelAbility, str, str2, qpdVar});
        } else {
            sharePannelAbility.a(str, str2, qpdVar);
        }
    }

    public static final /* synthetic */ void access$handleSaveImageError(SharePannelAbility sharePannelAbility, String str, String str2, rpd rpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a38b442", new Object[]{sharePannelAbility, str, str2, rpdVar});
        } else {
            sharePannelAbility.b(str, str2, rpdVar);
        }
    }

    public static final /* synthetic */ void access$saveBitmap(SharePannelAbility sharePannelAbility, kdb kdbVar, Bitmap bitmap, rpd rpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e977cdd", new Object[]{sharePannelAbility, kdbVar, bitmap, rpdVar});
        } else {
            sharePannelAbility.c(kdbVar, bitmap, rpdVar);
        }
    }

    public static final /* synthetic */ void access$saveLongScreenShot(SharePannelAbility sharePannelAbility, kdb kdbVar, tjp tjpVar, rpd rpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ecb2f3e", new Object[]{sharePannelAbility, kdbVar, tjpVar, rpdVar});
        } else {
            sharePannelAbility.d(kdbVar, tjpVar, rpdVar);
        }
    }

    public static /* synthetic */ Object ipc$super(SharePannelAbility sharePannelAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/share/SharePannelAbility");
    }

    public final void a(String str, String str2, qpd qpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7d8192", new Object[]{this, str, str2, qpdVar});
            return;
        }
        iih iihVar = iih.INSTANCE;
        iihVar.a("SharePannelAbility", "handleRequestQRCodeError, errorCode=" + str + ", errorMessage=" + str2);
        MegaUtils.A(new b(qpdVar, str, str2), 0L, 2, null);
    }

    public final void b(String str, String str2, rpd rpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb47145", new Object[]{this, str, str2, rpdVar});
            return;
        }
        iih iihVar = iih.INSTANCE;
        iihVar.a("SharePannelAbility", "handleSaveImageError, errorCode=" + str + ", errorMessage=" + str2);
        MegaUtils.A(new c(rpdVar, str, str2), 0L, 2, null);
    }

    public final void c(kdb kdbVar, Bitmap bitmap, rpd rpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f76aec", new Object[]{this, kdbVar, bitmap, rpdVar});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new f(kdbVar, rpdVar, bitmap));
        }
    }

    public final void d(kdb kdbVar, tjp tjpVar, rpd rpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe295d55", new Object[]{this, kdbVar, tjpVar, rpdVar});
            return;
        }
        ldb a2 = kdbVar.a();
        WeexInstance weexInstance = null;
        if (!ckf.b(a2 != null ? a2.getNamespace() : null, "weex")) {
            b("502", "namespace is not weex", rpdVar);
            return;
        }
        Object userContext = kdbVar.getUserContext();
        if (!(userContext instanceof Map)) {
            userContext = null;
        }
        Map map = (Map) userContext;
        if (map == null) {
            b("502", "userContext is null", rpdVar);
            return;
        }
        Object obj = map.get("instance");
        if (obj instanceof WeexInstance) {
            weexInstance = obj;
        }
        WeexInstance weexInstance2 = weexInstance;
        if (weexInstance2 == null) {
            b("502", "weexInstance is null", rpdVar);
            return;
        }
        q6x q6xVar = (q6x) weexInstance2.getExtend(q6x.class);
        if (q6xVar == null) {
            b("502", "unicornExt is null", rpdVar);
            return;
        }
        String str = tjpVar.b;
        Map<String, ? extends Object> map2 = tjpVar.c;
        iih.INSTANCE.a("SharePannelAbility", "saveLongScreenShot, snapshotID=" + str + ", longScreenShotOptions=" + map2);
        try {
            q6xVar.i(str, map2, new i(rpdVar, kdbVar));
        } catch (Throwable th) {
            iih.INSTANCE.a("SharePannelAbility", "saveLongScreenShot, t=".concat(sm8.b(th)));
            b("503", "catch throwable, message=" + th.getMessage(), rpdVar);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSharePannelAbility
    public void open(kdb kdbVar, rjp rjpVar, ppd ppdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f2a0af", new Object[]{this, kdbVar, rjpVar, ppdVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(rjpVar, "params");
        ckf.g(ppdVar, "events");
        Context context = kdbVar.l().getContext();
        LinkedHashMap linkedHashMap = null;
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            ShareContent shareContent = new ShareContent();
            shareContent.businessId = rjpVar.f27426a;
            shareContent.title = rjpVar.c;
            shareContent.description = rjpVar.d;
            shareContent.imageUrl = rjpVar.e;
            shareContent.url = rjpVar.b;
            shareContent.templateParams = rjpVar.f;
            Map<String, ? extends Object> map = rjpVar.g;
            if (map != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(v3i.e(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    linkedHashMap2.put(key, value != null ? value.toString() : null);
                }
                linkedHashMap = linkedHashMap2;
            }
            shareContent.extendParams = linkedHashMap;
            d dVar = new d(ppdVar);
            List<String> list = rjpVar.h;
            if (list != null) {
                ShareBusiness.share(activity, new ArrayList(list), shareContent, dVar);
            } else {
                ShareBusiness.share(activity, shareContent, dVar);
            }
        } else {
            ppdVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSharePannelAbility
    public void requestShortLinkQRCode(kdb kdbVar, sjp sjpVar, qpd qpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d55802", new Object[]{this, kdbVar, sjpVar, qpdVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(sjpVar, "qrParams");
        ckf.g(qpdVar, "requestQREvents");
        String str = sjpVar.f28093a;
        ckf.f(str, "qrParams.platform");
        String str2 = sjpVar.b;
        ckf.f(str2, "qrParams.qrType");
        String str3 = sjpVar.c;
        ckf.f(str3, "qrParams.qr4ScanOnly");
        iih iihVar = iih.INSTANCE;
        iihVar.a("SharePannelAbility", "requestShortLinkQRCode, platform=" + str + ", qrType=" + str2 + ", qr4ScanOnly=" + str3);
        try {
            new xx4(null).e(str, str2, ckf.b(str3, "true"), new e(qpdVar));
        } catch (Exception e2) {
            iih.INSTANCE.a("SharePannelAbility", "requestShortLinkQRCode, e=".concat(sm8.b(e2)));
            a(TaobaoConstants.DEVICETOKEN_ERROR, "catch exception, message=" + e2.getMessage(), qpdVar);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSharePannelAbility
    public void saveImage(kdb kdbVar, tjp tjpVar, rpd rpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77ba1574", new Object[]{this, kdbVar, tjpVar, rpdVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(tjpVar, "saveImageParams");
        ckf.g(rpdVar, "saveImageEvents");
        String str = tjpVar.f28754a;
        ckf.f(str, "saveImageParams.type");
        iih.INSTANCE.a("SharePannelAbility", "saveImage, type=".concat(str));
        if (!ckf.b(str, "LONG_SCREENSHOT")) {
            return;
        }
        if (a0m.c()) {
            d(kdbVar, tjpVar, rpdVar);
            return;
        }
        Context context = kdbVar.l().getContext();
        if (context == null) {
            b("502", "context is null", rpdVar);
        } else {
            com.taobao.runtimepermission.a.c(context, a0m.a()).t("tb_share").x(true).w("当您存储图片时需要系统授权相册读写权限").z(new g(rpdVar)).A(new h(kdbVar, tjpVar, rpdVar)).m();
        }
    }
}
