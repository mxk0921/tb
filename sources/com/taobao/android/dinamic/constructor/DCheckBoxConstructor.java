package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import tb.bn7;
import tb.en7;
import tb.jn7;
import tb.om7;
import tb.owo;
import tb.px7;
import tb.rak;
import tb.sn7;
import tb.t2o;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DCheckBoxConstructor extends sn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String D_CHECKED = "dChecked";
    private static final String D_CHECK_IMG = "dCheckImg";
    private static final String D_DISCHECK_IMG = "dDisCheckImg";
    private static final String D_DISUNCHECK_IMG = "dDisUnCheckImg";
    private static final String D_HEIGHT = "dHeight";
    private static final String D_UNCHECK_IMG = "dUncheckImg";
    private static final String D_WIDTH = "dWidth";
    private static final String VIEW_EVENT_ON_CHANGE = "onChange";
    public static final String VIEW_TAG = "DCheckBox";

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
            t2o.a(444596248);
        }

        public OnChangeListener(b bVar, bn7 bn7Var, en7 en7Var, View view) {
            this.mHandler = bVar;
            this.mDinamicParams = bn7Var;
            this.mProperty = en7Var;
            this.mView = view;
            Map<String, String> map = en7Var.d;
            if (!map.isEmpty()) {
                this.mOnChangeExpression = map.get(DCheckBoxConstructor.VIEW_EVENT_ON_CHANGE);
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
            t2o.a(444596246);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/constructor/DCheckBoxConstructor$DCheckBoxEventHandlerWorker");
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
                if (!map.isEmpty() && map.containsKey(DCheckBoxConstructor.VIEW_EVENT_ON_CHANGE) && (view instanceof AppCompatCheckBox)) {
                    ((AppCompatCheckBox) view).setOnCheckedChangeListener(new OnChangeListener(this, bn7Var, en7Var, view));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c extends AsyncTask<Void, Void, Drawable[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f7257a;
        public final String b;
        public final String c;
        public final String d;
        public final Context e;
        public final int f;
        public final int g;
        public final WeakReference<AppCompatCheckBox> h;

        static {
            t2o.a(444596247);
        }

        public c(AppCompatCheckBox appCompatCheckBox, String str, String str2, String str3, String str4, int i, int i2) {
            this.f7257a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = appCompatCheckBox.getContext().getApplicationContext();
            this.f7257a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.f = i;
            this.g = i2;
            this.h = new WeakReference<>(appCompatCheckBox);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/constructor/DCheckBoxConstructor$LoadDrawableTask");
        }

        /* renamed from: a */
        public Drawable[] doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable[]) ipChange.ipc$dispatch("f2673320", new Object[]{this, voidArr});
            }
            Drawable c = c(this.e, this.f7257a);
            if (c == null) {
                c = b(this.e, R.drawable.dinamicx_checked);
            }
            Drawable f = f(c, this.e, this.f, this.g);
            Drawable c2 = c(this.e, this.b);
            if (c2 == null) {
                c2 = b(this.e, R.drawable.dinamicx_uncheck);
            }
            Drawable f2 = f(c2, this.e, this.f, this.g);
            Drawable c3 = c(this.e, this.c);
            if (c3 == null) {
                c3 = b(this.e, R.drawable.dinamicx_discheck);
            }
            Drawable f3 = f(c3, this.e, this.f, this.g);
            Drawable c4 = c(this.e, this.d);
            if (c4 == null) {
                c4 = b(this.e, R.drawable.dinamicx_disunchk);
            }
            return new Drawable[]{f, f2, f3, f(c4, this.e, this.f, this.g)};
        }

        public final Drawable b(Context context, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("827125cf", new Object[]{this, context, new Integer(i)});
            }
            return context.getResources().getDrawable(i);
        }

        public final Drawable c(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("fd2e3243", new Object[]{this, context, str});
            }
            try {
                return context.getResources().getDrawable(context.getResources().getIdentifier(str, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName()));
            } catch (Throwable unused) {
                return null;
            }
        }

        public final StateListDrawable d(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StateListDrawable) ipChange.ipc$dispatch("28db0f7d", new Object[]{this, drawable, drawable2, drawable3, drawable4});
            }
            return px7.a(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: e */
        public void onPostExecute(Drawable[] drawableArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5124347c", new Object[]{this, drawableArr});
                return;
            }
            AppCompatCheckBox appCompatCheckBox = this.h.get();
            if (appCompatCheckBox != null) {
                String str = (String) appCompatCheckBox.getTag(jn7.NEED_INT_CHECK_IMG);
                String str2 = (String) appCompatCheckBox.getTag(jn7.NEED_INT_UNCHECK_IMG);
                String str3 = (String) appCompatCheckBox.getTag(jn7.NEED_INT_DIS_CHECK_IMG);
                String str4 = (String) appCompatCheckBox.getTag(jn7.NEED_INT_DIS_UNCHECK_IMG);
                if (str.equals(this.f7257a) && str2.equals(this.b) && str3.equals(this.c) && str4.equals(this.d)) {
                    g(appCompatCheckBox, drawableArr[0], drawableArr[1], drawableArr[2], drawableArr[3]);
                    appCompatCheckBox.setTag(jn7.ALREADY_INT_CHECK_IMG, str);
                    appCompatCheckBox.setTag(jn7.ALREADY_INT_UNCHECK_IMG, str2);
                    appCompatCheckBox.setTag(jn7.ALREADY_INT_DIS_CHECK_IMG, str3);
                    appCompatCheckBox.setTag(jn7.ALREADY_INT_DIS_UNCHECK_IMG, str4);
                }
            }
        }

        public final Drawable f(Drawable drawable, Context context, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("223ba4a5", new Object[]{this, drawable, context, new Integer(i), new Integer(i2)});
            }
            if (!(drawable instanceof BitmapDrawable)) {
                return null;
            }
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), Bitmap.createScaledBitmap(bitmap, i, i2, true));
            bitmapDrawable.setTargetDensity(bitmap.getDensity());
            return bitmapDrawable;
        }

        public final void g(AppCompatCheckBox appCompatCheckBox, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a04c7b25", new Object[]{this, appCompatCheckBox, drawable, drawable2, drawable3, drawable4});
            } else if (appCompatCheckBox != null) {
                appCompatCheckBox.setButtonDrawable(d(drawable, drawable2, drawable3, drawable4));
            }
        }
    }

    static {
        t2o.a(444596244);
    }

    private int getDefaultSize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e243e8", new Object[]{this, context})).intValue();
        }
        return (int) TypedValue.applyDimension(1, 17.0f, context.getResources().getDisplayMetrics());
    }

    public static /* synthetic */ Object ipc$super(DCheckBoxConstructor dCheckBoxConstructor, String str, Object... objArr) {
        if (str.hashCode() == -1372344534) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (bn7) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/constructor/DCheckBoxConstructor");
    }

    private void setEnable(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf338cce", new Object[]{this, view, new Boolean(z)});
        } else {
            view.setEnabled(z);
        }
    }

    @Override // tb.sn7
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        getDefaultSize(context);
        AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(context, attributeSet);
        appCompatCheckBox.setClickable(true);
        return appCompatCheckBox;
    }

    public void setChecked(AppCompatCheckBox appCompatCheckBox, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d8724c", new Object[]{this, appCompatCheckBox, new Boolean(z)});
        } else if (appCompatCheckBox != null) {
            int i = R.id.change_with_attribute;
            appCompatCheckBox.setTag(i, "true");
            appCompatCheckBox.setChecked(z);
            appCompatCheckBox.setTag(i, "false");
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

    @Override // tb.sn7
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, bn7 bn7Var) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae33af2a", new Object[]{this, view, map, arrayList, bn7Var});
            return;
        }
        super.setAttributes(view, map, arrayList, bn7Var);
        AppCompatCheckBox appCompatCheckBox = view instanceof AppCompatCheckBox ? (AppCompatCheckBox) view : null;
        if (arrayList.contains(D_WIDTH) || arrayList.contains(D_HEIGHT) || arrayList.contains(D_CHECK_IMG) || arrayList.contains(D_UNCHECK_IMG) || arrayList.contains(D_DISCHECK_IMG) || arrayList.contains(D_DISUNCHECK_IMG)) {
            int defaultSize = getDefaultSize(view.getContext());
            int defaultSize2 = getDefaultSize(view.getContext());
            Object obj = map.get(D_WIDTH);
            Object obj2 = map.get(D_HEIGHT);
            int e = owo.e(view.getContext(), obj, -1);
            int e2 = owo.e(view.getContext(), obj2, -1);
            if (e == -1 || e2 == -1) {
                i2 = defaultSize2;
                i = defaultSize;
            } else {
                i2 = e;
                i = e2;
            }
            String str = (String) map.get(D_CHECK_IMG);
            String str2 = (String) view.getTag(jn7.ALREADY_INT_CHECK_IMG);
            if (str == null) {
                str = "dinamicx_checked";
            }
            String str3 = (String) map.get(D_UNCHECK_IMG);
            String str4 = (String) view.getTag(jn7.ALREADY_INT_UNCHECK_IMG);
            if (str3 == null) {
                str3 = "dinamicx_uncheck";
            }
            String str5 = (String) map.get(D_DISCHECK_IMG);
            String str6 = (String) view.getTag(jn7.ALREADY_INT_DIS_CHECK_IMG);
            if (str5 == null) {
                str5 = "dinamicx_discheck";
            }
            String str7 = (String) map.get(D_DISUNCHECK_IMG);
            String str8 = (String) view.getTag(jn7.ALREADY_INT_DIS_UNCHECK_IMG);
            if (str7 == null) {
                str7 = "dinamicx_disunchk";
            }
            if (str2 == null && str4 == null && str6 == null && str8 == null) {
                appCompatCheckBox.setButtonDrawable((Drawable) null);
            }
            if (!str.equals(str2) || !str3.equals(str4) || !str5.equals(str6) || !str7.equals(str8)) {
                view.setTag(jn7.NEED_INT_CHECK_IMG, str);
                view.setTag(jn7.NEED_INT_UNCHECK_IMG, str3);
                view.setTag(jn7.NEED_INT_DIS_CHECK_IMG, str5);
                view.setTag(jn7.NEED_INT_DIS_UNCHECK_IMG, str7);
                new c(appCompatCheckBox, str, str3, str5, str7, i2, i).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }
        if (arrayList.contains(D_CHECKED)) {
            setChecked(appCompatCheckBox, rak.b((String) map.get(D_CHECKED)));
        }
        if (arrayList.contains("dEnabled")) {
            String str9 = (String) map.get("dEnabled");
            if (!TextUtils.isEmpty(str9)) {
                setEnable(view, rak.b(str9));
            } else {
                setEnable(view, true);
            }
        }
    }
}
