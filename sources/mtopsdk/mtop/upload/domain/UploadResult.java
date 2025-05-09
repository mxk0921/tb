package mtopsdk.mtop.upload.domain;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class UploadResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isFinish;
    public String location;
    public String serverRT;

    static {
        t2o.a(595591188);
    }

    public UploadResult(boolean z, String str) {
        this.isFinish = z;
        this.location = str;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("UploadResult [isFinish=");
        sb.append(this.isFinish);
        sb.append("location=locationserverRT=serverRT]");
        return sb.toString();
    }
}
