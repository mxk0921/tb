package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hrm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public grm f20843a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final hrm f20844a = new hrm();

        static {
            t2o.a(468714653);
        }

        public static /* synthetic */ hrm a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hrm) ipChange.ipc$dispatch("bea95a8c", new Object[0]);
            }
            return f20844a;
        }
    }

    static {
        t2o.a(468714651);
    }

    public static hrm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hrm) ipChange.ipc$dispatch("6e583df2", new Object[0]);
        }
        return b.a();
    }

    public grm b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (grm) ipChange.ipc$dispatch("a340840", new Object[]{this});
        }
        return this.f20843a;
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc67f", new Object[]{this, jSONObject});
        } else {
            this.f20843a = new grm(jSONObject);
        }
    }

    public hrm() {
        this.f20843a = new grm(null);
    }
}
