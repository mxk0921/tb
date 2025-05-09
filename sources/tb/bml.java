package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bml implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f16478a;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ cml c;

    public bml(cml cmlVar, String str, JSONObject jSONObject) {
        this.c = cmlVar;
        this.f16478a = str;
        this.b = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        String b = xd9.b(m0b.c());
        String b2 = cml.b(this.c);
        String str = this.f16478a;
        xd9.e(new File(b, b2 + "_" + str + ".dat"), JSON.toJSONBytes(this.b, new SerializerFeature[0]));
    }
}
