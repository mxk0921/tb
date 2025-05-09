package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.ImageShapeFeature;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ekx extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMGIFIMAGEVIEW_ANIMATED = 1166125168016292427L;
    public static final long DX_MGIFIMAGEVIEW = -7545546413749780562L;
    public static final long DX_MGIFIMAGEVIEW_MIMAGEURL = 1686114214726413708L;
    public static final long DX_MGIFIMAGEVIEW_MSCALETYPE = -1599028387311197695L;
    public String b;

    /* renamed from: a  reason: collision with root package name */
    public int f18651a = 1;
    public boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(745538113);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new ekx();
        }
    }

    static {
        t2o.a(745538112);
    }

    public static /* synthetic */ Object ipc$super(ekx ekxVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1115049375) {
            super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
            return null;
        } else if (hashCode == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/ultron/dinamicX/widget/XGIFImageViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new ekx();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof ekx) {
            ekx ekxVar = (ekx) dXWidgetNode;
            this.b = ekxVar.b;
            this.f18651a = ekxVar.f18651a;
            this.c = ekxVar.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        s32.c().i("XGIFImageViewWidgetNode.onCreateView");
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setAutoRelease(false);
        return tUrlImageView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view != null) {
            TUrlImageView tUrlImageView = (TUrlImageView) view;
            int i = this.f18651a;
            if (i == 0) {
                tUrlImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (i == 2) {
                tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            if (!TextUtils.isEmpty(this.b)) {
                try {
                    if (this.c) {
                        tUrlImageView.setSkipAutoSize(true);
                    } else {
                        tUrlImageView.setSkipAutoSize(false);
                        t(tUrlImageView);
                    }
                    sgj.e(tUrlImageView, this.b);
                } catch (Throwable unused) {
                }
            } else {
                tUrlImageView.setImageUrl(null);
                t(tUrlImageView);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXMGIFIMAGEVIEW_ANIMATED) {
            if (i == 0) {
                z = false;
            }
            this.c = z;
        } else if (j == DX_MGIFIMAGEVIEW_MSCALETYPE) {
            this.f18651a = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DX_MGIFIMAGEVIEW_MIMAGEURL) {
            this.b = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void t(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11c234bb", new Object[]{this, tUrlImageView});
            return;
        }
        int cornerRadius = getCornerRadius();
        int cornerRadiusRightTop = getCornerRadiusRightTop();
        int cornerRadiusLeftTop = getCornerRadiusLeftTop();
        int cornerRadiusRightBottom = getCornerRadiusRightBottom();
        int cornerRadiusLeftBottom = getCornerRadiusLeftBottom();
        int borderWidth = getBorderWidth();
        int borderColor = getBorderColor();
        if (cornerRadius > 0 || borderWidth > 0 || cornerRadiusRightTop > 0 || cornerRadiusLeftTop > 0 || cornerRadiusRightBottom > 0 || cornerRadiusLeftBottom > 0) {
            ImageShapeFeature imageShapeFeature = (ImageShapeFeature) tUrlImageView.findFeature(ImageShapeFeature.class);
            if (imageShapeFeature == null) {
                imageShapeFeature = new ImageShapeFeature();
                tUrlImageView.addFeature(imageShapeFeature);
            }
            imageShapeFeature.setShape(1);
            if (cornerRadius > 0) {
                float f = cornerRadius;
                imageShapeFeature.setCornerRadius(f, f, f, f);
            } else if (cornerRadiusRightTop > 0 || cornerRadiusLeftTop > 0 || cornerRadiusRightBottom > 0 || cornerRadiusLeftBottom > 0) {
                imageShapeFeature.setCornerRadius(cornerRadiusLeftTop, cornerRadiusRightTop, cornerRadiusLeftBottom, cornerRadiusRightBottom);
            }
            if (borderWidth > 0) {
                imageShapeFeature.setStrokeEnable(true);
                imageShapeFeature.setStrokeWidth(borderWidth);
                imageShapeFeature.setStrokeColor(borderColor);
            }
        } else if (((ImageShapeFeature) tUrlImageView.findFeature(ImageShapeFeature.class)) != null) {
            tUrlImageView.removeFeature(ImageShapeFeature.class);
        }
    }
}
