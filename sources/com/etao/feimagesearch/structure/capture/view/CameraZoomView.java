package com.etao.feimagesearch.structure.capture.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.view.VerticalProgressBar;
import com.taobao.taobao.R;
import tb.mzu;
import tb.p73;
import tb.t2o;
import tb.vpt;
import tb.zb7;
import tb.zio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CameraZoomView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private c callback;
    private int progress;
    private final float scale = 1.0f;
    private ScaleGestureDetector scaleGestureDetector;
    private VerticalProgressBar seekBar;
    private int touchY;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements VerticalProgressBar.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8ea6d", new Object[]{this, new Float(f)});
            } else if (CameraZoomView.access$000(CameraZoomView.this) != null) {
                CameraZoomView.access$000(CameraZoomView.this).i(f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context c;

        public b(Context context) {
            this.c = context;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/structure/capture/view/CameraZoomView$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                CameraZoomView.access$102(CameraZoomView.this, new ScaleGestureDetector(this.c, new a()));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements ScaleGestureDetector.OnScaleGestureListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
                }
                float currentSpanY = scaleGestureDetector.getCurrentSpanY() - CameraZoomView.access$200(CameraZoomView.this);
                CameraZoomView.access$202(CameraZoomView.this, (int) scaleGestureDetector.getCurrentSpanY());
                CameraZoomView.access$316(CameraZoomView.this, currentSpanY * 1.0f);
                CameraZoomView cameraZoomView = CameraZoomView.this;
                CameraZoomView.access$302(cameraZoomView, Math.max(0, Math.min(CameraZoomView.access$300(cameraZoomView), CameraZoomView.this.getHeight())));
                float access$300 = (CameraZoomView.access$300(CameraZoomView.this) * 1.0f) / CameraZoomView.this.getHeight();
                if (CameraZoomView.access$400(CameraZoomView.this) != null) {
                    CameraZoomView.access$400(CameraZoomView.this).setProgress((int) (100.0f * access$300));
                }
                if (CameraZoomView.access$000(CameraZoomView.this) != null) {
                    CameraZoomView.access$000(CameraZoomView.this).i(access$300);
                }
                return false;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d53c49db", new Object[]{this, scaleGestureDetector});
                } else if (CameraZoomView.access$400(CameraZoomView.this) != null) {
                    CameraZoomView.access$400(CameraZoomView.this).setVisibility(4);
                }
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
                }
                CameraZoomView.access$202(CameraZoomView.this, (int) scaleGestureDetector.getCurrentSpanY());
                if (CameraZoomView.access$400(CameraZoomView.this) != null) {
                    CameraZoomView.access$400(CameraZoomView.this).setVisibility(0);
                }
                mzu.n(p73.f25916a, "zoomEvent", 19999, new String[0]);
                return true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface c {
        void i(float f);
    }

    static {
        t2o.a(481297522);
    }

    public CameraZoomView(Context context) {
        super(context);
        initScaleGestureDetector(context);
        initSeekBar(context);
    }

    public static /* synthetic */ c access$000(CameraZoomView cameraZoomView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("72f1063d", new Object[]{cameraZoomView});
        }
        return cameraZoomView.callback;
    }

    public static /* synthetic */ ScaleGestureDetector access$102(CameraZoomView cameraZoomView, ScaleGestureDetector scaleGestureDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScaleGestureDetector) ipChange.ipc$dispatch("860997be", new Object[]{cameraZoomView, scaleGestureDetector});
        }
        cameraZoomView.scaleGestureDetector = scaleGestureDetector;
        return scaleGestureDetector;
    }

    public static /* synthetic */ int access$200(CameraZoomView cameraZoomView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("779d46c8", new Object[]{cameraZoomView})).intValue();
        }
        return cameraZoomView.touchY;
    }

    public static /* synthetic */ int access$202(CameraZoomView cameraZoomView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4e7ff7f", new Object[]{cameraZoomView, new Integer(i)})).intValue();
        }
        cameraZoomView.touchY = i;
        return i;
    }

    public static /* synthetic */ int access$300(CameraZoomView cameraZoomView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68eed649", new Object[]{cameraZoomView})).intValue();
        }
        return cameraZoomView.progress;
    }

    public static /* synthetic */ int access$302(CameraZoomView cameraZoomView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("edc8601e", new Object[]{cameraZoomView, new Integer(i)})).intValue();
        }
        cameraZoomView.progress = i;
        return i;
    }

    public static /* synthetic */ int access$316(CameraZoomView cameraZoomView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50d1d5d8", new Object[]{cameraZoomView, new Float(f)})).intValue();
        }
        int i = (int) (cameraZoomView.progress + f);
        cameraZoomView.progress = i;
        return i;
    }

    public static /* synthetic */ VerticalProgressBar access$400(CameraZoomView cameraZoomView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerticalProgressBar) ipChange.ipc$dispatch("e4b4f88e", new Object[]{cameraZoomView});
        }
        return cameraZoomView.seekBar;
    }

    private void initScaleGestureDetector(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f966528c", new Object[]{this, context});
        } else {
            vpt.g("initScaleGestureDetector", new b(context));
        }
    }

    private void initSeekBar(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999021b6", new Object[]{this, context});
            return;
        }
        VerticalProgressBar verticalProgressBar = new VerticalProgressBar(context);
        this.seekBar = verticalProgressBar;
        verticalProgressBar.setProgressDrawable(context.getResources().getDrawable(R.drawable.bg_video_progress));
        this.seekBar.setVisibility(4);
        this.seekBar.setMax(100);
        this.seekBar.setProgress(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(zb7.a(4.0f), zb7.a(250.0f));
        layoutParams.addRule(15);
        layoutParams.addRule(21);
        layoutParams.rightMargin = zb7.a(4.0f);
        addView(this.seekBar, layoutParams);
        this.seekBar.setCallback(new a());
    }

    public static /* synthetic */ Object ipc$super(CameraZoomView cameraZoomView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/structure/capture/view/CameraZoomView");
    }

    private boolean useOneFingerZoom(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4d3323b", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touchY = (int) motionEvent.getY();
        } else if (action == 2) {
            int y = (int) motionEvent.getY();
            int i = this.touchY - y;
            this.touchY = y;
            int i2 = (int) (this.progress + (i * 1.0f));
            this.progress = i2;
            int max = Math.max(0, Math.min(i2, getHeight()));
            this.progress = max;
            c cVar = this.callback;
            if (cVar != null) {
                cVar.i((max * 1.0f) / getHeight());
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        ScaleGestureDetector scaleGestureDetector = this.scaleGestureDetector;
        if (scaleGestureDetector != null) {
            return scaleGestureDetector.onTouchEvent(motionEvent);
        }
        return useOneFingerZoom(motionEvent);
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.progress = 0;
        }
    }

    public void setCallback(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e769f28", new Object[]{this, cVar});
        } else {
            this.callback = cVar;
        }
    }

    public CameraZoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initScaleGestureDetector(context);
        initSeekBar(context);
    }
}
