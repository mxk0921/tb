package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaType;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eyh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f18888a;
    public int b = 0;
    public String c;
    public byte[] d;
    public String e;
    public MaType f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int[] k;
    public int[] l;

    static {
        t2o.a(760217793);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MaWapperResult [type=" + this.f18888a + ", subType=" + this.b + ", strCode=" + this.c + ", decodeBytes=" + Arrays.toString(this.d) + ", hiddenData=" + this.e + "]";
    }
}
