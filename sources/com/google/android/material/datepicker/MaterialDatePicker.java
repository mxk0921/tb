package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import tb.c9i;
import tb.ibf;
import tb.k6i;
import tb.puk;
import tb.w2m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MaterialDatePicker<S> extends DialogFragment {
    public static final int INPUT_MODE_CALENDAR = 0;
    public static final int INPUT_MODE_TEXT = 1;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet<c9i<? super S>> f5072a = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> c = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> d = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> e = new LinkedHashSet<>();
    public int f;
    public DateSelector<S> g;
    public w2m<S> h;
    public CalendarConstraints i;
    public MaterialCalendar<S> j;
    public int k;
    public CharSequence l;
    public boolean m;
    public int n;
    public TextView o;
    public CheckableImageButton p;
    public MaterialShapeDrawable q;
    public Button r;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface InputMode {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            Iterator it = materialDatePicker.f5072a.iterator();
            while (it.hasNext()) {
                ((c9i) it.next()).a(materialDatePicker.K2());
            }
            materialDatePicker.dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            Iterator it = materialDatePicker.c.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            materialDatePicker.dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c extends puk<S> {
        public c() {
        }

        @Override // tb.puk
        public void a() {
            MaterialDatePicker.this.r.setEnabled(false);
        }

        @Override // tb.puk
        public void b(S s) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.S2();
            materialDatePicker.r.setEnabled(materialDatePicker.g.isSelectionComplete());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.r.setEnabled(materialDatePicker.g.isSelectionComplete());
            materialDatePicker.p.toggle();
            materialDatePicker.T2(materialDatePicker.p);
            materialDatePicker.Q2();
        }
    }

    public static Drawable C2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, AppCompatResources.getDrawable(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AppCompatResources.getDrawable(context, R.drawable.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    public static int D2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i = MonthAdapter.MAXIMUM_WEEKS;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding);
    }

    public static int J2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        int i = Month.current().daysInWeek;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    public static boolean O2(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(k6i.c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public static long R2() {
        return Month.current().timeInMillis;
    }

    public String E2() {
        return this.g.getSelectionDisplayString(getContext());
    }

    public final S K2() {
        return this.g.getSelection();
    }

    public final int M2(Context context) {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        return this.g.getDefaultThemeResId(context);
    }

    public final void N2(Context context) {
        boolean z;
        this.p.setTag("TOGGLE_BUTTON_TAG");
        this.p.setImageDrawable(C2(context));
        CheckableImageButton checkableImageButton = this.p;
        if (this.n != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton.setChecked(z);
        ViewCompat.setAccessibilityDelegate(this.p, null);
        T2(this.p);
        this.p.setOnClickListener(new d());
    }

    public final void Q2() {
        w2m<S> w2mVar;
        this.j = MaterialCalendar.Q2(this.g, M2(requireContext()), this.i);
        if (this.p.isChecked()) {
            w2mVar = MaterialTextInputPicker.s2(this.g, this.i);
        } else {
            w2mVar = this.j;
        }
        this.h = w2mVar;
        S2();
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.mtrl_calendar_frame, this.h);
        beginTransaction.commitNow();
        this.h.p2(new c());
    }

    public final void S2() {
        String E2 = E2();
        this.o.setContentDescription(String.format(getString(R.string.mtrl_picker_announce_current_selection), E2));
        this.o.setText(E2);
    }

    public final void T2(CheckableImageButton checkableImageButton) {
        String str;
        if (this.p.isChecked()) {
            str = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.p.setContentDescription(str);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.g = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.i = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.k = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.l = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.n = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), M2(requireContext()));
        Context context = dialog.getContext();
        this.m = O2(context);
        int c2 = k6i.c(context, R.attr.colorSurface, MaterialDatePicker.class.getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.q = materialShapeDrawable;
        materialShapeDrawable.M(context);
        this.q.W(ColorStateList.valueOf(c2));
        this.q.V(ViewCompat.getElevation(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.m) {
            i = R.layout.mtrl_picker_fullscreen;
        } else {
            i = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.m) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(J2(context), -2));
        } else {
            View findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R.id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(J2(context), -1));
            findViewById2.setMinimumHeight(D2(requireContext()));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.o = textView;
        ViewCompat.setAccessibilityLiveRegion(textView, 1);
        this.p = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.l;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.k);
        }
        N2(context);
        this.r = (Button) inflate.findViewById(R.id.confirm_button);
        if (this.g.isSelectionComplete()) {
            this.r.setEnabled(true);
        } else {
            this.r.setEnabled(false);
        }
        this.r.setTag("CONFIRM_BUTTON_TAG");
        this.r.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.g);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.i);
        if (this.j.M2() != null) {
            bVar.b(this.j.M2().timeInMillis);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.k);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.l);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.m) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.q);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.q, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ibf(requireDialog(), rect));
        }
        Q2();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.h.r2();
        super.onStop();
    }
}
