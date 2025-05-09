package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.push.model.ActionInfo;
import com.taobao.android.live.plugin.atype.flexalocal.push.model.ClientCtlInfo;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h90 extends kq1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else {
                new zij(h90.this).c();
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }
    }

    static {
        t2o.a(295699623);
    }

    public h90(Context context, ux9 ux9Var, ActionInfo actionInfo, ClientCtlInfo clientCtlInfo) {
        super(context, ux9Var, actionInfo, clientCtlInfo);
    }

    public static /* synthetic */ Object ipc$super(h90 h90Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/push/actions/ActionExecutor");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75aeeea8", new Object[]{this});
        } else if (this.c != null && !d()) {
            if (TextUtils.isEmpty(this.c.mtopApi)) {
                new zij(this).c();
            } else if (this.c.isSerialAction) {
                new j3o(this).d(new a());
            } else {
                new j3o(this).c();
                new zij(this).c();
            }
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a4b8695", new Object[]{this})).booleanValue();
        }
        if (lu3.c(b(), this.d)) {
            return false;
        }
        ActionInfo actionInfo = this.c;
        if (actionInfo != null && !TextUtils.isEmpty(actionInfo.jumpBackUrl)) {
            String str = this.c.jumpBackUrl;
            if (v2s.o().v() != null) {
                try {
                    v2s.o().v().b(this.f22845a, str, null);
                } catch (Exception e) {
                    o3s.b("ActionExecutor", "interceptAndJumpBack error: " + e);
                }
            }
        }
        return true;
    }
}
