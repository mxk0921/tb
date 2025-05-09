package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.sp.framework.model.SimpleProfile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22170a;
    public final JSONObject b;

    static {
        t2o.a(839909437);
    }

    public jr(boolean z, JSONObject jSONObject) {
        this.f22170a = z;
        this.b = jSONObject;
    }

    public static a e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("265401ee", new Object[]{str, str2});
        }
        return new a(str, str2);
    }

    public static a f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e58628f8", new Object[]{str, str2, str3});
        }
        return new a(str, str2, str3);
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        if (a() != null) {
            return a().getString("error");
        }
        return null;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        if (a() != null) {
            return a().getString("errorMessage");
        }
        return null;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.f22170a;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a extends jr {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String c;
        public final String d;
        public final String e;

        static {
            t2o.a(839909438);
        }

        public a(String str, String str2) {
            super(false);
            this.c = str;
            this.d = str2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/ability/callback/AbilityResponse$Error");
        }

        @Override // tb.jr
        public JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", (Object) this.c);
            jSONObject.put("message", (Object) this.d);
            jSONObject.put("errorMessage", (Object) this.d);
            if (!TextUtils.isEmpty(this.e)) {
                jSONObject.put(SimpleProfile.KEY_SIGNATURE, (Object) this.e);
            }
            return jSONObject;
        }

        public a(String str, String str2, String str3) {
            super(false);
            this.c = str;
            this.d = str2;
            this.e = str3;
        }
    }

    public jr(boolean z) {
        this.f22170a = z;
    }
}
