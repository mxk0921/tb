package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kz5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HPRELOADLIVEROOM = -4434407161790515604L;

    static {
        t2o.a(486539357);
    }

    public static /* synthetic */ void f(DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02765c4", new Object[]{dXRuntimeContext, str});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            fsm.a().d(dXRuntimeContext.h(), str);
            tve.c("LiveRoomPreload", "", "1.0", "LiveRoomPreload", "", null);
            fve.e("DXHPreloadLiveRoomEventHandler", "execute live room preload, cost: " + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th) {
            tve.b("LiveRoomPreload", "", "1.0", "LiveRoomPreload", "", null, "", "preload error");
            fve.c("DXHPreloadLiveRoomEventHandler", "execute live room preload error", th);
        }
    }

    public static /* synthetic */ Object ipc$super(kz5 kz5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXHPreloadLiveRoomEventHandler");
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("405c2d2a", new Object[]{this})).booleanValue();
        }
        return mve.a("enableInsertCardPreloadLiveRoom", true);
    }

    public final long d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf76f5d9", new Object[]{this, obj})).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (Exception e) {
            fve.c("DXHPreloadLiveRoomEventHandler", "parse delay error", e);
            return 0L;
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (!b()) {
            fve.e("DXHPreloadLiveRoomEventHandler", "preload disable");
        } else if (objArr.length >= 1) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                final String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    fve.e("DXHPreloadLiveRoomEventHandler", "empty url");
                } else if (!fsm.a().b(str)) {
                    fve.e("DXHPreloadLiveRoomEventHandler", "not live url, preload skip");
                } else {
                    long d = objArr.length > 1 ? d(objArr[1]) : 0L;
                    fve.e("DXHPreloadLiveRoomEventHandler", "preload url: " + str + ", delay: " + d);
                    get.a().f(new Runnable() { // from class: tb.jz5
                        @Override // java.lang.Runnable
                        public final void run() {
                            kz5.f(DXRuntimeContext.this, str);
                        }
                    }, d);
                }
            }
        }
    }
}
