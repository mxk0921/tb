package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.y06;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface fwb extends pwb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, String> f19577a;

        static {
            t2o.a(444597456);
        }

        public void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a887961c", new Object[]{this, map});
            } else {
                this.f19577a = map;
            }
        }
    }

    void b(Context context, String str, a aVar, y06.g gVar);
}
