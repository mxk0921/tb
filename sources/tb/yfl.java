package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class yfl extends q22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<MusOuterAlbumBean> f32051a;

    static {
        t2o.a(481296666);
    }

    public yfl(List<MusOuterAlbumBean> list) {
        this.f32051a = list;
    }

    public static /* synthetic */ Object ipc$super(yfl yflVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/msg/OuterAlbumUpdateMsg");
    }

    @Override // tb.q22
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0ca9f4", new Object[]{this});
        }
        return "cameraUpdateOuterAlbum";
    }

    @Override // tb.q22
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6b386517", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        List<MusOuterAlbumBean> list = this.f32051a;
        if (list != null) {
            jSONObject.put("pics", (Object) list);
        }
        return jSONObject;
    }
}
