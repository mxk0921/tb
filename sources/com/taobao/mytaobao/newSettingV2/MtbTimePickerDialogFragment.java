package com.taobao.mytaobao.newSettingV2;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import java.lang.reflect.Field;
import tb.bwu;
import tb.o32;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtbTimePickerDialogFragment extends BottomSheetDialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public NumberPicker c;
    public NumberPicker d;
    public NumberPicker e;
    public NumberPicker f;
    public int g;
    public int h;
    public int i;
    public int j;
    public o32<JSONObject> k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f11218a;

        public a(View view) {
            this.f11218a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View rootView = this.f11218a.getRootView();
            int i = R.id.design_bottom_sheet;
            BottomSheetBehavior.from(rootView.findViewById(i)).setHideable(false);
            View findViewById = this.f11218a.findViewById(R.id.btnConfirm);
            bwu.c(findViewById, findViewById.getHeight() / 2, -1);
            bwu.c(this.f11218a.findViewById(R.id.viewHoverLeft), DensityUtil.dip2px(this.f11218a.getContext(), 9.0f), -657931);
            bwu.c(this.f11218a.findViewById(R.id.viewHoverRight), DensityUtil.dip2px(this.f11218a.getContext(), 9.0f), -657931);
            try {
                this.f11218a.getRootView().findViewById(i).setBackgroundColor(0);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            int value = MtbTimePickerDialogFragment.v2(MtbTimePickerDialogFragment.this).getValue();
            int value2 = MtbTimePickerDialogFragment.z2(MtbTimePickerDialogFragment.this).getValue();
            int value3 = MtbTimePickerDialogFragment.A2(MtbTimePickerDialogFragment.this).getValue();
            int value4 = MtbTimePickerDialogFragment.B2(MtbTimePickerDialogFragment.this).getValue();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startHour", (Object) Integer.valueOf(value));
            jSONObject.put("starMinute", (Object) Integer.valueOf(value2));
            jSONObject.put("endHour", (Object) Integer.valueOf(value3));
            jSONObject.put("endMinute", (Object) Integer.valueOf(value4));
            o32<JSONObject> o32Var = MtbTimePickerDialogFragment.this.k;
            if (o32Var != null) {
                o32Var.a(true, null, jSONObject);
                MtbTimePickerDialogFragment.this.dismissAllowingStateLoss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                MtbTimePickerDialogFragment.this.dismissAllowingStateLoss();
            }
        }
    }

    static {
        t2o.a(745537748);
    }

    public static /* synthetic */ NumberPicker A2(MtbTimePickerDialogFragment mtbTimePickerDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NumberPicker) ipChange.ipc$dispatch("9d772f8a", new Object[]{mtbTimePickerDialogFragment});
        }
        return mtbTimePickerDialogFragment.e;
    }

    public static /* synthetic */ NumberPicker B2(MtbTimePickerDialogFragment mtbTimePickerDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NumberPicker) ipChange.ipc$dispatch("cd2e638b", new Object[]{mtbTimePickerDialogFragment});
        }
        return mtbTimePickerDialogFragment.f;
    }

    public static MtbTimePickerDialogFragment C2(int i, int i2, int i3, int i4, o32<JSONObject> o32Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtbTimePickerDialogFragment) ipChange.ipc$dispatch("6ad49cc9", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), o32Var});
        }
        MtbTimePickerDialogFragment mtbTimePickerDialogFragment = new MtbTimePickerDialogFragment();
        mtbTimePickerDialogFragment.g = i;
        mtbTimePickerDialogFragment.h = i2;
        mtbTimePickerDialogFragment.i = i3;
        mtbTimePickerDialogFragment.j = i4;
        mtbTimePickerDialogFragment.k = o32Var;
        return mtbTimePickerDialogFragment;
    }

    public static /* synthetic */ Object ipc$super(MtbTimePickerDialogFragment mtbTimePickerDialogFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/newSettingV2/MtbTimePickerDialogFragment");
        }
    }

    public static /* synthetic */ NumberPicker v2(MtbTimePickerDialogFragment mtbTimePickerDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NumberPicker) ipChange.ipc$dispatch("3e08c788", new Object[]{mtbTimePickerDialogFragment});
        }
        return mtbTimePickerDialogFragment.c;
    }

    public static /* synthetic */ NumberPicker z2(MtbTimePickerDialogFragment mtbTimePickerDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NumberPicker) ipChange.ipc$dispatch("6dbffb89", new Object[]{mtbTimePickerDialogFragment});
        }
        return mtbTimePickerDialogFragment.d;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        return layoutInflater.inflate(R.layout.mtb_time_picker, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.k = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        view.post(new a(view));
        getDialog().setCanceledOnTouchOutside(false);
        this.c = (NumberPicker) view.findViewById(R.id.hourStart);
        this.d = (NumberPicker) view.findViewById(R.id.minuteStart);
        this.e = (NumberPicker) view.findViewById(R.id.hourEnd);
        this.f = (NumberPicker) view.findViewById(R.id.minuteEnd);
        D2(this.c, true);
        D2(this.d, false);
        D2(this.e, true);
        D2(this.f, false);
        this.c.setValue(this.g);
        this.d.setValue(this.h);
        this.e.setValue(this.i);
        this.f.setValue(this.j);
        ViewProxy.setOnClickListener(view.findViewById(R.id.btnConfirm), new b());
        ViewProxy.setOnClickListener(view.findViewById(R.id.btnClose), new c());
    }

    public final void D2(NumberPicker numberPicker, boolean z) {
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(z ? 23 : 59);
        numberPicker.setDescendantFocusability(393216);
        numberPicker.setWrapSelectorWheel(true);
        numberPicker.setFormatter(new NumberPicker.Formatter() { // from class: com.taobao.mytaobao.newSettingV2.MtbTimePickerDialogFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.NumberPicker.Formatter
            public String format(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("77712d7b", new Object[]{this, new Integer(i)});
                }
                if (i >= 10) {
                    return String.valueOf(i);
                }
                return "0" + i;
            }
        });
        try {
            Field declaredField = numberPicker.getClass().getDeclaredField("mSelectionDivider");
            declaredField.setAccessible(true);
            declaredField.set(numberPicker, new ColorDrawable(0));
            Field declaredField2 = numberPicker.getClass().getDeclaredField("mSelectionDividerHeight");
            declaredField2.setAccessible(true);
            declaredField2.setInt(numberPicker, 0);
        } catch (Throwable unused) {
        }
    }
}
