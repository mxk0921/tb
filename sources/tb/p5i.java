package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.MaskLayerView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p5i extends zr7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public float w0 = 0.0f;

        static {
            t2o.a(503316768);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/MaskLayerComponent$MaskLayerViewParams");
        }

        @Override // tb.jfw
        public void v(Context context, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7bb1f3f", new Object[]{this, context, str, obj});
                return;
            }
            str.hashCode();
            if (str.equals("check-alpha")) {
                this.w0 = nwv.r(obj, 0);
            }
        }
    }

    static {
        t2o.a(503316767);
    }

    public static /* synthetic */ Object ipc$super(p5i p5iVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/MaskLayerComponent");
    }

    @Override // tb.zr7, com.taobao.tao.flexbox.layoutmanager.core.c
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* renamed from: h */
    public a generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f097a1d9", new Object[]{this});
        }
        return new a();
    }

    /* renamed from: i */
    public MaskLayerView onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaskLayerView) ipChange.ipc$dispatch("14e1a769", new Object[]{this, context});
        }
        MaskLayerView maskLayerView = new MaskLayerView(context);
        maskLayerView.bindComponent(this);
        P p = this.viewParams;
        if (p instanceof a) {
            maskLayerView.setCheckAlpha(((a) p).w0);
        }
        return maskLayerView;
    }

    @Override // tb.zr7
    public boolean needRecycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98f38ff2", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
