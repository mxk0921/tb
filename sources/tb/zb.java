package tb;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.richtext.RichText;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zb extends j02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String n;
    public String o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1038128277) {
                super.updateDrawState((TextPaint) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/richtext/node/ANode$1");
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pseudoRef", (Object) zb.G(zb.this));
            if (!zb.H(zb.this).getInstance().isDestroyed()) {
                zb.J(zb.this).getInstance().fireEventOnNode(zb.I(zb.this).getNodeId(), "itemclick", jSONObject);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                return;
            }
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    static {
        t2o.a(986710208);
    }

    public zb(RichText richText) {
        super(richText);
    }

    public static /* synthetic */ String G(zb zbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1777743", new Object[]{zbVar});
        }
        return zbVar.o;
    }

    public static /* synthetic */ RichText H(zb zbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RichText) ipChange.ipc$dispatch("347bcbcb", new Object[]{zbVar});
        }
        return zbVar.l;
    }

    public static /* synthetic */ RichText I(zb zbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RichText) ipChange.ipc$dispatch("93eba6aa", new Object[]{zbVar});
        }
        return zbVar.l;
    }

    public static /* synthetic */ RichText J(zb zbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RichText) ipChange.ipc$dispatch("f35b8189", new Object[]{zbVar});
        }
        return zbVar.l;
    }

    public static /* synthetic */ Object ipc$super(zb zbVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -73052492) {
            super.r((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 831608868) {
            super.s((String) objArr[0], (String) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_uikit/widget/richtext/node/ANode");
        }
    }

    @Override // tb.j02
    public void q(SpannableString spannableString, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a4be97", new Object[]{this, spannableString, new Integer(i)});
            return;
        }
        if (!TextUtils.isEmpty(this.n)) {
            a aVar = new a();
            this.l.addClickSpan(aVar);
            spannableString.setSpan(aVar, i, g().length() + i, 33);
        }
        o(spannableString, i, g().length() + i);
        p(spannableString, i);
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
        if (str.equals(Constants.Name.HREF)) {
            this.n = str2;
        } else if (str.equals("pseudoRef")) {
            this.o = str2;
        }
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
        if (str.equals(Constants.Name.HREF)) {
            this.n = str2;
        } else if (str.equals("pseudoRef")) {
            this.o = str2;
        }
    }
}
