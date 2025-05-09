package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.AsyncTask;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXCheckBoxEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import tb.jb6;
import tb.qu5;
import tb.qub;
import tb.t2o;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXCheckBoxWidgetNode extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f7362a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public boolean g = false;
    public boolean h = false;
    public static final int ALREADY_INT_CHECK_IMG = R.id.already_int_check_img;
    public static final int NEED_INT_CHECK_IMG = R.id.need_int_check_img;
    public static final int ALREADY_INT_UNCHECK_IMG = R.id.already_int_uncheck_img;
    public static final int NEED_INT_UNCHECK_IMG = R.id.need_int_uncheck_img;
    public static final int ALREADY_INT_DIS_CHECK_IMG = R.id.already_int_dis_check_img;
    public static final int NEED_INT_DIS_CHECK_IMG = R.id.need_int_dis_check_img;
    public static final int ALREADY_INT_DIS_UNCHECK_IMG = R.id.already_int_dis_uncheck_img;
    public static final int NEED_INT_DIS_UNCHECK_IMG = R.id.need_int_dis_uncheck_img;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597284);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXCheckBoxWidgetNode();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b extends AsyncTask<Void, Void, Drawable[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f7363a;
        public final String b;
        public final String c;
        public final String d;
        public final Context e;
        public final int f;
        public final int g;
        public final WeakReference<AppCompatCheckBox> h;
        public final boolean i;

        static {
            t2o.a(444597285);
        }

        public b(AppCompatCheckBox appCompatCheckBox, String str, String str2, String str3, String str4, int i, int i2, boolean z) {
            this.f7363a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = appCompatCheckBox.getContext().getApplicationContext();
            this.f7363a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.f = i;
            this.g = i2;
            this.h = new WeakReference<>(appCompatCheckBox);
            this.i = z;
        }

        public static /* synthetic */ Drawable[] a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable[]) ipChange.ipc$dispatch("d10a3ef7", new Object[]{bVar});
            }
            return bVar.f();
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXCheckBoxWidgetNode$LoadDrawableTask");
        }

        /* renamed from: b */
        public Drawable[] doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable[]) ipChange.ipc$dispatch("f2673320", new Object[]{this, voidArr});
            }
            return f();
        }

        public final Drawable c(Context context, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("827125cf", new Object[]{this, context, new Integer(i)});
            }
            return context.getResources().getDrawable(i);
        }

        public final Drawable d(Context context, String str) {
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

        public final StateListDrawable e(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StateListDrawable) ipChange.ipc$dispatch("28db0f7d", new Object[]{this, drawable, drawable2, drawable3, drawable4});
            }
            return qu5.a(drawable, drawable2, drawable3, drawable4);
        }

        public final Drawable[] f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable[]) ipChange.ipc$dispatch("13c99e7f", new Object[]{this});
            }
            Drawable d = d(this.e, this.f7363a);
            if (d == null) {
                if (this.i) {
                    d = c(this.e, R.drawable.dark_dinamicx_checked);
                } else {
                    d = c(this.e, R.drawable.dinamicx_checked);
                }
            }
            Drawable h = h(d, this.e, this.f, this.g);
            Drawable d2 = d(this.e, this.b);
            if (d2 == null) {
                if (this.i) {
                    d2 = c(this.e, R.drawable.dark_dinamicx_uncheck);
                } else {
                    d2 = c(this.e, R.drawable.dinamicx_uncheck);
                }
            }
            Drawable h2 = h(d2, this.e, this.f, this.g);
            Drawable d3 = d(this.e, this.c);
            if (d3 == null) {
                if (this.i) {
                    d3 = c(this.e, R.drawable.dark_dinamicx_discheck);
                } else {
                    d3 = c(this.e, R.drawable.dinamicx_discheck);
                }
            }
            Drawable h3 = h(d3, this.e, this.f, this.g);
            Drawable d4 = d(this.e, this.d);
            if (d4 == null) {
                if (this.i) {
                    d4 = c(this.e, R.drawable.dark_dinamicx_disunchk);
                } else {
                    d4 = c(this.e, R.drawable.dinamicx_disunchk);
                }
            }
            return new Drawable[]{h, h2, h3, h(d4, this.e, this.f, this.g)};
        }

        /* renamed from: g */
        public void onPostExecute(Drawable[] drawableArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5124347c", new Object[]{this, drawableArr});
                return;
            }
            AppCompatCheckBox appCompatCheckBox = this.h.get();
            if (appCompatCheckBox != null) {
                String str = (String) appCompatCheckBox.getTag(DXCheckBoxWidgetNode.NEED_INT_CHECK_IMG);
                String str2 = (String) appCompatCheckBox.getTag(DXCheckBoxWidgetNode.NEED_INT_UNCHECK_IMG);
                String str3 = (String) appCompatCheckBox.getTag(DXCheckBoxWidgetNode.NEED_INT_DIS_CHECK_IMG);
                String str4 = (String) appCompatCheckBox.getTag(DXCheckBoxWidgetNode.NEED_INT_DIS_UNCHECK_IMG);
                if (str.equals(this.f7363a) && str2.equals(this.b) && str3.equals(this.c) && str4.equals(this.d)) {
                    i(appCompatCheckBox, drawableArr[0], drawableArr[1], drawableArr[2], drawableArr[3]);
                    appCompatCheckBox.setTag(DXCheckBoxWidgetNode.ALREADY_INT_CHECK_IMG, str);
                    appCompatCheckBox.setTag(DXCheckBoxWidgetNode.ALREADY_INT_UNCHECK_IMG, str2);
                    appCompatCheckBox.setTag(DXCheckBoxWidgetNode.ALREADY_INT_DIS_CHECK_IMG, str3);
                    appCompatCheckBox.setTag(DXCheckBoxWidgetNode.ALREADY_INT_DIS_UNCHECK_IMG, str4);
                }
            }
        }

        public final Drawable h(Drawable drawable, Context context, int i, int i2) {
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

        public void i(AppCompatCheckBox appCompatCheckBox, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a04c7b25", new Object[]{this, appCompatCheckBox, drawable, drawable2, drawable3, drawable4});
            } else if (appCompatCheckBox != null) {
                appCompatCheckBox.setButtonDrawable(e(drawable, drawable2, drawable3, drawable4));
            }
        }
    }

    static {
        t2o.a(444597282);
    }

    public DXCheckBoxWidgetNode() {
        setAccessibility(1);
    }

    public static /* synthetic */ Object ipc$super(DXCheckBoxWidgetNode dXCheckBoxWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXCheckBoxWidgetNode");
        }
    }

    public static /* synthetic */ boolean t(DXCheckBoxWidgetNode dXCheckBoxWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9fbef98", new Object[]{dXCheckBoxWidgetNode})).booleanValue();
        }
        return dXCheckBoxWidgetNode.g;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXCheckBoxWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean extraHandleDark() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abe5f779", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (-273786109416499313L == j) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (view != null && (view instanceof AppCompatCheckBox) && j == 5288679823228297259L) {
            ((AppCompatCheckBox) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.dinamicx.widget.DXCheckBoxWidgetNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                    } else if (!DXCheckBoxWidgetNode.t(DXCheckBoxWidgetNode.this)) {
                        DXCheckBoxEvent dXCheckBoxEvent = new DXCheckBoxEvent(5288679823228297259L);
                        dXCheckBoxEvent.setChecked(z);
                        DXCheckBoxWidgetNode.this.postEvent(dXCheckBoxEvent);
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof DXCheckBoxWidgetNode) {
            DXCheckBoxWidgetNode dXCheckBoxWidgetNode = (DXCheckBoxWidgetNode) dXWidgetNode;
            this.f7362a = dXCheckBoxWidgetNode.f7362a;
            setEnabled(dXCheckBoxWidgetNode.getEnabled());
            this.b = dXCheckBoxWidgetNode.b;
            this.c = dXCheckBoxWidgetNode.c;
            this.d = dXCheckBoxWidgetNode.d;
            this.e = dXCheckBoxWidgetNode.e;
            this.g = dXCheckBoxWidgetNode.g;
            this.f = dXCheckBoxWidgetNode.f;
            this.h = dXCheckBoxWidgetNode.h;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        if (this.h) {
            return new AppCompatCheckBox(context, null, -1);
        }
        return new AppCompatCheckBox(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        if (a2 == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (a3 != 1073741824) {
            z2 = false;
        }
        if (z) {
            i3 = DXWidgetNode.DXMeasureSpec.b(i);
        } else {
            i3 = 0;
        }
        if (z2) {
            i4 = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(i3, i4);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view != null && (view instanceof AppCompatCheckBox)) {
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view;
            appCompatCheckBox.setClickable(true);
            if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
                appCompatCheckBox.setButtonDrawable((Drawable) null);
            } else {
                v(appCompatCheckBox, getMeasuredWidth(), getMeasuredHeight());
            }
            if (this.f7362a != 1) {
                z = false;
            }
            w(appCompatCheckBox, z);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        if (4729585112602995918L == j) {
            this.f7362a = i;
        }
        if (-273786109416499313L == j) {
            if (i == 0) {
                z = false;
            }
            this.f = z;
        } else if (j == 841016511269201341L) {
            if (i == 0) {
                z = false;
            }
            this.h = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (1748192772052832291L == j) {
            this.b = str;
        } else if (-2878833559981654264L == j) {
            this.c = str;
        } else if (-6932240350857271226L == j) {
            this.d = str;
        } else if (1972862905129200737L == j) {
            this.e = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 3;
    }

    public void setAsyncImageLoad(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2348c6", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        if (getClass() == DXCheckBoxWidgetNode.class) {
            return true;
        }
        return false;
    }

    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("255c6f6b", new Object[]{this})).intValue();
        }
        return this.f7362a;
    }

    public void v(AppCompatCheckBox appCompatCheckBox, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b685e9", new Object[]{this, appCompatCheckBox, new Integer(i), new Integer(i2)});
            return;
        }
        String str = this.b;
        int i3 = ALREADY_INT_CHECK_IMG;
        String str2 = (String) appCompatCheckBox.getTag(i3);
        if (str == null) {
            str = "dinamicx_checked";
        }
        String str3 = this.c;
        int i4 = ALREADY_INT_UNCHECK_IMG;
        String str4 = (String) appCompatCheckBox.getTag(i4);
        if (str3 == null) {
            str3 = "dinamicx_uncheck";
        }
        String str5 = this.d;
        int i5 = ALREADY_INT_DIS_CHECK_IMG;
        String str6 = (String) appCompatCheckBox.getTag(i5);
        if (str5 == null) {
            str5 = "dinamicx_discheck";
        }
        String str7 = this.e;
        int i6 = ALREADY_INT_DIS_UNCHECK_IMG;
        String str8 = (String) appCompatCheckBox.getTag(i6);
        if (str7 == null) {
            str7 = "dinamicx_disunchk";
        }
        if (needHandleDark(getDXRuntimeContext())) {
            str = "dark_".concat(str);
            str3 = "dark_".concat(str3);
            str5 = "dark_".concat(str5);
            str7 = "dark_".concat(str7);
        }
        if (str2 == null && str4 == null && str6 == null && str8 == null) {
            appCompatCheckBox.setButtonDrawable((Drawable) null);
        }
        if (!str.equals(str2) || !str3.equals(str4) || !str5.equals(str6) || !str7.equals(str8)) {
            b bVar = new b(appCompatCheckBox, str, str3, str5, str7, i, i2, needHandleDark(getDXRuntimeContext()));
            if (this.f) {
                appCompatCheckBox.setTag(NEED_INT_CHECK_IMG, str);
                appCompatCheckBox.setTag(NEED_INT_UNCHECK_IMG, str3);
                appCompatCheckBox.setTag(NEED_INT_DIS_CHECK_IMG, str5);
                appCompatCheckBox.setTag(NEED_INT_DIS_UNCHECK_IMG, str7);
                jb6.s(bVar, new Void[0]);
                return;
            }
            Drawable[] a2 = b.a(bVar);
            bVar.i(appCompatCheckBox, a2[0], a2[1], a2[2], a2[3]);
            appCompatCheckBox.setTag(i3, str);
            appCompatCheckBox.setTag(i4, str3);
            appCompatCheckBox.setTag(i5, str5);
            appCompatCheckBox.setTag(i6, str7);
        }
    }

    public void w(AppCompatCheckBox appCompatCheckBox, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d8724c", new Object[]{this, appCompatCheckBox, new Boolean(z)});
        } else if (appCompatCheckBox != null) {
            this.g = true;
            appCompatCheckBox.setChecked(z);
            this.g = false;
        }
    }
}
