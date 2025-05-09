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
import com.taobao.android.dinamicx.widget.f;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.regex.Matcher;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class vd5 extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View b;

    static {
        t2o.a(478151072);
    }

    public static /* synthetic */ Object ipc$super(vd5 vd5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/DXButterCartImageWidgetNode");
        }
    }

    public final void A() {
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

    public final void B(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644a02fd", new Object[]{this, view, str});
        } else if (view != null) {
            try {
                view.setTag(R.id.image_tag_url, str);
            } catch (Exception e) {
                String message = e.getMessage();
                ckf.d(message);
                ub3.g("saveTagInfoWhenLoadSuccessError", message);
            }
        }
    }

    public final boolean C(View view) {
        kmb b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8148e741", new Object[]{this, view})).booleanValue();
        }
        if (!v(view) || (b = yn2.b(getDXRuntimeContext())) == null || b.b() == null) {
            return false;
        }
        fsb j = b.j();
        ckf.f(j, "cartPresenter.dmContext");
        return j.d();
    }

    @Override // com.taobao.android.dinamicx.widget.f, com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new vd5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode
    public DXImageWidgetNode.g buildSimpleImageOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXImageWidgetNode.g) ipChange.ipc$dispatch("7c0ab78d", new Object[]{this});
        }
        DXImageWidgetNode.g buildSimpleImageOption = super.buildSimpleImageOption();
        if (w()) {
            String c = gb3.c();
            ckf.f(c, "CartFirstPageItemImageVi….getsFirstScreenPicUrls()");
            String imageUrl = getImageUrl();
            ckf.f(imageUrl, "imageUrl");
            if (wsq.O(c, imageUrl, false, 2, null)) {
                buildSimpleImageOption.e = "carts_001";
                buildSimpleImageOption.f = 32001;
            }
        }
        ckf.f(buildSimpleImageOption, "imageOption");
        return buildSimpleImageOption;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        ckf.g(dXEvent, "event");
        if (dXEvent instanceof DXImageWidgetNode.ImageLoadCompleteEvent) {
            String imageUrl = ((DXImageWidgetNode.ImageLoadCompleteEvent) dXEvent).getImageUrl();
            View view = this.b;
            ckf.f(imageUrl, "imageUrl");
            B(view, imageUrl);
            View view2 = this.b;
            if (view2 != null) {
                Context context = view2.getContext();
                ckf.f(context, "mView!!.context");
                y(context, imageUrl, this.b);
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
            D();
        } catch (Exception e) {
            ei8.a("ImageNodeUpdateRadioError", e);
        }
        super.onMeasure(i, i2);
    }

    @Override // com.taobao.android.dinamicx.widget.f, com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ckf.g(context, "context");
        ckf.g(view, "weakView");
        this.b = view;
        String imageUrl = getImageUrl();
        ckf.f(imageUrl, "imageUrl");
        z(context, imageUrl);
        if (C(view)) {
            y(context, imageUrl, this.b);
            return;
        }
        x(context, view);
        if (u()) {
            A();
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

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6443600d", new Object[]{this})).booleanValue();
        }
        String userId = getUserId();
        if (userId == null) {
            return true;
        }
        if (tsq.I(userId, "disableAppear", false, 2, null) || ckf.b("itemPic", userId)) {
            return false;
        }
        return true;
    }

    public final boolean v(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ec6c110", new Object[]{this, view})).booleanValue();
        }
        Object tag = view.getTag(R.id.image_tag_url);
        if (!(tag instanceof String)) {
            return false;
        }
        return ckf.b(tag, getImageUrl());
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69910ef8", new Object[]{this})).booleanValue();
        }
        if (ckf.b("disableAppearItemPic", getUserId()) || ckf.b("itemPic", getUserId())) {
            return true;
        }
        return false;
    }

    public final void x(Context context, View view) {
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
            ckf.f(imageUrl, "imageUrl");
            y(context, imageUrl, view);
            if (ic3.c()) {
                return;
            }
        }
        super.onRenderView(context, view);
    }

    public final void y(Context context, String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de50e19b", new Object[]{this, context, str, view});
        } else if (w()) {
            pb3.b(context, str, view);
        }
    }

    public final void z(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc8144eb", new Object[]{this, context, str});
        } else if (w()) {
            pb3.c(context, str);
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96d637d", new Object[]{this});
        } else if (!hasAspectRatioAttribute() && getLayoutWidth() <= 0 && getLayoutWidth() != -1) {
            String imageUrl = getImageUrl();
            if (!TextUtils.isEmpty(imageUrl)) {
                Matcher matcher = m18.sAspectRatioPattern.matcher(imageUrl);
                if (matcher.find()) {
                    String group = matcher.group(1);
                    ckf.f(group, "matcher.group(1)");
                    float parseFloat = Float.parseFloat(group);
                    String group2 = matcher.group(2);
                    ckf.f(group2, "matcher.group(2)");
                    try {
                        setAspectRatio(parseFloat / Float.parseFloat(group2));
                        Result.m1108constructorimpl(xhv.INSTANCE);
                    } catch (Throwable th) {
                        Result.m1108constructorimpl(b.a(th));
                    }
                }
            }
        }
    }
}
