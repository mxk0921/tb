package tb;

import android.app.Application;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class h8h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f20470a;
    public long b;
    public Uri c;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends ContentObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Handler handler) {
            super(handler);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1546015465) {
                super.onChange(((Boolean) objArr[0]).booleanValue(), (Uri) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/LocalImageManager$1");
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c2652e9", new Object[]{this, new Boolean(z), uri});
                return;
            }
            super.onChange(z, uri);
            if (uri != null) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments == null || pathSegments.size() <= 0 || !h8h.a(h8h.this, pathSegments.get(0))) {
                    h8h.b(h8h.this, null);
                } else {
                    h8h.b(h8h.this, uri);
                }
            } else {
                h8h.b(h8h.this, null);
            }
            h8h.c(h8h.this, System.currentTimeMillis());
            h8h.d(h8h.this, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final h8h f20472a = new h8h(null);

        static {
            t2o.a(481296401);
        }

        public static /* synthetic */ h8h a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h8h) ipChange.ipc$dispatch("53e6141f", new Object[0]);
            }
            return f20472a;
        }
    }

    static {
        t2o.a(481296399);
    }

    public /* synthetic */ h8h(a aVar) {
        this();
    }

    public static /* synthetic */ boolean a(h8h h8hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32fbba48", new Object[]{h8hVar, str})).booleanValue();
        }
        return h8hVar.i(str);
    }

    public static /* synthetic */ Uri b(h8h h8hVar, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("686d52a1", new Object[]{h8hVar, uri});
        }
        h8hVar.c = uri;
        return uri;
    }

    public static /* synthetic */ long c(h8h h8hVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f56cafa", new Object[]{h8hVar, new Long(j)})).longValue();
        }
        h8hVar.b = j;
        return j;
    }

    public static /* synthetic */ boolean d(h8h h8hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5100ad39", new Object[]{h8hVar, new Boolean(z)})).booleanValue();
        }
        h8hVar.f20470a = z;
        return z;
    }

    public static h8h e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h8h) ipChange.ipc$dispatch("de5f6b05", new Object[0]);
        }
        return b.a();
    }

    public Uri f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("873547b", new Object[]{this});
        }
        return this.c;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ad8e2ec", new Object[]{this})).booleanValue();
        }
        if (this.f20470a && (System.currentTimeMillis() - this.b) / 1000 <= lvm.b) {
            return true;
        }
        return false;
    }

    public void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (this.d || lg4.p4()) {
        } else {
            if (context instanceof Application) {
                this.d = true;
                context.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new a(new Handler(Looper.getMainLooper())));
                return;
            }
            throw new RuntimeException("context should be application");
        }
    }

    public final boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f802b1a3", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f20470a = false;
        this.c = null;
        this.b = 0L;
    }

    public h8h() {
        this.d = false;
    }
}
