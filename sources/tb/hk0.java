package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hk0 extends q22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20700a;

    static {
        t2o.a(481296661);
    }

    public hk0(boolean z) {
        this.f20700a = z;
    }

    public static /* synthetic */ Object ipc$super(hk0 hk0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/msg/AlbumPermissionStateMsg");
    }

    @Override // tb.q22
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0ca9f4", new Object[]{this});
        }
        return "captureAlbumPermissionState";
    }

    @Override // tb.q22
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6b386517", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "hasPermission", String.valueOf(this.f20700a));
        return jSONObject;
    }
}
