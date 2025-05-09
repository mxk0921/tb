package com.taobao.tao.flexbox.layoutmanager.component;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureFunction;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.akt;
import tb.hc8;
import tb.jfw;
import tb.l0u;
import tb.nwv;
import tb.s6o;
import tb.sxo;
import tb.t2o;
import tb.tfs;
import tb.yhe;
import tb.ymt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class EditTextComponent extends TextComponent implements TextWatcher, yhe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean isInputMethodShown = false;
    private String currentText = "";
    private boolean maxLengthSet = false;
    private boolean imeActionSet = false;
    private YogaMeasureFunction measureFunction = new YogaMeasureFunction() { // from class: com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0094, code lost:
            if (r6 == com.facebook.yoga.YogaMeasureMode.EXACTLY) goto L_0x0096;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
            if (r8 == com.facebook.yoga.YogaMeasureMode.EXACTLY) goto L_0x00a7;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
        @Override // com.facebook.yoga.YogaMeasureFunction
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long measure(com.facebook.yoga.YogaNode r4, float r5, com.facebook.yoga.YogaMeasureMode r6, float r7, com.facebook.yoga.YogaMeasureMode r8) {
            /*
                r3 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.AnonymousClass1.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L_0x0032
                java.lang.Float r1 = new java.lang.Float
                r1.<init>(r5)
                java.lang.Float r5 = new java.lang.Float
                r5.<init>(r7)
                r7 = 6
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r2 = 0
                r7[r2] = r3
                r2 = 1
                r7[r2] = r4
                r4 = 2
                r7[r4] = r1
                r4 = 3
                r7[r4] = r6
                r4 = 4
                r7[r4] = r5
                r4 = 5
                r7[r4] = r8
                java.lang.String r4 = "15b3ebfa"
                java.lang.Object r4 = r0.ipc$dispatch(r4, r7)
                java.lang.Number r4 = (java.lang.Number) r4
                long r4 = r4.longValue()
                return r4
            L_0x0032:
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r4 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                tb.jfw r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.access$000(r4)
                tb.ymt r0 = (tb.ymt) r0
                r1 = -1
                r4.setupLayoutHelper(r0, r1)
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r4 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                tb.slt r4 = r4.textLayoutHelper
                r4.O(r6, r5)
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r4 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                tb.jfw r4 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.access$100(r4)
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent$b r4 = (com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.b) r4
                java.lang.String r4 = r4.U0
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                android.view.View r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.access$200(r0)
                if (r0 == 0) goto L_0x006a
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                android.view.View r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.access$300(r0)
                android.widget.EditText r0 = (android.widget.EditText) r0
                android.text.Editable r0 = r0.getText()
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto L_0x006a
                r4 = r0
            L_0x006a:
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                tb.slt r0 = r0.textLayoutHelper
                r0.Q(r4)
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r4 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                tb.slt r4 = r4.textLayoutHelper
                int r4 = r4.F()
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                tb.slt r0 = r0.textLayoutHelper
                int r0 = r0.p()
                float r4 = (float) r4
                float r0 = (float) r0
                com.facebook.yoga.YogaMeasureMode r1 = com.facebook.yoga.YogaMeasureMode.UNDEFINED
                if (r6 != r1) goto L_0x0089
            L_0x0087:
                r5 = r4
                goto L_0x0096
            L_0x0089:
                com.facebook.yoga.YogaMeasureMode r2 = com.facebook.yoga.YogaMeasureMode.AT_MOST
                if (r6 != r2) goto L_0x0092
                float r5 = java.lang.Math.min(r4, r5)
                goto L_0x0096
            L_0x0092:
                com.facebook.yoga.YogaMeasureMode r2 = com.facebook.yoga.YogaMeasureMode.EXACTLY
                if (r6 != r2) goto L_0x0087
            L_0x0096:
                if (r8 != r1) goto L_0x009a
            L_0x0098:
                r7 = r0
                goto L_0x00a7
            L_0x009a:
                com.facebook.yoga.YogaMeasureMode r4 = com.facebook.yoga.YogaMeasureMode.AT_MOST
                if (r8 != r4) goto L_0x00a3
                float r7 = java.lang.Math.min(r0, r7)
                goto L_0x00a7
            L_0x00a3:
                com.facebook.yoga.YogaMeasureMode r4 = com.facebook.yoga.YogaMeasureMode.EXACTLY
                if (r8 != r4) goto L_0x0098
            L_0x00a7:
                long r4 = com.facebook.yoga.YogaMeasureOutput.make(r5, r7)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.AnonymousClass1.measure(com.facebook.yoga.YogaNode, float, com.facebook.yoga.YogaMeasureMode, float, com.facebook.yoga.YogaMeasureMode):long");
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class TNodeEditText extends EditText implements View.OnTouchListener, e.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int softInputMode;
        private e softKeyBoardListener;
        private boolean userInput;
        private boolean textChangedByCallSetText = false;
        private boolean inputMethodShown = false;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TNodeEditText.access$1100(TNodeEditText.this) == null) {
                    TNodeEditText tNodeEditText = TNodeEditText.this;
                    TNodeEditText tNodeEditText2 = TNodeEditText.this;
                    TNodeEditText.access$1102(tNodeEditText, new e((Activity) TNodeEditText.this.getContext(), tNodeEditText2, (ymt) EditTextComponent.access$1200(EditTextComponent.this)));
                }
            }
        }

        static {
            t2o.a(503316715);
            t2o.a(503316714);
        }

        public TNodeEditText(Context context) {
            super(context);
            this.softInputMode = 48;
            try {
                this.softInputMode = ((Activity) context).getWindow().getAttributes().softInputMode;
            } catch (Exception e) {
                tfs.d(e.getMessage());
            }
            setOnTouchListener(this);
        }

        public static /* synthetic */ e access$1100(TNodeEditText tNodeEditText) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("bb0c52f5", new Object[]{tNodeEditText});
            }
            return tNodeEditText.softKeyBoardListener;
        }

        public static /* synthetic */ e access$1102(TNodeEditText tNodeEditText, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("685ca332", new Object[]{tNodeEditText, eVar});
            }
            tNodeEditText.softKeyBoardListener = eVar;
            return eVar;
        }

        public static /* synthetic */ boolean access$600(TNodeEditText tNodeEditText) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6934385c", new Object[]{tNodeEditText})).booleanValue();
            }
            return tNodeEditText.textChangedByCallSetText;
        }

        public static /* synthetic */ boolean access$700(TNodeEditText tNodeEditText) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d7bb499d", new Object[]{tNodeEditText})).booleanValue();
            }
            return tNodeEditText.userInput;
        }

        public static /* synthetic */ boolean access$702(TNodeEditText tNodeEditText, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("aaf1219d", new Object[]{tNodeEditText, new Boolean(z)})).booleanValue();
            }
            tNodeEditText.userInput = z;
            return z;
        }

        private ViewParent findScrollParent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewParent) ipChange.ipc$dispatch("dce31d2f", new Object[]{this});
            }
            n Y = EditTextComponent.access$1300(EditTextComponent.this).Y();
            while (Y != null && !(Y.K() instanceof sxo)) {
                Y = Y.Y();
            }
            if (Y != null) {
                return (ViewParent) Y.w0();
            }
            return null;
        }

        public static /* synthetic */ Object ipc$super(TNodeEditText tNodeEditText, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -369979614:
                    return new Boolean(super.onKeyPreIme(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
                case 358241672:
                    super.setText((CharSequence) objArr[0], (TextView.BufferType) objArr[1]);
                    return null;
                case 678958088:
                    super.onFocusChanged(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (Rect) objArr[2]);
                    return null;
                case 949399698:
                    super.onDetachedFromWindow();
                    return null;
                case 1626033557:
                    super.onAttachedToWindow();
                    return null;
                case 1774009266:
                    return new Boolean(super.performClick());
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/EditTextComponent$TNodeEditText");
            }
        }

        private void sendOnEditingMessage(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c398ae37", new Object[]{this, new Boolean(z)});
            } else if (((b) EditTextComponent.access$1400(EditTextComponent.this)).W0 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("state", Integer.valueOf(z ? 1 : 0));
                EditTextComponent editTextComponent = EditTextComponent.this;
                editTextComponent.sendMessage(EditTextComponent.access$1500(editTextComponent), "onediting", ((b) EditTextComponent.access$1600(EditTextComponent.this)).W0, hashMap, null);
            }
        }

        @Override // android.widget.TextView, android.view.View
        public void onAttachedToWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
                return;
            }
            super.onAttachedToWindow();
            if ((EditTextComponent.access$900(EditTextComponent.this) instanceof b) && ((b) EditTextComponent.access$1000(EditTextComponent.this)).a1) {
                requestFocus();
            }
            post(new a());
        }

        @Override // android.view.View
        public void onDetachedFromWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
                return;
            }
            super.onDetachedFromWindow();
            e eVar = this.softKeyBoardListener;
            if (eVar != null) {
                eVar.f();
                this.softKeyBoardListener = null;
            }
        }

        @Override // android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28781408", new Object[]{this, new Boolean(z), new Integer(i), rect});
                return;
            }
            super.onFocusChanged(z, i, rect);
            if (!z && this.inputMethodShown) {
                this.inputMethodShown = false;
                sendOnEditingMessage(z);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.e.b
        public void onKeyBoardHidden() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b038097", new Object[]{this});
                return;
            }
            if (this.inputMethodShown) {
                this.inputMethodShown = false;
                sendOnEditingMessage(false);
            }
            EditTextComponent.access$1702(false);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.e.b
        public void onKeyBoardShown() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1cd0f2", new Object[]{this});
                return;
            }
            if (isFocused() && !this.inputMethodShown) {
                this.inputMethodShown = true;
                sendOnEditingMessage(true);
            }
            EditTextComponent.access$1702(true);
        }

        @Override // android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e9f28f22", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
            }
            if (i == 4 && keyEvent.getAction() == 1 && this.inputMethodShown) {
                this.inputMethodShown = false;
                sendOnEditingMessage(false);
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            ViewParent findScrollParent = findScrollParent();
            if (findScrollParent != null) {
                if (canScrollVertically(-1) || canScrollVertically(1)) {
                    findScrollParent.requestDisallowInterceptTouchEvent(true);
                }
                if (motionEvent.getAction() == 1) {
                    findScrollParent.requestDisallowInterceptTouchEvent(false);
                }
            }
            if (akt.Y() && motionEvent.getAction() == 1 && view == this && (this.softInputMode & 240) == 48 && !this.inputMethodShown) {
                nwv.D0(this);
                this.inputMethodShown = true;
                sendOnEditingMessage(true);
            }
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("69bd3bb2", new Object[]{this})).booleanValue();
            }
            if ((this.softInputMode & 240) == 48 && !this.inputMethodShown) {
                nwv.D0(this);
                this.inputMethodShown = true;
                sendOnEditingMessage(true);
            }
            return super.performClick();
        }

        @Override // android.widget.EditText, android.widget.TextView
        public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("155a5588", new Object[]{this, charSequence, bufferType});
                return;
            }
            this.textChangedByCallSetText = true;
            super.setText(charSequence, bufferType);
            this.textChangedByCallSetText = false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f12034a;
        public final /* synthetic */ ymt b;

        public a(EditTextComponent editTextComponent, View view, ymt ymtVar) {
            this.f12034a = view;
            this.b = ymtVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("614271c0", new Object[]{this});
            } else {
                l0u.c(this.f12034a.getContext(), String.format(this.f12034a.getContext().getString(R.string.at_most_add_word), Integer.valueOf(this.b.M0)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements InputFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f12035a;
        public d b;

        static {
            t2o.a(503316710);
        }

        public c(int i) {
            this.f12035a = i;
        }

        public void a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be7a6824", new Object[]{this, dVar});
            } else {
                this.b = dVar;
            }
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("cf65d449", new Object[]{this, charSequence, new Integer(i), new Integer(i2), spanned, new Integer(i3), new Integer(i4)});
            }
            int g = this.f12035a - (hc8.g(spanned.toString()) - (i4 - i3));
            boolean i5 = hc8.i(charSequence.toString());
            int g2 = hc8.g(charSequence.toString());
            if (g <= 0) {
                d dVar = this.b;
                if (dVar != null) {
                    ((a) dVar).a();
                }
                return "";
            } else if ((i5 && g >= 1) || g >= g2) {
                return null;
            } else {
                int i6 = g + i;
                if (!Character.isHighSurrogate(charSequence.charAt(i6 - 1)) || i6 - 1 != i) {
                    return charSequence.subSequence(i, i6);
                }
                return "";
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final View f12036a;
        public int b;
        public final b c;
        public final int d;
        public final ViewTreeObserver.OnGlobalLayoutListener e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements ViewTreeObserver.OnGlobalLayoutListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                boolean z = false;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                    return;
                }
                try {
                    Rect rect = new Rect();
                    e.a(e.this).getWindowVisibleDisplayFrame(rect);
                    int height = rect.height();
                    if (e.b(e.this) == 0) {
                        e.c(e.this, height);
                    } else if (e.b(e.this) != height && Math.abs(e.b(e.this) - height) > e.d(e.this)) {
                        if (e.b(e.this) > height) {
                            z = true;
                        }
                        if (e.e(e.this) != null) {
                            if (z) {
                                e.e(e.this).onKeyBoardShown();
                            } else {
                                e.e(e.this).onKeyBoardHidden();
                            }
                        }
                        e.c(e.this, height);
                    }
                } catch (Exception e) {
                    tfs.d(e.getMessage());
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public interface b {
            void onKeyBoardHidden();

            void onKeyBoardShown();
        }

        static {
            t2o.a(503316712);
        }

        public e(Activity activity, b bVar, ymt ymtVar) {
            a aVar = new a();
            this.e = aVar;
            View decorView = activity.getWindow().getDecorView();
            this.f12036a = decorView;
            this.c = bVar;
            this.d = s6o.c(activity, 200);
            if ((ymtVar instanceof b) && ((b) ymtVar).Z0 && this.b == 0) {
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                this.b = rect.height();
            }
            try {
                decorView.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            } catch (Exception e) {
                tfs.d(e.getMessage());
            }
        }

        public static /* synthetic */ View a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("cb34b897", new Object[]{eVar});
            }
            return eVar.f12036a;
        }

        public static /* synthetic */ int b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7342f27", new Object[]{eVar})).intValue();
            }
            return eVar.b;
        }

        public static /* synthetic */ int c(e eVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aaa8e344", new Object[]{eVar, new Integer(i)})).intValue();
            }
            eVar.b = i;
            return i;
        }

        public static /* synthetic */ int d(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e1b89ed1", new Object[]{eVar})).intValue();
            }
            return eVar.d;
        }

        public static /* synthetic */ b e(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("448c214e", new Object[]{eVar});
            }
            return eVar.c;
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
                return;
            }
            try {
                this.f12036a.getViewTreeObserver().removeGlobalOnLayoutListener(this.e);
            } catch (Exception e) {
                tfs.d(e.getMessage());
            }
        }
    }

    static {
        t2o.a(503316705);
        t2o.a(503317087);
    }

    public static /* synthetic */ jfw access$000(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("2b958918", new Object[]{editTextComponent});
        }
        return editTextComponent.viewParams;
    }

    public static /* synthetic */ jfw access$100(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("b7d23e77", new Object[]{editTextComponent});
        }
        return editTextComponent.viewParams;
    }

    public static /* synthetic */ jfw access$1000(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("dbcc7149", new Object[]{editTextComponent});
        }
        return editTextComponent.viewParams;
    }

    public static /* synthetic */ jfw access$1200(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("f445dc07", new Object[]{editTextComponent});
        }
        return editTextComponent.viewParams;
    }

    public static /* synthetic */ n access$1300(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("b8862c6f", new Object[]{editTextComponent});
        }
        return editTextComponent.node;
    }

    public static /* synthetic */ jfw access$1400(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("cbf46c5", new Object[]{editTextComponent});
        }
        return editTextComponent.viewParams;
    }

    public static /* synthetic */ n access$1500(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("d59d2e71", new Object[]{editTextComponent});
        }
        return editTextComponent.node;
    }

    public static /* synthetic */ jfw access$1600(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("2538b183", new Object[]{editTextComponent});
        }
        return editTextComponent.viewParams;
    }

    public static /* synthetic */ boolean access$1702(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52063e49", new Object[]{new Boolean(z)})).booleanValue();
        }
        isInputMethodShown = z;
        return z;
    }

    public static /* synthetic */ View access$200(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("36d8aaff", new Object[]{editTextComponent});
        }
        return editTextComponent.view;
    }

    public static /* synthetic */ View access$300(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fd0333c0", new Object[]{editTextComponent});
        }
        return editTextComponent.view;
    }

    public static /* synthetic */ n access$400(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("e67a8201", new Object[]{editTextComponent});
        }
        return editTextComponent.node;
    }

    public static /* synthetic */ jfw access$500(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("e8c513f3", new Object[]{editTextComponent});
        }
        return editTextComponent.viewParams;
    }

    public static /* synthetic */ n access$800(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("20a88605", new Object[]{editTextComponent});
        }
        return editTextComponent.node;
    }

    public static /* synthetic */ jfw access$900(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("19b7e96f", new Object[]{editTextComponent});
        }
        return editTextComponent.viewParams;
    }

    public static /* synthetic */ Object ipc$super(EditTextComponent editTextComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1482507173) {
            super.applyAttrForView((View) objArr[0], (ymt) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode == -362270061) {
            super.updateNeedLayoutOrRender((String) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/EditTextComponent");
        }
    }

    public static boolean isInputMethodShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af0f705b", new Object[0])).booleanValue();
        }
        return isInputMethodShown;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void bindEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56398a64", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.c
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean isDoubleClickSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a243ded", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    public YogaMeasureFunction onCreateMeasureFunction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaMeasureFunction) ipChange.ipc$dispatch("622da8f1", new Object[]{this});
        }
        return this.measureFunction;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        TNodeEditText tNodeEditText = new TNodeEditText(context);
        tNodeEditText.addTextChangedListener(this);
        return tNodeEditText;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void updateNeedLayoutOrRender(String str) {
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea683293", new Object[]{this, str});
            return;
        }
        super.updateNeedLayoutOrRender(str);
        if ("placeholder".equals(str) && (v = this.view) != 0 && TextUtils.isEmpty(((EditText) v).getText())) {
            this.node.r1();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends ymt {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final EditTextComponent T0;
        public String U0;
        public String V0;
        public String W0;
        public int X0;
        public String Y0;
        public boolean Z0;
        public boolean a1;

        static {
            t2o.a(503316709);
        }

        public b(EditTextComponent editTextComponent) {
            this.T0 = editTextComponent;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -998046064) {
                super.B((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            } else if (hashCode == -407167169) {
                super.v((Context) objArr[0], (String) objArr[1], objArr[2]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/EditTextComponent$EditTextViewParams");
            }
        }

        @Override // tb.ymt
        public CharSequence J(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("412d3946", new Object[]{this, str});
            }
            CharSequence charSequence = "";
            if (this.T0.getView() == 0) {
                return str != null ? hc8.j(this.T0.getNode().N(), str, (int) this.w0) : charSequence;
            }
            if (!akt.R0()) {
                return ((EditText) this.T0.getView()).getText();
            }
            TNodeEditText tNodeEditText = (TNodeEditText) this.T0.getView();
            if (TNodeEditText.access$700(tNodeEditText)) {
                Editable text = ((EditText) this.T0.getView()).getText();
                EditTextComponent.access$800(this.T0).g1("text", text);
                return text;
            }
            if (str != null) {
                Editable text2 = tNodeEditText.getText();
                charSequence = hc8.j(this.T0.getNode().N(), str, (int) this.w0);
                if (akt.S0()) {
                    return TextUtils.equals(text2, str) ? text2 : charSequence;
                }
            }
            return charSequence;
        }

        @Override // tb.ymt, tb.jfw
        public void B(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4830690", new Object[]{this, context, hashMap});
                return;
            }
            super.B(context, hashMap);
            this.U0 = nwv.E0(hashMap.get("placeholder"));
            this.V0 = nwv.E0(hashMap.get("onchange"));
            this.W0 = nwv.E0(hashMap.get("onediting"));
            this.Z0 = nwv.o(hashMap.get("keyboard-new-scene"), false);
            this.a1 = nwv.o(hashMap.get("auto-request-focus"), true);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
            if (r8.equals("go") == false) goto L_0x0036;
         */
        @Override // tb.ymt, tb.jfw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void v(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                r7 = this;
                r0 = 1
                r1 = 3
                r2 = 2
                r3 = 0
                r4 = 4
                com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.b.$ipChange
                boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r6 == 0) goto L_0x001b
                java.lang.String r6 = "e7bb1f3f"
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r3] = r7
                r4[r0] = r8
                r4[r2] = r9
                r4[r1] = r10
                r5.ipc$dispatch(r6, r4)
                return
            L_0x001b:
                super.v(r8, r9, r10)
                java.lang.String r8 = "returnKeyType"
                boolean r8 = r8.equals(r9)
                if (r8 == 0) goto L_0x0087
                java.lang.String r8 = tb.nwv.E0(r10)
                if (r8 != 0) goto L_0x002e
                return
            L_0x002e:
                r9 = -1
                int r10 = r8.hashCode()
                switch(r10) {
                    case -906336856: goto L_0x0065;
                    case 3304: goto L_0x005b;
                    case 3089282: goto L_0x0050;
                    case 3377907: goto L_0x0044;
                    case 3526536: goto L_0x0038;
                    default: goto L_0x0036;
                }
            L_0x0036:
                r0 = -1
                goto L_0x0070
            L_0x0038:
                java.lang.String r10 = "send"
                boolean r8 = r8.equals(r10)
                if (r8 != 0) goto L_0x0042
                goto L_0x0036
            L_0x0042:
                r0 = 4
                goto L_0x0070
            L_0x0044:
                java.lang.String r10 = "next"
                boolean r8 = r8.equals(r10)
                if (r8 != 0) goto L_0x004e
                goto L_0x0036
            L_0x004e:
                r0 = 3
                goto L_0x0070
            L_0x0050:
                java.lang.String r10 = "done"
                boolean r8 = r8.equals(r10)
                if (r8 != 0) goto L_0x0059
                goto L_0x0036
            L_0x0059:
                r0 = 2
                goto L_0x0070
            L_0x005b:
                java.lang.String r10 = "go"
                boolean r8 = r8.equals(r10)
                if (r8 != 0) goto L_0x0070
                goto L_0x0036
            L_0x0065:
                java.lang.String r10 = "search"
                boolean r8 = r8.equals(r10)
                if (r8 != 0) goto L_0x006f
                goto L_0x0036
            L_0x006f:
                r0 = 0
            L_0x0070:
                switch(r0) {
                    case 0: goto L_0x0084;
                    case 1: goto L_0x0081;
                    case 2: goto L_0x007d;
                    case 3: goto L_0x0079;
                    case 4: goto L_0x0076;
                    default: goto L_0x0073;
                }
            L_0x0073:
                r7.X0 = r3
                goto L_0x0096
            L_0x0076:
                r7.X0 = r4
                goto L_0x0096
            L_0x0079:
                r8 = 5
                r7.X0 = r8
                goto L_0x0096
            L_0x007d:
                r8 = 6
                r7.X0 = r8
                goto L_0x0096
            L_0x0081:
                r7.X0 = r2
                goto L_0x0096
            L_0x0084:
                r7.X0 = r1
                goto L_0x0096
            L_0x0087:
                java.lang.String r8 = "onreturn"
                boolean r8 = r8.equals(r9)
                if (r8 == 0) goto L_0x0096
                java.lang.String r8 = tb.nwv.E0(r10)
                r7.Y0 = r8
            L_0x0096:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.b.v(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent
    public void applyAttrForView(View view, final ymt ymtVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a2bc5b", new Object[]{this, view, ymtVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(view, ymtVar, map, z);
        boolean z2 = view instanceof EditText;
        if (z2 && !this.maxLengthSet && ymtVar.M0 != -1) {
            this.maxLengthSet = true;
            c cVar = new c(ymtVar.M0);
            cVar.a(new a(this, view, ymtVar));
            ((EditText) view).setFilters(new InputFilter[]{cVar});
        }
        if (z2 && !this.imeActionSet) {
            this.imeActionSet = true;
            EditText editText = (EditText) view;
            b bVar = (b) ymtVar;
            editText.setImeOptions(bVar.X0);
            if (bVar.X0 > 0 && !TextUtils.isEmpty(((b) this.viewParams).Y0)) {
                editText.setInputType(1);
                editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.widget.TextView.OnEditorActionListener
                    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                        }
                        if (i != ((b) ymtVar).X0) {
                            return false;
                        }
                        EditTextComponent editTextComponent = EditTextComponent.this;
                        editTextComponent.sendMessage(EditTextComponent.access$400(editTextComponent), "onreturn", ((b) EditTextComponent.access$500(EditTextComponent.this)).Y0, null, null);
                        return true;
                    }
                });
            }
        }
        EditText editText2 = (EditText) view;
        b bVar2 = (b) ymtVar;
        if (!TextUtils.equals(editText2.getHint(), bVar2.U0)) {
            editText2.setHint(bVar2.U0);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    public ymt generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ymt) ipChange.ipc$dispatch("d956c9bf", new Object[]{this}) : new b(this);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        String charSequence2 = charSequence.toString();
        if (!this.currentText.equals(charSequence2)) {
            String str = this.currentText;
            this.currentText = charSequence2;
            this.node.E();
            TNodeEditText.access$702((TNodeEditText) this.view, !TNodeEditText.access$600((TNodeEditText) this.view));
            n L = this.node.L();
            this.node.r1();
            L.K0();
            L.b1(this.view.getContext());
            TNodeEditText.access$702((TNodeEditText) this.view, false);
            if (((b) this.viewParams).V0 != null && !TNodeEditText.access$600((TNodeEditText) this.view)) {
                HashMap hashMap = new HashMap();
                hashMap.put("oldValue", str);
                hashMap.put("newValue", charSequence2);
                hashMap.put("text", charSequence2);
                sendMessage(this.node, "onchange", ((b) this.viewParams).V0, hashMap, null);
            }
        }
    }
}
