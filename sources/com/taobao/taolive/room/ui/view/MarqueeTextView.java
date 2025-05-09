package com.taobao.taolive.room.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Choreographer;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MarqueeTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = MarqueeTextView.class.getSimpleName();
    private a mMarquee;
    private b mMarqueeCompleteListener;
    private int mMarqueeRepeatLimit;
    private int mOriginTextWidth;
    private int mParentWidth;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<MarqueeTextView> f13251a;
        public final float d;
        public float e;
        public float f;
        public float g;
        public int h;
        public float i;
        public long j;
        public byte c = 0;
        public final Choreographer.FrameCallback k = new Choreographer$FrameCallbackC0756a();
        public final Choreographer.FrameCallback l = new b();
        public final Choreographer.FrameCallback m = new c();
        public final Choreographer b = Choreographer.getInstance();

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taolive.room.ui.view.MarqueeTextView$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class Choreographer$FrameCallbackC0756a implements Choreographer.FrameCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public Choreographer$FrameCallbackC0756a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                } else {
                    a.this.m();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class b implements Choreographer.FrameCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                    return;
                }
                a.b(a.this, (byte) 2);
                a.c(a.this, System.currentTimeMillis());
                a.this.m();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class c implements Choreographer.FrameCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public c() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                } else if (a.a(a.this) == 2) {
                    if (a.d(a.this) >= 0) {
                        a.e(a.this);
                    }
                    a aVar = a.this;
                    aVar.k(a.d(aVar));
                }
            }
        }

        static {
            t2o.a(806355826);
        }

        public a(MarqueeTextView marqueeTextView) {
            this.d = (marqueeTextView.getContext().getResources().getDisplayMetrics().density * 50.0f) / 1000.0f;
            this.f13251a = new WeakReference<>(marqueeTextView);
        }

        public static /* synthetic */ byte a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2d9f3644", new Object[]{aVar})).byteValue();
            }
            return aVar.c;
        }

        public static /* synthetic */ byte b(a aVar, byte b2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("68eb0c52", new Object[]{aVar, new Byte(b2)})).byteValue();
            }
            aVar.c = b2;
            return b2;
        }

        public static /* synthetic */ long c(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4c16dda3", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.j = j;
            return j;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9f5ff789", new Object[]{aVar})).intValue();
            }
            return aVar.h;
        }

        public static /* synthetic */ int e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("90b1870a", new Object[]{aVar})).intValue();
            }
            int i = aVar.h;
            aVar.h = i - 1;
            return i;
        }

        public float f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("74e5d943", new Object[]{this})).floatValue();
            }
            return this.g;
        }

        public float g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f221f4ba", new Object[]{this})).floatValue();
            }
            return this.i;
        }

        public boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
            }
            if (this.c == 2) {
                return true;
            }
            return false;
        }

        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("407c1f83", new Object[]{this});
                return;
            }
            this.i = 0.0f;
            MarqueeTextView marqueeTextView = this.f13251a.get();
            if (marqueeTextView != null) {
                marqueeTextView.invalidate();
            }
        }

        public boolean j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4105e3c3", new Object[]{this})).booleanValue();
            }
            if (this.c != 2 || this.i <= this.f) {
                return false;
            }
            return true;
        }

        public void k(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f66283a", new Object[]{this, new Integer(i)});
            } else if (i == 0) {
                l();
                MarqueeTextView marqueeTextView = this.f13251a.get();
                if (marqueeTextView != null && MarqueeTextView.access$300(marqueeTextView) != null) {
                    MarqueeTextView.access$300(marqueeTextView).a();
                }
            } else {
                this.h = i;
                MarqueeTextView marqueeTextView2 = this.f13251a.get();
                if (marqueeTextView2 != null) {
                    this.c = (byte) 1;
                    this.i = 0.0f;
                    float access$400 = MarqueeTextView.access$400(marqueeTextView2);
                    float access$500 = MarqueeTextView.access$500(marqueeTextView2) / 3.0f;
                    float access$5002 = (access$400 - MarqueeTextView.access$500(marqueeTextView2)) + access$500;
                    this.f = access$5002;
                    this.e = access$5002 + MarqueeTextView.access$500(marqueeTextView2);
                    this.g = access$400 + access$500;
                    MarqueeTextView.access$500(marqueeTextView2);
                    marqueeTextView2.invalidate();
                    this.b.postFrameCallbackDelayed(this.l, 1500L);
                }
            }
        }

        public void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6623bb89", new Object[]{this});
                return;
            }
            this.c = (byte) 0;
            this.b.removeFrameCallback(this.l);
            this.b.removeFrameCallback(this.m);
            this.b.removeFrameCallback(this.k);
            i();
        }

        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("735fbfa4", new Object[]{this});
            } else if (this.c == 2) {
                this.b.removeFrameCallback(this.k);
                MarqueeTextView marqueeTextView = this.f13251a.get();
                if (marqueeTextView != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.j = currentTimeMillis;
                    float f = this.i + (((float) (currentTimeMillis - this.j)) * this.d);
                    this.i = f;
                    float f2 = this.e;
                    if (f > f2) {
                        this.i = f2;
                        this.b.postFrameCallbackDelayed(this.m, 1200L);
                    } else {
                        this.b.postFrameCallback(this.k);
                    }
                    marqueeTextView.invalidate();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a();
    }

    static {
        t2o.a(806355825);
    }

    public MarqueeTextView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ b access$300(MarqueeTextView marqueeTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c350e342", new Object[]{marqueeTextView});
        }
        return marqueeTextView.mMarqueeCompleteListener;
    }

    public static /* synthetic */ int access$400(MarqueeTextView marqueeTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75742154", new Object[]{marqueeTextView})).intValue();
        }
        return marqueeTextView.mOriginTextWidth;
    }

    public static /* synthetic */ int access$500(MarqueeTextView marqueeTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76aa7433", new Object[]{marqueeTextView})).intValue();
        }
        return marqueeTextView.mParentWidth;
    }

    public static /* synthetic */ Object ipc$super(MarqueeTextView marqueeTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 358241672) {
            super.setText((CharSequence) objArr[0], (TextView.BufferType) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/ui/view/MarqueeTextView");
        }
    }

    public int getTextWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca9d78dd", new Object[]{this})).intValue();
        }
        return this.mOriginTextWidth;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        a aVar = this.mMarquee;
        if (aVar != null && aVar.h()) {
            canvas.translate(-this.mMarquee.g(), 0.0f);
        }
        super.onDraw(canvas);
        a aVar2 = this.mMarquee;
        if (aVar2 != null && aVar2.j()) {
            canvas.translate(this.mMarquee.f(), 0.0f);
            super.onDraw(canvas);
        }
    }

    public boolean outOfBounds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21516065", new Object[]{this})).booleanValue();
        }
        if (getTextWidth() >= this.mParentWidth) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView
    public void setMarqueeRepeatLimit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca849fc", new Object[]{this, new Integer(i)});
        } else {
            this.mMarqueeRepeatLimit = i;
        }
    }

    public void setOnMarqueeCompleteListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46d23c7b", new Object[]{this, bVar});
        } else {
            this.mMarqueeCompleteListener = bVar;
        }
    }

    public void setParentWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91979222", new Object[]{this, new Integer(i)});
            return;
        }
        String str = TAG;
        Log.e(str, "parentWidth = " + i);
        this.mParentWidth = i;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155a5588", new Object[]{this, charSequence, bufferType});
            return;
        }
        super.setText(charSequence, bufferType);
        this.mOriginTextWidth = (int) getPaint().measureText(getText().toString());
    }

    public void startScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75254ad6", new Object[]{this});
            return;
        }
        if (this.mMarquee == null) {
            this.mMarquee = new a(this);
        }
        this.mMarquee.k(this.mMarqueeRepeatLimit);
    }

    public void stopScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec88676", new Object[]{this});
            return;
        }
        a aVar = this.mMarquee;
        if (aVar != null) {
            aVar.l();
        }
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMarqueeRepeatLimit = 2;
    }
}
