package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.promotion.content.ContentDXHandler;
import com.taobao.android.promotion.content.TTDContentController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cu5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_DCEVENT = k06.a("dcEvent");

    /* renamed from: a  reason: collision with root package name */
    public final Context f17325a;
    public final TTDContentController b;

    static {
        t2o.a(629145627);
    }

    public cu5(Context context, TTDContentController tTDContentController) {
        this.f17325a = context;
        this.b = tTDContentController;
    }

    public static /* synthetic */ Object ipc$super(cu5 cu5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/promotion/content/DXDcEventEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else {
            ContentDXHandler.handleEvent(this.f17325a, this.b, objArr);
        }
    }
}
