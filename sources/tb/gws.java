package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gws implements mlc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ fws f20275a;

    public gws(fws fwsVar) {
        this.f20275a = fwsVar;
    }

    @Override // tb.mlc
    public void onLiveEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9ef1c", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.recommend.good.card.update".equals(str)) {
            if (obj instanceof DXRuntimeContext) {
                fws.c(this.f20275a, (DXRuntimeContext) obj);
                fws.d(this.f20275a);
            }
        } else if ("com.taobao.taolive.room.good.card.subscribe".equals(str) && (obj instanceof JSONObject)) {
            fws.e(this.f20275a, (JSONObject) obj);
        }
    }
}
