package tb;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.sharepanel.weex.WeexSharePanel;
import com.taobao.tao.util.BitmapUtil;
import com.taobao.taobao.R;
import com.ut.share.business.ShareTargetType;
import com.ut.share.utils.ImgShareHelper;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.lkp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bro extends yhp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final com.taobao.share.ui.engine.render.b b;
    public final ukj c;
    public final boolean d;
    public final String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ma4 f16571a;
        public final /* synthetic */ Context b;

        /* compiled from: Taobao */
        /* renamed from: tb.bro$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0884a implements s8d<FailPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0884a() {
            }

            /* renamed from: a */
            public boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                a aVar = a.this;
                bro.e(bro.this, null, aVar.f16571a);
                return false;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements s8d<SuccPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            /* renamed from: a */
            public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                Bitmap bitmap;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                if (!(succPhenixEvent.getDrawable() == null || (bitmap = succPhenixEvent.getDrawable().getBitmap()) == null)) {
                    a aVar = a.this;
                    bro.e(bro.this, bitmap, aVar.f16571a);
                }
                return true;
            }
        }

        public a(ma4 ma4Var, Context context) {
            this.f16571a = ma4Var;
            this.b = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #0 {all -> 0x0068, blocks: (B:6:0x0012, B:8:0x001e, B:11:0x0025, B:12:0x004f, B:13:0x0057, B:15:0x005b), top: B:18:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r4 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = tb.bro.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L_0x0012
                java.lang.String r1 = "5c510192"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r4
                r0.ipc$dispatch(r1, r2)
                return
            L_0x0012:
                java.lang.String r0 = tb.fjp.a()     // Catch: all -> 0x0068
                tb.bro r1 = tb.bro.this     // Catch: all -> 0x0068
                tb.ukj r1 = tb.bro.d(r1)     // Catch: all -> 0x0068
                if (r1 == 0) goto L_0x004f
                boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: all -> 0x0068
                if (r1 == 0) goto L_0x0025
                goto L_0x004f
            L_0x0025:
                tb.s0m r1 = tb.s0m.B()     // Catch: all -> 0x0068
                android.app.Application r2 = tb.gjp.a()     // Catch: all -> 0x0068
                android.content.Context r2 = r2.getApplicationContext()     // Catch: all -> 0x0068
                tb.s0m r1 = r1.N0(r2)     // Catch: all -> 0x0068
                com.taobao.phenix.intf.PhenixCreator r0 = r1.T(r0)     // Catch: all -> 0x0068
                tb.bro$a$b r1 = new tb.bro$a$b     // Catch: all -> 0x0068
                r1.<init>()     // Catch: all -> 0x0068
                com.taobao.phenix.intf.PhenixCreator r0 = r0.succListener(r1)     // Catch: all -> 0x0068
                tb.bro$a$a r1 = new tb.bro$a$a     // Catch: all -> 0x0068
                r1.<init>()     // Catch: all -> 0x0068
                com.taobao.phenix.intf.PhenixCreator r0 = r0.failListener(r1)     // Catch: all -> 0x0068
                r0.fetch()     // Catch: all -> 0x0068
                goto L_0x0057
            L_0x004f:
                tb.bro r0 = tb.bro.this     // Catch: all -> 0x0068
                tb.ma4 r1 = r4.f16571a     // Catch: all -> 0x0068
                r2 = 0
                tb.bro.e(r0, r2, r1)     // Catch: all -> 0x0068
            L_0x0057:
                tb.ma4 r0 = r4.f16571a     // Catch: all -> 0x0068
                if (r0 == 0) goto L_0x0068
                tb.bro r0 = tb.bro.this     // Catch: all -> 0x0068
                tb.whp r0 = tb.bro.f(r0)     // Catch: all -> 0x0068
                android.content.Context r1 = r4.b     // Catch: all -> 0x0068
                tb.ma4 r2 = r4.f16571a     // Catch: all -> 0x0068
                r0.c(r1, r2)     // Catch: all -> 0x0068
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.bro.a.run():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ma4 f16574a;
        public final /* synthetic */ Context b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements s8d<FailPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            /* renamed from: a */
            public boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                b bVar = b.this;
                bro.e(bro.this, null, bVar.f16574a);
                return false;
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.bro$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0885b implements s8d<SuccPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0885b() {
            }

            /* renamed from: a */
            public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                Bitmap bitmap;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                if (!(succPhenixEvent.getDrawable() == null || (bitmap = succPhenixEvent.getDrawable().getBitmap()) == null)) {
                    b bVar = b.this;
                    bro.e(bro.this, bitmap, bVar.f16574a);
                }
                return true;
            }
        }

        public b(ma4 ma4Var, Context context) {
            this.f16574a = ma4Var;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String a2 = fjp.a();
            if (bro.d(bro.this) == null || TextUtils.isEmpty(a2)) {
                bro.e(bro.this, null, this.f16574a);
            } else {
                s0m.B().N0(gjp.a().getApplicationContext()).T(a2).succListener(new C0885b()).failListener(new a()).fetch();
            }
            if (this.f16574a != null) {
                bro.g(bro.this).c(this.b, this.f16574a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16577a;
        public final /* synthetic */ ma4 b;

        public c(Context context, ma4 ma4Var) {
            this.f16577a = context;
            this.b = ma4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            bro.h(bro.this, this.f16577a);
            if (bro.d(bro.this) != null) {
                bro.d(bro.this).h().q();
            }
            if (this.b != null) {
                bro.i(bro.this).c(this.f16577a, this.b);
            }
        }
    }

    static {
        t2o.a(666894460);
    }

    public bro(whp whpVar, boolean z, String str) {
        super(whpVar);
        com.taobao.share.ui.engine.render.b bVar = whpVar.b;
        this.b = bVar;
        this.d = z;
        this.e = str;
        com.taobao.share.ui.engine.render.a aVar = bVar.b;
        if (aVar instanceof ukj) {
            this.c = (ukj) aVar;
        }
    }

    public static /* synthetic */ ukj d(bro broVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ukj) ipChange.ipc$dispatch("ac91f0a", new Object[]{broVar});
        }
        return broVar.c;
    }

    public static /* synthetic */ void e(bro broVar, Bitmap bitmap, ma4 ma4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d88a2213", new Object[]{broVar, bitmap, ma4Var});
        } else {
            broVar.m(bitmap, ma4Var);
        }
    }

    public static /* synthetic */ whp f(bro broVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (whp) ipChange.ipc$dispatch("1fb52e56", new Object[]{broVar});
        }
        return broVar.f32102a;
    }

    public static /* synthetic */ whp g(bro broVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (whp) ipChange.ipc$dispatch("3e6f6617", new Object[]{broVar});
        }
        return broVar.f32102a;
    }

    public static /* synthetic */ void h(bro broVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c669b092", new Object[]{broVar, context});
        } else {
            broVar.j(context);
        }
    }

    public static /* synthetic */ whp i(bro broVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (whp) ipChange.ipc$dispatch("7be3d599", new Object[]{broVar});
        }
        return broVar.f32102a;
    }

    public static /* synthetic */ Object ipc$super(bro broVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/worker/SaveImageWorker");
    }

    public final void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b9c03f8", new Object[]{this, context});
        } else if (context != null) {
            Toast makeText = Toast.makeText(context, Localization.q(R.string.taobao_app_1010_1_17885), 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        }
    }

    public void l(Context context, ma4 ma4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f56a", new Object[]{this, context, ma4Var});
            return;
        }
        ukj ukjVar = this.c;
        if (ukjVar != null) {
            ukjVar.h().s();
        }
        this.b.f.removeCallbacksAndMessages(null);
        AsyncTask.execute(new a(ma4Var, context));
    }

    public final void m(Bitmap bitmap, ma4 ma4Var) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3437f549", new Object[]{this, bitmap, ma4Var});
            return;
        }
        if (ma4Var == null) {
            ma4Var = this.b.h;
        }
        ukj ukjVar = this.c;
        if (ukjVar == null || ukjVar.i() == null) {
            if (ma4Var == null || (!TextUtils.equals(ShareTargetType.Share2QQ.getValue(), ma4Var.b()) && !TextUtils.equals(ShareTargetType.Share2Weixin.getValue(), ma4Var.b()))) {
                z = false;
            } else {
                z = true;
            }
            if (this.f32102a.b.g && !z) {
                z2 = false;
            }
            if (!this.d || !z2) {
                new d(this.f32102a, bitmap, z).execute(new Void[0]);
            } else {
                new aro(this.f32102a, bitmap, this.e).l();
            }
        } else {
            this.c.h().r();
            new d(bitmap, this.c.i()).execute(new Void[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d extends AsyncTask<Void, Void, String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Bitmap f16578a;
        public final Bitmap b;
        public final boolean c;
        public final boolean d;
        public final aip e;
        public Bitmap f;
        public final String g;
        public CountDownLatch h;
        public final boolean i;
        public final whp j;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements s8d<FailPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            /* renamed from: a */
            public boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                d.a(d.this).countDown();
                return false;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements s8d<SuccPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
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
                    d.b(d.this, drawable.getBitmap());
                }
                d.a(d.this).countDown();
                return false;
            }
        }

        static {
            t2o.a(666894468);
        }

        public d(Bitmap bitmap, aip aipVar) {
            Bitmap bitmap2 = null;
            this.f16578a = null;
            this.i = false;
            this.b = bitmap;
            this.e = aipVar;
            this.g = bwr.h().e().validateTime;
            this.f = aipVar != null ? ((iip) aipVar).g() : bitmap2;
        }

        public static /* synthetic */ CountDownLatch a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CountDownLatch) ipChange.ipc$dispatch("fdd14b7", new Object[]{dVar});
            }
            return dVar.h;
        }

        public static /* synthetic */ Bitmap b(d dVar, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("37dbca78", new Object[]{dVar, bitmap});
            }
            dVar.f16578a = bitmap;
            return bitmap;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/worker/SaveImageWorker$SaveImageTaskForQQWx");
        }

        /* renamed from: c */
        public String doInBackground(Void... voidArr) {
            Bitmap bitmap;
            File file;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ba63ca09", new Object[]{this, voidArr});
            }
            aip aipVar = this.e;
            if (aipVar != null) {
                bitmap = ((iip) aipVar).f();
            } else {
                bitmap = null;
            }
            if (this.f == null) {
                return "";
            }
            String e = lkp.b.e();
            if (!TextUtils.isEmpty(e)) {
                this.h = new CountDownLatch(1);
                s0m.B().T(e).succListener(new b()).failListener(new a()).fetch();
                if (this.h.getCount() > 0) {
                    try {
                        this.h.await(3000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Application a2 = gjp.a();
            try {
                this.f16578a = BitmapUtil.drawTextAtBitmap(a2, this.f16578a, this.g, lr7.b(a2, 270.0f), lr7.b(a2, 225.0f));
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (this.i) {
                this.f = BitmapUtil.mergeBitmapMerge(this.f, this.b, bitmap, null);
            } else {
                this.f = BitmapUtil.mergeBitmapMerge(this.f, this.b, bitmap, this.f16578a);
            }
            if (this.c && !this.d) {
                z = false;
            }
            if (z) {
                file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
            } else {
                file = ShareBizAdapter.getInstance().getAppEnv().getApplication().getCacheDir();
            }
            String b2 = hhi.b(z, this.f, file, a2);
            Bitmap bitmap2 = this.f;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.f.recycle();
            }
            return b2;
        }

        /* renamed from: d */
        public void onPostExecute(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe870167", new Object[]{this, str});
                return;
            }
            super.onPostExecute(str);
            boolean isEmpty = TextUtils.isEmpty(str);
            Application a2 = gjp.a();
            gj8.h(str);
            if (!isEmpty) {
                if ((this.d || !this.c) && !ImgShareHelper.disableSuccessToast) {
                    Toast makeText = Toast.makeText(a2, R.string.share_str_save_img_toast, 1);
                    makeText.setGravity(17, 0, 0);
                    makeText.show();
                }
                if (this.c) {
                    this.j.l(str);
                }
                aip aipVar = this.e;
                if (aipVar != null && !TextUtils.isEmpty(aipVar.b())) {
                    kwr.g(a2, kwr.TAO_PASSWORD_FROM_PIC_SAVE_KEY, this.e.b());
                } else if (ShareBizAdapter.getInstance().getShareEngine().getCurSharePanel() instanceof WeexSharePanel) {
                    kwr.g(a2, kwr.TAO_PASSWORD_FROM_PIC_SAVE_KEY, ((WeexSharePanel) ShareBizAdapter.getInstance().getShareEngine().getCurSharePanel()).b().g());
                }
            } else {
                Toast makeText2 = Toast.makeText(a2, R.string.share_str_save_img_fail_tosat, 1);
                makeText2.setGravity(17, 0, 0);
                makeText2.show();
            }
            ImgShareHelper.disableSuccessToast = false;
        }

        public d(whp whpVar, Bitmap bitmap, boolean z) {
            this.f16578a = null;
            this.i = false;
            this.b = bitmap;
            this.g = bwr.h().e().validateTime;
            com.taobao.share.ui.engine.render.b bVar = whpVar.b;
            this.c = bVar.g;
            this.j = whpVar;
            this.d = z;
            com.taobao.share.ui.engine.weex.a aVar = bVar.e;
            if (aVar != null) {
                this.i = aVar.a();
                this.f = whpVar.b.e.b();
            }
        }
    }

    public void k(Context context, ma4 ma4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aad01886", new Object[]{this, context, ma4Var});
            return;
        }
        ukj ukjVar = this.c;
        if (ukjVar != null) {
            ukjVar.h().s();
        }
        this.b.f.removeCallbacksAndMessages(null);
        com.taobao.runtimepermission.a.c(context, a0m.a()).t("tb_share").x(true).w(Localization.q(R.string.taobao_app_1010_1_17841)).x(true).z(new c(context, ma4Var)).A(new b(ma4Var, context)).m();
    }
}
