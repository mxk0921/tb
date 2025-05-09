package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class g45 implements DAICallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final f45 f19718a;
    public final String b;
    public final Map c;

    static {
        t2o.a(1034944608);
        t2o.a(1034944584);
    }

    public g45(String str, Map map, f45 f45Var) {
        this.f19718a = f45Var;
        this.b = str;
        this.c = map;
    }

    @Override // com.tmall.android.dai.DAICallback
    public void onError(DAIError dAIError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326e086b", new Object[]{this, dAIError});
        } else if (this.f19718a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("code", 0);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", this.b);
            Map map = this.c;
            if (map != null && map.containsKey(DAI.WALLE_INNER_EXTEND_ARGS)) {
                this.c.remove(DAI.WALLE_INNER_EXTEND_ARGS);
            }
            hashMap2.put("input", this.c);
            hashMap.put("model", hashMap2);
            HashMap hashMap3 = new HashMap();
            if (dAIError != null) {
                hashMap3.put("code", Integer.valueOf(dAIError.errorCode));
            }
            hashMap.put("error", hashMap3);
            this.f19718a.a(false, hashMap);
        }
    }

    @Override // com.tmall.android.dai.DAICallback
    public void onSuccess(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85dc9a6", new Object[]{this, objArr});
        } else if (this.f19718a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("code", 1);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", this.b);
            Map map = this.c;
            if (map != null && map.containsKey(DAI.WALLE_INNER_EXTEND_ARGS)) {
                this.c.remove(DAI.WALLE_INNER_EXTEND_ARGS);
            }
            hashMap2.put("input", this.c);
            hashMap.put("model", hashMap2);
            if (objArr != null && objArr.length > 0) {
                hashMap.put("result", objArr[0]);
            }
            this.f19718a.a(true, hashMap);
        }
    }
}
