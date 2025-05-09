package com.taobao.android.detail.aligallery;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.container.GalleryCore;
import tb.b5m;
import tb.fos;
import tb.h0o;
import tb.pog;
import tb.quk;
import tb.sx9;
import tb.t2o;
import tb.xuk;
import tb.yc4;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliGalleryContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AliGalleryContainer";
    private fos mContainer;
    private Context mContext;
    private volatile String mCurrentPropPath;
    private GalleryCore.l mFrameSelectListener;
    private boolean mIsRendered;
    private fos.c mOnReceiveShareMessage;
    private xuk mPropPathSelectedListener;
    private h0o mRenderListener;
    private quk mShareListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements GalleryCore.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.detail.ttdetail.container.GalleryCore.l
        public void a(sx9 sx9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5be11d1", new Object[]{this, sx9Var});
                return;
            }
            if (AliGalleryContainer.access$000(AliGalleryContainer.this) != null && !AliGalleryContainer.access$100(AliGalleryContainer.this)) {
                AliGalleryContainer.access$000(AliGalleryContainer.this).a();
                AliGalleryContainer.access$102(AliGalleryContainer.this, true);
            }
            if (AliGalleryContainer.access$200(AliGalleryContainer.this) != null) {
                AliGalleryContainer.access$200(AliGalleryContainer.this).a(yc4.l(sx9Var));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements fos.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(pog pogVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cff69959", new Object[]{this, pogVar});
            } else if (AliGalleryContainer.access$300(AliGalleryContainer.this) != null) {
                AliGalleryContainer.access$300(AliGalleryContainer.this).a(pogVar.a(), pogVar.b());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AliGalleryContainer.access$500(AliGalleryContainer.this).C(AliGalleryContainer.access$400(AliGalleryContainer.this));
            }
        }
    }

    static {
        t2o.a(353370113);
    }

    public AliGalleryContainer(Context context, String str) {
        this(context, str, null);
    }

    public static /* synthetic */ h0o access$000(AliGalleryContainer aliGalleryContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h0o) ipChange.ipc$dispatch("22374da1", new Object[]{aliGalleryContainer});
        }
        return aliGalleryContainer.mRenderListener;
    }

    public static /* synthetic */ boolean access$100(AliGalleryContainer aliGalleryContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f98454ae", new Object[]{aliGalleryContainer})).booleanValue();
        }
        return aliGalleryContainer.mIsRendered;
    }

    public static /* synthetic */ boolean access$102(AliGalleryContainer aliGalleryContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33c8fb2c", new Object[]{aliGalleryContainer, new Boolean(z)})).booleanValue();
        }
        aliGalleryContainer.mIsRendered = z;
        return z;
    }

    public static /* synthetic */ xuk access$200(AliGalleryContainer aliGalleryContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xuk) ipChange.ipc$dispatch("8c0c84e7", new Object[]{aliGalleryContainer});
        }
        return aliGalleryContainer.mPropPathSelectedListener;
    }

    public static /* synthetic */ quk access$300(AliGalleryContainer aliGalleryContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (quk) ipChange.ipc$dispatch("36a0d125", new Object[]{aliGalleryContainer});
        }
        return aliGalleryContainer.mShareListener;
    }

    public static /* synthetic */ String access$400(AliGalleryContainer aliGalleryContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb5c8793", new Object[]{aliGalleryContainer});
        }
        return aliGalleryContainer.mCurrentPropPath;
    }

    public static /* synthetic */ fos access$500(AliGalleryContainer aliGalleryContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fos) ipChange.ipc$dispatch("bbc2d8dd", new Object[]{aliGalleryContainer});
        }
        return aliGalleryContainer.mContainer;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.mContainer.g();
        }
    }

    public ze7 getDetailContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("ee649aeb", new Object[]{this});
        }
        return this.mContainer.h();
    }

    public View getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.mContainer.q();
    }

    public void pagePause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e7ae6", new Object[]{this, new Boolean(z)});
        } else {
            this.mContainer.u(z);
        }
    }

    public void pageResume(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b47111", new Object[]{this, new Boolean(z)});
        } else {
            this.mContainer.v(z);
        }
    }

    public void scrollToFrameWithPropPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9637024", new Object[]{this, str});
        } else if (!TextUtils.equals(this.mCurrentPropPath, str)) {
            this.mCurrentPropPath = str;
            this.mContainer.h().h().g(new c());
        }
    }

    public void setFixContainerRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("572812fc", new Object[]{this, new Float(f)});
        } else {
            this.mContainer.A(f);
        }
    }

    public void setFixContainerRatioPercent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908bb2d1", new Object[]{this, new Float(f)});
        } else {
            this.mContainer.B(1.0f - f);
        }
    }

    public void setFloatAnimationContainer(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7761255d", new Object[]{this, viewGroup});
        } else {
            this.mContainer.k(viewGroup);
        }
    }

    public void setMiniVideoContainer(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f549c5", new Object[]{this, viewGroup});
        } else {
            this.mContainer.l(viewGroup);
        }
    }

    public void setMtopData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463f33b5", new Object[]{this, jSONObject});
            return;
        }
        this.mIsRendered = false;
        this.mContainer.F(jSONObject);
        this.mContainer.t();
    }

    public void setOnShareListener(quk qukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ddab54", new Object[]{this, qukVar});
        } else {
            this.mShareListener = qukVar;
        }
    }

    public void setOnSkuPropPathSelectedListener(xuk xukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3145836", new Object[]{this, xukVar});
        } else {
            this.mPropPathSelectedListener = xukVar;
        }
    }

    public void setPagerMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c04418", new Object[]{this, new Integer(i)});
        } else {
            this.mContainer.H(i);
        }
    }

    public void setRenderListener(h0o h0oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d26535", new Object[]{this, h0oVar});
        } else {
            this.mRenderListener = h0oVar;
        }
    }

    public void updateLightOffPriceInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b4e426", new Object[]{this, str});
        } else {
            this.mContainer.K(str);
        }
    }

    public AliGalleryContainer(Context context, String str, ze7 ze7Var) {
        this.mIsRendered = false;
        this.mCurrentPropPath = "";
        this.mFrameSelectListener = new a();
        this.mOnReceiveShareMessage = new b();
        b5m.x();
        this.mContext = context;
        fos fosVar = new fos(context, str, ze7Var);
        this.mContainer = fosVar;
        fosVar.E(this.mFrameSelectListener);
        this.mContainer.G(this.mOnReceiveShareMessage);
    }
}
