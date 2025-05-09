package tb;

import android.app.Application;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bwo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String e = o().toString() + yhs.DEFAULT_PLAN_B_PASSWORD_REGEX;
    public static final String f = n().toString() + yhs.DEFAULT_PLAN_B_PASSWORD_REGEX;
    public static final String[] g = {"screenshot", "screen_shot", "截屏", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};
    public ContentObserver b;
    public Handler d;

    /* renamed from: a  reason: collision with root package name */
    public long f16685a = 0;
    public Context c = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends ContentObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16686a;

        /* compiled from: Taobao */
        /* renamed from: tb.bwo$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0886a extends m02 {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Uri b;

            public C0886a(Uri uri) {
                this.b = uri;
            }

            public static /* synthetic */ Object ipc$super(C0886a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/feature/device/ScreenShotObserveManager$1$1");
            }

            @Override // tb.m02
            public void e() {
                Cursor cursor;
                Throwable th;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                    return;
                }
                Cursor cursor2 = null;
                try {
                    Uri uri = this.b;
                    if (uri != null) {
                        String uri2 = uri.toString();
                        if (!uri2.matches(bwo.c())) {
                            if (uri2.matches(bwo.k())) {
                            }
                        }
                        cursor = a.this.f16686a.getContentResolver().query(this.b, null, null, null, "date_added DESC");
                        if (cursor != null) {
                            try {
                                if (cursor.moveToFirst()) {
                                    String string = cursor.getString(cursor.getColumnIndex("_data"));
                                    long j = cursor.getLong(cursor.getColumnIndex("date_added"));
                                    if (bwo.i(bwo.this, string) && bwo.m(bwo.this, j)) {
                                        UtUtils.e("BehaviX", 19997, "screenshot", t82.b(), "", "bizArgKVS=" + t82.a());
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    q82.f("screenShotError", null, null, th);
                                    if (cursor == null) {
                                        return;
                                    }
                                    return;
                                } finally {
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                }
                            }
                        }
                        cursor2 = cursor;
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Handler handler, Context context) {
            super(handler);
            this.f16686a = context;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/feature/device/ScreenShotObserveManager$1");
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c2652e9", new Object[]{this, new Boolean(z), uri});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - bwo.a(bwo.this) >= 500) {
                bwo.b(bwo.this, currentTimeMillis);
                bwo bwoVar = bwo.this;
                if (bwo.h(bwoVar, bwo.j(bwoVar), bwo.p())) {
                    u82.g(new C0886a(uri));
                }
            }
        }
    }

    public static /* synthetic */ long a(bwo bwoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6496472d", new Object[]{bwoVar})).longValue();
        }
        return bwoVar.f16685a;
    }

    public static /* synthetic */ long b(bwo bwoVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e33169f", new Object[]{bwoVar, new Long(j)})).longValue();
        }
        bwoVar.f16685a = j;
        return j;
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ boolean h(bwo bwoVar, Context context, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80296a14", new Object[]{bwoVar, context, strArr})).booleanValue();
        }
        return bwoVar.f(context, strArr);
    }

    public static /* synthetic */ boolean i(bwo bwoVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39e774c7", new Object[]{bwoVar, str})).booleanValue();
        }
        return bwoVar.g(str);
    }

    public static /* synthetic */ Context j(bwo bwoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6675ff32", new Object[]{bwoVar});
        }
        return bwoVar.c;
    }

    public static /* synthetic */ String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ boolean m(bwo bwoVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48a40fce", new Object[]{bwoVar, new Long(j)})).booleanValue();
        }
        return bwoVar.e(j);
    }

    public static Uri n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("20a44530", new Object[0]);
        }
        if (r()) {
            return MediaStore.Images.Media.getContentUri(UiUtil.INPUT_TYPE_VALUE_EXTERNAL);
        }
        return MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    public static Uri o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("ed29a922", new Object[0]);
        }
        if (r()) {
            return MediaStore.Images.Media.getContentUri("internal");
        }
        return MediaStore.Images.Media.INTERNAL_CONTENT_URI;
    }

    public static String[] p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37607bb6", new Object[0]);
        }
        if (v82.c.F()) {
            if (Build.VERSION.SDK_INT >= 33) {
                return new String[]{xyl.READ_MEDIA_IMAGES};
            }
            return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
        } else if (f82.d().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
            return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
        } else {
            return new String[]{xyl.READ_MEDIA_IMAGES};
        }
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77ed4783", new Object[0])).booleanValue();
        }
        if (v82.c.F()) {
            if (Build.VERSION.SDK_INT >= 29) {
                return true;
            }
            return false;
        } else if (f82.d().getApplicationInfo().targetSdkVersion < 29 || Build.VERSION.SDK_INT < 29) {
            return false;
        } else {
            return true;
        }
    }

    public final void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.b == null) {
            this.d = new Handler(Looper.getMainLooper());
            this.b = new a(this.d, context);
        }
    }

    public final boolean e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis - j < 0) {
            j /= 1000;
        }
        if (currentTimeMillis - j > 5) {
            return false;
        }
        return true;
    }

    public final boolean f(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("579fc4c3", new Object[]{this, context, strArr})).booleanValue();
        }
        if (!(Build.VERSION.SDK_INT < 23 || context == null || strArr == null)) {
            for (String str : strArr) {
                if (ContextCompat.checkSelfPermission(context, str) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : g) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.b == null || this.c == null) {
            Application d = f82.d();
            this.c = d;
            d(d);
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fc5b66", new Object[]{this});
        } else if (v82.h("enableListenScreenShot", true)) {
            q();
            this.c.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.b);
            this.c.getContentResolver().registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, this.b);
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330f983f", new Object[]{this});
        } else if (v82.h("enableListenScreenShot", true)) {
            q();
            this.c.getContentResolver().unregisterContentObserver(this.b);
        }
    }

    public final boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (!str.toLowerCase().contains("tencent") && !str.toLowerCase().contains("qq") && !str.toLowerCase().contains(tn1.KEY_SHARE_CONFIG_WEIXIN) && !str.toLowerCase().contains("wechat"))) {
            return l(str);
        }
        return false;
    }

    static {
        t2o.a(404750525);
    }
}
