package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ye5 extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final long DXCIMAGEVIEW_CIMAGEVIEW = -4918577452540213301L;
    public static final long DXCIMAGEVIEW_TINTCOLOR = 8066154466404784583L;

    /* renamed from: a  reason: collision with root package name */
    public String f32016a;
    public DXImageWidgetNode.g b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552731);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new ye5();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        static {
            t2o.a(918552732);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements DXImageWidgetNode.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXImageWidgetNode.f f32017a;
        public final /* synthetic */ ye5 b;

        public c(DXImageWidgetNode.f fVar, ye5 ye5Var) {
            this.f32017a = fVar;
            this.b = ye5Var;
        }

        @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.f
        public final boolean a(DXImageWidgetNode.h hVar) {
            Drawable drawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b4cb7e72", new Object[]{this, hVar})).booleanValue();
            }
            if (hVar != null) {
                drawable = hVar.f7370a;
            } else {
                drawable = null;
            }
            if (!(ye5.t(this.b) == null || drawable == null)) {
                DrawableCompat.setTint(drawable, Color.parseColor(ye5.t(this.b)));
            }
            DXImageWidgetNode.f fVar = this.f32017a;
            if (fVar != null) {
                return fVar.a(hVar);
            }
            return true;
        }
    }

    static {
        t2o.a(918552730);
    }

    public static /* synthetic */ Object ipc$super(ye5 ye5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2081077133:
                return super.buildSimpleImageOption();
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/dx/DXCImageViewWidgetNode");
        }
    }

    public static final /* synthetic */ String t(ye5 ye5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41f656c8", new Object[]{ye5Var});
        }
        return ye5Var.f32016a;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new ye5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode
    public DXImageWidgetNode.g buildSimpleImageOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXImageWidgetNode.g) ipChange.ipc$dispatch("7c0ab78d", new Object[]{this});
        }
        DXImageWidgetNode.g buildSimpleImageOption = super.buildSimpleImageOption();
        this.b = buildSimpleImageOption;
        ckf.f(buildSimpleImageOption, "imageOption");
        return buildSimpleImageOption;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        ckf.g(context, "context");
        ckf.g(view, "weakView");
        super.onBindEvent(context, view, j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        ckf.g(dXWidgetNode, "widgetNode");
        if (dXWidgetNode instanceof ye5) {
            super.onClone(dXWidgetNode, z);
            this.f32016a = ((ye5) dXWidgetNode).f32016a;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        View onCreateView = super.onCreateView(context);
        ckf.f(onCreateView, "super.onCreateView(context)");
        return onCreateView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        Drawable drawable;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ckf.g(context, "context");
        ckf.g(view, "weakView");
        super.onRenderView(context, view);
        DXImageWidgetNode.g gVar = this.b;
        if (gVar != null) {
            gVar.k = new c(gVar.k, this);
        }
        if ((view instanceof ImageView) && (drawable = ((ImageView) view).getDrawable()) != null && (str = this.f32016a) != null) {
            DrawableCompat.setTint(drawable, Color.parseColor(str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        ckf.g(str, "attr");
        if (j == DXCIMAGEVIEW_TINTCOLOR) {
            this.f32016a = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }
}
