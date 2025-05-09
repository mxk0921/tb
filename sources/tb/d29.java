package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.favoritesdk.newbase.TBFavoriteServiceImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d29 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements oud {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f17518a;

        public a(WVCallBackContext wVCallBackContext) {
            this.f17518a = wVCallBackContext;
        }

        @Override // tb.oud
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f658c7", new Object[]{this, str, str2});
            } else {
                this.f17518a.error(d29.a(d29.this, str, str2, false));
            }
        }

        @Override // tb.oud
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72e2cbd8", new Object[]{this, str, str2});
            } else {
                this.f17518a.error(d29.a(d29.this, str, str2, true));
            }
        }

        @Override // tb.oud
        public void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddda67e6", new Object[]{this, new Boolean(z)});
                return;
            }
            nsw nswVar = new nsw();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFavorite", (Object) Boolean.valueOf(z));
            nswVar.a("data", jSONObject);
            this.f17518a.success(nswVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements pud {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f17519a;

        public b(WVCallBackContext wVCallBackContext) {
            this.f17519a = wVCallBackContext;
        }

        @Override // tb.pud
        public void onFavError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ec19c20", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                this.f17519a.error(d29.a(d29.this, str, str2, false));
            }
        }

        @Override // tb.pud
        public void onFavSuccess(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ede1cb1", new Object[]{this, new Integer(i), obj});
                return;
            }
            nsw nswVar = new nsw();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isSuccess", (Object) Boolean.TRUE);
            nswVar.a("data", jSONObject);
            this.f17519a.success(nswVar);
        }

        @Override // tb.pud
        public void onFavSystemError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b61856f", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                this.f17519a.error(d29.a(d29.this, str, str2, true));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements pud {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f17520a;

        public c(WVCallBackContext wVCallBackContext) {
            this.f17520a = wVCallBackContext;
        }

        @Override // tb.pud
        public void onFavError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ec19c20", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                this.f17520a.error(d29.a(d29.this, str, str2, false));
            }
        }

        @Override // tb.pud
        public void onFavSuccess(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ede1cb1", new Object[]{this, new Integer(i), obj});
                return;
            }
            nsw nswVar = new nsw();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isSuccess", (Object) Boolean.TRUE);
            nswVar.a("data", jSONObject);
            this.f17520a.success(nswVar);
        }

        @Override // tb.pud
        public void onFavSystemError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b61856f", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                this.f17520a.error(d29.a(d29.this, str, str2, true));
            }
        }
    }

    public static /* synthetic */ nsw a(d29 d29Var, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsw) ipChange.ipc$dispatch("8ed57cdf", new Object[]{d29Var, str, str2, new Boolean(z)});
        }
        return d29Var.c(str, str2, z);
    }

    public final nsw c(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsw) ipChange.ipc$dispatch("d58df748", new Object[]{this, str, str2, new Boolean(z)});
        }
        nsw nswVar = new nsw();
        nswVar.b("errorCode", str);
        nswVar.b("errorMsg", str2);
        return nswVar;
    }

    public boolean b(String str, JSONObject jSONObject, TBFavoriteServiceImpl tBFavoriteServiceImpl, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab484988", new Object[]{this, str, jSONObject, tBFavoriteServiceImpl, wVCallBackContext})).booleanValue();
        }
        if (str.equals("isFavoriteContent")) {
            tBFavoriteServiceImpl.isFavoriteContent(jSONObject.getIntValue("bizId"), jSONObject.getString("outItemId"), new a(wVCallBackContext));
            return true;
        } else if (str.equals("addFavoriteContent")) {
            String string = jSONObject.getString("outItemId");
            String string2 = jSONObject.getString("contentUrl");
            String string3 = jSONObject.getString("note");
            tBFavoriteServiceImpl.addFavoriteContent(jSONObject.getIntValue("bizId"), string, string2, jSONObject.getString("title"), jSONObject.getString("picUrl"), string3, new b(wVCallBackContext));
            return true;
        } else if (!str.equals("deleteFavoriteContent")) {
            return false;
        } else {
            tBFavoriteServiceImpl.deleteFavoriteContent(jSONObject.getIntValue("bizId"), jSONObject.getString("outItemId"), new c(wVCallBackContext));
            return true;
        }
    }
}
