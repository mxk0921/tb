package tb;

import android.content.Context;
import anetwork.channel.Request;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m0x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "aws.WebSocketCenter";
    public static volatile m0x b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, v0x> f23705a = new HashMap<>();

    static {
        t2o.a(401604609);
    }

    public static m0x a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m0x) ipChange.ipc$dispatch("1e66723c", new Object[0]);
        }
        if (b == null) {
            synchronized (m0x.class) {
                try {
                    if (b == null) {
                        b = new m0x();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public tbe b(Context context, Request request, z0x z0xVar) {
        v0x v0xVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tbe) ipChange.ipc$dispatch("387ce92d", new Object[]{this, context, request, z0xVar});
        }
        if (z0xVar == null || context == null || request == null || request.getURI() == null || "".equals(request.getURI().getHost())) {
            return null;
        }
        synchronized (this) {
            try {
                v0xVar = this.f23705a.get(request.getURI().toString());
                if (v0xVar == null) {
                    v0xVar = new v0x(context, request, z0xVar);
                    this.f23705a.put(request.getURI().toString(), v0xVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        v0xVar.I(z0xVar);
        v0xVar.x();
        return v0xVar;
    }
}
