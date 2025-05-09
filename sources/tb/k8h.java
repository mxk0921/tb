package tb;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.flexbox.layoutmanager.save.LocalTBackFragment;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k8h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int IMAGE_SAVE_REQUEST_CODE = 1502;

    /* renamed from: a  reason: collision with root package name */
    public final Context f22462a;
    public f b;
    public g c;
    public Bitmap d = null;
    public final String e;
    public String f;
    public String g;
    public Bitmap h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.k8h.e
        public void a(String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4bce4fb", new Object[]{this, str, bitmap});
            } else if (bitmap == null) {
                Toast.makeText(k8h.a(k8h.this).getApplicationContext(), R.string.uik_save_image_fail_get, 0).show();
            } else {
                k8h.b(k8h.this, bitmap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f22464a;

        public b(Bitmap bitmap) {
            this.f22464a = bitmap;
        }

        @Override // tb.k8h.e
        public void a(String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4bce4fb", new Object[]{this, str, bitmap});
                return;
            }
            k8h.c(k8h.this, bitmap);
            k8h.d(k8h.this, this.f22464a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f22465a;
        public final /* synthetic */ String b;

        public c(k8h k8hVar, e eVar, String str) {
            this.f22465a = eVar;
            this.b = str;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            this.f22465a.a(this.b, null);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f22466a;
        public final /* synthetic */ String b;

        public d(k8h k8hVar, e eVar, String str) {
            this.f22466a = eVar;
            this.b = str;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable != null) {
                this.f22466a.a(this.b, drawable.getBitmap());
            } else {
                this.f22466a.a(this.b, null);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
        void a(String str, Bitmap bitmap);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends AsyncTask<Object, Void, Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Uri f22467a;

        static {
            t2o.a(502268326);
        }

        public /* synthetic */ f(k8h k8hVar, a aVar) {
            this();
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/save/LocalImageSaveFeature$SaveFileTask");
        }

        /* renamed from: b */
        public void onPostExecute(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be14b67a", new Object[]{this, num});
            } else {
                k8h.e(k8h.this, num, this.f22467a, true);
            }
        }

        public f() {
        }

        /* renamed from: a */
        public Integer doInBackground(Object... objArr) {
            Throwable th;
            ParcelFileDescriptor parcelFileDescriptor;
            Exception e;
            FileOutputStream fileOutputStream;
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("3c207953", new Object[]{this, objArr});
            }
            this.f22467a = (Uri) objArr[0];
            Bitmap bitmap = (Bitmap) objArr[1];
            if (bitmap != null) {
                FileOutputStream fileOutputStream2 = null;
                try {
                    parcelFileDescriptor = k8h.a(k8h.this).getContentResolver().openFileDescriptor(this.f22467a, "w");
                    try {
                        try {
                            fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    parcelFileDescriptor = null;
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptor = null;
                }
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        parcelFileDescriptor.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    i = 0;
                } catch (Exception e5) {
                    e = e5;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            i = 2;
                            return Integer.valueOf(i);
                        }
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    i = 2;
                    return Integer.valueOf(i);
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            throw th;
                        }
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    throw th;
                }
            }
            return Integer.valueOf(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g extends AsyncTask<Object, Void, Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Uri f22468a;

        static {
            t2o.a(502268327);
        }

        public /* synthetic */ g(k8h k8hVar, a aVar) {
            this();
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/save/LocalImageSaveFeature$SaveFileUseMediaStoreTask");
        }

        /* renamed from: b */
        public void onPostExecute(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be14b67a", new Object[]{this, num});
            } else {
                k8h.e(k8h.this, num, this.f22468a, false);
            }
        }

        public g() {
        }

        /* renamed from: a */
        public Integer doInBackground(Object... objArr) {
            OutputStream openOutputStream;
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("3c207953", new Object[]{this, objArr});
            }
            Bitmap bitmap = (Bitmap) objArr[0];
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            contentValues.put("_display_name", Integer.valueOf(bitmap.toString().hashCode()));
            contentValues.put("mime_type", Constants.SHARETYPE_WITH_QRCODE);
            long j = currentTimeMillis / 1000;
            contentValues.put("date_added", Long.valueOf(j));
            contentValues.put("date_modified", Long.valueOf(j));
            contentValues.put("date_expires", Long.valueOf((currentTimeMillis + 86400000) / 1000));
            contentValues.put("is_pending", (Integer) 1);
            ContentResolver contentResolver = k8h.a(k8h.this).getContentResolver();
            Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            this.f22468a = insert;
            try {
                openOutputStream = contentResolver.openOutputStream(insert);
            } catch (IOException unused) {
                contentResolver.delete(this.f22468a, null, null);
            }
            if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, openOutputStream)) {
                if (openOutputStream != null) {
                    openOutputStream.close();
                }
                contentValues.clear();
                contentValues.put("is_pending", (Integer) 0);
                contentValues.putNull("date_expires");
                contentResolver.update(this.f22468a, contentValues, null, null);
                i = 0;
                return Integer.valueOf(i);
            }
            throw new IOException("Failed to compress");
        }
    }

    static {
        t2o.a(502268320);
    }

    public k8h(Context context, String str) {
        this.f22462a = context;
        this.e = str;
    }

    public static /* synthetic */ Context a(k8h k8hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("294bc762", new Object[]{k8hVar});
        }
        return k8hVar.f22462a;
    }

    public static /* synthetic */ void b(k8h k8hVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb6f305", new Object[]{k8hVar, bitmap});
        } else {
            k8hVar.p(bitmap);
        }
    }

    public static /* synthetic */ Bitmap c(k8h k8hVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("34cade66", new Object[]{k8hVar, bitmap});
        }
        k8hVar.h = bitmap;
        return bitmap;
    }

    public static /* synthetic */ void d(k8h k8hVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff255b07", new Object[]{k8hVar, bitmap});
        } else {
            k8hVar.r(bitmap);
        }
    }

    public static /* synthetic */ void e(k8h k8hVar, Integer num, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d2c400", new Object[]{k8hVar, num, uri, new Boolean(z)});
        } else {
            k8hVar.l(num, uri, z);
        }
    }

    public static int j(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c49b251", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return (i2 * i) / 750;
    }

    public static int[] s(int i, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("e8ec4138", new Object[]{new Integer(i), new Integer(i2), new Long(j)});
        }
        double d2 = i;
        double d3 = i2;
        double sqrt = Math.sqrt(j / (d2 * d3));
        return new int[]{(int) (d2 * sqrt), (int) (d3 * sqrt)};
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c74f98f9", new Object[]{this})).booleanValue();
        }
        if (this.f22462a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    public final Bitmap g(Bitmap bitmap) {
        Canvas canvas;
        Bitmap bitmap2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d7cda40f", new Object[]{this, bitmap});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 0 && height > 0) {
            try {
                if (akt.m0()) {
                    if (width * height > 4665600) {
                        int[] s = s(width, height, 4665600L);
                        int i2 = s[0];
                        height = s[1];
                        width = i2;
                    }
                    bitmap2 = Bitmap.createScaledBitmap(bitmap, width, height, true);
                    canvas = new Canvas(bitmap2);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap2 = createBitmap;
                    canvas = canvas2;
                }
                Bitmap bitmap3 = this.h;
                if (bitmap3 != null) {
                    int width2 = bitmap3.getWidth();
                    int height2 = this.h.getHeight();
                    Rect rect = new Rect(0, 0, width2, height2);
                    int j = j(width, 38);
                    if (height2 != 0) {
                        i = (width2 * j) / height2;
                    } else {
                        i = j(width, 160);
                    }
                    Rect rect2 = new Rect((width - i) - j(width, 20), (height - j) - j(width, 53), width - j(width, 20), height - j(width, 53));
                    Paint paint = new Paint(1);
                    paint.setShadowLayer(j(width, 1), 0.0f, j(width, 1), 2130706432);
                    canvas.drawBitmap(this.h, rect, rect2, paint);
                }
                if (!TextUtils.isEmpty(this.f)) {
                    TextPaint textPaint = new TextPaint(1);
                    textPaint.setColor(-460552);
                    textPaint.setTextSize(j(width, 20));
                    textPaint.setShadowLayer(j(width, 1), 0.0f, j(width, 1), 2130706432);
                    canvas.drawText(this.f, (width - j(width, 20)) - textPaint.measureText(this.f), (height - j(width, 48)) - textPaint.getFontMetrics().top, textPaint);
                }
                canvas.save();
                canvas.restore();
                return bitmap2;
            } catch (Throwable th) {
                tfs.e("createWaterMaskBitmap", "createWaterMaskBitmap error:" + th.getMessage());
            }
        }
        return null;
    }

    public final void h(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0ed3b9", new Object[]{this, str, eVar});
        } else {
            s0m.B().T(str).succListener(new d(this, eVar, str)).failListener(new c(this, eVar, str)).fetch();
        }
    }

    public final Bitmap i(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("703d6da3", new Object[]{this, bitmap});
        }
        if (this.h == null && this.f == null) {
            return bitmap;
        }
        return g(bitmap);
    }

    public final String k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab3e0739", new Object[]{this, new Integer(i)});
        }
        return this.f22462a.getResources().getString(i);
    }

    public final void m(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd519d33", new Object[]{this, uri});
            return;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(uri);
        this.f22462a.sendBroadcast(intent);
    }

    public void n(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i == 1502 && i2 == -1) {
            q(intent.getData(), this.d);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84643f84", new Object[]{this});
        } else if (this.f22462a != null) {
            if (TextUtils.isEmpty(this.e)) {
                Toast.makeText(this.f22462a.getApplicationContext(), R.string.uik_save_image_fail_get, 0).show();
            } else {
                h(this.e, new a());
            }
        }
    }

    public final void p(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27863d62", new Object[]{this, bitmap});
        } else if (!TextUtils.isEmpty(this.g)) {
            h(this.g, new b(bitmap));
        } else {
            r(bitmap);
        }
    }

    public void q(Uri uri, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fda0188", new Object[]{this, uri, bitmap});
            return;
        }
        f fVar = this.b;
        if (fVar == null || AsyncTask.Status.RUNNING != fVar.getStatus()) {
            f fVar2 = new f(this, null);
            this.b = fVar2;
            fVar2.execute(uri, bitmap);
        }
    }

    public final void r(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7bd64c4", new Object[]{this, bitmap});
            return;
        }
        Bitmap i = i(bitmap);
        this.d = i;
        if (i == null) {
            Toast.makeText(this.f22462a.getApplicationContext(), k(R.string.uik_save_image_fail_get), 0).show();
        } else if (u()) {
            g gVar = this.c;
            if (gVar == null || AsyncTask.Status.RUNNING != gVar.getStatus()) {
                g gVar2 = new g(this, null);
                this.c = gVar2;
                gVar2.execute(this.d);
            }
        } else if (f()) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdirs()) {
                q(Uri.fromFile(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString() + "/" + this.d.toString().hashCode() + ".png")), this.d);
                return;
            }
            Toast.makeText(this.f22462a.getApplicationContext(), k(R.string.uik_save_image_fail), 0).show();
        } else {
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.TITLE", this.d.toString().hashCode() + ".png");
            Context context = this.f22462a;
            while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context == null || !(context instanceof Activity)) {
                Toast.makeText(this.f22462a.getApplicationContext(), k(R.string.uik_save_image_fail), 0).show();
                return;
            }
            FragmentManager fragmentManager = ((Activity) context).getFragmentManager();
            LocalTBackFragment localTBackFragment = (LocalTBackFragment) fragmentManager.findFragmentByTag("LocalTBackFragment");
            if (localTBackFragment == null) {
                localTBackFragment = new LocalTBackFragment();
                fragmentManager.beginTransaction().add(localTBackFragment, "LocalTBackFragment").commit();
                fragmentManager.executePendingTransactions();
            }
            localTBackFragment.a(this);
            localTBackFragment.startActivityForResult(intent, 1502);
        }
    }

    public void t(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be088ef0", new Object[]{this, str, str2});
            return;
        }
        this.f = str;
        this.g = str2;
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e604ecf", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public final void l(Integer num, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b9bafb", new Object[]{this, num, uri, new Boolean(z)});
            return;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            Toast.makeText(this.f22462a.getApplicationContext(), "图片已保存，请在手机相册中查看", 0).show();
            if (!z || f()) {
                m(uri);
            }
        } else if (intValue == 1) {
            Toast.makeText(this.f22462a.getApplicationContext(), "存储失败", 0).show();
        } else if (intValue == 2) {
            Toast.makeText(this.f22462a.getApplicationContext(), "存储失败，可能存储空间不足", 0).show();
        }
    }
}
