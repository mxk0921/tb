package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kk2 implements z6e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final oet f22724a;

    public kk2(oet oetVar) {
        this.f22724a = oetVar;
    }

    @Override // tb.z6e
    public String getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.f22724a.f25337a;
    }

    @Override // tb.z6e
    public String getFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
        }
        return this.f22724a.b;
    }

    @Override // tb.z6e
    public String getFileType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this});
        }
        return this.f22724a.c;
    }

    @Override // tb.z6e
    public Map<String, String> getMetaInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this});
        }
        return this.f22724a.d;
    }
}
