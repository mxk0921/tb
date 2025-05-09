package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ElasticSchedulerEngine;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ia8 implements a2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f21186a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f21187a;

        public a(Map map) {
            this.f21187a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            la8.c("elastic.DXDownload", "[preDownload] preDownloadTemplate called.", new Object[0]);
            ou5.h(this.f21187a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f21188a;

        public b(Map map) {
            this.f21188a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            la8.c("elastic.DXDownload", "[setExperimentInfo] called.", "experimentInfo", this.f21188a);
            ia8.a(ia8.this).clear();
            Map map = this.f21188a;
            if (map != null && !map.isEmpty()) {
                ia8.a(ia8.this).putAll(this.f21188a);
            }
        }
    }

    public static /* synthetic */ Map a(ia8 ia8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1482713", new Object[]{ia8Var});
        }
        return ia8Var.f21186a;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4b5de14", new Object[]{this, str});
        }
        return (String) ((ConcurrentHashMap) this.f21186a).get(str);
    }

    public void c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed7e99f3", new Object[]{this, map});
        } else {
            ElasticSchedulerEngine.m().b().m("dx_prefetch", "preDownloadTemplate", new a(map));
        }
    }

    public void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b9cfb1", new Object[]{this, map});
        } else {
            ja8.a(new b(map));
        }
    }
}
