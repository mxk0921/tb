package com.taobao.live.home.dinamic.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Field;
import tb.cpb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DXTBLNativeTextView extends DXNativeTextView implements cpb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final byte MARQUEE_RUNNING = 2;
    private static final byte MARQUEE_STARTING = 1;
    private static final byte MARQUEE_STOPPED = 0;
    private boolean autoMarquee;
    private LinearGradient gradient;
    private float mNewSpeed;
    private float mOrgSpeed;
    private long mTextAnimalTime;
    private TextPaint paint;
    private int postDelayTime;
    private Shader shader;
    private boolean isTextGradient = false;
    public Runnable marqueeRunnable = new a();
    public Runnable animalRunnable = new b();
    private boolean mShaderInit = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXTBLNativeTextView.this.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            DXTBLNativeTextView.this.setSelected(true);
            DXTBLNativeTextView.this.setSingleLine(true);
            DXTBLNativeTextView.this.setHorizontallyScrolling(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DXTBLNativeTextView.this.setVisibility(0);
            }
        }
    }

    static {
        t2o.a(806355471);
        t2o.a(806356529);
    }

    public DXTBLNativeTextView(Context context) {
        super(context);
    }

    public static int changeAlpha(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38b9f828", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    public static /* synthetic */ Object ipc$super(DXTBLNativeTextView dXTBLNativeTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/home/dinamic/widget/DXTBLNativeTextView");
        }
    }

    public void cancelLongTextMarquee() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28b8d46", new Object[]{this});
        } else if (isSelected()) {
            Runnable runnable = this.marqueeRunnable;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            Runnable runnable2 = this.animalRunnable;
            if (runnable2 != null) {
                removeCallbacks(runnable2);
            }
            setSelected(false);
        }
    }

    @Override // tb.cpb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (isSelected()) {
            cancelLongTextMarquee();
        }
    }

    public int getPostDelayTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8256b5f4", new Object[]{this})).intValue();
        }
        return this.postDelayTime;
    }

    public long getTextAnimalTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73ca3f67", new Object[]{this})).longValue();
        }
        return this.mTextAnimalTime;
    }

    public boolean isAutoMarquee() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f75eb3f4", new Object[]{this})).booleanValue();
        }
        return this.autoMarquee;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        TextPaint textPaint = this.paint;
        if (!(textPaint == null || this.gradient == null)) {
            if (!this.isTextGradient || textPaint.measureText((String) getText()) <= getMeasuredWidth()) {
                this.paint.setShader(this.shader);
            } else {
                float measuredWidth = getMeasuredWidth();
                LinearGradient linearGradient = new LinearGradient(measuredWidth * 0.6666667f, 0.0f, measuredWidth, 0.0f, new int[]{changeAlpha(getCurrentTextColor(), 255), getCurrentTextColor(), 0}, new float[]{0.0f, 0.6666667f, 1.0f}, Shader.TileMode.CLAMP);
                this.gradient = linearGradient;
                this.paint.setShader(linearGradient);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth > 0) {
            float f = measuredWidth;
            this.gradient = new LinearGradient(f * 0.6666667f, 0.0f, f, 0.0f, new int[]{changeAlpha(getCurrentTextColor(), 255), getCurrentTextColor(), 0}, new float[]{0.0f, 0.6666667f, 1.0f}, Shader.TileMode.CLAMP);
            TextPaint paint = getPaint();
            this.paint = paint;
            if (!this.mShaderInit) {
                this.mShaderInit = true;
                this.shader = paint.getShader();
            }
        }
    }

    @Override // tb.cpb
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else if (isSelected()) {
            cancelLongTextMarquee();
        }
    }

    @Override // tb.cpb
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    public void setAutoMarquee(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9664bc1c", new Object[]{this, new Boolean(z)});
        } else {
            this.autoMarquee = z;
        }
    }

    public void setMarqueeSpeed(float f) {
        Throwable e;
        try {
            Field declaredField = TextView.class.getDeclaredField("mMarquee");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            if (obj != null) {
                Class<?> cls = obj.getClass();
                for (Field field : cls.getDeclaredFields()) {
                    TLog.loge("SpanTextView", field.getName());
                }
                Field declaredField2 = cls.getDeclaredField("mPixelsPerSecond");
                declaredField2.setAccessible(true);
                this.mOrgSpeed = ((Float) declaredField2.get(obj)).floatValue();
                declaredField2.set(obj, Float.valueOf(f));
            }
        } catch (ClassNotFoundException e2) {
            e = e2;
            TLog.loge("SpanTextView", "setMarqueeSpeed: 设置跑马灯速度失败", e);
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (NoSuchFieldException e4) {
            e = e4;
            TLog.loge("SpanTextView", "setMarqueeSpeed: 设置跑马灯速度失败", e);
        }
    }

    public void setNewSpeed(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a594a8b0", new Object[]{this, new Float(f)});
        } else {
            this.mNewSpeed = f;
        }
    }

    public void setPostDelayTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fabff2e", new Object[]{this, new Integer(i)});
        } else {
            this.postDelayTime = i;
        }
    }

    public void setTextAnimalTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c2e525", new Object[]{this, new Long(j)});
        } else {
            this.mTextAnimalTime = j;
        }
    }

    public void setTextGradient(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd6d58e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isTextGradient = z;
        requestLayout();
    }

    public void startAnimalMarquee() {
        Runnable runnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b534dbcb", new Object[]{this});
        } else if (isAutoMarquee() && !isSelected() && (runnable = this.animalRunnable) != null) {
            removeCallbacks(runnable);
            removeCallbacks(this.marqueeRunnable);
            setEllipsize(TextUtils.TruncateAt.MARQUEE);
            setSelected(true);
            setSingleLine(true);
            setHorizontallyScrolling(true);
            if (this.mTextAnimalTime > 0) {
                setVisibility(4);
                postDelayed(this.animalRunnable, this.mTextAnimalTime);
            }
        }
    }

    public void startLongTextMarquee() {
        Runnable runnable;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb1e5e", new Object[]{this});
        } else if (isAutoMarquee() && (runnable = this.marqueeRunnable) != null) {
            removeCallbacks(runnable);
            removeCallbacks(this.animalRunnable);
            setVisibility(0);
            Runnable runnable2 = this.marqueeRunnable;
            int i = this.postDelayTime;
            if (i > 0) {
                j = i;
            } else {
                j = 500;
            }
            postDelayed(runnable2, j);
        }
    }

    public DXTBLNativeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DXTBLNativeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
