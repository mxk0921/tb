package com.alipay.mobile.verifyidentity.safepaybase.alikeyboard;

import android.content.Context;
import android.graphics.Point;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.security.realidentity.o;
import com.alipay.android.app.safepaybase.alikeyboard.AbstractKeyboard;
import com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.alipay.mobile.verifyidentity.safepaybase.util.LogUtils;
import com.alipay.mobile.verifyidentity.safepaybase.util.UIUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.xiaomi.mipush.sdk.Constants;
import tb.bmv;
import tb.f7l;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class QwertyKeyboard extends AbstractKeyboard implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f4439a;
    public TextView b;
    public TextView h;
    public final FrameLayout u;
    public QwertType c = QwertType.abc;
    public ShiftType d = ShiftType.up;
    public TextView[] e = new TextView[10];
    public TextView[] f = new TextView[9];
    public TextView[] g = new TextView[7];
    public final String[] i = {"q", "w", "e", "r", "t", "y", "u", bmv.MSGTYPE_INTERVAL, o.b, "p"};
    public final String[] j = {"a", "s", "d", "f", at.f, "h", at.j, at.k, "l"};
    public final String[] k = {AmnetConstant.VAL_SUPPORT_ZSTD, "x", "c", "v", TplMsg.VALUE_T_NATIVE_RETURN, "n", "m"};
    public final String[] l = {"Q", "W", "E", "R", "T", "Y", "U", TLogTracker.LEVEL_INFO, "O", "P"};
    public final String[] m = {"A", ExifInterface.LATITUDE_SOUTH, TLogTracker.LEVEL_DEBUG, UTConstant.Args.UT_SUCCESS_F, "G", "H", "J", "K", "L"};
    public final String[] n = {"Z", "X", "C", "V", "B", "N", "M"};
    public final String[] o = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    public final String[] p = {Constants.WAVE_SEPARATOR, f7l.AND_NOT, "@", "#", f7l.MOD, "'", "&", "*", "?"};
    public final String[] q = {f7l.BRACKET_START_STR, f7l.BRACKET_END_STR, "-", "_", ":", ";", "/"};
    public final String[] r = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    public final String[] s = {"<", ">", f7l.PLUS, "=", "÷", "^", "`", "[", "]"};
    public final String[] t = {"\\", "|", "\"", "$", "￥", "{", "}"};
    public double v = vu3.b.GEO_NOT_SUPPORT;
    public int w = 0;
    public float x = 0.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum QwertType {
        abc,
        num;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(QwertType qwertType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/safepaybase/alikeyboard/QwertyKeyboard$QwertType");
        }

        public static QwertType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (QwertType) ipChange.ipc$dispatch("92292cc5", new Object[]{str});
            }
            return (QwertType) Enum.valueOf(QwertType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum ShiftType {
        up,
        down;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ShiftType shiftType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/safepaybase/alikeyboard/QwertyKeyboard$ShiftType");
        }

        public static ShiftType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShiftType) ipChange.ipc$dispatch("ef737a64", new Object[]{str});
            }
            return (ShiftType) Enum.valueOf(ShiftType.class, str);
        }
    }

    public QwertyKeyboard(Context context, FrameLayout frameLayout, OnKeyboardListener onKeyboardListener) {
        this.onKeyboardListener = onKeyboardListener;
        LogUtils.a("QwertyKeyboard::init", "init");
        this.keyboardView = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.vi_keyboard_qwerty, (ViewGroup) null, false);
        this.u = frameLayout;
        a(context);
        b(context);
    }

    public static /* synthetic */ Object ipc$super(QwertyKeyboard qwertyKeyboard, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/safepaybase/alikeyboard/QwertyKeyboard");
    }

    public final void a(Context context) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
            return;
        }
        int childCount = this.keyboardView.getChildCount();
        this.v = context.getResources().getDisplayMetrics().density;
        Pair<Integer, Integer> a2 = UIUtils.a(context);
        int intValue = ((Integer) a2.first).intValue();
        int intValue2 = ((Integer) a2.second).intValue();
        double d = this.v;
        int i2 = ((int) (intValue - ((d * 1.5d) * 2.0d))) / 10;
        this.w = i2;
        this.x = (float) (i2 * 0.65d);
        int i3 = (int) (((i2 - ((d * 4.5d) * 2.0d)) * 1.45d) + (7.0d * d * 2.0d));
        double d2 = intValue2 * 0.4d;
        if (i3 * 4 > d2) {
            i3 = (int) (d2 / 4.0d);
            float f = (float) ((i3 - ((9.0d * d) * 2.0d)) - (10.0d * d));
            this.x = f;
            if (f > d * 30.0d) {
                this.x = (float) (30.0d * d);
            }
        }
        int i4 = ((int) (((intValue - (i2 * 7)) - ((1.5d * d) * 2.0d)) - ((d * 4.5d) * 4.0d))) / 2;
        int i5 = i2 * 4;
        int i6 = i2 + i4;
        int i7 = 0;
        while (i7 < childCount) {
            LinearLayout linearLayout = (LinearLayout) this.keyboardView.getChildAt(i7);
            if (linearLayout != null) {
                ((LinearLayout.LayoutParams) linearLayout.getLayoutParams()).height = i3;
                linearLayout.setGravity(1);
                int childCount2 = linearLayout.getChildCount();
                if (i7 == 0) {
                    this.e = new TextView[childCount2];
                    for (int i8 = 0; i8 < childCount2; i8++) {
                        FrameLayout frameLayout = (FrameLayout) linearLayout.getChildAt(i8);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.width = this.w;
                        layoutParams.weight = 0.0f;
                        TextView textView = (TextView) frameLayout.getChildAt(0);
                        textView.setTextSize(0, this.x);
                        textView.setAccessibilityDelegate(new SecureAccessbilityDelegate());
                        frameLayout.setOnTouchListener(this);
                        this.e[i8] = textView;
                    }
                } else if (i7 == 1) {
                    this.f = new TextView[childCount2];
                    for (int i9 = 0; i9 < childCount2; i9++) {
                        FrameLayout frameLayout2 = (FrameLayout) linearLayout.getChildAt(i9);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) frameLayout2.getLayoutParams();
                        layoutParams2.width = this.w;
                        layoutParams2.weight = 0.0f;
                        TextView textView2 = (TextView) frameLayout2.getChildAt(0);
                        textView2.setTextSize(0, this.x);
                        textView2.setAccessibilityDelegate(new SecureAccessbilityDelegate());
                        frameLayout2.setOnTouchListener(this);
                        this.f[i9] = textView2;
                    }
                } else if (i7 == i) {
                    this.g = new TextView[childCount2 - 2];
                    for (int i10 = 0; i10 < childCount2; i10++) {
                        FrameLayout frameLayout3 = (FrameLayout) linearLayout.getChildAt(i10);
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) frameLayout3.getLayoutParams();
                        if (i10 == 0) {
                            layoutParams3.width = i4;
                            this.f4439a = frameLayout3;
                        } else if (i10 == childCount2 - 1) {
                            layoutParams3.width = i4;
                        } else {
                            layoutParams3.width = this.w;
                            layoutParams3.weight = 0.0f;
                            TextView textView3 = (TextView) frameLayout3.getChildAt(0);
                            textView3.setTextSize(0, this.x);
                            textView3.setAccessibilityDelegate(new SecureAccessbilityDelegate());
                            this.g[i10 - 1] = textView3;
                            layoutParams3.width = this.w;
                            layoutParams3.weight = 0.0f;
                            frameLayout3.setOnTouchListener(this);
                        }
                        layoutParams3.weight = 0.0f;
                        frameLayout3.setOnTouchListener(this);
                    }
                } else {
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        View childAt = linearLayout.getChildAt(i11);
                        childAt.setAccessibilityDelegate(new SecureAccessbilityDelegate());
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                        if (i11 == 0) {
                            layoutParams4.width = i4;
                            TextView textView4 = (TextView) childAt;
                            this.b = textView4;
                            textView4.setTextSize(0, this.x);
                        } else if (i11 == 1) {
                            layoutParams4.width = this.w;
                            ((TextView) ((FrameLayout) childAt).getChildAt(0)).setTextSize(0, this.x);
                        } else if (i11 == 2) {
                            layoutParams4.width = i5;
                            ((TextView) ((FrameLayout) childAt).getChildAt(0)).setTextSize(0, this.x);
                        } else if (i11 == 3) {
                            layoutParams4.width = this.w;
                            ((TextView) ((FrameLayout) childAt).getChildAt(0)).setTextSize(0, this.x);
                        } else {
                            layoutParams4.width = i6;
                            ((TextView) childAt).setTextSize(0, this.x);
                        }
                        layoutParams4.weight = 0.0f;
                        childAt.setOnTouchListener(this);
                    }
                }
            }
            i7++;
            i = 2;
        }
    }

    public final void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be84db39", new Object[]{this, context});
            return;
        }
        this.h = new TextView(context);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.height = -2;
        layoutParams.width = (this.w - ((int) (context.getResources().getDisplayMetrics().density * 9.0d))) * 2;
        this.h.setTextSize(1, 35.0f);
        this.h.setLayoutParams(layoutParams);
        this.h.setTextColor(-16777216);
        this.h.setGravity(17);
        this.h.setVisibility(4);
        FrameLayout frameLayout = this.u;
        if (frameLayout != null) {
            frameLayout.addView(this.h);
        }
    }

    public final boolean c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c44d54d", new Object[]{this, view})).booleanValue();
        }
        int id = view.getId();
        if (id == R.id.key_del1) {
            onDel();
        } else if (id != R.id.key_enter) {
            if (id == R.id.key_space) {
                onInput(" ");
            } else if (id == R.id.key_ABC) {
                ShiftType shiftType = this.d;
                ShiftType shiftType2 = ShiftType.up;
                if (shiftType == shiftType2) {
                    shiftType2 = ShiftType.down;
                }
                this.d = shiftType2;
                f(this.c, shiftType2);
            } else if (id == R.id.key_123) {
                QwertType qwertType = this.c;
                QwertType qwertType2 = QwertType.abc;
                if (qwertType == qwertType2) {
                    qwertType2 = QwertType.num;
                }
                this.c = qwertType2;
                ShiftType shiftType3 = ShiftType.up;
                this.d = shiftType3;
                f(qwertType2, shiftType3);
            } else {
                String charSequence = ((TextView) ((FrameLayout) view).getChildAt(0)).getText().toString();
                e(view, charSequence);
                onInput(charSequence);
            }
        }
        return false;
    }

    public final boolean d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("628c9334", new Object[]{this, view})).booleanValue();
        }
        if (view.getId() == R.id.key_enter) {
            onOK();
        }
        this.h.setVisibility(4);
        return false;
    }

    public final void e(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1324c7f0", new Object[]{this, view, str});
        } else if (this.u != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
            Point relatePoint = getRelatePoint(this.u, view);
            int width = (relatePoint.x - (this.h.getWidth() / 2)) + (view.getWidth() / 2);
            double d = this.v;
            layoutParams.setMargins(width, (((relatePoint.y - this.h.getHeight()) + view.getHeight()) + ((int) (3.0d * d))) - ((int) (d * 9.0d)), 0, 0);
            this.h.setLayoutParams(layoutParams);
            this.h.setText(str);
            this.h.setVisibility(0);
        }
    }

    public final void f(QwertType qwertType, ShiftType shiftType) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65209521", new Object[]{this, qwertType, shiftType});
            return;
        }
        if (qwertType == QwertType.abc) {
            this.f4439a.getChildAt(0).setVisibility(0);
            this.f4439a.getChildAt(1).setVisibility(8);
            this.b.setText("123");
            if (shiftType == ShiftType.up) {
                ((ImageView) this.f4439a.getChildAt(0)).setImageResource(R.drawable.vi_keyboard_key_shift_up);
                strArr2 = this.i;
                strArr = this.j;
                strArr3 = this.k;
            } else {
                ((ImageView) this.f4439a.getChildAt(0)).setImageResource(R.drawable.vi_keyboard_key_shift_down);
                strArr2 = this.l;
                strArr = this.m;
                strArr3 = this.n;
            }
        } else {
            this.f4439a.getChildAt(0).setVisibility(8);
            this.f4439a.getChildAt(1).setVisibility(0);
            if (this.f4439a.getChildAt(1) instanceof TextView) {
                ((TextView) this.f4439a.getChildAt(1)).setTextSize(0, this.x);
            }
            this.b.setText("abc");
            if (shiftType == ShiftType.up) {
                ((TextView) this.f4439a.getChildAt(1)).setText("123");
                strArr2 = this.o;
                strArr = this.p;
                strArr3 = this.q;
            } else {
                ((TextView) this.f4439a.getChildAt(1)).setText("#+=");
                strArr2 = this.r;
                strArr = this.s;
                strArr3 = this.t;
            }
        }
        int i2 = 0;
        while (true) {
            TextView[] textViewArr = this.e;
            if (i2 >= textViewArr.length) {
                break;
            }
            textViewArr[i2].setText(strArr2[i2]);
            i2++;
        }
        int i3 = 0;
        while (true) {
            TextView[] textViewArr2 = this.f;
            if (i3 < textViewArr2.length) {
                textViewArr2[i3].setText(strArr[i3]);
                i3++;
            }
        }
        while (true) {
            TextView[] textViewArr3 = this.g;
            if (i < textViewArr3.length) {
                textViewArr3[i].setText(strArr3[i]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            return c(view);
        }
        if (motionEvent.getAction() == 1) {
            return d(view);
        }
        return false;
    }
}
