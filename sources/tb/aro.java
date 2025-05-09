package tb;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.Globals;
import com.taobao.tao.sharepanel.weex.WeexSharePanel;
import com.taobao.tao.util.BitmapUtil;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.R;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import tb.lkp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class aro {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Bitmap b;
    public final boolean c;
    public Bitmap d;
    public CountDownLatch f;
    public final boolean g;
    public final whp h;
    public final String i;

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f15954a = null;
    public final String e = bwr.h().e().validateTime;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h54 f15955a;

        public a(h54 h54Var) {
            this.f15955a = h54Var;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            aro.a(aro.this, this.f15955a);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h54 f15956a;

        public b(h54 h54Var) {
            this.f15956a = h54Var;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            Bitmap bitmap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() == null || succPhenixEvent.isIntermediate()) {
                bitmap = null;
            } else {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable instanceof uwn) {
                    ((uwn) drawable).l();
                }
                bitmap = drawable.getBitmap();
            }
            if (bitmap == null) {
                aro.a(aro.this, this.f15956a);
            } else {
                this.f15956a.onResult(hhi.b(true, bitmap, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), Globals.getApplication()));
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements h54 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h54 f15957a;

        public c(h54 h54Var) {
            this.f15957a = h54Var;
        }

        @Override // tb.h54
        public void onResult(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfd30c6d", new Object[]{this, str});
            } else if (!TextUtils.isEmpty(str)) {
                aro.b(aro.this, str, this.f15957a);
            } else {
                aro.a(aro.this, this.f15957a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            aro.c(aro.this).countDown();
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable instanceof uwn) {
                    ((uwn) drawable).l();
                }
                aro.d(aro.this, drawable.getBitmap());
            }
            aro.c(aro.this).countDown();
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements h54 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h54 f15960a;

        public f(h54 h54Var) {
            this.f15960a = h54Var;
        }

        @Override // tb.h54
        public void onResult(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfd30c6d", new Object[]{this, str});
            } else {
                aro.e(aro.this, str, this.f15960a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements h54 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.h54
            public void onResult(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cfd30c6d", new Object[]{this, str});
                } else {
                    aro.f(aro.this, str);
                }
            }
        }

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                aro.g(aro.this, new a());
            }
        }
    }

    static {
        t2o.a(666894607);
    }

    public aro(whp whpVar, Bitmap bitmap, String str) {
        this.g = false;
        this.b = bitmap;
        this.i = str;
        com.taobao.share.ui.engine.render.b bVar = whpVar.b;
        this.c = bVar.g;
        this.h = whpVar;
        com.taobao.share.ui.engine.weex.a aVar = bVar.e;
        if (aVar != null) {
            this.g = aVar.a();
            this.d = whpVar.b.e.b();
        }
    }

    public static /* synthetic */ void a(aro aroVar, h54 h54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812c36f", new Object[]{aroVar, h54Var});
        } else {
            aroVar.n(h54Var);
        }
    }

    public static /* synthetic */ void b(aro aroVar, String str, h54 h54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a61ea4d8", new Object[]{aroVar, str, h54Var});
        } else {
            aroVar.o(str, h54Var);
        }
    }

    public static /* synthetic */ CountDownLatch c(aro aroVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CountDownLatch) ipChange.ipc$dispatch("7187eab5", new Object[]{aroVar});
        }
        return aroVar.f;
    }

    public static /* synthetic */ Bitmap d(aro aroVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ce64afe0", new Object[]{aroVar, bitmap});
        }
        aroVar.f15954a = bitmap;
        return bitmap;
    }

    public static /* synthetic */ void e(aro aroVar, String str, h54 h54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d64875", new Object[]{aroVar, str, h54Var});
        } else {
            aroVar.k(str, h54Var);
        }
    }

    public static /* synthetic */ void f(aro aroVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84122bf6", new Object[]{aroVar, str});
        } else {
            aroVar.j(str);
        }
    }

    public static /* synthetic */ void g(aro aroVar, h54 h54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af54529", new Object[]{aroVar, h54Var});
        } else {
            aroVar.p(h54Var);
        }
    }

    public static /* synthetic */ boolean h(aro aroVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2d8366e", new Object[]{aroVar})).booleanValue();
        }
        return aroVar.c;
    }

    public static /* synthetic */ whp i(aro aroVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (whp) ipChange.ipc$dispatch("9abb85a5", new Object[]{aroVar});
        }
        return aroVar.h;
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acfc15ae", new Object[]{this, str});
        } else {
            new Handler(Looper.getMainLooper()).post(new h(str));
        }
    }

    public final void k(String str, h54 h54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40cbc76c", new Object[]{this, str, h54Var});
        } else if (TextUtils.isEmpty(str)) {
            n(h54Var);
        } else {
            m(str, new c(h54Var));
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            Coordinator.execute(new g());
        }
    }

    public final void m(String str, h54 h54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf638a1d", new Object[]{this, str, h54Var});
            return;
        }
        TBShareContent e2 = bwr.h().e();
        String str2 = null;
        String str3 = e2 == null ? null : e2.businessId;
        String str4 = this.i;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            h54Var.onResult(null);
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.sharepassword.generatePicMark");
        mtopRequest.setVersion("1.0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizCode", (Object) str3);
        jSONObject.put("targetUrl", (Object) str4);
        jSONObject.put("picUrl", (Object) str);
        mtopRequest.setData(jSONObject.toJSONString());
        MtopBuilder build = Mtop.instance(Globals.getApplication()).build(mtopRequest, TaoHelper.getTTID());
        build.setBizId(67);
        build.reqMethod(MethodEnum.POST);
        try {
            MtopResponse syncRequest = build.syncRequest();
            fwr.e("调用生成暗水印mtop, retCode=" + syncRequest.getRetCode() + " retMsg=" + syncRequest.getRetMsg());
            str2 = syncRequest.getDataJsonObject().getString("embedCarrierLink");
            StringBuilder sb = new StringBuilder("生成暗水印成功, url=");
            sb.append(str2);
            fwr.e(sb.toString());
        } catch (Throwable th) {
            fwr.e("生成暗水印失败, Throwable=" + th.toString());
        }
        h54Var.onResult(str2);
    }

    public final void n(h54 h54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a5d591", new Object[]{this, h54Var});
        } else {
            h54Var.onResult(hhi.b(true, this.d, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), Globals.getApplication()));
        }
    }

    public final void o(String str, h54 h54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44d52b9", new Object[]{this, str, h54Var});
        } else {
            s0m.B().T(str).succListener(new b(h54Var)).failListener(new a(h54Var)).fetch();
        }
    }

    public final void p(h54 h54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8602bcd8", new Object[]{this, h54Var});
        } else if (this.d == null) {
            h54Var.onResult("");
        } else {
            String e2 = lkp.b.e();
            if (!TextUtils.isEmpty(e2)) {
                this.f = new CountDownLatch(1);
                s0m.B().T(e2).succListener(new e()).failListener(new d()).fetch();
                if (this.f.getCount() > 0) {
                    try {
                        this.f.await(3000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                }
            }
            Application a2 = gjp.a();
            try {
                this.f15954a = BitmapUtil.drawTextAtBitmap(a2, this.f15954a, this.e, lr7.b(a2, 270.0f), lr7.b(a2, 225.0f));
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (this.g) {
                this.d = BitmapUtil.mergeBitmapMerge(this.d, this.b, null, null);
            } else {
                this.d = BitmapUtil.mergeBitmapMerge(this.d, this.b, null, this.f15954a);
            }
            String c2 = hhi.c(false, this.d, Globals.getApplication().getCacheDir(), a2, Boolean.TRUE, true);
            Bitmap bitmap = this.d;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.d.recycle();
            }
            rre.a(c2, new f(h54Var));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15963a;

        public h(String str) {
            this.f15963a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            boolean isEmpty = TextUtils.isEmpty(this.f15963a);
            Application a2 = gjp.a();
            gj8.h(this.f15963a);
            if (!isEmpty) {
                Toast makeText = Toast.makeText(a2, R.string.share_str_save_img_toast, 1);
                makeText.setGravity(17, 0, 0);
                makeText.show();
                if (aro.h(aro.this)) {
                    aro.i(aro.this).l(this.f15963a);
                }
                if (ShareBizAdapter.getInstance().getShareEngine().getCurSharePanel() instanceof WeexSharePanel) {
                    kwr.g(a2, kwr.TAO_PASSWORD_FROM_PIC_SAVE_KEY, ((WeexSharePanel) ShareBizAdapter.getInstance().getShareEngine().getCurSharePanel()).b().g());
                    return;
                }
                return;
            }
            Toast makeText2 = Toast.makeText(a2, R.string.share_str_save_img_fail_tosat, 1);
            makeText2.setGravity(17, 0, 0);
            makeText2.show();
        }
    }
}
