package tb;

import java.util.Comparator;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class d6y implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final String f17632a;

    public d6y(String str) {
        this.f17632a = str;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        String str = this.f17632a;
        int i = (((JSONObject) obj).optLong(str) > ((JSONObject) obj2).optLong(str) ? 1 : (((JSONObject) obj).optLong(str) == ((JSONObject) obj2).optLong(str) ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }
}
