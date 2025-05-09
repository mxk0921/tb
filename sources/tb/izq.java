package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class izq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile izq l;
    public static volatile boolean m = true;

    /* renamed from: a  reason: collision with root package name */
    public String f21668a;
    public String b;
    public String c;
    public long d = 0;
    public long e = 0;
    public long f = 0;
    public boolean g = false;
    public String h = "[\"guangguang_pick\",\"ggpick_preload\",\"homepageLiveCard\"]";
    public long i = 0;
    public int j = 30;
    public final feh k;

    static {
        t2o.a(774897961);
    }

    public izq(String str) {
        this.k = new feh(toString(), str);
    }

    public static izq i(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (izq) ipChange.ipc$dispatch("5d20c3e4", new Object[]{context, str});
        }
        if (l == null) {
            synchronized (izq.class) {
                try {
                    if (l == null) {
                        l = new izq(str);
                        l.e(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return l;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73bcf2d", new Object[]{this, new Integer(i)});
        } else {
            this.i += i * 1000;
        }
    }

    public boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e4da21c", new Object[]{this, context, str})).booleanValue();
        }
        e(context);
        if (Build.VERSION.SDK_INT < this.j) {
            this.i += 40;
            return false;
        } else if (TextUtils.isEmpty(str)) {
            this.i += 10;
            return false;
        } else if (TextUtils.isEmpty(this.h)) {
            this.i += 20;
            return false;
        } else {
            boolean n = ew0.n(str, this.h);
            if (!n) {
                this.i += 30;
            }
            return n;
        }
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ceabe33", new Object[]{this})).longValue();
        }
        return this.e + (this.i * 1000000000);
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce6309e9", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64f91dca", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a94843eb", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SURFACEVIEW_MIN_SDK_VERSION, "28"))) {
            this.i = 1L;
            return false;
        } else if (!ja1.h) {
            this.i = 2L;
            return false;
        } else if (ja1.s > 2) {
            this.i = 6L;
            return false;
        } else if (!ja1.q()) {
            this.i = 3L;
            return false;
        } else if (!ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SURFACEVIEW, "true"))) {
            this.i = 4L;
            return false;
        } else {
            this.f21668a = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_HARDWARE_H264_BLACK, "[\"m1 note\",\"PRO 7 Plus\",\"PRO 7-H\",\"OPPO A73\",\"OPPO R9tm\",\"OPPO R9sk\",\"Redmi Note 4X\" , \"JMM-AL00\", \"JMM-AL10\", \"m3 note\", \"M5 Note\", \"MEIZU M6\", \"MI NOTE LTE\", \"OPPO A37m\", \"OPPO A59m\", \"OPPO A59s\", \"OPPO A59st\", \"OPPO A59t\", \"OPPO R9km\", \"OPPO R9m\", \"OPPO R9t\", \"Redmi 6A\", \"vivi Y67\", \"vivi Y67A\", \"vivo V3M A\", \"vivo X6D\", \"vivo X6L\", \"vivo X6Plus L\", \"vivo Y67\", \"vivo Y67\", \"vivo Y67L\", \"vivo Y69A\", \"vivo Y67A\"]");
            this.b = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_HARDWARE_HEVC_BLACK, "[\"m1 note\",\"PRO 7 Plus\",\"PRO 7-H\",\"OPPO A73\",\"OPPO R9tm\",\"OPPO R9sk\",\"Redmi Note 4X\" , \"JMM-AL00\", \"JMM-AL10\", \"m3 note\", \"M5 Note\", \"MEIZU M6\", \"MI NOTE LTE\", \"OPPO A37m\", \"OPPO A59m\", \"OPPO A59s\", \"OPPO A59st\", \"OPPO A59t\", \"OPPO R9km\", \"OPPO R9m\", \"OPPO R9t\", \"Redmi 6A\", \"vivi Y67\", \"vivi Y67A\", \"vivo V3M A\", \"vivo X6D\", \"vivo X6L\", \"vivo X6Plus L\", \"vivo Y67\", \"vivo Y67\", \"vivo Y67L\", \"vivo Y69A\", \"vivo Y67A\"]");
            this.c = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_HARDWARE_HEVC_AUTHEN_BLACK, MediaConstant.DEFAULT_H265_HW_DECODE_BLACK_LIST_NEW);
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_SURFACEVIEW_MODEL_LIST, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
            String str = Build.MODEL;
            if (ew0.n(str, this.f21668a) || ew0.n(str, this.b) || ew0.n(str, this.c) || ew0.n(str, config)) {
                this.i = 5L;
                return false;
            }
            this.i = 0L;
            return true;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cedeef3c", new Object[]{this})).booleanValue();
        }
        if (ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SURFACEVIEW_IN_LIVE, "true"))) {
            return true;
        }
        this.i += 100;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5 A[Catch: all -> 0x00d5, TryCatch #3 {all -> 0x00d5, blocks: (B:40:0x00bf, B:47:0x00df, B:49:0x00e5, B:51:0x00ef, B:53:0x00fd), top: B:124:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123 A[Catch: all -> 0x0166, TryCatch #4 {all -> 0x0166, blocks: (B:55:0x011d, B:57:0x0123, B:59:0x012d, B:61:0x0135), top: B:126:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.content.Context r25) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.izq.e(android.content.Context):void");
    }
}
