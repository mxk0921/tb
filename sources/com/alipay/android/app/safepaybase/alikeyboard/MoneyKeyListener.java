package com.alipay.android.app.safepaybase.alikeyboard;

import android.text.Editable;
import android.text.Spanned;
import android.text.method.NumberKeyListener;
import android.view.KeyEvent;
import android.view.View;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.regex.Pattern;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MoneyKeyListener extends NumberKeyListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f3491a = Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$");

    public static MoneyKeyListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MoneyKeyListener) ipChange.ipc$dispatch("eb169a5e", new Object[0]);
        }
        return new MoneyKeyListener();
    }

    public static /* synthetic */ Object ipc$super(MoneyKeyListener moneyKeyListener, String str, Object... objArr) {
        if (str.hashCode() == -139009009) {
            return new Boolean(super.onKeyDown((View) objArr[0], (Editable) objArr[1], ((Number) objArr[2]).intValue(), (KeyEvent) objArr[3]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/app/safepaybase/alikeyboard/MoneyKeyListener");
    }

    @Override // android.text.method.NumberKeyListener, android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("cf65d449", new Object[]{this, charSequence, new Integer(i), new Integer(i2), spanned, new Integer(i3), new Integer(i4)});
        }
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        String obj = spanned.toString();
        String substring = obj.substring(0, i3);
        String substring2 = obj.substring(i4, spanned.length());
        if (!f3491a.matcher(substring + charSequence2 + substring2).find()) {
            return "";
        }
        return charSequence2;
    }

    @Override // android.text.method.NumberKeyListener
    public char[] getAcceptedChars() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("62d75077", new Object[]{this});
        }
        return new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.'};
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b38bf4e8", new Object[]{this})).intValue();
        }
        return 128;
    }

    @Override // android.text.method.NumberKeyListener, android.text.method.BaseKeyListener, android.text.method.MetaKeyKeyListener, android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7b6e40f", new Object[]{this, view, editable, new Integer(i), keyEvent})).booleanValue();
        }
        return super.onKeyDown(view, editable, i, keyEvent);
    }
}
