package tb;

import android.content.Context;
import android.content.res.AssetManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.DynamicFeatureInfo;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class d49 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Map<String, DynamicFeatureInfo> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d70d5501", new Object[]{context});
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        InputStream inputStream = null;
        try {
            try {
                try {
                    AssetManager assets = context.getAssets();
                    String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                    inputStream = assets.open("bundleInfo-" + str + q2s.JSON);
                    byte[] bArr = new byte[inputStream.available()];
                    inputStream.read(bArr);
                    JSONArray jSONArray = new JSONArray(new String(bArr));
                    for (int i = 0; i < jSONArray.length(); i++) {
                        DynamicFeatureInfo dynamicFeatureInfo = new DynamicFeatureInfo();
                        JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                        dynamicFeatureInfo.url = jSONObject.optString("url");
                        if (jSONObject.optJSONArray("views") != null) {
                            JSONArray optJSONArray = jSONObject.optJSONArray("views");
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                dynamicFeatureInfo.views.add(optJSONArray.getString(i2));
                            }
                        }
                        if (jSONObject.optJSONArray("fragments") != null) {
                            JSONArray optJSONArray2 = jSONObject.optJSONArray("fragments");
                            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                dynamicFeatureInfo.fragments.add(optJSONArray2.getString(i3));
                            }
                        }
                        if (jSONObject.optJSONObject("implServices") != null) {
                            JSONObject optJSONObject = jSONObject.optJSONObject("implServices");
                            for (Iterator<String> keys = optJSONObject.keys(); keys.hasNext(); keys = keys) {
                                String next = keys.next();
                                dynamicFeatureInfo.implServices.put(next, optJSONObject.getString(next));
                            }
                        }
                        if (jSONObject.optJSONArray("classes") != null) {
                            JSONArray optJSONArray3 = jSONObject.optJSONArray("classes");
                            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                                dynamicFeatureInfo.classes.add(optJSONArray3.getString(i4));
                            }
                        }
                        if (jSONObject.optJSONArray("dependencies") != null) {
                            JSONArray optJSONArray4 = jSONObject.optJSONArray("dependencies");
                            for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                                dynamicFeatureInfo.dependencies.add(optJSONArray4.getString(i5));
                            }
                        }
                        if (jSONObject.optJSONArray("bindingActivities") != null) {
                            JSONArray optJSONArray5 = jSONObject.optJSONArray("bindingActivities");
                            for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                                dynamicFeatureInfo.bindingActivities.add(optJSONArray5.getString(i6));
                            }
                        }
                        dynamicFeatureInfo.priority = jSONObject.optInt("priority", -1);
                        dynamicFeatureInfo.version = jSONObject.optString("version");
                        dynamicFeatureInfo.featureInitalClass = jSONObject.optString("featureInitalClass");
                        dynamicFeatureInfo.matchedAppVersion = jSONObject.optString("matchedAppVersion");
                        dynamicFeatureInfo.matchedFeatureMd5 = jSONObject.optString("matchedFeatureMd5");
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("matchedAppFeatureMd5");
                        if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                            for (Iterator<String> keys2 = optJSONObject2.keys(); keys2.hasNext(); keys2 = keys2) {
                                String next2 = keys2.next();
                                dynamicFeatureInfo.matchedAppFeatureMd5.put(next2, optJSONObject2.optString(next2));
                            }
                        }
                        dynamicFeatureInfo.appVersion = jSONObject.optString("appVersion");
                        dynamicFeatureInfo.md5 = jSONObject.optString("md5");
                        dynamicFeatureInfo.size = jSONObject.optLong("size");
                        String optString = jSONObject.optString(ru1.FEATURE_NAME);
                        dynamicFeatureInfo.featureName = optString;
                        concurrentHashMap.put(optString, dynamicFeatureInfo);
                    }
                    inputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return concurrentHashMap;
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }
            throw th2;
        }
    }
}
