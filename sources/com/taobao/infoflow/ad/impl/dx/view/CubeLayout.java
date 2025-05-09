package com.taobao.infoflow.ad.impl.dx.view;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import tb.dcj;
import tb.f51;
import tb.svv;
import tb.v1;
import tb.vnf;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CubeLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CubeLayout";
    private static final int sFinalDegree = 90;
    private Camera camera;
    private View.OnClickListener clickListener;
    private Context context;
    private int currentIndex;
    private List<vnf> dataList;
    private long duration;
    private ImageView.ScaleType imageScaleType;
    private boolean initial;
    private BaseInterpolator interpolator;
    private long interval;
    private boolean isAnimating;
    private Matrix matrix;
    private boolean pauseCubeAnim;
    private String pid;
    private long startTime;
    private d tickHandler;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i;
            int i2 = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (CubeLayout.access$100(CubeLayout.this) != null && CubeLayout.access$100(CubeLayout.this).size() != 0) {
                if (!CubeLayout.access$200(CubeLayout.this)) {
                    i = CubeLayout.access$300(CubeLayout.this) + (!CubeLayout.access$400(CubeLayout.this) ? 1 : 0);
                } else {
                    i = CubeLayout.access$300(CubeLayout.this);
                }
                if (i < CubeLayout.access$100(CubeLayout.this).size()) {
                    i2 = i;
                }
                vnf vnfVar = (vnf) CubeLayout.access$100(CubeLayout.this).get(i2);
                v1.b(CubeLayout.TAG, "click: realIndex=" + i2 + ", isAnimating=" + CubeLayout.access$200(CubeLayout.this) + ", currentIndex=" + CubeLayout.access$300(CubeLayout.this) + ", clickItem=" + vnfVar);
                CubeLayout.this.stopTick();
                Nav.from(CubeLayout.access$500(CubeLayout.this)).toUri(vnfVar.b);
                svv.a(vnfVar.c);
                dcj.d(CubeLayout.access$600(CubeLayout.this), vnfVar.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public c f10624a;
        public boolean b;

        public d() {
        }

        public static /* synthetic */ boolean a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8ad2a599", new Object[]{dVar})).booleanValue();
            }
            return dVar.b;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/view/CubeLayout$TickHandler");
        }

        public void b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d611a444", new Object[]{this, cVar});
            } else {
                this.f10624a = cVar;
            }
        }

        public /* synthetic */ d(CubeLayout cubeLayout, a aVar) {
            this();
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
                return;
            }
            v1.b(CubeLayout.TAG, "start, isTicking=" + this.b);
            if (!this.b) {
                sendEmptyMessageDelayed(1, CubeLayout.access$1100(CubeLayout.this));
                this.b = true;
            }
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6623bb89", new Object[]{this});
                return;
            }
            v1.b(CubeLayout.TAG, "stop, isTicking=" + this.b);
            removeCallbacksAndMessages(null);
            this.b = false;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1) {
                v1.b(CubeLayout.TAG, "ticking");
                c cVar = this.f10624a;
                if (cVar != null) {
                    ((b) cVar).a();
                }
                removeCallbacksAndMessages(1);
                removeCallbacksAndMessages(2);
                sendEmptyMessageDelayed(1, CubeLayout.access$1100(CubeLayout.this));
            } else if (i == 2) {
                v1.b(CubeLayout.TAG, "check start");
                CubeLayout.this.startTick();
            } else if (i == 3) {
                v1.b(CubeLayout.TAG, "check stop");
                CubeLayout.this.stopTick();
            }
        }
    }

    public CubeLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ List access$100(CubeLayout cubeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c376c631", new Object[]{cubeLayout});
        }
        return cubeLayout.dataList;
    }

    public static /* synthetic */ long access$1002(CubeLayout cubeLayout, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89950932", new Object[]{cubeLayout, new Long(j)})).longValue();
        }
        cubeLayout.startTime = j;
        return j;
    }

    public static /* synthetic */ long access$1100(CubeLayout cubeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b912879", new Object[]{cubeLayout})).longValue();
        }
        return cubeLayout.interval;
    }

    public static /* synthetic */ boolean access$200(CubeLayout cubeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65fb4a9b", new Object[]{cubeLayout})).booleanValue();
        }
        return cubeLayout.isAnimating;
    }

    public static /* synthetic */ int access$300(CubeLayout cubeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f4f9fcb", new Object[]{cubeLayout})).intValue();
        }
        return cubeLayout.currentIndex;
    }

    public static /* synthetic */ int access$302(CubeLayout cubeLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8edbcb5c", new Object[]{cubeLayout, new Integer(i)})).intValue();
        }
        cubeLayout.currentIndex = i;
        return i;
    }

    public static /* synthetic */ int access$308(CubeLayout cubeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9252bd3", new Object[]{cubeLayout})).intValue();
        }
        int i = cubeLayout.currentIndex;
        cubeLayout.currentIndex = 1 + i;
        return i;
    }

    public static /* synthetic */ boolean access$400(CubeLayout cubeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8a3f51d", new Object[]{cubeLayout})).booleanValue();
        }
        return cubeLayout.initial;
    }

    public static /* synthetic */ boolean access$402(CubeLayout cubeLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90125e1d", new Object[]{cubeLayout, new Boolean(z)})).booleanValue();
        }
        cubeLayout.initial = z;
        return z;
    }

    public static /* synthetic */ Context access$500(CubeLayout cubeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c941bb52", new Object[]{cubeLayout});
        }
        return cubeLayout.context;
    }

    public static /* synthetic */ String access$600(CubeLayout cubeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f331e65", new Object[]{cubeLayout});
        }
        return cubeLayout.pid;
    }

    public static /* synthetic */ boolean access$700(CubeLayout cubeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34a0f4e0", new Object[]{cubeLayout})).booleanValue();
        }
        return cubeLayout.pauseCubeAnim;
    }

    public static /* synthetic */ d access$800(CubeLayout cubeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("f26bee6e", new Object[]{cubeLayout});
        }
        return cubeLayout.tickHandler;
    }

    private void adapterImageViews(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3728b61a", new Object[]{this, new Integer(i)});
        } else if (getChildCount() > i) {
            removeViews(i, getChildCount() - i);
        } else if (getChildCount() < i) {
            for (int childCount = getChildCount(); childCount < i; childCount++) {
                addView(generateImageView());
            }
        }
    }

    private void bindImageData(List<vnf> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feaa7760", new Object[]{this, list});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            TUrlImageView tUrlImageView = (TUrlImageView) getChildAt(i);
            tUrlImageView.setScaleType(this.imageScaleType);
            tUrlImageView.setImageUrl(list.get(i).f30125a);
        }
    }

    private void drawCube(Canvas canvas, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433abf19", new Object[]{this, canvas, new Double(d2)});
            return;
        }
        View childAt = getChildAt(this.currentIndex);
        View childAt2 = getChildAt(this.currentIndex + 1);
        int width = getWidth();
        int height = getHeight();
        long drawingTime = getDrawingTime();
        this.camera.save();
        double d3 = width;
        this.camera.translate((float) (d3 - (d2 * d3)), 0.0f, 0.0f);
        this.camera.rotateY((float) ((-90.0d) * d2));
        this.camera.getMatrix(this.matrix);
        this.camera.restore();
        float f = height / 2;
        this.matrix.postTranslate(0.0f, f);
        int i = -width;
        float f2 = (-height) / 2;
        this.matrix.preTranslate(i, f2);
        canvas.save();
        canvas.concat(this.matrix);
        drawChild(canvas, childAt, drawingTime);
        canvas.restore();
        this.camera.save();
        this.camera.translate((float) (i * d2), 0.0f, 0.0f);
        this.camera.rotateY((float) (90.0d - (d2 * 90.0d)));
        this.camera.getMatrix(this.matrix);
        this.camera.restore();
        this.matrix.postTranslate(width, f);
        this.matrix.preTranslate(0.0f, f2);
        canvas.save();
        canvas.concat(this.matrix);
        drawChild(canvas, childAt2, drawingTime);
        canvas.restore();
    }

    private TUrlImageView generateImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("51b9f30a", new Object[]{this});
        }
        return new TUrlImageView(this.context);
    }

    public static /* synthetic */ Object ipc$super(CubeLayout cubeLayout, String str, Object... objArr) {
        if (str.hashCode() == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/view/CubeLayout");
    }

    private void resetImageAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2435d41f", new Object[]{this});
        } else {
            this.pauseCubeAnim = true;
        }
    }

    public void bindData(List<vnf> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9573b7f", new Object[]{this, list});
            return;
        }
        this.dataList = list;
        if (list.size() > 0) {
            List<vnf> list2 = this.dataList;
            list2.add(0, list2.get(list2.size() - 1));
            adapterImageViews(this.dataList.size());
            bindImageData(this.dataList);
            setOnClickListener(this.clickListener);
            this.tickHandler.b(new b());
            return;
        }
        v1.b(TAG, "bindData, no data");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        double d2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.startTime;
            double interpolation = this.interpolator.getInterpolation((((float) currentTimeMillis) * 1.0f) / ((float) this.duration));
            if (currentTimeMillis >= this.duration) {
                z = false;
            }
            this.isAnimating = z;
            if (this.pauseCubeAnim) {
                if (this.initial) {
                    d2 = vu3.b.GEO_NOT_SUPPORT;
                } else {
                    d2 = 1.0d;
                }
                drawCube(canvas, d2);
            } else {
                drawCube(canvas, interpolation);
                if (!this.initial && this.isAnimating) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } catch (Throwable th) {
            v1.b(TAG, "dispatchDraw, exception=" + th);
        }
    }

    public void setDuration(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b4c7", new Object[]{this, new Long(j)});
        } else {
            this.duration = j;
        }
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d61758ec", new Object[]{this, scaleType});
        } else {
            this.imageScaleType = scaleType;
        }
    }

    public void setPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f52579a", new Object[]{this, str});
        } else {
            this.pid = str;
        }
    }

    public void setTickInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d88a99", new Object[]{this, new Long(j)});
        } else {
            this.interval = j;
        }
    }

    public void stopTick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7109c6", new Object[]{this});
            return;
        }
        v1.b(TAG, "stopTick, currentIndex=" + this.currentIndex);
        resetImageAnimation();
        this.tickHandler.d();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1879e2a3", new Object[]{this});
                return;
            }
            try {
                v1.b("onTick", "onTick, pauseCubeAnim=" + CubeLayout.access$700(CubeLayout.this) + ", isTicking=" + d.a(CubeLayout.access$800(CubeLayout.this)));
                if (!CubeLayout.access$400(CubeLayout.this)) {
                    CubeLayout.access$308(CubeLayout.this);
                }
                v1.b(CubeLayout.TAG, "onTick, before currentIndex=" + CubeLayout.access$300(CubeLayout.this));
                CubeLayout.access$402(CubeLayout.this, false);
                if (CubeLayout.access$300(CubeLayout.this) >= CubeLayout.this.getChildCount() - 1) {
                    CubeLayout.access$302(CubeLayout.this, 0);
                }
                v1.b(CubeLayout.TAG, "onTick, after currentIndex=" + CubeLayout.access$300(CubeLayout.this));
                CubeLayout.access$1002(CubeLayout.this, System.currentTimeMillis());
                v1.b(CubeLayout.TAG, "onTick, set startTime");
                CubeLayout.this.invalidate();
            } catch (Throwable th) {
                v1.b(CubeLayout.TAG, "onTick, exception=" + th);
            }
        }
    }

    public CubeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        this.tickHandler.removeMessages(3);
        this.tickHandler.removeMessages(2);
        if (i == 0) {
            v1.b(TAG, "onWindowVisibilityChanged, visible");
            this.tickHandler.sendEmptyMessageDelayed(2, this.interval + 200);
            return;
        }
        v1.b(TAG, "onWindowVisibilityChanged, invisible");
        this.tickHandler.sendEmptyMessageDelayed(3, this.interval + 200);
    }

    public CubeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.tickHandler = new d(this, null);
        this.interpolator = new AccelerateDecelerateInterpolator();
        this.duration = 800L;
        this.interval = f51.DEF_MAX_ASYNC_SECONDS;
        this.currentIndex = 1;
        this.initial = true;
        this.pauseCubeAnim = true;
        this.imageScaleType = ImageView.ScaleType.CENTER_CROP;
        this.isAnimating = false;
        this.clickListener = new a();
        this.camera = new Camera();
        this.matrix = new Matrix();
        this.context = context;
        adapterImageViews(4);
    }

    public void startTick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af36626", new Object[]{this});
            return;
        }
        v1.b(TAG, "startTick, currentIndex=" + this.currentIndex);
        if (this.dataList.size() > 1) {
            this.pauseCubeAnim = false;
            this.tickHandler.c();
        }
    }
}
