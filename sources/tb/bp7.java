package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bp7 implements rmd<Class, Map> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public x8c f16523a;

    static {
        t2o.a(682622982);
        t2o.a(676331665);
    }

    @Override // tb.rmd
    public void a(Context context, nrd<Class> nrdVar, String str) {
        try {
            this.f16523a = (x8c) nrdVar.a(context, str).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public Map generate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ed5120b1", new Object[]{this});
        }
        x8c x8cVar = this.f16523a;
        if (x8cVar != null) {
            return x8cVar.generate();
        }
        return Collections.emptyMap();
    }
}
