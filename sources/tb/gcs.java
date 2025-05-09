package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class gcs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final gcs INSTANCE = new gcs();

    static {
        t2o.a(843055404);
    }

    @JvmStatic
    public static final byte[] b(String str, bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b7572e70", new Object[]{str, bbsVar});
        }
        ckf.g(str, "path");
        ckf.g(bbsVar, "instance");
        if (str.length() == 0) {
            return null;
        }
        ekd ekdVar = (ekd) bbsVar.getExtension(ekd.class);
        c7o Y = ekdVar == null ? null : ekdVar.Y(str);
        if (Y != null) {
            return Y.getBytes();
        }
        ekd ekdVar2 = (ekd) bbsVar.getExtension(ekd.class);
        c7o B = ekdVar2 == null ? null : ekdVar2.B(str);
        if (B == null) {
            return null;
        }
        return B.getBytes();
    }

    @JvmStatic
    public static final boolean a(String str, bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f79a8e4d", new Object[]{str, bbsVar})).booleanValue();
        }
        ckf.g(str, "path");
        ckf.g(bbsVar, "instance");
        if (str.length() == 0) {
            return false;
        }
        ekd ekdVar = (ekd) bbsVar.getExtension(ekd.class);
        c7o c7oVar = null;
        if ((ekdVar == null ? null : ekdVar.Y(str)) != null) {
            return true;
        }
        ekd ekdVar2 = (ekd) bbsVar.getExtension(ekd.class);
        if (ekdVar2 != null) {
            c7oVar = ekdVar2.B(str);
        }
        return c7oVar != null;
    }
}
