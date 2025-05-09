package com.taobao.android.megadesign.speechRecognition;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.psq;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002;<B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0013J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u00060&j\u0002`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010.R\u0018\u00106\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/taobao/android/megadesign/speechRecognition/MegaTextTypeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltb/xhv;", "updateContainerHeight", "()V", "checkScroll", "", "text", "", Constants.Name.INTERVAL, "startIncrementalTyping", "(Ljava/lang/String;J)V", "typeIncrementalText", "(J)V", "startTyping", "typeText", "newText", "setIncrementalText", "appendText", "(Ljava/lang/String;)V", "resetState", "getText", "()Ljava/lang/String;", "Lcom/taobao/android/megadesign/speechRecognition/MegaTextTypeView$a;", DataReceiveMonitor.CB_LISTENER, "setOnHeightChangeListener", "(Lcom/taobao/android/megadesign/speechRecognition/MegaTextTypeView$a;)V", "Landroid/os/Handler;", "typingHandler", "Landroid/os/Handler;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "fullText", "Ljava/lang/StringBuilder;", "", "isTyping", "Z", "currentIndex", TLogTracker.LEVEL_INFO, "Landroid/widget/TextView;", "typewriterTextView", "Landroid/widget/TextView;", "Landroid/widget/ScrollView;", "scrollView", "Landroid/widget/ScrollView;", "maxLines", "onHeightChangeListener", "Lcom/taobao/android/megadesign/speechRecognition/MegaTextTypeView$a;", "Lcom/taobao/android/megadesign/speechRecognition/MegaTextTypeView$TypeMode;", "currentMode", "Lcom/taobao/android/megadesign/speechRecognition/MegaTextTypeView$TypeMode;", "a", "TypeMode", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class MegaTextTypeView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int currentIndex;
    private TypeMode currentMode;
    private final StringBuilder fullText;
    private boolean isTyping;
    private int maxLines;
    private a onHeightChangeListener;
    private ScrollView scrollView;
    private TextView typewriterTextView;
    private final Handler typingHandler;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/megadesign/speechRecognition/MegaTextTypeView$TypeMode;", "", "(Ljava/lang/String;I)V", "APPEND_MODE", "INCREMENT_MODE", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum TypeMode {
        APPEND_MODE,
        INCREMENT_MODE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TypeMode typeMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megadesign/speechRecognition/MegaTextTypeView$TypeMode");
        }

        public static TypeMode valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("46e7222d", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(TypeMode.class, str);
            }
            return (TypeMode) valueOf;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(int i, int i2);
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MegaTextTypeView.access$updateContainerHeight(MegaTextTypeView.this);
            MegaTextTypeView.access$getScrollView$p(MegaTextTypeView.this).fullScroll(130);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;

        public c(long j) {
            this.b = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MegaTextTypeView.access$typeIncrementalText(MegaTextTypeView.this, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MegaTextTypeView.access$typeText(MegaTextTypeView.this);
            }
        }
    }

    public MegaTextTypeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public static final /* synthetic */ ScrollView access$getScrollView$p(MegaTextTypeView megaTextTypeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollView) ipChange.ipc$dispatch("4dea933a", new Object[]{megaTextTypeView});
        }
        return megaTextTypeView.scrollView;
    }

    public static final /* synthetic */ void access$setScrollView$p(MegaTextTypeView megaTextTypeView, ScrollView scrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdd80132", new Object[]{megaTextTypeView, scrollView});
        } else {
            megaTextTypeView.scrollView = scrollView;
        }
    }

    public static final /* synthetic */ void access$typeIncrementalText(MegaTextTypeView megaTextTypeView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff1e705", new Object[]{megaTextTypeView, new Long(j)});
        } else {
            megaTextTypeView.typeIncrementalText(j);
        }
    }

    public static final /* synthetic */ void access$typeText(MegaTextTypeView megaTextTypeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdec099", new Object[]{megaTextTypeView});
        } else {
            megaTextTypeView.typeText();
        }
    }

    public static final /* synthetic */ void access$updateContainerHeight(MegaTextTypeView megaTextTypeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16947d91", new Object[]{megaTextTypeView});
        } else {
            megaTextTypeView.updateContainerHeight();
        }
    }

    private final void checkScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba253fc", new Object[]{this});
        } else {
            this.scrollView.post(new b());
        }
    }

    public static /* synthetic */ Object ipc$super(MegaTextTypeView megaTextTypeView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megadesign/speechRecognition/MegaTextTypeView");
    }

    public static /* synthetic */ void setIncrementalText$default(MegaTextTypeView megaTextTypeView, String str, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cad239", new Object[]{megaTextTypeView, str, new Long(j), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            j = 100;
        }
        megaTextTypeView.setIncrementalText(str, j);
    }

    private final void startIncrementalTyping(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73552fc4", new Object[]{this, str, new Long(j)});
        } else if (str.length() != 0) {
            this.isTyping = true;
            this.currentIndex = 0;
            this.fullText.setLength(0);
            this.fullText.append(str);
            typeIncrementalText(j);
        }
    }

    private final void startTyping() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4bc480", new Object[]{this});
            return;
        }
        this.isTyping = true;
        this.currentIndex = this.typewriterTextView.getText().length();
        typeText();
    }

    private final void typeIncrementalText(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781931b0", new Object[]{this, new Long(j)});
        } else if (this.currentIndex < this.fullText.length()) {
            this.typewriterTextView.append(String.valueOf(this.fullText.charAt(this.currentIndex)));
            this.currentIndex++;
            checkScroll();
            this.typingHandler.postDelayed(new c(j), j);
        } else {
            this.isTyping = false;
        }
    }

    private final void typeText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae848e", new Object[]{this});
        } else if (com.taobao.android.megadesign.speechRecognition.a.$EnumSwitchMapping$0[this.currentMode.ordinal()] == 1) {
            if (this.currentIndex < this.fullText.length()) {
                this.typewriterTextView.append(String.valueOf(this.fullText.charAt(this.currentIndex)));
                this.currentIndex++;
                checkScroll();
                this.typingHandler.postDelayed(new d(), 10L);
                return;
            }
            this.isTyping = false;
        }
    }

    private final void updateContainerHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7cf4606", new Object[]{this});
            return;
        }
        int lineHeight = this.typewriterTextView.getLineHeight() * this.maxLines;
        int lineCount = this.typewriterTextView.getLineCount();
        ViewGroup.LayoutParams layoutParams = this.scrollView.getLayoutParams();
        if (lineCount < this.maxLines) {
            lineHeight = -2;
        }
        if (layoutParams.height != lineHeight) {
            layoutParams.height = lineHeight;
            this.scrollView.setLayoutParams(layoutParams);
        }
        this.scrollView.requestLayout();
        a aVar = this.onHeightChangeListener;
        if (aVar != null) {
            aVar.a(getHeight(), lineCount);
        }
    }

    public final void appendText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e190eb8", new Object[]{this, str});
            return;
        }
        ckf.g(str, "text");
        TypeMode typeMode = this.currentMode;
        TypeMode typeMode2 = TypeMode.APPEND_MODE;
        if (typeMode != typeMode2) {
            resetState();
            this.currentMode = typeMode2;
        }
        this.fullText.append(str);
        if (!this.isTyping) {
            startTyping();
        }
    }

    public final String getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.typewriterTextView.getText().toString();
    }

    public final void resetState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd02409", new Object[]{this});
            return;
        }
        this.typingHandler.removeCallbacksAndMessages(null);
        this.typewriterTextView.setText("");
        psq.j(this.fullText);
        this.currentIndex = 0;
        this.isTyping = false;
        updateContainerHeight();
    }

    public final void setIncrementalText(String str, long j) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f38ed4e", new Object[]{this, str, new Long(j)});
            return;
        }
        ckf.g(str, "newText");
        this.typingHandler.removeCallbacksAndMessages(null);
        this.currentMode = TypeMode.INCREMENT_MODE;
        int min = Math.min(this.typewriterTextView.getText().toString().length(), str.length());
        String str3 = "";
        if (min > 0) {
            str2 = str.substring(0, min);
            ckf.f(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        } else {
            str2 = str3;
        }
        this.typewriterTextView.setText(str2);
        if (str.length() > min) {
            str3 = str.substring(min);
            ckf.f(str3, "(this as java.lang.String).substring(startIndex)");
        }
        startIncrementalTyping(str3, j);
    }

    public final void setOnHeightChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9863a4", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        this.onHeightChangeListener = aVar;
    }

    public MegaTextTypeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ MegaTextTypeView(Context context, AttributeSet attributeSet, int i, int i2, a07 a07Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MegaTextTypeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        this.typingHandler = new Handler(Looper.getMainLooper());
        this.fullText = new StringBuilder();
        this.maxLines = 5;
        this.currentMode = TypeMode.APPEND_MODE;
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.mega_text_type_layout, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.mega_text_type_text_view);
        ckf.f(findViewById, "findViewById(R.id.mega_text_type_text_view)");
        this.typewriterTextView = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.mega_text_type_scroll_view);
        ckf.f(findViewById2, "findViewById(R.id.mega_text_type_scroll_view)");
        this.scrollView = (ScrollView) findViewById2;
    }
}
