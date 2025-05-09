package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.gateway.executor.response.AwesomeGetContainerInnerData;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class aml implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f15837a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AwesomeGetContainerInnerData c;
    public final /* synthetic */ cml d;

    public aml(cml cmlVar, String str, String str2, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        this.d = cmlVar;
        this.f15837a = str;
        this.b = str2;
        this.c = awesomeGetContainerInnerData;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        String b = xd9.b(m0b.c());
        String str = this.f15837a;
        String str2 = this.b;
        try {
            xd9.e(new File(b, str + "_" + str2 + ".dat"), JSON.toJSONBytes(this.c, new SerializerFeature[0]));
        } catch (Throwable th) {
            bqa.d("gateway.PageDataSource", "message=" + th.getMessage());
        }
    }
}
