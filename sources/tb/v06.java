package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class v06 extends jx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ICONHORIZONTALSCROLL = 1938314154274694230L;

    /* renamed from: a  reason: collision with root package name */
    public int f29709a;

    static {
        t2o.a(491782586);
    }

    public static /* synthetic */ Object ipc$super(v06 v06Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/pop/dx/event/DXIconHorizontalScrollEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int offsetX;
        IPopViewService iPopViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if ((dXEvent instanceof DXScrollEvent) && (offsetX = ((DXScrollEvent) dXEvent).getOffsetX()) != this.f29709a) {
            this.f29709a = offsetX;
            cfc c = j18.c(dXRuntimeContext);
            if (c != null && (iPopViewService = (IPopViewService) c.a(IPopViewService.class)) != null) {
                iPopViewService.onIconScroll(this.f29709a);
                qhm.c("default", PopConst.STATIC_KEY_ICON_SCROLL_OFFSET, String.valueOf(this.f29709a));
            }
        }
    }
}
