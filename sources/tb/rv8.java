package tb;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import com.taobao.weex.common.Constants;
import java.io.File;
import java.util.HashMap;
import tb.d23;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class rv8 implements d23.q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27630a;
    public final boolean b;
    public final int c;
    public final qv8 d;
    public final int e;
    public final int f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f27631a;
        public final /* synthetic */ byte[] b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ boolean f;

        public a(Bitmap bitmap, byte[] bArr, int i, int i2, int i3, boolean z) {
            this.f27631a = bitmap;
            this.b = bArr;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            rv8 rv8Var = rv8.this;
            rv8.b(rv8Var, this.f27631a, this.b, this.c, this.d, this.e, this.f, rv8.a(rv8Var));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements utm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f27632a;
        public final /* synthetic */ byte[] b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ boolean f;

        public b(Bitmap bitmap, byte[] bArr, int i, int i2, int i3, boolean z) {
            this.f27632a = bitmap;
            this.b = bArr;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = z;
        }

        @Override // tb.utm
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3030f401", new Object[]{this, new Integer(i), str});
                return;
            }
            agh.r("PltCamera", "FEISTakePictureTask", "detectDarkPhoto failed: errorCode=" + i + ", errorMsg=" + str);
        }

        @Override // tb.utm
        public void onPrepareSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("625fbbc2", new Object[]{this});
                return;
            }
            agh.h("FEISTakePictureTask", "detectDarkPhoto build success");
            rv8.c(rv8.this, this.f27632a, this.b, this.c, this.d, this.e, this.f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements wuc<ef2> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f27633a;
        public final /* synthetic */ byte[] b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ boolean f;

        public c(Bitmap bitmap, byte[] bArr, int i, int i2, int i3, boolean z) {
            this.f27633a = bitmap;
            this.b = bArr;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = z;
        }

        /* renamed from: a */
        public void onResult(ef2 ef2Var) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21986670", new Object[]{this, ef2Var});
                return;
            }
            agh.h("FEISTakePictureTask", "onResult " + JSON.toJSONString(ef2Var));
            if (ff2.VALUE_NORMAL_RESULT.equalsIgnoreCase(ef2Var.b())) {
                str = "正常帧";
            } else {
                rv8.d(rv8.this, this.f27633a, this.b, this.c, this.d, this.e, this.f, ef2Var);
                str = "黑帧: " + ef2Var.b();
            }
            if (caa.q()) {
                i0u.b().d(caa.c(), str);
            }
        }

        @Override // tb.wuc
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            agh.r("PltCamera", "FEISTakePictureTask", "detectDarkPhoto failed: " + agh.f("", th));
        }
    }

    static {
        t2o.a(481296869);
        t2o.a(481296866);
    }

    public rv8(qv8 qv8Var, boolean z, int i, int i2, boolean z2, int i3) {
        this.d = qv8Var;
        this.f27630a = z;
        this.e = i;
        this.f = i2;
        this.b = z2;
        this.c = i3;
    }

    public static /* synthetic */ int a(rv8 rv8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a142160", new Object[]{rv8Var})).intValue();
        }
        return rv8Var.c;
    }

    public static /* synthetic */ void b(rv8 rv8Var, Bitmap bitmap, byte[] bArr, int i, int i2, int i3, boolean z, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938ba349", new Object[]{rv8Var, bitmap, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Integer(i4)});
        } else {
            rv8Var.e(bitmap, bArr, i, i2, i3, z, i4);
        }
    }

    public static /* synthetic */ void c(rv8 rv8Var, Bitmap bitmap, byte[] bArr, int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b760b7b", new Object[]{rv8Var, bitmap, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
        } else {
            rv8Var.f(bitmap, bArr, i, i2, i3, z);
        }
    }

    public static /* synthetic */ void d(rv8 rv8Var, Bitmap bitmap, byte[] bArr, int i, int i2, int i3, boolean z, ef2 ef2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d70349", new Object[]{rv8Var, bitmap, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), ef2Var});
        } else {
            rv8Var.i(bitmap, bArr, i, i2, i3, z, ef2Var);
        }
    }

    public final void e(Bitmap bitmap, byte[] bArr, int i, int i2, int i3, boolean z, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d659c5e6", new Object[]{this, bitmap, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Integer(i4)});
            return;
        }
        try {
            if (!ff2.L().x()) {
                ff2.L().c(new b(bitmap, bArr, i, i2, i3, z), String.valueOf(i4));
            } else {
                f(bitmap, bArr, i, i2, i3, z);
            }
        } catch (Throwable unused) {
        }
    }

    public final void f(Bitmap bitmap, byte[] bArr, int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ccd20fb", new Object[]{this, bitmap, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        ff2.L().b(new df2(bitmap, 1), null, new c(bitmap, bArr, i, i2, i3, z));
        agh.r("Dynamic", "FEISTakePictureTask", "detectDarkPhoto");
    }

    public void g(byte[] bArr, int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40d687e", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
        } else if (bArr == null || i * i2 == 0) {
            this.d.a(null, false, this, z);
        } else {
            h(bArr, i, i2, i3, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r2 <= 0.1f) goto L_0x0054;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(byte[] r12, int r13, int r14, int r15, boolean r16) {
        /*
            r11 = this;
            r8 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.rv8.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x003b
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r13)
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r14)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r15)
            java.lang.Boolean r6 = new java.lang.Boolean
            r6.<init>(r7)
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r8
            r7[r0] = r12
            r0 = 2
            r7[r0] = r3
            r0 = 3
            r7[r0] = r4
            r0 = 4
            r7[r0] = r5
            r0 = 5
            r7[r0] = r6
            java.lang.String r0 = "c61c4498"
            r2.ipc$dispatch(r0, r7)
            return
        L_0x003b:
            if (r12 == 0) goto L_0x0053
            boolean r2 = r8.f27630a     // Catch: all -> 0x0052
            if (r2 == 0) goto L_0x0053
            float r2 = tb.ipe.b(r12, r13, r14)     // Catch: all -> 0x0052
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0053
            r3 = 1036831949(0x3dcccccd, float:0.1)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0053
            goto L_0x0054
        L_0x0052:
        L_0x0053:
            r0 = 0
        L_0x0054:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "cameraWidth"
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r3 = ", cameraHeight="
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = ", orientation="
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = ", front="
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = ", mViewWidth="
            r2.append(r3)
            int r3 = r8.e
            r2.append(r3)
            java.lang.String r3 = ", mViewHeight="
            r2.append(r3)
            int r3 = r8.f
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FEISTakePictureTask"
            tb.agh.h(r3, r2)
            tb.bs6$c r2 = tb.bs6.a(r12, r13, r14, r15, r16)
            tb.bs6$b r2 = (tb.bs6.b) r2
            int r3 = r8.e
            int r9 = r8.f
            tb.bs6$d r2 = r2.b(r3, r9)
            android.graphics.Bitmap r2 = r2.a()
            tb.qv8 r3 = r8.d
            if (r3 == 0) goto L_0x00cb
            if (r2 != 0) goto L_0x00b0
            r0 = 0
            r3.a(r0, r1, r11, r7)
            goto L_0x00cb
        L_0x00b0:
            r3.a(r2, r0, r11, r7)
            boolean r0 = r8.b
            if (r0 == 0) goto L_0x00cb
            java.util.concurrent.ExecutorService r9 = com.taobao.android.virtual_thread.face.VExecutors.defaultSharedThreadPool()
            tb.rv8$a r10 = new tb.rv8$a
            r0 = r10
            r1 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r9.submit(r10)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rv8.h(byte[], int, int, int, boolean):void");
    }

    public final void i(Bitmap bitmap, byte[] bArr, int i, int i2, int i3, boolean z, ef2 ef2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c23f8dc9", new Object[]{this, bitmap, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), ef2Var});
            return;
        }
        String i4 = mld.i(caa.c(), bitmap, ivv.BIZ_TYPE_DARK_DETECT);
        if (!TextUtils.isEmpty(i4)) {
            agh.h("FEISTakePictureTask", "pngFileAbsPath=" + i4);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArr) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
                sb.append(" ");
            }
            String f = mld.f(caa.c(), sb.toString().toUpperCase(), ivv.BIZ_TYPE_DARK_DETECT);
            if (TextUtils.isEmpty(f)) {
                yf9.b(i4);
                return;
            }
            agh.h("FEISTakePictureTask", "contentFileAbsPath=" + f);
            String n = mld.n(caa.c(), new String[]{i4, f}, ivv.BIZ_TYPE_DARK_DETECT);
            yf9.c(new File(f));
            yf9.c(new File(i4));
            if (!TextUtils.isEmpty(n)) {
                HashMap<String, String> hashMap = new HashMap<>(8);
                hashMap.put(ivv.LOCAL_FILE_PATH, n);
                hashMap.put("result_code", ef2Var.b());
                hashMap.put("cameraWidth", String.valueOf(i));
                hashMap.put("cameraHeight", String.valueOf(i2));
                hashMap.put("orientation", String.valueOf(i3));
                hashMap.put("front", String.valueOf(z));
                hashMap.put("viewWidth", String.valueOf(this.e));
                hashMap.put(Constants.Name.VIEW_HEIGHT, String.valueOf(this.f));
                hashMap.put("extraInfo", ef2Var.a());
                ivv.Companion.f(ivv.BIZ_TYPE_DARK_DETECT, n, hashMap, WeexZipModule.NAME);
            }
        }
    }
}
