package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.home.component.view.HGifView;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.tao.image.ImageStrategyConfig;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vy5 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHGIFVIEW_ASPECTRATIO = 7594222789952419722L;
    public static final long DXHGIFVIEW_FILTERTYPE = -7195088064603432654L;
    public static final long DXHGIFVIEW_GIFURL = 9274838684923695L;
    public static final long DXHGIFVIEW_HGIFVIEW = -6240570111658900479L;
    public static final long DXHGIFVIEW_IMAGEURL = 3520785955321526846L;
    public static final long DXHGIFVIEW_PLACEHOLDERIMAGE = -2302197892612987562L;
    public static final long DXHGIFVIEW_SCALETYPE = 1015096712691932083L;
    public static final int DXHGIFVIEW_SCALETYPE_CENTERCROP = 2;
    public static final int DXHGIFVIEW_SCALETYPE_FITCENTER = 0;
    public static final int DXHGIFVIEW_SCALETYPE_FITXY = 1;
    public static final String TAG = "DXHGifViewWidgetNode";

    /* renamed from: a  reason: collision with root package name */
    public double f30339a;
    public String b;
    public String c;
    public Object d;
    public int e;
    public int f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729809071);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new vy5();
        }
    }

    static {
        t2o.a(729809070);
    }

    public static /* synthetic */ Object ipc$super(vy5 vy5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/widgetnode/DXHGifViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new vy5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof vy5)) {
            super.onClone(dXWidgetNode, z);
            vy5 vy5Var = (vy5) dXWidgetNode;
            this.f30339a = vy5Var.f30339a;
            this.b = vy5Var.b;
            this.c = vy5Var.c;
            this.d = vy5Var.d;
            this.e = vy5Var.e;
            this.f = vy5Var.f;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new HGifView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2 = true;
        int i6 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        if (a2 != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (a3 == 1073741824) {
            z2 = false;
        }
        if (z || z2) {
            double d = this.f30339a;
            if (!z || z2) {
                if (!z && z2) {
                    int size = View.MeasureSpec.getSize(i);
                    if (d > vu3.b.GEO_NOT_SUPPORT) {
                        i6 = size;
                        i5 = (int) (size / d);
                    } else {
                        i6 = size;
                    }
                }
                i5 = 0;
            } else {
                i5 = View.MeasureSpec.getSize(i2);
                if (d > vu3.b.GEO_NOT_SUPPORT) {
                    i6 = (int) (i5 * d);
                }
            }
            int max = Math.max(i6, getSuggestedMinimumWidth());
            i3 = Math.max(i5, getSuggestedMinimumHeight());
            i4 = max;
        } else {
            i4 = DXWidgetNode.DXMeasureSpec.b(i);
            i3 = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(DXWidgetNode.resolveSize(i4, i), DXWidgetNode.resolveSize(i3, i2));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view instanceof HGifView) {
            HGifView hGifView = (HGifView) view;
            if (hGifView.getBottomImageView() != null && hGifView.getGifImageView() != null) {
                HImageView bottomImageView = hGifView.getBottomImageView();
                String str = this.c;
                ImageStrategyConfig imageStrategyConfig = i2b.IMAGE_STRATEGY_CONFIG;
                p2b.q(bottomImageView, str, "homepage-ads", imageStrategyConfig);
                p2b.q(hGifView.getGifImageView(), this.b, "homepage-ads", imageStrategyConfig);
                setImageScaleType(hGifView.getBottomImageView(), this.e);
                setImageScaleType(hGifView.getGifImageView(), this.e);
                try {
                    hGifView.getBottomImageView().setPlaceHoldForeground((Drawable) this.d);
                } catch (Throwable th) {
                    bqa.d("DXHGifViewWidgetNode", "图片预置图加载异常 msg = " + th.getMessage());
                }
                hGifView.setBottomImage(this.c);
                hGifView.setGifUrl(this.b);
                lle.b(hGifView.getGifImageView(), this.f);
                lle.b(hGifView.getBottomImageView(), this.f);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 7594222789952419722L) {
            this.f30339a = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 1015096712691932083L) {
            this.e = i;
        } else if (-7195088064603432654L == j) {
            this.f = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == -2302197892612987562L) {
            this.d = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 9274838684923695L) {
            this.b = str;
        } else if (j == 3520785955321526846L) {
            this.c = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public void setImageScaleType(ImageView imageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920072b7", new Object[]{this, imageView, new Integer(i)});
        } else if (i == 0) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (i == 1) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if (i != 2) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }
}
