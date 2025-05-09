package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import java.util.ArrayList;
import java.util.Map;
import tb.bn7;
import tb.owo;
import tb.rak;
import tb.sn7;
import tb.t2o;
import tb.x9f;
import tb.y45;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DTextInputConstructor extends sn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static final String TAG = "DTextInputConstructor";

    static {
        t2o.a(444596262);
    }

    public static /* synthetic */ Object ipc$super(DTextInputConstructor dTextInputConstructor, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1908967275) {
            super.applyDefaultProperty((View) objArr[0], (Map) objArr[1], (bn7) objArr[2]);
            return null;
        } else if (hashCode == -1372344534) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (bn7) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamic/constructor/DTextInputConstructor");
        }
    }

    private void setBackground(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff662732", new Object[]{this, editText, str});
        } else {
            editText.setBackgroundColor(y45.d(str, -16777216));
        }
    }

    private void setHintColor(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd851248", new Object[]{this, editText, str});
        } else {
            editText.setHintTextColor(y45.d(str, -16777216));
        }
    }

    private void setKeyBoardType(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0df", new Object[]{this, editText, str});
        } else if (TextUtils.isEmpty(str)) {
            editText.setInputType(1);
        } else {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue == 0) {
                editText.setInputType(1);
            } else if (intValue == 1) {
                editText.setInputType(2);
            } else if (intValue == 2) {
                editText.setInputType(3);
            } else if (intValue != 3) {
                editText.setInputType(1);
            } else {
                editText.setInputType(128);
            }
        }
    }

    private void setMaxLength(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6388103a", new Object[]{this, editText, str});
        } else if (TextUtils.isEmpty(str)) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
        } else {
            Integer valueOf = Integer.valueOf(str);
            if (valueOf.intValue() <= 0) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
            } else {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(valueOf.intValue())});
            }
        }
    }

    @Override // tb.sn7
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        return new EditText(context, attributeSet);
    }

    @Override // tb.sn7
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae33af2a", new Object[]{this, view, map, arrayList, bn7Var});
            return;
        }
        super.setAttributes(view, map, arrayList, bn7Var);
        EditText editText = (EditText) view;
        if (arrayList.contains("dText")) {
            setText(editText, (String) map.get("dText"));
        }
        if (arrayList.contains("dTextSize")) {
            setTextSize(editText, (String) map.get("dTextSize"));
        }
        if (arrayList.contains("dTextColor")) {
            setTextColor(editText, (String) map.get("dTextColor"));
        }
        if (arrayList.contains("dTextGravity") || arrayList.contains("dTextAlignment")) {
            setTextGravity(editText, (String) map.get("dTextGravity"), (String) map.get("dTextAlignment"));
        }
        if (arrayList.contains("dPlaceholder")) {
            editText.setHint((String) map.get("dPlaceholder"));
        }
        if (arrayList.contains("dPlaceholderColor")) {
            setHintColor(editText, (String) map.get("dPlaceholderColor"));
        }
        if (arrayList.contains("dKeyboard")) {
            setKeyBoardType(editText, (String) map.get("dKeyboard"));
        }
        if (arrayList.contains("dMaxLength")) {
            setMaxLength(editText, (String) map.get("dMaxLength"));
        }
        if (arrayList.contains("dInputFocusable")) {
            boolean b = rak.b((String) map.get("dInputFocusable"));
            editText.setFocusable(b);
            editText.setFocusableInTouchMode(b);
        }
    }

    public void setDeleteLine(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8868001", new Object[]{this, editText, str});
        } else if (TextUtils.equals(PromotionFilterBean.SINGLE, str)) {
            editText.getPaint().setFlags(16);
        }
    }

    @Override // tb.sn7
    public void setEvents(View view, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6e73e3", new Object[]{this, view, bn7Var});
        } else {
            new x9f().b(view, bn7Var);
        }
    }

    public void setMaxLines(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97dfbc45", new Object[]{this, editText, str});
            return;
        }
        Integer valueOf = Integer.valueOf(str);
        if (valueOf.intValue() <= 0) {
            editText.setMaxLines(Integer.MAX_VALUE);
        } else if (valueOf.intValue() == 1) {
            editText.setMaxLines(1);
        } else {
            editText.setMaxLines(valueOf.intValue());
        }
    }

    public void setMaxWidth(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce8f29e", new Object[]{this, editText, str});
            return;
        }
        int e = owo.e(editText.getContext(), str, -1);
        if (e != -1) {
            editText.setMaxWidth(e);
        }
    }

    public void setText(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27083bd3", new Object[]{this, editText, str});
        } else {
            editText.setText(str);
        }
    }

    public void setTextAlignment(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f828fee", new Object[]{this, editText, str});
            return;
        }
        int intValue = Integer.valueOf(str).intValue();
        if (intValue == 0) {
            editText.setGravity(19);
        } else if (intValue == 1) {
            editText.setGravity(17);
        } else if (intValue == 2) {
            editText.setGravity(21);
        }
    }

    public void setTextColor(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd291ee", new Object[]{this, editText, str});
        } else {
            editText.setTextColor(y45.d(str, -16777216));
        }
    }

    public void setTextGravity(EditText editText, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1126ed", new Object[]{this, editText, str, str2});
        } else if (str == null) {
            setTextAlignment(editText, str2);
        } else if ("left".equals(str)) {
            editText.setGravity(19);
        } else if ("center".equals(str)) {
            editText.setGravity(17);
        } else if ("right".equals(str)) {
            editText.setGravity(21);
        } else {
            editText.setGravity(16);
        }
    }

    public void setTextLineBreakMode(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442d9d43", new Object[]{this, editText, str});
            return;
        }
        int intValue = Integer.valueOf(str).intValue();
        if (intValue == 0) {
            editText.setEllipsize(null);
        } else if (intValue == 1) {
            editText.setEllipsize(TextUtils.TruncateAt.START);
        } else if (intValue == 2) {
            editText.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (intValue == 3) {
            editText.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public void setTextSize(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92642512", new Object[]{this, editText, str});
            return;
        }
        int e = owo.e(editText.getContext(), str, -1);
        if (e == -1) {
            editText.setTextSize(1, 12.0f);
        } else {
            editText.setTextSize(0, e);
        }
    }

    @Override // tb.sn7
    public void applyDefaultProperty(View view, Map<String, Object> map, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e377895", new Object[]{this, view, map, bn7Var});
            return;
        }
        super.applyDefaultProperty(view, map, bn7Var);
        EditText editText = (EditText) view;
        editText.setLines(1);
        editText.setSingleLine();
        editText.setImeOptions(6);
        if (!map.containsKey("dTextSize")) {
            editText.setTextSize(1, 12.0f);
        }
        if (!map.containsKey("dTextColor")) {
            editText.setTextColor(-16777216);
        }
        if (!map.containsKey("dLineBreakMode")) {
            editText.setEllipsize(null);
        }
        if (!map.containsKey("dTextGravity") && !map.containsKey("dTextAlignment")) {
            editText.setGravity(16);
        }
    }

    public void setTextTheme(EditText editText, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be991292", new Object[]{this, editText, str, str2});
        } else if (str == null) {
            setTextStyle(editText, str2);
        } else if ("normal".equals(str)) {
            editText.setTypeface(Typeface.defaultFromStyle(0));
        } else if ("bold".equals(str)) {
            editText.setTypeface(Typeface.defaultFromStyle(1));
        } else if ("italic".equals(str)) {
            editText.setTypeface(Typeface.defaultFromStyle(2));
        } else {
            editText.setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    public void setTextStyle(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ca35e0", new Object[]{this, editText, str});
        } else if (TextUtils.isEmpty(str)) {
            editText.setTypeface(Typeface.defaultFromStyle(0));
        } else {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue == 0) {
                editText.setTypeface(Typeface.defaultFromStyle(0));
            } else if (intValue == 1) {
                editText.setTypeface(Typeface.defaultFromStyle(1));
            } else if (intValue == 2) {
                editText.setTypeface(Typeface.defaultFromStyle(2));
            } else if (intValue == 3) {
                editText.setTypeface(Typeface.defaultFromStyle(3));
            }
        }
    }
}
