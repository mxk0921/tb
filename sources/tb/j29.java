package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.favoritesdk.newbase.TBFavoriteServiceImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j29 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements oud {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f21714a;

        public a(WVCallBackContext wVCallBackContext) {
            this.f21714a = wVCallBackContext;
        }

        @Override // tb.oud
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f658c7", new Object[]{this, str, str2});
            } else {
                this.f21714a.error(j29.a(j29.this, str, str2, false));
            }
        }

        @Override // tb.oud
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72e2cbd8", new Object[]{this, str, str2});
            } else {
                this.f21714a.error(j29.a(j29.this, str, str2, true));
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
            this.f21714a.success(nswVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements pud {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f21715a;

        public b(WVCallBackContext wVCallBackContext) {
            this.f21715a = wVCallBackContext;
        }

        @Override // tb.pud
        public void onFavError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ec19c20", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                this.f21715a.error(j29.a(j29.this, str, str2, false));
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
            this.f21715a.success(nswVar);
        }

        @Override // tb.pud
        public void onFavSystemError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b61856f", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                this.f21715a.error(j29.a(j29.this, str, str2, true));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements pud {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f21716a;

        public c(WVCallBackContext wVCallBackContext) {
            this.f21716a = wVCallBackContext;
        }

        @Override // tb.pud
        public void onFavError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ec19c20", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                this.f21716a.error(j29.a(j29.this, str, str2, false));
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
            this.f21716a.success(nswVar);
        }

        @Override // tb.pud
        public void onFavSystemError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b61856f", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                this.f21716a.error(j29.a(j29.this, str, str2, true));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements pud {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f21717a;

        public d(WVCallBackContext wVCallBackContext) {
            this.f21717a = wVCallBackContext;
        }

        @Override // tb.pud
        public void onFavError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ec19c20", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                this.f21717a.error(j29.a(j29.this, str, str2, false));
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
            this.f21717a.success(nswVar);
        }

        @Override // tb.pud
        public void onFavSystemError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b61856f", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                this.f21717a.error(j29.a(j29.this, str, str2, true));
            }
        }
    }

    public static /* synthetic */ nsw a(j29 j29Var, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsw) ipChange.ipc$dispatch("d507a53", new Object[]{j29Var, str, str2, new Boolean(z)});
        }
        return j29Var.c(str, str2, z);
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
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f51d0476", new Object[]{this, str, jSONObject, tBFavoriteServiceImpl, wVCallBackContext})).booleanValue();
        }
        if (str.equals("isFavoriteItem")) {
            tBFavoriteServiceImpl.isFavoriteItem(jSONObject.getString("itemId"), new a(wVCallBackContext));
            return true;
        } else if (str.equals("addFavoriteItem")) {
            tBFavoriteServiceImpl.addFavoriteItem(jSONObject.getString("itemId"), new b(wVCallBackContext));
            return true;
        } else {
            if (str.equals("updateFavoriteItemCache")) {
                tBFavoriteServiceImpl.updateFavoriteItemCache(jSONObject.getString("itemId"));
            } else if (str.equals("deleteFavoriteItem")) {
                tBFavoriteServiceImpl.deleteFavoriteItem(jSONObject.getString("itemId"), new c(wVCallBackContext));
                return true;
            } else if (str.equals("deleteFavoriteItems") && (jSONArray = jSONObject.getJSONArray("itemIds")) != null && jSONArray.size() > 0) {
                tBFavoriteServiceImpl.deleteFavoriteItems((String[]) jSONArray.toArray(new String[jSONArray.size()]), new d(wVCallBackContext));
                return true;
            }
            return false;
        }
    }
}
