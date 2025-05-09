package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.f;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zd5 extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(486539450);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new zd5();
        }
    }

    static {
        t2o.a(486539449);
    }

    public static /* synthetic */ Object ipc$super(zd5 zd5Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        } else if (hashCode == 1327675976) {
            return new Boolean(super.onEvent((DXEvent) objArr[0]));
        } else {
            if (hashCode == 2081077133) {
                return super.buildSimpleImageOption();
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/widgetnode/DXButterHomeImageWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.f, com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new zd5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode
    public DXImageWidgetNode.g buildSimpleImageOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXImageWidgetNode.g) ipChange.ipc$dispatch("7c0ab78d", new Object[]{this});
        }
        DXImageWidgetNode.g buildSimpleImageOption = super.buildSimpleImageOption();
        if (buildSimpleImageOption != null) {
            ImageStrategyConfig g = p2b.g(getImageUrl(), dje.GUESS_IMAGE_STRATEGY_CONFIG);
            if (g != null) {
                buildSimpleImageOption.e = g.h();
                buildSimpleImageOption.f = g.a();
            }
            buildSimpleImageOption.g = p2b.c(getImageUrl(), null);
        }
        return buildSimpleImageOption;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent.getEventId() == 5288671110273408574L) {
            v(true);
        } else if (dXEvent.getEventId() == 5388973340095122049L) {
            v(false);
        }
        return super.onEvent(dXEvent);
    }

    @Override // com.taobao.android.dinamicx.widget.f, com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        if (view instanceof TUrlImageView) {
            TUrlImageView tUrlImageView = (TUrlImageView) view;
            if (!p2b.k()) {
                tUrlImageView.preRender(true);
            }
            p2b.r(tUrlImageView, getImageUrl(), null, dje.GUESS_IMAGE_STRATEGY_CONFIG, getDXRuntimeContext().p());
            p2b.u(this, tUrlImageView);
            p2b.v(this, tUrlImageView, getImageUrl());
        }
        v(true);
        super.onRenderView(context, view);
    }

    public final boolean u(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94908883", new Object[]{this, str})).booleanValue();
        }
        if (str != null) {
            str2 = str.toLowerCase();
        } else {
            str2 = "";
        }
        if (str2.endsWith(".gif") || str2.endsWith(".webp") || str2.endsWith(".apng")) {
            return true;
        }
        return false;
    }

    public final void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e05477", new Object[]{this, new Boolean(z)});
        } else if (f4b.b("enableHomePageJumpToNextPageCostOpt2", true) && u(getImageUrl()) && p2b.k()) {
            View nativeView = getNativeView();
            if (nativeView instanceof TUrlImageView) {
                if (z) {
                    int i = R.id.tag_image_view_predraw_listener;
                    if (nativeView.getTag(i) == null) {
                        hne hneVar = new hne((TUrlImageView) nativeView);
                        nativeView.getViewTreeObserver().addOnPreDrawListener(hneVar);
                        nativeView.setTag(i, hneVar);
                    }
                }
                if (!z) {
                    int i2 = R.id.tag_image_view_predraw_listener;
                    if (nativeView.getTag(i2) != null) {
                        nativeView.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) nativeView.getTag(i2));
                        nativeView.setTag(i2, null);
                    }
                }
            }
        }
    }
}
