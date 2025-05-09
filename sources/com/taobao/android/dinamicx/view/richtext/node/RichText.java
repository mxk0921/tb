package com.taobao.android.dinamicx.view.richtext.node;

import android.text.SpannableStringBuilder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tb.keo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RichText extends LinkedList<keo> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CharSequence mCachedText;
    private String mDefaultText;

    static {
        t2o.a(444597223);
    }

    public RichText() {
    }

    public static /* synthetic */ Object ipc$super(RichText richText, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/richtext/node/RichText");
    }

    public String originText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0edbf66", new Object[]{this});
        }
        if (size() == 0) {
            return this.mDefaultText;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<keo> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().getText());
        }
        return sb.toString();
    }

    public CharSequence renderText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("2eff6590", new Object[]{this}) : renderText(false);
    }

    public RichText(String str) {
        this.mDefaultText = str;
    }

    public CharSequence renderText(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("39dc0350", new Object[]{this, new Boolean(z)});
        }
        if (this.mCachedText == null || z) {
            this.mCachedText = renderText(this, z);
        }
        return this.mCachedText;
    }

    public CharSequence renderText(List<keo> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("372bf941", new Object[]{this, list, new Boolean(z)});
        }
        if (list.size() == 0) {
            return this.mDefaultText;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (keo keoVar : list) {
            spannableStringBuilder.append((CharSequence) keoVar.a(z));
        }
        return spannableStringBuilder;
    }
}
