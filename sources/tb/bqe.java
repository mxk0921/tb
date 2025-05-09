package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bqe extends jfw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOAD_MODE_ASYNC = "async";
    public static final String MODE_CONTAIN = "contain";
    public static final String MODE_COVER = "cover";
    public static final int MODE_DISABLE_LEVEL_MODEL = 256;
    public static final int MODE_DISABLE_QUALITY = 16;
    public static final int MODE_DISABLE_SHARPEN = 64;
    public static final int MODE_ENABLE_LEVEL_MODEL = 128;
    public static final int MODE_ENABLE_QUALITY = 8;
    public static final int MODE_ENABLE_SHARPEN = 32;
    public static final int MODE_ORIGINAL = 1;
    public static final int MODE_RESOLUTION = 512;
    public static final int MODE_SHORTSIDE = 2;
    public static final String MODE_STRETCH = "stretch";
    public static final int MODE_WEBP = 4;
    public int A0;
    public int B0;
    public int C0;
    public Object D0;
    public String E0;
    public String F0;
    public String G0;
    public String I0;
    public String J0;
    public int w0;
    public Object x0;
    public String y0;
    public String z0;
    public int H0 = 0;
    public boolean K0 = true;
    public boolean L0 = false;
    public int M0 = 2;

    static {
        t2o.a(503317348);
    }

    public static int I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe764cbb", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 2;
        }
        str.hashCode();
        if (str.equals("low")) {
            return 1;
        }
        if (!str.equals("high")) {
            return 2;
        }
        return 3;
    }

    public static /* synthetic */ Object ipc$super(bqe bqeVar, String str, Object... objArr) {
        if (str.hashCode() == 304082841) {
            bqeVar.a((jfw) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/resolver/viewparam/ImageViewParams");
    }

    public void J(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17f4a68", new Object[]{this, context, obj});
        } else {
            this.w0 = ir2.g(context, 1, d("tint-color", obj), h(), j(), akt.P());
        }
    }

    @Override // tb.jfw
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5da34c9", new Object[]{this});
        }
        Object obj = this.x0;
        if (obj instanceof byte[]) {
            return gpe.BIN_TAG;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        if (((String) obj).startsWith(gpe.BASE64_TAG)) {
            return gpe.BASE64_TAG;
        }
        return (String) this.x0;
    }

    @Override // tb.jfw
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("568c34b0", new Object[]{this})).intValue();
        }
        Object obj = this.x0;
        if (obj instanceof byte[]) {
            return 6;
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        if (((String) obj).startsWith(gpe.BASE64_TAG)) {
            return 10;
        }
        return ((String) this.x0).length();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012e, code lost:
        if (r14.equals("priority") == false) goto L_0x0030;
     */
    @Override // tb.jfw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(android.content.Context r13, java.lang.String r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bqe.v(android.content.Context, java.lang.String, java.lang.Object):void");
    }
}
