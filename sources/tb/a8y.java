package tb;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a8y implements jg0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15607a;
    public final String b;
    public syb c;

    public a8y(Context context, String str) {
        this.f15607a = context;
        this.b = str;
    }

    @Override // tb.jg0
    public String a(String str, String str2) {
        if (this.c == null) {
            this.c = b();
        }
        return ((q6y) this.c).b(kay.b(this.f15607a, this.b, "agc_", str), str2);
    }

    public syb b() {
        Context context = this.f15607a;
        String str = this.b;
        return new q6y(new p3y(kay.b(context, str, "agc_", "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"), kay.b(context, str, "agc_", "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"), kay.b(context, str, "agc_", "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"), kay.b(context, str, "agc_", "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"), "PBKDF2WithHmacSHA1", 5000));
    }
}
