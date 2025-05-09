package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.uikit.feature.features.RoundRectShapeFeature;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zpa extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHIMAGEVIEW_FILTERTYPE = -7195088064603432654L;
    public static final long H_IMAGE_VIEW = 1202423593942681808L;
    public static final long H_IMAGE_VIEW_AUTO_RELEASE = -2989625047271068027L;

    /* renamed from: a  reason: collision with root package name */
    public boolean f32928a = !vxl.f();
    public int b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729809075);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new zpa();
        }
    }

    static {
        t2o.a(729809074);
    }

    public static /* synthetic */ Object ipc$super(zpa zpaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/homepage/dinamic3/widgetnode/HImageWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new zpa();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof zpa) {
            zpa zpaVar = (zpa) dXWidgetNode;
            this.b = zpaVar.b;
            this.f32928a = zpaVar.f32928a;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new HImageView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view instanceof HImageView) {
            HImageView hImageView = (HImageView) view;
            p2b.r(hImageView, getImageUrl(), "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG, getDXRuntimeContext().p());
            setImageScaleType(hImageView, getScaleType());
            hImageView.setAutoRelease(this.f32928a);
            if (isNeedSetBackground()) {
                int cornerRadius = getCornerRadius();
                u(hImageView, getCornerRadius() > 0 ? new int[]{cornerRadius, cornerRadius, cornerRadius, cornerRadius} : new int[]{getCornerRadiusLeftTop(), getCornerRadiusRightTop(), getCornerRadiusRightBottom(), getCornerRadiusLeftBottom()});
            }
            try {
                int drawableId = DXImageWidgetNode.getDrawableId(context, getPlaceHolderName());
                if (drawableId != 0) {
                    hImageView.setPlaceHoldForeground(context.getResources().getDrawable(drawableId));
                } else {
                    hImageView.setPlaceHoldForeground(null);
                }
            } catch (Throwable unused) {
                hImageView.setPlaceHoldForeground(null);
            }
            t(hImageView);
            lle.b(hImageView, this.b);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (-2989625047271068027L == j) {
            if (i != 1) {
                z = false;
            }
            this.f32928a = z;
        } else if (-7195088064603432654L == j) {
            this.b = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    public final void t(HImageView hImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bddbda4e", new Object[]{this, hImageView});
        } else if (!TextUtils.isEmpty(getImageUrl())) {
            if (!p2b.k()) {
                hImageView.preRender(true);
            }
            hImageView.setImageUrl(getImageUrl());
        } else if (getLocalImageDrawable() != null) {
            setLocalImage(hImageView, getLocalImageDrawable());
        } else if (!TextUtils.isEmpty(getImageName())) {
            setLocalRes(hImageView, getImageName());
        } else {
            hImageView.setImageUrl(null);
        }
    }

    public final void u(HImageView hImageView, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96798355", new Object[]{this, hImageView, iArr});
            return;
        }
        RoundRectShapeFeature roundRectShapeFeature = (RoundRectShapeFeature) hImageView.findFeature(RoundRectShapeFeature.class);
        if (iArr[0] > 0 || iArr[1] > 0 || iArr[2] > 0 || iArr[3] > 0) {
            if (roundRectShapeFeature == null) {
                roundRectShapeFeature = new RoundRectShapeFeature();
                hImageView.addFeature(roundRectShapeFeature);
            }
            roundRectShapeFeature.setCornerRadius(iArr[0], iArr[1], iArr[2], iArr[3]);
        } else if (roundRectShapeFeature != null) {
            hImageView.removeFeature(RoundRectShapeFeature.class);
        }
    }
}
