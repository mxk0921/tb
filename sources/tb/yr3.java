package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.PicParamUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.l53;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class yr3 extends jiv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Set<String> PRIMARY_KEYS;
    public static Class sActivityClass;
    public static String sActivityUrl = h1p.PAILITAO_URL;
    public String h;
    public boolean i;
    public boolean j;
    public String k;
    public String l;
    public boolean n;
    public String pageUrl;
    public boolean m = false;
    public boolean o = false;
    public int p = -1;
    public boolean q = false;
    public final Map<String, String> r = new HashMap();
    public final Map<String, String> s = new HashMap();

    public static /* synthetic */ Object ipc$super(yr3 yr3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/model/CipParamModel");
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("848d66db", new Object[]{this})).intValue();
        }
        return this.p;
    }

    public void appendExtraParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d06462", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            ((HashMap) this.r).putAll(map);
        }
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1586793", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bac89ff", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public Map<String, String> getAllParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b1c000d", new Object[]{this});
        }
        return this.s;
    }

    public Map<String, String> getExtraParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8093f2fc", new Object[]{this});
        }
        return this.r;
    }

    public String getImageId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("342caf59", new Object[]{this});
        }
        return this.h;
    }

    public String getInitScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56781413", new Object[]{this});
        }
        return l53.c.a(Integer.valueOf(getInitTabIndex()));
    }

    public int getInitTabIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c9814dd", new Object[]{this})).intValue();
        }
        int a2 = a();
        if (a2 > 0) {
            if (a2 == 1) {
                return 0;
            }
            return 1;
        } else if (isFromScan()) {
            return 0;
        } else {
            return 1;
        }
    }

    public String getPageFromHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eadcb543", new Object[]{this});
        }
        return this.k;
    }

    public boolean isArTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcfd5625", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public boolean isDisableAutoDetect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd0106bb", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean isFromNoFrontRetake(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6b8d343", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return qrl.a((String) ((HashMap) this.r).remove("fromNoFrontRetake"), false);
        }
        return qrl.a((String) ((HashMap) this.r).get("fromNoFrontRetake"), false);
    }

    public boolean isFromScan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cede89c", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public boolean isGarbageTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cf47375", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public boolean isOpenHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d649ffeb", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean isOtherChannelPhotoSearch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53eefe28", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals((String) ((HashMap) this.r).get("otherChannelPhotoSearch"), "true");
    }

    @Override // tb.jiv
    public Intent onCreateBaseIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("4096d0c4", new Object[]{this});
        }
        return new Intent(caa.c(), sActivityClass);
    }

    @Override // tb.jiv
    public Uri onCreateBaseUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("b637605e", new Object[]{this});
        }
        return Uri.parse(sActivityUrl);
    }

    public boolean scanOnly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6ee4bd4", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public void setArTab(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da82a0b", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void setGarbageTab(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0da74b", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void setImageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586cc4a5", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void setOpenHistory(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e2ef05", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void updateCameraMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55862be2", new Object[]{this, str});
        } else {
            ((HashMap) this.r).put(PicParamUtils.b(), str);
        }
    }

    @Override // tb.jiv
    public void onInsertParams(Uri.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e7550b", new Object[]{this, builder});
            return;
        }
        builder.appendQueryParameter("image_id", getImageId());
        if (isArTab()) {
            builder.appendQueryParameter(wxi.KEY_AR_TAB, "1");
        }
        if (isGarbageTab()) {
            builder.appendQueryParameter(wxi.KEY_IRP_GARBAGE, String.valueOf(true));
        }
        if (!TextUtils.isEmpty(this.l)) {
            builder.appendQueryParameter("spm", this.l);
        }
        if (!TextUtils.isEmpty(this.k)) {
            builder.appendQueryParameter("tips", this.k);
        }
        if (!TextUtils.isEmpty(getSellerId())) {
            builder.appendQueryParameter("sellerId", getSellerId());
        }
        if (!TextUtils.isEmpty(getShopId())) {
            builder.appendQueryParameter("shopId", getShopId());
        }
        try {
            if (!((HashMap) this.r).isEmpty()) {
                for (Map.Entry entry : ((HashMap) this.r).entrySet()) {
                    builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Exception unused) {
        }
    }

    public static yr3 parseFromIntent(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yr3) ipChange.ipc$dispatch("bff23257", new Object[]{intent});
        }
        yr3 yr3Var = new yr3();
        if (intent == null || (data = intent.getData()) == null) {
            return yr3Var;
        }
        yr3Var.pageUrl = intent.getDataString();
        yr3Var.o = data.getBooleanQueryParameter("disableAutoDetect", false);
        yr3Var.q = data.getBooleanQueryParameter("scanOnly", false);
        yr3Var.parseUniversalPrams(data);
        if (TextUtils.isEmpty(yr3Var.getPssource())) {
            String queryParameter = data.getQueryParameter("_pssource");
            if (!TextUtils.isEmpty(queryParameter)) {
                yr3Var.setPssource(queryParameter);
            }
        }
        yr3Var.b(data.getQueryParameter("tips"));
        String queryParameter2 = data.getQueryParameter("image_id");
        String queryParameter3 = data.getQueryParameter(wxi.KEY_AR_TAB);
        String queryParameter4 = data.getQueryParameter(wxi.KEY_IRP_GARBAGE);
        String queryParameter5 = data.getQueryParameter("spm");
        boolean a2 = iso.a(intent);
        yr3Var.n = a2;
        if (a2 && TextUtils.isEmpty(yr3Var.getPssource())) {
            yr3Var.setPssource(l53.PsSourceSY_SYS);
        }
        String queryParameter6 = data.getQueryParameter("sellerId");
        String queryParameter7 = data.getQueryParameter("shopId");
        yr3Var.setSellerId(queryParameter6);
        yr3Var.setShopId(queryParameter7);
        yr3Var.setOpenHistory(data.getBooleanQueryParameter(wxi.KEY_OPEN_HISTORY, false));
        yr3Var.c(queryParameter5);
        yr3Var.setImageId(queryParameter2);
        String queryParameter8 = data.getQueryParameter("toindex");
        if (!TextUtils.isEmpty(queryParameter8)) {
            try {
                yr3Var.p = Integer.parseInt(queryParameter8);
                if (!lg4.r4() && yr3Var.p > 2) {
                    yr3Var.p = 2;
                }
            } catch (Exception unused) {
                yr3Var.p = -1;
            }
        }
        if ("1".equals(queryParameter3) || "true".equals(queryParameter3)) {
            yr3Var.setArTab(true);
        } else if ("1".equals(queryParameter4) || "true".equals(queryParameter4)) {
            yr3Var.setGarbageTab(true);
        } else {
            yr3Var.setArTab(false);
        }
        if (TextUtils.isEmpty(yr3Var.getPssource()) && yr3Var.p == 1) {
            yr3Var.setPssource("saotab");
        }
        try {
            if (data.getQueryParameterNames() != null) {
                for (String str : data.getQueryParameterNames()) {
                    String queryParameter9 = data.getQueryParameter(str);
                    if (queryParameter9 != null) {
                        if (PRIMARY_KEYS.contains(str)) {
                            ((HashMap) yr3Var.s).put(str, queryParameter9);
                        } else {
                            ((HashMap) yr3Var.r).put(str, queryParameter9);
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return yr3Var;
    }

    static {
        t2o.a(481297092);
        HashSet hashSet = new HashSet();
        PRIMARY_KEYS = hashSet;
        hashSet.add("tips");
        hashSet.add("image_id");
        hashSet.add(wxi.KEY_AR_TAB);
        hashSet.add(wxi.KEY_IRP_GARBAGE);
        hashSet.add("spm");
        hashSet.add("sellerId");
        hashSet.add("shopId");
        hashSet.add("pssource");
    }
}
