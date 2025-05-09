package com.taobao.android.megadesign.speechRecognition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.uc.webview.export.media.CommandID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.hfn;
import tb.hij;
import tb.mxv;
import tb.pg1;
import tb.tdf;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\u0018\u0000 U2\u00020\u0001:\u0001VB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\fJ\u000f\u0010\"\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\fJ\u0015\u0010#\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J/\u0010)\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b+\u0010\u0017J\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010\fJ\r\u0010-\u001a\u00020\n¢\u0006\u0004\b-\u0010\fR\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u001004j\b\u0012\u0004\u0012\u00020\u0010`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R$\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u001004j\b\u0012\u0004\u0012\u00020\u0010`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010:R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR*\u0010F\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010<\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010K\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010<\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR\u0014\u0010N\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010<R$\u0010\u000f\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u000f\u0010:\"\u0004\bO\u0010$R\u0016\u0010P\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010:R\u0014\u0010R\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010HR\u0014\u0010T\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010H¨\u0006W"}, d2 = {"Lcom/taobao/android/megadesign/speechRecognition/MegaSpeechRecognitionAnimationView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltb/xhv;", "refreshRandomSeedIfNeeded", "()V", "initializeBars", "updateTargetHeights", Constant.PROP_TTS_VOLUME, "", "getBaseAmplitude", "(I)F", "updateCurrentHeights", "Landroid/graphics/Canvas;", "canvas", "drawBars", "(Landroid/graphics/Canvas;)V", "position", "totalBars", "getColorForPosition", "(II)I", "colorStart", "colorEnd", "ratio", "interpolateColor", "(IIF)I", "resetToMinHeight", "invalidateIfAnimating", "onVoiceVolume", "(I)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onDraw", "startAnimation", "stopAnimation", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Ljava/util/Random;", pg1.ATOM_EXT_random, "Ljava/util/Random;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "targetHeights", "Ljava/util/ArrayList;", "currentHeights", "barWidth", TLogTracker.LEVEL_INFO, hij.KEY_CORNER_RADIUS, UTConstant.Args.UT_SUCCESS_F, "gap", "", "isAnimating", "Z", "", "lastUpdateTime", "J", "waveFrequency", "value", "maxHeightDp", "getMaxHeightDp", "()F", "setMaxHeightDp", "(F)V", "minHeightDp", "getMinHeightDp", "setMinHeightDp", "baseMinHeightPx", CommandID.setVolume, "lastVolume", "getMaxHeightPx", "maxHeightPx", "getMinHeightPx", "minHeightPx", "Companion", "a", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class MegaSpeechRecognitionAnimationView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float BASE_MIN_HEIGHT_DP = 2.0f;
    private static final int COLOR_END = -6324481;
    private static final int COLOR_MIDDLE = -41804;
    private static final int COLOR_START = -40448;
    public static final a Companion = new a(null);
    private static final int DEFAULT_IDLE_COLOR = -3485737;
    private int barWidth;
    private final float baseMinHeightPx;
    private float cornerRadius;
    private final ArrayList<Float> currentHeights;
    private int gap;
    private boolean isAnimating;
    private long lastUpdateTime;
    private int lastVolume;
    private float maxHeightDp;
    private float minHeightDp;
    private final Paint paint;
    private final Random random;
    private final ArrayList<Float> targetHeights;
    private int volume;
    private long waveFrequency;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public MegaSpeechRecognitionAnimationView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final void drawBars(Canvas canvas) {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42071a", new Object[]{this, canvas});
            return;
        }
        float height = getHeight() / 2.0f;
        float paddingLeft = getPaddingLeft();
        for (Object obj : this.currentHeights) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                float floatValue = ((Number) obj).floatValue();
                float f = paddingLeft + ((this.gap + i) * i3);
                float f2 = floatValue / 2;
                float f3 = height - f2;
                float f4 = f + this.barWidth;
                float f5 = height + f2;
                Paint paint = this.paint;
                if (this.isAnimating) {
                    i2 = getColorForPosition(i3, this.currentHeights.size());
                } else {
                    i2 = DEFAULT_IDLE_COLOR;
                }
                paint.setColor(i2);
                float f6 = this.cornerRadius;
                canvas.drawRoundRect(f, f3, f4, f5, f6, f6, this.paint);
                i3 = i4;
            } else {
                yz3.p();
                throw null;
            }
        }
    }

    private final float getBaseAmplitude(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4e6afd0", new Object[]{this, new Integer(i)})).floatValue();
        }
        if (i <= 0) {
            return 0.0f;
        }
        return (getMinHeightPx() + ((getMaxHeightPx() - getMinHeightPx()) * hfn.e(hfn.c(i - 1, 0) / 9.0f, 1.0f))) - this.baseMinHeightPx;
    }

    private final int getColorForPosition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52d3d47f", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = i2 / 2;
        if (i < i3) {
            return interpolateColor(-40448, COLOR_MIDDLE, i / i3);
        }
        return interpolateColor(COLOR_MIDDLE, COLOR_END, (i - i3) / i3);
    }

    private final float getMaxHeightPx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61ce7d4", new Object[]{this})).floatValue();
        }
        mxv mxvVar = mxv.INSTANCE;
        Context context = getContext();
        ckf.f(context, "context");
        return mxvVar.a(context, this.maxHeightDp);
    }

    private final float getMinHeightPx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3ecf3c2", new Object[]{this})).floatValue();
        }
        mxv mxvVar = mxv.INSTANCE;
        Context context = getContext();
        ckf.f(context, "context");
        return mxvVar.a(context, this.minHeightDp);
    }

    private final void initializeBars() {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fabcaf7", new Object[]{this});
            return;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        if (width > 0) {
            int i = this.gap;
            int c = hfn.c((width + i) / (this.barWidth + i), 1);
            this.targetHeights.clear();
            this.currentHeights.clear();
            for (int i2 = 0; i2 < c; i2++) {
                if (this.isAnimating) {
                    f = this.random.nextFloat() * getBaseAmplitude(this.volume);
                } else {
                    f = getMinHeightPx();
                }
                this.targetHeights.add(Float.valueOf(f));
                this.currentHeights.add(Float.valueOf(f));
            }
        }
    }

    private final int interpolateColor(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("828b6c4a", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)})).intValue();
        }
        return Color.argb((int) (Color.alpha(i) + ((Color.alpha(i2) - Color.alpha(i)) * f)), (int) (Color.red(i) + ((Color.red(i2) - Color.red(i)) * f)), (int) (Color.green(i) + ((Color.green(i2) - Color.green(i)) * f)), (int) (Color.blue(i) + ((Color.blue(i2) - Color.blue(i)) * f)));
    }

    private final void invalidateIfAnimating() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fbc640d", new Object[]{this});
        } else if (this.isAnimating) {
            invalidate();
        }
    }

    public static /* synthetic */ Object ipc$super(MegaSpeechRecognitionAnimationView megaSpeechRecognitionAnimationView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/megadesign/speechRecognition/MegaSpeechRecognitionAnimationView");
        }
    }

    private final void refreshRandomSeedIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e76f68", new Object[]{this});
        } else if (this.volume != this.lastVolume) {
            this.random.setSeed(System.currentTimeMillis());
            this.lastVolume = this.volume;
        }
    }

    private final void resetToMinHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb38a216", new Object[]{this});
            return;
        }
        Iterator<Integer> it = yz3.j(this.currentHeights).iterator();
        while (it.hasNext()) {
            int nextInt = ((tdf) it).nextInt();
            this.currentHeights.set(nextInt, Float.valueOf(getMinHeightPx()));
            this.targetHeights.set(nextInt, Float.valueOf(getMinHeightPx()));
        }
    }

    private final void setVolume(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942b2c0", new Object[]{this, new Integer(i)});
            return;
        }
        this.volume = hfn.h(i, 0, 10);
        refreshRandomSeedIfNeeded();
        if (i == 0) {
            stopAnimation();
        } else {
            startAnimation();
            updateTargetHeights();
        }
        invalidateIfAnimating();
    }

    private final void updateCurrentHeights() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10cacc23", new Object[]{this});
            return;
        }
        float f = ((this.volume / 10.0f) * 0.2f) + 0.3f;
        int size = this.currentHeights.size();
        for (int i = 0; i < size; i++) {
            ArrayList<Float> arrayList = this.currentHeights;
            float floatValue = arrayList.get(i).floatValue();
            float floatValue2 = this.targetHeights.get(i).floatValue();
            Float f2 = this.currentHeights.get(i);
            ckf.f(f2, "currentHeights[i]");
            arrayList.set(i, Float.valueOf(floatValue + ((floatValue2 - f2.floatValue()) * f)));
        }
    }

    private final void updateTargetHeights() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2fff699", new Object[]{this});
            return;
        }
        int i = this.volume;
        if (i != 0) {
            float baseAmplitude = getBaseAmplitude(i);
            int size = this.targetHeights.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.targetHeights.set(i2, Float.valueOf(this.baseMinHeightPx + (this.random.nextFloat() * baseAmplitude)));
            }
        }
    }

    public final float getMaxHeightDp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1320458", new Object[]{this})).floatValue();
        }
        return this.maxHeightDp;
    }

    public final float getMinHeightDp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af021046", new Object[]{this})).floatValue();
        }
        return this.minHeightDp;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        super.onDraw(canvas);
        long currentTimeMillis = System.currentTimeMillis();
        if (this.isAnimating) {
            if (currentTimeMillis - this.lastUpdateTime >= this.waveFrequency) {
                this.lastUpdateTime = currentTimeMillis;
                updateTargetHeights();
            }
            updateCurrentHeights();
        }
        drawBars(canvas);
        if (this.isAnimating) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        initializeBars();
    }

    public final void onVoiceVolume(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78c1fef", new Object[]{this, new Integer(i)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastUpdateTime >= this.waveFrequency) {
            this.lastUpdateTime = currentTimeMillis;
            setVolume(i);
        }
    }

    public final void setMaxHeightDp(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90b8564", new Object[]{this, new Float(f)});
            return;
        }
        this.maxHeightDp = f;
        initializeBars();
        invalidateIfAnimating();
    }

    public final void setMinHeightDp(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53cf736", new Object[]{this, new Float(f)});
            return;
        }
        this.minHeightDp = f;
        initializeBars();
        invalidateIfAnimating();
    }

    public final void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        } else if (!this.isAnimating) {
            this.isAnimating = true;
            initializeBars();
            invalidate();
        }
    }

    public final void stopAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230f929", new Object[]{this});
        } else if (this.isAnimating) {
            this.isAnimating = false;
            resetToMinHeight();
            invalidate();
        }
    }

    public MegaSpeechRecognitionAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ MegaSpeechRecognitionAnimationView(Context context, AttributeSet attributeSet, int i, int i2, a07 a07Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MegaSpeechRecognitionAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        this.paint = new Paint(1);
        this.random = new Random();
        this.targetHeights = new ArrayList<>();
        this.currentHeights = new ArrayList<>();
        mxv mxvVar = mxv.INSTANCE;
        this.barWidth = mxvVar.a(context, 4.0f);
        this.cornerRadius = mxvVar.a(context, 2.0f);
        this.gap = mxvVar.a(context, 4.0f);
        this.lastUpdateTime = System.currentTimeMillis();
        this.waveFrequency = 100L;
        this.maxHeightDp = 15.0f;
        this.minHeightDp = 9.0f;
        this.baseMinHeightPx = mxvVar.a(context, 2.0f);
        this.lastVolume = -1;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.MegaVoiceAnimationView, 0, 0);
        try {
            setMaxHeightDp(obtainStyledAttributes.getDimension(R.styleable.MegaVoiceAnimationView_maxHeightDp, this.maxHeightDp));
            setMinHeightDp(obtainStyledAttributes.getDimension(R.styleable.MegaVoiceAnimationView_minHeightDp, this.minHeightDp));
            this.waveFrequency = obtainStyledAttributes.getInt(R.styleable.MegaVoiceAnimationView_waveFrequency, (int) this.waveFrequency);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
