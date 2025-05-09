package tb;

import com.unionpay.UPPayWapActivity;
import com.unionpay.utils.UPUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ecy implements xux {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UPPayWapActivity f18486a;

    public ecy(UPPayWapActivity uPPayWapActivity) {
        this.f18486a = uPPayWapActivity;
    }

    @Override // tb.xux
    public final void a(String str, zux zuxVar) {
        String i;
        String i2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                UPUtils.g(this.f18486a, jSONObject.getString(next), next);
            }
            if (zuxVar != null) {
                i2 = UPPayWapActivity.i("0", "success", null);
                zuxVar.a(i2);
            }
        } catch (Exception e) {
            if (zuxVar != null) {
                i = UPPayWapActivity.i("1", e.getMessage(), null);
                zuxVar.a(i);
            }
        }
    }
}
