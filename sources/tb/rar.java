package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rar implements jwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final evb f27237a = new w46();
    public final evb b = new d36();
    public final evb c = new fn5();
    public final evb d = new nr5();
    public final evb e = new or5();
    public final evb f = new ll5();

    @Override // tb.jwb
    public evb get(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (evb) ipChange.ipc$dispatch("ac447d9e", new Object[]{this, new Long(j)});
        }
        if (j == w46.DX_PARSER_MTOPTIMESTAMP) {
            return this.f27237a;
        }
        if (j == -3536948596548552968L) {
            return this.b;
        }
        if (j == fn5.DX_PARSER_ISI18NEDITION) {
            return this.c;
        }
        if (j == nr5.DX_PARSER_TAOBAO_THEME_GET_CURRENT) {
            return this.d;
        }
        if (j == or5.DX_PARSER_TAOBAO_THEME_VALID) {
            return this.e;
        }
        if (j == ll5.DX_PARSER_GETTHEMETYPE) {
            return this.f;
        }
        return null;
    }
}
