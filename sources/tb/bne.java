package tb;

import android.text.SpannableString;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.richtext.RichText;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bne extends j02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CharSequence s = " i ";
    public int n;
    public int o;
    public int p;
    public int q;
    public String r;

    static {
        t2o.a(986710211);
    }

    public bne(RichText richText) {
        super(richText);
    }

    public static /* synthetic */ Object ipc$super(bne bneVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -73052492) {
            super.r((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 243998757) {
            return super.b();
        } else {
            if (hashCode == 831608868) {
                super.s((String) objArr[0], (String) objArr[1]);
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_uikit/widget/richtext/node/ImageNode");
        }
    }

    @Override // tb.j02
    public CharSequence b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("e8b2025", new Object[]{this});
        }
        if (TextUtils.isEmpty(m())) {
            B(s);
        }
        return super.b();
    }

    @Override // tb.j02
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c819e12f", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.j02
    public void q(SpannableString spannableString, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a4be97", new Object[]{this, spannableString, new Integer(i)});
            return;
        }
        nre nreVar = new nre(this.n, this.o, this.p, this.q, this.r);
        spannableString.setSpan(nreVar, i, g().length() + i, 33);
        this.l.addImageSpan(nreVar);
    }

    @Override // tb.j02
    public void r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba54eb4", new Object[]{this, str, str2});
            return;
        }
        super.r(str, str2);
        str.hashCode();
        if (str.equals("src")) {
            this.r = str2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r7.equals("marginRight") == false) goto L_0x0026;
     */
    @Override // tb.j02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = tb.bne.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "31915824"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r1] = r7
            r3[r0] = r8
            r4.ipc$dispatch(r5, r3)
            return
        L_0x0018:
            super.s(r7, r8)
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1221029593: goto L_0x004a;
                case 113126854: goto L_0x003e;
                case 975087886: goto L_0x0034;
                case 1970934485: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r0 = -1
            goto L_0x0054
        L_0x0028:
            java.lang.String r0 = "marginLeft"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0032
            goto L_0x0026
        L_0x0032:
            r0 = 3
            goto L_0x0054
        L_0x0034:
            java.lang.String r1 = "marginRight"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0054
            goto L_0x0026
        L_0x003e:
            java.lang.String r0 = "width"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0048
            goto L_0x0026
        L_0x0048:
            r0 = 1
            goto L_0x0054
        L_0x004a:
            java.lang.String r0 = "height"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0053
            goto L_0x0026
        L_0x0053:
            r0 = 0
        L_0x0054:
            switch(r0) {
                case 0: goto L_0x0097;
                case 1: goto L_0x0082;
                case 2: goto L_0x006d;
                case 3: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x00ab
        L_0x0058:
            com.taobao.android.weex_uikit.widget.richtext.RichText r7 = r6.l
            com.taobao.android.weex_framework.MUSDKInstance r7 = r7.getInstance()
            float r7 = r7.getRpxPerRem()
            float r7 = tb.fxh.f(r8, r7)
            int r7 = java.lang.Math.round(r7)
            r6.p = r7
            goto L_0x00ab
        L_0x006d:
            com.taobao.android.weex_uikit.widget.richtext.RichText r7 = r6.l
            com.taobao.android.weex_framework.MUSDKInstance r7 = r7.getInstance()
            float r7 = r7.getRpxPerRem()
            float r7 = tb.fxh.f(r8, r7)
            int r7 = java.lang.Math.round(r7)
            r6.q = r7
            goto L_0x00ab
        L_0x0082:
            com.taobao.android.weex_uikit.widget.richtext.RichText r7 = r6.l
            com.taobao.android.weex_framework.MUSDKInstance r7 = r7.getInstance()
            float r7 = r7.getRpxPerRem()
            float r7 = tb.fxh.f(r8, r7)
            int r7 = java.lang.Math.round(r7)
            r6.n = r7
            goto L_0x00ab
        L_0x0097:
            com.taobao.android.weex_uikit.widget.richtext.RichText r7 = r6.l
            com.taobao.android.weex_framework.MUSDKInstance r7 = r7.getInstance()
            float r7 = r7.getRpxPerRem()
            float r7 = tb.fxh.f(r8, r7)
            int r7 = java.lang.Math.round(r7)
            r6.o = r7
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bne.s(java.lang.String, java.lang.String):void");
    }
}
