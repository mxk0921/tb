package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cgg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static SoIndexData a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexData) ipChange.ipc$dispatch("197ffc1d", new Object[0]);
        }
        try {
            return (SoIndexData) JSON.parseObject("{\n  \"appVersion\": \"10.22.999\",\n  \"entries\": {\n    \"ucheif_alpha\": {\n      \"files\": {\n        \"armeabi-v7a\": {\n          \"uri\": \"https://img.alicdn.com/imgextra/O1CN-v7alibucheif_alpha.so\",\n          \"md5\": \"7773233fdbb8d7bf25d1b372097ab0bf\",\n          \"length\": 899384,\n          \"from\": \"Remote\"\n        },\n        \"arm64-v8a\": {\n          \"uri\": \"https://img.alicdn.com/imgextra/O1CN-v8alibucheif_alpha.so\",\n          \"md5\": \"037aa2547bb4cf688960ce4798f3989f\",\n          \"length\": 3639184,\n          \"from\": \"Remote\"\n        }\n      },\n      \"version\": \"1.1\"\n    }\n  }\n}", SoIndexData.class);
        } catch (Throwable th) {
            rbn.f("getHardcodeLastIndex", "", th);
            return new SoIndexData();
        }
    }
}
