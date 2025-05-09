package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class fya extends jiv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Set<String> k;
    public static Class sActivityClass;
    public static String sActivityUrl = "http://h5.m.taobao.com/tusou/history.html";
    public boolean h;
    public boolean i;
    public final Map<String, String> j;

    public fya() {
        this.i = false;
        this.j = new HashMap();
    }

    public static /* synthetic */ Object ipc$super(fya fyaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/model/HistoryParamModel");
    }

    public Map<String, String> getExtraParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8093f2fc", new Object[]{this});
        }
        return this.j;
    }

    public boolean isFromSys() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47de1e44", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean isShowSysHistoryTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13dfd612", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    @Override // tb.jiv
    public Intent onCreateBaseIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("4096d0c4", new Object[]{this});
        }
        Intent intent = new Intent(caa.c(), sActivityClass);
        intent.addFlags(603979776);
        return intent;
    }

    @Override // tb.jiv
    public Uri onCreateBaseUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("b637605e", new Object[]{this});
        }
        return Uri.parse(sActivityUrl);
    }

    @Override // tb.jiv
    public void onInsertParams(Uri.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e7550b", new Object[]{this, builder});
            return;
        }
        if (!TextUtils.isEmpty(getSellerId())) {
            builder.appendQueryParameter("sellerId", getSellerId());
        }
        if (!TextUtils.isEmpty(getShopId())) {
            builder.appendQueryParameter("shopId", getShopId());
        }
        builder.appendQueryParameter(wxi.KEY_FROM_SYS, String.valueOf(this.h));
        try {
            if (!((HashMap) this.j).isEmpty()) {
                for (Map.Entry entry : ((HashMap) this.j).entrySet()) {
                    builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Exception unused) {
        }
    }

    public void setFromSys(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7882f7cc", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void setShowSysHistoryTab(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f993be", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public static fya parseFromIntent(Intent intent) {
        Uri data;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fya) ipChange.ipc$dispatch("9fdb6b4d", new Object[]{intent});
        }
        fya fyaVar = new fya();
        if (intent == null || (data = intent.getData()) == null) {
            return fyaVar;
        }
        fyaVar.parseUniversalPrams(data);
        fyaVar.setFromSys(data.getBooleanQueryParameter(wxi.KEY_FROM_SYS, false));
        fyaVar.i = data.getBooleanQueryParameter(wxi.KEY_SHOW_SYS_HISTORY_TAB, false);
        try {
            if (data.getQueryParameterNames() != null) {
                for (String str : data.getQueryParameterNames()) {
                    if (!((HashSet) k).contains(str) && (queryParameter = data.getQueryParameter(str)) != null) {
                        ((HashMap) fyaVar.j).put(str, queryParameter);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return fyaVar;
    }

    public Uri createNavUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("31cb88a3", new Object[]{this});
        }
        if (TextUtils.isEmpty(sActivityUrl)) {
            return null;
        }
        Uri.Builder buildUpon = onCreateBaseUri().buildUpon();
        insertUniversalParams(buildUpon);
        onInsertParams(buildUpon);
        if (this.i) {
            buildUpon.appendQueryParameter(wxi.KEY_SHOW_SYS_HISTORY_TAB, String.valueOf(true));
        }
        return buildUpon.build();
    }

    static {
        t2o.a(481297093);
        HashSet hashSet = new HashSet();
        k = hashSet;
        hashSet.add("sellerId");
        hashSet.add("shopId");
        hashSet.add("pssource");
    }

    public fya(jiv jivVar) {
        super(jivVar);
        this.i = false;
        this.j = new HashMap();
    }

    public fya(yr3 yr3Var) {
        super(yr3Var);
        this.i = false;
        HashMap hashMap = new HashMap();
        this.j = hashMap;
        hashMap.putAll(yr3Var.getExtraParams());
    }
}
