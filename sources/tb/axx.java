package tb;

import android.content.Context;
import android.os.Bundle;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import com.opos.process.bridge.provider.BridgeBizException;
import com.opos.process.bridge.provider.BridgeDispatchException;
import com.opos.process.bridge.provider.BridgeExecuteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class axx {

    /* renamed from: a  reason: collision with root package name */
    public Context f16066a;
    public Bundle b;
    public IBridgeTargetIdentify c;
    public final List<c8y> d = new ArrayList();
    public final List<itx> e = new ArrayList();
    public final ReentrantLock f = new ReentrantLock(true);
    public final int g = 5000;

    static {
        t2o.a(253755445);
    }

    public void a(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) {
        d(context, str, iBridgeTargetIdentify, i, objArr);
    }

    public Object d(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) {
        Bundle e = e(context, str, iBridgeTargetIdentify, i, objArr);
        Objects.toString(e);
        if (e != null) {
            e.setClassLoader(getClass().getClassLoader());
            int i2 = e.getInt("resultCode");
            if (i2 == 0) {
                return e.get("resultData");
            }
            String string = e.getString("resultMsg");
            if (i2 == 101008) {
                throw new BridgeExecuteException((Exception) e.getSerializable("resultException"), i2);
            } else if (i2 < 102000) {
                throw new BridgeExecuteException(string, i2);
            } else if (i2 < 103000) {
                throw new BridgeDispatchException(string, i2);
            } else if (i2 == 103000) {
                throw new BridgeBizException(e.getString("interceptorMsg"), e.getInt("interceptorCode"));
            } else {
                throw new BridgeExecuteException(string, i2);
            }
        } else {
            throw new BridgeExecuteException("remote response is NULL", 102004);
        }
    }

    public abstract Bundle e(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr);
}
