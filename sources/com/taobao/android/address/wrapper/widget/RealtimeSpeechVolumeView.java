package com.taobao.android.address.wrapper.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RealtimeSpeechVolumeView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RealtimeSpeechVolumnView";
    private static final int VOLUME_RECORD_COUNT = 21;
    private final int VOLUME_HALF_WIDTH = dip2px(1.5f);
    private final int VOLUME_MARGIN = dip2px(7.0f);
    private final int VOLUME_MAX_HEIGHT = dip2px(76.0f);
    private final int VOLUME_MIN_HEIGHT = dip2px(20.0f);
    private final int MIN_VOLUME = 10;
    private final int MAX_VOLUME = 70;
    private final int MAX_COLOR = Color.parseColor("#ffb612");
    private final int MIN_COLOR = Color.parseColor("#ff5000");
    private ArrayList<Integer> mVolumeList = new ArrayList<>();
    private Paint mVolumePaint = new Paint();
    private Random random = new Random();

    public RealtimeSpeechVolumeView(Context context) {
        super(context);
        init();
    }

    private int dip2px(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{this, new Float(f)})).intValue();
        }
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void drawVolume(int i, Canvas canvas, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94aebd2d", new Object[]{this, new Integer(i), canvas, new Boolean(z)});
            return;
        }
        this.mVolumePaint.setColor(getCurrentColor(Math.min(i / dip2px(65.0f), 1.0f), this.MIN_COLOR, this.MAX_COLOR));
        if (z) {
            canvas.translate(this.VOLUME_MARGIN, 0.0f);
        }
        int i2 = this.VOLUME_HALF_WIDTH;
        RectF rectF = new RectF(-i2, (-i) / 2, i2, i / 2);
        int i3 = this.VOLUME_HALF_WIDTH;
        canvas.drawRoundRect(rectF, i3, i3, this.mVolumePaint);
    }

    private int getCurrentColor(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1c8fe4c", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)})).intValue();
        }
        int red = Color.red(i);
        int blue = Color.blue(i);
        int green = Color.green(i);
        int alpha = Color.alpha(i);
        int red2 = Color.red(i2);
        int i3 = red2 - red;
        int blue2 = Color.blue(i2) - blue;
        return Color.argb((int) (alpha + (f * (Color.alpha(i2) - alpha))), (int) (red + (i3 * f)), (int) (green + ((Color.green(i2) - green) * f)), (int) (blue + (blue2 * f)));
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mVolumeList.addAll(Collections.nCopies(21, Integer.valueOf(this.VOLUME_HALF_WIDTH * 2)));
        this.mVolumePaint.setAntiAlias(true);
    }

    public static /* synthetic */ Object ipc$super(RealtimeSpeechVolumeView realtimeSpeechVolumeView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/address/wrapper/widget/RealtimeSpeechVolumeView");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (!this.mVolumeList.isEmpty()) {
            canvas.translate(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            int intValue = this.mVolumeList.get(0).intValue();
            canvas.save();
            drawVolume(intValue, canvas, false);
            int size = this.mVolumeList.size() / 2;
            for (int i = 1; i < size; i++) {
                try {
                    drawVolume(this.mVolumeList.get(i).intValue(), canvas, true);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            for (int i2 = 0; i2 < 6; i2++) {
                drawVolume(this.VOLUME_HALF_WIDTH * 2, canvas, true);
            }
            canvas.restore();
            canvas.rotate(180.0f);
            while (size < this.mVolumeList.size()) {
                try {
                    drawVolume(this.mVolumeList.get(size).intValue(), canvas, true);
                    size++;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            for (int i3 = 0; i3 < 6; i3++) {
                drawVolume(this.VOLUME_HALF_WIDTH * 2, canvas, true);
            }
        }
    }

    public void recordVolumn(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbfa508", new Object[]{this, new Integer(i)});
        } else if (this.mVolumeList != null) {
            int max = Math.max((int) (this.VOLUME_MAX_HEIGHT * ((Math.max(10, i + 10) - 10.0f) / 60.0f)), this.VOLUME_MIN_HEIGHT);
            this.mVolumeList.clear();
            for (int i2 = 0; i2 < 21; i2++) {
                this.mVolumeList.add(Integer.valueOf(this.random.nextInt(max) + (this.VOLUME_HALF_WIDTH * 2)));
            }
            invalidate();
        }
    }

    public RealtimeSpeechVolumeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}
