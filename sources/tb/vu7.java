package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.data.BaseMmAdModel;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vu7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final nwi f30263a;
    public cv7 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends h07 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/cache/DownloadManager$1");
        }

        @Override // tb.h07, tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            jgh.a("DownloadManager", "downloadUrl: download error, url: " + str + ", errorCode: " + i + ", msg: " + str2);
            if (vu7.a(vu7.this) != null) {
                vu7.a(vu7.this).onDownloadError(str, i, str2);
            }
        }

        @Override // tb.h07, tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            jgh.a("DownloadManager", "downloadUrl: download finish, url: " + str + ", filePath: " + str2);
            if (vu7.a(vu7.this) != null) {
                vu7.a(vu7.this).onFinish(str, str2);
            }
        }
    }

    static {
        t2o.a(573571125);
    }

    public vu7(nwi nwiVar) {
        this.f30263a = nwiVar;
    }

    public static /* synthetic */ cv7 a(vu7 vu7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cv7) ipChange.ipc$dispatch("dea20caa", new Object[]{vu7Var});
        }
        return vu7Var.b;
    }

    public final void b(String str, int i, boolean z, List<qt7> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a52210a", new Object[]{this, str, new Integer(i), new Boolean(z), list});
        } else if (!TextUtils.isEmpty(str)) {
            list.add(new qt7(str, i, z));
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26896d19", new Object[]{this, str});
            return;
        }
        String e = di2.e(str);
        if (TextUtils.isEmpty(e)) {
            jgh.a("DownloadManager", "downloadUrl: can not parse file name, url: " + str);
            return;
        }
        onf onfVar = new onf();
        onfVar.f25507a = str;
        onfVar.d = e;
        zu7 zu7Var = new zu7();
        zu7Var.f33016a = Collections.singletonList(onfVar);
        upl uplVar = new upl();
        zu7Var.b = uplVar;
        uplVar.f29547a = nwi.BIZ_CODE;
        uplVar.h = false;
        uplVar.g = rf9.f();
        rv7.e().b(zu7Var, new a());
        jgh.a("DownloadManager", "downloadUrl: start download, url: " + str + ", name: " + e);
    }

    public final void f(int i, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42698447", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("subSection");
        if (jSONObject4 != null && (jSONObject2 = jSONObject4.getJSONObject(PopStrategy.IDENTIFIER_SPLASH)) != null && (jSONObject3 = jSONObject2.getJSONObject("bizData")) != null) {
            String string = jSONObject3.getString("creativeId");
            if (!TextUtils.isEmpty(string)) {
                if (i == 1000) {
                    str = "cold_start";
                } else {
                    str = "hot_start";
                }
                m0j.i(null, str, string);
            }
        }
    }

    public void g(cv7 cv7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ce8fd3", new Object[]{this, cv7Var});
        } else {
            this.b = cv7Var;
        }
    }

    public boolean e() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64e5cc36", new Object[]{this})).booleanValue();
        }
        BaseMmAdModel a2 = this.f30263a.d().a();
        if (!TextUtils.isEmpty(a2.animationLottie) && !(z = rf9.e(a2.animationLottie))) {
            jgh.a("DownloadManager", "isResourceReady: animationLottie not exist, url: " + a2.animationLottie);
            return false;
        } else if (!TextUtils.isEmpty(a2.gestureImage) && !(z = k9h.b(a2.gestureImage))) {
            jgh.a("DownloadManager", "isResourceReady: gestureImage not exist, url: " + a2.gestureImage);
            return false;
        } else if (!TextUtils.isEmpty(a2.interactImage) && !(z = k9h.b(a2.interactImage))) {
            jgh.a("DownloadManager", "isResourceReady: interactImage not exist, url: " + a2.interactImage);
            m0j.d(this.f30263a, "resource_not_ready", "interactImage");
            return false;
        } else if (TextUtils.isEmpty(a2.getInteractVideo()) || (z = rf9.e(a2.getInteractVideo()))) {
            return z;
        } else {
            jgh.a("DownloadManager", "isResourceReady: interactVideo not exist, url: " + a2.getInteractVideo());
            m0j.d(this.f30263a, "resource_not_ready", "interactVideo");
            return false;
        }
    }

    public void d(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781b2832", new Object[]{this, list, new Integer(i)});
            return;
        }
        this.f30263a.g().b().k();
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject : list) {
            this.f30263a.g().b().e(jSONObject);
            JSONObject f = ph2.f(jSONObject);
            if (f != null) {
                boolean booleanValue = f.getBooleanValue("enable4G");
                b(f.getString("imgUrl"), 1, booleanValue, arrayList);
                b(f.getString(a5w.FIRST_FRAME_IMAGE_URL), 1, booleanValue, arrayList);
                b(f.getString("videoUrl"), 0, booleanValue, arrayList);
                if (!TextUtils.isEmpty(f.getString("animationLottie")) && "1".equals(f.getString("animationType"))) {
                    b(f.getString("animationLottie"), 2, booleanValue, arrayList);
                }
                if (!TextUtils.isEmpty(f.getString("gestureImage"))) {
                    b(f.getString("gestureImage"), 1, booleanValue, arrayList);
                }
                if (!TextUtils.isEmpty(f.getString("interactImage"))) {
                    b(f.getString("interactImage"), 1, booleanValue, arrayList);
                }
                if (!TextUtils.isEmpty(f.getString("interactVideo"))) {
                    b(f.getString("interactVideo"), 0, booleanValue, arrayList);
                }
                f(i, jSONObject);
            }
        }
        if (arrayList.isEmpty()) {
            jgh.a("DownloadManager", "downloadAdResource: list is empty.");
        } else {
            this.f30263a.c().c(arrayList, nwi.BIZ_CODE);
        }
    }
}
