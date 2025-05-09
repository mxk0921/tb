package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Map;
import tb.bn7;
import tb.en7;
import tb.jn7;
import tb.om7;
import tb.owo;
import tb.px7;
import tb.q14;
import tb.rak;
import tb.sn7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DSwitchConstructor extends sn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CHECKED_COLOR = -45056;
    private static final String D_HEIGHT = "dHeight";
    private static final String D_OFF_COLOR = "dOffColor";
    private static final String D_ON_COLOR = "dOnColor";
    private static final String D_SWITCH_ON = "dSwitchOn";
    private static final String D_WIDTH = "dWidth";
    private static final String STRING_CHECKED_COLOR = "#ffff5000";
    private static final String STRING_UNCHECKED_COLOR = "#ffe5e5e5";
    private static final int UNCHECKED_COLOR = -1710619;
    private static final String VIEW_EVENT_ON_CHANGE = "onChange";
    public static final String VIEW_TAG = "DSwitch";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class OnChangeListener implements CompoundButton.OnCheckedChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private bn7 mDinamicParams;
        private b mHandler;
        private String mOnChangeExpression;
        private en7 mProperty;
        private View mView;

        static {
            t2o.a(444596261);
        }

        public OnChangeListener(b bVar, bn7 bn7Var, en7 en7Var, View view) {
            this.mHandler = bVar;
            this.mDinamicParams = bn7Var;
            this.mProperty = en7Var;
            this.mView = view;
            Map<String, String> map = en7Var.d;
            if (!map.isEmpty()) {
                this.mOnChangeExpression = map.get(DSwitchConstructor.VIEW_EVENT_ON_CHANGE);
            }
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                return;
            }
            Object tag = compoundButton.getTag(R.id.change_with_attribute);
            if (!TextUtils.isEmpty(this.mOnChangeExpression) && !"true".equals(tag)) {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add(Boolean.valueOf(compoundButton.isChecked()));
                this.mView.setTag(jn7.VIEW_PARAMS, arrayList);
                om7.d(this.mView, this.mDinamicParams, this.mProperty, this.mOnChangeExpression);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b extends om7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444596260);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/constructor/DSwitchConstructor$DSwitchEventHandlerWorker");
        }

        @Override // tb.om7
        public void b(View view, bn7 bn7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99602391", new Object[]{this, view, bn7Var});
            } else {
                e(view, bn7Var);
            }
        }

        public void e(View view, bn7 bn7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65f0cc4d", new Object[]{this, view, bn7Var});
                return;
            }
            en7 en7Var = (en7) view.getTag(jn7.PROPERTY_KEY);
            if (en7Var != null) {
                Map<String, String> map = en7Var.d;
                if (!map.isEmpty() && map.containsKey(DSwitchConstructor.VIEW_EVENT_ON_CHANGE) && (view instanceof SwitchCompat)) {
                    ((SwitchCompat) view).setOnCheckedChangeListener(new OnChangeListener(this, bn7Var, en7Var, view));
                }
            }
        }
    }

    static {
        t2o.a(444596258);
    }

    private StateListDrawable getSelector(Drawable drawable, Drawable drawable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateListDrawable) ipChange.ipc$dispatch("e174db35", new Object[]{this, drawable, drawable2});
        }
        return px7.b(drawable, drawable2, px7.STATE_CHECKED);
    }

    private GradientDrawable getTrackDrawable(Context context, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("3da82d12", new Object[]{this, context, str, new Integer(i), new Integer(i2)});
        }
        return px7.c(0, 16777215, i2 / 2, q14.a(str, i), i2, i2);
    }

    public static /* synthetic */ Object ipc$super(DSwitchConstructor dSwitchConstructor, String str, Object... objArr) {
        if (str.hashCode() == -1372344534) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (bn7) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/constructor/DSwitchConstructor");
    }

    private void setEnable(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf338cce", new Object[]{this, view, new Boolean(z)});
        } else {
            view.setEnabled(z);
        }
    }

    private void updateInternalStatus(SwitchCompat switchCompat, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bba3eaeb", new Object[]{this, switchCompat, drawable, drawable2, drawable3});
        } else if (switchCompat != null) {
            switchCompat.setTrackDrawable(getSelector(drawable, drawable2));
            switchCompat.setThumbDrawable(drawable3);
        }
    }

    @Override // tb.sn7
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        SwitchCompat switchCompat = new SwitchCompat(context, attributeSet);
        switchCompat.setClickable(true);
        switchCompat.setTextOn("");
        switchCompat.setTextOff("");
        switchCompat.setShowText(false);
        switchCompat.setThumbTextPadding(0);
        switchCompat.setSplitTrack(false);
        return switchCompat;
    }

    public void setChecked(SwitchCompat switchCompat, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb73f28", new Object[]{this, switchCompat, new Boolean(z)});
        } else if (switchCompat != null) {
            int i = R.id.change_with_attribute;
            switchCompat.setTag(i, "true");
            switchCompat.setChecked(z);
            switchCompat.setTag(i, "false");
        }
    }

    @Override // tb.sn7
    public void setEvents(View view, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6e73e3", new Object[]{this, view, bn7Var});
        } else {
            new b().b(view, bn7Var);
        }
    }

    public void setSwitchMinWidth(SwitchCompat switchCompat, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24544572", new Object[]{this, switchCompat, new Integer(i)});
        } else if (switchCompat != null) {
            switchCompat.setSwitchMinWidth(i);
        }
    }

    private GradientDrawable getThumbDrawable(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("d760010a", new Object[]{this, context, new Integer(i)});
        }
        return px7.c((int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()), 16777215, i / 2, -1, i, i);
    }

    @Override // tb.sn7
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, bn7 bn7Var) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae33af2a", new Object[]{this, view, map, arrayList, bn7Var});
            return;
        }
        super.setAttributes(view, map, arrayList, bn7Var);
        SwitchCompat switchCompat = view instanceof SwitchCompat ? (SwitchCompat) view : null;
        if (arrayList.contains(D_HEIGHT) || arrayList.contains(D_ON_COLOR) || arrayList.contains(D_OFF_COLOR)) {
            Object obj = map.get(D_HEIGHT);
            Object obj2 = map.get(D_ON_COLOR);
            Object obj3 = map.get(D_OFF_COLOR);
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = STRING_CHECKED_COLOR;
            }
            if (obj3 instanceof String) {
                str2 = (String) obj3;
            } else {
                str2 = STRING_UNCHECKED_COLOR;
            }
            int e = owo.e(view.getContext(), obj, -1);
            if (e != -1) {
                updateInternalStatus(switchCompat, getTrackDrawable(view.getContext(), str, -45056, e), getTrackDrawable(view.getContext(), str2, UNCHECKED_COLOR, e), getThumbDrawable(view.getContext(), e));
            }
        }
        if (arrayList.contains(D_WIDTH)) {
            Object obj4 = map.get(D_WIDTH);
            Object obj5 = map.get(D_HEIGHT);
            int e2 = owo.e(view.getContext(), obj4, -1);
            int e3 = owo.e(view.getContext(), obj5, -1);
            if (!(e2 == -1 || e3 == -1 || e2 < e3 * 2)) {
                setSwitchMinWidth(switchCompat, e2);
            }
        }
        if (arrayList.contains(D_SWITCH_ON)) {
            setChecked(switchCompat, rak.b((String) map.get(D_SWITCH_ON)));
        }
        if (arrayList.contains("dEnabled")) {
            String str3 = (String) map.get("dEnabled");
            if (!TextUtils.isEmpty(str3)) {
                setEnable(view, rak.b(str3));
            } else {
                setEnable(view, true);
            }
        }
    }
}
