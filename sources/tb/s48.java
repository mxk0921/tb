package tb;

import android.content.res.AssetManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.split.diff.DynamicFeatureDiffInfo;
import com.taobao.tao.TaobaoApplication;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s48 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f27786a;
    public final Map<String, DynamicFeatureDiffInfo> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final s48 f27787a = new s48();

        static {
            t2o.a(681574408);
        }

        public static /* synthetic */ s48 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s48) ipChange.ipc$dispatch("b9dbd9d1", new Object[0]);
            }
            return f27787a;
        }
    }

    static {
        t2o.a(681574406);
    }

    public static s48 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s48) ipChange.ipc$dispatch("2a0df2cc", new Object[0]);
        }
        return b.a();
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41a3ac9", new Object[]{this, str});
        } else if (!this.f27786a) {
            c(str);
        }
    }

    public DynamicFeatureDiffInfo b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicFeatureDiffInfo) ipChange.ipc$dispatch("1d0309de", new Object[]{this, str, str2});
        }
        a(str2);
        return (DynamicFeatureDiffInfo) ((ConcurrentHashMap) this.b).get(str);
    }

    public s48() {
        this.f27786a = false;
        this.b = new ConcurrentHashMap();
    }

    public final synchronized void c(String str) {
        IOException e;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f2fa21", new Object[]{this, str});
            } else if (!this.f27786a) {
                InputStream inputStream = null;
                try {
                    AssetManager assets = bcq.a().e().j().getAssets();
                    String appVersion = TaobaoApplication.getAppVersion();
                    inputStream = AssetsDelegate.proxy_open(assets, "bundleInfo-" + appVersion + "-" + str + "-opt.json");
                    byte[] bArr = new byte[inputStream.available()];
                    inputStream.read(bArr);
                    JSONArray jSONArray = new JSONArray(new String(bArr));
                    for (int i = 0; i < jSONArray.length(); i++) {
                        DynamicFeatureDiffInfo dynamicFeatureDiffInfo = new DynamicFeatureDiffInfo();
                        JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                        dynamicFeatureDiffInfo.url = jSONObject.optString("url");
                        dynamicFeatureDiffInfo.md5 = jSONObject.optString("md5");
                        dynamicFeatureDiffInfo.size = jSONObject.optLong("size");
                        dynamicFeatureDiffInfo.appVersion = jSONObject.optString("appVersion");
                        dynamicFeatureDiffInfo.version = jSONObject.optString("version");
                        dynamicFeatureDiffInfo.baseMd5 = jSONObject.optString("baseMd5");
                        dynamicFeatureDiffInfo.newMd5 = jSONObject.optString("newMd5");
                        dynamicFeatureDiffInfo.baseAppVersion = jSONObject.optString("baseAppVersion");
                        dynamicFeatureDiffInfo.featureName = jSONObject.optString(ru1.FEATURE_NAME);
                        dynamicFeatureDiffInfo.sameFile = jSONObject.optBoolean("sameFile");
                        ((ConcurrentHashMap) this.b).put(dynamicFeatureDiffInfo.featureName, dynamicFeatureDiffInfo);
                    }
                    this.f27786a = true;
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e4) {
                            e = e4;
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
