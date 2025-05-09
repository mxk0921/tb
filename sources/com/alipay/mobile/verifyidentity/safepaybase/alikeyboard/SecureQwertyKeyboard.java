package com.alipay.mobile.verifyidentity.safepaybase.alikeyboard;

import android.content.Context;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.security.realidentity.o;
import com.alipay.android.app.safepaybase.alikeyboard.AbstractKeyboard;
import com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureFrameLayout;
import com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Locale;
import tb.bmv;
import tb.f7l;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SecureQwertyKeyboard extends AbstractKeyboard implements TextToSpeech.OnInitListener, View.OnClickListener, View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f4440a;
    public TextView b;
    public View c;
    public final Context x;
    public QwertType d = QwertType.abc;
    public ShiftType e = ShiftType.up;
    public TextView[] f = new TextView[10];
    public TextView[] g = new TextView[9];
    public TextView[] h = new TextView[7];
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
    public double u = vu3.b.GEO_NOT_SUPPORT;
    public int v = 0;
    public float w = 0.0f;
    public TextToSpeech y = null;
    public AccessibilityManager z = null;
    public boolean A = false;
    public SecureTextView.SendAccessiBilityEventListener stvAccessListener = new SecureTextView.SendAccessiBilityEventListener() { // from class: com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureQwertyKeyboard.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureTextView.SendAccessiBilityEventListener
        public boolean handleAccessiBilityEvent(SecureTextView secureTextView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bf625519", new Object[]{this, secureTextView, new Integer(i)})).booleanValue();
            }
            if (secureTextView.getParent() != null && (secureTextView.getParent() instanceof SecureFrameLayout)) {
                ((SecureFrameLayout) secureTextView.getParent()).sendAccessibilityEvent(i);
            }
            return true;
        }
    };
    public SecureFrameLayout.SendAccessiBilityEventListener sflAccessListenr = new SecureFrameLayout.SendAccessiBilityEventListener() { // from class: com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureQwertyKeyboard.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureFrameLayout.SendAccessiBilityEventListener
        public boolean handleAccessiBilityEvent(SecureFrameLayout secureFrameLayout, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1861a84e", new Object[]{this, secureFrameLayout, new Integer(i)})).booleanValue();
            }
            if (i == 128) {
                if (SecureQwertyKeyboard.access$300(SecureQwertyKeyboard.this)) {
                    SecureQwertyKeyboard.access$400(SecureQwertyKeyboard.this).sendAccessibilityEvent(32768);
                    secureFrameLayout.performAccessibilityAction(64, null);
                    SecureQwertyKeyboard.access$600(SecureQwertyKeyboard.this, SecureQwertyKeyboard.access$500(SecureQwertyKeyboard.this, secureFrameLayout, i));
                }
                return true;
            } else if (i == 1) {
                if (!(!SecureQwertyKeyboard.access$300(SecureQwertyKeyboard.this) || secureFrameLayout.getId() == R.id.key_ABC || secureFrameLayout.getId() == R.id.key_123)) {
                    SecureQwertyKeyboard.access$600(SecureQwertyKeyboard.this, SecureQwertyKeyboard.access$500(SecureQwertyKeyboard.this, secureFrameLayout, i));
                }
                return true;
            } else {
                if (i == 32768 && SecureQwertyKeyboard.access$300(SecureQwertyKeyboard.this)) {
                    SecureQwertyKeyboard.access$600(SecureQwertyKeyboard.this, SecureQwertyKeyboard.access$500(SecureQwertyKeyboard.this, secureFrameLayout, i));
                }
                return true;
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum QwertType {
        abc,
        num;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(QwertType qwertType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/safepaybase/alikeyboard/SecureQwertyKeyboard$QwertType");
        }

        public static QwertType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (QwertType) ipChange.ipc$dispatch("c196250e", new Object[]{str});
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/safepaybase/alikeyboard/SecureQwertyKeyboard$ShiftType");
        }

        public static ShiftType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShiftType) ipChange.ipc$dispatch("1ee072ad", new Object[]{str});
            }
            return (ShiftType) Enum.valueOf(ShiftType.class, str);
        }
    }

    static {
        new HashMap<String, String>() { // from class: com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureQwertyKeyboard.4
            {
                put(Constants.WAVE_SEPARATOR, "msp_secure_key_tilde");
                put(f7l.AND_NOT, "msp_secure_key_exclamation_point");
                put("@", "msp_secure_key_at");
                put("#", "msp_secure_key_sharp");
                put(f7l.MOD, "msp_secure_key_percent");
                put("'", "msp_secure_key_quotesingle");
                put("&", "msp_secure_key_and");
                put("*", "msp_secure_key_star");
                put("?", "msp_secure_key_ask");
                put(f7l.BRACKET_START_STR, "msp_secure_key_left_bracket");
                put(f7l.BRACKET_END_STR, "msp_secure_key_right_bracket");
                put("-", "msp_secure_key_minus");
                put("_", "msp_secure_key_underscore");
                put(":", "msp_secure_key_colon");
                put(";", "msp_secure_key_semiconlon");
                put("/", "msp_secure_key_slash");
                put("<", "msp_secure_key_less");
                put(">", "msp_secure_key_more");
                put(f7l.PLUS, "msp_secure_key_plus");
                put("=", "msp_secure_key_equal");
                put("÷", "msp_secure_key_divide");
                put("^", "msp_secure_key_hat");
                put("`", "msp_secure_key_apostrophe");
                put("[", "msp_secure_key_left_square");
                put("]", "msp_secure_key_right_square");
                put("\\", "msp_secure_key_backslash");
                put("|", "msp_secure_key_vertical");
                put("\"", "msp_secure_key_quotedouble");
                put("$", "msp_secure_key_dollar");
                put("￥", "msp_secure_key_money");
                put("{", "msp_secure_key_left_brace");
                put("}", "msp_secure_key_right_brace");
                put(",", "msp_secure_key_comma");
                put(".", "msp_secure_key_dot");
            }
        };
    }

    public SecureQwertyKeyboard(Context context, FrameLayout frameLayout, OnKeyboardListener onKeyboardListener) {
        this.x = null;
        this.onKeyboardListener = onKeyboardListener;
        this.keyboardView = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.vi_keyboard_secure_qwerty, (ViewGroup) null, false);
        this.x = context;
        e();
        f(context);
    }

    public static /* synthetic */ AccessibilityManager access$000(SecureQwertyKeyboard secureQwertyKeyboard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityManager) ipChange.ipc$dispatch("324fc52c", new Object[]{secureQwertyKeyboard});
        }
        return secureQwertyKeyboard.z;
    }

    public static /* synthetic */ TextToSpeech access$100(SecureQwertyKeyboard secureQwertyKeyboard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextToSpeech) ipChange.ipc$dispatch("716a0b82", new Object[]{secureQwertyKeyboard});
        }
        return secureQwertyKeyboard.y;
    }

    public static /* synthetic */ TextToSpeech access$102(SecureQwertyKeyboard secureQwertyKeyboard, TextToSpeech textToSpeech) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextToSpeech) ipChange.ipc$dispatch("cf722b6a", new Object[]{secureQwertyKeyboard, textToSpeech});
        }
        secureQwertyKeyboard.y = textToSpeech;
        return textToSpeech;
    }

    public static /* synthetic */ Context access$200(SecureQwertyKeyboard secureQwertyKeyboard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1d7d1bb", new Object[]{secureQwertyKeyboard});
        }
        return secureQwertyKeyboard.x;
    }

    public static /* synthetic */ boolean access$300(SecureQwertyKeyboard secureQwertyKeyboard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec930e66", new Object[]{secureQwertyKeyboard})).booleanValue();
        }
        return secureQwertyKeyboard.A;
    }

    public static /* synthetic */ boolean access$302(SecureQwertyKeyboard secureQwertyKeyboard, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15a84bb8", new Object[]{secureQwertyKeyboard, new Boolean(z)})).booleanValue();
        }
        secureQwertyKeyboard.A = z;
        return z;
    }

    public static /* synthetic */ View access$400(SecureQwertyKeyboard secureQwertyKeyboard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ec4b0b03", new Object[]{secureQwertyKeyboard});
        }
        return secureQwertyKeyboard.c;
    }

    public static /* synthetic */ String access$500(SecureQwertyKeyboard secureQwertyKeyboard, SecureFrameLayout secureFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4d8e9db", new Object[]{secureQwertyKeyboard, secureFrameLayout, new Integer(i)});
        }
        return secureQwertyKeyboard.d(secureFrameLayout, i);
    }

    public static /* synthetic */ void access$600(SecureQwertyKeyboard secureQwertyKeyboard, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19608e49", new Object[]{secureQwertyKeyboard, str});
        } else {
            secureQwertyKeyboard.b(str);
        }
    }

    public static /* synthetic */ Object ipc$super(SecureQwertyKeyboard secureQwertyKeyboard, String str, Object... objArr) {
        if (str.hashCode() == 1466578404) {
            return super.getView();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/safepaybase/alikeyboard/SecureQwertyKeyboard");
    }

    public final void a(QwertType qwertType, ShiftType shiftType) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5826f4a", new Object[]{this, qwertType, shiftType});
        } else if (this.A) {
            if (qwertType == QwertType.abc) {
                if (shiftType == ShiftType.up) {
                    str = this.x.getString(R.string.vi_secure_keyboard_type_lowercase_letter);
                } else {
                    str = this.x.getString(R.string.vi_secure_keyboard_type_uppercase_letter);
                }
            } else if (shiftType == ShiftType.up) {
                str = this.x.getString(R.string.vi_secure_keyboard_type_digital_sign);
            } else {
                str = this.x.getString(R.string.vi_secure_keyboard_type_special_sign);
            }
            try {
                if (this.z.isTouchExplorationEnabled()) {
                    this.y.speak(str, 0, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3e72c9", new Object[]{this, str});
            return;
        }
        try {
            if (this.z.isTouchExplorationEnabled()) {
                this.y.speak(str, 0, null);
            }
        } catch (Throwable unused) {
        }
    }

    public final String d(SecureFrameLayout secureFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7c09b52", new Object[]{this, secureFrameLayout, new Integer(i)});
        }
        int id = secureFrameLayout.getId();
        if (id == R.id.key_del1) {
            String string = this.x.getString(R.string.vi_secure_keyboard_del);
            if (i == 1) {
                return this.x.getString(R.string.vi_secure_keyboard_already_del);
            }
            return string;
        } else if (id == R.id.key_space) {
            return this.x.getString(R.string.vi_secure_keyboard_space);
        } else {
            if (id == R.id.key_ABC) {
                if (this.f4440a.getChildAt(0).getVisibility() == 0) {
                    return this.x.getString(R.string.vi_secure_keyboard_shift);
                }
                return ((TextView) secureFrameLayout.getChildAt(1)).getText().toString();
            } else if (id == R.id.key_enter) {
                return this.x.getString(R.string.vi_secure_keyboard_compelete);
            } else {
                return c(((TextView) secureFrameLayout.getChildAt(0)).getText().toString());
            }
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d7ce1a", new Object[]{this});
            return;
        }
        this.z = (AccessibilityManager) this.x.getSystemService("accessibility");
        this.keyboardView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureQwertyKeyboard.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                } else if (SecureQwertyKeyboard.access$000(SecureQwertyKeyboard.this).isTouchExplorationEnabled()) {
                    try {
                        SecureQwertyKeyboard.access$102(SecureQwertyKeyboard.this, new TextToSpeech(SecureQwertyKeyboard.access$200(SecureQwertyKeyboard.this), SecureQwertyKeyboard.this));
                    } catch (SecurityException unused) {
                        SecureQwertyKeyboard.access$302(SecureQwertyKeyboard.this, false);
                    }
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                } else if (SecureQwertyKeyboard.access$300(SecureQwertyKeyboard.this)) {
                    SecureQwertyKeyboard.access$100(SecureQwertyKeyboard.this).shutdown();
                    SecureQwertyKeyboard.access$302(SecureQwertyKeyboard.this, false);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.content.Context r26) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureQwertyKeyboard.f(android.content.Context):void");
    }

    @Override // com.alipay.android.app.safepaybase.alikeyboard.AbstractKeyboard
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return super.getView();
    }

    public final boolean h(View view) {
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
                ShiftType shiftType = this.e;
                ShiftType shiftType2 = ShiftType.up;
                if (shiftType == shiftType2) {
                    shiftType2 = ShiftType.down;
                }
                this.e = shiftType2;
                k(this.d, shiftType2);
            } else if (id == R.id.key_123) {
                QwertType qwertType = this.d;
                QwertType qwertType2 = QwertType.abc;
                if (qwertType == qwertType2) {
                    qwertType2 = QwertType.num;
                }
                this.d = qwertType2;
                ShiftType shiftType3 = ShiftType.up;
                this.e = shiftType3;
                k(qwertType2, shiftType3);
            } else {
                onInput(((TextView) ((FrameLayout) view).getChildAt(0)).getText().toString());
            }
        }
        return false;
    }

    public final boolean i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("628c9334", new Object[]{this, view})).booleanValue();
        }
        if (view.getId() == R.id.key_enter) {
            onOK();
        }
        return false;
    }

    public final void j(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462e4b3f", new Object[]{this, view});
        } else if (Build.VERSION.SDK_INT >= 26) {
            view.setOnClickListener(this);
        } else {
            view.setOnTouchListener(this);
        }
    }

    public final void k(QwertType qwertType, ShiftType shiftType) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9a1b41", new Object[]{this, qwertType, shiftType});
            return;
        }
        if (qwertType == QwertType.abc) {
            this.f4440a.getChildAt(0).setVisibility(0);
            this.f4440a.getChildAt(1).setVisibility(8);
            this.b.setText("123");
            if (shiftType == ShiftType.up) {
                ((ImageView) this.f4440a.getChildAt(0)).setImageResource(R.drawable.vi_keyboard_key_shift_up);
                strArr3 = this.i;
                strArr2 = this.j;
                strArr = this.k;
            } else {
                ((ImageView) this.f4440a.getChildAt(0)).setImageResource(R.drawable.vi_keyboard_key_shift_down);
                strArr3 = this.l;
                strArr2 = this.m;
                strArr = this.n;
            }
        } else {
            this.f4440a.getChildAt(0).setVisibility(8);
            this.f4440a.getChildAt(1).setVisibility(0);
            if (this.f4440a.getChildAt(1) instanceof TextView) {
                ((TextView) this.f4440a.getChildAt(1)).setTextSize(0, this.w);
            }
            this.b.setText("abc");
            if (shiftType == ShiftType.up) {
                ((TextView) this.f4440a.getChildAt(1)).setText("123");
                strArr3 = this.o;
                strArr2 = this.p;
                strArr = this.q;
            } else {
                ((TextView) this.f4440a.getChildAt(1)).setText("#+=");
                strArr3 = this.r;
                strArr2 = this.s;
                strArr = this.t;
            }
        }
        int i2 = 0;
        while (true) {
            TextView[] textViewArr = this.f;
            if (i2 >= textViewArr.length) {
                break;
            }
            textViewArr[i2].setText(strArr3[i2]);
            i2++;
        }
        int i3 = 0;
        while (true) {
            TextView[] textViewArr2 = this.g;
            if (i3 < textViewArr2.length) {
                textViewArr2[i3].setText(strArr2[i3]);
                i3++;
            }
        }
        while (true) {
            TextView[] textViewArr3 = this.h;
            if (i < textViewArr3.length) {
                textViewArr3[i].setText(strArr[i]);
                i++;
            } else {
                a(qwertType, shiftType);
                return;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.key_enter) {
            onOK();
        } else {
            h(view);
        }
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf9012d", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            if (g()) {
                int language = this.y.setLanguage(Locale.CHINA);
                if (language == -1 || language == -2) {
                    this.y.setLanguage(Locale.ENGLISH);
                }
            } else {
                this.y.setLanguage(Locale.ENGLISH);
            }
            this.A = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            return h(view);
        }
        if (motionEvent.getAction() == 1) {
            return i(view);
        }
        return false;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bca241fb", new Object[]{this})).booleanValue();
        }
        return "zh".equals(Locale.getDefault().getLanguage());
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c3 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cc A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d5 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01de A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e7 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f0 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f9 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0202 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x020b A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0214 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021d A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0226 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x022f A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0238 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0241 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x024a A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0253 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x025c A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0265 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x026e A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0277 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0280 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0289 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0292 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x029b A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a4 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ad A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02b6 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02bf A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c8 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d1 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02da A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e3 A[Catch: all -> 0x02f4, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ec A[Catch: all -> 0x02f4, TRY_LEAVE, TryCatch #0 {all -> 0x02f4, blocks: (B:6:0x0018, B:10:0x0025, B:11:0x0028, B:12:0x002b, B:13:0x002e, B:15:0x0033, B:18:0x003f, B:21:0x004c, B:24:0x0059, B:27:0x0066, B:30:0x0072, B:33:0x007e, B:36:0x008a, B:39:0x0096, B:42:0x00a2, B:45:0x00ae, B:48:0x00b9, B:51:0x00c5, B:54:0x00d1, B:57:0x00dd, B:60:0x00e9, B:63:0x00f5, B:66:0x0101, B:69:0x010d, B:72:0x0119, B:75:0x0125, B:78:0x0131, B:81:0x013d, B:84:0x0148, B:87:0x0154, B:90:0x015f, B:93:0x0169, B:96:0x0173, B:99:0x017d, B:102:0x0188, B:105:0x0192, B:108:0x019d, B:111:0x01a6, B:114:0x01b2, B:118:0x01bf, B:120:0x01c3, B:122:0x01cc, B:124:0x01d5, B:126:0x01de, B:128:0x01e7, B:130:0x01f0, B:132:0x01f9, B:134:0x0202, B:136:0x020b, B:138:0x0214, B:140:0x021d, B:142:0x0226, B:144:0x022f, B:146:0x0238, B:148:0x0241, B:150:0x024a, B:152:0x0253, B:154:0x025c, B:156:0x0265, B:158:0x026e, B:160:0x0277, B:162:0x0280, B:164:0x0289, B:166:0x0292, B:168:0x029b, B:170:0x02a4, B:172:0x02ad, B:174:0x02b6, B:176:0x02bf, B:178:0x02c8, B:180:0x02d1, B:182:0x02da, B:184:0x02e3, B:186:0x02ec), top: B:189:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureQwertyKeyboard.c(java.lang.String):java.lang.String");
    }
}
