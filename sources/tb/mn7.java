package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_CONST_LEN = 255;
    public static final int MAX_MTHNAME_LEN = 255;
    public static final int MAX_VARNAME_LEN = 255;
    public static final char TokenCMA = ',';
    public static final char TokenDLR = '@';
    public static final char TokenESC = '\\';
    public static final char TokenLBR = '{';
    public static final char TokenLPR = '(';
    public static final char TokenRBR = '}';
    public static final char TokenRPR = ')';
    public static final char TokenSEM = ';';
    public static final char TokenSQ = '\'';

    /* renamed from: a  reason: collision with root package name */
    public static final boolean[][] f24163a = {new boolean[]{false, true, false, false, false, false, true, false, false, false, false, false, false, false, true}, new boolean[]{false, false, true, false, false, false, false, false, false, false, false, false, false, false, true}, new boolean[]{false, false, true, true, false, false, false, false, false, false, false, false, false, false, true}, new boolean[]{false, true, false, false, true, false, true, false, false, false, false, true, false, false, true}, new boolean[]{false, false, false, false, true, true, false, false, false, true, false, false, false, false, true}, new boolean[]{false, false, false, false, false, true, false, false, false, true, true, false, true, true, true}, new boolean[]{false, false, false, false, false, false, false, true, true, false, false, false, false, false, true}, new boolean[]{false, false, false, false, false, false, false, true, true, false, false, false, false, false, true}, new boolean[]{false, false, false, false, false, true, false, false, false, true, true, false, false, true, true}, new boolean[]{false, true, false, false, true, false, true, false, false, false, false, true, false, false, true}, new boolean[]{false, true, false, false, false, false, true, false, false, false, false, false, false, false, true}, new boolean[]{false, true, false, false, false, false, true, false, false, false, false, false, false, false, true}, new boolean[]{false, false, false, false, false, true, false, false, false, true, false, false, false, true, true}, new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, true}};
    public static final char[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final char[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final int kNumTokens = 14;

    static {
        t2o.a(444596308);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0287 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<java.util.List, java.util.List> a(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mn7.a(java.lang.String):android.util.Pair");
    }
}
