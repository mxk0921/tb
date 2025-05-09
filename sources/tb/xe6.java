package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xe6 extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final long f31330a = 1756289496339923034L;
    public final long b = 4951885508200836195L;
    public String c;
    public String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b6d7e636", new Object[]{this})).longValue();
            }
            return xe6.a();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static final /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("189ea8b1", new Object[0])).longValue();
        }
        return -5605490048558005197L;
    }

    public static /* synthetic */ Object ipc$super(xe6 xe6Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1115049375) {
            super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
            return null;
        } else if (hashCode == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/detail/rate/vivid/dinamicX/view/DXTBVideoViewDowngradeToImageWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new xe6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        ckf.g(dXWidgetNode, "widgetNode");
        if (dXWidgetNode instanceof xe6) {
            super.onClone(dXWidgetNode, z);
            xe6 xe6Var = (xe6) dXWidgetNode;
            this.c = xe6Var.c;
            this.d = xe6Var.d;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        View tUrlImageView = new TUrlImageView(context);
        TUrlImageView tUrlImageView2 = new TUrlImageView(context);
        tUrlImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(tUrlImageView);
        int f = pb6.f(context, 54.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(f, f);
        layoutParams.gravity = 17;
        tUrlImageView2.setLayoutParams(layoutParams);
        frameLayout.addView(tUrlImageView2);
        return frameLayout;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            View childAt = frameLayout.getChildAt(0);
            TUrlImageView tUrlImageView = null;
            if (!(childAt instanceof TUrlImageView)) {
                childAt = null;
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) childAt;
            if (tUrlImageView2 != null) {
                setImageScaleType(tUrlImageView2, getScaleType());
                tUrlImageView2.setImageUrl(this.c);
            }
            View childAt2 = frameLayout.getChildAt(1);
            if (childAt2 instanceof TUrlImageView) {
                tUrlImageView = childAt2;
            }
            TUrlImageView tUrlImageView3 = tUrlImageView;
            if (tUrlImageView3 != null) {
                tUrlImageView3.setImageUrl(this.d);
            }
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
        if (j == this.f31330a) {
            this.c = str;
        } else if (j == this.b) {
            this.d = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }
}
