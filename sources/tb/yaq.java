package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yaq extends j02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String n;

    static {
        t2o.a(986710212);
    }

    public yaq(RichText richText) {
        super(richText);
    }

    public static /* synthetic */ Object ipc$super(yaq yaqVar, String str, Object... objArr) {
        if (str.hashCode() == 831608868) {
            super.s((String) objArr[0], (String) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/richtext/node/SpanNode");
    }

    @Override // tb.j02
    public void s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31915824", new Object[]{this, str, str2});
            return;
        }
        super.s(str, str2);
        str.hashCode();
        if (str.equals("textDecoration")) {
            this.n = str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    @Override // tb.j02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(android.text.SpannableString r4, int r5) {
        /*
            r3 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.yaq.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001d
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r5)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r0] = r3
            r0 = 1
            r5[r0] = r4
            r4 = 2
            r5[r4] = r2
            java.lang.String r4 = "28a4be97"
            r1.ipc$dispatch(r4, r5)
            return
        L_0x001d:
            java.lang.CharSequence r1 = r3.g()
            if (r1 != 0) goto L_0x0024
            goto L_0x002c
        L_0x0024:
            java.lang.CharSequence r0 = r3.g()
            int r0 = r0.length()
        L_0x002c:
            int r0 = r0 + r5
            r3.o(r4, r5, r0)
            java.lang.String r1 = r3.n
            if (r1 == 0) goto L_0x0056
            r1.hashCode()
            java.lang.String r2 = "line-through"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0050
            java.lang.String r2 = "underline"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x004a
            goto L_0x0056
        L_0x004a:
            android.text.style.UnderlineSpan r1 = new android.text.style.UnderlineSpan
            r1.<init>()
            goto L_0x0057
        L_0x0050:
            android.text.style.StrikethroughSpan r1 = new android.text.style.StrikethroughSpan
            r1.<init>()
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            if (r1 == 0) goto L_0x005e
            r2 = 33
            r4.setSpan(r1, r5, r0, r2)
        L_0x005e:
            r3.p(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yaq.q(android.text.SpannableString, int):void");
    }

    @Override // tb.j02
    public CharSequence b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("e8b2025", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        List<j02> list = this.k;
        if (list != null && ((ArrayList) list).size() > 0) {
            Iterator it = ((ArrayList) this.k).iterator();
            while (it.hasNext()) {
                sb.append(((j02) it.next()).b());
            }
        } else if (!TextUtils.isEmpty(m())) {
            if (pg1.ATOM_EXT_UDL_break_all.equals(n())) {
                CharSequence m = m();
                for (int i = 0; i < m.length(); i++) {
                    sb.append(m.charAt(i));
                    sb.append("\u200b");
                }
            } else {
                sb.append(m());
            }
        }
        v(sb.toString());
        return g();
    }
}
