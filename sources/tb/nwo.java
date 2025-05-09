package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.qrcode.ShareQRCodeTask;
import com.taobao.tao.util.AnalyticsUtil;
import com.taobao.tao.util.BitmapUtil;
import com.taobao.taobao.R;
import com.ut.share.utils.ShareUtils;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nwo extends yhp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ShareQRCodeTask.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f24995a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ TBShareContent d;

        /* compiled from: Taobao */
        /* renamed from: tb.nwo$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C1011a implements s8d<FailPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Bitmap f24996a;
            public final /* synthetic */ String b;

            public C1011a(Bitmap bitmap, String str) {
                this.f24996a = bitmap;
                this.b = str;
            }

            /* renamed from: a */
            public boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                if (a0m.c()) {
                    a aVar = a.this;
                    nwo.d(nwo.this, aVar.b, aVar.c, aVar.d, this.f24996a, aVar.f24995a, this.b, null);
                } else {
                    a aVar2 = a.this;
                    nwo.e(nwo.this, aVar2.b, aVar2.c, aVar2.d, this.f24996a, aVar2.f24995a, this.b, null);
                }
                return false;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements s8d<SuccPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Bitmap f24997a;
            public final /* synthetic */ String b;

            public b(Bitmap bitmap, String str) {
                this.f24997a = bitmap;
                this.b = str;
            }

            /* renamed from: a */
            public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                    if (a0m.c()) {
                        a aVar = a.this;
                        nwo.d(nwo.this, aVar.b, aVar.c, aVar.d, this.f24997a, aVar.f24995a, this.b, drawable.getBitmap());
                    } else {
                        a aVar2 = a.this;
                        nwo.e(nwo.this, aVar2.b, aVar2.c, aVar2.d, this.f24997a, aVar2.f24995a, this.b, drawable.getBitmap());
                    }
                }
                return false;
            }
        }

        public a(e eVar, boolean z, Context context, TBShareContent tBShareContent) {
            this.f24995a = eVar;
            this.b = z;
            this.c = context;
            this.d = tBShareContent;
        }

        @Override // com.taobao.share.qrcode.ShareQRCodeTask.a
        public void a(int i, Bitmap bitmap, boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5840d252", new Object[]{this, new Integer(i), bitmap, new Boolean(z), str});
            } else if (this.f24995a != null) {
                Thread.currentThread().getName();
                if (bitmap != null) {
                    s0m.B().T(OrangeConfig.getInstance().getConfig("android_share", "bottomImageToScreenshot", "https://gw.alicdn.com/tfs/TB1yXjPdhD1gK0jSZFsXXbldVXa-1038-222.png")).succListener(new b(bitmap, str)).failListener(new C1011a(bitmap, str)).fetch();
                    return;
                }
                e eVar = this.f24995a;
                if (eVar != null) {
                    eVar.a(this.c);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends AsyncTask<Void, Void, String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBShareContent f24998a;
        public final /* synthetic */ Bitmap b;
        public final /* synthetic */ Bitmap c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Context e;
        public final /* synthetic */ String f;
        public final /* synthetic */ e g;

        public b(nwo nwoVar, TBShareContent tBShareContent, Bitmap bitmap, Bitmap bitmap2, boolean z, Context context, String str, e eVar) {
            this.f24998a = tBShareContent;
            this.b = bitmap;
            this.c = bitmap2;
            this.d = z;
            this.e = context;
            this.f = str;
            this.g = eVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/worker/ScreenShotWorker$2");
        }

        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            Bitmap bitmap;
            File file;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ba63ca09", new Object[]{this, voidArr});
            }
            new StringBuilder("doInBackground：").append(Thread.currentThread().getName());
            Bitmap imageFromPath = ShareUtils.imageFromPath(this.f24998a.screenshot);
            if (imageFromPath == null || this.b == null || (bitmap = this.c) == null) {
                return "";
            }
            Bitmap combineBitmap = BitmapUtil.combineBitmap(Bitmap.createBitmap(bitmap), this.b);
            Bitmap mergeBitmapMerge = BitmapUtil.mergeBitmapMerge(imageFromPath, null, null, combineBitmap);
            if (this.d) {
                file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
            } else {
                file = ShareBizAdapter.getInstance().getAppEnv().getApplication().getCacheDir();
            }
            String b = hhi.b(this.d, mergeBitmapMerge, file, this.e);
            if (!TextUtils.isEmpty(b)) {
                kwr.g(this.e, kwr.TAO_PASSWORD_FROM_PIC_SAVE_KEY, this.f);
            }
            if (mergeBitmapMerge != null && !mergeBitmapMerge.isRecycled()) {
                mergeBitmapMerge.recycle();
            }
            if (combineBitmap != null && !combineBitmap.isRecycled()) {
                combineBitmap.recycle();
            }
            return b;
        }

        /* renamed from: b */
        public void onPostExecute(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe870167", new Object[]{this, str});
                return;
            }
            new StringBuilder("onPostExecute：").append(Thread.currentThread().getName());
            if (!TextUtils.isEmpty(str)) {
                e eVar = this.g;
                if (eVar != null) {
                    eVar.c(str);
                }
            } else {
                e eVar2 = this.g;
                if (eVar2 != null) {
                    eVar2.a(this.e);
                }
            }
            super.onPostExecute(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBShareContent f24999a;
        public final /* synthetic */ Bitmap b;
        public final /* synthetic */ Bitmap c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Context e;
        public final /* synthetic */ String f;
        public final /* synthetic */ e g;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a extends AsyncTask<Void, Void, String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                if (str.hashCode() == -1325021319) {
                    super.onPostExecute(objArr[0]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/worker/ScreenShotWorker$3$1");
            }

            /* renamed from: a */
            public String doInBackground(Void... voidArr) {
                Bitmap bitmap;
                File file;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("ba63ca09", new Object[]{this, voidArr});
                }
                new StringBuilder("doInBackground：").append(Thread.currentThread().getName());
                Bitmap imageFromPath = ShareUtils.imageFromPath(c.this.f24999a.screenshot);
                if (imageFromPath == null) {
                    return "";
                }
                c cVar = c.this;
                if (cVar.b == null || (bitmap = cVar.c) == null) {
                    return "";
                }
                Bitmap combineBitmap = BitmapUtil.combineBitmap(Bitmap.createBitmap(bitmap), c.this.b);
                Bitmap mergeBitmapMerge = BitmapUtil.mergeBitmapMerge(imageFromPath, null, null, combineBitmap);
                if (c.this.d) {
                    file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                } else {
                    file = ShareBizAdapter.getInstance().getAppEnv().getApplication().getCacheDir();
                }
                c cVar2 = c.this;
                String b = hhi.b(cVar2.d, mergeBitmapMerge, file, cVar2.e);
                if (!TextUtils.isEmpty(b)) {
                    c cVar3 = c.this;
                    kwr.g(cVar3.e, kwr.TAO_PASSWORD_FROM_PIC_SAVE_KEY, cVar3.f);
                }
                if (mergeBitmapMerge != null && !mergeBitmapMerge.isRecycled()) {
                    mergeBitmapMerge.recycle();
                }
                if (combineBitmap != null && !combineBitmap.isRecycled()) {
                    combineBitmap.recycle();
                }
                return b;
            }

            /* renamed from: b */
            public void onPostExecute(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fe870167", new Object[]{this, str});
                    return;
                }
                new StringBuilder("onPostExecute：").append(Thread.currentThread().getName());
                if (!TextUtils.isEmpty(str)) {
                    e eVar = c.this.g;
                    if (eVar != null) {
                        eVar.c(str);
                    }
                } else {
                    c cVar = c.this;
                    e eVar2 = cVar.g;
                    if (eVar2 != null) {
                        eVar2.a(cVar.e);
                    }
                }
                super.onPostExecute(str);
            }
        }

        public c(TBShareContent tBShareContent, Bitmap bitmap, Bitmap bitmap2, boolean z, Context context, String str, e eVar) {
            this.f24999a = tBShareContent;
            this.b = bitmap;
            this.c = bitmap2;
            this.d = z;
            this.e = context;
            this.f = str;
            this.g = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                new a().execute(new Void[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f25001a;
        public final /* synthetic */ Context b;

        public d(e eVar, Context context) {
            this.f25001a = eVar;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            e eVar = this.f25001a;
            if (eVar != null) {
                eVar.b(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
        void a(Context context);

        void b(Context context);

        void c(String str);
    }

    static {
        t2o.a(666894471);
    }

    public nwo(whp whpVar) {
        super(whpVar);
    }

    public static /* synthetic */ void d(nwo nwoVar, boolean z, Context context, TBShareContent tBShareContent, Bitmap bitmap, e eVar, String str, Bitmap bitmap2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba2e27c", new Object[]{nwoVar, new Boolean(z), context, tBShareContent, bitmap, eVar, str, bitmap2});
        } else {
            nwoVar.g(z, context, tBShareContent, bitmap, eVar, str, bitmap2);
        }
    }

    public static /* synthetic */ void e(nwo nwoVar, boolean z, Context context, TBShareContent tBShareContent, Bitmap bitmap, e eVar, String str, Bitmap bitmap2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523ed9fd", new Object[]{nwoVar, new Boolean(z), context, tBShareContent, bitmap, eVar, str, bitmap2});
        } else {
            nwoVar.f(z, context, tBShareContent, bitmap, eVar, str, bitmap2);
        }
    }

    public static /* synthetic */ Object ipc$super(nwo nwoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/worker/ScreenShotWorker");
    }

    public final void g(boolean z, Context context, TBShareContent tBShareContent, Bitmap bitmap, e eVar, String str, Bitmap bitmap2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcea269", new Object[]{this, new Boolean(z), context, tBShareContent, bitmap, eVar, str, bitmap2});
        } else {
            new b(this, tBShareContent, bitmap, bitmap2, z, context, str, eVar).execute(new Void[0]);
        }
    }

    public void h(String str, boolean z, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6743b75", new Object[]{this, str, new Boolean(z), eVar});
            return;
        }
        this.f32102a.b(AnalyticsUtil.getPlatformByTag(str), null, false, new a(eVar, z, ShareBizAdapter.getInstance().getAppEnv().getApplication(), bwr.h().e()));
    }

    public final void f(boolean z, Context context, TBShareContent tBShareContent, Bitmap bitmap, e eVar, String str, Bitmap bitmap2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6965b51f", new Object[]{this, new Boolean(z), context, tBShareContent, bitmap, eVar, str, bitmap2});
        } else {
            com.taobao.runtimepermission.a.c(context, a0m.a()).t("tb_share").x(true).w(Localization.q(R.string.taobao_app_1010_1_17841)).z(new d(eVar, context)).A(new c(tBShareContent, bitmap, bitmap2, z, context, str, eVar)).m();
        }
    }
}
