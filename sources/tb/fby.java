package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.unionpay.UPPayWapActivity;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class fby implements xux {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UPPayWapActivity f19179a;

    public fby(UPPayWapActivity uPPayWapActivity) {
        this.f19179a = uPPayWapActivity;
    }

    @Override // tb.xux
    public final void a(String str, zux zuxVar) {
        String i;
        String i2;
        String i3;
        UPPayWapActivity uPPayWapActivity = this.f19179a;
        try {
            uPPayWapActivity.h = zuxVar;
            String optString = new JSONObject(str).optString("scheme");
            if (!TextUtils.isEmpty(optString)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(optString));
                try {
                    uPPayWapActivity.startActivity(intent);
                } catch (Exception unused) {
                    if (zuxVar != null) {
                        i3 = UPPayWapActivity.i("2", "Call application error", null);
                        zuxVar.a(i3);
                    }
                }
            } else if (zuxVar != null) {
                i2 = UPPayWapActivity.i("1", "Parameter error", null);
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
