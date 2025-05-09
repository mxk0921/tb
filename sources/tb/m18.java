package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m18 extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXIMAGEVIEW_IMAGEVIEW = 7700670404894374791L;
    public static final Pattern sAspectRatioPattern = Pattern.compile("-([0-9]+)-([0-9]+)\\.(jpg|jpeg|gif|apng|png|webp)$");

    /* renamed from: a  reason: collision with root package name */
    public View f23712a;

    static {
        t2o.a(478151099);
    }

    public static /* synthetic */ Object ipc$super(m18 m18Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2081077133:
                return super.buildSimpleImageOption();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/DxCartImageWidgetNode");
        }
    }

    public final void A(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644a02fd", new Object[]{this, view, str});
        } else if (view != null) {
            try {
                view.setTag(R.id.image_tag_url, str);
            } catch (Exception e) {
                ub3.g("saveTagInfoWhenLoadSuccessError", e.getMessage());
            }
        }
    }

    public final boolean B(View view) {
        kmb b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8148e741", new Object[]{this, view})).booleanValue();
        }
        if (!u(view) || (b = yn2.b(getDXRuntimeContext())) == null || b.b() == null) {
            return false;
        }
        return b.j().d();
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96d637d", new Object[]{this});
        } else if (getAspectRatio() <= vu3.b.GEO_NOT_SUPPORT && getLayoutWidth() <= 0 && getLayoutWidth() != -1) {
            String imageUrl = getImageUrl();
            if (!TextUtils.isEmpty(imageUrl)) {
                Matcher matcher = sAspectRatioPattern.matcher(imageUrl);
                if (matcher.find()) {
                    setAspectRatio(Float.parseFloat(matcher.group(1)) / Float.parseFloat(matcher.group(2)));
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new m18();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode
    public DXImageWidgetNode.g buildSimpleImageOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXImageWidgetNode.g) ipChange.ipc$dispatch("7c0ab78d", new Object[]{this});
        }
        DXImageWidgetNode.g buildSimpleImageOption = super.buildSimpleImageOption();
        if (v() && gb3.c().contains(getImageUrl())) {
            buildSimpleImageOption.e = "carts_001";
            buildSimpleImageOption.f = 32001;
        }
        return buildSimpleImageOption;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent instanceof DXImageWidgetNode.ImageLoadCompleteEvent) {
            String imageUrl = ((DXImageWidgetNode.ImageLoadCompleteEvent) dXEvent).getImageUrl();
            A(this.f23712a, imageUrl);
            View view = this.f23712a;
            if (view != null) {
                x(view.getContext(), imageUrl, this.f23712a);
            }
        }
        return super.onEvent(dXEvent);
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            C();
        } catch (Exception e) {
            ei8.a("ImageNodeUpdateRadioError", e);
        }
        super.onMeasure(i, i2);
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        this.f23712a = view;
        if (view == null) {
            ub3.g("DXImageWidgetNode#ImageViewIsNull", "图片组件View为null");
            return;
        }
        String imageUrl = getImageUrl();
        y(context, imageUrl);
        if (B(view)) {
            x(context, imageUrl, this.f23712a);
            return;
        }
        w(context, view);
        if (t()) {
            z();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        super.onSetIntAttribute(j, i);
        if (j == -5982835989037571513L) {
            sb3.g(i, -1);
        } else if (j == 3833148244587386529L) {
            sb3.g(-1, i);
        }
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6443600d", new Object[]{this})).booleanValue();
        }
        String userId = getUserId();
        if (userId == null) {
            return true;
        }
        if (userId.startsWith("disableAppear") || "itemPic".equals(userId)) {
            return false;
        }
        return true;
    }

    public final boolean u(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ec6c110", new Object[]{this, view})).booleanValue();
        }
        Object tag = view.getTag(R.id.image_tag_url);
        if (!(tag instanceof String)) {
            return false;
        }
        return tag.equals(getImageUrl());
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69910ef8", new Object[]{this})).booleanValue();
        }
        if ("disableAppearItemPic".equals(getUserId()) || "itemPic".equals(getUserId())) {
            return true;
        }
        return false;
    }

    public final void w(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7883058d", new Object[]{this, context, view});
            return;
        }
        String imageUrl = getImageUrl();
        if (view instanceof TUrlImageView) {
            ((TUrlImageView) view).enableSizeInLayoutParams(true);
        }
        Drawable l = sb3.l(imageUrl);
        if (l != null) {
            setLocalImageDrawable(l);
            setPlaceHolder(l);
            x(context, imageUrl, view);
            if (ic3.c()) {
                return;
            }
        }
        super.onRenderView(context, view);
    }

    public final void x(Context context, String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de50e19b", new Object[]{this, context, str, view});
        } else if (v()) {
            pb3.b(context, str, view);
        }
    }

    public final void y(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc8144eb", new Object[]{this, context, str});
        } else if (v()) {
            pb3.c(context, str);
        }
    }

    public final void z() {
        av5 s;
        DinamicXEngine f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb264ff", new Object[]{this});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext != null && (s = dXRuntimeContext.s()) != null && (f = s.f()) != null) {
            f.t0(dXRuntimeContext.L());
        }
    }
}
