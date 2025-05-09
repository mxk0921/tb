package tb;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import com.taobao.android.fluid.common.view.VideoRoundCornerLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yfo extends gr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String h = "RootLayer";
    private static final String i = "RootLayer";
    private final prp e;
    private ViewGroup f;
    private VideoRoundCornerLayout g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements la2<String, BitmapDrawable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: b */
        public void a(String str, BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7626bc8", new Object[]{this, str, bitmapDrawable});
                return;
            }
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null) {
                ((FscrmidFavorFrameLayout) yfo.P(yfo.this).f0().itemView).setBitmap(bitmap);
            }
        }
    }

    static {
        t2o.a(468714010);
    }

    public yfo(FluidContext fluidContext, prp prpVar) {
        super(fluidContext, prpVar);
        this.e = prpVar;
    }

    public static /* synthetic */ prp P(yfo yfoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (prp) ipChange.ipc$dispatch("851f6d90", new Object[]{yfoVar});
        }
        return yfoVar.e;
    }

    public static /* synthetic */ Object ipc$super(yfo yfoVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 610311722) {
            super.onBindData((uq9) objArr[0], (com.taobao.android.fluid.framework.data.datamodel.a) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 2063982600) {
            super.onCreateView((uq9) objArr[0], (RecyclerViewHolder) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/framework/card/cards/video/layer/root/RootLayer");
        }
    }

    @Override // tb.ojc
    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17e2e1f3", new Object[]{this});
        }
        return "RootLayer";
    }

    public VideoRoundCornerLayout Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoRoundCornerLayout) ipChange.ipc$dispatch("f3dbb890", new Object[]{this});
        }
        return this.g;
    }

    public ViewGroup R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("16e79720", new Object[]{this});
        }
        return this.f;
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155897d9", new Object[]{this});
        } else if (this.e.G1().c() != null) {
            VideoRoundCornerLayout videoRoundCornerLayout = this.g;
            this.e.G1().c().getClass();
            videoRoundCornerLayout.setPadding(0, 0, 0, 0);
        }
    }

    public void T(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210b373b", new Object[]{this, view, new Boolean(z)});
        } else if (z) {
            this.g.removeView(view);
        }
    }

    public void U(VideoRoundCornerLayout videoRoundCornerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89adb36e", new Object[]{this, videoRoundCornerLayout});
        } else {
            this.g = videoRoundCornerLayout;
        }
    }

    public void V(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7967a0", new Object[]{this, viewGroup});
        } else {
            this.f = viewGroup;
        }
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i2)});
            return;
        }
        super.onBindData(uq9Var, aVar, i2);
        if (this.e.W() instanceof FscrmidFavorFrameLayout) {
            ((FscrmidFavorFrameLayout) this.e.W()).setEnableDoubleEvent(this.e.j0());
        }
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
            return;
        }
        super.onCreateView(uq9Var, recyclerViewHolder);
        FrameLayout frameLayout = (FrameLayout) this.e.W();
        this.f = frameLayout;
        this.g = (VideoRoundCornerLayout) frameLayout.findViewById(R.id.video_host);
        String str = ((IDataService) this.e.U().getService(IDataService.class)).getConfig().j().j;
        if (!TextUtils.isEmpty(str)) {
            FluidSDK.getImageAdapter().load(str, new a());
        }
    }
}
