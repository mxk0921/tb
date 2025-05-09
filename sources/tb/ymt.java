package tb;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import androidx.core.view.GravityCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.weex.common.Constants;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ymt extends jfw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_VALUE = -1;
    public static final float S0 = s6o.c(o.J(), 14);
    public String A0;
    public int B0;
    public int G0;
    public CharSequence I0;
    public boolean J0;
    public String K0;
    public String L0;
    public String N0;
    public Typeface O0;
    public int y0;
    public boolean z0;
    public float w0 = S0;
    public int x0 = 16;
    public int C0 = 1;
    public int D0 = 1;
    public int E0 = Integer.MAX_VALUE;
    public TextUtils.TruncateAt F0 = TextUtils.TruncateAt.END;
    public int H0 = 0;
    public int M0 = -1;
    public boolean P0 = false;
    public int Q0 = 0;
    public boolean R0 = true;

    static {
        t2o.a(503317349);
    }

    public static ymt L(n nVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ymt) ipChange.ipc$dispatch("534348a1", new Object[]{nVar, context, str});
        }
        HashMap hashMap = new HashMap();
        ymt ymtVar = new ymt();
        ymtVar.E(nVar);
        if (str != null) {
            for (String str2 : nwv.G(str, ';')) {
                String[] G = nwv.G(str2, f7l.CONDITION_IF_MIDDLE);
                if (G != null && G.length == 2) {
                    hashMap.put(G[0].trim(), G[1].trim());
                }
            }
        }
        ymtVar.B(context, hashMap);
        return ymtVar;
    }

    public static /* synthetic */ Object ipc$super(ymt ymtVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -998046064) {
            super.B((Context) objArr[0], (HashMap) objArr[1]);
            return null;
        } else if (hashCode == 304082841) {
            ymtVar.a((jfw) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/resolver/viewparam/TextViewParams");
        }
    }

    @Override // tb.jfw
    public void B(Context context, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4830690", new Object[]{this, context, hashMap});
            return;
        }
        if (hashMap != null) {
            this.L0 = (String) hashMap.get("trim");
        }
        super.B(context, hashMap);
        if (this.F0 == null && !hashMap.containsKey(pg1.ATOM_EXT_UDL_text_align) && !hashMap.containsKey(Constants.Name.ALIGN)) {
            this.x0 = GravityCompat.START;
        }
        n nVar = this.u0;
        if (nVar != null && TextUtils.equals(nVar.r0(), "marquee")) {
            this.F0 = TextUtils.TruncateAt.MARQUEE;
        }
        this.O0 = fru.c(context, this.N0, this.A0, this.J0, this.z0);
    }

    public final SpannableString I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("6bdb64e9", new Object[]{this, str});
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new jva(this.G0), 0, str.length(), 17);
        return spannableString;
    }

    public CharSequence J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("412d3946", new Object[]{this, str});
        }
        if (str == null) {
            str = "";
        }
        if (this.G0 > 0) {
            return I(str);
        }
        return str;
    }

    public void K(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4511c4d", new Object[]{this, context, obj});
        } else {
            this.C0 = ir2.f(context, 0, d("color", obj), h(), j());
        }
    }

    @Override // tb.jfw
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5da34c9", new Object[]{this});
        }
        CharSequence charSequence = this.I0;
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    @Override // tb.jfw
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("568c34b0", new Object[]{this})).intValue();
        }
        CharSequence charSequence = this.I0;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011b, code lost:
        if (r10.equals("render-mode") == false) goto L_0x0027;
     */
    @Override // tb.jfw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(android.content.Context r9, java.lang.String r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ymt.v(android.content.Context, java.lang.String, java.lang.Object):void");
    }
}
