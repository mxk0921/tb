package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f97 implements abe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.abe
    public void I(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8253d3e", new Object[]{this, str, new Double(d)});
        }
    }

    @Override // tb.abe
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539dc3c3", new Object[]{this, str, obj});
        }
    }

    @Override // tb.abe
    public void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("385ab762", new Object[]{this, str, map});
        }
    }

    @Override // tb.abe
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5ed0dd0", new Object[]{this});
        }
        return null;
    }

    @Override // tb.abe
    public void onEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc72903", new Object[]{this});
        }
    }

    @Override // tb.abe
    public void onStage(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
        }
    }

    @Override // tb.abe
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.abe
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    @Override // tb.abe
    public void onStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
        }
    }
}
