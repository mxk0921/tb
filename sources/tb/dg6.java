package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dg6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVEOFFICIALENTRYCLICK = -8122558392255960062L;
    public static final String EVENT_OFFICIAL_ANCHOR_CLICK = "official_anchor_click";
    public static final String EVENT_OFFICIAL_ENTRY_CLICK = "official_entry_click";
    public static final String EVENT_OFFICIAL_FOLLOW = "official_follow";

    static {
        t2o.a(295699538);
    }

    public static /* synthetic */ Object ipc$super(dg6 dg6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/officialLive/DXTaoLiveOfficialEntryClickEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 2 && dXRuntimeContext != null) {
            String str = (String) objArr[0];
            ux9 d = vx9.d();
            String C = d == null ? null : d.C();
            if ("event".equals(str)) {
                String str2 = (String) objArr[1];
                if (EVENT_OFFICIAL_FOLLOW.equals(str2)) {
                    sjr.g().c(EVENT_OFFICIAL_FOLLOW, null, C);
                } else if (EVENT_OFFICIAL_ANCHOR_CLICK.equals(str2)) {
                    sjr.g().c(EVENT_OFFICIAL_ANCHOR_CLICK, null, C);
                } else if (EVENT_OFFICIAL_ENTRY_CLICK.equals(str2)) {
                    sjr.g().c(EVENT_OFFICIAL_ENTRY_CLICK, null, C);
                }
            }
        }
    }
}
