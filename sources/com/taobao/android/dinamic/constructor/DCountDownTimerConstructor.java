package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.DCountDownTimerView;
import java.util.ArrayList;
import java.util.Map;
import tb.bn7;
import tb.owo;
import tb.sn7;
import tb.t2o;
import tb.y45;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DCountDownTimerConstructor extends sn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static final String TAG = "DCountDownTimerConstructor";
    private final int MARGIN_LEFT = 0;
    private final int MARGIN_TOP = 1;
    private final int MARGIN_RIGHT = 2;
    private final int MARGIN_BOTTOM = 3;
    private final int TEXT_SIZE = 6;
    private final int TEXT_COLOR = 7;
    private final int[] seeMoreTextDefaults = {0, 0, 0, 0, -1, -1, 12, -16777216};
    private final int[] timerTextDefaults = {0, 0, 0, 0, 20, 20, 12, -1};
    private final int[] colonTextDefaults = {0, 0, 0, 0, -1, -1, 10, -16777216};

    static {
        t2o.a(444596249);
    }

    private int[] getTextViewMargin(Context context, String str, String str2, String str3, String str4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("4e9dc763", new Object[]{this, context, str, str2, str3, str4, iArr});
        }
        int e = owo.e(context, str, iArr[0]);
        int e2 = owo.e(context, str2, iArr[1]);
        int e3 = owo.e(context, str3, iArr[2]);
        int e4 = owo.e(context, str4, iArr[3]);
        if (e == iArr[0] && e2 == iArr[1] && e3 == iArr[2] && e4 == iArr[3]) {
            return null;
        }
        return new int[]{e, e2, e3, e4};
    }

    public static /* synthetic */ Object ipc$super(DCountDownTimerConstructor dCountDownTimerConstructor, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1908967275) {
            super.applyDefaultProperty((View) objArr[0], (Map) objArr[1], (bn7) objArr[2]);
            return null;
        } else if (hashCode == -1372344534) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (bn7) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamic/constructor/DCountDownTimerConstructor");
        }
    }

    private void setTextViewStyle(TextView textView, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int[] iArr) {
        int d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb3e1fe", new Object[]{this, textView, str, str2, str3, str4, str5, str6, str7, str8, iArr});
            return;
        }
        if (!TextUtils.isEmpty(str7)) {
            textView.setTextSize(0, owo.e(textView.getContext(), str7, 0));
        }
        if (!TextUtils.isEmpty(str8) && (d = y45.d(str8, -16777216)) != -16777216) {
            textView.setTextColor(d);
        }
        int[] textViewMargin = getTextViewMargin(textView.getContext(), str, str2, str3, str4, iArr);
        if (textViewMargin != null || !TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str6)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            if (!TextUtils.isEmpty(str5)) {
                marginLayoutParams.width = owo.e(textView.getContext(), str5, 0);
            }
            if (!TextUtils.isEmpty(str6)) {
                marginLayoutParams.height = owo.e(textView.getContext(), str6, 0);
            }
            if (textViewMargin != null) {
                marginLayoutParams.setMargins(textViewMargin[0], textViewMargin[1], textViewMargin[2], textViewMargin[3]);
            }
            textView.setLayoutParams(marginLayoutParams);
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
        DCountDownTimerView dCountDownTimerView = (DCountDownTimerView) view;
        TextView seeMoreView = dCountDownTimerView.getSeeMoreView();
        TextView hour = dCountDownTimerView.getHour();
        TextView minute = dCountDownTimerView.getMinute();
        TextView second = dCountDownTimerView.getSecond();
        TextView colonFirst = dCountDownTimerView.getColonFirst();
        TextView colonSecond = dCountDownTimerView.getColonSecond();
        setTextViewMarginAndColorAndSize(seeMoreView, this.seeMoreTextDefaults);
        seeMoreView.setText("");
        setTextViewMarginAndColorAndSize(hour, this.timerTextDefaults);
        setTextViewMarginAndColorAndSize(minute, this.timerTextDefaults);
        setTextViewMarginAndColorAndSize(second, this.timerTextDefaults);
        hour.setPadding(0, 0, 0, 0);
        minute.setPadding(0, 0, 0, 0);
        second.setPadding(0, 0, 0, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(0.0f);
        gradientDrawable.setColor(-16777216);
        hour.setBackgroundDrawable(gradientDrawable);
        minute.setBackgroundDrawable(gradientDrawable);
        second.setBackgroundDrawable(gradientDrawable);
        setTextViewMarginAndColorAndSize(colonFirst, this.colonTextDefaults);
        setTextViewMarginAndColorAndSize(colonSecond, this.colonTextDefaults);
        colonFirst.setText(":");
        colonSecond.setText(":");
    }

    @Override // tb.sn7
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        return new DCountDownTimerView(context, attributeSet);
    }

    public void setColonTextViewStyle(DCountDownTimerView dCountDownTimerView, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34df2c", new Object[]{this, dCountDownTimerView, str, str2, str3, str4, str5, str6, str7, str8, str9});
            return;
        }
        TextView colonFirst = dCountDownTimerView.getColonFirst();
        TextView colonSecond = dCountDownTimerView.getColonSecond();
        setTextViewStyle(colonFirst, str, str2, str3, str4, str5, str6, str7, str8, this.colonTextDefaults);
        setTextViewStyle(colonSecond, str, str2, str3, str4, str5, str6, str7, str8, this.colonTextDefaults);
        if (!TextUtils.isEmpty(str9)) {
            colonFirst.setText(str9);
            colonSecond.setText(str9);
        }
    }

    public void setFutureTime(DCountDownTimerView dCountDownTimerView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a74b4b6", new Object[]{this, dCountDownTimerView, str, str2});
        } else if (TextUtils.isEmpty(str)) {
            dCountDownTimerView.hideCountDown();
            dCountDownTimerView.setFutureTime(-1L);
            dCountDownTimerView.getTimer().g();
        } else {
            dCountDownTimerView.setFutureTime(Long.valueOf(str).longValue());
            if (!TextUtils.isEmpty(str2)) {
                dCountDownTimerView.setCurrentTime(Long.valueOf(str2).longValue());
            }
            if (dCountDownTimerView.getLastTime() > 0) {
                dCountDownTimerView.showCountDown();
                dCountDownTimerView.updateCountDownViewTime();
                dCountDownTimerView.getTimer().e();
                return;
            }
            dCountDownTimerView.hideCountDown();
            dCountDownTimerView.getTimer().g();
        }
    }

    private void setTimerTextBackground(TextView textView, TextView textView2, TextView textView3, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb47c793", new Object[]{this, textView, textView2, textView3, str, str2});
            return;
        }
        int d = !TextUtils.isEmpty(str) ? y45.d(str, -16777216) : -16777216;
        int e = owo.e(textView.getContext(), str2, 0);
        if (d != -16777216 || e != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(e);
            gradientDrawable.setColor(d);
            textView.setBackgroundDrawable(gradientDrawable);
            textView2.setBackgroundDrawable(gradientDrawable);
            textView3.setBackgroundDrawable(gradientDrawable);
        }
    }

    public void setTimerTextViewStyle(DCountDownTimerView dCountDownTimerView, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9de925c", new Object[]{this, dCountDownTimerView, str, str2, str3, str4, str5, str6, str7, str8, str9, str10});
            return;
        }
        TextView hour = dCountDownTimerView.getHour();
        TextView minute = dCountDownTimerView.getMinute();
        TextView second = dCountDownTimerView.getSecond();
        setTextViewStyle(hour, str, str2, str3, str4, str5, str6, str7, str8, this.timerTextDefaults);
        setTextViewStyle(minute, str, str2, str3, str4, str5, str6, str7, str8, this.timerTextDefaults);
        setTextViewStyle(second, str, str2, str3, str4, str5, str6, str7, str8, this.timerTextDefaults);
        setTimerTextBackground(hour, minute, second, str9, str10);
    }

    public void setSeeMoreTextViewStyle(DCountDownTimerView dCountDownTimerView, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f5cd95", new Object[]{this, dCountDownTimerView, str, str2, str3, str4, str5, str6, str7, str8, str9});
            return;
        }
        TextView seeMoreView = dCountDownTimerView.getSeeMoreView();
        seeMoreView.setText(str);
        setTextViewStyle(seeMoreView, str2, str3, str4, str5, str6, str7, str8, str9, this.seeMoreTextDefaults);
    }

    private void setTextViewMarginAndColorAndSize(TextView textView, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd492841", new Object[]{this, textView, iArr});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextColor(iArr[7]);
        textView.setTextSize(1, iArr[6]);
    }

    @Override // tb.sn7
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, bn7 bn7Var) {
        DCountDownTimerView dCountDownTimerView;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        DCountDownTimerView dCountDownTimerView2;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae33af2a", new Object[]{this, view, map, arrayList, bn7Var});
            return;
        }
        super.setAttributes(view, map, arrayList, bn7Var);
        DCountDownTimerView dCountDownTimerView3 = (DCountDownTimerView) view;
        Object obj14 = "dSeeMoreTextMarginTop";
        Object obj15 = "dSeeMoreTextMarginRight";
        if (arrayList.contains("dTimerTextMarginLeft") || arrayList.contains("dTimerTextMarginTop") || arrayList.contains("dTimerTextMarginRight") || arrayList.contains("dTimerTextMarginBottom") || arrayList.contains("dTimerTextWidth") || arrayList.contains("dTimerTextHeight") || arrayList.contains("dTimerTextSize") || arrayList.contains("dTimerTextColor") || arrayList.contains("dTimerBackgroundColor") || arrayList.contains("dTimerCornerRadius")) {
            obj5 = "dSeeMoreTextColor";
            obj4 = "dSeeMoreTextMarginBottom";
            obj15 = obj15;
            obj3 = "dSeeMoreTextWidth";
            obj14 = obj14;
            obj2 = "dSeeMoreTextHeight";
            obj6 = "dSeeMoreTextMarginLeft";
            dCountDownTimerView = dCountDownTimerView3;
            obj = "dSeeMoreTextSize";
            setTimerTextViewStyle(dCountDownTimerView3, (String) map.get("dTimerTextMarginLeft"), (String) map.get("dTimerTextMarginTop"), (String) map.get("dTimerTextMarginRight"), (String) map.get("dTimerTextMarginBottom"), (String) map.get("dTimerTextWidth"), (String) map.get("dTimerTextHeight"), (String) map.get("dTimerTextSize"), (String) map.get("dTimerTextColor"), (String) map.get("dTimerBackgroundColor"), (String) map.get("dTimerCornerRadius"));
        } else {
            dCountDownTimerView = dCountDownTimerView3;
            obj4 = "dSeeMoreTextMarginBottom";
            obj3 = "dSeeMoreTextWidth";
            obj2 = "dSeeMoreTextHeight";
            obj = "dSeeMoreTextSize";
            obj5 = "dSeeMoreTextColor";
            obj6 = "dSeeMoreTextMarginLeft";
        }
        if (arrayList.contains("dColonTextMarginLeft") || arrayList.contains("dColonTextMarginTop") || arrayList.contains("dColonTextMarginRight") || arrayList.contains("dColonTextMarginBottom") || arrayList.contains("dColonTextWidth") || arrayList.contains("dColonTextHeight") || arrayList.contains("dColonTextSize") || arrayList.contains("dColonTextColor") || arrayList.contains("dColonText")) {
            setColonTextViewStyle(dCountDownTimerView, (String) map.get("dColonTextMarginLeft"), (String) map.get("dColonTextMarginTop"), (String) map.get("dColonTextMarginRight"), (String) map.get("dColonTextMarginBottom"), (String) map.get("dColonTextWidth"), (String) map.get("dColonTextHeight"), (String) map.get("dColonTextSize"), (String) map.get("dColonTextColor"), (String) map.get("dColonText"));
        }
        if (arrayList.contains("dFutureTime") || arrayList.contains("dCurrentTime")) {
            dCountDownTimerView2 = dCountDownTimerView;
            setFutureTime(dCountDownTimerView2, (String) map.get("dFutureTime"), (String) map.get("dCurrentTime"));
        } else {
            dCountDownTimerView2 = dCountDownTimerView;
        }
        if (arrayList.contains("dSeeMoreText") || arrayList.contains(obj6)) {
            obj7 = obj5;
            obj13 = obj14;
        } else {
            obj13 = obj14;
            if (!arrayList.contains(obj13)) {
                obj12 = obj15;
                if (!arrayList.contains(obj12)) {
                    obj11 = obj4;
                    if (!arrayList.contains(obj11)) {
                        obj10 = obj3;
                        if (!arrayList.contains(obj10)) {
                            obj9 = obj2;
                            if (!arrayList.contains(obj9)) {
                                obj8 = obj;
                                if (!arrayList.contains(obj8)) {
                                    obj7 = obj5;
                                    if (!arrayList.contains(obj7)) {
                                        return;
                                    }
                                } else {
                                    obj7 = obj5;
                                }
                                setSeeMoreTextViewStyle(dCountDownTimerView2, (String) map.get("dSeeMoreText"), (String) map.get(obj6), (String) map.get(obj13), (String) map.get(obj12), (String) map.get(obj11), (String) map.get(obj10), (String) map.get(obj9), (String) map.get(obj8), (String) map.get(obj7));
                            }
                            obj7 = obj5;
                            obj8 = obj;
                            setSeeMoreTextViewStyle(dCountDownTimerView2, (String) map.get("dSeeMoreText"), (String) map.get(obj6), (String) map.get(obj13), (String) map.get(obj12), (String) map.get(obj11), (String) map.get(obj10), (String) map.get(obj9), (String) map.get(obj8), (String) map.get(obj7));
                        }
                        obj7 = obj5;
                        obj9 = obj2;
                        obj8 = obj;
                        setSeeMoreTextViewStyle(dCountDownTimerView2, (String) map.get("dSeeMoreText"), (String) map.get(obj6), (String) map.get(obj13), (String) map.get(obj12), (String) map.get(obj11), (String) map.get(obj10), (String) map.get(obj9), (String) map.get(obj8), (String) map.get(obj7));
                    }
                    obj7 = obj5;
                    obj10 = obj3;
                    obj9 = obj2;
                    obj8 = obj;
                    setSeeMoreTextViewStyle(dCountDownTimerView2, (String) map.get("dSeeMoreText"), (String) map.get(obj6), (String) map.get(obj13), (String) map.get(obj12), (String) map.get(obj11), (String) map.get(obj10), (String) map.get(obj9), (String) map.get(obj8), (String) map.get(obj7));
                }
                obj7 = obj5;
                obj11 = obj4;
                obj10 = obj3;
                obj9 = obj2;
                obj8 = obj;
                setSeeMoreTextViewStyle(dCountDownTimerView2, (String) map.get("dSeeMoreText"), (String) map.get(obj6), (String) map.get(obj13), (String) map.get(obj12), (String) map.get(obj11), (String) map.get(obj10), (String) map.get(obj9), (String) map.get(obj8), (String) map.get(obj7));
            }
            obj7 = obj5;
        }
        obj12 = obj15;
        obj11 = obj4;
        obj10 = obj3;
        obj9 = obj2;
        obj8 = obj;
        setSeeMoreTextViewStyle(dCountDownTimerView2, (String) map.get("dSeeMoreText"), (String) map.get(obj6), (String) map.get(obj13), (String) map.get(obj12), (String) map.get(obj11), (String) map.get(obj10), (String) map.get(obj9), (String) map.get(obj8), (String) map.get(obj7));
    }
}
