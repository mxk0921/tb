package com.taobao.infoflow.ad.impl.dx.view.flip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.infoflow.ad.impl.dx.view.flip.CropImageView;
import com.taobao.infoflow.ad.impl.dx.view.flip.FlipView;
import java.util.List;
import tb.dcj;
import tb.f51;
import tb.svv;
import tb.v1;
import tb.vnf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FlipLayout extends LinearLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FlipLayout";
    private CropImageView bottomBaseView;
    private FlipView.c bottomFlipListener;
    private FlipView bottomFlipView;
    private boolean canTick;
    private int currentIndex;
    private long duration;
    private long interval;
    private List<vnf> itemList;
    private String pid;
    private CropImageView topBaseView;
    private FlipView.c topFlipListener;
    private FlipView topFlipView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements FlipView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.ad.impl.dx.view.flip.FlipView.c
        public void a(FlipView.TYPE type) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5c4c549", new Object[]{this, type});
                return;
            }
            v1.b(FlipLayout.TAG, "topFlipEnd: type=" + type);
            if (type == FlipView.TYPE.TOP) {
                FlipLayout.access$000(FlipLayout.this).start(0L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements FlipView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.ad.impl.dx.view.flip.FlipView.c
        public void a(FlipView.TYPE type) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5c4c549", new Object[]{this, type});
                return;
            }
            v1.b(FlipLayout.TAG, "bottomFlipEnd: type=" + type);
            FlipLayout.access$100(FlipLayout.this);
            FlipLayout.access$200(FlipLayout.this);
            FlipLayout.access$300(FlipLayout.this);
        }
    }

    public FlipLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ FlipView access$000(FlipLayout flipLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlipView) ipChange.ipc$dispatch("c8c7caf2", new Object[]{flipLayout});
        }
        return flipLayout.bottomFlipView;
    }

    public static /* synthetic */ void access$100(FlipLayout flipLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9b482", new Object[]{flipLayout});
        } else {
            flipLayout.bindNextData();
        }
    }

    public static /* synthetic */ void access$200(FlipLayout flipLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd7fe1", new Object[]{flipLayout});
        } else {
            flipLayout.resetFlipView();
        }
    }

    public static /* synthetic */ void access$300(FlipLayout flipLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d14b40", new Object[]{flipLayout});
        } else {
            flipLayout.tick();
        }
    }

    private void bindNextData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a385e021", new Object[]{this});
            return;
        }
        vnf vnfVar = this.itemList.get(this.currentIndex);
        this.topFlipView.getContentView().setImageUrl(vnfVar.f30125a);
        this.bottomBaseView.setImageUrl(vnfVar.f30125a);
        int nextIndex = getNextIndex();
        vnf vnfVar2 = this.itemList.get(nextIndex);
        this.topBaseView.setImageUrl(vnfVar2.f30125a);
        this.bottomFlipView.getContentView().setImageUrl(vnfVar2.f30125a);
        this.currentIndex = nextIndex;
    }

    private int getNextIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67be6e3", new Object[]{this})).intValue();
        }
        return getRealIndex(this.currentIndex + 1);
    }

    private int getPrevIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2320f7a3", new Object[]{this})).intValue();
        }
        int i = this.currentIndex - 1;
        if (i < 0) {
            return this.itemList.size() - 1;
        }
        return i;
    }

    private int getRealIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f85d1ef1", new Object[]{this, new Integer(i)})).intValue();
        }
        return i % this.itemList.size();
    }

    public static /* synthetic */ Object ipc$super(FlipLayout flipLayout, String str, Object... objArr) {
        if (str.hashCode() == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/view/flip/FlipLayout");
    }

    private boolean isFlipping() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa5a32b4", new Object[]{this})).booleanValue();
        }
        if (this.topFlipView.isFlipping() || this.bottomFlipView.isFlipping()) {
            return true;
        }
        return false;
    }

    private void resetFlipView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdcf7f28", new Object[]{this});
            return;
        }
        this.topFlipView.reset();
        this.bottomFlipView.reset();
    }

    private void tick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735fbfa4", new Object[]{this});
        } else if (!this.canTick) {
            v1.b(TAG, "tick: canTick=false");
            stop();
        } else {
            this.topFlipView.start(this.interval);
            this.topFlipView.setListener(this.topFlipListener);
            this.bottomFlipView.setListener(this.bottomFlipListener);
        }
    }

    public void bindData(List<vnf> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9573b7f", new Object[]{this, list});
            return;
        }
        this.itemList = list;
        this.currentIndex = 0;
        this.topFlipView.setDuration(this.duration);
        this.bottomFlipView.setDuration(this.duration);
        resetFlipView();
        bindNextData();
        start();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int prevIndex = getPrevIndex();
        v1.b(TAG, "currentIndex=" + prevIndex);
        vnf vnfVar = this.itemList.get(prevIndex);
        v1.b(TAG, "onClick: pid=" + this.pid + ", clickItem=" + vnfVar);
        Nav.from(getContext()).toUri(vnfVar.b);
        svv.a(vnfVar.c);
        dcj.d(this.pid, vnfVar.c);
    }

    public void setDuration(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b4c7", new Object[]{this, new Long(j)});
        } else {
            this.duration = j;
        }
    }

    public void setInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af436", new Object[]{this, new Long(j)});
        } else {
            this.interval = j;
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

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (isFlipping()) {
            v1.b(TAG, "start: isFlipping");
        } else {
            v1.b(TAG, "start");
            tick();
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        v1.b(TAG, "stop");
        this.topFlipView.stop();
        this.bottomFlipView.stop();
        resetFlipView();
    }

    public FlipLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlipLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.duration = 400L;
        this.interval = f51.DEF_MAX_ASYNC_SECONDS;
        this.canTick = true;
        this.topFlipListener = new a();
        this.bottomFlipListener = new b();
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        CropImageView cropImageView = new CropImageView(context);
        this.topBaseView = cropImageView;
        cropImageView.setCropType(CropImageView.CropType.TOP);
        frameLayout.addView(this.topBaseView);
        FlipView flipView = new FlipView(context);
        this.topFlipView = flipView;
        flipView.init(FlipView.TYPE.TOP, new CropImageView(context));
        frameLayout.addView(this.topFlipView);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(frameLayout, layoutParams);
        FrameLayout frameLayout2 = new FrameLayout(context);
        CropImageView cropImageView2 = new CropImageView(context);
        this.bottomBaseView = cropImageView2;
        cropImageView2.setCropType(CropImageView.CropType.BOTTOM);
        frameLayout2.addView(this.bottomBaseView);
        FlipView flipView2 = new FlipView(context);
        this.bottomFlipView = flipView2;
        flipView2.init(FlipView.TYPE.BOTTOM, new CropImageView(context));
        frameLayout2.addView(this.bottomFlipView);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.weight = 1.0f;
        addView(frameLayout2, layoutParams2);
        setOnClickListener(this);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        v1.b(TAG, "onVisibilityChanged: visibility=" + i);
        if (i != 0) {
            z = false;
        }
        this.canTick = z;
    }
}
