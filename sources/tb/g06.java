package tb;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService;
import com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.HVideoAnimationView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class g06 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHVIDEOANIMATION_HVIDEOANIMATION = 7071829940837222382L;

    /* renamed from: a  reason: collision with root package name */
    public int f19657a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f19658a;

        public a(View view) {
            this.f19658a = view;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/videocardanimationservice/impl/DXHVideoAnimationWidgetNode$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            fve.e("VideoAnimationWidgetNode", "onRenderView: 设置圆角 :" + g06.t(g06.this));
            outline.setRoundRect(0, 0, this.f19658a.getWidth(), this.f19658a.getHeight(), (float) g06.t(g06.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(491782744);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new g06();
        }
    }

    static {
        t2o.a(491782742);
    }

    public static /* synthetic */ Object ipc$super(g06 g06Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        } else if (hashCode == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/taobao/subservice/biz/videocardanimationservice/impl/DXHVideoAnimationWidgetNode");
        }
    }

    public static /* synthetic */ int t(g06 g06Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6fe699fd", new Object[]{g06Var})).intValue();
        }
        return g06Var.f19657a;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new g06();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof g06) {
            this.f19657a = dXWidgetNode.getCornerRadius();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new HVideoAnimationView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        fve.e("VideoAnimationWidgetNode", "onRenderView HVideoAnimationView: " + view);
        if (!(view instanceof HVideoAnimationView)) {
            fve.e("VideoAnimationWidgetNode", "onRenderView: not HVideoAnimationView");
            return;
        }
        IVideoCardAnimationService iVideoCardAnimationService = (IVideoCardAnimationService) j18.c(getDXRuntimeContext()).a(IVideoCardAnimationService.class);
        if (iVideoCardAnimationService == null || !iVideoCardAnimationService.enableShow()) {
            fve.e("VideoAnimationWidgetNode", "onRenderView: videoCardAnimationService null 或 不可展示");
            view.setVisibility(8);
            return;
        }
        fve.e("VideoAnimationWidgetNode", "onRenderView: prepare play:" + this.f19657a);
        view.setOutlineProvider(new a(view));
        view.setClipToOutline(true);
        HVideoAnimationView hVideoAnimationView = (HVideoAnimationView) view;
        hVideoAnimationView.setLoop(false);
        hVideoAnimationView.setVideoPath(iVideoCardAnimationService.getLocalVideoPath());
        hVideoAnimationView.setCoverImage(iVideoCardAnimationService.getFirstFrameImagePath());
    }
}
