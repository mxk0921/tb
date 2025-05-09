package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class jiv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f22019a;
    public Uri b;
    public String c;
    public String d;
    public long e;
    public String f;
    public v3o g;
    public long mSessionId;

    static {
        t2o.a(481297101);
    }

    public jiv() {
        this.mSessionId = -1L;
    }

    public Intent createJumpIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("4f2fe66", new Object[]{this});
        }
        Intent onCreateBaseIntent = onCreateBaseIntent();
        Uri.Builder buildUpon = onCreateBaseUri().buildUpon();
        insertUniversalParams(buildUpon);
        onInsertParams(buildUpon);
        onCreateBaseIntent.setData(buildUpon.build());
        return onCreateBaseIntent;
    }

    public v3o getAssignRequestConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v3o) ipChange.ipc$dispatch("e0cc30be", new Object[]{this});
        }
        return this.g;
    }

    public String getPageSpm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6cf44f6e", new Object[]{this});
        }
        return this.f;
    }

    public long getPreloadKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("afd1a607", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public String getPssource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b02a625", new Object[]{this});
        }
        return this.f22019a;
    }

    public Uri getRawUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("53eb965b", new Object[]{this});
        }
        return this.b;
    }

    public String getSellerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c6289", new Object[]{this});
        }
        return this.c;
    }

    public long getSessionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2d5ee96", new Object[]{this})).longValue();
        }
        return this.mSessionId;
    }

    public String getShopId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3946bb2", new Object[]{this});
        }
        return this.d;
    }

    public final void insertUniversalParams(Uri.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3ac0cb1", new Object[]{this, builder});
            return;
        }
        builder.appendQueryParameter("pssource", getPssource());
        if (!TextUtils.isEmpty(this.f) && lg4.W3()) {
            builder.appendQueryParameter("spm", this.f);
        }
    }

    public boolean isInShop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58256d90", new Object[]{this})).booleanValue();
        }
        if (lg4.B4()) {
            return false;
        }
        if (!TextUtils.isEmpty(this.c) || !TextUtils.isEmpty(this.d)) {
            return true;
        }
        return false;
    }

    public abstract Intent onCreateBaseIntent();

    public abstract Uri onCreateBaseUri();

    public abstract void onInsertParams(Uri.Builder builder);

    public final void parseUniversalPrams(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511ecb33", new Object[]{this, uri});
            return;
        }
        this.b = uri;
        String queryParameter = uri.getQueryParameter("pssource");
        if (queryParameter == null && lg4.t1()) {
            queryParameter = "";
        }
        setPssource(queryParameter);
        setSellerId(uri.getQueryParameter("sellerId"));
        setShopId(uri.getQueryParameter("shopId"));
        String queryParameter2 = uri.getQueryParameter("sessionId");
        try {
            if (!TextUtils.isEmpty(queryParameter2)) {
                this.mSessionId = Long.parseLong(queryParameter2);
            }
        } catch (Exception unused) {
            this.mSessionId = -1L;
        }
        String queryParameter3 = uri.getQueryParameter("pageSpm");
        if (!TextUtils.isEmpty(queryParameter3)) {
            this.f = queryParameter3;
        }
    }

    public void setAssignRequestConfig(v3o v3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28eace94", new Object[]{this, v3oVar});
        } else {
            this.g = v3oVar;
        }
    }

    public void setPageSpm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38992730", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void setPreloadKey(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("813a2c85", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    public void setPssource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02f78f1", new Object[]{this, str});
        } else {
            this.f22019a = str;
        }
    }

    public void setSellerId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3d490d", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void setShopId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f804", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public jiv(jiv jivVar) {
        this.mSessionId = -1L;
        this.f22019a = jivVar.getPssource();
        this.c = jivVar.getSellerId();
        this.d = jivVar.getShopId();
        this.e = jivVar.getPreloadKey();
        this.mSessionId = jivVar.getSessionId();
        this.f = jivVar.f;
    }
}
