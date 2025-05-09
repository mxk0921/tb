package tb;

import android.content.Context;
import android.util.Log;
import com.taobao.adaemon.power.APower;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class s8y implements jg0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f27879a;
    public final String b;
    public syb c;

    public s8y(Context context, String str) {
        this.f27879a = context;
        this.b = str;
    }

    @Override // tb.jg0
    public String a(String str, String str2) {
        if (this.c == null) {
            this.c = b();
        }
        syb sybVar = this.c;
        String str3 = this.b;
        Context context = this.f27879a;
        if (sybVar == null) {
            this.c = new a8y(context, str3).b();
        }
        return ((q6y) this.c).b(kay.b(context, str3, "agc_plugin_", str), str2);
    }

    public syb b() {
        String b = kay.b(this.f27879a, this.b, "agc_plugin_", "crypto_component");
        if (b == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(lva.b(b), "utf-8"));
            return new q6y(new p3y(jSONObject.getString(APower.e.KEY_RX), jSONObject.getString("ry"), jSONObject.getString("rz"), jSONObject.getString("salt"), jSONObject.getString("algorithm"), jSONObject.getInt("iterationCount")));
        } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e) {
            Log.e("AGC_FlexibleDecrypt", "FlexibleDecrypt exception: " + e.getMessage());
            return null;
        }
    }
}
