package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w36 extends xy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile w36 g;

    static {
        t2o.a(779092954);
    }

    public static /* synthetic */ Object ipc$super(w36 w36Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.c();
            return null;
        } else if (hashCode == -83293931) {
            super.onSuccess(((Number) objArr[0]).intValue(), (NetResponse) objArr[1], (NetBaseOutDo) objArr[2], objArr[3]);
            return null;
        } else if (hashCode == 1621086737) {
            super.g((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/dx/DXManager");
        }
    }

    public static w36 k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w36) ipChange.ipc$dispatch("3af54995", new Object[0]);
        }
        if (g == null) {
            synchronized (w36.class) {
                try {
                    if (g == null) {
                        g = new w36();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    @Override // tb.xy
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.c();
        g = null;
    }

    @Override // tb.xy
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6db0c1b6", new Object[]{this});
        }
        return "live";
    }

    @Override // tb.xy
    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            super.g(context);
        }
    }

    public DinamicXEngine j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("954c806f", new Object[]{this});
        }
        return this.f31671a;
    }

    @Override // tb.xy, tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else {
            super.onSuccess(i, netResponse, netBaseOutDo, obj);
        }
    }
}
