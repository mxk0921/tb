package tb;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.view.DXMeasuredTextView;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.taobao.R;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gi6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CUSTOM = 2;
    public static final int DEFAULT_FROM_STYLE = 0;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static final int TYPEFACE_FINAL = 1;
    private q26 beforeMeasureAttribute;
    public boolean hasDeepCloneTextUnCommonUseProperty;
    public int lineBreakMode;
    public int maxLine;
    public int maxWidth;
    public CharSequence text = "";
    public int textColor = -16777216;
    public int textFlags;
    public int textGravity;
    public float textSize;
    public int textStyle;
    public c textViewUnCommonUseProperty;
    private DXMeasuredTextView textViewUtilForMeasure;
    public static int DEFAULT_TEXT_SIZE = 0;
    public static int DEFAULT_MAX_LINE = 1;
    private static ThreadLocal<q26> attributeThreadLocal = new ThreadLocal<>();
    private static ThreadLocal<HashMap<Class, DXMeasuredTextView>> measuredTextViewHashMapThreadLocal = new ThreadLocal<>();
    private static int DEFAULT_FLAGS = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597413);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new gi6();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f20018a = true;
        public boolean b = false;
        public int c = 32767;
        public int d = 1;
        public boolean e = true;
        public String f = "";

        static {
            t2o.a(444597417);
        }

        public c() {
        }

        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("1c168c17", new Object[]{this});
            }
            c cVar = new c();
            cVar.f20018a = this.f20018a;
            cVar.b = this.b;
            cVar.c = this.c;
            cVar.e = this.e;
            cVar.d = this.d;
            cVar.f = this.f;
            return cVar;
        }
    }

    static {
        t2o.a(444597411);
    }

    public gi6() {
        if (DEFAULT_TEXT_SIZE == 0 && DinamicXEngine.x() != null) {
            DEFAULT_TEXT_SIZE = pb6.f(DinamicXEngine.x(), 12.0f);
        }
        HashMap<Class, DXMeasuredTextView> hashMap = measuredTextViewHashMapThreadLocal.get();
        if (hashMap == null) {
            hashMap = new HashMap<>();
            measuredTextViewHashMapThreadLocal.set(hashMap);
        }
        DXMeasuredTextView dXMeasuredTextView = hashMap.get(getClass());
        this.textViewUtilForMeasure = dXMeasuredTextView;
        if (dXMeasuredTextView == null) {
            if (DinamicXEngine.x() != null) {
                DXMeasuredTextView dXMeasuredTextView2 = new DXMeasuredTextView(DinamicXEngine.x());
                this.textViewUtilForMeasure = dXMeasuredTextView2;
                DEFAULT_FLAGS = dXMeasuredTextView2.getPaintFlags();
                hashMap.put(getClass(), this.textViewUtilForMeasure);
            } else {
                la6.b("DXTextViewWidgetNode create textViewUtilForMeasure 时 context是空");
            }
        }
        q26 q26Var = attributeThreadLocal.get();
        this.beforeMeasureAttribute = q26Var;
        if (q26Var == null) {
            q26 q26Var2 = new q26();
            this.beforeMeasureAttribute = q26Var2;
            attributeThreadLocal.set(q26Var2);
        }
        this.textSize = DEFAULT_TEXT_SIZE;
        this.textStyle = 0;
        this.lineBreakMode = -1;
        this.textGravity = 0;
        this.maxLine = 1;
        this.maxWidth = -1;
    }

    public static /* synthetic */ Typeface access$000(gi6 gi6Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("eb74733", new Object[]{gi6Var, new Integer(i)});
        }
        return gi6Var.getFont(i);
    }

    public static /* synthetic */ int access$100(gi6 gi6Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8479171", new Object[]{gi6Var, new Integer(i)})).intValue();
        }
        return gi6Var.getFontStyle(i);
    }

    private void checkTextViewMeasure(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21932b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (zg5.Y4()) {
            try {
                jb6.m(new a(i, i2, i3, i4));
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public static void clearStaticField() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1bc3a6", new Object[0]);
            return;
        }
        measuredTextViewHashMapThreadLocal = new ThreadLocal<>();
        DEFAULT_TEXT_SIZE = 0;
    }

    private Typeface getFont(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("9cf736ed", new Object[]{this, new Integer(i)});
        }
        Typeface typeface = Typeface.DEFAULT;
        if (i == 0) {
            return typeface;
        }
        if (i == 1) {
            return Typeface.DEFAULT_BOLD;
        }
        if (i != 2) {
            return i != 3 ? typeface : Typeface.defaultFromStyle(3);
        }
        return Typeface.defaultFromStyle(2);
    }

    private int getFontStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a1226e3", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i != 0) {
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 3;
            }
        }
        return 0;
    }

    public static /* synthetic */ Object ipc$super(gi6 gi6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXTextViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindAccessibilityToView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0dfc7a9", new Object[]{this, view, new Integer(i)});
            return;
        }
        String accessibilityText = getAccessibilityText();
        if (accessibilityText != null) {
            view.setContentDescription(accessibilityText);
        }
        if (i != 3) {
            if (i == 1 || i == -1) {
                view.setImportantForAccessibility(1);
                view.setFocusable(true);
            } else if (i == 2) {
                view.setImportantForAccessibility(4);
            } else {
                view.setImportantForAccessibility(2);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new gi6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 5737767606580872653L) {
            return -16777216;
        }
        if (j == 6751005219504497256L) {
            return DEFAULT_TEXT_SIZE;
        }
        if (j == 4685059187929305417L) {
            return DEFAULT_MAX_LINE;
        }
        if (j == 4822617398935994384L) {
            return 1;
        }
        if (j == 1174195049226651996L) {
            return 0;
        }
        if (j == -7175398628172498739L) {
            return 32767;
        }
        if (j == 5734523154528465099L) {
            return 1;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == 38178040921L) {
            return "";
        }
        return super.getDefaultValueForStringAttr(j);
    }

    public int getLineBreakMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8de1672", new Object[]{this})).intValue();
        }
        return this.lineBreakMode;
    }

    public int getMaxLines() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a208196b", new Object[]{this})).intValue();
        }
        return this.maxLine;
    }

    public int getMaxWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f83cb2", new Object[]{this})).intValue();
        }
        return this.maxWidth;
    }

    public CharSequence getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this});
        }
        return this.text;
    }

    public int getTextColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43c263fa", new Object[]{this})).intValue();
        }
        return this.textColor;
    }

    public int getTextFlags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("756ef11e", new Object[]{this})).intValue();
        }
        return this.textFlags;
    }

    public int getTextGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5324625", new Object[]{this})).intValue();
        }
        return this.textGravity;
    }

    public float getTextSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("835f3abb", new Object[]{this})).floatValue();
        }
        return this.textSize;
    }

    public int getTextStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("394a7b48", new Object[]{this})).intValue();
        }
        return this.textStyle;
    }

    public boolean isAutoSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("faab9125", new Object[]{this})).booleanValue();
        }
        c cVar = this.textViewUnCommonUseProperty;
        if (cVar == null) {
            return false;
        }
        return cVar.b;
    }

    public int isAutoSizeMaxTextSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35f352d2", new Object[]{this})).intValue();
        }
        c cVar = this.textViewUnCommonUseProperty;
        if (cVar == null) {
            return 32767;
        }
        return cVar.c;
    }

    public int isAutoSizeMinTextSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3c35ec0", new Object[]{this})).intValue();
        }
        c cVar = this.textViewUnCommonUseProperty;
        if (cVar == null) {
            return 1;
        }
        return cVar.d;
    }

    public boolean isEnableTextSizeStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9368a359", new Object[]{this})).booleanValue();
        }
        c cVar = this.textViewUnCommonUseProperty;
        if (cVar == null) {
            return true;
        }
        return cVar.e;
    }

    public boolean isIncludeFontPadding_Android() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a61795f", new Object[]{this})).booleanValue();
        }
        c cVar = this.textViewUnCommonUseProperty;
        if (cVar == null) {
            return true;
        }
        return cVar.f20018a;
    }

    public void onBeforeMeasure(TextView textView) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        int layoutGravity = getLayoutGravity();
        resetMeasuredView(textView);
        q26 q26Var = this.beforeMeasureAttribute;
        q26Var.f26456a = this.layoutWidth;
        q26Var.b = this.layoutHeight;
        getWeight();
        q26Var.getClass();
        q26 q26Var2 = this.beforeMeasureAttribute;
        if (layoutGravity != q26Var2.d) {
            q26Var2.c = kl6.f(DXWidgetNode.getAbsoluteGravity(layoutGravity, getDirection()));
            this.beforeMeasureAttribute.d = layoutGravity;
        }
        j jVar = (j) this.parentWidget;
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = jVar.generateLayoutParams(this.beforeMeasureAttribute);
        } else {
            layoutParams = jVar.generateLayoutParams(this.beforeMeasureAttribute, layoutParams2);
        }
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof gi6) {
            gi6 gi6Var = (gi6) dXWidgetNode;
            this.textStyle = gi6Var.textStyle;
            this.textGravity = gi6Var.textGravity;
            this.maxLine = gi6Var.maxLine;
            this.lineBreakMode = gi6Var.lineBreakMode;
            this.maxWidth = gi6Var.maxWidth;
            this.text = gi6Var.text;
            this.textColor = gi6Var.textColor;
            this.textSize = gi6Var.textSize;
            this.textFlags = gi6Var.textFlags;
            this.textViewUnCommonUseProperty = gi6Var.textViewUnCommonUseProperty;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new DXNativeTextView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser() {
        DXRuntimeContext dXRuntimeContext;
        DXEngineConfig c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
        } else if (isEnableTextSizeStrategy() && (dXRuntimeContext = this.dXRuntimeContext) != null && (c2 = dXRuntimeContext.s().c()) != null && c2.E()) {
            this.textSize = vu5.b(this.dXRuntimeContext, this.textSize);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        DXMeasuredTextView dXMeasuredTextView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            setMeasuredDimension(i, i2);
        } else {
            if (zg5.H4() && ((dXMeasuredTextView = this.textViewUtilForMeasure) == null || dXMeasuredTextView.getInitThreadId() != Thread.currentThread().getId())) {
                HashMap<Class, DXMeasuredTextView> hashMap = measuredTextViewHashMapThreadLocal.get();
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    measuredTextViewHashMapThreadLocal.set(hashMap);
                }
                DXMeasuredTextView dXMeasuredTextView2 = hashMap.get(getClass());
                this.textViewUtilForMeasure = dXMeasuredTextView2;
                if (dXMeasuredTextView2 == null) {
                    DXMeasuredTextView dXMeasuredTextView3 = new DXMeasuredTextView(DinamicXEngine.x());
                    this.textViewUtilForMeasure = dXMeasuredTextView3;
                    DEFAULT_FLAGS = dXMeasuredTextView3.getPaintFlags();
                    hashMap.put(getClass(), this.textViewUtilForMeasure);
                }
            }
            onBeforeMeasure(this.textViewUtilForMeasure);
            this.textViewUtilForMeasure.onMeasure(i, i2);
            if (!TextUtils.isEmpty(this.text) || this.layoutHeight != -2) {
                setMeasuredDimension(this.textViewUtilForMeasure.getMeasuredWidthAndState(), this.textViewUtilForMeasure.getMeasuredHeightAndState());
            } else {
                setMeasuredDimension(this.textViewUtilForMeasure.getMeasuredWidthAndState(), 0);
            }
            checkTextViewMeasure(i, i2, getMeasuredWidthAndState(), getMeasuredHeightAndState());
            if (zg5.m2()) {
                this.textViewUtilForMeasure.setText((CharSequence) null);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (5737767606580872653L == j) {
            this.textColor = i;
        } else if (-1564827143683948874L == j) {
            this.textGravity = i;
        } else if (4685059187929305417L == j) {
            if (i > 0) {
                this.maxLine = i;
            } else {
                this.maxLine = Integer.MAX_VALUE;
            }
        } else if (eb6.DXRICHTEXT_MAXWIDTH == j) {
            if (i > 0) {
                this.maxWidth = i;
            } else {
                this.maxWidth = Integer.MAX_VALUE;
            }
        } else if (1650157837879951391L == j) {
            this.lineBreakMode = i;
        } else if (6751005219504497256L == j) {
            if (i > 0) {
                this.textSize = i;
            } else {
                this.textSize = DEFAULT_TEXT_SIZE;
            }
        } else if (9423384817756195L == j) {
            int i6 = this.textStyle;
            if (i > 0) {
                i5 = i6 | 1;
            } else {
                i5 = i6 & (-2);
            }
            this.textStyle = i5;
        } else if (3527554185889034042L == j) {
            int i7 = this.textStyle;
            if (i > 0) {
                i4 = i7 | 2;
            } else {
                i4 = i7 & (-3);
            }
            this.textStyle = i4;
        } else if (-1740854880214056386L == j) {
            int i8 = this.textFlags;
            if (i > 0) {
                i3 = i8 | 17;
            } else {
                i3 = i8 & (-18);
            }
            this.textFlags = i3;
        } else if (-8089424158689439347L == j) {
            int i9 = this.textFlags;
            if (i > 0) {
                i2 = i9 | 9;
            } else {
                i2 = i9 & (-10);
            }
            this.textFlags = i2;
        } else if (4822617398935994384L == j) {
            if (i == 0) {
                z = false;
            }
            setEnableTextSizeStrategy(z);
        } else if (1174195049226651996L == j) {
            if (i == 0) {
                z = false;
            }
            setAutoSize(z);
        } else if (-7175398628172498739L == j) {
            if (i > 0) {
                setAutoSizeMaxTextSize(i);
            } else {
                setAutoSizeMaxTextSize(32767);
            }
        } else if (5734523154528465099L == j) {
            if (i > 0) {
                setAutoSizeMinTextSize(i);
            } else {
                setAutoSizeMinTextSize(1);
            }
        } else if (j == 1046654090308105836L) {
            if (i == 0) {
                z = false;
            }
            setIncludeFontPadding_Android(z);
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (38178040921L == j) {
            this.text = str;
        } else if (j == 34149272427L) {
            setFont(str);
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public void resetMeasuredView(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe64c63", new Object[]{this, textView});
            return;
        }
        if (!eb5.k()) {
            setNativeText(textView, this.text);
        }
        float textSize = textView.getTextSize();
        float f = this.textSize;
        if (textSize != f) {
            textView.setTextSize(0, f);
        }
        if (!TextUtils.isEmpty(getFont())) {
            setNativeTextFont(textView, getFont(), this.textStyle);
        } else {
            setNativeTextStyle(textView, this.textStyle);
        }
        setNativeMaxLines(textView, this.maxLine);
        setNativeEllipsize(textView, this.lineBreakMode);
        setNativeMaxWidth(textView, this.maxWidth);
        setNativeTextFlags(textView, this.textFlags);
        setNativeTextIncludeFontPadding(textView, isIncludeFontPadding_Android());
        if (eb5.k()) {
            setNativeText(textView, this.text);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 10;
    }

    public void setAutoSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29be119b", new Object[]{this, new Boolean(z)});
            return;
        }
        setTextPropertyBeforeCheck();
        this.textViewUnCommonUseProperty.b = z;
    }

    public void setAutoSizeMaxTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ad033c", new Object[]{this, new Integer(i)});
            return;
        }
        setTextPropertyBeforeCheck();
        this.textViewUnCommonUseProperty.c = i;
    }

    public void setAutoSizeMinTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0de750e", new Object[]{this, new Integer(i)});
            return;
        }
        setTextPropertyBeforeCheck();
        this.textViewUnCommonUseProperty.d = i;
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb92188", new Object[]{this, textView, new Integer(i), new Integer(i2)});
        } else if (isAutoSize() && i2 > 0 && i > 0) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, 1, 0);
                } else {
                    TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(textView, i, i2, 1, 0);
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public void setDefaultFromStyleNativeTextStyle(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9f81eb", new Object[]{this, textView, new Integer(i)});
            return;
        }
        textView.setTag(R.id.dx_textview_font_tag, 0);
        textView.setTypeface(Typeface.defaultFromStyle(getFontStyle(i)));
    }

    public void setEnableTextSizeStrategy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72cf07e7", new Object[]{this, new Boolean(z)});
            return;
        }
        setTextPropertyBeforeCheck();
        this.textViewUnCommonUseProperty.e = z;
    }

    public void setFont(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7553a2", new Object[]{this, str});
            return;
        }
        setTextPropertyBeforeCheck();
        this.textViewUnCommonUseProperty.f = str;
    }

    public void setIncludeFontPadding_Android(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e4cea1", new Object[]{this, new Boolean(z)});
            return;
        }
        setTextPropertyBeforeCheck();
        this.textViewUnCommonUseProperty.f20018a = z;
    }

    public void setLineBreakMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a10ae70", new Object[]{this, new Integer(i)});
        } else {
            this.lineBreakMode = i;
        }
    }

    public void setMaxLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d1eeff", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.maxLine = i;
        } else {
            this.maxLine = Integer.MAX_VALUE;
        }
    }

    public void setMaxWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e63498", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.maxWidth = i;
        } else {
            this.maxWidth = Integer.MAX_VALUE;
        }
    }

    public void setNativeEllipsize(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a49cb7a", new Object[]{this, textView, new Integer(i)});
        } else if (i == 0) {
            textView.setEllipsize(null);
        } else if (i == 1) {
            textView.setEllipsize(TextUtils.TruncateAt.START);
        } else if (i == 2) {
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i == 3) {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public void setNativeMaxLines(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5479b63a", new Object[]{this, textView, new Integer(i)});
        } else if (i > 0) {
            textView.setMaxLines(i);
        } else {
            textView.setMaxLines(Integer.MAX_VALUE);
        }
    }

    public void setNativeMaxWidth(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2fbec1", new Object[]{this, textView, new Integer(i)});
        } else if (i > 0) {
            textView.setMaxWidth(i);
        } else {
            textView.setMaxWidth(Integer.MAX_VALUE);
        }
    }

    public void setNativeText(TextView textView, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25fcd1b", new Object[]{this, textView, charSequence});
        } else if (TextUtils.isEmpty(charSequence)) {
            textView.setText("");
        } else {
            textView.setText(charSequence);
        }
    }

    public void setNativeTextFlags(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5d987", new Object[]{this, textView, new Integer(i)});
        } else if (i != textView.getPaintFlags()) {
            if (i == 0) {
                i = DEFAULT_FLAGS;
            }
            textView.getPaint().setFlags(i);
        }
    }

    public void setNativeTextFont(TextView textView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b1cf11", new Object[]{this, textView, str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                if (DinamicXEngine.x() == null) {
                    setNativeTextStyle(textView, i);
                    return;
                }
                Typeface b2 = fv9.c().b(str, getFontStyle(i));
                if (b2 != null) {
                    textView.setTypeface(b2);
                    textView.setTag(R.id.dx_textview_font_tag, 2);
                    return;
                }
                setNativeTextStyle(textView, i);
            } catch (Throwable th) {
                setNativeTextStyle(textView, i);
                xv5.c(th, false);
            }
        }
    }

    public void setNativeTextGravity(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341b208e", new Object[]{this, textView, new Integer(i)});
        } else if (getDirection() == 1) {
            if (i == 0) {
                textView.setGravity(21);
            } else if (i == 1) {
                textView.setGravity(17);
            } else if (i == 2) {
                textView.setGravity(19);
            } else {
                textView.setGravity(16);
            }
        } else if (i == 0) {
            textView.setGravity(19);
        } else if (i == 1) {
            textView.setGravity(17);
        } else if (i == 2) {
            textView.setGravity(21);
        } else {
            textView.setGravity(16);
        }
    }

    public void setNativeTextIncludeFontPadding(TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a074457", new Object[]{this, textView, new Boolean(z)});
        } else if (zg5.Z3()) {
            textView.setIncludeFontPadding(z);
        }
    }

    public void setNativeTextStyle(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7415a331", new Object[]{this, textView, new Integer(i)});
        } else if (zg5.a5()) {
            setTypefaceFinalNativeTextStyle(textView, i);
        } else {
            setDefaultFromStyleNativeTextStyle(textView, i);
        }
    }

    public void setText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ac5a", new Object[]{this, charSequence});
        } else {
            this.text = charSequence;
        }
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            this.textColor = i;
        }
    }

    public void setTextGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a513881d", new Object[]{this, new Integer(i)});
        } else {
            this.textGravity = i;
        }
    }

    public void setTextPropertyBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904e88c", new Object[]{this});
            return;
        }
        c cVar = this.textViewUnCommonUseProperty;
        if (cVar == null) {
            this.textViewUnCommonUseProperty = new c();
            this.hasDeepCloneTextUnCommonUseProperty = true;
        } else if (!this.hasDeepCloneTextUnCommonUseProperty) {
            this.textViewUnCommonUseProperty = cVar.a();
            this.hasDeepCloneTextUnCommonUseProperty = true;
        }
    }

    public void setTextSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5eecc9", new Object[]{this, new Float(f)});
        } else if (f > 0.0f) {
            this.textSize = f;
        } else {
            this.textSize = DEFAULT_TEXT_SIZE;
        }
    }

    public void setTextStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7fbca5a", new Object[]{this, new Integer(i)});
        } else {
            this.textStyle = i;
        }
    }

    public void setTypefaceFinalNativeTextStyle(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bac0996", new Object[]{this, textView, new Integer(i)});
            return;
        }
        textView.setTag(R.id.dx_textview_font_tag, 1);
        textView.setTypeface(getFont(i));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        if (getClass() == gi6.class) {
            return true;
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f20017a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public a(int i, int i2, int i3, int i4) {
            this.f20017a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                DXMeasuredTextView dXMeasuredTextView = new DXMeasuredTextView(DinamicXEngine.x());
                gi6.this.onBeforeMeasure(dXMeasuredTextView);
                int i2 = R.id.dx_textview_font_tag;
                if (dXMeasuredTextView.getTag(i2) != null) {
                    int intValue = ((Integer) dXMeasuredTextView.getTag(i2)).intValue();
                    if (intValue == 0) {
                        gi6 gi6Var = gi6.this;
                        dXMeasuredTextView.setTypeface(gi6.access$000(gi6Var, gi6Var.textStyle));
                        dXMeasuredTextView.onMeasure(this.f20017a, this.b);
                    } else if (intValue == 1) {
                        gi6 gi6Var2 = gi6.this;
                        dXMeasuredTextView.setTypeface(Typeface.defaultFromStyle(gi6.access$100(gi6Var2, gi6Var2.textStyle)));
                        dXMeasuredTextView.onMeasure(this.f20017a, this.b);
                    }
                    int measuredWidthAndState = dXMeasuredTextView.getMeasuredWidthAndState();
                    if (!TextUtils.isEmpty(gi6.this.text) || gi6.this.layoutHeight != -2) {
                        i = dXMeasuredTextView.getMeasuredHeightAndState();
                    }
                    if (measuredWidthAndState != this.c || i != this.d) {
                        ic5.r(gi6.this.getDXRuntimeContext(), "DX_TextView_Font", "DX_TextView_Font_Measure_Error", f.DX_TEXTVIEW_FONT_MEASURE_ERROR, "text view 宽高计算不一致[width=" + measuredWidthAndState + " height=" + i + " measuredWidth=" + this.c + " measuredHeight=" + this.d + "  manufacturer=" + ybk.a() + " romName=" + ybk.d() + " romverName=" + ybk.e() + " systemModel=" + ybk.f() + " brand=" + Build.BRAND + " fontStyle=" + (intValue + "") + "  useTypeface=" + (zg5.a5() + "") + "]");
                    }
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view != null && (view instanceof TextView)) {
            TextView textView = (TextView) view;
            if (!eb5.k()) {
                setNativeText(textView, this.text);
            }
            textView.setTextColor(tryFetchDarkModeColor("textColor", 0, this.textColor));
            textView.setTextSize(0, this.textSize);
            if (!TextUtils.isEmpty(getFont())) {
                setNativeTextFont(textView, getFont(), this.textStyle);
            } else {
                int i = this.textStyle;
                if (i != -1) {
                    setNativeTextStyle(textView, i);
                }
            }
            setNativeMaxLines(textView, this.maxLine);
            setNativeTextGravity(textView, this.textGravity);
            int i2 = this.lineBreakMode;
            if (i2 != -1) {
                setNativeEllipsize(textView, i2);
            }
            int i3 = this.maxWidth;
            if (i3 != -1) {
                setNativeMaxWidth(textView, i3);
            }
            setNativeTextFlags(textView, this.textFlags);
            setAutoSizeTextTypeUniformWithConfiguration(textView, isAutoSizeMinTextSize(), isAutoSizeMaxTextSize());
            setNativeTextIncludeFontPadding(this.textViewUtilForMeasure, isIncludeFontPadding_Android());
            if (eb5.k()) {
                setNativeText(textView, this.text);
            }
        }
    }

    public String getFont() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ea4d754", new Object[]{this});
        }
        c cVar = this.textViewUnCommonUseProperty;
        if (cVar == null) {
            return "";
        }
        return cVar.f;
    }

    public gi6(Context context) {
        if (DEFAULT_TEXT_SIZE == 0 && context != null) {
            DEFAULT_TEXT_SIZE = pb6.f(context, 12.0f);
        }
        this.textSize = DEFAULT_TEXT_SIZE;
        this.textStyle = 0;
        this.lineBreakMode = -1;
        this.textGravity = 0;
        this.maxLine = 1;
        this.maxWidth = -1;
    }
}
