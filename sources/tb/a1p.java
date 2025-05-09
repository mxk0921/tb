package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class a1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f15490a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792513);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        @JvmStatic
        public final a1p a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a1p) ipChange.ipc$dispatch("bc4dea3e", new Object[]{this, jSONObject});
            }
            ckf.g(jSONObject, "jsonObject");
            String optString = jSONObject.optString("url");
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            int optInt = jSONObject.optInt("totalCount", 0);
            int optInt2 = jSONObject.optInt("sepCount", 0);
            String optString2 = jSONObject.optString("startTime");
            String optString3 = jSONObject.optString("endTime");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
            ckf.d(optString);
            return new a1p(optString, optInt, optInt2, simpleDateFormat.parse(optString2).getTime(), simpleDateFormat.parse(optString3).getTime());
        }
    }

    static {
        t2o.a(815792512);
    }

    public a1p(String str, int i, int i2, long j, long j2) {
        ckf.g(str, "url");
        this.f15490a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
    }

    @JvmStatic
    public static final a1p a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a1p) ipChange.ipc$dispatch("bc4dea3e", new Object[]{jSONObject});
        }
        return Companion.a(jSONObject);
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("250d18d", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c0db5c1", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ffb341b", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f15490a;
    }
}
