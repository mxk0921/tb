package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.R;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class l2k extends com.taobao.tao.welcome.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int d;
    public final int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/welcome/NewWebProvisionDialog$1");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                return;
            }
            super.updateDrawState(textPaint);
            textPaint.setColor(gt9.COLOR_UNFOLLOW_DEFAULT);
            textPaint.setUnderlineText(false);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                Uri build = Uri.parse(view.getResources().getString(R.string.privacy_url_protocol)).buildUpon().appendQueryParameter(MspGlobalDefine.LANG, Locale.getDefault().getLanguage()).build();
                Bundle bundle = new Bundle();
                bundle.putBoolean("viewMode", true);
                l2k.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://privacypolicy.m.taobao.com/index.htm")).setPackage(TaoHelper.getPackageName()).putExtra("params", bundle).putExtra("url", build.toString()).addFlags(268435456));
            } catch (Exception unused) {
                Toast.makeText(l2k.this.getContext(), R.string.toast_browser_not_installed, 1).show();
            }
        }
    }

    static {
        t2o.a(734003229);
    }

    public l2k(Context context, String str, int[] iArr, int[] iArr2) {
        this(context, str, 0, 0, iArr, iArr2);
    }

    public static /* synthetic */ Object ipc$super(l2k l2kVar, String str, Object... objArr) {
        if (str.hashCode() == -1657530690) {
            super.c();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/welcome/NewWebProvisionDialog");
    }

    @Override // com.taobao.tao.welcome.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3416be", new Object[]{this});
            return;
        }
        super.c();
        TextView textView = (TextView) e(R.id.provision_title_text);
        int i = this.d;
        if (i != 0) {
            textView.setText(i);
        }
        int i2 = R.id.provision_content_text;
        TextView textView2 = (TextView) e(i2);
        int i3 = this.e;
        if (i3 != 0) {
            textView2.setText(i3);
        }
        CharSequence text = textView2.getText();
        String charSequence = text.toString();
        String string = getContext().getString(R.string.privacy_anchor_tag);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        int indexOf = charSequence.indexOf(string);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new a(), indexOf, string.length() + indexOf, 33);
            TextView textView3 = (TextView) e(i2);
            textView3.setText(spannableStringBuilder);
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public l2k(Context context, String str, int i, int i2, int[] iArr, int[] iArr2) {
        super(context, str, iArr, iArr2);
        this.d = i;
        this.e = i2;
    }
}
