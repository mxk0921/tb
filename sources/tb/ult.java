package tb;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.widget.FontDO;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ult {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f29476a;
    public final Map<String, WeakReference<Typeface>> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ TextPaint e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;
        public final /* synthetic */ String h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ d j;
        public final /* synthetic */ CountDownLatch k;

        public a(String str, TextPaint textPaint, int i, int i2, String str2, boolean z, d dVar, CountDownLatch countDownLatch) {
            this.d = str;
            this.e = textPaint;
            this.f = i;
            this.g = i2;
            this.h = str2;
            this.i = z;
            this.j = dVar;
            this.k = countDownLatch;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/text/TextManager$1");
        }

        @Override // tb.yio
        public void d(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else {
                this.k.countDown();
            }
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            Typeface a2 = ult.a(ult.this, this.d);
            if (a2 == null && (a2 = rmt.d(this.e, this.f, this.g, this.h)) != null && this.i) {
                ult.b(ult.this, this.d, a2);
            }
            d.b(this.j, a2);
            this.k.countDown();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ String g;
        public final /* synthetic */ boolean h;
        public final /* synthetic */ d i;
        public final /* synthetic */ CountDownLatch j;

        public b(String str, int i, int i2, String str2, boolean z, d dVar, CountDownLatch countDownLatch) {
            this.d = str;
            this.e = i;
            this.f = i2;
            this.g = str2;
            this.h = z;
            this.i = dVar;
            this.j = countDownLatch;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/text/TextManager$2");
        }

        @Override // tb.yio
        public void d(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else {
                this.j.countDown();
            }
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            Typeface a2 = ult.a(ult.this, this.d);
            if (a2 == null && (a2 = rmt.c(this.e, this.f, this.g)) != null && this.h) {
                ult.b(ult.this, this.d, a2);
            }
            d.b(this.i, a2);
            this.j.countDown();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ult f29477a = new ult(null);

        static {
            t2o.a(986710271);
        }

        public static /* synthetic */ ult a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ult) ipChange.ipc$dispatch("915ff758", new Object[0]);
            }
            return f29477a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public volatile Typeface f29478a;

        static {
            t2o.a(986710272);
        }

        public d() {
        }

        public static /* synthetic */ Typeface a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Typeface) ipChange.ipc$dispatch("916b289", new Object[]{dVar});
            }
            return dVar.f29478a;
        }

        public static /* synthetic */ Typeface b(d dVar, Typeface typeface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Typeface) ipChange.ipc$dispatch("6fb17647", new Object[]{dVar, typeface});
            }
            dVar.f29478a = typeface;
            return typeface;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        t2o.a(986710268);
    }

    public /* synthetic */ ult(a aVar) {
        this();
    }

    public static /* synthetic */ Typeface a(ult ultVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("ef7d5d15", new Object[]{ultVar, str});
        }
        return ultVar.g(str);
    }

    public static /* synthetic */ void b(ult ultVar, String str, Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b623e08", new Object[]{ultVar, str, typeface});
        } else {
            ultVar.c(str, typeface);
        }
    }

    public static String e(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d52c78a5", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        return f(str, i, i2, 0);
    }

    public static String f(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11e18498", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        return str + o.b + i3 + "s" + i + "w" + i2;
    }

    public static ult h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ult) ipChange.ipc$dispatch("2858632", new Object[0]);
        }
        return c.a();
    }

    public final void c(String str, Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4365214", new Object[]{this, str, typeface});
        } else {
            ((ConcurrentHashMap) this.b).put(str, new WeakReference(typeface));
        }
    }

    public void d(TextPaint textPaint, String str, int i, int i2) {
        int i3;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e72f85", new Object[]{this, textPaint, str, new Integer(i), new Integer(i2)});
        } else if (TextUtils.isEmpty(str)) {
            rmt.a(textPaint, i2, i, str);
        } else {
            Typeface typeface = textPaint.getTypeface();
            if (typeface == null) {
                i3 = 0;
            } else {
                i3 = typeface.getStyle();
            }
            d dVar = new d(null);
            String f = f(str, i, i2, i3);
            Typeface g = g(f);
            if (g != null) {
                d.b(dVar, g);
            } else {
                FontDO e = pu9.g().e(str);
                if (e == null || e.e() != null) {
                    z = true;
                } else {
                    z = false;
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                this.f29476a.post(new a(f, textPaint, i, i2, str, z, dVar, countDownLatch));
                try {
                    countDownLatch.await(1L, TimeUnit.SECONDS);
                } catch (Throwable th) {
                    dwh.i(th);
                }
            }
            textPaint.setTypeface(d.a(dVar));
        }
    }

    public final Typeface g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("b8cf8513", new Object[]{this, str});
        }
        WeakReference weakReference = (WeakReference) ((ConcurrentHashMap) this.b).get(str);
        if (weakReference != null) {
            return (Typeface) weakReference.get();
        }
        return null;
    }

    public Typeface i(String str, int i, int i2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("df6e0834", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        if (TextUtils.isEmpty(str)) {
            return rmt.c(i, i2, null);
        }
        d dVar = new d(null);
        String e = e(str, i, i2);
        Typeface g = g(e);
        if (g != null) {
            d.b(dVar, g);
        } else {
            FontDO e2 = pu9.g().e(str);
            if (e2 == null || e2.e() != null) {
                z = true;
            } else {
                z = false;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f29476a.post(new b(e, i, i2, str, z, dVar, countDownLatch));
            try {
                countDownLatch.await(1L, TimeUnit.SECONDS);
            } catch (Throwable th) {
                dwh.i(th);
            }
        }
        return d.a(dVar);
    }

    public ult() {
        this.f29476a = new Handler(Looper.getMainLooper());
        this.b = new ConcurrentHashMap();
    }
}
