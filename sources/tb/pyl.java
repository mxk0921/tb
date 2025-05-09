package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class pyl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f26400a;
    public Intent b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26401a;

        public a(String str) {
            this.f26401a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                pyl.a(pyl.this, new JSONObject(this.f26401a));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final pyl f26402a = new pyl();
    }

    public static /* synthetic */ void a(pyl pylVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda8987c", new Object[]{pylVar, jSONObject});
        } else {
            pylVar.i(jSONObject);
        }
    }

    public static pyl e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pyl) ipChange.ipc$dispatch("47322d8f", new Object[0]);
        }
        return b.f26402a;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3936cf6", new Object[]{this});
            return;
        }
        this.b = null;
        rzl.d().a();
    }

    public Intent c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("8f41938", new Object[]{this});
        }
        if (this.b == null) {
            this.b = g(null, rzl.d().c());
        }
        return this.b;
    }

    public synchronized ThreadPoolExecutor d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("4f8b6693", new Object[]{this});
        }
        if (this.f26400a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), ut4.a("PermissionRouter_Parse", false));
            this.f26400a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return this.f26400a;
    }

    public final Intent f(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("7b13f6a8", new Object[]{this, jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.addFlags(268435456);
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                intent = g(intent, jSONObject);
                if (ut4.b(intent)) {
                    this.b = intent;
                    rzl.d().i(jSONObject.toString());
                    return intent;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public synchronized void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca5b5bc", new Object[]{this, str});
        } else if (str != null) {
            d().execute(new a(str));
        }
    }

    public final void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bbb19ea", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(xbk.a().f31270a);
            if (optJSONObject == null) {
                b();
                return;
            }
            String optString = optJSONObject.optString("versionProp");
            if (TextUtils.isEmpty(optString)) {
                j(optJSONObject);
            } else {
                k(optJSONObject, optString);
            }
        }
    }

    public final void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("164f4fc1", new Object[]{this, jSONObject});
        } else if (f(jSONObject.optJSONArray("default")) == null) {
            b();
        }
    }

    public final void k(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b38c54", new Object[]{this, jSONObject, str});
            return;
        }
        try {
            String a2 = xbk.a().a(str);
            if (!TextUtils.isEmpty(a2) && f(jSONObject.optJSONArray(a2)) == null) {
                j(jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public final Intent g(Intent intent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("c1cf1fbb", new Object[]{this, intent, jSONObject});
        }
        if (jSONObject == null) {
            return intent;
        }
        if (intent == null) {
            intent = new Intent();
            intent.addFlags(268435456);
        }
        String optString = jSONObject.optString("packageName");
        if (!TextUtils.isEmpty(optString)) {
            intent.setPackage(optString);
        }
        String optString2 = jSONObject.optString("className");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            intent.setClassName(optString, optString2);
        }
        String optString3 = jSONObject.optString("action");
        if (!TextUtils.isEmpty(optString3)) {
            intent.setAction(optString3);
        }
        String optString4 = jSONObject.optString("data");
        if (!TextUtils.isEmpty(optString4)) {
            intent.setData(Uri.parse(optString4));
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("category");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    intent.addCategory((String) optJSONArray.get(i));
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray(AgooConstants.MESSAGE_FLAG);
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    intent.addFlags(((Integer) optJSONArray2.get(i2)).intValue());
                }
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("extras");
            if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    JSONObject jSONObject2 = (JSONObject) optJSONArray3.get(i3);
                    if (jSONObject2 != null) {
                        String optString5 = jSONObject2.optString("key");
                        if (!TextUtils.isEmpty(optString5)) {
                            intent.putExtra(optString5, jSONObject2.optString("value"));
                        }
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String optString6 = jSONObject.optString("extraPkgKey");
        if (!TextUtils.isEmpty(optString6)) {
            intent.putExtra(optString6, vg8.f());
        } else {
            intent.putExtra("packageName", vg8.f());
        }
        String optString7 = jSONObject.optString("uidKey");
        if (!TextUtils.isEmpty(optString7)) {
            intent.putExtra(optString7, vg8.g());
        }
        String optString8 = jSONObject.optString("nameForUidKey");
        if (!TextUtils.isEmpty(optString8)) {
            intent.putExtra(optString8, vg8.d());
        }
        String optString9 = jSONObject.optString("appLabelKey");
        if (!TextUtils.isEmpty(optString9)) {
            intent.putExtra(optString9, vg8.c());
        }
        String optString10 = jSONObject.optString("appIconKey");
        if (!TextUtils.isEmpty(optString10)) {
            intent.putExtra(optString10, vg8.b());
        }
        String optString11 = jSONObject.optString("versionCodeKey");
        if (!TextUtils.isEmpty(optString11)) {
            intent.putExtra(optString11, vg8.h());
        }
        String optString12 = jSONObject.optString("versionNameKey");
        if (!TextUtils.isEmpty(optString12)) {
            intent.putExtra(optString12, vg8.i());
        }
        return intent;
    }
}
