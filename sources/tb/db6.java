package tb;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class db6 extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_WIDGET_ID = 3148926433692722028L;
    public static final long c = k06.a("richText");
    public static final long d = k06.a("price");

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f17704a;
    public CharSequence b;

    public static /* synthetic */ Object ipc$super(db6 db6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -732824995:
                super.onBeforeMeasure((TextView) objArr[0]);
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/view/DXRichTextViewWidgetNode");
        }
    }

    public static int t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7fcd673", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                return i;
            }
        }
        return 0;
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new db6();
    }

    @Override // tb.gi6
    public void onBeforeMeasure(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        super.onBeforeMeasure(textView);
        if (!TextUtils.isEmpty(this.f17704a)) {
            textView.setText(this.f17704a);
        } else if (!TextUtils.isEmpty(this.b)) {
            textView.setText(this.b);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        kor.a("DXRichTextViewWidgetNod", "onClone", "----");
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof db6) {
            db6 db6Var = (db6) dXWidgetNode;
            this.f17704a = db6Var.f17704a;
            this.b = db6Var.b;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!TextUtils.isEmpty(this.f17704a)) {
                textView.setText(this.f17704a);
            } else if (!TextUtils.isEmpty(this.b)) {
                textView.setText(this.b);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
            return;
        }
        super.onSetObjAttribute(j, obj);
        if (j != c) {
            return;
        }
        if (obj instanceof CharSequence) {
            this.f17704a = (CharSequence) obj;
        } else {
            this.f17704a = "";
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        super.onSetStringAttribute(j, str);
        if (j == d && str != null) {
            String trim = str.trim();
            int indexOf = trim.indexOf(46);
            SpannableString spannableString = new SpannableString(trim);
            int t = t(trim);
            try {
                spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, t, 33);
                int length = trim.length();
                if (indexOf < 0) {
                    spannableString.setSpan(new AbsoluteSizeSpan(16, true), t, length, 33);
                } else {
                    spannableString.setSpan(new AbsoluteSizeSpan(16, true), t, indexOf, 33);
                    spannableString.setSpan(new AbsoluteSizeSpan(12, true), indexOf, length, 33);
                }
                this.b = spannableString;
            } catch (Exception unused) {
                this.b = str;
            }
        }
    }

    static {
        t2o.a(614465712);
    }
}
