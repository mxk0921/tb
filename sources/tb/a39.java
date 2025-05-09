package tb;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.nwb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a39 extends dz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TBLiveDataModel c;
    public FrameLayout d;
    public boolean k = false;
    public JSONObject l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements nwb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.nwb.a
        public void a(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be61b808", new Object[]{this, dXRootView});
            } else if (dXRootView != null && a39.c(a39.this) != null) {
                a39.d(a39.this).removeAllViews();
                a39.d(a39.this).addView(dXRootView);
                giv.b().renderDX(dXRootView, (JSONObject) fkx.h(a39.c(a39.this).mVideoInfo));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements nwb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.nwb.a
        public void a(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be61b808", new Object[]{this, dXRootView});
            } else if (dXRootView != null && a39.f(a39.this) != null) {
                a39.d(a39.this).removeAllViews();
                a39.d(a39.this).addView(dXRootView);
                giv.b().renderDX(dXRootView, a39.f(a39.this));
            }
        }
    }

    static {
        t2o.a(295700040);
    }

    public a39(Context context, TBLiveDataModel tBLiveDataModel, boolean z) {
        super(context, gq0.k().a(), z);
        this.c = tBLiveDataModel;
        try {
            if (getWindow() != null) {
                getWindow().setWindowAnimations(R.style.TL_Topbar_FavoriteGuideDialog_Anim_flexalocal);
            }
        } catch (Throwable th) {
            o3s.b("FavoriteGuideDialog", "FavoriteGuideDialog e: " + th.getMessage());
        }
        if (getWindow() != null) {
            getWindow().setDimAmount(0.0f);
        }
    }

    public static /* synthetic */ TBLiveDataModel c(a39 a39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveDataModel) ipChange.ipc$dispatch("465bd4a0", new Object[]{a39Var});
        }
        return a39Var.c;
    }

    public static /* synthetic */ FrameLayout d(a39 a39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("33194049", new Object[]{a39Var});
        }
        return a39Var.d;
    }

    public static /* synthetic */ JSONObject f(a39 a39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b9f395f1", new Object[]{a39Var});
        }
        return a39Var.l;
    }

    public static /* synthetic */ Object ipc$super(a39 a39Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/topbar/follow/view/FavoriteGuideDialog");
        }
    }

    @Override // tb.dz1
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a20e10cc", new Object[]{this});
        }
        return LayoutInflater.from(this.f18168a).inflate(R.layout.taolive_topbar_favorete_guide_layout_flexalocal, (ViewGroup) null);
    }

    @Override // tb.dz1
    public WindowManager.LayoutParams b(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("c9bf7551", new Object[]{this, displayMetrics});
        }
        if (getWindow() == null) {
            return null;
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (this.b && attributes != null) {
            attributes.gravity = 85;
            attributes.width = displayMetrics.heightPixels;
            attributes.height = -2;
            return attributes;
        } else if (attributes == null) {
            return attributes;
        } else {
            attributes.gravity = 83;
            attributes.width = displayMetrics.widthPixels;
            return attributes;
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c063b76", new Object[]{this});
        } else {
            giv.b().a(this.f18168a, "taobaolive_room_favorite_guide", new a());
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574d592c", new Object[]{this});
        } else {
            giv.b().a(this.f18168a, "taobaolive_room_highlight_comment_guide_v3", new b());
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40792ba0", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb15909", new Object[]{this, jSONObject});
        } else {
            this.l = jSONObject;
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.d = (FrameLayout) findViewById(R.id.dialog_container);
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        if (!qjy.a() || !this.k) {
            e();
        } else {
            k();
        }
        super.show();
    }
}
