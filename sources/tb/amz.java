package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class amz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737096);
    }

    public static final d3z a(cmz cmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d3z) ipChange.ipc$dispatch("d8482439", new Object[]{cmzVar});
        }
        if (cmzVar == null) {
            return null;
        }
        return cmzVar.a();
    }

    public static final boolean b(cmz cmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf24effb", new Object[]{cmzVar})).booleanValue();
        }
        if (cmzVar == null) {
            return true;
        }
        return cmzVar.b();
    }

    public static final cmz c(jaz jazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cmz) ipChange.ipc$dispatch("1abcbc42", new Object[]{jazVar});
        }
        ckf.g(jazVar, "<this>");
        ofz a2 = jazVar.a();
        if (a2 instanceof cmz) {
            return (cmz) a2;
        }
        return null;
    }

    public static final float d(cmz cmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("791a82dc", new Object[]{cmzVar})).floatValue();
        }
        if (cmzVar == null) {
            return 0.0f;
        }
        return cmzVar.c();
    }

    public static final boolean e(cmz cmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82f9b98", new Object[]{cmzVar})).booleanValue();
        }
        d3z a2 = a(cmzVar);
        if (a2 == null) {
            return false;
        }
        return a2.c();
    }
}
