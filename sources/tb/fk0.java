package tb;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.TaoInit;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class fk0 extends jiv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Class sActivityClass;
    public static String sActivityUrl = TaoInit.ALBUM_URL;
    public boolean h;
    public final Map<String, String> i;

    public fk0() {
        this.h = false;
        this.i = new ArrayMap();
    }

    public static /* synthetic */ Object ipc$super(fk0 fk0Var, String str, Object... objArr) {
        if (str.hashCode() == 83033702) {
            return super.createJumpIntent();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/model/AlbumParamModel");
    }

    @Override // tb.jiv
    public final Intent createJumpIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("4f2fe66", new Object[]{this});
        }
        if (u7m.g()) {
            return onCreateBaseIntent();
        }
        return super.createJumpIntent();
    }

    public int getArType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60064dfb", new Object[]{this})).intValue();
        }
        String str = this.i.get("album_ar_type");
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return -1;
        }
    }

    public Map<String, String> getExtraParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8093f2fc", new Object[]{this});
        }
        return this.i;
    }

    public int getTabType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ef5ec33", new Object[]{this})).intValue();
        }
        return qrl.e(this.i.get("album_tab_type"), -1);
    }

    public boolean isDirectJumpAfterChoose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c7d775d", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals("true", this.i.get("direct_jump_after_album_choose"));
    }

    public boolean isGarbageRecognize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8f0242e", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean isShowVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa668bff", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals("true", this.i.get("album_show_video"));
    }

    @Override // tb.jiv
    public Intent onCreateBaseIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("4096d0c4", new Object[]{this});
        }
        if (u7m.g()) {
            Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            intent.setType("image/*");
            return intent;
        }
        Intent intent2 = new Intent(caa.c(), sActivityClass);
        intent2.setAction("android.intent.action.VIEW");
        intent2.addFlags(603979776);
        return intent2;
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
        builder.appendQueryParameter(wxi.KEY_IRP_GARBAGE, String.valueOf(isGarbageRecognize()));
        String str = "";
        builder.appendQueryParameter("sellerId", getSellerId() == null ? str : getSellerId());
        if (getShopId() != null) {
            str = getShopId();
        }
        builder.appendQueryParameter("shopId", str);
        try {
            if (!this.i.isEmpty()) {
                for (Map.Entry<String, String> entry : this.i.entrySet()) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception unused) {
        }
    }

    public void setGarbageRecognize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78797b2", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void setShowVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("795d57c3", new Object[]{this});
        } else {
            this.i.put("album_show_video", "true");
        }
    }

    public static fk0 parseFromIntent(Intent intent) {
        Uri data;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fk0) ipChange.ipc$dispatch("fdcc1b12", new Object[]{intent});
        }
        fk0 fk0Var = new fk0();
        if (intent == null || (data = intent.getData()) == null) {
            return fk0Var;
        }
        fk0Var.parseUniversalPrams(data);
        fk0Var.setGarbageRecognize(data.getBooleanQueryParameter(wxi.KEY_IRP_GARBAGE, false));
        try {
            if (data.getQueryParameterNames() != null) {
                for (String str : data.getQueryParameterNames()) {
                    if (!yr3.PRIMARY_KEYS.contains(str) && (queryParameter = data.getQueryParameter(str)) != null) {
                        fk0Var.i.put(str, queryParameter);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return fk0Var;
    }

    static {
        t2o.a(481297091);
    }

    public fk0(jiv jivVar) {
        super(jivVar);
        this.h = false;
        this.i = new ArrayMap();
    }

    public fk0(yr3 yr3Var) {
        super(yr3Var);
        this.h = false;
        ArrayMap arrayMap = new ArrayMap();
        this.i = arrayMap;
        arrayMap.putAll(yr3Var.getExtraParams());
    }
}
