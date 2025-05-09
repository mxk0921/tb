package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final o6o f17174a = new o6o();
    public static final dd9 b = new dd9();
    public static final alo c = new alo();
    public static final hd1 d = new hd1();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17175a;
        public final /* synthetic */ DinamicTemplate b;
        public final /* synthetic */ long c;
        public final /* synthetic */ boolean d;

        public a(String str, DinamicTemplate dinamicTemplate, long j, boolean z) {
            this.f17175a = str;
            this.b = dinamicTemplate;
            this.c = j;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (tl7.f()) {
                ym7.a(tl7.TAG, "module=" + this.f17175a + "read File=" + this.b + (((float) this.c) / 1000000.0d));
            }
            f65.n().d().i(this.f17175a, this.b, this.d, null, this.c / 1000000.0d);
        }
    }

    static {
        t2o.a(444596352);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.xmlpull.v1.XmlPullParser a(java.lang.String r7, com.taobao.android.dinamic.tempate.DinamicTemplate r8, tb.tfw r9) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.cn7.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001b
            java.lang.String r3 = "47d329ba"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r7
            r4[r0] = r8
            r7 = 2
            r4[r7] = r9
            java.lang.Object r7 = r2.ipc$dispatch(r3, r4)
            org.xmlpull.v1.XmlPullParser r7 = (org.xmlpull.v1.XmlPullParser) r7
            return r7
        L_0x001b:
            boolean r2 = tb.tl7.f()
            if (r2 == 0) goto L_0x002e
            tb.alo r2 = tb.cn7.c
            boolean r3 = r2.c(r8)
            if (r3 == 0) goto L_0x002e
            org.xmlpull.v1.XmlPullParser r2 = r2.d(r7, r8, r9)
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            long r3 = java.lang.System.nanoTime()
            boolean r5 = r8.isPreset()
            if (r5 != 0) goto L_0x004c
            tb.dd9 r2 = tb.cn7.b
            org.xmlpull.v1.XmlPullParser r9 = r2.c(r7, r8, r9)
            if (r9 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            long r1 = java.lang.System.nanoTime()
            long r1 = r1 - r3
            b(r7, r8, r0, r1)
            return r9
        L_0x004c:
            if (r2 != 0) goto L_0x0054
            tb.o6o r2 = tb.cn7.f17174a
            org.xmlpull.v1.XmlPullParser r2 = r2.b(r7, r8, r9)
        L_0x0054:
            if (r2 != 0) goto L_0x005c
            tb.hd1 r2 = tb.cn7.d
            org.xmlpull.v1.XmlPullParser r2 = r2.c(r7, r8, r9)
        L_0x005c:
            if (r2 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 - r3
            b(r7, r8, r0, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cn7.a(java.lang.String, com.taobao.android.dinamic.tempate.DinamicTemplate, tb.tfw):org.xmlpull.v1.XmlPullParser");
    }

    public static void b(String str, DinamicTemplate dinamicTemplate, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f74ec061", new Object[]{str, dinamicTemplate, new Boolean(z), new Long(j)});
        } else if (f65.n().d() != null && zm7.a()) {
            zm7.b.a(new a(str, dinamicTemplate, j, z));
        }
    }
}
