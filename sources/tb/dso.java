package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.ScanFromEnum;
import com.taobao.android.base.Versions;
import com.taobao.android.scancode.common.object.ScancodeResult;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.android.scancode.common.util.Scancode;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.barcode.business.GetMedicineUrlBussiness;
import com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.UrlRouter;
import com.taobao.taobao.scancode.gateway.util.UrlModifyAdapter;
import com.taobao.taobao.scancode.history.object.Product;
import com.taobao.taobao.scancode.history.object.ScanDo;
import com.taobao.taobao.scancode.history.object.ScanList;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import mtopsdk.common.util.SymbolExpUtil;
import tb.xs0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dso {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HISTORY_TYPE_BARCODE = 1;
    public static final int HISTORY_TYPE_EXPRESS = 4;
    public static final int HISTORY_TYPE_GEN3 = 3;
    public static final int HISTORY_TYPE_QRCODE = 2;
    public static final int HISTORY_TYPE_UNKNOWN_CODE = 5;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements xs0.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18044a;
        public final /* synthetic */ Product b;
        public final /* synthetic */ ScanDo c;
        public final /* synthetic */ Activity d;
        public final /* synthetic */ nmd e;
        public final /* synthetic */ Context f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f18045a;

            public a(String str) {
                this.f18045a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String str = b.this.f18044a;
                if (str == null || str.equals(this.f18045a) || TextUtils.isEmpty(this.f18045a) || this.f18045a.startsWith("alipays://")) {
                    b bVar = b.this;
                    dso.c(bVar.f18044a, bVar.b, bVar.c, bVar.d, bVar.e);
                    return;
                }
                try {
                    dso.d(b.this.c.getType(), b.this.f18044a);
                    b bVar2 = b.this;
                    yoj.b(bVar2.f, bVar2.e).d(this.f18045a);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        public b(String str, Product product, ScanDo scanDo, Activity activity, nmd nmdVar, Context context) {
            this.f18044a = str;
            this.b = product;
            this.c = scanDo;
            this.d = activity;
            this.e = nmdVar;
            this.f = context;
        }

        @Override // tb.xs0.b
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33557d00", new Object[]{this, str});
            } else {
                new Handler(Looper.getMainLooper()).post(new a(str));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements GetMedicineUrlBussiness.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f18046a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ ip1 c;
        public final /* synthetic */ ScanDo d;

        public c(Activity activity, Context context, ip1 ip1Var, ScanDo scanDo) {
            this.f18046a = activity;
            this.b = context;
            this.c = ip1Var;
            this.d = scanDo;
        }

        @Override // com.taobao.taobao.scancode.barcode.business.GetMedicineUrlBussiness.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89233c62", new Object[]{this});
                return;
            }
            LayoutInflater layoutInflater = this.f18046a.getLayoutInflater();
            Context context = this.b;
            qso.a(layoutInflater, context, context.getString(R.string.scancode_server_error));
        }

        @Override // com.taobao.taobao.scancode.barcode.business.GetMedicineUrlBussiness.c
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b49463b", new Object[]{this, str});
            } else {
                this.c.b(this.d.getLink(), 3, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements UrlRouter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f18047a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ nmd c;

        public d(Activity activity, Context context, nmd nmdVar) {
            this.f18047a = activity;
            this.b = context;
            this.c = nmdVar;
        }

        @Override // com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.UrlRouter.a
        public void onFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
            } else if (!this.f18047a.isFinishing()) {
                yoj.b(this.b, this.c).d(str);
            }
        }

        @Override // com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.UrlRouter.a
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
            } else if (!this.f18047a.isFinishing()) {
                yoj.b(this.b, this.c).d(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements UrlModifyAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f18048a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ nmd c;

        public e(Activity activity, Context context, nmd nmdVar) {
            this.f18048a = activity;
            this.b = context;
            this.c = nmdVar;
        }

        @Override // com.taobao.taobao.scancode.gateway.util.UrlModifyAdapter.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41c87a6f", new Object[]{this, str});
                return;
            }
            try {
                if (!this.f18048a.isFinishing()) {
                    yoj.b(this.b, this.c).d(str);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f18049a;
        public final /* synthetic */ ScanDo b;

        public f(Application application, ScanDo scanDo) {
            this.f18049a = application;
            this.b = scanDo;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/history/business/ScanHistoryBusiness$7");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            ScanList k = dso.k(this.f18049a);
            dso.e(k, this.b);
            dso.b(this.f18049a, k);
            return null;
        }
    }

    static {
        t2o.a(760217746);
    }

    public static /* synthetic */ void a(ScanList scanList, ScanDo scanDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d8a556", new Object[]{scanList, scanDo});
        } else {
            o(scanList, scanDo);
        }
    }

    public static /* synthetic */ boolean b(Application application, ScanList scanList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d827cc01", new Object[]{application, scanList})).booleanValue();
        }
        return s(application, scanList);
    }

    public static /* synthetic */ void c(String str, Product product, ScanDo scanDo, Activity activity, nmd nmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cfe040", new Object[]{str, product, scanDo, activity, nmdVar});
        } else {
            n(str, product, scanDo, activity, nmdVar);
        }
    }

    public static /* synthetic */ void d(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbb3a93", new Object[]{new Integer(i), str});
        } else {
            l(i, str);
        }
    }

    public static /* synthetic */ void e(ScanList scanList, ScanDo scanDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c098f5a", new Object[]{scanList, scanDo});
        } else {
            q(scanList, scanDo);
        }
    }

    public static void f(Application application, ScancodeResult scancodeResult, MaResult maResult, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d607d1f3", new Object[]{application, scancodeResult, maResult, new Boolean(z)});
        } else {
            new a(scancodeResult, maResult, z, application).execute(new Void[0]);
        }
    }

    public static void g(Application application, ScanDo scanDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8016a704", new Object[]{application, scanDo});
        } else if (scanDo != null) {
            new f(application, scanDo).execute(new Void[0]);
        }
    }

    public static void h(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2c6110b", new Object[]{application});
        } else {
            application.getSharedPreferences("ScanHistoryListDataPersistCacheKey", 0).edit().putString("ScanHistoryListDataPersistCacheKey", "").commit();
        }
    }

    public static void i(boolean z, Activity activity, ScanDo scanDo, com.taobao.taobao.scancode.gateway.util.a aVar, nmd nmdVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5b3b76", new Object[]{new Boolean(z), activity, scanDo, aVar, nmdVar});
        } else if (r(scanDo)) {
            j(z, activity, scanDo, nmdVar);
        } else {
            MaResult decodeResult = scanDo.getDecodeResult();
            ScancodeType n = rso.n(decodeResult);
            if (n != null) {
                m(n, scanDo.getLink());
            }
            if (tro.c(activity)) {
                str = ScanFromEnum.SYS_HISTORY.getScanFrom();
            } else {
                str = ScanFromEnum.PLT_HISTORY.getScanFrom();
            }
            if (rso.j()) {
                aVar.s(decodeResult, null, str);
            } else {
                aVar.q(activity, decodeResult, str);
            }
        }
    }

    public static ScanList k(Application application) {
        ScanList scanList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScanList) ipChange.ipc$dispatch("97f71e50", new Object[]{application});
        }
        qr2.a(application);
        String string = application.getSharedPreferences("ScanHistoryListDataPersistCacheKey", 0).getString("ScanHistoryListDataPersistCacheKey", "");
        if (!TextUtils.isEmpty(string)) {
            scanList = (ScanList) JSON.parseObject(string, ScanList.class);
        } else {
            y7t.a(rso.TAG, "load Cache cache data not exist");
            scanList = null;
        }
        if (scanList != null) {
            return scanList;
        }
        ScanList scanList2 = new ScanList();
        scanList2.setList(new ArrayList());
        return scanList2;
    }

    public static void m(ScancodeType scancodeType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ace7419", new Object[]{scancodeType, str});
        } else if (scancodeType != null && !TextUtils.isEmpty(str)) {
            TBS.Adv.ctrlClickedOnPage("HuoyanHistory", CT.Button, "HistoryClick", "content=" + str, "type=" + scancodeType.name().toLowerCase(Locale.getDefault()));
        }
    }

    public static void o(ScanList scanList, ScanDo scanDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e0432f", new Object[]{scanList, scanDo});
        } else if (scanList != null && scanList.getList() != null && scanDo != null) {
            new StringBuilder("insertScanHistoryDo ").append(JSON.toJSONString(scanDo));
            String link = scanDo.getLink();
            int i = 0;
            for (ScanDo scanDo2 : scanList.getList()) {
                if (link != null && link.equals(scanDo2.getLink())) {
                    break;
                }
                i++;
            }
            if (i < scanList.getList().size()) {
                scanList.getList().remove(i);
            }
            scanList.getList().add(0, scanDo);
            if (scanList.getList().size() > 24) {
                scanList.getList().remove(scanList.getList().size() - 1);
            }
        }
    }

    public static void p(Activity activity, String str, Product product, ScanDo scanDo, nmd nmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ceee03", new Object[]{activity, str, product, scanDo, nmdVar});
            return;
        }
        Application application = activity.getApplication();
        if (!new xs0(application).c(str, new b(str, product, scanDo, activity, nmdVar, application))) {
            n(str, product, scanDo, activity, nmdVar);
        }
    }

    public static void q(ScanList scanList, ScanDo scanDo) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb51bb1f", new Object[]{scanList, scanDo});
        } else if (scanList != null && scanList.getList() != null && scanDo != null) {
            String link = scanDo.getLink();
            for (ScanDo scanDo2 : scanList.getList()) {
                if (link != null && link.equals(scanDo2.getLink())) {
                    break;
                }
                i++;
            }
            if (i < scanList.getList().size()) {
                scanDo.setDecodeResult(scanList.getList().remove(i).getDecodeResult());
                scanList.getList().add(i, scanDo);
            }
        }
    }

    public static boolean r(ScanDo scanDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29fe8477", new Object[]{scanDo})).booleanValue();
        }
        if (scanDo.getType() != 1 && scanDo.getType() != 2) {
            return false;
        }
        if (scanDo.getDecodeResult() == null) {
            agh.h(rso.TAG, "decode result is null");
            return true;
        }
        agh.h(rso.TAG, "decode result exists");
        return rso.f();
    }

    public static boolean s(Application application, ScanList scanList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f584e8ff", new Object[]{application, scanList})).booleanValue();
        }
        application.getSharedPreferences("ScanHistoryListDataPersistCacheKey", 0).edit().putString("ScanHistoryListDataPersistCacheKey", JSON.toJSONString(scanList)).commit();
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScancodeResult f18043a;
        public final /* synthetic */ MaResult b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Application d;

        public a(ScancodeResult scancodeResult, MaResult maResult, boolean z, Application application) {
            this.f18043a = scancodeResult;
            this.b = maResult;
            this.c = z;
            this.d = application;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/history/business/ScanHistoryBusiness$1");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            agh.h(rso.TAG, "asyncInsertScanHistoryDoV2: scanResult=" + JSON.toJSONString(this.f18043a) + "\n, decodeResult=" + JSON.toJSONString(this.b));
            ScanDo scanDo = new ScanDo();
            ScancodeResult scancodeResult = this.f18043a;
            ScancodeType scancodeType = scancodeResult.type;
            if (scancodeType == ScancodeType.QR) {
                if (scancodeResult.code.contains("taobao.com")) {
                    scanDo.setImage(0);
                    scanDo.setTitle("淘宝网网址");
                } else if (this.f18043a.code.contains("tmall.com")) {
                    scanDo.setImage(3);
                    scanDo.setTitle("天猫网网址");
                } else if (this.f18043a.code.startsWith(h1p.HTTP_PREFIX) || this.f18043a.code.startsWith(h1p.HTTPS_PREFIX) || this.f18043a.code.startsWith("www.") || this.f18043a.code.startsWith("wap.")) {
                    scanDo.setImage(1);
                    scanDo.setTitle("二维码内容");
                } else {
                    scanDo.setImage(2);
                    scanDo.setTitle("文本");
                }
                scanDo.setType(2);
            } else if (scancodeType == ScancodeType.PRODUCT) {
                scanDo.setImage(1);
                scanDo.setTitle("商品条形码");
                scanDo.setType(1);
            } else if (scancodeType == ScancodeType.MEDICINE) {
                scanDo.setImage(1);
                scanDo.setTitle("药品条形码");
                scanDo.setType(1);
            } else if (scancodeType == ScancodeType.GEN3) {
                scanDo.setImage(0);
                scanDo.setTitle("淘宝网网址");
                scanDo.setType(3);
            } else if (scancodeType == ScancodeType.EXPRESS) {
                if (rso.d()) {
                    scanDo.setImage(1);
                    scanDo.setTitle("快递条形码");
                    scanDo.setType(4);
                }
            } else if (rso.k()) {
                scanDo.setImage(1);
                scanDo.setTitle("普通条形码");
                scanDo.setType(5);
            }
            if (!this.c && scanDo.getImage() != 2) {
                scanDo.setDesc("连接网络获取详情");
            }
            scanDo.setNetworkAvailable(this.c);
            scanDo.setLink(this.f18043a.code);
            scanDo.setTime(new Date().getTime());
            scanDo.setDecodeResult(this.b);
            ScanList k = dso.k(this.d);
            k.setNetworkAvailable(this.c);
            dso.a(k, scanDo);
            dso.b(this.d, k);
            return null;
        }
    }

    public static void j(boolean z, Activity activity, ScanDo scanDo, nmd nmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2404ac6", new Object[]{new Boolean(z), activity, scanDo, nmdVar});
        } else if (scanDo != null && activity != null) {
            if (scanDo.getType() == 1 || scanDo.getType() == 2) {
                Product product = scanDo.getProduct();
                String link = scanDo.getLink();
                Application application = activity.getApplication();
                if (TextUtils.isEmpty(link) || z || (scanDo.getType() != 1 && !link.startsWith(h1p.HTTP_PREFIX) && !link.startsWith(h1p.HTTPS_PREFIX) && !link.startsWith("www.") && !link.startsWith("wap."))) {
                    p(activity, link, product, scanDo, nmdVar);
                } else {
                    qso.a(activity.getLayoutInflater(), application, application.getString(R.string.scancode_no_network));
                }
            }
        }
    }

    public static void l(int i, String str) {
        ScancodeType scancodeType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("531c108b", new Object[]{new Integer(i), str});
        } else if (i >= 0 && !TextUtils.isEmpty(str)) {
            if (i == 1) {
                if (Scancode.e(str)) {
                    scancodeType = ScancodeType.MEDICINE;
                } else {
                    scancodeType = ScancodeType.PRODUCT;
                }
            } else if (i == 3) {
                scancodeType = ScancodeType.GEN3;
            } else if (i == 2) {
                scancodeType = ScancodeType.QR;
            } else {
                scancodeType = ScancodeType.ERROR;
            }
            TBS.Adv.ctrlClickedOnPage("HuoyanHistory", CT.Button, "HistoryClick", "content=" + str, "type=" + scancodeType.name().toLowerCase(Locale.getDefault()));
        }
    }

    public static void n(String str, Product product, ScanDo scanDo, Activity activity, nmd nmdVar) {
        int i = 2;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("984af46b", new Object[]{str, product, scanDo, activity, nmdVar});
        } else if (activity != null) {
            ip1 ip1Var = new ip1(activity, nmdVar);
            if (!TextUtils.isEmpty(str)) {
                l(scanDo.getType(), str);
                if (scanDo.getType() == 1) {
                    if (product != null) {
                        i = product.getType();
                    } else if (!Scancode.e(scanDo.getLink())) {
                        i = 1;
                    }
                    if (!scanDo.isNetworkAvailable()) {
                        return;
                    }
                    if (i == 1) {
                        ip1Var.b(str, i, null);
                    } else {
                        new GetMedicineUrlBussiness(new c(activity, activity, ip1Var, scanDo), str).handleMedicine();
                    }
                } else if (str.startsWith(h1p.HTTP_PREFIX) || str.startsWith(h1p.HTTPS_PREFIX) || str.startsWith("www.") || str.startsWith("wap.")) {
                    try {
                        String config = OrangeConfig.getInstance().getConfig("android_scancode_client", "host_switch_list", "");
                        if (!TextUtils.isEmpty(config)) {
                            String host = new URL(str).getHost();
                            String[] split = config.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                            int length = split.length;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                } else if (split[i2].equalsIgnoreCase(host)) {
                                    str = p1g.c(str, host, "b.tb.cn");
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        String a2 = nyu.a(str, "_tbScancodeApproach_=scanHistory");
                        if (!djh.b(activity, a2)) {
                            if (UrlRouter.c(a2)) {
                                UrlRouter.b(a2, new d(activity, activity, nmdVar));
                            } else {
                                new UrlModifyAdapter().f(a2, new e(activity, activity, nmdVar));
                            }
                            Versions.isDebug();
                        }
                    } catch (Exception e2) {
                        if (Versions.isDebug()) {
                            e2.toString();
                        }
                    }
                } else {
                    try {
                        TBMaterialDialog build = new TBMaterialDialog.Builder(activity).build();
                        build.setCancelable(true);
                        build.setMessage(str);
                        build.setCanceledOnTouchOutside(true);
                        build.show();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
