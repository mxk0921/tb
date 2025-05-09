package tb;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.taopassword.busniess.model.ALCreatePassWordModel;
import com.taobao.statistic.TBS;
import com.ut.share.ShareServiceApi;
import com.ut.share.business.ShareTargetType;
import tb.xx4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l7n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23154a;
    public String b;
    public final TBShareContent c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f23155a;

        /* compiled from: Taobao */
        /* renamed from: tb.l7n$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0977a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0977a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                d dVar = aVar.f23155a;
                if (dVar != null) {
                    ((xx4.a) dVar).a(true, l7n.a(l7n.this));
                }
            }
        }

        public a(d dVar) {
            this.f23155a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            l7n.b(l7n.this, new iwr().shortenURL(l7n.c(l7n.this)));
            new Handler(Looper.getMainLooper()).post(new RunnableC0977a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ktl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f23157a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ d c;

        public b(boolean z, boolean z2, d dVar) {
            this.f23157a = z;
            this.b = z2;
            this.c = dVar;
        }

        @Override // tb.ktl
        public void a(fis fisVar, u9 u9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("577a53dc", new Object[]{this, fisVar, u9Var});
                return;
            }
            if (u9Var == null || TextUtils.isEmpty(u9Var.f)) {
                l7n l7nVar = l7n.this;
                l7n.b(l7nVar, akp.b(l7n.c(l7nVar)));
            } else {
                l7n.b(l7n.this, akp.b(u9Var.f));
            }
            if (!this.f23157a && u9Var != null) {
                l7n l7nVar2 = l7n.this;
                l7n.b(l7nVar2, l7n.d(l7nVar2, u9Var, this.b));
            }
            d dVar = this.c;
            if (dVar != null) {
                ((xx4.a) dVar).a(this.f23157a, l7n.a(l7n.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements s9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ktl f23158a;

        public c(l7n l7nVar, ktl ktlVar) {
            this.f23158a = ktlVar;
        }

        @Override // tb.s9
        public void onFail(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
            }
        }

        @Override // tb.s9
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            } else {
                this.f23158a.a(new fis(), (u9) obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
    }

    static {
        t2o.a(665845822);
    }

    public l7n(TBShareContent tBShareContent) {
        this.c = tBShareContent;
    }

    public static /* synthetic */ String a(l7n l7nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c892db0d", new Object[]{l7nVar});
        }
        return l7nVar.f23154a;
    }

    public static /* synthetic */ String b(l7n l7nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd823181", new Object[]{l7nVar, str});
        }
        l7nVar.f23154a = str;
        return str;
    }

    public static /* synthetic */ String c(l7n l7nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32c2632c", new Object[]{l7nVar});
        }
        return l7nVar.b;
    }

    public static /* synthetic */ String d(l7n l7nVar, u9 u9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48d72804", new Object[]{l7nVar, u9Var, new Boolean(z)});
        }
        return l7nVar.f(u9Var, z);
    }

    public void e(Context context, String str, String str2, boolean z, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28bc78f", new Object[]{this, context, str, str2, new Boolean(z), dVar});
            return;
        }
        TBShareContent tBShareContent = this.c;
        if (tBShareContent != null) {
            String str3 = tBShareContent.url;
            if (TextUtils.isEmpty(str)) {
                str = xx4.QRCODE;
            }
            TBShareContent tBShareContent2 = this.c;
            String urlBackFlow = ShareServiceApi.urlBackFlow(tBShareContent2.businessId, str, tBShareContent2.url);
            if (!TextUtils.isEmpty(urlBackFlow)) {
                if (!z) {
                    akp.h(ShareTargetType.Share2QRCode.getValue());
                }
                if (!TextUtils.isEmpty(urlBackFlow) && !str3.equals(urlBackFlow)) {
                    str3 = urlBackFlow;
                }
            }
            this.b = str3;
            boolean g = g(str2);
            if (!z || !g) {
                ALCreatePassWordModel aLCreatePassWordModel = new ALCreatePassWordModel();
                TBShareContent tBShareContent3 = this.c;
                aLCreatePassWordModel.c = tBShareContent3.businessId;
                aLCreatePassWordModel.b = tBShareContent3.description;
                aLCreatePassWordModel.f11766a = this.b;
                String str4 = tBShareContent3.shareScene;
                if (str4 != null) {
                    if (TextUtils.equals(str4, "item")) {
                        aLCreatePassWordModel.b("item");
                    } else if (TextUtils.equals(this.c.shareScene, "shop")) {
                        aLCreatePassWordModel.b("shop");
                    } else {
                        aLCreatePassWordModel.b("other");
                    }
                }
                aLCreatePassWordModel.b("qrcode");
                TBShareContent tBShareContent4 = this.c;
                aLCreatePassWordModel.e = tBShareContent4.shareScene;
                aLCreatePassWordModel.f = tBShareContent4.extraParams;
                aLCreatePassWordModel.g = String.valueOf(tBShareContent4.popType);
                TBShareContent tBShareContent5 = this.c;
                aLCreatePassWordModel.h = tBShareContent5.popUrl;
                aLCreatePassWordModel.d = tBShareContent5.imageUrl;
                aLCreatePassWordModel.i = "shareplat-qrcode";
                TBS.Ext.commitEvent("Page_Share", 19999, "createQRCodeUrl", str, aLCreatePassWordModel.c, this.b);
                v9.b().a(context, aLCreatePassWordModel, new c(this, new b(g, z, dVar)));
                return;
            }
            this.b = akp.b(this.b);
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(dVar));
        }
    }

    public final String f(u9 u9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("164fcb9", new Object[]{this, u9Var, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ShareServiceApi.urlBackFlow(u9Var.f29237a.c, "QRCodeAnti", this.c.url));
        try {
            String queryParameter = Uri.parse(u9Var.d).getQueryParameter("un");
            if (!TextUtils.isEmpty(queryParameter)) {
                sb.append("&un=");
                sb.append(queryParameter);
            }
        } catch (Exception unused) {
        }
        if (!z) {
            String queryParameter2 = Uri.parse(u9Var.f).getQueryParameter(DispatchConstants.CONFIG_VERSION);
            sb.append("&cv=");
            sb.append(queryParameter2);
        }
        return akp.b(sb.toString());
    }

    public boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29621e5d", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.equals(str, "QR")) {
            return true;
        }
        if (TextUtils.equals(str, "Visual")) {
            return false;
        }
        return blo.p();
    }
}
