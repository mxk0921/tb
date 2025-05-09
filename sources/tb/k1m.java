package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.g;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class k1m implements r8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public g f22345a = null;

    public k1m() {
        a();
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        zzb<?> b = yq7.b(ic.IMAGE_STAGE_DISPATCHER);
        if (b instanceof g) {
            this.f22345a = (g) b;
        }
    }

    @Override // tb.r8d
    public void onEvent(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b3d9af", new Object[]{this, str, str2, map});
        } else if (o48.c) {
            HashMap hashMap = new HashMap(map);
            if (map != null) {
                hashMap.put("requestUrl", rrl.a(map.get("requestUrl"), ""));
            }
            hashMap.put("procedureName", "ImageLib");
            hashMap.put(v4s.PARAM_UPLOAD_STAGE, str2);
            hashMap.put("requestId", str);
            zq6.a("image", hashMap);
        }
    }

    @Override // tb.r8d
    public void onFinished(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc51179", new Object[]{this, str, str2, map});
            return;
        }
        if (!yq7.c(this.f22345a)) {
            this.f22345a.e(1);
        }
        if (o48.c) {
            HashMap hashMap = new HashMap(map);
            hashMap.put("procedureName", "ImageLib");
            hashMap.put(v4s.PARAM_UPLOAD_STAGE, "onFinished");
            hashMap.put("requestId", str);
            hashMap.put("requestUrl", str2);
            zq6.a("image", hashMap);
        }
    }

    @Override // tb.r8d
    public void onRequest(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10f665a", new Object[]{this, str, str2, map});
            return;
        }
        if (!yq7.c(this.f22345a)) {
            this.f22345a.e(0);
        }
        if (o48.c) {
            HashMap hashMap = new HashMap(map);
            hashMap.put("procedureName", "ImageLib");
            hashMap.put(v4s.PARAM_UPLOAD_STAGE, "onRequest");
            hashMap.put("requestId", str);
            hashMap.put("requestUrl", str2);
            zq6.a("image", hashMap);
        }
    }

    @Override // tb.r8d
    public void onCancel(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74e88eb1", new Object[]{this, str, str2, map});
            return;
        }
        if (!yq7.c(this.f22345a)) {
            this.f22345a.e(3);
        }
        if (o48.c) {
            HashMap hashMap = new HashMap(map);
            hashMap.put("procedureName", "ImageLib");
            hashMap.put(v4s.PARAM_UPLOAD_STAGE, "onCancel");
            hashMap.put("requestId", str);
            hashMap.put("requestUrl", str2);
            zq6.a("image", hashMap);
        }
    }

    @Override // tb.r8d
    public void onError(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0e3681", new Object[]{this, str, str2, map});
            return;
        }
        if (!yq7.c(this.f22345a)) {
            this.f22345a.e(2);
        }
        if (o48.c) {
            HashMap hashMap = new HashMap(map);
            hashMap.put("procedureName", "ImageLib");
            hashMap.put(v4s.PARAM_UPLOAD_STAGE, "onError");
            hashMap.put("requestId", str);
            hashMap.put("requestUrl", str2);
            zq6.a("image", hashMap);
        }
    }
}
