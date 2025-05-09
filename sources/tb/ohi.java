package tb;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ohi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f25393a;
    public final g1a<? super String, xhv> b;
    public final Handler c;
    public String d;
    public final boolean e;
    public final ContentObserver f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends ContentObserver {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/util/MediaUpdateObserver$observer$1");
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        @Override // android.database.ContentObserver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onChange(boolean r5, android.net.Uri r6) {
            /*
                r4 = this;
                r0 = 1
                com.android.alibaba.ip.runtime.IpChange r1 = tb.ohi.a.$ipChange
                boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r2 == 0) goto L_0x001d
                java.lang.Boolean r2 = new java.lang.Boolean
                r2.<init>(r5)
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r3 = 0
                r5[r3] = r4
                r5[r0] = r2
                r0 = 2
                r5[r0] = r6
                java.lang.String r6 = "5c2652e9"
                r1.ipc$dispatch(r6, r5)
                return
            L_0x001d:
                super.onChange(r5, r6)
                if (r6 != 0) goto L_0x0023
                return
            L_0x0023:
                java.util.List r5 = r6.getPathSegments()
                if (r5 == 0) goto L_0x004d
                int r1 = r5.size()
                if (r1 <= 0) goto L_0x004d
                tb.ohi r1 = tb.ohi.this
                int r2 = r5.size()
                int r2 = r2 - r0
                java.lang.Object r5 = r5.get(r2)
                java.lang.String r0 = "segments[segments.size - 1]"
                tb.ckf.f(r5, r0)
                java.lang.String r5 = (java.lang.String) r5
                boolean r5 = tb.ohi.b(r1, r5)
                if (r5 == 0) goto L_0x004d
                java.lang.String r5 = r6.toString()
                goto L_0x004e
            L_0x004d:
                r5 = 0
            L_0x004e:
                if (r5 != 0) goto L_0x0051
                return
            L_0x0051:
                tb.ohi r6 = tb.ohi.this
                java.lang.String r6 = tb.ohi.a(r6)
                boolean r6 = tb.ckf.b(r6, r5)
                if (r6 == 0) goto L_0x005e
                return
            L_0x005e:
                tb.ohi r6 = tb.ohi.this
                tb.ohi.c(r6, r5)
                tb.ohi r5 = tb.ohi.this
                tb.g1a r5 = r5.d()
                if (r5 != 0) goto L_0x006c
                goto L_0x0079
            L_0x006c:
                tb.ohi r6 = tb.ohi.this
                java.lang.String r6 = tb.ohi.a(r6)
                if (r6 != 0) goto L_0x0076
                java.lang.String r6 = ""
            L_0x0076:
                r5.invoke(r6)
            L_0x0079:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.ohi.a.onChange(boolean, android.net.Uri):void");
        }
    }

    static {
        t2o.a(481297623);
    }

    public ohi(boolean z, g1a<? super String, xhv> g1aVar) {
        this.f25393a = z;
        this.b = g1aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.c = handler;
        this.e = lg4.o4();
        this.f = new a(handler);
    }

    public static final /* synthetic */ String a(ohi ohiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c80d384e", new Object[]{ohiVar});
        }
        return ohiVar.d;
    }

    public static final /* synthetic */ boolean b(ohi ohiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74fb03b5", new Object[]{ohiVar, str})).booleanValue();
        }
        return ohiVar.e(str);
    }

    public static final /* synthetic */ void c(ohi ohiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab797e8", new Object[]{ohiVar, str});
        } else {
            ohiVar.d = str;
        }
    }

    public final g1a<String, xhv> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("95963282", new Object[]{this});
        }
        return this.b;
    }

    public final boolean e(String str) {
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

    public final void f(Activity activity) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4f257c", new Object[]{this, activity});
        } else if (this.e && activity != null) {
            ContentResolver contentResolver = activity.getContentResolver();
            if (this.f25393a) {
                uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else {
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            }
            contentResolver.registerContentObserver(uri, true, this.f);
        }
    }

    public final void g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c564dd5", new Object[]{this, activity});
        } else if (this.e && activity != null) {
            activity.getContentResolver().unregisterContentObserver(this.f);
            this.c.removeCallbacksAndMessages(null);
        }
    }

    public /* synthetic */ ohi(boolean z, g1a g1aVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? true : z, g1aVar);
    }
}
