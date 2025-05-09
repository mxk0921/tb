package io.unicorn.view;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import io.unicorn.embedding.android.UnicornView;
import io.unicorn.plugin.platform.PlatformViewsController;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.hdh;
import tb.m40;
import tb.s5m;
import tb.t2o;
import tb.u8x;
import tb.vpm;
import tb.wgw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class AccessibilityBridge extends AccessibilityNodeProvider {
    public static final int x = ((Action.SCROLL_RIGHT.value | Action.SCROLL_LEFT.value) | Action.SCROLL_UP.value) | Action.SCROLL_DOWN.value;
    public static final int y = ((((((((((Flag.HAS_CHECKED_STATE.value | Flag.IS_CHECKED.value) | Flag.IS_SELECTED.value) | Flag.IS_TEXT_FIELD.value) | Flag.IS_FOCUSED.value) | Flag.HAS_ENABLED_STATE.value) | Flag.IS_ENABLED.value) | Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.value) | Flag.HAS_TOGGLED_STATE.value) | Flag.IS_TOGGLED.value) | Flag.IS_FOCUSABLE.value) | Flag.IS_SLIDER.value;
    public static final int z = 267386881;

    /* renamed from: a  reason: collision with root package name */
    public final View f15223a;
    public final m40 b;
    public final AccessibilityManager c;
    public final AccessibilityViewEmbedder d;
    public final s5m e;
    public final ContentResolver f;
    public final Map<Integer, k> g;
    public final Map<Integer, h> h;
    public k i;
    public int j;
    public k k;
    public k l;
    public k m;
    public final List<Integer> n;
    public int o;
    public Integer p;
    public j q;
    public boolean r;
    public Boolean s;
    public final m40.a t;
    public final AccessibilityManager.AccessibilityStateChangeListener u;
    public final AccessibilityManager.TouchExplorationStateChangeListener v;
    public final ContentObserver w;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum AccessibilityFeature {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);
        
        final int value;

        AccessibilityFeature(int i) {
            this.value = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum Action {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);
        
        public final int value;

        Action(int i) {
            this.value = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum Flag {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216);
        
        final int value;

        Flag(int i) {
            this.value = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum StringAttributeType {
        SPELLOUT,
        LOCALE
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum TextDirection {
        UNKNOWN,
        LTR,
        RTL;

        public static TextDirection fromInt(int i) {
            if (i == 1) {
                return RTL;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return LTR;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements m40.a {
        public a() {
        }

        public void a(String str) {
            AccessibilityBridge.this.f15223a.announceForAccessibility(str);
        }

        public void b(int i) {
            AccessibilityBridge.this.K(i, 8);
        }

        public void c(int i) {
            AccessibilityBridge.this.K(i, 2);
        }

        public void d(int i) {
            AccessibilityBridge.this.K(i, 1);
        }

        public void e(String str) {
            if (Build.VERSION.SDK_INT < 28) {
                AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
                AccessibilityEvent B = accessibilityBridge.B(0, 32);
                B.getText().add(str);
                accessibilityBridge.L(B);
            }
        }

        public void f(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            AccessibilityBridge.this.R(byteBuffer, strArr);
        }

        public void g(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            AccessibilityBridge.this.S(byteBuffer, strArr, byteBufferArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements AccessibilityManager.AccessibilityStateChangeListener {
        public b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            boolean z2;
            AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
            if (!accessibilityBridge.r) {
                if (!z || !accessibilityBridge.c.isTouchExplorationEnabled()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                accessibilityBridge.x(z2);
                if (accessibilityBridge.q != null) {
                    ((UnicornView.e) accessibilityBridge.q).a(z, accessibilityBridge.c.isTouchExplorationEnabled());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class c extends ContentObserver {
        public c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            onChange(z, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
            if (!accessibilityBridge.r) {
                String string = Settings.Global.getString(accessibilityBridge.f, "transition_animation_scale");
                if (string == null || !string.equals("0")) {
                    accessibilityBridge.j &= ~AccessibilityFeature.DISABLE_ANIMATIONS.value;
                } else {
                    accessibilityBridge.j |= AccessibilityFeature.DISABLE_ANIMATIONS.value;
                }
                accessibilityBridge.M();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AccessibilityManager f15227a;

        public d(AccessibilityManager accessibilityManager) {
            this.f15227a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            boolean z2;
            AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
            if (!accessibilityBridge.r) {
                u8x.a("onTouchExplorationStateChanged");
                if (z) {
                    accessibilityBridge.j |= AccessibilityFeature.ACCESSIBLE_NAVIGATION.value;
                } else {
                    accessibilityBridge.E();
                    accessibilityBridge.j &= ~AccessibilityFeature.ACCESSIBLE_NAVIGATION.value;
                }
                accessibilityBridge.M();
                AccessibilityManager accessibilityManager = this.f15227a;
                if (!accessibilityManager.isEnabled() || !z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                accessibilityBridge.x(z2);
                if (accessibilityBridge.q != null) {
                    ((UnicornView.e) accessibilityBridge.q).a(accessibilityManager.isEnabled(), z);
                }
                u8x.b("onTouchExplorationStateChanged");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class e implements vpm<k> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f15228a;

        public e(AccessibilityBridge accessibilityBridge, k kVar) {
            this.f15228a = kVar;
        }

        /* renamed from: a */
        public boolean test(k kVar) {
            if (kVar == this.f15228a) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class f implements vpm<k> {
        public f(AccessibilityBridge accessibilityBridge) {
        }

        /* renamed from: a */
        public boolean test(k kVar) {
            return kVar.n0(Flag.HAS_IMPLICIT_SCROLLING);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15229a;

        static {
            int[] iArr = new int[StringAttributeType.values().length];
            f15229a = iArr;
            try {
                iArr[StringAttributeType.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15229a[StringAttributeType.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public int f15230a = -1;
        public int b = -1;
        public int c = -1;
        public String d;
        public String e;

        static {
            t2o.a(945815854);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class i extends m {
        public String d;

        static {
            t2o.a(945815856);
        }

        public i() {
            super(null);
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface j {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class k {
        public int B;
        public int C;
        public int D;
        public int E;
        public float F;
        public String G;
        public String H;
        public float I;
        public float J;
        public float K;
        public float L;
        public float[] M;
        public k N;
        public List<h> Q;
        public h R;
        public h S;
        public float[] U;
        public float[] W;
        public Rect X;

        /* renamed from: a  reason: collision with root package name */
        public final AccessibilityBridge f15231a;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public float l;
        public float m;
        public float n;
        public String o;
        public List<m> p;
        public String q;
        public List<m> r;
        public String s;
        public List<m> t;
        public String u;
        public List<m> v;
        public String w;
        public List<m> x;
        public String y;
        public int b = -1;
        public int z = -1;
        public boolean A = false;
        public final List<k> O = new ArrayList();
        public final List<k> P = new ArrayList();
        public boolean T = true;
        public boolean V = true;

        static {
            t2o.a(945815858);
        }

        public k(AccessibilityBridge accessibilityBridge) {
            this.f15231a = accessibilityBridge;
        }

        public static boolean s0(k kVar, vpm<k> vpmVar) {
            if (kVar == null || kVar.f0(vpmVar) == null) {
                return false;
            }
            return true;
        }

        public final void a0(List<k> list) {
            if (n0(Flag.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator it = ((ArrayList) this.O).iterator();
            while (it.hasNext()) {
                ((k) it.next()).a0(list);
            }
        }

        public final SpannableString b0(String str, List<m> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (m mVar : list) {
                    int i = g.f15229a[mVar.c.ordinal()];
                    if (i == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), mVar.f15232a, mVar.b, 0);
                    } else if (i == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((i) mVar).d)), mVar.f15232a, mVar.b, 0);
                    }
                }
            }
            return spannableString;
        }

        public final boolean c0() {
            String str;
            String str2 = this.o;
            if (str2 == null && this.H == null) {
                return false;
            }
            if (str2 == null || (str = this.H) == null || !str2.equals(str)) {
                return true;
            }
            return false;
        }

        public final boolean d0() {
            if (Float.isNaN(this.l) || Float.isNaN(this.F) || this.F == this.l) {
                return false;
            }
            return true;
        }

        public final void e0() {
            if (this.T) {
                this.T = false;
                if (this.U == null) {
                    this.U = new float[16];
                }
                if (!Matrix.invertM(this.U, 0, this.M, 0)) {
                    Arrays.fill(this.U, 0.0f);
                }
            }
        }

        public final k f0(vpm<k> vpmVar) {
            for (k kVar = this.N; kVar != null; kVar = kVar.N) {
                if (vpmVar.test(kVar)) {
                    return kVar;
                }
            }
            return null;
        }

        public final Rect g0() {
            return this.X;
        }

        public final String h0() {
            String str;
            if (n0(Flag.NAMES_ROUTE) && (str = this.o) != null && !str.isEmpty()) {
                return this.o;
            }
            Iterator it = ((ArrayList) this.O).iterator();
            while (it.hasNext()) {
                String h0 = ((k) it.next()).h0();
                if (h0 != null && !h0.isEmpty()) {
                    return h0;
                }
            }
            return null;
        }

        public final List<m> i0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i = byteBuffer.getInt();
            if (i == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = byteBuffer.getInt();
                int i4 = byteBuffer.getInt();
                StringAttributeType stringAttributeType = StringAttributeType.values()[byteBuffer.getInt()];
                int i5 = g.f15229a[stringAttributeType.ordinal()];
                if (i5 == 1) {
                    byteBuffer.getInt();
                    l lVar = new l(null);
                    lVar.f15232a = i3;
                    lVar.b = i4;
                    lVar.c = stringAttributeType;
                    arrayList.add(lVar);
                } else if (i5 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    i iVar = new i(null);
                    iVar.f15232a = i3;
                    iVar.b = i4;
                    iVar.c = stringAttributeType;
                    iVar.d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(iVar);
                }
            }
            return arrayList;
        }

        public final CharSequence j0() {
            CharSequence[] charSequenceArr;
            CharSequence charSequence = null;
            for (CharSequence charSequence2 : new CharSequence[]{b0(this.q, this.r), b0(this.o, this.p), b0(this.w, this.x)}) {
                if (charSequence2 != null && charSequence2.length() > 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = TextUtils.concat(charSequence, ", ", charSequence2);
                    }
                }
            }
            return charSequence;
        }

        public final boolean k0(Action action) {
            if ((action.value & this.C) != 0) {
                return true;
            }
            return false;
        }

        public final boolean l0(Flag flag) {
            if ((flag.value & this.B) != 0) {
                return true;
            }
            return false;
        }

        public final boolean m0(Action action) {
            if ((action.value & this.d) != 0) {
                return true;
            }
            return false;
        }

        public final boolean n0(Flag flag) {
            if ((flag.value & this.c) != 0) {
                return true;
            }
            return false;
        }

        public final k o0(float[] fArr) {
            float f = fArr[3];
            float f2 = fArr[0] / f;
            float f3 = fArr[1] / f;
            if (f2 < this.I || f2 >= this.K || f3 < this.J || f3 >= this.L) {
                return null;
            }
            float[] fArr2 = new float[4];
            Iterator it = ((ArrayList) this.P).iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                if (!kVar.n0(Flag.IS_HIDDEN)) {
                    kVar.e0();
                    Matrix.multiplyMV(fArr2, 0, kVar.U, 0, fArr, 0);
                    k o0 = kVar.o0(fArr2);
                    if (o0 != null) {
                        return o0;
                    }
                }
            }
            if (p0()) {
                return this;
            }
            return null;
        }

        public final boolean p0() {
            String str;
            String str2;
            String str3;
            if (n0(Flag.SCOPES_ROUTE)) {
                return false;
            }
            if (!n0(Flag.IS_FOCUSABLE) && (this.d & (~AccessibilityBridge.x)) == 0 && (this.c & AccessibilityBridge.y) == 0 && (((str = this.o) == null || str.isEmpty()) && (((str2 = this.q) == null || str2.isEmpty()) && ((str3 = this.w) == null || str3.isEmpty())))) {
                return false;
            }
            return true;
        }

        public final float q0(float f, float f2, float f3, float f4) {
            return Math.max(f, Math.max(f2, Math.max(f3, f4)));
        }

        public final float r0(float f, float f2, float f3, float f4) {
            return Math.min(f, Math.min(f2, Math.min(f3, f4)));
        }

        public final void t0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f = fArr[3];
            fArr[0] = fArr[0] / f;
            fArr[1] = fArr[1] / f;
            fArr[2] = fArr[2] / f;
            fArr[3] = 0.0f;
        }

        public final void u0(float[] fArr, Set<k> set, boolean z) {
            set.add(this);
            if (this.V) {
                z = true;
            }
            if (z) {
                if (this.W == null) {
                    this.W = new float[16];
                }
                Matrix.multiplyMM(this.W, 0, fArr, 0, this.M, 0);
                float[] fArr2 = {this.I, this.J, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                t0(fArr3, this.W, fArr2);
                fArr2[0] = this.K;
                fArr2[1] = this.J;
                t0(fArr4, this.W, fArr2);
                fArr2[0] = this.K;
                fArr2[1] = this.L;
                t0(fArr5, this.W, fArr2);
                fArr2[0] = this.I;
                fArr2[1] = this.L;
                t0(fArr6, this.W, fArr2);
                if (this.X == null) {
                    this.X = new Rect();
                }
                this.X.set(Math.round(r0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(r0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(q0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(q0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.V = false;
            }
            Iterator it = ((ArrayList) this.O).iterator();
            int i = -1;
            while (it.hasNext()) {
                k kVar = (k) it.next();
                kVar.z = i;
                i = kVar.b;
                kVar.u0(this.W, set, z);
            }
        }

        public final void v0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            AccessibilityBridge accessibilityBridge;
            this.A = true;
            this.G = this.q;
            this.H = this.o;
            this.B = this.c;
            this.C = this.d;
            this.D = this.g;
            this.E = this.h;
            this.F = this.l;
            this.c = byteBuffer.getInt();
            this.d = byteBuffer.getInt();
            this.e = byteBuffer.getInt();
            this.f = byteBuffer.getInt();
            this.g = byteBuffer.getInt();
            this.h = byteBuffer.getInt();
            this.i = byteBuffer.getInt();
            this.j = byteBuffer.getInt();
            this.k = byteBuffer.getInt();
            this.l = byteBuffer.getFloat();
            this.m = byteBuffer.getFloat();
            this.n = byteBuffer.getFloat();
            int i = byteBuffer.getInt();
            if (i == -1) {
                str = null;
            } else {
                str = strArr[i];
            }
            this.o = str;
            this.p = i0(byteBuffer, byteBufferArr);
            int i2 = byteBuffer.getInt();
            if (i2 == -1) {
                str2 = null;
            } else {
                str2 = strArr[i2];
            }
            this.q = str2;
            this.r = i0(byteBuffer, byteBufferArr);
            int i3 = byteBuffer.getInt();
            if (i3 == -1) {
                str3 = null;
            } else {
                str3 = strArr[i3];
            }
            this.s = str3;
            this.t = i0(byteBuffer, byteBufferArr);
            int i4 = byteBuffer.getInt();
            if (i4 == -1) {
                str4 = null;
            } else {
                str4 = strArr[i4];
            }
            this.u = str4;
            this.v = i0(byteBuffer, byteBufferArr);
            int i5 = byteBuffer.getInt();
            if (i5 == -1) {
                str5 = null;
            } else {
                str5 = strArr[i5];
            }
            this.w = str5;
            this.x = i0(byteBuffer, byteBufferArr);
            int i6 = byteBuffer.getInt();
            if (i6 == -1) {
                str6 = null;
            } else {
                str6 = strArr[i6];
            }
            this.y = str6;
            TextDirection.fromInt(byteBuffer.getInt());
            this.I = byteBuffer.getFloat();
            this.J = byteBuffer.getFloat();
            this.K = byteBuffer.getFloat();
            this.L = byteBuffer.getFloat();
            if (this.M == null) {
                this.M = new float[16];
            }
            for (int i7 = 0; i7 < 16; i7++) {
                this.M[i7] = byteBuffer.getFloat();
            }
            this.T = true;
            this.V = true;
            int i8 = byteBuffer.getInt();
            ArrayList arrayList = (ArrayList) this.O;
            arrayList.clear();
            ArrayList arrayList2 = (ArrayList) this.P;
            arrayList2.clear();
            int i9 = 0;
            while (true) {
                accessibilityBridge = this.f15231a;
                if (i9 >= i8) {
                    break;
                }
                k v = accessibilityBridge.v(byteBuffer.getInt());
                v.N = this;
                arrayList.add(v);
                i9++;
            }
            for (int i10 = 0; i10 < i8; i10++) {
                k v2 = accessibilityBridge.v(byteBuffer.getInt());
                v2.N = this;
                arrayList2.add(v2);
            }
            int i11 = byteBuffer.getInt();
            if (i11 == 0) {
                this.Q = null;
                return;
            }
            List<h> list = this.Q;
            if (list == null) {
                this.Q = new ArrayList(i11);
            } else {
                ((ArrayList) list).clear();
            }
            for (int i12 = 0; i12 < i11; i12++) {
                h u = accessibilityBridge.u(byteBuffer.getInt());
                if (u.c == Action.TAP.value) {
                    this.R = u;
                } else if (u.c == Action.LONG_PRESS.value) {
                    this.S = u;
                } else {
                    ((ArrayList) this.Q).add(u);
                }
                ((ArrayList) this.Q).add(u);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class l extends m {
        static {
            t2o.a(945815859);
        }

        public l() {
            super(null);
        }

        public /* synthetic */ l(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class m {

        /* renamed from: a  reason: collision with root package name */
        public int f15232a;
        public int b;
        public StringAttributeType c;

        static {
            t2o.a(945815860);
        }

        public m() {
        }

        public /* synthetic */ m(a aVar) {
            this();
        }
    }

    static {
        t2o.a(945815844);
    }

    public AccessibilityBridge(View view, m40 m40Var, AccessibilityManager accessibilityManager, ContentResolver contentResolver, s5m s5mVar) {
        this(view, m40Var, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), s5mVar);
    }

    public boolean A() {
        return this.c.isTouchExplorationEnabled();
    }

    public final AccessibilityEvent B(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        View view = this.f15223a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i2);
        return obtain;
    }

    public AccessibilityNodeInfo C(View view, int i2) {
        return AccessibilityNodeInfo.obtain(view, i2);
    }

    public boolean D(MotionEvent motionEvent) {
        if (!this.c.isTouchExplorationEnabled() || ((HashMap) this.g).isEmpty()) {
            return false;
        }
        k o0 = w().o0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f});
        if (o0 != null && o0.i != -1) {
            return this.d.onAccessibilityHoverEvent(o0.b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            y(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getAction() == 10) {
            E();
        } else {
            hdh.a("unicorn", "unexpected accessibility hover event: " + motionEvent);
            return false;
        }
        return true;
    }

    public final void E() {
        k kVar = this.m;
        if (kVar != null) {
            K(kVar.b, 256);
            this.m = null;
        }
    }

    public final void F(k kVar) {
        String h0 = kVar.h0();
        if (h0 == null) {
            h0 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            O(h0);
            return;
        }
        AccessibilityEvent B = B(kVar.b, 32);
        B.getText().add(h0);
        L(B);
    }

    public final boolean G(k kVar, int i2, Bundle bundle, boolean z2) {
        String str;
        int i3 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT);
        boolean z3 = bundle.getBoolean(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN);
        int i4 = kVar.g;
        int i5 = kVar.h;
        I(kVar, i3, z2, z3);
        if (!(i4 == kVar.g && i5 == kVar.h)) {
            if (kVar.q != null) {
                str = kVar.q;
            } else {
                str = "";
            }
            AccessibilityEvent B = B(kVar.b, 8192);
            B.getText().add(str);
            B.setFromIndex(kVar.g);
            B.setToIndex(kVar.h);
            B.setItemCount(str.length());
            L(B);
        }
        m40 m40Var = this.b;
        if (i3 == 1) {
            if (z2) {
                Action action = Action.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (kVar.m0(action)) {
                    m40Var.c(i2, action, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (z2) {
                return false;
            }
            Action action2 = Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!kVar.m0(action2)) {
                return false;
            }
            m40Var.c(i2, action2, Boolean.valueOf(z3));
            return true;
        } else if (i3 == 2) {
            if (z2) {
                Action action3 = Action.MOVE_CURSOR_FORWARD_BY_WORD;
                if (kVar.m0(action3)) {
                    m40Var.c(i2, action3, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (z2) {
                return false;
            }
            Action action4 = Action.MOVE_CURSOR_BACKWARD_BY_WORD;
            if (!kVar.m0(action4)) {
                return false;
            }
            m40Var.c(i2, action4, Boolean.valueOf(z3));
            return true;
        } else if (i3 == 4 || i3 == 8 || i3 == 16) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean H(k kVar, int i2, Bundle bundle) {
        String str;
        if (bundle == null || !bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE)) {
            str = "";
        } else {
            str = bundle.getString(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE);
        }
        this.b.c(i2, Action.SET_TEXT, str);
        kVar.q = str;
        kVar.r = null;
        return true;
    }

    public final void I(k kVar, int i2, boolean z2, boolean z3) {
        if (kVar.h >= 0 && kVar.g >= 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8 || i2 == 16) {
                            if (z2) {
                                kVar.h = kVar.q.length();
                            } else {
                                kVar.h = 0;
                            }
                        }
                    } else if (z2 && kVar.h < kVar.q.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(kVar.q.substring(kVar.h));
                        if (matcher.find()) {
                            kVar.h += matcher.start(1);
                        } else {
                            kVar.h = kVar.q.length();
                        }
                    } else if (!z2 && kVar.h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(kVar.q.substring(0, kVar.h));
                        if (matcher2.find()) {
                            kVar.h = matcher2.start(1);
                        } else {
                            kVar.h = 0;
                        }
                    }
                } else if (z2 && kVar.h < kVar.q.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(kVar.q.substring(kVar.h));
                    matcher3.find();
                    if (matcher3.find()) {
                        kVar.h += matcher3.start(1);
                    } else {
                        kVar.h = kVar.q.length();
                    }
                } else if (!z2 && kVar.h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(kVar.q.substring(0, kVar.h));
                    if (matcher4.find()) {
                        kVar.h = matcher4.start(1);
                    }
                }
            } else if (z2 && kVar.h < kVar.q.length()) {
                kVar.h++;
            } else if (!z2 && kVar.h > 0) {
                kVar.h--;
            }
            if (!z3) {
                kVar.g = kVar.h;
            }
        }
    }

    public void J() {
        this.r = true;
        ((PlatformViewsController) this.e).r();
        P(null);
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = this.u;
        AccessibilityManager accessibilityManager = this.c;
        accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
        accessibilityManager.removeTouchExplorationStateChangeListener(this.v);
        this.f.unregisterContentObserver(this.w);
        this.b.h(null);
    }

    public final void K(int i2, int i3) {
        if (this.c.isEnabled()) {
            L(B(i2, i3));
        }
    }

    public final void L(AccessibilityEvent accessibilityEvent) {
        if (this.c.isEnabled()) {
            View view = this.f15223a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void M() {
        this.b.g(this.j);
    }

    public final void N(int i2) {
        AccessibilityEvent B = B(i2, 2048);
        B.setContentChangeTypes(1);
        L(B);
    }

    public final void O(String str) {
        this.f15223a.setAccessibilityPaneTitle(str);
    }

    public void P(j jVar) {
        this.q = jVar;
    }

    public final boolean Q(k kVar) {
        if (kVar.j <= 0 || (!k.s0(this.i, new e(this, kVar)) && k.s0(this.i, new f(this)))) {
            return false;
        }
        return true;
    }

    public void R(ByteBuffer byteBuffer, String[] strArr) {
        String str;
        while (byteBuffer.hasRemaining()) {
            h u = u(byteBuffer.getInt());
            u.c = byteBuffer.getInt();
            int i2 = byteBuffer.getInt();
            String str2 = null;
            if (i2 == -1) {
                str = null;
            } else {
                str = strArr[i2];
            }
            u.d = str;
            int i3 = byteBuffer.getInt();
            if (i3 != -1) {
                str2 = strArr[i3];
            }
            u.e = str2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
        r4 = r8.f15223a.getRootWindowInsets();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void S(java.nio.ByteBuffer r9, java.lang.String[] r10, java.nio.ByteBuffer[] r11) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.unicorn.view.AccessibilityBridge.S(java.nio.ByteBuffer, java.lang.String[], java.nio.ByteBuffer[]):void");
    }

    public final void T(k kVar) {
        kVar.N = null;
        int unused = kVar.i;
        if (kVar.i != -1) {
            View C = ((PlatformViewsController) this.e).C(kVar.i);
            if (C != null) {
                C.setImportantForAccessibility(4);
            }
        }
        k kVar2 = this.i;
        if (kVar2 == kVar) {
            K(kVar2.b, 65536);
            this.i = null;
        }
        if (this.k == kVar) {
            this.k = null;
        }
        if (this.m == kVar) {
            this.m = null;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        boolean z2;
        boolean z3;
        Flag flag;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        if (i2 >= 65536) {
            return this.d.createAccessibilityNodeInfo(i2);
        }
        Map<Integer, k> map = this.g;
        View view = this.f15223a;
        if (i2 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (((HashMap) map).containsKey(0)) {
                obtain.addChild(view, 0);
            }
            return obtain;
        }
        k kVar = (k) ((HashMap) map).get(Integer.valueOf(i2));
        if (kVar == null) {
            return null;
        }
        int i5 = kVar.i;
        s5m s5mVar = this.e;
        if (i5 != -1) {
            int unused = kVar.i;
            s5mVar.getClass();
        }
        AccessibilityNodeInfo C = C(view, i2);
        int i6 = Build.VERSION.SDK_INT;
        String str = "";
        C.setViewIdResourceName(str);
        C.setPackageName(view.getContext().getPackageName());
        C.setClassName("android.view.View");
        C.setSource(view, i2);
        C.setFocusable(kVar.p0());
        k kVar2 = this.k;
        if (kVar2 != null) {
            if (kVar2.b == i2) {
                z5 = true;
            } else {
                z5 = false;
            }
            C.setFocused(z5);
        }
        k kVar3 = this.i;
        if (kVar3 != null) {
            if (kVar3.b == i2) {
                z4 = true;
            } else {
                z4 = false;
            }
            C.setAccessibilityFocused(z4);
        }
        Flag flag2 = Flag.IS_TEXT_FIELD;
        if (kVar.n0(flag2)) {
            C.setPassword(kVar.n0(Flag.IS_OBSCURED));
            if (!kVar.n0(Flag.IS_READ_ONLY)) {
                C.setClassName("android.widget.EditText");
            }
            C.setEditable(!kVar.n0(flag));
            if (!(kVar.g == -1 || kVar.h == -1)) {
                C.setTextSelection(kVar.g, kVar.h);
            }
            k kVar4 = this.i;
            if (kVar4 != null && kVar4.b == i2) {
                C.setLiveRegion(1);
            }
            if (kVar.m0(Action.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                C.addAction(256);
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (kVar.m0(Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                C.addAction(512);
                i3 = 1;
            }
            if (kVar.m0(Action.MOVE_CURSOR_FORWARD_BY_WORD)) {
                C.addAction(256);
                i3 |= 2;
            }
            if (kVar.m0(Action.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                C.addAction(512);
                i3 |= 2;
            }
            C.setMovementGranularities(i3);
            if (kVar.e >= 0) {
                if (kVar.q == null) {
                    i4 = 0;
                } else {
                    i4 = kVar.q.length();
                }
                int unused2 = kVar.f;
                int unused3 = kVar.e;
                C.setMaxTextLength((i4 - kVar.f) + kVar.e);
            }
        }
        if (kVar.m0(Action.SET_SELECTION)) {
            C.addAction(131072);
        }
        if (kVar.m0(Action.COPY)) {
            C.addAction(16384);
        }
        if (kVar.m0(Action.CUT)) {
            C.addAction(65536);
        }
        if (kVar.m0(Action.PASTE)) {
            C.addAction(32768);
        }
        if (kVar.m0(Action.SET_TEXT)) {
            C.addAction(2097152);
        }
        if (kVar.n0(Flag.IS_BUTTON) || kVar.n0(Flag.IS_LINK)) {
            C.setClassName("android.widget.Button");
        }
        if (kVar.n0(Flag.IS_IMAGE)) {
            C.setClassName("android.widget.ImageView");
        }
        if (kVar.m0(Action.DISMISS)) {
            C.setDismissable(true);
            C.addAction(1048576);
        }
        if (kVar.N != null) {
            C.setParent(view, kVar.N.b);
        } else {
            C.setParent(view);
        }
        if (kVar.z != -1 && i6 >= 22) {
            C.setTraversalAfter(view, kVar.z);
        }
        Rect g0 = kVar.g0();
        if (kVar.N != null) {
            Rect g02 = kVar.N.g0();
            Rect rect = new Rect(g0);
            rect.offset(-g02.left, -g02.top);
            C.setBoundsInParent(rect);
        } else {
            C.setBoundsInParent(g0);
        }
        C.setBoundsInScreen(t(g0));
        C.setVisibleToUser(true);
        if (!kVar.n0(Flag.HAS_ENABLED_STATE) || kVar.n0(Flag.IS_ENABLED)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C.setEnabled(z2);
        if (kVar.m0(Action.TAP)) {
            if (kVar.R != null) {
                C.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, kVar.R.e));
                C.setClickable(true);
            } else {
                C.addAction(16);
                C.setClickable(true);
            }
        }
        if (kVar.m0(Action.LONG_PRESS)) {
            if (kVar.S != null) {
                C.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, kVar.S.e));
                C.setLongClickable(true);
            } else {
                C.addAction(32);
                C.setLongClickable(true);
            }
        }
        Action action = Action.SCROLL_LEFT;
        if (kVar.m0(action) || kVar.m0(Action.SCROLL_UP) || kVar.m0(Action.SCROLL_RIGHT) || kVar.m0(Action.SCROLL_DOWN)) {
            C.setScrollable(true);
            if (!kVar.n0(Flag.HAS_IMPLICIT_SCROLLING)) {
                z3 = false;
            } else if (kVar.m0(action) || kVar.m0(Action.SCROLL_RIGHT)) {
                z3 = false;
                if (Q(kVar)) {
                    C.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, kVar.j, false));
                } else {
                    C.setClassName("android.widget.HorizontalScrollView");
                }
            } else if (Q(kVar)) {
                z3 = false;
                C.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(kVar.j, 0, false));
            } else {
                z3 = false;
                C.setClassName("android.widget.ScrollView");
            }
            if (kVar.m0(action) || kVar.m0(Action.SCROLL_UP)) {
                C.addAction(4096);
            }
            if (kVar.m0(Action.SCROLL_RIGHT) || kVar.m0(Action.SCROLL_DOWN)) {
                C.addAction(8192);
            }
        } else {
            z3 = false;
        }
        Action action2 = Action.INCREASE;
        if (kVar.m0(action2) || kVar.m0(Action.DECREASE)) {
            C.setClassName("android.widget.SeekBar");
            if (kVar.m0(action2)) {
                C.addAction(4096);
            }
            if (kVar.m0(Action.DECREASE)) {
                C.addAction(8192);
            }
        }
        if (kVar.n0(Flag.IS_LIVE_REGION)) {
            C.setLiveRegion(1);
        }
        if (kVar.n0(flag2)) {
            C.setText(kVar.j0());
        } else if (!kVar.n0(Flag.SCOPES_ROUTE)) {
            CharSequence j0 = kVar.j0();
            if (i6 < 28 && kVar.y != null) {
                if (j0 != null) {
                    str = j0;
                }
                j0 = ((Object) str) + "\n" + kVar.y;
            }
            if (j0 != null) {
                C.setContentDescription(j0);
            }
        }
        if (i6 >= 28 && kVar.y != null) {
            C.setTooltipText(kVar.y);
        }
        boolean n0 = kVar.n0(Flag.HAS_CHECKED_STATE);
        boolean n02 = kVar.n0(Flag.HAS_TOGGLED_STATE);
        if (n0 || n02) {
            z3 = true;
        }
        C.setCheckable(z3);
        if (n0) {
            C.setChecked(kVar.n0(Flag.IS_CHECKED));
            if (kVar.n0(Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                C.setClassName("android.widget.RadioButton");
            } else {
                C.setClassName("android.widget.CheckBox");
            }
        } else if (n02) {
            C.setChecked(kVar.n0(Flag.IS_TOGGLED));
            C.setClassName("android.widget.Switch");
        }
        C.setSelected(kVar.n0(Flag.IS_SELECTED));
        if (i6 >= 28) {
            C.setHeading(kVar.n0(Flag.IS_HEADER));
        }
        k kVar5 = this.i;
        if (kVar5 == null || kVar5.b != i2) {
            C.addAction(64);
        } else {
            C.addAction(128);
        }
        if (kVar.Q != null) {
            Iterator it = ((ArrayList) kVar.Q).iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                C.addAction(new AccessibilityNodeInfo.AccessibilityAction(hVar.f15230a, hVar.d));
            }
        }
        Iterator it2 = ((ArrayList) kVar.O).iterator();
        while (it2.hasNext()) {
            k kVar6 = (k) it2.next();
            if (!kVar6.n0(Flag.IS_HIDDEN)) {
                if (kVar6.i != -1) {
                    View C2 = ((PlatformViewsController) s5mVar).C(kVar6.i);
                    int unused4 = kVar6.i;
                    s5mVar.getClass();
                    C.addChild(C2);
                } else {
                    C.addChild(view, kVar6.b);
                }
            }
        }
        return C;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i2) {
        if (i2 == 1) {
            k kVar = this.k;
            if (kVar != null) {
                return createAccessibilityNodeInfo(kVar.b);
            }
        } else if (i2 != 2) {
            return null;
        }
        k kVar2 = this.i;
        if (kVar2 != null) {
            return createAccessibilityNodeInfo(kVar2.b);
        }
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i2, int i3, Bundle bundle) {
        if (i2 >= 65536) {
            return this.d.performAction(i2, i3, bundle);
        }
        HashMap hashMap = (HashMap) this.g;
        k kVar = (k) hashMap.get(Integer.valueOf(i2));
        if (kVar == null) {
            return false;
        }
        m40 m40Var = this.b;
        switch (i3) {
            case 16:
                m40Var.b(i2, Action.TAP);
                return true;
            case 32:
                m40Var.b(i2, Action.LONG_PRESS);
                return true;
            case 64:
                if (this.i == null) {
                    this.f15223a.invalidate();
                }
                this.i = kVar;
                m40Var.b(i2, Action.DID_GAIN_ACCESSIBILITY_FOCUS);
                K(i2, 32768);
                if (kVar.m0(Action.INCREASE) || kVar.m0(Action.DECREASE)) {
                    K(i2, 4);
                }
                return true;
            case 128:
                k kVar2 = this.i;
                if (kVar2 != null && kVar2.b == i2) {
                    this.i = null;
                }
                m40Var.b(i2, Action.DID_LOSE_ACCESSIBILITY_FOCUS);
                K(i2, 65536);
                return true;
            case 256:
                return G(kVar, i2, bundle, true);
            case 512:
                return G(kVar, i2, bundle, false);
            case 4096:
                Action action = Action.SCROLL_UP;
                if (kVar.m0(action)) {
                    m40Var.b(i2, action);
                } else {
                    Action action2 = Action.SCROLL_LEFT;
                    if (kVar.m0(action2)) {
                        m40Var.b(i2, action2);
                    } else {
                        Action action3 = Action.INCREASE;
                        if (!kVar.m0(action3)) {
                            return false;
                        }
                        kVar.q = kVar.s;
                        kVar.r = kVar.t;
                        K(i2, 4);
                        m40Var.b(i2, action3);
                    }
                }
                return true;
            case 8192:
                Action action4 = Action.SCROLL_DOWN;
                if (kVar.m0(action4)) {
                    m40Var.b(i2, action4);
                } else {
                    Action action5 = Action.SCROLL_RIGHT;
                    if (kVar.m0(action5)) {
                        m40Var.b(i2, action5);
                    } else {
                        Action action6 = Action.DECREASE;
                        if (!kVar.m0(action6)) {
                            return false;
                        }
                        kVar.q = kVar.u;
                        kVar.r = kVar.v;
                        K(i2, 4);
                        m40Var.b(i2, action6);
                    }
                }
                return true;
            case 16384:
                m40Var.b(i2, Action.COPY);
                return true;
            case 32768:
                m40Var.b(i2, Action.PASTE);
                return true;
            case 65536:
                m40Var.b(i2, Action.CUT);
                return true;
            case 131072:
                HashMap hashMap2 = new HashMap();
                if (bundle == null || !bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT) || !bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT)) {
                    hashMap2.put("base", Integer.valueOf(kVar.h));
                    hashMap2.put("extent", Integer.valueOf(kVar.h));
                } else {
                    hashMap2.put("base", Integer.valueOf(bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT)));
                    hashMap2.put("extent", Integer.valueOf(bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT)));
                }
                m40Var.c(i2, Action.SET_SELECTION, hashMap2);
                k kVar3 = (k) hashMap.get(Integer.valueOf(i2));
                kVar3.g = ((Integer) hashMap2.get("base")).intValue();
                kVar3.h = ((Integer) hashMap2.get("extent")).intValue();
                return true;
            case 1048576:
                m40Var.b(i2, Action.DISMISS);
                return true;
            case 2097152:
                H(kVar, i2, bundle);
                return true;
            case 16908342:
                m40Var.b(i2, Action.SHOW_ON_SCREEN);
                return true;
            default:
                int i4 = i3 - z;
                h hVar = (h) ((HashMap) this.h).get(Integer.valueOf(i4));
                if (hVar == null) {
                    return false;
                }
                m40Var.c(i2, Action.CUSTOM_ACTION, Integer.valueOf(hVar.b));
                return true;
        }
    }

    public final AccessibilityEvent r(int i2, String str, String str2) {
        AccessibilityEvent B = B(i2, 16);
        B.setBeforeText(str);
        B.getText().add(str2);
        int i3 = 0;
        while (i3 < str.length() && i3 < str2.length() && str.charAt(i3) == str2.charAt(i3)) {
            i3++;
        }
        if (i3 < str.length() || i3 < str2.length()) {
            B.setFromIndex(i3);
            int length = str.length() - 1;
            int length2 = str2.length() - 1;
            while (length >= i3 && length2 >= i3 && str.charAt(length) == str2.charAt(length2)) {
                length--;
                length2--;
            }
            B.setRemovedCount((length - i3) + 1);
            B.setAddedCount((length2 - i3) + 1);
            return B;
        }
        B.recycle();
        return null;
    }

    public final boolean s() {
        int i2;
        Activity c2 = wgw.c(this.f15223a.getContext());
        if (c2 == null || c2.getWindow() == null) {
            return false;
        }
        i2 = c2.getWindow().getAttributes().layoutInDisplayCutoutMode;
        if (i2 == 2 || i2 == 0) {
            return true;
        }
        return false;
    }

    public final Rect t(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f15223a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    public final h u(int i2) {
        HashMap hashMap = (HashMap) this.h;
        h hVar = (h) hashMap.get(Integer.valueOf(i2));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        hVar2.b = i2;
        hVar2.f15230a = z + i2;
        hashMap.put(Integer.valueOf(i2), hVar2);
        return hVar2;
    }

    public final k v(int i2) {
        HashMap hashMap = (HashMap) this.g;
        k kVar = (k) hashMap.get(Integer.valueOf(i2));
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        kVar2.b = i2;
        hashMap.put(Integer.valueOf(i2), kVar2);
        return kVar2;
    }

    public final k w() {
        return (k) ((HashMap) this.g).get(0);
    }

    public final void x(boolean z2) {
        Boolean bool = this.s;
        if (bool == null || z2 != bool.booleanValue()) {
            this.s = Boolean.valueOf(z2);
            m40 m40Var = this.b;
            if (z2) {
                m40Var.h(this.t);
                m40Var.e();
                return;
            }
            m40Var.h(null);
            m40Var.d();
        }
    }

    public final void y(float f2, float f3) {
        k o0;
        if (!((HashMap) this.g).isEmpty() && (o0 = w().o0(new float[]{f2, f3, 0.0f, 1.0f})) != this.m) {
            if (o0 != null) {
                K(o0.b, 128);
            }
            k kVar = this.m;
            if (kVar != null) {
                K(kVar.b, 256);
            }
            this.m = o0;
        }
    }

    public boolean z() {
        return this.c.isEnabled();
    }

    public AccessibilityBridge(View view, m40 m40Var, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, s5m s5mVar) {
        this.g = new HashMap();
        this.h = new HashMap();
        this.j = 0;
        this.n = new ArrayList();
        this.o = 0;
        this.p = 0;
        this.r = false;
        this.s = null;
        this.t = new a();
        b bVar = new b();
        this.u = bVar;
        c cVar = new c(new Handler());
        this.w = cVar;
        u8x.a("AccessibilityBridge");
        this.f15223a = view;
        this.b = m40Var;
        this.c = accessibilityManager;
        this.f = contentResolver;
        this.d = accessibilityViewEmbedder;
        this.e = s5mVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        d dVar = new d(accessibilityManager);
        this.v = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        cVar.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        ((PlatformViewsController) s5mVar).d(this);
        u8x.b("AccessibilityBridge");
    }
}
